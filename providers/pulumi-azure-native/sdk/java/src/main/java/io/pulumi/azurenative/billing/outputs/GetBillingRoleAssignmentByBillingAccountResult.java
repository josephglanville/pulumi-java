// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.billing.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBillingRoleAssignmentByBillingAccountResult {
    private final String createdByPrincipalId;
    private final String createdByPrincipalTenantId;
    private final String createdByUserEmailAddress;
    private final String createdOn;
    private final String id;
    private final String name;
    private final @Nullable String principalId;
    private final @Nullable String principalTenantId;
    private final @Nullable String roleDefinitionId;
    private final String scope;
    private final String type;
    private final @Nullable String userAuthenticationType;
    private final @Nullable String userEmailAddress;

    @OutputCustomType.Constructor({"createdByPrincipalId","createdByPrincipalTenantId","createdByUserEmailAddress","createdOn","id","name","principalId","principalTenantId","roleDefinitionId","scope","type","userAuthenticationType","userEmailAddress"})
    private GetBillingRoleAssignmentByBillingAccountResult(
        String createdByPrincipalId,
        String createdByPrincipalTenantId,
        String createdByUserEmailAddress,
        String createdOn,
        String id,
        String name,
        @Nullable String principalId,
        @Nullable String principalTenantId,
        @Nullable String roleDefinitionId,
        String scope,
        String type,
        @Nullable String userAuthenticationType,
        @Nullable String userEmailAddress) {
        this.createdByPrincipalId = Objects.requireNonNull(createdByPrincipalId);
        this.createdByPrincipalTenantId = Objects.requireNonNull(createdByPrincipalTenantId);
        this.createdByUserEmailAddress = Objects.requireNonNull(createdByUserEmailAddress);
        this.createdOn = Objects.requireNonNull(createdOn);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.principalId = principalId;
        this.principalTenantId = principalTenantId;
        this.roleDefinitionId = roleDefinitionId;
        this.scope = Objects.requireNonNull(scope);
        this.type = Objects.requireNonNull(type);
        this.userAuthenticationType = userAuthenticationType;
        this.userEmailAddress = userEmailAddress;
    }

    public String getCreatedByPrincipalId() {
        return this.createdByPrincipalId;
    }
    public String getCreatedByPrincipalTenantId() {
        return this.createdByPrincipalTenantId;
    }
    public String getCreatedByUserEmailAddress() {
        return this.createdByUserEmailAddress;
    }
    public String getCreatedOn() {
        return this.createdOn;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getPrincipalId() {
        return Optional.ofNullable(this.principalId);
    }
    public Optional<String> getPrincipalTenantId() {
        return Optional.ofNullable(this.principalTenantId);
    }
    public Optional<String> getRoleDefinitionId() {
        return Optional.ofNullable(this.roleDefinitionId);
    }
    public String getScope() {
        return this.scope;
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getUserAuthenticationType() {
        return Optional.ofNullable(this.userAuthenticationType);
    }
    public Optional<String> getUserEmailAddress() {
        return Optional.ofNullable(this.userEmailAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBillingRoleAssignmentByBillingAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdByPrincipalId;
        private String createdByPrincipalTenantId;
        private String createdByUserEmailAddress;
        private String createdOn;
        private String id;
        private String name;
        private @Nullable String principalId;
        private @Nullable String principalTenantId;
        private @Nullable String roleDefinitionId;
        private String scope;
        private String type;
        private @Nullable String userAuthenticationType;
        private @Nullable String userEmailAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBillingRoleAssignmentByBillingAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdByPrincipalId = defaults.createdByPrincipalId;
    	      this.createdByPrincipalTenantId = defaults.createdByPrincipalTenantId;
    	      this.createdByUserEmailAddress = defaults.createdByUserEmailAddress;
    	      this.createdOn = defaults.createdOn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.principalId = defaults.principalId;
    	      this.principalTenantId = defaults.principalTenantId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
    	      this.userAuthenticationType = defaults.userAuthenticationType;
    	      this.userEmailAddress = defaults.userEmailAddress;
        }

        public Builder setCreatedByPrincipalId(String createdByPrincipalId) {
            this.createdByPrincipalId = Objects.requireNonNull(createdByPrincipalId);
            return this;
        }

        public Builder setCreatedByPrincipalTenantId(String createdByPrincipalTenantId) {
            this.createdByPrincipalTenantId = Objects.requireNonNull(createdByPrincipalTenantId);
            return this;
        }

        public Builder setCreatedByUserEmailAddress(String createdByUserEmailAddress) {
            this.createdByUserEmailAddress = Objects.requireNonNull(createdByUserEmailAddress);
            return this;
        }

        public Builder setCreatedOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setPrincipalTenantId(@Nullable String principalTenantId) {
            this.principalTenantId = principalTenantId;
            return this;
        }

        public Builder setRoleDefinitionId(@Nullable String roleDefinitionId) {
            this.roleDefinitionId = roleDefinitionId;
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserAuthenticationType(@Nullable String userAuthenticationType) {
            this.userAuthenticationType = userAuthenticationType;
            return this;
        }

        public Builder setUserEmailAddress(@Nullable String userEmailAddress) {
            this.userEmailAddress = userEmailAddress;
            return this;
        }

        public GetBillingRoleAssignmentByBillingAccountResult build() {
            return new GetBillingRoleAssignmentByBillingAccountResult(createdByPrincipalId, createdByPrincipalTenantId, createdByUserEmailAddress, createdOn, id, name, principalId, principalTenantId, roleDefinitionId, scope, type, userAuthenticationType, userEmailAddress);
        }
    }
}
