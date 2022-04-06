// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class MonitoringSubscriptionMonitoringSubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringSubscriptionMonitoringSubscriptionArgs Empty = new MonitoringSubscriptionMonitoringSubscriptionArgs();

    /**
     * A subscription configuration for additional CloudWatch metrics. See below.
     * 
     */
    @Import(name="realtimeMetricsSubscriptionConfig", required=true)
      private final Output<MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs> realtimeMetricsSubscriptionConfig;

    public Output<MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs> getRealtimeMetricsSubscriptionConfig() {
        return this.realtimeMetricsSubscriptionConfig;
    }

    public MonitoringSubscriptionMonitoringSubscriptionArgs(Output<MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs> realtimeMetricsSubscriptionConfig) {
        this.realtimeMetricsSubscriptionConfig = Objects.requireNonNull(realtimeMetricsSubscriptionConfig, "expected parameter 'realtimeMetricsSubscriptionConfig' to be non-null");
    }

    private MonitoringSubscriptionMonitoringSubscriptionArgs() {
        this.realtimeMetricsSubscriptionConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringSubscriptionMonitoringSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs> realtimeMetricsSubscriptionConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringSubscriptionMonitoringSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.realtimeMetricsSubscriptionConfig = defaults.realtimeMetricsSubscriptionConfig;
        }

        public Builder realtimeMetricsSubscriptionConfig(Output<MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs> realtimeMetricsSubscriptionConfig) {
            this.realtimeMetricsSubscriptionConfig = Objects.requireNonNull(realtimeMetricsSubscriptionConfig);
            return this;
        }
        public Builder realtimeMetricsSubscriptionConfig(MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs realtimeMetricsSubscriptionConfig) {
            this.realtimeMetricsSubscriptionConfig = Output.of(Objects.requireNonNull(realtimeMetricsSubscriptionConfig));
            return this;
        }        public MonitoringSubscriptionMonitoringSubscriptionArgs build() {
            return new MonitoringSubscriptionMonitoringSubscriptionArgs(realtimeMetricsSubscriptionConfig);
        }
    }
}