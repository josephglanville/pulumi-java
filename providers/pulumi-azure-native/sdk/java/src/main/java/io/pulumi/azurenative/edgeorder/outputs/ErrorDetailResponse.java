// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.azurenative.edgeorder.outputs.ErrorAdditionalInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ErrorDetailResponse {
    private final List<ErrorAdditionalInfoResponse> additionalInfo;
    private final String code;
    private final List<ErrorDetailResponse> details;
    private final String message;
    private final String target;

    @OutputCustomType.Constructor({"additionalInfo","code","details","message","target"})
    private ErrorDetailResponse(
        List<ErrorAdditionalInfoResponse> additionalInfo,
        String code,
        List<ErrorDetailResponse> details,
        String message,
        String target) {
        this.additionalInfo = Objects.requireNonNull(additionalInfo);
        this.code = Objects.requireNonNull(code);
        this.details = Objects.requireNonNull(details);
        this.message = Objects.requireNonNull(message);
        this.target = Objects.requireNonNull(target);
    }

    public List<ErrorAdditionalInfoResponse> getAdditionalInfo() {
        return this.additionalInfo;
    }
    public String getCode() {
        return this.code;
    }
    public List<ErrorDetailResponse> getDetails() {
        return this.details;
    }
    public String getMessage() {
        return this.message;
    }
    public String getTarget() {
        return this.target;
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
