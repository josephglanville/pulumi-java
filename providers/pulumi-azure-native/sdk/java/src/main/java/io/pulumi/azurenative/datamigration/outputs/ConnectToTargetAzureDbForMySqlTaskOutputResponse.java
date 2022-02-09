// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ConnectToTargetAzureDbForMySqlTaskOutputResponse {
    private final List<String> databases;
    private final String id;
    private final String serverVersion;
    private final String targetServerBrandVersion;
    private final List<ReportableExceptionResponse> validationErrors;

    @OutputCustomType.Constructor({"databases","id","serverVersion","targetServerBrandVersion","validationErrors"})
    private ConnectToTargetAzureDbForMySqlTaskOutputResponse(
        List<String> databases,
        String id,
        String serverVersion,
        String targetServerBrandVersion,
        List<ReportableExceptionResponse> validationErrors) {
        this.databases = Objects.requireNonNull(databases);
        this.id = Objects.requireNonNull(id);
        this.serverVersion = Objects.requireNonNull(serverVersion);
        this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
        this.validationErrors = Objects.requireNonNull(validationErrors);
    }

    public List<String> getDatabases() {
        return this.databases;
    }
    public String getId() {
        return this.id;
    }
    public String getServerVersion() {
        return this.serverVersion;
    }
    public String getTargetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }
    public List<ReportableExceptionResponse> getValidationErrors() {
        return this.validationErrors;
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

        public Builder setDatabases(List<String> databases) {
            this.databases = Objects.requireNonNull(databases);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setServerVersion(String serverVersion) {
            this.serverVersion = Objects.requireNonNull(serverVersion);
            return this;
        }

        public Builder setTargetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }

        public Builder setValidationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }

        public ConnectToTargetAzureDbForMySqlTaskOutputResponse build() {
            return new ConnectToTargetAzureDbForMySqlTaskOutputResponse(databases, id, serverVersion, targetServerBrandVersion, validationErrors);
        }
    }
}
