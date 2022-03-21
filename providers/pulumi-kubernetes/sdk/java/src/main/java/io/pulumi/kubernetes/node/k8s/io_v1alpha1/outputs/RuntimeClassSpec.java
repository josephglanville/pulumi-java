// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.node.k8s.io_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.node.k8s.io_v1alpha1.outputs.Overhead;
import io.pulumi.kubernetes.node.k8s.io_v1alpha1.outputs.Scheduling;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuntimeClassSpec {
    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md This field is beta-level as of Kubernetes v1.18, and is only honored by servers that enable the PodOverhead feature.
     * 
     */
    private final @Nullable Overhead overhead;
    /**
     * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
     * 
     */
    private final String runtimeHandler;
    /**
     * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     * 
     */
    private final @Nullable Scheduling scheduling;

    @CustomType.Constructor
    private RuntimeClassSpec(
        @CustomType.Parameter("overhead") @Nullable Overhead overhead,
        @CustomType.Parameter("runtimeHandler") String runtimeHandler,
        @CustomType.Parameter("scheduling") @Nullable Scheduling scheduling) {
        this.overhead = overhead;
        this.runtimeHandler = runtimeHandler;
        this.scheduling = scheduling;
    }

    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/688-pod-overhead/README.md This field is beta-level as of Kubernetes v1.18, and is only honored by servers that enable the PodOverhead feature.
     * 
    */
    public Optional<Overhead> getOverhead() {
        return Optional.ofNullable(this.overhead);
    }
    /**
     * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
     * 
    */
    public String getRuntimeHandler() {
        return this.runtimeHandler;
    }
    /**
     * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     * 
    */
    public Optional<Scheduling> getScheduling() {
        return Optional.ofNullable(this.scheduling);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeClassSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Overhead overhead;
        private String runtimeHandler;
        private @Nullable Scheduling scheduling;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeClassSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.overhead = defaults.overhead;
    	      this.runtimeHandler = defaults.runtimeHandler;
    	      this.scheduling = defaults.scheduling;
        }

        public Builder overhead(@Nullable Overhead overhead) {
            this.overhead = overhead;
            return this;
        }
        public Builder runtimeHandler(String runtimeHandler) {
            this.runtimeHandler = Objects.requireNonNull(runtimeHandler);
            return this;
        }
        public Builder scheduling(@Nullable Scheduling scheduling) {
            this.scheduling = scheduling;
            return this;
        }        public RuntimeClassSpec build() {
            return new RuntimeClassSpec(overhead, runtimeHandler, scheduling);
        }
    }
}
