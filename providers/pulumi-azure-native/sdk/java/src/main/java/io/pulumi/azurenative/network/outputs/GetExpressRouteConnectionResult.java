// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ExpressRouteCircuitPeeringIdResponse;
import io.pulumi.azurenative.network.outputs.RoutingConfigurationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExpressRouteConnectionResult {
    /**
     * Authorization key to establish the connection.
     * 
     */
    private final @Nullable String authorizationKey;
    /**
     * Enable internet security.
     * 
     */
    private final @Nullable Boolean enableInternetSecurity;
    /**
     * The ExpressRoute circuit peering.
     * 
     */
    private final ExpressRouteCircuitPeeringIdResponse expressRouteCircuitPeering;
    /**
     * Enable FastPath to vWan Firewall hub.
     * 
     */
    private final @Nullable Boolean expressRouteGatewayBypass;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The provisioning state of the express route connection resource.
     * 
     */
    private final String provisioningState;
    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    private final @Nullable RoutingConfigurationResponse routingConfiguration;
    /**
     * The routing weight associated to the connection.
     * 
     */
    private final @Nullable Integer routingWeight;

    @CustomType.Constructor
    private GetExpressRouteConnectionResult(
        @CustomType.Parameter("authorizationKey") @Nullable String authorizationKey,
        @CustomType.Parameter("enableInternetSecurity") @Nullable Boolean enableInternetSecurity,
        @CustomType.Parameter("expressRouteCircuitPeering") ExpressRouteCircuitPeeringIdResponse expressRouteCircuitPeering,
        @CustomType.Parameter("expressRouteGatewayBypass") @Nullable Boolean expressRouteGatewayBypass,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("routingConfiguration") @Nullable RoutingConfigurationResponse routingConfiguration,
        @CustomType.Parameter("routingWeight") @Nullable Integer routingWeight) {
        this.authorizationKey = authorizationKey;
        this.enableInternetSecurity = enableInternetSecurity;
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        this.expressRouteGatewayBypass = expressRouteGatewayBypass;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.routingConfiguration = routingConfiguration;
        this.routingWeight = routingWeight;
    }

    /**
     * Authorization key to establish the connection.
     * 
    */
    public Optional<String> getAuthorizationKey() {
        return Optional.ofNullable(this.authorizationKey);
    }
    /**
     * Enable internet security.
     * 
    */
    public Optional<Boolean> getEnableInternetSecurity() {
        return Optional.ofNullable(this.enableInternetSecurity);
    }
    /**
     * The ExpressRoute circuit peering.
     * 
    */
    public ExpressRouteCircuitPeeringIdResponse getExpressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }
    /**
     * Enable FastPath to vWan Firewall hub.
     * 
    */
    public Optional<Boolean> getExpressRouteGatewayBypass() {
        return Optional.ofNullable(this.expressRouteGatewayBypass);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state of the express route connection resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
    */
    public Optional<RoutingConfigurationResponse> getRoutingConfiguration() {
        return Optional.ofNullable(this.routingConfiguration);
    }
    /**
     * The routing weight associated to the connection.
     * 
    */
    public Optional<Integer> getRoutingWeight() {
        return Optional.ofNullable(this.routingWeight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExpressRouteConnectionResult defaults) {
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

        public Builder(GetExpressRouteConnectionResult defaults) {
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

        public Builder authorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }
        public Builder enableInternetSecurity(@Nullable Boolean enableInternetSecurity) {
            this.enableInternetSecurity = enableInternetSecurity;
            return this;
        }
        public Builder expressRouteCircuitPeering(ExpressRouteCircuitPeeringIdResponse expressRouteCircuitPeering) {
            this.expressRouteCircuitPeering = Objects.requireNonNull(expressRouteCircuitPeering);
            return this;
        }
        public Builder expressRouteGatewayBypass(@Nullable Boolean expressRouteGatewayBypass) {
            this.expressRouteGatewayBypass = expressRouteGatewayBypass;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder routingConfiguration(@Nullable RoutingConfigurationResponse routingConfiguration) {
            this.routingConfiguration = routingConfiguration;
            return this;
        }
        public Builder routingWeight(@Nullable Integer routingWeight) {
            this.routingWeight = routingWeight;
            return this;
        }        public GetExpressRouteConnectionResult build() {
            return new GetExpressRouteConnectionResult(authorizationKey, enableInternetSecurity, expressRouteCircuitPeering, expressRouteGatewayBypass, id, name, provisioningState, routingConfiguration, routingWeight);
        }
    }
}
