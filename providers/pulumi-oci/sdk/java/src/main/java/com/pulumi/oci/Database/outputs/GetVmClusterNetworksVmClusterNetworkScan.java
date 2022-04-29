// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVmClusterNetworksVmClusterNetworkScan {
    /**
     * @return The node host name.
     * 
     */
    private final String hostname;
    /**
     * @return The list of SCAN IP addresses. Three addresses should be provided.
     * 
     */
    private final List<String> ips;
    /**
     * @return The SCAN TCPIP port. Default is 1521.
     * 
     */
    private final Integer port;
    /**
     * @return The SCAN TCPIP port. Default is 1521.
     * 
     */
    private final Integer scanListenerPortTcp;
    /**
     * @return The SCAN TCPIP SSL port. Default is 2484.
     * 
     */
    private final Integer scanListenerPortTcpSsl;

    @CustomType.Constructor
    private GetVmClusterNetworksVmClusterNetworkScan(
        @CustomType.Parameter("hostname") String hostname,
        @CustomType.Parameter("ips") List<String> ips,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("scanListenerPortTcp") Integer scanListenerPortTcp,
        @CustomType.Parameter("scanListenerPortTcpSsl") Integer scanListenerPortTcpSsl) {
        this.hostname = hostname;
        this.ips = ips;
        this.port = port;
        this.scanListenerPortTcp = scanListenerPortTcp;
        this.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
    }

    /**
     * @return The node host name.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return The list of SCAN IP addresses. Three addresses should be provided.
     * 
     */
    public List<String> ips() {
        return this.ips;
    }
    /**
     * @return The SCAN TCPIP port. Default is 1521.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The SCAN TCPIP port. Default is 1521.
     * 
     */
    public Integer scanListenerPortTcp() {
        return this.scanListenerPortTcp;
    }
    /**
     * @return The SCAN TCPIP SSL port. Default is 2484.
     * 
     */
    public Integer scanListenerPortTcpSsl() {
        return this.scanListenerPortTcpSsl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVmClusterNetworksVmClusterNetworkScan defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostname;
        private List<String> ips;
        private Integer port;
        private Integer scanListenerPortTcp;
        private Integer scanListenerPortTcpSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVmClusterNetworksVmClusterNetworkScan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.ips = defaults.ips;
    	      this.port = defaults.port;
    	      this.scanListenerPortTcp = defaults.scanListenerPortTcp;
    	      this.scanListenerPortTcpSsl = defaults.scanListenerPortTcpSsl;
        }

        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        public Builder ips(List<String> ips) {
            this.ips = Objects.requireNonNull(ips);
            return this;
        }
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder scanListenerPortTcp(Integer scanListenerPortTcp) {
            this.scanListenerPortTcp = Objects.requireNonNull(scanListenerPortTcp);
            return this;
        }
        public Builder scanListenerPortTcpSsl(Integer scanListenerPortTcpSsl) {
            this.scanListenerPortTcpSsl = Objects.requireNonNull(scanListenerPortTcpSsl);
            return this;
        }        public GetVmClusterNetworksVmClusterNetworkScan build() {
            return new GetVmClusterNetworksVmClusterNetworkScan(hostname, ips, port, scanListenerPortTcp, scanListenerPortTcpSsl);
        }
    }
}
