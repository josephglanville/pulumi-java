// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.DatabaseBackupInfoResponse;
import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ValidateMigrationInputSqlServerSqlMITaskOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ValidateMigrationInputSqlServerSqlMITaskOutputResponse Empty = new ValidateMigrationInputSqlServerSqlMITaskOutputResponse();

    @InputImport(name="backupFolderErrors", required=true)
    private final List<ReportableExceptionResponse> backupFolderErrors;

    public List<ReportableExceptionResponse> getBackupFolderErrors() {
        return this.backupFolderErrors;
    }

    @InputImport(name="backupShareCredentialsErrors", required=true)
    private final List<ReportableExceptionResponse> backupShareCredentialsErrors;

    public List<ReportableExceptionResponse> getBackupShareCredentialsErrors() {
        return this.backupShareCredentialsErrors;
    }

    @InputImport(name="backupStorageAccountErrors", required=true)
    private final List<ReportableExceptionResponse> backupStorageAccountErrors;

    public List<ReportableExceptionResponse> getBackupStorageAccountErrors() {
        return this.backupStorageAccountErrors;
    }

    @InputImport(name="databaseBackupInfo")
    private final @Nullable DatabaseBackupInfoResponse databaseBackupInfo;

    public Optional<DatabaseBackupInfoResponse> getDatabaseBackupInfo() {
        return this.databaseBackupInfo == null ? Optional.empty() : Optional.ofNullable(this.databaseBackupInfo);
    }

    @InputImport(name="existingBackupErrors", required=true)
    private final List<ReportableExceptionResponse> existingBackupErrors;

    public List<ReportableExceptionResponse> getExistingBackupErrors() {
        return this.existingBackupErrors;
    }

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="restoreDatabaseNameErrors", required=true)
    private final List<ReportableExceptionResponse> restoreDatabaseNameErrors;

    public List<ReportableExceptionResponse> getRestoreDatabaseNameErrors() {
        return this.restoreDatabaseNameErrors;
    }

    public ValidateMigrationInputSqlServerSqlMITaskOutputResponse(
        List<ReportableExceptionResponse> backupFolderErrors,
        List<ReportableExceptionResponse> backupShareCredentialsErrors,
        List<ReportableExceptionResponse> backupStorageAccountErrors,
        @Nullable DatabaseBackupInfoResponse databaseBackupInfo,
        List<ReportableExceptionResponse> existingBackupErrors,
        String id,
        String name,
        List<ReportableExceptionResponse> restoreDatabaseNameErrors) {
        this.backupFolderErrors = Objects.requireNonNull(backupFolderErrors, "expected parameter 'backupFolderErrors' to be non-null");
        this.backupShareCredentialsErrors = Objects.requireNonNull(backupShareCredentialsErrors, "expected parameter 'backupShareCredentialsErrors' to be non-null");
        this.backupStorageAccountErrors = Objects.requireNonNull(backupStorageAccountErrors, "expected parameter 'backupStorageAccountErrors' to be non-null");
        this.databaseBackupInfo = databaseBackupInfo;
        this.existingBackupErrors = Objects.requireNonNull(existingBackupErrors, "expected parameter 'existingBackupErrors' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.restoreDatabaseNameErrors = Objects.requireNonNull(restoreDatabaseNameErrors, "expected parameter 'restoreDatabaseNameErrors' to be non-null");
    }

    private ValidateMigrationInputSqlServerSqlMITaskOutputResponse() {
        this.backupFolderErrors = List.of();
        this.backupShareCredentialsErrors = List.of();
        this.backupStorageAccountErrors = List.of();
        this.databaseBackupInfo = null;
        this.existingBackupErrors = List.of();
        this.id = null;
        this.name = null;
        this.restoreDatabaseNameErrors = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateMigrationInputSqlServerSqlMITaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ReportableExceptionResponse> backupFolderErrors;
        private List<ReportableExceptionResponse> backupShareCredentialsErrors;
        private List<ReportableExceptionResponse> backupStorageAccountErrors;
        private @Nullable DatabaseBackupInfoResponse databaseBackupInfo;
        private List<ReportableExceptionResponse> existingBackupErrors;
        private String id;
        private String name;
        private List<ReportableExceptionResponse> restoreDatabaseNameErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateMigrationInputSqlServerSqlMITaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupFolderErrors = defaults.backupFolderErrors;
    	      this.backupShareCredentialsErrors = defaults.backupShareCredentialsErrors;
    	      this.backupStorageAccountErrors = defaults.backupStorageAccountErrors;
    	      this.databaseBackupInfo = defaults.databaseBackupInfo;
    	      this.existingBackupErrors = defaults.existingBackupErrors;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.restoreDatabaseNameErrors = defaults.restoreDatabaseNameErrors;
        }

        public Builder setBackupFolderErrors(List<ReportableExceptionResponse> backupFolderErrors) {
            this.backupFolderErrors = Objects.requireNonNull(backupFolderErrors);
            return this;
        }

        public Builder setBackupShareCredentialsErrors(List<ReportableExceptionResponse> backupShareCredentialsErrors) {
            this.backupShareCredentialsErrors = Objects.requireNonNull(backupShareCredentialsErrors);
            return this;
        }

        public Builder setBackupStorageAccountErrors(List<ReportableExceptionResponse> backupStorageAccountErrors) {
            this.backupStorageAccountErrors = Objects.requireNonNull(backupStorageAccountErrors);
            return this;
        }

        public Builder setDatabaseBackupInfo(@Nullable DatabaseBackupInfoResponse databaseBackupInfo) {
            this.databaseBackupInfo = databaseBackupInfo;
            return this;
        }

        public Builder setExistingBackupErrors(List<ReportableExceptionResponse> existingBackupErrors) {
            this.existingBackupErrors = Objects.requireNonNull(existingBackupErrors);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRestoreDatabaseNameErrors(List<ReportableExceptionResponse> restoreDatabaseNameErrors) {
            this.restoreDatabaseNameErrors = Objects.requireNonNull(restoreDatabaseNameErrors);
            return this;
        }

        public ValidateMigrationInputSqlServerSqlMITaskOutputResponse build() {
            return new ValidateMigrationInputSqlServerSqlMITaskOutputResponse(backupFolderErrors, backupShareCredentialsErrors, backupStorageAccountErrors, databaseBackupInfo, existingBackupErrors, id, name, restoreDatabaseNameErrors);
        }
    }
}
