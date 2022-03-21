// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The port exposed on the container instance.
 * 
 */
public final class ContainerPortResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerPortResponse Empty = new ContainerPortResponse();

    /**
     * The port number exposed within the container group.
     * 
     */
    @Import(name="port", required=true)
      private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    /**
     * The protocol associated with the port.
     * 
     */
    @Import(name="protocol")
      private final @Nullable String protocol;

    public Optional<String> getProtocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    public ContainerPortResponse(
        Integer port,
        @Nullable String protocol) {
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.protocol = protocol;
    }

    private ContainerPortResponse() {
        this.port = null;
        this.protocol = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }        public ContainerPortResponse build() {
            return new ContainerPortResponse(port, protocol);
        }
    }
}
