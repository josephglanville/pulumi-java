// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.GetExternalPluggableDatabasesExternalPluggableDatabaseDatabaseManagementConfig;
import com.pulumi.oci.Database.outputs.GetExternalPluggableDatabasesExternalPluggableDatabaseOperationsInsightsConfig;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetExternalPluggableDatabasesExternalPluggableDatabase {
    /**
     * @return The character set of the external database.
     * 
     */
    private final String characterSet;
    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final String compartmentId;
    /**
     * @return The Oracle Database configuration
     * 
     */
    private final String databaseConfiguration;
    /**
     * @return The Oracle Database edition.
     * 
     */
    private final String databaseEdition;
    /**
     * @return The configuration of the Database Management service.
     * 
     */
    private final List<GetExternalPluggableDatabasesExternalPluggableDatabaseDatabaseManagementConfig> databaseManagementConfigs;
    /**
     * @return The Oracle Database version.
     * 
     */
    private final String databaseVersion;
    /**
     * @return The Oracle Database ID, which identifies an Oracle Database located outside of Oracle Cloud.
     * 
     */
    private final String dbId;
    /**
     * @return The database packs licensed for the external Oracle Database.
     * 
     */
    private final String dbPacks;
    /**
     * @return The `DB_UNIQUE_NAME` of the external database.
     * 
     */
    private final String dbUniqueName;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    private final String displayName;
    /**
     * @return The ExternalContainerDatabase [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final String externalContainerDatabaseId;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure external database resource.
     * 
     */
    private final String id;
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    private final String lifecycleDetails;
    /**
     * @return The national character of the external database.
     * 
     */
    private final String ncharacterSet;
    /**
     * @return The configuration of Operations Insights for the external database
     * 
     */
    private final List<GetExternalPluggableDatabasesExternalPluggableDatabaseOperationsInsightsConfig> operationsInsightsConfigs;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the the non-container database that was converted to a pluggable database to create this resource.
     * 
     */
    private final String sourceId;
    /**
     * @return A filter to return only resources that match the specified lifecycle state.
     * 
     */
    private final String state;
    /**
     * @return The date and time the database was created.
     * 
     */
    private final String timeCreated;
    /**
     * @return The time zone of the external database. It is a time zone offset (a character type in the format &#39;[+|-]TZH:TZM&#39;) or a time zone region name, depending on how the time zone value was specified when the database was created / last altered.
     * 
     */
    private final String timeZone;

    @CustomType.Constructor
    private GetExternalPluggableDatabasesExternalPluggableDatabase(
        @CustomType.Parameter("characterSet") String characterSet,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("databaseConfiguration") String databaseConfiguration,
        @CustomType.Parameter("databaseEdition") String databaseEdition,
        @CustomType.Parameter("databaseManagementConfigs") List<GetExternalPluggableDatabasesExternalPluggableDatabaseDatabaseManagementConfig> databaseManagementConfigs,
        @CustomType.Parameter("databaseVersion") String databaseVersion,
        @CustomType.Parameter("dbId") String dbId,
        @CustomType.Parameter("dbPacks") String dbPacks,
        @CustomType.Parameter("dbUniqueName") String dbUniqueName,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("externalContainerDatabaseId") String externalContainerDatabaseId,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("ncharacterSet") String ncharacterSet,
        @CustomType.Parameter("operationsInsightsConfigs") List<GetExternalPluggableDatabasesExternalPluggableDatabaseOperationsInsightsConfig> operationsInsightsConfigs,
        @CustomType.Parameter("sourceId") String sourceId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeZone") String timeZone) {
        this.characterSet = characterSet;
        this.compartmentId = compartmentId;
        this.databaseConfiguration = databaseConfiguration;
        this.databaseEdition = databaseEdition;
        this.databaseManagementConfigs = databaseManagementConfigs;
        this.databaseVersion = databaseVersion;
        this.dbId = dbId;
        this.dbPacks = dbPacks;
        this.dbUniqueName = dbUniqueName;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.externalContainerDatabaseId = externalContainerDatabaseId;
        this.freeformTags = freeformTags;
        this.id = id;
        this.lifecycleDetails = lifecycleDetails;
        this.ncharacterSet = ncharacterSet;
        this.operationsInsightsConfigs = operationsInsightsConfigs;
        this.sourceId = sourceId;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeZone = timeZone;
    }

    /**
     * @return The character set of the external database.
     * 
     */
    public String characterSet() {
        return this.characterSet;
    }
    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The Oracle Database configuration
     * 
     */
    public String databaseConfiguration() {
        return this.databaseConfiguration;
    }
    /**
     * @return The Oracle Database edition.
     * 
     */
    public String databaseEdition() {
        return this.databaseEdition;
    }
    /**
     * @return The configuration of the Database Management service.
     * 
     */
    public List<GetExternalPluggableDatabasesExternalPluggableDatabaseDatabaseManagementConfig> databaseManagementConfigs() {
        return this.databaseManagementConfigs;
    }
    /**
     * @return The Oracle Database version.
     * 
     */
    public String databaseVersion() {
        return this.databaseVersion;
    }
    /**
     * @return The Oracle Database ID, which identifies an Oracle Database located outside of Oracle Cloud.
     * 
     */
    public String dbId() {
        return this.dbId;
    }
    /**
     * @return The database packs licensed for the external Oracle Database.
     * 
     */
    public String dbPacks() {
        return this.dbPacks;
    }
    /**
     * @return The `DB_UNIQUE_NAME` of the external database.
     * 
     */
    public String dbUniqueName() {
        return this.dbUniqueName;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The ExternalContainerDatabase [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String externalContainerDatabaseId() {
        return this.externalContainerDatabaseId;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure external database resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * @return The national character of the external database.
     * 
     */
    public String ncharacterSet() {
        return this.ncharacterSet;
    }
    /**
     * @return The configuration of Operations Insights for the external database
     * 
     */
    public List<GetExternalPluggableDatabasesExternalPluggableDatabaseOperationsInsightsConfig> operationsInsightsConfigs() {
        return this.operationsInsightsConfigs;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the the non-container database that was converted to a pluggable database to create this resource.
     * 
     */
    public String sourceId() {
        return this.sourceId;
    }
    /**
     * @return A filter to return only resources that match the specified lifecycle state.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time the database was created.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time zone of the external database. It is a time zone offset (a character type in the format &#39;[+|-]TZH:TZM&#39;) or a time zone region name, depending on how the time zone value was specified when the database was created / last altered.
     * 
     */
    public String timeZone() {
        return this.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExternalPluggableDatabasesExternalPluggableDatabase defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String characterSet;
        private String compartmentId;
        private String databaseConfiguration;
        private String databaseEdition;
        private List<GetExternalPluggableDatabasesExternalPluggableDatabaseDatabaseManagementConfig> databaseManagementConfigs;
        private String databaseVersion;
        private String dbId;
        private String dbPacks;
        private String dbUniqueName;
        private Map<String,Object> definedTags;
        private String displayName;
        private String externalContainerDatabaseId;
        private Map<String,Object> freeformTags;
        private String id;
        private String lifecycleDetails;
        private String ncharacterSet;
        private List<GetExternalPluggableDatabasesExternalPluggableDatabaseOperationsInsightsConfig> operationsInsightsConfigs;
        private String sourceId;
        private String state;
        private String timeCreated;
        private String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExternalPluggableDatabasesExternalPluggableDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.characterSet = defaults.characterSet;
    	      this.compartmentId = defaults.compartmentId;
    	      this.databaseConfiguration = defaults.databaseConfiguration;
    	      this.databaseEdition = defaults.databaseEdition;
    	      this.databaseManagementConfigs = defaults.databaseManagementConfigs;
    	      this.databaseVersion = defaults.databaseVersion;
    	      this.dbId = defaults.dbId;
    	      this.dbPacks = defaults.dbPacks;
    	      this.dbUniqueName = defaults.dbUniqueName;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.externalContainerDatabaseId = defaults.externalContainerDatabaseId;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.ncharacterSet = defaults.ncharacterSet;
    	      this.operationsInsightsConfigs = defaults.operationsInsightsConfigs;
    	      this.sourceId = defaults.sourceId;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder characterSet(String characterSet) {
            this.characterSet = Objects.requireNonNull(characterSet);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder databaseConfiguration(String databaseConfiguration) {
            this.databaseConfiguration = Objects.requireNonNull(databaseConfiguration);
            return this;
        }
        public Builder databaseEdition(String databaseEdition) {
            this.databaseEdition = Objects.requireNonNull(databaseEdition);
            return this;
        }
        public Builder databaseManagementConfigs(List<GetExternalPluggableDatabasesExternalPluggableDatabaseDatabaseManagementConfig> databaseManagementConfigs) {
            this.databaseManagementConfigs = Objects.requireNonNull(databaseManagementConfigs);
            return this;
        }
        public Builder databaseManagementConfigs(GetExternalPluggableDatabasesExternalPluggableDatabaseDatabaseManagementConfig... databaseManagementConfigs) {
            return databaseManagementConfigs(List.of(databaseManagementConfigs));
        }
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = Objects.requireNonNull(databaseVersion);
            return this;
        }
        public Builder dbId(String dbId) {
            this.dbId = Objects.requireNonNull(dbId);
            return this;
        }
        public Builder dbPacks(String dbPacks) {
            this.dbPacks = Objects.requireNonNull(dbPacks);
            return this;
        }
        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = Objects.requireNonNull(dbUniqueName);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder externalContainerDatabaseId(String externalContainerDatabaseId) {
            this.externalContainerDatabaseId = Objects.requireNonNull(externalContainerDatabaseId);
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
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder ncharacterSet(String ncharacterSet) {
            this.ncharacterSet = Objects.requireNonNull(ncharacterSet);
            return this;
        }
        public Builder operationsInsightsConfigs(List<GetExternalPluggableDatabasesExternalPluggableDatabaseOperationsInsightsConfig> operationsInsightsConfigs) {
            this.operationsInsightsConfigs = Objects.requireNonNull(operationsInsightsConfigs);
            return this;
        }
        public Builder operationsInsightsConfigs(GetExternalPluggableDatabasesExternalPluggableDatabaseOperationsInsightsConfig... operationsInsightsConfigs) {
            return operationsInsightsConfigs(List.of(operationsInsightsConfigs));
        }
        public Builder sourceId(String sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }        public GetExternalPluggableDatabasesExternalPluggableDatabase build() {
            return new GetExternalPluggableDatabasesExternalPluggableDatabase(characterSet, compartmentId, databaseConfiguration, databaseEdition, databaseManagementConfigs, databaseVersion, dbId, dbPacks, dbUniqueName, definedTags, displayName, externalContainerDatabaseId, freeformTags, id, lifecycleDetails, ncharacterSet, operationsInsightsConfigs, sourceId, state, timeCreated, timeZone);
        }
    }
}
