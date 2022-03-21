// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserAssignedIdentityMetaResponse {
    /**
     * Aka application ID, a unique identifier generated by Azure AD that is tied to an application and service principal during its initial provisioning.
     * 
     */
    private final @Nullable String clientId;
    /**
     * The object ID of the service principal object for your managed identity that is used to grant role-based access to an Azure resource.
     * 
     */
    private final @Nullable String principalId;

    @CustomType.Constructor
    private UserAssignedIdentityMetaResponse(
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("principalId") @Nullable String principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    /**
     * Aka application ID, a unique identifier generated by Azure AD that is tied to an application and service principal during its initial provisioning.
     * 
    */
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The object ID of the service principal object for your managed identity that is used to grant role-based access to an Azure resource.
     * 
    */
    public Optional<String> getPrincipalId() {
        return Optional.ofNullable(this.principalId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedIdentityMetaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedIdentityMetaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }        public UserAssignedIdentityMetaResponse build() {
            return new UserAssignedIdentityMetaResponse(clientId, principalId);
        }
    }
}
