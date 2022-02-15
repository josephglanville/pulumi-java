// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.DatasetAccessGetArgs;
import io.pulumi.gcp.bigquery.inputs.DatasetDefaultEncryptionConfigurationGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetState extends io.pulumi.resources.ResourceArgs {

    public static final DatasetState Empty = new DatasetState();

    @InputImport(name="accesses")
    private final @Nullable Input<List<DatasetAccessGetArgs>> accesses;

    public Input<List<DatasetAccessGetArgs>> getAccesses() {
        return this.accesses == null ? Input.empty() : this.accesses;
    }

    @InputImport(name="creationTime")
    private final @Nullable Input<Integer> creationTime;

    public Input<Integer> getCreationTime() {
        return this.creationTime == null ? Input.empty() : this.creationTime;
    }

    @InputImport(name="datasetId")
    private final @Nullable Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId == null ? Input.empty() : this.datasetId;
    }

    @InputImport(name="defaultEncryptionConfiguration")
    private final @Nullable Input<DatasetDefaultEncryptionConfigurationGetArgs> defaultEncryptionConfiguration;

    public Input<DatasetDefaultEncryptionConfigurationGetArgs> getDefaultEncryptionConfiguration() {
        return this.defaultEncryptionConfiguration == null ? Input.empty() : this.defaultEncryptionConfiguration;
    }

    @InputImport(name="defaultPartitionExpirationMs")
    private final @Nullable Input<Integer> defaultPartitionExpirationMs;

    public Input<Integer> getDefaultPartitionExpirationMs() {
        return this.defaultPartitionExpirationMs == null ? Input.empty() : this.defaultPartitionExpirationMs;
    }

    @InputImport(name="defaultTableExpirationMs")
    private final @Nullable Input<Integer> defaultTableExpirationMs;

    public Input<Integer> getDefaultTableExpirationMs() {
        return this.defaultTableExpirationMs == null ? Input.empty() : this.defaultTableExpirationMs;
    }

    @InputImport(name="deleteContentsOnDestroy")
    private final @Nullable Input<Boolean> deleteContentsOnDestroy;

    public Input<Boolean> getDeleteContentsOnDestroy() {
        return this.deleteContentsOnDestroy == null ? Input.empty() : this.deleteContentsOnDestroy;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="friendlyName")
    private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="lastModifiedTime")
    private final @Nullable Input<Integer> lastModifiedTime;

    public Input<Integer> getLastModifiedTime() {
        return this.lastModifiedTime == null ? Input.empty() : this.lastModifiedTime;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="selfLink")
    private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    public DatasetState(
        @Nullable Input<List<DatasetAccessGetArgs>> accesses,
        @Nullable Input<Integer> creationTime,
        @Nullable Input<String> datasetId,
        @Nullable Input<DatasetDefaultEncryptionConfigurationGetArgs> defaultEncryptionConfiguration,
        @Nullable Input<Integer> defaultPartitionExpirationMs,
        @Nullable Input<Integer> defaultTableExpirationMs,
        @Nullable Input<Boolean> deleteContentsOnDestroy,
        @Nullable Input<String> description,
        @Nullable Input<String> etag,
        @Nullable Input<String> friendlyName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<Integer> lastModifiedTime,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<String> selfLink) {
        this.accesses = accesses;
        this.creationTime = creationTime;
        this.datasetId = datasetId;
        this.defaultEncryptionConfiguration = defaultEncryptionConfiguration;
        this.defaultPartitionExpirationMs = defaultPartitionExpirationMs;
        this.defaultTableExpirationMs = defaultTableExpirationMs;
        this.deleteContentsOnDestroy = deleteContentsOnDestroy;
        this.description = description;
        this.etag = etag;
        this.friendlyName = friendlyName;
        this.labels = labels;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.project = project;
        this.selfLink = selfLink;
    }

    private DatasetState() {
        this.accesses = Input.empty();
        this.creationTime = Input.empty();
        this.datasetId = Input.empty();
        this.defaultEncryptionConfiguration = Input.empty();
        this.defaultPartitionExpirationMs = Input.empty();
        this.defaultTableExpirationMs = Input.empty();
        this.deleteContentsOnDestroy = Input.empty();
        this.description = Input.empty();
        this.etag = Input.empty();
        this.friendlyName = Input.empty();
        this.labels = Input.empty();
        this.lastModifiedTime = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.selfLink = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DatasetAccessGetArgs>> accesses;
        private @Nullable Input<Integer> creationTime;
        private @Nullable Input<String> datasetId;
        private @Nullable Input<DatasetDefaultEncryptionConfigurationGetArgs> defaultEncryptionConfiguration;
        private @Nullable Input<Integer> defaultPartitionExpirationMs;
        private @Nullable Input<Integer> defaultTableExpirationMs;
        private @Nullable Input<Boolean> deleteContentsOnDestroy;
        private @Nullable Input<String> description;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<Integer> lastModifiedTime;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<String> selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accesses = defaults.accesses;
    	      this.creationTime = defaults.creationTime;
    	      this.datasetId = defaults.datasetId;
    	      this.defaultEncryptionConfiguration = defaults.defaultEncryptionConfiguration;
    	      this.defaultPartitionExpirationMs = defaults.defaultPartitionExpirationMs;
    	      this.defaultTableExpirationMs = defaults.defaultTableExpirationMs;
    	      this.deleteContentsOnDestroy = defaults.deleteContentsOnDestroy;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.friendlyName = defaults.friendlyName;
    	      this.labels = defaults.labels;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder setAccesses(@Nullable Input<List<DatasetAccessGetArgs>> accesses) {
            this.accesses = accesses;
            return this;
        }

        public Builder setAccesses(@Nullable List<DatasetAccessGetArgs> accesses) {
            this.accesses = Input.ofNullable(accesses);
            return this;
        }

        public Builder setCreationTime(@Nullable Input<Integer> creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setCreationTime(@Nullable Integer creationTime) {
            this.creationTime = Input.ofNullable(creationTime);
            return this;
        }

        public Builder setDatasetId(@Nullable Input<String> datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        public Builder setDatasetId(@Nullable String datasetId) {
            this.datasetId = Input.ofNullable(datasetId);
            return this;
        }

        public Builder setDefaultEncryptionConfiguration(@Nullable Input<DatasetDefaultEncryptionConfigurationGetArgs> defaultEncryptionConfiguration) {
            this.defaultEncryptionConfiguration = defaultEncryptionConfiguration;
            return this;
        }

        public Builder setDefaultEncryptionConfiguration(@Nullable DatasetDefaultEncryptionConfigurationGetArgs defaultEncryptionConfiguration) {
            this.defaultEncryptionConfiguration = Input.ofNullable(defaultEncryptionConfiguration);
            return this;
        }

        public Builder setDefaultPartitionExpirationMs(@Nullable Input<Integer> defaultPartitionExpirationMs) {
            this.defaultPartitionExpirationMs = defaultPartitionExpirationMs;
            return this;
        }

        public Builder setDefaultPartitionExpirationMs(@Nullable Integer defaultPartitionExpirationMs) {
            this.defaultPartitionExpirationMs = Input.ofNullable(defaultPartitionExpirationMs);
            return this;
        }

        public Builder setDefaultTableExpirationMs(@Nullable Input<Integer> defaultTableExpirationMs) {
            this.defaultTableExpirationMs = defaultTableExpirationMs;
            return this;
        }

        public Builder setDefaultTableExpirationMs(@Nullable Integer defaultTableExpirationMs) {
            this.defaultTableExpirationMs = Input.ofNullable(defaultTableExpirationMs);
            return this;
        }

        public Builder setDeleteContentsOnDestroy(@Nullable Input<Boolean> deleteContentsOnDestroy) {
            this.deleteContentsOnDestroy = deleteContentsOnDestroy;
            return this;
        }

        public Builder setDeleteContentsOnDestroy(@Nullable Boolean deleteContentsOnDestroy) {
            this.deleteContentsOnDestroy = Input.ofNullable(deleteContentsOnDestroy);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLastModifiedTime(@Nullable Input<Integer> lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder setLastModifiedTime(@Nullable Integer lastModifiedTime) {
            this.lastModifiedTime = Input.ofNullable(lastModifiedTime);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public DatasetState build() {
            return new DatasetState(accesses, creationTime, datasetId, defaultEncryptionConfiguration, defaultPartitionExpirationMs, defaultTableExpirationMs, deleteContentsOnDestroy, description, etag, friendlyName, labels, lastModifiedTime, location, project, selfLink);
        }
    }
}