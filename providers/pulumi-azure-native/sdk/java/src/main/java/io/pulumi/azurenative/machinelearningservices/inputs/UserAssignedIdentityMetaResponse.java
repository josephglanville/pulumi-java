// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * User assigned identities associated with a resource.
 * 
 */
public final class UserAssignedIdentityMetaResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserAssignedIdentityMetaResponse Empty = new UserAssignedIdentityMetaResponse();

    /**
     * Aka application ID, a unique identifier generated by Azure AD that is tied to an application and service principal during its initial provisioning.
     * 
     */
    @Import(name="clientId")
      private final @Nullable String clientId;

    public Optional<String> getClientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * The object ID of the service principal object for your managed identity that is used to grant role-based access to an Azure resource.
     * 
     */
    @Import(name="principalId")
      private final @Nullable String principalId;

    public Optional<String> getPrincipalId() {
        return this.principalId == null ? Optional.empty() : Optional.ofNullable(this.principalId);
    }

    public UserAssignedIdentityMetaResponse(
        @Nullable String clientId,
        @Nullable String principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    private UserAssignedIdentityMetaResponse() {
        this.clientId = null;
        this.principalId = null;
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
