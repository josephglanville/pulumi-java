// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.ValidationErrorResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class DataIntegrityValidationResultResponse {
    /**
     * List of failed table names of source and target pair
     * 
     */
    private final Map<String,String> failedObjects;
    /**
     * List of errors that happened while performing data integrity validation
     * 
     */
    private final ValidationErrorResponse validationErrors;

    @CustomType.Constructor
    private DataIntegrityValidationResultResponse(
        @CustomType.Parameter("failedObjects") Map<String,String> failedObjects,
        @CustomType.Parameter("validationErrors") ValidationErrorResponse validationErrors) {
        this.failedObjects = failedObjects;
        this.validationErrors = validationErrors;
    }

    /**
     * List of failed table names of source and target pair
     * 
    */
    public Map<String,String> getFailedObjects() {
        return this.failedObjects;
    }
    /**
     * List of errors that happened while performing data integrity validation
     * 
    */
    public ValidationErrorResponse getValidationErrors() {
        return this.validationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataIntegrityValidationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> failedObjects;
        private ValidationErrorResponse validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(DataIntegrityValidationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failedObjects = defaults.failedObjects;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder failedObjects(Map<String,String> failedObjects) {
            this.failedObjects = Objects.requireNonNull(failedObjects);
            return this;
        }
        public Builder validationErrors(ValidationErrorResponse validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }        public DataIntegrityValidationResultResponse build() {
            return new DataIntegrityValidationResultResponse(failedObjects, validationErrors);
        }
    }
}
