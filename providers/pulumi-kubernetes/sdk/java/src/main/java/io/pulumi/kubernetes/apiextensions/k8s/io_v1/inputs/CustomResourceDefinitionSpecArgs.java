// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.CustomResourceConversionArgs;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.CustomResourceDefinitionNamesArgs;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.CustomResourceDefinitionVersionArgs;
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
     * conversion defines conversion settings for the CRD.
     * 
     */
    @Import(name="conversion")
      private final @Nullable Output<CustomResourceConversionArgs> conversion;

    public Output<CustomResourceConversionArgs> getConversion() {
        return this.conversion == null ? Codegen.empty() : this.conversion;
    }

    /**
     * group is the API group of the defined custom resource. The custom resources are served under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`).
     * 
     */
    @Import(name="group", required=true)
      private final Output<String> group;

    public Output<String> getGroup() {
        return this.group;
    }

    /**
     * names specify the resource and kind names for the custom resource.
     * 
     */
    @Import(name="names", required=true)
      private final Output<CustomResourceDefinitionNamesArgs> names;

    public Output<CustomResourceDefinitionNamesArgs> getNames() {
        return this.names;
    }

    /**
     * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. This field is deprecated in favor of setting `x-preserve-unknown-fields` to true in `spec.versions[*].schema.openAPIV3Schema`. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.
     * 
     */
    @Import(name="preserveUnknownFields")
      private final @Nullable Output<Boolean> preserveUnknownFields;

    public Output<Boolean> getPreserveUnknownFields() {
        return this.preserveUnknownFields == null ? Codegen.empty() : this.preserveUnknownFields;
    }

    /**
     * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and `Namespaced`.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> getScope() {
        return this.scope;
    }

    /**
     * versions is the list of all API versions of the defined custom resource. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
     * 
     */
    @Import(name="versions", required=true)
      private final Output<List<CustomResourceDefinitionVersionArgs>> versions;

    public Output<List<CustomResourceDefinitionVersionArgs>> getVersions() {
        return this.versions;
    }

    public CustomResourceDefinitionSpecArgs(
        @Nullable Output<CustomResourceConversionArgs> conversion,
        Output<String> group,
        Output<CustomResourceDefinitionNamesArgs> names,
        @Nullable Output<Boolean> preserveUnknownFields,
        Output<String> scope,
        Output<List<CustomResourceDefinitionVersionArgs>> versions) {
        this.conversion = conversion;
        this.group = Objects.requireNonNull(group, "expected parameter 'group' to be non-null");
        this.names = Objects.requireNonNull(names, "expected parameter 'names' to be non-null");
        this.preserveUnknownFields = preserveUnknownFields;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.versions = Objects.requireNonNull(versions, "expected parameter 'versions' to be non-null");
    }

    private CustomResourceDefinitionSpecArgs() {
        this.conversion = Codegen.empty();
        this.group = Codegen.empty();
        this.names = Codegen.empty();
        this.preserveUnknownFields = Codegen.empty();
        this.scope = Codegen.empty();
        this.versions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CustomResourceConversionArgs> conversion;
        private Output<String> group;
        private Output<CustomResourceDefinitionNamesArgs> names;
        private @Nullable Output<Boolean> preserveUnknownFields;
        private Output<String> scope;
        private Output<List<CustomResourceDefinitionVersionArgs>> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversion = defaults.conversion;
    	      this.group = defaults.group;
    	      this.names = defaults.names;
    	      this.preserveUnknownFields = defaults.preserveUnknownFields;
    	      this.scope = defaults.scope;
    	      this.versions = defaults.versions;
        }

        public Builder conversion(@Nullable Output<CustomResourceConversionArgs> conversion) {
            this.conversion = conversion;
            return this;
        }
        public Builder conversion(@Nullable CustomResourceConversionArgs conversion) {
            this.conversion = Codegen.ofNullable(conversion);
            return this;
        }
        public Builder group(Output<String> group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }
        public Builder group(String group) {
            this.group = Output.of(Objects.requireNonNull(group));
            return this;
        }
        public Builder names(Output<CustomResourceDefinitionNamesArgs> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(CustomResourceDefinitionNamesArgs names) {
            this.names = Output.of(Objects.requireNonNull(names));
            return this;
        }
        public Builder preserveUnknownFields(@Nullable Output<Boolean> preserveUnknownFields) {
            this.preserveUnknownFields = preserveUnknownFields;
            return this;
        }
        public Builder preserveUnknownFields(@Nullable Boolean preserveUnknownFields) {
            this.preserveUnknownFields = Codegen.ofNullable(preserveUnknownFields);
            return this;
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public Builder versions(Output<List<CustomResourceDefinitionVersionArgs>> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }
        public Builder versions(List<CustomResourceDefinitionVersionArgs> versions) {
            this.versions = Output.of(Objects.requireNonNull(versions));
            return this;
        }
        public Builder versions(CustomResourceDefinitionVersionArgs... versions) {
            return versions(List.of(versions));
        }        public CustomResourceDefinitionSpecArgs build() {
            return new CustomResourceDefinitionSpecArgs(conversion, group, names, preserveUnknownFields, scope, versions);
        }
    }
}
