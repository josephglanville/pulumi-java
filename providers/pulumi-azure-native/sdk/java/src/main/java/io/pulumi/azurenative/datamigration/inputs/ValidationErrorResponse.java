// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Description about the errors happen while performing migration validation
 * 
 */
public final class ValidationErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ValidationErrorResponse Empty = new ValidationErrorResponse();

    /**
     * Severity of the error
     * 
     */
    @Import(name="severity", required=true)
      private final String severity;

    public String getSeverity() {
        return this.severity;
    }

    /**
     * Error Text
     * 
     */
    @Import(name="text", required=true)
      private final String text;

    public String getText() {
        return this.text;
    }

    public ValidationErrorResponse(
        String severity,
        String text) {
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private ValidationErrorResponse() {
        this.severity = null;
        this.text = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String severity;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.severity = defaults.severity;
    	      this.text = defaults.text;
        }

        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }        public ValidationErrorResponse build() {
            return new ValidationErrorResponse(severity, text);
        }
    }
}
