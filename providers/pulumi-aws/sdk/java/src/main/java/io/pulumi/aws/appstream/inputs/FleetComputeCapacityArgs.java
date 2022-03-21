// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetComputeCapacityArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetComputeCapacityArgs Empty = new FleetComputeCapacityArgs();

    /**
     * Number of currently available instances that can be used to stream sessions.
     * 
     */
    @Import(name="available")
      private final @Nullable Output<Integer> available;

    public Output<Integer> getAvailable() {
        return this.available == null ? Output.empty() : this.available;
    }

    /**
     * Desired number of streaming instances.
     * 
     */
    @Import(name="desiredInstances", required=true)
      private final Output<Integer> desiredInstances;

    public Output<Integer> getDesiredInstances() {
        return this.desiredInstances;
    }

    /**
     * Number of instances in use for streaming.
     * 
     */
    @Import(name="inUse")
      private final @Nullable Output<Integer> inUse;

    public Output<Integer> getInUse() {
        return this.inUse == null ? Output.empty() : this.inUse;
    }

    /**
     * Total number of simultaneous streaming instances that are running.
     * 
     */
    @Import(name="running")
      private final @Nullable Output<Integer> running;

    public Output<Integer> getRunning() {
        return this.running == null ? Output.empty() : this.running;
    }

    public FleetComputeCapacityArgs(
        @Nullable Output<Integer> available,
        Output<Integer> desiredInstances,
        @Nullable Output<Integer> inUse,
        @Nullable Output<Integer> running) {
        this.available = available;
        this.desiredInstances = Objects.requireNonNull(desiredInstances, "expected parameter 'desiredInstances' to be non-null");
        this.inUse = inUse;
        this.running = running;
    }

    private FleetComputeCapacityArgs() {
        this.available = Output.empty();
        this.desiredInstances = Output.empty();
        this.inUse = Output.empty();
        this.running = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetComputeCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> available;
        private Output<Integer> desiredInstances;
        private @Nullable Output<Integer> inUse;
        private @Nullable Output<Integer> running;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetComputeCapacityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.available = defaults.available;
    	      this.desiredInstances = defaults.desiredInstances;
    	      this.inUse = defaults.inUse;
    	      this.running = defaults.running;
        }

        public Builder available(@Nullable Output<Integer> available) {
            this.available = available;
            return this;
        }
        public Builder available(@Nullable Integer available) {
            this.available = Output.ofNullable(available);
            return this;
        }
        public Builder desiredInstances(Output<Integer> desiredInstances) {
            this.desiredInstances = Objects.requireNonNull(desiredInstances);
            return this;
        }
        public Builder desiredInstances(Integer desiredInstances) {
            this.desiredInstances = Output.of(Objects.requireNonNull(desiredInstances));
            return this;
        }
        public Builder inUse(@Nullable Output<Integer> inUse) {
            this.inUse = inUse;
            return this;
        }
        public Builder inUse(@Nullable Integer inUse) {
            this.inUse = Output.ofNullable(inUse);
            return this;
        }
        public Builder running(@Nullable Output<Integer> running) {
            this.running = running;
            return this;
        }
        public Builder running(@Nullable Integer running) {
            this.running = Output.ofNullable(running);
            return this;
        }        public FleetComputeCapacityArgs build() {
            return new FleetComputeCapacityArgs(available, desiredInstances, inUse, running);
        }
    }
}
