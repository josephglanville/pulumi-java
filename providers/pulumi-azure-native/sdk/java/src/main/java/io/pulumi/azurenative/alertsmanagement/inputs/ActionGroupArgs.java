// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.azurenative.alertsmanagement.enums.ActionRuleStatus;
import io.pulumi.azurenative.alertsmanagement.inputs.ConditionsArgs;
import io.pulumi.azurenative.alertsmanagement.inputs.ScopeArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ActionGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActionGroupArgs Empty = new ActionGroupArgs();

    @InputImport(name="actionGroupId", required=true)
    private final Input<String> actionGroupId;

    public Input<String> getActionGroupId() {
        return this.actionGroupId;
    }

    @InputImport(name="conditions")
    private final @Nullable Input<ConditionsArgs> conditions;

    public Input<ConditionsArgs> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="scope")
    private final @Nullable Input<ScopeArgs> scope;

    public Input<ScopeArgs> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    @InputImport(name="status")
    private final @Nullable Input<Either<String,ActionRuleStatus>> status;

    public Input<Either<String,ActionRuleStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ActionGroupArgs(
        Input<String> actionGroupId,
        @Nullable Input<ConditionsArgs> conditions,
        @Nullable Input<String> description,
        @Nullable Input<ScopeArgs> scope,
        @Nullable Input<Either<String,ActionRuleStatus>> status,
        Input<String> type) {
        this.actionGroupId = Objects.requireNonNull(actionGroupId, "expected parameter 'actionGroupId' to be non-null");
        this.conditions = conditions;
        this.description = description;
        this.scope = scope;
        this.status = status;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ActionGroupArgs() {
        this.actionGroupId = Input.empty();
        this.conditions = Input.empty();
        this.description = Input.empty();
        this.scope = Input.empty();
        this.status = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> actionGroupId;
        private @Nullable Input<ConditionsArgs> conditions;
        private @Nullable Input<String> description;
        private @Nullable Input<ScopeArgs> scope;
        private @Nullable Input<Either<String,ActionRuleStatus>> status;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroupId = defaults.actionGroupId;
    	      this.conditions = defaults.conditions;
    	      this.description = defaults.description;
    	      this.scope = defaults.scope;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setActionGroupId(Input<String> actionGroupId) {
            this.actionGroupId = Objects.requireNonNull(actionGroupId);
            return this;
        }

        public Builder setActionGroupId(String actionGroupId) {
            this.actionGroupId = Input.of(Objects.requireNonNull(actionGroupId));
            return this;
        }

        public Builder setConditions(@Nullable Input<ConditionsArgs> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable ConditionsArgs conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setScope(@Nullable Input<ScopeArgs> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable ScopeArgs scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }

        public Builder setStatus(@Nullable Input<Either<String,ActionRuleStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,ActionRuleStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ActionGroupArgs build() {
            return new ActionGroupArgs(actionGroupId, conditions, description, scope, status, type);
        }
    }
}
