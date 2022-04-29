// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.GetKeyStoresKeyStoreAssociatedDatabase;
import com.pulumi.oci.Database.outputs.GetKeyStoresKeyStoreTypeDetail;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetKeyStoresKeyStore {
    /**
     * @return List of databases associated with the key store.
     * 
     */
    private final List<GetKeyStoresKeyStoreAssociatedDatabase> associatedDatabases;
    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The user-friendly name for the key store. The name does not need to be unique.
     * 
     */
    private final String displayName;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key store.
     * 
     */
    private final String id;
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    private final String lifecycleDetails;
    /**
     * @return The current state of the key store.
     * 
     */
    private final String state;
    /**
     * @return The date and time that the key store was created.
     * 
     */
    private final String timeCreated;
    /**
     * @return Key store type details.
     * 
     */
    private final List<GetKeyStoresKeyStoreTypeDetail> typeDetails;

    @CustomType.Constructor
    private GetKeyStoresKeyStore(
        @CustomType.Parameter("associatedDatabases") List<GetKeyStoresKeyStoreAssociatedDatabase> associatedDatabases,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("typeDetails") List<GetKeyStoresKeyStoreTypeDetail> typeDetails) {
        this.associatedDatabases = associatedDatabases;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.lifecycleDetails = lifecycleDetails;
        this.state = state;
        this.timeCreated = timeCreated;
        this.typeDetails = typeDetails;
    }

    /**
     * @return List of databases associated with the key store.
     * 
     */
    public List<GetKeyStoresKeyStoreAssociatedDatabase> associatedDatabases() {
        return this.associatedDatabases;
    }
    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return The user-friendly name for the key store. The name does not need to be unique.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key store.
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
     * @return The current state of the key store.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time that the key store was created.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return Key store type details.
     * 
     */
    public List<GetKeyStoresKeyStoreTypeDetail> typeDetails() {
        return this.typeDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyStoresKeyStore defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetKeyStoresKeyStoreAssociatedDatabase> associatedDatabases;
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private String lifecycleDetails;
        private String state;
        private String timeCreated;
        private List<GetKeyStoresKeyStoreTypeDetail> typeDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyStoresKeyStore defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedDatabases = defaults.associatedDatabases;
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.typeDetails = defaults.typeDetails;
        }

        public Builder associatedDatabases(List<GetKeyStoresKeyStoreAssociatedDatabase> associatedDatabases) {
            this.associatedDatabases = Objects.requireNonNull(associatedDatabases);
            return this;
        }
        public Builder associatedDatabases(GetKeyStoresKeyStoreAssociatedDatabase... associatedDatabases) {
            return associatedDatabases(List.of(associatedDatabases));
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
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
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder typeDetails(List<GetKeyStoresKeyStoreTypeDetail> typeDetails) {
            this.typeDetails = Objects.requireNonNull(typeDetails);
            return this;
        }
        public Builder typeDetails(GetKeyStoresKeyStoreTypeDetail... typeDetails) {
            return typeDetails(List.of(typeDetails));
        }        public GetKeyStoresKeyStore build() {
            return new GetKeyStoresKeyStore(associatedDatabases, compartmentId, definedTags, displayName, freeformTags, id, lifecycleDetails, state, timeCreated, typeDetails);
        }
    }
}
