// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionGeoRestrictionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class DistributionRestrictionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionRestrictionsArgs Empty = new DistributionRestrictionsArgs();

    @InputImport(name="geoRestriction", required=true)
      private final Output<DistributionGeoRestrictionArgs> geoRestriction;

    public Output<DistributionGeoRestrictionArgs> getGeoRestriction() {
        return this.geoRestriction;
    }

    public DistributionRestrictionsArgs(Output<DistributionGeoRestrictionArgs> geoRestriction) {
        this.geoRestriction = Objects.requireNonNull(geoRestriction, "expected parameter 'geoRestriction' to be non-null");
    }

    private DistributionRestrictionsArgs() {
        this.geoRestriction = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionRestrictionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DistributionGeoRestrictionArgs> geoRestriction;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionRestrictionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.geoRestriction = defaults.geoRestriction;
        }

        public Builder geoRestriction(Output<DistributionGeoRestrictionArgs> geoRestriction) {
            this.geoRestriction = Objects.requireNonNull(geoRestriction);
            return this;
        }

        public Builder geoRestriction(DistributionGeoRestrictionArgs geoRestriction) {
            this.geoRestriction = Output.of(Objects.requireNonNull(geoRestriction));
            return this;
        }
        public DistributionRestrictionsArgs build() {
            return new DistributionRestrictionsArgs(geoRestriction);
        }
    }
}
