// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitGatewayState extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayState Empty = new TransitGatewayState();

    /**
     * Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
     * 
     */
    @Import(name="amazonSideAsn")
      private final @Nullable Output<Integer> amazonSideAsn;

    public Output<Integer> getAmazonSideAsn() {
        return this.amazonSideAsn == null ? Output.empty() : this.amazonSideAsn;
    }

    /**
     * EC2 Transit Gateway Amazon Resource Name (ARN)
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Identifier of the default association route table
     * 
     */
    @Import(name="associationDefaultRouteTableId")
      private final @Nullable Output<String> associationDefaultRouteTableId;

    public Output<String> getAssociationDefaultRouteTableId() {
        return this.associationDefaultRouteTableId == null ? Output.empty() : this.associationDefaultRouteTableId;
    }

    /**
     * Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @Import(name="autoAcceptSharedAttachments")
      private final @Nullable Output<String> autoAcceptSharedAttachments;

    public Output<String> getAutoAcceptSharedAttachments() {
        return this.autoAcceptSharedAttachments == null ? Output.empty() : this.autoAcceptSharedAttachments;
    }

    /**
     * Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @Import(name="defaultRouteTableAssociation")
      private final @Nullable Output<String> defaultRouteTableAssociation;

    public Output<String> getDefaultRouteTableAssociation() {
        return this.defaultRouteTableAssociation == null ? Output.empty() : this.defaultRouteTableAssociation;
    }

    /**
     * Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @Import(name="defaultRouteTablePropagation")
      private final @Nullable Output<String> defaultRouteTablePropagation;

    public Output<String> getDefaultRouteTablePropagation() {
        return this.defaultRouteTablePropagation == null ? Output.empty() : this.defaultRouteTablePropagation;
    }

    /**
     * Description of the EC2 Transit Gateway.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @Import(name="dnsSupport")
      private final @Nullable Output<String> dnsSupport;

    public Output<String> getDnsSupport() {
        return this.dnsSupport == null ? Output.empty() : this.dnsSupport;
    }

    /**
     * Identifier of the AWS account that owns the EC2 Transit Gateway
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> getOwnerId() {
        return this.ownerId == null ? Output.empty() : this.ownerId;
    }

    /**
     * Identifier of the default propagation route table
     * 
     */
    @Import(name="propagationDefaultRouteTableId")
      private final @Nullable Output<String> propagationDefaultRouteTableId;

    public Output<String> getPropagationDefaultRouteTableId() {
        return this.propagationDefaultRouteTableId == null ? Output.empty() : this.propagationDefaultRouteTableId;
    }

    /**
     * Key-value tags for the EC2 Transit Gateway. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @Import(name="vpnEcmpSupport")
      private final @Nullable Output<String> vpnEcmpSupport;

    public Output<String> getVpnEcmpSupport() {
        return this.vpnEcmpSupport == null ? Output.empty() : this.vpnEcmpSupport;
    }

    public TransitGatewayState(
        @Nullable Output<Integer> amazonSideAsn,
        @Nullable Output<String> arn,
        @Nullable Output<String> associationDefaultRouteTableId,
        @Nullable Output<String> autoAcceptSharedAttachments,
        @Nullable Output<String> defaultRouteTableAssociation,
        @Nullable Output<String> defaultRouteTablePropagation,
        @Nullable Output<String> description,
        @Nullable Output<String> dnsSupport,
        @Nullable Output<String> ownerId,
        @Nullable Output<String> propagationDefaultRouteTableId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> vpnEcmpSupport) {
        this.amazonSideAsn = amazonSideAsn;
        this.arn = arn;
        this.associationDefaultRouteTableId = associationDefaultRouteTableId;
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
        this.defaultRouteTableAssociation = defaultRouteTableAssociation;
        this.defaultRouteTablePropagation = defaultRouteTablePropagation;
        this.description = description;
        this.dnsSupport = dnsSupport;
        this.ownerId = ownerId;
        this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpnEcmpSupport = vpnEcmpSupport;
    }

    private TransitGatewayState() {
        this.amazonSideAsn = Output.empty();
        this.arn = Output.empty();
        this.associationDefaultRouteTableId = Output.empty();
        this.autoAcceptSharedAttachments = Output.empty();
        this.defaultRouteTableAssociation = Output.empty();
        this.defaultRouteTablePropagation = Output.empty();
        this.description = Output.empty();
        this.dnsSupport = Output.empty();
        this.ownerId = Output.empty();
        this.propagationDefaultRouteTableId = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.vpnEcmpSupport = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> amazonSideAsn;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> associationDefaultRouteTableId;
        private @Nullable Output<String> autoAcceptSharedAttachments;
        private @Nullable Output<String> defaultRouteTableAssociation;
        private @Nullable Output<String> defaultRouteTablePropagation;
        private @Nullable Output<String> description;
        private @Nullable Output<String> dnsSupport;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<String> propagationDefaultRouteTableId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> vpnEcmpSupport;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonSideAsn = defaults.amazonSideAsn;
    	      this.arn = defaults.arn;
    	      this.associationDefaultRouteTableId = defaults.associationDefaultRouteTableId;
    	      this.autoAcceptSharedAttachments = defaults.autoAcceptSharedAttachments;
    	      this.defaultRouteTableAssociation = defaults.defaultRouteTableAssociation;
    	      this.defaultRouteTablePropagation = defaults.defaultRouteTablePropagation;
    	      this.description = defaults.description;
    	      this.dnsSupport = defaults.dnsSupport;
    	      this.ownerId = defaults.ownerId;
    	      this.propagationDefaultRouteTableId = defaults.propagationDefaultRouteTableId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpnEcmpSupport = defaults.vpnEcmpSupport;
        }

        public Builder amazonSideAsn(@Nullable Output<Integer> amazonSideAsn) {
            this.amazonSideAsn = amazonSideAsn;
            return this;
        }
        public Builder amazonSideAsn(@Nullable Integer amazonSideAsn) {
            this.amazonSideAsn = Output.ofNullable(amazonSideAsn);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder associationDefaultRouteTableId(@Nullable Output<String> associationDefaultRouteTableId) {
            this.associationDefaultRouteTableId = associationDefaultRouteTableId;
            return this;
        }
        public Builder associationDefaultRouteTableId(@Nullable String associationDefaultRouteTableId) {
            this.associationDefaultRouteTableId = Output.ofNullable(associationDefaultRouteTableId);
            return this;
        }
        public Builder autoAcceptSharedAttachments(@Nullable Output<String> autoAcceptSharedAttachments) {
            this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
            return this;
        }
        public Builder autoAcceptSharedAttachments(@Nullable String autoAcceptSharedAttachments) {
            this.autoAcceptSharedAttachments = Output.ofNullable(autoAcceptSharedAttachments);
            return this;
        }
        public Builder defaultRouteTableAssociation(@Nullable Output<String> defaultRouteTableAssociation) {
            this.defaultRouteTableAssociation = defaultRouteTableAssociation;
            return this;
        }
        public Builder defaultRouteTableAssociation(@Nullable String defaultRouteTableAssociation) {
            this.defaultRouteTableAssociation = Output.ofNullable(defaultRouteTableAssociation);
            return this;
        }
        public Builder defaultRouteTablePropagation(@Nullable Output<String> defaultRouteTablePropagation) {
            this.defaultRouteTablePropagation = defaultRouteTablePropagation;
            return this;
        }
        public Builder defaultRouteTablePropagation(@Nullable String defaultRouteTablePropagation) {
            this.defaultRouteTablePropagation = Output.ofNullable(defaultRouteTablePropagation);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder dnsSupport(@Nullable Output<String> dnsSupport) {
            this.dnsSupport = dnsSupport;
            return this;
        }
        public Builder dnsSupport(@Nullable String dnsSupport) {
            this.dnsSupport = Output.ofNullable(dnsSupport);
            return this;
        }
        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Output.ofNullable(ownerId);
            return this;
        }
        public Builder propagationDefaultRouteTableId(@Nullable Output<String> propagationDefaultRouteTableId) {
            this.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
            return this;
        }
        public Builder propagationDefaultRouteTableId(@Nullable String propagationDefaultRouteTableId) {
            this.propagationDefaultRouteTableId = Output.ofNullable(propagationDefaultRouteTableId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public Builder vpnEcmpSupport(@Nullable Output<String> vpnEcmpSupport) {
            this.vpnEcmpSupport = vpnEcmpSupport;
            return this;
        }
        public Builder vpnEcmpSupport(@Nullable String vpnEcmpSupport) {
            this.vpnEcmpSupport = Output.ofNullable(vpnEcmpSupport);
            return this;
        }        public TransitGatewayState build() {
            return new TransitGatewayState(amazonSideAsn, arn, associationDefaultRouteTableId, autoAcceptSharedAttachments, defaultRouteTableAssociation, defaultRouteTablePropagation, description, dnsSupport, ownerId, propagationDefaultRouteTableId, tags, tagsAll, vpnEcmpSupport);
        }
    }
}
