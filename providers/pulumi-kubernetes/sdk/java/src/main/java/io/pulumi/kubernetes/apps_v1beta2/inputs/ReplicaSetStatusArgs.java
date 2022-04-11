// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.apps_v1beta2.inputs.ReplicaSetConditionArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ReplicaSetStatus represents the current status of a ReplicaSet.
 * 
 */
public final class ReplicaSetStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicaSetStatusArgs Empty = new ReplicaSetStatusArgs();

    /**
     * The number of available replicas (ready for at least minReadySeconds) for this replica set.
     * 
     */
    @Import(name="availableReplicas")
      private final @Nullable Output<Integer> availableReplicas;

    public Output<Integer> getAvailableReplicas() {
        return this.availableReplicas == null ? Codegen.empty() : this.availableReplicas;
    }

    /**
     * Represents the latest available observations of a replica set's current state.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<ReplicaSetConditionArgs>> conditions;

    public Output<List<ReplicaSetConditionArgs>> getConditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    /**
     * The number of pods that have labels matching the labels of the pod template of the replicaset.
     * 
     */
    @Import(name="fullyLabeledReplicas")
      private final @Nullable Output<Integer> fullyLabeledReplicas;

    public Output<Integer> getFullyLabeledReplicas() {
        return this.fullyLabeledReplicas == null ? Codegen.empty() : this.fullyLabeledReplicas;
    }

    /**
     * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
     * 
     */
    @Import(name="observedGeneration")
      private final @Nullable Output<Integer> observedGeneration;

    public Output<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Codegen.empty() : this.observedGeneration;
    }

    /**
     * The number of ready replicas for this replica set.
     * 
     */
    @Import(name="readyReplicas")
      private final @Nullable Output<Integer> readyReplicas;

    public Output<Integer> getReadyReplicas() {
        return this.readyReplicas == null ? Codegen.empty() : this.readyReplicas;
    }

    /**
     * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    @Import(name="replicas", required=true)
      private final Output<Integer> replicas;

    public Output<Integer> getReplicas() {
        return this.replicas;
    }

    public ReplicaSetStatusArgs(
        @Nullable Output<Integer> availableReplicas,
        @Nullable Output<List<ReplicaSetConditionArgs>> conditions,
        @Nullable Output<Integer> fullyLabeledReplicas,
        @Nullable Output<Integer> observedGeneration,
        @Nullable Output<Integer> readyReplicas,
        Output<Integer> replicas) {
        this.availableReplicas = availableReplicas;
        this.conditions = conditions;
        this.fullyLabeledReplicas = fullyLabeledReplicas;
        this.observedGeneration = observedGeneration;
        this.readyReplicas = readyReplicas;
        this.replicas = Objects.requireNonNull(replicas, "expected parameter 'replicas' to be non-null");
    }

    private ReplicaSetStatusArgs() {
        this.availableReplicas = Codegen.empty();
        this.conditions = Codegen.empty();
        this.fullyLabeledReplicas = Codegen.empty();
        this.observedGeneration = Codegen.empty();
        this.readyReplicas = Codegen.empty();
        this.replicas = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaSetStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> availableReplicas;
        private @Nullable Output<List<ReplicaSetConditionArgs>> conditions;
        private @Nullable Output<Integer> fullyLabeledReplicas;
        private @Nullable Output<Integer> observedGeneration;
        private @Nullable Output<Integer> readyReplicas;
        private Output<Integer> replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaSetStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableReplicas = defaults.availableReplicas;
    	      this.conditions = defaults.conditions;
    	      this.fullyLabeledReplicas = defaults.fullyLabeledReplicas;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.readyReplicas = defaults.readyReplicas;
    	      this.replicas = defaults.replicas;
        }

        public Builder availableReplicas(@Nullable Output<Integer> availableReplicas) {
            this.availableReplicas = availableReplicas;
            return this;
        }
        public Builder availableReplicas(@Nullable Integer availableReplicas) {
            this.availableReplicas = Codegen.ofNullable(availableReplicas);
            return this;
        }
        public Builder conditions(@Nullable Output<List<ReplicaSetConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<ReplicaSetConditionArgs> conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder conditions(ReplicaSetConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder fullyLabeledReplicas(@Nullable Output<Integer> fullyLabeledReplicas) {
            this.fullyLabeledReplicas = fullyLabeledReplicas;
            return this;
        }
        public Builder fullyLabeledReplicas(@Nullable Integer fullyLabeledReplicas) {
            this.fullyLabeledReplicas = Codegen.ofNullable(fullyLabeledReplicas);
            return this;
        }
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Codegen.ofNullable(observedGeneration);
            return this;
        }
        public Builder readyReplicas(@Nullable Output<Integer> readyReplicas) {
            this.readyReplicas = readyReplicas;
            return this;
        }
        public Builder readyReplicas(@Nullable Integer readyReplicas) {
            this.readyReplicas = Codegen.ofNullable(readyReplicas);
            return this;
        }
        public Builder replicas(Output<Integer> replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }
        public Builder replicas(Integer replicas) {
            this.replicas = Output.of(Objects.requireNonNull(replicas));
            return this;
        }        public ReplicaSetStatusArgs build() {
            return new ReplicaSetStatusArgs(availableReplicas, conditions, fullyLabeledReplicas, observedGeneration, readyReplicas, replicas);
        }
    }
}
