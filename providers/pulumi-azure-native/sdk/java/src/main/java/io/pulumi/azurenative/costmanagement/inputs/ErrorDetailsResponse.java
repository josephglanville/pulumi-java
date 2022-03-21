// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The details of the error.
 * 
 */
public final class ErrorDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ErrorDetailsResponse Empty = new ErrorDetailsResponse();

    /**
     * Error code.
     * 
     */
    @Import(name="code", required=true)
      private final String code;

    public String getCode() {
        return this.code;
    }

    /**
     * Error message indicating why the operation failed.
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    public ErrorDetailsResponse(
        String code,
        String message) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
    }

    private ErrorDetailsResponse() {
        this.code = null;
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public ErrorDetailsResponse build() {
            return new ErrorDetailsResponse(code, message);
        }
    }
}
