// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * User assigned identities associated with a resource.
 * 
 */
public final class UserAssignedIdentityMetaArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserAssignedIdentityMetaArgs Empty = new UserAssignedIdentityMetaArgs();

    /**
     * Aka application ID, a unique identifier generated by Azure AD that is tied to an application and service principal during its initial provisioning.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId == null ? Codegen.empty() : this.clientId;
    }

    /**
     * The object ID of the service principal object for your managed identity that is used to grant role-based access to an Azure resource.
     * 
     */
    @Import(name="principalId")
      private final @Nullable Output<String> principalId;

    public Output<String> getPrincipalId() {
        return this.principalId == null ? Codegen.empty() : this.principalId;
    }

    public UserAssignedIdentityMetaArgs(
        @Nullable Output<String> clientId,
        @Nullable Output<String> principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    private UserAssignedIdentityMetaArgs() {
        this.clientId = Codegen.empty();
        this.principalId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedIdentityMetaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientId;
        private @Nullable Output<String> principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedIdentityMetaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = Codegen.ofNullable(clientId);
            return this;
        }
        public Builder principalId(@Nullable Output<String> principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder principalId(@Nullable String principalId) {
            this.principalId = Codegen.ofNullable(principalId);
            return this;
        }        public UserAssignedIdentityMetaArgs build() {
            return new UserAssignedIdentityMetaArgs(clientId, principalId);
        }
    }
}
