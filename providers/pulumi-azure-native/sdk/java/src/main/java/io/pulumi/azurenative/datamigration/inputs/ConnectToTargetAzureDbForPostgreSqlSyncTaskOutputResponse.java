// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Output for the task that validates connection to Azure Database for PostgreSQL and target server requirements
 * 
 */
public final class ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse Empty = new ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse();

    /**
     * List of databases on target server
     * 
     */
    @InputImport(name="databases", required=true)
      private final List<String> databases;

    public List<String> getDatabases() {
        return this.databases;
    }

    /**
     * Result identifier
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Target server brand version
     * 
     */
    @InputImport(name="targetServerBrandVersion", required=true)
      private final String targetServerBrandVersion;

    public String getTargetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }

    /**
     * Version of the target server
     * 
     */
    @InputImport(name="targetServerVersion", required=true)
      private final String targetServerVersion;

    public String getTargetServerVersion() {
        return this.targetServerVersion;
    }

    /**
     * Validation errors associated with the task
     * 
     */
    @InputImport(name="validationErrors", required=true)
      private final List<ReportableExceptionResponse> validationErrors;

    public List<ReportableExceptionResponse> getValidationErrors() {
        return this.validationErrors;
    }

    public ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse(
        List<String> databases,
        String id,
        String targetServerBrandVersion,
        String targetServerVersion,
        List<ReportableExceptionResponse> validationErrors) {
        this.databases = Objects.requireNonNull(databases, "expected parameter 'databases' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion, "expected parameter 'targetServerBrandVersion' to be non-null");
        this.targetServerVersion = Objects.requireNonNull(targetServerVersion, "expected parameter 'targetServerVersion' to be non-null");
        this.validationErrors = Objects.requireNonNull(validationErrors, "expected parameter 'validationErrors' to be non-null");
    }

    private ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse() {
        this.databases = List.of();
        this.id = null;
        this.targetServerBrandVersion = null;
        this.targetServerVersion = null;
        this.validationErrors = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> databases;
        private String id;
        private String targetServerBrandVersion;
        private String targetServerVersion;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databases = defaults.databases;
    	      this.id = defaults.id;
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.targetServerVersion = defaults.targetServerVersion;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder setDatabases(List<String> databases) {
            this.databases = Objects.requireNonNull(databases);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setTargetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }

        public Builder setTargetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }

        public Builder setValidationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }
        public ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse build() {
            return new ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse(databases, id, targetServerBrandVersion, targetServerVersion, validationErrors);
        }
    }
}
