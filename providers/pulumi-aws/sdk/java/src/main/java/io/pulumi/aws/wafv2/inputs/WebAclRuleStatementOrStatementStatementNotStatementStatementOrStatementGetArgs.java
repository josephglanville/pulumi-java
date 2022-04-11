// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementGetArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
      private final Output<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementGetArgs>> statements;

    public Output<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementGetArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementGetArgs(Output<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementGetArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementGetArgs() {
        this.statements = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementGetArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Output<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementGetArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementGetArgs> statements) {
            this.statements = Output.of(Objects.requireNonNull(statements));
            return this;
        }
        public Builder statements(WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementGetArgs... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementGetArgs(statements);
        }
    }
}
