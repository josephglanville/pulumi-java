// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.outputs;

import io.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValue;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTerm {
    /**
     * The operator to use in the condition.
     * 
     */
    private final @Nullable String comparator;
    /**
     * The tag key to use in the condition.
     * 
     */
    private final @Nullable String key;
    /**
     * The tag keys or tag key and value pairs to use in the condition.
     * 
     */
    private final @Nullable List<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValue> tagValues;
    /**
     * The type of object to apply the condition to.
     * 
     */
    private final @Nullable String target;

    @OutputCustomType.Constructor
    private ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTerm(
        @OutputCustomType.Parameter("comparator") @Nullable String comparator,
        @OutputCustomType.Parameter("key") @Nullable String key,
        @OutputCustomType.Parameter("tagValues") @Nullable List<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValue> tagValues,
        @OutputCustomType.Parameter("target") @Nullable String target) {
        this.comparator = comparator;
        this.key = key;
        this.tagValues = tagValues;
        this.target = target;
    }

    /**
     * The operator to use in the condition.
     * 
    */
    public Optional<String> getComparator() {
        return Optional.ofNullable(this.comparator);
    }
    /**
     * The tag key to use in the condition.
     * 
    */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * The tag keys or tag key and value pairs to use in the condition.
     * 
    */
    public List<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValue> getTagValues() {
        return this.tagValues == null ? List.of() : this.tagValues;
    }
    /**
     * The type of object to apply the condition to.
     * 
    */
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTerm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comparator;
        private @Nullable String key;
        private @Nullable List<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValue> tagValues;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTerm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparator = defaults.comparator;
    	      this.key = defaults.key;
    	      this.tagValues = defaults.tagValues;
    	      this.target = defaults.target;
        }

        public Builder setComparator(@Nullable String comparator) {
            this.comparator = comparator;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setTagValues(@Nullable List<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValue> tagValues) {
            this.tagValues = tagValues;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }
        public ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTerm build() {
            return new ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTerm(comparator, key, tagValues, target);
        }
    }
}
