// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleVariablesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleVariablesArgs Empty = new RuleGroupRuleVariablesArgs();

    @InputImport(name="iPSets")
      private final @Nullable Input<Object> iPSets;

    public Input<Object> getIPSets() {
        return this.iPSets == null ? Input.empty() : this.iPSets;
    }

    @InputImport(name="portSets")
      private final @Nullable Input<Object> portSets;

    public Input<Object> getPortSets() {
        return this.portSets == null ? Input.empty() : this.portSets;
    }

    public RuleGroupRuleVariablesArgs(
        @Nullable Input<Object> iPSets,
        @Nullable Input<Object> portSets) {
        this.iPSets = iPSets;
        this.portSets = portSets;
    }

    private RuleGroupRuleVariablesArgs() {
        this.iPSets = Input.empty();
        this.portSets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleVariablesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> iPSets;
        private @Nullable Input<Object> portSets;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleVariablesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iPSets = defaults.iPSets;
    	      this.portSets = defaults.portSets;
        }

        public Builder setIPSets(@Nullable Input<Object> iPSets) {
            this.iPSets = iPSets;
            return this;
        }

        public Builder setIPSets(@Nullable Object iPSets) {
            this.iPSets = Input.ofNullable(iPSets);
            return this;
        }

        public Builder setPortSets(@Nullable Input<Object> portSets) {
            this.portSets = portSets;
            return this;
        }

        public Builder setPortSets(@Nullable Object portSets) {
            this.portSets = Input.ofNullable(portSets);
            return this;
        }
        public RuleGroupRuleVariablesArgs build() {
            return new RuleGroupRuleVariablesArgs(iPSets, portSets);
        }
    }
}
