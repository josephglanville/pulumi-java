// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs Empty = new WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Output.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

    public Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs(
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch,
        Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs() {
        this.fieldToMatch = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder fieldToMatch(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Output.ofNullable(fieldToMatch);
            return this;
        }
        public Builder textTransformations(Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementArgs(fieldToMatch, textTransformations);
        }
    }
}