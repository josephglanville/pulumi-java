// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.inputs;

import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NetworkPolicyPort describes a port to allow traffic on
 * 
 */
public final class NetworkPolicyPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyPortArgs Empty = new NetworkPolicyPortArgs();

    /**
     * If set, indicates that the range of ports from port to endPort, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port. This feature is in Beta state and is enabled by default. It can be disabled using the Feature Gate "NetworkPolicyEndPort".
     * 
     */
    @Import(name="endPort")
      private final @Nullable Output<Integer> endPort;

    public Output<Integer> getEndPort() {
        return this.endPort == null ? Output.empty() : this.endPort;
    }

    /**
     * The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Either<Integer,String>> port;

    public Output<Either<Integer,String>> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol == null ? Output.empty() : this.protocol;
    }

    public NetworkPolicyPortArgs(
        @Nullable Output<Integer> endPort,
        @Nullable Output<Either<Integer,String>> port,
        @Nullable Output<String> protocol) {
        this.endPort = endPort;
        this.port = port;
        this.protocol = protocol;
    }

    private NetworkPolicyPortArgs() {
        this.endPort = Output.empty();
        this.port = Output.empty();
        this.protocol = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> endPort;
        private @Nullable Output<Either<Integer,String>> port;
        private @Nullable Output<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endPort = defaults.endPort;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder endPort(@Nullable Output<Integer> endPort) {
            this.endPort = endPort;
            return this;
        }
        public Builder endPort(@Nullable Integer endPort) {
            this.endPort = Output.ofNullable(endPort);
            return this;
        }
        public Builder port(@Nullable Output<Either<Integer,String>> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Either<Integer,String> port) {
            this.port = Output.ofNullable(port);
            return this;
        }
        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = Output.ofNullable(protocol);
            return this;
        }        public NetworkPolicyPortArgs build() {
            return new NetworkPolicyPortArgs(endPort, port, protocol);
        }
    }
}
