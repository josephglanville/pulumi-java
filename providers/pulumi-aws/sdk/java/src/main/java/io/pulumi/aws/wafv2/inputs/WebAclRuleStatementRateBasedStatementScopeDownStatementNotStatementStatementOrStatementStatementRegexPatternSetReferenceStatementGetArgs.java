// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs();

    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Codegen.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations;

    public Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs(
        Output<String> arn,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch,
        Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs() {
        this.arn = Codegen.empty();
        this.fieldToMatch = Codegen.empty();
        this.textTransformations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }
        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder fieldToMatch(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Codegen.ofNullable(fieldToMatch);
            return this;
        }
        public Builder textTransformations(Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs(arn, fieldToMatch, textTransformations);
        }
    }
}
