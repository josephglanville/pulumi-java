// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.DeliveryRuleCacheExpirationActionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleCacheKeyQueryStringActionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleCookiesConditionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleHttpVersionConditionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleIsDeviceConditionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRulePostArgsConditionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleQueryStringConditionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRemoteAddressConditionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestBodyConditionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestHeaderActionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestHeaderConditionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestMethodConditionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestSchemeConditionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleRequestUriConditionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleResponseHeaderActionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleUrlFileExtensionConditionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleUrlFileNameConditionResponse;
import io.pulumi.azurenative.cdn.inputs.DeliveryRuleUrlPathConditionResponse;
import io.pulumi.azurenative.cdn.inputs.OriginGroupOverrideActionResponse;
import io.pulumi.azurenative.cdn.inputs.UrlRedirectActionResponse;
import io.pulumi.azurenative.cdn.inputs.UrlRewriteActionResponse;
import io.pulumi.azurenative.cdn.inputs.UrlSigningActionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rule that specifies a set of actions and conditions
 * 
 */
public final class DeliveryRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleResponse Empty = new DeliveryRuleResponse();

    /**
     * A list of actions that are executed when all the conditions of a rule are satisfied.
     * 
     */
    @Import(name="actions", required=true)
      private final List<Object> actions;

    public List<Object> getActions() {
        return this.actions;
    }

    /**
     * A list of conditions that must be matched for the actions to be executed
     * 
     */
    @Import(name="conditions")
      private final @Nullable List<Object> conditions;

    public List<Object> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }

    /**
     * Name of the rule
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     * 
     */
    @Import(name="order", required=true)
      private final Integer order;

    public Integer getOrder() {
        return this.order;
    }

    public DeliveryRuleResponse(
        List<Object> actions,
        @Nullable List<Object> conditions,
        @Nullable String name,
        Integer order) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.conditions = conditions;
        this.name = name;
        this.order = Objects.requireNonNull(order, "expected parameter 'order' to be non-null");
    }

    private DeliveryRuleResponse() {
        this.actions = List.of();
        this.conditions = List.of();
        this.name = null;
        this.order = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Object> actions;
        private @Nullable List<Object> conditions;
        private @Nullable String name;
        private Integer order;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.conditions = defaults.conditions;
    	      this.name = defaults.name;
    	      this.order = defaults.order;
        }

        public Builder actions(List<Object> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(Object... actions) {
            return actions(List.of(actions));
        }
        public Builder conditions(@Nullable List<Object> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(Object... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder order(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }        public DeliveryRuleResponse build() {
            return new DeliveryRuleResponse(actions, conditions, name, order);
        }
    }
}
