// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This type describes the resource limits for a given container. It describes the most amount of resources a container is allowed to use before being restarted.
 * 
 */
public final class ResourceLimitsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceLimitsArgs Empty = new ResourceLimitsArgs();

    /**
     * CPU limits in cores. At present, only full cores are supported.
     * 
     */
    @Import(name="cpu")
      private final @Nullable Output<Double> cpu;

    public Output<Double> getCpu() {
        return this.cpu == null ? Output.empty() : this.cpu;
    }

    /**
     * The memory limit in GB.
     * 
     */
    @Import(name="memoryInGB")
      private final @Nullable Output<Double> memoryInGB;

    public Output<Double> getMemoryInGB() {
        return this.memoryInGB == null ? Output.empty() : this.memoryInGB;
    }

    public ResourceLimitsArgs(
        @Nullable Output<Double> cpu,
        @Nullable Output<Double> memoryInGB) {
        this.cpu = cpu;
        this.memoryInGB = memoryInGB;
    }

    private ResourceLimitsArgs() {
        this.cpu = Output.empty();
        this.memoryInGB = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> cpu;
        private @Nullable Output<Double> memoryInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceLimitsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memoryInGB = defaults.memoryInGB;
        }

        public Builder cpu(@Nullable Output<Double> cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder cpu(@Nullable Double cpu) {
            this.cpu = Output.ofNullable(cpu);
            return this;
        }
        public Builder memoryInGB(@Nullable Output<Double> memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }
        public Builder memoryInGB(@Nullable Double memoryInGB) {
            this.memoryInGB = Output.ofNullable(memoryInGB);
            return this;
        }        public ResourceLimitsArgs build() {
            return new ResourceLimitsArgs(cpu, memoryInGB);
        }
    }
}
