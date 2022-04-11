// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs();

    /**
     * Defines the request parameters that contribute to the cache key.
     * Structure is documented below.
     * 
     */
    @Import(name="cacheKeyPolicy")
      private final @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyGetArgs> cacheKeyPolicy;

    public Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyGetArgs> getCacheKeyPolicy() {
        return this.cacheKeyPolicy == null ? Codegen.empty() : this.cacheKeyPolicy;
    }

    /**
     * Cache modes allow users to control the behaviour of the cache, what content it should cache automatically, whether to respect origin headers, or whether to unconditionally cache all responses.
     * For all cache modes, Cache-Control headers will be passed to the client. Use clientTtl to override what is sent to the client.
     * Possible values are `CACHE_ALL_STATIC`, `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `BYPASS_CACHE`.
     * 
     */
    @Import(name="cacheMode")
      private final @Nullable Output<String> cacheMode;

    public Output<String> getCacheMode() {
        return this.cacheMode == null ? Codegen.empty() : this.cacheMode;
    }

    /**
     * Specifies a separate client (e.g. browser client) TTL, separate from the TTL used by the edge caches. Leaving this empty will use the same cache TTL for both the CDN and the client-facing response.
     * - The TTL must be > 0 and <= 86400s (1 day)
     * - The clientTtl cannot be larger than the defaultTtl (if set)
     * - Fractions of a second are not allowed.
     * - Omit this field to use the defaultTtl, or the max-age set by the origin, as the client-facing TTL.
     *   When the cache mode is set to "USE_ORIGIN_HEADERS" or "BYPASS_CACHE", you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Import(name="clientTtl")
      private final @Nullable Output<String> clientTtl;

    public Output<String> getClientTtl() {
        return this.clientTtl == null ? Codegen.empty() : this.clientTtl;
    }

    /**
     * Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age).
     * Defaults to 3600s (1 hour).
     * - The TTL must be >= 0 and <= 2592000s (1 month)
     * - Setting a TTL of "0" means "always revalidate" (equivalent to must-revalidate)
     * - The value of defaultTTL cannot be set to a value greater than that of maxTTL.
     * - Fractions of a second are not allowed.
     * - When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the TTL set in all responses.
     *   Note that infrequently accessed objects may be evicted from the cache before the defined TTL. Objects that expire will be revalidated with the origin.
     *   When the cache mode is set to "USE_ORIGIN_HEADERS" or "BYPASS_CACHE", you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Import(name="defaultTtl")
      private final @Nullable Output<String> defaultTtl;

    public Output<String> getDefaultTtl() {
        return this.defaultTtl == null ? Codegen.empty() : this.defaultTtl;
    }

    /**
     * Specifies the maximum allowed TTL for cached content served by this origin.
     * Defaults to 86400s (1 day).
     * Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more than maxTtl seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive.
     * - The TTL must be >= 0 and <= 2592000s (1 month)
     * - Setting a TTL of "0" means "always revalidate"
     * - The value of maxTtl must be equal to or greater than defaultTtl.
     * - Fractions of a second are not allowed.
     * - When the cache mode is set to "USE_ORIGIN_HEADERS", "FORCE_CACHE_ALL", or "BYPASS_CACHE", you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Import(name="maxTtl")
      private final @Nullable Output<String> maxTtl;

    public Output<String> getMaxTtl() {
        return this.maxTtl == null ? Codegen.empty() : this.maxTtl;
    }

    /**
     * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve end-user experience by reducing response latency.
     * By default, the CDNPolicy will apply the following default TTLs to these status codes:
     * - HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m
     * - HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s
     * - HTTP 405 (Method Not Found), 414 (URI Too Long), 501 (Not Implemented): 60s
     *   These defaults can be overridden in negativeCachingPolicy
     * 
     */
    @Import(name="negativeCaching")
      private final @Nullable Output<Boolean> negativeCaching;

    public Output<Boolean> getNegativeCaching() {
        return this.negativeCaching == null ? Codegen.empty() : this.negativeCaching;
    }

    /**
     * Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * - Omitting the policy and leaving negativeCaching enabled will use the default TTLs for each status code, defined in negativeCaching.
     * - TTLs must be >= 0 (where 0 is "always revalidate") and <= 86400s (1 day)
     *   Note that when specifying an explicit negativeCachingPolicy, you should take care to specify a cache TTL for all response codes that you wish to cache. The CDNPolicy will not apply any default negative caching when a policy exists.
     * 
     */
    @Import(name="negativeCachingPolicy")
      private final @Nullable Output<Map<String,String>> negativeCachingPolicy;

    public Output<Map<String,String>> getNegativeCachingPolicy() {
        return this.negativeCachingPolicy == null ? Codegen.empty() : this.negativeCachingPolicy;
    }

    /**
     * The EdgeCacheKeyset containing the set of public keys used to validate signed requests at the edge.
     * 
     */
    @Import(name="signedRequestKeyset")
      private final @Nullable Output<String> signedRequestKeyset;

    public Output<String> getSignedRequestKeyset() {
        return this.signedRequestKeyset == null ? Codegen.empty() : this.signedRequestKeyset;
    }

    /**
     * Whether to enforce signed requests. The default value is DISABLED, which means all content is public, and does not authorize access.
     * You must also set a signedRequestKeyset to enable signed requests.
     * When set to REQUIRE_SIGNATURES, all matching requests will have their signature validated. Requests that were not signed with the corresponding private key, or that are otherwise invalid (expired, do not match the signature, IP address, or header) will be rejected with a HTTP 403 and (if enabled) logged.
     * Possible values are `DISABLED` and `REQUIRE_SIGNATURES`.
     * 
     */
    @Import(name="signedRequestMode")
      private final @Nullable Output<String> signedRequestMode;

    public Output<String> getSignedRequestMode() {
        return this.signedRequestMode == null ? Codegen.empty() : this.signedRequestMode;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs(
        @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyGetArgs> cacheKeyPolicy,
        @Nullable Output<String> cacheMode,
        @Nullable Output<String> clientTtl,
        @Nullable Output<String> defaultTtl,
        @Nullable Output<String> maxTtl,
        @Nullable Output<Boolean> negativeCaching,
        @Nullable Output<Map<String,String>> negativeCachingPolicy,
        @Nullable Output<String> signedRequestKeyset,
        @Nullable Output<String> signedRequestMode) {
        this.cacheKeyPolicy = cacheKeyPolicy;
        this.cacheMode = cacheMode;
        this.clientTtl = clientTtl;
        this.defaultTtl = defaultTtl;
        this.maxTtl = maxTtl;
        this.negativeCaching = negativeCaching;
        this.negativeCachingPolicy = negativeCachingPolicy;
        this.signedRequestKeyset = signedRequestKeyset;
        this.signedRequestMode = signedRequestMode;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs() {
        this.cacheKeyPolicy = Codegen.empty();
        this.cacheMode = Codegen.empty();
        this.clientTtl = Codegen.empty();
        this.defaultTtl = Codegen.empty();
        this.maxTtl = Codegen.empty();
        this.negativeCaching = Codegen.empty();
        this.negativeCachingPolicy = Codegen.empty();
        this.signedRequestKeyset = Codegen.empty();
        this.signedRequestMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyGetArgs> cacheKeyPolicy;
        private @Nullable Output<String> cacheMode;
        private @Nullable Output<String> clientTtl;
        private @Nullable Output<String> defaultTtl;
        private @Nullable Output<String> maxTtl;
        private @Nullable Output<Boolean> negativeCaching;
        private @Nullable Output<Map<String,String>> negativeCachingPolicy;
        private @Nullable Output<String> signedRequestKeyset;
        private @Nullable Output<String> signedRequestMode;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheKeyPolicy = defaults.cacheKeyPolicy;
    	      this.cacheMode = defaults.cacheMode;
    	      this.clientTtl = defaults.clientTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.maxTtl = defaults.maxTtl;
    	      this.negativeCaching = defaults.negativeCaching;
    	      this.negativeCachingPolicy = defaults.negativeCachingPolicy;
    	      this.signedRequestKeyset = defaults.signedRequestKeyset;
    	      this.signedRequestMode = defaults.signedRequestMode;
        }

        public Builder cacheKeyPolicy(@Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyGetArgs> cacheKeyPolicy) {
            this.cacheKeyPolicy = cacheKeyPolicy;
            return this;
        }
        public Builder cacheKeyPolicy(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyGetArgs cacheKeyPolicy) {
            this.cacheKeyPolicy = Codegen.ofNullable(cacheKeyPolicy);
            return this;
        }
        public Builder cacheMode(@Nullable Output<String> cacheMode) {
            this.cacheMode = cacheMode;
            return this;
        }
        public Builder cacheMode(@Nullable String cacheMode) {
            this.cacheMode = Codegen.ofNullable(cacheMode);
            return this;
        }
        public Builder clientTtl(@Nullable Output<String> clientTtl) {
            this.clientTtl = clientTtl;
            return this;
        }
        public Builder clientTtl(@Nullable String clientTtl) {
            this.clientTtl = Codegen.ofNullable(clientTtl);
            return this;
        }
        public Builder defaultTtl(@Nullable Output<String> defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }
        public Builder defaultTtl(@Nullable String defaultTtl) {
            this.defaultTtl = Codegen.ofNullable(defaultTtl);
            return this;
        }
        public Builder maxTtl(@Nullable Output<String> maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }
        public Builder maxTtl(@Nullable String maxTtl) {
            this.maxTtl = Codegen.ofNullable(maxTtl);
            return this;
        }
        public Builder negativeCaching(@Nullable Output<Boolean> negativeCaching) {
            this.negativeCaching = negativeCaching;
            return this;
        }
        public Builder negativeCaching(@Nullable Boolean negativeCaching) {
            this.negativeCaching = Codegen.ofNullable(negativeCaching);
            return this;
        }
        public Builder negativeCachingPolicy(@Nullable Output<Map<String,String>> negativeCachingPolicy) {
            this.negativeCachingPolicy = negativeCachingPolicy;
            return this;
        }
        public Builder negativeCachingPolicy(@Nullable Map<String,String> negativeCachingPolicy) {
            this.negativeCachingPolicy = Codegen.ofNullable(negativeCachingPolicy);
            return this;
        }
        public Builder signedRequestKeyset(@Nullable Output<String> signedRequestKeyset) {
            this.signedRequestKeyset = signedRequestKeyset;
            return this;
        }
        public Builder signedRequestKeyset(@Nullable String signedRequestKeyset) {
            this.signedRequestKeyset = Codegen.ofNullable(signedRequestKeyset);
            return this;
        }
        public Builder signedRequestMode(@Nullable Output<String> signedRequestMode) {
            this.signedRequestMode = signedRequestMode;
            return this;
        }
        public Builder signedRequestMode(@Nullable String signedRequestMode) {
            this.signedRequestMode = Codegen.ofNullable(signedRequestMode);
            return this;
        }        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs(cacheKeyPolicy, cacheMode, clientTtl, defaultTtl, maxTtl, negativeCaching, negativeCachingPolicy, signedRequestKeyset, signedRequestMode);
        }
    }
}
