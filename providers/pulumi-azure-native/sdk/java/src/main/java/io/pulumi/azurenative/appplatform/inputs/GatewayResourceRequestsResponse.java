// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Resource request payload of Spring Cloud Gateway.
 * 
 */
public final class GatewayResourceRequestsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GatewayResourceRequestsResponse Empty = new GatewayResourceRequestsResponse();

    /**
     * Cpu allocated to each Spring Cloud Gateway instance.
     * 
     */
    @InputImport(name="cpu")
      private final @Nullable String cpu;

    public Optional<String> getCpu() {
        return this.cpu == null ? Optional.empty() : Optional.ofNullable(this.cpu);
    }

    /**
     * Memory allocated to each Spring Cloud Gateway instance.
     * 
     */
    @InputImport(name="memory")
      private final @Nullable String memory;

    public Optional<String> getMemory() {
        return this.memory == null ? Optional.empty() : Optional.ofNullable(this.memory);
    }

    public GatewayResourceRequestsResponse(
        @Nullable String cpu,
        @Nullable String memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    private GatewayResourceRequestsResponse() {
        this.cpu = null;
        this.memory = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayResourceRequestsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cpu;
        private @Nullable String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayResourceRequestsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memory = defaults.memory;
        }

        public Builder setCpu(@Nullable String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setMemory(@Nullable String memory) {
            this.memory = memory;
            return this;
        }
        public GatewayResourceRequestsResponse build() {
            return new GatewayResourceRequestsResponse(cpu, memory);
        }
    }
}
