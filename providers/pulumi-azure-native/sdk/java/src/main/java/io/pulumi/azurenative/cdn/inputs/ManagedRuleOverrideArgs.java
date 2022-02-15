// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.ActionType;
import io.pulumi.azurenative.cdn.enums.ManagedRuleEnabledState;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedRuleOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedRuleOverrideArgs Empty = new ManagedRuleOverrideArgs();

    @InputImport(name="action")
    private final @Nullable Input<Either<String,ActionType>> action;

    public Input<Either<String,ActionType>> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    @InputImport(name="enabledState")
    private final @Nullable Input<Either<String,ManagedRuleEnabledState>> enabledState;

    public Input<Either<String,ManagedRuleEnabledState>> getEnabledState() {
        return this.enabledState == null ? Input.empty() : this.enabledState;
    }

    @InputImport(name="ruleId", required=true)
    private final Input<String> ruleId;

    public Input<String> getRuleId() {
        return this.ruleId;
    }

    public ManagedRuleOverrideArgs(
        @Nullable Input<Either<String,ActionType>> action,
        @Nullable Input<Either<String,ManagedRuleEnabledState>> enabledState,
        Input<String> ruleId) {
        this.action = action;
        this.enabledState = enabledState;
        this.ruleId = Objects.requireNonNull(ruleId, "expected parameter 'ruleId' to be non-null");
    }

    private ManagedRuleOverrideArgs() {
        this.action = Input.empty();
        this.enabledState = Input.empty();
        this.ruleId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ActionType>> action;
        private @Nullable Input<Either<String,ManagedRuleEnabledState>> enabledState;
        private Input<String> ruleId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabledState = defaults.enabledState;
    	      this.ruleId = defaults.ruleId;
        }

        public Builder setAction(@Nullable Input<Either<String,ActionType>> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable Either<String,ActionType> action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setEnabledState(@Nullable Input<Either<String,ManagedRuleEnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setEnabledState(@Nullable Either<String,ManagedRuleEnabledState> enabledState) {
            this.enabledState = Input.ofNullable(enabledState);
            return this;
        }

        public Builder setRuleId(Input<String> ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }

        public Builder setRuleId(String ruleId) {
            this.ruleId = Input.of(Objects.requireNonNull(ruleId));
            return this;
        }

        public ManagedRuleOverrideArgs build() {
            return new ManagedRuleOverrideArgs(action, enabledState, ruleId);
        }
    }
}