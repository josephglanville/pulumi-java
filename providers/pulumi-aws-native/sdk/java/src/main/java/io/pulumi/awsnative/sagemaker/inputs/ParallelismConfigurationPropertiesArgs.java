// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class ParallelismConfigurationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParallelismConfigurationPropertiesArgs Empty = new ParallelismConfigurationPropertiesArgs();

    /**
     * Maximum parallel execution steps
     * 
     */
    @InputImport(name="maxParallelExecutionSteps", required=true)
      private final Input<Integer> maxParallelExecutionSteps;

    public Input<Integer> getMaxParallelExecutionSteps() {
        return this.maxParallelExecutionSteps;
    }

    public ParallelismConfigurationPropertiesArgs(Input<Integer> maxParallelExecutionSteps) {
        this.maxParallelExecutionSteps = Objects.requireNonNull(maxParallelExecutionSteps, "expected parameter 'maxParallelExecutionSteps' to be non-null");
    }

    private ParallelismConfigurationPropertiesArgs() {
        this.maxParallelExecutionSteps = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParallelismConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxParallelExecutionSteps;

        public Builder() {
    	      // Empty
        }

        public Builder(ParallelismConfigurationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxParallelExecutionSteps = defaults.maxParallelExecutionSteps;
        }

        public Builder setMaxParallelExecutionSteps(Input<Integer> maxParallelExecutionSteps) {
            this.maxParallelExecutionSteps = Objects.requireNonNull(maxParallelExecutionSteps);
            return this;
        }

        public Builder setMaxParallelExecutionSteps(Integer maxParallelExecutionSteps) {
            this.maxParallelExecutionSteps = Input.of(Objects.requireNonNull(maxParallelExecutionSteps));
            return this;
        }
        public ParallelismConfigurationPropertiesArgs build() {
            return new ParallelismConfigurationPropertiesArgs(maxParallelExecutionSteps);
        }
    }
}
