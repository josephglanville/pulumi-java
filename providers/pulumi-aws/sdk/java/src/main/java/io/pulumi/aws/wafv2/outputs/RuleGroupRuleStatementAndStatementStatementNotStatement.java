// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatement;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleStatementAndStatementStatementNotStatement {
    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    private final List<RuleGroupRuleStatementAndStatementStatementNotStatementStatement> statements;

    @CustomType.Constructor
    private RuleGroupRuleStatementAndStatementStatementNotStatement(@CustomType.Parameter("statements") List<RuleGroupRuleStatementAndStatementStatementNotStatementStatement> statements) {
        this.statements = statements;
    }

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
    */
    public List<RuleGroupRuleStatementAndStatementStatementNotStatementStatement> getStatements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementNotStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupRuleStatementAndStatementStatementNotStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<RuleGroupRuleStatementAndStatementStatementNotStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(RuleGroupRuleStatementAndStatementStatementNotStatementStatement... statements) {
            return statements(List.of(statements));
        }        public RuleGroupRuleStatementAndStatementStatementNotStatement build() {
            return new RuleGroupRuleStatementAndStatementStatementNotStatement(statements);
        }
    }
}