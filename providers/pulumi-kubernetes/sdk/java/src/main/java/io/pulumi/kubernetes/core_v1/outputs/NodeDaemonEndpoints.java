// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.DaemonEndpoint;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeDaemonEndpoints {
    /**
     * Endpoint on which Kubelet is listening.
     * 
     */
    private final @Nullable DaemonEndpoint kubeletEndpoint;

    @CustomType.Constructor
    private NodeDaemonEndpoints(@CustomType.Parameter("kubeletEndpoint") @Nullable DaemonEndpoint kubeletEndpoint) {
        this.kubeletEndpoint = kubeletEndpoint;
    }

    /**
     * Endpoint on which Kubelet is listening.
     * 
    */
    public Optional<DaemonEndpoint> getKubeletEndpoint() {
        return Optional.ofNullable(this.kubeletEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeDaemonEndpoints defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DaemonEndpoint kubeletEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeDaemonEndpoints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kubeletEndpoint = defaults.kubeletEndpoint;
        }

        public Builder kubeletEndpoint(@Nullable DaemonEndpoint kubeletEndpoint) {
            this.kubeletEndpoint = kubeletEndpoint;
            return this;
        }        public NodeDaemonEndpoints build() {
            return new NodeDaemonEndpoints(kubeletEndpoint);
        }
    }
}
