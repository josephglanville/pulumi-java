// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppImageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppImageConfigArgs Empty = new AppImageConfigArgs();

    /**
     * The name of the App Image Config.
     * 
     */
    @Import(name="appImageConfigName", required=true)
      private final Output<String> appImageConfigName;

    public Output<String> getAppImageConfigName() {
        return this.appImageConfigName;
    }

    /**
     * The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app. See Kernel Gateway Image Config details below.
     * 
     */
    @Import(name="kernelGatewayImageConfig")
      private final @Nullable Output<AppImageConfigKernelGatewayImageConfigArgs> kernelGatewayImageConfig;

    public Output<AppImageConfigKernelGatewayImageConfigArgs> getKernelGatewayImageConfig() {
        return this.kernelGatewayImageConfig == null ? Output.empty() : this.kernelGatewayImageConfig;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public AppImageConfigArgs(
        Output<String> appImageConfigName,
        @Nullable Output<AppImageConfigKernelGatewayImageConfigArgs> kernelGatewayImageConfig,
        @Nullable Output<Map<String,String>> tags) {
        this.appImageConfigName = Objects.requireNonNull(appImageConfigName, "expected parameter 'appImageConfigName' to be non-null");
        this.kernelGatewayImageConfig = kernelGatewayImageConfig;
        this.tags = tags;
    }

    private AppImageConfigArgs() {
        this.appImageConfigName = Output.empty();
        this.kernelGatewayImageConfig = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appImageConfigName;
        private @Nullable Output<AppImageConfigKernelGatewayImageConfigArgs> kernelGatewayImageConfig;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appImageConfigName = defaults.appImageConfigName;
    	      this.kernelGatewayImageConfig = defaults.kernelGatewayImageConfig;
    	      this.tags = defaults.tags;
        }

        public Builder appImageConfigName(Output<String> appImageConfigName) {
            this.appImageConfigName = Objects.requireNonNull(appImageConfigName);
            return this;
        }
        public Builder appImageConfigName(String appImageConfigName) {
            this.appImageConfigName = Output.of(Objects.requireNonNull(appImageConfigName));
            return this;
        }
        public Builder kernelGatewayImageConfig(@Nullable Output<AppImageConfigKernelGatewayImageConfigArgs> kernelGatewayImageConfig) {
            this.kernelGatewayImageConfig = kernelGatewayImageConfig;
            return this;
        }
        public Builder kernelGatewayImageConfig(@Nullable AppImageConfigKernelGatewayImageConfigArgs kernelGatewayImageConfig) {
            this.kernelGatewayImageConfig = Output.ofNullable(kernelGatewayImageConfig);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public AppImageConfigArgs build() {
            return new AppImageConfigArgs(appImageConfigName, kernelGatewayImageConfig, tags);
        }
    }
}
