// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs Empty = new RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs();

    public RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs build() {
            return new RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs();
        }
    }
}