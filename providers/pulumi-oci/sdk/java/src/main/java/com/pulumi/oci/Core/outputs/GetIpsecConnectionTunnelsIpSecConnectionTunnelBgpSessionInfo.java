// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIpsecConnectionTunnelsIpSecConnectionTunnelBgpSessionInfo {
    /**
     * @return The state of the BGP IPv6 session.
     * 
     */
    private final String bgpIpv6state;
    /**
     * @return The state of the BGP session.
     * 
     */
    private final String bgpState;
    /**
     * @return If the tunnel&#39;s `routing` attribute is set to `BGP` (see [IPSecConnectionTunnel](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/IPSecConnectionTunnel/)), this ASN is required and used for the tunnel&#39;s BGP session. This is the ASN of the network on the CPE end of the BGP session. Can be a 2-byte or 4-byte ASN. Uses &#34;asplain&#34; format.
     * 
     */
    private final String customerBgpAsn;
    /**
     * @return The IP address for the CPE end of the inside tunnel interface.
     * 
     */
    private final String customerInterfaceIp;
    /**
     * @return The IPv6 address for the CPE end of the inside tunnel interface. This IP address is optional.
     * 
     */
    private final String customerInterfaceIpv6;
    /**
     * @return The Oracle BGP ASN.
     * 
     */
    private final String oracleBgpAsn;
    /**
     * @return The IP address for the Oracle end of the inside tunnel interface.
     * 
     */
    private final String oracleInterfaceIp;
    /**
     * @return The IPv6 address for the Oracle end of the inside tunnel interface. This IP address is optional.
     * 
     */
    private final String oracleInterfaceIpv6;

    @CustomType.Constructor
    private GetIpsecConnectionTunnelsIpSecConnectionTunnelBgpSessionInfo(
        @CustomType.Parameter("bgpIpv6state") String bgpIpv6state,
        @CustomType.Parameter("bgpState") String bgpState,
        @CustomType.Parameter("customerBgpAsn") String customerBgpAsn,
        @CustomType.Parameter("customerInterfaceIp") String customerInterfaceIp,
        @CustomType.Parameter("customerInterfaceIpv6") String customerInterfaceIpv6,
        @CustomType.Parameter("oracleBgpAsn") String oracleBgpAsn,
        @CustomType.Parameter("oracleInterfaceIp") String oracleInterfaceIp,
        @CustomType.Parameter("oracleInterfaceIpv6") String oracleInterfaceIpv6) {
        this.bgpIpv6state = bgpIpv6state;
        this.bgpState = bgpState;
        this.customerBgpAsn = customerBgpAsn;
        this.customerInterfaceIp = customerInterfaceIp;
        this.customerInterfaceIpv6 = customerInterfaceIpv6;
        this.oracleBgpAsn = oracleBgpAsn;
        this.oracleInterfaceIp = oracleInterfaceIp;
        this.oracleInterfaceIpv6 = oracleInterfaceIpv6;
    }

    /**
     * @return The state of the BGP IPv6 session.
     * 
     */
    public String bgpIpv6state() {
        return this.bgpIpv6state;
    }
    /**
     * @return The state of the BGP session.
     * 
     */
    public String bgpState() {
        return this.bgpState;
    }
    /**
     * @return If the tunnel&#39;s `routing` attribute is set to `BGP` (see [IPSecConnectionTunnel](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/latest/IPSecConnectionTunnel/)), this ASN is required and used for the tunnel&#39;s BGP session. This is the ASN of the network on the CPE end of the BGP session. Can be a 2-byte or 4-byte ASN. Uses &#34;asplain&#34; format.
     * 
     */
    public String customerBgpAsn() {
        return this.customerBgpAsn;
    }
    /**
     * @return The IP address for the CPE end of the inside tunnel interface.
     * 
     */
    public String customerInterfaceIp() {
        return this.customerInterfaceIp;
    }
    /**
     * @return The IPv6 address for the CPE end of the inside tunnel interface. This IP address is optional.
     * 
     */
    public String customerInterfaceIpv6() {
        return this.customerInterfaceIpv6;
    }
    /**
     * @return The Oracle BGP ASN.
     * 
     */
    public String oracleBgpAsn() {
        return this.oracleBgpAsn;
    }
    /**
     * @return The IP address for the Oracle end of the inside tunnel interface.
     * 
     */
    public String oracleInterfaceIp() {
        return this.oracleInterfaceIp;
    }
    /**
     * @return The IPv6 address for the Oracle end of the inside tunnel interface. This IP address is optional.
     * 
     */
    public String oracleInterfaceIpv6() {
        return this.oracleInterfaceIpv6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpsecConnectionTunnelsIpSecConnectionTunnelBgpSessionInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bgpIpv6state;
        private String bgpState;
        private String customerBgpAsn;
        private String customerInterfaceIp;
        private String customerInterfaceIpv6;
        private String oracleBgpAsn;
        private String oracleInterfaceIp;
        private String oracleInterfaceIpv6;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIpsecConnectionTunnelsIpSecConnectionTunnelBgpSessionInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpIpv6state = defaults.bgpIpv6state;
    	      this.bgpState = defaults.bgpState;
    	      this.customerBgpAsn = defaults.customerBgpAsn;
    	      this.customerInterfaceIp = defaults.customerInterfaceIp;
    	      this.customerInterfaceIpv6 = defaults.customerInterfaceIpv6;
    	      this.oracleBgpAsn = defaults.oracleBgpAsn;
    	      this.oracleInterfaceIp = defaults.oracleInterfaceIp;
    	      this.oracleInterfaceIpv6 = defaults.oracleInterfaceIpv6;
        }

        public Builder bgpIpv6state(String bgpIpv6state) {
            this.bgpIpv6state = Objects.requireNonNull(bgpIpv6state);
            return this;
        }
        public Builder bgpState(String bgpState) {
            this.bgpState = Objects.requireNonNull(bgpState);
            return this;
        }
        public Builder customerBgpAsn(String customerBgpAsn) {
            this.customerBgpAsn = Objects.requireNonNull(customerBgpAsn);
            return this;
        }
        public Builder customerInterfaceIp(String customerInterfaceIp) {
            this.customerInterfaceIp = Objects.requireNonNull(customerInterfaceIp);
            return this;
        }
        public Builder customerInterfaceIpv6(String customerInterfaceIpv6) {
            this.customerInterfaceIpv6 = Objects.requireNonNull(customerInterfaceIpv6);
            return this;
        }
        public Builder oracleBgpAsn(String oracleBgpAsn) {
            this.oracleBgpAsn = Objects.requireNonNull(oracleBgpAsn);
            return this;
        }
        public Builder oracleInterfaceIp(String oracleInterfaceIp) {
            this.oracleInterfaceIp = Objects.requireNonNull(oracleInterfaceIp);
            return this;
        }
        public Builder oracleInterfaceIpv6(String oracleInterfaceIpv6) {
            this.oracleInterfaceIpv6 = Objects.requireNonNull(oracleInterfaceIpv6);
            return this;
        }        public GetIpsecConnectionTunnelsIpSecConnectionTunnelBgpSessionInfo build() {
            return new GetIpsecConnectionTunnelsIpSecConnectionTunnelBgpSessionInfo(bgpIpv6state, bgpState, customerBgpAsn, customerInterfaceIp, customerInterfaceIpv6, oracleBgpAsn, oracleInterfaceIp, oracleInterfaceIpv6);
        }
    }
}
