// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.DestinationsSpecResponseAzureMonitorMetrics;
import io.pulumi.azurenative.insights.inputs.LogAnalyticsDestinationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataCollectionRuleResponseDestinations extends io.pulumi.resources.InvokeArgs {

    public static final DataCollectionRuleResponseDestinations Empty = new DataCollectionRuleResponseDestinations();

    @InputImport(name="azureMonitorMetrics")
    private final @Nullable DestinationsSpecResponseAzureMonitorMetrics azureMonitorMetrics;

    public Optional<DestinationsSpecResponseAzureMonitorMetrics> getAzureMonitorMetrics() {
        return this.azureMonitorMetrics == null ? Optional.empty() : Optional.ofNullable(this.azureMonitorMetrics);
    }

    @InputImport(name="logAnalytics")
    private final @Nullable List<LogAnalyticsDestinationResponse> logAnalytics;

    public List<LogAnalyticsDestinationResponse> getLogAnalytics() {
        return this.logAnalytics == null ? List.of() : this.logAnalytics;
    }

    public DataCollectionRuleResponseDestinations(
        @Nullable DestinationsSpecResponseAzureMonitorMetrics azureMonitorMetrics,
        @Nullable List<LogAnalyticsDestinationResponse> logAnalytics) {
        this.azureMonitorMetrics = azureMonitorMetrics;
        this.logAnalytics = logAnalytics;
    }

    private DataCollectionRuleResponseDestinations() {
        this.azureMonitorMetrics = null;
        this.logAnalytics = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionRuleResponseDestinations defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DestinationsSpecResponseAzureMonitorMetrics azureMonitorMetrics;
        private @Nullable List<LogAnalyticsDestinationResponse> logAnalytics;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCollectionRuleResponseDestinations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureMonitorMetrics = defaults.azureMonitorMetrics;
    	      this.logAnalytics = defaults.logAnalytics;
        }

        public Builder setAzureMonitorMetrics(@Nullable DestinationsSpecResponseAzureMonitorMetrics azureMonitorMetrics) {
            this.azureMonitorMetrics = azureMonitorMetrics;
            return this;
        }

        public Builder setLogAnalytics(@Nullable List<LogAnalyticsDestinationResponse> logAnalytics) {
            this.logAnalytics = logAnalytics;
            return this;
        }

        public DataCollectionRuleResponseDestinations build() {
            return new DataCollectionRuleResponseDestinations(azureMonitorMetrics, logAnalytics);
        }
    }
}
