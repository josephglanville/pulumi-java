// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs Empty = new DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs();

    /**
     * The instance type that the image version runs on.. For valid values see [Sagemaker Instance Types](https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html).
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     * 
     */
    @Import(name="lifecycleConfigArn")
      private final @Nullable Output<String> lifecycleConfigArn;

    public Output<String> getLifecycleConfigArn() {
        return this.lifecycleConfigArn == null ? Codegen.empty() : this.lifecycleConfigArn;
    }

    /**
     * The ARN of the SageMaker image that the image version belongs to.
     * 
     */
    @Import(name="sagemakerImageArn")
      private final @Nullable Output<String> sagemakerImageArn;

    public Output<String> getSagemakerImageArn() {
        return this.sagemakerImageArn == null ? Codegen.empty() : this.sagemakerImageArn;
    }

    /**
     * The ARN of the image version created on the instance.
     * 
     */
    @Import(name="sagemakerImageVersionArn")
      private final @Nullable Output<String> sagemakerImageVersionArn;

    public Output<String> getSagemakerImageVersionArn() {
        return this.sagemakerImageVersionArn == null ? Codegen.empty() : this.sagemakerImageVersionArn;
    }

    public DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs(
        @Nullable Output<String> instanceType,
        @Nullable Output<String> lifecycleConfigArn,
        @Nullable Output<String> sagemakerImageArn,
        @Nullable Output<String> sagemakerImageVersionArn) {
        this.instanceType = instanceType;
        this.lifecycleConfigArn = lifecycleConfigArn;
        this.sagemakerImageArn = sagemakerImageArn;
        this.sagemakerImageVersionArn = sagemakerImageVersionArn;
    }

    private DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs() {
        this.instanceType = Codegen.empty();
        this.lifecycleConfigArn = Codegen.empty();
        this.sagemakerImageArn = Codegen.empty();
        this.sagemakerImageVersionArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceType;
        private @Nullable Output<String> lifecycleConfigArn;
        private @Nullable Output<String> sagemakerImageArn;
        private @Nullable Output<String> sagemakerImageVersionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.lifecycleConfigArn = defaults.lifecycleConfigArn;
    	      this.sagemakerImageArn = defaults.sagemakerImageArn;
    	      this.sagemakerImageVersionArn = defaults.sagemakerImageVersionArn;
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }
        public Builder lifecycleConfigArn(@Nullable Output<String> lifecycleConfigArn) {
            this.lifecycleConfigArn = lifecycleConfigArn;
            return this;
        }
        public Builder lifecycleConfigArn(@Nullable String lifecycleConfigArn) {
            this.lifecycleConfigArn = Codegen.ofNullable(lifecycleConfigArn);
            return this;
        }
        public Builder sagemakerImageArn(@Nullable Output<String> sagemakerImageArn) {
            this.sagemakerImageArn = sagemakerImageArn;
            return this;
        }
        public Builder sagemakerImageArn(@Nullable String sagemakerImageArn) {
            this.sagemakerImageArn = Codegen.ofNullable(sagemakerImageArn);
            return this;
        }
        public Builder sagemakerImageVersionArn(@Nullable Output<String> sagemakerImageVersionArn) {
            this.sagemakerImageVersionArn = sagemakerImageVersionArn;
            return this;
        }
        public Builder sagemakerImageVersionArn(@Nullable String sagemakerImageVersionArn) {
            this.sagemakerImageVersionArn = Codegen.ofNullable(sagemakerImageVersionArn);
            return this;
        }        public DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs build() {
            return new DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs(instanceType, lifecycleConfigArn, sagemakerImageArn, sagemakerImageVersionArn);
        }
    }
}
