// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub;

import io.pulumi.azurenative.webpubsub.inputs.EventHandlerSettingsArgs;
import io.pulumi.azurenative.webpubsub.inputs.ManagedIdentityArgs;
import io.pulumi.azurenative.webpubsub.inputs.ResourceSkuArgs;
import io.pulumi.azurenative.webpubsub.inputs.WebPubSubFeatureArgs;
import io.pulumi.azurenative.webpubsub.inputs.WebPubSubNetworkACLsArgs;
import io.pulumi.azurenative.webpubsub.inputs.WebPubSubTlsSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebPubSubArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebPubSubArgs Empty = new WebPubSubArgs();

    /**
     * The settings for event handler in webpubsub service.
     * 
     */
    @Import(name="eventHandler")
      private final @Nullable Output<EventHandlerSettingsArgs> eventHandler;

    public Output<EventHandlerSettingsArgs> getEventHandler() {
        return this.eventHandler == null ? Codegen.empty() : this.eventHandler;
    }

    /**
     * List of the featureFlags.
     * 
     * FeatureFlags that are not included in the parameters for the update operation will not be modified.
     * And the response will only include featureFlags that are explicitly set.
     * When a featureFlag is not explicitly set, its globally default value will be used
     * But keep in mind, the default value doesn't mean "false". It varies in terms of different FeatureFlags.
     * 
     */
    @Import(name="features")
      private final @Nullable Output<List<WebPubSubFeatureArgs>> features;

    public Output<List<WebPubSubFeatureArgs>> getFeatures() {
        return this.features == null ? Codegen.empty() : this.features;
    }

    /**
     * The managed identity response
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ManagedIdentityArgs> identity;

    public Output<ManagedIdentityArgs> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * The GEO location of the resource. e.g. West US | East US | North Central US | South Central US.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Network ACLs
     * 
     */
    @Import(name="networkACLs")
      private final @Nullable Output<WebPubSubNetworkACLsArgs> networkACLs;

    public Output<WebPubSubNetworkACLsArgs> getNetworkACLs() {
        return this.networkACLs == null ? Codegen.empty() : this.networkACLs;
    }

    /**
     * Enable or disable public network access. Default to "Enabled".
     * When it's Enabled, network ACLs still apply.
     * When it's Disabled, public network access is always disabled no matter what you set in network ACLs.
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<String> publicNetworkAccess;

    public Output<String> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Codegen.empty() : this.publicNetworkAccess;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName == null ? Codegen.empty() : this.resourceName;
    }

    /**
     * The billing information of the resource.(e.g. Free, Standard)
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<ResourceSkuArgs> sku;

    public Output<ResourceSkuArgs> getSku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    /**
     * Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * TLS settings.
     * 
     */
    @Import(name="tls")
      private final @Nullable Output<WebPubSubTlsSettingsArgs> tls;

    public Output<WebPubSubTlsSettingsArgs> getTls() {
        return this.tls == null ? Codegen.empty() : this.tls;
    }

    public WebPubSubArgs(
        @Nullable Output<EventHandlerSettingsArgs> eventHandler,
        @Nullable Output<List<WebPubSubFeatureArgs>> features,
        @Nullable Output<ManagedIdentityArgs> identity,
        @Nullable Output<String> location,
        @Nullable Output<WebPubSubNetworkACLsArgs> networkACLs,
        @Nullable Output<String> publicNetworkAccess,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceName,
        @Nullable Output<ResourceSkuArgs> sku,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<WebPubSubTlsSettingsArgs> tls) {
        this.eventHandler = eventHandler;
        this.features = features;
        this.identity = identity;
        this.location = location;
        this.networkACLs = networkACLs;
        this.publicNetworkAccess = publicNetworkAccess == null ? Codegen.ofNullable("Enabled") : publicNetworkAccess;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.sku = sku;
        this.tags = tags;
        this.tls = tls;
    }

    private WebPubSubArgs() {
        this.eventHandler = Codegen.empty();
        this.features = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.networkACLs = Codegen.empty();
        this.publicNetworkAccess = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceName = Codegen.empty();
        this.sku = Codegen.empty();
        this.tags = Codegen.empty();
        this.tls = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebPubSubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EventHandlerSettingsArgs> eventHandler;
        private @Nullable Output<List<WebPubSubFeatureArgs>> features;
        private @Nullable Output<ManagedIdentityArgs> identity;
        private @Nullable Output<String> location;
        private @Nullable Output<WebPubSubNetworkACLsArgs> networkACLs;
        private @Nullable Output<String> publicNetworkAccess;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceName;
        private @Nullable Output<ResourceSkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<WebPubSubTlsSettingsArgs> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(WebPubSubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHandler = defaults.eventHandler;
    	      this.features = defaults.features;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.networkACLs = defaults.networkACLs;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.tls = defaults.tls;
        }

        public Builder eventHandler(@Nullable Output<EventHandlerSettingsArgs> eventHandler) {
            this.eventHandler = eventHandler;
            return this;
        }
        public Builder eventHandler(@Nullable EventHandlerSettingsArgs eventHandler) {
            this.eventHandler = Codegen.ofNullable(eventHandler);
            return this;
        }
        public Builder features(@Nullable Output<List<WebPubSubFeatureArgs>> features) {
            this.features = features;
            return this;
        }
        public Builder features(@Nullable List<WebPubSubFeatureArgs> features) {
            this.features = Codegen.ofNullable(features);
            return this;
        }
        public Builder features(WebPubSubFeatureArgs... features) {
            return features(List.of(features));
        }
        public Builder identity(@Nullable Output<ManagedIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ManagedIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder networkACLs(@Nullable Output<WebPubSubNetworkACLsArgs> networkACLs) {
            this.networkACLs = networkACLs;
            return this;
        }
        public Builder networkACLs(@Nullable WebPubSubNetworkACLsArgs networkACLs) {
            this.networkACLs = Codegen.ofNullable(networkACLs);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Output<String> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = Codegen.ofNullable(publicNetworkAccess);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Codegen.ofNullable(resourceName);
            return this;
        }
        public Builder sku(@Nullable Output<ResourceSkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable ResourceSkuArgs sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tls(@Nullable Output<WebPubSubTlsSettingsArgs> tls) {
            this.tls = tls;
            return this;
        }
        public Builder tls(@Nullable WebPubSubTlsSettingsArgs tls) {
            this.tls = Codegen.ofNullable(tls);
            return this;
        }        public WebPubSubArgs build() {
            return new WebPubSubArgs(eventHandler, features, identity, location, networkACLs, publicNetworkAccess, resourceGroupName, resourceName, sku, tags, tls);
        }
    }
}
