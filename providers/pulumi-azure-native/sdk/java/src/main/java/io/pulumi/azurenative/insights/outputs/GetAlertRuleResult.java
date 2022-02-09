// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.LocationThresholdRuleConditionResponse;
import io.pulumi.azurenative.insights.outputs.ManagementEventRuleConditionResponse;
import io.pulumi.azurenative.insights.outputs.RuleEmailActionResponse;
import io.pulumi.azurenative.insights.outputs.RuleWebhookActionResponse;
import io.pulumi.azurenative.insights.outputs.ThresholdRuleConditionResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAlertRuleResult {
    private final @Nullable Either<RuleEmailActionResponse,RuleWebhookActionResponse> action;
    private final @Nullable List<Either<RuleEmailActionResponse,RuleWebhookActionResponse>> actions;
    private final Object condition;
    private final @Nullable String description;
    private final String id;
    private final Boolean isEnabled;
    private final String lastUpdatedTime;
    private final String location;
    private final String name;
    private final @Nullable String provisioningState;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"action","actions","condition","description","id","isEnabled","lastUpdatedTime","location","name","provisioningState","tags","type"})
    private GetAlertRuleResult(
        @Nullable Either<RuleEmailActionResponse,RuleWebhookActionResponse> action,
        @Nullable List<Either<RuleEmailActionResponse,RuleWebhookActionResponse>> actions,
        Object condition,
        @Nullable String description,
        String id,
        Boolean isEnabled,
        String lastUpdatedTime,
        String location,
        String name,
        @Nullable String provisioningState,
        @Nullable Map<String,String> tags,
        String type) {
        this.action = action;
        this.actions = actions;
        this.condition = Objects.requireNonNull(condition);
        this.description = description;
        this.id = Objects.requireNonNull(id);
        this.isEnabled = Objects.requireNonNull(isEnabled);
        this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<Either<RuleEmailActionResponse,RuleWebhookActionResponse>> getAction() {
        return Optional.ofNullable(this.action);
    }
    public List<Either<RuleEmailActionResponse,RuleWebhookActionResponse>> getActions() {
        return this.actions == null ? List.of() : this.actions;
    }
    public Object getCondition() {
        return this.condition;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getId() {
        return this.id;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<RuleEmailActionResponse,RuleWebhookActionResponse> action;
        private @Nullable List<Either<RuleEmailActionResponse,RuleWebhookActionResponse>> actions;
        private Object condition;
        private @Nullable String description;
        private String id;
        private Boolean isEnabled;
        private String lastUpdatedTime;
        private String location;
        private String name;
        private @Nullable String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlertRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.actions = defaults.actions;
    	      this.condition = defaults.condition;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.isEnabled = defaults.isEnabled;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAction(@Nullable Either<RuleEmailActionResponse,RuleWebhookActionResponse> action) {
            this.action = action;
            return this;
        }

        public Builder setActions(@Nullable List<Either<RuleEmailActionResponse,RuleWebhookActionResponse>> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setCondition(Object condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setLastUpdatedTime(String lastUpdatedTime) {
            this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetAlertRuleResult build() {
            return new GetAlertRuleResult(action, actions, condition, description, id, isEnabled, lastUpdatedTime, location, name, provisioningState, tags, type);
        }
    }
}
