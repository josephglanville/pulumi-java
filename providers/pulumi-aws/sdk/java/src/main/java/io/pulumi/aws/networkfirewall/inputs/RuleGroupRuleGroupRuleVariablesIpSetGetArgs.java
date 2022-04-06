// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesIpSetIpSetGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleGroupRuleVariablesIpSetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRuleVariablesIpSetGetArgs Empty = new RuleGroupRuleGroupRuleVariablesIpSetGetArgs();

    /**
     * A configuration block that defines a set of IP addresses. See IP Set below for details.
     * 
     */
    @Import(name="ipSet", required=true)
      private final Output<RuleGroupRuleGroupRuleVariablesIpSetIpSetGetArgs> ipSet;

    public Output<RuleGroupRuleGroupRuleVariablesIpSetIpSetGetArgs> getIpSet() {
        return this.ipSet;
    }

    /**
     * A unique alphanumeric string to identify the `ip_set`.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    public RuleGroupRuleGroupRuleVariablesIpSetGetArgs(
        Output<RuleGroupRuleGroupRuleVariablesIpSetIpSetGetArgs> ipSet,
        Output<String> key) {
        this.ipSet = Objects.requireNonNull(ipSet, "expected parameter 'ipSet' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
    }

    private RuleGroupRuleGroupRuleVariablesIpSetGetArgs() {
        this.ipSet = Output.empty();
        this.key = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRuleVariablesIpSetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RuleGroupRuleGroupRuleVariablesIpSetIpSetGetArgs> ipSet;
        private Output<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRuleVariablesIpSetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipSet = defaults.ipSet;
    	      this.key = defaults.key;
        }

        public Builder ipSet(Output<RuleGroupRuleGroupRuleVariablesIpSetIpSetGetArgs> ipSet) {
            this.ipSet = Objects.requireNonNull(ipSet);
            return this;
        }
        public Builder ipSet(RuleGroupRuleGroupRuleVariablesIpSetIpSetGetArgs ipSet) {
            this.ipSet = Output.of(Objects.requireNonNull(ipSet));
            return this;
        }
        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }        public RuleGroupRuleGroupRuleVariablesIpSetGetArgs build() {
            return new RuleGroupRuleGroupRuleVariablesIpSetGetArgs(ipSet, key);
        }
    }
}