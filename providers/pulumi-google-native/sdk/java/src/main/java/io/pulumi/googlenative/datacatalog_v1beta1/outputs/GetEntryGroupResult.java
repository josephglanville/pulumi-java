// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1SystemTimestampsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEntryGroupResult {
    /**
     * Timestamps about this EntryGroup. Default value is empty timestamps.
     * 
     */
    private final GoogleCloudDatacatalogV1beta1SystemTimestampsResponse dataCatalogTimestamps;
    /**
     * Entry group description, which can consist of several sentences or paragraphs that describe entry group contents. Default value is an empty string.
     * 
     */
    private final String description;
    /**
     * A short name to identify the entry group, for example, "analytics data - jan 2011". Default value is an empty string.
     * 
     */
    private final String displayName;
    /**
     * The resource name of the entry group in URL format. Example: * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id} Note that this EntryGroup and its child resources may not actually be stored in the location in this name.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetEntryGroupResult(
        @CustomType.Parameter("dataCatalogTimestamps") GoogleCloudDatacatalogV1beta1SystemTimestampsResponse dataCatalogTimestamps,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("name") String name) {
        this.dataCatalogTimestamps = dataCatalogTimestamps;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
    }

    /**
     * Timestamps about this EntryGroup. Default value is empty timestamps.
     * 
    */
    public GoogleCloudDatacatalogV1beta1SystemTimestampsResponse getDataCatalogTimestamps() {
        return this.dataCatalogTimestamps;
    }
    /**
     * Entry group description, which can consist of several sentences or paragraphs that describe entry group contents. Default value is an empty string.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * A short name to identify the entry group, for example, "analytics data - jan 2011". Default value is an empty string.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The resource name of the entry group in URL format. Example: * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id} Note that this EntryGroup and its child resources may not actually be stored in the location in this name.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntryGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1beta1SystemTimestampsResponse dataCatalogTimestamps;
        private String description;
        private String displayName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntryGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogTimestamps = defaults.dataCatalogTimestamps;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder dataCatalogTimestamps(GoogleCloudDatacatalogV1beta1SystemTimestampsResponse dataCatalogTimestamps) {
            this.dataCatalogTimestamps = Objects.requireNonNull(dataCatalogTimestamps);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetEntryGroupResult build() {
            return new GetEntryGroupResult(dataCatalogTimestamps, description, displayName, name);
        }
    }
}
