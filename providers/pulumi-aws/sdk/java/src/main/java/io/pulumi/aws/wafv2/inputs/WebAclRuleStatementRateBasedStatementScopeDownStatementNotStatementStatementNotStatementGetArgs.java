// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementGetArgs();

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    @InputImport(name="statements", required=true)
      private final Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs>> statements;

    public Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementGetArgs(Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementGetArgs() {
        this.statements = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder statements(List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementGetArgs> statements) {
            this.statements = Output.of(Objects.requireNonNull(statements));
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementGetArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementGetArgs(statements);
        }
    }
}
