// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Sch.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Sch.outputs.GetServiceConnectorsServiceConnectorCollectionItemSource;
import com.pulumi.oci.Sch.outputs.GetServiceConnectorsServiceConnectorCollectionItemTarget;
import com.pulumi.oci.Sch.outputs.GetServiceConnectorsServiceConnectorCollectionItemTask;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServiceConnectorsServiceConnectorCollectionItem {
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment for this request.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The description of the resource. Avoid entering confidential information.
     * 
     */
    private final String description;
    /**
     * @return A filter to return only resources that match the given display name exactly.  Example: `example_service_connector`
     * 
     */
    private final String displayName;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the service connector.
     * 
     */
    private final String id;
    /**
     * @return A message describing the current state in more detail. For example, the message might provide actionable information for a resource in a `FAILED` state.
     * 
     */
    private final String lifecyleDetails;
    /**
     * @return An object that represents the source of the flow defined by the service connector. An example source is the VCNFlow logs within the NetworkLogs group. For more information about flows defined by service connectors, see [Service Connector Hub Overview](https://docs.cloud.oracle.com/iaas/Content/service-connector-hub/overview.htm). For configuration instructions, see [To create a service connector](https://docs.cloud.oracle.com/iaas/Content/service-connector-hub/managingconnectors.htm#create).
     * 
     */
    private final List<GetServiceConnectorsServiceConnectorCollectionItemSource> sources;
    /**
     * @return A filter to return only resources that match the given lifecycle state.  Example: `ACTIVE`
     * 
     */
    private final String state;
    /**
     * @return The system tags associated with this resource, if any. The system tags are set by Oracle Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{orcl-cloud: {free-tier-retain: true}}`
     * 
     */
    private final Map<String,Object> systemTags;
    /**
     * @return An object that represents the target of the flow defined by the service connector. An example target is a stream (Streaming service). For more information about flows defined by service connectors, see [Service Connector Hub Overview](https://docs.cloud.oracle.com/iaas/Content/service-connector-hub/overview.htm). For configuration instructions, see [To create a service connector](https://docs.cloud.oracle.com/iaas/Content/service-connector-hub/managingconnectors.htm#create).
     * 
     */
    private final List<GetServiceConnectorsServiceConnectorCollectionItemTarget> targets;
    /**
     * @return The list of tasks.
     * 
     */
    private final List<GetServiceConnectorsServiceConnectorCollectionItemTask> tasks;
    /**
     * @return The date and time when the service connector was created. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: `2020-01-25T21:10:29.600Z`
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time when the service connector was updated. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: `2020-01-25T21:10:29.600Z`
     * 
     */
    private final String timeUpdated;

    @CustomType.Constructor
    private GetServiceConnectorsServiceConnectorCollectionItem(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lifecyleDetails") String lifecyleDetails,
        @CustomType.Parameter("sources") List<GetServiceConnectorsServiceConnectorCollectionItemSource> sources,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("systemTags") Map<String,Object> systemTags,
        @CustomType.Parameter("targets") List<GetServiceConnectorsServiceConnectorCollectionItemTarget> targets,
        @CustomType.Parameter("tasks") List<GetServiceConnectorsServiceConnectorCollectionItemTask> tasks,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated) {
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.lifecyleDetails = lifecyleDetails;
        this.sources = sources;
        this.state = state;
        this.systemTags = systemTags;
        this.targets = targets;
        this.tasks = tasks;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment for this request.
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
     * @return The description of the resource. Avoid entering confidential information.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A filter to return only resources that match the given display name exactly.  Example: `example_service_connector`
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
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the service connector.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A message describing the current state in more detail. For example, the message might provide actionable information for a resource in a `FAILED` state.
     * 
     */
    public String lifecyleDetails() {
        return this.lifecyleDetails;
    }
    /**
     * @return An object that represents the source of the flow defined by the service connector. An example source is the VCNFlow logs within the NetworkLogs group. For more information about flows defined by service connectors, see [Service Connector Hub Overview](https://docs.cloud.oracle.com/iaas/Content/service-connector-hub/overview.htm). For configuration instructions, see [To create a service connector](https://docs.cloud.oracle.com/iaas/Content/service-connector-hub/managingconnectors.htm#create).
     * 
     */
    public List<GetServiceConnectorsServiceConnectorCollectionItemSource> sources() {
        return this.sources;
    }
    /**
     * @return A filter to return only resources that match the given lifecycle state.  Example: `ACTIVE`
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The system tags associated with this resource, if any. The system tags are set by Oracle Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{orcl-cloud: {free-tier-retain: true}}`
     * 
     */
    public Map<String,Object> systemTags() {
        return this.systemTags;
    }
    /**
     * @return An object that represents the target of the flow defined by the service connector. An example target is a stream (Streaming service). For more information about flows defined by service connectors, see [Service Connector Hub Overview](https://docs.cloud.oracle.com/iaas/Content/service-connector-hub/overview.htm). For configuration instructions, see [To create a service connector](https://docs.cloud.oracle.com/iaas/Content/service-connector-hub/managingconnectors.htm#create).
     * 
     */
    public List<GetServiceConnectorsServiceConnectorCollectionItemTarget> targets() {
        return this.targets;
    }
    /**
     * @return The list of tasks.
     * 
     */
    public List<GetServiceConnectorsServiceConnectorCollectionItemTask> tasks() {
        return this.tasks;
    }
    /**
     * @return The date and time when the service connector was created. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: `2020-01-25T21:10:29.600Z`
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time when the service connector was updated. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: `2020-01-25T21:10:29.600Z`
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceConnectorsServiceConnectorCollectionItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String description;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private String lifecyleDetails;
        private List<GetServiceConnectorsServiceConnectorCollectionItemSource> sources;
        private String state;
        private Map<String,Object> systemTags;
        private List<GetServiceConnectorsServiceConnectorCollectionItemTarget> targets;
        private List<GetServiceConnectorsServiceConnectorCollectionItemTask> tasks;
        private String timeCreated;
        private String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceConnectorsServiceConnectorCollectionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.lifecyleDetails = defaults.lifecyleDetails;
    	      this.sources = defaults.sources;
    	      this.state = defaults.state;
    	      this.systemTags = defaults.systemTags;
    	      this.targets = defaults.targets;
    	      this.tasks = defaults.tasks;
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
        public Builder lifecyleDetails(String lifecyleDetails) {
            this.lifecyleDetails = Objects.requireNonNull(lifecyleDetails);
            return this;
        }
        public Builder sources(List<GetServiceConnectorsServiceConnectorCollectionItemSource> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }
        public Builder sources(GetServiceConnectorsServiceConnectorCollectionItemSource... sources) {
            return sources(List.of(sources));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder systemTags(Map<String,Object> systemTags) {
            this.systemTags = Objects.requireNonNull(systemTags);
            return this;
        }
        public Builder targets(List<GetServiceConnectorsServiceConnectorCollectionItemTarget> targets) {
            this.targets = Objects.requireNonNull(targets);
            return this;
        }
        public Builder targets(GetServiceConnectorsServiceConnectorCollectionItemTarget... targets) {
            return targets(List.of(targets));
        }
        public Builder tasks(List<GetServiceConnectorsServiceConnectorCollectionItemTask> tasks) {
            this.tasks = Objects.requireNonNull(tasks);
            return this;
        }
        public Builder tasks(GetServiceConnectorsServiceConnectorCollectionItemTask... tasks) {
            return tasks(List.of(tasks));
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }        public GetServiceConnectorsServiceConnectorCollectionItem build() {
            return new GetServiceConnectorsServiceConnectorCollectionItem(compartmentId, definedTags, description, displayName, freeformTags, id, lifecyleDetails, sources, state, systemTags, targets, tasks, timeCreated, timeUpdated);
        }
    }
}
