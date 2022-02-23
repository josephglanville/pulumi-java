// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies a VPC that your training jobs and hosted models have access to. Control access to and from your training and model containers by configuring the VPC.
 * 
 */
public final class MonitoringScheduleVpcConfig extends io.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleVpcConfig Empty = new MonitoringScheduleVpcConfig();

    /**
     * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
     * 
     */
    @InputImport(name="securityGroupIds", required=true)
      private final List<String> securityGroupIds;

    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * The ID of the subnets in the VPC to which you want to connect to your monitoring jobs.
     * 
     */
    @InputImport(name="subnets", required=true)
      private final List<String> subnets;

    public List<String> getSubnets() {
        return this.subnets;
    }

    public MonitoringScheduleVpcConfig(
        List<String> securityGroupIds,
        List<String> subnets) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnets = Objects.requireNonNull(subnets, "expected parameter 'subnets' to be non-null");
    }

    private MonitoringScheduleVpcConfig() {
        this.securityGroupIds = List.of();
        this.subnets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnets = defaults.subnets;
        }

        public Builder setSecurityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder setSubnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public MonitoringScheduleVpcConfig build() {
            return new MonitoringScheduleVpcConfig(securityGroupIds, subnets);
        }
    }
}
