// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskExcludesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskExcludesGetArgs Empty = new TaskExcludesGetArgs();

    /**
     * The type of filter rule to apply. Valid values: `SIMPLE_PATTERN`.
     * 
     */
    @Import(name="filterType")
      private final @Nullable Output<String> filterType;

    public Output<String> getFilterType() {
        return this.filterType == null ? Codegen.empty() : this.filterType;
    }

    /**
     * A single filter string that consists of the patterns to include or exclude. The patterns are delimited by "|" (that is, a pipe), for example: `/folder1|/folder2`
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public TaskExcludesGetArgs(
        @Nullable Output<String> filterType,
        @Nullable Output<String> value) {
        this.filterType = filterType;
        this.value = value;
    }

    private TaskExcludesGetArgs() {
        this.filterType = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskExcludesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> filterType;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskExcludesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterType = defaults.filterType;
    	      this.value = defaults.value;
        }

        public Builder filterType(@Nullable Output<String> filterType) {
            this.filterType = filterType;
            return this;
        }
        public Builder filterType(@Nullable String filterType) {
            this.filterType = Codegen.ofNullable(filterType);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public TaskExcludesGetArgs build() {
            return new TaskExcludesGetArgs(filterType, value);
        }
    }
}
