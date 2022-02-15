// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class LatLngResponse {
    private final Double latitude;
    private final Double longitude;

    @OutputCustomType.Constructor({"latitude","longitude"})
    private LatLngResponse(
        Double latitude,
        Double longitude) {
        this.latitude = Objects.requireNonNull(latitude);
        this.longitude = Objects.requireNonNull(longitude);
    }

    public Double getLatitude() {
        return this.latitude;
    }
    public Double getLongitude() {
        return this.longitude;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LatLngResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double latitude;
        private Double longitude;

        public Builder() {
    	      // Empty
        }

        public Builder(LatLngResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latitude = defaults.latitude;
    	      this.longitude = defaults.longitude;
        }

        public Builder setLatitude(Double latitude) {
            this.latitude = Objects.requireNonNull(latitude);
            return this;
        }

        public Builder setLongitude(Double longitude) {
            this.longitude = Objects.requireNonNull(longitude);
            return this;
        }

        public LatLngResponse build() {
            return new LatLngResponse(latitude, longitude);
        }
    }
}