// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegistryFolderDataAssetDefaultConnectionPrimarySchemaMetadataAggregator {
    /**
     * @return (Updatable) User-defined description for the folder.
     * 
     */
    private final @Nullable String description;
    /**
     * @return (Updatable) Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     * 
     */
    private final @Nullable String identifier;
    /**
     * @return (Updatable) Generated key that can be used in API calls to identify folder. On scenarios where reference to the folder is needed, a value can be passed in create.
     * 
     */
    private final @Nullable String key;
    /**
     * @return (Updatable) Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * 
     */
    private final @Nullable String name;
    /**
     * @return (Updatable) Specific DataAsset Type
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private RegistryFolderDataAssetDefaultConnectionPrimarySchemaMetadataAggregator(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("identifier") @Nullable String identifier,
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("type") @Nullable String type) {
        this.description = description;
        this.identifier = identifier;
        this.key = key;
        this.name = name;
        this.type = type;
    }

    /**
     * @return (Updatable) User-defined description for the folder.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return (Updatable) Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     * 
     */
    public Optional<String> identifier() {
        return Optional.ofNullable(this.identifier);
    }
    /**
     * @return (Updatable) Generated key that can be used in API calls to identify folder. On scenarios where reference to the folder is needed, a value can be passed in create.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return (Updatable) Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return (Updatable) Specific DataAsset Type
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryFolderDataAssetDefaultConnectionPrimarySchemaMetadataAggregator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String identifier;
        private @Nullable String key;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryFolderDataAssetDefaultConnectionPrimarySchemaMetadataAggregator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.identifier = defaults.identifier;
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder identifier(@Nullable String identifier) {
            this.identifier = identifier;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public RegistryFolderDataAssetDefaultConnectionPrimarySchemaMetadataAggregator build() {
            return new RegistryFolderDataAssetDefaultConnectionPrimarySchemaMetadataAggregator(description, identifier, key, name, type);
        }
    }
}
