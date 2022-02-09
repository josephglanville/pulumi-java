// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NotebookPreparationErrorResponse {
    private final @Nullable String errorMessage;
    private final @Nullable Integer statusCode;

    @OutputCustomType.Constructor({"errorMessage","statusCode"})
    private NotebookPreparationErrorResponse(
        @Nullable String errorMessage,
        @Nullable Integer statusCode) {
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
    }

    public Optional<String> getErrorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }
    public Optional<Integer> getStatusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotebookPreparationErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String errorMessage;
        private @Nullable Integer statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(NotebookPreparationErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorMessage = defaults.errorMessage;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder setErrorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public Builder setStatusCode(@Nullable Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public NotebookPreparationErrorResponse build() {
            return new NotebookPreparationErrorResponse(errorMessage, statusCode);
        }
    }
}
