// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InterconnectAttachmentPartnerMetadataResponse {
    /**
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
     * 
     */
    private final String interconnectName;
    /**
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * 
     */
    private final String partnerName;
    /**
     * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * 
     */
    private final String portalUrl;

    @CustomType.Constructor
    private InterconnectAttachmentPartnerMetadataResponse(
        @CustomType.Parameter("interconnectName") String interconnectName,
        @CustomType.Parameter("partnerName") String partnerName,
        @CustomType.Parameter("portalUrl") String portalUrl) {
        this.interconnectName = interconnectName;
        this.partnerName = partnerName;
        this.portalUrl = portalUrl;
    }

    /**
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
     * 
    */
    public String getInterconnectName() {
        return this.interconnectName;
    }
    /**
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * 
    */
    public String getPartnerName() {
        return this.partnerName;
    }
    /**
     * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * 
    */
    public String getPortalUrl() {
        return this.portalUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectAttachmentPartnerMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String interconnectName;
        private String partnerName;
        private String portalUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectAttachmentPartnerMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interconnectName = defaults.interconnectName;
    	      this.partnerName = defaults.partnerName;
    	      this.portalUrl = defaults.portalUrl;
        }

        public Builder interconnectName(String interconnectName) {
            this.interconnectName = Objects.requireNonNull(interconnectName);
            return this;
        }
        public Builder partnerName(String partnerName) {
            this.partnerName = Objects.requireNonNull(partnerName);
            return this;
        }
        public Builder portalUrl(String portalUrl) {
            this.portalUrl = Objects.requireNonNull(portalUrl);
            return this;
        }        public InterconnectAttachmentPartnerMetadataResponse build() {
            return new InterconnectAttachmentPartnerMetadataResponse(interconnectName, partnerName, portalUrl);
        }
    }
}
