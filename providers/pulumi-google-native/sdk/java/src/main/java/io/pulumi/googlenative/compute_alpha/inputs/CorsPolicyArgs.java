// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The specification for allowing client-side cross-origin requests. For more information about the W3C recommendation for cross-origin resource sharing (CORS), see Fetch API Living Standard.
 * 
 */
public final class CorsPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final CorsPolicyArgs Empty = new CorsPolicyArgs();

    /**
     * In response to a preflight request, setting this to true indicates that the actual request can include user credentials. This field translates to the Access-Control-Allow-Credentials header. Default is false.
     * 
     */
    @Import(name="allowCredentials")
      private final @Nullable Output<Boolean> allowCredentials;

    public Output<Boolean> getAllowCredentials() {
        return this.allowCredentials == null ? Codegen.empty() : this.allowCredentials;
    }

    /**
     * Specifies the content for the Access-Control-Allow-Headers header.
     * 
     */
    @Import(name="allowHeaders")
      private final @Nullable Output<List<String>> allowHeaders;

    public Output<List<String>> getAllowHeaders() {
        return this.allowHeaders == null ? Codegen.empty() : this.allowHeaders;
    }

    /**
     * Specifies the content for the Access-Control-Allow-Methods header.
     * 
     */
    @Import(name="allowMethods")
      private final @Nullable Output<List<String>> allowMethods;

    public Output<List<String>> getAllowMethods() {
        return this.allowMethods == null ? Codegen.empty() : this.allowMethods;
    }

    /**
     * Specifies a regular expression that matches allowed origins. For more information about the regular expression syntax, see Syntax. An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
     * 
     */
    @Import(name="allowOriginRegexes")
      private final @Nullable Output<List<String>> allowOriginRegexes;

    public Output<List<String>> getAllowOriginRegexes() {
        return this.allowOriginRegexes == null ? Codegen.empty() : this.allowOriginRegexes;
    }

    /**
     * Specifies the list of origins that is allowed to do CORS requests. An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
     * 
     */
    @Import(name="allowOrigins")
      private final @Nullable Output<List<String>> allowOrigins;

    public Output<List<String>> getAllowOrigins() {
        return this.allowOrigins == null ? Codegen.empty() : this.allowOrigins;
    }

    /**
     * If true, the setting specifies the CORS policy is disabled. The default value of false, which indicates that the CORS policy is in effect.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * Specifies the content for the Access-Control-Expose-Headers header.
     * 
     */
    @Import(name="exposeHeaders")
      private final @Nullable Output<List<String>> exposeHeaders;

    public Output<List<String>> getExposeHeaders() {
        return this.exposeHeaders == null ? Codegen.empty() : this.exposeHeaders;
    }

    /**
     * Specifies how long results of a preflight request can be cached in seconds. This field translates to the Access-Control-Max-Age header.
     * 
     */
    @Import(name="maxAge")
      private final @Nullable Output<Integer> maxAge;

    public Output<Integer> getMaxAge() {
        return this.maxAge == null ? Codegen.empty() : this.maxAge;
    }

    public CorsPolicyArgs(
        @Nullable Output<Boolean> allowCredentials,
        @Nullable Output<List<String>> allowHeaders,
        @Nullable Output<List<String>> allowMethods,
        @Nullable Output<List<String>> allowOriginRegexes,
        @Nullable Output<List<String>> allowOrigins,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<List<String>> exposeHeaders,
        @Nullable Output<Integer> maxAge) {
        this.allowCredentials = allowCredentials;
        this.allowHeaders = allowHeaders;
        this.allowMethods = allowMethods;
        this.allowOriginRegexes = allowOriginRegexes;
        this.allowOrigins = allowOrigins;
        this.disabled = disabled;
        this.exposeHeaders = exposeHeaders;
        this.maxAge = maxAge;
    }

    private CorsPolicyArgs() {
        this.allowCredentials = Codegen.empty();
        this.allowHeaders = Codegen.empty();
        this.allowMethods = Codegen.empty();
        this.allowOriginRegexes = Codegen.empty();
        this.allowOrigins = Codegen.empty();
        this.disabled = Codegen.empty();
        this.exposeHeaders = Codegen.empty();
        this.maxAge = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowCredentials;
        private @Nullable Output<List<String>> allowHeaders;
        private @Nullable Output<List<String>> allowMethods;
        private @Nullable Output<List<String>> allowOriginRegexes;
        private @Nullable Output<List<String>> allowOrigins;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<List<String>> exposeHeaders;
        private @Nullable Output<Integer> maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(CorsPolicyArgs defaults) {
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

        public Builder allowCredentials(@Nullable Output<Boolean> allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public Builder allowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = Codegen.ofNullable(allowCredentials);
            return this;
        }
        public Builder allowHeaders(@Nullable Output<List<String>> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public Builder allowHeaders(@Nullable List<String> allowHeaders) {
            this.allowHeaders = Codegen.ofNullable(allowHeaders);
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
            this.allowMethods = Codegen.ofNullable(allowMethods);
            return this;
        }
        public Builder allowMethods(String... allowMethods) {
            return allowMethods(List.of(allowMethods));
        }
        public Builder allowOriginRegexes(@Nullable Output<List<String>> allowOriginRegexes) {
            this.allowOriginRegexes = allowOriginRegexes;
            return this;
        }
        public Builder allowOriginRegexes(@Nullable List<String> allowOriginRegexes) {
            this.allowOriginRegexes = Codegen.ofNullable(allowOriginRegexes);
            return this;
        }
        public Builder allowOriginRegexes(String... allowOriginRegexes) {
            return allowOriginRegexes(List.of(allowOriginRegexes));
        }
        public Builder allowOrigins(@Nullable Output<List<String>> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }
        public Builder allowOrigins(@Nullable List<String> allowOrigins) {
            this.allowOrigins = Codegen.ofNullable(allowOrigins);
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
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder exposeHeaders(@Nullable Output<List<String>> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public Builder exposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = Codegen.ofNullable(exposeHeaders);
            return this;
        }
        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }
        public Builder maxAge(@Nullable Output<Integer> maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Builder maxAge(@Nullable Integer maxAge) {
            this.maxAge = Codegen.ofNullable(maxAge);
            return this;
        }        public CorsPolicyArgs build() {
            return new CorsPolicyArgs(allowCredentials, allowHeaders, allowMethods, allowOriginRegexes, allowOrigins, disabled, exposeHeaders, maxAge);
        }
    }
}
