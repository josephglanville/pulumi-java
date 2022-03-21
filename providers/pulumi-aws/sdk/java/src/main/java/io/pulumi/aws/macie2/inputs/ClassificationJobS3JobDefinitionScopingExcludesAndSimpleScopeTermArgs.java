// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermArgs Empty = new ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermArgs();

    /**
     * The operator to use in a condition. Valid values are: `EQ`, `GT`, `GTE`, `LT`, `LTE`, `NE`, `CONTAINS`, `STARTS_WITH`
     * 
     */
    @Import(name="comparator")
      private final @Nullable Output<String> comparator;

    public Output<String> getComparator() {
        return this.comparator == null ? Output.empty() : this.comparator;
    }

    /**
     * The object property to use in the condition.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * An array that lists the values to use in the condition.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values == null ? Output.empty() : this.values;
    }

    public ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermArgs(
        @Nullable Output<String> comparator,
        @Nullable Output<String> key,
        @Nullable Output<List<String>> values) {
        this.comparator = comparator;
        this.key = key;
        this.values = values;
    }

    private ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermArgs() {
        this.comparator = Output.empty();
        this.key = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comparator;
        private @Nullable Output<String> key;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparator = defaults.comparator;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder comparator(@Nullable Output<String> comparator) {
            this.comparator = comparator;
            return this;
        }
        public Builder comparator(@Nullable String comparator) {
            this.comparator = Output.ofNullable(comparator);
            return this;
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }
        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = Output.ofNullable(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermArgs build() {
            return new ClassificationJobS3JobDefinitionScopingExcludesAndSimpleScopeTermArgs(comparator, key, values);
        }
    }
}
