// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Oda.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetOdaInstancesOdaInstance {
    /**
     * @return List the Digital Assistant instances that belong to this compartment.
     * 
     */
    private final String compartmentId;
    /**
     * @return URL for the connector&#39;s endpoint.
     * 
     */
    private final String connectorUrl;
    /**
     * @return Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return Description of the Digital Assistant instance.
     * 
     */
    private final String description;
    /**
     * @return List only the information for the Digital Assistant instance with this user-friendly name. These names don&#39;t have to be unique and may change.  Example: `My new resource`
     * 
     */
    private final String displayName;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return Unique immutable identifier that was assigned when the instance was created.
     * 
     */
    private final String id;
    /**
     * @return The current sub-state of the Digital Assistant instance.
     * 
     */
    private final String lifecycleSubState;
    /**
     * @return Shape or size of the instance.
     * 
     */
    private final String shapeName;
    /**
     * @return List only the Digital Assistant instances that are in this lifecycle state.
     * 
     */
    private final String state;
    /**
     * @return A message that describes the current state in more detail. For example, actionable information about an instance that&#39;s in the `FAILED` state.
     * 
     */
    private final String stateMessage;
    /**
     * @return When the Digital Assistant instance was created. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     * 
     */
    private final String timeCreated;
    /**
     * @return When the Digital Assistance instance was last updated. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     * 
     */
    private final String timeUpdated;
    /**
     * @return URL for the Digital Assistant web application that&#39;s associated with the instance.
     * 
     */
    private final String webAppUrl;

    @CustomType.Constructor
    private GetOdaInstancesOdaInstance(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("connectorUrl") String connectorUrl,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lifecycleSubState") String lifecycleSubState,
        @CustomType.Parameter("shapeName") String shapeName,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateMessage") String stateMessage,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated,
        @CustomType.Parameter("webAppUrl") String webAppUrl) {
        this.compartmentId = compartmentId;
        this.connectorUrl = connectorUrl;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.lifecycleSubState = lifecycleSubState;
        this.shapeName = shapeName;
        this.state = state;
        this.stateMessage = stateMessage;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.webAppUrl = webAppUrl;
    }

    /**
     * @return List the Digital Assistant instances that belong to this compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return URL for the connector&#39;s endpoint.
     * 
     */
    public String connectorUrl() {
        return this.connectorUrl;
    }
    /**
     * @return Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return Description of the Digital Assistant instance.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return List only the information for the Digital Assistant instance with this user-friendly name. These names don&#39;t have to be unique and may change.  Example: `My new resource`
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
     * @return Unique immutable identifier that was assigned when the instance was created.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The current sub-state of the Digital Assistant instance.
     * 
     */
    public String lifecycleSubState() {
        return this.lifecycleSubState;
    }
    /**
     * @return Shape or size of the instance.
     * 
     */
    public String shapeName() {
        return this.shapeName;
    }
    /**
     * @return List only the Digital Assistant instances that are in this lifecycle state.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return A message that describes the current state in more detail. For example, actionable information about an instance that&#39;s in the `FAILED` state.
     * 
     */
    public String stateMessage() {
        return this.stateMessage;
    }
    /**
     * @return When the Digital Assistant instance was created. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return When the Digital Assistance instance was last updated. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * @return URL for the Digital Assistant web application that&#39;s associated with the instance.
     * 
     */
    public String webAppUrl() {
        return this.webAppUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOdaInstancesOdaInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private String connectorUrl;
        private Map<String,Object> definedTags;
        private String description;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private String lifecycleSubState;
        private String shapeName;
        private String state;
        private String stateMessage;
        private String timeCreated;
        private String timeUpdated;
        private String webAppUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOdaInstancesOdaInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.connectorUrl = defaults.connectorUrl;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.lifecycleSubState = defaults.lifecycleSubState;
    	      this.shapeName = defaults.shapeName;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
    	      this.webAppUrl = defaults.webAppUrl;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder connectorUrl(String connectorUrl) {
            this.connectorUrl = Objects.requireNonNull(connectorUrl);
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
        public Builder lifecycleSubState(String lifecycleSubState) {
            this.lifecycleSubState = Objects.requireNonNull(lifecycleSubState);
            return this;
        }
        public Builder shapeName(String shapeName) {
            this.shapeName = Objects.requireNonNull(shapeName);
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
        public Builder webAppUrl(String webAppUrl) {
            this.webAppUrl = Objects.requireNonNull(webAppUrl);
            return this;
        }        public GetOdaInstancesOdaInstance build() {
            return new GetOdaInstancesOdaInstance(compartmentId, connectorUrl, definedTags, description, displayName, freeformTags, id, lifecycleSubState, shapeName, state, stateMessage, timeCreated, timeUpdated, webAppUrl);
        }
    }
}
