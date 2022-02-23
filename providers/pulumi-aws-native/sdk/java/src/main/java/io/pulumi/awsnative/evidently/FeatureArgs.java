// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently;

import io.pulumi.awsnative.evidently.enums.FeatureEvaluationStrategy;
import io.pulumi.awsnative.evidently.inputs.FeatureEntityOverrideArgs;
import io.pulumi.awsnative.evidently.inputs.FeatureTagArgs;
import io.pulumi.awsnative.evidently.inputs.FeatureVariationObjectArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureArgs Empty = new FeatureArgs();

    @InputImport(name="defaultVariation")
      private final @Nullable Input<String> defaultVariation;

    public Input<String> getDefaultVariation() {
        return this.defaultVariation == null ? Input.empty() : this.defaultVariation;
    }

    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="entityOverrides")
      private final @Nullable Input<List<FeatureEntityOverrideArgs>> entityOverrides;

    public Input<List<FeatureEntityOverrideArgs>> getEntityOverrides() {
        return this.entityOverrides == null ? Input.empty() : this.entityOverrides;
    }

    @InputImport(name="evaluationStrategy")
      private final @Nullable Input<FeatureEvaluationStrategy> evaluationStrategy;

    public Input<FeatureEvaluationStrategy> getEvaluationStrategy() {
        return this.evaluationStrategy == null ? Input.empty() : this.evaluationStrategy;
    }

    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project", required=true)
      private final Input<String> project;

    public Input<String> getProject() {
        return this.project;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<FeatureTagArgs>> tags;

    public Input<List<FeatureTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="variations", required=true)
      private final Input<List<FeatureVariationObjectArgs>> variations;

    public Input<List<FeatureVariationObjectArgs>> getVariations() {
        return this.variations;
    }

    public FeatureArgs(
        @Nullable Input<String> defaultVariation,
        @Nullable Input<String> description,
        @Nullable Input<List<FeatureEntityOverrideArgs>> entityOverrides,
        @Nullable Input<FeatureEvaluationStrategy> evaluationStrategy,
        @Nullable Input<String> name,
        Input<String> project,
        @Nullable Input<List<FeatureTagArgs>> tags,
        Input<List<FeatureVariationObjectArgs>> variations) {
        this.defaultVariation = defaultVariation;
        this.description = description;
        this.entityOverrides = entityOverrides;
        this.evaluationStrategy = evaluationStrategy;
        this.name = name;
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.tags = tags;
        this.variations = Objects.requireNonNull(variations, "expected parameter 'variations' to be non-null");
    }

    private FeatureArgs() {
        this.defaultVariation = Input.empty();
        this.description = Input.empty();
        this.entityOverrides = Input.empty();
        this.evaluationStrategy = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.tags = Input.empty();
        this.variations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> defaultVariation;
        private @Nullable Input<String> description;
        private @Nullable Input<List<FeatureEntityOverrideArgs>> entityOverrides;
        private @Nullable Input<FeatureEvaluationStrategy> evaluationStrategy;
        private @Nullable Input<String> name;
        private Input<String> project;
        private @Nullable Input<List<FeatureTagArgs>> tags;
        private Input<List<FeatureVariationObjectArgs>> variations;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultVariation = defaults.defaultVariation;
    	      this.description = defaults.description;
    	      this.entityOverrides = defaults.entityOverrides;
    	      this.evaluationStrategy = defaults.evaluationStrategy;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.tags = defaults.tags;
    	      this.variations = defaults.variations;
        }

        public Builder setDefaultVariation(@Nullable Input<String> defaultVariation) {
            this.defaultVariation = defaultVariation;
            return this;
        }

        public Builder setDefaultVariation(@Nullable String defaultVariation) {
            this.defaultVariation = Input.ofNullable(defaultVariation);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEntityOverrides(@Nullable Input<List<FeatureEntityOverrideArgs>> entityOverrides) {
            this.entityOverrides = entityOverrides;
            return this;
        }

        public Builder setEntityOverrides(@Nullable List<FeatureEntityOverrideArgs> entityOverrides) {
            this.entityOverrides = Input.ofNullable(entityOverrides);
            return this;
        }

        public Builder setEvaluationStrategy(@Nullable Input<FeatureEvaluationStrategy> evaluationStrategy) {
            this.evaluationStrategy = evaluationStrategy;
            return this;
        }

        public Builder setEvaluationStrategy(@Nullable FeatureEvaluationStrategy evaluationStrategy) {
            this.evaluationStrategy = Input.ofNullable(evaluationStrategy);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(Input<String> project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Input.of(Objects.requireNonNull(project));
            return this;
        }

        public Builder setTags(@Nullable Input<List<FeatureTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<FeatureTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVariations(Input<List<FeatureVariationObjectArgs>> variations) {
            this.variations = Objects.requireNonNull(variations);
            return this;
        }

        public Builder setVariations(List<FeatureVariationObjectArgs> variations) {
            this.variations = Input.of(Objects.requireNonNull(variations));
            return this;
        }
        public FeatureArgs build() {
            return new FeatureArgs(defaultVariation, description, entityOverrides, evaluationStrategy, name, project, tags, variations);
        }
    }
}
