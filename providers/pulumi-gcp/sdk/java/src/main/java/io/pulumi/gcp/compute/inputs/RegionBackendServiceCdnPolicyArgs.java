// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyCacheKeyPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceCdnPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceCdnPolicyArgs Empty = new RegionBackendServiceCdnPolicyArgs();

    /**
     * The CacheKeyPolicy for this CdnPolicy.
     * Structure is documented below.
     * 
     */
    @InputImport(name="cacheKeyPolicy")
      private final @Nullable Output<RegionBackendServiceCdnPolicyCacheKeyPolicyArgs> cacheKeyPolicy;

    public Output<RegionBackendServiceCdnPolicyCacheKeyPolicyArgs> getCacheKeyPolicy() {
        return this.cacheKeyPolicy == null ? Output.empty() : this.cacheKeyPolicy;
    }

    /**
     * Specifies the cache setting for all responses from this backend.
     * The possible values are: USE_ORIGIN_HEADERS, FORCE_CACHE_ALL and CACHE_ALL_STATIC
     * Possible values are `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `CACHE_ALL_STATIC`.
     * 
     */
    @InputImport(name="cacheMode")
      private final @Nullable Output<String> cacheMode;

    public Output<String> getCacheMode() {
        return this.cacheMode == null ? Output.empty() : this.cacheMode;
    }

    /**
     * Specifies the maximum allowed TTL for cached content served by this origin.
     * 
     */
    @InputImport(name="clientTtl")
      private final @Nullable Output<Integer> clientTtl;

    public Output<Integer> getClientTtl() {
        return this.clientTtl == null ? Output.empty() : this.clientTtl;
    }

    /**
     * Specifies the default TTL for cached content served by this origin for responses
     * that do not have an existing valid TTL (max-age or s-max-age).
     * 
     */
    @InputImport(name="defaultTtl")
      private final @Nullable Output<Integer> defaultTtl;

    public Output<Integer> getDefaultTtl() {
        return this.defaultTtl == null ? Output.empty() : this.defaultTtl;
    }

    /**
     * Specifies the maximum allowed TTL for cached content served by this origin.
     * 
     */
    @InputImport(name="maxTtl")
      private final @Nullable Output<Integer> maxTtl;

    public Output<Integer> getMaxTtl() {
        return this.maxTtl == null ? Output.empty() : this.maxTtl;
    }

    /**
     * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects.
     * 
     */
    @InputImport(name="negativeCaching")
      private final @Nullable Output<Boolean> negativeCaching;

    public Output<Boolean> getNegativeCaching() {
        return this.negativeCaching == null ? Output.empty() : this.negativeCaching;
    }

    /**
     * Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * Omitting the policy and leaving negativeCaching enabled will use Cloud CDN's default cache TTLs.
     * Structure is documented below.
     * 
     */
    @InputImport(name="negativeCachingPolicies")
      private final @Nullable Output<List<RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicies;

    public Output<List<RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs>> getNegativeCachingPolicies() {
        return this.negativeCachingPolicies == null ? Output.empty() : this.negativeCachingPolicies;
    }

    /**
     * Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache.
     * 
     */
    @InputImport(name="serveWhileStale")
      private final @Nullable Output<Integer> serveWhileStale;

    public Output<Integer> getServeWhileStale() {
        return this.serveWhileStale == null ? Output.empty() : this.serveWhileStale;
    }

    /**
     * Maximum number of seconds the response to a signed URL request
     * will be considered fresh, defaults to 1hr (3600s). After this
     * time period, the response will be revalidated before
     * being served.
     * When serving responses to signed URL requests, Cloud CDN will
     * internally behave as though all responses from this backend had a
     * "Cache-Control: public, max-age=[TTL]" header, regardless of any
     * existing Cache-Control header. The actual headers served in
     * responses will not be altered.
     * 
     */
    @InputImport(name="signedUrlCacheMaxAgeSec")
      private final @Nullable Output<Integer> signedUrlCacheMaxAgeSec;

    public Output<Integer> getSignedUrlCacheMaxAgeSec() {
        return this.signedUrlCacheMaxAgeSec == null ? Output.empty() : this.signedUrlCacheMaxAgeSec;
    }

    public RegionBackendServiceCdnPolicyArgs(
        @Nullable Output<RegionBackendServiceCdnPolicyCacheKeyPolicyArgs> cacheKeyPolicy,
        @Nullable Output<String> cacheMode,
        @Nullable Output<Integer> clientTtl,
        @Nullable Output<Integer> defaultTtl,
        @Nullable Output<Integer> maxTtl,
        @Nullable Output<Boolean> negativeCaching,
        @Nullable Output<List<RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicies,
        @Nullable Output<Integer> serveWhileStale,
        @Nullable Output<Integer> signedUrlCacheMaxAgeSec) {
        this.cacheKeyPolicy = cacheKeyPolicy;
        this.cacheMode = cacheMode;
        this.clientTtl = clientTtl;
        this.defaultTtl = defaultTtl;
        this.maxTtl = maxTtl;
        this.negativeCaching = negativeCaching;
        this.negativeCachingPolicies = negativeCachingPolicies;
        this.serveWhileStale = serveWhileStale;
        this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
    }

    private RegionBackendServiceCdnPolicyArgs() {
        this.cacheKeyPolicy = Output.empty();
        this.cacheMode = Output.empty();
        this.clientTtl = Output.empty();
        this.defaultTtl = Output.empty();
        this.maxTtl = Output.empty();
        this.negativeCaching = Output.empty();
        this.negativeCachingPolicies = Output.empty();
        this.serveWhileStale = Output.empty();
        this.signedUrlCacheMaxAgeSec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceCdnPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegionBackendServiceCdnPolicyCacheKeyPolicyArgs> cacheKeyPolicy;
        private @Nullable Output<String> cacheMode;
        private @Nullable Output<Integer> clientTtl;
        private @Nullable Output<Integer> defaultTtl;
        private @Nullable Output<Integer> maxTtl;
        private @Nullable Output<Boolean> negativeCaching;
        private @Nullable Output<List<RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicies;
        private @Nullable Output<Integer> serveWhileStale;
        private @Nullable Output<Integer> signedUrlCacheMaxAgeSec;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceCdnPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheKeyPolicy = defaults.cacheKeyPolicy;
    	      this.cacheMode = defaults.cacheMode;
    	      this.clientTtl = defaults.clientTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.maxTtl = defaults.maxTtl;
    	      this.negativeCaching = defaults.negativeCaching;
    	      this.negativeCachingPolicies = defaults.negativeCachingPolicies;
    	      this.serveWhileStale = defaults.serveWhileStale;
    	      this.signedUrlCacheMaxAgeSec = defaults.signedUrlCacheMaxAgeSec;
        }

        public Builder cacheKeyPolicy(@Nullable Output<RegionBackendServiceCdnPolicyCacheKeyPolicyArgs> cacheKeyPolicy) {
            this.cacheKeyPolicy = cacheKeyPolicy;
            return this;
        }

        public Builder cacheKeyPolicy(@Nullable RegionBackendServiceCdnPolicyCacheKeyPolicyArgs cacheKeyPolicy) {
            this.cacheKeyPolicy = Output.ofNullable(cacheKeyPolicy);
            return this;
        }

        public Builder cacheMode(@Nullable Output<String> cacheMode) {
            this.cacheMode = cacheMode;
            return this;
        }

        public Builder cacheMode(@Nullable String cacheMode) {
            this.cacheMode = Output.ofNullable(cacheMode);
            return this;
        }

        public Builder clientTtl(@Nullable Output<Integer> clientTtl) {
            this.clientTtl = clientTtl;
            return this;
        }

        public Builder clientTtl(@Nullable Integer clientTtl) {
            this.clientTtl = Output.ofNullable(clientTtl);
            return this;
        }

        public Builder defaultTtl(@Nullable Output<Integer> defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }

        public Builder defaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = Output.ofNullable(defaultTtl);
            return this;
        }

        public Builder maxTtl(@Nullable Output<Integer> maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }

        public Builder maxTtl(@Nullable Integer maxTtl) {
            this.maxTtl = Output.ofNullable(maxTtl);
            return this;
        }

        public Builder negativeCaching(@Nullable Output<Boolean> negativeCaching) {
            this.negativeCaching = negativeCaching;
            return this;
        }

        public Builder negativeCaching(@Nullable Boolean negativeCaching) {
            this.negativeCaching = Output.ofNullable(negativeCaching);
            return this;
        }

        public Builder negativeCachingPolicies(@Nullable Output<List<RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicies) {
            this.negativeCachingPolicies = negativeCachingPolicies;
            return this;
        }

        public Builder negativeCachingPolicies(@Nullable List<RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs> negativeCachingPolicies) {
            this.negativeCachingPolicies = Output.ofNullable(negativeCachingPolicies);
            return this;
        }

        public Builder serveWhileStale(@Nullable Output<Integer> serveWhileStale) {
            this.serveWhileStale = serveWhileStale;
            return this;
        }

        public Builder serveWhileStale(@Nullable Integer serveWhileStale) {
            this.serveWhileStale = Output.ofNullable(serveWhileStale);
            return this;
        }

        public Builder signedUrlCacheMaxAgeSec(@Nullable Output<Integer> signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
            return this;
        }

        public Builder signedUrlCacheMaxAgeSec(@Nullable Integer signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = Output.ofNullable(signedUrlCacheMaxAgeSec);
            return this;
        }
        public RegionBackendServiceCdnPolicyArgs build() {
            return new RegionBackendServiceCdnPolicyArgs(cacheKeyPolicy, cacheMode, clientTtl, defaultTtl, maxTtl, negativeCaching, negativeCachingPolicies, serveWhileStale, signedUrlCacheMaxAgeSec);
        }
    }
}
