// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StageDefaultRouteSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StageDefaultRouteSettingsGetArgs Empty = new StageDefaultRouteSettingsGetArgs();

    /**
     * Whether data trace logging is enabled for the default route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Defaults to `false`. Supported only for WebSocket APIs.
     * 
     */
    @InputImport(name="dataTraceEnabled")
      private final @Nullable Output<Boolean> dataTraceEnabled;

    public Output<Boolean> getDataTraceEnabled() {
        return this.dataTraceEnabled == null ? Output.empty() : this.dataTraceEnabled;
    }

    /**
     * Whether detailed metrics are enabled for the default route. Defaults to `false`.
     * 
     */
    @InputImport(name="detailedMetricsEnabled")
      private final @Nullable Output<Boolean> detailedMetricsEnabled;

    public Output<Boolean> getDetailedMetricsEnabled() {
        return this.detailedMetricsEnabled == null ? Output.empty() : this.detailedMetricsEnabled;
    }

    /**
     * The logging level for the default route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @InputImport(name="loggingLevel")
      private final @Nullable Output<String> loggingLevel;

    public Output<String> getLoggingLevel() {
        return this.loggingLevel == null ? Output.empty() : this.loggingLevel;
    }

    /**
     * The throttling burst limit for the default route.
     * 
     */
    @InputImport(name="throttlingBurstLimit")
      private final @Nullable Output<Integer> throttlingBurstLimit;

    public Output<Integer> getThrottlingBurstLimit() {
        return this.throttlingBurstLimit == null ? Output.empty() : this.throttlingBurstLimit;
    }

    /**
     * The throttling rate limit for the default route.
     * 
     */
    @InputImport(name="throttlingRateLimit")
      private final @Nullable Output<Double> throttlingRateLimit;

    public Output<Double> getThrottlingRateLimit() {
        return this.throttlingRateLimit == null ? Output.empty() : this.throttlingRateLimit;
    }

    public StageDefaultRouteSettingsGetArgs(
        @Nullable Output<Boolean> dataTraceEnabled,
        @Nullable Output<Boolean> detailedMetricsEnabled,
        @Nullable Output<String> loggingLevel,
        @Nullable Output<Integer> throttlingBurstLimit,
        @Nullable Output<Double> throttlingRateLimit) {
        this.dataTraceEnabled = dataTraceEnabled;
        this.detailedMetricsEnabled = detailedMetricsEnabled;
        this.loggingLevel = loggingLevel;
        this.throttlingBurstLimit = throttlingBurstLimit;
        this.throttlingRateLimit = throttlingRateLimit;
    }

    private StageDefaultRouteSettingsGetArgs() {
        this.dataTraceEnabled = Output.empty();
        this.detailedMetricsEnabled = Output.empty();
        this.loggingLevel = Output.empty();
        this.throttlingBurstLimit = Output.empty();
        this.throttlingRateLimit = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageDefaultRouteSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> dataTraceEnabled;
        private @Nullable Output<Boolean> detailedMetricsEnabled;
        private @Nullable Output<String> loggingLevel;
        private @Nullable Output<Integer> throttlingBurstLimit;
        private @Nullable Output<Double> throttlingRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(StageDefaultRouteSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTraceEnabled = defaults.dataTraceEnabled;
    	      this.detailedMetricsEnabled = defaults.detailedMetricsEnabled;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.throttlingBurstLimit = defaults.throttlingBurstLimit;
    	      this.throttlingRateLimit = defaults.throttlingRateLimit;
        }

        public Builder dataTraceEnabled(@Nullable Output<Boolean> dataTraceEnabled) {
            this.dataTraceEnabled = dataTraceEnabled;
            return this;
        }

        public Builder dataTraceEnabled(@Nullable Boolean dataTraceEnabled) {
            this.dataTraceEnabled = Output.ofNullable(dataTraceEnabled);
            return this;
        }

        public Builder detailedMetricsEnabled(@Nullable Output<Boolean> detailedMetricsEnabled) {
            this.detailedMetricsEnabled = detailedMetricsEnabled;
            return this;
        }

        public Builder detailedMetricsEnabled(@Nullable Boolean detailedMetricsEnabled) {
            this.detailedMetricsEnabled = Output.ofNullable(detailedMetricsEnabled);
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
        public StageDefaultRouteSettingsGetArgs build() {
            return new StageDefaultRouteSettingsGetArgs(dataTraceEnabled, detailedMetricsEnabled, loggingLevel, throttlingBurstLimit, throttlingRateLimit);
        }
    }
}
