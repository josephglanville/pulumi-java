// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelPackageGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelPackageGroupArgs Empty = new ModelPackageGroupArgs();

    /**
     * A description for the model group.
     * 
     */
    @Import(name="modelPackageGroupDescription")
      private final @Nullable Output<String> modelPackageGroupDescription;

    public Output<String> getModelPackageGroupDescription() {
        return this.modelPackageGroupDescription == null ? Output.empty() : this.modelPackageGroupDescription;
    }

    /**
     * The name of the model group.
     * 
     */
    @Import(name="modelPackageGroupName", required=true)
      private final Output<String> modelPackageGroupName;

    public Output<String> getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ModelPackageGroupArgs(
        @Nullable Output<String> modelPackageGroupDescription,
        Output<String> modelPackageGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.modelPackageGroupDescription = modelPackageGroupDescription;
        this.modelPackageGroupName = Objects.requireNonNull(modelPackageGroupName, "expected parameter 'modelPackageGroupName' to be non-null");
        this.tags = tags;
    }

    private ModelPackageGroupArgs() {
        this.modelPackageGroupDescription = Output.empty();
        this.modelPackageGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelPackageGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> modelPackageGroupDescription;
        private Output<String> modelPackageGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelPackageGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modelPackageGroupDescription = defaults.modelPackageGroupDescription;
    	      this.modelPackageGroupName = defaults.modelPackageGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder modelPackageGroupDescription(@Nullable Output<String> modelPackageGroupDescription) {
            this.modelPackageGroupDescription = modelPackageGroupDescription;
            return this;
        }
        public Builder modelPackageGroupDescription(@Nullable String modelPackageGroupDescription) {
            this.modelPackageGroupDescription = Output.ofNullable(modelPackageGroupDescription);
            return this;
        }
        public Builder modelPackageGroupName(Output<String> modelPackageGroupName) {
            this.modelPackageGroupName = Objects.requireNonNull(modelPackageGroupName);
            return this;
        }
        public Builder modelPackageGroupName(String modelPackageGroupName) {
            this.modelPackageGroupName = Output.of(Objects.requireNonNull(modelPackageGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ModelPackageGroupArgs build() {
            return new ModelPackageGroupArgs(modelPackageGroupDescription, modelPackageGroupName, tags);
        }
    }
}
