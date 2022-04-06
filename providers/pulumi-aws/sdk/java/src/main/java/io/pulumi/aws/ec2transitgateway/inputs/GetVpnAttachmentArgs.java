// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.inputs;

import io.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentFilter;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpnAttachmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVpnAttachmentArgs Empty = new GetVpnAttachmentArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetVpnAttachmentFilter> filters;

    public List<GetVpnAttachmentFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * A map of tags, each pair of which must exactly match a pair on the desired Transit Gateway VPN Attachment.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * Identifier of the EC2 Transit Gateway.
     * 
     */
    @Import(name="transitGatewayId")
      private final @Nullable String transitGatewayId;

    public Optional<String> getTransitGatewayId() {
        return this.transitGatewayId == null ? Optional.empty() : Optional.ofNullable(this.transitGatewayId);
    }

    /**
     * Identifier of the EC2 VPN Connection.
     * 
     */
    @Import(name="vpnConnectionId")
      private final @Nullable String vpnConnectionId;

    public Optional<String> getVpnConnectionId() {
        return this.vpnConnectionId == null ? Optional.empty() : Optional.ofNullable(this.vpnConnectionId);
    }

    public GetVpnAttachmentArgs(
        @Nullable List<GetVpnAttachmentFilter> filters,
        @Nullable Map<String,String> tags,
        @Nullable String transitGatewayId,
        @Nullable String vpnConnectionId) {
        this.filters = filters;
        this.tags = tags;
        this.transitGatewayId = transitGatewayId;
        this.vpnConnectionId = vpnConnectionId;
    }

    private GetVpnAttachmentArgs() {
        this.filters = List.of();
        this.tags = Map.of();
        this.transitGatewayId = null;
        this.vpnConnectionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetVpnAttachmentFilter> filters;
        private @Nullable Map<String,String> tags;
        private @Nullable String transitGatewayId;
        private @Nullable String vpnConnectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.tags = defaults.tags;
    	      this.transitGatewayId = defaults.transitGatewayId;
    	      this.vpnConnectionId = defaults.vpnConnectionId;
        }

        public Builder filters(@Nullable List<GetVpnAttachmentFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVpnAttachmentFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder transitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }
        public Builder vpnConnectionId(@Nullable String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }        public GetVpnAttachmentArgs build() {
            return new GetVpnAttachmentArgs(filters, tags, transitGatewayId, vpnConnectionId);
        }
    }
}