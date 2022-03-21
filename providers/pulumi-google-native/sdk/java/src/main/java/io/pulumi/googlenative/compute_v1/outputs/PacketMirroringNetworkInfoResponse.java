// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PacketMirroringNetworkInfoResponse {
    /**
     * Unique identifier for the network; defined by the server.
     * 
     */
    private final String canonicalUrl;
    /**
     * URL of the network resource.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private PacketMirroringNetworkInfoResponse(
        @CustomType.Parameter("canonicalUrl") String canonicalUrl,
        @CustomType.Parameter("url") String url) {
        this.canonicalUrl = canonicalUrl;
        this.url = url;
    }

    /**
     * Unique identifier for the network; defined by the server.
     * 
    */
    public String getCanonicalUrl() {
        return this.canonicalUrl;
    }
    /**
     * URL of the network resource.
     * 
    */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringNetworkInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String canonicalUrl;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringNetworkInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalUrl = defaults.canonicalUrl;
    	      this.url = defaults.url;
        }

        public Builder canonicalUrl(String canonicalUrl) {
            this.canonicalUrl = Objects.requireNonNull(canonicalUrl);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public PacketMirroringNetworkInfoResponse build() {
            return new PacketMirroringNetworkInfoResponse(canonicalUrl, url);
        }
    }
}
