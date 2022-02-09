// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ValidateSyncMigrationInputSqlServerTaskOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ValidateSyncMigrationInputSqlServerTaskOutputResponse Empty = new ValidateSyncMigrationInputSqlServerTaskOutputResponse();

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

    @InputImport(name="validationErrors", required=true)
    private final List<ReportableExceptionResponse> validationErrors;

    public List<ReportableExceptionResponse> getValidationErrors() {
        return this.validationErrors;
    }

    public ValidateSyncMigrationInputSqlServerTaskOutputResponse(
        String id,
        String name,
        List<ReportableExceptionResponse> validationErrors) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.validationErrors = Objects.requireNonNull(validationErrors, "expected parameter 'validationErrors' to be non-null");
    }

    private ValidateSyncMigrationInputSqlServerTaskOutputResponse() {
        this.id = null;
        this.name = null;
        this.validationErrors = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateSyncMigrationInputSqlServerTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateSyncMigrationInputSqlServerTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValidationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }

        public ValidateSyncMigrationInputSqlServerTaskOutputResponse build() {
            return new ValidateSyncMigrationInputSqlServerTaskOutputResponse(id, name, validationErrors);
        }
    }
}
