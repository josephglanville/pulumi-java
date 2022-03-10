// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpec {
    /**
     * The instance type.
     * 
     */
    private final @Nullable String instanceType;
    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     * 
     */
    private final @Nullable String lifecycleConfigArn;
    /**
     * The Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     * 
     */
    private final @Nullable String sagemakerImageArn;
    /**
     * The ARN of the image version created on the instance.
     * 
     */
    private final @Nullable String sagemakerImageVersionArn;

    @OutputCustomType.Constructor
    private UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpec(
        @OutputCustomType.Parameter("instanceType") @Nullable String instanceType,
        @OutputCustomType.Parameter("lifecycleConfigArn") @Nullable String lifecycleConfigArn,
        @OutputCustomType.Parameter("sagemakerImageArn") @Nullable String sagemakerImageArn,
        @OutputCustomType.Parameter("sagemakerImageVersionArn") @Nullable String sagemakerImageVersionArn) {
        this.instanceType = instanceType;
        this.lifecycleConfigArn = lifecycleConfigArn;
        this.sagemakerImageArn = sagemakerImageArn;
        this.sagemakerImageVersionArn = sagemakerImageVersionArn;
    }

    /**
     * The instance type.
     * 
    */
    public Optional<String> getInstanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     * 
    */
    public Optional<String> getLifecycleConfigArn() {
        return Optional.ofNullable(this.lifecycleConfigArn);
    }
    /**
     * The Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     * 
    */
    public Optional<String> getSagemakerImageArn() {
        return Optional.ofNullable(this.sagemakerImageArn);
    }
    /**
     * The ARN of the image version created on the instance.
     * 
    */
    public Optional<String> getSagemakerImageVersionArn() {
        return Optional.ofNullable(this.sagemakerImageVersionArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String instanceType;
        private @Nullable String lifecycleConfigArn;
        private @Nullable String sagemakerImageArn;
        private @Nullable String sagemakerImageVersionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.lifecycleConfigArn = defaults.lifecycleConfigArn;
    	      this.sagemakerImageArn = defaults.sagemakerImageArn;
    	      this.sagemakerImageVersionArn = defaults.sagemakerImageVersionArn;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setLifecycleConfigArn(@Nullable String lifecycleConfigArn) {
            this.lifecycleConfigArn = lifecycleConfigArn;
            return this;
        }

        public Builder setSagemakerImageArn(@Nullable String sagemakerImageArn) {
            this.sagemakerImageArn = sagemakerImageArn;
            return this;
        }

        public Builder setSagemakerImageVersionArn(@Nullable String sagemakerImageVersionArn) {
            this.sagemakerImageVersionArn = sagemakerImageVersionArn;
            return this;
        }
        public UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpec build() {
            return new UserProfileUserSettingsKernelGatewayAppSettingsDefaultResourceSpec(instanceType, lifecycleConfigArn, sagemakerImageArn, sagemakerImageVersionArn);
        }
    }
}
