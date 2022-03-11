// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerPortInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerPortInfoArgs Empty = new ContainerPortInfoArgs();

    @InputImport(name="port")
      private final @Nullable Output<String> port;

    public Output<String> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    @InputImport(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol == null ? Output.empty() : this.protocol;
    }

    public ContainerPortInfoArgs(
        @Nullable Output<String> port,
        @Nullable Output<String> protocol) {
        this.port = port;
        this.protocol = protocol;
    }

    private ContainerPortInfoArgs() {
        this.port = Output.empty();
        this.protocol = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPortInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> port;
        private @Nullable Output<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPortInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder port(@Nullable Output<String> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable String port) {
            this.port = Output.ofNullable(port);
            return this;
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = Output.ofNullable(protocol);
            return this;
        }
        public ContainerPortInfoArgs build() {
            return new ContainerPortInfoArgs(port, protocol);
        }
    }
}
