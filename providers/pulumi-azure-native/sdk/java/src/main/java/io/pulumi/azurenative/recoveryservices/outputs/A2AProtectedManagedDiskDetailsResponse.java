// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class A2AProtectedManagedDiskDetailsResponse {
    /**
     * The disk level operations list.
     * 
     */
    private final @Nullable List<String> allowedDiskLevelOperation;
    /**
     * The data pending at source virtual machine in MB.
     * 
     */
    private final @Nullable Double dataPendingAtSourceAgentInMB;
    /**
     * The data pending for replication in MB at staging account.
     * 
     */
    private final @Nullable Double dataPendingInStagingStorageAccountInMB;
    /**
     * The KeyVault resource id for secret (BEK).
     * 
     */
    private final @Nullable String dekKeyVaultArmId;
    /**
     * The disk capacity in bytes.
     * 
     */
    private final @Nullable Double diskCapacityInBytes;
    /**
     * The managed disk Arm id.
     * 
     */
    private final @Nullable String diskId;
    /**
     * The disk name.
     * 
     */
    private final @Nullable String diskName;
    /**
     * The disk state.
     * 
     */
    private final @Nullable String diskState;
    /**
     * The type of disk.
     * 
     */
    private final @Nullable String diskType;
    /**
     * The failover name for the managed disk.
     * 
     */
    private final @Nullable String failoverDiskName;
    /**
     * A value indicating whether vm has encrypted os disk or not.
     * 
     */
    private final @Nullable Boolean isDiskEncrypted;
    /**
     * A value indicating whether disk key got encrypted or not.
     * 
     */
    private final @Nullable Boolean isDiskKeyEncrypted;
    /**
     * The KeyVault resource id for key (KEK).
     * 
     */
    private final @Nullable String kekKeyVaultArmId;
    /**
     * The key URL / identifier (KEK).
     * 
     */
    private final @Nullable String keyIdentifier;
    /**
     * The type of the monitoring job. The progress is contained in MonitoringPercentageCompletion property.
     * 
     */
    private final @Nullable String monitoringJobType;
    /**
     * The percentage of the monitoring job. The type of the monitoring job is defined by MonitoringJobType property.
     * 
     */
    private final @Nullable Integer monitoringPercentageCompletion;
    /**
     * The primary staging storage account.
     * 
     */
    private final @Nullable String primaryStagingAzureStorageAccountId;
    /**
     * The recovery disk encryption set Id.
     * 
     */
    private final @Nullable String recoveryDiskEncryptionSetId;
    /**
     * The replica disk type. Its an optional value and will be same as source disk type if not user provided.
     * 
     */
    private final @Nullable String recoveryReplicaDiskAccountType;
    /**
     * Recovery replica disk Arm Id.
     * 
     */
    private final @Nullable String recoveryReplicaDiskId;
    /**
     * The recovery disk resource group Arm Id.
     * 
     */
    private final @Nullable String recoveryResourceGroupId;
    /**
     * The target disk type after failover. Its an optional value and will be same as source disk type if not user provided.
     * 
     */
    private final @Nullable String recoveryTargetDiskAccountType;
    /**
     * Recovery target disk Arm Id.
     * 
     */
    private final @Nullable String recoveryTargetDiskId;
    /**
     * A value indicating whether resync is required for this disk.
     * 
     */
    private final @Nullable Boolean resyncRequired;
    /**
     * The secret URL / identifier (BEK).
     * 
     */
    private final @Nullable String secretIdentifier;
    /**
     * The test failover name for the managed disk.
     * 
     */
    private final @Nullable String tfoDiskName;

    @CustomType.Constructor
    private A2AProtectedManagedDiskDetailsResponse(
        @CustomType.Parameter("allowedDiskLevelOperation") @Nullable List<String> allowedDiskLevelOperation,
        @CustomType.Parameter("dataPendingAtSourceAgentInMB") @Nullable Double dataPendingAtSourceAgentInMB,
        @CustomType.Parameter("dataPendingInStagingStorageAccountInMB") @Nullable Double dataPendingInStagingStorageAccountInMB,
        @CustomType.Parameter("dekKeyVaultArmId") @Nullable String dekKeyVaultArmId,
        @CustomType.Parameter("diskCapacityInBytes") @Nullable Double diskCapacityInBytes,
        @CustomType.Parameter("diskId") @Nullable String diskId,
        @CustomType.Parameter("diskName") @Nullable String diskName,
        @CustomType.Parameter("diskState") @Nullable String diskState,
        @CustomType.Parameter("diskType") @Nullable String diskType,
        @CustomType.Parameter("failoverDiskName") @Nullable String failoverDiskName,
        @CustomType.Parameter("isDiskEncrypted") @Nullable Boolean isDiskEncrypted,
        @CustomType.Parameter("isDiskKeyEncrypted") @Nullable Boolean isDiskKeyEncrypted,
        @CustomType.Parameter("kekKeyVaultArmId") @Nullable String kekKeyVaultArmId,
        @CustomType.Parameter("keyIdentifier") @Nullable String keyIdentifier,
        @CustomType.Parameter("monitoringJobType") @Nullable String monitoringJobType,
        @CustomType.Parameter("monitoringPercentageCompletion") @Nullable Integer monitoringPercentageCompletion,
        @CustomType.Parameter("primaryStagingAzureStorageAccountId") @Nullable String primaryStagingAzureStorageAccountId,
        @CustomType.Parameter("recoveryDiskEncryptionSetId") @Nullable String recoveryDiskEncryptionSetId,
        @CustomType.Parameter("recoveryReplicaDiskAccountType") @Nullable String recoveryReplicaDiskAccountType,
        @CustomType.Parameter("recoveryReplicaDiskId") @Nullable String recoveryReplicaDiskId,
        @CustomType.Parameter("recoveryResourceGroupId") @Nullable String recoveryResourceGroupId,
        @CustomType.Parameter("recoveryTargetDiskAccountType") @Nullable String recoveryTargetDiskAccountType,
        @CustomType.Parameter("recoveryTargetDiskId") @Nullable String recoveryTargetDiskId,
        @CustomType.Parameter("resyncRequired") @Nullable Boolean resyncRequired,
        @CustomType.Parameter("secretIdentifier") @Nullable String secretIdentifier,
        @CustomType.Parameter("tfoDiskName") @Nullable String tfoDiskName) {
        this.allowedDiskLevelOperation = allowedDiskLevelOperation;
        this.dataPendingAtSourceAgentInMB = dataPendingAtSourceAgentInMB;
        this.dataPendingInStagingStorageAccountInMB = dataPendingInStagingStorageAccountInMB;
        this.dekKeyVaultArmId = dekKeyVaultArmId;
        this.diskCapacityInBytes = diskCapacityInBytes;
        this.diskId = diskId;
        this.diskName = diskName;
        this.diskState = diskState;
        this.diskType = diskType;
        this.failoverDiskName = failoverDiskName;
        this.isDiskEncrypted = isDiskEncrypted;
        this.isDiskKeyEncrypted = isDiskKeyEncrypted;
        this.kekKeyVaultArmId = kekKeyVaultArmId;
        this.keyIdentifier = keyIdentifier;
        this.monitoringJobType = monitoringJobType;
        this.monitoringPercentageCompletion = monitoringPercentageCompletion;
        this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
        this.recoveryDiskEncryptionSetId = recoveryDiskEncryptionSetId;
        this.recoveryReplicaDiskAccountType = recoveryReplicaDiskAccountType;
        this.recoveryReplicaDiskId = recoveryReplicaDiskId;
        this.recoveryResourceGroupId = recoveryResourceGroupId;
        this.recoveryTargetDiskAccountType = recoveryTargetDiskAccountType;
        this.recoveryTargetDiskId = recoveryTargetDiskId;
        this.resyncRequired = resyncRequired;
        this.secretIdentifier = secretIdentifier;
        this.tfoDiskName = tfoDiskName;
    }

    /**
     * The disk level operations list.
     * 
    */
    public List<String> getAllowedDiskLevelOperation() {
        return this.allowedDiskLevelOperation == null ? List.of() : this.allowedDiskLevelOperation;
    }
    /**
     * The data pending at source virtual machine in MB.
     * 
    */
    public Optional<Double> getDataPendingAtSourceAgentInMB() {
        return Optional.ofNullable(this.dataPendingAtSourceAgentInMB);
    }
    /**
     * The data pending for replication in MB at staging account.
     * 
    */
    public Optional<Double> getDataPendingInStagingStorageAccountInMB() {
        return Optional.ofNullable(this.dataPendingInStagingStorageAccountInMB);
    }
    /**
     * The KeyVault resource id for secret (BEK).
     * 
    */
    public Optional<String> getDekKeyVaultArmId() {
        return Optional.ofNullable(this.dekKeyVaultArmId);
    }
    /**
     * The disk capacity in bytes.
     * 
    */
    public Optional<Double> getDiskCapacityInBytes() {
        return Optional.ofNullable(this.diskCapacityInBytes);
    }
    /**
     * The managed disk Arm id.
     * 
    */
    public Optional<String> getDiskId() {
        return Optional.ofNullable(this.diskId);
    }
    /**
     * The disk name.
     * 
    */
    public Optional<String> getDiskName() {
        return Optional.ofNullable(this.diskName);
    }
    /**
     * The disk state.
     * 
    */
    public Optional<String> getDiskState() {
        return Optional.ofNullable(this.diskState);
    }
    /**
     * The type of disk.
     * 
    */
    public Optional<String> getDiskType() {
        return Optional.ofNullable(this.diskType);
    }
    /**
     * The failover name for the managed disk.
     * 
    */
    public Optional<String> getFailoverDiskName() {
        return Optional.ofNullable(this.failoverDiskName);
    }
    /**
     * A value indicating whether vm has encrypted os disk or not.
     * 
    */
    public Optional<Boolean> getIsDiskEncrypted() {
        return Optional.ofNullable(this.isDiskEncrypted);
    }
    /**
     * A value indicating whether disk key got encrypted or not.
     * 
    */
    public Optional<Boolean> getIsDiskKeyEncrypted() {
        return Optional.ofNullable(this.isDiskKeyEncrypted);
    }
    /**
     * The KeyVault resource id for key (KEK).
     * 
    */
    public Optional<String> getKekKeyVaultArmId() {
        return Optional.ofNullable(this.kekKeyVaultArmId);
    }
    /**
     * The key URL / identifier (KEK).
     * 
    */
    public Optional<String> getKeyIdentifier() {
        return Optional.ofNullable(this.keyIdentifier);
    }
    /**
     * The type of the monitoring job. The progress is contained in MonitoringPercentageCompletion property.
     * 
    */
    public Optional<String> getMonitoringJobType() {
        return Optional.ofNullable(this.monitoringJobType);
    }
    /**
     * The percentage of the monitoring job. The type of the monitoring job is defined by MonitoringJobType property.
     * 
    */
    public Optional<Integer> getMonitoringPercentageCompletion() {
        return Optional.ofNullable(this.monitoringPercentageCompletion);
    }
    /**
     * The primary staging storage account.
     * 
    */
    public Optional<String> getPrimaryStagingAzureStorageAccountId() {
        return Optional.ofNullable(this.primaryStagingAzureStorageAccountId);
    }
    /**
     * The recovery disk encryption set Id.
     * 
    */
    public Optional<String> getRecoveryDiskEncryptionSetId() {
        return Optional.ofNullable(this.recoveryDiskEncryptionSetId);
    }
    /**
     * The replica disk type. Its an optional value and will be same as source disk type if not user provided.
     * 
    */
    public Optional<String> getRecoveryReplicaDiskAccountType() {
        return Optional.ofNullable(this.recoveryReplicaDiskAccountType);
    }
    /**
     * Recovery replica disk Arm Id.
     * 
    */
    public Optional<String> getRecoveryReplicaDiskId() {
        return Optional.ofNullable(this.recoveryReplicaDiskId);
    }
    /**
     * The recovery disk resource group Arm Id.
     * 
    */
    public Optional<String> getRecoveryResourceGroupId() {
        return Optional.ofNullable(this.recoveryResourceGroupId);
    }
    /**
     * The target disk type after failover. Its an optional value and will be same as source disk type if not user provided.
     * 
    */
    public Optional<String> getRecoveryTargetDiskAccountType() {
        return Optional.ofNullable(this.recoveryTargetDiskAccountType);
    }
    /**
     * Recovery target disk Arm Id.
     * 
    */
    public Optional<String> getRecoveryTargetDiskId() {
        return Optional.ofNullable(this.recoveryTargetDiskId);
    }
    /**
     * A value indicating whether resync is required for this disk.
     * 
    */
    public Optional<Boolean> getResyncRequired() {
        return Optional.ofNullable(this.resyncRequired);
    }
    /**
     * The secret URL / identifier (BEK).
     * 
    */
    public Optional<String> getSecretIdentifier() {
        return Optional.ofNullable(this.secretIdentifier);
    }
    /**
     * The test failover name for the managed disk.
     * 
    */
    public Optional<String> getTfoDiskName() {
        return Optional.ofNullable(this.tfoDiskName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(A2AProtectedManagedDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedDiskLevelOperation;
        private @Nullable Double dataPendingAtSourceAgentInMB;
        private @Nullable Double dataPendingInStagingStorageAccountInMB;
        private @Nullable String dekKeyVaultArmId;
        private @Nullable Double diskCapacityInBytes;
        private @Nullable String diskId;
        private @Nullable String diskName;
        private @Nullable String diskState;
        private @Nullable String diskType;
        private @Nullable String failoverDiskName;
        private @Nullable Boolean isDiskEncrypted;
        private @Nullable Boolean isDiskKeyEncrypted;
        private @Nullable String kekKeyVaultArmId;
        private @Nullable String keyIdentifier;
        private @Nullable String monitoringJobType;
        private @Nullable Integer monitoringPercentageCompletion;
        private @Nullable String primaryStagingAzureStorageAccountId;
        private @Nullable String recoveryDiskEncryptionSetId;
        private @Nullable String recoveryReplicaDiskAccountType;
        private @Nullable String recoveryReplicaDiskId;
        private @Nullable String recoveryResourceGroupId;
        private @Nullable String recoveryTargetDiskAccountType;
        private @Nullable String recoveryTargetDiskId;
        private @Nullable Boolean resyncRequired;
        private @Nullable String secretIdentifier;
        private @Nullable String tfoDiskName;

        public Builder() {
    	      // Empty
        }

        public Builder(A2AProtectedManagedDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedDiskLevelOperation = defaults.allowedDiskLevelOperation;
    	      this.dataPendingAtSourceAgentInMB = defaults.dataPendingAtSourceAgentInMB;
    	      this.dataPendingInStagingStorageAccountInMB = defaults.dataPendingInStagingStorageAccountInMB;
    	      this.dekKeyVaultArmId = defaults.dekKeyVaultArmId;
    	      this.diskCapacityInBytes = defaults.diskCapacityInBytes;
    	      this.diskId = defaults.diskId;
    	      this.diskName = defaults.diskName;
    	      this.diskState = defaults.diskState;
    	      this.diskType = defaults.diskType;
    	      this.failoverDiskName = defaults.failoverDiskName;
    	      this.isDiskEncrypted = defaults.isDiskEncrypted;
    	      this.isDiskKeyEncrypted = defaults.isDiskKeyEncrypted;
    	      this.kekKeyVaultArmId = defaults.kekKeyVaultArmId;
    	      this.keyIdentifier = defaults.keyIdentifier;
    	      this.monitoringJobType = defaults.monitoringJobType;
    	      this.monitoringPercentageCompletion = defaults.monitoringPercentageCompletion;
    	      this.primaryStagingAzureStorageAccountId = defaults.primaryStagingAzureStorageAccountId;
    	      this.recoveryDiskEncryptionSetId = defaults.recoveryDiskEncryptionSetId;
    	      this.recoveryReplicaDiskAccountType = defaults.recoveryReplicaDiskAccountType;
    	      this.recoveryReplicaDiskId = defaults.recoveryReplicaDiskId;
    	      this.recoveryResourceGroupId = defaults.recoveryResourceGroupId;
    	      this.recoveryTargetDiskAccountType = defaults.recoveryTargetDiskAccountType;
    	      this.recoveryTargetDiskId = defaults.recoveryTargetDiskId;
    	      this.resyncRequired = defaults.resyncRequired;
    	      this.secretIdentifier = defaults.secretIdentifier;
    	      this.tfoDiskName = defaults.tfoDiskName;
        }

        public Builder allowedDiskLevelOperation(@Nullable List<String> allowedDiskLevelOperation) {
            this.allowedDiskLevelOperation = allowedDiskLevelOperation;
            return this;
        }
        public Builder allowedDiskLevelOperation(String... allowedDiskLevelOperation) {
            return allowedDiskLevelOperation(List.of(allowedDiskLevelOperation));
        }
        public Builder dataPendingAtSourceAgentInMB(@Nullable Double dataPendingAtSourceAgentInMB) {
            this.dataPendingAtSourceAgentInMB = dataPendingAtSourceAgentInMB;
            return this;
        }
        public Builder dataPendingInStagingStorageAccountInMB(@Nullable Double dataPendingInStagingStorageAccountInMB) {
            this.dataPendingInStagingStorageAccountInMB = dataPendingInStagingStorageAccountInMB;
            return this;
        }
        public Builder dekKeyVaultArmId(@Nullable String dekKeyVaultArmId) {
            this.dekKeyVaultArmId = dekKeyVaultArmId;
            return this;
        }
        public Builder diskCapacityInBytes(@Nullable Double diskCapacityInBytes) {
            this.diskCapacityInBytes = diskCapacityInBytes;
            return this;
        }
        public Builder diskId(@Nullable String diskId) {
            this.diskId = diskId;
            return this;
        }
        public Builder diskName(@Nullable String diskName) {
            this.diskName = diskName;
            return this;
        }
        public Builder diskState(@Nullable String diskState) {
            this.diskState = diskState;
            return this;
        }
        public Builder diskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }
        public Builder failoverDiskName(@Nullable String failoverDiskName) {
            this.failoverDiskName = failoverDiskName;
            return this;
        }
        public Builder isDiskEncrypted(@Nullable Boolean isDiskEncrypted) {
            this.isDiskEncrypted = isDiskEncrypted;
            return this;
        }
        public Builder isDiskKeyEncrypted(@Nullable Boolean isDiskKeyEncrypted) {
            this.isDiskKeyEncrypted = isDiskKeyEncrypted;
            return this;
        }
        public Builder kekKeyVaultArmId(@Nullable String kekKeyVaultArmId) {
            this.kekKeyVaultArmId = kekKeyVaultArmId;
            return this;
        }
        public Builder keyIdentifier(@Nullable String keyIdentifier) {
            this.keyIdentifier = keyIdentifier;
            return this;
        }
        public Builder monitoringJobType(@Nullable String monitoringJobType) {
            this.monitoringJobType = monitoringJobType;
            return this;
        }
        public Builder monitoringPercentageCompletion(@Nullable Integer monitoringPercentageCompletion) {
            this.monitoringPercentageCompletion = monitoringPercentageCompletion;
            return this;
        }
        public Builder primaryStagingAzureStorageAccountId(@Nullable String primaryStagingAzureStorageAccountId) {
            this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
            return this;
        }
        public Builder recoveryDiskEncryptionSetId(@Nullable String recoveryDiskEncryptionSetId) {
            this.recoveryDiskEncryptionSetId = recoveryDiskEncryptionSetId;
            return this;
        }
        public Builder recoveryReplicaDiskAccountType(@Nullable String recoveryReplicaDiskAccountType) {
            this.recoveryReplicaDiskAccountType = recoveryReplicaDiskAccountType;
            return this;
        }
        public Builder recoveryReplicaDiskId(@Nullable String recoveryReplicaDiskId) {
            this.recoveryReplicaDiskId = recoveryReplicaDiskId;
            return this;
        }
        public Builder recoveryResourceGroupId(@Nullable String recoveryResourceGroupId) {
            this.recoveryResourceGroupId = recoveryResourceGroupId;
            return this;
        }
        public Builder recoveryTargetDiskAccountType(@Nullable String recoveryTargetDiskAccountType) {
            this.recoveryTargetDiskAccountType = recoveryTargetDiskAccountType;
            return this;
        }
        public Builder recoveryTargetDiskId(@Nullable String recoveryTargetDiskId) {
            this.recoveryTargetDiskId = recoveryTargetDiskId;
            return this;
        }
        public Builder resyncRequired(@Nullable Boolean resyncRequired) {
            this.resyncRequired = resyncRequired;
            return this;
        }
        public Builder secretIdentifier(@Nullable String secretIdentifier) {
            this.secretIdentifier = secretIdentifier;
            return this;
        }
        public Builder tfoDiskName(@Nullable String tfoDiskName) {
            this.tfoDiskName = tfoDiskName;
            return this;
        }        public A2AProtectedManagedDiskDetailsResponse build() {
            return new A2AProtectedManagedDiskDetailsResponse(allowedDiskLevelOperation, dataPendingAtSourceAgentInMB, dataPendingInStagingStorageAccountInMB, dekKeyVaultArmId, diskCapacityInBytes, diskId, diskName, diskState, diskType, failoverDiskName, isDiskEncrypted, isDiskKeyEncrypted, kekKeyVaultArmId, keyIdentifier, monitoringJobType, monitoringPercentageCompletion, primaryStagingAzureStorageAccountId, recoveryDiskEncryptionSetId, recoveryReplicaDiskAccountType, recoveryReplicaDiskId, recoveryResourceGroupId, recoveryTargetDiskAccountType, recoveryTargetDiskId, resyncRequired, secretIdentifier, tfoDiskName);
        }
    }
}
