// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs;
import io.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppImageConfigKernelGatewayImageConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppImageConfigKernelGatewayImageConfigGetArgs Empty = new AppImageConfigKernelGatewayImageConfigGetArgs();

    /**
     * The URL where the Git repository is located. See File System Config details below.
     * 
     */
    @Import(name="fileSystemConfig")
      private final @Nullable Output<AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs> fileSystemConfig;

    public Output<AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs> getFileSystemConfig() {
        return this.fileSystemConfig == null ? Output.empty() : this.fileSystemConfig;
    }

    /**
     * The default branch for the Git repository. See Kernel Spec details below.
     * 
     */
    @Import(name="kernelSpec", required=true)
      private final Output<AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs> kernelSpec;

    public Output<AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs> getKernelSpec() {
        return this.kernelSpec;
    }

    public AppImageConfigKernelGatewayImageConfigGetArgs(
        @Nullable Output<AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs> fileSystemConfig,
        Output<AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs> kernelSpec) {
        this.fileSystemConfig = fileSystemConfig;
        this.kernelSpec = Objects.requireNonNull(kernelSpec, "expected parameter 'kernelSpec' to be non-null");
    }

    private AppImageConfigKernelGatewayImageConfigGetArgs() {
        this.fileSystemConfig = Output.empty();
        this.kernelSpec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelGatewayImageConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs> fileSystemConfig;
        private Output<AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs> kernelSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigKernelGatewayImageConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemConfig = defaults.fileSystemConfig;
    	      this.kernelSpec = defaults.kernelSpec;
        }

        public Builder fileSystemConfig(@Nullable Output<AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs> fileSystemConfig) {
            this.fileSystemConfig = fileSystemConfig;
            return this;
        }
        public Builder fileSystemConfig(@Nullable AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs fileSystemConfig) {
            this.fileSystemConfig = Output.ofNullable(fileSystemConfig);
            return this;
        }
        public Builder kernelSpec(Output<AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs> kernelSpec) {
            this.kernelSpec = Objects.requireNonNull(kernelSpec);
            return this;
        }
        public Builder kernelSpec(AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs kernelSpec) {
            this.kernelSpec = Output.of(Objects.requireNonNull(kernelSpec));
            return this;
        }        public AppImageConfigKernelGatewayImageConfigGetArgs build() {
            return new AppImageConfigKernelGatewayImageConfigGetArgs(fileSystemConfig, kernelSpec);
        }
    }
}
