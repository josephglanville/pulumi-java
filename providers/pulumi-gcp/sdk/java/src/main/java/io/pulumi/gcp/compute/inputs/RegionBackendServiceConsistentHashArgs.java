// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashHttpCookieArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceConsistentHashArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceConsistentHashArgs Empty = new RegionBackendServiceConsistentHashArgs();

    /**
     * Hash is based on HTTP Cookie. This field describes a HTTP cookie
     * that will be used as the hash key for the consistent hash load
     * balancer. If the cookie is not present, it will be generated.
     * This field is applicable if the sessionAffinity is set to HTTP_COOKIE.
     * Structure is documented below.
     * 
     */
    @Import(name="httpCookie")
      private final @Nullable Output<RegionBackendServiceConsistentHashHttpCookieArgs> httpCookie;

    public Output<RegionBackendServiceConsistentHashHttpCookieArgs> getHttpCookie() {
        return this.httpCookie == null ? Output.empty() : this.httpCookie;
    }

    /**
     * The hash based on the value of the specified header field.
     * This field is applicable if the sessionAffinity is set to HEADER_FIELD.
     * 
     */
    @Import(name="httpHeaderName")
      private final @Nullable Output<String> httpHeaderName;

    public Output<String> getHttpHeaderName() {
        return this.httpHeaderName == null ? Output.empty() : this.httpHeaderName;
    }

    /**
     * The minimum number of virtual nodes to use for the hash ring.
     * Larger ring sizes result in more granular load
     * distributions. If the number of hosts in the load balancing pool
     * is larger than the ring size, each host will be assigned a single
     * virtual node.
     * Defaults to 1024.
     * 
     */
    @Import(name="minimumRingSize")
      private final @Nullable Output<Integer> minimumRingSize;

    public Output<Integer> getMinimumRingSize() {
        return this.minimumRingSize == null ? Output.empty() : this.minimumRingSize;
    }

    public RegionBackendServiceConsistentHashArgs(
        @Nullable Output<RegionBackendServiceConsistentHashHttpCookieArgs> httpCookie,
        @Nullable Output<String> httpHeaderName,
        @Nullable Output<Integer> minimumRingSize) {
        this.httpCookie = httpCookie;
        this.httpHeaderName = httpHeaderName;
        this.minimumRingSize = minimumRingSize;
    }

    private RegionBackendServiceConsistentHashArgs() {
        this.httpCookie = Output.empty();
        this.httpHeaderName = Output.empty();
        this.minimumRingSize = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceConsistentHashArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegionBackendServiceConsistentHashHttpCookieArgs> httpCookie;
        private @Nullable Output<String> httpHeaderName;
        private @Nullable Output<Integer> minimumRingSize;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceConsistentHashArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpCookie = defaults.httpCookie;
    	      this.httpHeaderName = defaults.httpHeaderName;
    	      this.minimumRingSize = defaults.minimumRingSize;
        }

        public Builder httpCookie(@Nullable Output<RegionBackendServiceConsistentHashHttpCookieArgs> httpCookie) {
            this.httpCookie = httpCookie;
            return this;
        }
        public Builder httpCookie(@Nullable RegionBackendServiceConsistentHashHttpCookieArgs httpCookie) {
            this.httpCookie = Output.ofNullable(httpCookie);
            return this;
        }
        public Builder httpHeaderName(@Nullable Output<String> httpHeaderName) {
            this.httpHeaderName = httpHeaderName;
            return this;
        }
        public Builder httpHeaderName(@Nullable String httpHeaderName) {
            this.httpHeaderName = Output.ofNullable(httpHeaderName);
            return this;
        }
        public Builder minimumRingSize(@Nullable Output<Integer> minimumRingSize) {
            this.minimumRingSize = minimumRingSize;
            return this;
        }
        public Builder minimumRingSize(@Nullable Integer minimumRingSize) {
            this.minimumRingSize = Output.ofNullable(minimumRingSize);
            return this;
        }        public RegionBackendServiceConsistentHashArgs build() {
            return new RegionBackendServiceConsistentHashArgs(httpCookie, httpHeaderName, minimumRingSize);
        }
    }
}
