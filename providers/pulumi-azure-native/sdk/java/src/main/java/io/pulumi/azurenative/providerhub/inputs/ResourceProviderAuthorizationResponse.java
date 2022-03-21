// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceProviderAuthorizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceProviderAuthorizationResponse Empty = new ResourceProviderAuthorizationResponse();

    @Import(name="applicationId")
      private final @Nullable String applicationId;

    public Optional<String> getApplicationId() {
        return this.applicationId == null ? Optional.empty() : Optional.ofNullable(this.applicationId);
    }

    @Import(name="managedByRoleDefinitionId")
      private final @Nullable String managedByRoleDefinitionId;

    public Optional<String> getManagedByRoleDefinitionId() {
        return this.managedByRoleDefinitionId == null ? Optional.empty() : Optional.ofNullable(this.managedByRoleDefinitionId);
    }

    @Import(name="roleDefinitionId")
      private final @Nullable String roleDefinitionId;

    public Optional<String> getRoleDefinitionId() {
        return this.roleDefinitionId == null ? Optional.empty() : Optional.ofNullable(this.roleDefinitionId);
    }

    public ResourceProviderAuthorizationResponse(
        @Nullable String applicationId,
        @Nullable String managedByRoleDefinitionId,
        @Nullable String roleDefinitionId) {
        this.applicationId = applicationId;
        this.managedByRoleDefinitionId = managedByRoleDefinitionId;
        this.roleDefinitionId = roleDefinitionId;
    }

    private ResourceProviderAuthorizationResponse() {
        this.applicationId = null;
        this.managedByRoleDefinitionId = null;
        this.roleDefinitionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceProviderAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;
        private @Nullable String managedByRoleDefinitionId;
        private @Nullable String roleDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceProviderAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.managedByRoleDefinitionId = defaults.managedByRoleDefinitionId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder managedByRoleDefinitionId(@Nullable String managedByRoleDefinitionId) {
            this.managedByRoleDefinitionId = managedByRoleDefinitionId;
            return this;
        }
        public Builder roleDefinitionId(@Nullable String roleDefinitionId) {
            this.roleDefinitionId = roleDefinitionId;
            return this;
        }        public ResourceProviderAuthorizationResponse build() {
            return new ResourceProviderAuthorizationResponse(applicationId, managedByRoleDefinitionId, roleDefinitionId);
        }
    }
}
