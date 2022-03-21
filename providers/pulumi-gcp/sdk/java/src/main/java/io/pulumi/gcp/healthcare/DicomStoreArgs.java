// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.healthcare.inputs.DicomStoreNotificationConfigArgs;
import io.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DicomStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final DicomStoreArgs Empty = new DicomStoreArgs();

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * 
     */
    @Import(name="dataset", required=true)
      private final Output<String> dataset;

    public Output<String> getDataset() {
        return this.dataset;
    }

    /**
     * User-supplied key-value pairs used to organize DICOM stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The resource name for the DicomStore.
     * ** Changing this property may recreate the Dicom store (removing all data) **
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="notificationConfig")
      private final @Nullable Output<DicomStoreNotificationConfigArgs> notificationConfig;

    public Output<DicomStoreNotificationConfigArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Output.empty() : this.notificationConfig;
    }

    /**
     * To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
     * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
     * Structure is documented below.
     * 
     */
    @Import(name="streamConfigs")
      private final @Nullable Output<List<DicomStoreStreamConfigArgs>> streamConfigs;

    public Output<List<DicomStoreStreamConfigArgs>> getStreamConfigs() {
        return this.streamConfigs == null ? Output.empty() : this.streamConfigs;
    }

    public DicomStoreArgs(
        Output<String> dataset,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<DicomStoreNotificationConfigArgs> notificationConfig,
        @Nullable Output<List<DicomStoreStreamConfigArgs>> streamConfigs) {
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.labels = labels;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.streamConfigs = streamConfigs;
    }

    private DicomStoreArgs() {
        this.dataset = Output.empty();
        this.labels = Output.empty();
        this.name = Output.empty();
        this.notificationConfig = Output.empty();
        this.streamConfigs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dataset;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<DicomStoreNotificationConfigArgs> notificationConfig;
        private @Nullable Output<List<DicomStoreStreamConfigArgs>> streamConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.streamConfigs = defaults.streamConfigs;
        }

        public Builder dataset(Output<String> dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }
        public Builder dataset(String dataset) {
            this.dataset = Output.of(Objects.requireNonNull(dataset));
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder notificationConfig(@Nullable Output<DicomStoreNotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }
        public Builder notificationConfig(@Nullable DicomStoreNotificationConfigArgs notificationConfig) {
            this.notificationConfig = Output.ofNullable(notificationConfig);
            return this;
        }
        public Builder streamConfigs(@Nullable Output<List<DicomStoreStreamConfigArgs>> streamConfigs) {
            this.streamConfigs = streamConfigs;
            return this;
        }
        public Builder streamConfigs(@Nullable List<DicomStoreStreamConfigArgs> streamConfigs) {
            this.streamConfigs = Output.ofNullable(streamConfigs);
            return this;
        }
        public Builder streamConfigs(DicomStoreStreamConfigArgs... streamConfigs) {
            return streamConfigs(List.of(streamConfigs));
        }        public DicomStoreArgs build() {
            return new DicomStoreArgs(dataset, labels, name, notificationConfig, streamConfigs);
        }
    }
}
