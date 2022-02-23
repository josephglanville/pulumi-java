// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.UserProfileResourceSpecInstanceType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserProfileResourceSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileResourceSpecArgs Empty = new UserProfileResourceSpecArgs();

    /**
     * The instance type that the image version runs on.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Input<UserProfileResourceSpecInstanceType> instanceType;

    public Input<UserProfileResourceSpecInstanceType> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * The ARN of the SageMaker image that the image version belongs to.
     * 
     */
    @InputImport(name="sageMakerImageArn")
      private final @Nullable Input<String> sageMakerImageArn;

    public Input<String> getSageMakerImageArn() {
        return this.sageMakerImageArn == null ? Input.empty() : this.sageMakerImageArn;
    }

    /**
     * The ARN of the image version created on the instance.
     * 
     */
    @InputImport(name="sageMakerImageVersionArn")
      private final @Nullable Input<String> sageMakerImageVersionArn;

    public Input<String> getSageMakerImageVersionArn() {
        return this.sageMakerImageVersionArn == null ? Input.empty() : this.sageMakerImageVersionArn;
    }

    public UserProfileResourceSpecArgs(
        @Nullable Input<UserProfileResourceSpecInstanceType> instanceType,
        @Nullable Input<String> sageMakerImageArn,
        @Nullable Input<String> sageMakerImageVersionArn) {
        this.instanceType = instanceType;
        this.sageMakerImageArn = sageMakerImageArn;
        this.sageMakerImageVersionArn = sageMakerImageVersionArn;
    }

    private UserProfileResourceSpecArgs() {
        this.instanceType = Input.empty();
        this.sageMakerImageArn = Input.empty();
        this.sageMakerImageVersionArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileResourceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<UserProfileResourceSpecInstanceType> instanceType;
        private @Nullable Input<String> sageMakerImageArn;
        private @Nullable Input<String> sageMakerImageVersionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileResourceSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.sageMakerImageArn = defaults.sageMakerImageArn;
    	      this.sageMakerImageVersionArn = defaults.sageMakerImageVersionArn;
        }

        public Builder setInstanceType(@Nullable Input<UserProfileResourceSpecInstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable UserProfileResourceSpecInstanceType instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder setSageMakerImageArn(@Nullable Input<String> sageMakerImageArn) {
            this.sageMakerImageArn = sageMakerImageArn;
            return this;
        }

        public Builder setSageMakerImageArn(@Nullable String sageMakerImageArn) {
            this.sageMakerImageArn = Input.ofNullable(sageMakerImageArn);
            return this;
        }

        public Builder setSageMakerImageVersionArn(@Nullable Input<String> sageMakerImageVersionArn) {
            this.sageMakerImageVersionArn = sageMakerImageVersionArn;
            return this;
        }

        public Builder setSageMakerImageVersionArn(@Nullable String sageMakerImageVersionArn) {
            this.sageMakerImageVersionArn = Input.ofNullable(sageMakerImageVersionArn);
            return this;
        }
        public UserProfileResourceSpecArgs build() {
            return new UserProfileResourceSpecArgs(instanceType, sageMakerImageArn, sageMakerImageVersionArn);
        }
    }
}
