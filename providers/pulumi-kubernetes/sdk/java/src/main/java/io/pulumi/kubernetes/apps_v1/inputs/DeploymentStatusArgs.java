// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.apps_v1.inputs.DeploymentConditionArgs;
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
    @Import(name="availableReplicas")
      private final @Nullable Output<Integer> availableReplicas;

    public Output<Integer> getAvailableReplicas() {
        return this.availableReplicas == null ? Output.empty() : this.availableReplicas;
    }

    /**
     * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
     * 
     */
    @Import(name="collisionCount")
      private final @Nullable Output<Integer> collisionCount;

    public Output<Integer> getCollisionCount() {
        return this.collisionCount == null ? Output.empty() : this.collisionCount;
    }

    /**
     * Represents the latest available observations of a deployment's current state.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<DeploymentConditionArgs>> conditions;

    public Output<List<DeploymentConditionArgs>> getConditions() {
        return this.conditions == null ? Output.empty() : this.conditions;
    }

    /**
     * The generation observed by the deployment controller.
     * 
     */
    @Import(name="observedGeneration")
      private final @Nullable Output<Integer> observedGeneration;

    public Output<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Output.empty() : this.observedGeneration;
    }

    /**
     * readyReplicas is the number of pods targeted by this Deployment with a Ready Condition.
     * 
     */
    @Import(name="readyReplicas")
      private final @Nullable Output<Integer> readyReplicas;

    public Output<Integer> getReadyReplicas() {
        return this.readyReplicas == null ? Output.empty() : this.readyReplicas;
    }

    /**
     * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
     * 
     */
    @Import(name="replicas")
      private final @Nullable Output<Integer> replicas;

    public Output<Integer> getReplicas() {
        return this.replicas == null ? Output.empty() : this.replicas;
    }

    /**
     * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
     * 
     */
    @Import(name="unavailableReplicas")
      private final @Nullable Output<Integer> unavailableReplicas;

    public Output<Integer> getUnavailableReplicas() {
        return this.unavailableReplicas == null ? Output.empty() : this.unavailableReplicas;
    }

    /**
     * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
     * 
     */
    @Import(name="updatedReplicas")
      private final @Nullable Output<Integer> updatedReplicas;

    public Output<Integer> getUpdatedReplicas() {
        return this.updatedReplicas == null ? Output.empty() : this.updatedReplicas;
    }

    public DeploymentStatusArgs(
        @Nullable Output<Integer> availableReplicas,
        @Nullable Output<Integer> collisionCount,
        @Nullable Output<List<DeploymentConditionArgs>> conditions,
        @Nullable Output<Integer> observedGeneration,
        @Nullable Output<Integer> readyReplicas,
        @Nullable Output<Integer> replicas,
        @Nullable Output<Integer> unavailableReplicas,
        @Nullable Output<Integer> updatedReplicas) {
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
        this.availableReplicas = Output.empty();
        this.collisionCount = Output.empty();
        this.conditions = Output.empty();
        this.observedGeneration = Output.empty();
        this.readyReplicas = Output.empty();
        this.replicas = Output.empty();
        this.unavailableReplicas = Output.empty();
        this.updatedReplicas = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> availableReplicas;
        private @Nullable Output<Integer> collisionCount;
        private @Nullable Output<List<DeploymentConditionArgs>> conditions;
        private @Nullable Output<Integer> observedGeneration;
        private @Nullable Output<Integer> readyReplicas;
        private @Nullable Output<Integer> replicas;
        private @Nullable Output<Integer> unavailableReplicas;
        private @Nullable Output<Integer> updatedReplicas;

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

        public Builder availableReplicas(@Nullable Output<Integer> availableReplicas) {
            this.availableReplicas = availableReplicas;
            return this;
        }
        public Builder availableReplicas(@Nullable Integer availableReplicas) {
            this.availableReplicas = Output.ofNullable(availableReplicas);
            return this;
        }
        public Builder collisionCount(@Nullable Output<Integer> collisionCount) {
            this.collisionCount = collisionCount;
            return this;
        }
        public Builder collisionCount(@Nullable Integer collisionCount) {
            this.collisionCount = Output.ofNullable(collisionCount);
            return this;
        }
        public Builder conditions(@Nullable Output<List<DeploymentConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<DeploymentConditionArgs> conditions) {
            this.conditions = Output.ofNullable(conditions);
            return this;
        }
        public Builder conditions(DeploymentConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Output.ofNullable(observedGeneration);
            return this;
        }
        public Builder readyReplicas(@Nullable Output<Integer> readyReplicas) {
            this.readyReplicas = readyReplicas;
            return this;
        }
        public Builder readyReplicas(@Nullable Integer readyReplicas) {
            this.readyReplicas = Output.ofNullable(readyReplicas);
            return this;
        }
        public Builder replicas(@Nullable Output<Integer> replicas) {
            this.replicas = replicas;
            return this;
        }
        public Builder replicas(@Nullable Integer replicas) {
            this.replicas = Output.ofNullable(replicas);
            return this;
        }
        public Builder unavailableReplicas(@Nullable Output<Integer> unavailableReplicas) {
            this.unavailableReplicas = unavailableReplicas;
            return this;
        }
        public Builder unavailableReplicas(@Nullable Integer unavailableReplicas) {
            this.unavailableReplicas = Output.ofNullable(unavailableReplicas);
            return this;
        }
        public Builder updatedReplicas(@Nullable Output<Integer> updatedReplicas) {
            this.updatedReplicas = updatedReplicas;
            return this;
        }
        public Builder updatedReplicas(@Nullable Integer updatedReplicas) {
            this.updatedReplicas = Output.ofNullable(updatedReplicas);
            return this;
        }        public DeploymentStatusArgs build() {
            return new DeploymentStatusArgs(availableReplicas, collisionCount, conditions, observedGeneration, readyReplicas, replicas, unavailableReplicas, updatedReplicas);
        }
    }
}
