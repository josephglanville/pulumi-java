// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.InMageDiskExclusionInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InMageEnableProtectionInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final InMageEnableProtectionInputArgs Empty = new InMageEnableProtectionInputArgs();

    @InputImport(name="datastoreName")
    private final @Nullable Input<String> datastoreName;

    public Input<String> getDatastoreName() {
        return this.datastoreName == null ? Input.empty() : this.datastoreName;
    }

    @InputImport(name="diskExclusionInput")
    private final @Nullable Input<InMageDiskExclusionInputArgs> diskExclusionInput;

    public Input<InMageDiskExclusionInputArgs> getDiskExclusionInput() {
        return this.diskExclusionInput == null ? Input.empty() : this.diskExclusionInput;
    }

    @InputImport(name="disksToInclude")
    private final @Nullable Input<List<String>> disksToInclude;

    public Input<List<String>> getDisksToInclude() {
        return this.disksToInclude == null ? Input.empty() : this.disksToInclude;
    }

    @InputImport(name="instanceType")
    private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    @InputImport(name="masterTargetId", required=true)
    private final Input<String> masterTargetId;

    public Input<String> getMasterTargetId() {
        return this.masterTargetId;
    }

    @InputImport(name="multiVmGroupId", required=true)
    private final Input<String> multiVmGroupId;

    public Input<String> getMultiVmGroupId() {
        return this.multiVmGroupId;
    }

    @InputImport(name="multiVmGroupName", required=true)
    private final Input<String> multiVmGroupName;

    public Input<String> getMultiVmGroupName() {
        return this.multiVmGroupName;
    }

    @InputImport(name="processServerId", required=true)
    private final Input<String> processServerId;

    public Input<String> getProcessServerId() {
        return this.processServerId;
    }

    @InputImport(name="retentionDrive", required=true)
    private final Input<String> retentionDrive;

    public Input<String> getRetentionDrive() {
        return this.retentionDrive;
    }

    @InputImport(name="runAsAccountId")
    private final @Nullable Input<String> runAsAccountId;

    public Input<String> getRunAsAccountId() {
        return this.runAsAccountId == null ? Input.empty() : this.runAsAccountId;
    }

    @InputImport(name="vmFriendlyName")
    private final @Nullable Input<String> vmFriendlyName;

    public Input<String> getVmFriendlyName() {
        return this.vmFriendlyName == null ? Input.empty() : this.vmFriendlyName;
    }

    public InMageEnableProtectionInputArgs(
        @Nullable Input<String> datastoreName,
        @Nullable Input<InMageDiskExclusionInputArgs> diskExclusionInput,
        @Nullable Input<List<String>> disksToInclude,
        @Nullable Input<String> instanceType,
        Input<String> masterTargetId,
        Input<String> multiVmGroupId,
        Input<String> multiVmGroupName,
        Input<String> processServerId,
        Input<String> retentionDrive,
        @Nullable Input<String> runAsAccountId,
        @Nullable Input<String> vmFriendlyName) {
        this.datastoreName = datastoreName;
        this.diskExclusionInput = diskExclusionInput;
        this.disksToInclude = disksToInclude;
        this.instanceType = instanceType;
        this.masterTargetId = Objects.requireNonNull(masterTargetId, "expected parameter 'masterTargetId' to be non-null");
        this.multiVmGroupId = Objects.requireNonNull(multiVmGroupId, "expected parameter 'multiVmGroupId' to be non-null");
        this.multiVmGroupName = Objects.requireNonNull(multiVmGroupName, "expected parameter 'multiVmGroupName' to be non-null");
        this.processServerId = Objects.requireNonNull(processServerId, "expected parameter 'processServerId' to be non-null");
        this.retentionDrive = Objects.requireNonNull(retentionDrive, "expected parameter 'retentionDrive' to be non-null");
        this.runAsAccountId = runAsAccountId;
        this.vmFriendlyName = vmFriendlyName;
    }

    private InMageEnableProtectionInputArgs() {
        this.datastoreName = Input.empty();
        this.diskExclusionInput = Input.empty();
        this.disksToInclude = Input.empty();
        this.instanceType = Input.empty();
        this.masterTargetId = Input.empty();
        this.multiVmGroupId = Input.empty();
        this.multiVmGroupName = Input.empty();
        this.processServerId = Input.empty();
        this.retentionDrive = Input.empty();
        this.runAsAccountId = Input.empty();
        this.vmFriendlyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageEnableProtectionInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> datastoreName;
        private @Nullable Input<InMageDiskExclusionInputArgs> diskExclusionInput;
        private @Nullable Input<List<String>> disksToInclude;
        private @Nullable Input<String> instanceType;
        private Input<String> masterTargetId;
        private Input<String> multiVmGroupId;
        private Input<String> multiVmGroupName;
        private Input<String> processServerId;
        private Input<String> retentionDrive;
        private @Nullable Input<String> runAsAccountId;
        private @Nullable Input<String> vmFriendlyName;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageEnableProtectionInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreName = defaults.datastoreName;
    	      this.diskExclusionInput = defaults.diskExclusionInput;
    	      this.disksToInclude = defaults.disksToInclude;
    	      this.instanceType = defaults.instanceType;
    	      this.masterTargetId = defaults.masterTargetId;
    	      this.multiVmGroupId = defaults.multiVmGroupId;
    	      this.multiVmGroupName = defaults.multiVmGroupName;
    	      this.processServerId = defaults.processServerId;
    	      this.retentionDrive = defaults.retentionDrive;
    	      this.runAsAccountId = defaults.runAsAccountId;
    	      this.vmFriendlyName = defaults.vmFriendlyName;
        }

        public Builder setDatastoreName(@Nullable Input<String> datastoreName) {
            this.datastoreName = datastoreName;
            return this;
        }

        public Builder setDatastoreName(@Nullable String datastoreName) {
            this.datastoreName = Input.ofNullable(datastoreName);
            return this;
        }

        public Builder setDiskExclusionInput(@Nullable Input<InMageDiskExclusionInputArgs> diskExclusionInput) {
            this.diskExclusionInput = diskExclusionInput;
            return this;
        }

        public Builder setDiskExclusionInput(@Nullable InMageDiskExclusionInputArgs diskExclusionInput) {
            this.diskExclusionInput = Input.ofNullable(diskExclusionInput);
            return this;
        }

        public Builder setDisksToInclude(@Nullable Input<List<String>> disksToInclude) {
            this.disksToInclude = disksToInclude;
            return this;
        }

        public Builder setDisksToInclude(@Nullable List<String> disksToInclude) {
            this.disksToInclude = Input.ofNullable(disksToInclude);
            return this;
        }

        public Builder setInstanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder setMasterTargetId(Input<String> masterTargetId) {
            this.masterTargetId = Objects.requireNonNull(masterTargetId);
            return this;
        }

        public Builder setMasterTargetId(String masterTargetId) {
            this.masterTargetId = Input.of(Objects.requireNonNull(masterTargetId));
            return this;
        }

        public Builder setMultiVmGroupId(Input<String> multiVmGroupId) {
            this.multiVmGroupId = Objects.requireNonNull(multiVmGroupId);
            return this;
        }

        public Builder setMultiVmGroupId(String multiVmGroupId) {
            this.multiVmGroupId = Input.of(Objects.requireNonNull(multiVmGroupId));
            return this;
        }

        public Builder setMultiVmGroupName(Input<String> multiVmGroupName) {
            this.multiVmGroupName = Objects.requireNonNull(multiVmGroupName);
            return this;
        }

        public Builder setMultiVmGroupName(String multiVmGroupName) {
            this.multiVmGroupName = Input.of(Objects.requireNonNull(multiVmGroupName));
            return this;
        }

        public Builder setProcessServerId(Input<String> processServerId) {
            this.processServerId = Objects.requireNonNull(processServerId);
            return this;
        }

        public Builder setProcessServerId(String processServerId) {
            this.processServerId = Input.of(Objects.requireNonNull(processServerId));
            return this;
        }

        public Builder setRetentionDrive(Input<String> retentionDrive) {
            this.retentionDrive = Objects.requireNonNull(retentionDrive);
            return this;
        }

        public Builder setRetentionDrive(String retentionDrive) {
            this.retentionDrive = Input.of(Objects.requireNonNull(retentionDrive));
            return this;
        }

        public Builder setRunAsAccountId(@Nullable Input<String> runAsAccountId) {
            this.runAsAccountId = runAsAccountId;
            return this;
        }

        public Builder setRunAsAccountId(@Nullable String runAsAccountId) {
            this.runAsAccountId = Input.ofNullable(runAsAccountId);
            return this;
        }

        public Builder setVmFriendlyName(@Nullable Input<String> vmFriendlyName) {
            this.vmFriendlyName = vmFriendlyName;
            return this;
        }

        public Builder setVmFriendlyName(@Nullable String vmFriendlyName) {
            this.vmFriendlyName = Input.ofNullable(vmFriendlyName);
            return this;
        }

        public InMageEnableProtectionInputArgs build() {
            return new InMageEnableProtectionInputArgs(datastoreName, diskExclusionInput, disksToInclude, instanceType, masterTargetId, multiVmGroupId, multiVmGroupName, processServerId, retentionDrive, runAsAccountId, vmFriendlyName);
        }
    }
}
