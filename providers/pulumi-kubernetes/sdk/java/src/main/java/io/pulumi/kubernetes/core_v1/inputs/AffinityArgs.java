// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.core_v1.inputs.NodeAffinityArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodAffinityArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodAntiAffinityArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Affinity is a group of affinity scheduling rules.
 * 
 */
public final class AffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final AffinityArgs Empty = new AffinityArgs();

    /**
     * Describes node affinity scheduling rules for the pod.
     * 
     */
    @Import(name="nodeAffinity")
      private final @Nullable Output<NodeAffinityArgs> nodeAffinity;

    public Output<NodeAffinityArgs> getNodeAffinity() {
        return this.nodeAffinity == null ? Output.empty() : this.nodeAffinity;
    }

    /**
     * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
     * 
     */
    @Import(name="podAffinity")
      private final @Nullable Output<PodAffinityArgs> podAffinity;

    public Output<PodAffinityArgs> getPodAffinity() {
        return this.podAffinity == null ? Output.empty() : this.podAffinity;
    }

    /**
     * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
     * 
     */
    @Import(name="podAntiAffinity")
      private final @Nullable Output<PodAntiAffinityArgs> podAntiAffinity;

    public Output<PodAntiAffinityArgs> getPodAntiAffinity() {
        return this.podAntiAffinity == null ? Output.empty() : this.podAntiAffinity;
    }

    public AffinityArgs(
        @Nullable Output<NodeAffinityArgs> nodeAffinity,
        @Nullable Output<PodAffinityArgs> podAffinity,
        @Nullable Output<PodAntiAffinityArgs> podAntiAffinity) {
        this.nodeAffinity = nodeAffinity;
        this.podAffinity = podAffinity;
        this.podAntiAffinity = podAntiAffinity;
    }

    private AffinityArgs() {
        this.nodeAffinity = Output.empty();
        this.podAffinity = Output.empty();
        this.podAntiAffinity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NodeAffinityArgs> nodeAffinity;
        private @Nullable Output<PodAffinityArgs> podAffinity;
        private @Nullable Output<PodAntiAffinityArgs> podAntiAffinity;

        public Builder() {
    	      // Empty
        }

        public Builder(AffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeAffinity = defaults.nodeAffinity;
    	      this.podAffinity = defaults.podAffinity;
    	      this.podAntiAffinity = defaults.podAntiAffinity;
        }

        public Builder nodeAffinity(@Nullable Output<NodeAffinityArgs> nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }
        public Builder nodeAffinity(@Nullable NodeAffinityArgs nodeAffinity) {
            this.nodeAffinity = Output.ofNullable(nodeAffinity);
            return this;
        }
        public Builder podAffinity(@Nullable Output<PodAffinityArgs> podAffinity) {
            this.podAffinity = podAffinity;
            return this;
        }
        public Builder podAffinity(@Nullable PodAffinityArgs podAffinity) {
            this.podAffinity = Output.ofNullable(podAffinity);
            return this;
        }
        public Builder podAntiAffinity(@Nullable Output<PodAntiAffinityArgs> podAntiAffinity) {
            this.podAntiAffinity = podAntiAffinity;
            return this;
        }
        public Builder podAntiAffinity(@Nullable PodAntiAffinityArgs podAntiAffinity) {
            this.podAntiAffinity = Output.ofNullable(podAntiAffinity);
            return this;
        }        public AffinityArgs build() {
            return new AffinityArgs(nodeAffinity, podAffinity, podAntiAffinity);
        }
    }
}
