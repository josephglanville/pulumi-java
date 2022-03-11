// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentMethodSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentMethodSettingArgs Empty = new DeploymentMethodSettingArgs();

    /**
     * Indicates whether the cached responses are encrypted
     * 
     */
    @InputImport(name="cacheDataEncrypted")
      private final @Nullable Output<Boolean> cacheDataEncrypted;

    public Output<Boolean> getCacheDataEncrypted() {
        return this.cacheDataEncrypted == null ? Output.empty() : this.cacheDataEncrypted;
    }

    /**
     * The time-to-live (TTL) period, in seconds, that specifies how long API Gateway caches responses.
     * 
     */
    @InputImport(name="cacheTtlInSeconds")
      private final @Nullable Output<Integer> cacheTtlInSeconds;

    public Output<Integer> getCacheTtlInSeconds() {
        return this.cacheTtlInSeconds == null ? Output.empty() : this.cacheTtlInSeconds;
    }

    /**
     * Indicates whether responses are cached and returned for requests. You must enable a cache cluster on the stage to cache responses.
     * 
     */
    @InputImport(name="cachingEnabled")
      private final @Nullable Output<Boolean> cachingEnabled;

    public Output<Boolean> getCachingEnabled() {
        return this.cachingEnabled == null ? Output.empty() : this.cachingEnabled;
    }

    /**
     * Indicates whether data trace logging is enabled for methods in the stage. API Gateway pushes these logs to Amazon CloudWatch Logs.
     * 
     */
    @InputImport(name="dataTraceEnabled")
      private final @Nullable Output<Boolean> dataTraceEnabled;

    public Output<Boolean> getDataTraceEnabled() {
        return this.dataTraceEnabled == null ? Output.empty() : this.dataTraceEnabled;
    }

    /**
     * The HTTP method.
     * 
     */
    @InputImport(name="httpMethod")
      private final @Nullable Output<String> httpMethod;

    public Output<String> getHttpMethod() {
        return this.httpMethod == null ? Output.empty() : this.httpMethod;
    }

    /**
     * The logging level for this method. For valid values, see the loggingLevel property of the Stage resource in the Amazon API Gateway API Reference.
     * 
     */
    @InputImport(name="loggingLevel")
      private final @Nullable Output<String> loggingLevel;

    public Output<String> getLoggingLevel() {
        return this.loggingLevel == null ? Output.empty() : this.loggingLevel;
    }

    /**
     * Indicates whether Amazon CloudWatch metrics are enabled for methods in the stage.
     * 
     */
    @InputImport(name="metricsEnabled")
      private final @Nullable Output<Boolean> metricsEnabled;

    public Output<Boolean> getMetricsEnabled() {
        return this.metricsEnabled == null ? Output.empty() : this.metricsEnabled;
    }

    /**
     * The resource path for this method. Forward slashes (/) are encoded as ~1 and the initial slash must include a forward slash.
     * 
     */
    @InputImport(name="resourcePath")
      private final @Nullable Output<String> resourcePath;

    public Output<String> getResourcePath() {
        return this.resourcePath == null ? Output.empty() : this.resourcePath;
    }

    /**
     * The number of burst requests per second that API Gateway permits across all APIs, stages, and methods in your AWS account.
     * 
     */
    @InputImport(name="throttlingBurstLimit")
      private final @Nullable Output<Integer> throttlingBurstLimit;

    public Output<Integer> getThrottlingBurstLimit() {
        return this.throttlingBurstLimit == null ? Output.empty() : this.throttlingBurstLimit;
    }

    /**
     * The number of steady-state requests per second that API Gateway permits across all APIs, stages, and methods in your AWS account.
     * 
     */
    @InputImport(name="throttlingRateLimit")
      private final @Nullable Output<Double> throttlingRateLimit;

    public Output<Double> getThrottlingRateLimit() {
        return this.throttlingRateLimit == null ? Output.empty() : this.throttlingRateLimit;
    }

    public DeploymentMethodSettingArgs(
        @Nullable Output<Boolean> cacheDataEncrypted,
        @Nullable Output<Integer> cacheTtlInSeconds,
        @Nullable Output<Boolean> cachingEnabled,
        @Nullable Output<Boolean> dataTraceEnabled,
        @Nullable Output<String> httpMethod,
        @Nullable Output<String> loggingLevel,
        @Nullable Output<Boolean> metricsEnabled,
        @Nullable Output<String> resourcePath,
        @Nullable Output<Integer> throttlingBurstLimit,
        @Nullable Output<Double> throttlingRateLimit) {
        this.cacheDataEncrypted = cacheDataEncrypted;
        this.cacheTtlInSeconds = cacheTtlInSeconds;
        this.cachingEnabled = cachingEnabled;
        this.dataTraceEnabled = dataTraceEnabled;
        this.httpMethod = httpMethod;
        this.loggingLevel = loggingLevel;
        this.metricsEnabled = metricsEnabled;
        this.resourcePath = resourcePath;
        this.throttlingBurstLimit = throttlingBurstLimit;
        this.throttlingRateLimit = throttlingRateLimit;
    }

    private DeploymentMethodSettingArgs() {
        this.cacheDataEncrypted = Output.empty();
        this.cacheTtlInSeconds = Output.empty();
        this.cachingEnabled = Output.empty();
        this.dataTraceEnabled = Output.empty();
        this.httpMethod = Output.empty();
        this.loggingLevel = Output.empty();
        this.metricsEnabled = Output.empty();
        this.resourcePath = Output.empty();
        this.throttlingBurstLimit = Output.empty();
        this.throttlingRateLimit = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentMethodSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> cacheDataEncrypted;
        private @Nullable Output<Integer> cacheTtlInSeconds;
        private @Nullable Output<Boolean> cachingEnabled;
        private @Nullable Output<Boolean> dataTraceEnabled;
        private @Nullable Output<String> httpMethod;
        private @Nullable Output<String> loggingLevel;
        private @Nullable Output<Boolean> metricsEnabled;
        private @Nullable Output<String> resourcePath;
        private @Nullable Output<Integer> throttlingBurstLimit;
        private @Nullable Output<Double> throttlingRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentMethodSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheDataEncrypted = defaults.cacheDataEncrypted;
    	      this.cacheTtlInSeconds = defaults.cacheTtlInSeconds;
    	      this.cachingEnabled = defaults.cachingEnabled;
    	      this.dataTraceEnabled = defaults.dataTraceEnabled;
    	      this.httpMethod = defaults.httpMethod;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.metricsEnabled = defaults.metricsEnabled;
    	      this.resourcePath = defaults.resourcePath;
    	      this.throttlingBurstLimit = defaults.throttlingBurstLimit;
    	      this.throttlingRateLimit = defaults.throttlingRateLimit;
        }

        public Builder cacheDataEncrypted(@Nullable Output<Boolean> cacheDataEncrypted) {
            this.cacheDataEncrypted = cacheDataEncrypted;
            return this;
        }

        public Builder cacheDataEncrypted(@Nullable Boolean cacheDataEncrypted) {
            this.cacheDataEncrypted = Output.ofNullable(cacheDataEncrypted);
            return this;
        }

        public Builder cacheTtlInSeconds(@Nullable Output<Integer> cacheTtlInSeconds) {
            this.cacheTtlInSeconds = cacheTtlInSeconds;
            return this;
        }

        public Builder cacheTtlInSeconds(@Nullable Integer cacheTtlInSeconds) {
            this.cacheTtlInSeconds = Output.ofNullable(cacheTtlInSeconds);
            return this;
        }

        public Builder cachingEnabled(@Nullable Output<Boolean> cachingEnabled) {
            this.cachingEnabled = cachingEnabled;
            return this;
        }

        public Builder cachingEnabled(@Nullable Boolean cachingEnabled) {
            this.cachingEnabled = Output.ofNullable(cachingEnabled);
            return this;
        }

        public Builder dataTraceEnabled(@Nullable Output<Boolean> dataTraceEnabled) {
            this.dataTraceEnabled = dataTraceEnabled;
            return this;
        }

        public Builder dataTraceEnabled(@Nullable Boolean dataTraceEnabled) {
            this.dataTraceEnabled = Output.ofNullable(dataTraceEnabled);
            return this;
        }

        public Builder httpMethod(@Nullable Output<String> httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public Builder httpMethod(@Nullable String httpMethod) {
            this.httpMethod = Output.ofNullable(httpMethod);
            return this;
        }

        public Builder loggingLevel(@Nullable Output<String> loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }

        public Builder loggingLevel(@Nullable String loggingLevel) {
            this.loggingLevel = Output.ofNullable(loggingLevel);
            return this;
        }

        public Builder metricsEnabled(@Nullable Output<Boolean> metricsEnabled) {
            this.metricsEnabled = metricsEnabled;
            return this;
        }

        public Builder metricsEnabled(@Nullable Boolean metricsEnabled) {
            this.metricsEnabled = Output.ofNullable(metricsEnabled);
            return this;
        }

        public Builder resourcePath(@Nullable Output<String> resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder resourcePath(@Nullable String resourcePath) {
            this.resourcePath = Output.ofNullable(resourcePath);
            return this;
        }

        public Builder throttlingBurstLimit(@Nullable Output<Integer> throttlingBurstLimit) {
            this.throttlingBurstLimit = throttlingBurstLimit;
            return this;
        }

        public Builder throttlingBurstLimit(@Nullable Integer throttlingBurstLimit) {
            this.throttlingBurstLimit = Output.ofNullable(throttlingBurstLimit);
            return this;
        }

        public Builder throttlingRateLimit(@Nullable Output<Double> throttlingRateLimit) {
            this.throttlingRateLimit = throttlingRateLimit;
            return this;
        }

        public Builder throttlingRateLimit(@Nullable Double throttlingRateLimit) {
            this.throttlingRateLimit = Output.ofNullable(throttlingRateLimit);
            return this;
        }
        public DeploymentMethodSettingArgs build() {
            return new DeploymentMethodSettingArgs(cacheDataEncrypted, cacheTtlInSeconds, cachingEnabled, dataTraceEnabled, httpMethod, loggingLevel, metricsEnabled, resourcePath, throttlingBurstLimit, throttlingRateLimit);
        }
    }
}
