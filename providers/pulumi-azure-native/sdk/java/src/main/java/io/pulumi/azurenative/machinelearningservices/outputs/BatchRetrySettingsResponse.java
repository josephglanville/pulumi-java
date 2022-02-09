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
public final class BatchRetrySettingsResponse {
    private final @Nullable Integer maxRetries;
    private final @Nullable String timeout;

    @OutputCustomType.Constructor({"maxRetries","timeout"})
    private BatchRetrySettingsResponse(
        @Nullable Integer maxRetries,
        @Nullable String timeout) {
        this.maxRetries = maxRetries;
        this.timeout = timeout;
    }

    public Optional<Integer> getMaxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }
    public Optional<String> getTimeout() {
        return Optional.ofNullable(this.timeout);
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
