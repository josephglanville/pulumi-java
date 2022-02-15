// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobRetryConfig {
    private final @Nullable String maxBackoffDuration;
    private final @Nullable Integer maxDoublings;
    private final @Nullable String maxRetryDuration;
    private final @Nullable String minBackoffDuration;
    private final @Nullable Integer retryCount;

    @OutputCustomType.Constructor({"maxBackoffDuration","maxDoublings","maxRetryDuration","minBackoffDuration","retryCount"})
    private JobRetryConfig(
        @Nullable String maxBackoffDuration,
        @Nullable Integer maxDoublings,
        @Nullable String maxRetryDuration,
        @Nullable String minBackoffDuration,
        @Nullable Integer retryCount) {
        this.maxBackoffDuration = maxBackoffDuration;
        this.maxDoublings = maxDoublings;
        this.maxRetryDuration = maxRetryDuration;
        this.minBackoffDuration = minBackoffDuration;
        this.retryCount = retryCount;
    }

    public Optional<String> getMaxBackoffDuration() {
        return Optional.ofNullable(this.maxBackoffDuration);
    }
    public Optional<Integer> getMaxDoublings() {
        return Optional.ofNullable(this.maxDoublings);
    }
    public Optional<String> getMaxRetryDuration() {
        return Optional.ofNullable(this.maxRetryDuration);
    }
    public Optional<String> getMinBackoffDuration() {
        return Optional.ofNullable(this.minBackoffDuration);
    }
    public Optional<Integer> getRetryCount() {
        return Optional.ofNullable(this.retryCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobRetryConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String maxBackoffDuration;
        private @Nullable Integer maxDoublings;
        private @Nullable String maxRetryDuration;
        private @Nullable String minBackoffDuration;
        private @Nullable Integer retryCount;

        public Builder() {
    	      // Empty
        }

        public Builder(JobRetryConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBackoffDuration = defaults.maxBackoffDuration;
    	      this.maxDoublings = defaults.maxDoublings;
    	      this.maxRetryDuration = defaults.maxRetryDuration;
    	      this.minBackoffDuration = defaults.minBackoffDuration;
    	      this.retryCount = defaults.retryCount;
        }

        public Builder setMaxBackoffDuration(@Nullable String maxBackoffDuration) {
            this.maxBackoffDuration = maxBackoffDuration;
            return this;
        }

        public Builder setMaxDoublings(@Nullable Integer maxDoublings) {
            this.maxDoublings = maxDoublings;
            return this;
        }

        public Builder setMaxRetryDuration(@Nullable String maxRetryDuration) {
            this.maxRetryDuration = maxRetryDuration;
            return this;
        }

        public Builder setMinBackoffDuration(@Nullable String minBackoffDuration) {
            this.minBackoffDuration = minBackoffDuration;
            return this;
        }

        public Builder setRetryCount(@Nullable Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }

        public JobRetryConfig build() {
            return new JobRetryConfig(maxBackoffDuration, maxDoublings, maxRetryDuration, minBackoffDuration, retryCount);
        }
    }
}