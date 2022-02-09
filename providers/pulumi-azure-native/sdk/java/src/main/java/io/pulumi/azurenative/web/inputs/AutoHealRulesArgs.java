// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.AutoHealActionsArgs;
import io.pulumi.azurenative.web.inputs.AutoHealTriggersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoHealRulesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoHealRulesArgs Empty = new AutoHealRulesArgs();

    @InputImport(name="actions")
    private final @Nullable Input<AutoHealActionsArgs> actions;

    public Input<AutoHealActionsArgs> getActions() {
        return this.actions == null ? Input.empty() : this.actions;
    }

    @InputImport(name="triggers")
    private final @Nullable Input<AutoHealTriggersArgs> triggers;

    public Input<AutoHealTriggersArgs> getTriggers() {
        return this.triggers == null ? Input.empty() : this.triggers;
    }

    public AutoHealRulesArgs(
        @Nullable Input<AutoHealActionsArgs> actions,
        @Nullable Input<AutoHealTriggersArgs> triggers) {
        this.actions = actions;
        this.triggers = triggers;
    }

    private AutoHealRulesArgs() {
        this.actions = Input.empty();
        this.triggers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutoHealActionsArgs> actions;
        private @Nullable Input<AutoHealTriggersArgs> triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoHealRulesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.triggers = defaults.triggers;
        }

        public Builder setActions(@Nullable Input<AutoHealActionsArgs> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setActions(@Nullable AutoHealActionsArgs actions) {
            this.actions = Input.ofNullable(actions);
            return this;
        }

        public Builder setTriggers(@Nullable Input<AutoHealTriggersArgs> triggers) {
            this.triggers = triggers;
            return this;
        }

        public Builder setTriggers(@Nullable AutoHealTriggersArgs triggers) {
            this.triggers = Input.ofNullable(triggers);
            return this;
        }

        public AutoHealRulesArgs build() {
            return new AutoHealRulesArgs(actions, triggers);
        }
    }
}
