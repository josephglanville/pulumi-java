// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.insights.inputs.ActionListArgs;
import io.pulumi.azurenative.insights.inputs.AlertRuleAllOfConditionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ActivityLogAlertArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActivityLogAlertArgs Empty = new ActivityLogAlertArgs();

    @InputImport(name="actions", required=true)
    private final Input<ActionListArgs> actions;

    public Input<ActionListArgs> getActions() {
        return this.actions;
    }

    @InputImport(name="activityLogAlertName")
    private final @Nullable Input<String> activityLogAlertName;

    public Input<String> getActivityLogAlertName() {
        return this.activityLogAlertName == null ? Input.empty() : this.activityLogAlertName;
    }

    @InputImport(name="condition", required=true)
    private final Input<AlertRuleAllOfConditionArgs> condition;

    public Input<AlertRuleAllOfConditionArgs> getCondition() {
        return this.condition;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="scopes", required=true)
    private final Input<List<String>> scopes;

    public Input<List<String>> getScopes() {
        return this.scopes;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ActivityLogAlertArgs(
        Input<ActionListArgs> actions,
        @Nullable Input<String> activityLogAlertName,
        Input<AlertRuleAllOfConditionArgs> condition,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        Input<List<String>> scopes,
        @Nullable Input<Map<String,String>> tags) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.activityLogAlertName = activityLogAlertName;
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
        this.description = description;
        this.enabled = enabled == null ? Input.ofNullable(true) : enabled;
        this.location = location == null ? Input.ofNullable("global") : location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scopes = Objects.requireNonNull(scopes, "expected parameter 'scopes' to be non-null");
        this.tags = tags;
    }

    private ActivityLogAlertArgs() {
        this.actions = Input.empty();
        this.activityLogAlertName = Input.empty();
        this.condition = Input.empty();
        this.description = Input.empty();
        this.enabled = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scopes = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityLogAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ActionListArgs> actions;
        private @Nullable Input<String> activityLogAlertName;
        private Input<AlertRuleAllOfConditionArgs> condition;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private Input<List<String>> scopes;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityLogAlertArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.activityLogAlertName = defaults.activityLogAlertName;
    	      this.condition = defaults.condition;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scopes = defaults.scopes;
    	      this.tags = defaults.tags;
        }

        public Builder setActions(Input<ActionListArgs> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setActions(ActionListArgs actions) {
            this.actions = Input.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder setActivityLogAlertName(@Nullable Input<String> activityLogAlertName) {
            this.activityLogAlertName = activityLogAlertName;
            return this;
        }

        public Builder setActivityLogAlertName(@Nullable String activityLogAlertName) {
            this.activityLogAlertName = Input.ofNullable(activityLogAlertName);
            return this;
        }

        public Builder setCondition(Input<AlertRuleAllOfConditionArgs> condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setCondition(AlertRuleAllOfConditionArgs condition) {
            this.condition = Input.of(Objects.requireNonNull(condition));
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

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setScopes(Input<List<String>> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }

        public Builder setScopes(List<String> scopes) {
            this.scopes = Input.of(Objects.requireNonNull(scopes));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ActivityLogAlertArgs build() {
            return new ActivityLogAlertArgs(actions, activityLogAlertName, condition, description, enabled, location, resourceGroupName, scopes, tags);
        }
    }
}
