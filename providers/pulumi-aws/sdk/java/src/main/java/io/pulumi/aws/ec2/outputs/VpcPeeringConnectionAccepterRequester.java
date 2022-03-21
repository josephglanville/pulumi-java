// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpcPeeringConnectionAccepterRequester {
    /**
     * Indicates whether a local ClassicLink connection can communicate
     * with the peer VPC over the VPC Peering Connection.
     * 
     */
    private final @Nullable Boolean allowClassicLinkToRemoteVpc;
    /**
     * Indicates whether a local VPC can resolve public DNS hostnames to
     * private IP addresses when queried from instances in a peer VPC.
     * 
     */
    private final @Nullable Boolean allowRemoteVpcDnsResolution;
    /**
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC Peering Connection.
     * 
     */
    private final @Nullable Boolean allowVpcToRemoteClassicLink;

    @CustomType.Constructor
    private VpcPeeringConnectionAccepterRequester(
        @CustomType.Parameter("allowClassicLinkToRemoteVpc") @Nullable Boolean allowClassicLinkToRemoteVpc,
        @CustomType.Parameter("allowRemoteVpcDnsResolution") @Nullable Boolean allowRemoteVpcDnsResolution,
        @CustomType.Parameter("allowVpcToRemoteClassicLink") @Nullable Boolean allowVpcToRemoteClassicLink) {
        this.allowClassicLinkToRemoteVpc = allowClassicLinkToRemoteVpc;
        this.allowRemoteVpcDnsResolution = allowRemoteVpcDnsResolution;
        this.allowVpcToRemoteClassicLink = allowVpcToRemoteClassicLink;
    }

    /**
     * Indicates whether a local ClassicLink connection can communicate
     * with the peer VPC over the VPC Peering Connection.
     * 
    */
    public Optional<Boolean> getAllowClassicLinkToRemoteVpc() {
        return Optional.ofNullable(this.allowClassicLinkToRemoteVpc);
    }
    /**
     * Indicates whether a local VPC can resolve public DNS hostnames to
     * private IP addresses when queried from instances in a peer VPC.
     * 
    */
    public Optional<Boolean> getAllowRemoteVpcDnsResolution() {
        return Optional.ofNullable(this.allowRemoteVpcDnsResolution);
    }
    /**
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC Peering Connection.
     * 
    */
    public Optional<Boolean> getAllowVpcToRemoteClassicLink() {
        return Optional.ofNullable(this.allowVpcToRemoteClassicLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConnectionAccepterRequester defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowClassicLinkToRemoteVpc;
        private @Nullable Boolean allowRemoteVpcDnsResolution;
        private @Nullable Boolean allowVpcToRemoteClassicLink;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcPeeringConnectionAccepterRequester defaults) {
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
        }        public VpcPeeringConnectionAccepterRequester build() {
            return new VpcPeeringConnectionAccepterRequester(allowClassicLinkToRemoteVpc, allowRemoteVpcDnsResolution, allowVpcToRemoteClassicLink);
        }
    }
}
