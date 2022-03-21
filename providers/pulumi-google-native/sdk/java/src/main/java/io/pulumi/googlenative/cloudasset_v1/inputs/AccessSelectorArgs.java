// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies roles and/or permissions to analyze, to determine both the identities possessing them and the resources they control. If multiple values are specified, results will include roles or permissions matching any of them. The total number of roles and permissions should be equal or less than 10.
 * 
 */
public final class AccessSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessSelectorArgs Empty = new AccessSelectorArgs();

    /**
     * Optional. The permissions to appear in result.
     * 
     */
    @Import(name="permissions")
      private final @Nullable Output<List<String>> permissions;

    public Output<List<String>> getPermissions() {
        return this.permissions == null ? Output.empty() : this.permissions;
    }

    /**
     * Optional. The roles to appear in result.
     * 
     */
    @Import(name="roles")
      private final @Nullable Output<List<String>> roles;

    public Output<List<String>> getRoles() {
        return this.roles == null ? Output.empty() : this.roles;
    }

    public AccessSelectorArgs(
        @Nullable Output<List<String>> permissions,
        @Nullable Output<List<String>> roles) {
        this.permissions = permissions;
        this.roles = roles;
    }

    private AccessSelectorArgs() {
        this.permissions = Output.empty();
        this.roles = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> permissions;
        private @Nullable Output<List<String>> roles;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.roles = defaults.roles;
        }

        public Builder permissions(@Nullable Output<List<String>> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(@Nullable List<String> permissions) {
            this.permissions = Output.ofNullable(permissions);
            return this;
        }
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder roles(@Nullable Output<List<String>> roles) {
            this.roles = roles;
            return this;
        }
        public Builder roles(@Nullable List<String> roles) {
            this.roles = Output.ofNullable(roles);
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }        public AccessSelectorArgs build() {
            return new AccessSelectorArgs(permissions, roles);
        }
    }
}
