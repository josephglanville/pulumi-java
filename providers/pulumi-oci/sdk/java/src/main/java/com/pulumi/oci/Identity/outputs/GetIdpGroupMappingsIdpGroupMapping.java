// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIdpGroupMappingsIdpGroupMapping {
    /**
     * @return The OCID of the tenancy containing the `IdentityProvider`.
     * 
     */
    private final String compartmentId;
    /**
     * @return The OCID of the IAM Service group that is mapped to the IdP group.
     * 
     */
    private final String groupId;
    /**
     * @return The OCID of the `IdpGroupMapping`.
     * 
     */
    private final String id;
    /**
     * @return The OCID of the identity provider.
     * 
     */
    private final String identityProviderId;
    /**
     * @return The name of the IdP group that is mapped to the IAM Service group.
     * 
     */
    private final String idpGroupName;
    /**
     * @return The detailed status of INACTIVE lifecycleState.
     * 
     */
    private final String inactiveState;
    /**
     * @return The mapping&#39;s current state.
     * 
     */
    private final String state;
    /**
     * @return Date and time the mapping was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    private final String timeCreated;

    @CustomType.Constructor
    private GetIdpGroupMappingsIdpGroupMapping(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("groupId") String groupId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identityProviderId") String identityProviderId,
        @CustomType.Parameter("idpGroupName") String idpGroupName,
        @CustomType.Parameter("inactiveState") String inactiveState,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated) {
        this.compartmentId = compartmentId;
        this.groupId = groupId;
        this.id = id;
        this.identityProviderId = identityProviderId;
        this.idpGroupName = idpGroupName;
        this.inactiveState = inactiveState;
        this.state = state;
        this.timeCreated = timeCreated;
    }

    /**
     * @return The OCID of the tenancy containing the `IdentityProvider`.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The OCID of the IAM Service group that is mapped to the IdP group.
     * 
     */
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The OCID of the `IdpGroupMapping`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The OCID of the identity provider.
     * 
     */
    public String identityProviderId() {
        return this.identityProviderId;
    }
    /**
     * @return The name of the IdP group that is mapped to the IAM Service group.
     * 
     */
    public String idpGroupName() {
        return this.idpGroupName;
    }
    /**
     * @return The detailed status of INACTIVE lifecycleState.
     * 
     */
    public String inactiveState() {
        return this.inactiveState;
    }
    /**
     * @return The mapping&#39;s current state.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Date and time the mapping was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIdpGroupMappingsIdpGroupMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private String groupId;
        private String id;
        private String identityProviderId;
        private String idpGroupName;
        private String inactiveState;
        private String state;
        private String timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIdpGroupMappingsIdpGroupMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.identityProviderId = defaults.identityProviderId;
    	      this.idpGroupName = defaults.idpGroupName;
    	      this.inactiveState = defaults.inactiveState;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identityProviderId(String identityProviderId) {
            this.identityProviderId = Objects.requireNonNull(identityProviderId);
            return this;
        }
        public Builder idpGroupName(String idpGroupName) {
            this.idpGroupName = Objects.requireNonNull(idpGroupName);
            return this;
        }
        public Builder inactiveState(String inactiveState) {
            this.inactiveState = Objects.requireNonNull(inactiveState);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }        public GetIdpGroupMappingsIdpGroupMapping build() {
            return new GetIdpGroupMappingsIdpGroupMapping(compartmentId, groupId, id, identityProviderId, idpGroupName, inactiveState, state, timeCreated);
        }
    }
}
