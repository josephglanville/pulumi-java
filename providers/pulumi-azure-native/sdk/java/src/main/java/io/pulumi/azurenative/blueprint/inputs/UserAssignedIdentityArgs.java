// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * User-assigned managed identity.
 * 
 */
public final class UserAssignedIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserAssignedIdentityArgs Empty = new UserAssignedIdentityArgs();

    /**
     * Client App Id associated with this identity.
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId == null ? Output.empty() : this.clientId;
    }

    /**
     * Azure Active Directory principal ID associated with this Identity.
     * 
     */
    @InputImport(name="principalId")
      private final @Nullable Output<String> principalId;

    public Output<String> getPrincipalId() {
        return this.principalId == null ? Output.empty() : this.principalId;
    }

    public UserAssignedIdentityArgs(
        @Nullable Output<String> clientId,
        @Nullable Output<String> principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    private UserAssignedIdentityArgs() {
        this.clientId = Output.empty();
        this.principalId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientId;
        private @Nullable Output<String> principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = Output.ofNullable(clientId);
            return this;
        }

        public Builder principalId(@Nullable Output<String> principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder principalId(@Nullable String principalId) {
            this.principalId = Output.ofNullable(principalId);
            return this;
        }
        public UserAssignedIdentityArgs build() {
            return new UserAssignedIdentityArgs(clientId, principalId);
        }
    }
}
