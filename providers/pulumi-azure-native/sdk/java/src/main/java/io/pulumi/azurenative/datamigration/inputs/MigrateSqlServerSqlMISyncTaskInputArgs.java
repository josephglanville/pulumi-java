// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.AzureActiveDirectoryAppArgs;
import io.pulumi.azurenative.datamigration.inputs.FileShareArgs;
import io.pulumi.azurenative.datamigration.inputs.MiSqlConnectionInfoArgs;
import io.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlMIDatabaseInputArgs;
import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Input for task that migrates SQL Server databases to Azure SQL Database Managed Instance online scenario.
 * 
 */
public final class MigrateSqlServerSqlMISyncTaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrateSqlServerSqlMISyncTaskInputArgs Empty = new MigrateSqlServerSqlMISyncTaskInputArgs();

    /**
     * Azure Active Directory Application the DMS instance will use to connect to the target instance of Azure SQL Database Managed Instance and the Azure Storage Account
     * 
     */
    @Import(name="azureApp", required=true)
      private final Output<AzureActiveDirectoryAppArgs> azureApp;

    public Output<AzureActiveDirectoryAppArgs> getAzureApp() {
        return this.azureApp;
    }

    /**
     * Backup file share information for all selected databases.
     * 
     */
    @Import(name="backupFileShare")
      private final @Nullable Output<FileShareArgs> backupFileShare;

    public Output<FileShareArgs> getBackupFileShare() {
        return this.backupFileShare == null ? Codegen.empty() : this.backupFileShare;
    }

    /**
     * Databases to migrate
     * 
     */
    @Import(name="selectedDatabases", required=true)
      private final Output<List<MigrateSqlServerSqlMIDatabaseInputArgs>> selectedDatabases;

    public Output<List<MigrateSqlServerSqlMIDatabaseInputArgs>> getSelectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Connection information for source SQL Server
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
      private final Output<SqlConnectionInfoArgs> sourceConnectionInfo;

    public Output<SqlConnectionInfoArgs> getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Fully qualified resourceId of storage
     * 
     */
    @Import(name="storageResourceId", required=true)
      private final Output<String> storageResourceId;

    public Output<String> getStorageResourceId() {
        return this.storageResourceId;
    }

    /**
     * Connection information for Azure SQL Database Managed Instance
     * 
     */
    @Import(name="targetConnectionInfo", required=true)
      private final Output<MiSqlConnectionInfoArgs> targetConnectionInfo;

    public Output<MiSqlConnectionInfoArgs> getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public MigrateSqlServerSqlMISyncTaskInputArgs(
        Output<AzureActiveDirectoryAppArgs> azureApp,
        @Nullable Output<FileShareArgs> backupFileShare,
        Output<List<MigrateSqlServerSqlMIDatabaseInputArgs>> selectedDatabases,
        Output<SqlConnectionInfoArgs> sourceConnectionInfo,
        Output<String> storageResourceId,
        Output<MiSqlConnectionInfoArgs> targetConnectionInfo) {
        this.azureApp = Objects.requireNonNull(azureApp, "expected parameter 'azureApp' to be non-null");
        this.backupFileShare = backupFileShare;
        this.selectedDatabases = Objects.requireNonNull(selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.storageResourceId = Objects.requireNonNull(storageResourceId, "expected parameter 'storageResourceId' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private MigrateSqlServerSqlMISyncTaskInputArgs() {
        this.azureApp = Codegen.empty();
        this.backupFileShare = Codegen.empty();
        this.selectedDatabases = Codegen.empty();
        this.sourceConnectionInfo = Codegen.empty();
        this.storageResourceId = Codegen.empty();
        this.targetConnectionInfo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMISyncTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AzureActiveDirectoryAppArgs> azureApp;
        private @Nullable Output<FileShareArgs> backupFileShare;
        private Output<List<MigrateSqlServerSqlMIDatabaseInputArgs>> selectedDatabases;
        private Output<SqlConnectionInfoArgs> sourceConnectionInfo;
        private Output<String> storageResourceId;
        private Output<MiSqlConnectionInfoArgs> targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMISyncTaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureApp = defaults.azureApp;
    	      this.backupFileShare = defaults.backupFileShare;
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.storageResourceId = defaults.storageResourceId;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder azureApp(Output<AzureActiveDirectoryAppArgs> azureApp) {
            this.azureApp = Objects.requireNonNull(azureApp);
            return this;
        }
        public Builder azureApp(AzureActiveDirectoryAppArgs azureApp) {
            this.azureApp = Output.of(Objects.requireNonNull(azureApp));
            return this;
        }
        public Builder backupFileShare(@Nullable Output<FileShareArgs> backupFileShare) {
            this.backupFileShare = backupFileShare;
            return this;
        }
        public Builder backupFileShare(@Nullable FileShareArgs backupFileShare) {
            this.backupFileShare = Codegen.ofNullable(backupFileShare);
            return this;
        }
        public Builder selectedDatabases(Output<List<MigrateSqlServerSqlMIDatabaseInputArgs>> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }
        public Builder selectedDatabases(List<MigrateSqlServerSqlMIDatabaseInputArgs> selectedDatabases) {
            this.selectedDatabases = Output.of(Objects.requireNonNull(selectedDatabases));
            return this;
        }
        public Builder selectedDatabases(MigrateSqlServerSqlMIDatabaseInputArgs... selectedDatabases) {
            return selectedDatabases(List.of(selectedDatabases));
        }
        public Builder sourceConnectionInfo(Output<SqlConnectionInfoArgs> sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }
        public Builder sourceConnectionInfo(SqlConnectionInfoArgs sourceConnectionInfo) {
            this.sourceConnectionInfo = Output.of(Objects.requireNonNull(sourceConnectionInfo));
            return this;
        }
        public Builder storageResourceId(Output<String> storageResourceId) {
            this.storageResourceId = Objects.requireNonNull(storageResourceId);
            return this;
        }
        public Builder storageResourceId(String storageResourceId) {
            this.storageResourceId = Output.of(Objects.requireNonNull(storageResourceId));
            return this;
        }
        public Builder targetConnectionInfo(Output<MiSqlConnectionInfoArgs> targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }
        public Builder targetConnectionInfo(MiSqlConnectionInfoArgs targetConnectionInfo) {
            this.targetConnectionInfo = Output.of(Objects.requireNonNull(targetConnectionInfo));
            return this;
        }        public MigrateSqlServerSqlMISyncTaskInputArgs build() {
            return new MigrateSqlServerSqlMISyncTaskInputArgs(azureApp, backupFileShare, selectedDatabases, sourceConnectionInfo, storageResourceId, targetConnectionInfo);
        }
    }
}
