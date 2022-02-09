// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceProviderAuthorizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceProviderAuthorizationArgs Empty = new ResourceProviderAuthorizationArgs();

    @InputImport(name="applicationId")
    private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    @InputImport(name="managedByRoleDefinitionId")
    private final @Nullable Input<String> managedByRoleDefinitionId;

    public Input<String> getManagedByRoleDefinitionId() {
        return this.managedByRoleDefinitionId == null ? Input.empty() : this.managedByRoleDefinitionId;
    }

    @InputImport(name="roleDefinitionId")
    private final @Nullable Input<String> roleDefinitionId;

    public Input<String> getRoleDefinitionId() {
        return this.roleDefinitionId == null ? Input.empty() : this.roleDefinitionId;
    }

    public ResourceProviderAuthorizationArgs(
        @Nullable Input<String> applicationId,
        @Nullable Input<String> managedByRoleDefinitionId,
        @Nullable Input<String> roleDefinitionId) {
        this.applicationId = applicationId;
        this.managedByRoleDefinitionId = managedByRoleDefinitionId;
        this.roleDefinitionId = roleDefinitionId;
    }

    private ResourceProviderAuthorizationArgs() {
        this.applicationId = Input.empty();
        this.managedByRoleDefinitionId = Input.empty();
        this.roleDefinitionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceProviderAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationId;
        private @Nullable Input<String> managedByRoleDefinitionId;
        private @Nullable Input<String> roleDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceProviderAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.managedByRoleDefinitionId = defaults.managedByRoleDefinitionId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
        }

        public Builder setApplicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
            return this;
        }

        public Builder setManagedByRoleDefinitionId(@Nullable Input<String> managedByRoleDefinitionId) {
            this.managedByRoleDefinitionId = managedByRoleDefinitionId;
            return this;
        }

        public Builder setManagedByRoleDefinitionId(@Nullable String managedByRoleDefinitionId) {
            this.managedByRoleDefinitionId = Input.ofNullable(managedByRoleDefinitionId);
            return this;
        }

        public Builder setRoleDefinitionId(@Nullable Input<String> roleDefinitionId) {
            this.roleDefinitionId = roleDefinitionId;
            return this;
        }

        public Builder setRoleDefinitionId(@Nullable String roleDefinitionId) {
            this.roleDefinitionId = Input.ofNullable(roleDefinitionId);
            return this;
        }

        public ResourceProviderAuthorizationArgs build() {
            return new ResourceProviderAuthorizationArgs(applicationId, managedByRoleDefinitionId, roleDefinitionId);
        }
    }
}
