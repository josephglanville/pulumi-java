// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.azurenative.recoveryservices.enums.ProtectionStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure Recovery Services Vault specific protection intent item.
 * 
 */
public final class AzureRecoveryServiceVaultProtectionIntentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureRecoveryServiceVaultProtectionIntentArgs Empty = new AzureRecoveryServiceVaultProtectionIntentArgs();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @Import(name="backupManagementType")
      private final @Nullable Output<Either<String,BackupManagementType>> backupManagementType;

    public Output<Either<String,BackupManagementType>> getBackupManagementType() {
        return this.backupManagementType == null ? Codegen.empty() : this.backupManagementType;
    }

    /**
     * ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId
     * 
     */
    @Import(name="itemId")
      private final @Nullable Output<String> itemId;

    public Output<String> getItemId() {
        return this.itemId == null ? Codegen.empty() : this.itemId;
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @Import(name="policyId")
      private final @Nullable Output<String> policyId;

    public Output<String> getPolicyId() {
        return this.policyId == null ? Codegen.empty() : this.policyId;
    }

    /**
     * backup protectionIntent type.
     * Expected value is 'RecoveryServiceVaultItem'.
     * 
     */
    @Import(name="protectionIntentItemType", required=true)
      private final Output<String> protectionIntentItemType;

    public Output<String> getProtectionIntentItemType() {
        return this.protectionIntentItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @Import(name="protectionState")
      private final @Nullable Output<Either<String,ProtectionStatus>> protectionState;

    public Output<Either<String,ProtectionStatus>> getProtectionState() {
        return this.protectionState == null ? Codegen.empty() : this.protectionState;
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @Import(name="sourceResourceId")
      private final @Nullable Output<String> sourceResourceId;

    public Output<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Codegen.empty() : this.sourceResourceId;
    }

    public AzureRecoveryServiceVaultProtectionIntentArgs(
        @Nullable Output<Either<String,BackupManagementType>> backupManagementType,
        @Nullable Output<String> itemId,
        @Nullable Output<String> policyId,
        Output<String> protectionIntentItemType,
        @Nullable Output<Either<String,ProtectionStatus>> protectionState,
        @Nullable Output<String> sourceResourceId) {
        this.backupManagementType = backupManagementType;
        this.itemId = itemId;
        this.policyId = policyId;
        this.protectionIntentItemType = Objects.requireNonNull(protectionIntentItemType, "expected parameter 'protectionIntentItemType' to be non-null");
        this.protectionState = protectionState;
        this.sourceResourceId = sourceResourceId;
    }

    private AzureRecoveryServiceVaultProtectionIntentArgs() {
        this.backupManagementType = Codegen.empty();
        this.itemId = Codegen.empty();
        this.policyId = Codegen.empty();
        this.protectionIntentItemType = Codegen.empty();
        this.protectionState = Codegen.empty();
        this.sourceResourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureRecoveryServiceVaultProtectionIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;
        private @Nullable Output<String> itemId;
        private @Nullable Output<String> policyId;
        private Output<String> protectionIntentItemType;
        private @Nullable Output<Either<String,ProtectionStatus>> protectionState;
        private @Nullable Output<String> sourceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureRecoveryServiceVaultProtectionIntentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.itemId = defaults.itemId;
    	      this.policyId = defaults.policyId;
    	      this.protectionIntentItemType = defaults.protectionIntentItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.sourceResourceId = defaults.sourceResourceId;
        }

        public Builder backupManagementType(@Nullable Output<Either<String,BackupManagementType>> backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }
        public Builder backupManagementType(@Nullable Either<String,BackupManagementType> backupManagementType) {
            this.backupManagementType = Codegen.ofNullable(backupManagementType);
            return this;
        }
        public Builder itemId(@Nullable Output<String> itemId) {
            this.itemId = itemId;
            return this;
        }
        public Builder itemId(@Nullable String itemId) {
            this.itemId = Codegen.ofNullable(itemId);
            return this;
        }
        public Builder policyId(@Nullable Output<String> policyId) {
            this.policyId = policyId;
            return this;
        }
        public Builder policyId(@Nullable String policyId) {
            this.policyId = Codegen.ofNullable(policyId);
            return this;
        }
        public Builder protectionIntentItemType(Output<String> protectionIntentItemType) {
            this.protectionIntentItemType = Objects.requireNonNull(protectionIntentItemType);
            return this;
        }
        public Builder protectionIntentItemType(String protectionIntentItemType) {
            this.protectionIntentItemType = Output.of(Objects.requireNonNull(protectionIntentItemType));
            return this;
        }
        public Builder protectionState(@Nullable Output<Either<String,ProtectionStatus>> protectionState) {
            this.protectionState = protectionState;
            return this;
        }
        public Builder protectionState(@Nullable Either<String,ProtectionStatus> protectionState) {
            this.protectionState = Codegen.ofNullable(protectionState);
            return this;
        }
        public Builder sourceResourceId(@Nullable Output<String> sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }
        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = Codegen.ofNullable(sourceResourceId);
            return this;
        }        public AzureRecoveryServiceVaultProtectionIntentArgs build() {
            return new AzureRecoveryServiceVaultProtectionIntentArgs(backupManagementType, itemId, policyId, protectionIntentItemType, protectionState, sourceResourceId);
        }
    }
}
