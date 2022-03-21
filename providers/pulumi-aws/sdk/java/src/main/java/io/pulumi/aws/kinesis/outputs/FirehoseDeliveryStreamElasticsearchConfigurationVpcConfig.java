// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig {
    /**
     * The ARN of the IAM role to be assumed by Firehose for calling the Amazon EC2 configuration API and for creating network interfaces. Make sure role has necessary [IAM permissions](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-es-vpc)
     * 
     */
    private final String roleArn;
    /**
     * A list of security group IDs to associate with Kinesis Firehose.
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * A list of subnet IDs to associate with Kinesis Firehose.
     * 
     */
    private final List<String> subnetIds;
    private final @Nullable String vpcId;

    @CustomType.Constructor
    private FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig(
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("securityGroupIds") List<String> securityGroupIds,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("vpcId") @Nullable String vpcId) {
        this.roleArn = roleArn;
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    /**
     * The ARN of the IAM role to be assumed by Firehose for calling the Amazon EC2 configuration API and for creating network interfaces. Make sure role has necessary [IAM permissions](https://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-es-vpc)
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * A list of security group IDs to associate with Kinesis Firehose.
     * 
    */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * A list of subnet IDs to associate with Kinesis Firehose.
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    public Optional<String> getVpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleArn;
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }        public FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig build() {
            return new FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig(roleArn, securityGroupIds, subnetIds, vpcId);
        }
    }
}
