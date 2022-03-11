// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PodCondition contains details for the current condition of this pod.
 * 
 */
public final class PodConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodConditionArgs Empty = new PodConditionArgs();

    /**
     * Last time we probed the condition.
     * 
     */
    @InputImport(name="lastProbeTime")
      private final @Nullable Output<String> lastProbeTime;

    public Output<String> getLastProbeTime() {
        return this.lastProbeTime == null ? Output.empty() : this.lastProbeTime;
    }

    /**
     * Last time the condition transitioned from one status to another.
     * 
     */
    @InputImport(name="lastTransitionTime")
      private final @Nullable Output<String> lastTransitionTime;

    public Output<String> getLastTransitionTime() {
        return this.lastTransitionTime == null ? Output.empty() : this.lastTransitionTime;
    }

    /**
     * Human-readable message indicating details about last transition.
     * 
     */
    @InputImport(name="message")
      private final @Nullable Output<String> message;

    public Output<String> getMessage() {
        return this.message == null ? Output.empty() : this.message;
    }

    /**
     * Unique, one-word, CamelCase reason for the condition's last transition.
     * 
     */
    @InputImport(name="reason")
      private final @Nullable Output<String> reason;

    public Output<String> getReason() {
        return this.reason == null ? Output.empty() : this.reason;
    }

    /**
     * Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * 
     */
    @InputImport(name="status", required=true)
      private final Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }

    /**
     * Type is the type of the condition. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * 
     * Possible enum values:
     *  - `"ContainersReady"` indicates whether all containers in the pod are ready.
     *  - `"Initialized"` means that all init containers in the pod have started successfully.
     *  - `"PodScheduled"` represents status of the scheduling process for this pod.
     *  - `"Ready"` means the pod is able to service requests and should be added to the load balancing pools of all matching services.
     * 
     */
    @InputImport(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public PodConditionArgs(
        @Nullable Output<String> lastProbeTime,
        @Nullable Output<String> lastTransitionTime,
        @Nullable Output<String> message,
        @Nullable Output<String> reason,
        Output<String> status,
        Output<String> type) {
        this.lastProbeTime = lastProbeTime;
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PodConditionArgs() {
        this.lastProbeTime = Output.empty();
        this.lastTransitionTime = Output.empty();
        this.message = Output.empty();
        this.reason = Output.empty();
        this.status = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> lastProbeTime;
        private @Nullable Output<String> lastTransitionTime;
        private @Nullable Output<String> message;
        private @Nullable Output<String> reason;
        private Output<String> status;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PodConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastProbeTime = defaults.lastProbeTime;
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder lastProbeTime(@Nullable Output<String> lastProbeTime) {
            this.lastProbeTime = lastProbeTime;
            return this;
        }

        public Builder lastProbeTime(@Nullable String lastProbeTime) {
            this.lastProbeTime = Output.ofNullable(lastProbeTime);
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
        public PodConditionArgs build() {
            return new PodConditionArgs(lastProbeTime, lastTransitionTime, message, reason, status, type);
        }
    }
}
