// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceLocationDataContractResponse {
    private final @Nullable String city;
    private final @Nullable String countryOrRegion;
    private final @Nullable String district;
    private final String name;

    @OutputCustomType.Constructor({"city","countryOrRegion","district","name"})
    private ResourceLocationDataContractResponse(
        @Nullable String city,
        @Nullable String countryOrRegion,
        @Nullable String district,
        String name) {
        this.city = city;
        this.countryOrRegion = countryOrRegion;
        this.district = district;
        this.name = Objects.requireNonNull(name);
    }

    public Optional<String> getCity() {
        return Optional.ofNullable(this.city);
    }
    public Optional<String> getCountryOrRegion() {
        return Optional.ofNullable(this.countryOrRegion);
    }
    public Optional<String> getDistrict() {
        return Optional.ofNullable(this.district);
    }
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

        public Builder setCity(@Nullable String city) {
            this.city = city;
            return this;
        }

        public Builder setCountryOrRegion(@Nullable String countryOrRegion) {
            this.countryOrRegion = countryOrRegion;
            return this;
        }

        public Builder setDistrict(@Nullable String district) {
            this.district = district;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public ResourceLocationDataContractResponse build() {
            return new ResourceLocationDataContractResponse(city, countryOrRegion, district, name);
        }
    }
}
