// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.apps_v1.inputs.StatefulSetConditionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * StatefulSetStatus represents the current state of a StatefulSet.
 * 
 */
public final class StatefulSetStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatefulSetStatusArgs Empty = new StatefulSetStatusArgs();

    /**
     * Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset. This is a beta field and enabled/disabled by StatefulSetMinReadySeconds feature gate.
     * 
     */
    @InputImport(name="availableReplicas", required=true)
      private final Input<Integer> availableReplicas;

    public Input<Integer> getAvailableReplicas() {
        return this.availableReplicas;
    }

    /**
     * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    @InputImport(name="collisionCount")
      private final @Nullable Input<Integer> collisionCount;

    public Input<Integer> getCollisionCount() {
        return this.collisionCount == null ? Input.empty() : this.collisionCount;
    }

    /**
     * Represents the latest available observations of a statefulset's current state.
     * 
     */
    @InputImport(name="conditions")
      private final @Nullable Input<List<StatefulSetConditionArgs>> conditions;

    public Input<List<StatefulSetConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
     * 
     */
    @InputImport(name="currentReplicas")
      private final @Nullable Input<Integer> currentReplicas;

    public Input<Integer> getCurrentReplicas() {
        return this.currentReplicas == null ? Input.empty() : this.currentReplicas;
    }

    /**
     * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
     * 
     */
    @InputImport(name="currentRevision")
      private final @Nullable Input<String> currentRevision;

    public Input<String> getCurrentRevision() {
        return this.currentRevision == null ? Input.empty() : this.currentRevision;
    }

    /**
     * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.
     * 
     */
    @InputImport(name="observedGeneration")
      private final @Nullable Input<Integer> observedGeneration;

    public Input<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Input.empty() : this.observedGeneration;
    }

    /**
     * readyReplicas is the number of pods created for this StatefulSet with a Ready Condition.
     * 
     */
    @InputImport(name="readyReplicas")
      private final @Nullable Input<Integer> readyReplicas;

    public Input<Integer> getReadyReplicas() {
        return this.readyReplicas == null ? Input.empty() : this.readyReplicas;
    }

    /**
     * replicas is the number of Pods created by the StatefulSet controller.
     * 
     */
    @InputImport(name="replicas", required=true)
      private final Input<Integer> replicas;

    public Input<Integer> getReplicas() {
        return this.replicas;
    }

    /**
     * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
     * 
     */
    @InputImport(name="updateRevision")
      private final @Nullable Input<String> updateRevision;

    public Input<String> getUpdateRevision() {
        return this.updateRevision == null ? Input.empty() : this.updateRevision;
    }

    /**
     * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
     * 
     */
    @InputImport(name="updatedReplicas")
      private final @Nullable Input<Integer> updatedReplicas;

    public Input<Integer> getUpdatedReplicas() {
        return this.updatedReplicas == null ? Input.empty() : this.updatedReplicas;
    }

    public StatefulSetStatusArgs(
        Input<Integer> availableReplicas,
        @Nullable Input<Integer> collisionCount,
        @Nullable Input<List<StatefulSetConditionArgs>> conditions,
        @Nullable Input<Integer> currentReplicas,
        @Nullable Input<String> currentRevision,
        @Nullable Input<Integer> observedGeneration,
        @Nullable Input<Integer> readyReplicas,
        Input<Integer> replicas,
        @Nullable Input<String> updateRevision,
        @Nullable Input<Integer> updatedReplicas) {
        this.availableReplicas = Objects.requireNonNull(availableReplicas, "expected parameter 'availableReplicas' to be non-null");
        this.collisionCount = collisionCount;
        this.conditions = conditions;
        this.currentReplicas = currentReplicas;
        this.currentRevision = currentRevision;
        this.observedGeneration = observedGeneration;
        this.readyReplicas = readyReplicas;
        this.replicas = Objects.requireNonNull(replicas, "expected parameter 'replicas' to be non-null");
        this.updateRevision = updateRevision;
        this.updatedReplicas = updatedReplicas;
    }

    private StatefulSetStatusArgs() {
        this.availableReplicas = Input.empty();
        this.collisionCount = Input.empty();
        this.conditions = Input.empty();
        this.currentReplicas = Input.empty();
        this.currentRevision = Input.empty();
        this.observedGeneration = Input.empty();
        this.readyReplicas = Input.empty();
        this.replicas = Input.empty();
        this.updateRevision = Input.empty();
        this.updatedReplicas = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> availableReplicas;
        private @Nullable Input<Integer> collisionCount;
        private @Nullable Input<List<StatefulSetConditionArgs>> conditions;
        private @Nullable Input<Integer> currentReplicas;
        private @Nullable Input<String> currentRevision;
        private @Nullable Input<Integer> observedGeneration;
        private @Nullable Input<Integer> readyReplicas;
        private Input<Integer> replicas;
        private @Nullable Input<String> updateRevision;
        private @Nullable Input<Integer> updatedReplicas;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableReplicas = defaults.availableReplicas;
    	      this.collisionCount = defaults.collisionCount;
    	      this.conditions = defaults.conditions;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.currentRevision = defaults.currentRevision;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.readyReplicas = defaults.readyReplicas;
    	      this.replicas = defaults.replicas;
    	      this.updateRevision = defaults.updateRevision;
    	      this.updatedReplicas = defaults.updatedReplicas;
        }

        public Builder setAvailableReplicas(Input<Integer> availableReplicas) {
            this.availableReplicas = Objects.requireNonNull(availableReplicas);
            return this;
        }

        public Builder setAvailableReplicas(Integer availableReplicas) {
            this.availableReplicas = Input.of(Objects.requireNonNull(availableReplicas));
            return this;
        }

        public Builder setCollisionCount(@Nullable Input<Integer> collisionCount) {
            this.collisionCount = collisionCount;
            return this;
        }

        public Builder setCollisionCount(@Nullable Integer collisionCount) {
            this.collisionCount = Input.ofNullable(collisionCount);
            return this;
        }

        public Builder setConditions(@Nullable Input<List<StatefulSetConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<StatefulSetConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setCurrentReplicas(@Nullable Input<Integer> currentReplicas) {
            this.currentReplicas = currentReplicas;
            return this;
        }

        public Builder setCurrentReplicas(@Nullable Integer currentReplicas) {
            this.currentReplicas = Input.ofNullable(currentReplicas);
            return this;
        }

        public Builder setCurrentRevision(@Nullable Input<String> currentRevision) {
            this.currentRevision = currentRevision;
            return this;
        }

        public Builder setCurrentRevision(@Nullable String currentRevision) {
            this.currentRevision = Input.ofNullable(currentRevision);
            return this;
        }

        public Builder setObservedGeneration(@Nullable Input<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Input.ofNullable(observedGeneration);
            return this;
        }

        public Builder setReadyReplicas(@Nullable Input<Integer> readyReplicas) {
            this.readyReplicas = readyReplicas;
            return this;
        }

        public Builder setReadyReplicas(@Nullable Integer readyReplicas) {
            this.readyReplicas = Input.ofNullable(readyReplicas);
            return this;
        }

        public Builder setReplicas(Input<Integer> replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }

        public Builder setReplicas(Integer replicas) {
            this.replicas = Input.of(Objects.requireNonNull(replicas));
            return this;
        }

        public Builder setUpdateRevision(@Nullable Input<String> updateRevision) {
            this.updateRevision = updateRevision;
            return this;
        }

        public Builder setUpdateRevision(@Nullable String updateRevision) {
            this.updateRevision = Input.ofNullable(updateRevision);
            return this;
        }

        public Builder setUpdatedReplicas(@Nullable Input<Integer> updatedReplicas) {
            this.updatedReplicas = updatedReplicas;
            return this;
        }

        public Builder setUpdatedReplicas(@Nullable Integer updatedReplicas) {
            this.updatedReplicas = Input.ofNullable(updatedReplicas);
            return this;
        }
        public StatefulSetStatusArgs build() {
            return new StatefulSetStatusArgs(availableReplicas, collisionCount, conditions, currentReplicas, currentRevision, observedGeneration, readyReplicas, replicas, updateRevision, updatedReplicas);
        }
    }
}
