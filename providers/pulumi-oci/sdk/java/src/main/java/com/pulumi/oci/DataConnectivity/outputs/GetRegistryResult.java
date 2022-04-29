// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRegistryResult {
    /**
     * @return Compartment Identifier
     * 
     */
    private final String compartmentId;
    /**
     * @return Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return Registry description
     * 
     */
    private final String description;
    /**
     * @return Data Connectivity Management Registry display name, registries can be renamed
     * 
     */
    private final String displayName;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return Unique identifier that is immutable on creation
     * 
     */
    private final String id;
    private final String registryId;
    /**
     * @return Lifecycle states for registries in Data Connectivity Management Service CREATING - The resource is being created and may not be usable until the entire metadata is defined UPDATING - The resource is being updated and may not be usable until all changes are commited DELETING - The resource is being deleted and might require deep cleanup of children. ACTIVE   - The resource is valid and available for access INACTIVE - The resource might be incomplete in its definition or might have been made unavailable for administrative reasons DELETED  - The resource has been deleted and isn&#39;t available FAILED   - The resource is in a failed state due to validation or other errors
     * 
     */
    private final String state;
    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    private final String stateMessage;
    /**
     * @return The time the Data Connectivity Management Registry was created. An RFC3339 formatted datetime string
     * 
     */
    private final String timeCreated;
    /**
     * @return The time the Data Connectivity Management Registry was updated. An RFC3339 formatted datetime string
     * 
     */
    private final String timeUpdated;
    /**
     * @return Name of the user who updated the DCMS Registry.
     * 
     */
    private final String updatedBy;

    @CustomType.Constructor
    private GetRegistryResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("registryId") String registryId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateMessage") String stateMessage,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated,
        @CustomType.Parameter("updatedBy") String updatedBy) {
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.registryId = registryId;
        this.state = state;
        this.stateMessage = stateMessage;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.updatedBy = updatedBy;
    }

    /**
     * @return Compartment Identifier
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return Registry description
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Data Connectivity Management Registry display name, registries can be renamed
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return Unique identifier that is immutable on creation
     * 
     */
    public String id() {
        return this.id;
    }
    public String registryId() {
        return this.registryId;
    }
    /**
     * @return Lifecycle states for registries in Data Connectivity Management Service CREATING - The resource is being created and may not be usable until the entire metadata is defined UPDATING - The resource is being updated and may not be usable until all changes are commited DELETING - The resource is being deleted and might require deep cleanup of children. ACTIVE   - The resource is valid and available for access INACTIVE - The resource might be incomplete in its definition or might have been made unavailable for administrative reasons DELETED  - The resource has been deleted and isn&#39;t available FAILED   - The resource is in a failed state due to validation or other errors
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    public String stateMessage() {
        return this.stateMessage;
    }
    /**
     * @return The time the Data Connectivity Management Registry was created. An RFC3339 formatted datetime string
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time the Data Connectivity Management Registry was updated. An RFC3339 formatted datetime string
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * @return Name of the user who updated the DCMS Registry.
     * 
     */
    public String updatedBy() {
        return this.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String description;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private String registryId;
        private String state;
        private String stateMessage;
        private String timeCreated;
        private String timeUpdated;
        private String updatedBy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.registryId = defaults.registryId;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
    	      this.updatedBy = defaults.updatedBy;
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
        public Builder registryId(String registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = Objects.requireNonNull(stateMessage);
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
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = Objects.requireNonNull(updatedBy);
            return this;
        }        public GetRegistryResult build() {
            return new GetRegistryResult(compartmentId, definedTags, description, displayName, freeformTags, id, registryId, state, stateMessage, timeCreated, timeUpdated, updatedBy);
        }
    }
}
