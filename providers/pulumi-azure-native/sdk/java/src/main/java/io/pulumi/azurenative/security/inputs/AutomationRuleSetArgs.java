// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.AutomationTriggeringRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule set which evaluates all its rules upon an event interception. Only when all the included rules in the rule set will be evaluated as 'true', will the event trigger the defined actions.
 * 
 */
public final class AutomationRuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomationRuleSetArgs Empty = new AutomationRuleSetArgs();

    @InputImport(name="rules")
      private final @Nullable Input<List<AutomationTriggeringRuleArgs>> rules;

    public Input<List<AutomationTriggeringRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    public AutomationRuleSetArgs(@Nullable Input<List<AutomationTriggeringRuleArgs>> rules) {
        this.rules = rules;
    }

    private AutomationRuleSetArgs() {
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AutomationTriggeringRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder setRules(@Nullable Input<List<AutomationTriggeringRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<AutomationTriggeringRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }
        public AutomationRuleSetArgs build() {
            return new AutomationRuleSetArgs(rules);
        }
    }
}
