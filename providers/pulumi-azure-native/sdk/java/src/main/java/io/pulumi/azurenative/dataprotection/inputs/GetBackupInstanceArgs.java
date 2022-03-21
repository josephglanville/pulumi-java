// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBackupInstanceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBackupInstanceArgs Empty = new GetBackupInstanceArgs();

    /**
     * The name of the backup instance
     * 
     */
    @Import(name="backupInstanceName", required=true)
      private final String backupInstanceName;

    public String getBackupInstanceName() {
        return this.backupInstanceName;
    }

    /**
     * The name of the resource group where the backup vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the backup vault.
     * 
     */
    @Import(name="vaultName", required=true)
      private final String vaultName;

    public String getVaultName() {
        return this.vaultName;
    }

    public GetBackupInstanceArgs(
        String backupInstanceName,
        String resourceGroupName,
        String vaultName) {
        this.backupInstanceName = Objects.requireNonNull(backupInstanceName, "expected parameter 'backupInstanceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private GetBackupInstanceArgs() {
        this.backupInstanceName = null;
        this.resourceGroupName = null;
        this.vaultName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupInstanceName;
        private String resourceGroupName;
        private String vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupInstanceName = defaults.backupInstanceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder backupInstanceName(String backupInstanceName) {
            this.backupInstanceName = Objects.requireNonNull(backupInstanceName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder vaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }        public GetBackupInstanceArgs build() {
            return new GetBackupInstanceArgs(backupInstanceName, resourceGroupName, vaultName);
        }
    }
}
