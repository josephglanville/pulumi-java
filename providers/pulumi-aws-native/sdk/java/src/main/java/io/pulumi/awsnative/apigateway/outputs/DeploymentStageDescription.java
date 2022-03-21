// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.awsnative.apigateway.outputs.DeploymentAccessLogSetting;
import io.pulumi.awsnative.apigateway.outputs.DeploymentCanarySetting;
import io.pulumi.awsnative.apigateway.outputs.DeploymentMethodSetting;
import io.pulumi.awsnative.apigateway.outputs.DeploymentTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentStageDescription {
    /**
     * Specifies settings for logging access in this stage.
     * 
     */
    private final @Nullable DeploymentAccessLogSetting accessLogSetting;
    /**
     * Indicates whether cache clustering is enabled for the stage.
     * 
     */
    private final @Nullable Boolean cacheClusterEnabled;
    /**
     * The size of the stage's cache cluster.
     * 
     */
    private final @Nullable String cacheClusterSize;
    /**
     * The time-to-live (TTL) period, in seconds, that specifies how long API Gateway caches responses.
     * 
     */
    private final @Nullable Boolean cacheDataEncrypted;
    /**
     * The time-to-live (TTL) period, in seconds, that specifies how long API Gateway caches responses.
     * 
     */
    private final @Nullable Integer cacheTtlInSeconds;
    /**
     * Indicates whether responses are cached and returned for requests. You must enable a cache cluster on the stage to cache responses.
     * 
     */
    private final @Nullable Boolean cachingEnabled;
    /**
     * Specifies settings for the canary deployment in this stage.
     * 
     */
    private final @Nullable DeploymentCanarySetting canarySetting;
    /**
     * The identifier of the client certificate that API Gateway uses to call your integration endpoints in the stage.
     * 
     */
    private final @Nullable String clientCertificateId;
    /**
     * Indicates whether data trace logging is enabled for methods in the stage. API Gateway pushes these logs to Amazon CloudWatch Logs.
     * 
     */
    private final @Nullable Boolean dataTraceEnabled;
    /**
     * A description of the purpose of the stage.
     * 
     */
    private final @Nullable String description;
    /**
     * The version identifier of the API documentation snapshot.
     * 
     */
    private final @Nullable String documentationVersion;
    /**
     * The logging level for this method. For valid values, see the loggingLevel property of the Stage resource in the Amazon API Gateway API Reference.
     * 
     */
    private final @Nullable String loggingLevel;
    /**
     * Configures settings for all of the stage's methods.
     * 
     */
    private final @Nullable List<DeploymentMethodSetting> methodSettings;
    /**
     * Indicates whether Amazon CloudWatch metrics are enabled for methods in the stage.
     * 
     */
    private final @Nullable Boolean metricsEnabled;
    /**
     * An array of arbitrary tags (key-value pairs) to associate with the stage.
     * 
     */
    private final @Nullable List<DeploymentTag> tags;
    /**
     * The number of burst requests per second that API Gateway permits across all APIs, stages, and methods in your AWS account.
     * 
     */
    private final @Nullable Integer throttlingBurstLimit;
    /**
     * The number of steady-state requests per second that API Gateway permits across all APIs, stages, and methods in your AWS account.
     * 
     */
    private final @Nullable Double throttlingRateLimit;
    /**
     * Specifies whether active tracing with X-ray is enabled for this stage.
     * 
     */
    private final @Nullable Boolean tracingEnabled;
    /**
     * A map that defines the stage variables. Variable names must consist of alphanumeric characters, and the values must match the following regular expression: [A-Za-z0-9-._~:/?#&=,]+.
     * 
     */
    private final @Nullable Object variables;

    @CustomType.Constructor
    private DeploymentStageDescription(
        @CustomType.Parameter("accessLogSetting") @Nullable DeploymentAccessLogSetting accessLogSetting,
        @CustomType.Parameter("cacheClusterEnabled") @Nullable Boolean cacheClusterEnabled,
        @CustomType.Parameter("cacheClusterSize") @Nullable String cacheClusterSize,
        @CustomType.Parameter("cacheDataEncrypted") @Nullable Boolean cacheDataEncrypted,
        @CustomType.Parameter("cacheTtlInSeconds") @Nullable Integer cacheTtlInSeconds,
        @CustomType.Parameter("cachingEnabled") @Nullable Boolean cachingEnabled,
        @CustomType.Parameter("canarySetting") @Nullable DeploymentCanarySetting canarySetting,
        @CustomType.Parameter("clientCertificateId") @Nullable String clientCertificateId,
        @CustomType.Parameter("dataTraceEnabled") @Nullable Boolean dataTraceEnabled,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("documentationVersion") @Nullable String documentationVersion,
        @CustomType.Parameter("loggingLevel") @Nullable String loggingLevel,
        @CustomType.Parameter("methodSettings") @Nullable List<DeploymentMethodSetting> methodSettings,
        @CustomType.Parameter("metricsEnabled") @Nullable Boolean metricsEnabled,
        @CustomType.Parameter("tags") @Nullable List<DeploymentTag> tags,
        @CustomType.Parameter("throttlingBurstLimit") @Nullable Integer throttlingBurstLimit,
        @CustomType.Parameter("throttlingRateLimit") @Nullable Double throttlingRateLimit,
        @CustomType.Parameter("tracingEnabled") @Nullable Boolean tracingEnabled,
        @CustomType.Parameter("variables") @Nullable Object variables) {
        this.accessLogSetting = accessLogSetting;
        this.cacheClusterEnabled = cacheClusterEnabled;
        this.cacheClusterSize = cacheClusterSize;
        this.cacheDataEncrypted = cacheDataEncrypted;
        this.cacheTtlInSeconds = cacheTtlInSeconds;
        this.cachingEnabled = cachingEnabled;
        this.canarySetting = canarySetting;
        this.clientCertificateId = clientCertificateId;
        this.dataTraceEnabled = dataTraceEnabled;
        this.description = description;
        this.documentationVersion = documentationVersion;
        this.loggingLevel = loggingLevel;
        this.methodSettings = methodSettings;
        this.metricsEnabled = metricsEnabled;
        this.tags = tags;
        this.throttlingBurstLimit = throttlingBurstLimit;
        this.throttlingRateLimit = throttlingRateLimit;
        this.tracingEnabled = tracingEnabled;
        this.variables = variables;
    }

    /**
     * Specifies settings for logging access in this stage.
     * 
    */
    public Optional<DeploymentAccessLogSetting> getAccessLogSetting() {
        return Optional.ofNullable(this.accessLogSetting);
    }
    /**
     * Indicates whether cache clustering is enabled for the stage.
     * 
    */
    public Optional<Boolean> getCacheClusterEnabled() {
        return Optional.ofNullable(this.cacheClusterEnabled);
    }
    /**
     * The size of the stage's cache cluster.
     * 
    */
    public Optional<String> getCacheClusterSize() {
        return Optional.ofNullable(this.cacheClusterSize);
    }
    /**
     * The time-to-live (TTL) period, in seconds, that specifies how long API Gateway caches responses.
     * 
    */
    public Optional<Boolean> getCacheDataEncrypted() {
        return Optional.ofNullable(this.cacheDataEncrypted);
    }
    /**
     * The time-to-live (TTL) period, in seconds, that specifies how long API Gateway caches responses.
     * 
    */
    public Optional<Integer> getCacheTtlInSeconds() {
        return Optional.ofNullable(this.cacheTtlInSeconds);
    }
    /**
     * Indicates whether responses are cached and returned for requests. You must enable a cache cluster on the stage to cache responses.
     * 
    */
    public Optional<Boolean> getCachingEnabled() {
        return Optional.ofNullable(this.cachingEnabled);
    }
    /**
     * Specifies settings for the canary deployment in this stage.
     * 
    */
    public Optional<DeploymentCanarySetting> getCanarySetting() {
        return Optional.ofNullable(this.canarySetting);
    }
    /**
     * The identifier of the client certificate that API Gateway uses to call your integration endpoints in the stage.
     * 
    */
    public Optional<String> getClientCertificateId() {
        return Optional.ofNullable(this.clientCertificateId);
    }
    /**
     * Indicates whether data trace logging is enabled for methods in the stage. API Gateway pushes these logs to Amazon CloudWatch Logs.
     * 
    */
    public Optional<Boolean> getDataTraceEnabled() {
        return Optional.ofNullable(this.dataTraceEnabled);
    }
    /**
     * A description of the purpose of the stage.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The version identifier of the API documentation snapshot.
     * 
    */
    public Optional<String> getDocumentationVersion() {
        return Optional.ofNullable(this.documentationVersion);
    }
    /**
     * The logging level for this method. For valid values, see the loggingLevel property of the Stage resource in the Amazon API Gateway API Reference.
     * 
    */
    public Optional<String> getLoggingLevel() {
        return Optional.ofNullable(this.loggingLevel);
    }
    /**
     * Configures settings for all of the stage's methods.
     * 
    */
    public List<DeploymentMethodSetting> getMethodSettings() {
        return this.methodSettings == null ? List.of() : this.methodSettings;
    }
    /**
     * Indicates whether Amazon CloudWatch metrics are enabled for methods in the stage.
     * 
    */
    public Optional<Boolean> getMetricsEnabled() {
        return Optional.ofNullable(this.metricsEnabled);
    }
    /**
     * An array of arbitrary tags (key-value pairs) to associate with the stage.
     * 
    */
    public List<DeploymentTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The number of burst requests per second that API Gateway permits across all APIs, stages, and methods in your AWS account.
     * 
    */
    public Optional<Integer> getThrottlingBurstLimit() {
        return Optional.ofNullable(this.throttlingBurstLimit);
    }
    /**
     * The number of steady-state requests per second that API Gateway permits across all APIs, stages, and methods in your AWS account.
     * 
    */
    public Optional<Double> getThrottlingRateLimit() {
        return Optional.ofNullable(this.throttlingRateLimit);
    }
    /**
     * Specifies whether active tracing with X-ray is enabled for this stage.
     * 
    */
    public Optional<Boolean> getTracingEnabled() {
        return Optional.ofNullable(this.tracingEnabled);
    }
    /**
     * A map that defines the stage variables. Variable names must consist of alphanumeric characters, and the values must match the following regular expression: [A-Za-z0-9-._~:/?#&=,]+.
     * 
    */
    public Optional<Object> getVariables() {
        return Optional.ofNullable(this.variables);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentStageDescription defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DeploymentAccessLogSetting accessLogSetting;
        private @Nullable Boolean cacheClusterEnabled;
        private @Nullable String cacheClusterSize;
        private @Nullable Boolean cacheDataEncrypted;
        private @Nullable Integer cacheTtlInSeconds;
        private @Nullable Boolean cachingEnabled;
        private @Nullable DeploymentCanarySetting canarySetting;
        private @Nullable String clientCertificateId;
        private @Nullable Boolean dataTraceEnabled;
        private @Nullable String description;
        private @Nullable String documentationVersion;
        private @Nullable String loggingLevel;
        private @Nullable List<DeploymentMethodSetting> methodSettings;
        private @Nullable Boolean metricsEnabled;
        private @Nullable List<DeploymentTag> tags;
        private @Nullable Integer throttlingBurstLimit;
        private @Nullable Double throttlingRateLimit;
        private @Nullable Boolean tracingEnabled;
        private @Nullable Object variables;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentStageDescription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogSetting = defaults.accessLogSetting;
    	      this.cacheClusterEnabled = defaults.cacheClusterEnabled;
    	      this.cacheClusterSize = defaults.cacheClusterSize;
    	      this.cacheDataEncrypted = defaults.cacheDataEncrypted;
    	      this.cacheTtlInSeconds = defaults.cacheTtlInSeconds;
    	      this.cachingEnabled = defaults.cachingEnabled;
    	      this.canarySetting = defaults.canarySetting;
    	      this.clientCertificateId = defaults.clientCertificateId;
    	      this.dataTraceEnabled = defaults.dataTraceEnabled;
    	      this.description = defaults.description;
    	      this.documentationVersion = defaults.documentationVersion;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.methodSettings = defaults.methodSettings;
    	      this.metricsEnabled = defaults.metricsEnabled;
    	      this.tags = defaults.tags;
    	      this.throttlingBurstLimit = defaults.throttlingBurstLimit;
    	      this.throttlingRateLimit = defaults.throttlingRateLimit;
    	      this.tracingEnabled = defaults.tracingEnabled;
    	      this.variables = defaults.variables;
        }

        public Builder accessLogSetting(@Nullable DeploymentAccessLogSetting accessLogSetting) {
            this.accessLogSetting = accessLogSetting;
            return this;
        }
        public Builder cacheClusterEnabled(@Nullable Boolean cacheClusterEnabled) {
            this.cacheClusterEnabled = cacheClusterEnabled;
            return this;
        }
        public Builder cacheClusterSize(@Nullable String cacheClusterSize) {
            this.cacheClusterSize = cacheClusterSize;
            return this;
        }
        public Builder cacheDataEncrypted(@Nullable Boolean cacheDataEncrypted) {
            this.cacheDataEncrypted = cacheDataEncrypted;
            return this;
        }
        public Builder cacheTtlInSeconds(@Nullable Integer cacheTtlInSeconds) {
            this.cacheTtlInSeconds = cacheTtlInSeconds;
            return this;
        }
        public Builder cachingEnabled(@Nullable Boolean cachingEnabled) {
            this.cachingEnabled = cachingEnabled;
            return this;
        }
        public Builder canarySetting(@Nullable DeploymentCanarySetting canarySetting) {
            this.canarySetting = canarySetting;
            return this;
        }
        public Builder clientCertificateId(@Nullable String clientCertificateId) {
            this.clientCertificateId = clientCertificateId;
            return this;
        }
        public Builder dataTraceEnabled(@Nullable Boolean dataTraceEnabled) {
            this.dataTraceEnabled = dataTraceEnabled;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder documentationVersion(@Nullable String documentationVersion) {
            this.documentationVersion = documentationVersion;
            return this;
        }
        public Builder loggingLevel(@Nullable String loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }
        public Builder methodSettings(@Nullable List<DeploymentMethodSetting> methodSettings) {
            this.methodSettings = methodSettings;
            return this;
        }
        public Builder methodSettings(DeploymentMethodSetting... methodSettings) {
            return methodSettings(List.of(methodSettings));
        }
        public Builder metricsEnabled(@Nullable Boolean metricsEnabled) {
            this.metricsEnabled = metricsEnabled;
            return this;
        }
        public Builder tags(@Nullable List<DeploymentTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DeploymentTag... tags) {
            return tags(List.of(tags));
        }
        public Builder throttlingBurstLimit(@Nullable Integer throttlingBurstLimit) {
            this.throttlingBurstLimit = throttlingBurstLimit;
            return this;
        }
        public Builder throttlingRateLimit(@Nullable Double throttlingRateLimit) {
            this.throttlingRateLimit = throttlingRateLimit;
            return this;
        }
        public Builder tracingEnabled(@Nullable Boolean tracingEnabled) {
            this.tracingEnabled = tracingEnabled;
            return this;
        }
        public Builder variables(@Nullable Object variables) {
            this.variables = variables;
            return this;
        }        public DeploymentStageDescription build() {
            return new DeploymentStageDescription(accessLogSetting, cacheClusterEnabled, cacheClusterSize, cacheDataEncrypted, cacheTtlInSeconds, cachingEnabled, canarySetting, clientCertificateId, dataTraceEnabled, description, documentationVersion, loggingLevel, methodSettings, metricsEnabled, tags, throttlingBurstLimit, throttlingRateLimit, tracingEnabled, variables);
        }
    }
}
