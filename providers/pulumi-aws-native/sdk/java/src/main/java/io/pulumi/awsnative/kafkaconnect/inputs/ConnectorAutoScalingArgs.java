// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorScaleInPolicyArgs;
import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorScaleOutPolicyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Details about auto scaling of a connector.
 * 
 */
public final class ConnectorAutoScalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorAutoScalingArgs Empty = new ConnectorAutoScalingArgs();

    /**
     * The maximum number of workers for a connector.
     * 
     */
    @InputImport(name="maxWorkerCount", required=true)
      private final Output<Integer> maxWorkerCount;

    public Output<Integer> getMaxWorkerCount() {
        return this.maxWorkerCount;
    }

    /**
     * Specifies how many MSK Connect Units (MCU) as the minimum scaling unit.
     * 
     */
    @InputImport(name="mcuCount", required=true)
      private final Output<Integer> mcuCount;

    public Output<Integer> getMcuCount() {
        return this.mcuCount;
    }

    /**
     * The minimum number of workers for a connector.
     * 
     */
    @InputImport(name="minWorkerCount", required=true)
      private final Output<Integer> minWorkerCount;

    public Output<Integer> getMinWorkerCount() {
        return this.minWorkerCount;
    }

    @InputImport(name="scaleInPolicy", required=true)
      private final Output<ConnectorScaleInPolicyArgs> scaleInPolicy;

    public Output<ConnectorScaleInPolicyArgs> getScaleInPolicy() {
        return this.scaleInPolicy;
    }

    @InputImport(name="scaleOutPolicy", required=true)
      private final Output<ConnectorScaleOutPolicyArgs> scaleOutPolicy;

    public Output<ConnectorScaleOutPolicyArgs> getScaleOutPolicy() {
        return this.scaleOutPolicy;
    }

    public ConnectorAutoScalingArgs(
        Output<Integer> maxWorkerCount,
        Output<Integer> mcuCount,
        Output<Integer> minWorkerCount,
        Output<ConnectorScaleInPolicyArgs> scaleInPolicy,
        Output<ConnectorScaleOutPolicyArgs> scaleOutPolicy) {
        this.maxWorkerCount = Objects.requireNonNull(maxWorkerCount, "expected parameter 'maxWorkerCount' to be non-null");
        this.mcuCount = Objects.requireNonNull(mcuCount, "expected parameter 'mcuCount' to be non-null");
        this.minWorkerCount = Objects.requireNonNull(minWorkerCount, "expected parameter 'minWorkerCount' to be non-null");
        this.scaleInPolicy = Objects.requireNonNull(scaleInPolicy, "expected parameter 'scaleInPolicy' to be non-null");
        this.scaleOutPolicy = Objects.requireNonNull(scaleOutPolicy, "expected parameter 'scaleOutPolicy' to be non-null");
    }

    private ConnectorAutoScalingArgs() {
        this.maxWorkerCount = Output.empty();
        this.mcuCount = Output.empty();
        this.minWorkerCount = Output.empty();
        this.scaleInPolicy = Output.empty();
        this.scaleOutPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorAutoScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxWorkerCount;
        private Output<Integer> mcuCount;
        private Output<Integer> minWorkerCount;
        private Output<ConnectorScaleInPolicyArgs> scaleInPolicy;
        private Output<ConnectorScaleOutPolicyArgs> scaleOutPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorAutoScalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxWorkerCount = defaults.maxWorkerCount;
    	      this.mcuCount = defaults.mcuCount;
    	      this.minWorkerCount = defaults.minWorkerCount;
    	      this.scaleInPolicy = defaults.scaleInPolicy;
    	      this.scaleOutPolicy = defaults.scaleOutPolicy;
        }

        public Builder maxWorkerCount(Output<Integer> maxWorkerCount) {
            this.maxWorkerCount = Objects.requireNonNull(maxWorkerCount);
            return this;
        }

        public Builder maxWorkerCount(Integer maxWorkerCount) {
            this.maxWorkerCount = Output.of(Objects.requireNonNull(maxWorkerCount));
            return this;
        }

        public Builder mcuCount(Output<Integer> mcuCount) {
            this.mcuCount = Objects.requireNonNull(mcuCount);
            return this;
        }

        public Builder mcuCount(Integer mcuCount) {
            this.mcuCount = Output.of(Objects.requireNonNull(mcuCount));
            return this;
        }

        public Builder minWorkerCount(Output<Integer> minWorkerCount) {
            this.minWorkerCount = Objects.requireNonNull(minWorkerCount);
            return this;
        }

        public Builder minWorkerCount(Integer minWorkerCount) {
            this.minWorkerCount = Output.of(Objects.requireNonNull(minWorkerCount));
            return this;
        }

        public Builder scaleInPolicy(Output<ConnectorScaleInPolicyArgs> scaleInPolicy) {
            this.scaleInPolicy = Objects.requireNonNull(scaleInPolicy);
            return this;
        }

        public Builder scaleInPolicy(ConnectorScaleInPolicyArgs scaleInPolicy) {
            this.scaleInPolicy = Output.of(Objects.requireNonNull(scaleInPolicy));
            return this;
        }

        public Builder scaleOutPolicy(Output<ConnectorScaleOutPolicyArgs> scaleOutPolicy) {
            this.scaleOutPolicy = Objects.requireNonNull(scaleOutPolicy);
            return this;
        }

        public Builder scaleOutPolicy(ConnectorScaleOutPolicyArgs scaleOutPolicy) {
            this.scaleOutPolicy = Output.of(Objects.requireNonNull(scaleOutPolicy));
            return this;
        }
        public ConnectorAutoScalingArgs build() {
            return new ConnectorAutoScalingArgs(maxWorkerCount, mcuCount, minWorkerCount, scaleInPolicy, scaleOutPolicy);
        }
    }
}
