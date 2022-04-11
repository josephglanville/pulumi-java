// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.NodeConfigSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.TaintArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NodeSpec describes the attributes that a node is created with.
 * 
 */
public final class NodeSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeSpecArgs Empty = new NodeSpecArgs();

    /**
     * Deprecated. If specified, the source of the node's configuration. The DynamicKubeletConfig feature gate must be enabled for the Kubelet to use this field. This field is deprecated as of 1.22: https://git.k8s.io/enhancements/keps/sig-node/281-dynamic-kubelet-configuration
     * 
     */
    @Import(name="configSource")
      private final @Nullable Output<NodeConfigSourceArgs> configSource;

    public Output<NodeConfigSourceArgs> getConfigSource() {
        return this.configSource == null ? Codegen.empty() : this.configSource;
    }

    /**
     * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
     * 
     */
    @Import(name="externalID")
      private final @Nullable Output<String> externalID;

    public Output<String> getExternalID() {
        return this.externalID == null ? Codegen.empty() : this.externalID;
    }

    /**
     * PodCIDR represents the pod IP range assigned to the node.
     * 
     */
    @Import(name="podCIDR")
      private final @Nullable Output<String> podCIDR;

    public Output<String> getPodCIDR() {
        return this.podCIDR == null ? Codegen.empty() : this.podCIDR;
    }

    /**
     * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
     * 
     */
    @Import(name="podCIDRs")
      private final @Nullable Output<List<String>> podCIDRs;

    public Output<List<String>> getPodCIDRs() {
        return this.podCIDRs == null ? Codegen.empty() : this.podCIDRs;
    }

    /**
     * ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>
     * 
     */
    @Import(name="providerID")
      private final @Nullable Output<String> providerID;

    public Output<String> getProviderID() {
        return this.providerID == null ? Codegen.empty() : this.providerID;
    }

    /**
     * If specified, the node's taints.
     * 
     */
    @Import(name="taints")
      private final @Nullable Output<List<TaintArgs>> taints;

    public Output<List<TaintArgs>> getTaints() {
        return this.taints == null ? Codegen.empty() : this.taints;
    }

    /**
     * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
     * 
     */
    @Import(name="unschedulable")
      private final @Nullable Output<Boolean> unschedulable;

    public Output<Boolean> getUnschedulable() {
        return this.unschedulable == null ? Codegen.empty() : this.unschedulable;
    }

    public NodeSpecArgs(
        @Nullable Output<NodeConfigSourceArgs> configSource,
        @Nullable Output<String> externalID,
        @Nullable Output<String> podCIDR,
        @Nullable Output<List<String>> podCIDRs,
        @Nullable Output<String> providerID,
        @Nullable Output<List<TaintArgs>> taints,
        @Nullable Output<Boolean> unschedulable) {
        this.configSource = configSource;
        this.externalID = externalID;
        this.podCIDR = podCIDR;
        this.podCIDRs = podCIDRs;
        this.providerID = providerID;
        this.taints = taints;
        this.unschedulable = unschedulable;
    }

    private NodeSpecArgs() {
        this.configSource = Codegen.empty();
        this.externalID = Codegen.empty();
        this.podCIDR = Codegen.empty();
        this.podCIDRs = Codegen.empty();
        this.providerID = Codegen.empty();
        this.taints = Codegen.empty();
        this.unschedulable = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NodeConfigSourceArgs> configSource;
        private @Nullable Output<String> externalID;
        private @Nullable Output<String> podCIDR;
        private @Nullable Output<List<String>> podCIDRs;
        private @Nullable Output<String> providerID;
        private @Nullable Output<List<TaintArgs>> taints;
        private @Nullable Output<Boolean> unschedulable;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configSource = defaults.configSource;
    	      this.externalID = defaults.externalID;
    	      this.podCIDR = defaults.podCIDR;
    	      this.podCIDRs = defaults.podCIDRs;
    	      this.providerID = defaults.providerID;
    	      this.taints = defaults.taints;
    	      this.unschedulable = defaults.unschedulable;
        }

        public Builder configSource(@Nullable Output<NodeConfigSourceArgs> configSource) {
            this.configSource = configSource;
            return this;
        }
        public Builder configSource(@Nullable NodeConfigSourceArgs configSource) {
            this.configSource = Codegen.ofNullable(configSource);
            return this;
        }
        public Builder externalID(@Nullable Output<String> externalID) {
            this.externalID = externalID;
            return this;
        }
        public Builder externalID(@Nullable String externalID) {
            this.externalID = Codegen.ofNullable(externalID);
            return this;
        }
        public Builder podCIDR(@Nullable Output<String> podCIDR) {
            this.podCIDR = podCIDR;
            return this;
        }
        public Builder podCIDR(@Nullable String podCIDR) {
            this.podCIDR = Codegen.ofNullable(podCIDR);
            return this;
        }
        public Builder podCIDRs(@Nullable Output<List<String>> podCIDRs) {
            this.podCIDRs = podCIDRs;
            return this;
        }
        public Builder podCIDRs(@Nullable List<String> podCIDRs) {
            this.podCIDRs = Codegen.ofNullable(podCIDRs);
            return this;
        }
        public Builder podCIDRs(String... podCIDRs) {
            return podCIDRs(List.of(podCIDRs));
        }
        public Builder providerID(@Nullable Output<String> providerID) {
            this.providerID = providerID;
            return this;
        }
        public Builder providerID(@Nullable String providerID) {
            this.providerID = Codegen.ofNullable(providerID);
            return this;
        }
        public Builder taints(@Nullable Output<List<TaintArgs>> taints) {
            this.taints = taints;
            return this;
        }
        public Builder taints(@Nullable List<TaintArgs> taints) {
            this.taints = Codegen.ofNullable(taints);
            return this;
        }
        public Builder taints(TaintArgs... taints) {
            return taints(List.of(taints));
        }
        public Builder unschedulable(@Nullable Output<Boolean> unschedulable) {
            this.unschedulable = unschedulable;
            return this;
        }
        public Builder unschedulable(@Nullable Boolean unschedulable) {
            this.unschedulable = Codegen.ofNullable(unschedulable);
            return this;
        }        public NodeSpecArgs build() {
            return new NodeSpecArgs(configSource, externalID, podCIDR, podCIDRs, providerID, taints, unschedulable);
        }
    }
}
