// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FleetVpcConfig {
    /**
     * Identifiers of the security groups for the fleet or image builder.
     * 
     */
    private final @Nullable List<String> securityGroupIds;
    /**
     * Identifiers of the subnets to which a network interface is attached from the fleet instance or image builder instance.
     * 
     */
    private final @Nullable List<String> subnetIds;

    @OutputCustomType.Constructor
    private FleetVpcConfig(
        @OutputCustomType.Parameter("securityGroupIds") @Nullable List<String> securityGroupIds,
        @OutputCustomType.Parameter("subnetIds") @Nullable List<String> subnetIds) {
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
    }

    /**
     * Identifiers of the security groups for the fleet or image builder.
     * 
    */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * Identifiers of the subnets to which a network interface is attached from the fleet instance or image builder instance.
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds == null ? List.of() : this.subnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> securityGroupIds;
        private @Nullable List<String> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSubnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public FleetVpcConfig build() {
            return new FleetVpcConfig(securityGroupIds, subnetIds);
        }
    }
}
