// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApiCorsConfiguration {
    /**
     * Whether credentials are included in the CORS request.
     * 
     */
    private final Boolean allowCredentials;
    /**
     * The set of allowed HTTP headers.
     * 
     */
    private final List<String> allowHeaders;
    /**
     * The set of allowed HTTP methods.
     * 
     */
    private final List<String> allowMethods;
    /**
     * The set of allowed origins.
     * 
     */
    private final List<String> allowOrigins;
    /**
     * The set of exposed HTTP headers.
     * 
     */
    private final List<String> exposeHeaders;
    /**
     * The number of seconds that the browser should cache preflight request results.
     * 
     */
    private final Integer maxAge;

    @CustomType.Constructor
    private GetApiCorsConfiguration(
        @CustomType.Parameter("allowCredentials") Boolean allowCredentials,
        @CustomType.Parameter("allowHeaders") List<String> allowHeaders,
        @CustomType.Parameter("allowMethods") List<String> allowMethods,
        @CustomType.Parameter("allowOrigins") List<String> allowOrigins,
        @CustomType.Parameter("exposeHeaders") List<String> exposeHeaders,
        @CustomType.Parameter("maxAge") Integer maxAge) {
        this.allowCredentials = allowCredentials;
        this.allowHeaders = allowHeaders;
        this.allowMethods = allowMethods;
        this.allowOrigins = allowOrigins;
        this.exposeHeaders = exposeHeaders;
        this.maxAge = maxAge;
    }

    /**
     * Whether credentials are included in the CORS request.
     * 
    */
    public Boolean getAllowCredentials() {
        return this.allowCredentials;
    }
    /**
     * The set of allowed HTTP headers.
     * 
    */
    public List<String> getAllowHeaders() {
        return this.allowHeaders;
    }
    /**
     * The set of allowed HTTP methods.
     * 
    */
    public List<String> getAllowMethods() {
        return this.allowMethods;
    }
    /**
     * The set of allowed origins.
     * 
    */
    public List<String> getAllowOrigins() {
        return this.allowOrigins;
    }
    /**
     * The set of exposed HTTP headers.
     * 
    */
    public List<String> getExposeHeaders() {
        return this.exposeHeaders;
    }
    /**
     * The number of seconds that the browser should cache preflight request results.
     * 
    */
    public Integer getMaxAge() {
        return this.maxAge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiCorsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowCredentials;
        private List<String> allowHeaders;
        private List<String> allowMethods;
        private List<String> allowOrigins;
        private List<String> exposeHeaders;
        private Integer maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiCorsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowMethods = defaults.allowMethods;
    	      this.allowOrigins = defaults.allowOrigins;
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
        public Builder allowOrigins(List<String> allowOrigins) {
            this.allowOrigins = Objects.requireNonNull(allowOrigins);
            return this;
        }
        public Builder allowOrigins(String... allowOrigins) {
            return allowOrigins(List.of(allowOrigins));
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
        }        public GetApiCorsConfiguration build() {
            return new GetApiCorsConfiguration(allowCredentials, allowHeaders, allowMethods, allowOrigins, exposeHeaders, maxAge);
        }
    }
}