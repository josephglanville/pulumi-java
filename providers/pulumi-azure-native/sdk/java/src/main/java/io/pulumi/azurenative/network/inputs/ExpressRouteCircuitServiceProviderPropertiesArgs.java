// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains ServiceProviderProperties in an ExpressRouteCircuit.
 * 
 */
public final class ExpressRouteCircuitServiceProviderPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCircuitServiceProviderPropertiesArgs Empty = new ExpressRouteCircuitServiceProviderPropertiesArgs();

    /**
     * The BandwidthInMbps.
     * 
     */
    @Import(name="bandwidthInMbps")
      private final @Nullable Output<Integer> bandwidthInMbps;

    public Output<Integer> getBandwidthInMbps() {
        return this.bandwidthInMbps == null ? Output.empty() : this.bandwidthInMbps;
    }

    /**
     * The peering location.
     * 
     */
    @Import(name="peeringLocation")
      private final @Nullable Output<String> peeringLocation;

    public Output<String> getPeeringLocation() {
        return this.peeringLocation == null ? Output.empty() : this.peeringLocation;
    }

    /**
     * The serviceProviderName.
     * 
     */
    @Import(name="serviceProviderName")
      private final @Nullable Output<String> serviceProviderName;

    public Output<String> getServiceProviderName() {
        return this.serviceProviderName == null ? Output.empty() : this.serviceProviderName;
    }

    public ExpressRouteCircuitServiceProviderPropertiesArgs(
        @Nullable Output<Integer> bandwidthInMbps,
        @Nullable Output<String> peeringLocation,
        @Nullable Output<String> serviceProviderName) {
        this.bandwidthInMbps = bandwidthInMbps;
        this.peeringLocation = peeringLocation;
        this.serviceProviderName = serviceProviderName;
    }

    private ExpressRouteCircuitServiceProviderPropertiesArgs() {
        this.bandwidthInMbps = Output.empty();
        this.peeringLocation = Output.empty();
        this.serviceProviderName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitServiceProviderPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> bandwidthInMbps;
        private @Nullable Output<String> peeringLocation;
        private @Nullable Output<String> serviceProviderName;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitServiceProviderPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthInMbps = defaults.bandwidthInMbps;
    	      this.peeringLocation = defaults.peeringLocation;
    	      this.serviceProviderName = defaults.serviceProviderName;
        }

        public Builder bandwidthInMbps(@Nullable Output<Integer> bandwidthInMbps) {
            this.bandwidthInMbps = bandwidthInMbps;
            return this;
        }
        public Builder bandwidthInMbps(@Nullable Integer bandwidthInMbps) {
            this.bandwidthInMbps = Output.ofNullable(bandwidthInMbps);
            return this;
        }
        public Builder peeringLocation(@Nullable Output<String> peeringLocation) {
            this.peeringLocation = peeringLocation;
            return this;
        }
        public Builder peeringLocation(@Nullable String peeringLocation) {
            this.peeringLocation = Output.ofNullable(peeringLocation);
            return this;
        }
        public Builder serviceProviderName(@Nullable Output<String> serviceProviderName) {
            this.serviceProviderName = serviceProviderName;
            return this;
        }
        public Builder serviceProviderName(@Nullable String serviceProviderName) {
            this.serviceProviderName = Output.ofNullable(serviceProviderName);
            return this;
        }        public ExpressRouteCircuitServiceProviderPropertiesArgs build() {
            return new ExpressRouteCircuitServiceProviderPropertiesArgs(bandwidthInMbps, peeringLocation, serviceProviderName);
        }
    }
}
