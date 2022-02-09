// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration;

import io.pulumi.azurenative.appconfiguration.enums.PublicNetworkAccess;
import io.pulumi.azurenative.appconfiguration.inputs.EncryptionPropertiesArgs;
import io.pulumi.azurenative.appconfiguration.inputs.ResourceIdentityArgs;
import io.pulumi.azurenative.appconfiguration.inputs.SkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationStoreArgs Empty = new ConfigurationStoreArgs();

    @InputImport(name="configStoreName")
    private final @Nullable Input<String> configStoreName;

    public Input<String> getConfigStoreName() {
        return this.configStoreName == null ? Input.empty() : this.configStoreName;
    }

    @InputImport(name="encryption")
    private final @Nullable Input<EncryptionPropertiesArgs> encryption;

    public Input<EncryptionPropertiesArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    @InputImport(name="identity")
    private final @Nullable Input<ResourceIdentityArgs> identity;

    public Input<ResourceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="publicNetworkAccess")
    private final @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Input<Either<String,PublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sku", required=true)
    private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ConfigurationStoreArgs(
        @Nullable Input<String> configStoreName,
        @Nullable Input<EncryptionPropertiesArgs> encryption,
        @Nullable Input<ResourceIdentityArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        Input<String> resourceGroupName,
        Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.configStoreName = configStoreName;
        this.encryption = encryption;
        this.identity = identity;
        this.location = location;
        this.publicNetworkAccess = publicNetworkAccess;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
    }

    private ConfigurationStoreArgs() {
        this.configStoreName = Input.empty();
        this.encryption = Input.empty();
        this.identity = Input.empty();
        this.location = Input.empty();
        this.publicNetworkAccess = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configStoreName;
        private @Nullable Input<EncryptionPropertiesArgs> encryption;
        private @Nullable Input<ResourceIdentityArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private Input<String> resourceGroupName;
        private Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configStoreName = defaults.configStoreName;
    	      this.encryption = defaults.encryption;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setConfigStoreName(@Nullable Input<String> configStoreName) {
            this.configStoreName = configStoreName;
            return this;
        }

        public Builder setConfigStoreName(@Nullable String configStoreName) {
            this.configStoreName = Input.ofNullable(configStoreName);
            return this;
        }

        public Builder setEncryption(@Nullable Input<EncryptionPropertiesArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable EncryptionPropertiesArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ResourceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ResourceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
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

        public Builder setPublicNetworkAccess(@Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
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

        public Builder setSku(Input<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(SkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
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

        public ConfigurationStoreArgs build() {
            return new ConfigurationStoreArgs(configStoreName, encryption, identity, location, publicNetworkAccess, resourceGroupName, sku, tags);
        }
    }
}
