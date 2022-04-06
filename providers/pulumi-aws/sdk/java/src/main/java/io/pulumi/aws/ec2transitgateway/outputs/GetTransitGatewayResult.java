// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.outputs;

import io.pulumi.aws.ec2transitgateway.outputs.GetTransitGatewayFilter;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetTransitGatewayResult {
    /**
     * Private Autonomous System Number (ASN) for the Amazon side of a BGP session
     * 
     */
    private final Integer amazonSideAsn;
    /**
     * EC2 Transit Gateway Amazon Resource Name (ARN)
     * 
     */
    private final String arn;
    /**
     * Identifier of the default association route table
     * 
     */
    private final String associationDefaultRouteTableId;
    /**
     * Whether resource attachment requests are automatically accepted.
     * 
     */
    private final String autoAcceptSharedAttachments;
    /**
     * Whether resource attachments are automatically associated with the default association route table.
     * 
     */
    private final String defaultRouteTableAssociation;
    /**
     * Whether resource attachments automatically propagate routes to the default propagation route table.
     * 
     */
    private final String defaultRouteTablePropagation;
    /**
     * Description of the EC2 Transit Gateway
     * 
     */
    private final String description;
    /**
     * Whether DNS support is enabled.
     * 
     */
    private final String dnsSupport;
    private final @Nullable List<GetTransitGatewayFilter> filters;
    /**
     * EC2 Transit Gateway identifier
     * 
     */
    private final String id;
    /**
     * Identifier of the AWS account that owns the EC2 Transit Gateway
     * 
     */
    private final String ownerId;
    /**
     * Identifier of the default propagation route table.
     * 
     */
    private final String propagationDefaultRouteTableId;
    /**
     * Key-value tags for the EC2 Transit Gateway
     * 
     */
    private final Map<String,String> tags;
    /**
     * Whether VPN Equal Cost Multipath Protocol support is enabled.
     * 
     */
    private final String vpnEcmpSupport;

    @CustomType.Constructor
    private GetTransitGatewayResult(
        @CustomType.Parameter("amazonSideAsn") Integer amazonSideAsn,
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("associationDefaultRouteTableId") String associationDefaultRouteTableId,
        @CustomType.Parameter("autoAcceptSharedAttachments") String autoAcceptSharedAttachments,
        @CustomType.Parameter("defaultRouteTableAssociation") String defaultRouteTableAssociation,
        @CustomType.Parameter("defaultRouteTablePropagation") String defaultRouteTablePropagation,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("dnsSupport") String dnsSupport,
        @CustomType.Parameter("filters") @Nullable List<GetTransitGatewayFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ownerId") String ownerId,
        @CustomType.Parameter("propagationDefaultRouteTableId") String propagationDefaultRouteTableId,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("vpnEcmpSupport") String vpnEcmpSupport) {
        this.amazonSideAsn = amazonSideAsn;
        this.arn = arn;
        this.associationDefaultRouteTableId = associationDefaultRouteTableId;
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
        this.description = description;
        this.dnsSupport = dnsSupport;
        this.filters = filters;
        this.id = id;
        this.ownerId = ownerId;
        this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
        this.tags = tags;
        this.vpnEcmpSupport = vpnEcmpSupport;
    }

    /**
     * Private Autonomous System Number (ASN) for the Amazon side of a BGP session
     * 
    */
    public Integer getAmazonSideAsn() {
        return this.amazonSideAsn;
    }
    /**
     * EC2 Transit Gateway Amazon Resource Name (ARN)
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Identifier of the default association route table
     * 
    */
    public String getAssociationDefaultRouteTableId() {
        return this.associationDefaultRouteTableId;
    }
    /**
     * Whether resource attachment requests are automatically accepted.
     * 
    */
    public String getAutoAcceptSharedAttachments() {
        return this.autoAcceptSharedAttachments;
    }
    /**
     * Whether resource attachments are automatically associated with the default association route table.
     * 
    */
    public String getDefaultRouteTableAssociation() {
        return this.defaultRouteTableAssociation;
    }
    /**
     * Whether resource attachments automatically propagate routes to the default propagation route table.
     * 
    */
    public String getDefaultRouteTablePropagation() {
        return this.defaultRouteTablePropagation;
    }
    /**
     * Description of the EC2 Transit Gateway
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Whether DNS support is enabled.
     * 
    */
    public String getDnsSupport() {
        return this.dnsSupport;
    }
    public List<GetTransitGatewayFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * EC2 Transit Gateway identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Identifier of the AWS account that owns the EC2 Transit Gateway
     * 
    */
    public String getOwnerId() {
        return this.ownerId;
    }
    /**
     * Identifier of the default propagation route table.
     * 
    */
    public String getPropagationDefaultRouteTableId() {
        return this.propagationDefaultRouteTableId;
    }
    /**
     * Key-value tags for the EC2 Transit Gateway
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * Whether VPN Equal Cost Multipath Protocol support is enabled.
     * 
    */
    public String getVpnEcmpSupport() {
        return this.vpnEcmpSupport;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer amazonSideAsn;
        private String arn;
        private String associationDefaultRouteTableId;
        private String autoAcceptSharedAttachments;
        private String defaultRouteTableAssociation;
        private String defaultRouteTablePropagation;
        private String description;
        private String dnsSupport;
        private @Nullable List<GetTransitGatewayFilter> filters;
        private String id;
        private String ownerId;
        private String propagationDefaultRouteTableId;
        private Map<String,String> tags;
        private String vpnEcmpSupport;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonSideAsn = defaults.amazonSideAsn;
    	      this.arn = defaults.arn;
    	      this.associationDefaultRouteTableId = defaults.associationDefaultRouteTableId;
    	      this.autoAcceptSharedAttachments = defaults.autoAcceptSharedAttachments;
    	      this.defaultRouteTableAssociation = defaults.defaultRouteTableAssociation;
    	      this.defaultRouteTablePropagation = defaults.defaultRouteTablePropagation;
    	      this.description = defaults.description;
    	      this.dnsSupport = defaults.dnsSupport;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ownerId = defaults.ownerId;
    	      this.propagationDefaultRouteTableId = defaults.propagationDefaultRouteTableId;
    	      this.tags = defaults.tags;
    	      this.vpnEcmpSupport = defaults.vpnEcmpSupport;
        }

        public Builder amazonSideAsn(Integer amazonSideAsn) {
            this.amazonSideAsn = Objects.requireNonNull(amazonSideAsn);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder associationDefaultRouteTableId(String associationDefaultRouteTableId) {
            this.associationDefaultRouteTableId = Objects.requireNonNull(associationDefaultRouteTableId);
            return this;
        }
        public Builder autoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
            this.autoAcceptSharedAttachments = Objects.requireNonNull(autoAcceptSharedAttachments);
            return this;
        }
        public Builder defaultRouteTableAssociation(String defaultRouteTableAssociation) {
            this.defaultRouteTableAssociation = Objects.requireNonNull(defaultRouteTableAssociation);
            return this;
        }
        public Builder defaultRouteTablePropagation(String defaultRouteTablePropagation) {
            this.defaultRouteTablePropagation = Objects.requireNonNull(defaultRouteTablePropagation);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder dnsSupport(String dnsSupport) {
            this.dnsSupport = Objects.requireNonNull(dnsSupport);
            return this;
        }
        public Builder filters(@Nullable List<GetTransitGatewayFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetTransitGatewayFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }
        public Builder propagationDefaultRouteTableId(String propagationDefaultRouteTableId) {
            this.propagationDefaultRouteTableId = Objects.requireNonNull(propagationDefaultRouteTableId);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder vpnEcmpSupport(String vpnEcmpSupport) {
            this.vpnEcmpSupport = Objects.requireNonNull(vpnEcmpSupport);
            return this;
        }        public GetTransitGatewayResult build() {
            return new GetTransitGatewayResult(amazonSideAsn, arn, associationDefaultRouteTableId, autoAcceptSharedAttachments, defaultRouteTableAssociation, defaultRouteTablePropagation, description, dnsSupport, filters, id, ownerId, propagationDefaultRouteTableId, tags, vpnEcmpSupport);
        }
    }
}