// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Resource location data properties.
 * 
 */
public final class ResourceLocationDataContractArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceLocationDataContractArgs Empty = new ResourceLocationDataContractArgs();

    /**
     * The city or locality where the resource is located.
     * 
     */
    @InputImport(name="city")
      private final @Nullable Output<String> city;

    public Output<String> getCity() {
        return this.city == null ? Output.empty() : this.city;
    }

    /**
     * The country or region where the resource is located.
     * 
     */
    @InputImport(name="countryOrRegion")
      private final @Nullable Output<String> countryOrRegion;

    public Output<String> getCountryOrRegion() {
        return this.countryOrRegion == null ? Output.empty() : this.countryOrRegion;
    }

    /**
     * The district, state, or province where the resource is located.
     * 
     */
    @InputImport(name="district")
      private final @Nullable Output<String> district;

    public Output<String> getDistrict() {
        return this.district == null ? Output.empty() : this.district;
    }

    /**
     * A canonical name for the geographic or physical location.
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public ResourceLocationDataContractArgs(
        @Nullable Output<String> city,
        @Nullable Output<String> countryOrRegion,
        @Nullable Output<String> district,
        Output<String> name) {
        this.city = city;
        this.countryOrRegion = countryOrRegion;
        this.district = district;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ResourceLocationDataContractArgs() {
        this.city = Output.empty();
        this.countryOrRegion = Output.empty();
        this.district = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceLocationDataContractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> city;
        private @Nullable Output<String> countryOrRegion;
        private @Nullable Output<String> district;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceLocationDataContractArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.city = defaults.city;
    	      this.countryOrRegion = defaults.countryOrRegion;
    	      this.district = defaults.district;
    	      this.name = defaults.name;
        }

        public Builder city(@Nullable Output<String> city) {
            this.city = city;
            return this;
        }

        public Builder city(@Nullable String city) {
            this.city = Output.ofNullable(city);
            return this;
        }

        public Builder countryOrRegion(@Nullable Output<String> countryOrRegion) {
            this.countryOrRegion = countryOrRegion;
            return this;
        }

        public Builder countryOrRegion(@Nullable String countryOrRegion) {
            this.countryOrRegion = Output.ofNullable(countryOrRegion);
            return this;
        }

        public Builder district(@Nullable Output<String> district) {
            this.district = district;
            return this;
        }

        public Builder district(@Nullable String district) {
            this.district = Output.ofNullable(district);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public ResourceLocationDataContractArgs build() {
            return new ResourceLocationDataContractArgs(city, countryOrRegion, district, name);
        }
    }
}
