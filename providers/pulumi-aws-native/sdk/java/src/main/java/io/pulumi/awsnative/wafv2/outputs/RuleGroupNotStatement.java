// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.RuleGroupStatement;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupNotStatement {
    private final RuleGroupStatement statement;

    @OutputCustomType.Constructor({"statement"})
    private RuleGroupNotStatement(RuleGroupStatement statement) {
        this.statement = Objects.requireNonNull(statement);
    }

    public RuleGroupStatement getStatement() {
        return this.statement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupNotStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupStatement statement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statement = defaults.statement;
        }

        public Builder setStatement(RuleGroupStatement statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }

        public RuleGroupNotStatement build() {
            return new RuleGroupNotStatement(statement);
        }
    }
}