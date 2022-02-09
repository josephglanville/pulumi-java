// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.azurenative.devices.outputs.IotHubDefinitionDescriptionResponse;
import io.pulumi.azurenative.devices.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.devices.outputs.SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionResponse;
import io.pulumi.azurenative.devices.outputs.TargetIpFilterRuleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IotDpsPropertiesDescriptionResponse {
    private final @Nullable String allocationPolicy;
    private final @Nullable List<SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionResponse> authorizationPolicies;
    private final String deviceProvisioningHostName;
    private final String idScope;
    private final @Nullable List<IotHubDefinitionDescriptionResponse> iotHubs;
    private final @Nullable List<TargetIpFilterRuleResponse> ipFilterRules;
    private final @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    private final @Nullable String provisioningState;
    private final @Nullable String publicNetworkAccess;
    private final String serviceOperationsHostName;
    private final @Nullable String state;

    @OutputCustomType.Constructor({"allocationPolicy","authorizationPolicies","deviceProvisioningHostName","idScope","iotHubs","ipFilterRules","privateEndpointConnections","provisioningState","publicNetworkAccess","serviceOperationsHostName","state"})
    private IotDpsPropertiesDescriptionResponse(
        @Nullable String allocationPolicy,
        @Nullable List<SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionResponse> authorizationPolicies,
        String deviceProvisioningHostName,
        String idScope,
        @Nullable List<IotHubDefinitionDescriptionResponse> iotHubs,
        @Nullable List<TargetIpFilterRuleResponse> ipFilterRules,
        @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @Nullable String provisioningState,
        @Nullable String publicNetworkAccess,
        String serviceOperationsHostName,
        @Nullable String state) {
        this.allocationPolicy = allocationPolicy;
        this.authorizationPolicies = authorizationPolicies;
        this.deviceProvisioningHostName = Objects.requireNonNull(deviceProvisioningHostName);
        this.idScope = Objects.requireNonNull(idScope);
        this.iotHubs = iotHubs;
        this.ipFilterRules = ipFilterRules;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
        this.serviceOperationsHostName = Objects.requireNonNull(serviceOperationsHostName);
        this.state = state;
    }

    public Optional<String> getAllocationPolicy() {
        return Optional.ofNullable(this.allocationPolicy);
    }
    public List<SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionResponse> getAuthorizationPolicies() {
        return this.authorizationPolicies == null ? List.of() : this.authorizationPolicies;
    }
    public String getDeviceProvisioningHostName() {
        return this.deviceProvisioningHostName;
    }
    public String getIdScope() {
        return this.idScope;
    }
    public List<IotHubDefinitionDescriptionResponse> getIotHubs() {
        return this.iotHubs == null ? List.of() : this.iotHubs;
    }
    public List<TargetIpFilterRuleResponse> getIpFilterRules() {
        return this.ipFilterRules == null ? List.of() : this.ipFilterRules;
    }
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections == null ? List.of() : this.privateEndpointConnections;
    }
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    public String getServiceOperationsHostName() {
        return this.serviceOperationsHostName;
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotDpsPropertiesDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String allocationPolicy;
        private @Nullable List<SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionResponse> authorizationPolicies;
        private String deviceProvisioningHostName;
        private String idScope;
        private @Nullable List<IotHubDefinitionDescriptionResponse> iotHubs;
        private @Nullable List<TargetIpFilterRuleResponse> ipFilterRules;
        private @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private @Nullable String provisioningState;
        private @Nullable String publicNetworkAccess;
        private String serviceOperationsHostName;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(IotDpsPropertiesDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationPolicy = defaults.allocationPolicy;
    	      this.authorizationPolicies = defaults.authorizationPolicies;
    	      this.deviceProvisioningHostName = defaults.deviceProvisioningHostName;
    	      this.idScope = defaults.idScope;
    	      this.iotHubs = defaults.iotHubs;
    	      this.ipFilterRules = defaults.ipFilterRules;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.serviceOperationsHostName = defaults.serviceOperationsHostName;
    	      this.state = defaults.state;
        }

        public Builder setAllocationPolicy(@Nullable String allocationPolicy) {
            this.allocationPolicy = allocationPolicy;
            return this;
        }

        public Builder setAuthorizationPolicies(@Nullable List<SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionResponse> authorizationPolicies) {
            this.authorizationPolicies = authorizationPolicies;
            return this;
        }

        public Builder setDeviceProvisioningHostName(String deviceProvisioningHostName) {
            this.deviceProvisioningHostName = Objects.requireNonNull(deviceProvisioningHostName);
            return this;
        }

        public Builder setIdScope(String idScope) {
            this.idScope = Objects.requireNonNull(idScope);
            return this;
        }

        public Builder setIotHubs(@Nullable List<IotHubDefinitionDescriptionResponse> iotHubs) {
            this.iotHubs = iotHubs;
            return this;
        }

        public Builder setIpFilterRules(@Nullable List<TargetIpFilterRuleResponse> ipFilterRules) {
            this.ipFilterRules = ipFilterRules;
            return this;
        }

        public Builder setPrivateEndpointConnections(@Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setServiceOperationsHostName(String serviceOperationsHostName) {
            this.serviceOperationsHostName = Objects.requireNonNull(serviceOperationsHostName);
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public IotDpsPropertiesDescriptionResponse build() {
            return new IotDpsPropertiesDescriptionResponse(allocationPolicy, authorizationPolicies, deviceProvisioningHostName, idScope, iotHubs, ipFilterRules, privateEndpointConnections, provisioningState, publicNetworkAccess, serviceOperationsHostName, state);
        }
    }
}
