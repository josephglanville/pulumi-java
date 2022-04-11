// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.networking.k8s.io_v1.inputs.NetworkPolicyPeerArgs;
import io.pulumi.kubernetes.networking.k8s.io_v1.inputs.NetworkPolicyPortArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and to. This type is beta-level in 1.8
 * 
 */
public final class NetworkPolicyEgressRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyEgressRuleArgs Empty = new NetworkPolicyEgressRuleArgs();

    /**
     * List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<NetworkPolicyPortArgs>> ports;

    public Output<List<NetworkPolicyPortArgs>> getPorts() {
        return this.ports == null ? Codegen.empty() : this.ports;
    }

    /**
     * List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
     * 
     */
    @Import(name="to")
      private final @Nullable Output<List<NetworkPolicyPeerArgs>> to;

    public Output<List<NetworkPolicyPeerArgs>> getTo() {
        return this.to == null ? Codegen.empty() : this.to;
    }

    public NetworkPolicyEgressRuleArgs(
        @Nullable Output<List<NetworkPolicyPortArgs>> ports,
        @Nullable Output<List<NetworkPolicyPeerArgs>> to) {
        this.ports = ports;
        this.to = to;
    }

    private NetworkPolicyEgressRuleArgs() {
        this.ports = Codegen.empty();
        this.to = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyEgressRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<NetworkPolicyPortArgs>> ports;
        private @Nullable Output<List<NetworkPolicyPeerArgs>> to;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyEgressRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ports = defaults.ports;
    	      this.to = defaults.to;
        }

        public Builder ports(@Nullable Output<List<NetworkPolicyPortArgs>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<NetworkPolicyPortArgs> ports) {
            this.ports = Codegen.ofNullable(ports);
            return this;
        }
        public Builder ports(NetworkPolicyPortArgs... ports) {
            return ports(List.of(ports));
        }
        public Builder to(@Nullable Output<List<NetworkPolicyPeerArgs>> to) {
            this.to = to;
            return this;
        }
        public Builder to(@Nullable List<NetworkPolicyPeerArgs> to) {
            this.to = Codegen.ofNullable(to);
            return this;
        }
        public Builder to(NetworkPolicyPeerArgs... to) {
            return to(List.of(to));
        }        public NetworkPolicyEgressRuleArgs build() {
            return new NetworkPolicyEgressRuleArgs(ports, to);
        }
    }
}
