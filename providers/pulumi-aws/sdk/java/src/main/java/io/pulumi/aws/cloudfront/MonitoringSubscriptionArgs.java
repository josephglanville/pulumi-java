// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront;

import io.pulumi.aws.cloudfront.inputs.MonitoringSubscriptionMonitoringSubscriptionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MonitoringSubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringSubscriptionArgs Empty = new MonitoringSubscriptionArgs();

    /**
     * The ID of the distribution that you are enabling metrics for.
     * 
     */
    @Import(name="distributionId", required=true)
      private final Output<String> distributionId;

    public Output<String> getDistributionId() {
        return this.distributionId;
    }

    /**
     * A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
     * 
     */
    @Import(name="monitoringSubscription", required=true)
      private final Output<MonitoringSubscriptionMonitoringSubscriptionArgs> monitoringSubscription;

    public Output<MonitoringSubscriptionMonitoringSubscriptionArgs> getMonitoringSubscription() {
        return this.monitoringSubscription;
    }

    public MonitoringSubscriptionArgs(
        Output<String> distributionId,
        Output<MonitoringSubscriptionMonitoringSubscriptionArgs> monitoringSubscription) {
        this.distributionId = Objects.requireNonNull(distributionId, "expected parameter 'distributionId' to be non-null");
        this.monitoringSubscription = Objects.requireNonNull(monitoringSubscription, "expected parameter 'monitoringSubscription' to be non-null");
    }

    private MonitoringSubscriptionArgs() {
        this.distributionId = Output.empty();
        this.monitoringSubscription = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> distributionId;
        private Output<MonitoringSubscriptionMonitoringSubscriptionArgs> monitoringSubscription;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionId = defaults.distributionId;
    	      this.monitoringSubscription = defaults.monitoringSubscription;
        }

        public Builder distributionId(Output<String> distributionId) {
            this.distributionId = Objects.requireNonNull(distributionId);
            return this;
        }
        public Builder distributionId(String distributionId) {
            this.distributionId = Output.of(Objects.requireNonNull(distributionId));
            return this;
        }
        public Builder monitoringSubscription(Output<MonitoringSubscriptionMonitoringSubscriptionArgs> monitoringSubscription) {
            this.monitoringSubscription = Objects.requireNonNull(monitoringSubscription);
            return this;
        }
        public Builder monitoringSubscription(MonitoringSubscriptionMonitoringSubscriptionArgs monitoringSubscription) {
            this.monitoringSubscription = Output.of(Objects.requireNonNull(monitoringSubscription));
            return this;
        }        public MonitoringSubscriptionArgs build() {
            return new MonitoringSubscriptionArgs(distributionId, monitoringSubscription);
        }
    }
}
