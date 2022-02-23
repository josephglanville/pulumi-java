// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An error response from the Container service.
 * 
 */
public final class CloudErrorBodyResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudErrorBodyResponse Empty = new CloudErrorBodyResponse();

    /**
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     * 
     */
    @InputImport(name="code")
      private final @Nullable String code;

    public Optional<String> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    /**
     * A list of additional details about the error.
     * 
     */
    @InputImport(name="details")
      private final @Nullable List<CloudErrorBodyResponse> details;

    public List<CloudErrorBodyResponse> getDetails() {
        return this.details == null ? List.of() : this.details;
    }

    /**
     * A message describing the error, intended to be suitable for display in a user interface.
     * 
     */
    @InputImport(name="message")
      private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * The target of the particular error. For example, the name of the property in error.
     * 
     */
    @InputImport(name="target")
      private final @Nullable String target;

    public Optional<String> getTarget() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    public CloudErrorBodyResponse(
        @Nullable String code,
        @Nullable List<CloudErrorBodyResponse> details,
        @Nullable String message,
        @Nullable String target) {
        this.code = code;
        this.details = details;
        this.message = message;
        this.target = target;
    }

    private CloudErrorBodyResponse() {
        this.code = null;
        this.details = List.of();
        this.message = null;
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudErrorBodyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable List<CloudErrorBodyResponse> details;
        private @Nullable String message;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudErrorBodyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setDetails(@Nullable List<CloudErrorBodyResponse> details) {
            this.details = details;
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
        public CloudErrorBodyResponse build() {
            return new CloudErrorBodyResponse(code, details, message, target);
        }
    }
}
