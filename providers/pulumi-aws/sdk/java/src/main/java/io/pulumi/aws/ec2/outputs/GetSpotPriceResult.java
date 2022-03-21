// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetSpotPriceFilter;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSpotPriceResult {
    private final @Nullable String availabilityZone;
    private final @Nullable List<GetSpotPriceFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String instanceType;
    /**
     * The most recent Spot Price value for the given instance type and AZ.
     * 
     */
    private final String spotPrice;
    /**
     * The timestamp at which the Spot Price value was published.
     * 
     */
    private final String spotPriceTimestamp;

    @CustomType.Constructor
    private GetSpotPriceResult(
        @CustomType.Parameter("availabilityZone") @Nullable String availabilityZone,
        @CustomType.Parameter("filters") @Nullable List<GetSpotPriceFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceType") @Nullable String instanceType,
        @CustomType.Parameter("spotPrice") String spotPrice,
        @CustomType.Parameter("spotPriceTimestamp") String spotPriceTimestamp) {
        this.availabilityZone = availabilityZone;
        this.filters = filters;
        this.id = id;
        this.instanceType = instanceType;
        this.spotPrice = spotPrice;
        this.spotPriceTimestamp = spotPriceTimestamp;
    }

    public Optional<String> getAvailabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    public List<GetSpotPriceFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Optional<String> getInstanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * The most recent Spot Price value for the given instance type and AZ.
     * 
    */
    public String getSpotPrice() {
        return this.spotPrice;
    }
    /**
     * The timestamp at which the Spot Price value was published.
     * 
    */
    public String getSpotPriceTimestamp() {
        return this.spotPriceTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpotPriceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable List<GetSpotPriceFilter> filters;
        private String id;
        private @Nullable String instanceType;
        private String spotPrice;
        private String spotPriceTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpotPriceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.instanceType = defaults.instanceType;
    	      this.spotPrice = defaults.spotPrice;
    	      this.spotPriceTimestamp = defaults.spotPriceTimestamp;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder filters(@Nullable List<GetSpotPriceFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSpotPriceFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder spotPrice(String spotPrice) {
            this.spotPrice = Objects.requireNonNull(spotPrice);
            return this;
        }
        public Builder spotPriceTimestamp(String spotPriceTimestamp) {
            this.spotPriceTimestamp = Objects.requireNonNull(spotPriceTimestamp);
            return this;
        }        public GetSpotPriceResult build() {
            return new GetSpotPriceResult(availabilityZone, filters, id, instanceType, spotPrice, spotPriceTimestamp);
        }
    }
}
