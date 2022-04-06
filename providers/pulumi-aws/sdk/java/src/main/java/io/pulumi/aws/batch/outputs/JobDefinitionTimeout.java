// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobDefinitionTimeout {
    /**
     * The time duration in seconds after which AWS Batch terminates your jobs if they have not finished. The minimum value for the timeout is `60` seconds.
     * 
     */
    private final @Nullable Integer attemptDurationSeconds;

    @CustomType.Constructor
    private JobDefinitionTimeout(@CustomType.Parameter("attemptDurationSeconds") @Nullable Integer attemptDurationSeconds) {
        this.attemptDurationSeconds = attemptDurationSeconds;
    }

    /**
     * The time duration in seconds after which AWS Batch terminates your jobs if they have not finished. The minimum value for the timeout is `60` seconds.
     * 
    */
    public Optional<Integer> getAttemptDurationSeconds() {
        return Optional.ofNullable(this.attemptDurationSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDefinitionTimeout defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer attemptDurationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDefinitionTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attemptDurationSeconds = defaults.attemptDurationSeconds;
        }

        public Builder attemptDurationSeconds(@Nullable Integer attemptDurationSeconds) {
            this.attemptDurationSeconds = attemptDurationSeconds;
            return this;
        }        public JobDefinitionTimeout build() {
            return new JobDefinitionTimeout(attemptDurationSeconds);
        }
    }
}