// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.NodeConfigSource;
import io.pulumi.kubernetes.core_v1.outputs.Taint;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeSpec {
    /**
     * Deprecated. If specified, the source of the node's configuration. The DynamicKubeletConfig feature gate must be enabled for the Kubelet to use this field. This field is deprecated as of 1.22: https://git.k8s.io/enhancements/keps/sig-node/281-dynamic-kubelet-configuration
     * 
     */
    private final @Nullable NodeConfigSource configSource;
    /**
     * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
     * 
     */
    private final @Nullable String externalID;
    /**
     * PodCIDR represents the pod IP range assigned to the node.
     * 
     */
    private final @Nullable String podCIDR;
    /**
     * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
     * 
     */
    private final @Nullable List<String> podCIDRs;
    /**
     * ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>
     * 
     */
    private final @Nullable String providerID;
    /**
     * If specified, the node's taints.
     * 
     */
    private final @Nullable List<Taint> taints;
    /**
     * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
     * 
     */
    private final @Nullable Boolean unschedulable;

    @CustomType.Constructor
    private NodeSpec(
        @CustomType.Parameter("configSource") @Nullable NodeConfigSource configSource,
        @CustomType.Parameter("externalID") @Nullable String externalID,
        @CustomType.Parameter("podCIDR") @Nullable String podCIDR,
        @CustomType.Parameter("podCIDRs") @Nullable List<String> podCIDRs,
        @CustomType.Parameter("providerID") @Nullable String providerID,
        @CustomType.Parameter("taints") @Nullable List<Taint> taints,
        @CustomType.Parameter("unschedulable") @Nullable Boolean unschedulable) {
        this.configSource = configSource;
        this.externalID = externalID;
        this.podCIDR = podCIDR;
        this.podCIDRs = podCIDRs;
        this.providerID = providerID;
        this.taints = taints;
        this.unschedulable = unschedulable;
    }

    /**
     * Deprecated. If specified, the source of the node's configuration. The DynamicKubeletConfig feature gate must be enabled for the Kubelet to use this field. This field is deprecated as of 1.22: https://git.k8s.io/enhancements/keps/sig-node/281-dynamic-kubelet-configuration
     * 
    */
    public Optional<NodeConfigSource> getConfigSource() {
        return Optional.ofNullable(this.configSource);
    }
    /**
     * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
     * 
    */
    public Optional<String> getExternalID() {
        return Optional.ofNullable(this.externalID);
    }
    /**
     * PodCIDR represents the pod IP range assigned to the node.
     * 
    */
    public Optional<String> getPodCIDR() {
        return Optional.ofNullable(this.podCIDR);
    }
    /**
     * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
     * 
    */
    public List<String> getPodCIDRs() {
        return this.podCIDRs == null ? List.of() : this.podCIDRs;
    }
    /**
     * ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>
     * 
    */
    public Optional<String> getProviderID() {
        return Optional.ofNullable(this.providerID);
    }
    /**
     * If specified, the node's taints.
     * 
    */
    public List<Taint> getTaints() {
        return this.taints == null ? List.of() : this.taints;
    }
    /**
     * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
     * 
    */
    public Optional<Boolean> getUnschedulable() {
        return Optional.ofNullable(this.unschedulable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NodeConfigSource configSource;
        private @Nullable String externalID;
        private @Nullable String podCIDR;
        private @Nullable List<String> podCIDRs;
        private @Nullable String providerID;
        private @Nullable List<Taint> taints;
        private @Nullable Boolean unschedulable;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configSource = defaults.configSource;
    	      this.externalID = defaults.externalID;
    	      this.podCIDR = defaults.podCIDR;
    	      this.podCIDRs = defaults.podCIDRs;
    	      this.providerID = defaults.providerID;
    	      this.taints = defaults.taints;
    	      this.unschedulable = defaults.unschedulable;
        }

        public Builder configSource(@Nullable NodeConfigSource configSource) {
            this.configSource = configSource;
            return this;
        }
        public Builder externalID(@Nullable String externalID) {
            this.externalID = externalID;
            return this;
        }
        public Builder podCIDR(@Nullable String podCIDR) {
            this.podCIDR = podCIDR;
            return this;
        }
        public Builder podCIDRs(@Nullable List<String> podCIDRs) {
            this.podCIDRs = podCIDRs;
            return this;
        }
        public Builder podCIDRs(String... podCIDRs) {
            return podCIDRs(List.of(podCIDRs));
        }
        public Builder providerID(@Nullable String providerID) {
            this.providerID = providerID;
            return this;
        }
        public Builder taints(@Nullable List<Taint> taints) {
            this.taints = taints;
            return this;
        }
        public Builder taints(Taint... taints) {
            return taints(List.of(taints));
        }
        public Builder unschedulable(@Nullable Boolean unschedulable) {
            this.unschedulable = unschedulable;
            return this;
        }        public NodeSpec build() {
            return new NodeSpec(configSource, externalID, podCIDR, podCIDRs, providerID, taints, unschedulable);
        }
    }
}
