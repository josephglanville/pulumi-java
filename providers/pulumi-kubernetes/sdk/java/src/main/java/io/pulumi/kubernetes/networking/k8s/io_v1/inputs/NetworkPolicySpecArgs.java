// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import io.pulumi.kubernetes.networking.k8s.io_v1.inputs.NetworkPolicyEgressRuleArgs;
import io.pulumi.kubernetes.networking.k8s.io_v1.inputs.NetworkPolicyIngressRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkPolicySpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicySpecArgs Empty = new NetworkPolicySpecArgs();

    @InputImport(name="egress")
    private final @Nullable Input<List<NetworkPolicyEgressRuleArgs>> egress;

    public Input<List<NetworkPolicyEgressRuleArgs>> getEgress() {
        return this.egress == null ? Input.empty() : this.egress;
    }

    @InputImport(name="ingress")
    private final @Nullable Input<List<NetworkPolicyIngressRuleArgs>> ingress;

    public Input<List<NetworkPolicyIngressRuleArgs>> getIngress() {
        return this.ingress == null ? Input.empty() : this.ingress;
    }

    @InputImport(name="podSelector", required=true)
    private final Input<LabelSelectorArgs> podSelector;

    public Input<LabelSelectorArgs> getPodSelector() {
        return this.podSelector;
    }

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
