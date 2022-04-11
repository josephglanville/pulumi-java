// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionRestrictionsGeoRestrictionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionRestrictionsGeoRestrictionArgs Empty = new DistributionRestrictionsGeoRestrictionArgs();

    /**
     * The [ISO 3166-1-alpha-2 codes][4] for which you
     * want CloudFront either to distribute your content (`whitelist`) or not
     * distribute your content (`blacklist`).
     * 
     */
    @Import(name="locations")
      private final @Nullable Output<List<String>> locations;

    public Output<List<String>> getLocations() {
        return this.locations == null ? Codegen.empty() : this.locations;
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

    public DistributionRestrictionsGeoRestrictionArgs(
        @Nullable Output<List<String>> locations,
        Output<String> restrictionType) {
        this.locations = locations;
        this.restrictionType = Objects.requireNonNull(restrictionType, "expected parameter 'restrictionType' to be non-null");
    }

    private DistributionRestrictionsGeoRestrictionArgs() {
        this.locations = Codegen.empty();
        this.restrictionType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionRestrictionsGeoRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> locations;
        private Output<String> restrictionType;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionRestrictionsGeoRestrictionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locations = defaults.locations;
    	      this.restrictionType = defaults.restrictionType;
        }

        public Builder locations(@Nullable Output<List<String>> locations) {
            this.locations = locations;
            return this;
        }
        public Builder locations(@Nullable List<String> locations) {
            this.locations = Codegen.ofNullable(locations);
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
        }        public DistributionRestrictionsGeoRestrictionArgs build() {
            return new DistributionRestrictionsGeoRestrictionArgs(locations, restrictionType);
        }
    }
}
