// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementGetArgs();

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
      private final Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementGetArgs>> statements;

    public Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementGetArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementGetArgs(Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementGetArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementGetArgs() {
        this.statements = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementGetArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementGetArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementGetArgs> statements) {
            this.statements = Output.of(Objects.requireNonNull(statements));
            return this;
        }
        public Builder statements(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementStatementGetArgs... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementGetArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementAndStatementGetArgs(statements);
        }
    }
}
