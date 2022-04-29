// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSensitiveDataModelResult {
    /**
     * @return The application suite name identifying a collection of applications. The default value is GENERIC. It&#39;s useful only if maintaining a sensitive data model for a suite of applications.
     * 
     */
    private final String appSuiteName;
    /**
     * @return The OCID of the compartment that contains the sensitive data model.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The description of the sensitive data model.
     * 
     */
    private final String description;
    /**
     * @return The display name of the sensitive data model.
     * 
     */
    private final String displayName;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The OCID of the sensitive data model.
     * 
     */
    private final String id;
    /**
     * @return Indicates if data discovery jobs should identify potential application-level (non-dictionary) referential relationships between columns. Note that data discovery automatically identifies and adds database-level (dictionary-defined) relationships. This option helps identify application-level relationships that are not defined in the database dictionary, which in turn, helps identify additional sensitive columns and preserve referential integrity during data masking. It&#39;s disabled by default and should be used only if there is a need to identify application-level relationships.
     * 
     */
    private final Boolean isAppDefinedRelationDiscoveryEnabled;
    /**
     * @return Indicates if all the schemas in the associated target database should be scanned by data discovery jobs. If it&#39;s set to true, the schemasForDiscovery attribute is ignored and all schemas are used for data discovery.
     * 
     */
    private final Boolean isIncludeAllSchemas;
    /**
     * @return Indicates if all the existing sensitive types should be used by data discovery jobs.If it&#39;s set to true, the sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types are used for data discovery.
     * 
     */
    private final Boolean isIncludeAllSensitiveTypes;
    /**
     * @return Indicates if data discovery jobs should collect and store sample data values for the discovered columns. Sample data helps review the discovered columns and ensure that they actually contain sensitive data. As it collects original data from the target database, it&#39;s disabled by default and should be used only if it&#39;s acceptable to store sample data in Data Safe&#39;s repository in Oracle Cloud. Note that sample data values are not collected for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
     * 
     */
    private final Boolean isSampleDataCollectionEnabled;
    /**
     * @return The schemas to be scanned by data discovery jobs.
     * 
     */
    private final List<String> schemasForDiscoveries;
    private final String sensitiveDataModelId;
    /**
     * @return The OCIDs of the sensitive types to be used by data discovery jobs.
     * 
     */
    private final List<String> sensitiveTypeIdsForDiscoveries;
    /**
     * @return The current state of the sensitive data model.
     * 
     */
    private final String state;
    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    private final Map<String,Object> systemTags;
    /**
     * @return The OCID of the reference target database associated with the sensitive data model. All operations such as performing data discovery and adding columns manually are done in the context of the associated target database.
     * 
     */
    private final String targetId;
    /**
     * @return The date and time the sensitive data model was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time the sensitive data model was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    private final String timeUpdated;

    @CustomType.Constructor
    private GetSensitiveDataModelResult(
        @CustomType.Parameter("appSuiteName") String appSuiteName,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isAppDefinedRelationDiscoveryEnabled") Boolean isAppDefinedRelationDiscoveryEnabled,
        @CustomType.Parameter("isIncludeAllSchemas") Boolean isIncludeAllSchemas,
        @CustomType.Parameter("isIncludeAllSensitiveTypes") Boolean isIncludeAllSensitiveTypes,
        @CustomType.Parameter("isSampleDataCollectionEnabled") Boolean isSampleDataCollectionEnabled,
        @CustomType.Parameter("schemasForDiscoveries") List<String> schemasForDiscoveries,
        @CustomType.Parameter("sensitiveDataModelId") String sensitiveDataModelId,
        @CustomType.Parameter("sensitiveTypeIdsForDiscoveries") List<String> sensitiveTypeIdsForDiscoveries,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("systemTags") Map<String,Object> systemTags,
        @CustomType.Parameter("targetId") String targetId,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated) {
        this.appSuiteName = appSuiteName;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isAppDefinedRelationDiscoveryEnabled = isAppDefinedRelationDiscoveryEnabled;
        this.isIncludeAllSchemas = isIncludeAllSchemas;
        this.isIncludeAllSensitiveTypes = isIncludeAllSensitiveTypes;
        this.isSampleDataCollectionEnabled = isSampleDataCollectionEnabled;
        this.schemasForDiscoveries = schemasForDiscoveries;
        this.sensitiveDataModelId = sensitiveDataModelId;
        this.sensitiveTypeIdsForDiscoveries = sensitiveTypeIdsForDiscoveries;
        this.state = state;
        this.systemTags = systemTags;
        this.targetId = targetId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    /**
     * @return The application suite name identifying a collection of applications. The default value is GENERIC. It&#39;s useful only if maintaining a sensitive data model for a suite of applications.
     * 
     */
    public String appSuiteName() {
        return this.appSuiteName;
    }
    /**
     * @return The OCID of the compartment that contains the sensitive data model.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return The description of the sensitive data model.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The display name of the sensitive data model.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The OCID of the sensitive data model.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates if data discovery jobs should identify potential application-level (non-dictionary) referential relationships between columns. Note that data discovery automatically identifies and adds database-level (dictionary-defined) relationships. This option helps identify application-level relationships that are not defined in the database dictionary, which in turn, helps identify additional sensitive columns and preserve referential integrity during data masking. It&#39;s disabled by default and should be used only if there is a need to identify application-level relationships.
     * 
     */
    public Boolean isAppDefinedRelationDiscoveryEnabled() {
        return this.isAppDefinedRelationDiscoveryEnabled;
    }
    /**
     * @return Indicates if all the schemas in the associated target database should be scanned by data discovery jobs. If it&#39;s set to true, the schemasForDiscovery attribute is ignored and all schemas are used for data discovery.
     * 
     */
    public Boolean isIncludeAllSchemas() {
        return this.isIncludeAllSchemas;
    }
    /**
     * @return Indicates if all the existing sensitive types should be used by data discovery jobs.If it&#39;s set to true, the sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types are used for data discovery.
     * 
     */
    public Boolean isIncludeAllSensitiveTypes() {
        return this.isIncludeAllSensitiveTypes;
    }
    /**
     * @return Indicates if data discovery jobs should collect and store sample data values for the discovered columns. Sample data helps review the discovered columns and ensure that they actually contain sensitive data. As it collects original data from the target database, it&#39;s disabled by default and should be used only if it&#39;s acceptable to store sample data in Data Safe&#39;s repository in Oracle Cloud. Note that sample data values are not collected for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
     * 
     */
    public Boolean isSampleDataCollectionEnabled() {
        return this.isSampleDataCollectionEnabled;
    }
    /**
     * @return The schemas to be scanned by data discovery jobs.
     * 
     */
    public List<String> schemasForDiscoveries() {
        return this.schemasForDiscoveries;
    }
    public String sensitiveDataModelId() {
        return this.sensitiveDataModelId;
    }
    /**
     * @return The OCIDs of the sensitive types to be used by data discovery jobs.
     * 
     */
    public List<String> sensitiveTypeIdsForDiscoveries() {
        return this.sensitiveTypeIdsForDiscoveries;
    }
    /**
     * @return The current state of the sensitive data model.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Map<String,Object> systemTags() {
        return this.systemTags;
    }
    /**
     * @return The OCID of the reference target database associated with the sensitive data model. All operations such as performing data discovery and adding columns manually are done in the context of the associated target database.
     * 
     */
    public String targetId() {
        return this.targetId;
    }
    /**
     * @return The date and time the sensitive data model was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time the sensitive data model was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensitiveDataModelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appSuiteName;
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String description;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private Boolean isAppDefinedRelationDiscoveryEnabled;
        private Boolean isIncludeAllSchemas;
        private Boolean isIncludeAllSensitiveTypes;
        private Boolean isSampleDataCollectionEnabled;
        private List<String> schemasForDiscoveries;
        private String sensitiveDataModelId;
        private List<String> sensitiveTypeIdsForDiscoveries;
        private String state;
        private Map<String,Object> systemTags;
        private String targetId;
        private String timeCreated;
        private String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSensitiveDataModelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSuiteName = defaults.appSuiteName;
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.isAppDefinedRelationDiscoveryEnabled = defaults.isAppDefinedRelationDiscoveryEnabled;
    	      this.isIncludeAllSchemas = defaults.isIncludeAllSchemas;
    	      this.isIncludeAllSensitiveTypes = defaults.isIncludeAllSensitiveTypes;
    	      this.isSampleDataCollectionEnabled = defaults.isSampleDataCollectionEnabled;
    	      this.schemasForDiscoveries = defaults.schemasForDiscoveries;
    	      this.sensitiveDataModelId = defaults.sensitiveDataModelId;
    	      this.sensitiveTypeIdsForDiscoveries = defaults.sensitiveTypeIdsForDiscoveries;
    	      this.state = defaults.state;
    	      this.systemTags = defaults.systemTags;
    	      this.targetId = defaults.targetId;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
        }

        public Builder appSuiteName(String appSuiteName) {
            this.appSuiteName = Objects.requireNonNull(appSuiteName);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
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
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isAppDefinedRelationDiscoveryEnabled(Boolean isAppDefinedRelationDiscoveryEnabled) {
            this.isAppDefinedRelationDiscoveryEnabled = Objects.requireNonNull(isAppDefinedRelationDiscoveryEnabled);
            return this;
        }
        public Builder isIncludeAllSchemas(Boolean isIncludeAllSchemas) {
            this.isIncludeAllSchemas = Objects.requireNonNull(isIncludeAllSchemas);
            return this;
        }
        public Builder isIncludeAllSensitiveTypes(Boolean isIncludeAllSensitiveTypes) {
            this.isIncludeAllSensitiveTypes = Objects.requireNonNull(isIncludeAllSensitiveTypes);
            return this;
        }
        public Builder isSampleDataCollectionEnabled(Boolean isSampleDataCollectionEnabled) {
            this.isSampleDataCollectionEnabled = Objects.requireNonNull(isSampleDataCollectionEnabled);
            return this;
        }
        public Builder schemasForDiscoveries(List<String> schemasForDiscoveries) {
            this.schemasForDiscoveries = Objects.requireNonNull(schemasForDiscoveries);
            return this;
        }
        public Builder schemasForDiscoveries(String... schemasForDiscoveries) {
            return schemasForDiscoveries(List.of(schemasForDiscoveries));
        }
        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = Objects.requireNonNull(sensitiveDataModelId);
            return this;
        }
        public Builder sensitiveTypeIdsForDiscoveries(List<String> sensitiveTypeIdsForDiscoveries) {
            this.sensitiveTypeIdsForDiscoveries = Objects.requireNonNull(sensitiveTypeIdsForDiscoveries);
            return this;
        }
        public Builder sensitiveTypeIdsForDiscoveries(String... sensitiveTypeIdsForDiscoveries) {
            return sensitiveTypeIdsForDiscoveries(List.of(sensitiveTypeIdsForDiscoveries));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder systemTags(Map<String,Object> systemTags) {
            this.systemTags = Objects.requireNonNull(systemTags);
            return this;
        }
        public Builder targetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }        public GetSensitiveDataModelResult build() {
            return new GetSensitiveDataModelResult(appSuiteName, compartmentId, definedTags, description, displayName, freeformTags, id, isAppDefinedRelationDiscoveryEnabled, isIncludeAllSchemas, isIncludeAllSensitiveTypes, isSampleDataCollectionEnabled, schemasForDiscoveries, sensitiveDataModelId, sensitiveTypeIdsForDiscoveries, state, systemTags, targetId, timeCreated, timeUpdated);
        }
    }
}
