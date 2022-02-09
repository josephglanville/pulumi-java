// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.inputs.PermissionsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPolicyEntryResponse extends io.pulumi.resources.InvokeArgs {

    public static final AccessPolicyEntryResponse Empty = new AccessPolicyEntryResponse();

    @InputImport(name="applicationId")
    private final @Nullable String applicationId;

    public Optional<String> getApplicationId() {
        return this.applicationId == null ? Optional.empty() : Optional.ofNullable(this.applicationId);
    }

    @InputImport(name="objectId", required=true)
    private final String objectId;

    public String getObjectId() {
        return this.objectId;
    }

    @InputImport(name="permissions", required=true)
    private final PermissionsResponse permissions;

    public PermissionsResponse getPermissions() {
        return this.permissions;
    }

    @InputImport(name="tenantId", required=true)
    private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    public AccessPolicyEntryResponse(
        @Nullable String applicationId,
        String objectId,
        PermissionsResponse permissions,
        String tenantId) {
        this.applicationId = applicationId;
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
    }

    private AccessPolicyEntryResponse() {
        this.applicationId = null;
        this.objectId = null;
        this.permissions = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;
        private String objectId;
        private PermissionsResponse permissions;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.objectId = defaults.objectId;
    	      this.permissions = defaults.permissions;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setObjectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setPermissions(PermissionsResponse permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public AccessPolicyEntryResponse build() {
            return new AccessPolicyEntryResponse(applicationId, objectId, permissions, tenantId);
        }
    }
}
