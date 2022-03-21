// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetParticipantResult {
    /**
     * Optional. Key-value filters on the metadata of documents returned by article suggestion. If specified, article suggestion only returns suggested documents that match all filters in their Document.metadata. Multiple values for a metadata key should be concatenated by comma. For example, filters to match all documents that have 'US' or 'CA' in their market metadata values and 'agent' in their user metadata values will be ```documents_metadata_filters { key: "market" value: "US,CA" } documents_metadata_filters { key: "user" value: "agent" }```
     * 
     */
    private final Map<String,String> documentsMetadataFilters;
    /**
     * Optional. The unique identifier of this participant. Format: `projects//locations//conversations//participants/`.
     * 
     */
    private final String name;
    /**
     * Immutable. The role this participant plays in the conversation. This field must be set during participant creation and is then immutable.
     * 
     */
    private final String role;
    /**
     * Optional. Label applied to streams representing this participant in SIPREC XML metadata and SDP. This is used to assign transcriptions from that media stream to this participant. This field can be updated.
     * 
     */
    private final String sipRecordingMediaLabel;

    @CustomType.Constructor
    private GetParticipantResult(
        @CustomType.Parameter("documentsMetadataFilters") Map<String,String> documentsMetadataFilters,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("role") String role,
        @CustomType.Parameter("sipRecordingMediaLabel") String sipRecordingMediaLabel) {
        this.documentsMetadataFilters = documentsMetadataFilters;
        this.name = name;
        this.role = role;
        this.sipRecordingMediaLabel = sipRecordingMediaLabel;
    }

    /**
     * Optional. Key-value filters on the metadata of documents returned by article suggestion. If specified, article suggestion only returns suggested documents that match all filters in their Document.metadata. Multiple values for a metadata key should be concatenated by comma. For example, filters to match all documents that have 'US' or 'CA' in their market metadata values and 'agent' in their user metadata values will be ```documents_metadata_filters { key: "market" value: "US,CA" } documents_metadata_filters { key: "user" value: "agent" }```
     * 
    */
    public Map<String,String> getDocumentsMetadataFilters() {
        return this.documentsMetadataFilters;
    }
    /**
     * Optional. The unique identifier of this participant. Format: `projects//locations//conversations//participants/`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Immutable. The role this participant plays in the conversation. This field must be set during participant creation and is then immutable.
     * 
    */
    public String getRole() {
        return this.role;
    }
    /**
     * Optional. Label applied to streams representing this participant in SIPREC XML metadata and SDP. This is used to assign transcriptions from that media stream to this participant. This field can be updated.
     * 
    */
    public String getSipRecordingMediaLabel() {
        return this.sipRecordingMediaLabel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetParticipantResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> documentsMetadataFilters;
        private String name;
        private String role;
        private String sipRecordingMediaLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(GetParticipantResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentsMetadataFilters = defaults.documentsMetadataFilters;
    	      this.name = defaults.name;
    	      this.role = defaults.role;
    	      this.sipRecordingMediaLabel = defaults.sipRecordingMediaLabel;
        }

        public Builder documentsMetadataFilters(Map<String,String> documentsMetadataFilters) {
            this.documentsMetadataFilters = Objects.requireNonNull(documentsMetadataFilters);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder sipRecordingMediaLabel(String sipRecordingMediaLabel) {
            this.sipRecordingMediaLabel = Objects.requireNonNull(sipRecordingMediaLabel);
            return this;
        }        public GetParticipantResult build() {
            return new GetParticipantResult(documentsMetadataFilters, name, role, sipRecordingMediaLabel);
        }
    }
}
