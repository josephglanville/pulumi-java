// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HaVpnGatewayVpnInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final HaVpnGatewayVpnInterfaceArgs Empty = new HaVpnGatewayVpnInterfaceArgs();

    /**
     * The numeric ID of this VPN gateway interface.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<Integer> id;

    public Output<Integer> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * URL of the interconnect attachment resource. When the value
     * of this field is present, the VPN Gateway will be used for
     * IPsec-encrypted Cloud Interconnect; all Egress or Ingress
     * traffic for this VPN Gateway interface will go through the
     * specified interconnect attachment resource.
     * Not currently available publicly.
     * 
     */
    @Import(name="interconnectAttachment")
      private final @Nullable Output<String> interconnectAttachment;

    public Output<String> getInterconnectAttachment() {
        return this.interconnectAttachment == null ? Codegen.empty() : this.interconnectAttachment;
    }

    /**
     * - 
     * The external IP address for this VPN gateway interface.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Codegen.empty() : this.ipAddress;
    }

    public HaVpnGatewayVpnInterfaceArgs(
        @Nullable Output<Integer> id,
        @Nullable Output<String> interconnectAttachment,
        @Nullable Output<String> ipAddress) {
        this.id = id;
        this.interconnectAttachment = interconnectAttachment;
        this.ipAddress = ipAddress;
    }

    private HaVpnGatewayVpnInterfaceArgs() {
        this.id = Codegen.empty();
        this.interconnectAttachment = Codegen.empty();
        this.ipAddress = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HaVpnGatewayVpnInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> id;
        private @Nullable Output<String> interconnectAttachment;
        private @Nullable Output<String> ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(HaVpnGatewayVpnInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.interconnectAttachment = defaults.interconnectAttachment;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder id(@Nullable Output<Integer> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable Integer id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder interconnectAttachment(@Nullable Output<String> interconnectAttachment) {
            this.interconnectAttachment = interconnectAttachment;
            return this;
        }
        public Builder interconnectAttachment(@Nullable String interconnectAttachment) {
            this.interconnectAttachment = Codegen.ofNullable(interconnectAttachment);
            return this;
        }
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Codegen.ofNullable(ipAddress);
            return this;
        }        public HaVpnGatewayVpnInterfaceArgs build() {
            return new HaVpnGatewayVpnInterfaceArgs(id, interconnectAttachment, ipAddress);
        }
    }
}
