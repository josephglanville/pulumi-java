// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.GetAutonomousDatabasesClonesAutonomousDatabaseScheduledOperationDayOfWeek;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAutonomousDatabasesClonesAutonomousDatabaseScheduledOperation {
    /**
     * @return Day of the week.
     * 
     */
    private final List<GetAutonomousDatabasesClonesAutonomousDatabaseScheduledOperationDayOfWeek> dayOfWeeks;
    /**
     * @return auto start time. value must be of ISO-8601 format &#34;HH:mm&#34;
     * 
     */
    private final String scheduledStartTime;
    /**
     * @return auto stop time. value must be of ISO-8601 format &#34;HH:mm&#34;
     * 
     */
    private final String scheduledStopTime;

    @CustomType.Constructor
    private GetAutonomousDatabasesClonesAutonomousDatabaseScheduledOperation(
        @CustomType.Parameter("dayOfWeeks") List<GetAutonomousDatabasesClonesAutonomousDatabaseScheduledOperationDayOfWeek> dayOfWeeks,
        @CustomType.Parameter("scheduledStartTime") String scheduledStartTime,
        @CustomType.Parameter("scheduledStopTime") String scheduledStopTime) {
        this.dayOfWeeks = dayOfWeeks;
        this.scheduledStartTime = scheduledStartTime;
        this.scheduledStopTime = scheduledStopTime;
    }

    /**
     * @return Day of the week.
     * 
     */
    public List<GetAutonomousDatabasesClonesAutonomousDatabaseScheduledOperationDayOfWeek> dayOfWeeks() {
        return this.dayOfWeeks;
    }
    /**
     * @return auto start time. value must be of ISO-8601 format &#34;HH:mm&#34;
     * 
     */
    public String scheduledStartTime() {
        return this.scheduledStartTime;
    }
    /**
     * @return auto stop time. value must be of ISO-8601 format &#34;HH:mm&#34;
     * 
     */
    public String scheduledStopTime() {
        return this.scheduledStopTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutonomousDatabasesClonesAutonomousDatabaseScheduledOperation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAutonomousDatabasesClonesAutonomousDatabaseScheduledOperationDayOfWeek> dayOfWeeks;
        private String scheduledStartTime;
        private String scheduledStopTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutonomousDatabasesClonesAutonomousDatabaseScheduledOperation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeeks = defaults.dayOfWeeks;
    	      this.scheduledStartTime = defaults.scheduledStartTime;
    	      this.scheduledStopTime = defaults.scheduledStopTime;
        }

        public Builder dayOfWeeks(List<GetAutonomousDatabasesClonesAutonomousDatabaseScheduledOperationDayOfWeek> dayOfWeeks) {
            this.dayOfWeeks = Objects.requireNonNull(dayOfWeeks);
            return this;
        }
        public Builder dayOfWeeks(GetAutonomousDatabasesClonesAutonomousDatabaseScheduledOperationDayOfWeek... dayOfWeeks) {
            return dayOfWeeks(List.of(dayOfWeeks));
        }
        public Builder scheduledStartTime(String scheduledStartTime) {
            this.scheduledStartTime = Objects.requireNonNull(scheduledStartTime);
            return this;
        }
        public Builder scheduledStopTime(String scheduledStopTime) {
            this.scheduledStopTime = Objects.requireNonNull(scheduledStopTime);
            return this;
        }        public GetAutonomousDatabasesClonesAutonomousDatabaseScheduledOperation build() {
            return new GetAutonomousDatabasesClonesAutonomousDatabaseScheduledOperation(dayOfWeeks, scheduledStartTime, scheduledStopTime);
        }
    }
}
