// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobCondition {
    private final @Nullable String lastProbeTime;
    private final @Nullable String lastTransitionTime;
    private final @Nullable String message;
    private final @Nullable String reason;
    private final String status;
    private final String type;

    @OutputCustomType.Constructor({"lastProbeTime","lastTransitionTime","message","reason","status","type"})
    private JobCondition(
        @Nullable String lastProbeTime,
        @Nullable String lastTransitionTime,
        @Nullable String message,
        @Nullable String reason,
        String status,
        String type) {
        this.lastProbeTime = lastProbeTime;
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = Objects.requireNonNull(status);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getLastProbeTime() {
        return Optional.ofNullable(this.lastProbeTime);
    }
    public Optional<String> getLastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    public Optional<String> getReason() {
        return Optional.ofNullable(this.reason);
    }
    public String getStatus() {
        return this.status;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastProbeTime;
        private @Nullable String lastTransitionTime;
        private @Nullable String message;
        private @Nullable String reason;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastProbeTime = defaults.lastProbeTime;
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setLastProbeTime(@Nullable String lastProbeTime) {
            this.lastProbeTime = lastProbeTime;
            return this;
        }

        public Builder setLastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public JobCondition build() {
            return new JobCondition(lastProbeTime, lastTransitionTime, message, reason, status, type);
        }
    }
}
