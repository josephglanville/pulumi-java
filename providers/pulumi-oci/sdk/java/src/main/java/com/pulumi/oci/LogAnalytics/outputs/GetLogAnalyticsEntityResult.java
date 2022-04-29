// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LogAnalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetLogAnalyticsEntityResult {
    /**
     * @return The Boolean flag to indicate if logs are collected for an entity for log analytics usage.
     * 
     */
    private final Boolean areLogsCollected;
    /**
     * @return The OCID of the Cloud resource which this entity is a representation of. This may be blank when the entity represents a non-cloud resource that the customer may have on their premises.
     * 
     */
    private final String cloudResourceId;
    /**
     * @return Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return Internal name for the log analytics entity type.
     * 
     */
    private final String entityTypeInternalName;
    /**
     * @return Log analytics entity type name.
     * 
     */
    private final String entityTypeName;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The hostname where the entity represented here is actually present. This would be the output one would get if they run `echo $HOSTNAME` on Linux or an equivalent OS command. This may be different from management agents host since logs may be collected remotely.
     * 
     */
    private final String hostname;
    /**
     * @return The log analytics entity OCID. This ID is a reference used by log analytics features and it represents a resource that is provisioned and managed by the customer on their premises or on the cloud.
     * 
     */
    private final String id;
    /**
     * @return lifecycleDetails has additional information regarding substeps such as management agent plugin deployment.
     * 
     */
    private final String lifecycleDetails;
    private final String logAnalyticsEntityId;
    /**
     * @return Management agent (management-agents resource kind) compartment OCID
     * 
     */
    private final String managementAgentCompartmentId;
    /**
     * @return Management agent (management-agents resource kind) display name
     * 
     */
    private final String managementAgentDisplayName;
    /**
     * @return The OCID of the Management Agent.
     * 
     */
    private final String managementAgentId;
    /**
     * @return Log analytics entity name.
     * 
     */
    private final String name;
    private final String namespace;
    /**
     * @return The name/value pairs for parameter values to be used in file patterns specified in log sources.
     * 
     */
    private final Map<String,Object> properties;
    /**
     * @return This indicates the type of source. It is primarily for Enterprise Manager Repository ID.
     * 
     */
    private final String sourceId;
    /**
     * @return The current state of the log analytics entity.
     * 
     */
    private final String state;
    /**
     * @return The date and time the resource was created, in the format defined by RFC3339.
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time the resource was last updated, in the format defined by RFC3339.
     * 
     */
    private final String timeUpdated;
    /**
     * @return The timezone region of the log analytics entity.
     * 
     */
    private final String timezoneRegion;

    @CustomType.Constructor
    private GetLogAnalyticsEntityResult(
        @CustomType.Parameter("areLogsCollected") Boolean areLogsCollected,
        @CustomType.Parameter("cloudResourceId") String cloudResourceId,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("entityTypeInternalName") String entityTypeInternalName,
        @CustomType.Parameter("entityTypeName") String entityTypeName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("hostname") String hostname,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("logAnalyticsEntityId") String logAnalyticsEntityId,
        @CustomType.Parameter("managementAgentCompartmentId") String managementAgentCompartmentId,
        @CustomType.Parameter("managementAgentDisplayName") String managementAgentDisplayName,
        @CustomType.Parameter("managementAgentId") String managementAgentId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("properties") Map<String,Object> properties,
        @CustomType.Parameter("sourceId") String sourceId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated,
        @CustomType.Parameter("timezoneRegion") String timezoneRegion) {
        this.areLogsCollected = areLogsCollected;
        this.cloudResourceId = cloudResourceId;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.entityTypeInternalName = entityTypeInternalName;
        this.entityTypeName = entityTypeName;
        this.freeformTags = freeformTags;
        this.hostname = hostname;
        this.id = id;
        this.lifecycleDetails = lifecycleDetails;
        this.logAnalyticsEntityId = logAnalyticsEntityId;
        this.managementAgentCompartmentId = managementAgentCompartmentId;
        this.managementAgentDisplayName = managementAgentDisplayName;
        this.managementAgentId = managementAgentId;
        this.name = name;
        this.namespace = namespace;
        this.properties = properties;
        this.sourceId = sourceId;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timezoneRegion = timezoneRegion;
    }

    /**
     * @return The Boolean flag to indicate if logs are collected for an entity for log analytics usage.
     * 
     */
    public Boolean areLogsCollected() {
        return this.areLogsCollected;
    }
    /**
     * @return The OCID of the Cloud resource which this entity is a representation of. This may be blank when the entity represents a non-cloud resource that the customer may have on their premises.
     * 
     */
    public String cloudResourceId() {
        return this.cloudResourceId;
    }
    /**
     * @return Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return Internal name for the log analytics entity type.
     * 
     */
    public String entityTypeInternalName() {
        return this.entityTypeInternalName;
    }
    /**
     * @return Log analytics entity type name.
     * 
     */
    public String entityTypeName() {
        return this.entityTypeName;
    }
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The hostname where the entity represented here is actually present. This would be the output one would get if they run `echo $HOSTNAME` on Linux or an equivalent OS command. This may be different from management agents host since logs may be collected remotely.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return The log analytics entity OCID. This ID is a reference used by log analytics features and it represents a resource that is provisioned and managed by the customer on their premises or on the cloud.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return lifecycleDetails has additional information regarding substeps such as management agent plugin deployment.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    public String logAnalyticsEntityId() {
        return this.logAnalyticsEntityId;
    }
    /**
     * @return Management agent (management-agents resource kind) compartment OCID
     * 
     */
    public String managementAgentCompartmentId() {
        return this.managementAgentCompartmentId;
    }
    /**
     * @return Management agent (management-agents resource kind) display name
     * 
     */
    public String managementAgentDisplayName() {
        return this.managementAgentDisplayName;
    }
    /**
     * @return The OCID of the Management Agent.
     * 
     */
    public String managementAgentId() {
        return this.managementAgentId;
    }
    /**
     * @return Log analytics entity name.
     * 
     */
    public String name() {
        return this.name;
    }
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return The name/value pairs for parameter values to be used in file patterns specified in log sources.
     * 
     */
    public Map<String,Object> properties() {
        return this.properties;
    }
    /**
     * @return This indicates the type of source. It is primarily for Enterprise Manager Repository ID.
     * 
     */
    public String sourceId() {
        return this.sourceId;
    }
    /**
     * @return The current state of the log analytics entity.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time the resource was created, in the format defined by RFC3339.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time the resource was last updated, in the format defined by RFC3339.
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * @return The timezone region of the log analytics entity.
     * 
     */
    public String timezoneRegion() {
        return this.timezoneRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogAnalyticsEntityResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean areLogsCollected;
        private String cloudResourceId;
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String entityTypeInternalName;
        private String entityTypeName;
        private Map<String,Object> freeformTags;
        private String hostname;
        private String id;
        private String lifecycleDetails;
        private String logAnalyticsEntityId;
        private String managementAgentCompartmentId;
        private String managementAgentDisplayName;
        private String managementAgentId;
        private String name;
        private String namespace;
        private Map<String,Object> properties;
        private String sourceId;
        private String state;
        private String timeCreated;
        private String timeUpdated;
        private String timezoneRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLogAnalyticsEntityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.areLogsCollected = defaults.areLogsCollected;
    	      this.cloudResourceId = defaults.cloudResourceId;
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.entityTypeInternalName = defaults.entityTypeInternalName;
    	      this.entityTypeName = defaults.entityTypeName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.logAnalyticsEntityId = defaults.logAnalyticsEntityId;
    	      this.managementAgentCompartmentId = defaults.managementAgentCompartmentId;
    	      this.managementAgentDisplayName = defaults.managementAgentDisplayName;
    	      this.managementAgentId = defaults.managementAgentId;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.properties = defaults.properties;
    	      this.sourceId = defaults.sourceId;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
    	      this.timezoneRegion = defaults.timezoneRegion;
        }

        public Builder areLogsCollected(Boolean areLogsCollected) {
            this.areLogsCollected = Objects.requireNonNull(areLogsCollected);
            return this;
        }
        public Builder cloudResourceId(String cloudResourceId) {
            this.cloudResourceId = Objects.requireNonNull(cloudResourceId);
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
        public Builder entityTypeInternalName(String entityTypeInternalName) {
            this.entityTypeInternalName = Objects.requireNonNull(entityTypeInternalName);
            return this;
        }
        public Builder entityTypeName(String entityTypeName) {
            this.entityTypeName = Objects.requireNonNull(entityTypeName);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
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
        public Builder logAnalyticsEntityId(String logAnalyticsEntityId) {
            this.logAnalyticsEntityId = Objects.requireNonNull(logAnalyticsEntityId);
            return this;
        }
        public Builder managementAgentCompartmentId(String managementAgentCompartmentId) {
            this.managementAgentCompartmentId = Objects.requireNonNull(managementAgentCompartmentId);
            return this;
        }
        public Builder managementAgentDisplayName(String managementAgentDisplayName) {
            this.managementAgentDisplayName = Objects.requireNonNull(managementAgentDisplayName);
            return this;
        }
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = Objects.requireNonNull(managementAgentId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder properties(Map<String,Object> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
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
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }
        public Builder timezoneRegion(String timezoneRegion) {
            this.timezoneRegion = Objects.requireNonNull(timezoneRegion);
            return this;
        }        public GetLogAnalyticsEntityResult build() {
            return new GetLogAnalyticsEntityResult(areLogsCollected, cloudResourceId, compartmentId, definedTags, entityTypeInternalName, entityTypeName, freeformTags, hostname, id, lifecycleDetails, logAnalyticsEntityId, managementAgentCompartmentId, managementAgentDisplayName, managementAgentId, name, namespace, properties, sourceId, state, timeCreated, timeUpdated, timezoneRegion);
        }
    }
}
