// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DrgAttachmentNetworkDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DrgAttachmentNetworkDetailsArgs Empty = new DrgAttachmentNetworkDetailsArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network attached to the DRG.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network attached to the DRG.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The IPSec connection that contains the attached IPSec tunnel.
     * 
     */
    @Import(name="ipsecConnectionId")
    private @Nullable Output<String> ipsecConnectionId;

    /**
     * @return The IPSec connection that contains the attached IPSec tunnel.
     * 
     */
    public Optional<Output<String>> ipsecConnectionId() {
        return Optional.ofNullable(this.ipsecConnectionId);
    }

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table used by the DRG attachment.
     * 
     */
    @Import(name="routeTableId")
    private @Nullable Output<String> routeTableId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table used by the DRG attachment.
     * 
     */
    public Optional<Output<String>> routeTableId() {
        return Optional.ofNullable(this.routeTableId);
    }

    /**
     * (Updatable) The type can be one of these values: `IPSEC_TUNNEL`, `REMOTE_PEERING_CONNECTION`, `VCN`, `VIRTUAL_CIRCUIT`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return (Updatable) The type can be one of these values: `IPSEC_TUNNEL`, `REMOTE_PEERING_CONNECTION`, `VCN`, `VIRTUAL_CIRCUIT`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * (Updatable) Indicates whether the VCN CIDR(s) or the individual Subnet CIDR(s) are imported from the attachment.  Routes from the VCN Ingress Route Table are always imported. It can be one of these values: `VCN_CIDRS` , `SUBNET_CIDRS`
     * 
     */
    @Import(name="vcnRouteType")
    private @Nullable Output<String> vcnRouteType;

    /**
     * @return (Updatable) Indicates whether the VCN CIDR(s) or the individual Subnet CIDR(s) are imported from the attachment.  Routes from the VCN Ingress Route Table are always imported. It can be one of these values: `VCN_CIDRS` , `SUBNET_CIDRS`
     * 
     */
    public Optional<Output<String>> vcnRouteType() {
        return Optional.ofNullable(this.vcnRouteType);
    }

    private DrgAttachmentNetworkDetailsArgs() {}

    private DrgAttachmentNetworkDetailsArgs(DrgAttachmentNetworkDetailsArgs $) {
        this.id = $.id;
        this.ipsecConnectionId = $.ipsecConnectionId;
        this.routeTableId = $.routeTableId;
        this.type = $.type;
        this.vcnRouteType = $.vcnRouteType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DrgAttachmentNetworkDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DrgAttachmentNetworkDetailsArgs $;

        public Builder() {
            $ = new DrgAttachmentNetworkDetailsArgs();
        }

        public Builder(DrgAttachmentNetworkDetailsArgs defaults) {
            $ = new DrgAttachmentNetworkDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network attached to the DRG.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network attached to the DRG.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param ipsecConnectionId The IPSec connection that contains the attached IPSec tunnel.
         * 
         * @return builder
         * 
         */
        public Builder ipsecConnectionId(@Nullable Output<String> ipsecConnectionId) {
            $.ipsecConnectionId = ipsecConnectionId;
            return this;
        }

        /**
         * @param ipsecConnectionId The IPSec connection that contains the attached IPSec tunnel.
         * 
         * @return builder
         * 
         */
        public Builder ipsecConnectionId(String ipsecConnectionId) {
            return ipsecConnectionId(Output.of(ipsecConnectionId));
        }

        /**
         * @param routeTableId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table used by the DRG attachment.
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(@Nullable Output<String> routeTableId) {
            $.routeTableId = routeTableId;
            return this;
        }

        /**
         * @param routeTableId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table used by the DRG attachment.
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(String routeTableId) {
            return routeTableId(Output.of(routeTableId));
        }

        /**
         * @param type (Updatable) The type can be one of these values: `IPSEC_TUNNEL`, `REMOTE_PEERING_CONNECTION`, `VCN`, `VIRTUAL_CIRCUIT`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type (Updatable) The type can be one of these values: `IPSEC_TUNNEL`, `REMOTE_PEERING_CONNECTION`, `VCN`, `VIRTUAL_CIRCUIT`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vcnRouteType (Updatable) Indicates whether the VCN CIDR(s) or the individual Subnet CIDR(s) are imported from the attachment.  Routes from the VCN Ingress Route Table are always imported. It can be one of these values: `VCN_CIDRS` , `SUBNET_CIDRS`
         * 
         * @return builder
         * 
         */
        public Builder vcnRouteType(@Nullable Output<String> vcnRouteType) {
            $.vcnRouteType = vcnRouteType;
            return this;
        }

        /**
         * @param vcnRouteType (Updatable) Indicates whether the VCN CIDR(s) or the individual Subnet CIDR(s) are imported from the attachment.  Routes from the VCN Ingress Route Table are always imported. It can be one of these values: `VCN_CIDRS` , `SUBNET_CIDRS`
         * 
         * @return builder
         * 
         */
        public Builder vcnRouteType(String vcnRouteType) {
            return vcnRouteType(Output.of(vcnRouteType));
        }

        public DrgAttachmentNetworkDetailsArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
