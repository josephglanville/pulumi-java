// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerOutlierDetectionBaseEjectionDurationGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class VirtualNodeSpecListenerOutlierDetectionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerOutlierDetectionGetArgs Empty = new VirtualNodeSpecListenerOutlierDetectionGetArgs();

    /**
     * The base amount of time for which a host is ejected.
     * 
     */
    @Import(name="baseEjectionDuration", required=true)
      private final Output<VirtualNodeSpecListenerOutlierDetectionBaseEjectionDurationGetArgs> baseEjectionDuration;

    public Output<VirtualNodeSpecListenerOutlierDetectionBaseEjectionDurationGetArgs> getBaseEjectionDuration() {
        return this.baseEjectionDuration;
    }

    /**
     * The time interval between ejection sweep analysis.
     * 
     */
    @Import(name="interval", required=true)
      private final Output<VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs> interval;

    public Output<VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs> getInterval() {
        return this.interval;
    }

    /**
     * Maximum percentage of hosts in load balancing pool for upstream service that can be ejected. Will eject at least one host regardless of the value.
     * Minimum value of `0`. Maximum value of `100`.
     * 
     */
    @Import(name="maxEjectionPercent", required=true)
      private final Output<Integer> maxEjectionPercent;

    public Output<Integer> getMaxEjectionPercent() {
        return this.maxEjectionPercent;
    }

    /**
     * Number of consecutive `5xx` errors required for ejection. Minimum value of `1`.
     * 
     */
    @Import(name="maxServerErrors", required=true)
      private final Output<Integer> maxServerErrors;

    public Output<Integer> getMaxServerErrors() {
        return this.maxServerErrors;
    }

    public VirtualNodeSpecListenerOutlierDetectionGetArgs(
        Output<VirtualNodeSpecListenerOutlierDetectionBaseEjectionDurationGetArgs> baseEjectionDuration,
        Output<VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs> interval,
        Output<Integer> maxEjectionPercent,
        Output<Integer> maxServerErrors) {
        this.baseEjectionDuration = Objects.requireNonNull(baseEjectionDuration, "expected parameter 'baseEjectionDuration' to be non-null");
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
        this.maxEjectionPercent = Objects.requireNonNull(maxEjectionPercent, "expected parameter 'maxEjectionPercent' to be non-null");
        this.maxServerErrors = Objects.requireNonNull(maxServerErrors, "expected parameter 'maxServerErrors' to be non-null");
    }

    private VirtualNodeSpecListenerOutlierDetectionGetArgs() {
        this.baseEjectionDuration = Output.empty();
        this.interval = Output.empty();
        this.maxEjectionPercent = Output.empty();
        this.maxServerErrors = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerOutlierDetectionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<VirtualNodeSpecListenerOutlierDetectionBaseEjectionDurationGetArgs> baseEjectionDuration;
        private Output<VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs> interval;
        private Output<Integer> maxEjectionPercent;
        private Output<Integer> maxServerErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerOutlierDetectionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseEjectionDuration = defaults.baseEjectionDuration;
    	      this.interval = defaults.interval;
    	      this.maxEjectionPercent = defaults.maxEjectionPercent;
    	      this.maxServerErrors = defaults.maxServerErrors;
        }

        public Builder baseEjectionDuration(Output<VirtualNodeSpecListenerOutlierDetectionBaseEjectionDurationGetArgs> baseEjectionDuration) {
            this.baseEjectionDuration = Objects.requireNonNull(baseEjectionDuration);
            return this;
        }
        public Builder baseEjectionDuration(VirtualNodeSpecListenerOutlierDetectionBaseEjectionDurationGetArgs baseEjectionDuration) {
            this.baseEjectionDuration = Output.of(Objects.requireNonNull(baseEjectionDuration));
            return this;
        }
        public Builder interval(Output<VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs> interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder interval(VirtualNodeSpecListenerOutlierDetectionIntervalGetArgs interval) {
            this.interval = Output.of(Objects.requireNonNull(interval));
            return this;
        }
        public Builder maxEjectionPercent(Output<Integer> maxEjectionPercent) {
            this.maxEjectionPercent = Objects.requireNonNull(maxEjectionPercent);
            return this;
        }
        public Builder maxEjectionPercent(Integer maxEjectionPercent) {
            this.maxEjectionPercent = Output.of(Objects.requireNonNull(maxEjectionPercent));
            return this;
        }
        public Builder maxServerErrors(Output<Integer> maxServerErrors) {
            this.maxServerErrors = Objects.requireNonNull(maxServerErrors);
            return this;
        }
        public Builder maxServerErrors(Integer maxServerErrors) {
            this.maxServerErrors = Output.of(Objects.requireNonNull(maxServerErrors));
            return this;
        }        public VirtualNodeSpecListenerOutlierDetectionGetArgs build() {
            return new VirtualNodeSpecListenerOutlierDetectionGetArgs(baseEjectionDuration, interval, maxEjectionPercent, maxServerErrors);
        }
    }
}