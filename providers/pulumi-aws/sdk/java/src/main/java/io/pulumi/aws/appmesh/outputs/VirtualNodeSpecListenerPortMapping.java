// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualNodeSpecListenerPortMapping {
    /**
     * The port used for the port mapping.
     * 
     */
    private final Integer port;
    /**
     * The protocol used for the port mapping. Valid values are `http`, `http2`, `tcp` and `grpc`.
     * 
     */
    private final String protocol;

    @OutputCustomType.Constructor
    private VirtualNodeSpecListenerPortMapping(
        @OutputCustomType.Parameter("port") Integer port,
        @OutputCustomType.Parameter("protocol") String protocol) {
        this.port = port;
        this.protocol = protocol;
    }

    /**
     * The port used for the port mapping.
     * 
    */
    public Integer getPort() {
        return this.port;
    }
    /**
     * The protocol used for the port mapping. Valid values are `http`, `http2`, `tcp` and `grpc`.
     * 
    */
    public String getProtocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerPortMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerPortMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public VirtualNodeSpecListenerPortMapping build() {
            return new VirtualNodeSpecListenerPortMapping(port, protocol);
        }
    }
}
