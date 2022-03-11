// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ResourcePolicyRule is a predicate that matches some resource requests, testing the request's verb and the target resource. A ResourcePolicyRule matches a resource request if and only if: (a) at least one member of verbs matches the request, (b) at least one member of apiGroups matches the request, (c) at least one member of resources matches the request, and (d) either (d1) the request does not specify a namespace (i.e., `Namespace==""`) and clusterScope is true or (d2) the request specifies a namespace and least one member of namespaces matches the request's namespace.
 * 
 */
public final class ResourcePolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyRuleArgs Empty = new ResourcePolicyRuleArgs();

    /**
     * `apiGroups` is a list of matching API groups and may not be empty. "*" matches all API groups and, if present, must be the only entry. Required.
     * 
     */
    @InputImport(name="apiGroups", required=true)
      private final Output<List<String>> apiGroups;

    public Output<List<String>> getApiGroups() {
        return this.apiGroups;
    }

    /**
     * `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
     * 
     */
    @InputImport(name="clusterScope")
      private final @Nullable Output<Boolean> clusterScope;

    public Output<Boolean> getClusterScope() {
        return this.clusterScope == null ? Output.empty() : this.clusterScope;
    }

    /**
     * `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains "*".  Note that "*" matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
     * 
     */
    @InputImport(name="namespaces")
      private final @Nullable Output<List<String>> namespaces;

    public Output<List<String>> getNamespaces() {
        return this.namespaces == null ? Output.empty() : this.namespaces;
    }

    /**
     * `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ "services", "nodes/status" ].  This list may not be empty. "*" matches all resources and, if present, must be the only entry. Required.
     * 
     */
    @InputImport(name="resources", required=true)
      private final Output<List<String>> resources;

    public Output<List<String>> getResources() {
        return this.resources;
    }

    /**
     * `verbs` is a list of matching verbs and may not be empty. "*" matches all verbs and, if present, must be the only entry. Required.
     * 
     */
    @InputImport(name="verbs", required=true)
      private final Output<List<String>> verbs;

    public Output<List<String>> getVerbs() {
        return this.verbs;
    }

    public ResourcePolicyRuleArgs(
        Output<List<String>> apiGroups,
        @Nullable Output<Boolean> clusterScope,
        @Nullable Output<List<String>> namespaces,
        Output<List<String>> resources,
        Output<List<String>> verbs) {
        this.apiGroups = Objects.requireNonNull(apiGroups, "expected parameter 'apiGroups' to be non-null");
        this.clusterScope = clusterScope;
        this.namespaces = namespaces;
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
        this.verbs = Objects.requireNonNull(verbs, "expected parameter 'verbs' to be non-null");
    }

    private ResourcePolicyRuleArgs() {
        this.apiGroups = Output.empty();
        this.clusterScope = Output.empty();
        this.namespaces = Output.empty();
        this.resources = Output.empty();
        this.verbs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> apiGroups;
        private @Nullable Output<Boolean> clusterScope;
        private @Nullable Output<List<String>> namespaces;
        private Output<List<String>> resources;
        private Output<List<String>> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.clusterScope = defaults.clusterScope;
    	      this.namespaces = defaults.namespaces;
    	      this.resources = defaults.resources;
    	      this.verbs = defaults.verbs;
        }

        public Builder apiGroups(Output<List<String>> apiGroups) {
            this.apiGroups = Objects.requireNonNull(apiGroups);
            return this;
        }

        public Builder apiGroups(List<String> apiGroups) {
            this.apiGroups = Output.of(Objects.requireNonNull(apiGroups));
            return this;
        }

        public Builder clusterScope(@Nullable Output<Boolean> clusterScope) {
            this.clusterScope = clusterScope;
            return this;
        }

        public Builder clusterScope(@Nullable Boolean clusterScope) {
            this.clusterScope = Output.ofNullable(clusterScope);
            return this;
        }

        public Builder namespaces(@Nullable Output<List<String>> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        public Builder namespaces(@Nullable List<String> namespaces) {
            this.namespaces = Output.ofNullable(namespaces);
            return this;
        }

        public Builder resources(Output<List<String>> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder resources(List<String> resources) {
            this.resources = Output.of(Objects.requireNonNull(resources));
            return this;
        }

        public Builder verbs(Output<List<String>> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }

        public Builder verbs(List<String> verbs) {
            this.verbs = Output.of(Objects.requireNonNull(verbs));
            return this;
        }
        public ResourcePolicyRuleArgs build() {
            return new ResourcePolicyRuleArgs(apiGroups, clusterScope, namespaces, resources, verbs);
        }
    }
}
