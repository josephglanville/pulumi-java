// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.azurenative.policyinsights.inputs.TypedErrorInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ErrorDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ErrorDefinitionResponse Empty = new ErrorDefinitionResponse();

    @InputImport(name="additionalInfo", required=true)
    private final List<TypedErrorInfoResponse> additionalInfo;

    public List<TypedErrorInfoResponse> getAdditionalInfo() {
        return this.additionalInfo;
    }

    @InputImport(name="code", required=true)
    private final String code;

    public String getCode() {
        return this.code;
    }

    @InputImport(name="details", required=true)
    private final List<ErrorDefinitionResponse> details;

    public List<ErrorDefinitionResponse> getDetails() {
        return this.details;
    }

    @InputImport(name="message", required=true)
    private final String message;

    public String getMessage() {
        return this.message;
    }

    @InputImport(name="target", required=true)
    private final String target;

    public String getTarget() {
        return this.target;
    }

    public ErrorDefinitionResponse(
        List<TypedErrorInfoResponse> additionalInfo,
        String code,
        List<ErrorDefinitionResponse> details,
        String message,
        String target) {
        this.additionalInfo = Objects.requireNonNull(additionalInfo, "expected parameter 'additionalInfo' to be non-null");
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private ErrorDefinitionResponse() {
        this.additionalInfo = List.of();
        this.code = null;
        this.details = List.of();
        this.message = null;
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TypedErrorInfoResponse> additionalInfo;
        private String code;
        private List<ErrorDefinitionResponse> details;
        private String message;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder setAdditionalInfo(List<TypedErrorInfoResponse> additionalInfo) {
            this.additionalInfo = Objects.requireNonNull(additionalInfo);
            return this;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(List<ErrorDefinitionResponse> details) {
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

        public ErrorDefinitionResponse build() {
            return new ErrorDefinitionResponse(additionalInfo, code, details, message, target);
        }
    }
}