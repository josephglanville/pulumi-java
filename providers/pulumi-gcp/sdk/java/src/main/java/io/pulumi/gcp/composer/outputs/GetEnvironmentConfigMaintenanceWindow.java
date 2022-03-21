// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEnvironmentConfigMaintenanceWindow {
    private final String endTime;
    private final String recurrence;
    private final String startTime;

    @CustomType.Constructor
    private GetEnvironmentConfigMaintenanceWindow(
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("recurrence") String recurrence,
        @CustomType.Parameter("startTime") String startTime) {
        this.endTime = endTime;
        this.recurrence = recurrence;
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
    public String getRecurrence() {
        return this.recurrence;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigMaintenanceWindow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String recurrence;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.recurrence = defaults.recurrence;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder recurrence(String recurrence) {
            this.recurrence = Objects.requireNonNull(recurrence);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public GetEnvironmentConfigMaintenanceWindow build() {
            return new GetEnvironmentConfigMaintenanceWindow(endTime, recurrence, startTime);
        }
    }
}
