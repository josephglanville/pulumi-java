// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageGetArgs;
import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs Empty = new DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs();

    /**
     * A list of custom SageMaker images that are configured to run as a KernelGateway app. see Custom Image below.
     * 
     */
    @Import(name="customImages")
      private final @Nullable Output<List<DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> customImages;

    public Output<List<DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> getCustomImages() {
        return this.customImages == null ? Output.empty() : this.customImages;
    }

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    @Import(name="defaultResourceSpec")
      private final @Nullable Output<DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec;

    public Output<DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> getDefaultResourceSpec() {
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

    public DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs(
        @Nullable Output<List<DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> customImages,
        @Nullable Output<DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec,
        @Nullable Output<List<String>> lifecycleConfigArns) {
        this.customImages = customImages;
        this.defaultResourceSpec = defaultResourceSpec;
        this.lifecycleConfigArns = lifecycleConfigArns;
    }

    private DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs() {
        this.customImages = Output.empty();
        this.defaultResourceSpec = Output.empty();
        this.lifecycleConfigArns = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> customImages;
        private @Nullable Output<DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec;
        private @Nullable Output<List<String>> lifecycleConfigArns;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customImages = defaults.customImages;
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
    	      this.lifecycleConfigArns = defaults.lifecycleConfigArns;
        }

        public Builder customImages(@Nullable Output<List<DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> customImages) {
            this.customImages = customImages;
            return this;
        }
        public Builder customImages(@Nullable List<DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageGetArgs> customImages) {
            this.customImages = Output.ofNullable(customImages);
            return this;
        }
        public Builder customImages(DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageGetArgs... customImages) {
            return customImages(List.of(customImages));
        }
        public Builder defaultResourceSpec(@Nullable Output<DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec) {
            this.defaultResourceSpec = defaultResourceSpec;
            return this;
        }
        public Builder defaultResourceSpec(@Nullable DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs defaultResourceSpec) {
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
        }        public DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs build() {
            return new DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs(customImages, defaultResourceSpec, lifecycleConfigArns);
        }
    }
}