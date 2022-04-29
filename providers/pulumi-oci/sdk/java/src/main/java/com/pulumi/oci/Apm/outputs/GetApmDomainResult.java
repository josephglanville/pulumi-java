// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Apm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetApmDomainResult {
    private final String apmDomainId;
    /**
     * @return The OCID of the compartment corresponding to the APM domain.
     * 
     */
    private final String compartmentId;
    /**
     * @return The endpoint where the APM agents upload their observations and metrics.
     * 
     */
    private final String dataUploadEndpoint;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return Description of the APM domain.
     * 
     */
    private final String description;
    /**
     * @return Display name of the APM domain, which can be updated.
     * 
     */
    private final String displayName;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return Unique identifier that is immutable on creation.
     * 
     */
    private final String id;
    /**
     * @return Indicates if this is an Always Free resource.
     * 
     */
    private final Boolean isFreeTier;
    /**
     * @return The current lifecycle state of the APM domain.
     * 
     */
    private final String state;
    /**
     * @return The time the APM domain was created, expressed in RFC 3339 timestamp format.
     * 
     */
    private final String timeCreated;
    /**
     * @return The time the APM domain was updated, expressed in RFC 3339 timestamp format.
     * 
     */
    private final String timeUpdated;

    @CustomType.Constructor
    private GetApmDomainResult(
        @CustomType.Parameter("apmDomainId") String apmDomainId,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("dataUploadEndpoint") String dataUploadEndpoint,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isFreeTier") Boolean isFreeTier,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated) {
        this.apmDomainId = apmDomainId;
        this.compartmentId = compartmentId;
        this.dataUploadEndpoint = dataUploadEndpoint;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isFreeTier = isFreeTier;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    public String apmDomainId() {
        return this.apmDomainId;
    }
    /**
     * @return The OCID of the compartment corresponding to the APM domain.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The endpoint where the APM agents upload their observations and metrics.
     * 
     */
    public String dataUploadEndpoint() {
        return this.dataUploadEndpoint;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return Description of the APM domain.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Display name of the APM domain, which can be updated.
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
     * @return Unique identifier that is immutable on creation.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates if this is an Always Free resource.
     * 
     */
    public Boolean isFreeTier() {
        return this.isFreeTier;
    }
    /**
     * @return The current lifecycle state of the APM domain.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The time the APM domain was created, expressed in RFC 3339 timestamp format.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time the APM domain was updated, expressed in RFC 3339 timestamp format.
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApmDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apmDomainId;
        private String compartmentId;
        private String dataUploadEndpoint;
        private Map<String,Object> definedTags;
        private String description;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private Boolean isFreeTier;
        private String state;
        private String timeCreated;
        private String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApmDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmDomainId = defaults.apmDomainId;
    	      this.compartmentId = defaults.compartmentId;
    	      this.dataUploadEndpoint = defaults.dataUploadEndpoint;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.isFreeTier = defaults.isFreeTier;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
        }

        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = Objects.requireNonNull(apmDomainId);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder dataUploadEndpoint(String dataUploadEndpoint) {
            this.dataUploadEndpoint = Objects.requireNonNull(dataUploadEndpoint);
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
        public Builder isFreeTier(Boolean isFreeTier) {
            this.isFreeTier = Objects.requireNonNull(isFreeTier);
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
        }        public GetApmDomainResult build() {
            return new GetApmDomainResult(apmDomainId, compartmentId, dataUploadEndpoint, definedTags, description, displayName, freeformTags, id, isFreeTier, state, timeCreated, timeUpdated);
        }
    }
}
