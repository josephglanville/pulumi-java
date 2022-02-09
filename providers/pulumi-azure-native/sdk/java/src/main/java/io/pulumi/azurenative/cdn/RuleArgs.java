// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.cdn.enums.MatchProcessingBehavior;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleCacheExpirationActionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleCacheKeyQueryStringActionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleCookiesConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleHttpVersionConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleIsDeviceConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRulePostArgsConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleQueryStringConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRemoteAddressConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestBodyConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestHeaderActionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestHeaderConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestMethodConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestSchemeConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestUriConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleResponseHeaderActionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleUrlFileExtensionConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleUrlFileNameConditionArgs;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleUrlPathConditionArgs;
import io.pulumi.azurenative.cdn.inputs.OriginGroupOverrideActionArgs;
import io.pulumi.azurenative.cdn.inputs.UrlRedirectActionArgs;
import io.pulumi.azurenative.cdn.inputs.UrlRewriteActionArgs;
import io.pulumi.azurenative.cdn.inputs.UrlSigningActionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    @InputImport(name="actions", required=true)
    private final Input<List<Object>> actions;

    public Input<List<Object>> getActions() {
        return this.actions;
    }

    @InputImport(name="conditions")
    private final @Nullable Input<List<Object>> conditions;

    public Input<List<Object>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    @InputImport(name="matchProcessingBehavior")
    private final @Nullable Input<Either<String,MatchProcessingBehavior>> matchProcessingBehavior;

    public Input<Either<String,MatchProcessingBehavior>> getMatchProcessingBehavior() {
        return this.matchProcessingBehavior == null ? Input.empty() : this.matchProcessingBehavior;
    }

    @InputImport(name="order", required=true)
    private final Input<Integer> order;

    public Input<Integer> getOrder() {
        return this.order;
    }

    @InputImport(name="profileName", required=true)
    private final Input<String> profileName;

    public Input<String> getProfileName() {
        return this.profileName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="ruleName")
    private final @Nullable Input<String> ruleName;

    public Input<String> getRuleName() {
        return this.ruleName == null ? Input.empty() : this.ruleName;
    }

    @InputImport(name="ruleSetName", required=true)
    private final Input<String> ruleSetName;

    public Input<String> getRuleSetName() {
        return this.ruleSetName;
    }

    public RuleArgs(
        Input<List<Object>> actions,
        @Nullable Input<List<Object>> conditions,
        @Nullable Input<Either<String,MatchProcessingBehavior>> matchProcessingBehavior,
        Input<Integer> order,
        Input<String> profileName,
        Input<String> resourceGroupName,
        @Nullable Input<String> ruleName,
        Input<String> ruleSetName) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.conditions = conditions;
        this.matchProcessingBehavior = matchProcessingBehavior;
        this.order = Objects.requireNonNull(order, "expected parameter 'order' to be non-null");
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = ruleName;
        this.ruleSetName = Objects.requireNonNull(ruleSetName, "expected parameter 'ruleSetName' to be non-null");
    }

    private RuleArgs() {
        this.actions = Input.empty();
        this.conditions = Input.empty();
        this.matchProcessingBehavior = Input.empty();
        this.order = Input.empty();
        this.profileName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleName = Input.empty();
        this.ruleSetName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<Object>> actions;
        private @Nullable Input<List<Object>> conditions;
        private @Nullable Input<Either<String,MatchProcessingBehavior>> matchProcessingBehavior;
        private Input<Integer> order;
        private Input<String> profileName;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> ruleName;
        private Input<String> ruleSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.conditions = defaults.conditions;
    	      this.matchProcessingBehavior = defaults.matchProcessingBehavior;
    	      this.order = defaults.order;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
    	      this.ruleSetName = defaults.ruleSetName;
        }

        public Builder setActions(Input<List<Object>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setActions(List<Object> actions) {
            this.actions = Input.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder setConditions(@Nullable Input<List<Object>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<Object> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setMatchProcessingBehavior(@Nullable Input<Either<String,MatchProcessingBehavior>> matchProcessingBehavior) {
            this.matchProcessingBehavior = matchProcessingBehavior;
            return this;
        }

        public Builder setMatchProcessingBehavior(@Nullable Either<String,MatchProcessingBehavior> matchProcessingBehavior) {
            this.matchProcessingBehavior = Input.ofNullable(matchProcessingBehavior);
            return this;
        }

        public Builder setOrder(Input<Integer> order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }

        public Builder setOrder(Integer order) {
            this.order = Input.of(Objects.requireNonNull(order));
            return this;
        }

        public Builder setProfileName(Input<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = Input.of(Objects.requireNonNull(profileName));
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

        public Builder setRuleName(@Nullable Input<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public Builder setRuleName(@Nullable String ruleName) {
            this.ruleName = Input.ofNullable(ruleName);
            return this;
        }

        public Builder setRuleSetName(Input<String> ruleSetName) {
            this.ruleSetName = Objects.requireNonNull(ruleSetName);
            return this;
        }

        public Builder setRuleSetName(String ruleSetName) {
            this.ruleSetName = Input.of(Objects.requireNonNull(ruleSetName));
            return this;
        }

        public RuleArgs build() {
            return new RuleArgs(actions, conditions, matchProcessingBehavior, order, profileName, resourceGroupName, ruleName, ruleSetName);
        }
    }
}
