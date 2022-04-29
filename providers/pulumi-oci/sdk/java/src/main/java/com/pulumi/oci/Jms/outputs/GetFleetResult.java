// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Jms.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Jms.outputs.GetFleetInventoryLog;
import com.pulumi.oci.Jms.outputs.GetFleetOperationLog;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetFleetResult {
    /**
     * @return The approximate count of all unique applications in the Fleet in the past seven days. This metric is provided on a best-effort manner, and is not taken into account when computing the resource ETag.
     * 
     */
    private final Integer approximateApplicationCount;
    /**
     * @return The approximate count of all unique Java installations in the Fleet in the past seven days. This metric is provided on a best-effort manner, and is not taken into account when computing the resource ETag.
     * 
     */
    private final Integer approximateInstallationCount;
    /**
     * @return The approximate count of all unique Java Runtimes in the Fleet in the past seven days. This metric is provided on a best-effort manner, and is not taken into account when computing the resource ETag.
     * 
     */
    private final Integer approximateJreCount;
    /**
     * @return The approximate count of all unique managed instances in the Fleet in the past seven days. This metric is provided on a best-effort manner, and is not taken into account when computing the resource ETag.
     * 
     */
    private final Integer approximateManagedInstanceCount;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment of the Fleet.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`. (See [Understanding Free-form Tags](https://docs.cloud.oracle.com/iaas/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The Fleet&#39;s description.
     * 
     */
    private final String description;
    /**
     * @return The name of the Fleet.
     * 
     */
    private final String displayName;
    private final String fleetId;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`. (See [Managing Tags and Tag Namespaces](https://docs.cloud.oracle.com/iaas/Content/Tagging/Concepts/understandingfreeformtags.htm).)
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Fleet.
     * 
     */
    private final String id;
    /**
     * @return Custom Log for inventory or operation log.
     * 
     */
    private final List<GetFleetInventoryLog> inventoryLogs;
    /**
     * @return Custom Log for inventory or operation log.
     * 
     */
    private final List<GetFleetOperationLog> operationLogs;
    /**
     * @return The lifecycle state of the Fleet.
     * 
     */
    private final String state;
    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags can be viewed by users, but can only be created by the system.  Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    private final Map<String,Object> systemTags;
    /**
     * @return The creation date and time of the Fleet (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     * 
     */
    private final String timeCreated;

    @CustomType.Constructor
    private GetFleetResult(
        @CustomType.Parameter("approximateApplicationCount") Integer approximateApplicationCount,
        @CustomType.Parameter("approximateInstallationCount") Integer approximateInstallationCount,
        @CustomType.Parameter("approximateJreCount") Integer approximateJreCount,
        @CustomType.Parameter("approximateManagedInstanceCount") Integer approximateManagedInstanceCount,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("fleetId") String fleetId,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("inventoryLogs") List<GetFleetInventoryLog> inventoryLogs,
        @CustomType.Parameter("operationLogs") List<GetFleetOperationLog> operationLogs,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("systemTags") Map<String,Object> systemTags,
        @CustomType.Parameter("timeCreated") String timeCreated) {
        this.approximateApplicationCount = approximateApplicationCount;
        this.approximateInstallationCount = approximateInstallationCount;
        this.approximateJreCount = approximateJreCount;
        this.approximateManagedInstanceCount = approximateManagedInstanceCount;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.fleetId = fleetId;
        this.freeformTags = freeformTags;
        this.id = id;
        this.inventoryLogs = inventoryLogs;
        this.operationLogs = operationLogs;
        this.state = state;
        this.systemTags = systemTags;
        this.timeCreated = timeCreated;
    }

    /**
     * @return The approximate count of all unique applications in the Fleet in the past seven days. This metric is provided on a best-effort manner, and is not taken into account when computing the resource ETag.
     * 
     */
    public Integer approximateApplicationCount() {
        return this.approximateApplicationCount;
    }
    /**
     * @return The approximate count of all unique Java installations in the Fleet in the past seven days. This metric is provided on a best-effort manner, and is not taken into account when computing the resource ETag.
     * 
     */
    public Integer approximateInstallationCount() {
        return this.approximateInstallationCount;
    }
    /**
     * @return The approximate count of all unique Java Runtimes in the Fleet in the past seven days. This metric is provided on a best-effort manner, and is not taken into account when computing the resource ETag.
     * 
     */
    public Integer approximateJreCount() {
        return this.approximateJreCount;
    }
    /**
     * @return The approximate count of all unique managed instances in the Fleet in the past seven days. This metric is provided on a best-effort manner, and is not taken into account when computing the resource ETag.
     * 
     */
    public Integer approximateManagedInstanceCount() {
        return this.approximateManagedInstanceCount;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment of the Fleet.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`. (See [Understanding Free-form Tags](https://docs.cloud.oracle.com/iaas/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return The Fleet&#39;s description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The name of the Fleet.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    public String fleetId() {
        return this.fleetId;
    }
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`. (See [Managing Tags and Tag Namespaces](https://docs.cloud.oracle.com/iaas/Content/Tagging/Concepts/understandingfreeformtags.htm).)
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Fleet.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Custom Log for inventory or operation log.
     * 
     */
    public List<GetFleetInventoryLog> inventoryLogs() {
        return this.inventoryLogs;
    }
    /**
     * @return Custom Log for inventory or operation log.
     * 
     */
    public List<GetFleetOperationLog> operationLogs() {
        return this.operationLogs;
    }
    /**
     * @return The lifecycle state of the Fleet.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags can be viewed by users, but can only be created by the system.  Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Map<String,Object> systemTags() {
        return this.systemTags;
    }
    /**
     * @return The creation date and time of the Fleet (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFleetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer approximateApplicationCount;
        private Integer approximateInstallationCount;
        private Integer approximateJreCount;
        private Integer approximateManagedInstanceCount;
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String description;
        private String displayName;
        private String fleetId;
        private Map<String,Object> freeformTags;
        private String id;
        private List<GetFleetInventoryLog> inventoryLogs;
        private List<GetFleetOperationLog> operationLogs;
        private String state;
        private Map<String,Object> systemTags;
        private String timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFleetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approximateApplicationCount = defaults.approximateApplicationCount;
    	      this.approximateInstallationCount = defaults.approximateInstallationCount;
    	      this.approximateJreCount = defaults.approximateJreCount;
    	      this.approximateManagedInstanceCount = defaults.approximateManagedInstanceCount;
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.fleetId = defaults.fleetId;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.inventoryLogs = defaults.inventoryLogs;
    	      this.operationLogs = defaults.operationLogs;
    	      this.state = defaults.state;
    	      this.systemTags = defaults.systemTags;
    	      this.timeCreated = defaults.timeCreated;
        }

        public Builder approximateApplicationCount(Integer approximateApplicationCount) {
            this.approximateApplicationCount = Objects.requireNonNull(approximateApplicationCount);
            return this;
        }
        public Builder approximateInstallationCount(Integer approximateInstallationCount) {
            this.approximateInstallationCount = Objects.requireNonNull(approximateInstallationCount);
            return this;
        }
        public Builder approximateJreCount(Integer approximateJreCount) {
            this.approximateJreCount = Objects.requireNonNull(approximateJreCount);
            return this;
        }
        public Builder approximateManagedInstanceCount(Integer approximateManagedInstanceCount) {
            this.approximateManagedInstanceCount = Objects.requireNonNull(approximateManagedInstanceCount);
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
        public Builder fleetId(String fleetId) {
            this.fleetId = Objects.requireNonNull(fleetId);
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
        public Builder inventoryLogs(List<GetFleetInventoryLog> inventoryLogs) {
            this.inventoryLogs = Objects.requireNonNull(inventoryLogs);
            return this;
        }
        public Builder inventoryLogs(GetFleetInventoryLog... inventoryLogs) {
            return inventoryLogs(List.of(inventoryLogs));
        }
        public Builder operationLogs(List<GetFleetOperationLog> operationLogs) {
            this.operationLogs = Objects.requireNonNull(operationLogs);
            return this;
        }
        public Builder operationLogs(GetFleetOperationLog... operationLogs) {
            return operationLogs(List.of(operationLogs));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder systemTags(Map<String,Object> systemTags) {
            this.systemTags = Objects.requireNonNull(systemTags);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }        public GetFleetResult build() {
            return new GetFleetResult(approximateApplicationCount, approximateInstallationCount, approximateJreCount, approximateManagedInstanceCount, compartmentId, definedTags, description, displayName, fleetId, freeformTags, id, inventoryLogs, operationLogs, state, systemTags, timeCreated);
        }
    }
}
