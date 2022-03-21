// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.UrlPathMatchConditionParametersResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeliveryRuleUrlPathConditionResponse {
    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'UrlPath'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the condition.
     * 
     */
    private final UrlPathMatchConditionParametersResponse parameters;

    @CustomType.Constructor
    private DeliveryRuleUrlPathConditionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") UrlPathMatchConditionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'UrlPath'.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Defines the parameters for the condition.
     * 
    */
    public UrlPathMatchConditionParametersResponse getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleUrlPathConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private UrlPathMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleUrlPathConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(UrlPathMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public DeliveryRuleUrlPathConditionResponse build() {
            return new DeliveryRuleUrlPathConditionResponse(name, parameters);
        }
    }
}
