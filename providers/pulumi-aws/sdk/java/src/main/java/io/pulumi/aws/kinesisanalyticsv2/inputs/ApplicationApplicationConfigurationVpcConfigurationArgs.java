// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationVpcConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationVpcConfigurationArgs Empty = new ApplicationApplicationConfigurationVpcConfigurationArgs();

    /**
     * The Security Group IDs used by the VPC configuration.
     * 
     */
    @Import(name="securityGroupIds", required=true)
      private final Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * The Subnet IDs used by the VPC configuration.
     * 
     */
    @Import(name="subnetIds", required=true)
      private final Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    @Import(name="vpcConfigurationId")
      private final @Nullable Output<String> vpcConfigurationId;

    public Output<String> getVpcConfigurationId() {
        return this.vpcConfigurationId == null ? Output.empty() : this.vpcConfigurationId;
    }

    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Output.empty() : this.vpcId;
    }

    public ApplicationApplicationConfigurationVpcConfigurationArgs(
        Output<List<String>> securityGroupIds,
        Output<List<String>> subnetIds,
        @Nullable Output<String> vpcConfigurationId,
        @Nullable Output<String> vpcId) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.vpcConfigurationId = vpcConfigurationId;
        this.vpcId = vpcId;
    }

    private ApplicationApplicationConfigurationVpcConfigurationArgs() {
        this.securityGroupIds = Output.empty();
        this.subnetIds = Output.empty();
        this.vpcConfigurationId = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationVpcConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> securityGroupIds;
        private Output<List<String>> subnetIds;
        private @Nullable Output<String> vpcConfigurationId;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationVpcConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcConfigurationId = defaults.vpcConfigurationId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Output.of(Objects.requireNonNull(securityGroupIds));
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnetIds(Output<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Output.of(Objects.requireNonNull(subnetIds));
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder vpcConfigurationId(@Nullable Output<String> vpcConfigurationId) {
            this.vpcConfigurationId = vpcConfigurationId;
            return this;
        }
        public Builder vpcConfigurationId(@Nullable String vpcConfigurationId) {
            this.vpcConfigurationId = Output.ofNullable(vpcConfigurationId);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Output.ofNullable(vpcId);
            return this;
        }        public ApplicationApplicationConfigurationVpcConfigurationArgs build() {
            return new ApplicationApplicationConfigurationVpcConfigurationArgs(securityGroupIds, subnetIds, vpcConfigurationId, vpcId);
        }
    }
}