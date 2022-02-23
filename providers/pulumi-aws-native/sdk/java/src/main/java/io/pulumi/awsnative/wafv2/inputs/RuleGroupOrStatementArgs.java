// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class RuleGroupOrStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupOrStatementArgs Empty = new RuleGroupOrStatementArgs();

    @InputImport(name="statements", required=true)
      private final Input<List<RuleGroupStatementArgs>> statements;

    public Input<List<RuleGroupStatementArgs>> getStatements() {
        return this.statements;
    }

    public RuleGroupOrStatementArgs(Input<List<RuleGroupStatementArgs>> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private RuleGroupOrStatementArgs() {
        this.statements = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupOrStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<RuleGroupStatementArgs>> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupOrStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder setStatements(Input<List<RuleGroupStatementArgs>> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }

        public Builder setStatements(List<RuleGroupStatementArgs> statements) {
            this.statements = Input.of(Objects.requireNonNull(statements));
            return this;
        }
        public RuleGroupOrStatementArgs build() {
            return new RuleGroupOrStatementArgs(statements);
        }
    }
}
