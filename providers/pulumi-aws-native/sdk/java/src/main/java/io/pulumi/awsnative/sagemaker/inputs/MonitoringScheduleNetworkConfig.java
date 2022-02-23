// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleVpcConfig;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Networking options for a job, such as network traffic encryption between containers, whether to allow inbound and outbound network calls to and from containers, and the VPC subnets and security groups to use for VPC-enabled jobs.
 * 
 */
public final class MonitoringScheduleNetworkConfig extends io.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleNetworkConfig Empty = new MonitoringScheduleNetworkConfig();

    /**
     * Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
     * 
     */
    @InputImport(name="enableInterContainerTrafficEncryption")
      private final @Nullable Boolean enableInterContainerTrafficEncryption;

    public Optional<Boolean> getEnableInterContainerTrafficEncryption() {
        return this.enableInterContainerTrafficEncryption == null ? Optional.empty() : Optional.ofNullable(this.enableInterContainerTrafficEncryption);
    }

    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
     * 
     */
    @InputImport(name="enableNetworkIsolation")
      private final @Nullable Boolean enableNetworkIsolation;

    public Optional<Boolean> getEnableNetworkIsolation() {
        return this.enableNetworkIsolation == null ? Optional.empty() : Optional.ofNullable(this.enableNetworkIsolation);
    }

    @InputImport(name="vpcConfig")
      private final @Nullable MonitoringScheduleVpcConfig vpcConfig;

    public Optional<MonitoringScheduleVpcConfig> getVpcConfig() {
        return this.vpcConfig == null ? Optional.empty() : Optional.ofNullable(this.vpcConfig);
    }

    public MonitoringScheduleNetworkConfig(
        @Nullable Boolean enableInterContainerTrafficEncryption,
        @Nullable Boolean enableNetworkIsolation,
        @Nullable MonitoringScheduleVpcConfig vpcConfig) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
        this.enableNetworkIsolation = enableNetworkIsolation;
        this.vpcConfig = vpcConfig;
    }

    private MonitoringScheduleNetworkConfig() {
        this.enableInterContainerTrafficEncryption = null;
        this.enableNetworkIsolation = null;
        this.vpcConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableInterContainerTrafficEncryption;
        private @Nullable Boolean enableNetworkIsolation;
        private @Nullable MonitoringScheduleVpcConfig vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInterContainerTrafficEncryption = defaults.enableInterContainerTrafficEncryption;
    	      this.enableNetworkIsolation = defaults.enableNetworkIsolation;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder setEnableInterContainerTrafficEncryption(@Nullable Boolean enableInterContainerTrafficEncryption) {
            this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
            return this;
        }

        public Builder setEnableNetworkIsolation(@Nullable Boolean enableNetworkIsolation) {
            this.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }

        public Builder setVpcConfig(@Nullable MonitoringScheduleVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public MonitoringScheduleNetworkConfig build() {
            return new MonitoringScheduleNetworkConfig(enableInterContainerTrafficEncryption, enableNetworkIsolation, vpcConfig);
        }
    }
}
