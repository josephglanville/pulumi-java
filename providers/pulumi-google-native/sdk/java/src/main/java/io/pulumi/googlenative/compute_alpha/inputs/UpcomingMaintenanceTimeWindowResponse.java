// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a window of time using two timestamps: `earliest` and `latest`. This timestamp values are in RFC3339 text format.
 * 
 */
public final class UpcomingMaintenanceTimeWindowResponse extends io.pulumi.resources.InvokeArgs {

    public static final UpcomingMaintenanceTimeWindowResponse Empty = new UpcomingMaintenanceTimeWindowResponse();

    @Import(name="earliest", required=true)
      private final String earliest;

    public String getEarliest() {
        return this.earliest;
    }

    @Import(name="latest", required=true)
      private final String latest;

    public String getLatest() {
        return this.latest;
    }

    public UpcomingMaintenanceTimeWindowResponse(
        String earliest,
        String latest) {
        this.earliest = Objects.requireNonNull(earliest, "expected parameter 'earliest' to be non-null");
        this.latest = Objects.requireNonNull(latest, "expected parameter 'latest' to be non-null");
    }

    private UpcomingMaintenanceTimeWindowResponse() {
        this.earliest = null;
        this.latest = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpcomingMaintenanceTimeWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String earliest;
        private String latest;

        public Builder() {
    	      // Empty
        }

        public Builder(UpcomingMaintenanceTimeWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.earliest = defaults.earliest;
    	      this.latest = defaults.latest;
        }

        public Builder earliest(String earliest) {
            this.earliest = Objects.requireNonNull(earliest);
            return this;
        }
        public Builder latest(String latest) {
            this.latest = Objects.requireNonNull(latest);
            return this;
        }        public UpcomingMaintenanceTimeWindowResponse build() {
            return new UpcomingMaintenanceTimeWindowResponse(earliest, latest);
        }
    }
}
