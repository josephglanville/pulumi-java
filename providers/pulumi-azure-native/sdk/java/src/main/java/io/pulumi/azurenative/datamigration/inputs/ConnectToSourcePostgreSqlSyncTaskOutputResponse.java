// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ConnectToSourcePostgreSqlSyncTaskOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectToSourcePostgreSqlSyncTaskOutputResponse Empty = new ConnectToSourcePostgreSqlSyncTaskOutputResponse();

    @InputImport(name="databases", required=true)
    private final List<String> databases;

    public List<String> getDatabases() {
        return this.databases;
    }

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="sourceServerBrandVersion", required=true)
    private final String sourceServerBrandVersion;

    public String getSourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }

    @InputImport(name="sourceServerVersion", required=true)
    private final String sourceServerVersion;

    public String getSourceServerVersion() {
        return this.sourceServerVersion;
    }

    @InputImport(name="validationErrors", required=true)
    private final List<ReportableExceptionResponse> validationErrors;

    public List<ReportableExceptionResponse> getValidationErrors() {
        return this.validationErrors;
    }

    public ConnectToSourcePostgreSqlSyncTaskOutputResponse(
        List<String> databases,
        String id,
        String sourceServerBrandVersion,
        String sourceServerVersion,
        List<ReportableExceptionResponse> validationErrors) {
        this.databases = Objects.requireNonNull(databases, "expected parameter 'databases' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion, "expected parameter 'sourceServerBrandVersion' to be non-null");
        this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion, "expected parameter 'sourceServerVersion' to be non-null");
        this.validationErrors = Objects.requireNonNull(validationErrors, "expected parameter 'validationErrors' to be non-null");
    }

    private ConnectToSourcePostgreSqlSyncTaskOutputResponse() {
        this.databases = List.of();
        this.id = null;
        this.sourceServerBrandVersion = null;
        this.sourceServerVersion = null;
        this.validationErrors = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourcePostgreSqlSyncTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> databases;
        private String id;
        private String sourceServerBrandVersion;
        private String sourceServerVersion;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourcePostgreSqlSyncTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databases = defaults.databases;
    	      this.id = defaults.id;
    	      this.sourceServerBrandVersion = defaults.sourceServerBrandVersion;
    	      this.sourceServerVersion = defaults.sourceServerVersion;
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

        public Builder setSourceServerBrandVersion(String sourceServerBrandVersion) {
            this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion);
            return this;
        }

        public Builder setSourceServerVersion(String sourceServerVersion) {
            this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion);
            return this;
        }

        public Builder setValidationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }

        public ConnectToSourcePostgreSqlSyncTaskOutputResponse build() {
            return new ConnectToSourcePostgreSqlSyncTaskOutputResponse(databases, id, sourceServerBrandVersion, sourceServerVersion, validationErrors);
        }
    }
}
