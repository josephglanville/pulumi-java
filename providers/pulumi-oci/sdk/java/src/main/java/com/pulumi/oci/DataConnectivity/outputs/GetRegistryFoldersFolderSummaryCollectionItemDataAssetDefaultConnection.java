// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataConnectivity.outputs.GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionConnectionProperty;
import com.pulumi.oci.DataConnectivity.outputs.GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionMetadata;
import com.pulumi.oci.DataConnectivity.outputs.GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionPrimarySchema;
import com.pulumi.oci.DataConnectivity.outputs.GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionRegistryMetadata;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnection {
    /**
     * @return The properties for the connection.
     * 
     */
    private final List<GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionConnectionProperty> connectionProperties;
    /**
     * @return User-defined description for the folder.
     * 
     */
    private final String description;
    /**
     * @return Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     * 
     */
    private final String identifier;
    /**
     * @return The default property for the connection.
     * 
     */
    private final Boolean isDefault;
    /**
     * @return Generated key that can be used in API calls to identify folder. On scenarios where reference to the folder is needed, a value can be passed in create.
     * 
     */
    private final String key;
    /**
     * @return A summary type containing information about the object including its key, name and when/who created/updated it.
     * 
     */
    private final GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionMetadata metadata;
    /**
     * @return The type of the folder.
     * 
     */
    private final String modelType;
    /**
     * @return The model version of an object.
     * 
     */
    private final String modelVersion;
    /**
     * @return Used to filter by the name of the object.
     * 
     */
    private final String name;
    /**
     * @return The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * 
     */
    private final Integer objectStatus;
    /**
     * @return The version of the object that is used to track changes in the object instance.
     * 
     */
    private final Integer objectVersion;
    /**
     * @return The schema object.
     * 
     */
    private final GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionPrimarySchema primarySchema;
    /**
     * @return All the properties for the data asset in a key-value map format.
     * 
     */
    private final Map<String,Object> properties;
    /**
     * @return Information about the object and its parent.
     * 
     */
    private final GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionRegistryMetadata registryMetadata;
    /**
     * @return Type of the object to filter the results with.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnection(
        @CustomType.Parameter("connectionProperties") List<GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionConnectionProperty> connectionProperties,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("identifier") String identifier,
        @CustomType.Parameter("isDefault") Boolean isDefault,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("metadata") GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionMetadata metadata,
        @CustomType.Parameter("modelType") String modelType,
        @CustomType.Parameter("modelVersion") String modelVersion,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("objectStatus") Integer objectStatus,
        @CustomType.Parameter("objectVersion") Integer objectVersion,
        @CustomType.Parameter("primarySchema") GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionPrimarySchema primarySchema,
        @CustomType.Parameter("properties") Map<String,Object> properties,
        @CustomType.Parameter("registryMetadata") GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionRegistryMetadata registryMetadata,
        @CustomType.Parameter("type") String type) {
        this.connectionProperties = connectionProperties;
        this.description = description;
        this.identifier = identifier;
        this.isDefault = isDefault;
        this.key = key;
        this.metadata = metadata;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.name = name;
        this.objectStatus = objectStatus;
        this.objectVersion = objectVersion;
        this.primarySchema = primarySchema;
        this.properties = properties;
        this.registryMetadata = registryMetadata;
        this.type = type;
    }

    /**
     * @return The properties for the connection.
     * 
     */
    public List<GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionConnectionProperty> connectionProperties() {
        return this.connectionProperties;
    }
    /**
     * @return User-defined description for the folder.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return The default property for the connection.
     * 
     */
    public Boolean isDefault() {
        return this.isDefault;
    }
    /**
     * @return Generated key that can be used in API calls to identify folder. On scenarios where reference to the folder is needed, a value can be passed in create.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return A summary type containing information about the object including its key, name and when/who created/updated it.
     * 
     */
    public GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionMetadata metadata() {
        return this.metadata;
    }
    /**
     * @return The type of the folder.
     * 
     */
    public String modelType() {
        return this.modelType;
    }
    /**
     * @return The model version of an object.
     * 
     */
    public String modelVersion() {
        return this.modelVersion;
    }
    /**
     * @return Used to filter by the name of the object.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * 
     */
    public Integer objectStatus() {
        return this.objectStatus;
    }
    /**
     * @return The version of the object that is used to track changes in the object instance.
     * 
     */
    public Integer objectVersion() {
        return this.objectVersion;
    }
    /**
     * @return The schema object.
     * 
     */
    public GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionPrimarySchema primarySchema() {
        return this.primarySchema;
    }
    /**
     * @return All the properties for the data asset in a key-value map format.
     * 
     */
    public Map<String,Object> properties() {
        return this.properties;
    }
    /**
     * @return Information about the object and its parent.
     * 
     */
    public GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionRegistryMetadata registryMetadata() {
        return this.registryMetadata;
    }
    /**
     * @return Type of the object to filter the results with.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionConnectionProperty> connectionProperties;
        private String description;
        private String identifier;
        private Boolean isDefault;
        private String key;
        private GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionMetadata metadata;
        private String modelType;
        private String modelVersion;
        private String name;
        private Integer objectStatus;
        private Integer objectVersion;
        private GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionPrimarySchema primarySchema;
        private Map<String,Object> properties;
        private GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionRegistryMetadata registryMetadata;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.description = defaults.description;
    	      this.identifier = defaults.identifier;
    	      this.isDefault = defaults.isDefault;
    	      this.key = defaults.key;
    	      this.metadata = defaults.metadata;
    	      this.modelType = defaults.modelType;
    	      this.modelVersion = defaults.modelVersion;
    	      this.name = defaults.name;
    	      this.objectStatus = defaults.objectStatus;
    	      this.objectVersion = defaults.objectVersion;
    	      this.primarySchema = defaults.primarySchema;
    	      this.properties = defaults.properties;
    	      this.registryMetadata = defaults.registryMetadata;
    	      this.type = defaults.type;
        }

        public Builder connectionProperties(List<GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionConnectionProperty> connectionProperties) {
            this.connectionProperties = Objects.requireNonNull(connectionProperties);
            return this;
        }
        public Builder connectionProperties(GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionConnectionProperty... connectionProperties) {
            return connectionProperties(List.of(connectionProperties));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder identifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = Objects.requireNonNull(isDefault);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder metadata(GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionMetadata metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder modelType(String modelType) {
            this.modelType = Objects.requireNonNull(modelType);
            return this;
        }
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = Objects.requireNonNull(modelVersion);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = Objects.requireNonNull(objectStatus);
            return this;
        }
        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = Objects.requireNonNull(objectVersion);
            return this;
        }
        public Builder primarySchema(GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionPrimarySchema primarySchema) {
            this.primarySchema = Objects.requireNonNull(primarySchema);
            return this;
        }
        public Builder properties(Map<String,Object> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder registryMetadata(GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnectionRegistryMetadata registryMetadata) {
            this.registryMetadata = Objects.requireNonNull(registryMetadata);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnection build() {
            return new GetRegistryFoldersFolderSummaryCollectionItemDataAssetDefaultConnection(connectionProperties, description, identifier, isDefault, key, metadata, modelType, modelVersion, name, objectStatus, objectVersion, primarySchema, properties, registryMetadata, type);
        }
    }
}
