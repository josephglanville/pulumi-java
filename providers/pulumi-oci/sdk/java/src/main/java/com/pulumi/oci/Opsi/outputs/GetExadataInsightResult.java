// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetExadataInsightResult {
    /**
     * @return Compartment identifier of the Exadata insight resource
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return OPSI Enterprise Manager Bridge OCID
     * 
     */
    private final String enterpriseManagerBridgeId;
    /**
     * @return Enterprise Manager Entity Display Name
     * 
     */
    private final String enterpriseManagerEntityDisplayName;
    /**
     * @return Enterprise Manager Entity Unique Identifier
     * 
     */
    private final String enterpriseManagerEntityIdentifier;
    /**
     * @return Enterprise Manager Entity Name
     * 
     */
    private final String enterpriseManagerEntityName;
    /**
     * @return Enterprise Manager Entity Type
     * 
     */
    private final String enterpriseManagerEntityType;
    /**
     * @return Enterprise Manager Unique Identifier
     * 
     */
    private final String enterpriseManagerIdentifier;
    /**
     * @return Source of the Exadata system.
     * 
     */
    private final String entitySource;
    /**
     * @return The user-friendly name for the Exadata system. The name does not have to be unique.
     * 
     */
    private final String exadataDisplayName;
    private final String exadataInsightId;
    /**
     * @return The Exadata system name. If the Exadata systems managed by Enterprise Manager, the name is unique amongst the Exadata systems managed by the same Enterprise Manager.
     * 
     */
    private final String exadataName;
    /**
     * @return Exadata rack type.
     * 
     */
    private final String exadataRackType;
    /**
     * @return Operations Insights internal representation of the the Exadata system type.
     * 
     */
    private final String exadataType;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return Exadata insight identifier
     * 
     */
    private final String id;
    private final Boolean isAutoSyncEnabled;
    /**
     * @return true if virtualization is used in the Exadata system
     * 
     */
    private final Boolean isVirtualizedExadata;
    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    private final String lifecycleDetails;
    /**
     * @return The current state of the Exadata insight.
     * 
     */
    private final String state;
    /**
     * @return Indicates the status of an Exadata insight in Operations Insights
     * 
     */
    private final String status;
    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    private final Map<String,Object> systemTags;
    /**
     * @return The time the the Exadata insight was first enabled. An RFC3339 formatted datetime string
     * 
     */
    private final String timeCreated;
    /**
     * @return The time the Exadata insight was updated. An RFC3339 formatted datetime string
     * 
     */
    private final String timeUpdated;

    @CustomType.Constructor
    private GetExadataInsightResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("enterpriseManagerBridgeId") String enterpriseManagerBridgeId,
        @CustomType.Parameter("enterpriseManagerEntityDisplayName") String enterpriseManagerEntityDisplayName,
        @CustomType.Parameter("enterpriseManagerEntityIdentifier") String enterpriseManagerEntityIdentifier,
        @CustomType.Parameter("enterpriseManagerEntityName") String enterpriseManagerEntityName,
        @CustomType.Parameter("enterpriseManagerEntityType") String enterpriseManagerEntityType,
        @CustomType.Parameter("enterpriseManagerIdentifier") String enterpriseManagerIdentifier,
        @CustomType.Parameter("entitySource") String entitySource,
        @CustomType.Parameter("exadataDisplayName") String exadataDisplayName,
        @CustomType.Parameter("exadataInsightId") String exadataInsightId,
        @CustomType.Parameter("exadataName") String exadataName,
        @CustomType.Parameter("exadataRackType") String exadataRackType,
        @CustomType.Parameter("exadataType") String exadataType,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isAutoSyncEnabled") Boolean isAutoSyncEnabled,
        @CustomType.Parameter("isVirtualizedExadata") Boolean isVirtualizedExadata,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("systemTags") Map<String,Object> systemTags,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated) {
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
        this.enterpriseManagerEntityDisplayName = enterpriseManagerEntityDisplayName;
        this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
        this.enterpriseManagerEntityName = enterpriseManagerEntityName;
        this.enterpriseManagerEntityType = enterpriseManagerEntityType;
        this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
        this.entitySource = entitySource;
        this.exadataDisplayName = exadataDisplayName;
        this.exadataInsightId = exadataInsightId;
        this.exadataName = exadataName;
        this.exadataRackType = exadataRackType;
        this.exadataType = exadataType;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isAutoSyncEnabled = isAutoSyncEnabled;
        this.isVirtualizedExadata = isVirtualizedExadata;
        this.lifecycleDetails = lifecycleDetails;
        this.state = state;
        this.status = status;
        this.systemTags = systemTags;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    /**
     * @return Compartment identifier of the Exadata insight resource
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
     * @return OPSI Enterprise Manager Bridge OCID
     * 
     */
    public String enterpriseManagerBridgeId() {
        return this.enterpriseManagerBridgeId;
    }
    /**
     * @return Enterprise Manager Entity Display Name
     * 
     */
    public String enterpriseManagerEntityDisplayName() {
        return this.enterpriseManagerEntityDisplayName;
    }
    /**
     * @return Enterprise Manager Entity Unique Identifier
     * 
     */
    public String enterpriseManagerEntityIdentifier() {
        return this.enterpriseManagerEntityIdentifier;
    }
    /**
     * @return Enterprise Manager Entity Name
     * 
     */
    public String enterpriseManagerEntityName() {
        return this.enterpriseManagerEntityName;
    }
    /**
     * @return Enterprise Manager Entity Type
     * 
     */
    public String enterpriseManagerEntityType() {
        return this.enterpriseManagerEntityType;
    }
    /**
     * @return Enterprise Manager Unique Identifier
     * 
     */
    public String enterpriseManagerIdentifier() {
        return this.enterpriseManagerIdentifier;
    }
    /**
     * @return Source of the Exadata system.
     * 
     */
    public String entitySource() {
        return this.entitySource;
    }
    /**
     * @return The user-friendly name for the Exadata system. The name does not have to be unique.
     * 
     */
    public String exadataDisplayName() {
        return this.exadataDisplayName;
    }
    public String exadataInsightId() {
        return this.exadataInsightId;
    }
    /**
     * @return The Exadata system name. If the Exadata systems managed by Enterprise Manager, the name is unique amongst the Exadata systems managed by the same Enterprise Manager.
     * 
     */
    public String exadataName() {
        return this.exadataName;
    }
    /**
     * @return Exadata rack type.
     * 
     */
    public String exadataRackType() {
        return this.exadataRackType;
    }
    /**
     * @return Operations Insights internal representation of the the Exadata system type.
     * 
     */
    public String exadataType() {
        return this.exadataType;
    }
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return Exadata insight identifier
     * 
     */
    public String id() {
        return this.id;
    }
    public Boolean isAutoSyncEnabled() {
        return this.isAutoSyncEnabled;
    }
    /**
     * @return true if virtualization is used in the Exadata system
     * 
     */
    public Boolean isVirtualizedExadata() {
        return this.isVirtualizedExadata;
    }
    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * @return The current state of the Exadata insight.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Indicates the status of an Exadata insight in Operations Insights
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Map<String,Object> systemTags() {
        return this.systemTags;
    }
    /**
     * @return The time the the Exadata insight was first enabled. An RFC3339 formatted datetime string
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time the Exadata insight was updated. An RFC3339 formatted datetime string
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExadataInsightResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String enterpriseManagerBridgeId;
        private String enterpriseManagerEntityDisplayName;
        private String enterpriseManagerEntityIdentifier;
        private String enterpriseManagerEntityName;
        private String enterpriseManagerEntityType;
        private String enterpriseManagerIdentifier;
        private String entitySource;
        private String exadataDisplayName;
        private String exadataInsightId;
        private String exadataName;
        private String exadataRackType;
        private String exadataType;
        private Map<String,Object> freeformTags;
        private String id;
        private Boolean isAutoSyncEnabled;
        private Boolean isVirtualizedExadata;
        private String lifecycleDetails;
        private String state;
        private String status;
        private Map<String,Object> systemTags;
        private String timeCreated;
        private String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExadataInsightResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.enterpriseManagerBridgeId = defaults.enterpriseManagerBridgeId;
    	      this.enterpriseManagerEntityDisplayName = defaults.enterpriseManagerEntityDisplayName;
    	      this.enterpriseManagerEntityIdentifier = defaults.enterpriseManagerEntityIdentifier;
    	      this.enterpriseManagerEntityName = defaults.enterpriseManagerEntityName;
    	      this.enterpriseManagerEntityType = defaults.enterpriseManagerEntityType;
    	      this.enterpriseManagerIdentifier = defaults.enterpriseManagerIdentifier;
    	      this.entitySource = defaults.entitySource;
    	      this.exadataDisplayName = defaults.exadataDisplayName;
    	      this.exadataInsightId = defaults.exadataInsightId;
    	      this.exadataName = defaults.exadataName;
    	      this.exadataRackType = defaults.exadataRackType;
    	      this.exadataType = defaults.exadataType;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.isAutoSyncEnabled = defaults.isAutoSyncEnabled;
    	      this.isVirtualizedExadata = defaults.isVirtualizedExadata;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
    	      this.systemTags = defaults.systemTags;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder enterpriseManagerBridgeId(String enterpriseManagerBridgeId) {
            this.enterpriseManagerBridgeId = Objects.requireNonNull(enterpriseManagerBridgeId);
            return this;
        }
        public Builder enterpriseManagerEntityDisplayName(String enterpriseManagerEntityDisplayName) {
            this.enterpriseManagerEntityDisplayName = Objects.requireNonNull(enterpriseManagerEntityDisplayName);
            return this;
        }
        public Builder enterpriseManagerEntityIdentifier(String enterpriseManagerEntityIdentifier) {
            this.enterpriseManagerEntityIdentifier = Objects.requireNonNull(enterpriseManagerEntityIdentifier);
            return this;
        }
        public Builder enterpriseManagerEntityName(String enterpriseManagerEntityName) {
            this.enterpriseManagerEntityName = Objects.requireNonNull(enterpriseManagerEntityName);
            return this;
        }
        public Builder enterpriseManagerEntityType(String enterpriseManagerEntityType) {
            this.enterpriseManagerEntityType = Objects.requireNonNull(enterpriseManagerEntityType);
            return this;
        }
        public Builder enterpriseManagerIdentifier(String enterpriseManagerIdentifier) {
            this.enterpriseManagerIdentifier = Objects.requireNonNull(enterpriseManagerIdentifier);
            return this;
        }
        public Builder entitySource(String entitySource) {
            this.entitySource = Objects.requireNonNull(entitySource);
            return this;
        }
        public Builder exadataDisplayName(String exadataDisplayName) {
            this.exadataDisplayName = Objects.requireNonNull(exadataDisplayName);
            return this;
        }
        public Builder exadataInsightId(String exadataInsightId) {
            this.exadataInsightId = Objects.requireNonNull(exadataInsightId);
            return this;
        }
        public Builder exadataName(String exadataName) {
            this.exadataName = Objects.requireNonNull(exadataName);
            return this;
        }
        public Builder exadataRackType(String exadataRackType) {
            this.exadataRackType = Objects.requireNonNull(exadataRackType);
            return this;
        }
        public Builder exadataType(String exadataType) {
            this.exadataType = Objects.requireNonNull(exadataType);
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
        public Builder isAutoSyncEnabled(Boolean isAutoSyncEnabled) {
            this.isAutoSyncEnabled = Objects.requireNonNull(isAutoSyncEnabled);
            return this;
        }
        public Builder isVirtualizedExadata(Boolean isVirtualizedExadata) {
            this.isVirtualizedExadata = Objects.requireNonNull(isVirtualizedExadata);
            return this;
        }
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder systemTags(Map<String,Object> systemTags) {
            this.systemTags = Objects.requireNonNull(systemTags);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }        public GetExadataInsightResult build() {
            return new GetExadataInsightResult(compartmentId, definedTags, enterpriseManagerBridgeId, enterpriseManagerEntityDisplayName, enterpriseManagerEntityIdentifier, enterpriseManagerEntityName, enterpriseManagerEntityType, enterpriseManagerIdentifier, entitySource, exadataDisplayName, exadataInsightId, exadataName, exadataRackType, exadataType, freeformTags, id, isAutoSyncEnabled, isVirtualizedExadata, lifecycleDetails, state, status, systemTags, timeCreated, timeUpdated);
        }
    }
}
