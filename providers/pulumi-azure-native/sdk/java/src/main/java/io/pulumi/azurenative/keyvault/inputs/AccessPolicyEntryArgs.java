// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.inputs.PermissionsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessPolicyEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPolicyEntryArgs Empty = new AccessPolicyEntryArgs();

    @InputImport(name="applicationId")
    private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    @InputImport(name="objectId", required=true)
    private final Input<String> objectId;

    public Input<String> getObjectId() {
        return this.objectId;
    }

    @InputImport(name="permissions", required=true)
    private final Input<PermissionsArgs> permissions;

    public Input<PermissionsArgs> getPermissions() {
        return this.permissions;
    }

    @InputImport(name="tenantId", required=true)
    private final Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId;
    }

    public AccessPolicyEntryArgs(
        @Nullable Input<String> applicationId,
        Input<String> objectId,
        Input<PermissionsArgs> permissions,
        Input<String> tenantId) {
        this.applicationId = applicationId;
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
    }

    private AccessPolicyEntryArgs() {
        this.applicationId = Input.empty();
        this.objectId = Input.empty();
        this.permissions = Input.empty();
        this.tenantId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationId;
        private Input<String> objectId;
        private Input<PermissionsArgs> permissions;
        private Input<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.objectId = defaults.objectId;
    	      this.permissions = defaults.permissions;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setApplicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
            return this;
        }

        public Builder setObjectId(Input<String> objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setObjectId(String objectId) {
            this.objectId = Input.of(Objects.requireNonNull(objectId));
            return this;
        }

        public Builder setPermissions(Input<PermissionsArgs> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setPermissions(PermissionsArgs permissions) {
            this.permissions = Input.of(Objects.requireNonNull(permissions));
            return this;
        }

        public Builder setTenantId(Input<String> tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Input.of(Objects.requireNonNull(tenantId));
            return this;
        }

        public AccessPolicyEntryArgs build() {
            return new AccessPolicyEntryArgs(applicationId, objectId, permissions, tenantId);
        }
    }
}
