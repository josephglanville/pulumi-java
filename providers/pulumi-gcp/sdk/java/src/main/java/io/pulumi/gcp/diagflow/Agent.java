// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.diagflow.AgentArgs;
import io.pulumi.gcp.diagflow.inputs.AgentState;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:diagflow/agent:Agent")
public class Agent extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="avatarUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> avatarUri;

    public Output</* @Nullable */ String> getAvatarUri() {
        return this.avatarUri;
    }
    @OutputExport(name="avatarUriBackend", type=String.class, parameters={})
    private Output<String> avatarUriBackend;

    public Output<String> getAvatarUriBackend() {
        return this.avatarUriBackend;
    }
    @OutputExport(name="classificationThreshold", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> classificationThreshold;

    public Output</* @Nullable */ Double> getClassificationThreshold() {
        return this.classificationThreshold;
    }
    @OutputExport(name="defaultLanguageCode", type=String.class, parameters={})
    private Output<String> defaultLanguageCode;

    public Output<String> getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="enableLogging", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableLogging;

    public Output</* @Nullable */ Boolean> getEnableLogging() {
        return this.enableLogging;
    }
    @OutputExport(name="matchMode", type=String.class, parameters={})
    private Output<String> matchMode;

    public Output<String> getMatchMode() {
        return this.matchMode;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="supportedLanguageCodes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> supportedLanguageCodes;

    public Output</* @Nullable */ List<String>> getSupportedLanguageCodes() {
        return this.supportedLanguageCodes;
    }
    @OutputExport(name="tier", type=String.class, parameters={})
    private Output</* @Nullable */ String> tier;

    public Output</* @Nullable */ String> getTier() {
        return this.tier;
    }
    @OutputExport(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone;
    }

    public Agent(String name, AgentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/agent:Agent", name, args == null ? AgentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Agent(String name, Input<String> id, @Nullable AgentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/agent:Agent", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Agent get(String name, Input<String> id, @Nullable AgentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Agent(name, id, state, options);
    }
}