// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.RegexMatchSetRegexMatchTupleGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegexMatchSetState extends io.pulumi.resources.ResourceArgs {

    public static final RegexMatchSetState Empty = new RegexMatchSetState();

    /**
     * The name or description of the Regex Match Set.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
     * 
     */
    @Import(name="regexMatchTuples")
      private final @Nullable Output<List<RegexMatchSetRegexMatchTupleGetArgs>> regexMatchTuples;

    public Output<List<RegexMatchSetRegexMatchTupleGetArgs>> getRegexMatchTuples() {
        return this.regexMatchTuples == null ? Output.empty() : this.regexMatchTuples;
    }

    public RegexMatchSetState(
        @Nullable Output<String> name,
        @Nullable Output<List<RegexMatchSetRegexMatchTupleGetArgs>> regexMatchTuples) {
        this.name = name;
        this.regexMatchTuples = regexMatchTuples;
    }

    private RegexMatchSetState() {
        this.name = Output.empty();
        this.regexMatchTuples = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexMatchSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<List<RegexMatchSetRegexMatchTupleGetArgs>> regexMatchTuples;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexMatchSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.regexMatchTuples = defaults.regexMatchTuples;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder regexMatchTuples(@Nullable Output<List<RegexMatchSetRegexMatchTupleGetArgs>> regexMatchTuples) {
            this.regexMatchTuples = regexMatchTuples;
            return this;
        }
        public Builder regexMatchTuples(@Nullable List<RegexMatchSetRegexMatchTupleGetArgs> regexMatchTuples) {
            this.regexMatchTuples = Output.ofNullable(regexMatchTuples);
            return this;
        }
        public Builder regexMatchTuples(RegexMatchSetRegexMatchTupleGetArgs... regexMatchTuples) {
            return regexMatchTuples(List.of(regexMatchTuples));
        }        public RegexMatchSetState build() {
            return new RegexMatchSetState(name, regexMatchTuples);
        }
    }
}
