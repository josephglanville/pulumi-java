// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DEPRECATED 1.9 - This group version of NetworkPolicyPort is deprecated by networking/v1/NetworkPolicyPort.
 * 
 */
public final class NetworkPolicyPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyPortArgs Empty = new NetworkPolicyPortArgs();

    /**
     * If specified, the port on the given protocol.  This can either be a numerical or named port on a pod.  If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Output<Either<Integer,String>> port;

    public Output<Either<Integer,String>> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * Optional.  The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
     * 
     */
    @InputImport(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol == null ? Output.empty() : this.protocol;
    }

    public NetworkPolicyPortArgs(
        @Nullable Output<Either<Integer,String>> port,
        @Nullable Output<String> protocol) {
        this.port = port;
        this.protocol = protocol;
    }

    private NetworkPolicyPortArgs() {
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
        private @Nullable Output<Either<Integer,String>> port;
        private @Nullable Output<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
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
        }
        public NetworkPolicyPortArgs build() {
            return new NetworkPolicyPortArgs(port, protocol);
        }
    }
}
