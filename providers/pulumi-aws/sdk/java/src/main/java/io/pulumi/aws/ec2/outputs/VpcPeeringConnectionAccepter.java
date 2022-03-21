// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpcPeeringConnectionAccepter {
    /**
     * Allow a local linked EC2-Classic instance to communicate
     * with instances in a peer VPC. This enables an outbound communication from the local ClassicLink connection
     * to the remote VPC.
     * 
     */
    private final @Nullable Boolean allowClassicLinkToRemoteVpc;
    /**
     * Allow a local VPC to resolve public DNS hostnames to
     * private IP addresses when queried from instances in the peer VPC.
     * 
     */
    private final @Nullable Boolean allowRemoteVpcDnsResolution;
    /**
     * Allow a local VPC to communicate with a linked EC2-Classic
     * instance in a peer VPC. This enables an outbound communication from the local VPC to the remote ClassicLink
     * connection.
     * 
     */
    private final @Nullable Boolean allowVpcToRemoteClassicLink;

    @CustomType.Constructor
    private VpcPeeringConnectionAccepter(
        @CustomType.Parameter("allowClassicLinkToRemoteVpc") @Nullable Boolean allowClassicLinkToRemoteVpc,
        @CustomType.Parameter("allowRemoteVpcDnsResolution") @Nullable Boolean allowRemoteVpcDnsResolution,
        @CustomType.Parameter("allowVpcToRemoteClassicLink") @Nullable Boolean allowVpcToRemoteClassicLink) {
        this.allowClassicLinkToRemoteVpc = allowClassicLinkToRemoteVpc;
        this.allowRemoteVpcDnsResolution = allowRemoteVpcDnsResolution;
        this.allowVpcToRemoteClassicLink = allowVpcToRemoteClassicLink;
    }

    /**
     * Allow a local linked EC2-Classic instance to communicate
     * with instances in a peer VPC. This enables an outbound communication from the local ClassicLink connection
     * to the remote VPC.
     * 
    */
    public Optional<Boolean> getAllowClassicLinkToRemoteVpc() {
        return Optional.ofNullable(this.allowClassicLinkToRemoteVpc);
    }
    /**
     * Allow a local VPC to resolve public DNS hostnames to
     * private IP addresses when queried from instances in the peer VPC.
     * 
    */
    public Optional<Boolean> getAllowRemoteVpcDnsResolution() {
        return Optional.ofNullable(this.allowRemoteVpcDnsResolution);
    }
    /**
     * Allow a local VPC to communicate with a linked EC2-Classic
     * instance in a peer VPC. This enables an outbound communication from the local VPC to the remote ClassicLink
     * connection.
     * 
    */
    public Optional<Boolean> getAllowVpcToRemoteClassicLink() {
        return Optional.ofNullable(this.allowVpcToRemoteClassicLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConnectionAccepter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowClassicLinkToRemoteVpc;
        private @Nullable Boolean allowRemoteVpcDnsResolution;
        private @Nullable Boolean allowVpcToRemoteClassicLink;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcPeeringConnectionAccepter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowClassicLinkToRemoteVpc = defaults.allowClassicLinkToRemoteVpc;
    	      this.allowRemoteVpcDnsResolution = defaults.allowRemoteVpcDnsResolution;
    	      this.allowVpcToRemoteClassicLink = defaults.allowVpcToRemoteClassicLink;
        }

        public Builder allowClassicLinkToRemoteVpc(@Nullable Boolean allowClassicLinkToRemoteVpc) {
            this.allowClassicLinkToRemoteVpc = allowClassicLinkToRemoteVpc;
            return this;
        }
        public Builder allowRemoteVpcDnsResolution(@Nullable Boolean allowRemoteVpcDnsResolution) {
            this.allowRemoteVpcDnsResolution = allowRemoteVpcDnsResolution;
            return this;
        }
        public Builder allowVpcToRemoteClassicLink(@Nullable Boolean allowVpcToRemoteClassicLink) {
            this.allowVpcToRemoteClassicLink = allowVpcToRemoteClassicLink;
            return this;
        }        public VpcPeeringConnectionAccepter build() {
            return new VpcPeeringConnectionAccepter(allowClassicLinkToRemoteVpc, allowRemoteVpcDnsResolution, allowVpcToRemoteClassicLink);
        }
    }
}
