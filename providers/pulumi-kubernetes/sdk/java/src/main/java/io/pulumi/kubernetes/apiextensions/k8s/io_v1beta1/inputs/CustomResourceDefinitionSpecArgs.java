// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceColumnDefinitionArgs;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceConversionArgs;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceDefinitionNamesArgs;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceDefinitionVersionArgs;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceSubresourcesArgs;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceValidationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CustomResourceDefinitionSpec describes how a user wants their resource to appear
 * 
 */
public final class CustomResourceDefinitionSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceDefinitionSpecArgs Empty = new CustomResourceDefinitionSpecArgs();

    /**
     * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If present, this field configures columns for all versions. Top-level and per-version columns are mutually exclusive. If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
     * 
     */
    @InputImport(name="additionalPrinterColumns")
      private final @Nullable Input<List<CustomResourceColumnDefinitionArgs>> additionalPrinterColumns;

    public Input<List<CustomResourceColumnDefinitionArgs>> getAdditionalPrinterColumns() {
        return this.additionalPrinterColumns == null ? Input.empty() : this.additionalPrinterColumns;
    }

    /**
     * conversion defines conversion settings for the CRD.
     * 
     */
    @InputImport(name="conversion")
      private final @Nullable Input<CustomResourceConversionArgs> conversion;

    public Input<CustomResourceConversionArgs> getConversion() {
        return this.conversion == null ? Input.empty() : this.conversion;
    }

    /**
     * group is the API group of the defined custom resource. The custom resources are served under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`).
     * 
     */
    @InputImport(name="group", required=true)
      private final Input<String> group;

    public Input<String> getGroup() {
        return this.group;
    }

    /**
     * names specify the resource and kind names for the custom resource.
     * 
     */
    @InputImport(name="names", required=true)
      private final Input<CustomResourceDefinitionNamesArgs> names;

    public Input<CustomResourceDefinitionNamesArgs> getNames() {
        return this.names;
    }

    /**
     * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. If false, schemas must be defined for all versions. Defaults to true in v1beta for backwards compatibility. Deprecated: will be required to be false in v1. Preservation of unknown fields can be specified in the validation schema using the `x-kubernetes-preserve-unknown-fields: true` extension. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.
     * 
     */
    @InputImport(name="preserveUnknownFields")
      private final @Nullable Input<Boolean> preserveUnknownFields;

    public Input<Boolean> getPreserveUnknownFields() {
        return this.preserveUnknownFields == null ? Input.empty() : this.preserveUnknownFields;
    }

    /**
     * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and `Namespaced`. Default is `Namespaced`.
     * 
     */
    @InputImport(name="scope", required=true)
      private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    /**
     * subresources specify what subresources the defined custom resource has. If present, this field configures subresources for all versions. Top-level and per-version subresources are mutually exclusive.
     * 
     */
    @InputImport(name="subresources")
      private final @Nullable Input<CustomResourceSubresourcesArgs> subresources;

    public Input<CustomResourceSubresourcesArgs> getSubresources() {
        return this.subresources == null ? Input.empty() : this.subresources;
    }

    /**
     * validation describes the schema used for validation and pruning of the custom resource. If present, this validation schema is used to validate all versions. Top-level and per-version schemas are mutually exclusive.
     * 
     */
    @InputImport(name="validation")
      private final @Nullable Input<CustomResourceValidationArgs> validation;

    public Input<CustomResourceValidationArgs> getValidation() {
        return this.validation == null ? Input.empty() : this.validation;
    }

    /**
     * version is the API version of the defined custom resource. The custom resources are served under `/apis/<group>/<version>/...`. Must match the name of the first item in the `versions` list if `version` and `versions` are both specified. Optional if `versions` is specified. Deprecated: use `versions` instead.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    /**
     * versions is the list of all API versions of the defined custom resource. Optional if `version` is specified. The name of the first item in the `versions` list must match the `version` field if `version` and `versions` are both specified. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
     * 
     */
    @InputImport(name="versions")
      private final @Nullable Input<List<CustomResourceDefinitionVersionArgs>> versions;

    public Input<List<CustomResourceDefinitionVersionArgs>> getVersions() {
        return this.versions == null ? Input.empty() : this.versions;
    }

    public CustomResourceDefinitionSpecArgs(
        @Nullable Input<List<CustomResourceColumnDefinitionArgs>> additionalPrinterColumns,
        @Nullable Input<CustomResourceConversionArgs> conversion,
        Input<String> group,
        Input<CustomResourceDefinitionNamesArgs> names,
        @Nullable Input<Boolean> preserveUnknownFields,
        Input<String> scope,
        @Nullable Input<CustomResourceSubresourcesArgs> subresources,
        @Nullable Input<CustomResourceValidationArgs> validation,
        @Nullable Input<String> version,
        @Nullable Input<List<CustomResourceDefinitionVersionArgs>> versions) {
        this.additionalPrinterColumns = additionalPrinterColumns;
        this.conversion = conversion;
        this.group = Objects.requireNonNull(group, "expected parameter 'group' to be non-null");
        this.names = Objects.requireNonNull(names, "expected parameter 'names' to be non-null");
        this.preserveUnknownFields = preserveUnknownFields;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.subresources = subresources;
        this.validation = validation;
        this.version = version;
        this.versions = versions;
    }

    private CustomResourceDefinitionSpecArgs() {
        this.additionalPrinterColumns = Input.empty();
        this.conversion = Input.empty();
        this.group = Input.empty();
        this.names = Input.empty();
        this.preserveUnknownFields = Input.empty();
        this.scope = Input.empty();
        this.subresources = Input.empty();
        this.validation = Input.empty();
        this.version = Input.empty();
        this.versions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CustomResourceColumnDefinitionArgs>> additionalPrinterColumns;
        private @Nullable Input<CustomResourceConversionArgs> conversion;
        private Input<String> group;
        private Input<CustomResourceDefinitionNamesArgs> names;
        private @Nullable Input<Boolean> preserveUnknownFields;
        private Input<String> scope;
        private @Nullable Input<CustomResourceSubresourcesArgs> subresources;
        private @Nullable Input<CustomResourceValidationArgs> validation;
        private @Nullable Input<String> version;
        private @Nullable Input<List<CustomResourceDefinitionVersionArgs>> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionSpecArgs defaults) {
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

        public Builder setAdditionalPrinterColumns(@Nullable Input<List<CustomResourceColumnDefinitionArgs>> additionalPrinterColumns) {
            this.additionalPrinterColumns = additionalPrinterColumns;
            return this;
        }

        public Builder setAdditionalPrinterColumns(@Nullable List<CustomResourceColumnDefinitionArgs> additionalPrinterColumns) {
            this.additionalPrinterColumns = Input.ofNullable(additionalPrinterColumns);
            return this;
        }

        public Builder setConversion(@Nullable Input<CustomResourceConversionArgs> conversion) {
            this.conversion = conversion;
            return this;
        }

        public Builder setConversion(@Nullable CustomResourceConversionArgs conversion) {
            this.conversion = Input.ofNullable(conversion);
            return this;
        }

        public Builder setGroup(Input<String> group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }

        public Builder setGroup(String group) {
            this.group = Input.of(Objects.requireNonNull(group));
            return this;
        }

        public Builder setNames(Input<CustomResourceDefinitionNamesArgs> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }

        public Builder setNames(CustomResourceDefinitionNamesArgs names) {
            this.names = Input.of(Objects.requireNonNull(names));
            return this;
        }

        public Builder setPreserveUnknownFields(@Nullable Input<Boolean> preserveUnknownFields) {
            this.preserveUnknownFields = preserveUnknownFields;
            return this;
        }

        public Builder setPreserveUnknownFields(@Nullable Boolean preserveUnknownFields) {
            this.preserveUnknownFields = Input.ofNullable(preserveUnknownFields);
            return this;
        }

        public Builder setScope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public Builder setSubresources(@Nullable Input<CustomResourceSubresourcesArgs> subresources) {
            this.subresources = subresources;
            return this;
        }

        public Builder setSubresources(@Nullable CustomResourceSubresourcesArgs subresources) {
            this.subresources = Input.ofNullable(subresources);
            return this;
        }

        public Builder setValidation(@Nullable Input<CustomResourceValidationArgs> validation) {
            this.validation = validation;
            return this;
        }

        public Builder setValidation(@Nullable CustomResourceValidationArgs validation) {
            this.validation = Input.ofNullable(validation);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setVersions(@Nullable Input<List<CustomResourceDefinitionVersionArgs>> versions) {
            this.versions = versions;
            return this;
        }

        public Builder setVersions(@Nullable List<CustomResourceDefinitionVersionArgs> versions) {
            this.versions = Input.ofNullable(versions);
            return this;
        }
        public CustomResourceDefinitionSpecArgs build() {
            return new CustomResourceDefinitionSpecArgs(additionalPrinterColumns, conversion, group, names, preserveUnknownFields, scope, subresources, validation, version, versions);
        }
    }
}
