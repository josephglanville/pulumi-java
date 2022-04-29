// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.GetCloudExadataInfrastructuresCloudExadataInfrastructureCustomerContact;
import com.pulumi.oci.Database.outputs.GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindow;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCloudExadataInfrastructuresCloudExadataInfrastructure {
    /**
     * @return The name of the availability domain that the cloud Exadata infrastructure resource is located in.
     * 
     */
    private final String availabilityDomain;
    /**
     * @return The available storage can be allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
     * 
     */
    private final Integer availableStorageSizeInGbs;
    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final String compartmentId;
    /**
     * @return The number of compute servers for the cloud Exadata infrastructure.
     * 
     */
    private final Integer computeCount;
    /**
     * @return The list of customer email addresses that receive information from Oracle about the specified Oracle Cloud Infrastructure Database service resource. Oracle uses these email addresses to send notifications about planned and unplanned software maintenance updates, information about system hardware, and other information needed by administrators. Up to 10 email addresses can be added to the customer contacts for a cloud Exadata infrastructure instance.
     * 
     */
    private final List<GetCloudExadataInfrastructuresCloudExadataInfrastructureCustomerContact> customerContacts;
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
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure resource.
     * 
     */
    private final String id;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last maintenance run.
     * 
     */
    private final String lastMaintenanceRunId;
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    private final String lifecycleDetails;
    /**
     * @return The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
     * 
     */
    private final List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindow> maintenanceWindows;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next maintenance run.
     * 
     */
    private final String nextMaintenanceRunId;
    /**
     * @return The model name of the cloud Exadata infrastructure resource.
     * 
     */
    private final String shape;
    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    private final String state;
    /**
     * @return The number of storage servers for the cloud Exadata infrastructure.
     * 
     */
    private final Integer storageCount;
    /**
     * @return The date and time the cloud Exadata infrastructure resource was created.
     * 
     */
    private final String timeCreated;
    /**
     * @return The total storage allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
     * 
     */
    private final Integer totalStorageSizeInGbs;

    @CustomType.Constructor
    private GetCloudExadataInfrastructuresCloudExadataInfrastructure(
        @CustomType.Parameter("availabilityDomain") String availabilityDomain,
        @CustomType.Parameter("availableStorageSizeInGbs") Integer availableStorageSizeInGbs,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("computeCount") Integer computeCount,
        @CustomType.Parameter("customerContacts") List<GetCloudExadataInfrastructuresCloudExadataInfrastructureCustomerContact> customerContacts,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastMaintenanceRunId") String lastMaintenanceRunId,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("maintenanceWindows") List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindow> maintenanceWindows,
        @CustomType.Parameter("nextMaintenanceRunId") String nextMaintenanceRunId,
        @CustomType.Parameter("shape") String shape,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("storageCount") Integer storageCount,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("totalStorageSizeInGbs") Integer totalStorageSizeInGbs) {
        this.availabilityDomain = availabilityDomain;
        this.availableStorageSizeInGbs = availableStorageSizeInGbs;
        this.compartmentId = compartmentId;
        this.computeCount = computeCount;
        this.customerContacts = customerContacts;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.lastMaintenanceRunId = lastMaintenanceRunId;
        this.lifecycleDetails = lifecycleDetails;
        this.maintenanceWindows = maintenanceWindows;
        this.nextMaintenanceRunId = nextMaintenanceRunId;
        this.shape = shape;
        this.state = state;
        this.storageCount = storageCount;
        this.timeCreated = timeCreated;
        this.totalStorageSizeInGbs = totalStorageSizeInGbs;
    }

    /**
     * @return The name of the availability domain that the cloud Exadata infrastructure resource is located in.
     * 
     */
    public String availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * @return The available storage can be allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
     * 
     */
    public Integer availableStorageSizeInGbs() {
        return this.availableStorageSizeInGbs;
    }
    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The number of compute servers for the cloud Exadata infrastructure.
     * 
     */
    public Integer computeCount() {
        return this.computeCount;
    }
    /**
     * @return The list of customer email addresses that receive information from Oracle about the specified Oracle Cloud Infrastructure Database service resource. Oracle uses these email addresses to send notifications about planned and unplanned software maintenance updates, information about system hardware, and other information needed by administrators. Up to 10 email addresses can be added to the customer contacts for a cloud Exadata infrastructure instance.
     * 
     */
    public List<GetCloudExadataInfrastructuresCloudExadataInfrastructureCustomerContact> customerContacts() {
        return this.customerContacts;
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
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last maintenance run.
     * 
     */
    public String lastMaintenanceRunId() {
        return this.lastMaintenanceRunId;
    }
    /**
     * @return Additional information about the current lifecycle state.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * @return The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
     * 
     */
    public List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindow> maintenanceWindows() {
        return this.maintenanceWindows;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next maintenance run.
     * 
     */
    public String nextMaintenanceRunId() {
        return this.nextMaintenanceRunId;
    }
    /**
     * @return The model name of the cloud Exadata infrastructure resource.
     * 
     */
    public String shape() {
        return this.shape;
    }
    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The number of storage servers for the cloud Exadata infrastructure.
     * 
     */
    public Integer storageCount() {
        return this.storageCount;
    }
    /**
     * @return The date and time the cloud Exadata infrastructure resource was created.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The total storage allocated to the cloud Exadata infrastructure resource, in gigabytes (GB).
     * 
     */
    public Integer totalStorageSizeInGbs() {
        return this.totalStorageSizeInGbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudExadataInfrastructuresCloudExadataInfrastructure defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityDomain;
        private Integer availableStorageSizeInGbs;
        private String compartmentId;
        private Integer computeCount;
        private List<GetCloudExadataInfrastructuresCloudExadataInfrastructureCustomerContact> customerContacts;
        private Map<String,Object> definedTags;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private String lastMaintenanceRunId;
        private String lifecycleDetails;
        private List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindow> maintenanceWindows;
        private String nextMaintenanceRunId;
        private String shape;
        private String state;
        private Integer storageCount;
        private String timeCreated;
        private Integer totalStorageSizeInGbs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudExadataInfrastructuresCloudExadataInfrastructure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.availableStorageSizeInGbs = defaults.availableStorageSizeInGbs;
    	      this.compartmentId = defaults.compartmentId;
    	      this.computeCount = defaults.computeCount;
    	      this.customerContacts = defaults.customerContacts;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.lastMaintenanceRunId = defaults.lastMaintenanceRunId;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.maintenanceWindows = defaults.maintenanceWindows;
    	      this.nextMaintenanceRunId = defaults.nextMaintenanceRunId;
    	      this.shape = defaults.shape;
    	      this.state = defaults.state;
    	      this.storageCount = defaults.storageCount;
    	      this.timeCreated = defaults.timeCreated;
    	      this.totalStorageSizeInGbs = defaults.totalStorageSizeInGbs;
        }

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = Objects.requireNonNull(availabilityDomain);
            return this;
        }
        public Builder availableStorageSizeInGbs(Integer availableStorageSizeInGbs) {
            this.availableStorageSizeInGbs = Objects.requireNonNull(availableStorageSizeInGbs);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder computeCount(Integer computeCount) {
            this.computeCount = Objects.requireNonNull(computeCount);
            return this;
        }
        public Builder customerContacts(List<GetCloudExadataInfrastructuresCloudExadataInfrastructureCustomerContact> customerContacts) {
            this.customerContacts = Objects.requireNonNull(customerContacts);
            return this;
        }
        public Builder customerContacts(GetCloudExadataInfrastructuresCloudExadataInfrastructureCustomerContact... customerContacts) {
            return customerContacts(List.of(customerContacts));
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
        public Builder lastMaintenanceRunId(String lastMaintenanceRunId) {
            this.lastMaintenanceRunId = Objects.requireNonNull(lastMaintenanceRunId);
            return this;
        }
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder maintenanceWindows(List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindow> maintenanceWindows) {
            this.maintenanceWindows = Objects.requireNonNull(maintenanceWindows);
            return this;
        }
        public Builder maintenanceWindows(GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindow... maintenanceWindows) {
            return maintenanceWindows(List.of(maintenanceWindows));
        }
        public Builder nextMaintenanceRunId(String nextMaintenanceRunId) {
            this.nextMaintenanceRunId = Objects.requireNonNull(nextMaintenanceRunId);
            return this;
        }
        public Builder shape(String shape) {
            this.shape = Objects.requireNonNull(shape);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder storageCount(Integer storageCount) {
            this.storageCount = Objects.requireNonNull(storageCount);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder totalStorageSizeInGbs(Integer totalStorageSizeInGbs) {
            this.totalStorageSizeInGbs = Objects.requireNonNull(totalStorageSizeInGbs);
            return this;
        }        public GetCloudExadataInfrastructuresCloudExadataInfrastructure build() {
            return new GetCloudExadataInfrastructuresCloudExadataInfrastructure(availabilityDomain, availableStorageSizeInGbs, compartmentId, computeCount, customerContacts, definedTags, displayName, freeformTags, id, lastMaintenanceRunId, lifecycleDetails, maintenanceWindows, nextMaintenanceRunId, shape, state, storageCount, timeCreated, totalStorageSizeInGbs);
        }
    }
}
