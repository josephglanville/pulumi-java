// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.PostArgsMatchConditionParametersResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the PostArgs condition for the delivery rule.
 * 
 */
public final class DeliveryRulePostArgsConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryRulePostArgsConditionResponse Empty = new DeliveryRulePostArgsConditionResponse();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'PostArgs'.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @InputImport(name="parameters", required=true)
      private final PostArgsMatchConditionParametersResponse parameters;

    public PostArgsMatchConditionParametersResponse getParameters() {
        return this.parameters;
    }

    public DeliveryRulePostArgsConditionResponse(
        String name,
        PostArgsMatchConditionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRulePostArgsConditionResponse() {
        this.name = null;
        this.parameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRulePostArgsConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private PostArgsMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRulePostArgsConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(PostArgsMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public DeliveryRulePostArgsConditionResponse build() {
            return new DeliveryRulePostArgsConditionResponse(name, parameters);
        }
    }
}
