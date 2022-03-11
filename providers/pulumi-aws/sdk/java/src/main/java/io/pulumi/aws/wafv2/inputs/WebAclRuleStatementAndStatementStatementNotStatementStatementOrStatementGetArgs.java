// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementGetArgs Empty = new WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementGetArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @InputImport(name="statements", required=true)
      private final Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementGetArgs>> statements;

    public Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementGetArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementGetArgs(Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementGetArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementGetArgs() {
        this.statements = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementGetArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementGetArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder statements(List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementGetArgs> statements) {
            this.statements = Output.of(Objects.requireNonNull(statements));
            return this;
        }
        public WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementGetArgs(statements);
        }
    }
}
