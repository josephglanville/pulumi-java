// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyActionDefinitionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FirewallPolicyCustomActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyCustomActionArgs Empty = new FirewallPolicyCustomActionArgs();

    @InputImport(name="actionDefinition", required=true)
      private final Input<FirewallPolicyActionDefinitionArgs> actionDefinition;

    public Input<FirewallPolicyActionDefinitionArgs> getActionDefinition() {
        return this.actionDefinition;
    }

    @InputImport(name="actionName", required=true)
      private final Input<String> actionName;

    public Input<String> getActionName() {
        return this.actionName;
    }

    public FirewallPolicyCustomActionArgs(
        Input<FirewallPolicyActionDefinitionArgs> actionDefinition,
        Input<String> actionName) {
        this.actionDefinition = Objects.requireNonNull(actionDefinition, "expected parameter 'actionDefinition' to be non-null");
        this.actionName = Objects.requireNonNull(actionName, "expected parameter 'actionName' to be non-null");
    }

    private FirewallPolicyCustomActionArgs() {
        this.actionDefinition = Input.empty();
        this.actionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyCustomActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FirewallPolicyActionDefinitionArgs> actionDefinition;
        private Input<String> actionName;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyCustomActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionDefinition = defaults.actionDefinition;
    	      this.actionName = defaults.actionName;
        }

        public Builder setActionDefinition(Input<FirewallPolicyActionDefinitionArgs> actionDefinition) {
            this.actionDefinition = Objects.requireNonNull(actionDefinition);
            return this;
        }

        public Builder setActionDefinition(FirewallPolicyActionDefinitionArgs actionDefinition) {
            this.actionDefinition = Input.of(Objects.requireNonNull(actionDefinition));
            return this;
        }

        public Builder setActionName(Input<String> actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }

        public Builder setActionName(String actionName) {
            this.actionName = Input.of(Objects.requireNonNull(actionName));
            return this;
        }
        public FirewallPolicyCustomActionArgs build() {
            return new FirewallPolicyCustomActionArgs(actionDefinition, actionName);
        }
    }
}
