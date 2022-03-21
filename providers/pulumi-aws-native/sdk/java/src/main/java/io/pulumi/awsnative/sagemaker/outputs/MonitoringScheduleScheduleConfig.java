// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MonitoringScheduleScheduleConfig {
    /**
     * A cron expression that describes details about the monitoring schedule.
     * 
     */
    private final String scheduleExpression;

    @CustomType.Constructor
    private MonitoringScheduleScheduleConfig(@CustomType.Parameter("scheduleExpression") String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * A cron expression that describes details about the monitoring schedule.
     * 
    */
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleScheduleConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleScheduleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder scheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }        public MonitoringScheduleScheduleConfig build() {
            return new MonitoringScheduleScheduleConfig(scheduleExpression);
        }
    }
}
