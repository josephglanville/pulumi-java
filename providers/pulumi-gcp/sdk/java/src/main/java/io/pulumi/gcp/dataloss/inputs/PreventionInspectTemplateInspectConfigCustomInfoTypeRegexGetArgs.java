// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs Empty = new PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs();

    /**
     * The index of the submatch to extract as findings. When not specified, the entire match is returned. No more than 3 may be included.
     * 
     */
    @InputImport(name="groupIndexes")
      private final @Nullable Input<List<Integer>> groupIndexes;

    public Input<List<Integer>> getGroupIndexes() {
        return this.groupIndexes == null ? Input.empty() : this.groupIndexes;
    }

    /**
     * Pattern defining the regular expression.
     * Its syntax (https://github.com/google/re2/wiki/Syntax) can be found under the google/re2 repository on GitHub.
     * 
     */
    @InputImport(name="pattern", required=true)
      private final Input<String> pattern;

    public Input<String> getPattern() {
        return this.pattern;
    }

    public PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs(
        @Nullable Input<List<Integer>> groupIndexes,
        Input<String> pattern) {
        this.groupIndexes = groupIndexes;
        this.pattern = Objects.requireNonNull(pattern, "expected parameter 'pattern' to be non-null");
    }

    private PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs() {
        this.groupIndexes = Input.empty();
        this.pattern = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Integer>> groupIndexes;
        private Input<String> pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIndexes = defaults.groupIndexes;
    	      this.pattern = defaults.pattern;
        }

        public Builder setGroupIndexes(@Nullable Input<List<Integer>> groupIndexes) {
            this.groupIndexes = groupIndexes;
            return this;
        }

        public Builder setGroupIndexes(@Nullable List<Integer> groupIndexes) {
            this.groupIndexes = Input.ofNullable(groupIndexes);
            return this;
        }

        public Builder setPattern(Input<String> pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }

        public Builder setPattern(String pattern) {
            this.pattern = Input.of(Objects.requireNonNull(pattern));
            return this;
        }
        public PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs build() {
            return new PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs(groupIndexes, pattern);
        }
    }
}
