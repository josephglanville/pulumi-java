// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Output for the task that validates connection to Azure Database for MySQL and target server requirements
 * 
 */
public final class ConnectToTargetAzureDbForMySqlTaskOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectToTargetAzureDbForMySqlTaskOutputResponse Empty = new ConnectToTargetAzureDbForMySqlTaskOutputResponse();

    /**
     * List of databases on target server
     * 
     */
    @Import(name="databases", required=true)
      private final List<String> databases;

    public List<String> getDatabases() {
        return this.databases;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Version of the target server
     * 
     */
    @Import(name="serverVersion", required=true)
      private final String serverVersion;

    public String getServerVersion() {
        return this.serverVersion;
    }

    /**
     * Target server brand version
     * 
     */
    @Import(name="targetServerBrandVersion", required=true)
      private final String targetServerBrandVersion;

    public String getTargetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }

    /**
     * Validation errors associated with the task
     * 
     */
    @Import(name="validationErrors", required=true)
      private final List<ReportableExceptionResponse> validationErrors;

    public List<ReportableExceptionResponse> getValidationErrors() {
        return this.validationErrors;
    }

    public ConnectToTargetAzureDbForMySqlTaskOutputResponse(
        List<String> databases,
        String id,
        String serverVersion,
        String targetServerBrandVersion,
        List<ReportableExceptionResponse> validationErrors) {
        this.databases = Objects.requireNonNull(databases, "expected parameter 'databases' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.serverVersion = Objects.requireNonNull(serverVersion, "expected parameter 'serverVersion' to be non-null");
        this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion, "expected parameter 'targetServerBrandVersion' to be non-null");
        this.validationErrors = Objects.requireNonNull(validationErrors, "expected parameter 'validationErrors' to be non-null");
    }

    private ConnectToTargetAzureDbForMySqlTaskOutputResponse() {
        this.databases = List.of();
        this.id = null;
        this.serverVersion = null;
        this.targetServerBrandVersion = null;
        this.validationErrors = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetAzureDbForMySqlTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> databases;
        private String id;
        private String serverVersion;
        private String targetServerBrandVersion;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetAzureDbForMySqlTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databases = defaults.databases;
    	      this.id = defaults.id;
    	      this.serverVersion = defaults.serverVersion;
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder databases(List<String> databases) {
            this.databases = Objects.requireNonNull(databases);
            return this;
        }
        public Builder databases(String... databases) {
            return databases(List.of(databases));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder serverVersion(String serverVersion) {
            this.serverVersion = Objects.requireNonNull(serverVersion);
            return this;
        }
        public Builder targetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }
        public Builder validationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }
        public Builder validationErrors(ReportableExceptionResponse... validationErrors) {
            return validationErrors(List.of(validationErrors));
        }        public ConnectToTargetAzureDbForMySqlTaskOutputResponse build() {
            return new ConnectToTargetAzureDbForMySqlTaskOutputResponse(databases, id, serverVersion, targetServerBrandVersion, validationErrors);
        }
    }
}
