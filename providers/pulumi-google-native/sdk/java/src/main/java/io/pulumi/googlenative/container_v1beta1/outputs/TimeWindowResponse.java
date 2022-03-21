// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.container_v1beta1.outputs.MaintenanceExclusionOptionsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TimeWindowResponse {
    /**
     * The time that the window ends. The end time should take place after the start time.
     * 
     */
    private final String endTime;
    /**
     * MaintenanceExclusionOptions provides maintenance exclusion related options.
     * 
     */
    private final MaintenanceExclusionOptionsResponse maintenanceExclusionOptions;
    /**
     * The time that the window first starts.
     * 
     */
    private final String startTime;

    @CustomType.Constructor
    private TimeWindowResponse(
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("maintenanceExclusionOptions") MaintenanceExclusionOptionsResponse maintenanceExclusionOptions,
        @CustomType.Parameter("startTime") String startTime) {
        this.endTime = endTime;
        this.maintenanceExclusionOptions = maintenanceExclusionOptions;
        this.startTime = startTime;
    }

    /**
     * The time that the window ends. The end time should take place after the start time.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * MaintenanceExclusionOptions provides maintenance exclusion related options.
     * 
    */
    public MaintenanceExclusionOptionsResponse getMaintenanceExclusionOptions() {
        return this.maintenanceExclusionOptions;
    }
    /**
     * The time that the window first starts.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private MaintenanceExclusionOptionsResponse maintenanceExclusionOptions;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.maintenanceExclusionOptions = defaults.maintenanceExclusionOptions;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder maintenanceExclusionOptions(MaintenanceExclusionOptionsResponse maintenanceExclusionOptions) {
            this.maintenanceExclusionOptions = Objects.requireNonNull(maintenanceExclusionOptions);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public TimeWindowResponse build() {
            return new TimeWindowResponse(endTime, maintenanceExclusionOptions, startTime);
        }
    }
}
