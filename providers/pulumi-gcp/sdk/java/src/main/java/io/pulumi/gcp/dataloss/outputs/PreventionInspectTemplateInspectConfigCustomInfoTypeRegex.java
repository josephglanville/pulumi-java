// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PreventionInspectTemplateInspectConfigCustomInfoTypeRegex {
    /**
     * The index of the submatch to extract as findings. When not specified, the entire match is returned. No more than 3 may be included.
     * 
     */
    private final @Nullable List<Integer> groupIndexes;
    /**
     * Pattern defining the regular expression.
     * Its syntax (https://github.com/google/re2/wiki/Syntax) can be found under the google/re2 repository on GitHub.
     * 
     */
    private final String pattern;

    @CustomType.Constructor
    private PreventionInspectTemplateInspectConfigCustomInfoTypeRegex(
        @CustomType.Parameter("groupIndexes") @Nullable List<Integer> groupIndexes,
        @CustomType.Parameter("pattern") String pattern) {
        this.groupIndexes = groupIndexes;
        this.pattern = pattern;
    }

    /**
     * The index of the submatch to extract as findings. When not specified, the entire match is returned. No more than 3 may be included.
     * 
    */
    public List<Integer> getGroupIndexes() {
        return this.groupIndexes == null ? List.of() : this.groupIndexes;
    }
    /**
     * Pattern defining the regular expression.
     * Its syntax (https://github.com/google/re2/wiki/Syntax) can be found under the google/re2 repository on GitHub.
     * 
    */
    public String getPattern() {
        return this.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigCustomInfoTypeRegex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Integer> groupIndexes;
        private String pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigCustomInfoTypeRegex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIndexes = defaults.groupIndexes;
    	      this.pattern = defaults.pattern;
        }

        public Builder groupIndexes(@Nullable List<Integer> groupIndexes) {
            this.groupIndexes = groupIndexes;
            return this;
        }
        public Builder groupIndexes(Integer... groupIndexes) {
            return groupIndexes(List.of(groupIndexes));
        }
        public Builder pattern(String pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }        public PreventionInspectTemplateInspectConfigCustomInfoTypeRegex build() {
            return new PreventionInspectTemplateInspectConfigCustomInfoTypeRegex(groupIndexes, pattern);
        }
    }
}
