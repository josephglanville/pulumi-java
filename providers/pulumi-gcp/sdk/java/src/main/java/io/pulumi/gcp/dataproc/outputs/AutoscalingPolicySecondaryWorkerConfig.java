// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscalingPolicySecondaryWorkerConfig {
    /**
     * Maximum number of instances for this group. Note that by default, clusters will not use
     * secondary workers. Required for secondary workers if the minimum secondary instances is set.
     * Bounds: [minInstances, ). Defaults to 0.
     * 
     */
    private final @Nullable Integer maxInstances;
    /**
     * Minimum number of instances for this group. Bounds: [0, maxInstances]. Defaults to 0.
     * 
     */
    private final @Nullable Integer minInstances;
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
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private AutoscalingPolicySecondaryWorkerConfig(
        @CustomType.Parameter("maxInstances") @Nullable Integer maxInstances,
        @CustomType.Parameter("minInstances") @Nullable Integer minInstances,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.weight = weight;
    }

    /**
     * Maximum number of instances for this group. Note that by default, clusters will not use
     * secondary workers. Required for secondary workers if the minimum secondary instances is set.
     * Bounds: [minInstances, ). Defaults to 0.
     * 
    */
    public Optional<Integer> getMaxInstances() {
        return Optional.ofNullable(this.maxInstances);
    }
    /**
     * Minimum number of instances for this group. Bounds: [0, maxInstances]. Defaults to 0.
     * 
    */
    public Optional<Integer> getMinInstances() {
        return Optional.ofNullable(this.minInstances);
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
    public Optional<Integer> getWeight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicySecondaryWorkerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxInstances;
        private @Nullable Integer minInstances;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicySecondaryWorkerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.weight = defaults.weight;
        }

        public Builder maxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Builder minInstances(@Nullable Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public AutoscalingPolicySecondaryWorkerConfig build() {
            return new AutoscalingPolicySecondaryWorkerConfig(maxInstances, minInstances, weight);
        }
    }
}
