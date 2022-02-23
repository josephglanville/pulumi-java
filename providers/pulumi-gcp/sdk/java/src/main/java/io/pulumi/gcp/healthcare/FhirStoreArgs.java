// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs;
import io.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreArgs Empty = new FhirStoreArgs();

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * 
     */
    @InputImport(name="dataset", required=true)
      private final Input<String> dataset;

    public Input<String> getDataset() {
        return this.dataset;
    }

    /**
     * Whether to disable referential integrity in this FHIR store. This field is immutable after FHIR store
     * creation. The default value is false, meaning that the API will enforce referential integrity and fail the
     * requests that will result in inconsistent state in the FHIR store. When this field is set to true, the API
     * will skip referential integrity check. Consequently, operations that rely on references, such as
     * Patient.get$everything, will not return all the results if broken references exist.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * 
     */
    @InputImport(name="disableReferentialIntegrity")
      private final @Nullable Input<Boolean> disableReferentialIntegrity;

    public Input<Boolean> getDisableReferentialIntegrity() {
        return this.disableReferentialIntegrity == null ? Input.empty() : this.disableReferentialIntegrity;
    }

    /**
     * Whether to disable resource versioning for this FHIR store. This field can not be changed after the creation
     * of FHIR store. If set to false, which is the default behavior, all write operations will cause historical
     * versions to be recorded automatically. The historical versions can be fetched through the history APIs, but
     * cannot be updated. If set to true, no historical versions will be kept. The server will send back errors for
     * attempts to read the historical versions.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * 
     */
    @InputImport(name="disableResourceVersioning")
      private final @Nullable Input<Boolean> disableResourceVersioning;

    public Input<Boolean> getDisableResourceVersioning() {
        return this.disableResourceVersioning == null ? Input.empty() : this.disableResourceVersioning;
    }

    /**
     * Whether to allow the bulk import API to accept history bundles and directly insert historical resource
     * versions into the FHIR store. Importing resource histories creates resource interactions that appear to have
     * occurred in the past, which clients may not want to allow. If set to false, history bundles within an import
     * will fail with an error.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * ** This property can be changed manually in the Google Cloud Healthcare admin console without recreating the FHIR store **
     * 
     */
    @InputImport(name="enableHistoryImport")
      private final @Nullable Input<Boolean> enableHistoryImport;

    public Input<Boolean> getEnableHistoryImport() {
        return this.enableHistoryImport == null ? Input.empty() : this.enableHistoryImport;
    }

    /**
     * Whether this FHIR store has the updateCreate capability. This determines if the client can use an Update
     * operation to create a new resource with a client-specified ID. If false, all IDs are server-assigned through
     * the Create operation and attempts to Update a non-existent resource will return errors. Please treat the audit
     * logs with appropriate levels of care if client-specified resource IDs contain sensitive data such as patient
     * identifiers, those IDs will be part of the FHIR resource path recorded in Cloud audit logs and Cloud Pub/Sub
     * notifications.
     * 
     */
    @InputImport(name="enableUpdateCreate")
      private final @Nullable Input<Boolean> enableUpdateCreate;

    public Input<Boolean> getEnableUpdateCreate() {
        return this.enableUpdateCreate == null ? Input.empty() : this.enableUpdateCreate;
    }

    /**
     * User-supplied key-value pairs used to organize FHIR stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The resource name for the FhirStore.
     * ** Changing this property may recreate the FHIR store (removing all data) **
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="notificationConfig")
      private final @Nullable Input<FhirStoreNotificationConfigArgs> notificationConfig;

    public Input<FhirStoreNotificationConfigArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Input.empty() : this.notificationConfig;
    }

    /**
     * A list of streaming configs that configure the destinations of streaming export for every resource mutation in
     * this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next
     * resource mutation is streamed to the new location in addition to the existing ones. When a location is removed
     * from the list, the server stops streaming to that location. Before adding a new config, you must add the required
     * bigquery.dataEditor role to your project's Cloud Healthcare Service Agent service account. Some lag (typically on
     * the order of dozens of seconds) is expected before the results show up in the streaming destination.
     * Structure is documented below.
     * 
     */
    @InputImport(name="streamConfigs")
      private final @Nullable Input<List<FhirStoreStreamConfigArgs>> streamConfigs;

    public Input<List<FhirStoreStreamConfigArgs>> getStreamConfigs() {
        return this.streamConfigs == null ? Input.empty() : this.streamConfigs;
    }

    /**
     * The FHIR specification version.
     * Default value is `STU3`.
     * Possible values are `DSTU2`, `STU3`, and `R4`.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public FhirStoreArgs(
        Input<String> dataset,
        @Nullable Input<Boolean> disableReferentialIntegrity,
        @Nullable Input<Boolean> disableResourceVersioning,
        @Nullable Input<Boolean> enableHistoryImport,
        @Nullable Input<Boolean> enableUpdateCreate,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<FhirStoreNotificationConfigArgs> notificationConfig,
        @Nullable Input<List<FhirStoreStreamConfigArgs>> streamConfigs,
        @Nullable Input<String> version) {
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.disableReferentialIntegrity = disableReferentialIntegrity;
        this.disableResourceVersioning = disableResourceVersioning;
        this.enableHistoryImport = enableHistoryImport;
        this.enableUpdateCreate = enableUpdateCreate;
        this.labels = labels;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.streamConfigs = streamConfigs;
        this.version = version;
    }

    private FhirStoreArgs() {
        this.dataset = Input.empty();
        this.disableReferentialIntegrity = Input.empty();
        this.disableResourceVersioning = Input.empty();
        this.enableHistoryImport = Input.empty();
        this.enableUpdateCreate = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.notificationConfig = Input.empty();
        this.streamConfigs = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> dataset;
        private @Nullable Input<Boolean> disableReferentialIntegrity;
        private @Nullable Input<Boolean> disableResourceVersioning;
        private @Nullable Input<Boolean> enableHistoryImport;
        private @Nullable Input<Boolean> enableUpdateCreate;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<FhirStoreNotificationConfigArgs> notificationConfig;
        private @Nullable Input<List<FhirStoreStreamConfigArgs>> streamConfigs;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.disableReferentialIntegrity = defaults.disableReferentialIntegrity;
    	      this.disableResourceVersioning = defaults.disableResourceVersioning;
    	      this.enableHistoryImport = defaults.enableHistoryImport;
    	      this.enableUpdateCreate = defaults.enableUpdateCreate;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.streamConfigs = defaults.streamConfigs;
    	      this.version = defaults.version;
        }

        public Builder setDataset(Input<String> dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }

        public Builder setDataset(String dataset) {
            this.dataset = Input.of(Objects.requireNonNull(dataset));
            return this;
        }

        public Builder setDisableReferentialIntegrity(@Nullable Input<Boolean> disableReferentialIntegrity) {
            this.disableReferentialIntegrity = disableReferentialIntegrity;
            return this;
        }

        public Builder setDisableReferentialIntegrity(@Nullable Boolean disableReferentialIntegrity) {
            this.disableReferentialIntegrity = Input.ofNullable(disableReferentialIntegrity);
            return this;
        }

        public Builder setDisableResourceVersioning(@Nullable Input<Boolean> disableResourceVersioning) {
            this.disableResourceVersioning = disableResourceVersioning;
            return this;
        }

        public Builder setDisableResourceVersioning(@Nullable Boolean disableResourceVersioning) {
            this.disableResourceVersioning = Input.ofNullable(disableResourceVersioning);
            return this;
        }

        public Builder setEnableHistoryImport(@Nullable Input<Boolean> enableHistoryImport) {
            this.enableHistoryImport = enableHistoryImport;
            return this;
        }

        public Builder setEnableHistoryImport(@Nullable Boolean enableHistoryImport) {
            this.enableHistoryImport = Input.ofNullable(enableHistoryImport);
            return this;
        }

        public Builder setEnableUpdateCreate(@Nullable Input<Boolean> enableUpdateCreate) {
            this.enableUpdateCreate = enableUpdateCreate;
            return this;
        }

        public Builder setEnableUpdateCreate(@Nullable Boolean enableUpdateCreate) {
            this.enableUpdateCreate = Input.ofNullable(enableUpdateCreate);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNotificationConfig(@Nullable Input<FhirStoreNotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        public Builder setNotificationConfig(@Nullable FhirStoreNotificationConfigArgs notificationConfig) {
            this.notificationConfig = Input.ofNullable(notificationConfig);
            return this;
        }

        public Builder setStreamConfigs(@Nullable Input<List<FhirStoreStreamConfigArgs>> streamConfigs) {
            this.streamConfigs = streamConfigs;
            return this;
        }

        public Builder setStreamConfigs(@Nullable List<FhirStoreStreamConfigArgs> streamConfigs) {
            this.streamConfigs = Input.ofNullable(streamConfigs);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public FhirStoreArgs build() {
            return new FhirStoreArgs(dataset, disableReferentialIntegrity, disableResourceVersioning, enableHistoryImport, enableUpdateCreate, labels, name, notificationConfig, streamConfigs, version);
        }
    }
}
