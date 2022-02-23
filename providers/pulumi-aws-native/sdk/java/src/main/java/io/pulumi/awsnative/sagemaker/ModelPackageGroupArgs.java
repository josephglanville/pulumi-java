// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.sagemaker.inputs.ModelPackageGroupTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelPackageGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelPackageGroupArgs Empty = new ModelPackageGroupArgs();

    @InputImport(name="modelPackageGroupDescription")
      private final @Nullable Input<String> modelPackageGroupDescription;

    public Input<String> getModelPackageGroupDescription() {
        return this.modelPackageGroupDescription == null ? Input.empty() : this.modelPackageGroupDescription;
    }

    @InputImport(name="modelPackageGroupName")
      private final @Nullable Input<String> modelPackageGroupName;

    public Input<String> getModelPackageGroupName() {
        return this.modelPackageGroupName == null ? Input.empty() : this.modelPackageGroupName;
    }

    @InputImport(name="modelPackageGroupPolicy")
      private final @Nullable Input<Object> modelPackageGroupPolicy;

    public Input<Object> getModelPackageGroupPolicy() {
        return this.modelPackageGroupPolicy == null ? Input.empty() : this.modelPackageGroupPolicy;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<ModelPackageGroupTagArgs>> tags;

    public Input<List<ModelPackageGroupTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ModelPackageGroupArgs(
        @Nullable Input<String> modelPackageGroupDescription,
        @Nullable Input<String> modelPackageGroupName,
        @Nullable Input<Object> modelPackageGroupPolicy,
        @Nullable Input<List<ModelPackageGroupTagArgs>> tags) {
        this.modelPackageGroupDescription = modelPackageGroupDescription;
        this.modelPackageGroupName = modelPackageGroupName;
        this.modelPackageGroupPolicy = modelPackageGroupPolicy;
        this.tags = tags;
    }

    private ModelPackageGroupArgs() {
        this.modelPackageGroupDescription = Input.empty();
        this.modelPackageGroupName = Input.empty();
        this.modelPackageGroupPolicy = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelPackageGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> modelPackageGroupDescription;
        private @Nullable Input<String> modelPackageGroupName;
        private @Nullable Input<Object> modelPackageGroupPolicy;
        private @Nullable Input<List<ModelPackageGroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelPackageGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modelPackageGroupDescription = defaults.modelPackageGroupDescription;
    	      this.modelPackageGroupName = defaults.modelPackageGroupName;
    	      this.modelPackageGroupPolicy = defaults.modelPackageGroupPolicy;
    	      this.tags = defaults.tags;
        }

        public Builder setModelPackageGroupDescription(@Nullable Input<String> modelPackageGroupDescription) {
            this.modelPackageGroupDescription = modelPackageGroupDescription;
            return this;
        }

        public Builder setModelPackageGroupDescription(@Nullable String modelPackageGroupDescription) {
            this.modelPackageGroupDescription = Input.ofNullable(modelPackageGroupDescription);
            return this;
        }

        public Builder setModelPackageGroupName(@Nullable Input<String> modelPackageGroupName) {
            this.modelPackageGroupName = modelPackageGroupName;
            return this;
        }

        public Builder setModelPackageGroupName(@Nullable String modelPackageGroupName) {
            this.modelPackageGroupName = Input.ofNullable(modelPackageGroupName);
            return this;
        }

        public Builder setModelPackageGroupPolicy(@Nullable Input<Object> modelPackageGroupPolicy) {
            this.modelPackageGroupPolicy = modelPackageGroupPolicy;
            return this;
        }

        public Builder setModelPackageGroupPolicy(@Nullable Object modelPackageGroupPolicy) {
            this.modelPackageGroupPolicy = Input.ofNullable(modelPackageGroupPolicy);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ModelPackageGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ModelPackageGroupTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ModelPackageGroupArgs build() {
            return new ModelPackageGroupArgs(modelPackageGroupDescription, modelPackageGroupName, modelPackageGroupPolicy, tags);
        }
    }
}
