// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IndexValueImportanceItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final IndexValueImportanceItemArgs Empty = new IndexValueImportanceItemArgs();

    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    @Import(name="value")
      private final @Nullable Output<Integer> value;

    public Output<Integer> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public IndexValueImportanceItemArgs(
        @Nullable Output<String> key,
        @Nullable Output<Integer> value) {
        this.key = key;
        this.value = value;
    }

    private IndexValueImportanceItemArgs() {
        this.key = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexValueImportanceItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private @Nullable Output<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexValueImportanceItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder value(@Nullable Output<Integer> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable Integer value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public IndexValueImportanceItemArgs build() {
            return new IndexValueImportanceItemArgs(key, value);
        }
    }
}
