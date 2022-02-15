// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.CloudErrorBodyResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudErrorResponse Empty = new CloudErrorResponse();

    @InputImport(name="error")
    private final @Nullable CloudErrorBodyResponse error;

    public Optional<CloudErrorBodyResponse> getError() {
        return this.error == null ? Optional.empty() : Optional.ofNullable(this.error);
    }

    public CloudErrorResponse(@Nullable CloudErrorBodyResponse error) {
        this.error = error;
    }

    private CloudErrorResponse() {
        this.error = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CloudErrorBodyResponse error;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
        }

        public Builder setError(@Nullable CloudErrorBodyResponse error) {
            this.error = error;
            return this;
        }

        public CloudErrorResponse build() {
            return new CloudErrorResponse(error);
        }
    }
}