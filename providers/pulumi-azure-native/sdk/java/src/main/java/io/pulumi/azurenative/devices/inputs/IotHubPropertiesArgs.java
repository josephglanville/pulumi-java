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
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IotHubPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IotHubPropertiesArgs Empty = new IotHubPropertiesArgs();

    @InputImport(name="authorizationPolicies")
    private final @Nullable Input<List<SharedAccessSignatureAuthorizationRuleArgs>> authorizationPolicies;

    public Input<List<SharedAccessSignatureAuthorizationRuleArgs>> getAuthorizationPolicies() {
        return this.authorizationPolicies == null ? Input.empty() : this.authorizationPolicies;
    }

    @InputImport(name="cloudToDevice")
    private final @Nullable Input<CloudToDevicePropertiesArgs> cloudToDevice;

    public Input<CloudToDevicePropertiesArgs> getCloudToDevice() {
        return this.cloudToDevice == null ? Input.empty() : this.cloudToDevice;
    }

    @InputImport(name="comments")
    private final @Nullable Input<String> comments;

    public Input<String> getComments() {
        return this.comments == null ? Input.empty() : this.comments;
    }

    @InputImport(name="enableFileUploadNotifications")
    private final @Nullable Input<Boolean> enableFileUploadNotifications;

    public Input<Boolean> getEnableFileUploadNotifications() {
        return this.enableFileUploadNotifications == null ? Input.empty() : this.enableFileUploadNotifications;
    }

    @InputImport(name="eventHubEndpoints")
    private final @Nullable Input<Map<String,EventHubPropertiesArgs>> eventHubEndpoints;

    public Input<Map<String,EventHubPropertiesArgs>> getEventHubEndpoints() {
        return this.eventHubEndpoints == null ? Input.empty() : this.eventHubEndpoints;
    }

    @InputImport(name="features")
    private final @Nullable Input<Either<String,Capabilities>> features;

    public Input<Either<String,Capabilities>> getFeatures() {
        return this.features == null ? Input.empty() : this.features;
    }

    @InputImport(name="ipFilterRules")
    private final @Nullable Input<List<IpFilterRuleArgs>> ipFilterRules;

    public Input<List<IpFilterRuleArgs>> getIpFilterRules() {
        return this.ipFilterRules == null ? Input.empty() : this.ipFilterRules;
    }

    @InputImport(name="messagingEndpoints")
    private final @Nullable Input<Map<String,MessagingEndpointPropertiesArgs>> messagingEndpoints;

    public Input<Map<String,MessagingEndpointPropertiesArgs>> getMessagingEndpoints() {
        return this.messagingEndpoints == null ? Input.empty() : this.messagingEndpoints;
    }

    @InputImport(name="minTlsVersion")
    private final @Nullable Input<String> minTlsVersion;

    public Input<String> getMinTlsVersion() {
        return this.minTlsVersion == null ? Input.empty() : this.minTlsVersion;
    }

    @InputImport(name="networkRuleSets")
    private final @Nullable Input<NetworkRuleSetPropertiesArgs> networkRuleSets;

    public Input<NetworkRuleSetPropertiesArgs> getNetworkRuleSets() {
        return this.networkRuleSets == null ? Input.empty() : this.networkRuleSets;
    }

    @InputImport(name="privateEndpointConnections")
    private final @Nullable Input<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;

    public Input<List<PrivateEndpointConnectionArgs>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections == null ? Input.empty() : this.privateEndpointConnections;
    }

    @InputImport(name="publicNetworkAccess")
    private final @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Input<Either<String,PublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    @InputImport(name="routing")
    private final @Nullable Input<RoutingPropertiesArgs> routing;

    public Input<RoutingPropertiesArgs> getRouting() {
        return this.routing == null ? Input.empty() : this.routing;
    }

    @InputImport(name="storageEndpoints")
    private final @Nullable Input<Map<String,StorageEndpointPropertiesArgs>> storageEndpoints;

    public Input<Map<String,StorageEndpointPropertiesArgs>> getStorageEndpoints() {
        return this.storageEndpoints == null ? Input.empty() : this.storageEndpoints;
    }

    public IotHubPropertiesArgs(
        @Nullable Input<List<SharedAccessSignatureAuthorizationRuleArgs>> authorizationPolicies,
        @Nullable Input<CloudToDevicePropertiesArgs> cloudToDevice,
        @Nullable Input<String> comments,
        @Nullable Input<Boolean> enableFileUploadNotifications,
        @Nullable Input<Map<String,EventHubPropertiesArgs>> eventHubEndpoints,
        @Nullable Input<Either<String,Capabilities>> features,
        @Nullable Input<List<IpFilterRuleArgs>> ipFilterRules,
        @Nullable Input<Map<String,MessagingEndpointPropertiesArgs>> messagingEndpoints,
        @Nullable Input<String> minTlsVersion,
        @Nullable Input<NetworkRuleSetPropertiesArgs> networkRuleSets,
        @Nullable Input<List<PrivateEndpointConnectionArgs>> privateEndpointConnections,
        @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        @Nullable Input<RoutingPropertiesArgs> routing,
        @Nullable Input<Map<String,StorageEndpointPropertiesArgs>> storageEndpoints) {
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
        this.authorizationPolicies = Input.empty();
        this.cloudToDevice = Input.empty();
        this.comments = Input.empty();
        this.enableFileUploadNotifications = Input.empty();
        this.eventHubEndpoints = Input.empty();
        this.features = Input.empty();
        this.ipFilterRules = Input.empty();
        this.messagingEndpoints = Input.empty();
        this.minTlsVersion = Input.empty();
        this.networkRuleSets = Input.empty();
        this.privateEndpointConnections = Input.empty();
        this.publicNetworkAccess = Input.empty();
        this.routing = Input.empty();
        this.storageEndpoints = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SharedAccessSignatureAuthorizationRuleArgs>> authorizationPolicies;
        private @Nullable Input<CloudToDevicePropertiesArgs> cloudToDevice;
        private @Nullable Input<String> comments;
        private @Nullable Input<Boolean> enableFileUploadNotifications;
        private @Nullable Input<Map<String,EventHubPropertiesArgs>> eventHubEndpoints;
        private @Nullable Input<Either<String,Capabilities>> features;
        private @Nullable Input<List<IpFilterRuleArgs>> ipFilterRules;
        private @Nullable Input<Map<String,MessagingEndpointPropertiesArgs>> messagingEndpoints;
        private @Nullable Input<String> minTlsVersion;
        private @Nullable Input<NetworkRuleSetPropertiesArgs> networkRuleSets;
        private @Nullable Input<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;
        private @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private @Nullable Input<RoutingPropertiesArgs> routing;
        private @Nullable Input<Map<String,StorageEndpointPropertiesArgs>> storageEndpoints;

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

        public Builder setAuthorizationPolicies(@Nullable Input<List<SharedAccessSignatureAuthorizationRuleArgs>> authorizationPolicies) {
            this.authorizationPolicies = authorizationPolicies;
            return this;
        }

        public Builder setAuthorizationPolicies(@Nullable List<SharedAccessSignatureAuthorizationRuleArgs> authorizationPolicies) {
            this.authorizationPolicies = Input.ofNullable(authorizationPolicies);
            return this;
        }

        public Builder setCloudToDevice(@Nullable Input<CloudToDevicePropertiesArgs> cloudToDevice) {
            this.cloudToDevice = cloudToDevice;
            return this;
        }

        public Builder setCloudToDevice(@Nullable CloudToDevicePropertiesArgs cloudToDevice) {
            this.cloudToDevice = Input.ofNullable(cloudToDevice);
            return this;
        }

        public Builder setComments(@Nullable Input<String> comments) {
            this.comments = comments;
            return this;
        }

        public Builder setComments(@Nullable String comments) {
            this.comments = Input.ofNullable(comments);
            return this;
        }

        public Builder setEnableFileUploadNotifications(@Nullable Input<Boolean> enableFileUploadNotifications) {
            this.enableFileUploadNotifications = enableFileUploadNotifications;
            return this;
        }

        public Builder setEnableFileUploadNotifications(@Nullable Boolean enableFileUploadNotifications) {
            this.enableFileUploadNotifications = Input.ofNullable(enableFileUploadNotifications);
            return this;
        }

        public Builder setEventHubEndpoints(@Nullable Input<Map<String,EventHubPropertiesArgs>> eventHubEndpoints) {
            this.eventHubEndpoints = eventHubEndpoints;
            return this;
        }

        public Builder setEventHubEndpoints(@Nullable Map<String,EventHubPropertiesArgs> eventHubEndpoints) {
            this.eventHubEndpoints = Input.ofNullable(eventHubEndpoints);
            return this;
        }

        public Builder setFeatures(@Nullable Input<Either<String,Capabilities>> features) {
            this.features = features;
            return this;
        }

        public Builder setFeatures(@Nullable Either<String,Capabilities> features) {
            this.features = Input.ofNullable(features);
            return this;
        }

        public Builder setIpFilterRules(@Nullable Input<List<IpFilterRuleArgs>> ipFilterRules) {
            this.ipFilterRules = ipFilterRules;
            return this;
        }

        public Builder setIpFilterRules(@Nullable List<IpFilterRuleArgs> ipFilterRules) {
            this.ipFilterRules = Input.ofNullable(ipFilterRules);
            return this;
        }

        public Builder setMessagingEndpoints(@Nullable Input<Map<String,MessagingEndpointPropertiesArgs>> messagingEndpoints) {
            this.messagingEndpoints = messagingEndpoints;
            return this;
        }

        public Builder setMessagingEndpoints(@Nullable Map<String,MessagingEndpointPropertiesArgs> messagingEndpoints) {
            this.messagingEndpoints = Input.ofNullable(messagingEndpoints);
            return this;
        }

        public Builder setMinTlsVersion(@Nullable Input<String> minTlsVersion) {
            this.minTlsVersion = minTlsVersion;
            return this;
        }

        public Builder setMinTlsVersion(@Nullable String minTlsVersion) {
            this.minTlsVersion = Input.ofNullable(minTlsVersion);
            return this;
        }

        public Builder setNetworkRuleSets(@Nullable Input<NetworkRuleSetPropertiesArgs> networkRuleSets) {
            this.networkRuleSets = networkRuleSets;
            return this;
        }

        public Builder setNetworkRuleSets(@Nullable NetworkRuleSetPropertiesArgs networkRuleSets) {
            this.networkRuleSets = Input.ofNullable(networkRuleSets);
            return this;
        }

        public Builder setPrivateEndpointConnections(@Nullable Input<List<PrivateEndpointConnectionArgs>> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        public Builder setPrivateEndpointConnections(@Nullable List<PrivateEndpointConnectionArgs> privateEndpointConnections) {
            this.privateEndpointConnections = Input.ofNullable(privateEndpointConnections);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
            return this;
        }

        public Builder setRouting(@Nullable Input<RoutingPropertiesArgs> routing) {
            this.routing = routing;
            return this;
        }

        public Builder setRouting(@Nullable RoutingPropertiesArgs routing) {
            this.routing = Input.ofNullable(routing);
            return this;
        }

        public Builder setStorageEndpoints(@Nullable Input<Map<String,StorageEndpointPropertiesArgs>> storageEndpoints) {
            this.storageEndpoints = storageEndpoints;
            return this;
        }

        public Builder setStorageEndpoints(@Nullable Map<String,StorageEndpointPropertiesArgs> storageEndpoints) {
            this.storageEndpoints = Input.ofNullable(storageEndpoints);
            return this;
        }

        public IotHubPropertiesArgs build() {
            return new IotHubPropertiesArgs(authorizationPolicies, cloudToDevice, comments, enableFileUploadNotifications, eventHubEndpoints, features, ipFilterRules, messagingEndpoints, minTlsVersion, networkRuleSets, privateEndpointConnections, publicNetworkAccess, routing, storageEndpoints);
        }
    }
}
