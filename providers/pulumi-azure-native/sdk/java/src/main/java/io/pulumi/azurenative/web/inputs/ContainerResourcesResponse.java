// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App container resource requirements.
 * 
 */
public final class ContainerResourcesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerResourcesResponse Empty = new ContainerResourcesResponse();

    /**
     * Required CPU in cores, e.g. 0.5
     * 
     */
    @Import(name="cpu")
      private final @Nullable Double cpu;

    public Optional<Double> getCpu() {
        return this.cpu == null ? Optional.empty() : Optional.ofNullable(this.cpu);
    }

    /**
     * Required memory, e.g. "250Mb"
     * 
     */
    @Import(name="memory")
      private final @Nullable String memory;

    public Optional<String> getMemory() {
        return this.memory == null ? Optional.empty() : Optional.ofNullable(this.memory);
    }

    public ContainerResourcesResponse(
        @Nullable Double cpu,
        @Nullable String memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    private ContainerResourcesResponse() {
        this.cpu = null;
        this.memory = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourcesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double cpu;
        private @Nullable String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourcesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memory = defaults.memory;
        }

        public Builder cpu(@Nullable Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder memory(@Nullable String memory) {
            this.memory = memory;
            return this;
        }        public ContainerResourcesResponse build() {
            return new ContainerResourcesResponse(cpu, memory);
        }
    }
}
