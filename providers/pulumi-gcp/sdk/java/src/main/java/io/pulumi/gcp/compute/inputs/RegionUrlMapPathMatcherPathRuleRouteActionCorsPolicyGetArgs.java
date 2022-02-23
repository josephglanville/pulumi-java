// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs Empty = new RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs();

    /**
     * In response to a preflight request, setting this to true indicates that the
     * actual request can include user credentials. This translates to the Access-
     * Control-Allow-Credentials header. Defaults to false.
     * 
     */
    @InputImport(name="allowCredentials")
      private final @Nullable Input<Boolean> allowCredentials;

    public Input<Boolean> getAllowCredentials() {
        return this.allowCredentials == null ? Input.empty() : this.allowCredentials;
    }

    /**
     * Specifies the content for the Access-Control-Allow-Headers header.
     * 
     */
    @InputImport(name="allowHeaders")
      private final @Nullable Input<List<String>> allowHeaders;

    public Input<List<String>> getAllowHeaders() {
        return this.allowHeaders == null ? Input.empty() : this.allowHeaders;
    }

    /**
     * Specifies the content for the Access-Control-Allow-Methods header.
     * 
     */
    @InputImport(name="allowMethods")
      private final @Nullable Input<List<String>> allowMethods;

    public Input<List<String>> getAllowMethods() {
        return this.allowMethods == null ? Input.empty() : this.allowMethods;
    }

    /**
     * Specifies the regular expression patterns that match allowed origins. For
     * regular expression grammar please see en.cppreference.com/w/cpp/regex/ecmascript
     * An origin is allowed if it matches either allow_origins or allow_origin_regex.
     * 
     */
    @InputImport(name="allowOriginRegexes")
      private final @Nullable Input<List<String>> allowOriginRegexes;

    public Input<List<String>> getAllowOriginRegexes() {
        return this.allowOriginRegexes == null ? Input.empty() : this.allowOriginRegexes;
    }

    /**
     * Specifies the list of origins that will be allowed to do CORS requests. An
     * origin is allowed if it matches either allow_origins or allow_origin_regex.
     * 
     */
    @InputImport(name="allowOrigins")
      private final @Nullable Input<List<String>> allowOrigins;

    public Input<List<String>> getAllowOrigins() {
        return this.allowOrigins == null ? Input.empty() : this.allowOrigins;
    }

    /**
     * If true, specifies the CORS policy is disabled.
     * 
     */
    @InputImport(name="disabled", required=true)
      private final Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled;
    }

    /**
     * Specifies the content for the Access-Control-Expose-Headers header.
     * 
     */
    @InputImport(name="exposeHeaders")
      private final @Nullable Input<List<String>> exposeHeaders;

    public Input<List<String>> getExposeHeaders() {
        return this.exposeHeaders == null ? Input.empty() : this.exposeHeaders;
    }

    /**
     * Specifies how long the results of a preflight request can be cached. This
     * translates to the content for the Access-Control-Max-Age header.
     * 
     */
    @InputImport(name="maxAge")
      private final @Nullable Input<Integer> maxAge;

    public Input<Integer> getMaxAge() {
        return this.maxAge == null ? Input.empty() : this.maxAge;
    }

    public RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs(
        @Nullable Input<Boolean> allowCredentials,
        @Nullable Input<List<String>> allowHeaders,
        @Nullable Input<List<String>> allowMethods,
        @Nullable Input<List<String>> allowOriginRegexes,
        @Nullable Input<List<String>> allowOrigins,
        Input<Boolean> disabled,
        @Nullable Input<List<String>> exposeHeaders,
        @Nullable Input<Integer> maxAge) {
        this.allowCredentials = allowCredentials;
        this.allowHeaders = allowHeaders;
        this.allowMethods = allowMethods;
        this.allowOriginRegexes = allowOriginRegexes;
        this.allowOrigins = allowOrigins;
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
        this.exposeHeaders = exposeHeaders;
        this.maxAge = maxAge;
    }

    private RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs() {
        this.allowCredentials = Input.empty();
        this.allowHeaders = Input.empty();
        this.allowMethods = Input.empty();
        this.allowOriginRegexes = Input.empty();
        this.allowOrigins = Input.empty();
        this.disabled = Input.empty();
        this.exposeHeaders = Input.empty();
        this.maxAge = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowCredentials;
        private @Nullable Input<List<String>> allowHeaders;
        private @Nullable Input<List<String>> allowMethods;
        private @Nullable Input<List<String>> allowOriginRegexes;
        private @Nullable Input<List<String>> allowOrigins;
        private Input<Boolean> disabled;
        private @Nullable Input<List<String>> exposeHeaders;
        private @Nullable Input<Integer> maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowMethods = defaults.allowMethods;
    	      this.allowOriginRegexes = defaults.allowOriginRegexes;
    	      this.allowOrigins = defaults.allowOrigins;
    	      this.disabled = defaults.disabled;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder setAllowCredentials(@Nullable Input<Boolean> allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }

        public Builder setAllowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = Input.ofNullable(allowCredentials);
            return this;
        }

        public Builder setAllowHeaders(@Nullable Input<List<String>> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }

        public Builder setAllowHeaders(@Nullable List<String> allowHeaders) {
            this.allowHeaders = Input.ofNullable(allowHeaders);
            return this;
        }

        public Builder setAllowMethods(@Nullable Input<List<String>> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }

        public Builder setAllowMethods(@Nullable List<String> allowMethods) {
            this.allowMethods = Input.ofNullable(allowMethods);
            return this;
        }

        public Builder setAllowOriginRegexes(@Nullable Input<List<String>> allowOriginRegexes) {
            this.allowOriginRegexes = allowOriginRegexes;
            return this;
        }

        public Builder setAllowOriginRegexes(@Nullable List<String> allowOriginRegexes) {
            this.allowOriginRegexes = Input.ofNullable(allowOriginRegexes);
            return this;
        }

        public Builder setAllowOrigins(@Nullable Input<List<String>> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }

        public Builder setAllowOrigins(@Nullable List<String> allowOrigins) {
            this.allowOrigins = Input.ofNullable(allowOrigins);
            return this;
        }

        public Builder setDisabled(Input<Boolean> disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Input.of(Objects.requireNonNull(disabled));
            return this;
        }

        public Builder setExposeHeaders(@Nullable Input<List<String>> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }

        public Builder setExposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = Input.ofNullable(exposeHeaders);
            return this;
        }

        public Builder setMaxAge(@Nullable Input<Integer> maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        public Builder setMaxAge(@Nullable Integer maxAge) {
            this.maxAge = Input.ofNullable(maxAge);
            return this;
        }
        public RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs build() {
            return new RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyGetArgs(allowCredentials, allowHeaders, allowMethods, allowOriginRegexes, allowOrigins, disabled, exposeHeaders, maxAge);
        }
    }
}
