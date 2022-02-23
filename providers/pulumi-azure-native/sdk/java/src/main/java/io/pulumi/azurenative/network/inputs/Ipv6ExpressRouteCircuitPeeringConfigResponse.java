// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ExpressRouteCircuitPeeringConfigResponse;
import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains IPv6 peering config.
 * 
 */
public final class Ipv6ExpressRouteCircuitPeeringConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final Ipv6ExpressRouteCircuitPeeringConfigResponse Empty = new Ipv6ExpressRouteCircuitPeeringConfigResponse();

    /**
     * The Microsoft peering configuration.
     * 
     */
    @InputImport(name="microsoftPeeringConfig")
      private final @Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig;

    public Optional<ExpressRouteCircuitPeeringConfigResponse> getMicrosoftPeeringConfig() {
        return this.microsoftPeeringConfig == null ? Optional.empty() : Optional.ofNullable(this.microsoftPeeringConfig);
    }

    /**
     * The primary address prefix.
     * 
     */
    @InputImport(name="primaryPeerAddressPrefix")
      private final @Nullable String primaryPeerAddressPrefix;

    public Optional<String> getPrimaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix == null ? Optional.empty() : Optional.ofNullable(this.primaryPeerAddressPrefix);
    }

    /**
     * The reference to the RouteFilter resource.
     * 
     */
    @InputImport(name="routeFilter")
      private final @Nullable SubResourceResponse routeFilter;

    public Optional<SubResourceResponse> getRouteFilter() {
        return this.routeFilter == null ? Optional.empty() : Optional.ofNullable(this.routeFilter);
    }

    /**
     * The secondary address prefix.
     * 
     */
    @InputImport(name="secondaryPeerAddressPrefix")
      private final @Nullable String secondaryPeerAddressPrefix;

    public Optional<String> getSecondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix == null ? Optional.empty() : Optional.ofNullable(this.secondaryPeerAddressPrefix);
    }

    /**
     * The state of peering.
     * 
     */
    @InputImport(name="state")
      private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public Ipv6ExpressRouteCircuitPeeringConfigResponse(
        @Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig,
        @Nullable String primaryPeerAddressPrefix,
        @Nullable SubResourceResponse routeFilter,
        @Nullable String secondaryPeerAddressPrefix,
        @Nullable String state) {
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        this.routeFilter = routeFilter;
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        this.state = state;
    }

    private Ipv6ExpressRouteCircuitPeeringConfigResponse() {
        this.microsoftPeeringConfig = null;
        this.primaryPeerAddressPrefix = null;
        this.routeFilter = null;
        this.secondaryPeerAddressPrefix = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Ipv6ExpressRouteCircuitPeeringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig;
        private @Nullable String primaryPeerAddressPrefix;
        private @Nullable SubResourceResponse routeFilter;
        private @Nullable String secondaryPeerAddressPrefix;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(Ipv6ExpressRouteCircuitPeeringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.microsoftPeeringConfig = defaults.microsoftPeeringConfig;
    	      this.primaryPeerAddressPrefix = defaults.primaryPeerAddressPrefix;
    	      this.routeFilter = defaults.routeFilter;
    	      this.secondaryPeerAddressPrefix = defaults.secondaryPeerAddressPrefix;
    	      this.state = defaults.state;
        }

        public Builder setMicrosoftPeeringConfig(@Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig) {
            this.microsoftPeeringConfig = microsoftPeeringConfig;
            return this;
        }

        public Builder setPrimaryPeerAddressPrefix(@Nullable String primaryPeerAddressPrefix) {
            this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
            return this;
        }

        public Builder setRouteFilter(@Nullable SubResourceResponse routeFilter) {
            this.routeFilter = routeFilter;
            return this;
        }

        public Builder setSecondaryPeerAddressPrefix(@Nullable String secondaryPeerAddressPrefix) {
            this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Ipv6ExpressRouteCircuitPeeringConfigResponse build() {
            return new Ipv6ExpressRouteCircuitPeeringConfigResponse(microsoftPeeringConfig, primaryPeerAddressPrefix, routeFilter, secondaryPeerAddressPrefix, state);
        }
    }
}
