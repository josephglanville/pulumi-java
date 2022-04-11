// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.healthcare_v1.inputs.NotificationConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DicomStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final DicomStoreArgs Empty = new DicomStoreArgs();

    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }

    @Import(name="dicomStoreId")
      private final @Nullable Output<String> dicomStoreId;

    public Output<String> getDicomStoreId() {
        return this.dicomStoreId == null ? Codegen.empty() : this.dicomStoreId;
    }

    /**
     * User-supplied key-value pairs used to organize DICOM stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Resource name of the DICOM store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Notification destination for new DICOM instances. Supplied by the client.
     * 
     */
    @Import(name="notificationConfig")
      private final @Nullable Output<NotificationConfigArgs> notificationConfig;

    public Output<NotificationConfigArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Codegen.empty() : this.notificationConfig;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public DicomStoreArgs(
        Output<String> datasetId,
        @Nullable Output<String> dicomStoreId,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<NotificationConfigArgs> notificationConfig,
        @Nullable Output<String> project) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.dicomStoreId = dicomStoreId;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.project = project;
    }

    private DicomStoreArgs() {
        this.datasetId = Codegen.empty();
        this.dicomStoreId = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.notificationConfig = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> datasetId;
        private @Nullable Output<String> dicomStoreId;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<NotificationConfigArgs> notificationConfig;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.dicomStoreId = defaults.dicomStoreId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.project = defaults.project;
        }

        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder dicomStoreId(@Nullable Output<String> dicomStoreId) {
            this.dicomStoreId = dicomStoreId;
            return this;
        }
        public Builder dicomStoreId(@Nullable String dicomStoreId) {
            this.dicomStoreId = Codegen.ofNullable(dicomStoreId);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder notificationConfig(@Nullable Output<NotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }
        public Builder notificationConfig(@Nullable NotificationConfigArgs notificationConfig) {
            this.notificationConfig = Codegen.ofNullable(notificationConfig);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public DicomStoreArgs build() {
            return new DicomStoreArgs(datasetId, dicomStoreId, labels, location, name, notificationConfig, project);
        }
    }
}
