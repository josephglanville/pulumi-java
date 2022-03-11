// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.RegexMatchSetRegexMatchTupleFieldToMatchGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RegexMatchSetRegexMatchTupleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegexMatchSetRegexMatchTupleGetArgs Empty = new RegexMatchSetRegexMatchTupleGetArgs();

    /**
     * The part of a web request that you want to search, such as a specified header or a query string.
     * 
     */
    @InputImport(name="fieldToMatch", required=true)
      private final Output<RegexMatchSetRegexMatchTupleFieldToMatchGetArgs> fieldToMatch;

    public Output<RegexMatchSetRegexMatchTupleFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * The ID of a `WAF Regex Pattern Set`.
     * 
     */
    @InputImport(name="regexPatternSetId", required=true)
      private final Output<String> regexPatternSetId;

    public Output<String> getRegexPatternSetId() {
        return this.regexPatternSetId;
    }

    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    @InputImport(name="textTransformation", required=true)
      private final Output<String> textTransformation;

    public Output<String> getTextTransformation() {
        return this.textTransformation;
    }

    public RegexMatchSetRegexMatchTupleGetArgs(
        Output<RegexMatchSetRegexMatchTupleFieldToMatchGetArgs> fieldToMatch,
        Output<String> regexPatternSetId,
        Output<String> textTransformation) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.regexPatternSetId = Objects.requireNonNull(regexPatternSetId, "expected parameter 'regexPatternSetId' to be non-null");
        this.textTransformation = Objects.requireNonNull(textTransformation, "expected parameter 'textTransformation' to be non-null");
    }

    private RegexMatchSetRegexMatchTupleGetArgs() {
        this.fieldToMatch = Output.empty();
        this.regexPatternSetId = Output.empty();
        this.textTransformation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexMatchSetRegexMatchTupleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RegexMatchSetRegexMatchTupleFieldToMatchGetArgs> fieldToMatch;
        private Output<String> regexPatternSetId;
        private Output<String> textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexMatchSetRegexMatchTupleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.regexPatternSetId = defaults.regexPatternSetId;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder fieldToMatch(Output<RegexMatchSetRegexMatchTupleFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder fieldToMatch(RegexMatchSetRegexMatchTupleFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Output.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }

        public Builder regexPatternSetId(Output<String> regexPatternSetId) {
            this.regexPatternSetId = Objects.requireNonNull(regexPatternSetId);
            return this;
        }

        public Builder regexPatternSetId(String regexPatternSetId) {
            this.regexPatternSetId = Output.of(Objects.requireNonNull(regexPatternSetId));
            return this;
        }

        public Builder textTransformation(Output<String> textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }

        public Builder textTransformation(String textTransformation) {
            this.textTransformation = Output.of(Objects.requireNonNull(textTransformation));
            return this;
        }
        public RegexMatchSetRegexMatchTupleGetArgs build() {
            return new RegexMatchSetRegexMatchTupleGetArgs(fieldToMatch, regexPatternSetId, textTransformation);
        }
    }
}
