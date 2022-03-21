// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.RequestSchemeMatchConditionParametersResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the RequestScheme condition for the delivery rule.
 * 
 */
public final class DeliveryRuleRequestSchemeConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleRequestSchemeConditionResponse Empty = new DeliveryRuleRequestSchemeConditionResponse();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'RequestScheme'.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @Import(name="parameters", required=true)
      private final RequestSchemeMatchConditionParametersResponse parameters;

    public RequestSchemeMatchConditionParametersResponse getParameters() {
        return this.parameters;
    }

    public DeliveryRuleRequestSchemeConditionResponse(
        String name,
        RequestSchemeMatchConditionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleRequestSchemeConditionResponse() {
        this.name = null;
        this.parameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleRequestSchemeConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private RequestSchemeMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleRequestSchemeConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(RequestSchemeMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public DeliveryRuleRequestSchemeConditionResponse build() {
            return new DeliveryRuleRequestSchemeConditionResponse(name, parameters);
        }
    }
}
