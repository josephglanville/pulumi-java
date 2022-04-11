// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.AutomationTriggeringRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule set which evaluates all its rules upon an event interception. Only when all the included rules in the rule set will be evaluated as 'true', will the event trigger the defined actions.
 * 
 */
public final class AutomationRuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomationRuleSetArgs Empty = new AutomationRuleSetArgs();

    @Import(name="rules")
      private final @Nullable Output<List<AutomationTriggeringRuleArgs>> rules;

    public Output<List<AutomationTriggeringRuleArgs>> getRules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    public AutomationRuleSetArgs(@Nullable Output<List<AutomationTriggeringRuleArgs>> rules) {
        this.rules = rules;
    }

    private AutomationRuleSetArgs() {
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AutomationTriggeringRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(@Nullable Output<List<AutomationTriggeringRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<AutomationTriggeringRuleArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(AutomationTriggeringRuleArgs... rules) {
            return rules(List.of(rules));
        }        public AutomationRuleSetArgs build() {
            return new AutomationRuleSetArgs(rules);
        }
    }
}
