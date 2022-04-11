// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs();

    /**
     * The lower limit of the port range. This must be less than or equal to the `to_port`.
     * 
     */
    @Import(name="fromPort", required=true)
      private final Output<Integer> fromPort;

    public Output<Integer> getFromPort() {
        return this.fromPort;
    }

    /**
     * The upper limit of the port range. This must be greater than or equal to the `from_port`.
     * 
     */
    @Import(name="toPort")
      private final @Nullable Output<Integer> toPort;

    public Output<Integer> getToPort() {
        return this.toPort == null ? Codegen.empty() : this.toPort;
    }

    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs(
        Output<Integer> fromPort,
        @Nullable Output<Integer> toPort) {
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.toPort = toPort;
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs() {
        this.fromPort = Codegen.empty();
        this.toPort = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> fromPort;
        private @Nullable Output<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.toPort = defaults.toPort;
        }

        public Builder fromPort(Output<Integer> fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }
        public Builder fromPort(Integer fromPort) {
            this.fromPort = Output.of(Objects.requireNonNull(fromPort));
            return this;
        }
        public Builder toPort(@Nullable Output<Integer> toPort) {
            this.toPort = toPort;
            return this;
        }
        public Builder toPort(@Nullable Integer toPort) {
            this.toPort = Codegen.ofNullable(toPort);
            return this;
        }        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs(fromPort, toPort);
        }
    }
}
