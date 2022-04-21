// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions_v1beta1.inputs;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DEPRECATED 1.9 - This group version of NetworkPolicyPort is deprecated by networking/v1/NetworkPolicyPort.
 * 
 */
public final class NetworkPolicyPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyPortArgs Empty = new NetworkPolicyPortArgs();

    /**
     * If specified, the port on the given protocol.  This can either be a numerical or named port on a pod.  If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Either<Integer,String>> port;

    public Optional<Output<Either<Integer,String>>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Optional.  The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private NetworkPolicyPortArgs() {}

    private NetworkPolicyPortArgs(NetworkPolicyPortArgs $) {
        this.port = $.port;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPolicyPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPolicyPortArgs $;

        public Builder() {
            $ = new NetworkPolicyPortArgs();
        }

        public Builder(NetworkPolicyPortArgs defaults) {
            $ = new NetworkPolicyPortArgs(Objects.requireNonNull(defaults));
        }

        public Builder port(@Nullable Output<Either<Integer,String>> port) {
            $.port = port;
            return this;
        }

        public Builder port(Either<Integer,String> port) {
            return port(Output.of(port));
        }

        public Builder port(Integer port) {
            return port(Either.ofLeft(port));
        }

        public Builder port(String port) {
            return port(Either.ofRight(port));
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public NetworkPolicyPortArgs build() {
            return $;
        }
    }

}
