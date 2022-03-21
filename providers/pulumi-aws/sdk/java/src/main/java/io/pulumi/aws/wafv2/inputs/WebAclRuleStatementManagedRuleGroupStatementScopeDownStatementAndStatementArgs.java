// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementArgs();

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
      private final Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementArgs>> statements;

    public Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementArgs(Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementArgs() {
        this.statements = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementArgs> statements) {
            this.statements = Output.of(Objects.requireNonNull(statements));
            return this;
        }
        public Builder statements(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementArgs build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementArgs(statements);
        }
    }
}
