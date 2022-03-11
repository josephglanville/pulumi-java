// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message defining a custom regular expression.
 * 
 */
public final class GooglePrivacyDlpV2RegexArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2RegexArgs Empty = new GooglePrivacyDlpV2RegexArgs();

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
     * Pattern defining the regular expression. Its syntax (https://github.com/google/re2/wiki/Syntax) can be found under the google/re2 repository on GitHub.
     * 
     */
    @InputImport(name="pattern")
      private final @Nullable Output<String> pattern;

    public Output<String> getPattern() {
        return this.pattern == null ? Output.empty() : this.pattern;
    }

    public GooglePrivacyDlpV2RegexArgs(
        @Nullable Output<List<Integer>> groupIndexes,
        @Nullable Output<String> pattern) {
        this.groupIndexes = groupIndexes;
        this.pattern = pattern;
    }

    private GooglePrivacyDlpV2RegexArgs() {
        this.groupIndexes = Output.empty();
        this.pattern = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RegexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Integer>> groupIndexes;
        private @Nullable Output<String> pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RegexArgs defaults) {
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

        public Builder pattern(@Nullable Output<String> pattern) {
            this.pattern = pattern;
            return this;
        }

        public Builder pattern(@Nullable String pattern) {
            this.pattern = Output.ofNullable(pattern);
            return this;
        }
        public GooglePrivacyDlpV2RegexArgs build() {
            return new GooglePrivacyDlpV2RegexArgs(groupIndexes, pattern);
        }
    }
}
