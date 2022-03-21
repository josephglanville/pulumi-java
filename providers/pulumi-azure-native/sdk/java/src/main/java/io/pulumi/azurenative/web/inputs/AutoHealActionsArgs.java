// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.AutoHealActionType;
import io.pulumi.azurenative.web.inputs.AutoHealCustomActionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Actions which to take by the auto-heal module when a rule is triggered.
 * 
 */
public final class AutoHealActionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoHealActionsArgs Empty = new AutoHealActionsArgs();

    /**
     * Predefined action to be taken.
     * 
     */
    @Import(name="actionType")
      private final @Nullable Output<AutoHealActionType> actionType;

    public Output<AutoHealActionType> getActionType() {
        return this.actionType == null ? Output.empty() : this.actionType;
    }

    /**
     * Custom action to be taken.
     * 
     */
    @Import(name="customAction")
      private final @Nullable Output<AutoHealCustomActionArgs> customAction;

    public Output<AutoHealCustomActionArgs> getCustomAction() {
        return this.customAction == null ? Output.empty() : this.customAction;
    }

    /**
     * Minimum time the process must execute
     * before taking the action
     * 
     */
    @Import(name="minProcessExecutionTime")
      private final @Nullable Output<String> minProcessExecutionTime;

    public Output<String> getMinProcessExecutionTime() {
        return this.minProcessExecutionTime == null ? Output.empty() : this.minProcessExecutionTime;
    }

    public AutoHealActionsArgs(
        @Nullable Output<AutoHealActionType> actionType,
        @Nullable Output<AutoHealCustomActionArgs> customAction,
        @Nullable Output<String> minProcessExecutionTime) {
        this.actionType = actionType;
        this.customAction = customAction;
        this.minProcessExecutionTime = minProcessExecutionTime;
    }

    private AutoHealActionsArgs() {
        this.actionType = Output.empty();
        this.customAction = Output.empty();
        this.minProcessExecutionTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AutoHealActionType> actionType;
        private @Nullable Output<AutoHealCustomActionArgs> customAction;
        private @Nullable Output<String> minProcessExecutionTime;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoHealActionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.customAction = defaults.customAction;
    	      this.minProcessExecutionTime = defaults.minProcessExecutionTime;
        }

        public Builder actionType(@Nullable Output<AutoHealActionType> actionType) {
            this.actionType = actionType;
            return this;
        }
        public Builder actionType(@Nullable AutoHealActionType actionType) {
            this.actionType = Output.ofNullable(actionType);
            return this;
        }
        public Builder customAction(@Nullable Output<AutoHealCustomActionArgs> customAction) {
            this.customAction = customAction;
            return this;
        }
        public Builder customAction(@Nullable AutoHealCustomActionArgs customAction) {
            this.customAction = Output.ofNullable(customAction);
            return this;
        }
        public Builder minProcessExecutionTime(@Nullable Output<String> minProcessExecutionTime) {
            this.minProcessExecutionTime = minProcessExecutionTime;
            return this;
        }
        public Builder minProcessExecutionTime(@Nullable String minProcessExecutionTime) {
            this.minProcessExecutionTime = Output.ofNullable(minProcessExecutionTime);
            return this;
        }        public AutoHealActionsArgs build() {
            return new AutoHealActionsArgs(actionType, customAction, minProcessExecutionTime);
        }
    }
}
