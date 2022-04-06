// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Output.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations;

    public Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs(
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch,
        Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs() {
        this.fieldToMatch = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder fieldToMatch(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Output.ofNullable(fieldToMatch);
            return this;
        }
        public Builder textTransformations(Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs(fieldToMatch, textTransformations);
        }
    }
}