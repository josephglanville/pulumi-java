// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetPrivateIpsFilter;
import com.pulumi.oci.Core.outputs.GetPrivateIpsPrivateIp;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPrivateIpsResult {
    private final @Nullable List<GetPrivateIpsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The private IP address of the `privateIp` object. The address is within the CIDR of the VNIC&#39;s subnet.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * @return The list of private_ips.
     * 
     */
    private final List<GetPrivateIpsPrivateIp> privateIps;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the VNIC is in.
     * 
     */
    private final @Nullable String subnetId;
    /**
     * @return Applicable only if the `PrivateIp` object is being used with a VLAN as part of the Oracle Cloud VMware Solution. The `vlanId` is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN. See [Vlan](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Vlan).
     * 
     */
    private final @Nullable String vlanId;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC the private IP is assigned to. The VNIC and private IP must be in the same subnet. However, if the `PrivateIp` object is being used with a VLAN as part of the Oracle Cloud VMware Solution, the `vnicId` is null.
     * 
     */
    private final @Nullable String vnicId;

    @CustomType.Constructor
    private GetPrivateIpsResult(
        @CustomType.Parameter("filters") @Nullable List<GetPrivateIpsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("privateIps") List<GetPrivateIpsPrivateIp> privateIps,
        @CustomType.Parameter("subnetId") @Nullable String subnetId,
        @CustomType.Parameter("vlanId") @Nullable String vlanId,
        @CustomType.Parameter("vnicId") @Nullable String vnicId) {
        this.filters = filters;
        this.id = id;
        this.ipAddress = ipAddress;
        this.privateIps = privateIps;
        this.subnetId = subnetId;
        this.vlanId = vlanId;
        this.vnicId = vnicId;
    }

    public List<GetPrivateIpsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The private IP address of the `privateIp` object. The address is within the CIDR of the VNIC&#39;s subnet.
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * @return The list of private_ips.
     * 
     */
    public List<GetPrivateIpsPrivateIp> privateIps() {
        return this.privateIps;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet the VNIC is in.
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * @return Applicable only if the `PrivateIp` object is being used with a VLAN as part of the Oracle Cloud VMware Solution. The `vlanId` is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN. See [Vlan](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/Vlan).
     * 
     */
    public Optional<String> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC the private IP is assigned to. The VNIC and private IP must be in the same subnet. However, if the `PrivateIp` object is being used with a VLAN as part of the Oracle Cloud VMware Solution, the `vnicId` is null.
     * 
     */
    public Optional<String> vnicId() {
        return Optional.ofNullable(this.vnicId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateIpsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetPrivateIpsFilter> filters;
        private String id;
        private @Nullable String ipAddress;
        private List<GetPrivateIpsPrivateIp> privateIps;
        private @Nullable String subnetId;
        private @Nullable String vlanId;
        private @Nullable String vnicId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateIpsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.privateIps = defaults.privateIps;
    	      this.subnetId = defaults.subnetId;
    	      this.vlanId = defaults.vlanId;
    	      this.vnicId = defaults.vnicId;
        }

        public Builder filters(@Nullable List<GetPrivateIpsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetPrivateIpsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder privateIps(List<GetPrivateIpsPrivateIp> privateIps) {
            this.privateIps = Objects.requireNonNull(privateIps);
            return this;
        }
        public Builder privateIps(GetPrivateIpsPrivateIp... privateIps) {
            return privateIps(List.of(privateIps));
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder vlanId(@Nullable String vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public Builder vnicId(@Nullable String vnicId) {
            this.vnicId = vnicId;
            return this;
        }        public GetPrivateIpsResult build() {
            return new GetPrivateIpsResult(filters, id, ipAddress, privateIps, subnetId, vlanId, vnicId);
        }
    }
}
