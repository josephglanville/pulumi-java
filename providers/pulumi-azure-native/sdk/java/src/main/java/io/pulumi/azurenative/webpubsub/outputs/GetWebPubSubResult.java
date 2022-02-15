// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.azurenative.webpubsub.outputs.EventHandlerSettingsResponse;
import io.pulumi.azurenative.webpubsub.outputs.ManagedIdentityResponse;
import io.pulumi.azurenative.webpubsub.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.webpubsub.outputs.ResourceSkuResponse;
import io.pulumi.azurenative.webpubsub.outputs.SharedPrivateLinkResourceResponse;
import io.pulumi.azurenative.webpubsub.outputs.SystemDataResponse;
import io.pulumi.azurenative.webpubsub.outputs.WebPubSubFeatureResponse;
import io.pulumi.azurenative.webpubsub.outputs.WebPubSubNetworkACLsResponse;
import io.pulumi.azurenative.webpubsub.outputs.WebPubSubTlsSettingsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebPubSubResult {
    private final @Nullable EventHandlerSettingsResponse eventHandler;
    private final String externalIP;
    private final @Nullable List<WebPubSubFeatureResponse> features;
    private final String hostName;
    private final String id;
    private final @Nullable ManagedIdentityResponse identity;
    private final @Nullable String location;
    private final String name;
    private final @Nullable WebPubSubNetworkACLsResponse networkACLs;
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    private final String provisioningState;
    private final @Nullable String publicNetworkAccess;
    private final Integer publicPort;
    private final Integer serverPort;
    private final List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources;
    private final @Nullable ResourceSkuResponse sku;
    private final SystemDataResponse systemData;
    private final @Nullable Map<String,String> tags;
    private final @Nullable WebPubSubTlsSettingsResponse tls;
    private final String type;
    private final String version;

    @OutputCustomType.Constructor({"eventHandler","externalIP","features","hostName","id","identity","location","name","networkACLs","privateEndpointConnections","provisioningState","publicNetworkAccess","publicPort","serverPort","sharedPrivateLinkResources","sku","systemData","tags","tls","type","version"})
    private GetWebPubSubResult(
        @Nullable EventHandlerSettingsResponse eventHandler,
        String externalIP,
        @Nullable List<WebPubSubFeatureResponse> features,
        String hostName,
        String id,
        @Nullable ManagedIdentityResponse identity,
        @Nullable String location,
        String name,
        @Nullable WebPubSubNetworkACLsResponse networkACLs,
        List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        String provisioningState,
        @Nullable String publicNetworkAccess,
        Integer publicPort,
        Integer serverPort,
        List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources,
        @Nullable ResourceSkuResponse sku,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        @Nullable WebPubSubTlsSettingsResponse tls,
        String type,
        String version) {
        this.eventHandler = eventHandler;
        this.externalIP = Objects.requireNonNull(externalIP);
        this.features = features;
        this.hostName = Objects.requireNonNull(hostName);
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.networkACLs = networkACLs;
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicNetworkAccess = publicNetworkAccess;
        this.publicPort = Objects.requireNonNull(publicPort);
        this.serverPort = Objects.requireNonNull(serverPort);
        this.sharedPrivateLinkResources = Objects.requireNonNull(sharedPrivateLinkResources);
        this.sku = sku;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.tls = tls;
        this.type = Objects.requireNonNull(type);
        this.version = Objects.requireNonNull(version);
    }

    public Optional<EventHandlerSettingsResponse> getEventHandler() {
        return Optional.ofNullable(this.eventHandler);
    }
    public String getExternalIP() {
        return this.externalIP;
    }
    public List<WebPubSubFeatureResponse> getFeatures() {
        return this.features == null ? List.of() : this.features;
    }
    public String getHostName() {
        return this.hostName;
    }
    public String getId() {
        return this.id;
    }
    public Optional<ManagedIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public Optional<WebPubSubNetworkACLsResponse> getNetworkACLs() {
        return Optional.ofNullable(this.networkACLs);
    }
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    public Integer getPublicPort() {
        return this.publicPort;
    }
    public Integer getServerPort() {
        return this.serverPort;
    }
    public List<SharedPrivateLinkResourceResponse> getSharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources;
    }
    public Optional<ResourceSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<WebPubSubTlsSettingsResponse> getTls() {
        return Optional.ofNullable(this.tls);
    }
    public String getType() {
        return this.type;
    }
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebPubSubResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EventHandlerSettingsResponse eventHandler;
        private String externalIP;
        private @Nullable List<WebPubSubFeatureResponse> features;
        private String hostName;
        private String id;
        private @Nullable ManagedIdentityResponse identity;
        private @Nullable String location;
        private String name;
        private @Nullable WebPubSubNetworkACLsResponse networkACLs;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private Integer publicPort;
        private Integer serverPort;
        private List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources;
        private @Nullable ResourceSkuResponse sku;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable WebPubSubTlsSettingsResponse tls;
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebPubSubResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHandler = defaults.eventHandler;
    	      this.externalIP = defaults.externalIP;
    	      this.features = defaults.features;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkACLs = defaults.networkACLs;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.publicPort = defaults.publicPort;
    	      this.serverPort = defaults.serverPort;
    	      this.sharedPrivateLinkResources = defaults.sharedPrivateLinkResources;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.tls = defaults.tls;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setEventHandler(@Nullable EventHandlerSettingsResponse eventHandler) {
            this.eventHandler = eventHandler;
            return this;
        }

        public Builder setExternalIP(String externalIP) {
            this.externalIP = Objects.requireNonNull(externalIP);
            return this;
        }

        public Builder setFeatures(@Nullable List<WebPubSubFeatureResponse> features) {
            this.features = features;
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ManagedIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkACLs(@Nullable WebPubSubNetworkACLsResponse networkACLs) {
            this.networkACLs = networkACLs;
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicPort(Integer publicPort) {
            this.publicPort = Objects.requireNonNull(publicPort);
            return this;
        }

        public Builder setServerPort(Integer serverPort) {
            this.serverPort = Objects.requireNonNull(serverPort);
            return this;
        }

        public Builder setSharedPrivateLinkResources(List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources) {
            this.sharedPrivateLinkResources = Objects.requireNonNull(sharedPrivateLinkResources);
            return this;
        }

        public Builder setSku(@Nullable ResourceSkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTls(@Nullable WebPubSubTlsSettingsResponse tls) {
            this.tls = tls;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public GetWebPubSubResult build() {
            return new GetWebPubSubResult(eventHandler, externalIP, features, hostName, id, identity, location, name, networkACLs, privateEndpointConnections, provisioningState, publicNetworkAccess, publicPort, serverPort, sharedPrivateLinkResources, sku, systemData, tags, tls, type, version);
        }
    }
}