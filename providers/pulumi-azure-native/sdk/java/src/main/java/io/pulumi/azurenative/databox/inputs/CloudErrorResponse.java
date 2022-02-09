// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.AdditionalErrorInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudErrorResponse Empty = new CloudErrorResponse();

    @InputImport(name="additionalInfo", required=true)
    private final List<AdditionalErrorInfoResponse> additionalInfo;

    public List<AdditionalErrorInfoResponse> getAdditionalInfo() {
        return this.additionalInfo;
    }

    @InputImport(name="code")
    private final @Nullable String code;

    public Optional<String> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    @InputImport(name="details", required=true)
    private final List<CloudErrorResponse> details;

    public List<CloudErrorResponse> getDetails() {
        return this.details;
    }

    @InputImport(name="message")
    private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    @InputImport(name="target")
    private final @Nullable String target;

    public Optional<String> getTarget() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    public CloudErrorResponse(
        List<AdditionalErrorInfoResponse> additionalInfo,
        @Nullable String code,
        List<CloudErrorResponse> details,
        @Nullable String message,
        @Nullable String target) {
        this.additionalInfo = Objects.requireNonNull(additionalInfo, "expected parameter 'additionalInfo' to be non-null");
        this.code = code;
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
        this.message = message;
        this.target = target;
    }

    private CloudErrorResponse() {
        this.additionalInfo = List.of();
        this.code = null;
        this.details = List.of();
        this.message = null;
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AdditionalErrorInfoResponse> additionalInfo;
        private @Nullable String code;
        private List<CloudErrorResponse> details;
        private @Nullable String message;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder setAdditionalInfo(List<AdditionalErrorInfoResponse> additionalInfo) {
            this.additionalInfo = Objects.requireNonNull(additionalInfo);
            return this;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setDetails(List<CloudErrorResponse> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }

        public CloudErrorResponse build() {
            return new CloudErrorResponse(additionalInfo, code, details, message, target);
        }
    }
}
