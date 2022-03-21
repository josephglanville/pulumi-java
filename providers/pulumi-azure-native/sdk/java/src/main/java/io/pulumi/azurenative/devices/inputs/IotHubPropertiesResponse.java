// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.inputs.CloudToDevicePropertiesResponse;
import io.pulumi.azurenative.devices.inputs.EventHubPropertiesResponse;
import io.pulumi.azurenative.devices.inputs.IotHubLocationDescriptionResponse;
import io.pulumi.azurenative.devices.inputs.IpFilterRuleResponse;
import io.pulumi.azurenative.devices.inputs.MessagingEndpointPropertiesResponse;
import io.pulumi.azurenative.devices.inputs.NetworkRuleSetPropertiesResponse;
import io.pulumi.azurenative.devices.inputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.devices.inputs.RoutingPropertiesResponse;
import io.pulumi.azurenative.devices.inputs.SharedAccessSignatureAuthorizationRuleResponse;
import io.pulumi.azurenative.devices.inputs.StorageEndpointPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of an IoT hub.
 * 
 */
public final class IotHubPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final IotHubPropertiesResponse Empty = new IotHubPropertiesResponse();

    /**
     * The shared access policies you can use to secure a connection to the IoT hub.
     * 
     */
    @Import(name="authorizationPolicies")
      private final @Nullable List<SharedAccessSignatureAuthorizationRuleResponse> authorizationPolicies;

    public List<SharedAccessSignatureAuthorizationRuleResponse> getAuthorizationPolicies() {
        return this.authorizationPolicies == null ? List.of() : this.authorizationPolicies;
    }

    /**
     * The IoT hub cloud-to-device messaging properties.
     * 
     */
    @Import(name="cloudToDevice")
      private final @Nullable CloudToDevicePropertiesResponse cloudToDevice;

    public Optional<CloudToDevicePropertiesResponse> getCloudToDevice() {
        return this.cloudToDevice == null ? Optional.empty() : Optional.ofNullable(this.cloudToDevice);
    }

    /**
     * IoT hub comments.
     * 
     */
    @Import(name="comments")
      private final @Nullable String comments;

    public Optional<String> getComments() {
        return this.comments == null ? Optional.empty() : Optional.ofNullable(this.comments);
    }

    /**
     * If True, file upload notifications are enabled.
     * 
     */
    @Import(name="enableFileUploadNotifications")
      private final @Nullable Boolean enableFileUploadNotifications;

    public Optional<Boolean> getEnableFileUploadNotifications() {
        return this.enableFileUploadNotifications == null ? Optional.empty() : Optional.ofNullable(this.enableFileUploadNotifications);
    }

    /**
     * The Event Hub-compatible endpoint properties. The only possible keys to this dictionary is events. This key has to be present in the dictionary while making create or update calls for the IoT hub.
     * 
     */
    @Import(name="eventHubEndpoints")
      private final @Nullable Map<String,EventHubPropertiesResponse> eventHubEndpoints;

    public Map<String,EventHubPropertiesResponse> getEventHubEndpoints() {
        return this.eventHubEndpoints == null ? Map.of() : this.eventHubEndpoints;
    }

    /**
     * The capabilities and features enabled for the IoT hub.
     * 
     */
    @Import(name="features")
      private final @Nullable String features;

    public Optional<String> getFeatures() {
        return this.features == null ? Optional.empty() : Optional.ofNullable(this.features);
    }

    /**
     * The name of the host.
     * 
     */
    @Import(name="hostName", required=true)
      private final String hostName;

    public String getHostName() {
        return this.hostName;
    }

    /**
     * The IP filter rules.
     * 
     */
    @Import(name="ipFilterRules")
      private final @Nullable List<IpFilterRuleResponse> ipFilterRules;

    public List<IpFilterRuleResponse> getIpFilterRules() {
        return this.ipFilterRules == null ? List.of() : this.ipFilterRules;
    }

    /**
     * Primary and secondary location for iot hub
     * 
     */
    @Import(name="locations", required=true)
      private final List<IotHubLocationDescriptionResponse> locations;

    public List<IotHubLocationDescriptionResponse> getLocations() {
        return this.locations;
    }

    /**
     * The messaging endpoint properties for the file upload notification queue.
     * 
     */
    @Import(name="messagingEndpoints")
      private final @Nullable Map<String,MessagingEndpointPropertiesResponse> messagingEndpoints;

    public Map<String,MessagingEndpointPropertiesResponse> getMessagingEndpoints() {
        return this.messagingEndpoints == null ? Map.of() : this.messagingEndpoints;
    }

    /**
     * Specifies the minimum TLS version to support for this hub. Can be set to "1.2" to have clients that use a TLS version below 1.2 to be rejected.
     * 
     */
    @Import(name="minTlsVersion")
      private final @Nullable String minTlsVersion;

    public Optional<String> getMinTlsVersion() {
        return this.minTlsVersion == null ? Optional.empty() : Optional.ofNullable(this.minTlsVersion);
    }

    /**
     * Network Rule Set Properties of IotHub
     * 
     */
    @Import(name="networkRuleSets")
      private final @Nullable NetworkRuleSetPropertiesResponse networkRuleSets;

    public Optional<NetworkRuleSetPropertiesResponse> getNetworkRuleSets() {
        return this.networkRuleSets == null ? Optional.empty() : Optional.ofNullable(this.networkRuleSets);
    }

    /**
     * Private endpoint connections created on this IotHub
     * 
     */
    @Import(name="privateEndpointConnections")
      private final @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;

    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections == null ? List.of() : this.privateEndpointConnections;
    }

    /**
     * The provisioning state.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Whether requests from Public Network are allowed
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable String publicNetworkAccess;

    public Optional<String> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Optional.empty() : Optional.ofNullable(this.publicNetworkAccess);
    }

    /**
     * The routing related properties of the IoT hub. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging
     * 
     */
    @Import(name="routing")
      private final @Nullable RoutingPropertiesResponse routing;

    public Optional<RoutingPropertiesResponse> getRouting() {
        return this.routing == null ? Optional.empty() : Optional.ofNullable(this.routing);
    }

    /**
     * The hub state.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * The list of Azure Storage endpoints where you can upload files. Currently you can configure only one Azure Storage account and that MUST have its key as $default. Specifying more than one storage account causes an error to be thrown. Not specifying a value for this property when the enableFileUploadNotifications property is set to True, causes an error to be thrown.
     * 
     */
    @Import(name="storageEndpoints")
      private final @Nullable Map<String,StorageEndpointPropertiesResponse> storageEndpoints;

    public Map<String,StorageEndpointPropertiesResponse> getStorageEndpoints() {
        return this.storageEndpoints == null ? Map.of() : this.storageEndpoints;
    }

    public IotHubPropertiesResponse(
        @Nullable List<SharedAccessSignatureAuthorizationRuleResponse> authorizationPolicies,
        @Nullable CloudToDevicePropertiesResponse cloudToDevice,
        @Nullable String comments,
        @Nullable Boolean enableFileUploadNotifications,
        @Nullable Map<String,EventHubPropertiesResponse> eventHubEndpoints,
        @Nullable String features,
        String hostName,
        @Nullable List<IpFilterRuleResponse> ipFilterRules,
        List<IotHubLocationDescriptionResponse> locations,
        @Nullable Map<String,MessagingEndpointPropertiesResponse> messagingEndpoints,
        @Nullable String minTlsVersion,
        @Nullable NetworkRuleSetPropertiesResponse networkRuleSets,
        @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        String provisioningState,
        @Nullable String publicNetworkAccess,
        @Nullable RoutingPropertiesResponse routing,
        String state,
        @Nullable Map<String,StorageEndpointPropertiesResponse> storageEndpoints) {
        this.authorizationPolicies = authorizationPolicies;
        this.cloudToDevice = cloudToDevice;
        this.comments = comments;
        this.enableFileUploadNotifications = enableFileUploadNotifications;
        this.eventHubEndpoints = eventHubEndpoints;
        this.features = features;
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.ipFilterRules = ipFilterRules;
        this.locations = Objects.requireNonNull(locations, "expected parameter 'locations' to be non-null");
        this.messagingEndpoints = messagingEndpoints;
        this.minTlsVersion = minTlsVersion;
        this.networkRuleSets = networkRuleSets;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicNetworkAccess = publicNetworkAccess;
        this.routing = routing;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.storageEndpoints = storageEndpoints;
    }

    private IotHubPropertiesResponse() {
        this.authorizationPolicies = List.of();
        this.cloudToDevice = null;
        this.comments = null;
        this.enableFileUploadNotifications = null;
        this.eventHubEndpoints = Map.of();
        this.features = null;
        this.hostName = null;
        this.ipFilterRules = List.of();
        this.locations = List.of();
        this.messagingEndpoints = Map.of();
        this.minTlsVersion = null;
        this.networkRuleSets = null;
        this.privateEndpointConnections = List.of();
        this.provisioningState = null;
        this.publicNetworkAccess = null;
        this.routing = null;
        this.state = null;
        this.storageEndpoints = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SharedAccessSignatureAuthorizationRuleResponse> authorizationPolicies;
        private @Nullable CloudToDevicePropertiesResponse cloudToDevice;
        private @Nullable String comments;
        private @Nullable Boolean enableFileUploadNotifications;
        private @Nullable Map<String,EventHubPropertiesResponse> eventHubEndpoints;
        private @Nullable String features;
        private String hostName;
        private @Nullable List<IpFilterRuleResponse> ipFilterRules;
        private List<IotHubLocationDescriptionResponse> locations;
        private @Nullable Map<String,MessagingEndpointPropertiesResponse> messagingEndpoints;
        private @Nullable String minTlsVersion;
        private @Nullable NetworkRuleSetPropertiesResponse networkRuleSets;
        private @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private @Nullable RoutingPropertiesResponse routing;
        private String state;
        private @Nullable Map<String,StorageEndpointPropertiesResponse> storageEndpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(IotHubPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationPolicies = defaults.authorizationPolicies;
    	      this.cloudToDevice = defaults.cloudToDevice;
    	      this.comments = defaults.comments;
    	      this.enableFileUploadNotifications = defaults.enableFileUploadNotifications;
    	      this.eventHubEndpoints = defaults.eventHubEndpoints;
    	      this.features = defaults.features;
    	      this.hostName = defaults.hostName;
    	      this.ipFilterRules = defaults.ipFilterRules;
    	      this.locations = defaults.locations;
    	      this.messagingEndpoints = defaults.messagingEndpoints;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.networkRuleSets = defaults.networkRuleSets;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.routing = defaults.routing;
    	      this.state = defaults.state;
    	      this.storageEndpoints = defaults.storageEndpoints;
        }

        public Builder authorizationPolicies(@Nullable List<SharedAccessSignatureAuthorizationRuleResponse> authorizationPolicies) {
            this.authorizationPolicies = authorizationPolicies;
            return this;
        }
        public Builder authorizationPolicies(SharedAccessSignatureAuthorizationRuleResponse... authorizationPolicies) {
            return authorizationPolicies(List.of(authorizationPolicies));
        }
        public Builder cloudToDevice(@Nullable CloudToDevicePropertiesResponse cloudToDevice) {
            this.cloudToDevice = cloudToDevice;
            return this;
        }
        public Builder comments(@Nullable String comments) {
            this.comments = comments;
            return this;
        }
        public Builder enableFileUploadNotifications(@Nullable Boolean enableFileUploadNotifications) {
            this.enableFileUploadNotifications = enableFileUploadNotifications;
            return this;
        }
        public Builder eventHubEndpoints(@Nullable Map<String,EventHubPropertiesResponse> eventHubEndpoints) {
            this.eventHubEndpoints = eventHubEndpoints;
            return this;
        }
        public Builder features(@Nullable String features) {
            this.features = features;
            return this;
        }
        public Builder hostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }
        public Builder ipFilterRules(@Nullable List<IpFilterRuleResponse> ipFilterRules) {
            this.ipFilterRules = ipFilterRules;
            return this;
        }
        public Builder ipFilterRules(IpFilterRuleResponse... ipFilterRules) {
            return ipFilterRules(List.of(ipFilterRules));
        }
        public Builder locations(List<IotHubLocationDescriptionResponse> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(IotHubLocationDescriptionResponse... locations) {
            return locations(List.of(locations));
        }
        public Builder messagingEndpoints(@Nullable Map<String,MessagingEndpointPropertiesResponse> messagingEndpoints) {
            this.messagingEndpoints = messagingEndpoints;
            return this;
        }
        public Builder minTlsVersion(@Nullable String minTlsVersion) {
            this.minTlsVersion = minTlsVersion;
            return this;
        }
        public Builder networkRuleSets(@Nullable NetworkRuleSetPropertiesResponse networkRuleSets) {
            this.networkRuleSets = networkRuleSets;
            return this;
        }
        public Builder privateEndpointConnections(@Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder routing(@Nullable RoutingPropertiesResponse routing) {
            this.routing = routing;
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder storageEndpoints(@Nullable Map<String,StorageEndpointPropertiesResponse> storageEndpoints) {
            this.storageEndpoints = storageEndpoints;
            return this;
        }        public IotHubPropertiesResponse build() {
            return new IotHubPropertiesResponse(authorizationPolicies, cloudToDevice, comments, enableFileUploadNotifications, eventHubEndpoints, features, hostName, ipFilterRules, locations, messagingEndpoints, minTlsVersion, networkRuleSets, privateEndpointConnections, provisioningState, publicNetworkAccess, routing, state, storageEndpoints);
        }
    }
}
