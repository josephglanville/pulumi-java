// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inputs;

import io.pulumi.aws.inputs.GetAvailabilityZoneFilter;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAvailabilityZoneArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAvailabilityZoneArgs Empty = new GetAvailabilityZoneArgs();

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
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetAvailabilityZoneFilter> filters;

    public List<GetAvailabilityZoneFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * The name of the filter field. Valid values can be found in the [EC2 DescribeAvailabilityZones API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html).
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * A specific availability zone state to require. May be any of `"available"`, `"information"` or `"impaired"`.
     * 
     */
    @Import(name="state")
      private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    /**
     * The zone ID of the availability zone to select.
     * 
     */
    @Import(name="zoneId")
      private final @Nullable String zoneId;

    public Optional<String> getZoneId() {
        return this.zoneId == null ? Optional.empty() : Optional.ofNullable(this.zoneId);
    }

    public GetAvailabilityZoneArgs(
        @Nullable Boolean allAvailabilityZones,
        @Nullable List<GetAvailabilityZoneFilter> filters,
        @Nullable String name,
        @Nullable String state,
        @Nullable String zoneId) {
        this.allAvailabilityZones = allAvailabilityZones;
        this.filters = filters;
        this.name = name;
        this.state = state;
        this.zoneId = zoneId;
    }

    private GetAvailabilityZoneArgs() {
        this.allAvailabilityZones = null;
        this.filters = List.of();
        this.name = null;
        this.state = null;
        this.zoneId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAvailabilityZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allAvailabilityZones;
        private @Nullable List<GetAvailabilityZoneFilter> filters;
        private @Nullable String name;
        private @Nullable String state;
        private @Nullable String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAvailabilityZoneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allAvailabilityZones = defaults.allAvailabilityZones;
    	      this.filters = defaults.filters;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder allAvailabilityZones(@Nullable Boolean allAvailabilityZones) {
            this.allAvailabilityZones = allAvailabilityZones;
            return this;
        }
        public Builder filters(@Nullable List<GetAvailabilityZoneFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetAvailabilityZoneFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = zoneId;
            return this;
        }        public GetAvailabilityZoneArgs build() {
            return new GetAvailabilityZoneArgs(allAvailabilityZones, filters, name, state, zoneId);
        }
    }
}
