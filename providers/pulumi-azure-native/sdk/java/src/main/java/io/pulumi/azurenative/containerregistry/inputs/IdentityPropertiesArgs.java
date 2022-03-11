// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.ResourceIdentityType;
import io.pulumi.azurenative.containerregistry.inputs.UserIdentityPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed identity for the resource.
 * 
 */
public final class IdentityPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityPropertiesArgs Empty = new IdentityPropertiesArgs();

    /**
     * The principal ID of resource identity.
     * 
     */
    @InputImport(name="principalId")
      private final @Nullable Output<String> principalId;

    public Output<String> getPrincipalId() {
        return this.principalId == null ? Output.empty() : this.principalId;
    }

    /**
     * The tenant ID of resource.
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId == null ? Output.empty() : this.tenantId;
    }

    /**
     * The identity type.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Output<ResourceIdentityType> type;

    public Output<ResourceIdentityType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * The list of user identities associated with the resource. The user identity
     * dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/
     *     providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    @InputImport(name="userAssignedIdentities")
      private final @Nullable Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities;

    public Output<Map<String,UserIdentityPropertiesArgs>> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Output.empty() : this.userAssignedIdentities;
    }

    public IdentityPropertiesArgs(
        @Nullable Output<String> principalId,
        @Nullable Output<String> tenantId,
        @Nullable Output<ResourceIdentityType> type,
        @Nullable Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private IdentityPropertiesArgs() {
        this.principalId = Output.empty();
        this.tenantId = Output.empty();
        this.type = Output.empty();
        this.userAssignedIdentities = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> principalId;
        private @Nullable Output<String> tenantId;
        private @Nullable Output<ResourceIdentityType> type;
        private @Nullable Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder principalId(@Nullable Output<String> principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder principalId(@Nullable String principalId) {
            this.principalId = Output.ofNullable(principalId);
            return this;
        }

        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Output.ofNullable(tenantId);
            return this;
        }

        public Builder type(@Nullable Output<ResourceIdentityType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable ResourceIdentityType type) {
            this.type = Output.ofNullable(type);
            return this;
        }

        public Builder userAssignedIdentities(@Nullable Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder userAssignedIdentities(@Nullable Map<String,UserIdentityPropertiesArgs> userAssignedIdentities) {
            this.userAssignedIdentities = Output.ofNullable(userAssignedIdentities);
            return this;
        }
        public IdentityPropertiesArgs build() {
            return new IdentityPropertiesArgs(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
