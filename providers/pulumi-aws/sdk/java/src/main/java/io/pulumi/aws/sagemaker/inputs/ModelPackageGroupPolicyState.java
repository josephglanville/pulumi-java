// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelPackageGroupPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ModelPackageGroupPolicyState Empty = new ModelPackageGroupPolicyState();

    /**
     * The name of the model package group.
     * 
     */
    @Import(name="modelPackageGroupName")
      private final @Nullable Output<String> modelPackageGroupName;

    public Output<String> getModelPackageGroupName() {
        return this.modelPackageGroupName == null ? Output.empty() : this.modelPackageGroupName;
    }

    @Import(name="resourcePolicy")
      private final @Nullable Output<String> resourcePolicy;

    public Output<String> getResourcePolicy() {
        return this.resourcePolicy == null ? Output.empty() : this.resourcePolicy;
    }

    public ModelPackageGroupPolicyState(
        @Nullable Output<String> modelPackageGroupName,
        @Nullable Output<String> resourcePolicy) {
        this.modelPackageGroupName = modelPackageGroupName;
        this.resourcePolicy = resourcePolicy;
    }

    private ModelPackageGroupPolicyState() {
        this.modelPackageGroupName = Output.empty();
        this.resourcePolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelPackageGroupPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> modelPackageGroupName;
        private @Nullable Output<String> resourcePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelPackageGroupPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modelPackageGroupName = defaults.modelPackageGroupName;
    	      this.resourcePolicy = defaults.resourcePolicy;
        }

        public Builder modelPackageGroupName(@Nullable Output<String> modelPackageGroupName) {
            this.modelPackageGroupName = modelPackageGroupName;
            return this;
        }
        public Builder modelPackageGroupName(@Nullable String modelPackageGroupName) {
            this.modelPackageGroupName = Output.ofNullable(modelPackageGroupName);
            return this;
        }
        public Builder resourcePolicy(@Nullable Output<String> resourcePolicy) {
            this.resourcePolicy = resourcePolicy;
            return this;
        }
        public Builder resourcePolicy(@Nullable String resourcePolicy) {
            this.resourcePolicy = Output.ofNullable(resourcePolicy);
            return this;
        }        public ModelPackageGroupPolicyState build() {
            return new ModelPackageGroupPolicyState(modelPackageGroupName, resourcePolicy);
        }
    }
}