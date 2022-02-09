// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.SkuZoneDetailResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SkuLocationInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final SkuLocationInfoResponse Empty = new SkuLocationInfoResponse();

    @InputImport(name="extendedLocations")
    private final @Nullable List<String> extendedLocations;

    public List<String> getExtendedLocations() {
        return this.extendedLocations == null ? List.of() : this.extendedLocations;
    }

    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    @InputImport(name="zoneDetails")
    private final @Nullable List<SkuZoneDetailResponse> zoneDetails;

    public List<SkuZoneDetailResponse> getZoneDetails() {
        return this.zoneDetails == null ? List.of() : this.zoneDetails;
    }

    @InputImport(name="zones")
    private final @Nullable List<String> zones;

    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public SkuLocationInfoResponse(
        @Nullable List<String> extendedLocations,
        String location,
        @Nullable String type,
        @Nullable List<SkuZoneDetailResponse> zoneDetails,
        @Nullable List<String> zones) {
        this.extendedLocations = extendedLocations;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.type = type;
        this.zoneDetails = zoneDetails;
        this.zones = zones;
    }

    private SkuLocationInfoResponse() {
        this.extendedLocations = List.of();
        this.location = null;
        this.type = null;
        this.zoneDetails = List.of();
        this.zones = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuLocationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> extendedLocations;
        private String location;
        private @Nullable String type;
        private @Nullable List<SkuZoneDetailResponse> zoneDetails;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuLocationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedLocations = defaults.extendedLocations;
    	      this.location = defaults.location;
    	      this.type = defaults.type;
    	      this.zoneDetails = defaults.zoneDetails;
    	      this.zones = defaults.zones;
        }

        public Builder setExtendedLocations(@Nullable List<String> extendedLocations) {
            this.extendedLocations = extendedLocations;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setZoneDetails(@Nullable List<SkuZoneDetailResponse> zoneDetails) {
            this.zoneDetails = zoneDetails;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }

        public SkuLocationInfoResponse build() {
            return new SkuLocationInfoResponse(extendedLocations, location, type, zoneDetails, zones);
        }
    }
}
