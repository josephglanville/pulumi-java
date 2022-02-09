// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.DatasetResponseDataPath;
import io.pulumi.azurenative.machinelearningservices.outputs.DatasetStateResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.UserInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetResponseLatest {
    private final @Nullable UserInfoResponse createdBy;
    private final String createdTime;
    private final @Nullable DatasetResponseDataPath dataPath;
    private final String dataflow;
    private final @Nullable DatasetStateResponse datasetDefinitionState;
    private final String datasetId;
    private final String description;
    private final String etag;
    private final String fileType;
    private final String modifiedTime;
    private final String notes;
    private final Boolean partitionFormatInPath;
    private final @Nullable Map<String,Object> properties;
    private final String savedDatasetId;
    private final Map<String,String> tags;
    private final Map<String,String> telemetryInfo;
    private final Boolean useDescriptionTagsFromDefinition;
    private final String versionId;

    @OutputCustomType.Constructor({"createdBy","createdTime","dataPath","dataflow","datasetDefinitionState","datasetId","description","etag","fileType","modifiedTime","notes","partitionFormatInPath","properties","savedDatasetId","tags","telemetryInfo","useDescriptionTagsFromDefinition","versionId"})
    private DatasetResponseLatest(
        @Nullable UserInfoResponse createdBy,
        String createdTime,
        @Nullable DatasetResponseDataPath dataPath,
        String dataflow,
        @Nullable DatasetStateResponse datasetDefinitionState,
        String datasetId,
        String description,
        String etag,
        String fileType,
        String modifiedTime,
        String notes,
        Boolean partitionFormatInPath,
        @Nullable Map<String,Object> properties,
        String savedDatasetId,
        Map<String,String> tags,
        Map<String,String> telemetryInfo,
        Boolean useDescriptionTagsFromDefinition,
        String versionId) {
        this.createdBy = createdBy;
        this.createdTime = Objects.requireNonNull(createdTime);
        this.dataPath = dataPath;
        this.dataflow = Objects.requireNonNull(dataflow);
        this.datasetDefinitionState = datasetDefinitionState;
        this.datasetId = Objects.requireNonNull(datasetId);
        this.description = Objects.requireNonNull(description);
        this.etag = Objects.requireNonNull(etag);
        this.fileType = Objects.requireNonNull(fileType);
        this.modifiedTime = Objects.requireNonNull(modifiedTime);
        this.notes = Objects.requireNonNull(notes);
        this.partitionFormatInPath = Objects.requireNonNull(partitionFormatInPath);
        this.properties = properties;
        this.savedDatasetId = Objects.requireNonNull(savedDatasetId);
        this.tags = Objects.requireNonNull(tags);
        this.telemetryInfo = Objects.requireNonNull(telemetryInfo);
        this.useDescriptionTagsFromDefinition = Objects.requireNonNull(useDescriptionTagsFromDefinition);
        this.versionId = Objects.requireNonNull(versionId);
    }

    public Optional<UserInfoResponse> getCreatedBy() {
        return Optional.ofNullable(this.createdBy);
    }
    public String getCreatedTime() {
        return this.createdTime;
    }
    public Optional<DatasetResponseDataPath> getDataPath() {
        return Optional.ofNullable(this.dataPath);
    }
    public String getDataflow() {
        return this.dataflow;
    }
    public Optional<DatasetStateResponse> getDatasetDefinitionState() {
        return Optional.ofNullable(this.datasetDefinitionState);
    }
    public String getDatasetId() {
        return this.datasetId;
    }
    public String getDescription() {
        return this.description;
    }
    public String getEtag() {
        return this.etag;
    }
    public String getFileType() {
        return this.fileType;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }
    public String getNotes() {
        return this.notes;
    }
    public Boolean getPartitionFormatInPath() {
        return this.partitionFormatInPath;
    }
    public Map<String,Object> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    public String getSavedDatasetId() {
        return this.savedDatasetId;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    public Map<String,String> getTelemetryInfo() {
        return this.telemetryInfo;
    }
    public Boolean getUseDescriptionTagsFromDefinition() {
        return this.useDescriptionTagsFromDefinition;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetResponseLatest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable UserInfoResponse createdBy;
        private String createdTime;
        private @Nullable DatasetResponseDataPath dataPath;
        private String dataflow;
        private @Nullable DatasetStateResponse datasetDefinitionState;
        private String datasetId;
        private String description;
        private String etag;
        private String fileType;
        private String modifiedTime;
        private String notes;
        private Boolean partitionFormatInPath;
        private @Nullable Map<String,Object> properties;
        private String savedDatasetId;
        private Map<String,String> tags;
        private Map<String,String> telemetryInfo;
        private Boolean useDescriptionTagsFromDefinition;
        private String versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetResponseLatest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdBy = defaults.createdBy;
    	      this.createdTime = defaults.createdTime;
    	      this.dataPath = defaults.dataPath;
    	      this.dataflow = defaults.dataflow;
    	      this.datasetDefinitionState = defaults.datasetDefinitionState;
    	      this.datasetId = defaults.datasetId;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.fileType = defaults.fileType;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.notes = defaults.notes;
    	      this.partitionFormatInPath = defaults.partitionFormatInPath;
    	      this.properties = defaults.properties;
    	      this.savedDatasetId = defaults.savedDatasetId;
    	      this.tags = defaults.tags;
    	      this.telemetryInfo = defaults.telemetryInfo;
    	      this.useDescriptionTagsFromDefinition = defaults.useDescriptionTagsFromDefinition;
    	      this.versionId = defaults.versionId;
        }

        public Builder setCreatedBy(@Nullable UserInfoResponse createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder setDataPath(@Nullable DatasetResponseDataPath dataPath) {
            this.dataPath = dataPath;
            return this;
        }

        public Builder setDataflow(String dataflow) {
            this.dataflow = Objects.requireNonNull(dataflow);
            return this;
        }

        public Builder setDatasetDefinitionState(@Nullable DatasetStateResponse datasetDefinitionState) {
            this.datasetDefinitionState = datasetDefinitionState;
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFileType(String fileType) {
            this.fileType = Objects.requireNonNull(fileType);
            return this;
        }

        public Builder setModifiedTime(String modifiedTime) {
            this.modifiedTime = Objects.requireNonNull(modifiedTime);
            return this;
        }

        public Builder setNotes(String notes) {
            this.notes = Objects.requireNonNull(notes);
            return this;
        }

        public Builder setPartitionFormatInPath(Boolean partitionFormatInPath) {
            this.partitionFormatInPath = Objects.requireNonNull(partitionFormatInPath);
            return this;
        }

        public Builder setProperties(@Nullable Map<String,Object> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setSavedDatasetId(String savedDatasetId) {
            this.savedDatasetId = Objects.requireNonNull(savedDatasetId);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setTelemetryInfo(Map<String,String> telemetryInfo) {
            this.telemetryInfo = Objects.requireNonNull(telemetryInfo);
            return this;
        }

        public Builder setUseDescriptionTagsFromDefinition(Boolean useDescriptionTagsFromDefinition) {
            this.useDescriptionTagsFromDefinition = Objects.requireNonNull(useDescriptionTagsFromDefinition);
            return this;
        }

        public Builder setVersionId(String versionId) {
            this.versionId = Objects.requireNonNull(versionId);
            return this;
        }

        public DatasetResponseLatest build() {
            return new DatasetResponseLatest(createdBy, createdTime, dataPath, dataflow, datasetDefinitionState, datasetId, description, etag, fileType, modifiedTime, notes, partitionFormatInPath, properties, savedDatasetId, tags, telemetryInfo, useDescriptionTagsFromDefinition, versionId);
        }
    }
}
