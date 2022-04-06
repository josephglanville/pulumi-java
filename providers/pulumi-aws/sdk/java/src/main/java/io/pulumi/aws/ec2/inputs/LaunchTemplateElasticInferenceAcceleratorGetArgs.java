// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LaunchTemplateElasticInferenceAcceleratorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateElasticInferenceAcceleratorGetArgs Empty = new LaunchTemplateElasticInferenceAcceleratorGetArgs();

    /**
     * Accelerator type.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public LaunchTemplateElasticInferenceAcceleratorGetArgs(Output<String> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private LaunchTemplateElasticInferenceAcceleratorGetArgs() {
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateElasticInferenceAcceleratorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateElasticInferenceAcceleratorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public LaunchTemplateElasticInferenceAcceleratorGetArgs build() {
            return new LaunchTemplateElasticInferenceAcceleratorGetArgs(type);
        }
    }
}