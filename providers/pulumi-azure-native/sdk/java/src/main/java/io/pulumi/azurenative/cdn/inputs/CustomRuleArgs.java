// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.ActionType;
import io.pulumi.azurenative.cdn.enums.CustomRuleEnabledState;
import io.pulumi.azurenative.cdn.inputs.MatchConditionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomRuleArgs Empty = new CustomRuleArgs();

    @InputImport(name="action", required=true)
    private final Input<Either<String,ActionType>> action;

    public Input<Either<String,ActionType>> getAction() {
        return this.action;
    }

    @InputImport(name="enabledState")
    private final @Nullable Input<Either<String,CustomRuleEnabledState>> enabledState;

    public Input<Either<String,CustomRuleEnabledState>> getEnabledState() {
        return this.enabledState == null ? Input.empty() : this.enabledState;
    }

    @InputImport(name="matchConditions", required=true)
    private final Input<List<MatchConditionArgs>> matchConditions;

    public Input<List<MatchConditionArgs>> getMatchConditions() {
        return this.matchConditions;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="priority", required=true)
    private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    public CustomRuleArgs(
        Input<Either<String,ActionType>> action,
        @Nullable Input<Either<String,CustomRuleEnabledState>> enabledState,
        Input<List<MatchConditionArgs>> matchConditions,
        Input<String> name,
        Input<Integer> priority) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.enabledState = enabledState;
        this.matchConditions = Objects.requireNonNull(matchConditions, "expected parameter 'matchConditions' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
    }

    private CustomRuleArgs() {
        this.action = Input.empty();
        this.enabledState = Input.empty();
        this.matchConditions = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,ActionType>> action;
        private @Nullable Input<Either<String,CustomRuleEnabledState>> enabledState;
        private Input<List<MatchConditionArgs>> matchConditions;
        private Input<String> name;
        private Input<Integer> priority;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabledState = defaults.enabledState;
    	      this.matchConditions = defaults.matchConditions;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
        }

        public Builder setAction(Input<Either<String,ActionType>> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(Either<String,ActionType> action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setEnabledState(@Nullable Input<Either<String,CustomRuleEnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setEnabledState(@Nullable Either<String,CustomRuleEnabledState> enabledState) {
            this.enabledState = Input.ofNullable(enabledState);
            return this;
        }

        public Builder setMatchConditions(Input<List<MatchConditionArgs>> matchConditions) {
            this.matchConditions = Objects.requireNonNull(matchConditions);
            return this;
        }

        public Builder setMatchConditions(List<MatchConditionArgs> matchConditions) {
            this.matchConditions = Input.of(Objects.requireNonNull(matchConditions));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public CustomRuleArgs build() {
            return new CustomRuleArgs(action, enabledState, matchConditions, name, priority);
        }
    }
}
