// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_alpha.outputs.DurationResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NodeGroupMaintenanceWindowResponse {
    /**
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * 
     */
    private final String duration;
    /**
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * 
     */
    private final DurationResponse maintenanceDuration;
    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    private final String startTime;

    @CustomType.Constructor
    private NodeGroupMaintenanceWindowResponse(
        @CustomType.Parameter("duration") String duration,
        @CustomType.Parameter("maintenanceDuration") DurationResponse maintenanceDuration,
        @CustomType.Parameter("startTime") String startTime) {
        this.duration = duration;
        this.maintenanceDuration = maintenanceDuration;
        this.startTime = startTime;
    }

    /**
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * 
    */
    public String getDuration() {
        return this.duration;
    }
    /**
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * 
    */
    public DurationResponse getMaintenanceDuration() {
        return this.maintenanceDuration;
    }
    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupMaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private DurationResponse maintenanceDuration;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupMaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.maintenanceDuration = defaults.maintenanceDuration;
    	      this.startTime = defaults.startTime;
        }

        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder maintenanceDuration(DurationResponse maintenanceDuration) {
            this.maintenanceDuration = Objects.requireNonNull(maintenanceDuration);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public NodeGroupMaintenanceWindowResponse build() {
            return new NodeGroupMaintenanceWindowResponse(duration, maintenanceDuration, startTime);
        }
    }
}
