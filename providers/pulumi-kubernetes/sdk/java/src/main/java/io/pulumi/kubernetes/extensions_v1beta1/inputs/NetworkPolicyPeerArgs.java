// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Input;
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
      private final @Nullable Input<IPBlockArgs> ipBlock;

    public Input<IPBlockArgs> getIpBlock() {
        return this.ipBlock == null ? Input.empty() : this.ipBlock;
    }

    /**
     * Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
     * 
     * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
     * 
     */
    @InputImport(name="namespaceSelector")
      private final @Nullable Input<LabelSelectorArgs> namespaceSelector;

    public Input<LabelSelectorArgs> getNamespaceSelector() {
        return this.namespaceSelector == null ? Input.empty() : this.namespaceSelector;
    }

    /**
     * This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
     * 
     * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
     * 
     */
    @InputImport(name="podSelector")
      private final @Nullable Input<LabelSelectorArgs> podSelector;

    public Input<LabelSelectorArgs> getPodSelector() {
        return this.podSelector == null ? Input.empty() : this.podSelector;
    }

    public NetworkPolicyPeerArgs(
        @Nullable Input<IPBlockArgs> ipBlock,
        @Nullable Input<LabelSelectorArgs> namespaceSelector,
        @Nullable Input<LabelSelectorArgs> podSelector) {
        this.ipBlock = ipBlock;
        this.namespaceSelector = namespaceSelector;
        this.podSelector = podSelector;
    }

    private NetworkPolicyPeerArgs() {
        this.ipBlock = Input.empty();
        this.namespaceSelector = Input.empty();
        this.podSelector = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyPeerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IPBlockArgs> ipBlock;
        private @Nullable Input<LabelSelectorArgs> namespaceSelector;
        private @Nullable Input<LabelSelectorArgs> podSelector;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyPeerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipBlock = defaults.ipBlock;
    	      this.namespaceSelector = defaults.namespaceSelector;
    	      this.podSelector = defaults.podSelector;
        }

        public Builder setIpBlock(@Nullable Input<IPBlockArgs> ipBlock) {
            this.ipBlock = ipBlock;
            return this;
        }

        public Builder setIpBlock(@Nullable IPBlockArgs ipBlock) {
            this.ipBlock = Input.ofNullable(ipBlock);
            return this;
        }

        public Builder setNamespaceSelector(@Nullable Input<LabelSelectorArgs> namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }

        public Builder setNamespaceSelector(@Nullable LabelSelectorArgs namespaceSelector) {
            this.namespaceSelector = Input.ofNullable(namespaceSelector);
            return this;
        }

        public Builder setPodSelector(@Nullable Input<LabelSelectorArgs> podSelector) {
            this.podSelector = podSelector;
            return this;
        }

        public Builder setPodSelector(@Nullable LabelSelectorArgs podSelector) {
            this.podSelector = Input.ofNullable(podSelector);
            return this;
        }
        public NetworkPolicyPeerArgs build() {
            return new NetworkPolicyPeerArgs(ipBlock, namespaceSelector, podSelector);
        }
    }
}
