// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Control over the rate of notifications sent to this alert policy's notification channels.
 * 
 */
public final class NotificationRateLimitResponse extends io.pulumi.resources.InvokeArgs {

    public static final NotificationRateLimitResponse Empty = new NotificationRateLimitResponse();

    /**
     * Not more than one notification per period.
     * 
     */
    @Import(name="period", required=true)
      private final String period;

    public String getPeriod() {
        return this.period;
    }

    public NotificationRateLimitResponse(String period) {
        this.period = Objects.requireNonNull(period, "expected parameter 'period' to be non-null");
    }

    private NotificationRateLimitResponse() {
        this.period = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRateLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String period;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRateLimitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.period = defaults.period;
        }

        public Builder period(String period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }        public NotificationRateLimitResponse build() {
            return new NotificationRateLimitResponse(period);
        }
    }
}
