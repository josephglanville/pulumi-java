// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.enums.CreateMode;
import io.pulumi.azurenative.keyvault.enums.PublicNetworkAccess;
import io.pulumi.azurenative.keyvault.inputs.MHSMNetworkRuleSetArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the managed HSM Pool
 * 
 */
public final class ManagedHsmPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedHsmPropertiesArgs Empty = new ManagedHsmPropertiesArgs();

    /**
     * The create mode to indicate whether the resource is being created or is being recovered from a deleted resource.
     * 
     */
    @Import(name="createMode")
      private final @Nullable Output<CreateMode> createMode;

    public Output<CreateMode> getCreateMode() {
        return this.createMode == null ? Output.empty() : this.createMode;
    }

    /**
     * Property specifying whether protection against purge is enabled for this managed HSM pool. Setting this property to true activates protection against purge for this managed HSM pool and its content - only the Managed HSM service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete is also enabled. Enabling this functionality is irreversible.
     * 
     */
    @Import(name="enablePurgeProtection")
      private final @Nullable Output<Boolean> enablePurgeProtection;

    public Output<Boolean> getEnablePurgeProtection() {
        return this.enablePurgeProtection == null ? Output.empty() : this.enablePurgeProtection;
    }

    /**
     * Property to specify whether the 'soft delete' functionality is enabled for this managed HSM pool. If it's not set to any value(true or false) when creating new managed HSM pool, it will be set to true by default. Once set to true, it cannot be reverted to false.
     * 
     */
    @Import(name="enableSoftDelete")
      private final @Nullable Output<Boolean> enableSoftDelete;

    public Output<Boolean> getEnableSoftDelete() {
        return this.enableSoftDelete == null ? Output.empty() : this.enableSoftDelete;
    }

    /**
     * Array of initial administrators object ids for this managed hsm pool.
     * 
     */
    @Import(name="initialAdminObjectIds")
      private final @Nullable Output<List<String>> initialAdminObjectIds;

    public Output<List<String>> getInitialAdminObjectIds() {
        return this.initialAdminObjectIds == null ? Output.empty() : this.initialAdminObjectIds;
    }

    /**
     * Rules governing the accessibility of the key vault from specific network locations.
     * 
     */
    @Import(name="networkAcls")
      private final @Nullable Output<MHSMNetworkRuleSetArgs> networkAcls;

    public Output<MHSMNetworkRuleSetArgs> getNetworkAcls() {
        return this.networkAcls == null ? Output.empty() : this.networkAcls;
    }

    /**
     * Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Output<Either<String,PublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Output.empty() : this.publicNetworkAccess;
    }

    /**
     * softDelete data retention days. It accepts >=7 and <=90.
     * 
     */
    @Import(name="softDeleteRetentionInDays")
      private final @Nullable Output<Integer> softDeleteRetentionInDays;

    public Output<Integer> getSoftDeleteRetentionInDays() {
        return this.softDeleteRetentionInDays == null ? Output.empty() : this.softDeleteRetentionInDays;
    }

    /**
     * The Azure Active Directory tenant ID that should be used for authenticating requests to the managed HSM pool.
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId == null ? Output.empty() : this.tenantId;
    }

    public ManagedHsmPropertiesArgs(
        @Nullable Output<CreateMode> createMode,
        @Nullable Output<Boolean> enablePurgeProtection,
        @Nullable Output<Boolean> enableSoftDelete,
        @Nullable Output<List<String>> initialAdminObjectIds,
        @Nullable Output<MHSMNetworkRuleSetArgs> networkAcls,
        @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        @Nullable Output<Integer> softDeleteRetentionInDays,
        @Nullable Output<String> tenantId) {
        this.createMode = createMode;
        this.enablePurgeProtection = enablePurgeProtection == null ? Output.ofNullable(true) : enablePurgeProtection;
        this.enableSoftDelete = enableSoftDelete == null ? Output.ofNullable(true) : enableSoftDelete;
        this.initialAdminObjectIds = initialAdminObjectIds;
        this.networkAcls = networkAcls;
        this.publicNetworkAccess = publicNetworkAccess;
        this.softDeleteRetentionInDays = softDeleteRetentionInDays == null ? Output.ofNullable(90) : softDeleteRetentionInDays;
        this.tenantId = tenantId;
    }

    private ManagedHsmPropertiesArgs() {
        this.createMode = Output.empty();
        this.enablePurgeProtection = Output.empty();
        this.enableSoftDelete = Output.empty();
        this.initialAdminObjectIds = Output.empty();
        this.networkAcls = Output.empty();
        this.publicNetworkAccess = Output.empty();
        this.softDeleteRetentionInDays = Output.empty();
        this.tenantId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedHsmPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CreateMode> createMode;
        private @Nullable Output<Boolean> enablePurgeProtection;
        private @Nullable Output<Boolean> enableSoftDelete;
        private @Nullable Output<List<String>> initialAdminObjectIds;
        private @Nullable Output<MHSMNetworkRuleSetArgs> networkAcls;
        private @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private @Nullable Output<Integer> softDeleteRetentionInDays;
        private @Nullable Output<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedHsmPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createMode = defaults.createMode;
    	      this.enablePurgeProtection = defaults.enablePurgeProtection;
    	      this.enableSoftDelete = defaults.enableSoftDelete;
    	      this.initialAdminObjectIds = defaults.initialAdminObjectIds;
    	      this.networkAcls = defaults.networkAcls;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.softDeleteRetentionInDays = defaults.softDeleteRetentionInDays;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder createMode(@Nullable Output<CreateMode> createMode) {
            this.createMode = createMode;
            return this;
        }
        public Builder createMode(@Nullable CreateMode createMode) {
            this.createMode = Output.ofNullable(createMode);
            return this;
        }
        public Builder enablePurgeProtection(@Nullable Output<Boolean> enablePurgeProtection) {
            this.enablePurgeProtection = enablePurgeProtection;
            return this;
        }
        public Builder enablePurgeProtection(@Nullable Boolean enablePurgeProtection) {
            this.enablePurgeProtection = Output.ofNullable(enablePurgeProtection);
            return this;
        }
        public Builder enableSoftDelete(@Nullable Output<Boolean> enableSoftDelete) {
            this.enableSoftDelete = enableSoftDelete;
            return this;
        }
        public Builder enableSoftDelete(@Nullable Boolean enableSoftDelete) {
            this.enableSoftDelete = Output.ofNullable(enableSoftDelete);
            return this;
        }
        public Builder initialAdminObjectIds(@Nullable Output<List<String>> initialAdminObjectIds) {
            this.initialAdminObjectIds = initialAdminObjectIds;
            return this;
        }
        public Builder initialAdminObjectIds(@Nullable List<String> initialAdminObjectIds) {
            this.initialAdminObjectIds = Output.ofNullable(initialAdminObjectIds);
            return this;
        }
        public Builder initialAdminObjectIds(String... initialAdminObjectIds) {
            return initialAdminObjectIds(List.of(initialAdminObjectIds));
        }
        public Builder networkAcls(@Nullable Output<MHSMNetworkRuleSetArgs> networkAcls) {
            this.networkAcls = networkAcls;
            return this;
        }
        public Builder networkAcls(@Nullable MHSMNetworkRuleSetArgs networkAcls) {
            this.networkAcls = Output.ofNullable(networkAcls);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Output.ofNullable(publicNetworkAccess);
            return this;
        }
        public Builder softDeleteRetentionInDays(@Nullable Output<Integer> softDeleteRetentionInDays) {
            this.softDeleteRetentionInDays = softDeleteRetentionInDays;
            return this;
        }
        public Builder softDeleteRetentionInDays(@Nullable Integer softDeleteRetentionInDays) {
            this.softDeleteRetentionInDays = Output.ofNullable(softDeleteRetentionInDays);
            return this;
        }
        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Output.ofNullable(tenantId);
            return this;
        }        public ManagedHsmPropertiesArgs build() {
            return new ManagedHsmPropertiesArgs(createMode, enablePurgeProtection, enableSoftDelete, initialAdminObjectIds, networkAcls, publicNetworkAccess, softDeleteRetentionInDays, tenantId);
        }
    }
}
