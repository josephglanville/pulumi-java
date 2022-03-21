// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container App container resource requirements.
 * 
 */
public final class ContainerResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerResourcesArgs Empty = new ContainerResourcesArgs();

    /**
     * Required CPU in cores, e.g. 0.5
     * 
     */
    @Import(name="cpu")
      private final @Nullable Output<Double> cpu;

    public Output<Double> getCpu() {
        return this.cpu == null ? Output.empty() : this.cpu;
    }

    /**
     * Required memory, e.g. "250Mb"
     * 
     */
    @Import(name="memory")
      private final @Nullable Output<String> memory;

    public Output<String> getMemory() {
        return this.memory == null ? Output.empty() : this.memory;
    }

    public ContainerResourcesArgs(
        @Nullable Output<Double> cpu,
        @Nullable Output<String> memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    private ContainerResourcesArgs() {
        this.cpu = Output.empty();
        this.memory = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> cpu;
        private @Nullable Output<String> memory;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memory = defaults.memory;
        }

        public Builder cpu(@Nullable Output<Double> cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder cpu(@Nullable Double cpu) {
            this.cpu = Output.ofNullable(cpu);
            return this;
        }
        public Builder memory(@Nullable Output<String> memory) {
            this.memory = memory;
            return this;
        }
        public Builder memory(@Nullable String memory) {
            this.memory = Output.ofNullable(memory);
            return this;
        }        public ContainerResourcesArgs build() {
            return new ContainerResourcesArgs(cpu, memory);
        }
    }
}
