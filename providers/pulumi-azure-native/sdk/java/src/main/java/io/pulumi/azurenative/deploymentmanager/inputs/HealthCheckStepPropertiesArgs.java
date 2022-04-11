// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.RestHealthCheckStepAttributesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the properties of a health check step.
 * 
 */
public final class HealthCheckStepPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthCheckStepPropertiesArgs Empty = new HealthCheckStepPropertiesArgs();

    /**
     * The health check step attributes
     * 
     */
    @Import(name="attributes", required=true)
      private final Output<RestHealthCheckStepAttributesArgs> attributes;

    public Output<RestHealthCheckStepAttributesArgs> getAttributes() {
        return this.attributes;
    }

    /**
     * The type of step.
     * Expected value is 'HealthCheck'.
     * 
     */
    @Import(name="stepType", required=true)
      private final Output<String> stepType;

    public Output<String> getStepType() {
        return this.stepType;
    }

    public HealthCheckStepPropertiesArgs(
        Output<RestHealthCheckStepAttributesArgs> attributes,
        Output<String> stepType) {
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.stepType = Objects.requireNonNull(stepType, "expected parameter 'stepType' to be non-null");
    }

    private HealthCheckStepPropertiesArgs() {
        this.attributes = Codegen.empty();
        this.stepType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckStepPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RestHealthCheckStepAttributesArgs> attributes;
        private Output<String> stepType;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckStepPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.stepType = defaults.stepType;
        }

        public Builder attributes(Output<RestHealthCheckStepAttributesArgs> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder attributes(RestHealthCheckStepAttributesArgs attributes) {
            this.attributes = Output.of(Objects.requireNonNull(attributes));
            return this;
        }
        public Builder stepType(Output<String> stepType) {
            this.stepType = Objects.requireNonNull(stepType);
            return this;
        }
        public Builder stepType(String stepType) {
            this.stepType = Output.of(Objects.requireNonNull(stepType));
            return this;
        }        public HealthCheckStepPropertiesArgs build() {
            return new HealthCheckStepPropertiesArgs(attributes, stepType);
        }
    }
}
