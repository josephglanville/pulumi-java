// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupInstanceArgs Empty = new BackupInstanceArgs();

    @InputImport(name="backupInstanceName")
    private final @Nullable Input<String> backupInstanceName;

    public Input<String> getBackupInstanceName() {
        return this.backupInstanceName == null ? Input.empty() : this.backupInstanceName;
    }

    @InputImport(name="properties")
    private final @Nullable Input<io.pulumi.azurenative.dataprotection.inputs.BackupInstanceArgs> properties;

    public Input<io.pulumi.azurenative.dataprotection.inputs.BackupInstanceArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="vaultName", required=true)
    private final Input<String> vaultName;

    public Input<String> getVaultName() {
        return this.vaultName;
    }

    public BackupInstanceArgs(
        @Nullable Input<String> backupInstanceName,
        @Nullable Input<io.pulumi.azurenative.dataprotection.inputs.BackupInstanceArgs> properties,
        Input<String> resourceGroupName,
        Input<String> vaultName) {
        this.backupInstanceName = backupInstanceName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private BackupInstanceArgs() {
        this.backupInstanceName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.vaultName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> backupInstanceName;
        private @Nullable Input<io.pulumi.azurenative.dataprotection.inputs.BackupInstanceArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupInstanceName = defaults.backupInstanceName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder setBackupInstanceName(@Nullable Input<String> backupInstanceName) {
            this.backupInstanceName = backupInstanceName;
            return this;
        }

        public Builder setBackupInstanceName(@Nullable String backupInstanceName) {
            this.backupInstanceName = Input.ofNullable(backupInstanceName);
            return this;
        }

        public Builder setProperties(@Nullable Input<io.pulumi.azurenative.dataprotection.inputs.BackupInstanceArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable io.pulumi.azurenative.dataprotection.inputs.BackupInstanceArgs properties) {
            this.properties = Input.ofNullable(properties);
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

        public Builder setVaultName(Input<String> vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }

        public Builder setVaultName(String vaultName) {
            this.vaultName = Input.of(Objects.requireNonNull(vaultName));
            return this;
        }

        public BackupInstanceArgs build() {
            return new BackupInstanceArgs(backupInstanceName, properties, resourceGroupName, vaultName);
        }
    }
}
