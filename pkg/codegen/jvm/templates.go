// Copyright 2022, Pulumi Corporation.  All rights reserved.

package jvm

import (
	tmplt "text/template"
)

const (
	// MissingKeyErrorOption is the renderer option to stop execution immediately with an error on missing key
	MissingKeyErrorOption = "missingkey=error"
)

func Template(name string, text string) *tmplt.Template {
	return tmplt.Must(tmplt.New(name).Funcs(predefinedFunctions).Option(MissingKeyErrorOption).Parse(text))
}

var predefinedFunctions = tmplt.FuncMap{
	"eq": func(x, y interface{}) bool {
		return x == y
	},
	"sub": func(y, x int) int {
		return x - y
	},
}

// nolint:lll
const jvmUtilitiesTemplateText = `

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import io.pulumi.core.internal.Environment;
import io.pulumi.deployment.InvokeOptions;

public class {{ .ClassName }} {

	public static Optional<String> getEnv(String... names) {
        for (var n : names) {
            var value = Environment.getEnvironmentVariable(n);
            if (value.isValue()) {
                return Optional.of(value.value());
            }
        }
        return Optional.empty();
    }

	public static Optional<Boolean> getEnvBoolean(String... names) {
        for (var n : names) {
            var value = Environment.getBooleanEnvironmentVariable(n);
            if (value.isValue()) {
                return Optional.of(value.value());
            }
        }
        return Optional.empty();
	}

	public static Optional<Integer> getEnvInteger(String... names) {
        for (var n : names) {
            var value = Environment.getIntegerEnvironmentVariable(n);
            if (value.isValue()) {
                return Optional.of(value.value());
            }
        }
        return Optional.empty();
	}

	public static Optional<Double> getEnvDouble(String... names) {
        for (var n : names) {
            var value = Environment.getDoubleEnvironmentVariable(n);
            if (value.isValue()) {
                return Optional.of(value.value());
            }
        }
        return Optional.empty();
	}

	// TODO: this probably should be done via a mutator on the InvokeOptions
	public static InvokeOptions withVersion(@Nullable InvokeOptions options) {
            if (options != null && options.getVersion().isPresent()) {
                return options;
            }
            return new InvokeOptions(
                options == null ? null : options.getParent().orElse(null),
                options == null ? null : options.getProvider().orElse(null),
                getVersion()
            );
        }

    private static final String version;
    public static String getVersion() {
        return version;
    }

    static {
        var resourceName = "{{ .PackagePath }}/version.txt";
        var versionFile = Utilities.class.getClassLoader().getResourceAsStream(resourceName);
        if (versionFile == null) {
            throw new IllegalStateException(
                    String.format("expected resource '%s' on Classpath, not found", resourceName)
            );
        }
        version = new BufferedReader(new InputStreamReader(versionFile))
                .lines()
                .collect(Collectors.joining("\n"))
                .trim();
    }
}
`

var jvmUtilitiesTemplate = Template("JavaUtilities", jvmUtilitiesTemplateText)

type jvmUtilitiesTemplateContext struct {
	Name        string
	PackagePath string
	ClassName   string
	Tool        string
}

// nolint:lll
const jvmBuildTemplateText = `// *** WARNING: this file was generated. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

plugins {
    id("java-library")
    id("maven-publish")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(11)
    }
}

compileJava {
    options.fork = true
    options.forkOptions.jvmArgs.addAll(["-Xmx4g"])
}

repositories {
    maven { // The google mirror is less flaky than mavenCentral()
        url("https://maven-central.storage-download.googleapis.com/maven2/")
    }
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("io.pulumi:pulumi:1.0.0+")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    api("com.google.guava:guava:30.1-jre") // FIXME: do we really want to expose this dep?
    api("com.google.code.gson:gson:2.8.6") // make sure we don't clash with grpc deps

    implementation("com.google.protobuf:protobuf-java:3.12.0") // make sure we don't clash with grpc deps
    implementation("com.google.protobuf:protobuf-java-util:3.12.0") // make sure we don't clash with grpc deps

    {{- range $ref, $ver := .PackageInfo.PackageReferences }}
    implementation("{{$ref}}:{{$ver}}")
    {{- end }}

    def junitVersion = "5.7.2"
    testImplementation("org.junit.jupiter:junit-jupiter-api:${junitVersion}")
    testImplementation("org.junit.jupiter:junit-jupiter-params:${junitVersion}")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${junitVersion}")
    testImplementation("org.assertj:assertj-core:3.20.2")
    testImplementation("org.mockito:mockito-core:3.+")
}

test {
    useJUnitPlatform()
	testLogging {
		showStandardStreams = true
        exceptionFormat = 'full'

        // set options for log level LIFECYCLE
        events = ['failed']

        info {
            events = ['failed', 'skipped']
        }

        debug {
            events = ['started', 'skipped', 'failed']
        }
    }
}

publishing {
    publications {
        mavenJava(MavenPublication) {
            groupId = '{{ .BasePackageName }}'
            artifactId = '{{ .Name }}'
            version = project.version

            from components.java
        }
        // TODO pom
    }
}

javadoc {
    if (JavaVersion.current().isJava9Compatible()) {
        options.addBooleanOption('html5', true)
    }
}
`

