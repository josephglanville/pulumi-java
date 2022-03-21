// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig Empty = new GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig();

    /**
     * Determines whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    @Import(name="cookieBehavior", required=true)
      private final String cookieBehavior;

    public String getCookieBehavior() {
        return this.cookieBehavior;
    }

    /**
     * Object that contains a list of cookie names. See Items for more information.
     * 
     */
    @Import(name="cookies", required=true)
      private final List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie> cookies;

    public List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie> getCookies() {
        return this.cookies;
    }

    public GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig(
        String cookieBehavior,
        List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie> cookies) {
        this.cookieBehavior = Objects.requireNonNull(cookieBehavior, "expected parameter 'cookieBehavior' to be non-null");
        this.cookies = Objects.requireNonNull(cookies, "expected parameter 'cookies' to be non-null");
    }

    private GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig() {
        this.cookieBehavior = null;
        this.cookies = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cookieBehavior;
        private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie> cookies;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieBehavior = defaults.cookieBehavior;
    	      this.cookies = defaults.cookies;
        }

        public Builder cookieBehavior(String cookieBehavior) {
            this.cookieBehavior = Objects.requireNonNull(cookieBehavior);
            return this;
        }
        public Builder cookies(List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie> cookies) {
            this.cookies = Objects.requireNonNull(cookies);
            return this;
        }
        public Builder cookies(GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie... cookies) {
            return cookies(List.of(cookies));
        }        public GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig build() {
            return new GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig(cookieBehavior, cookies);
        }
    }
}
