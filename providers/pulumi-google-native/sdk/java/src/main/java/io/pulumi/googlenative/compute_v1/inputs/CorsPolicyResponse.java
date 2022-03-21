// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The specification for allowing client-side cross-origin requests. For more information about the W3C recommendation for cross-origin resource sharing (CORS), see Fetch API Living Standard.
 * 
 */
public final class CorsPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final CorsPolicyResponse Empty = new CorsPolicyResponse();

    /**
     * In response to a preflight request, setting this to true indicates that the actual request can include user credentials. This field translates to the Access-Control-Allow-Credentials header. Default is false.
     * 
     */
    @Import(name="allowCredentials", required=true)
      private final Boolean allowCredentials;

    public Boolean getAllowCredentials() {
        return this.allowCredentials;
    }

    /**
     * Specifies the content for the Access-Control-Allow-Headers header.
     * 
     */
    @Import(name="allowHeaders", required=true)
      private final List<String> allowHeaders;

    public List<String> getAllowHeaders() {
        return this.allowHeaders;
    }

    /**
     * Specifies the content for the Access-Control-Allow-Methods header.
     * 
     */
    @Import(name="allowMethods", required=true)
      private final List<String> allowMethods;

    public List<String> getAllowMethods() {
        return this.allowMethods;
    }

    /**
     * Specifies a regular expression that matches allowed origins. For more information about the regular expression syntax, see Syntax. An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
     * 
     */
    @Import(name="allowOriginRegexes", required=true)
      private final List<String> allowOriginRegexes;

    public List<String> getAllowOriginRegexes() {
        return this.allowOriginRegexes;
    }

    /**
     * Specifies the list of origins that is allowed to do CORS requests. An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
     * 
     */
    @Import(name="allowOrigins", required=true)
      private final List<String> allowOrigins;

    public List<String> getAllowOrigins() {
        return this.allowOrigins;
    }

    /**
     * If true, the setting specifies the CORS policy is disabled. The default value of false, which indicates that the CORS policy is in effect.
     * 
     */
    @Import(name="disabled", required=true)
      private final Boolean disabled;

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * Specifies the content for the Access-Control-Expose-Headers header.
     * 
     */
    @Import(name="exposeHeaders", required=true)
      private final List<String> exposeHeaders;

    public List<String> getExposeHeaders() {
        return this.exposeHeaders;
    }

    /**
     * Specifies how long results of a preflight request can be cached in seconds. This field translates to the Access-Control-Max-Age header.
     * 
     */
    @Import(name="maxAge", required=true)
      private final Integer maxAge;

    public Integer getMaxAge() {
        return this.maxAge;
    }

    public CorsPolicyResponse(
        Boolean allowCredentials,
        List<String> allowHeaders,
        List<String> allowMethods,
        List<String> allowOriginRegexes,
        List<String> allowOrigins,
        Boolean disabled,
        List<String> exposeHeaders,
        Integer maxAge) {
        this.allowCredentials = Objects.requireNonNull(allowCredentials, "expected parameter 'allowCredentials' to be non-null");
        this.allowHeaders = Objects.requireNonNull(allowHeaders, "expected parameter 'allowHeaders' to be non-null");
        this.allowMethods = Objects.requireNonNull(allowMethods, "expected parameter 'allowMethods' to be non-null");
        this.allowOriginRegexes = Objects.requireNonNull(allowOriginRegexes, "expected parameter 'allowOriginRegexes' to be non-null");
        this.allowOrigins = Objects.requireNonNull(allowOrigins, "expected parameter 'allowOrigins' to be non-null");
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
        this.exposeHeaders = Objects.requireNonNull(exposeHeaders, "expected parameter 'exposeHeaders' to be non-null");
        this.maxAge = Objects.requireNonNull(maxAge, "expected parameter 'maxAge' to be non-null");
    }

    private CorsPolicyResponse() {
        this.allowCredentials = null;
        this.allowHeaders = List.of();
        this.allowMethods = List.of();
        this.allowOriginRegexes = List.of();
        this.allowOrigins = List.of();
        this.disabled = null;
        this.exposeHeaders = List.of();
        this.maxAge = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowCredentials;
        private List<String> allowHeaders;
        private List<String> allowMethods;
        private List<String> allowOriginRegexes;
        private List<String> allowOrigins;
        private Boolean disabled;
        private List<String> exposeHeaders;
        private Integer maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(CorsPolicyResponse defaults) {
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

        public Builder allowCredentials(Boolean allowCredentials) {
            this.allowCredentials = Objects.requireNonNull(allowCredentials);
            return this;
        }
        public Builder allowHeaders(List<String> allowHeaders) {
            this.allowHeaders = Objects.requireNonNull(allowHeaders);
            return this;
        }
        public Builder allowHeaders(String... allowHeaders) {
            return allowHeaders(List.of(allowHeaders));
        }
        public Builder allowMethods(List<String> allowMethods) {
            this.allowMethods = Objects.requireNonNull(allowMethods);
            return this;
        }
        public Builder allowMethods(String... allowMethods) {
            return allowMethods(List.of(allowMethods));
        }
        public Builder allowOriginRegexes(List<String> allowOriginRegexes) {
            this.allowOriginRegexes = Objects.requireNonNull(allowOriginRegexes);
            return this;
        }
        public Builder allowOriginRegexes(String... allowOriginRegexes) {
            return allowOriginRegexes(List.of(allowOriginRegexes));
        }
        public Builder allowOrigins(List<String> allowOrigins) {
            this.allowOrigins = Objects.requireNonNull(allowOrigins);
            return this;
        }
        public Builder allowOrigins(String... allowOrigins) {
            return allowOrigins(List.of(allowOrigins));
        }
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public Builder exposeHeaders(List<String> exposeHeaders) {
            this.exposeHeaders = Objects.requireNonNull(exposeHeaders);
            return this;
        }
        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }
        public Builder maxAge(Integer maxAge) {
            this.maxAge = Objects.requireNonNull(maxAge);
            return this;
        }        public CorsPolicyResponse build() {
            return new CorsPolicyResponse(allowCredentials, allowHeaders, allowMethods, allowOriginRegexes, allowOrigins, disabled, exposeHeaders, maxAge);
        }
    }
}
