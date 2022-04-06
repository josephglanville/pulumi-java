// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementOrStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementOrStatementArgs Empty = new WebAclRuleStatementAndStatementStatementOrStatementArgs();

    /**
     * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
      private final Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementArgs>> statements;

    public Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementAndStatementStatementOrStatementArgs(Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementOrStatementArgs() {
        this.statements = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Output<List<WebAclRuleStatementAndStatementStatementOrStatementStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(List<WebAclRuleStatementAndStatementStatementOrStatementStatementArgs> statements) {
            this.statements = Output.of(Objects.requireNonNull(statements));
            return this;
        }
        public Builder statements(WebAclRuleStatementAndStatementStatementOrStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementAndStatementStatementOrStatementArgs build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementArgs(statements);
        }
    }
}