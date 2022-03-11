// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupLabelMatchScope;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupLabelMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupLabelMatchStatementArgs Empty = new RuleGroupLabelMatchStatementArgs();

    @InputImport(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    @InputImport(name="scope", required=true)
      private final Output<RuleGroupLabelMatchScope> scope;

    public Output<RuleGroupLabelMatchScope> getScope() {
        return this.scope;
    }

    public RuleGroupLabelMatchStatementArgs(
        Output<String> key,
        Output<RuleGroupLabelMatchScope> scope) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private RuleGroupLabelMatchStatementArgs() {
        this.key = Output.empty();
        this.scope = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupLabelMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private Output<RuleGroupLabelMatchScope> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupLabelMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.scope = defaults.scope;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder scope(Output<RuleGroupLabelMatchScope> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder scope(RuleGroupLabelMatchScope scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public RuleGroupLabelMatchStatementArgs build() {
            return new RuleGroupLabelMatchStatementArgs(key, scope);
        }
    }
}
