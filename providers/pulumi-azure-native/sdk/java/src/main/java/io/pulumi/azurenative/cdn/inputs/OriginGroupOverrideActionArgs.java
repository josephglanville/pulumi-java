// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.OriginGroupOverrideActionParametersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the origin group override action for the delivery rule.
 * 
 */
public final class OriginGroupOverrideActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginGroupOverrideActionArgs Empty = new OriginGroupOverrideActionArgs();

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'OriginGroupOverride'.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @Import(name="parameters", required=true)
      private final Output<OriginGroupOverrideActionParametersArgs> parameters;

    public Output<OriginGroupOverrideActionParametersArgs> getParameters() {
        return this.parameters;
    }

    public OriginGroupOverrideActionArgs(
        Output<String> name,
        Output<OriginGroupOverrideActionParametersArgs> parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private OriginGroupOverrideActionArgs() {
        this.name = Codegen.empty();
        this.parameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginGroupOverrideActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<OriginGroupOverrideActionParametersArgs> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginGroupOverrideActionArgs defaults) {
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
        public Builder parameters(Output<OriginGroupOverrideActionParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(OriginGroupOverrideActionParametersArgs parameters) {
            this.parameters = Output.of(Objects.requireNonNull(parameters));
            return this;
        }        public OriginGroupOverrideActionArgs build() {
            return new OriginGroupOverrideActionArgs(name, parameters);
        }
    }
}
