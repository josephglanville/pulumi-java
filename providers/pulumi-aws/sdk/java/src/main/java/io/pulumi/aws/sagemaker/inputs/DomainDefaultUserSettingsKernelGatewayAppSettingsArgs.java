// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs;
import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainDefaultUserSettingsKernelGatewayAppSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainDefaultUserSettingsKernelGatewayAppSettingsArgs Empty = new DomainDefaultUserSettingsKernelGatewayAppSettingsArgs();

    /**
     * A list of custom SageMaker images that are configured to run as a KernelGateway app. see Custom Image below.
     * 
     */
    @Import(name="customImages")
      private final @Nullable Output<List<DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs>> customImages;

    public Output<List<DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs>> getCustomImages() {
        return this.customImages == null ? Output.empty() : this.customImages;
    }

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    @Import(name="defaultResourceSpec")
      private final @Nullable Output<DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs> defaultResourceSpec;

    public Output<DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs> getDefaultResourceSpec() {
        return this.defaultResourceSpec == null ? Output.empty() : this.defaultResourceSpec;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations.
     * 
     */
    @Import(name="lifecycleConfigArns")
      private final @Nullable Output<List<String>> lifecycleConfigArns;

    public Output<List<String>> getLifecycleConfigArns() {
        return this.lifecycleConfigArns == null ? Output.empty() : this.lifecycleConfigArns;
    }

    public DomainDefaultUserSettingsKernelGatewayAppSettingsArgs(
        @Nullable Output<List<DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs>> customImages,
        @Nullable Output<DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs> defaultResourceSpec,
        @Nullable Output<List<String>> lifecycleConfigArns) {
        this.customImages = customImages;
        this.defaultResourceSpec = defaultResourceSpec;
        this.lifecycleConfigArns = lifecycleConfigArns;
    }

    private DomainDefaultUserSettingsKernelGatewayAppSettingsArgs() {
        this.customImages = Output.empty();
        this.defaultResourceSpec = Output.empty();
        this.lifecycleConfigArns = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainDefaultUserSettingsKernelGatewayAppSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs>> customImages;
        private @Nullable Output<DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs> defaultResourceSpec;
        private @Nullable Output<List<String>> lifecycleConfigArns;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainDefaultUserSettingsKernelGatewayAppSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customImages = defaults.customImages;
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
    	      this.lifecycleConfigArns = defaults.lifecycleConfigArns;
        }

        public Builder customImages(@Nullable Output<List<DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs>> customImages) {
            this.customImages = customImages;
            return this;
        }
        public Builder customImages(@Nullable List<DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs> customImages) {
            this.customImages = Output.ofNullable(customImages);
            return this;
        }
        public Builder customImages(DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs... customImages) {
            return customImages(List.of(customImages));
        }
        public Builder defaultResourceSpec(@Nullable Output<DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs> defaultResourceSpec) {
            this.defaultResourceSpec = defaultResourceSpec;
            return this;
        }
        public Builder defaultResourceSpec(@Nullable DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs defaultResourceSpec) {
            this.defaultResourceSpec = Output.ofNullable(defaultResourceSpec);
            return this;
        }
        public Builder lifecycleConfigArns(@Nullable Output<List<String>> lifecycleConfigArns) {
            this.lifecycleConfigArns = lifecycleConfigArns;
            return this;
        }
        public Builder lifecycleConfigArns(@Nullable List<String> lifecycleConfigArns) {
            this.lifecycleConfigArns = Output.ofNullable(lifecycleConfigArns);
            return this;
        }
        public Builder lifecycleConfigArns(String... lifecycleConfigArns) {
            return lifecycleConfigArns(List.of(lifecycleConfigArns));
        }        public DomainDefaultUserSettingsKernelGatewayAppSettingsArgs build() {
            return new DomainDefaultUserSettingsKernelGatewayAppSettingsArgs(customImages, defaultResourceSpec, lifecycleConfigArns);
        }
    }
}
