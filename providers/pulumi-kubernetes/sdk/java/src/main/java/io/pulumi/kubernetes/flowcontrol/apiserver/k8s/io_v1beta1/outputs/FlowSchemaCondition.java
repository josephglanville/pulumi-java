// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowSchemaCondition {
    private final @Nullable String lastTransitionTime;
    private final @Nullable String message;
    private final @Nullable String reason;
    private final @Nullable String status;
    private final @Nullable String type;

    @OutputCustomType.Constructor({"lastTransitionTime","message","reason","status","type"})
    private FlowSchemaCondition(
        @Nullable String lastTransitionTime,
        @Nullable String message,
        @Nullable String reason,
        @Nullable String status,
        @Nullable String type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = type;
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
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSchemaCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastTransitionTime;
        private @Nullable String message;
        private @Nullable String reason;
        private @Nullable String status;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSchemaCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
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

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public FlowSchemaCondition build() {
            return new FlowSchemaCondition(lastTransitionTime, message, reason, status, type);
        }
    }
}
