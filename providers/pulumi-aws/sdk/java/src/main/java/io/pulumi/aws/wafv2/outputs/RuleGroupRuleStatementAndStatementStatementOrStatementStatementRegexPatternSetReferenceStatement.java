// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement {
    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    private final String arn;
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations;

    @CustomType.Constructor
    private RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("fieldToMatch") @Nullable RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch,
        @CustomType.Parameter("textTransformations") List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations) {
        this.arn = arn;
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch> getFieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
    */
    public List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch;
        private List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder fieldToMatch(@Nullable RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder textTransformations(List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement build() {
            return new RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement(arn, fieldToMatch, textTransformations);
        }
    }
}
