// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.aws.sagemaker.outputs.AppImageConfigKernelGatewayImageConfigFileSystemConfig;
import io.pulumi.aws.sagemaker.outputs.AppImageConfigKernelGatewayImageConfigKernelSpec;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppImageConfigKernelGatewayImageConfig {
    /**
     * The URL where the Git repository is located. See File System Config details below.
     * 
     */
    private final @Nullable AppImageConfigKernelGatewayImageConfigFileSystemConfig fileSystemConfig;
    /**
     * The default branch for the Git repository. See Kernel Spec details below.
     * 
     */
    private final AppImageConfigKernelGatewayImageConfigKernelSpec kernelSpec;

    @CustomType.Constructor
    private AppImageConfigKernelGatewayImageConfig(
        @CustomType.Parameter("fileSystemConfig") @Nullable AppImageConfigKernelGatewayImageConfigFileSystemConfig fileSystemConfig,
        @CustomType.Parameter("kernelSpec") AppImageConfigKernelGatewayImageConfigKernelSpec kernelSpec) {
        this.fileSystemConfig = fileSystemConfig;
        this.kernelSpec = kernelSpec;
    }

    /**
     * The URL where the Git repository is located. See File System Config details below.
     * 
    */
    public Optional<AppImageConfigKernelGatewayImageConfigFileSystemConfig> getFileSystemConfig() {
        return Optional.ofNullable(this.fileSystemConfig);
    }
    /**
     * The default branch for the Git repository. See Kernel Spec details below.
     * 
    */
    public AppImageConfigKernelGatewayImageConfigKernelSpec getKernelSpec() {
        return this.kernelSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelGatewayImageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AppImageConfigKernelGatewayImageConfigFileSystemConfig fileSystemConfig;
        private AppImageConfigKernelGatewayImageConfigKernelSpec kernelSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigKernelGatewayImageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemConfig = defaults.fileSystemConfig;
    	      this.kernelSpec = defaults.kernelSpec;
        }

        public Builder fileSystemConfig(@Nullable AppImageConfigKernelGatewayImageConfigFileSystemConfig fileSystemConfig) {
            this.fileSystemConfig = fileSystemConfig;
            return this;
        }
        public Builder kernelSpec(AppImageConfigKernelGatewayImageConfigKernelSpec kernelSpec) {
            this.kernelSpec = Objects.requireNonNull(kernelSpec);
            return this;
        }        public AppImageConfigKernelGatewayImageConfig build() {
            return new AppImageConfigKernelGatewayImageConfig(fileSystemConfig, kernelSpec);
        }
    }
}