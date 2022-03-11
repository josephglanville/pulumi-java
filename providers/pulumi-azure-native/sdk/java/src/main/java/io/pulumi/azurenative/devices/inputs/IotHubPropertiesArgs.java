// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.Capabilities;
import io.pulumi.azurenative.devices.enums.PublicNetworkAccess;
import io.pulumi.azurenative.devices.inputs.CloudToDevicePropertiesArgs;
import io.pulumi.azurenative.devices.inputs.EventHubPropertiesArgs;
import io.pulumi.azurenative.devices.inputs.IpFilterRuleArgs;
import io.pulumi.azurenative.devices.inputs.MessagingEndpointPropertiesArgs;
import io.pulumi.azurenative.devices.inputs.NetworkRuleSetPropertiesArgs;
import io.pulumi.azurenative.devices.inputs.PrivateEndpointConnectionArgs;
import io.pulumi.azurenative.devices.inputs.RoutingPropertiesArgs;
import io.pulumi.azurenative.devices.inputs.SharedAccessSignatureAuthorizationRuleArgs;
import io.pulumi.azurenative.devices.inputs.StorageEndpointPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of an IoT hub.
 * 
 */
public final class IotHubPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IotHubPropertiesArgs Empty = new IotHubPropertiesArgs();

    /**
     * The shared access policies you can use to secure a connection to the IoT hub.
     * 
     */
    @InputImport(name="authorizationPolicies")
      private final @Nullable Output<List<SharedAccessSignatureAuthorizationRuleArgs>> authorizationPolicies;

    public Output<List<SharedAccessSignatureAuthorizationRuleArgs>> getAuthorizationPolicies() {
        return this.authorizationPolicies == null ? Output.empty() : this.authorizationPolicies;
    }

    /**
     * The IoT hub cloud-to-device messaging properties.
     * 
     */
    @InputImport(name="cloudToDevice")
      private final @Nullable Output<CloudToDevicePropertiesArgs> cloudToDevice;

    public Output<CloudToDevicePropertiesArgs> getCloudToDevice() {
        return this.cloudToDevice == null ? Output.empty() : this.cloudToDevice;
    }

    /**
     * IoT hub comments.
     * 
     */
    @InputImport(name="comments")
      private final @Nullable Output<String> comments;

    public Output<String> getComments() {
        return this.comments == null ? Output.empty() : this.comments;
    }

    /**
     * If True, file upload notifications are enabled.
     * 
     */
    @InputImport(name="enableFileUploadNotifications")
      private final @Nullable Output<Boolean> enableFileUploadNotifications;

    public Output<Boolean> getEnableFileUploadNotifications() {
        return this.enableFileUploadNotifications == null ? Output.empty() : this.enableFileUploadNotifications;
    }

    /**
     * The Event Hub-compatible endpoint properties. The only possible keys to this dictionary is events. This key has to be present in the dictionary while making create or update calls for the IoT hub.
     * 
     */
    @InputImport(name="eventHubEndpoints")
      private final @Nullable Output<Map<String,EventHubPropertiesArgs>> eventHubEndpoints;

    public Output<Map<String,EventHubPropertiesArgs>> getEventHubEndpoints() {
        return this.eventHubEndpoints == null ? Output.empty() : this.eventHubEndpoints;
    }

    /**
     * The capabilities and features enabled for the IoT hub.
     * 
     */
    @InputImport(name="features")
      private final @Nullable Output<Either<String,Capabilities>> features;

    public Output<Either<String,Capabilities>> getFeatures() {
        return this.features == null ? Output.empty() : this.features;
    }

    /**
     * The IP filter rules.
     * 
     */
    @InputImport(name="ipFilterRules")
      private final @Nullable Output<List<IpFilterRuleArgs>> ipFilterRules;

    public Output<List<IpFilterRuleArgs>> getIpFilterRules() {
        return this.ipFilterRules == null ? Output.empty() : this.ipFilterRules;
    }

    /**
     * The messaging endpoint properties for the file upload notification queue.
     * 
     */
    @InputImport(name="messagingEndpoints")
      private final @Nullable Output<Map<String,MessagingEndpointPropertiesArgs>> messagingEndpoints;

    public Output<Map<String,MessagingEndpointPropertiesArgs>> getMessagingEndpoints() {
        return this.messagingEndpoints == null ? Output.empty() : this.messagingEndpoints;
    }

    /**
     * Specifies the minimum TLS version to support for this hub. Can be set to "1.2" to have clients that use a TLS version below 1.2 to be rejected.
     * 
     */
    @InputImport(name="minTlsVersion")
      private final @Nullable Output<String> minTlsVersion;

    public Output<String> getMinTlsVersion() {
        return this.minTlsVersion == null ? Output.empty() : this.minTlsVersion;
    }

    /**
     * Network Rule Set Properties of IotHub
     * 
     */
    @InputImport(name="networkRuleSets")
      private final @Nullable Output<NetworkRuleSetPropertiesArgs> networkRuleSets;

    public Output<NetworkRuleSetPropertiesArgs> getNetworkRuleSets() {
        return this.networkRuleSets == null ? Output.empty() : this.networkRuleSets;
    }

    /**
     * Private endpoint connections created on this IotHub
     * 
     */
    @InputImport(name="privateEndpointConnections")
      private final @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;

    public Output<List<PrivateEndpointConnectionArgs>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections == null ? Output.empty() : this.privateEndpointConnections;
    }

    /**
     * Whether requests from Public Network are allowed
     * 
     */
    @InputImport(name="publicNetworkAccess")
      private final @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Output<Either<String,PublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Output.empty() : this.publicNetworkAccess;
    }

    /**
     * The routing related properties of the IoT hub. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging
     * 
     */
    @InputImport(name="routing")
      private final @Nullable Output<RoutingPropertiesArgs> routing;

    public Output<RoutingPropertiesArgs> getRouting() {
        return this.routing == null ? Output.empty() : this.routing;
    }

    /**
     * The list of Azure Storage endpoints where you can upload files. Currently you can configure only one Azure Storage account and that MUST have its key as $default. Specifying more than one storage account causes an error to be thrown. Not specifying a value for this property when the enableFileUploadNotifications property is set to True, causes an error to be thrown.
     * 
     */
    @InputImport(name="storageEndpoints")
      private final @Nullable Output<Map<String,StorageEndpointPropertiesArgs>> storageEndpoints;

    public Output<Map<String,StorageEndpointPropertiesArgs>> getStorageEndpoints() {
        return this.storageEndpoints == null ? Output.empty() : this.storageEndpoints;
    }

    public IotHubPropertiesArgs(
        @Nullable Output<List<SharedAccessSignatureAuthorizationRuleArgs>> authorizationPolicies,
        @Nullable Output<CloudToDevicePropertiesArgs> cloudToDevice,
        @Nullable Output<String> comments,
        @Nullable Output<Boolean> enableFileUploadNotifications,
        @Nullable Output<Map<String,EventHubPropertiesArgs>> eventHubEndpoints,
        @Nullable Output<Either<String,Capabilities>> features,
        @Nullable Output<List<IpFilterRuleArgs>> ipFilterRules,
        @Nullable Output<Map<String,MessagingEndpointPropertiesArgs>> messagingEndpoints,
        @Nullable Output<String> minTlsVersion,
        @Nullable Output<NetworkRuleSetPropertiesArgs> networkRuleSets,
        @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections,
        @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        @Nullable Output<RoutingPropertiesArgs> routing,
        @Nullable Output<Map<String,StorageEndpointPropertiesArgs>> storageEndpoints) {
        this.authorizationPolicies = authorizationPolicies;
        this.cloudToDevice = cloudToDevice;
        this.comments = comments;
        this.enableFileUploadNotifications = enableFileUploadNotifications;
        this.eventHubEndpoints = eventHubEndpoints;
        this.features = features;
        this.ipFilterRules = ipFilterRules;
        this.messagingEndpoints = messagingEndpoints;
        this.minTlsVersion = minTlsVersion;
        this.networkRuleSets = networkRuleSets;
        this.privateEndpointConnections = privateEndpointConnections;
        this.publicNetworkAccess = publicNetworkAccess;
        this.routing = routing;
        this.storageEndpoints = storageEndpoints;
    }

    private IotHubPropertiesArgs() {
        this.authorizationPolicies = Output.empty();
        this.cloudToDevice = Output.empty();
        this.comments = Output.empty();
        this.enableFileUploadNotifications = Output.empty();
        this.eventHubEndpoints = Output.empty();
        this.features = Output.empty();
        this.ipFilterRules = Output.empty();
        this.messagingEndpoints = Output.empty();
        this.minTlsVersion = Output.empty();
        this.networkRuleSets = Output.empty();
        this.privateEndpointConnections = Output.empty();
        this.publicNetworkAccess = Output.empty();
        this.routing = Output.empty();
        this.storageEndpoints = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SharedAccessSignatureAuthorizationRuleArgs>> authorizationPolicies;
        private @Nullable Output<CloudToDevicePropertiesArgs> cloudToDevice;
        private @Nullable Output<String> comments;
        private @Nullable Output<Boolean> enableFileUploadNotifications;
        private @Nullable Output<Map<String,EventHubPropertiesArgs>> eventHubEndpoints;
        private @Nullable Output<Either<String,Capabilities>> features;
        private @Nullable Output<List<IpFilterRuleArgs>> ipFilterRules;
        private @Nullable Output<Map<String,MessagingEndpointPropertiesArgs>> messagingEndpoints;
        private @Nullable Output<String> minTlsVersion;
        private @Nullable Output<NetworkRuleSetPropertiesArgs> networkRuleSets;
        private @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;
        private @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private @Nullable Output<RoutingPropertiesArgs> routing;
        private @Nullable Output<Map<String,StorageEndpointPropertiesArgs>> storageEndpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(IotHubPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationPolicies = defaults.authorizationPolicies;
    	      this.cloudToDevice = defaults.cloudToDevice;
    	      this.comments = defaults.comments;
    	      this.enableFileUploadNotifications = defaults.enableFileUploadNotifications;
    	      this.eventHubEndpoints = defaults.eventHubEndpoints;
    	      this.features = defaults.features;
    	      this.ipFilterRules = defaults.ipFilterRules;
    	      this.messagingEndpoints = defaults.messagingEndpoints;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.networkRuleSets = defaults.networkRuleSets;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.routing = defaults.routing;
    	      this.storageEndpoints = defaults.storageEndpoints;
        }

        public Builder authorizationPolicies(@Nullable Output<List<SharedAccessSignatureAuthorizationRuleArgs>> authorizationPolicies) {
            this.authorizationPolicies = authorizationPolicies;
            return this;
        }

        public Builder authorizationPolicies(@Nullable List<SharedAccessSignatureAuthorizationRuleArgs> authorizationPolicies) {
            this.authorizationPolicies = Output.ofNullable(authorizationPolicies);
            return this;
        }

        public Builder cloudToDevice(@Nullable Output<CloudToDevicePropertiesArgs> cloudToDevice) {
            this.cloudToDevice = cloudToDevice;
            return this;
        }

        public Builder cloudToDevice(@Nullable CloudToDevicePropertiesArgs cloudToDevice) {
            this.cloudToDevice = Output.ofNullable(cloudToDevice);
            return this;
        }

        public Builder comments(@Nullable Output<String> comments) {
            this.comments = comments;
            return this;
        }

        public Builder comments(@Nullable String comments) {
            this.comments = Output.ofNullable(comments);
            return this;
        }

        public Builder enableFileUploadNotifications(@Nullable Output<Boolean> enableFileUploadNotifications) {
            this.enableFileUploadNotifications = enableFileUploadNotifications;
            return this;
        }

        public Builder enableFileUploadNotifications(@Nullable Boolean enableFileUploadNotifications) {
            this.enableFileUploadNotifications = Output.ofNullable(enableFileUploadNotifications);
            return this;
        }

        public Builder eventHubEndpoints(@Nullable Output<Map<String,EventHubPropertiesArgs>> eventHubEndpoints) {
            this.eventHubEndpoints = eventHubEndpoints;
            return this;
        }

        public Builder eventHubEndpoints(@Nullable Map<String,EventHubPropertiesArgs> eventHubEndpoints) {
            this.eventHubEndpoints = Output.ofNullable(eventHubEndpoints);
            return this;
        }

        public Builder features(@Nullable Output<Either<String,Capabilities>> features) {
            this.features = features;
            return this;
        }

        public Builder features(@Nullable Either<String,Capabilities> features) {
            this.features = Output.ofNullable(features);
            return this;
        }

        public Builder ipFilterRules(@Nullable Output<List<IpFilterRuleArgs>> ipFilterRules) {
            this.ipFilterRules = ipFilterRules;
            return this;
        }

        public Builder ipFilterRules(@Nullable List<IpFilterRuleArgs> ipFilterRules) {
            this.ipFilterRules = Output.ofNullable(ipFilterRules);
            return this;
        }

        public Builder messagingEndpoints(@Nullable Output<Map<String,MessagingEndpointPropertiesArgs>> messagingEndpoints) {
            this.messagingEndpoints = messagingEndpoints;
            return this;
        }

        public Builder messagingEndpoints(@Nullable Map<String,MessagingEndpointPropertiesArgs> messagingEndpoints) {
            this.messagingEndpoints = Output.ofNullable(messagingEndpoints);
            return this;
        }

        public Builder minTlsVersion(@Nullable Output<String> minTlsVersion) {
            this.minTlsVersion = minTlsVersion;
            return this;
        }

        public Builder minTlsVersion(@Nullable String minTlsVersion) {
            this.minTlsVersion = Output.ofNullable(minTlsVersion);
            return this;
        }

        public Builder networkRuleSets(@Nullable Output<NetworkRuleSetPropertiesArgs> networkRuleSets) {
            this.networkRuleSets = networkRuleSets;
            return this;
        }

        public Builder networkRuleSets(@Nullable NetworkRuleSetPropertiesArgs networkRuleSets) {
            this.networkRuleSets = Output.ofNullable(networkRuleSets);
            return this;
        }

        public Builder privateEndpointConnections(@Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        public Builder privateEndpointConnections(@Nullable List<PrivateEndpointConnectionArgs> privateEndpointConnections) {
            this.privateEndpointConnections = Output.ofNullable(privateEndpointConnections);
            return this;
        }

        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder publicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Output.ofNullable(publicNetworkAccess);
            return this;
        }

        public Builder routing(@Nullable Output<RoutingPropertiesArgs> routing) {
            this.routing = routing;
            return this;
        }

        public Builder routing(@Nullable RoutingPropertiesArgs routing) {
            this.routing = Output.ofNullable(routing);
            return this;
        }

        public Builder storageEndpoints(@Nullable Output<Map<String,StorageEndpointPropertiesArgs>> storageEndpoints) {
            this.storageEndpoints = storageEndpoints;
            return this;
        }

        public Builder storageEndpoints(@Nullable Map<String,StorageEndpointPropertiesArgs> storageEndpoints) {
            this.storageEndpoints = Output.ofNullable(storageEndpoints);
            return this;
        }
        public IotHubPropertiesArgs build() {
            return new IotHubPropertiesArgs(authorizationPolicies, cloudToDevice, comments, enableFileUploadNotifications, eventHubEndpoints, features, ipFilterRules, messagingEndpoints, minTlsVersion, networkRuleSets, privateEndpointConnections, publicNetworkAccess, routing, storageEndpoints);
        }
    }
}
