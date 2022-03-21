// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs;
import io.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigKernelSpecArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppImageConfigKernelGatewayImageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppImageConfigKernelGatewayImageConfigArgs Empty = new AppImageConfigKernelGatewayImageConfigArgs();

    /**
     * The URL where the Git repository is located. See File System Config details below.
     * 
     */
    @Import(name="fileSystemConfig")
      private final @Nullable Output<AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs> fileSystemConfig;

    public Output<AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs> getFileSystemConfig() {
        return this.fileSystemConfig == null ? Output.empty() : this.fileSystemConfig;
    }

    /**
     * The default branch for the Git repository. See Kernel Spec details below.
     * 
     */
    @Import(name="kernelSpec", required=true)
      private final Output<AppImageConfigKernelGatewayImageConfigKernelSpecArgs> kernelSpec;

    public Output<AppImageConfigKernelGatewayImageConfigKernelSpecArgs> getKernelSpec() {
        return this.kernelSpec;
    }

    public AppImageConfigKernelGatewayImageConfigArgs(
        @Nullable Output<AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs> fileSystemConfig,
        Output<AppImageConfigKernelGatewayImageConfigKernelSpecArgs> kernelSpec) {
        this.fileSystemConfig = fileSystemConfig;
        this.kernelSpec = Objects.requireNonNull(kernelSpec, "expected parameter 'kernelSpec' to be non-null");
    }

    private AppImageConfigKernelGatewayImageConfigArgs() {
        this.fileSystemConfig = Output.empty();
        this.kernelSpec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelGatewayImageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs> fileSystemConfig;
        private Output<AppImageConfigKernelGatewayImageConfigKernelSpecArgs> kernelSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigKernelGatewayImageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemConfig = defaults.fileSystemConfig;
    	      this.kernelSpec = defaults.kernelSpec;
        }

        public Builder fileSystemConfig(@Nullable Output<AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs> fileSystemConfig) {
            this.fileSystemConfig = fileSystemConfig;
            return this;
        }
        public Builder fileSystemConfig(@Nullable AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs fileSystemConfig) {
            this.fileSystemConfig = Output.ofNullable(fileSystemConfig);
            return this;
        }
        public Builder kernelSpec(Output<AppImageConfigKernelGatewayImageConfigKernelSpecArgs> kernelSpec) {
            this.kernelSpec = Objects.requireNonNull(kernelSpec);
            return this;
        }
        public Builder kernelSpec(AppImageConfigKernelGatewayImageConfigKernelSpecArgs kernelSpec) {
            this.kernelSpec = Output.of(Objects.requireNonNull(kernelSpec));
            return this;
        }        public AppImageConfigKernelGatewayImageConfigArgs build() {
            return new AppImageConfigKernelGatewayImageConfigArgs(fileSystemConfig, kernelSpec);
        }
    }
}
