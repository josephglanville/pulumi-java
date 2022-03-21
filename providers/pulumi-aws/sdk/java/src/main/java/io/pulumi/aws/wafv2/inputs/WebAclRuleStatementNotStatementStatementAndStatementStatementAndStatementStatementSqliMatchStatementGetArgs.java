// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementGetArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementGetArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Output.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations;

    public Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementGetArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch,
        Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementGetArgs() {
        this.fieldToMatch = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder fieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Output.ofNullable(fieldToMatch);
            return this;
        }
        public Builder textTransformations(Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementGetArgs build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatementGetArgs(fieldToMatch, textTransformations);
        }
    }
}
