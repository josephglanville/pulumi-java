// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionStoredInfoTypeRegexArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeRegexArgs Empty = new PreventionStoredInfoTypeRegexArgs();

    /**
     * The index of the submatch to extract as findings. When not specified, the entire match is returned. No more than 3 may be included.
     * 
     */
    @InputImport(name="groupIndexes")
      private final @Nullable Output<List<Integer>> groupIndexes;

    public Output<List<Integer>> getGroupIndexes() {
        return this.groupIndexes == null ? Output.empty() : this.groupIndexes;
    }

    /**
     * Pattern defining the regular expression.
     * Its syntax (https://github.com/google/re2/wiki/Syntax) can be found under the google/re2 repository on GitHub.
     * 
     */
    @InputImport(name="pattern", required=true)
      private final Output<String> pattern;

    public Output<String> getPattern() {
        return this.pattern;
    }

    public PreventionStoredInfoTypeRegexArgs(
        @Nullable Output<List<Integer>> groupIndexes,
        Output<String> pattern) {
        this.groupIndexes = groupIndexes;
        this.pattern = Objects.requireNonNull(pattern, "expected parameter 'pattern' to be non-null");
    }

    private PreventionStoredInfoTypeRegexArgs() {
        this.groupIndexes = Output.empty();
        this.pattern = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeRegexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Integer>> groupIndexes;
        private Output<String> pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeRegexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIndexes = defaults.groupIndexes;
    	      this.pattern = defaults.pattern;
        }

        public Builder groupIndexes(@Nullable Output<List<Integer>> groupIndexes) {
            this.groupIndexes = groupIndexes;
            return this;
        }

        public Builder groupIndexes(@Nullable List<Integer> groupIndexes) {
            this.groupIndexes = Output.ofNullable(groupIndexes);
            return this;
        }

        public Builder pattern(Output<String> pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }

        public Builder pattern(String pattern) {
            this.pattern = Output.of(Objects.requireNonNull(pattern));
            return this;
        }
        public PreventionStoredInfoTypeRegexArgs build() {
            return new PreventionStoredInfoTypeRegexArgs(groupIndexes, pattern);
        }
    }
}
