// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityandcompliance.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings for the CORS configuration of the service instance.
 * 
 */
public final class ServiceCorsConfigurationInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceCorsConfigurationInfoResponse Empty = new ServiceCorsConfigurationInfoResponse();

    /**
     * If credentials are allowed via CORS.
     * 
     */
    @Import(name="allowCredentials")
      private final @Nullable Boolean allowCredentials;

    public Optional<Boolean> getAllowCredentials() {
        return this.allowCredentials == null ? Optional.empty() : Optional.ofNullable(this.allowCredentials);
    }

    /**
     * The headers to be allowed via CORS.
     * 
     */
    @Import(name="headers")
      private final @Nullable List<String> headers;

    public List<String> getHeaders() {
        return this.headers == null ? List.of() : this.headers;
    }

    /**
     * The max age to be allowed via CORS.
     * 
     */
    @Import(name="maxAge")
      private final @Nullable Double maxAge;

    public Optional<Double> getMaxAge() {
        return this.maxAge == null ? Optional.empty() : Optional.ofNullable(this.maxAge);
    }

    /**
     * The methods to be allowed via CORS.
     * 
     */
    @Import(name="methods")
      private final @Nullable List<String> methods;

    public List<String> getMethods() {
        return this.methods == null ? List.of() : this.methods;
    }

    /**
     * The origins to be allowed via CORS.
     * 
     */
    @Import(name="origins")
      private final @Nullable List<String> origins;

    public List<String> getOrigins() {
        return this.origins == null ? List.of() : this.origins;
    }

    public ServiceCorsConfigurationInfoResponse(
        @Nullable Boolean allowCredentials,
        @Nullable List<String> headers,
        @Nullable Double maxAge,
        @Nullable List<String> methods,
        @Nullable List<String> origins) {
        this.allowCredentials = allowCredentials;
        this.headers = headers;
        this.maxAge = maxAge;
        this.methods = methods;
        this.origins = origins;
    }

    private ServiceCorsConfigurationInfoResponse() {
        this.allowCredentials = null;
        this.headers = List.of();
        this.maxAge = null;
        this.methods = List.of();
        this.origins = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCorsConfigurationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowCredentials;
        private @Nullable List<String> headers;
        private @Nullable Double maxAge;
        private @Nullable List<String> methods;
        private @Nullable List<String> origins;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCorsConfigurationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.headers = defaults.headers;
    	      this.maxAge = defaults.maxAge;
    	      this.methods = defaults.methods;
    	      this.origins = defaults.origins;
        }

        public Builder allowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public Builder headers(@Nullable List<String> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }
        public Builder maxAge(@Nullable Double maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Builder methods(@Nullable List<String> methods) {
            this.methods = methods;
            return this;
        }
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }
        public Builder origins(@Nullable List<String> origins) {
            this.origins = origins;
            return this;
        }
        public Builder origins(String... origins) {
            return origins(List.of(origins));
        }        public ServiceCorsConfigurationInfoResponse build() {
            return new ServiceCorsConfigurationInfoResponse(allowCredentials, headers, maxAge, methods, origins);
        }
    }
}
