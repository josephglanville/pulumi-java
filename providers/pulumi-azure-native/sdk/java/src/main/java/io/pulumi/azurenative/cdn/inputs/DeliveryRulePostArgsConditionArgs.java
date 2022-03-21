// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.PostArgsMatchConditionParametersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the PostArgs condition for the delivery rule.
 * 
 */
public final class DeliveryRulePostArgsConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryRulePostArgsConditionArgs Empty = new DeliveryRulePostArgsConditionArgs();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'PostArgs'.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @Import(name="parameters", required=true)
      private final Output<PostArgsMatchConditionParametersArgs> parameters;

    public Output<PostArgsMatchConditionParametersArgs> getParameters() {
        return this.parameters;
    }

    public DeliveryRulePostArgsConditionArgs(
        Output<String> name,
        Output<PostArgsMatchConditionParametersArgs> parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRulePostArgsConditionArgs() {
        this.name = Output.empty();
        this.parameters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRulePostArgsConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<PostArgsMatchConditionParametersArgs> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRulePostArgsConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder parameters(Output<PostArgsMatchConditionParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(PostArgsMatchConditionParametersArgs parameters) {
            this.parameters = Output.of(Objects.requireNonNull(parameters));
            return this;
        }        public DeliveryRulePostArgsConditionArgs build() {
            return new DeliveryRulePostArgsConditionArgs(name, parameters);
        }
    }
}
