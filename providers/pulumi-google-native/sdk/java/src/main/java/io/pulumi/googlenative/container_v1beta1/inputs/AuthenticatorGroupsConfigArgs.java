// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for returning group information from authenticators.
 * 
 */
public final class AuthenticatorGroupsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthenticatorGroupsConfigArgs Empty = new AuthenticatorGroupsConfigArgs();

    /**
     * Whether this cluster should return group membership lookups during authentication using a group of security groups.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The name of the security group-of-groups to be used. Only relevant if enabled = true.
     * 
     */
    @InputImport(name="securityGroup")
      private final @Nullable Output<String> securityGroup;

    public Output<String> getSecurityGroup() {
        return this.securityGroup == null ? Output.empty() : this.securityGroup;
    }

    public AuthenticatorGroupsConfigArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> securityGroup) {
        this.enabled = enabled;
        this.securityGroup = securityGroup;
    }

    private AuthenticatorGroupsConfigArgs() {
        this.enabled = Output.empty();
        this.securityGroup = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticatorGroupsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> securityGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticatorGroupsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.securityGroup = defaults.securityGroup;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder securityGroup(@Nullable Output<String> securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }

        public Builder securityGroup(@Nullable String securityGroup) {
            this.securityGroup = Output.ofNullable(securityGroup);
            return this;
        }
        public AuthenticatorGroupsConfigArgs build() {
            return new AuthenticatorGroupsConfigArgs(enabled, securityGroup);
        }
    }
}
