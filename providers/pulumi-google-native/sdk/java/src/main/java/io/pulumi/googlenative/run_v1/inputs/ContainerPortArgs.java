// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ContainerPort represents a network port in a single container.
 * 
 */
public final class ContainerPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerPortArgs Empty = new ContainerPortArgs();

    /**
     * (Optional) Port number the container listens on. This must be a valid port number, 0 < x < 65536.
     * 
     */
    @Import(name="containerPort")
      private final @Nullable Output<Integer> containerPort;

    public Output<Integer> getContainerPort() {
        return this.containerPort == null ? Output.empty() : this.containerPort;
    }

    /**
     * (Optional) If specified, used to specify which protocol to use. Allowed values are "http1" and "h2c".
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * (Optional) Protocol for port. Must be "TCP". Defaults to "TCP".
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol == null ? Output.empty() : this.protocol;
    }

    public ContainerPortArgs(
        @Nullable Output<Integer> containerPort,
        @Nullable Output<String> name,
        @Nullable Output<String> protocol) {
        this.containerPort = containerPort;
        this.name = name;
        this.protocol = protocol;
    }

    private ContainerPortArgs() {
        this.containerPort = Output.empty();
        this.name = Output.empty();
        this.protocol = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> containerPort;
        private @Nullable Output<String> name;
        private @Nullable Output<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder containerPort(@Nullable Output<Integer> containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        public Builder containerPort(@Nullable Integer containerPort) {
            this.containerPort = Output.ofNullable(containerPort);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = Output.ofNullable(protocol);
            return this;
        }        public ContainerPortArgs build() {
            return new ContainerPortArgs(containerPort, name, protocol);
        }
    }
}
