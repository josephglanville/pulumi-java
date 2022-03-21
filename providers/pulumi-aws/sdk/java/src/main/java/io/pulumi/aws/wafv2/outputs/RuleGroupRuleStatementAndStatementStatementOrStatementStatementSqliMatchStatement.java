// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformation;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatement {
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations;

    @CustomType.Constructor
    private RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatement(
        @CustomType.Parameter("fieldToMatch") @Nullable RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch,
        @CustomType.Parameter("textTransformations") List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch> getFieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
    */
    public List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch;
        private List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder textTransformations(List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatement build() {
            return new RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatement(fieldToMatch, textTransformations);
        }
    }
}
