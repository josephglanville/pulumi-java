// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NodeCondition contains condition information for a node.
 * 
 */
public final class NodeConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeConditionArgs Empty = new NodeConditionArgs();

    /**
     * Last time we got an update on a given condition.
     * 
     */
    @InputImport(name="lastHeartbeatTime")
      private final @Nullable Output<String> lastHeartbeatTime;

    public Output<String> getLastHeartbeatTime() {
        return this.lastHeartbeatTime == null ? Output.empty() : this.lastHeartbeatTime;
    }

    /**
     * Last time the condition transit from one status to another.
     * 
     */
    @InputImport(name="lastTransitionTime")
      private final @Nullable Output<String> lastTransitionTime;

    public Output<String> getLastTransitionTime() {
        return this.lastTransitionTime == null ? Output.empty() : this.lastTransitionTime;
    }

    /**
     * Human readable message indicating details about last transition.
     * 
     */
    @InputImport(name="message")
      private final @Nullable Output<String> message;

    public Output<String> getMessage() {
        return this.message == null ? Output.empty() : this.message;
    }

    /**
     * (brief) reason for the condition's last transition.
     * 
     */
    @InputImport(name="reason")
      private final @Nullable Output<String> reason;

    public Output<String> getReason() {
        return this.reason == null ? Output.empty() : this.reason;
    }

    /**
     * Status of the condition, one of True, False, Unknown.
     * 
     */
    @InputImport(name="status", required=true)
      private final Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }

    /**
     * Type of node condition.
     * 
     * Possible enum values:
     *  - `"DiskPressure"` means the kubelet is under pressure due to insufficient available disk.
     *  - `"MemoryPressure"` means the kubelet is under pressure due to insufficient available memory.
     *  - `"NetworkUnavailable"` means that network for the node is not correctly configured.
     *  - `"PIDPressure"` means the kubelet is under pressure due to insufficient available PID.
     *  - `"Ready"` means kubelet is healthy and ready to accept pods.
     * 
     */
    @InputImport(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public NodeConditionArgs(
        @Nullable Output<String> lastHeartbeatTime,
        @Nullable Output<String> lastTransitionTime,
        @Nullable Output<String> message,
        @Nullable Output<String> reason,
        Output<String> status,
        Output<String> type) {
        this.lastHeartbeatTime = lastHeartbeatTime;
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private NodeConditionArgs() {
        this.lastHeartbeatTime = Output.empty();
        this.lastTransitionTime = Output.empty();
        this.message = Output.empty();
        this.reason = Output.empty();
        this.status = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> lastHeartbeatTime;
        private @Nullable Output<String> lastTransitionTime;
        private @Nullable Output<String> message;
        private @Nullable Output<String> reason;
        private Output<String> status;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastHeartbeatTime = defaults.lastHeartbeatTime;
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder lastHeartbeatTime(@Nullable Output<String> lastHeartbeatTime) {
            this.lastHeartbeatTime = lastHeartbeatTime;
            return this;
        }

        public Builder lastHeartbeatTime(@Nullable String lastHeartbeatTime) {
            this.lastHeartbeatTime = Output.ofNullable(lastHeartbeatTime);
            return this;
        }

        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }

        public Builder lastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = Output.ofNullable(lastTransitionTime);
            return this;
        }

        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }

        public Builder message(@Nullable String message) {
            this.message = Output.ofNullable(message);
            return this;
        }

        public Builder reason(@Nullable Output<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder reason(@Nullable String reason) {
            this.reason = Output.ofNullable(reason);
            return this;
        }

        public Builder status(Output<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder status(String status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public NodeConditionArgs build() {
            return new NodeConditionArgs(lastHeartbeatTime, lastTransitionTime, message, reason, status, type);
        }
    }
}
