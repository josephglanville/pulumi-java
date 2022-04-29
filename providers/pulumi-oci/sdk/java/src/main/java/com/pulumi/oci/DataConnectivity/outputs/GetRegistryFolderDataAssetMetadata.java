// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataConnectivity.outputs.GetRegistryFolderDataAssetMetadataAggregator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRegistryFolderDataAssetMetadata {
    /**
     * @return The owning object&#39;s key for this object.
     * 
     */
    private final String aggregatorKey;
    /**
     * @return A summary type containing information about the object&#39;s aggregator including its type, key, name and description.
     * 
     */
    private final List<GetRegistryFolderDataAssetMetadataAggregator> aggregators;
    /**
     * @return The user that created the object.
     * 
     */
    private final String createdBy;
    /**
     * @return The user that created the object.
     * 
     */
    private final String createdByName;
    /**
     * @return The full path to identify this object.
     * 
     */
    private final String identifierPath;
    /**
     * @return Information property fields.
     * 
     */
    private final Map<String,Object> infoFields;
    /**
     * @return Specifies whether this object is a favorite or not.
     * 
     */
    private final Boolean isFavorite;
    /**
     * @return Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
     * 
     */
    private final List<String> labels;
    /**
     * @return The registry version.
     * 
     */
    private final Integer registryVersion;
    /**
     * @return The date and time that the object was created.
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time that the object was updated.
     * 
     */
    private final String timeUpdated;
    /**
     * @return The user that updated the object.
     * 
     */
    private final String updatedBy;
    /**
     * @return The user that updated the object.
     * 
     */
    private final String updatedByName;

    @CustomType.Constructor
    private GetRegistryFolderDataAssetMetadata(
        @CustomType.Parameter("aggregatorKey") String aggregatorKey,
        @CustomType.Parameter("aggregators") List<GetRegistryFolderDataAssetMetadataAggregator> aggregators,
        @CustomType.Parameter("createdBy") String createdBy,
        @CustomType.Parameter("createdByName") String createdByName,
        @CustomType.Parameter("identifierPath") String identifierPath,
        @CustomType.Parameter("infoFields") Map<String,Object> infoFields,
        @CustomType.Parameter("isFavorite") Boolean isFavorite,
        @CustomType.Parameter("labels") List<String> labels,
        @CustomType.Parameter("registryVersion") Integer registryVersion,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated,
        @CustomType.Parameter("updatedBy") String updatedBy,
        @CustomType.Parameter("updatedByName") String updatedByName) {
        this.aggregatorKey = aggregatorKey;
        this.aggregators = aggregators;
        this.createdBy = createdBy;
        this.createdByName = createdByName;
        this.identifierPath = identifierPath;
        this.infoFields = infoFields;
        this.isFavorite = isFavorite;
        this.labels = labels;
        this.registryVersion = registryVersion;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.updatedBy = updatedBy;
        this.updatedByName = updatedByName;
    }

    /**
     * @return The owning object&#39;s key for this object.
     * 
     */
    public String aggregatorKey() {
        return this.aggregatorKey;
    }
    /**
     * @return A summary type containing information about the object&#39;s aggregator including its type, key, name and description.
     * 
     */
    public List<GetRegistryFolderDataAssetMetadataAggregator> aggregators() {
        return this.aggregators;
    }
    /**
     * @return The user that created the object.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return The user that created the object.
     * 
     */
    public String createdByName() {
        return this.createdByName;
    }
    /**
     * @return The full path to identify this object.
     * 
     */
    public String identifierPath() {
        return this.identifierPath;
    }
    /**
     * @return Information property fields.
     * 
     */
    public Map<String,Object> infoFields() {
        return this.infoFields;
    }
    /**
     * @return Specifies whether this object is a favorite or not.
     * 
     */
    public Boolean isFavorite() {
        return this.isFavorite;
    }
    /**
     * @return Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
     * 
     */
    public List<String> labels() {
        return this.labels;
    }
    /**
     * @return The registry version.
     * 
     */
    public Integer registryVersion() {
        return this.registryVersion;
    }
    /**
     * @return The date and time that the object was created.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time that the object was updated.
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * @return The user that updated the object.
     * 
     */
    public String updatedBy() {
        return this.updatedBy;
    }
    /**
     * @return The user that updated the object.
     * 
     */
    public String updatedByName() {
        return this.updatedByName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryFolderDataAssetMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregatorKey;
        private List<GetRegistryFolderDataAssetMetadataAggregator> aggregators;
        private String createdBy;
        private String createdByName;
        private String identifierPath;
        private Map<String,Object> infoFields;
        private Boolean isFavorite;
        private List<String> labels;
        private Integer registryVersion;
        private String timeCreated;
        private String timeUpdated;
        private String updatedBy;
        private String updatedByName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryFolderDataAssetMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregatorKey = defaults.aggregatorKey;
    	      this.aggregators = defaults.aggregators;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByName = defaults.createdByName;
    	      this.identifierPath = defaults.identifierPath;
    	      this.infoFields = defaults.infoFields;
    	      this.isFavorite = defaults.isFavorite;
    	      this.labels = defaults.labels;
    	      this.registryVersion = defaults.registryVersion;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
    	      this.updatedBy = defaults.updatedBy;
    	      this.updatedByName = defaults.updatedByName;
        }

        public Builder aggregatorKey(String aggregatorKey) {
            this.aggregatorKey = Objects.requireNonNull(aggregatorKey);
            return this;
        }
        public Builder aggregators(List<GetRegistryFolderDataAssetMetadataAggregator> aggregators) {
            this.aggregators = Objects.requireNonNull(aggregators);
            return this;
        }
        public Builder aggregators(GetRegistryFolderDataAssetMetadataAggregator... aggregators) {
            return aggregators(List.of(aggregators));
        }
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        public Builder createdByName(String createdByName) {
            this.createdByName = Objects.requireNonNull(createdByName);
            return this;
        }
        public Builder identifierPath(String identifierPath) {
            this.identifierPath = Objects.requireNonNull(identifierPath);
            return this;
        }
        public Builder infoFields(Map<String,Object> infoFields) {
            this.infoFields = Objects.requireNonNull(infoFields);
            return this;
        }
        public Builder isFavorite(Boolean isFavorite) {
            this.isFavorite = Objects.requireNonNull(isFavorite);
            return this;
        }
        public Builder labels(List<String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }
        public Builder registryVersion(Integer registryVersion) {
            this.registryVersion = Objects.requireNonNull(registryVersion);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = Objects.requireNonNull(updatedBy);
            return this;
        }
        public Builder updatedByName(String updatedByName) {
            this.updatedByName = Objects.requireNonNull(updatedByName);
            return this;
        }        public GetRegistryFolderDataAssetMetadata build() {
            return new GetRegistryFolderDataAssetMetadata(aggregatorKey, aggregators, createdBy, createdByName, identifierPath, infoFields, isFavorite, labels, registryVersion, timeCreated, timeUpdated, updatedBy, updatedByName);
        }
    }
}
