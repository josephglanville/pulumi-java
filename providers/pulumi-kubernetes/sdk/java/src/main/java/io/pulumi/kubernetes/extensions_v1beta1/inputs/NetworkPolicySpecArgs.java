// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.NetworkPolicyEgressRuleArgs;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.NetworkPolicyIngressRuleArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DEPRECATED 1.9 - This group version of NetworkPolicySpec is deprecated by networking/v1/NetworkPolicySpec.
 * 
 */
public final class NetworkPolicySpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicySpecArgs Empty = new NetworkPolicySpecArgs();

    /**
     * List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8
     * 
     */
    @InputImport(name="egress")
      private final @Nullable Input<List<NetworkPolicyEgressRuleArgs>> egress;

    public Input<List<NetworkPolicyEgressRuleArgs>> getEgress() {
        return this.egress == null ? Input.empty() : this.egress;
    }

    /**
     * List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod OR if the traffic source is the pod's local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default).
     * 
     */
    @InputImport(name="ingress")
      private final @Nullable Input<List<NetworkPolicyIngressRuleArgs>> ingress;

    public Input<List<NetworkPolicyIngressRuleArgs>> getIngress() {
        return this.ingress == null ? Input.empty() : this.ingress;
    }

    /**
     * Selects the pods to which this NetworkPolicy object applies.  The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods.  In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.
     * 
     */
    @InputImport(name="podSelector", required=true)
      private final Input<LabelSelectorArgs> podSelector;

    public Input<LabelSelectorArgs> getPodSelector() {
        return this.podSelector;
    }

    /**
     * List of rule types that the NetworkPolicy relates to. Valid options are "Ingress", "Egress", or "Ingress,Egress". If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include "Egress" (since such a policy would not include an Egress section and would otherwise default to just [ "Ingress" ]). This field is beta-level in 1.8
     * 
     */
    @InputImport(name="policyTypes")
      private final @Nullable Input<List<String>> policyTypes;

    public Input<List<String>> getPolicyTypes() {
        return this.policyTypes == null ? Input.empty() : this.policyTypes;
    }

    public NetworkPolicySpecArgs(
        @Nullable Input<List<NetworkPolicyEgressRuleArgs>> egress,
        @Nullable Input<List<NetworkPolicyIngressRuleArgs>> ingress,
        Input<LabelSelectorArgs> podSelector,
        @Nullable Input<List<String>> policyTypes) {
        this.egress = egress;
        this.ingress = ingress;
        this.podSelector = Objects.requireNonNull(podSelector, "expected parameter 'podSelector' to be non-null");
        this.policyTypes = policyTypes;
    }

    private NetworkPolicySpecArgs() {
        this.egress = Input.empty();
        this.ingress = Input.empty();
        this.podSelector = Input.empty();
        this.policyTypes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicySpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<NetworkPolicyEgressRuleArgs>> egress;
        private @Nullable Input<List<NetworkPolicyIngressRuleArgs>> ingress;
        private Input<LabelSelectorArgs> podSelector;
        private @Nullable Input<List<String>> policyTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicySpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egress = defaults.egress;
    	      this.ingress = defaults.ingress;
    	      this.podSelector = defaults.podSelector;
    	      this.policyTypes = defaults.policyTypes;
        }

        public Builder setEgress(@Nullable Input<List<NetworkPolicyEgressRuleArgs>> egress) {
            this.egress = egress;
            return this;
        }

        public Builder setEgress(@Nullable List<NetworkPolicyEgressRuleArgs> egress) {
            this.egress = Input.ofNullable(egress);
            return this;
        }

        public Builder setIngress(@Nullable Input<List<NetworkPolicyIngressRuleArgs>> ingress) {
            this.ingress = ingress;
            return this;
        }

        public Builder setIngress(@Nullable List<NetworkPolicyIngressRuleArgs> ingress) {
            this.ingress = Input.ofNullable(ingress);
            return this;
        }

        public Builder setPodSelector(Input<LabelSelectorArgs> podSelector) {
            this.podSelector = Objects.requireNonNull(podSelector);
            return this;
        }

        public Builder setPodSelector(LabelSelectorArgs podSelector) {
            this.podSelector = Input.of(Objects.requireNonNull(podSelector));
            return this;
        }

        public Builder setPolicyTypes(@Nullable Input<List<String>> policyTypes) {
            this.policyTypes = policyTypes;
            return this;
        }

        public Builder setPolicyTypes(@Nullable List<String> policyTypes) {
            this.policyTypes = Input.ofNullable(policyTypes);
            return this;
        }
        public NetworkPolicySpecArgs build() {
            return new NetworkPolicySpecArgs(egress, ingress, podSelector, policyTypes);
        }
    }
}
