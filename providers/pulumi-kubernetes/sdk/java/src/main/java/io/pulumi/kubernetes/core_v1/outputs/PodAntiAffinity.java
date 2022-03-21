// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.PodAffinityTerm;
import io.pulumi.kubernetes.core_v1.outputs.WeightedPodAffinityTerm;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PodAntiAffinity {
    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
     * 
     */
    private final @Nullable List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution;
    /**
     * If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
     * 
     */
    private final @Nullable List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution;

    @CustomType.Constructor
    private PodAntiAffinity(
        @CustomType.Parameter("preferredDuringSchedulingIgnoredDuringExecution") @Nullable List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution,
        @CustomType.Parameter("requiredDuringSchedulingIgnoredDuringExecution") @Nullable List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
     * 
    */
    public List<WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return this.preferredDuringSchedulingIgnoredDuringExecution == null ? List.of() : this.preferredDuringSchedulingIgnoredDuringExecution;
    }
    /**
     * If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
     * 
    */
    public List<PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return this.requiredDuringSchedulingIgnoredDuringExecution == null ? List.of() : this.requiredDuringSchedulingIgnoredDuringExecution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodAntiAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution;
        private @Nullable List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution;

        public Builder() {
    	      // Empty
        }

        public Builder(PodAntiAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredDuringSchedulingIgnoredDuringExecution = defaults.preferredDuringSchedulingIgnoredDuringExecution;
    	      this.requiredDuringSchedulingIgnoredDuringExecution = defaults.requiredDuringSchedulingIgnoredDuringExecution;
        }

        public Builder preferredDuringSchedulingIgnoredDuringExecution(@Nullable List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
            return this;
        }
        public Builder preferredDuringSchedulingIgnoredDuringExecution(WeightedPodAffinityTerm... preferredDuringSchedulingIgnoredDuringExecution) {
            return preferredDuringSchedulingIgnoredDuringExecution(List.of(preferredDuringSchedulingIgnoredDuringExecution));
        }
        public Builder requiredDuringSchedulingIgnoredDuringExecution(@Nullable List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
            return this;
        }
        public Builder requiredDuringSchedulingIgnoredDuringExecution(PodAffinityTerm... requiredDuringSchedulingIgnoredDuringExecution) {
            return requiredDuringSchedulingIgnoredDuringExecution(List.of(requiredDuringSchedulingIgnoredDuringExecution));
        }        public PodAntiAffinity build() {
            return new PodAntiAffinity(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
        }
    }
}
