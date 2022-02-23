// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.inputs.ErrorAdditionalInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The error detail.
 * 
 */
public final class ErrorDetailResponse extends io.pulumi.resources.InvokeArgs {

    public static final ErrorDetailResponse Empty = new ErrorDetailResponse();

    /**
     * The error additional info.
     * 
     */
    @InputImport(name="additionalInfo", required=true)
      private final List<ErrorAdditionalInfoResponse> additionalInfo;

    public List<ErrorAdditionalInfoResponse> getAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * The error code.
     * 
     */
    @InputImport(name="code", required=true)
      private final String code;

    public String getCode() {
        return this.code;
    }

    /**
     * The error details.
     * 
     */
    @InputImport(name="details", required=true)
      private final List<ErrorDetailResponse> details;

    public List<ErrorDetailResponse> getDetails() {
        return this.details;
    }

    /**
     * The error message.
     * 
     */
    @InputImport(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * The error target.
     * 
     */
    @InputImport(name="target", required=true)
      private final String target;

    public String getTarget() {
        return this.target;
    }

    public ErrorDetailResponse(
        List<ErrorAdditionalInfoResponse> additionalInfo,
        String code,
        List<ErrorDetailResponse> details,
        String message,
        String target) {
        this.additionalInfo = Objects.requireNonNull(additionalInfo, "expected parameter 'additionalInfo' to be non-null");
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private ErrorDetailResponse() {
        this.additionalInfo = List.of();
        this.code = null;
        this.details = List.of();
        this.message = null;
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ErrorAdditionalInfoResponse> additionalInfo;
        private String code;
        private List<ErrorDetailResponse> details;
        private String message;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder setAdditionalInfo(List<ErrorAdditionalInfoResponse> additionalInfo) {
            this.additionalInfo = Objects.requireNonNull(additionalInfo);
            return this;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(List<ErrorDetailResponse> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public ErrorDetailResponse build() {
            return new ErrorDetailResponse(additionalInfo, code, details, message, target);
        }
    }
}