var jvmBuildTemplate = Template("JavaBuild", jvmBuildTemplateText)

type jvmBuildTemplateContext struct {
	Name            string
	BasePackageName string
	PackageInfo     PackageInfo
}

// nolint:lll
const jvmSettingsTemplateText = `// *** WARNING: this file was generated. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

pluginManagement {
  repositories {
    maven { // The google mirror is less flaky than mavenCentral()
      url("https://maven-central.storage-download.googleapis.com/maven2/")
    }
    gradlePluginPortal()
  }
}

rootProject.name = "{{ .PackageName }}"
include("lib")`

var jvmSettingsTemplate = Template("JavaSettings", jvmSettingsTemplateText)

type jvmSettingsTemplateContext struct {
	PackageName string
}

const getterTemplateText = `{{ .Indent }}public {{ .GetterType }} {{ .GetterName }}() {
{{ .Indent }}    return {{ .ReturnStatement }};
{{ .Indent }}}`

var getterTemplate = Template("Getter", getterTemplateText)

type getterTemplateContext struct {
	Indent          string
	GetterType      string
	GetterName      string
	ReturnStatement string
}

type builderSetterTemplateContext struct {
	SetterName   string
	PropertyType string
	PropertyName string
	Assignment   string
	ListType     string
}

type builderFieldTemplateContext struct {
	FieldType      string
	FieldName      string
	Initialization string
}

const builderTemplateText = `{{ .Indent }}public static {{ .Name }} builder() {
{{ .Indent }}    return new {{ .Name }}();
{{ .Indent }}}

{{ .Indent }}public static {{ .Name }} builder({{ .ResultType }} defaults) {
{{ .Indent }}    return new {{ .Name }}(defaults);
{{ .Indent }}}

{{ .Indent }}public static {{ if .IsFinal }}final {{ end }}class {{ .Name }} {
{{- range $field := .Fields }}
{{ $.Indent }}    private {{ $field.FieldType }} {{ $field.FieldName }}{{ $field.Initialization }};
{{- end }}

{{ $.Indent }}    public {{ .Name }}() {
{{ $.Indent }}	      // Empty
{{ $.Indent }}    }

{{ $.Indent }}    public {{ .Name }}({{ .ResultType }} defaults) {
{{ $.Indent }}	      {{ .Objects }}.requireNonNull(defaults);
{{- range $field := .Fields }}
{{ $.Indent }}	      this.{{ $field.FieldName }} = defaults.{{ $field.FieldName }};
{{- end }}
{{ $.Indent }}    }
{{ range $setter := .Setters }}
{{ $.Indent }}    public {{ $.Name }} {{ $setter.SetterName }}({{ $setter.PropertyType }} {{ $setter.PropertyName }}) {
{{ $.Indent }}        {{ $setter.Assignment }};
{{ $.Indent }}        return this;
{{ $.Indent }}    }

{{- if $setter.ListType }}
{{ $.Indent }}    public {{ $.Name }} {{ $setter.SetterName }}({{ $setter.ListType }}... {{ $setter.PropertyName }}) {
{{ $.Indent }}        return {{ $setter.SetterName }}(List.of({{ $setter.PropertyName }}));
{{ $.Indent }}    }
{{- end -}}

{{ end }}
{{- if .IsJumbo -}}
{{ $.Indent }}    public {{ .ResultType }} build() {
{{ $.Indent }}        final var built = new {{ .ResultType }}();
{{ range $i, $field := .Fields }}
{{ $.Indent }}        built.{{ $field.FieldName }} = {{ $field.FieldName }};
{{- end }}
{{ $.Indent }}        return built;
{{- else -}}
{{ $.Indent }}    public {{ .ResultType }} build() {
{{ $.Indent }}        return new {{ .ResultType }}(
{{- $last := (len .Fields | sub 1) -}}
{{- range $i, $field := .Fields -}}
{{ $field.FieldName }}{{ if not (eq $i $last) }}, {{ end }}
{{- end -}}
);
{{- end }}
{{ .Indent }}    }
{{ .Indent }}}`

var builderTemplate = Template("Builder", builderTemplateText)

type builderTemplateContext struct {
	Indent     string
	Name       string
	IsFinal    bool
	IsJumbo    bool
	Fields     []builderFieldTemplateContext
	Setters    []builderSetterTemplateContext
	ResultType string
	Objects    string
}
