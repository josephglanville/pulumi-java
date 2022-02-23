// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleVpcConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Networking options for a job, such as network traffic encryption between containers, whether to allow inbound and outbound network calls to and from containers, and the VPC subnets and security groups to use for VPC-enabled jobs.
 * 
 */
public final class MonitoringScheduleNetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleNetworkConfigArgs Empty = new MonitoringScheduleNetworkConfigArgs();

    /**
     * Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
     * 
     */
    @InputImport(name="enableInterContainerTrafficEncryption")
      private final @Nullable Input<Boolean> enableInterContainerTrafficEncryption;

    public Input<Boolean> getEnableInterContainerTrafficEncryption() {
        return this.enableInterContainerTrafficEncryption == null ? Input.empty() : this.enableInterContainerTrafficEncryption;
    }

    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
     * 
     */
    @InputImport(name="enableNetworkIsolation")
      private final @Nullable Input<Boolean> enableNetworkIsolation;

    public Input<Boolean> getEnableNetworkIsolation() {
        return this.enableNetworkIsolation == null ? Input.empty() : this.enableNetworkIsolation;
    }

    @InputImport(name="vpcConfig")
      private final @Nullable Input<MonitoringScheduleVpcConfigArgs> vpcConfig;

    public Input<MonitoringScheduleVpcConfigArgs> getVpcConfig() {
        return this.vpcConfig == null ? Input.empty() : this.vpcConfig;
    }

    public MonitoringScheduleNetworkConfigArgs(
        @Nullable Input<Boolean> enableInterContainerTrafficEncryption,
        @Nullable Input<Boolean> enableNetworkIsolation,
        @Nullable Input<MonitoringScheduleVpcConfigArgs> vpcConfig) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
        this.enableNetworkIsolation = enableNetworkIsolation;
        this.vpcConfig = vpcConfig;
    }

    private MonitoringScheduleNetworkConfigArgs() {
        this.enableInterContainerTrafficEncryption = Input.empty();
        this.enableNetworkIsolation = Input.empty();
        this.vpcConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableInterContainerTrafficEncryption;
        private @Nullable Input<Boolean> enableNetworkIsolation;
        private @Nullable Input<MonitoringScheduleVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleNetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInterContainerTrafficEncryption = defaults.enableInterContainerTrafficEncryption;
    	      this.enableNetworkIsolation = defaults.enableNetworkIsolation;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder setEnableInterContainerTrafficEncryption(@Nullable Input<Boolean> enableInterContainerTrafficEncryption) {
            this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
            return this;
        }

        public Builder setEnableInterContainerTrafficEncryption(@Nullable Boolean enableInterContainerTrafficEncryption) {
            this.enableInterContainerTrafficEncryption = Input.ofNullable(enableInterContainerTrafficEncryption);
            return this;
        }

        public Builder setEnableNetworkIsolation(@Nullable Input<Boolean> enableNetworkIsolation) {
            this.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }

        public Builder setEnableNetworkIsolation(@Nullable Boolean enableNetworkIsolation) {
            this.enableNetworkIsolation = Input.ofNullable(enableNetworkIsolation);
            return this;
        }

        public Builder setVpcConfig(@Nullable Input<MonitoringScheduleVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public Builder setVpcConfig(@Nullable MonitoringScheduleVpcConfigArgs vpcConfig) {
            this.vpcConfig = Input.ofNullable(vpcConfig);
            return this;
        }
        public MonitoringScheduleNetworkConfigArgs build() {
            return new MonitoringScheduleNetworkConfigArgs(enableInterContainerTrafficEncryption, enableNetworkIsolation, vpcConfig);
        }
    }
}
