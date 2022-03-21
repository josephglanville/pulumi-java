// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IdentityResponseUserAssignedIdentities {
    /**
     * The client id of user assigned identity.
     * 
     */
    private final String clientId;
    /**
     * The principal id of user assigned identity.
     * 
     */
    private final String principalId;

    @CustomType.Constructor
    private IdentityResponseUserAssignedIdentities(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("principalId") String principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    /**
     * The client id of user assigned identity.
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * The principal id of user assigned identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityResponseUserAssignedIdentities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityResponseUserAssignedIdentities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }        public IdentityResponseUserAssignedIdentities build() {
            return new IdentityResponseUserAssignedIdentities(clientId, principalId);
        }
    }
}
