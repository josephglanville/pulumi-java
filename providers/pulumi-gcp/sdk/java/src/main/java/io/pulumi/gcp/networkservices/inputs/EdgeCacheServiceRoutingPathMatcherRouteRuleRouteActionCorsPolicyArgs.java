// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs();

    /**
     * In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
     * This translates to the Access-Control-Allow-Credentials response header.
     * 
     */
    @Import(name="allowCredentials")
      private final @Nullable Output<Boolean> allowCredentials;

    public Output<Boolean> getAllowCredentials() {
        return this.allowCredentials == null ? Output.empty() : this.allowCredentials;
    }

    /**
     * Specifies the content for the Access-Control-Allow-Headers response header.
     * 
     */
    @Import(name="allowHeaders")
      private final @Nullable Output<List<String>> allowHeaders;

    public Output<List<String>> getAllowHeaders() {
        return this.allowHeaders == null ? Output.empty() : this.allowHeaders;
    }

    /**
     * Specifies the content for the Access-Control-Allow-Methods response header.
     * 
     */
    @Import(name="allowMethods")
      private final @Nullable Output<List<String>> allowMethods;

    public Output<List<String>> getAllowMethods() {
        return this.allowMethods == null ? Output.empty() : this.allowMethods;
    }

    /**
     * Specifies the list of origins that will be allowed to do CORS requests.
     * This translates to the Access-Control-Allow-Origin response header.
     * 
     */
    @Import(name="allowOrigins")
      private final @Nullable Output<List<String>> allowOrigins;

    public Output<List<String>> getAllowOrigins() {
        return this.allowOrigins == null ? Output.empty() : this.allowOrigins;
    }

    /**
     * If true, specifies the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Output.empty() : this.disabled;
    }

    /**
     * Specifies the content for the Access-Control-Allow-Headers response header.
     * 
     */
    @Import(name="exposeHeaders")
      private final @Nullable Output<List<String>> exposeHeaders;

    public Output<List<String>> getExposeHeaders() {
        return this.exposeHeaders == null ? Output.empty() : this.exposeHeaders;
    }

    /**
     * Specifies how long results of a preflight request can be cached by a client in seconds. Note that many browser clients enforce a maximum TTL of 600s (10 minutes).
     * - Setting the value to -1 forces a pre-flight check for all requests (not recommended)
     * - A maximum TTL of 86400s can be set, but note that (as above) some clients may force pre-flight checks at a more regular interval.
     * - This translates to the Access-Control-Max-Age header.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Import(name="maxAge", required=true)
      private final Output<String> maxAge;

    public Output<String> getMaxAge() {
        return this.maxAge;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs(
        @Nullable Output<Boolean> allowCredentials,
        @Nullable Output<List<String>> allowHeaders,
        @Nullable Output<List<String>> allowMethods,
        @Nullable Output<List<String>> allowOrigins,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<List<String>> exposeHeaders,
        Output<String> maxAge) {
        this.allowCredentials = allowCredentials;
        this.allowHeaders = allowHeaders;
        this.allowMethods = allowMethods;
        this.allowOrigins = allowOrigins;
        this.disabled = disabled;
        this.exposeHeaders = exposeHeaders;
        this.maxAge = Objects.requireNonNull(maxAge, "expected parameter 'maxAge' to be non-null");
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs() {
        this.allowCredentials = Output.empty();
        this.allowHeaders = Output.empty();
        this.allowMethods = Output.empty();
        this.allowOrigins = Output.empty();
        this.disabled = Output.empty();
        this.exposeHeaders = Output.empty();
        this.maxAge = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowCredentials;
        private @Nullable Output<List<String>> allowHeaders;
        private @Nullable Output<List<String>> allowMethods;
        private @Nullable Output<List<String>> allowOrigins;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<List<String>> exposeHeaders;
        private Output<String> maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowMethods = defaults.allowMethods;
    	      this.allowOrigins = defaults.allowOrigins;
    	      this.disabled = defaults.disabled;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder allowCredentials(@Nullable Output<Boolean> allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public Builder allowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = Output.ofNullable(allowCredentials);
            return this;
        }
        public Builder allowHeaders(@Nullable Output<List<String>> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public Builder allowHeaders(@Nullable List<String> allowHeaders) {
            this.allowHeaders = Output.ofNullable(allowHeaders);
            return this;
        }
        public Builder allowHeaders(String... allowHeaders) {
            return allowHeaders(List.of(allowHeaders));
        }
        public Builder allowMethods(@Nullable Output<List<String>> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public Builder allowMethods(@Nullable List<String> allowMethods) {
            this.allowMethods = Output.ofNullable(allowMethods);
            return this;
        }
        public Builder allowMethods(String... allowMethods) {
            return allowMethods(List.of(allowMethods));
        }
        public Builder allowOrigins(@Nullable Output<List<String>> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }
        public Builder allowOrigins(@Nullable List<String> allowOrigins) {
            this.allowOrigins = Output.ofNullable(allowOrigins);
            return this;
        }
        public Builder allowOrigins(String... allowOrigins) {
            return allowOrigins(List.of(allowOrigins));
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Output.ofNullable(disabled);
            return this;
        }
        public Builder exposeHeaders(@Nullable Output<List<String>> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public Builder exposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = Output.ofNullable(exposeHeaders);
            return this;
        }
        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }
        public Builder maxAge(Output<String> maxAge) {
            this.maxAge = Objects.requireNonNull(maxAge);
            return this;
        }
        public Builder maxAge(String maxAge) {
            this.maxAge = Output.of(Objects.requireNonNull(maxAge));
            return this;
        }        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs(allowCredentials, allowHeaders, allowMethods, allowOrigins, disabled, exposeHeaders, maxAge);
        }
    }
}
