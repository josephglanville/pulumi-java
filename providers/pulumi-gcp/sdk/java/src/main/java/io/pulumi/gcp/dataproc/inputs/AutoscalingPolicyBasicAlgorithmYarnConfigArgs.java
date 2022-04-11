// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalingPolicyBasicAlgorithmYarnConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyBasicAlgorithmYarnConfigArgs Empty = new AutoscalingPolicyBasicAlgorithmYarnConfigArgs();

    /**
     * Timeout for YARN graceful decommissioning of Node Managers. Specifies the
     * duration to wait for jobs to complete before forcefully removing workers
     * (and potentially interrupting jobs). Only applicable to downscaling operations.
     * Bounds: [0s, 1d].
     * 
     */
    @Import(name="gracefulDecommissionTimeout", required=true)
      private final Output<String> gracefulDecommissionTimeout;

    public Output<String> getGracefulDecommissionTimeout() {
        return this.gracefulDecommissionTimeout;
    }

    /**
     * Fraction of average pending memory in the last cooldown period for which to
     * remove workers. A scale-down factor of 1 will result in scaling down so that there
     * is no available memory remaining after the update (more aggressive scaling).
     * A scale-down factor of 0 disables removing workers, which can be beneficial for
     * autoscaling a single job.
     * Bounds: [0.0, 1.0].
     * 
     */
    @Import(name="scaleDownFactor", required=true)
      private final Output<Double> scaleDownFactor;

    public Output<Double> getScaleDownFactor() {
        return this.scaleDownFactor;
    }

    /**
     * Minimum scale-down threshold as a fraction of total cluster size before scaling occurs.
     * For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must
     * recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0
     * means the autoscaler will scale down on any recommended change.
     * Bounds: [0.0, 1.0]. Default: 0.0.
     * 
     */
    @Import(name="scaleDownMinWorkerFraction")
      private final @Nullable Output<Double> scaleDownMinWorkerFraction;

    public Output<Double> getScaleDownMinWorkerFraction() {
        return this.scaleDownMinWorkerFraction == null ? Codegen.empty() : this.scaleDownMinWorkerFraction;
    }

    /**
     * Fraction of average pending memory in the last cooldown period for which to
     * add workers. A scale-up factor of 1.0 will result in scaling up so that there
     * is no pending memory remaining after the update (more aggressive scaling).
     * A scale-up factor closer to 0 will result in a smaller magnitude of scaling up
     * (less aggressive scaling).
     * Bounds: [0.0, 1.0].
     * 
     */
    @Import(name="scaleUpFactor", required=true)
      private final Output<Double> scaleUpFactor;

    public Output<Double> getScaleUpFactor() {
        return this.scaleUpFactor;
    }

    /**
     * Minimum scale-up threshold as a fraction of total cluster size before scaling
     * occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler
     * must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of
     * 0 means the autoscaler will scale up on any recommended change.
     * Bounds: [0.0, 1.0]. Default: 0.0.
     * 
     */
    @Import(name="scaleUpMinWorkerFraction")
      private final @Nullable Output<Double> scaleUpMinWorkerFraction;

    public Output<Double> getScaleUpMinWorkerFraction() {
        return this.scaleUpMinWorkerFraction == null ? Codegen.empty() : this.scaleUpMinWorkerFraction;
    }

    public AutoscalingPolicyBasicAlgorithmYarnConfigArgs(
        Output<String> gracefulDecommissionTimeout,
        Output<Double> scaleDownFactor,
        @Nullable Output<Double> scaleDownMinWorkerFraction,
        Output<Double> scaleUpFactor,
        @Nullable Output<Double> scaleUpMinWorkerFraction) {
        this.gracefulDecommissionTimeout = Objects.requireNonNull(gracefulDecommissionTimeout, "expected parameter 'gracefulDecommissionTimeout' to be non-null");
        this.scaleDownFactor = Objects.requireNonNull(scaleDownFactor, "expected parameter 'scaleDownFactor' to be non-null");
        this.scaleDownMinWorkerFraction = scaleDownMinWorkerFraction;
        this.scaleUpFactor = Objects.requireNonNull(scaleUpFactor, "expected parameter 'scaleUpFactor' to be non-null");
        this.scaleUpMinWorkerFraction = scaleUpMinWorkerFraction;
    }

    private AutoscalingPolicyBasicAlgorithmYarnConfigArgs() {
        this.gracefulDecommissionTimeout = Codegen.empty();
        this.scaleDownFactor = Codegen.empty();
        this.scaleDownMinWorkerFraction = Codegen.empty();
        this.scaleUpFactor = Codegen.empty();
        this.scaleUpMinWorkerFraction = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyBasicAlgorithmYarnConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> gracefulDecommissionTimeout;
        private Output<Double> scaleDownFactor;
        private @Nullable Output<Double> scaleDownMinWorkerFraction;
        private Output<Double> scaleUpFactor;
        private @Nullable Output<Double> scaleUpMinWorkerFraction;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyBasicAlgorithmYarnConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gracefulDecommissionTimeout = defaults.gracefulDecommissionTimeout;
    	      this.scaleDownFactor = defaults.scaleDownFactor;
    	      this.scaleDownMinWorkerFraction = defaults.scaleDownMinWorkerFraction;
    	      this.scaleUpFactor = defaults.scaleUpFactor;
    	      this.scaleUpMinWorkerFraction = defaults.scaleUpMinWorkerFraction;
        }

        public Builder gracefulDecommissionTimeout(Output<String> gracefulDecommissionTimeout) {
            this.gracefulDecommissionTimeout = Objects.requireNonNull(gracefulDecommissionTimeout);
            return this;
        }
        public Builder gracefulDecommissionTimeout(String gracefulDecommissionTimeout) {
            this.gracefulDecommissionTimeout = Output.of(Objects.requireNonNull(gracefulDecommissionTimeout));
            return this;
        }
        public Builder scaleDownFactor(Output<Double> scaleDownFactor) {
            this.scaleDownFactor = Objects.requireNonNull(scaleDownFactor);
            return this;
        }
        public Builder scaleDownFactor(Double scaleDownFactor) {
            this.scaleDownFactor = Output.of(Objects.requireNonNull(scaleDownFactor));
            return this;
        }
        public Builder scaleDownMinWorkerFraction(@Nullable Output<Double> scaleDownMinWorkerFraction) {
            this.scaleDownMinWorkerFraction = scaleDownMinWorkerFraction;
            return this;
        }
        public Builder scaleDownMinWorkerFraction(@Nullable Double scaleDownMinWorkerFraction) {
            this.scaleDownMinWorkerFraction = Codegen.ofNullable(scaleDownMinWorkerFraction);
            return this;
        }
        public Builder scaleUpFactor(Output<Double> scaleUpFactor) {
            this.scaleUpFactor = Objects.requireNonNull(scaleUpFactor);
            return this;
        }
        public Builder scaleUpFactor(Double scaleUpFactor) {
            this.scaleUpFactor = Output.of(Objects.requireNonNull(scaleUpFactor));
            return this;
        }
        public Builder scaleUpMinWorkerFraction(@Nullable Output<Double> scaleUpMinWorkerFraction) {
            this.scaleUpMinWorkerFraction = scaleUpMinWorkerFraction;
            return this;
        }
        public Builder scaleUpMinWorkerFraction(@Nullable Double scaleUpMinWorkerFraction) {
            this.scaleUpMinWorkerFraction = Codegen.ofNullable(scaleUpMinWorkerFraction);
            return this;
        }        public AutoscalingPolicyBasicAlgorithmYarnConfigArgs build() {
            return new AutoscalingPolicyBasicAlgorithmYarnConfigArgs(gracefulDecommissionTimeout, scaleDownFactor, scaleDownMinWorkerFraction, scaleUpFactor, scaleUpMinWorkerFraction);
        }
    }
}
