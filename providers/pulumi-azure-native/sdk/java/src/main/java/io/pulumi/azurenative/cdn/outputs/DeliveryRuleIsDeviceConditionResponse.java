// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.IsDeviceMatchConditionParametersResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeliveryRuleIsDeviceConditionResponse {
    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'IsDevice'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the condition.
     * 
     */
    private final IsDeviceMatchConditionParametersResponse parameters;

    @CustomType.Constructor
    private DeliveryRuleIsDeviceConditionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") IsDeviceMatchConditionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'IsDevice'.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Defines the parameters for the condition.
     * 
    */
    public IsDeviceMatchConditionParametersResponse getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleIsDeviceConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private IsDeviceMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleIsDeviceConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(IsDeviceMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public DeliveryRuleIsDeviceConditionResponse build() {
            return new DeliveryRuleIsDeviceConditionResponse(name, parameters);
        }
    }
}
