// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionRestrictionsGeoRestrictionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionRestrictionsGeoRestrictionGetArgs Empty = new DistributionRestrictionsGeoRestrictionGetArgs();

    /**
     * The [ISO 3166-1-alpha-2 codes][4] for which you
     * want CloudFront either to distribute your content (`whitelist`) or not
     * distribute your content (`blacklist`).
     * 
     */
    @Import(name="locations")
      private final @Nullable Output<List<String>> locations;

    public Output<List<String>> getLocations() {
        return this.locations == null ? Output.empty() : this.locations;
    }

    /**
     * The method that you want to use to restrict
     * distribution of your content by country: `none`, `whitelist`, or
     * `blacklist`.
     * 
     */
    @Import(name="restrictionType", required=true)
      private final Output<String> restrictionType;

    public Output<String> getRestrictionType() {
        return this.restrictionType;
    }

    public DistributionRestrictionsGeoRestrictionGetArgs(
        @Nullable Output<List<String>> locations,
        Output<String> restrictionType) {
        this.locations = locations;
        this.restrictionType = Objects.requireNonNull(restrictionType, "expected parameter 'restrictionType' to be non-null");
    }

    private DistributionRestrictionsGeoRestrictionGetArgs() {
        this.locations = Output.empty();
        this.restrictionType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionRestrictionsGeoRestrictionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> locations;
        private Output<String> restrictionType;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionRestrictionsGeoRestrictionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locations = defaults.locations;
    	      this.restrictionType = defaults.restrictionType;
        }

        public Builder locations(@Nullable Output<List<String>> locations) {
            this.locations = locations;
            return this;
        }
        public Builder locations(@Nullable List<String> locations) {
            this.locations = Output.ofNullable(locations);
            return this;
        }
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }
        public Builder restrictionType(Output<String> restrictionType) {
            this.restrictionType = Objects.requireNonNull(restrictionType);
            return this;
        }
        public Builder restrictionType(String restrictionType) {
            this.restrictionType = Output.of(Objects.requireNonNull(restrictionType));
            return this;
        }        public DistributionRestrictionsGeoRestrictionGetArgs build() {
            return new DistributionRestrictionsGeoRestrictionGetArgs(locations, restrictionType);
        }
    }
}
