// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the threshold for declaring a test successful.
 * 
 */
public final class ConnectionMonitorSuccessThresholdArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorSuccessThresholdArgs Empty = new ConnectionMonitorSuccessThresholdArgs();

    /**
     * The maximum percentage of failed checks permitted for a test to evaluate as successful.
     * 
     */
    @InputImport(name="checksFailedPercent")
      private final @Nullable Input<Integer> checksFailedPercent;

    public Input<Integer> getChecksFailedPercent() {
        return this.checksFailedPercent == null ? Input.empty() : this.checksFailedPercent;
    }

    /**
     * The maximum round-trip time in milliseconds permitted for a test to evaluate as successful.
     * 
     */
    @InputImport(name="roundTripTimeMs")
      private final @Nullable Input<Double> roundTripTimeMs;

    public Input<Double> getRoundTripTimeMs() {
        return this.roundTripTimeMs == null ? Input.empty() : this.roundTripTimeMs;
    }

    public ConnectionMonitorSuccessThresholdArgs(
        @Nullable Input<Integer> checksFailedPercent,
        @Nullable Input<Double> roundTripTimeMs) {
        this.checksFailedPercent = checksFailedPercent;
        this.roundTripTimeMs = roundTripTimeMs;
    }

    private ConnectionMonitorSuccessThresholdArgs() {
        this.checksFailedPercent = Input.empty();
        this.roundTripTimeMs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorSuccessThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> checksFailedPercent;
        private @Nullable Input<Double> roundTripTimeMs;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorSuccessThresholdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checksFailedPercent = defaults.checksFailedPercent;
    	      this.roundTripTimeMs = defaults.roundTripTimeMs;
        }

        public Builder setChecksFailedPercent(@Nullable Input<Integer> checksFailedPercent) {
            this.checksFailedPercent = checksFailedPercent;
            return this;
        }

        public Builder setChecksFailedPercent(@Nullable Integer checksFailedPercent) {
            this.checksFailedPercent = Input.ofNullable(checksFailedPercent);
            return this;
        }

        public Builder setRoundTripTimeMs(@Nullable Input<Double> roundTripTimeMs) {
            this.roundTripTimeMs = roundTripTimeMs;
            return this;
        }

        public Builder setRoundTripTimeMs(@Nullable Double roundTripTimeMs) {
            this.roundTripTimeMs = Input.ofNullable(roundTripTimeMs);
            return this;
        }
        public ConnectionMonitorSuccessThresholdArgs build() {
            return new ConnectionMonitorSuccessThresholdArgs(checksFailedPercent, roundTripTimeMs);
        }
    }
}
