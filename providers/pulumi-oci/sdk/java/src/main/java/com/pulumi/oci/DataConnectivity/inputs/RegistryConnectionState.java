// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataConnectivity.inputs.RegistryConnectionConnectionPropertyArgs;
import com.pulumi.oci.DataConnectivity.inputs.RegistryConnectionMetadataArgs;
import com.pulumi.oci.DataConnectivity.inputs.RegistryConnectionPrimarySchemaArgs;
import com.pulumi.oci.DataConnectivity.inputs.RegistryConnectionRegistryMetadataArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final RegistryConnectionState Empty = new RegistryConnectionState();

    /**
     * (Updatable) The properties for the connection.
     * 
     */
    @Import(name="connectionProperties")
    private @Nullable Output<List<RegistryConnectionConnectionPropertyArgs>> connectionProperties;

    /**
     * @return (Updatable) The properties for the connection.
     * 
     */
    public Optional<Output<List<RegistryConnectionConnectionPropertyArgs>>> connectionProperties() {
        return Optional.ofNullable(this.connectionProperties);
    }

    /**
     * (Updatable) The description of the aggregator.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) The description of the aggregator.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) The identifier of the aggregator.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return (Updatable) The identifier of the aggregator.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * (Updatable) The default property for the connection.
     * 
     */
    @Import(name="isDefault")
    private @Nullable Output<Boolean> isDefault;

    /**
     * @return (Updatable) The default property for the connection.
     * 
     */
    public Optional<Output<Boolean>> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }

    /**
     * (Updatable) The identifying key for the object.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return (Updatable) The identifying key for the object.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * (Updatable) A summary type containing information about the object including its key, name and when/who created/updated it.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<RegistryConnectionMetadataArgs> metadata;

    /**
     * @return (Updatable) A summary type containing information about the object including its key, name and when/who created/updated it.
     * 
     */
    public Optional<Output<RegistryConnectionMetadataArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * (Updatable) The object&#39;s type.
     * 
     */
    @Import(name="modelType")
    private @Nullable Output<String> modelType;

    /**
     * @return (Updatable) The object&#39;s type.
     * 
     */
    public Optional<Output<String>> modelType() {
        return Optional.ofNullable(this.modelType);
    }

    /**
     * (Updatable) The object&#39;s model version.
     * 
     */
    @Import(name="modelVersion")
    private @Nullable Output<String> modelVersion;

    /**
     * @return (Updatable) The object&#39;s model version.
     * 
     */
    public Optional<Output<String>> modelVersion() {
        return Optional.ofNullable(this.modelVersion);
    }

    /**
     * (Updatable) Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return (Updatable) Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Updatable) The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * 
     */
    @Import(name="objectStatus")
    private @Nullable Output<Integer> objectStatus;

    /**
     * @return (Updatable) The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * 
     */
    public Optional<Output<Integer>> objectStatus() {
        return Optional.ofNullable(this.objectStatus);
    }

    /**
     * (Updatable) The version of the object that is used to track changes in the object instance.
     * 
     */
    @Import(name="objectVersion")
    private @Nullable Output<Integer> objectVersion;

    /**
     * @return (Updatable) The version of the object that is used to track changes in the object instance.
     * 
     */
    public Optional<Output<Integer>> objectVersion() {
        return Optional.ofNullable(this.objectVersion);
    }

    /**
     * (Updatable) The schema object.
     * 
     */
    @Import(name="primarySchema")
    private @Nullable Output<RegistryConnectionPrimarySchemaArgs> primarySchema;

    /**
     * @return (Updatable) The schema object.
     * 
     */
    public Optional<Output<RegistryConnectionPrimarySchemaArgs>> primarySchema() {
        return Optional.ofNullable(this.primarySchema);
    }

    /**
     * (Updatable) All the properties for the connection in a key-value map format.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,Object>> properties;

    /**
     * @return (Updatable) All the properties for the connection in a key-value map format.
     * 
     */
    public Optional<Output<Map<String,Object>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The registry Ocid.
     * 
     */
    @Import(name="registryId")
    private @Nullable Output<String> registryId;

    /**
     * @return The registry Ocid.
     * 
     */
    public Optional<Output<String>> registryId() {
        return Optional.ofNullable(this.registryId);
    }

    /**
     * (Updatable) Information about the object and its parent.
     * 
     */
    @Import(name="registryMetadata")
    private @Nullable Output<RegistryConnectionRegistryMetadataArgs> registryMetadata;

    /**
     * @return (Updatable) Information about the object and its parent.
     * 
     */
    public Optional<Output<RegistryConnectionRegistryMetadataArgs>> registryMetadata() {
        return Optional.ofNullable(this.registryMetadata);
    }

    /**
     * (Updatable) Specific Connection Type
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return (Updatable) Specific Connection Type
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private RegistryConnectionState() {}

    private RegistryConnectionState(RegistryConnectionState $) {
        this.connectionProperties = $.connectionProperties;
        this.description = $.description;
        this.identifier = $.identifier;
        this.isDefault = $.isDefault;
        this.key = $.key;
        this.metadata = $.metadata;
        this.modelType = $.modelType;
        this.modelVersion = $.modelVersion;
        this.name = $.name;
        this.objectStatus = $.objectStatus;
        this.objectVersion = $.objectVersion;
        this.primarySchema = $.primarySchema;
        this.properties = $.properties;
        this.registryId = $.registryId;
        this.registryMetadata = $.registryMetadata;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryConnectionState $;

        public Builder() {
            $ = new RegistryConnectionState();
        }

        public Builder(RegistryConnectionState defaults) {
            $ = new RegistryConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionProperties (Updatable) The properties for the connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionProperties(@Nullable Output<List<RegistryConnectionConnectionPropertyArgs>> connectionProperties) {
            $.connectionProperties = connectionProperties;
            return this;
        }

        /**
         * @param connectionProperties (Updatable) The properties for the connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionProperties(List<RegistryConnectionConnectionPropertyArgs> connectionProperties) {
            return connectionProperties(Output.of(connectionProperties));
        }

        /**
         * @param connectionProperties (Updatable) The properties for the connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionProperties(RegistryConnectionConnectionPropertyArgs... connectionProperties) {
            return connectionProperties(List.of(connectionProperties));
        }

        /**
         * @param description (Updatable) The description of the aggregator.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) The description of the aggregator.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param identifier (Updatable) The identifier of the aggregator.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier (Updatable) The identifier of the aggregator.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param isDefault (Updatable) The default property for the connection.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        /**
         * @param isDefault (Updatable) The default property for the connection.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(Boolean isDefault) {
            return isDefault(Output.of(isDefault));
        }

        /**
         * @param key (Updatable) The identifying key for the object.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key (Updatable) The identifying key for the object.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param metadata (Updatable) A summary type containing information about the object including its key, name and when/who created/updated it.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<RegistryConnectionMetadataArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata (Updatable) A summary type containing information about the object including its key, name and when/who created/updated it.
         * 
         * @return builder
         * 
         */
        public Builder metadata(RegistryConnectionMetadataArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param modelType (Updatable) The object&#39;s type.
         * 
         * @return builder
         * 
         */
        public Builder modelType(@Nullable Output<String> modelType) {
            $.modelType = modelType;
            return this;
        }

        /**
         * @param modelType (Updatable) The object&#39;s type.
         * 
         * @return builder
         * 
         */
        public Builder modelType(String modelType) {
            return modelType(Output.of(modelType));
        }

        /**
         * @param modelVersion (Updatable) The object&#39;s model version.
         * 
         * @return builder
         * 
         */
        public Builder modelVersion(@Nullable Output<String> modelVersion) {
            $.modelVersion = modelVersion;
            return this;
        }

        /**
         * @param modelVersion (Updatable) The object&#39;s model version.
         * 
         * @return builder
         * 
         */
        public Builder modelVersion(String modelVersion) {
            return modelVersion(Output.of(modelVersion));
        }

        /**
         * @param name (Updatable) Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Updatable) Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param objectStatus (Updatable) The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         * 
         * @return builder
         * 
         */
        public Builder objectStatus(@Nullable Output<Integer> objectStatus) {
            $.objectStatus = objectStatus;
            return this;
        }

        /**
         * @param objectStatus (Updatable) The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         * 
         * @return builder
         * 
         */
        public Builder objectStatus(Integer objectStatus) {
            return objectStatus(Output.of(objectStatus));
        }

        /**
         * @param objectVersion (Updatable) The version of the object that is used to track changes in the object instance.
         * 
         * @return builder
         * 
         */
        public Builder objectVersion(@Nullable Output<Integer> objectVersion) {
            $.objectVersion = objectVersion;
            return this;
        }

        /**
         * @param objectVersion (Updatable) The version of the object that is used to track changes in the object instance.
         * 
         * @return builder
         * 
         */
        public Builder objectVersion(Integer objectVersion) {
            return objectVersion(Output.of(objectVersion));
        }

        /**
         * @param primarySchema (Updatable) The schema object.
         * 
         * @return builder
         * 
         */
        public Builder primarySchema(@Nullable Output<RegistryConnectionPrimarySchemaArgs> primarySchema) {
            $.primarySchema = primarySchema;
            return this;
        }

        /**
         * @param primarySchema (Updatable) The schema object.
         * 
         * @return builder
         * 
         */
        public Builder primarySchema(RegistryConnectionPrimarySchemaArgs primarySchema) {
            return primarySchema(Output.of(primarySchema));
        }

        /**
         * @param properties (Updatable) All the properties for the connection in a key-value map format.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,Object>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties (Updatable) All the properties for the connection in a key-value map format.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,Object> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param registryId The registry Ocid.
         * 
         * @return builder
         * 
         */
        public Builder registryId(@Nullable Output<String> registryId) {
            $.registryId = registryId;
            return this;
        }

        /**
         * @param registryId The registry Ocid.
         * 
         * @return builder
         * 
         */
        public Builder registryId(String registryId) {
            return registryId(Output.of(registryId));
        }

        /**
         * @param registryMetadata (Updatable) Information about the object and its parent.
         * 
         * @return builder
         * 
         */
        public Builder registryMetadata(@Nullable Output<RegistryConnectionRegistryMetadataArgs> registryMetadata) {
            $.registryMetadata = registryMetadata;
            return this;
        }

        /**
         * @param registryMetadata (Updatable) Information about the object and its parent.
         * 
         * @return builder
         * 
         */
        public Builder registryMetadata(RegistryConnectionRegistryMetadataArgs registryMetadata) {
            return registryMetadata(Output.of(registryMetadata));
        }

        /**
         * @param type (Updatable) Specific Connection Type
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type (Updatable) Specific Connection Type
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RegistryConnectionState build() {
            return $;
        }
    }

}
