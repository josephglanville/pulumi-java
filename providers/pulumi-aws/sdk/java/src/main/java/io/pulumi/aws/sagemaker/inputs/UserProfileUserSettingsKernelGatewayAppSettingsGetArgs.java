// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs;
import io.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserProfileUserSettingsKernelGatewayAppSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileUserSettingsKernelGatewayAppSettingsGetArgs Empty = new UserProfileUserSettingsKernelGatewayAppSettingsGetArgs();

    /**
     * A list of custom SageMaker images that are configured to run as a KernelGateway app. see Custom Image below.
     * 
     */
    @Import(name="customImages")
      private final @Nullable Output<List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> customImages;

    public Output<List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> getCustomImages() {
        return this.customImages == null ? Output.empty() : this.customImages;
    }

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    @Import(name="defaultResourceSpec", required=true)
      private final Output<UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec;

    public Output<UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> getDefaultResourceSpec() {
        return this.defaultResourceSpec;
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

    public UserProfileUserSettingsKernelGatewayAppSettingsGetArgs(
        @Nullable Output<List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> customImages,
        Output<UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec,
        @Nullable Output<List<String>> lifecycleConfigArns) {
        this.customImages = customImages;
        this.defaultResourceSpec = Objects.requireNonNull(defaultResourceSpec, "expected parameter 'defaultResourceSpec' to be non-null");
        this.lifecycleConfigArns = lifecycleConfigArns;
    }

    private UserProfileUserSettingsKernelGatewayAppSettingsGetArgs() {
        this.customImages = Output.empty();
        this.defaultResourceSpec = Output.empty();
        this.lifecycleConfigArns = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsKernelGatewayAppSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> customImages;
        private Output<UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec;
        private @Nullable Output<List<String>> lifecycleConfigArns;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsKernelGatewayAppSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customImages = defaults.customImages;
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
    	      this.lifecycleConfigArns = defaults.lifecycleConfigArns;
        }

        public Builder customImages(@Nullable Output<List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs>> customImages) {
            this.customImages = customImages;
            return this;
        }
        public Builder customImages(@Nullable List<UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs> customImages) {
            this.customImages = Output.ofNullable(customImages);
            return this;
        }
        public Builder customImages(UserProfileUserSettingsKernelGatewayAppSettingsCustomImageGetArgs... customImages) {
            return customImages(List.of(customImages));
        }
        public Builder defaultResourceSpec(Output<UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs> defaultResourceSpec) {
            this.defaultResourceSpec = Objects.requireNonNull(defaultResourceSpec);
            return this;
        }
        public Builder defaultResourceSpec(UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpecGetArgs defaultResourceSpec) {
            this.defaultResourceSpec = Output.of(Objects.requireNonNull(defaultResourceSpec));
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
        }        public UserProfileUserSettingsKernelGatewayAppSettingsGetArgs build() {
            return new UserProfileUserSettingsKernelGatewayAppSettingsGetArgs(customImages, defaultResourceSpec, lifecycleConfigArns);
        }
    }
}