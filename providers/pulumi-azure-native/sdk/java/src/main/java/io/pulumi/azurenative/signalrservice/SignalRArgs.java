// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice;

import io.pulumi.azurenative.signalrservice.enums.ServiceKind;
import io.pulumi.azurenative.signalrservice.inputs.ResourceSkuArgs;
import io.pulumi.azurenative.signalrservice.inputs.ServerlessUpstreamSettingsArgs;
import io.pulumi.azurenative.signalrservice.inputs.SignalRCorsSettingsArgs;
import io.pulumi.azurenative.signalrservice.inputs.SignalRFeatureArgs;
import io.pulumi.azurenative.signalrservice.inputs.SignalRNetworkACLsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SignalRArgs extends io.pulumi.resources.ResourceArgs {

    public static final SignalRArgs Empty = new SignalRArgs();

    @InputImport(name="cors")
    private final @Nullable Input<SignalRCorsSettingsArgs> cors;

    public Input<SignalRCorsSettingsArgs> getCors() {
        return this.cors == null ? Input.empty() : this.cors;
    }

    @InputImport(name="features")
    private final @Nullable Input<List<SignalRFeatureArgs>> features;

    public Input<List<SignalRFeatureArgs>> getFeatures() {
        return this.features == null ? Input.empty() : this.features;
    }

    @InputImport(name="kind")
    private final @Nullable Input<Either<String,ServiceKind>> kind;

    public Input<Either<String,ServiceKind>> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="networkACLs")
    private final @Nullable Input<SignalRNetworkACLsArgs> networkACLs;

    public Input<SignalRNetworkACLsArgs> getNetworkACLs() {
        return this.networkACLs == null ? Input.empty() : this.networkACLs;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourceName")
    private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    @InputImport(name="sku")
    private final @Nullable Input<ResourceSkuArgs> sku;

    public Input<ResourceSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="upstream")
    private final @Nullable Input<ServerlessUpstreamSettingsArgs> upstream;

    public Input<ServerlessUpstreamSettingsArgs> getUpstream() {
        return this.upstream == null ? Input.empty() : this.upstream;
    }

    public SignalRArgs(
        @Nullable Input<SignalRCorsSettingsArgs> cors,
        @Nullable Input<List<SignalRFeatureArgs>> features,
        @Nullable Input<Either<String,ServiceKind>> kind,
        @Nullable Input<String> location,
        @Nullable Input<SignalRNetworkACLsArgs> networkACLs,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        @Nullable Input<ResourceSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<ServerlessUpstreamSettingsArgs> upstream) {
        this.cors = cors;
        this.features = features;
        this.kind = kind;
        this.location = location;
        this.networkACLs = networkACLs;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.sku = sku;
        this.tags = tags;
        this.upstream = upstream;
    }

    private SignalRArgs() {
        this.cors = Input.empty();
        this.features = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.networkACLs = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.upstream = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignalRArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SignalRCorsSettingsArgs> cors;
        private @Nullable Input<List<SignalRFeatureArgs>> features;
        private @Nullable Input<Either<String,ServiceKind>> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<SignalRNetworkACLsArgs> networkACLs;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private @Nullable Input<ResourceSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<ServerlessUpstreamSettingsArgs> upstream;

        public Builder() {
    	      // Empty
        }

        public Builder(SignalRArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cors = defaults.cors;
    	      this.features = defaults.features;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.networkACLs = defaults.networkACLs;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.upstream = defaults.upstream;
        }

        public Builder setCors(@Nullable Input<SignalRCorsSettingsArgs> cors) {
            this.cors = cors;
            return this;
        }

        public Builder setCors(@Nullable SignalRCorsSettingsArgs cors) {
            this.cors = Input.ofNullable(cors);
            return this;
        }

        public Builder setFeatures(@Nullable Input<List<SignalRFeatureArgs>> features) {
            this.features = features;
            return this;
        }

        public Builder setFeatures(@Nullable List<SignalRFeatureArgs> features) {
            this.features = Input.ofNullable(features);
            return this;
        }

        public Builder setKind(@Nullable Input<Either<String,ServiceKind>> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable Either<String,ServiceKind> kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setNetworkACLs(@Nullable Input<SignalRNetworkACLsArgs> networkACLs) {
            this.networkACLs = networkACLs;
            return this;
        }

        public Builder setNetworkACLs(@Nullable SignalRNetworkACLsArgs networkACLs) {
            this.networkACLs = Input.ofNullable(networkACLs);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setResourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
            return this;
        }

        public Builder setSku(@Nullable Input<ResourceSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable ResourceSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUpstream(@Nullable Input<ServerlessUpstreamSettingsArgs> upstream) {
            this.upstream = upstream;
            return this;
        }

        public Builder setUpstream(@Nullable ServerlessUpstreamSettingsArgs upstream) {
            this.upstream = Input.ofNullable(upstream);
            return this;
        }

        public SignalRArgs build() {
            return new SignalRArgs(cors, features, kind, location, networkACLs, resourceGroupName, resourceName, sku, tags, upstream);
        }
    }
}
