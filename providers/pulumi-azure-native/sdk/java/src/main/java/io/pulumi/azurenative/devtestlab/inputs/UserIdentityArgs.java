// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identity attributes of a lab user.
 * 
 */
public final class UserIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserIdentityArgs Empty = new UserIdentityArgs();

    /**
     * Set to the app Id of the client JWT making the request.
     * 
     */
    @InputImport(name="appId")
      private final @Nullable Input<String> appId;

    public Input<String> getAppId() {
        return this.appId == null ? Input.empty() : this.appId;
    }

    /**
     * Set to the object Id of the client JWT making the request. Not all users have object Id. For CSP (reseller) scenarios for example, object Id is not available.
     * 
     */
    @InputImport(name="objectId")
      private final @Nullable Input<String> objectId;

    public Input<String> getObjectId() {
        return this.objectId == null ? Input.empty() : this.objectId;
    }

    /**
     * Set to the principal Id of the client JWT making the request. Service principal will not have the principal Id.
     * 
     */
    @InputImport(name="principalId")
      private final @Nullable Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId == null ? Input.empty() : this.principalId;
    }

    /**
     * Set to the principal name / UPN of the client JWT making the request.
     * 
     */
    @InputImport(name="principalName")
      private final @Nullable Input<String> principalName;

    public Input<String> getPrincipalName() {
        return this.principalName == null ? Input.empty() : this.principalName;
    }

    /**
     * Set to the tenant ID of the client JWT making the request.
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    public UserIdentityArgs(
        @Nullable Input<String> appId,
        @Nullable Input<String> objectId,
        @Nullable Input<String> principalId,
        @Nullable Input<String> principalName,
        @Nullable Input<String> tenantId) {
        this.appId = appId;
        this.objectId = objectId;
        this.principalId = principalId;
        this.principalName = principalName;
        this.tenantId = tenantId;
    }

    private UserIdentityArgs() {
        this.appId = Input.empty();
        this.objectId = Input.empty();
        this.principalId = Input.empty();
        this.principalName = Input.empty();
        this.tenantId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appId;
        private @Nullable Input<String> objectId;
        private @Nullable Input<String> principalId;
        private @Nullable Input<String> principalName;
        private @Nullable Input<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.objectId = defaults.objectId;
    	      this.principalId = defaults.principalId;
    	      this.principalName = defaults.principalName;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setAppId(@Nullable Input<String> appId) {
            this.appId = appId;
            return this;
        }

        public Builder setAppId(@Nullable String appId) {
            this.appId = Input.ofNullable(appId);
            return this;
        }

        public Builder setObjectId(@Nullable Input<String> objectId) {
            this.objectId = objectId;
            return this;
        }

        public Builder setObjectId(@Nullable String objectId) {
            this.objectId = Input.ofNullable(objectId);
            return this;
        }

        public Builder setPrincipalId(@Nullable Input<String> principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = Input.ofNullable(principalId);
            return this;
        }

        public Builder setPrincipalName(@Nullable Input<String> principalName) {
            this.principalName = principalName;
            return this;
        }

        public Builder setPrincipalName(@Nullable String principalName) {
            this.principalName = Input.ofNullable(principalName);
            return this;
        }

        public Builder setTenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }
        public UserIdentityArgs build() {
            return new UserIdentityArgs(appId, objectId, principalId, principalName, tenantId);
        }
    }
}
