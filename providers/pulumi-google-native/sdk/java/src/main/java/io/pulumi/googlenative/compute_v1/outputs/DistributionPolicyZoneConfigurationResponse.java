// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DistributionPolicyZoneConfigurationResponse {
    /**
     * The URL of the zone. The zone must exist in the region where the managed instance group is located.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private DistributionPolicyZoneConfigurationResponse(@CustomType.Parameter("zone") String zone) {
        this.zone = zone;
    }

    /**
     * The URL of the zone. The zone must exist in the region where the managed instance group is located.
     * 
    */
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionPolicyZoneConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionPolicyZoneConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.zone = defaults.zone;
        }

        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public DistributionPolicyZoneConfigurationResponse build() {
            return new DistributionPolicyZoneConfigurationResponse(zone);
        }
    }
}
