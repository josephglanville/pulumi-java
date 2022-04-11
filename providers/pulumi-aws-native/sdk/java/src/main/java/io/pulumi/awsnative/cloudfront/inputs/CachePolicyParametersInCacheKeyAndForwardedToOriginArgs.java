// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.CachePolicyCookiesConfigArgs;
import io.pulumi.awsnative.cloudfront.inputs.CachePolicyHeadersConfigArgs;
import io.pulumi.awsnative.cloudfront.inputs.CachePolicyQueryStringsConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginArgs extends io.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginArgs();

    @Import(name="cookiesConfig", required=true)
      private final Output<CachePolicyCookiesConfigArgs> cookiesConfig;

    public Output<CachePolicyCookiesConfigArgs> getCookiesConfig() {
        return this.cookiesConfig;
    }

    @Import(name="enableAcceptEncodingBrotli")
      private final @Nullable Output<Boolean> enableAcceptEncodingBrotli;

    public Output<Boolean> getEnableAcceptEncodingBrotli() {
        return this.enableAcceptEncodingBrotli == null ? Codegen.empty() : this.enableAcceptEncodingBrotli;
    }

    @Import(name="enableAcceptEncodingGzip", required=true)
      private final Output<Boolean> enableAcceptEncodingGzip;

    public Output<Boolean> getEnableAcceptEncodingGzip() {
        return this.enableAcceptEncodingGzip;
    }

    @Import(name="headersConfig", required=true)
      private final Output<CachePolicyHeadersConfigArgs> headersConfig;

    public Output<CachePolicyHeadersConfigArgs> getHeadersConfig() {
        return this.headersConfig;
    }

    @Import(name="queryStringsConfig", required=true)
      private final Output<CachePolicyQueryStringsConfigArgs> queryStringsConfig;

    public Output<CachePolicyQueryStringsConfigArgs> getQueryStringsConfig() {
        return this.queryStringsConfig;
    }

    public CachePolicyParametersInCacheKeyAndForwardedToOriginArgs(
        Output<CachePolicyCookiesConfigArgs> cookiesConfig,
        @Nullable Output<Boolean> enableAcceptEncodingBrotli,
        Output<Boolean> enableAcceptEncodingGzip,
        Output<CachePolicyHeadersConfigArgs> headersConfig,
        Output<CachePolicyQueryStringsConfigArgs> queryStringsConfig) {
        this.cookiesConfig = Objects.requireNonNull(cookiesConfig, "expected parameter 'cookiesConfig' to be non-null");
        this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
        this.enableAcceptEncodingGzip = Objects.requireNonNull(enableAcceptEncodingGzip, "expected parameter 'enableAcceptEncodingGzip' to be non-null");
        this.headersConfig = Objects.requireNonNull(headersConfig, "expected parameter 'headersConfig' to be non-null");
        this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig, "expected parameter 'queryStringsConfig' to be non-null");
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginArgs() {
        this.cookiesConfig = Codegen.empty();
        this.enableAcceptEncodingBrotli = Codegen.empty();
        this.enableAcceptEncodingGzip = Codegen.empty();
        this.headersConfig = Codegen.empty();
        this.queryStringsConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<CachePolicyCookiesConfigArgs> cookiesConfig;
        private @Nullable Output<Boolean> enableAcceptEncodingBrotli;
        private Output<Boolean> enableAcceptEncodingGzip;
        private Output<CachePolicyHeadersConfigArgs> headersConfig;
        private Output<CachePolicyQueryStringsConfigArgs> queryStringsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookiesConfig = defaults.cookiesConfig;
    	      this.enableAcceptEncodingBrotli = defaults.enableAcceptEncodingBrotli;
    	      this.enableAcceptEncodingGzip = defaults.enableAcceptEncodingGzip;
    	      this.headersConfig = defaults.headersConfig;
    	      this.queryStringsConfig = defaults.queryStringsConfig;
        }

        public Builder cookiesConfig(Output<CachePolicyCookiesConfigArgs> cookiesConfig) {
            this.cookiesConfig = Objects.requireNonNull(cookiesConfig);
            return this;
        }
        public Builder cookiesConfig(CachePolicyCookiesConfigArgs cookiesConfig) {
            this.cookiesConfig = Output.of(Objects.requireNonNull(cookiesConfig));
            return this;
        }
        public Builder enableAcceptEncodingBrotli(@Nullable Output<Boolean> enableAcceptEncodingBrotli) {
            this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
            return this;
        }
        public Builder enableAcceptEncodingBrotli(@Nullable Boolean enableAcceptEncodingBrotli) {
            this.enableAcceptEncodingBrotli = Codegen.ofNullable(enableAcceptEncodingBrotli);
            return this;
        }
        public Builder enableAcceptEncodingGzip(Output<Boolean> enableAcceptEncodingGzip) {
            this.enableAcceptEncodingGzip = Objects.requireNonNull(enableAcceptEncodingGzip);
            return this;
        }
        public Builder enableAcceptEncodingGzip(Boolean enableAcceptEncodingGzip) {
            this.enableAcceptEncodingGzip = Output.of(Objects.requireNonNull(enableAcceptEncodingGzip));
            return this;
        }
        public Builder headersConfig(Output<CachePolicyHeadersConfigArgs> headersConfig) {
            this.headersConfig = Objects.requireNonNull(headersConfig);
            return this;
        }
        public Builder headersConfig(CachePolicyHeadersConfigArgs headersConfig) {
            this.headersConfig = Output.of(Objects.requireNonNull(headersConfig));
            return this;
        }
        public Builder queryStringsConfig(Output<CachePolicyQueryStringsConfigArgs> queryStringsConfig) {
            this.queryStringsConfig = Objects.requireNonNull(queryStringsConfig);
            return this;
        }
        public Builder queryStringsConfig(CachePolicyQueryStringsConfigArgs queryStringsConfig) {
            this.queryStringsConfig = Output.of(Objects.requireNonNull(queryStringsConfig));
            return this;
        }        public CachePolicyParametersInCacheKeyAndForwardedToOriginArgs build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginArgs(cookiesConfig, enableAcceptEncodingBrotli, enableAcceptEncodingGzip, headersConfig, queryStringsConfig);
        }
    }
}
