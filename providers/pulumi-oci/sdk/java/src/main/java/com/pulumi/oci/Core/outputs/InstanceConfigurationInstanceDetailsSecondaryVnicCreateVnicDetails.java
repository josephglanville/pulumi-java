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
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceConfigurationInstanceDetailsSecondaryVnicCreateVnicDetails {
    /**
     * @return Whether the VNIC should be assigned a private DNS record. See the `assignPrivateDnsRecord` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/CreateVnicDetails/) for more information.
     * 
     */
    private final @Nullable Boolean assignPrivateDnsRecord;
    /**
     * @return Whether the VNIC should be assigned a public IP address. See the `assignPublicIp` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    private final @Nullable Boolean assignPublicIp;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final @Nullable Map<String,Object> definedTags;
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final @Nullable Map<String,Object> freeformTags;
    /**
     * @return The hostname for the VNIC&#39;s primary private IP. See the `hostnameLabel` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    private final @Nullable String hostnameLabel;
    /**
     * @return A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. For more information about NSGs, see [NetworkSecurityGroup](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/NetworkSecurityGroup/).
     * 
     */
    private final @Nullable List<String> nsgIds;
    /**
     * @return A private IP address of your choice to assign to the VNIC. See the `privateIp` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    private final @Nullable String privateIp;
    /**
     * @return Whether the source/destination check is disabled on the VNIC. See the `skipSourceDestCheck` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    private final @Nullable Boolean skipSourceDestCheck;
    /**
     * @return The OCID of the subnet to create the VNIC in. See the `subnetId` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    private final @Nullable String subnetId;

    @CustomType.Constructor
    private InstanceConfigurationInstanceDetailsSecondaryVnicCreateVnicDetails(
        @CustomType.Parameter("assignPrivateDnsRecord") @Nullable Boolean assignPrivateDnsRecord,
        @CustomType.Parameter("assignPublicIp") @Nullable Boolean assignPublicIp,
        @CustomType.Parameter("definedTags") @Nullable Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("freeformTags") @Nullable Map<String,Object> freeformTags,
        @CustomType.Parameter("hostnameLabel") @Nullable String hostnameLabel,
        @CustomType.Parameter("nsgIds") @Nullable List<String> nsgIds,
        @CustomType.Parameter("privateIp") @Nullable String privateIp,
        @CustomType.Parameter("skipSourceDestCheck") @Nullable Boolean skipSourceDestCheck,
        @CustomType.Parameter("subnetId") @Nullable String subnetId) {
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
    }

    /**
     * @return Whether the VNIC should be assigned a private DNS record. See the `assignPrivateDnsRecord` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/CreateVnicDetails/) for more information.
     * 
     */
    public Optional<Boolean> assignPrivateDnsRecord() {
        return Optional.ofNullable(this.assignPrivateDnsRecord);
    }
    /**
     * @return Whether the VNIC should be assigned a public IP address. See the `assignPublicIp` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    public Optional<Boolean> assignPublicIp() {
        return Optional.ofNullable(this.assignPublicIp);
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags == null ? Map.of() : this.definedTags;
    }
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags == null ? Map.of() : this.freeformTags;
    }
    /**
     * @return The hostname for the VNIC&#39;s primary private IP. See the `hostnameLabel` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    public Optional<String> hostnameLabel() {
        return Optional.ofNullable(this.hostnameLabel);
    }
    /**
     * @return A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. For more information about NSGs, see [NetworkSecurityGroup](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/NetworkSecurityGroup/).
     * 
     */
    public List<String> nsgIds() {
        return this.nsgIds == null ? List.of() : this.nsgIds;
    }
    /**
     * @return A private IP address of your choice to assign to the VNIC. See the `privateIp` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    public Optional<String> privateIp() {
        return Optional.ofNullable(this.privateIp);
    }
    /**
     * @return Whether the source/destination check is disabled on the VNIC. See the `skipSourceDestCheck` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    public Optional<Boolean> skipSourceDestCheck() {
        return Optional.ofNullable(this.skipSourceDestCheck);
    }
    /**
     * @return The OCID of the subnet to create the VNIC in. See the `subnetId` attribute of [CreateVnicDetails](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/CreateVnicDetails/) for more information.
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceConfigurationInstanceDetailsSecondaryVnicCreateVnicDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean assignPrivateDnsRecord;
        private @Nullable Boolean assignPublicIp;
        private @Nullable Map<String,Object> definedTags;
        private @Nullable String displayName;
        private @Nullable Map<String,Object> freeformTags;
        private @Nullable String hostnameLabel;
        private @Nullable List<String> nsgIds;
        private @Nullable String privateIp;
        private @Nullable Boolean skipSourceDestCheck;
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceConfigurationInstanceDetailsSecondaryVnicCreateVnicDetails defaults) {
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
        }

        public Builder assignPrivateDnsRecord(@Nullable Boolean assignPrivateDnsRecord) {
            this.assignPrivateDnsRecord = assignPrivateDnsRecord;
            return this;
        }
        public Builder assignPublicIp(@Nullable Boolean assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            return this;
        }
        public Builder definedTags(@Nullable Map<String,Object> definedTags) {
            this.definedTags = definedTags;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder freeformTags(@Nullable Map<String,Object> freeformTags) {
            this.freeformTags = freeformTags;
            return this;
        }
        public Builder hostnameLabel(@Nullable String hostnameLabel) {
            this.hostnameLabel = hostnameLabel;
            return this;
        }
        public Builder nsgIds(@Nullable List<String> nsgIds) {
            this.nsgIds = nsgIds;
            return this;
        }
        public Builder nsgIds(String... nsgIds) {
            return nsgIds(List.of(nsgIds));
        }
        public Builder privateIp(@Nullable String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public Builder skipSourceDestCheck(@Nullable Boolean skipSourceDestCheck) {
            this.skipSourceDestCheck = skipSourceDestCheck;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }        public InstanceConfigurationInstanceDetailsSecondaryVnicCreateVnicDetails build() {
            return new InstanceConfigurationInstanceDetailsSecondaryVnicCreateVnicDetails(assignPrivateDnsRecord, assignPublicIp, definedTags, displayName, freeformTags, hostnameLabel, nsgIds, privateIp, skipSourceDestCheck, subnetId);
        }
    }
}
