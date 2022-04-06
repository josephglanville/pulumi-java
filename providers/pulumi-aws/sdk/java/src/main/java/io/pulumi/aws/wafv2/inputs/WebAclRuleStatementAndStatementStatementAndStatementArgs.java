// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementAndStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementArgs();

    /**
     * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
      private final Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementArgs>> statements;

    public Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementArgs>> getStatements() {
        return this.statements;
    }

    public WebAclRuleStatementAndStatementStatementAndStatementArgs(Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementAndStatementArgs() {
        this.statements = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(List<WebAclRuleStatementAndStatementStatementAndStatementStatementArgs> statements) {
            this.statements = Output.of(Objects.requireNonNull(statements));
            return this;
        }
        public Builder statements(WebAclRuleStatementAndStatementStatementAndStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementAndStatementStatementAndStatementArgs build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementArgs(statements);
        }
    }
}