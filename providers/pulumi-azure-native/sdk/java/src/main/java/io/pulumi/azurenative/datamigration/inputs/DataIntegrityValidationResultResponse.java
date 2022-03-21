// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ValidationErrorResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Results for checksum based Data Integrity validation results
 * 
 */
public final class DataIntegrityValidationResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataIntegrityValidationResultResponse Empty = new DataIntegrityValidationResultResponse();

    /**
     * List of failed table names of source and target pair
     * 
     */
    @Import(name="failedObjects", required=true)
      private final Map<String,String> failedObjects;

    public Map<String,String> getFailedObjects() {
        return this.failedObjects;
    }

    /**
     * List of errors that happened while performing data integrity validation
     * 
     */
    @Import(name="validationErrors", required=true)
      private final ValidationErrorResponse validationErrors;

    public ValidationErrorResponse getValidationErrors() {
        return this.validationErrors;
    }

    public DataIntegrityValidationResultResponse(
        Map<String,String> failedObjects,
        ValidationErrorResponse validationErrors) {
        this.failedObjects = Objects.requireNonNull(failedObjects, "expected parameter 'failedObjects' to be non-null");
        this.validationErrors = Objects.requireNonNull(validationErrors, "expected parameter 'validationErrors' to be non-null");
    }

    private DataIntegrityValidationResultResponse() {
        this.failedObjects = Map.of();
        this.validationErrors = null;
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
