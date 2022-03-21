// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ValidateMigrationInputSqlServerSqlMISyncTaskOutputResponse {
    /**
     * Database identifier
     * 
     */
    private final String id;
    /**
     * Name of database
     * 
     */
    private final String name;
    /**
     * Errors associated with a selected database object
     * 
     */
    private final List<ReportableExceptionResponse> validationErrors;

    @CustomType.Constructor
    private ValidateMigrationInputSqlServerSqlMISyncTaskOutputResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("validationErrors") List<ReportableExceptionResponse> validationErrors) {
        this.id = id;
        this.name = name;
        this.validationErrors = validationErrors;
    }

    /**
     * Database identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of database
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Errors associated with a selected database object
     * 
    */
    public List<ReportableExceptionResponse> getValidationErrors() {
        return this.validationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateMigrationInputSqlServerSqlMISyncTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateMigrationInputSqlServerSqlMISyncTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder validationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }
        public Builder validationErrors(ReportableExceptionResponse... validationErrors) {
            return validationErrors(List.of(validationErrors));
        }        public ValidateMigrationInputSqlServerSqlMISyncTaskOutputResponse build() {
            return new ValidateMigrationInputSqlServerSqlMISyncTaskOutputResponse(id, name, validationErrors);
        }
    }
}
