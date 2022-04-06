// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StageDefaultRouteSettings {
    /**
     * Whether data trace logging is enabled for the default route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Defaults to `false`. Supported only for WebSocket APIs.
     * 
     */
    private final @Nullable Boolean dataTraceEnabled;
    /**
     * Whether detailed metrics are enabled for the default route. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean detailedMetricsEnabled;
    /**
     * The logging level for the default route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    private final @Nullable String loggingLevel;
    /**
     * The throttling burst limit for the default route.
     * 
     */
    private final @Nullable Integer throttlingBurstLimit;
    /**
     * The throttling rate limit for the default route.
     * 
     */
    private final @Nullable Double throttlingRateLimit;

    @CustomType.Constructor
    private StageDefaultRouteSettings(
        @CustomType.Parameter("dataTraceEnabled") @Nullable Boolean dataTraceEnabled,
        @CustomType.Parameter("detailedMetricsEnabled") @Nullable Boolean detailedMetricsEnabled,
        @CustomType.Parameter("loggingLevel") @Nullable String loggingLevel,
        @CustomType.Parameter("throttlingBurstLimit") @Nullable Integer throttlingBurstLimit,
        @CustomType.Parameter("throttlingRateLimit") @Nullable Double throttlingRateLimit) {
        this.dataTraceEnabled = dataTraceEnabled;
        this.detailedMetricsEnabled = detailedMetricsEnabled;
        this.loggingLevel = loggingLevel;
        this.throttlingBurstLimit = throttlingBurstLimit;
        this.throttlingRateLimit = throttlingRateLimit;
    }

    /**
     * Whether data trace logging is enabled for the default route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Defaults to `false`. Supported only for WebSocket APIs.
     * 
    */
    public Optional<Boolean> getDataTraceEnabled() {
        return Optional.ofNullable(this.dataTraceEnabled);
    }
    /**
     * Whether detailed metrics are enabled for the default route. Defaults to `false`.
     * 
    */
    public Optional<Boolean> getDetailedMetricsEnabled() {
        return Optional.ofNullable(this.detailedMetricsEnabled);
    }
    /**
     * The logging level for the default route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
     * 
    */
    public Optional<String> getLoggingLevel() {
        return Optional.ofNullable(this.loggingLevel);
    }
    /**
     * The throttling burst limit for the default route.
     * 
    */
    public Optional<Integer> getThrottlingBurstLimit() {
        return Optional.ofNullable(this.throttlingBurstLimit);
    }
    /**
     * The throttling rate limit for the default route.
     * 
    */
    public Optional<Double> getThrottlingRateLimit() {
        return Optional.ofNullable(this.throttlingRateLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageDefaultRouteSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean dataTraceEnabled;
        private @Nullable Boolean detailedMetricsEnabled;
        private @Nullable String loggingLevel;
        private @Nullable Integer throttlingBurstLimit;
        private @Nullable Double throttlingRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(StageDefaultRouteSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTraceEnabled = defaults.dataTraceEnabled;
    	      this.detailedMetricsEnabled = defaults.detailedMetricsEnabled;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.throttlingBurstLimit = defaults.throttlingBurstLimit;
    	      this.throttlingRateLimit = defaults.throttlingRateLimit;
        }

        public Builder dataTraceEnabled(@Nullable Boolean dataTraceEnabled) {
            this.dataTraceEnabled = dataTraceEnabled;
            return this;
        }
        public Builder detailedMetricsEnabled(@Nullable Boolean detailedMetricsEnabled) {
            this.detailedMetricsEnabled = detailedMetricsEnabled;
            return this;
        }
        public Builder loggingLevel(@Nullable String loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }
        public Builder throttlingBurstLimit(@Nullable Integer throttlingBurstLimit) {
            this.throttlingBurstLimit = throttlingBurstLimit;
            return this;
        }
        public Builder throttlingRateLimit(@Nullable Double throttlingRateLimit) {
            this.throttlingRateLimit = throttlingRateLimit;
            return this;
        }        public StageDefaultRouteSettings build() {
            return new StageDefaultRouteSettings(dataTraceEnabled, detailedMetricsEnabled, loggingLevel, throttlingBurstLimit, throttlingRateLimit);
        }
    }
}