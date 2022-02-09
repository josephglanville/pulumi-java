// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.UserFacingErrorResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProtectionStatusDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProtectionStatusDetailsResponse Empty = new ProtectionStatusDetailsResponse();

    @InputImport(name="errorDetails")
    private final @Nullable UserFacingErrorResponse errorDetails;

    public Optional<UserFacingErrorResponse> getErrorDetails() {
        return this.errorDetails == null ? Optional.empty() : Optional.ofNullable(this.errorDetails);
    }

    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public ProtectionStatusDetailsResponse(
        @Nullable UserFacingErrorResponse errorDetails,
        @Nullable String status) {
        this.errorDetails = errorDetails;
        this.status = status;
    }

    private ProtectionStatusDetailsResponse() {
        this.errorDetails = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectionStatusDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable UserFacingErrorResponse errorDetails;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtectionStatusDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorDetails = defaults.errorDetails;
    	      this.status = defaults.status;
        }

        public Builder setErrorDetails(@Nullable UserFacingErrorResponse errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public ProtectionStatusDetailsResponse build() {
            return new ProtectionStatusDetailsResponse(errorDetails, status);
        }
    }
}
