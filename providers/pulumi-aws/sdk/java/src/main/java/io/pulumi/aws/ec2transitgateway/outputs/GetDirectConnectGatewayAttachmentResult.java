// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.outputs;

import io.pulumi.aws.ec2transitgateway.outputs.GetDirectConnectGatewayAttachmentFilter;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDirectConnectGatewayAttachmentResult {
    private final @Nullable String dxGatewayId;
    private final @Nullable List<GetDirectConnectGatewayAttachmentFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Key-value tags for the EC2 Transit Gateway Attachment
     * 
     */
    private final Map<String,String> tags;
    private final @Nullable String transitGatewayId;

    @CustomType.Constructor
    private GetDirectConnectGatewayAttachmentResult(
        @CustomType.Parameter("dxGatewayId") @Nullable String dxGatewayId,
        @CustomType.Parameter("filters") @Nullable List<GetDirectConnectGatewayAttachmentFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("transitGatewayId") @Nullable String transitGatewayId) {
        this.dxGatewayId = dxGatewayId;
        this.filters = filters;
        this.id = id;
        this.tags = tags;
        this.transitGatewayId = transitGatewayId;
    }

    public Optional<String> getDxGatewayId() {
        return Optional.ofNullable(this.dxGatewayId);
    }
    public List<GetDirectConnectGatewayAttachmentFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Key-value tags for the EC2 Transit Gateway Attachment
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    public Optional<String> getTransitGatewayId() {
        return Optional.ofNullable(this.transitGatewayId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectConnectGatewayAttachmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dxGatewayId;
        private @Nullable List<GetDirectConnectGatewayAttachmentFilter> filters;
        private String id;
        private Map<String,String> tags;
        private @Nullable String transitGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDirectConnectGatewayAttachmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dxGatewayId = defaults.dxGatewayId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
    	      this.transitGatewayId = defaults.transitGatewayId;
        }

        public Builder dxGatewayId(@Nullable String dxGatewayId) {
            this.dxGatewayId = dxGatewayId;
            return this;
        }
        public Builder filters(@Nullable List<GetDirectConnectGatewayAttachmentFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetDirectConnectGatewayAttachmentFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder transitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }        public GetDirectConnectGatewayAttachmentResult build() {
            return new GetDirectConnectGatewayAttachmentResult(dxGatewayId, filters, id, tags, transitGatewayId);
        }
    }
}
