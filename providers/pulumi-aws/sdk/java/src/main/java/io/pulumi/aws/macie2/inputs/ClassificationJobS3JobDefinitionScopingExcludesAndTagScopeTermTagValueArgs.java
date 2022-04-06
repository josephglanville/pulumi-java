// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs Empty = new ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs();

    /**
     * The object property to use in the condition.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs(
        @Nullable Output<String> key,
        @Nullable Output<String> value) {
        this.key = key;
        this.value = value;
    }

    private ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs() {
        this.key = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }        public ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs build() {
            return new ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs(key, value);
        }
    }
}