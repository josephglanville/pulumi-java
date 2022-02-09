// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceDnsSettingsResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceIPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceTapConfigurationResponse;
import io.pulumi.azurenative.network.outputs.NetworkSecurityGroupResponse;
import io.pulumi.azurenative.network.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.network.outputs.PrivateLinkServiceResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNetworkInterfaceResult {
    private final @Nullable NetworkInterfaceDnsSettingsResponse dnsSettings;
    private final SubResourceResponse dscpConfiguration;
    private final @Nullable Boolean enableAcceleratedNetworking;
    private final @Nullable Boolean enableIPForwarding;
    private final String etag;
    private final @Nullable ExtendedLocationResponse extendedLocation;
    private final List<String> hostedWorkloads;
    private final @Nullable String id;
    private final @Nullable List<NetworkInterfaceIPConfigurationResponse> ipConfigurations;
    private final @Nullable String location;
    private final String macAddress;
    private final @Nullable String migrationPhase;
    private final String name;
    private final @Nullable NetworkSecurityGroupResponse networkSecurityGroup;
    private final @Nullable String nicType;
    private final Boolean primary;
    private final PrivateEndpointResponse privateEndpoint;
    private final @Nullable PrivateLinkServiceResponse privateLinkService;
    private final String provisioningState;
    private final String resourceGuid;
    private final @Nullable Map<String,String> tags;
    private final List<NetworkInterfaceTapConfigurationResponse> tapConfigurations;
    private final String type;
    private final SubResourceResponse virtualMachine;

    @OutputCustomType.Constructor({"dnsSettings","dscpConfiguration","enableAcceleratedNetworking","enableIPForwarding","etag","extendedLocation","hostedWorkloads","id","ipConfigurations","location","macAddress","migrationPhase","name","networkSecurityGroup","nicType","primary","privateEndpoint","privateLinkService","provisioningState","resourceGuid","tags","tapConfigurations","type","virtualMachine"})
    private GetNetworkInterfaceResult(
        @Nullable NetworkInterfaceDnsSettingsResponse dnsSettings,
        SubResourceResponse dscpConfiguration,
        @Nullable Boolean enableAcceleratedNetworking,
        @Nullable Boolean enableIPForwarding,
        String etag,
        @Nullable ExtendedLocationResponse extendedLocation,
        List<String> hostedWorkloads,
        @Nullable String id,
        @Nullable List<NetworkInterfaceIPConfigurationResponse> ipConfigurations,
        @Nullable String location,
        String macAddress,
        @Nullable String migrationPhase,
        String name,
        @Nullable NetworkSecurityGroupResponse networkSecurityGroup,
        @Nullable String nicType,
        Boolean primary,
        PrivateEndpointResponse privateEndpoint,
        @Nullable PrivateLinkServiceResponse privateLinkService,
        String provisioningState,
        String resourceGuid,
        @Nullable Map<String,String> tags,
        List<NetworkInterfaceTapConfigurationResponse> tapConfigurations,
        String type,
        SubResourceResponse virtualMachine) {
        this.dnsSettings = dnsSettings;
        this.dscpConfiguration = Objects.requireNonNull(dscpConfiguration);
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        this.enableIPForwarding = enableIPForwarding;
        this.etag = Objects.requireNonNull(etag);
        this.extendedLocation = extendedLocation;
        this.hostedWorkloads = Objects.requireNonNull(hostedWorkloads);
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.location = location;
        this.macAddress = Objects.requireNonNull(macAddress);
        this.migrationPhase = migrationPhase;
        this.name = Objects.requireNonNull(name);
        this.networkSecurityGroup = networkSecurityGroup;
        this.nicType = nicType;
        this.primary = Objects.requireNonNull(primary);
        this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
        this.privateLinkService = privateLinkService;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceGuid = Objects.requireNonNull(resourceGuid);
        this.tags = tags;
        this.tapConfigurations = Objects.requireNonNull(tapConfigurations);
        this.type = Objects.requireNonNull(type);
        this.virtualMachine = Objects.requireNonNull(virtualMachine);
    }

    public Optional<NetworkInterfaceDnsSettingsResponse> getDnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }
    public SubResourceResponse getDscpConfiguration() {
        return this.dscpConfiguration;
    }
    public Optional<Boolean> getEnableAcceleratedNetworking() {
        return Optional.ofNullable(this.enableAcceleratedNetworking);
    }
    public Optional<Boolean> getEnableIPForwarding() {
        return Optional.ofNullable(this.enableIPForwarding);
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    public List<String> getHostedWorkloads() {
        return this.hostedWorkloads;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public List<NetworkInterfaceIPConfigurationResponse> getIpConfigurations() {
        return this.ipConfigurations == null ? List.of() : this.ipConfigurations;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getMacAddress() {
        return this.macAddress;
    }
    public Optional<String> getMigrationPhase() {
        return Optional.ofNullable(this.migrationPhase);
    }
    public String getName() {
        return this.name;
    }
    public Optional<NetworkSecurityGroupResponse> getNetworkSecurityGroup() {
        return Optional.ofNullable(this.networkSecurityGroup);
    }
    public Optional<String> getNicType() {
        return Optional.ofNullable(this.nicType);
    }
    public Boolean getPrimary() {
        return this.primary;
    }
    public PrivateEndpointResponse getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    public Optional<PrivateLinkServiceResponse> getPrivateLinkService() {
        return Optional.ofNullable(this.privateLinkService);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public List<NetworkInterfaceTapConfigurationResponse> getTapConfigurations() {
        return this.tapConfigurations;
    }
    public String getType() {
        return this.type;
    }
    public SubResourceResponse getVirtualMachine() {
        return this.virtualMachine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInterfaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NetworkInterfaceDnsSettingsResponse dnsSettings;
        private SubResourceResponse dscpConfiguration;
        private @Nullable Boolean enableAcceleratedNetworking;
        private @Nullable Boolean enableIPForwarding;
        private String etag;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private List<String> hostedWorkloads;
        private @Nullable String id;
        private @Nullable List<NetworkInterfaceIPConfigurationResponse> ipConfigurations;
        private @Nullable String location;
        private String macAddress;
        private @Nullable String migrationPhase;
        private String name;
        private @Nullable NetworkSecurityGroupResponse networkSecurityGroup;
        private @Nullable String nicType;
        private Boolean primary;
        private PrivateEndpointResponse privateEndpoint;
        private @Nullable PrivateLinkServiceResponse privateLinkService;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable Map<String,String> tags;
        private List<NetworkInterfaceTapConfigurationResponse> tapConfigurations;
        private String type;
        private SubResourceResponse virtualMachine;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInterfaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.dscpConfiguration = defaults.dscpConfiguration;
    	      this.enableAcceleratedNetworking = defaults.enableAcceleratedNetworking;
    	      this.enableIPForwarding = defaults.enableIPForwarding;
    	      this.etag = defaults.etag;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.hostedWorkloads = defaults.hostedWorkloads;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.location = defaults.location;
    	      this.macAddress = defaults.macAddress;
    	      this.migrationPhase = defaults.migrationPhase;
    	      this.name = defaults.name;
    	      this.networkSecurityGroup = defaults.networkSecurityGroup;
    	      this.nicType = defaults.nicType;
    	      this.primary = defaults.primary;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkService = defaults.privateLinkService;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.tags = defaults.tags;
    	      this.tapConfigurations = defaults.tapConfigurations;
    	      this.type = defaults.type;
    	      this.virtualMachine = defaults.virtualMachine;
        }

        public Builder setDnsSettings(@Nullable NetworkInterfaceDnsSettingsResponse dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }

        public Builder setDscpConfiguration(SubResourceResponse dscpConfiguration) {
            this.dscpConfiguration = Objects.requireNonNull(dscpConfiguration);
            return this;
        }

        public Builder setEnableAcceleratedNetworking(@Nullable Boolean enableAcceleratedNetworking) {
            this.enableAcceleratedNetworking = enableAcceleratedNetworking;
            return this;
        }

        public Builder setEnableIPForwarding(@Nullable Boolean enableIPForwarding) {
            this.enableIPForwarding = enableIPForwarding;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setHostedWorkloads(List<String> hostedWorkloads) {
            this.hostedWorkloads = Objects.requireNonNull(hostedWorkloads);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIpConfigurations(@Nullable List<NetworkInterfaceIPConfigurationResponse> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMacAddress(String macAddress) {
            this.macAddress = Objects.requireNonNull(macAddress);
            return this;
        }

        public Builder setMigrationPhase(@Nullable String migrationPhase) {
            this.migrationPhase = migrationPhase;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkSecurityGroup(@Nullable NetworkSecurityGroupResponse networkSecurityGroup) {
            this.networkSecurityGroup = networkSecurityGroup;
            return this;
        }

        public Builder setNicType(@Nullable String nicType) {
            this.nicType = nicType;
            return this;
        }

        public Builder setPrimary(Boolean primary) {
            this.primary = Objects.requireNonNull(primary);
            return this;
        }

        public Builder setPrivateEndpoint(PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
            return this;
        }

        public Builder setPrivateLinkService(@Nullable PrivateLinkServiceResponse privateLinkService) {
            this.privateLinkService = privateLinkService;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTapConfigurations(List<NetworkInterfaceTapConfigurationResponse> tapConfigurations) {
            this.tapConfigurations = Objects.requireNonNull(tapConfigurations);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualMachine(SubResourceResponse virtualMachine) {
            this.virtualMachine = Objects.requireNonNull(virtualMachine);
            return this;
        }

        public GetNetworkInterfaceResult build() {
            return new GetNetworkInterfaceResult(dnsSettings, dscpConfiguration, enableAcceleratedNetworking, enableIPForwarding, etag, extendedLocation, hostedWorkloads, id, ipConfigurations, location, macAddress, migrationPhase, name, networkSecurityGroup, nicType, primary, privateEndpoint, privateLinkService, provisioningState, resourceGuid, tags, tapConfigurations, type, virtualMachine);
        }
    }
}
