// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetDrgAttachmentsDrgAttachmentNetworkDetail;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDrgAttachmentsDrgAttachment {
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return A filter to return only resources that match the given display name exactly.
     * 
     */
    private final String displayName;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     * 
     */
    private final String drgId;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table assigned to the DRG attachment.
     * 
     */
    private final String drgRouteTableId;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the export route distribution used to specify how routes in the assigned DRG route table are advertised to the attachment. If this value is null, no routes are advertised through this attachment.
     * 
     */
    private final String exportDrgRouteDistributionId;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network attached to the DRG.
     * 
     */
    private final String id;
    /**
     * @return Indicates whether the DRG attachment and attached network live in a different tenancy than the DRG.  Example: `false`
     * 
     */
    private final Boolean isCrossTenancy;
    private final List<GetDrgAttachmentsDrgAttachmentNetworkDetail> networkDetails;
    private final Boolean removeExportDrgRouteDistributionTrigger;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the DRG attachment is using.
     * 
     */
    private final String routeTableId;
    /**
     * @return A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
     * 
     */
    private final String state;
    /**
     * @return The date and time the DRG attachment was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    private final String timeCreated;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
     * 
     */
    private final String vcnId;

    @CustomType.Constructor
    private GetDrgAttachmentsDrgAttachment(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("drgId") String drgId,
        @CustomType.Parameter("drgRouteTableId") String drgRouteTableId,
        @CustomType.Parameter("exportDrgRouteDistributionId") String exportDrgRouteDistributionId,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isCrossTenancy") Boolean isCrossTenancy,
        @CustomType.Parameter("networkDetails") List<GetDrgAttachmentsDrgAttachmentNetworkDetail> networkDetails,
        @CustomType.Parameter("removeExportDrgRouteDistributionTrigger") Boolean removeExportDrgRouteDistributionTrigger,
        @CustomType.Parameter("routeTableId") String routeTableId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("vcnId") String vcnId) {
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.drgId = drgId;
        this.drgRouteTableId = drgRouteTableId;
        this.exportDrgRouteDistributionId = exportDrgRouteDistributionId;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isCrossTenancy = isCrossTenancy;
        this.networkDetails = networkDetails;
        this.removeExportDrgRouteDistributionTrigger = removeExportDrgRouteDistributionTrigger;
        this.routeTableId = routeTableId;
        this.state = state;
        this.timeCreated = timeCreated;
        this.vcnId = vcnId;
    }

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return A filter to return only resources that match the given display name exactly.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     * 
     */
    public String drgId() {
        return this.drgId;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table assigned to the DRG attachment.
     * 
     */
    public String drgRouteTableId() {
        return this.drgRouteTableId;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the export route distribution used to specify how routes in the assigned DRG route table are advertised to the attachment. If this value is null, no routes are advertised through this attachment.
     * 
     */
    public String exportDrgRouteDistributionId() {
        return this.exportDrgRouteDistributionId;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network attached to the DRG.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates whether the DRG attachment and attached network live in a different tenancy than the DRG.  Example: `false`
     * 
     */
    public Boolean isCrossTenancy() {
        return this.isCrossTenancy;
    }
    public List<GetDrgAttachmentsDrgAttachmentNetworkDetail> networkDetails() {
        return this.networkDetails;
    }
    public Boolean removeExportDrgRouteDistributionTrigger() {
        return this.removeExportDrgRouteDistributionTrigger;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the DRG attachment is using.
     * 
     */
    public String routeTableId() {
        return this.routeTableId;
    }
    /**
     * @return A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time the DRG attachment was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
     * 
     */
    public String vcnId() {
        return this.vcnId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDrgAttachmentsDrgAttachment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String displayName;
        private String drgId;
        private String drgRouteTableId;
        private String exportDrgRouteDistributionId;
        private Map<String,Object> freeformTags;
        private String id;
        private Boolean isCrossTenancy;
        private List<GetDrgAttachmentsDrgAttachmentNetworkDetail> networkDetails;
        private Boolean removeExportDrgRouteDistributionTrigger;
        private String routeTableId;
        private String state;
        private String timeCreated;
        private String vcnId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDrgAttachmentsDrgAttachment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.drgId = defaults.drgId;
    	      this.drgRouteTableId = defaults.drgRouteTableId;
    	      this.exportDrgRouteDistributionId = defaults.exportDrgRouteDistributionId;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.isCrossTenancy = defaults.isCrossTenancy;
    	      this.networkDetails = defaults.networkDetails;
    	      this.removeExportDrgRouteDistributionTrigger = defaults.removeExportDrgRouteDistributionTrigger;
    	      this.routeTableId = defaults.routeTableId;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.vcnId = defaults.vcnId;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder drgId(String drgId) {
            this.drgId = Objects.requireNonNull(drgId);
            return this;
        }
        public Builder drgRouteTableId(String drgRouteTableId) {
            this.drgRouteTableId = Objects.requireNonNull(drgRouteTableId);
            return this;
        }
        public Builder exportDrgRouteDistributionId(String exportDrgRouteDistributionId) {
            this.exportDrgRouteDistributionId = Objects.requireNonNull(exportDrgRouteDistributionId);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isCrossTenancy(Boolean isCrossTenancy) {
            this.isCrossTenancy = Objects.requireNonNull(isCrossTenancy);
            return this;
        }
        public Builder networkDetails(List<GetDrgAttachmentsDrgAttachmentNetworkDetail> networkDetails) {
            this.networkDetails = Objects.requireNonNull(networkDetails);
            return this;
        }
        public Builder networkDetails(GetDrgAttachmentsDrgAttachmentNetworkDetail... networkDetails) {
            return networkDetails(List.of(networkDetails));
        }
        public Builder removeExportDrgRouteDistributionTrigger(Boolean removeExportDrgRouteDistributionTrigger) {
            this.removeExportDrgRouteDistributionTrigger = Objects.requireNonNull(removeExportDrgRouteDistributionTrigger);
            return this;
        }
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = Objects.requireNonNull(routeTableId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder vcnId(String vcnId) {
            this.vcnId = Objects.requireNonNull(vcnId);
            return this;
        }        public GetDrgAttachmentsDrgAttachment build() {
            return new GetDrgAttachmentsDrgAttachment(compartmentId, definedTags, displayName, drgId, drgRouteTableId, exportDrgRouteDistributionId, freeformTags, id, isCrossTenancy, networkDetails, removeExportDrgRouteDistributionTrigger, routeTableId, state, timeCreated, vcnId);
        }
    }
}
