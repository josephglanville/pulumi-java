// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupArgs Empty = new BackupArgs();

    /**
     * The name of the NetApp account
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the backup
     * 
     */
    @InputImport(name="backupName")
      private final @Nullable Input<String> backupName;

    public Input<String> getBackupName() {
        return this.backupName == null ? Input.empty() : this.backupName;
    }

    /**
     * Label for backup
     * 
     */
    @InputImport(name="label")
      private final @Nullable Input<String> label;

    public Input<String> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the capacity pool
     * 
     */
    @InputImport(name="poolName", required=true)
      private final Input<String> poolName;

    public Input<String> getPoolName() {
        return this.poolName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the volume
     * 
     */
    @InputImport(name="volumeName", required=true)
      private final Input<String> volumeName;

    public Input<String> getVolumeName() {
        return this.volumeName;
    }

    public BackupArgs(
        Input<String> accountName,
        @Nullable Input<String> backupName,
        @Nullable Input<String> label,
        @Nullable Input<String> location,
        Input<String> poolName,
        Input<String> resourceGroupName,
        Input<String> volumeName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.backupName = backupName;
        this.label = label;
        this.location = location;
        this.poolName = Objects.requireNonNull(poolName, "expected parameter 'poolName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.volumeName = Objects.requireNonNull(volumeName, "expected parameter 'volumeName' to be non-null");
    }

    private BackupArgs() {
        this.accountName = Input.empty();
        this.backupName = Input.empty();
        this.label = Input.empty();
        this.location = Input.empty();
        this.poolName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.volumeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> backupName;
        private @Nullable Input<String> label;
        private @Nullable Input<String> location;
        private Input<String> poolName;
        private Input<String> resourceGroupName;
        private Input<String> volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.backupName = defaults.backupName;
    	      this.label = defaults.label;
    	      this.location = defaults.location;
    	      this.poolName = defaults.poolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setBackupName(@Nullable Input<String> backupName) {
            this.backupName = backupName;
            return this;
        }

        public Builder setBackupName(@Nullable String backupName) {
            this.backupName = Input.ofNullable(backupName);
            return this;
        }

        public Builder setLabel(@Nullable Input<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = Input.ofNullable(label);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPoolName(Input<String> poolName) {
            this.poolName = Objects.requireNonNull(poolName);
            return this;
        }

        public Builder setPoolName(String poolName) {
            this.poolName = Input.of(Objects.requireNonNull(poolName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setVolumeName(Input<String> volumeName) {
            this.volumeName = Objects.requireNonNull(volumeName);
            return this;
        }

        public Builder setVolumeName(String volumeName) {
            this.volumeName = Input.of(Objects.requireNonNull(volumeName));
            return this;
        }
        public BackupArgs build() {
            return new BackupArgs(accountName, backupName, label, location, poolName, resourceGroupName, volumeName);
        }
    }
}
