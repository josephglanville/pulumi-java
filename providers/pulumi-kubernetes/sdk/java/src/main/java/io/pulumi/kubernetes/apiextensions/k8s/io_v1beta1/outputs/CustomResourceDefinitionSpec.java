// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs.CustomResourceColumnDefinition;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs.CustomResourceConversion;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs.CustomResourceDefinitionNames;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs.CustomResourceDefinitionVersion;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs.CustomResourceSubresources;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs.CustomResourceValidation;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomResourceDefinitionSpec {
    private final @Nullable List<CustomResourceColumnDefinition> additionalPrinterColumns;
    private final @Nullable CustomResourceConversion conversion;
    private final String group;
    private final CustomResourceDefinitionNames names;
    private final @Nullable Boolean preserveUnknownFields;
    private final String scope;
    private final @Nullable CustomResourceSubresources subresources;
    private final @Nullable CustomResourceValidation validation;
    private final @Nullable String version;
    private final @Nullable List<CustomResourceDefinitionVersion> versions;

    @OutputCustomType.Constructor({"additionalPrinterColumns","conversion","group","names","preserveUnknownFields","scope","subresources","validation","version","versions"})
    private CustomResourceDefinitionSpec(
        @Nullable List<CustomResourceColumnDefinition> additionalPrinterColumns,
        @Nullable CustomResourceConversion conversion,
        String group,
        CustomResourceDefinitionNames names,
        @Nullable Boolean preserveUnknownFields,
        String scope,
        @Nullable CustomResourceSubresources subresources,
        @Nullable CustomResourceValidation validation,
        @Nullable String version,
        @Nullable List<CustomResourceDefinitionVersion> versions) {
        this.additionalPrinterColumns = additionalPrinterColumns;
        this.conversion = conversion;
        this.group = Objects.requireNonNull(group);
        this.names = Objects.requireNonNull(names);
        this.preserveUnknownFields = preserveUnknownFields;
        this.scope = Objects.requireNonNull(scope);
        this.subresources = subresources;
        this.validation = validation;
        this.version = version;
        this.versions = versions;
    }

    public List<CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
        return this.additionalPrinterColumns == null ? List.of() : this.additionalPrinterColumns;
    }
    public Optional<CustomResourceConversion> getConversion() {
        return Optional.ofNullable(this.conversion);
    }
    public String getGroup() {
        return this.group;
    }
    public CustomResourceDefinitionNames getNames() {
        return this.names;
    }
    public Optional<Boolean> getPreserveUnknownFields() {
        return Optional.ofNullable(this.preserveUnknownFields);
    }
    public String getScope() {
        return this.scope;
    }
    public Optional<CustomResourceSubresources> getSubresources() {
        return Optional.ofNullable(this.subresources);
    }
    public Optional<CustomResourceValidation> getValidation() {
        return Optional.ofNullable(this.validation);
    }
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }
    public List<CustomResourceDefinitionVersion> getVersions() {
        return this.versions == null ? List.of() : this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CustomResourceColumnDefinition> additionalPrinterColumns;
        private @Nullable CustomResourceConversion conversion;
        private String group;
        private CustomResourceDefinitionNames names;
        private @Nullable Boolean preserveUnknownFields;
        private String scope;
        private @Nullable CustomResourceSubresources subresources;
        private @Nullable CustomResourceValidation validation;
        private @Nullable String version;
        private @Nullable List<CustomResourceDefinitionVersion> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalPrinterColumns = defaults.additionalPrinterColumns;
    	      this.conversion = defaults.conversion;
    	      this.group = defaults.group;
    	      this.names = defaults.names;
    	      this.preserveUnknownFields = defaults.preserveUnknownFields;
    	      this.scope = defaults.scope;
    	      this.subresources = defaults.subresources;
    	      this.validation = defaults.validation;
    	      this.version = defaults.version;
    	      this.versions = defaults.versions;
        }

        public Builder setAdditionalPrinterColumns(@Nullable List<CustomResourceColumnDefinition> additionalPrinterColumns) {
            this.additionalPrinterColumns = additionalPrinterColumns;
            return this;
        }

        public Builder setConversion(@Nullable CustomResourceConversion conversion) {
            this.conversion = conversion;
            return this;
        }

        public Builder setGroup(String group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }

        public Builder setNames(CustomResourceDefinitionNames names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }

        public Builder setPreserveUnknownFields(@Nullable Boolean preserveUnknownFields) {
            this.preserveUnknownFields = preserveUnknownFields;
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setSubresources(@Nullable CustomResourceSubresources subresources) {
            this.subresources = subresources;
            return this;
        }

        public Builder setValidation(@Nullable CustomResourceValidation validation) {
            this.validation = validation;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public Builder setVersions(@Nullable List<CustomResourceDefinitionVersion> versions) {
            this.versions = versions;
            return this;
        }

        public CustomResourceDefinitionSpec build() {
            return new CustomResourceDefinitionSpec(additionalPrinterColumns, conversion, group, names, preserveUnknownFields, scope, subresources, validation, version, versions);
        }
    }
}
