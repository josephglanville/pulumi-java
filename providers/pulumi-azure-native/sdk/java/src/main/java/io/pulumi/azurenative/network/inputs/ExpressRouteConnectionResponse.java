// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ExpressRouteCircuitPeeringIdResponse;
import io.pulumi.azurenative.network.inputs.RoutingConfigurationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ExpressRouteConnection resource.
 * 
 */
public final class ExpressRouteConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExpressRouteConnectionResponse Empty = new ExpressRouteConnectionResponse();

    /**
     * Authorization key to establish the connection.
     * 
     */
    @InputImport(name="authorizationKey")
      private final @Nullable String authorizationKey;

    public Optional<String> getAuthorizationKey() {
        return this.authorizationKey == null ? Optional.empty() : Optional.ofNullable(this.authorizationKey);
    }

    /**
     * Enable internet security.
     * 
     */
    @InputImport(name="enableInternetSecurity")
      private final @Nullable Boolean enableInternetSecurity;

    public Optional<Boolean> getEnableInternetSecurity() {
        return this.enableInternetSecurity == null ? Optional.empty() : Optional.ofNullable(this.enableInternetSecurity);
    }

    /**
     * The ExpressRoute circuit peering.
     * 
     */
    @InputImport(name="expressRouteCircuitPeering", required=true)
      private final ExpressRouteCircuitPeeringIdResponse expressRouteCircuitPeering;

    public ExpressRouteCircuitPeeringIdResponse getExpressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }

    /**
     * Enable FastPath to vWan Firewall hub.
     * 
     */
    @InputImport(name="expressRouteGatewayBypass")
      private final @Nullable Boolean expressRouteGatewayBypass;

    public Optional<Boolean> getExpressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass == null ? Optional.empty() : Optional.ofNullable(this.expressRouteGatewayBypass);
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The provisioning state of the express route connection resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    @InputImport(name="routingConfiguration")
      private final @Nullable RoutingConfigurationResponse routingConfiguration;

    public Optional<RoutingConfigurationResponse> getRoutingConfiguration() {
        return this.routingConfiguration == null ? Optional.empty() : Optional.ofNullable(this.routingConfiguration);
    }

    /**
     * The routing weight associated to the connection.
     * 
     */
    @InputImport(name="routingWeight")
      private final @Nullable Integer routingWeight;

    public Optional<Integer> getRoutingWeight() {
        return this.routingWeight == null ? Optional.empty() : Optional.ofNullable(this.routingWeight);
    }

    public ExpressRouteConnectionResponse(
        @Nullable String authorizationKey,
        @Nullable Boolean enableInternetSecurity,
        ExpressRouteCircuitPeeringIdResponse expressRouteCircuitPeering,
        @Nullable Boolean expressRouteGatewayBypass,
        @Nullable String id,
        String name,
        String provisioningState,
        @Nullable RoutingConfigurationResponse routingConfiguration,
        @Nullable Integer routingWeight) {
        this.authorizationKey = authorizationKey;
        this.enableInternetSecurity = enableInternetSecurity;
        this.expressRouteCircuitPeering = Objects.requireNonNull(expressRouteCircuitPeering, "expected parameter 'expressRouteCircuitPeering' to be non-null");
        this.expressRouteGatewayBypass = expressRouteGatewayBypass;
        this.id = id;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.routingConfiguration = routingConfiguration;
        this.routingWeight = routingWeight;
    }

    private ExpressRouteConnectionResponse() {
        this.authorizationKey = null;
        this.enableInternetSecurity = null;
        this.expressRouteCircuitPeering = null;
        this.expressRouteGatewayBypass = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.routingConfiguration = null;
        this.routingWeight = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorizationKey;
        private @Nullable Boolean enableInternetSecurity;
        private ExpressRouteCircuitPeeringIdResponse expressRouteCircuitPeering;
        private @Nullable Boolean expressRouteGatewayBypass;
        private @Nullable String id;
        private String name;
        private String provisioningState;
        private @Nullable RoutingConfigurationResponse routingConfiguration;
        private @Nullable Integer routingWeight;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.enableInternetSecurity = defaults.enableInternetSecurity;
    	      this.expressRouteCircuitPeering = defaults.expressRouteCircuitPeering;
    	      this.expressRouteGatewayBypass = defaults.expressRouteGatewayBypass;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routingConfiguration = defaults.routingConfiguration;
    	      this.routingWeight = defaults.routingWeight;
        }

        public Builder setAuthorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }

        public Builder setEnableInternetSecurity(@Nullable Boolean enableInternetSecurity) {
            this.enableInternetSecurity = enableInternetSecurity;
            return this;
        }

        public Builder setExpressRouteCircuitPeering(ExpressRouteCircuitPeeringIdResponse expressRouteCircuitPeering) {
            this.expressRouteCircuitPeering = Objects.requireNonNull(expressRouteCircuitPeering);
            return this;
        }

        public Builder setExpressRouteGatewayBypass(@Nullable Boolean expressRouteGatewayBypass) {
            this.expressRouteGatewayBypass = expressRouteGatewayBypass;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRoutingConfiguration(@Nullable RoutingConfigurationResponse routingConfiguration) {
            this.routingConfiguration = routingConfiguration;
            return this;
        }

        public Builder setRoutingWeight(@Nullable Integer routingWeight) {
            this.routingWeight = routingWeight;
            return this;
        }
        public ExpressRouteConnectionResponse build() {
            return new ExpressRouteConnectionResponse(authorizationKey, enableInternetSecurity, expressRouteCircuitPeering, expressRouteGatewayBypass, id, name, provisioningState, routingConfiguration, routingWeight);
        }
    }
}
