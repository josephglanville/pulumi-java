// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionVpcConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Networking options for a job, such as network traffic encryption between containers, whether to allow inbound and outbound network calls to and from containers, and the VPC subnets and security groups to use for VPC-enabled jobs.
 * 
 */
public final class DataQualityJobDefinitionNetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataQualityJobDefinitionNetworkConfigArgs Empty = new DataQualityJobDefinitionNetworkConfigArgs();

    /**
     * Whether to encrypt all communications between distributed processing jobs. Choose True to encrypt communications. Encryption provides greater security for distributed processing jobs, but the processing might take longer.
     * 
     */
    @Import(name="enableInterContainerTrafficEncryption")
      private final @Nullable Output<Boolean> enableInterContainerTrafficEncryption;

    public Output<Boolean> getEnableInterContainerTrafficEncryption() {
        return this.enableInterContainerTrafficEncryption == null ? Output.empty() : this.enableInterContainerTrafficEncryption;
    }

    /**
     * Whether to allow inbound and outbound network calls to and from the containers used for the processing job.
     * 
     */
    @Import(name="enableNetworkIsolation")
      private final @Nullable Output<Boolean> enableNetworkIsolation;

    public Output<Boolean> getEnableNetworkIsolation() {
        return this.enableNetworkIsolation == null ? Output.empty() : this.enableNetworkIsolation;
    }

    @Import(name="vpcConfig")
      private final @Nullable Output<DataQualityJobDefinitionVpcConfigArgs> vpcConfig;

    public Output<DataQualityJobDefinitionVpcConfigArgs> getVpcConfig() {
        return this.vpcConfig == null ? Output.empty() : this.vpcConfig;
    }

    public DataQualityJobDefinitionNetworkConfigArgs(
        @Nullable Output<Boolean> enableInterContainerTrafficEncryption,
        @Nullable Output<Boolean> enableNetworkIsolation,
        @Nullable Output<DataQualityJobDefinitionVpcConfigArgs> vpcConfig) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
        this.enableNetworkIsolation = enableNetworkIsolation;
        this.vpcConfig = vpcConfig;
    }

    private DataQualityJobDefinitionNetworkConfigArgs() {
        this.enableInterContainerTrafficEncryption = Output.empty();
        this.enableNetworkIsolation = Output.empty();
        this.vpcConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableInterContainerTrafficEncryption;
        private @Nullable Output<Boolean> enableNetworkIsolation;
        private @Nullable Output<DataQualityJobDefinitionVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionNetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInterContainerTrafficEncryption = defaults.enableInterContainerTrafficEncryption;
    	      this.enableNetworkIsolation = defaults.enableNetworkIsolation;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder enableInterContainerTrafficEncryption(@Nullable Output<Boolean> enableInterContainerTrafficEncryption) {
            this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
            return this;
        }
        public Builder enableInterContainerTrafficEncryption(@Nullable Boolean enableInterContainerTrafficEncryption) {
            this.enableInterContainerTrafficEncryption = Output.ofNullable(enableInterContainerTrafficEncryption);
            return this;
        }
        public Builder enableNetworkIsolation(@Nullable Output<Boolean> enableNetworkIsolation) {
            this.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }
        public Builder enableNetworkIsolation(@Nullable Boolean enableNetworkIsolation) {
            this.enableNetworkIsolation = Output.ofNullable(enableNetworkIsolation);
            return this;
        }
        public Builder vpcConfig(@Nullable Output<DataQualityJobDefinitionVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public Builder vpcConfig(@Nullable DataQualityJobDefinitionVpcConfigArgs vpcConfig) {
            this.vpcConfig = Output.ofNullable(vpcConfig);
            return this;
        }        public DataQualityJobDefinitionNetworkConfigArgs build() {
            return new DataQualityJobDefinitionNetworkConfigArgs(enableInterContainerTrafficEncryption, enableNetworkIsolation, vpcConfig);
        }
    }
}
