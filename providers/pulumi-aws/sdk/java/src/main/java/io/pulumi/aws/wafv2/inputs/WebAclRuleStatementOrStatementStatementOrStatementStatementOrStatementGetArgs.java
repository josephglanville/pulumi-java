// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
      private final Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementGetArgs>> statements;

    public Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementGetArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs(Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementGetArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs() {
        this.statements = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementGetArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementGetArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementGetArgs> statements) {
            this.statements = Output.of(Objects.requireNonNull(statements));
            return this;
        }
        public Builder statements(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementGetArgs... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs(statements);
        }
    }
}
