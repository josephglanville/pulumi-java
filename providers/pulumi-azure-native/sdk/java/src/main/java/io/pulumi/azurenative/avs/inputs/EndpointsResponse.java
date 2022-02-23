// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Endpoint addresses
 * 
 */
public final class EndpointsResponse extends io.pulumi.resources.InvokeArgs {

    public static final EndpointsResponse Empty = new EndpointsResponse();

    /**
     * Endpoint for the HCX Cloud Manager
     * 
     */
    @InputImport(name="hcxCloudManager", required=true)
      private final String hcxCloudManager;

    public String getHcxCloudManager() {
        return this.hcxCloudManager;
    }

    /**
     * Endpoint for the NSX-T Data Center manager
     * 
     */
    @InputImport(name="nsxtManager", required=true)
      private final String nsxtManager;

    public String getNsxtManager() {
        return this.nsxtManager;
    }

    /**
     * Endpoint for Virtual Center Server Appliance
     * 
     */
    @InputImport(name="vcsa", required=true)
      private final String vcsa;

    public String getVcsa() {
        return this.vcsa;
    }

    public EndpointsResponse(
        String hcxCloudManager,
        String nsxtManager,
        String vcsa) {
        this.hcxCloudManager = Objects.requireNonNull(hcxCloudManager, "expected parameter 'hcxCloudManager' to be non-null");
        this.nsxtManager = Objects.requireNonNull(nsxtManager, "expected parameter 'nsxtManager' to be non-null");
        this.vcsa = Objects.requireNonNull(vcsa, "expected parameter 'vcsa' to be non-null");
    }

    private EndpointsResponse() {
        this.hcxCloudManager = null;
        this.nsxtManager = null;
        this.vcsa = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hcxCloudManager;
        private String nsxtManager;
        private String vcsa;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hcxCloudManager = defaults.hcxCloudManager;
    	      this.nsxtManager = defaults.nsxtManager;
    	      this.vcsa = defaults.vcsa;
        }

        public Builder setHcxCloudManager(String hcxCloudManager) {
            this.hcxCloudManager = Objects.requireNonNull(hcxCloudManager);
            return this;
        }

        public Builder setNsxtManager(String nsxtManager) {
            this.nsxtManager = Objects.requireNonNull(nsxtManager);
            return this;
        }

        public Builder setVcsa(String vcsa) {
            this.vcsa = Objects.requireNonNull(vcsa);
            return this;
        }
        public EndpointsResponse build() {
            return new EndpointsResponse(hcxCloudManager, nsxtManager, vcsa);
        }
    }
}
