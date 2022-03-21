// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class FlexibleAppVersionManualScalingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionManualScalingGetArgs Empty = new FlexibleAppVersionManualScalingGetArgs();

    /**
     * Number of instances to assign to the service at the start.
     * **Note:** When managing the number of instances at runtime through the App Engine Admin API or the (now deprecated) Python 2
     * Modules API set_num_instances() you must use `lifecycle.ignore_changes = ["manual_scaling"[0].instances]` to prevent drift detection.
     * 
     */
    @Import(name="instances", required=true)
      private final Output<Integer> instances;

    public Output<Integer> getInstances() {
        return this.instances;
    }

    public FlexibleAppVersionManualScalingGetArgs(Output<Integer> instances) {
        this.instances = Objects.requireNonNull(instances, "expected parameter 'instances' to be non-null");
    }

    private FlexibleAppVersionManualScalingGetArgs() {
        this.instances = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionManualScalingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> instances;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionManualScalingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
        }

        public Builder instances(Output<Integer> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(Integer instances) {
            this.instances = Output.of(Objects.requireNonNull(instances));
            return this;
        }        public FlexibleAppVersionManualScalingGetArgs build() {
            return new FlexibleAppVersionManualScalingGetArgs(instances);
        }
    }
}
