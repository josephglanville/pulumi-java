// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DaemonSetCondition describes the state of a DaemonSet at a certain point.
 * 
 */
public final class DaemonSetConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DaemonSetConditionArgs Empty = new DaemonSetConditionArgs();

    /**
     * Last time the condition transitioned from one status to another.
     * 
     */
    @InputImport(name="lastTransitionTime")
      private final @Nullable Input<String> lastTransitionTime;

    public Input<String> getLastTransitionTime() {
        return this.lastTransitionTime == null ? Input.empty() : this.lastTransitionTime;
    }

    /**
     * A human readable message indicating details about the transition.
     * 
     */
    @InputImport(name="message")
      private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    /**
     * The reason for the condition's last transition.
     * 
     */
    @InputImport(name="reason")
      private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    /**
     * Status of the condition, one of True, False, Unknown.
     * 
     */
    @InputImport(name="status", required=true)
      private final Input<String> status;

    public Input<String> getStatus() {
        return this.status;
    }

    /**
     * Type of DaemonSet condition.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public DaemonSetConditionArgs(
        @Nullable Input<String> lastTransitionTime,
        @Nullable Input<String> message,
        @Nullable Input<String> reason,
        Input<String> status,
        Input<String> type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DaemonSetConditionArgs() {
        this.lastTransitionTime = Input.empty();
        this.message = Input.empty();
        this.reason = Input.empty();
        this.status = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonSetConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> lastTransitionTime;
        private @Nullable Input<String> message;
        private @Nullable Input<String> reason;
        private Input<String> status;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonSetConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setLastTransitionTime(@Nullable Input<String> lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }

        public Builder setLastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = Input.ofNullable(lastTransitionTime);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setReason(@Nullable Input<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = Input.ofNullable(reason);
            return this;
        }

        public Builder setStatus(Input<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public DaemonSetConditionArgs build() {
            return new DaemonSetConditionArgs(lastTransitionTime, message, reason, status, type);
        }
    }
}
