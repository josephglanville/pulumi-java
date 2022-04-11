// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalingPolicySecondaryWorkerConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicySecondaryWorkerConfigGetArgs Empty = new AutoscalingPolicySecondaryWorkerConfigGetArgs();

    /**
     * Maximum number of instances for this group. Note that by default, clusters will not use
     * secondary workers. Required for secondary workers if the minimum secondary instances is set.
     * Bounds: [minInstances, ). Defaults to 0.
     * 
     */
    @Import(name="maxInstances")
      private final @Nullable Output<Integer> maxInstances;

    public Output<Integer> getMaxInstances() {
        return this.maxInstances == null ? Codegen.empty() : this.maxInstances;
    }

    /**
     * Minimum number of instances for this group. Bounds: [0, maxInstances]. Defaults to 0.
     * 
     */
    @Import(name="minInstances")
      private final @Nullable Output<Integer> minInstances;

    public Output<Integer> getMinInstances() {
        return this.minInstances == null ? Codegen.empty() : this.minInstances;
    }

    /**
     * Weight for the instance group, which is used to determine the fraction of total workers
     * in the cluster from this instance group. For example, if primary workers have weight 2,
     * and secondary workers have weight 1, the cluster will have approximately 2 primary workers
     * for each secondary worker.
     * The cluster may not reach the specified balance if constrained by min/max bounds or other
     * autoscaling settings. For example, if maxInstances for secondary workers is 0, then only
     * primary workers will be added. The cluster can also be out of balance when created.
     * If weight is not set on any instance group, the cluster will default to equal weight for
     * all groups: the cluster will attempt to maintain an equal number of workers in each group
     * within the configured size bounds for each group. If weight is set for one group only,
     * the cluster will default to zero weight on the unset group. For example if weight is set
     * only on primary workers, the cluster will use primary workers only and no secondary workers.
     * 
     */
    @Import(name="weight")
      private final @Nullable Output<Integer> weight;

    public Output<Integer> getWeight() {
        return this.weight == null ? Codegen.empty() : this.weight;
    }

    public AutoscalingPolicySecondaryWorkerConfigGetArgs(
        @Nullable Output<Integer> maxInstances,
        @Nullable Output<Integer> minInstances,
        @Nullable Output<Integer> weight) {
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.weight = weight;
    }

    private AutoscalingPolicySecondaryWorkerConfigGetArgs() {
        this.maxInstances = Codegen.empty();
        this.minInstances = Codegen.empty();
        this.weight = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicySecondaryWorkerConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxInstances;
        private @Nullable Output<Integer> minInstances;
        private @Nullable Output<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicySecondaryWorkerConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.weight = defaults.weight;
        }

        public Builder maxInstances(@Nullable Output<Integer> maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Builder maxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = Codegen.ofNullable(maxInstances);
            return this;
        }
        public Builder minInstances(@Nullable Output<Integer> minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Builder minInstances(@Nullable Integer minInstances) {
            this.minInstances = Codegen.ofNullable(minInstances);
            return this;
        }
        public Builder weight(@Nullable Output<Integer> weight) {
            this.weight = weight;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = Codegen.ofNullable(weight);
            return this;
        }        public AutoscalingPolicySecondaryWorkerConfigGetArgs build() {
            return new AutoscalingPolicySecondaryWorkerConfigGetArgs(maxInstances, minInstances, weight);
        }
    }
}
