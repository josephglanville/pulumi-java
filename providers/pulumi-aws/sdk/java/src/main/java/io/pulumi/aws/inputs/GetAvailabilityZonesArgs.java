// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inputs;

import io.pulumi.aws.inputs.GetAvailabilityZonesFilter;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAvailabilityZonesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAvailabilityZonesArgs Empty = new GetAvailabilityZonesArgs();

    /**
     * Set to `true` to include all Availability Zones and Local Zones regardless of your opt in status.
     * 
     */
    @Import(name="allAvailabilityZones")
      private final @Nullable Boolean allAvailabilityZones;

    public Optional<Boolean> getAllAvailabilityZones() {
        return this.allAvailabilityZones == null ? Optional.empty() : Optional.ofNullable(this.allAvailabilityZones);
    }

    /**
     * List of Availability Zone names to exclude.
     * 
     */
    @Import(name="excludeNames")
      private final @Nullable List<String> excludeNames;

    public List<String> getExcludeNames() {
        return this.excludeNames == null ? List.of() : this.excludeNames;
    }

    /**
     * List of Availability Zone IDs to exclude.
     * 
     */
    @Import(name="excludeZoneIds")
      private final @Nullable List<String> excludeZoneIds;

    public List<String> getExcludeZoneIds() {
        return this.excludeZoneIds == null ? List.of() : this.excludeZoneIds;
    }

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetAvailabilityZonesFilter> filters;

    public List<GetAvailabilityZonesFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * Allows to filter list of Availability Zones based on their
     * current state. Can be either `"available"`, `"information"`, `"impaired"` or
     * `"unavailable"`. By default the list includes a complete set of Availability Zones
     * to which the underlying AWS account has access, regardless of their state.
     * 
     */
    @Import(name="state")
      private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public GetAvailabilityZonesArgs(
        @Nullable Boolean allAvailabilityZones,
        @Nullable List<String> excludeNames,
        @Nullable List<String> excludeZoneIds,
        @Nullable List<GetAvailabilityZonesFilter> filters,
        @Nullable String state) {
        this.allAvailabilityZones = allAvailabilityZones;
        this.excludeNames = excludeNames;
        this.excludeZoneIds = excludeZoneIds;
        this.filters = filters;
        this.state = state;
    }

    private GetAvailabilityZonesArgs() {
        this.allAvailabilityZones = null;
        this.excludeNames = List.of();
        this.excludeZoneIds = List.of();
        this.filters = List.of();
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAvailabilityZonesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allAvailabilityZones;
        private @Nullable List<String> excludeNames;
        private @Nullable List<String> excludeZoneIds;
        private @Nullable List<GetAvailabilityZonesFilter> filters;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAvailabilityZonesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allAvailabilityZones = defaults.allAvailabilityZones;
    	      this.excludeNames = defaults.excludeNames;
    	      this.excludeZoneIds = defaults.excludeZoneIds;
    	      this.filters = defaults.filters;
    	      this.state = defaults.state;
        }

        public Builder allAvailabilityZones(@Nullable Boolean allAvailabilityZones) {
            this.allAvailabilityZones = allAvailabilityZones;
            return this;
        }
        public Builder excludeNames(@Nullable List<String> excludeNames) {
            this.excludeNames = excludeNames;
            return this;
        }
        public Builder excludeNames(String... excludeNames) {
            return excludeNames(List.of(excludeNames));
        }
        public Builder excludeZoneIds(@Nullable List<String> excludeZoneIds) {
            this.excludeZoneIds = excludeZoneIds;
            return this;
        }
        public Builder excludeZoneIds(String... excludeZoneIds) {
            return excludeZoneIds(List.of(excludeZoneIds));
        }
        public Builder filters(@Nullable List<GetAvailabilityZonesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetAvailabilityZonesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public GetAvailabilityZonesArgs build() {
            return new GetAvailabilityZonesArgs(allAvailabilityZones, excludeNames, excludeZoneIds, filters, state);
        }
    }
}
