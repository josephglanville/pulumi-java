// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSiteArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSiteArgs Empty = new GetSiteArgs();

    /**
     * The ID of the global network.
     * 
     */
    @InputImport(name="globalNetworkId", required=true)
      private final String globalNetworkId;

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The ID of the site.
     * 
     */
    @InputImport(name="siteId", required=true)
      private final String siteId;

    public String getSiteId() {
        return this.siteId;
    }

    public GetSiteArgs(
        String globalNetworkId,
        String siteId) {
        this.globalNetworkId = Objects.requireNonNull(globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
        this.siteId = Objects.requireNonNull(siteId, "expected parameter 'siteId' to be non-null");
    }

    private GetSiteArgs() {
        this.globalNetworkId = null;
        this.siteId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String globalNetworkId;
        private String siteId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.globalNetworkId = defaults.globalNetworkId;
    	      this.siteId = defaults.siteId;
        }

        public Builder setGlobalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }

        public Builder setSiteId(String siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }
        public GetSiteArgs build() {
            return new GetSiteArgs(globalNetworkId, siteId);
        }
    }
}
