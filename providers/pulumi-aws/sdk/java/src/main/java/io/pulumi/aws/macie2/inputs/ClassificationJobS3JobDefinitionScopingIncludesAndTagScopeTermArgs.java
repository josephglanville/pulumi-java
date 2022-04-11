// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs Empty = new ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs();

    /**
     * The operator to use in the condition.
     * 
     */
    @Import(name="comparator")
      private final @Nullable Output<String> comparator;

    public Output<String> getComparator() {
        return this.comparator == null ? Codegen.empty() : this.comparator;
    }

    /**
     * The tag key to use in the condition.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * The tag keys or tag key and value pairs to use in the condition.
     * 
     */
    @Import(name="tagValues")
      private final @Nullable Output<List<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs>> tagValues;

    public Output<List<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs>> getTagValues() {
        return this.tagValues == null ? Codegen.empty() : this.tagValues;
    }

    /**
     * The type of object to apply the condition to.
     * 
     */
    @Import(name="target")
      private final @Nullable Output<String> target;

    public Output<String> getTarget() {
        return this.target == null ? Codegen.empty() : this.target;
    }

    public ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs(
        @Nullable Output<String> comparator,
        @Nullable Output<String> key,
        @Nullable Output<List<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs>> tagValues,
        @Nullable Output<String> target) {
        this.comparator = comparator;
        this.key = key;
        this.tagValues = tagValues;
        this.target = target;
    }

    private ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs() {
        this.comparator = Codegen.empty();
        this.key = Codegen.empty();
        this.tagValues = Codegen.empty();
        this.target = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comparator;
        private @Nullable Output<String> key;
        private @Nullable Output<List<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs>> tagValues;
        private @Nullable Output<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparator = defaults.comparator;
    	      this.key = defaults.key;
    	      this.tagValues = defaults.tagValues;
    	      this.target = defaults.target;
        }

        public Builder comparator(@Nullable Output<String> comparator) {
            this.comparator = comparator;
            return this;
        }
        public Builder comparator(@Nullable String comparator) {
            this.comparator = Codegen.ofNullable(comparator);
            return this;
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder tagValues(@Nullable Output<List<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs>> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public Builder tagValues(@Nullable List<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs> tagValues) {
            this.tagValues = Codegen.ofNullable(tagValues);
            return this;
        }
        public Builder tagValues(ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs... tagValues) {
            return tagValues(List.of(tagValues));
        }
        public Builder target(@Nullable Output<String> target) {
            this.target = target;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = Codegen.ofNullable(target);
            return this;
        }        public ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs build() {
            return new ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermArgs(comparator, key, tagValues, target);
        }
    }
}
