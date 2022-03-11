// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementTextTransformationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs> fieldToMatch;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Output.empty() : this.fieldToMatch;
    }

    /**
     * The area within the portion of a web request that you want AWS WAF to search for `search_string`. Valid values include the following: `EXACTLY`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CONTAINS_WORD`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchStatement.html) for more information.
     * 
     */
    @InputImport(name="positionalConstraint", required=true)
      private final Output<String> positionalConstraint;

    public Output<String> getPositionalConstraint() {
        return this.positionalConstraint;
    }

    /**
     * A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you designate for inspection in `field_to_match`. The maximum length of the value is 50 bytes.
     * 
     */
    @InputImport(name="searchString", required=true)
      private final Output<String> searchString;

    public Output<String> getSearchString() {
        return this.searchString;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementTextTransformationGetArgs>> textTransformations;

    public Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs> fieldToMatch,
        Output<String> positionalConstraint,
        Output<String> searchString,
        Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementTextTransformationGetArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.positionalConstraint = Objects.requireNonNull(positionalConstraint, "expected parameter 'positionalConstraint' to be non-null");
        this.searchString = Objects.requireNonNull(searchString, "expected parameter 'searchString' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs() {
        this.fieldToMatch = Output.empty();
        this.positionalConstraint = Output.empty();
        this.searchString = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs> fieldToMatch;
        private Output<String> positionalConstraint;
        private Output<String> searchString;
        private Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.positionalConstraint = defaults.positionalConstraint;
    	      this.searchString = defaults.searchString;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Output.ofNullable(fieldToMatch);
            return this;
        }

        public Builder positionalConstraint(Output<String> positionalConstraint) {
            this.positionalConstraint = Objects.requireNonNull(positionalConstraint);
            return this;
        }

        public Builder positionalConstraint(String positionalConstraint) {
            this.positionalConstraint = Output.of(Objects.requireNonNull(positionalConstraint));
            return this;
        }

        public Builder searchString(Output<String> searchString) {
            this.searchString = Objects.requireNonNull(searchString);
            return this;
        }

        public Builder searchString(String searchString) {
            this.searchString = Output.of(Objects.requireNonNull(searchString));
            return this;
        }

        public Builder textTransformations(Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs(fieldToMatch, positionalConstraint, searchString, textTransformations);
        }
    }
}
