// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AKSServiceCreateRequestLivenessProbeRequirementsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AKSServiceCreateRequestLivenessProbeRequirementsArgs Empty = new AKSServiceCreateRequestLivenessProbeRequirementsArgs();

    @InputImport(name="failureThreshold")
    private final @Nullable Input<Integer> failureThreshold;

    public Input<Integer> getFailureThreshold() {
        return this.failureThreshold == null ? Input.empty() : this.failureThreshold;
    }

    @InputImport(name="initialDelaySeconds")
    private final @Nullable Input<Integer> initialDelaySeconds;

    public Input<Integer> getInitialDelaySeconds() {
        return this.initialDelaySeconds == null ? Input.empty() : this.initialDelaySeconds;
    }

    @InputImport(name="periodSeconds")
    private final @Nullable Input<Integer> periodSeconds;

    public Input<Integer> getPeriodSeconds() {
        return this.periodSeconds == null ? Input.empty() : this.periodSeconds;
    }

    @InputImport(name="successThreshold")
    private final @Nullable Input<Integer> successThreshold;

    public Input<Integer> getSuccessThreshold() {
        return this.successThreshold == null ? Input.empty() : this.successThreshold;
    }

    @InputImport(name="timeoutSeconds")
    private final @Nullable Input<Integer> timeoutSeconds;

    public Input<Integer> getTimeoutSeconds() {
        return this.timeoutSeconds == null ? Input.empty() : this.timeoutSeconds;
    }

    public AKSServiceCreateRequestLivenessProbeRequirementsArgs(
        @Nullable Input<Integer> failureThreshold,
        @Nullable Input<Integer> initialDelaySeconds,
        @Nullable Input<Integer> periodSeconds,
        @Nullable Input<Integer> successThreshold,
        @Nullable Input<Integer> timeoutSeconds) {
        this.failureThreshold = failureThreshold;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.timeoutSeconds = timeoutSeconds;
    }

    private AKSServiceCreateRequestLivenessProbeRequirementsArgs() {
        this.failureThreshold = Input.empty();
        this.initialDelaySeconds = Input.empty();
        this.periodSeconds = Input.empty();
        this.successThreshold = Input.empty();
        this.timeoutSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSServiceCreateRequestLivenessProbeRequirementsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> failureThreshold;
        private @Nullable Input<Integer> initialDelaySeconds;
        private @Nullable Input<Integer> periodSeconds;
        private @Nullable Input<Integer> successThreshold;
        private @Nullable Input<Integer> timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSServiceCreateRequestLivenessProbeRequirementsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder setFailureThreshold(@Nullable Input<Integer> failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder setFailureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = Input.ofNullable(failureThreshold);
            return this;
        }

        public Builder setInitialDelaySeconds(@Nullable Input<Integer> initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        public Builder setInitialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            this.initialDelaySeconds = Input.ofNullable(initialDelaySeconds);
            return this;
        }

        public Builder setPeriodSeconds(@Nullable Input<Integer> periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        public Builder setPeriodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = Input.ofNullable(periodSeconds);
            return this;
        }

        public Builder setSuccessThreshold(@Nullable Input<Integer> successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        public Builder setSuccessThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = Input.ofNullable(successThreshold);
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Input<Integer> timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = Input.ofNullable(timeoutSeconds);
            return this;
        }

        public AKSServiceCreateRequestLivenessProbeRequirementsArgs build() {
            return new AKSServiceCreateRequestLivenessProbeRequirementsArgs(failureThreshold, initialDelaySeconds, periodSeconds, successThreshold, timeoutSeconds);
        }
    }
}
