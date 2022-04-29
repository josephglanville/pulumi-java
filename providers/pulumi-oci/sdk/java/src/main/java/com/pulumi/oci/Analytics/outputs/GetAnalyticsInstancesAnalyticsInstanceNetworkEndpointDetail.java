// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Analytics.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Analytics.outputs.GetAnalyticsInstancesAnalyticsInstanceNetworkEndpointDetailWhitelistedVcn;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAnalyticsInstancesAnalyticsInstanceNetworkEndpointDetail {
    /**
     * @return The type of network endpoint.
     * 
     */
    private final String networkEndpointType;
    /**
     * @return OCID of the customer subnet connected to private access channel.
     * 
     */
    private final String subnetId;
    /**
     * @return OCID of the customer VCN peered with private access channel.
     * 
     */
    private final String vcnId;
    /**
     * @return Source IP addresses or IP address ranges igress rules.
     * 
     */
    private final List<String> whitelistedIps;
    /**
     * @return Virtual Cloud Networks allowed to access this network endpoint.
     * 
     */
    private final List<GetAnalyticsInstancesAnalyticsInstanceNetworkEndpointDetailWhitelistedVcn> whitelistedVcns;

    @CustomType.Constructor
    private GetAnalyticsInstancesAnalyticsInstanceNetworkEndpointDetail(
        @CustomType.Parameter("networkEndpointType") String networkEndpointType,
        @CustomType.Parameter("subnetId") String subnetId,
        @CustomType.Parameter("vcnId") String vcnId,
        @CustomType.Parameter("whitelistedIps") List<String> whitelistedIps,
        @CustomType.Parameter("whitelistedVcns") List<GetAnalyticsInstancesAnalyticsInstanceNetworkEndpointDetailWhitelistedVcn> whitelistedVcns) {
        this.networkEndpointType = networkEndpointType;
        this.subnetId = subnetId;
        this.vcnId = vcnId;
        this.whitelistedIps = whitelistedIps;
        this.whitelistedVcns = whitelistedVcns;
    }

    /**
     * @return The type of network endpoint.
     * 
     */
    public String networkEndpointType() {
        return this.networkEndpointType;
    }
    /**
     * @return OCID of the customer subnet connected to private access channel.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return OCID of the customer VCN peered with private access channel.
     * 
     */
    public String vcnId() {
        return this.vcnId;
    }
    /**
     * @return Source IP addresses or IP address ranges igress rules.
     * 
     */
    public List<String> whitelistedIps() {
        return this.whitelistedIps;
    }
    /**
     * @return Virtual Cloud Networks allowed to access this network endpoint.
     * 
     */
    public List<GetAnalyticsInstancesAnalyticsInstanceNetworkEndpointDetailWhitelistedVcn> whitelistedVcns() {
        return this.whitelistedVcns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnalyticsInstancesAnalyticsInstanceNetworkEndpointDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkEndpointType;
        private String subnetId;
        private String vcnId;
        private List<String> whitelistedIps;
        private List<GetAnalyticsInstancesAnalyticsInstanceNetworkEndpointDetailWhitelistedVcn> whitelistedVcns;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnalyticsInstancesAnalyticsInstanceNetworkEndpointDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkEndpointType = defaults.networkEndpointType;
    	      this.subnetId = defaults.subnetId;
    	      this.vcnId = defaults.vcnId;
    	      this.whitelistedIps = defaults.whitelistedIps;
    	      this.whitelistedVcns = defaults.whitelistedVcns;
        }

        public Builder networkEndpointType(String networkEndpointType) {
            this.networkEndpointType = Objects.requireNonNull(networkEndpointType);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder vcnId(String vcnId) {
            this.vcnId = Objects.requireNonNull(vcnId);
            return this;
        }
        public Builder whitelistedIps(List<String> whitelistedIps) {
            this.whitelistedIps = Objects.requireNonNull(whitelistedIps);
            return this;
        }
        public Builder whitelistedIps(String... whitelistedIps) {
            return whitelistedIps(List.of(whitelistedIps));
        }
        public Builder whitelistedVcns(List<GetAnalyticsInstancesAnalyticsInstanceNetworkEndpointDetailWhitelistedVcn> whitelistedVcns) {
            this.whitelistedVcns = Objects.requireNonNull(whitelistedVcns);
            return this;
        }
        public Builder whitelistedVcns(GetAnalyticsInstancesAnalyticsInstanceNetworkEndpointDetailWhitelistedVcn... whitelistedVcns) {
            return whitelistedVcns(List.of(whitelistedVcns));
        }        public GetAnalyticsInstancesAnalyticsInstanceNetworkEndpointDetail build() {
            return new GetAnalyticsInstancesAnalyticsInstanceNetworkEndpointDetail(networkEndpointType, subnetId, vcnId, whitelistedIps, whitelistedVcns);
        }
    }
}
