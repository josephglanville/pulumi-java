// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.AzureActiveDirectoryAppResponse;
import io.pulumi.azurenative.datamigration.inputs.FileShareResponse;
import io.pulumi.azurenative.datamigration.inputs.MiSqlConnectionInfoResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlMIDatabaseInputResponse;
import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MigrateSqlServerSqlMISyncTaskInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlMISyncTaskInputResponse Empty = new MigrateSqlServerSqlMISyncTaskInputResponse();

    @InputImport(name="azureApp", required=true)
    private final AzureActiveDirectoryAppResponse azureApp;

    public AzureActiveDirectoryAppResponse getAzureApp() {
        return this.azureApp;
    }

    @InputImport(name="backupFileShare")
    private final @Nullable FileShareResponse backupFileShare;

    public Optional<FileShareResponse> getBackupFileShare() {
        return this.backupFileShare == null ? Optional.empty() : Optional.ofNullable(this.backupFileShare);
    }

    @InputImport(name="selectedDatabases", required=true)
    private final List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases;

    public List<MigrateSqlServerSqlMIDatabaseInputResponse> getSelectedDatabases() {
        return this.selectedDatabases;
    }

    @InputImport(name="sourceConnectionInfo", required=true)
    private final SqlConnectionInfoResponse sourceConnectionInfo;

    public SqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    @InputImport(name="storageResourceId", required=true)
    private final String storageResourceId;

    public String getStorageResourceId() {
        return this.storageResourceId;
    }

    @InputImport(name="targetConnectionInfo", required=true)
    private final MiSqlConnectionInfoResponse targetConnectionInfo;

    public MiSqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public MigrateSqlServerSqlMISyncTaskInputResponse(
        AzureActiveDirectoryAppResponse azureApp,
        @Nullable FileShareResponse backupFileShare,
        List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases,
        SqlConnectionInfoResponse sourceConnectionInfo,
        String storageResourceId,
        MiSqlConnectionInfoResponse targetConnectionInfo) {
        this.azureApp = Objects.requireNonNull(azureApp, "expected parameter 'azureApp' to be non-null");
        this.backupFileShare = backupFileShare;
        this.selectedDatabases = Objects.requireNonNull(selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.storageResourceId = Objects.requireNonNull(storageResourceId, "expected parameter 'storageResourceId' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private MigrateSqlServerSqlMISyncTaskInputResponse() {
        this.azureApp = null;
        this.backupFileShare = null;
        this.selectedDatabases = List.of();
        this.sourceConnectionInfo = null;
        this.storageResourceId = null;
        this.targetConnectionInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMISyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureActiveDirectoryAppResponse azureApp;
        private @Nullable FileShareResponse backupFileShare;
        private List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases;
        private SqlConnectionInfoResponse sourceConnectionInfo;
        private String storageResourceId;
        private MiSqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMISyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureApp = defaults.azureApp;
    	      this.backupFileShare = defaults.backupFileShare;
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.storageResourceId = defaults.storageResourceId;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setAzureApp(AzureActiveDirectoryAppResponse azureApp) {
            this.azureApp = Objects.requireNonNull(azureApp);
            return this;
        }

        public Builder setBackupFileShare(@Nullable FileShareResponse backupFileShare) {
            this.backupFileShare = backupFileShare;
            return this;
        }

        public Builder setSelectedDatabases(List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }

        public Builder setSourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setStorageResourceId(String storageResourceId) {
            this.storageResourceId = Objects.requireNonNull(storageResourceId);
            return this;
        }

        public Builder setTargetConnectionInfo(MiSqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public MigrateSqlServerSqlMISyncTaskInputResponse build() {
            return new MigrateSqlServerSqlMISyncTaskInputResponse(azureApp, backupFileShare, selectedDatabases, sourceConnectionInfo, storageResourceId, targetConnectionInfo);
        }
    }
}
