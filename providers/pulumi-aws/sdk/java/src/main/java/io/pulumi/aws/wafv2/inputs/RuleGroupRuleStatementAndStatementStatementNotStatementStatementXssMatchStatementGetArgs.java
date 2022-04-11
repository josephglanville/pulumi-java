// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs Empty = new RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch;

    public Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Codegen.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations;

    public Output<List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs(
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch,
        Output<List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs() {
        this.fieldToMatch = Codegen.empty();
        this.textTransformations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch;
        private Output<List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Output<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder fieldToMatch(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Codegen.ofNullable(fieldToMatch);
            return this;
        }
        public Builder textTransformations(Output<List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs build() {
            return new RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs(fieldToMatch, textTransformations);
        }
    }
}
