// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceLocationDataContractResponse {
    /**
     * The city or locality where the resource is located.
     * 
     */
    private final @Nullable String city;
    /**
     * The country or region where the resource is located.
     * 
     */
    private final @Nullable String countryOrRegion;
    /**
     * The district, state, or province where the resource is located.
     * 
     */
    private final @Nullable String district;
    /**
     * A canonical name for the geographic or physical location.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private ResourceLocationDataContractResponse(
        @CustomType.Parameter("city") @Nullable String city,
        @CustomType.Parameter("countryOrRegion") @Nullable String countryOrRegion,
        @CustomType.Parameter("district") @Nullable String district,
        @CustomType.Parameter("name") String name) {
        this.city = city;
        this.countryOrRegion = countryOrRegion;
        this.district = district;
        this.name = name;
    }

    /**
     * The city or locality where the resource is located.
     * 
    */
    public Optional<String> getCity() {
        return Optional.ofNullable(this.city);
    }
    /**
     * The country or region where the resource is located.
     * 
    */
    public Optional<String> getCountryOrRegion() {
        return Optional.ofNullable(this.countryOrRegion);
    }
    /**
     * The district, state, or province where the resource is located.
     * 
    */
    public Optional<String> getDistrict() {
        return Optional.ofNullable(this.district);
    }
    /**
     * A canonical name for the geographic or physical location.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceLocationDataContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String city;
        private @Nullable String countryOrRegion;
        private @Nullable String district;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceLocationDataContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.city = defaults.city;
    	      this.countryOrRegion = defaults.countryOrRegion;
    	      this.district = defaults.district;
    	      this.name = defaults.name;
        }

        public Builder city(@Nullable String city) {
            this.city = city;
            return this;
        }
        public Builder countryOrRegion(@Nullable String countryOrRegion) {
            this.countryOrRegion = countryOrRegion;
            return this;
        }
        public Builder district(@Nullable String district) {
            this.district = district;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ResourceLocationDataContractResponse build() {
            return new ResourceLocationDataContractResponse(city, countryOrRegion, district, name);
        }
    }
}
