// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs Empty = new WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;

    public Output<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Output.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

    public Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs(
        @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch,
        Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs() {
        this.fieldToMatch = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder fieldToMatch(@Nullable WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Output.ofNullable(fieldToMatch);
            return this;
        }
        public Builder textTransformations(Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs build() {
            return new WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs(fieldToMatch, textTransformations);
        }
    }
}