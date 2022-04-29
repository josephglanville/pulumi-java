// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAlarmHistoryCollectionEntry {
    /**
     * @return Description for this alarm history entry.
     * 
     */
    private final String summary;
    /**
     * @return Timestamp for this alarm history entry. Format defined by RFC3339.  Example: `2019-02-01T01:02:29.600Z`
     * 
     */
    private final String timestamp;
    /**
     * @return Timestamp for the transition of the alarm state. For example, the time when the alarm transitioned from OK to Firing. Available for state transition entries only. Note: A three-minute lag for this value accounts for any late-arriving metrics.  Example: `2019-02-01T0:59:00.789Z`
     * 
     */
    private final String timestampTriggered;

    @CustomType.Constructor
    private GetAlarmHistoryCollectionEntry(
        @CustomType.Parameter("summary") String summary,
        @CustomType.Parameter("timestamp") String timestamp,
        @CustomType.Parameter("timestampTriggered") String timestampTriggered) {
        this.summary = summary;
        this.timestamp = timestamp;
        this.timestampTriggered = timestampTriggered;
    }

    /**
     * @return Description for this alarm history entry.
     * 
     */
    public String summary() {
        return this.summary;
    }
    /**
     * @return Timestamp for this alarm history entry. Format defined by RFC3339.  Example: `2019-02-01T01:02:29.600Z`
     * 
     */
    public String timestamp() {
        return this.timestamp;
    }
    /**
     * @return Timestamp for the transition of the alarm state. For example, the time when the alarm transitioned from OK to Firing. Available for state transition entries only. Note: A three-minute lag for this value accounts for any late-arriving metrics.  Example: `2019-02-01T0:59:00.789Z`
     * 
     */
    public String timestampTriggered() {
        return this.timestampTriggered;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlarmHistoryCollectionEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String summary;
        private String timestamp;
        private String timestampTriggered;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlarmHistoryCollectionEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.summary = defaults.summary;
    	      this.timestamp = defaults.timestamp;
    	      this.timestampTriggered = defaults.timestampTriggered;
        }

        public Builder summary(String summary) {
            this.summary = Objects.requireNonNull(summary);
            return this;
        }
        public Builder timestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }
        public Builder timestampTriggered(String timestampTriggered) {
            this.timestampTriggered = Objects.requireNonNull(timestampTriggered);
            return this;
        }        public GetAlarmHistoryCollectionEntry build() {
            return new GetAlarmHistoryCollectionEntry(summary, timestamp, timestampTriggered);
        }
    }
}
