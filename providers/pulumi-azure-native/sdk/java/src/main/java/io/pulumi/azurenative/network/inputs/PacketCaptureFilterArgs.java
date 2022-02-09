// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.PcProtocol;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketCaptureFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketCaptureFilterArgs Empty = new PacketCaptureFilterArgs();

    @InputImport(name="localIPAddress")
    private final @Nullable Input<String> localIPAddress;

    public Input<String> getLocalIPAddress() {
        return this.localIPAddress == null ? Input.empty() : this.localIPAddress;
    }

    @InputImport(name="localPort")
    private final @Nullable Input<String> localPort;

    public Input<String> getLocalPort() {
        return this.localPort == null ? Input.empty() : this.localPort;
    }

    @InputImport(name="protocol")
    private final @Nullable Input<Either<String,PcProtocol>> protocol;

    public Input<Either<String,PcProtocol>> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    @InputImport(name="remoteIPAddress")
    private final @Nullable Input<String> remoteIPAddress;

    public Input<String> getRemoteIPAddress() {
        return this.remoteIPAddress == null ? Input.empty() : this.remoteIPAddress;
    }

    @InputImport(name="remotePort")
    private final @Nullable Input<String> remotePort;

    public Input<String> getRemotePort() {
        return this.remotePort == null ? Input.empty() : this.remotePort;
    }

    public PacketCaptureFilterArgs(
        @Nullable Input<String> localIPAddress,
        @Nullable Input<String> localPort,
        @Nullable Input<Either<String,PcProtocol>> protocol,
        @Nullable Input<String> remoteIPAddress,
        @Nullable Input<String> remotePort) {
        this.localIPAddress = localIPAddress;
        this.localPort = localPort;
        this.protocol = protocol == null ? Input.ofLeft("Any") : protocol;
        this.remoteIPAddress = remoteIPAddress;
        this.remotePort = remotePort;
    }

    private PacketCaptureFilterArgs() {
        this.localIPAddress = Input.empty();
        this.localPort = Input.empty();
        this.protocol = Input.empty();
        this.remoteIPAddress = Input.empty();
        this.remotePort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketCaptureFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> localIPAddress;
        private @Nullable Input<String> localPort;
        private @Nullable Input<Either<String,PcProtocol>> protocol;
        private @Nullable Input<String> remoteIPAddress;
        private @Nullable Input<String> remotePort;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketCaptureFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localIPAddress = defaults.localIPAddress;
    	      this.localPort = defaults.localPort;
    	      this.protocol = defaults.protocol;
    	      this.remoteIPAddress = defaults.remoteIPAddress;
    	      this.remotePort = defaults.remotePort;
        }

        public Builder setLocalIPAddress(@Nullable Input<String> localIPAddress) {
            this.localIPAddress = localIPAddress;
            return this;
        }

        public Builder setLocalIPAddress(@Nullable String localIPAddress) {
            this.localIPAddress = Input.ofNullable(localIPAddress);
            return this;
        }

        public Builder setLocalPort(@Nullable Input<String> localPort) {
            this.localPort = localPort;
            return this;
        }

        public Builder setLocalPort(@Nullable String localPort) {
            this.localPort = Input.ofNullable(localPort);
            return this;
        }

        public Builder setProtocol(@Nullable Input<Either<String,PcProtocol>> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable Either<String,PcProtocol> protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setRemoteIPAddress(@Nullable Input<String> remoteIPAddress) {
            this.remoteIPAddress = remoteIPAddress;
            return this;
        }

        public Builder setRemoteIPAddress(@Nullable String remoteIPAddress) {
            this.remoteIPAddress = Input.ofNullable(remoteIPAddress);
            return this;
        }

        public Builder setRemotePort(@Nullable Input<String> remotePort) {
            this.remotePort = remotePort;
            return this;
        }

        public Builder setRemotePort(@Nullable String remotePort) {
            this.remotePort = Input.ofNullable(remotePort);
            return this;
        }

        public PacketCaptureFilterArgs build() {
            return new PacketCaptureFilterArgs(localIPAddress, localPort, protocol, remoteIPAddress, remotePort);
        }
    }
}
