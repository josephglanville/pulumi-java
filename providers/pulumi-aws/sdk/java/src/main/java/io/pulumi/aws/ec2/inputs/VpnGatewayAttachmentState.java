// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnGatewayAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final VpnGatewayAttachmentState Empty = new VpnGatewayAttachmentState();

    /**
     * The ID of the VPC.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    /**
     * The ID of the Virtual Private Gateway.
     * 
     */
    @Import(name="vpnGatewayId")
      private final @Nullable Output<String> vpnGatewayId;

    public Output<String> getVpnGatewayId() {
        return this.vpnGatewayId == null ? Codegen.empty() : this.vpnGatewayId;
    }

    public VpnGatewayAttachmentState(
        @Nullable Output<String> vpcId,
        @Nullable Output<String> vpnGatewayId) {
        this.vpcId = vpcId;
        this.vpnGatewayId = vpnGatewayId;
    }

    private VpnGatewayAttachmentState() {
        this.vpcId = Codegen.empty();
        this.vpnGatewayId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> vpcId;
        private @Nullable Output<String> vpnGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcId = defaults.vpcId;
    	      this.vpnGatewayId = defaults.vpnGatewayId;
        }

        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }
        public Builder vpnGatewayId(@Nullable Output<String> vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }
        public Builder vpnGatewayId(@Nullable String vpnGatewayId) {
            this.vpnGatewayId = Codegen.ofNullable(vpnGatewayId);
            return this;
        }        public VpnGatewayAttachmentState build() {
            return new VpnGatewayAttachmentState(vpcId, vpnGatewayId);
        }
    }
}
