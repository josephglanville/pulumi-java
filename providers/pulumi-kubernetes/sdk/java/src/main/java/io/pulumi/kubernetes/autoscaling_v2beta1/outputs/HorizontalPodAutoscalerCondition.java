// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HorizontalPodAutoscalerCondition {
    /**
     * lastTransitionTime is the last time the condition transitioned from one status to another
     * 
     */
    private final @Nullable String lastTransitionTime;
    /**
     * message is a human-readable explanation containing details about the transition
     * 
     */
    private final @Nullable String message;
    /**
     * reason is the reason for the condition's last transition.
     * 
     */
    private final @Nullable String reason;
    /**
     * status is the status of the condition (True, False, Unknown)
     * 
     */
    private final String status;
    /**
     * type describes the current condition
     * 
     */
    private final String type;

    @CustomType.Constructor
    private HorizontalPodAutoscalerCondition(
        @CustomType.Parameter("lastTransitionTime") @Nullable String lastTransitionTime,
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("reason") @Nullable String reason,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("type") String type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = type;
    }

    /**
     * lastTransitionTime is the last time the condition transitioned from one status to another
     * 
    */
    public Optional<String> getLastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }
    /**
     * message is a human-readable explanation containing details about the transition
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * reason is the reason for the condition's last transition.
     * 
    */
    public Optional<String> getReason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * status is the status of the condition (True, False, Unknown)
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * type describes the current condition
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastTransitionTime;
        private @Nullable String message;
        private @Nullable String reason;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder lastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public HorizontalPodAutoscalerCondition build() {
            return new HorizontalPodAutoscalerCondition(lastTransitionTime, message, reason, status, type);
        }
    }
}
