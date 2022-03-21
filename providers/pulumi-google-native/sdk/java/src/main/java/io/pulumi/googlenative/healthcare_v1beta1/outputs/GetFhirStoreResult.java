// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.NotificationConfigResponse;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.SearchConfigResponse;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.StreamConfigResponse;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.ValidationConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetFhirStoreResult {
    /**
     * If true, overrides the default search behavior for this FHIR store to `handling=strict` which returns an error for unrecognized search parameters. If false, uses the FHIR specification default `handling=lenient` which ignores unrecognized search parameters. The handling can always be changed from the default on an individual API call by setting the HTTP header `Prefer: handling=strict` or `Prefer: handling=lenient`.
     * 
     */
    private final Boolean defaultSearchHandlingStrict;
    /**
     * Immutable. Whether to disable referential integrity in this FHIR store. This field is immutable after FHIR store creation. The default value is false, meaning that the API enforces referential integrity and fails the requests that result in inconsistent state in the FHIR store. When this field is set to true, the API skips referential integrity checks. Consequently, operations that rely on references, such as GetPatientEverything, do not return all the results if broken references exist.
     * 
     */
    private final Boolean disableReferentialIntegrity;
    /**
     * Immutable. Whether to disable resource versioning for this FHIR store. This field can not be changed after the creation of FHIR store. If set to false, which is the default behavior, all write operations cause historical versions to be recorded automatically. The historical versions can be fetched through the history APIs, but cannot be updated. If set to true, no historical versions are kept. The server sends errors for attempts to read the historical versions.
     * 
     */
    private final Boolean disableResourceVersioning;
    /**
     * Whether this FHIR store has the [updateCreate capability](https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.rest.resource.updateCreate). This determines if the client can use an Update operation to create a new resource with a client-specified ID. If false, all IDs are server-assigned through the Create operation and attempts to update a non-existent resource return errors. It is strongly advised not to include or encode any sensitive data such as patient identifiers in client-specified resource IDs. Those IDs are part of the FHIR resource path recorded in Cloud audit logs and Pub/Sub notifications. Those IDs can also be contained in reference fields within other resources.
     * 
     */
    private final Boolean enableUpdateCreate;
    /**
     * User-supplied key-value pairs used to organize FHIR stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Resource name of the FHIR store, of the form `projects/{project_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
     * 
     */
    private final String name;
    /**
     * If non-empty, publish all resource modifications of this FHIR store to this destination. The Pub/Sub message attributes contain a map with a string describing the action that has triggered the notification. For example, "action":"CreateResource".
     * 
     */
    private final NotificationConfigResponse notificationConfig;
    /**
     * Configuration for how FHIR resource can be searched.
     * 
     */
    private final SearchConfigResponse searchConfig;
    /**
     * A list of streaming configs that configure the destinations of streaming export for every resource mutation in this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next resource mutation is streamed to the new location in addition to the existing ones. When a location is removed from the list, the server stops streaming to that location. Before adding a new config, you must add the required [`bigquery.dataEditor`](https://cloud.google.com/bigquery/docs/access-control#bigquery.dataEditor) role to your project's **Cloud Healthcare Service Agent** [service account](https://cloud.google.com/iam/docs/service-accounts). Some lag (typically on the order of dozens of seconds) is expected before the results show up in the streaming destination.
     * 
     */
    private final List<StreamConfigResponse> streamConfigs;
    /**
     * Configuration for how to validate incoming FHIR resources against configured profiles.
     * 
     */
    private final ValidationConfigResponse validationConfig;
    /**
     * Immutable. The FHIR specification version that this FHIR store supports natively. This field is immutable after store creation. Requests are rejected if they contain FHIR resources of a different version. Version is required for every FHIR store.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetFhirStoreResult(
        @CustomType.Parameter("defaultSearchHandlingStrict") Boolean defaultSearchHandlingStrict,
        @CustomType.Parameter("disableReferentialIntegrity") Boolean disableReferentialIntegrity,
        @CustomType.Parameter("disableResourceVersioning") Boolean disableResourceVersioning,
        @CustomType.Parameter("enableUpdateCreate") Boolean enableUpdateCreate,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notificationConfig") NotificationConfigResponse notificationConfig,
        @CustomType.Parameter("searchConfig") SearchConfigResponse searchConfig,
        @CustomType.Parameter("streamConfigs") List<StreamConfigResponse> streamConfigs,
        @CustomType.Parameter("validationConfig") ValidationConfigResponse validationConfig,
        @CustomType.Parameter("version") String version) {
        this.defaultSearchHandlingStrict = defaultSearchHandlingStrict;
        this.disableReferentialIntegrity = disableReferentialIntegrity;
        this.disableResourceVersioning = disableResourceVersioning;
        this.enableUpdateCreate = enableUpdateCreate;
        this.labels = labels;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.searchConfig = searchConfig;
        this.streamConfigs = streamConfigs;
        this.validationConfig = validationConfig;
        this.version = version;
    }

    /**
     * If true, overrides the default search behavior for this FHIR store to `handling=strict` which returns an error for unrecognized search parameters. If false, uses the FHIR specification default `handling=lenient` which ignores unrecognized search parameters. The handling can always be changed from the default on an individual API call by setting the HTTP header `Prefer: handling=strict` or `Prefer: handling=lenient`.
     * 
    */
    public Boolean getDefaultSearchHandlingStrict() {
        return this.defaultSearchHandlingStrict;
    }
    /**
     * Immutable. Whether to disable referential integrity in this FHIR store. This field is immutable after FHIR store creation. The default value is false, meaning that the API enforces referential integrity and fails the requests that result in inconsistent state in the FHIR store. When this field is set to true, the API skips referential integrity checks. Consequently, operations that rely on references, such as GetPatientEverything, do not return all the results if broken references exist.
     * 
    */
    public Boolean getDisableReferentialIntegrity() {
        return this.disableReferentialIntegrity;
    }
    /**
     * Immutable. Whether to disable resource versioning for this FHIR store. This field can not be changed after the creation of FHIR store. If set to false, which is the default behavior, all write operations cause historical versions to be recorded automatically. The historical versions can be fetched through the history APIs, but cannot be updated. If set to true, no historical versions are kept. The server sends errors for attempts to read the historical versions.
     * 
    */
    public Boolean getDisableResourceVersioning() {
        return this.disableResourceVersioning;
    }
    /**
     * Whether this FHIR store has the [updateCreate capability](https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.rest.resource.updateCreate). This determines if the client can use an Update operation to create a new resource with a client-specified ID. If false, all IDs are server-assigned through the Create operation and attempts to update a non-existent resource return errors. It is strongly advised not to include or encode any sensitive data such as patient identifiers in client-specified resource IDs. Those IDs are part of the FHIR resource path recorded in Cloud audit logs and Pub/Sub notifications. Those IDs can also be contained in reference fields within other resources.
     * 
    */
    public Boolean getEnableUpdateCreate() {
        return this.enableUpdateCreate;
    }
    /**
     * User-supplied key-value pairs used to organize FHIR stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Resource name of the FHIR store, of the form `projects/{project_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * If non-empty, publish all resource modifications of this FHIR store to this destination. The Pub/Sub message attributes contain a map with a string describing the action that has triggered the notification. For example, "action":"CreateResource".
     * 
    */
    public NotificationConfigResponse getNotificationConfig() {
        return this.notificationConfig;
    }
    /**
     * Configuration for how FHIR resource can be searched.
     * 
    */
    public SearchConfigResponse getSearchConfig() {
        return this.searchConfig;
    }
    /**
     * A list of streaming configs that configure the destinations of streaming export for every resource mutation in this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next resource mutation is streamed to the new location in addition to the existing ones. When a location is removed from the list, the server stops streaming to that location. Before adding a new config, you must add the required [`bigquery.dataEditor`](https://cloud.google.com/bigquery/docs/access-control#bigquery.dataEditor) role to your project's **Cloud Healthcare Service Agent** [service account](https://cloud.google.com/iam/docs/service-accounts). Some lag (typically on the order of dozens of seconds) is expected before the results show up in the streaming destination.
     * 
    */
    public List<StreamConfigResponse> getStreamConfigs() {
        return this.streamConfigs;
    }
    /**
     * Configuration for how to validate incoming FHIR resources against configured profiles.
     * 
    */
    public ValidationConfigResponse getValidationConfig() {
        return this.validationConfig;
    }
    /**
     * Immutable. The FHIR specification version that this FHIR store supports natively. This field is immutable after store creation. Requests are rejected if they contain FHIR resources of a different version. Version is required for every FHIR store.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFhirStoreResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean defaultSearchHandlingStrict;
        private Boolean disableReferentialIntegrity;
        private Boolean disableResourceVersioning;
        private Boolean enableUpdateCreate;
        private Map<String,String> labels;
        private String name;
        private NotificationConfigResponse notificationConfig;
        private SearchConfigResponse searchConfig;
        private List<StreamConfigResponse> streamConfigs;
        private ValidationConfigResponse validationConfig;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFhirStoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultSearchHandlingStrict = defaults.defaultSearchHandlingStrict;
    	      this.disableReferentialIntegrity = defaults.disableReferentialIntegrity;
    	      this.disableResourceVersioning = defaults.disableResourceVersioning;
    	      this.enableUpdateCreate = defaults.enableUpdateCreate;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.searchConfig = defaults.searchConfig;
    	      this.streamConfigs = defaults.streamConfigs;
    	      this.validationConfig = defaults.validationConfig;
    	      this.version = defaults.version;
        }

        public Builder defaultSearchHandlingStrict(Boolean defaultSearchHandlingStrict) {
            this.defaultSearchHandlingStrict = Objects.requireNonNull(defaultSearchHandlingStrict);
            return this;
        }
        public Builder disableReferentialIntegrity(Boolean disableReferentialIntegrity) {
            this.disableReferentialIntegrity = Objects.requireNonNull(disableReferentialIntegrity);
            return this;
        }
        public Builder disableResourceVersioning(Boolean disableResourceVersioning) {
            this.disableResourceVersioning = Objects.requireNonNull(disableResourceVersioning);
            return this;
        }
        public Builder enableUpdateCreate(Boolean enableUpdateCreate) {
            this.enableUpdateCreate = Objects.requireNonNull(enableUpdateCreate);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notificationConfig(NotificationConfigResponse notificationConfig) {
            this.notificationConfig = Objects.requireNonNull(notificationConfig);
            return this;
        }
        public Builder searchConfig(SearchConfigResponse searchConfig) {
            this.searchConfig = Objects.requireNonNull(searchConfig);
            return this;
        }
        public Builder streamConfigs(List<StreamConfigResponse> streamConfigs) {
            this.streamConfigs = Objects.requireNonNull(streamConfigs);
            return this;
        }
        public Builder streamConfigs(StreamConfigResponse... streamConfigs) {
            return streamConfigs(List.of(streamConfigs));
        }
        public Builder validationConfig(ValidationConfigResponse validationConfig) {
            this.validationConfig = Objects.requireNonNull(validationConfig);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetFhirStoreResult build() {
            return new GetFhirStoreResult(defaultSearchHandlingStrict, disableReferentialIntegrity, disableResourceVersioning, enableUpdateCreate, labels, name, notificationConfig, searchConfig, streamConfigs, validationConfig, version);
        }
    }
}
