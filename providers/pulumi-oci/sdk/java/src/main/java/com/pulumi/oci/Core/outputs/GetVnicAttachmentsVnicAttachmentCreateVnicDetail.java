// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVnicAttachmentsVnicAttachmentCreateVnicDetail {
    private final Boolean assignPrivateDnsRecord;
    private final String assignPublicIp;
    private final Map<String,Object> definedTags;
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    private final String displayName;
    private final Map<String,Object> freeformTags;
    private final String hostnameLabel;
    private final List<String> nsgIds;
    private final String privateIp;
    private final Boolean skipSourceDestCheck;
    /**
     * @return The OCID of the subnet to create the VNIC in.
     * 
     */
    private final String subnetId;
    /**
     * @return The OCID of the VLAN to create the VNIC in. Creating the VNIC in a VLAN (instead of a subnet) is possible only if you are an Oracle Cloud VMware Solution customer. See [Vlan](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Vlan).
     * 
     */
    private final String vlanId;

    @CustomType.Constructor
    private GetVnicAttachmentsVnicAttachmentCreateVnicDetail(
        @CustomType.Parameter("assignPrivateDnsRecord") Boolean assignPrivateDnsRecord,
        @CustomType.Parameter("assignPublicIp") String assignPublicIp,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("hostnameLabel") String hostnameLabel,
        @CustomType.Parameter("nsgIds") List<String> nsgIds,
        @CustomType.Parameter("privateIp") String privateIp,
        @CustomType.Parameter("skipSourceDestCheck") Boolean skipSourceDestCheck,
        @CustomType.Parameter("subnetId") String subnetId,
        @CustomType.Parameter("vlanId") String vlanId) {
        this.assignPrivateDnsRecord = assignPrivateDnsRecord;
        this.assignPublicIp = assignPublicIp;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.hostnameLabel = hostnameLabel;
        this.nsgIds = nsgIds;
        this.privateIp = privateIp;
        this.skipSourceDestCheck = skipSourceDestCheck;
        this.subnetId = subnetId;
        this.vlanId = vlanId;
    }

    public Boolean assignPrivateDnsRecord() {
        return this.assignPrivateDnsRecord;
    }
    public String assignPublicIp() {
        return this.assignPublicIp;
    }
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    public String hostnameLabel() {
        return this.hostnameLabel;
    }
    public List<String> nsgIds() {
        return this.nsgIds;
    }
    public String privateIp() {
        return this.privateIp;
    }
    public Boolean skipSourceDestCheck() {
        return this.skipSourceDestCheck;
    }
    /**
     * @return The OCID of the subnet to create the VNIC in.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return The OCID of the VLAN to create the VNIC in. Creating the VNIC in a VLAN (instead of a subnet) is possible only if you are an Oracle Cloud VMware Solution customer. See [Vlan](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Vlan).
     * 
     */
    public String vlanId() {
        return this.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVnicAttachmentsVnicAttachmentCreateVnicDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean assignPrivateDnsRecord;
        private String assignPublicIp;
        private Map<String,Object> definedTags;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String hostnameLabel;
        private List<String> nsgIds;
        private String privateIp;
        private Boolean skipSourceDestCheck;
        private String subnetId;
        private String vlanId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVnicAttachmentsVnicAttachmentCreateVnicDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPrivateDnsRecord = defaults.assignPrivateDnsRecord;
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.hostnameLabel = defaults.hostnameLabel;
    	      this.nsgIds = defaults.nsgIds;
    	      this.privateIp = defaults.privateIp;
    	      this.skipSourceDestCheck = defaults.skipSourceDestCheck;
    	      this.subnetId = defaults.subnetId;
    	      this.vlanId = defaults.vlanId;
        }

        public Builder assignPrivateDnsRecord(Boolean assignPrivateDnsRecord) {
            this.assignPrivateDnsRecord = Objects.requireNonNull(assignPrivateDnsRecord);
            return this;
        }
        public Builder assignPublicIp(String assignPublicIp) {
            this.assignPublicIp = Objects.requireNonNull(assignPublicIp);
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
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder hostnameLabel(String hostnameLabel) {
            this.hostnameLabel = Objects.requireNonNull(hostnameLabel);
            return this;
        }
        public Builder nsgIds(List<String> nsgIds) {
            this.nsgIds = Objects.requireNonNull(nsgIds);
            return this;
        }
        public Builder nsgIds(String... nsgIds) {
            return nsgIds(List.of(nsgIds));
        }
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        public Builder skipSourceDestCheck(Boolean skipSourceDestCheck) {
            this.skipSourceDestCheck = Objects.requireNonNull(skipSourceDestCheck);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder vlanId(String vlanId) {
            this.vlanId = Objects.requireNonNull(vlanId);
            return this;
        }        public GetVnicAttachmentsVnicAttachmentCreateVnicDetail build() {
            return new GetVnicAttachmentsVnicAttachmentCreateVnicDetail(assignPrivateDnsRecord, assignPublicIp, definedTags, displayName, freeformTags, hostnameLabel, nsgIds, privateIp, skipSourceDestCheck, subnetId, vlanId);
        }
    }
}
