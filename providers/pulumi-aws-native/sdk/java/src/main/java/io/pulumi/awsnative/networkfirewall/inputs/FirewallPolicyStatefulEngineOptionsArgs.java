// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.enums.FirewallPolicyRuleOrder;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyStatefulEngineOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyStatefulEngineOptionsArgs Empty = new FirewallPolicyStatefulEngineOptionsArgs();

    @InputImport(name="ruleOrder")
      private final @Nullable Input<FirewallPolicyRuleOrder> ruleOrder;

    public Input<FirewallPolicyRuleOrder> getRuleOrder() {
        return this.ruleOrder == null ? Input.empty() : this.ruleOrder;
    }

    public FirewallPolicyStatefulEngineOptionsArgs(@Nullable Input<FirewallPolicyRuleOrder> ruleOrder) {
        this.ruleOrder = ruleOrder;
    }

    private FirewallPolicyStatefulEngineOptionsArgs() {
        this.ruleOrder = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyStatefulEngineOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FirewallPolicyRuleOrder> ruleOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyStatefulEngineOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleOrder = defaults.ruleOrder;
        }

        public Builder setRuleOrder(@Nullable Input<FirewallPolicyRuleOrder> ruleOrder) {
            this.ruleOrder = ruleOrder;
            return this;
        }

        public Builder setRuleOrder(@Nullable FirewallPolicyRuleOrder ruleOrder) {
            this.ruleOrder = Input.ofNullable(ruleOrder);
            return this;
        }
        public FirewallPolicyStatefulEngineOptionsArgs build() {
            return new FirewallPolicyStatefulEngineOptionsArgs(ruleOrder);
        }
    }
}
