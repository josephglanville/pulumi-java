// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.DomainResourceSpecInstanceType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainResourceSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainResourceSpecArgs Empty = new DomainResourceSpecArgs();

    /**
     * The instance type that the image version runs on.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Output<DomainResourceSpecInstanceType> instanceType;

    public Output<DomainResourceSpecInstanceType> getInstanceType() {
        return this.instanceType == null ? Output.empty() : this.instanceType;
    }

    /**
     * The ARN of the SageMaker image that the image version belongs to.
     * 
     */
    @InputImport(name="sageMakerImageArn")
      private final @Nullable Output<String> sageMakerImageArn;

    public Output<String> getSageMakerImageArn() {
        return this.sageMakerImageArn == null ? Output.empty() : this.sageMakerImageArn;
    }

    /**
     * The ARN of the image version created on the instance.
     * 
     */
    @InputImport(name="sageMakerImageVersionArn")
      private final @Nullable Output<String> sageMakerImageVersionArn;

    public Output<String> getSageMakerImageVersionArn() {
        return this.sageMakerImageVersionArn == null ? Output.empty() : this.sageMakerImageVersionArn;
    }

    public DomainResourceSpecArgs(
        @Nullable Output<DomainResourceSpecInstanceType> instanceType,
        @Nullable Output<String> sageMakerImageArn,
        @Nullable Output<String> sageMakerImageVersionArn) {
        this.instanceType = instanceType;
        this.sageMakerImageArn = sageMakerImageArn;
        this.sageMakerImageVersionArn = sageMakerImageVersionArn;
    }

    private DomainResourceSpecArgs() {
        this.instanceType = Output.empty();
        this.sageMakerImageArn = Output.empty();
        this.sageMakerImageVersionArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainResourceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DomainResourceSpecInstanceType> instanceType;
        private @Nullable Output<String> sageMakerImageArn;
        private @Nullable Output<String> sageMakerImageVersionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainResourceSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.sageMakerImageArn = defaults.sageMakerImageArn;
    	      this.sageMakerImageVersionArn = defaults.sageMakerImageVersionArn;
        }

        public Builder instanceType(@Nullable Output<DomainResourceSpecInstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable DomainResourceSpecInstanceType instanceType) {
            this.instanceType = Output.ofNullable(instanceType);
            return this;
        }

        public Builder sageMakerImageArn(@Nullable Output<String> sageMakerImageArn) {
            this.sageMakerImageArn = sageMakerImageArn;
            return this;
        }

        public Builder sageMakerImageArn(@Nullable String sageMakerImageArn) {
            this.sageMakerImageArn = Output.ofNullable(sageMakerImageArn);
            return this;
        }

        public Builder sageMakerImageVersionArn(@Nullable Output<String> sageMakerImageVersionArn) {
            this.sageMakerImageVersionArn = sageMakerImageVersionArn;
            return this;
        }

        public Builder sageMakerImageVersionArn(@Nullable String sageMakerImageVersionArn) {
            this.sageMakerImageVersionArn = Output.ofNullable(sageMakerImageVersionArn);
            return this;
        }
        public DomainResourceSpecArgs build() {
            return new DomainResourceSpecArgs(instanceType, sageMakerImageArn, sageMakerImageVersionArn);
        }
    }
}
