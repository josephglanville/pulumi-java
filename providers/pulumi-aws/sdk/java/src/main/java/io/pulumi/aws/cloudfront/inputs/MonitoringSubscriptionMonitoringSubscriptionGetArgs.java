// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class MonitoringSubscriptionMonitoringSubscriptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringSubscriptionMonitoringSubscriptionGetArgs Empty = new MonitoringSubscriptionMonitoringSubscriptionGetArgs();

    /**
     * A subscription configuration for additional CloudWatch metrics. See below.
     * 
     */
    @Import(name="realtimeMetricsSubscriptionConfig", required=true)
      private final Output<MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs> realtimeMetricsSubscriptionConfig;

    public Output<MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs> getRealtimeMetricsSubscriptionConfig() {
        return this.realtimeMetricsSubscriptionConfig;
    }

    public MonitoringSubscriptionMonitoringSubscriptionGetArgs(Output<MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs> realtimeMetricsSubscriptionConfig) {
        this.realtimeMetricsSubscriptionConfig = Objects.requireNonNull(realtimeMetricsSubscriptionConfig, "expected parameter 'realtimeMetricsSubscriptionConfig' to be non-null");
    }

    private MonitoringSubscriptionMonitoringSubscriptionGetArgs() {
        this.realtimeMetricsSubscriptionConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringSubscriptionMonitoringSubscriptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs> realtimeMetricsSubscriptionConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringSubscriptionMonitoringSubscriptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.realtimeMetricsSubscriptionConfig = defaults.realtimeMetricsSubscriptionConfig;
        }

        public Builder realtimeMetricsSubscriptionConfig(Output<MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs> realtimeMetricsSubscriptionConfig) {
            this.realtimeMetricsSubscriptionConfig = Objects.requireNonNull(realtimeMetricsSubscriptionConfig);
            return this;
        }
        public Builder realtimeMetricsSubscriptionConfig(MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs realtimeMetricsSubscriptionConfig) {
            this.realtimeMetricsSubscriptionConfig = Output.of(Objects.requireNonNull(realtimeMetricsSubscriptionConfig));
            return this;
        }        public MonitoringSubscriptionMonitoringSubscriptionGetArgs build() {
            return new MonitoringSubscriptionMonitoringSubscriptionGetArgs(realtimeMetricsSubscriptionConfig);
        }
    }
}