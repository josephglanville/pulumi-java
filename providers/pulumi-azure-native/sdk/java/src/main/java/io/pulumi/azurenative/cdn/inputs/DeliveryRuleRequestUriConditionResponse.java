// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.RequestUriMatchConditionParametersResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DeliveryRuleRequestUriConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleRequestUriConditionResponse Empty = new DeliveryRuleRequestUriConditionResponse();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="parameters", required=true)
    private final RequestUriMatchConditionParametersResponse parameters;

    public RequestUriMatchConditionParametersResponse getParameters() {
        return this.parameters;
    }

    public DeliveryRuleRequestUriConditionResponse(
        String name,
        RequestUriMatchConditionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleRequestUriConditionResponse() {
        this.name = null;
        this.parameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleRequestUriConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private RequestUriMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleRequestUriConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(RequestUriMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public DeliveryRuleRequestUriConditionResponse build() {
            return new DeliveryRuleRequestUriConditionResponse(name, parameters);
        }
    }
}
