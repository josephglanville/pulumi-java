// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.DeliveryRuleResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A policy that specifies the delivery rules to be used for an endpoint.
 * 
 */
public final class EndpointPropertiesUpdateParametersResponseDeliveryPolicy extends io.pulumi.resources.InvokeArgs {

    public static final EndpointPropertiesUpdateParametersResponseDeliveryPolicy Empty = new EndpointPropertiesUpdateParametersResponseDeliveryPolicy();

    /**
     * User-friendly description of the policy.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * A list of the delivery rules.
     * 
     */
    @Import(name="rules", required=true)
      private final List<DeliveryRuleResponse> rules;

    public List<DeliveryRuleResponse> getRules() {
        return this.rules;
    }

    public EndpointPropertiesUpdateParametersResponseDeliveryPolicy(
        @Nullable String description,
        List<DeliveryRuleResponse> rules) {
        this.description = description;
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private EndpointPropertiesUpdateParametersResponseDeliveryPolicy() {
        this.description = null;
        this.rules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPropertiesUpdateParametersResponseDeliveryPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private List<DeliveryRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPropertiesUpdateParametersResponseDeliveryPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.rules = defaults.rules;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder rules(List<DeliveryRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(DeliveryRuleResponse... rules) {
            return rules(List.of(rules));
        }        public EndpointPropertiesUpdateParametersResponseDeliveryPolicy build() {
            return new EndpointPropertiesUpdateParametersResponseDeliveryPolicy(description, rules);
        }
    }
}
