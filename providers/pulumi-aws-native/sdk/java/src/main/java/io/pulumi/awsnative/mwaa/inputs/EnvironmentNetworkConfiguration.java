// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configures the network resources of the environment.
 * 
 */
public final class EnvironmentNetworkConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final EnvironmentNetworkConfiguration Empty = new EnvironmentNetworkConfiguration();

    /**
     * A list of security groups to use for the environment.
     * 
     */
    @Import(name="securityGroupIds")
      private final @Nullable List<String> securityGroupIds;

    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }

    /**
     * A list of subnets to use for the environment. These must be private subnets, in the same VPC, in two different availability zones.
     * 
     */
    @Import(name="subnetIds")
      private final @Nullable List<String> subnetIds;

    public List<String> getSubnetIds() {
        return this.subnetIds == null ? List.of() : this.subnetIds;
    }

    public EnvironmentNetworkConfiguration(
        @Nullable List<String> securityGroupIds,
        @Nullable List<String> subnetIds) {
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
    }

    private EnvironmentNetworkConfiguration() {
        this.securityGroupIds = List.of();
        this.subnetIds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentNetworkConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> securityGroupIds;
        private @Nullable List<String> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentNetworkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }        public EnvironmentNetworkConfiguration build() {
            return new EnvironmentNetworkConfiguration(securityGroupIds, subnetIds);
        }
    }
}
