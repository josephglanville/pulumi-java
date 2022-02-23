// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.networking.k8s.io_v1.inputs.NetworkPolicyPeerArgs;
import io.pulumi.kubernetes.networking.k8s.io_v1.inputs.NetworkPolicyPortArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and from.
 * 
 */
public final class NetworkPolicyIngressRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyIngressRuleArgs Empty = new NetworkPolicyIngressRuleArgs();

    /**
     * List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
     * 
     */
    @InputImport(name="from")
      private final @Nullable Input<List<NetworkPolicyPeerArgs>> from;

    public Input<List<NetworkPolicyPeerArgs>> getFrom() {
        return this.from == null ? Input.empty() : this.from;
    }

    /**
     * List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     * 
     */
    @InputImport(name="ports")
      private final @Nullable Input<List<NetworkPolicyPortArgs>> ports;

    public Input<List<NetworkPolicyPortArgs>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    public NetworkPolicyIngressRuleArgs(
        @Nullable Input<List<NetworkPolicyPeerArgs>> from,
        @Nullable Input<List<NetworkPolicyPortArgs>> ports) {
        this.from = from;
        this.ports = ports;
    }

    private NetworkPolicyIngressRuleArgs() {
        this.from = Input.empty();
        this.ports = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyIngressRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<NetworkPolicyPeerArgs>> from;
        private @Nullable Input<List<NetworkPolicyPortArgs>> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyIngressRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.ports = defaults.ports;
        }

        public Builder setFrom(@Nullable Input<List<NetworkPolicyPeerArgs>> from) {
            this.from = from;
            return this;
        }

        public Builder setFrom(@Nullable List<NetworkPolicyPeerArgs> from) {
            this.from = Input.ofNullable(from);
            return this;
        }

        public Builder setPorts(@Nullable Input<List<NetworkPolicyPortArgs>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setPorts(@Nullable List<NetworkPolicyPortArgs> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }
        public NetworkPolicyIngressRuleArgs build() {
            return new NetworkPolicyIngressRuleArgs(from, ports);
        }
    }
}
