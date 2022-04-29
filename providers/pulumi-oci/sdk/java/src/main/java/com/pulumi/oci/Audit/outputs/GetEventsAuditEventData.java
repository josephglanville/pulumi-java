// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Audit.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Audit.outputs.GetEventsAuditEventDataIdentity;
import com.pulumi.oci.Audit.outputs.GetEventsAuditEventDataRequest;
import com.pulumi.oci.Audit.outputs.GetEventsAuditEventDataResponse;
import com.pulumi.oci.Audit.outputs.GetEventsAuditEventDataStateChange;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetEventsAuditEventData {
    /**
     * @return A container object for attribues unique to the resource emitting the event.
     * 
     */
    private final Map<String,Object> additionalDetails;
    /**
     * @return The availability domain where the resource resides.
     * 
     */
    private final String availabilityDomain;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    private final String compartmentId;
    /**
     * @return The name of the compartment. This value is the friendly name associated with compartmentId. This value can change, but the service logs the value that appeared at the time of the audit event.  Example: `CompartmentA`
     * 
     */
    private final String compartmentName;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return This value links multiple audit events that are part of the same API operation. For example,  a long running API operations that emit an event at the start and the end of an operation would use the same value in this field for both events.
     * 
     */
    private final String eventGroupingId;
    /**
     * @return Name of the API operation that generated this event.  Example: `GetInstance`
     * 
     */
    private final String eventName;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name,  type, or namespace. Exists for cross-compatibility only. For more information,  see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return A container object for identity attributes.
     * 
     */
    private final List<GetEventsAuditEventDataIdentity> identities;
    /**
     * @return A container object for request attributes.
     * 
     */
    private final List<GetEventsAuditEventDataRequest> requests;
    /**
     * @return An [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) or some other ID for the resource emitting the event.
     * 
     */
    private final String resourceId;
    /**
     * @return The name of the resource emitting the event.
     * 
     */
    private final String resourceName;
    /**
     * @return A container object for response attributes.
     * 
     */
    private final List<GetEventsAuditEventDataResponse> responses;
    /**
     * @return A container object for state change attributes.
     * 
     */
    private final List<GetEventsAuditEventDataStateChange> stateChanges;

    @CustomType.Constructor
    private GetEventsAuditEventData(
        @CustomType.Parameter("additionalDetails") Map<String,Object> additionalDetails,
        @CustomType.Parameter("availabilityDomain") String availabilityDomain,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("compartmentName") String compartmentName,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("eventGroupingId") String eventGroupingId,
        @CustomType.Parameter("eventName") String eventName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("identities") List<GetEventsAuditEventDataIdentity> identities,
        @CustomType.Parameter("requests") List<GetEventsAuditEventDataRequest> requests,
        @CustomType.Parameter("resourceId") String resourceId,
        @CustomType.Parameter("resourceName") String resourceName,
        @CustomType.Parameter("responses") List<GetEventsAuditEventDataResponse> responses,
        @CustomType.Parameter("stateChanges") List<GetEventsAuditEventDataStateChange> stateChanges) {
        this.additionalDetails = additionalDetails;
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.compartmentName = compartmentName;
        this.definedTags = definedTags;
        this.eventGroupingId = eventGroupingId;
        this.eventName = eventName;
        this.freeformTags = freeformTags;
        this.identities = identities;
        this.requests = requests;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.responses = responses;
        this.stateChanges = stateChanges;
    }

    /**
     * @return A container object for attribues unique to the resource emitting the event.
     * 
     */
    public Map<String,Object> additionalDetails() {
        return this.additionalDetails;
    }
    /**
     * @return The availability domain where the resource resides.
     * 
     */
    public String availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The name of the compartment. This value is the friendly name associated with compartmentId. This value can change, but the service logs the value that appeared at the time of the audit event.  Example: `CompartmentA`
     * 
     */
    public String compartmentName() {
        return this.compartmentName;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return This value links multiple audit events that are part of the same API operation. For example,  a long running API operations that emit an event at the start and the end of an operation would use the same value in this field for both events.
     * 
     */
    public String eventGroupingId() {
        return this.eventGroupingId;
    }
    /**
     * @return Name of the API operation that generated this event.  Example: `GetInstance`
     * 
     */
    public String eventName() {
        return this.eventName;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name,  type, or namespace. Exists for cross-compatibility only. For more information,  see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return A container object for identity attributes.
     * 
     */
    public List<GetEventsAuditEventDataIdentity> identities() {
        return this.identities;
    }
    /**
     * @return A container object for request attributes.
     * 
     */
    public List<GetEventsAuditEventDataRequest> requests() {
        return this.requests;
    }
    /**
     * @return An [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) or some other ID for the resource emitting the event.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }
    /**
     * @return The name of the resource emitting the event.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }
    /**
     * @return A container object for response attributes.
     * 
     */
    public List<GetEventsAuditEventDataResponse> responses() {
        return this.responses;
    }
    /**
     * @return A container object for state change attributes.
     * 
     */
    public List<GetEventsAuditEventDataStateChange> stateChanges() {
        return this.stateChanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventsAuditEventData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> additionalDetails;
        private String availabilityDomain;
        private String compartmentId;
        private String compartmentName;
        private Map<String,Object> definedTags;
        private String eventGroupingId;
        private String eventName;
        private Map<String,Object> freeformTags;
        private List<GetEventsAuditEventDataIdentity> identities;
        private List<GetEventsAuditEventDataRequest> requests;
        private String resourceId;
        private String resourceName;
        private List<GetEventsAuditEventDataResponse> responses;
        private List<GetEventsAuditEventDataStateChange> stateChanges;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventsAuditEventData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalDetails = defaults.additionalDetails;
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.compartmentId = defaults.compartmentId;
    	      this.compartmentName = defaults.compartmentName;
    	      this.definedTags = defaults.definedTags;
    	      this.eventGroupingId = defaults.eventGroupingId;
    	      this.eventName = defaults.eventName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.identities = defaults.identities;
    	      this.requests = defaults.requests;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceName = defaults.resourceName;
    	      this.responses = defaults.responses;
    	      this.stateChanges = defaults.stateChanges;
        }

        public Builder additionalDetails(Map<String,Object> additionalDetails) {
            this.additionalDetails = Objects.requireNonNull(additionalDetails);
            return this;
        }
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = Objects.requireNonNull(availabilityDomain);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder compartmentName(String compartmentName) {
            this.compartmentName = Objects.requireNonNull(compartmentName);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder eventGroupingId(String eventGroupingId) {
            this.eventGroupingId = Objects.requireNonNull(eventGroupingId);
            return this;
        }
        public Builder eventName(String eventName) {
            this.eventName = Objects.requireNonNull(eventName);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder identities(List<GetEventsAuditEventDataIdentity> identities) {
            this.identities = Objects.requireNonNull(identities);
            return this;
        }
        public Builder identities(GetEventsAuditEventDataIdentity... identities) {
            return identities(List.of(identities));
        }
        public Builder requests(List<GetEventsAuditEventDataRequest> requests) {
            this.requests = Objects.requireNonNull(requests);
            return this;
        }
        public Builder requests(GetEventsAuditEventDataRequest... requests) {
            return requests(List.of(requests));
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder responses(List<GetEventsAuditEventDataResponse> responses) {
            this.responses = Objects.requireNonNull(responses);
            return this;
        }
        public Builder responses(GetEventsAuditEventDataResponse... responses) {
            return responses(List.of(responses));
        }
        public Builder stateChanges(List<GetEventsAuditEventDataStateChange> stateChanges) {
            this.stateChanges = Objects.requireNonNull(stateChanges);
            return this;
        }
        public Builder stateChanges(GetEventsAuditEventDataStateChange... stateChanges) {
            return stateChanges(List.of(stateChanges));
        }        public GetEventsAuditEventData build() {
            return new GetEventsAuditEventData(additionalDetails, availabilityDomain, compartmentId, compartmentName, definedTags, eventGroupingId, eventName, freeformTags, identities, requests, resourceId, resourceName, responses, stateChanges);
        }
    }
}
