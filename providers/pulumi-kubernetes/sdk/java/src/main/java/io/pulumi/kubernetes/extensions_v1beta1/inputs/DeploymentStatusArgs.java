// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.DeploymentConditionArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DeploymentStatus is the most recently observed status of the Deployment.
 * 
 */
public final class DeploymentStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentStatusArgs Empty = new DeploymentStatusArgs();

    /**
     * Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
     * 
     */
    @InputImport(name="availableReplicas")
      private final @Nullable Input<Integer> availableReplicas;

    public Input<Integer> getAvailableReplicas() {
        return this.availableReplicas == null ? Input.empty() : this.availableReplicas;
    }

    /**
     * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
     * 
     */
    @InputImport(name="collisionCount")
      private final @Nullable Input<Integer> collisionCount;

    public Input<Integer> getCollisionCount() {
        return this.collisionCount == null ? Input.empty() : this.collisionCount;
    }

    /**
     * Represents the latest available observations of a deployment's current state.
     * 
     */
    @InputImport(name="conditions")
      private final @Nullable Input<List<DeploymentConditionArgs>> conditions;

    public Input<List<DeploymentConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * The generation observed by the deployment controller.
     * 
     */
    @InputImport(name="observedGeneration")
      private final @Nullable Input<Integer> observedGeneration;

    public Input<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Input.empty() : this.observedGeneration;
    }

    /**
     * Total number of ready pods targeted by this deployment.
     * 
     */
    @InputImport(name="readyReplicas")
      private final @Nullable Input<Integer> readyReplicas;

    public Input<Integer> getReadyReplicas() {
        return this.readyReplicas == null ? Input.empty() : this.readyReplicas;
    }

    /**
     * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
     * 
     */
    @InputImport(name="replicas")
      private final @Nullable Input<Integer> replicas;

    public Input<Integer> getReplicas() {
        return this.replicas == null ? Input.empty() : this.replicas;
    }

    /**
     * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
     * 
     */
    @InputImport(name="unavailableReplicas")
      private final @Nullable Input<Integer> unavailableReplicas;

    public Input<Integer> getUnavailableReplicas() {
        return this.unavailableReplicas == null ? Input.empty() : this.unavailableReplicas;
    }

    /**
     * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
     * 
     */
    @InputImport(name="updatedReplicas")
      private final @Nullable Input<Integer> updatedReplicas;

    public Input<Integer> getUpdatedReplicas() {
        return this.updatedReplicas == null ? Input.empty() : this.updatedReplicas;
    }

    public DeploymentStatusArgs(
        @Nullable Input<Integer> availableReplicas,
        @Nullable Input<Integer> collisionCount,
        @Nullable Input<List<DeploymentConditionArgs>> conditions,
        @Nullable Input<Integer> observedGeneration,
        @Nullable Input<Integer> readyReplicas,
        @Nullable Input<Integer> replicas,
        @Nullable Input<Integer> unavailableReplicas,
        @Nullable Input<Integer> updatedReplicas) {
        this.availableReplicas = availableReplicas;
        this.collisionCount = collisionCount;
        this.conditions = conditions;
        this.observedGeneration = observedGeneration;
        this.readyReplicas = readyReplicas;
        this.replicas = replicas;
        this.unavailableReplicas = unavailableReplicas;
        this.updatedReplicas = updatedReplicas;
    }

    private DeploymentStatusArgs() {
        this.availableReplicas = Input.empty();
        this.collisionCount = Input.empty();
        this.conditions = Input.empty();
        this.observedGeneration = Input.empty();
        this.readyReplicas = Input.empty();
        this.replicas = Input.empty();
        this.unavailableReplicas = Input.empty();
        this.updatedReplicas = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> availableReplicas;
        private @Nullable Input<Integer> collisionCount;
        private @Nullable Input<List<DeploymentConditionArgs>> conditions;
        private @Nullable Input<Integer> observedGeneration;
        private @Nullable Input<Integer> readyReplicas;
        private @Nullable Input<Integer> replicas;
        private @Nullable Input<Integer> unavailableReplicas;
        private @Nullable Input<Integer> updatedReplicas;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableReplicas = defaults.availableReplicas;
    	      this.collisionCount = defaults.collisionCount;
    	      this.conditions = defaults.conditions;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.readyReplicas = defaults.readyReplicas;
    	      this.replicas = defaults.replicas;
    	      this.unavailableReplicas = defaults.unavailableReplicas;
    	      this.updatedReplicas = defaults.updatedReplicas;
        }

        public Builder setAvailableReplicas(@Nullable Input<Integer> availableReplicas) {
            this.availableReplicas = availableReplicas;
            return this;
        }

        public Builder setAvailableReplicas(@Nullable Integer availableReplicas) {
            this.availableReplicas = Input.ofNullable(availableReplicas);
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

        public Builder setConditions(@Nullable Input<List<DeploymentConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<DeploymentConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
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

        public Builder setReplicas(@Nullable Input<Integer> replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder setReplicas(@Nullable Integer replicas) {
            this.replicas = Input.ofNullable(replicas);
            return this;
        }

        public Builder setUnavailableReplicas(@Nullable Input<Integer> unavailableReplicas) {
            this.unavailableReplicas = unavailableReplicas;
            return this;
        }

        public Builder setUnavailableReplicas(@Nullable Integer unavailableReplicas) {
            this.unavailableReplicas = Input.ofNullable(unavailableReplicas);
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
        public DeploymentStatusArgs build() {
            return new DeploymentStatusArgs(availableReplicas, collisionCount, conditions, observedGeneration, readyReplicas, replicas, unavailableReplicas, updatedReplicas);
        }
    }
}
