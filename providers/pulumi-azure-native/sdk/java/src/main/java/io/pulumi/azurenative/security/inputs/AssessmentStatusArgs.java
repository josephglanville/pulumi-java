// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.enums.AssessmentStatusCode;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssessmentStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssessmentStatusArgs Empty = new AssessmentStatusArgs();

    @InputImport(name="cause")
    private final @Nullable Input<String> cause;

    public Input<String> getCause() {
        return this.cause == null ? Input.empty() : this.cause;
    }

    @InputImport(name="code", required=true)
    private final Input<Either<String,AssessmentStatusCode>> code;

    public Input<Either<String,AssessmentStatusCode>> getCode() {
        return this.code;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    public AssessmentStatusArgs(
        @Nullable Input<String> cause,
        Input<Either<String,AssessmentStatusCode>> code,
        @Nullable Input<String> description) {
        this.cause = cause;
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.description = description;
    }

    private AssessmentStatusArgs() {
        this.cause = Input.empty();
        this.code = Input.empty();
        this.description = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cause;
        private Input<Either<String,AssessmentStatusCode>> code;
        private @Nullable Input<String> description;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cause = defaults.cause;
    	      this.code = defaults.code;
    	      this.description = defaults.description;
        }

        public Builder setCause(@Nullable Input<String> cause) {
            this.cause = cause;
            return this;
        }

        public Builder setCause(@Nullable String cause) {
            this.cause = Input.ofNullable(cause);
            return this;
        }

        public Builder setCode(Input<Either<String,AssessmentStatusCode>> code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setCode(Either<String,AssessmentStatusCode> code) {
            this.code = Input.of(Objects.requireNonNull(code));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public AssessmentStatusArgs build() {
            return new AssessmentStatusArgs(cause, code, description);
        }
    }
}
