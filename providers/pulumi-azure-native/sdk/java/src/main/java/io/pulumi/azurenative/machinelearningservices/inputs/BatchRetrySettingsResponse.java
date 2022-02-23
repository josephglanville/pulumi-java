// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Retry settings for a batch inference operation.
 * 
 */
public final class BatchRetrySettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final BatchRetrySettingsResponse Empty = new BatchRetrySettingsResponse();

    /**
     * Maximum retry count for a mini-batch
     * 
     */
    @InputImport(name="maxRetries")
      private final @Nullable Integer maxRetries;

    public Optional<Integer> getMaxRetries() {
        return this.maxRetries == null ? Optional.empty() : Optional.ofNullable(this.maxRetries);
    }

    /**
     * Invocation timeout for a mini-batch, in ISO 8601 format.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable String timeout;

    public Optional<String> getTimeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    public BatchRetrySettingsResponse(
        @Nullable Integer maxRetries,
        @Nullable String timeout) {
        this.maxRetries = maxRetries;
        this.timeout = timeout;
    }

    private BatchRetrySettingsResponse() {
        this.maxRetries = null;
        this.timeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchRetrySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxRetries;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchRetrySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRetries = defaults.maxRetries;
    	      this.timeout = defaults.timeout;
        }

        public Builder setMaxRetries(@Nullable Integer maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }
        public BatchRetrySettingsResponse build() {
            return new BatchRetrySettingsResponse(maxRetries, timeout);
        }
    }
}
