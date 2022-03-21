// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.NodeSelector;
import io.pulumi.kubernetes.core_v1.outputs.PreferredSchedulingTerm;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeAffinity {
    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
     * 
     */
    private final @Nullable List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution;
    /**
     * If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.
     * 
     */
    private final @Nullable NodeSelector requiredDuringSchedulingIgnoredDuringExecution;

    @CustomType.Constructor
    private NodeAffinity(
        @CustomType.Parameter("preferredDuringSchedulingIgnoredDuringExecution") @Nullable List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution,
        @CustomType.Parameter("requiredDuringSchedulingIgnoredDuringExecution") @Nullable NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
     * 
    */
    public List<PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return this.preferredDuringSchedulingIgnoredDuringExecution == null ? List.of() : this.preferredDuringSchedulingIgnoredDuringExecution;
    }
    /**
     * If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.
     * 
    */
    public Optional<NodeSelector> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return Optional.ofNullable(this.requiredDuringSchedulingIgnoredDuringExecution);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution;
        private @Nullable NodeSelector requiredDuringSchedulingIgnoredDuringExecution;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredDuringSchedulingIgnoredDuringExecution = defaults.preferredDuringSchedulingIgnoredDuringExecution;
    	      this.requiredDuringSchedulingIgnoredDuringExecution = defaults.requiredDuringSchedulingIgnoredDuringExecution;
        }

        public Builder preferredDuringSchedulingIgnoredDuringExecution(@Nullable List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
            return this;
        }
        public Builder preferredDuringSchedulingIgnoredDuringExecution(PreferredSchedulingTerm... preferredDuringSchedulingIgnoredDuringExecution) {
            return preferredDuringSchedulingIgnoredDuringExecution(List.of(preferredDuringSchedulingIgnoredDuringExecution));
        }
        public Builder requiredDuringSchedulingIgnoredDuringExecution(@Nullable NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
            return this;
        }        public NodeAffinity build() {
            return new NodeAffinity(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
        }
    }
}
