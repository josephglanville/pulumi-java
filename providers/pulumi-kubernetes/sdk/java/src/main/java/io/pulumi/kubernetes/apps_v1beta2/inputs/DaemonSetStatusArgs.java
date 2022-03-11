// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.apps_v1beta2.inputs.DaemonSetConditionArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DaemonSetStatus represents the current status of a daemon set.
 * 
 */
public final class DaemonSetStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final DaemonSetStatusArgs Empty = new DaemonSetStatusArgs();

    /**
     * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    @InputImport(name="collisionCount")
      private final @Nullable Output<Integer> collisionCount;

    public Output<Integer> getCollisionCount() {
        return this.collisionCount == null ? Output.empty() : this.collisionCount;
    }

    /**
     * Represents the latest available observations of a DaemonSet's current state.
     * 
     */
    @InputImport(name="conditions")
      private final @Nullable Output<List<DaemonSetConditionArgs>> conditions;

    public Output<List<DaemonSetConditionArgs>> getConditions() {
        return this.conditions == null ? Output.empty() : this.conditions;
    }

    /**
     * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    @InputImport(name="currentNumberScheduled", required=true)
      private final Output<Integer> currentNumberScheduled;

    public Output<Integer> getCurrentNumberScheduled() {
        return this.currentNumberScheduled;
    }

    /**
     * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    @InputImport(name="desiredNumberScheduled", required=true)
      private final Output<Integer> desiredNumberScheduled;

    public Output<Integer> getDesiredNumberScheduled() {
        return this.desiredNumberScheduled;
    }

    /**
     * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
     * 
     */
    @InputImport(name="numberAvailable")
      private final @Nullable Output<Integer> numberAvailable;

    public Output<Integer> getNumberAvailable() {
        return this.numberAvailable == null ? Output.empty() : this.numberAvailable;
    }

    /**
     * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
     * 
     */
    @InputImport(name="numberMisscheduled", required=true)
      private final Output<Integer> numberMisscheduled;

    public Output<Integer> getNumberMisscheduled() {
        return this.numberMisscheduled;
    }

    /**
     * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.
     * 
     */
    @InputImport(name="numberReady", required=true)
      private final Output<Integer> numberReady;

    public Output<Integer> getNumberReady() {
        return this.numberReady;
    }

    /**
     * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
     * 
     */
    @InputImport(name="numberUnavailable")
      private final @Nullable Output<Integer> numberUnavailable;

    public Output<Integer> getNumberUnavailable() {
        return this.numberUnavailable == null ? Output.empty() : this.numberUnavailable;
    }

    /**
     * The most recent generation observed by the daemon set controller.
     * 
     */
    @InputImport(name="observedGeneration")
      private final @Nullable Output<Integer> observedGeneration;

    public Output<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Output.empty() : this.observedGeneration;
    }

    /**
     * The total number of nodes that are running updated daemon pod
     * 
     */
    @InputImport(name="updatedNumberScheduled")
      private final @Nullable Output<Integer> updatedNumberScheduled;

    public Output<Integer> getUpdatedNumberScheduled() {
        return this.updatedNumberScheduled == null ? Output.empty() : this.updatedNumberScheduled;
    }

    public DaemonSetStatusArgs(
        @Nullable Output<Integer> collisionCount,
        @Nullable Output<List<DaemonSetConditionArgs>> conditions,
        Output<Integer> currentNumberScheduled,
        Output<Integer> desiredNumberScheduled,
        @Nullable Output<Integer> numberAvailable,
        Output<Integer> numberMisscheduled,
        Output<Integer> numberReady,
        @Nullable Output<Integer> numberUnavailable,
        @Nullable Output<Integer> observedGeneration,
        @Nullable Output<Integer> updatedNumberScheduled) {
        this.collisionCount = collisionCount;
        this.conditions = conditions;
        this.currentNumberScheduled = Objects.requireNonNull(currentNumberScheduled, "expected parameter 'currentNumberScheduled' to be non-null");
        this.desiredNumberScheduled = Objects.requireNonNull(desiredNumberScheduled, "expected parameter 'desiredNumberScheduled' to be non-null");
        this.numberAvailable = numberAvailable;
        this.numberMisscheduled = Objects.requireNonNull(numberMisscheduled, "expected parameter 'numberMisscheduled' to be non-null");
        this.numberReady = Objects.requireNonNull(numberReady, "expected parameter 'numberReady' to be non-null");
        this.numberUnavailable = numberUnavailable;
        this.observedGeneration = observedGeneration;
        this.updatedNumberScheduled = updatedNumberScheduled;
    }

    private DaemonSetStatusArgs() {
        this.collisionCount = Output.empty();
        this.conditions = Output.empty();
        this.currentNumberScheduled = Output.empty();
        this.desiredNumberScheduled = Output.empty();
        this.numberAvailable = Output.empty();
        this.numberMisscheduled = Output.empty();
        this.numberReady = Output.empty();
        this.numberUnavailable = Output.empty();
        this.observedGeneration = Output.empty();
        this.updatedNumberScheduled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonSetStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> collisionCount;
        private @Nullable Output<List<DaemonSetConditionArgs>> conditions;
        private Output<Integer> currentNumberScheduled;
        private Output<Integer> desiredNumberScheduled;
        private @Nullable Output<Integer> numberAvailable;
        private Output<Integer> numberMisscheduled;
        private Output<Integer> numberReady;
        private @Nullable Output<Integer> numberUnavailable;
        private @Nullable Output<Integer> observedGeneration;
        private @Nullable Output<Integer> updatedNumberScheduled;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonSetStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collisionCount = defaults.collisionCount;
    	      this.conditions = defaults.conditions;
    	      this.currentNumberScheduled = defaults.currentNumberScheduled;
    	      this.desiredNumberScheduled = defaults.desiredNumberScheduled;
    	      this.numberAvailable = defaults.numberAvailable;
    	      this.numberMisscheduled = defaults.numberMisscheduled;
    	      this.numberReady = defaults.numberReady;
    	      this.numberUnavailable = defaults.numberUnavailable;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.updatedNumberScheduled = defaults.updatedNumberScheduled;
        }

        public Builder collisionCount(@Nullable Output<Integer> collisionCount) {
            this.collisionCount = collisionCount;
            return this;
        }

        public Builder collisionCount(@Nullable Integer collisionCount) {
            this.collisionCount = Output.ofNullable(collisionCount);
            return this;
        }

        public Builder conditions(@Nullable Output<List<DaemonSetConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder conditions(@Nullable List<DaemonSetConditionArgs> conditions) {
            this.conditions = Output.ofNullable(conditions);
            return this;
        }

        public Builder currentNumberScheduled(Output<Integer> currentNumberScheduled) {
            this.currentNumberScheduled = Objects.requireNonNull(currentNumberScheduled);
            return this;
        }

        public Builder currentNumberScheduled(Integer currentNumberScheduled) {
            this.currentNumberScheduled = Output.of(Objects.requireNonNull(currentNumberScheduled));
            return this;
        }

        public Builder desiredNumberScheduled(Output<Integer> desiredNumberScheduled) {
            this.desiredNumberScheduled = Objects.requireNonNull(desiredNumberScheduled);
            return this;
        }

        public Builder desiredNumberScheduled(Integer desiredNumberScheduled) {
            this.desiredNumberScheduled = Output.of(Objects.requireNonNull(desiredNumberScheduled));
            return this;
        }

        public Builder numberAvailable(@Nullable Output<Integer> numberAvailable) {
            this.numberAvailable = numberAvailable;
            return this;
        }

        public Builder numberAvailable(@Nullable Integer numberAvailable) {
            this.numberAvailable = Output.ofNullable(numberAvailable);
            return this;
        }

        public Builder numberMisscheduled(Output<Integer> numberMisscheduled) {
            this.numberMisscheduled = Objects.requireNonNull(numberMisscheduled);
            return this;
        }

        public Builder numberMisscheduled(Integer numberMisscheduled) {
            this.numberMisscheduled = Output.of(Objects.requireNonNull(numberMisscheduled));
            return this;
        }

        public Builder numberReady(Output<Integer> numberReady) {
            this.numberReady = Objects.requireNonNull(numberReady);
            return this;
        }

        public Builder numberReady(Integer numberReady) {
            this.numberReady = Output.of(Objects.requireNonNull(numberReady));
            return this;
        }

        public Builder numberUnavailable(@Nullable Output<Integer> numberUnavailable) {
            this.numberUnavailable = numberUnavailable;
            return this;
        }

        public Builder numberUnavailable(@Nullable Integer numberUnavailable) {
            this.numberUnavailable = Output.ofNullable(numberUnavailable);
            return this;
        }

        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Output.ofNullable(observedGeneration);
            return this;
        }

        public Builder updatedNumberScheduled(@Nullable Output<Integer> updatedNumberScheduled) {
            this.updatedNumberScheduled = updatedNumberScheduled;
            return this;
        }

        public Builder updatedNumberScheduled(@Nullable Integer updatedNumberScheduled) {
            this.updatedNumberScheduled = Output.ofNullable(updatedNumberScheduled);
            return this;
        }
        public DaemonSetStatusArgs build() {
            return new DaemonSetStatusArgs(collisionCount, conditions, currentNumberScheduled, desiredNumberScheduled, numberAvailable, numberMisscheduled, numberReady, numberUnavailable, observedGeneration, updatedNumberScheduled);
        }
    }
}
