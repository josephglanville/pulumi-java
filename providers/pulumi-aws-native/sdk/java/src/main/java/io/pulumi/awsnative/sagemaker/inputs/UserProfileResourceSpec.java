// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.UserProfileResourceSpecInstanceType;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserProfileResourceSpec extends io.pulumi.resources.InvokeArgs {

    public static final UserProfileResourceSpec Empty = new UserProfileResourceSpec();

    /**
     * The instance type that the image version runs on.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable UserProfileResourceSpecInstanceType instanceType;

    public Optional<UserProfileResourceSpecInstanceType> getInstanceType() {
        return this.instanceType == null ? Optional.empty() : Optional.ofNullable(this.instanceType);
    }

    /**
     * The ARN of the SageMaker image that the image version belongs to.
     * 
     */
    @Import(name="sageMakerImageArn")
      private final @Nullable String sageMakerImageArn;

    public Optional<String> getSageMakerImageArn() {
        return this.sageMakerImageArn == null ? Optional.empty() : Optional.ofNullable(this.sageMakerImageArn);
    }

    /**
     * The ARN of the image version created on the instance.
     * 
     */
    @Import(name="sageMakerImageVersionArn")
      private final @Nullable String sageMakerImageVersionArn;

    public Optional<String> getSageMakerImageVersionArn() {
        return this.sageMakerImageVersionArn == null ? Optional.empty() : Optional.ofNullable(this.sageMakerImageVersionArn);
    }

    public UserProfileResourceSpec(
        @Nullable UserProfileResourceSpecInstanceType instanceType,
        @Nullable String sageMakerImageArn,
        @Nullable String sageMakerImageVersionArn) {
        this.instanceType = instanceType;
        this.sageMakerImageArn = sageMakerImageArn;
        this.sageMakerImageVersionArn = sageMakerImageVersionArn;
    }

    private UserProfileResourceSpec() {
        this.instanceType = null;
        this.sageMakerImageArn = null;
        this.sageMakerImageVersionArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileResourceSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable UserProfileResourceSpecInstanceType instanceType;
        private @Nullable String sageMakerImageArn;
        private @Nullable String sageMakerImageVersionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileResourceSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.sageMakerImageArn = defaults.sageMakerImageArn;
    	      this.sageMakerImageVersionArn = defaults.sageMakerImageVersionArn;
        }

        public Builder instanceType(@Nullable UserProfileResourceSpecInstanceType instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder sageMakerImageArn(@Nullable String sageMakerImageArn) {
            this.sageMakerImageArn = sageMakerImageArn;
            return this;
        }
        public Builder sageMakerImageVersionArn(@Nullable String sageMakerImageVersionArn) {
            this.sageMakerImageVersionArn = sageMakerImageVersionArn;
            return this;
        }        public UserProfileResourceSpec build() {
            return new UserProfileResourceSpec(instanceType, sageMakerImageArn, sageMakerImageVersionArn);
        }
    }
}
