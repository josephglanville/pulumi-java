// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebACLVisibilityConfig {
    private final Boolean cloudWatchMetricsEnabled;
    private final String metricName;
    private final Boolean sampledRequestsEnabled;

    @CustomType.Constructor
    private WebACLVisibilityConfig(
        @CustomType.Parameter("cloudWatchMetricsEnabled") Boolean cloudWatchMetricsEnabled,
        @CustomType.Parameter("metricName") String metricName,
        @CustomType.Parameter("sampledRequestsEnabled") Boolean sampledRequestsEnabled) {
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
        this.metricName = metricName;
        this.sampledRequestsEnabled = sampledRequestsEnabled;
    }

    public Boolean getCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled;
    }
    public String getMetricName() {
        return this.metricName;
    }
    public Boolean getSampledRequestsEnabled() {
        return this.sampledRequestsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLVisibilityConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean cloudWatchMetricsEnabled;
        private String metricName;
        private Boolean sampledRequestsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLVisibilityConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchMetricsEnabled = defaults.cloudWatchMetricsEnabled;
    	      this.metricName = defaults.metricName;
    	      this.sampledRequestsEnabled = defaults.sampledRequestsEnabled;
        }

        public Builder cloudWatchMetricsEnabled(Boolean cloudWatchMetricsEnabled) {
            this.cloudWatchMetricsEnabled = Objects.requireNonNull(cloudWatchMetricsEnabled);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder sampledRequestsEnabled(Boolean sampledRequestsEnabled) {
            this.sampledRequestsEnabled = Objects.requireNonNull(sampledRequestsEnabled);
            return this;
        }        public WebACLVisibilityConfig build() {
            return new WebACLVisibilityConfig(cloudWatchMetricsEnabled, metricName, sampledRequestsEnabled);
        }
    }
}
