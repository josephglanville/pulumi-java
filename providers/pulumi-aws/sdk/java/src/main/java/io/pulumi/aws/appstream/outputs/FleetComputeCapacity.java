// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FleetComputeCapacity {
    /**
     * Number of currently available instances that can be used to stream sessions.
     * 
     */
    private final @Nullable Integer available;
    /**
     * Desired number of streaming instances.
     * 
     */
    private final Integer desiredInstances;
    /**
     * Number of instances in use for streaming.
     * 
     */
    private final @Nullable Integer inUse;
    /**
     * Total number of simultaneous streaming instances that are running.
     * 
     */
    private final @Nullable Integer running;

    @CustomType.Constructor
    private FleetComputeCapacity(
        @CustomType.Parameter("available") @Nullable Integer available,
        @CustomType.Parameter("desiredInstances") Integer desiredInstances,
        @CustomType.Parameter("inUse") @Nullable Integer inUse,
        @CustomType.Parameter("running") @Nullable Integer running) {
        this.available = available;
        this.desiredInstances = desiredInstances;
        this.inUse = inUse;
        this.running = running;
    }

    /**
     * Number of currently available instances that can be used to stream sessions.
     * 
    */
    public Optional<Integer> getAvailable() {
        return Optional.ofNullable(this.available);
    }
    /**
     * Desired number of streaming instances.
     * 
    */
    public Integer getDesiredInstances() {
        return this.desiredInstances;
    }
    /**
     * Number of instances in use for streaming.
     * 
    */
    public Optional<Integer> getInUse() {
        return Optional.ofNullable(this.inUse);
    }
    /**
     * Total number of simultaneous streaming instances that are running.
     * 
    */
    public Optional<Integer> getRunning() {
        return Optional.ofNullable(this.running);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetComputeCapacity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer available;
        private Integer desiredInstances;
        private @Nullable Integer inUse;
        private @Nullable Integer running;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetComputeCapacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.available = defaults.available;
    	      this.desiredInstances = defaults.desiredInstances;
    	      this.inUse = defaults.inUse;
    	      this.running = defaults.running;
        }

        public Builder available(@Nullable Integer available) {
            this.available = available;
            return this;
        }
        public Builder desiredInstances(Integer desiredInstances) {
            this.desiredInstances = Objects.requireNonNull(desiredInstances);
            return this;
        }
        public Builder inUse(@Nullable Integer inUse) {
            this.inUse = inUse;
            return this;
        }
        public Builder running(@Nullable Integer running) {
            this.running = running;
            return this;
        }        public FleetComputeCapacity build() {
            return new FleetComputeCapacity(available, desiredInstances, inUse, running);
        }
    }
}
