// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * RoleRef contains information that points to the role being used
 * 
 */
public final class RoleRefArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleRefArgs Empty = new RoleRefArgs();

    /**
     * APIGroup is the group for the resource being referenced
     * 
     */
    @Import(name="apiGroup", required=true)
      private final Output<String> apiGroup;

    public Output<String> getApiGroup() {
        return this.apiGroup;
    }

    /**
     * Kind is the type of resource being referenced
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * Name is the name of resource being referenced
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public RoleRefArgs(
        Output<String> apiGroup,
        Output<String> kind,
        Output<String> name) {
        this.apiGroup = Objects.requireNonNull(apiGroup, "expected parameter 'apiGroup' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private RoleRefArgs() {
        this.apiGroup = Output.empty();
        this.kind = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiGroup;
        private Output<String> kind;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleRefArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder apiGroup(Output<String> apiGroup) {
            this.apiGroup = Objects.requireNonNull(apiGroup);
            return this;
        }
        public Builder apiGroup(String apiGroup) {
            this.apiGroup = Output.of(Objects.requireNonNull(apiGroup));
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public RoleRefArgs build() {
            return new RoleRefArgs(apiGroup, kind, name);
        }
    }
}
