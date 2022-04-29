// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DrgRouteTableRouteRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DrgRouteTableRouteRuleArgs Empty = new DrgRouteTableRouteRuleArgs();

    /**
     * (Updatable) This is the range of IP addresses used for matching when routing traffic. Only CIDR_BLOCK values are allowed.
     * 
     */
    @Import(name="destination", required=true)
    private Output<String> destination;

    /**
     * @return (Updatable) This is the range of IP addresses used for matching when routing traffic. Only CIDR_BLOCK values are allowed.
     * 
     */
    public Output<String> destination() {
        return this.destination;
    }

    /**
     * (Updatable) Type of destination for the rule. Required if `direction` = `EGRESS`. Allowed values:
     * * `CIDR_BLOCK`: If the rule&#39;s `destination` is an IP address range in CIDR notation.
     * 
     */
    @Import(name="destinationType", required=true)
    private Output<String> destinationType;

    /**
     * @return (Updatable) Type of destination for the rule. Required if `direction` = `EGRESS`. Allowed values:
     * * `CIDR_BLOCK`: If the rule&#39;s `destination` is an IP address range in CIDR notation.
     * 
     */
    public Output<String> destinationType() {
        return this.destinationType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table.
     * 
     */
    @Import(name="drgRouteTableId", required=true)
    private Output<String> drgRouteTableId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table.
     * 
     */
    public Output<String> drgRouteTableId() {
        return this.drgRouteTableId;
    }

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment. The next hop DRG attachment is responsible for reaching the network destination.
     * 
     */
    @Import(name="nextHopDrgAttachmentId", required=true)
    private Output<String> nextHopDrgAttachmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment. The next hop DRG attachment is responsible for reaching the network destination.
     * 
     */
    public Output<String> nextHopDrgAttachmentId() {
        return this.nextHopDrgAttachmentId;
    }

    private DrgRouteTableRouteRuleArgs() {}

    private DrgRouteTableRouteRuleArgs(DrgRouteTableRouteRuleArgs $) {
        this.destination = $.destination;
        this.destinationType = $.destinationType;
        this.drgRouteTableId = $.drgRouteTableId;
        this.nextHopDrgAttachmentId = $.nextHopDrgAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DrgRouteTableRouteRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DrgRouteTableRouteRuleArgs $;

        public Builder() {
            $ = new DrgRouteTableRouteRuleArgs();
        }

        public Builder(DrgRouteTableRouteRuleArgs defaults) {
            $ = new DrgRouteTableRouteRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destination (Updatable) This is the range of IP addresses used for matching when routing traffic. Only CIDR_BLOCK values are allowed.
         * 
         * @return builder
         * 
         */
        public Builder destination(Output<String> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination (Updatable) This is the range of IP addresses used for matching when routing traffic. Only CIDR_BLOCK values are allowed.
         * 
         * @return builder
         * 
         */
        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param destinationType (Updatable) Type of destination for the rule. Required if `direction` = `EGRESS`. Allowed values:
         * * `CIDR_BLOCK`: If the rule&#39;s `destination` is an IP address range in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder destinationType(Output<String> destinationType) {
            $.destinationType = destinationType;
            return this;
        }

        /**
         * @param destinationType (Updatable) Type of destination for the rule. Required if `direction` = `EGRESS`. Allowed values:
         * * `CIDR_BLOCK`: If the rule&#39;s `destination` is an IP address range in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder destinationType(String destinationType) {
            return destinationType(Output.of(destinationType));
        }

        /**
         * @param drgRouteTableId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table.
         * 
         * @return builder
         * 
         */
        public Builder drgRouteTableId(Output<String> drgRouteTableId) {
            $.drgRouteTableId = drgRouteTableId;
            return this;
        }

        /**
         * @param drgRouteTableId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table.
         * 
         * @return builder
         * 
         */
        public Builder drgRouteTableId(String drgRouteTableId) {
            return drgRouteTableId(Output.of(drgRouteTableId));
        }

        /**
         * @param nextHopDrgAttachmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment. The next hop DRG attachment is responsible for reaching the network destination.
         * 
         * @return builder
         * 
         */
        public Builder nextHopDrgAttachmentId(Output<String> nextHopDrgAttachmentId) {
            $.nextHopDrgAttachmentId = nextHopDrgAttachmentId;
            return this;
        }

        /**
         * @param nextHopDrgAttachmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment. The next hop DRG attachment is responsible for reaching the network destination.
         * 
         * @return builder
         * 
         */
        public Builder nextHopDrgAttachmentId(String nextHopDrgAttachmentId) {
            return nextHopDrgAttachmentId(Output.of(nextHopDrgAttachmentId));
        }

        public DrgRouteTableRouteRuleArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            $.destinationType = Objects.requireNonNull($.destinationType, "expected parameter 'destinationType' to be non-null");
            $.drgRouteTableId = Objects.requireNonNull($.drgRouteTableId, "expected parameter 'drgRouteTableId' to be non-null");
            $.nextHopDrgAttachmentId = Objects.requireNonNull($.nextHopDrgAttachmentId, "expected parameter 'nextHopDrgAttachmentId' to be non-null");
            return $;
        }
    }

}
