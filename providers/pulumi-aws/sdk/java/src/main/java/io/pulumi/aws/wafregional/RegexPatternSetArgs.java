// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegexPatternSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegexPatternSetArgs Empty = new RegexPatternSetArgs();

    /**
     * The name or description of the Regex Pattern Set.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
     * 
     */
    @InputImport(name="regexPatternStrings")
      private final @Nullable Output<List<String>> regexPatternStrings;

    public Output<List<String>> getRegexPatternStrings() {
        return this.regexPatternStrings == null ? Output.empty() : this.regexPatternStrings;
    }

    public RegexPatternSetArgs(
        @Nullable Output<String> name,
        @Nullable Output<List<String>> regexPatternStrings) {
        this.name = name;
        this.regexPatternStrings = regexPatternStrings;
    }

    private RegexPatternSetArgs() {
        this.name = Output.empty();
        this.regexPatternStrings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexPatternSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> regexPatternStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexPatternSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.regexPatternStrings = defaults.regexPatternStrings;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder regexPatternStrings(@Nullable Output<List<String>> regexPatternStrings) {
            this.regexPatternStrings = regexPatternStrings;
            return this;
        }

        public Builder regexPatternStrings(@Nullable List<String> regexPatternStrings) {
            this.regexPatternStrings = Output.ofNullable(regexPatternStrings);
            return this;
        }
        public RegexPatternSetArgs build() {
            return new RegexPatternSetArgs(name, regexPatternStrings);
        }
    }
}
