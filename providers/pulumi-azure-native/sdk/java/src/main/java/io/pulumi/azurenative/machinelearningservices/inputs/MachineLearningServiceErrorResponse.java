// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.ErrorResponseResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Wrapper for error response to follow ARM guidelines.
 * 
 */
public final class MachineLearningServiceErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final MachineLearningServiceErrorResponse Empty = new MachineLearningServiceErrorResponse();

    /**
     * The error response.
     * 
     */
    @Import(name="error", required=true)
      private final ErrorResponseResponse error;

    public ErrorResponseResponse getError() {
        return this.error;
    }

    public MachineLearningServiceErrorResponse(ErrorResponseResponse error) {
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
    }

    private MachineLearningServiceErrorResponse() {
        this.error = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineLearningServiceErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ErrorResponseResponse error;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineLearningServiceErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
        }

        public Builder error(ErrorResponseResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }        public MachineLearningServiceErrorResponse build() {
            return new MachineLearningServiceErrorResponse(error);
        }
    }
}
