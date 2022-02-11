// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkPolicyPort {
    private final @Nullable Integer endPort;
    private final @Nullable Either<Integer,String> port;
    private final @Nullable String protocol;

    @OutputCustomType.Constructor({"endPort","port","protocol"})
    private NetworkPolicyPort(
        @Nullable Integer endPort,
        @Nullable Either<Integer,String> port,
        @Nullable String protocol) {
        this.endPort = endPort;
        this.port = port;
        this.protocol = protocol;
    }

    public Optional<Integer> getEndPort() {
        return Optional.ofNullable(this.endPort);
    }
    public Optional<Either<Integer,String>> getPort() {
        return Optional.ofNullable(this.port);
    }
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer endPort;
        private @Nullable Either<Integer,String> port;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endPort = defaults.endPort;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder setEndPort(@Nullable Integer endPort) {
            this.endPort = endPort;
            return this;
        }

        public Builder setPort(@Nullable Either<Integer,String> port) {
            this.port = port;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public NetworkPolicyPort build() {
            return new NetworkPolicyPort(endPort, port, protocol);
        }
    }
}
