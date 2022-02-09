// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceLimitsResponse {
    private final @Nullable Double cpu;
    private final @Nullable Double memoryInGB;

    @OutputCustomType.Constructor({"cpu","memoryInGB"})
    private ResourceLimitsResponse(
        @Nullable Double cpu,
        @Nullable Double memoryInGB) {
        this.cpu = cpu;
        this.memoryInGB = memoryInGB;
    }

    public Optional<Double> getCpu() {
        return Optional.ofNullable(this.cpu);
    }
    public Optional<Double> getMemoryInGB() {
        return Optional.ofNullable(this.memoryInGB);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceLimitsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double cpu;
        private @Nullable Double memoryInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceLimitsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memoryInGB = defaults.memoryInGB;
        }

        public Builder setCpu(@Nullable Double cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setMemoryInGB(@Nullable Double memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }

        public ResourceLimitsResponse build() {
            return new ResourceLimitsResponse(cpu, memoryInGB);
        }
    }
}
