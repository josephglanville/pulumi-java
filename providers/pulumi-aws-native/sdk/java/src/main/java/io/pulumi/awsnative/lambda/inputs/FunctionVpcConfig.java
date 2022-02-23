// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The VPC security groups and subnets that are attached to a Lambda function. When you connect a function to a VPC, Lambda creates an elastic network interface for each combination of security group and subnet in the function's VPC configuration. The function can only access resources and the internet through that VPC.
 * 
 */
public final class FunctionVpcConfig extends io.pulumi.resources.InvokeArgs {

    public static final FunctionVpcConfig Empty = new FunctionVpcConfig();

    /**
     * A list of VPC security groups IDs.
     * 
     */
    @InputImport(name="securityGroupIds")
      private final @Nullable List<String> securityGroupIds;

    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }

    /**
     * A list of VPC subnet IDs.
     * 
     */
    @InputImport(name="subnetIds")
      private final @Nullable List<String> subnetIds;

    public List<String> getSubnetIds() {
        return this.subnetIds == null ? List.of() : this.subnetIds;
    }

    public FunctionVpcConfig(
        @Nullable List<String> securityGroupIds,
        @Nullable List<String> subnetIds) {
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
    }

    private FunctionVpcConfig() {
        this.securityGroupIds = List.of();
        this.subnetIds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> securityGroupIds;
        private @Nullable List<String> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionVpcConfig defaults) {
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
        public FunctionVpcConfig build() {
            return new FunctionVpcConfig(securityGroupIds, subnetIds);
        }
    }
}
