// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementTextTransformation;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatement {
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatch fieldToMatch;
    /**
     * The area within the portion of a web request that you want AWS WAF to search for `search_string`. Valid values include the following: `EXACTLY`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CONTAINS_WORD`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchStatement.html) for more information.
     * 
     */
    private final String positionalConstraint;
    /**
     * A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you designate for inspection in `field_to_match`. The maximum length of the value is 50 bytes.
     * 
     */
    private final String searchString;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementTextTransformation> textTransformations;

    @CustomType.Constructor
    private WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatement(
        @CustomType.Parameter("fieldToMatch") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatch fieldToMatch,
        @CustomType.Parameter("positionalConstraint") String positionalConstraint,
        @CustomType.Parameter("searchString") String searchString,
        @CustomType.Parameter("textTransformations") List<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.positionalConstraint = positionalConstraint;
        this.searchString = searchString;
        this.textTransformations = textTransformations;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatch> getFieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * The area within the portion of a web request that you want AWS WAF to search for `search_string`. Valid values include the following: `EXACTLY`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CONTAINS_WORD`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchStatement.html) for more information.
     * 
    */
    public String getPositionalConstraint() {
        return this.positionalConstraint;
    }
    /**
     * A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you designate for inspection in `field_to_match`. The maximum length of the value is 50 bytes.
     * 
    */
    public String getSearchString() {
        return this.searchString;
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
    */
    public List<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatch fieldToMatch;
        private String positionalConstraint;
        private String searchString;
        private List<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.positionalConstraint = defaults.positionalConstraint;
    	      this.searchString = defaults.searchString;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder positionalConstraint(String positionalConstraint) {
            this.positionalConstraint = Objects.requireNonNull(positionalConstraint);
            return this;
        }
        public Builder searchString(String searchString) {
            this.searchString = Objects.requireNonNull(searchString);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatement build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatement(fieldToMatch, positionalConstraint, searchString, textTransformations);
        }
    }
}
