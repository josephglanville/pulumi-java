// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.outputs;

import io.pulumi.aws.waf.outputs.RegexMatchSetRegexMatchTupleFieldToMatch;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RegexMatchSetRegexMatchTuple {
    /**
     * The part of a web request that you want to search, such as a specified header or a query string.
     * 
     */
    private final RegexMatchSetRegexMatchTupleFieldToMatch fieldToMatch;
    /**
     * The ID of a `WAF Regex Pattern Set`.
     * 
     */
    private final String regexPatternSetId;
    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    private final String textTransformation;

    @CustomType.Constructor
    private RegexMatchSetRegexMatchTuple(
        @CustomType.Parameter("fieldToMatch") RegexMatchSetRegexMatchTupleFieldToMatch fieldToMatch,
        @CustomType.Parameter("regexPatternSetId") String regexPatternSetId,
        @CustomType.Parameter("textTransformation") String textTransformation) {
        this.fieldToMatch = fieldToMatch;
        this.regexPatternSetId = regexPatternSetId;
        this.textTransformation = textTransformation;
    }

    /**
     * The part of a web request that you want to search, such as a specified header or a query string.
     * 
    */
    public RegexMatchSetRegexMatchTupleFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }
    /**
     * The ID of a `WAF Regex Pattern Set`.
     * 
    */
    public String getRegexPatternSetId() {
        return this.regexPatternSetId;
    }
    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
     * for all supported values.
     * 
    */
    public String getTextTransformation() {
        return this.textTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexMatchSetRegexMatchTuple defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegexMatchSetRegexMatchTupleFieldToMatch fieldToMatch;
        private String regexPatternSetId;
        private String textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexMatchSetRegexMatchTuple defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.regexPatternSetId = defaults.regexPatternSetId;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder fieldToMatch(RegexMatchSetRegexMatchTupleFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }
        public Builder regexPatternSetId(String regexPatternSetId) {
            this.regexPatternSetId = Objects.requireNonNull(regexPatternSetId);
            return this;
        }
        public Builder textTransformation(String textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }        public RegexMatchSetRegexMatchTuple build() {
            return new RegexMatchSetRegexMatchTuple(fieldToMatch, regexPatternSetId, textTransformation);
        }
    }
}
