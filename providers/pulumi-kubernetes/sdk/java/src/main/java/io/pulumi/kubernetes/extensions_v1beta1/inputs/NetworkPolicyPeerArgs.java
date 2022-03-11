// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.IPBlockArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DEPRECATED 1.9 - This group version of NetworkPolicyPeer is deprecated by networking/v1/NetworkPolicyPeer.
 * 
 */
public final class NetworkPolicyPeerArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyPeerArgs Empty = new NetworkPolicyPeerArgs();

    /**
     * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
     * 
     */
    @InputImport(name="ipBlock")
      private final @Nullable Output<IPBlockArgs> ipBlock;

    public Output<IPBlockArgs> getIpBlock() {
        return this.ipBlock == null ? Output.empty() : this.ipBlock;
    }

    /**
     * Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
     * 
     * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
     * 
     */
    @InputImport(name="namespaceSelector")
      private final @Nullable Output<LabelSelectorArgs> namespaceSelector;

    public Output<LabelSelectorArgs> getNamespaceSelector() {
        return this.namespaceSelector == null ? Output.empty() : this.namespaceSelector;
    }

    /**
     * This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
     * 
     * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
     * 
     */
    @InputImport(name="podSelector")
      private final @Nullable Output<LabelSelectorArgs> podSelector;

    public Output<LabelSelectorArgs> getPodSelector() {
        return this.podSelector == null ? Output.empty() : this.podSelector;
    }

    public NetworkPolicyPeerArgs(
        @Nullable Output<IPBlockArgs> ipBlock,
        @Nullable Output<LabelSelectorArgs> namespaceSelector,
        @Nullable Output<LabelSelectorArgs> podSelector) {
        this.ipBlock = ipBlock;
        this.namespaceSelector = namespaceSelector;
        this.podSelector = podSelector;
    }

    private NetworkPolicyPeerArgs() {
        this.ipBlock = Output.empty();
        this.namespaceSelector = Output.empty();
        this.podSelector = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyPeerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IPBlockArgs> ipBlock;
        private @Nullable Output<LabelSelectorArgs> namespaceSelector;
        private @Nullable Output<LabelSelectorArgs> podSelector;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyPeerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipBlock = defaults.ipBlock;
    	      this.namespaceSelector = defaults.namespaceSelector;
    	      this.podSelector = defaults.podSelector;
        }

        public Builder ipBlock(@Nullable Output<IPBlockArgs> ipBlock) {
            this.ipBlock = ipBlock;
            return this;
        }

        public Builder ipBlock(@Nullable IPBlockArgs ipBlock) {
            this.ipBlock = Output.ofNullable(ipBlock);
            return this;
        }

        public Builder namespaceSelector(@Nullable Output<LabelSelectorArgs> namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }

        public Builder namespaceSelector(@Nullable LabelSelectorArgs namespaceSelector) {
            this.namespaceSelector = Output.ofNullable(namespaceSelector);
            return this;
        }

        public Builder podSelector(@Nullable Output<LabelSelectorArgs> podSelector) {
            this.podSelector = podSelector;
            return this;
        }

        public Builder podSelector(@Nullable LabelSelectorArgs podSelector) {
            this.podSelector = Output.ofNullable(podSelector);
            return this;
        }
        public NetworkPolicyPeerArgs build() {
            return new NetworkPolicyPeerArgs(ipBlock, namespaceSelector, podSelector);
        }
    }
}
