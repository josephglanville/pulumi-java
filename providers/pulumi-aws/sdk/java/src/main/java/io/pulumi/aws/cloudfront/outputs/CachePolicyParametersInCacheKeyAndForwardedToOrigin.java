// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig;
import io.pulumi.aws.cloudfront.outputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig;
import io.pulumi.aws.cloudfront.outputs.CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CachePolicyParametersInCacheKeyAndForwardedToOrigin {
    /**
     * Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
     */
    private final CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig cookiesConfig;
    /**
     * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
     */
    private final @Nullable Boolean enableAcceptEncodingBrotli;
    /**
     * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
     */
    private final @Nullable Boolean enableAcceptEncodingGzip;
    /**
     * Object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
     */
    private final CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig headersConfig;
    /**
     * Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
     */
    private final CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig queryStringsConfig;

    @CustomType.Constructor
    private CachePolicyParametersInCacheKeyAndForwardedToOrigin(
        @CustomType.Parameter("cookiesConfig") CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig cookiesConfig,
        @CustomType.Parameter("enableAcceptEncodingBrotli") @Nullable Boolean enableAcceptEncodingBrotli,
        @CustomType.Parameter("enableAcceptEncodingGzip") @Nullable Boolean enableAcceptEncodingGzip,
        @CustomType.Parameter("headersConfig") CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig headersConfig,
        @CustomType.Parameter("queryStringsConfig") CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig queryStringsConfig) {
        this.cookiesConfig = cookiesConfig;
        this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
        this.enableAcceptEncodingGzip = enableAcceptEncodingGzip;
        this.headersConfig = headersConfig;
        this.queryStringsConfig = queryStringsConfig;
    }

    /**
     * Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
    */
    public CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig getCookiesConfig() {
        return this.cookiesConfig;
    }
    /**
     * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
    */
    public Optional<Boolean> getEnableAcceptEncodingBrotli() {
        return Optional.ofNullable(this.enableAcceptEncodingBrotli);
    }
    /**
     * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
    */
    public Optional<Boolean> getEnableAcceptEncodingGzip() {
        return Optional.ofNullable(this.enableAcceptEncodingGzip);
    }
    /**
     * Object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
    */
    public CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig getHeadersConfig() {
        return this.headersConfig;
    }
    /**
     * Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
    */
    public CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig getQueryStringsConfig() {
        return this.queryStringsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOrigin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig cookiesConfig;
        private @Nullable Boolean enableAcceptEncodingBrotli;
        private @Nullable Boolean enableAcceptEncodingGzip;
        private CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig headersConfig;
        private CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig queryStringsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookiesConfig = defaults.cookiesConfig;
    	      this.enableAcceptEncodingBrotli = defaults.enableAcceptEncodingBrotli;
    	      this.enableAcceptEncodingGzip = defaults.enableAcceptEncodingGzip;
    	      this.headersConfig = defaults.headersConfig;
    	      this.queryStringsConfig = defaults.queryStringsConfig;
        }

        public Builder cookiesConfig(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig cookiesConfig) {
            this.cookiesConfig = Objects.requireNonNull(cookiesConfig);
            return this;
        }
        public Builder enableAcceptEncodingBrotli(@Nullable Boolean enableAcceptEncodingBrotli) {
            this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
            return this;
        }
        public Builder enableAcceptEncodingGzip(@Nullable Boolean enableAcceptEncodingGzip) {
            this.enableAcceptEncodingGzip = enableAcceptEncodingGzip;
            return this;
        }
        public Builder headersConfig(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig headersConfig) {
            this.headersConfig = Objects.requireNonNull(headersConfig);
            return this;
        }
        public Builder queryStringsConfig(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig queryStringsConfig) {
            this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig);
            return this;
        }        public CachePolicyParametersInCacheKeyAndForwardedToOrigin build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOrigin(cookiesConfig, enableAcceptEncodingBrotli, enableAcceptEncodingGzip, headersConfig, queryStringsConfig);
        }
    }
}
