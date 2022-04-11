// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketCorsRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketCorsRuleArgs Empty = new BucketCorsRuleArgs();

    /**
     * Specifies which headers are allowed.
     * 
     */
    @Import(name="allowedHeaders")
      private final @Nullable Output<List<String>> allowedHeaders;

    public Output<List<String>> getAllowedHeaders() {
        return this.allowedHeaders == null ? Codegen.empty() : this.allowedHeaders;
    }

    /**
     * Specifies which methods are allowed. Can be `GET`, `PUT`, `POST`, `DELETE` or `HEAD`.
     * 
     */
    @Import(name="allowedMethods", required=true)
      private final Output<List<String>> allowedMethods;

    public Output<List<String>> getAllowedMethods() {
        return this.allowedMethods;
    }

    /**
     * Specifies which origins are allowed.
     * 
     */
    @Import(name="allowedOrigins", required=true)
      private final Output<List<String>> allowedOrigins;

    public Output<List<String>> getAllowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Specifies expose header in the response.
     * 
     */
    @Import(name="exposeHeaders")
      private final @Nullable Output<List<String>> exposeHeaders;

    public Output<List<String>> getExposeHeaders() {
        return this.exposeHeaders == null ? Codegen.empty() : this.exposeHeaders;
    }

    /**
     * Specifies time in seconds that browser can cache the response for a preflight request.
     * 
     */
    @Import(name="maxAgeSeconds")
      private final @Nullable Output<Integer> maxAgeSeconds;

    public Output<Integer> getMaxAgeSeconds() {
        return this.maxAgeSeconds == null ? Codegen.empty() : this.maxAgeSeconds;
    }

    public BucketCorsRuleArgs(
        @Nullable Output<List<String>> allowedHeaders,
        Output<List<String>> allowedMethods,
        Output<List<String>> allowedOrigins,
        @Nullable Output<List<String>> exposeHeaders,
        @Nullable Output<Integer> maxAgeSeconds) {
        this.allowedHeaders = allowedHeaders;
        this.allowedMethods = Objects.requireNonNull(allowedMethods, "expected parameter 'allowedMethods' to be non-null");
        this.allowedOrigins = Objects.requireNonNull(allowedOrigins, "expected parameter 'allowedOrigins' to be non-null");
        this.exposeHeaders = exposeHeaders;
        this.maxAgeSeconds = maxAgeSeconds;
    }

    private BucketCorsRuleArgs() {
        this.allowedHeaders = Codegen.empty();
        this.allowedMethods = Codegen.empty();
        this.allowedOrigins = Codegen.empty();
        this.exposeHeaders = Codegen.empty();
        this.maxAgeSeconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorsRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedHeaders;
        private Output<List<String>> allowedMethods;
        private Output<List<String>> allowedOrigins;
        private @Nullable Output<List<String>> exposeHeaders;
        private @Nullable Output<Integer> maxAgeSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCorsRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAgeSeconds = defaults.maxAgeSeconds;
        }

        public Builder allowedHeaders(@Nullable Output<List<String>> allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            return this;
        }
        public Builder allowedHeaders(@Nullable List<String> allowedHeaders) {
            this.allowedHeaders = Codegen.ofNullable(allowedHeaders);
            return this;
        }
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }
        public Builder allowedMethods(Output<List<String>> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }
        public Builder allowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Output.of(Objects.requireNonNull(allowedMethods));
            return this;
        }
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }
        public Builder allowedOrigins(Output<List<String>> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Output.of(Objects.requireNonNull(allowedOrigins));
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
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
        public Builder maxAgeSeconds(@Nullable Output<Integer> maxAgeSeconds) {
            this.maxAgeSeconds = maxAgeSeconds;
            return this;
        }
        public Builder maxAgeSeconds(@Nullable Integer maxAgeSeconds) {
            this.maxAgeSeconds = Codegen.ofNullable(maxAgeSeconds);
            return this;
        }        public BucketCorsRuleArgs build() {
            return new BucketCorsRuleArgs(allowedHeaders, allowedMethods, allowedOrigins, exposeHeaders, maxAgeSeconds);
        }
    }
}
