// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.inputs;

import io.pulumi.azurenative.orbital.enums.Direction;
import io.pulumi.azurenative.orbital.enums.Polarization;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Spacecraft Link
 * 
 */
public final class SpacecraftLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpacecraftLinkArgs Empty = new SpacecraftLinkArgs();

    /**
     * Bandwidth in MHz
     * 
     */
    @InputImport(name="bandwidthMHz", required=true)
      private final Input<Double> bandwidthMHz;

    public Input<Double> getBandwidthMHz() {
        return this.bandwidthMHz;
    }

    /**
     * Center Frequency in MHz
     * 
     */
    @InputImport(name="centerFrequencyMHz", required=true)
      private final Input<Double> centerFrequencyMHz;

    public Input<Double> getCenterFrequencyMHz() {
        return this.centerFrequencyMHz;
    }

    /**
     * Direction (uplink or downlink)
     * 
     */
    @InputImport(name="direction", required=true)
      private final Input<Either<String,Direction>> direction;

    public Input<Either<String,Direction>> getDirection() {
        return this.direction;
    }

    /**
     * polarization. eg (RHCP, LHCP)
     * 
     */
    @InputImport(name="polarization", required=true)
      private final Input<Either<String,Polarization>> polarization;

    public Input<Either<String,Polarization>> getPolarization() {
        return this.polarization;
    }

    public SpacecraftLinkArgs(
        Input<Double> bandwidthMHz,
        Input<Double> centerFrequencyMHz,
        Input<Either<String,Direction>> direction,
        Input<Either<String,Polarization>> polarization) {
        this.bandwidthMHz = Objects.requireNonNull(bandwidthMHz, "expected parameter 'bandwidthMHz' to be non-null");
        this.centerFrequencyMHz = Objects.requireNonNull(centerFrequencyMHz, "expected parameter 'centerFrequencyMHz' to be non-null");
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.polarization = Objects.requireNonNull(polarization, "expected parameter 'polarization' to be non-null");
    }

    private SpacecraftLinkArgs() {
        this.bandwidthMHz = Input.empty();
        this.centerFrequencyMHz = Input.empty();
        this.direction = Input.empty();
        this.polarization = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpacecraftLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Double> bandwidthMHz;
        private Input<Double> centerFrequencyMHz;
        private Input<Either<String,Direction>> direction;
        private Input<Either<String,Polarization>> polarization;

        public Builder() {
    	      // Empty
        }

        public Builder(SpacecraftLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthMHz = defaults.bandwidthMHz;
    	      this.centerFrequencyMHz = defaults.centerFrequencyMHz;
    	      this.direction = defaults.direction;
    	      this.polarization = defaults.polarization;
        }

        public Builder setBandwidthMHz(Input<Double> bandwidthMHz) {
            this.bandwidthMHz = Objects.requireNonNull(bandwidthMHz);
            return this;
        }

        public Builder setBandwidthMHz(Double bandwidthMHz) {
            this.bandwidthMHz = Input.of(Objects.requireNonNull(bandwidthMHz));
            return this;
        }

        public Builder setCenterFrequencyMHz(Input<Double> centerFrequencyMHz) {
            this.centerFrequencyMHz = Objects.requireNonNull(centerFrequencyMHz);
            return this;
        }

        public Builder setCenterFrequencyMHz(Double centerFrequencyMHz) {
            this.centerFrequencyMHz = Input.of(Objects.requireNonNull(centerFrequencyMHz));
            return this;
        }

        public Builder setDirection(Input<Either<String,Direction>> direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setDirection(Either<String,Direction> direction) {
            this.direction = Input.of(Objects.requireNonNull(direction));
            return this;
        }

        public Builder setPolarization(Input<Either<String,Polarization>> polarization) {
            this.polarization = Objects.requireNonNull(polarization);
            return this;
        }

        public Builder setPolarization(Either<String,Polarization> polarization) {
            this.polarization = Input.of(Objects.requireNonNull(polarization));
            return this;
        }
        public SpacecraftLinkArgs build() {
            return new SpacecraftLinkArgs(bandwidthMHz, centerFrequencyMHz, direction, polarization);
        }
    }
}
