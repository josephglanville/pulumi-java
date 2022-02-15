// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class EndpointGroupPortOverride {
    private final Integer endpointPort;
    private final Integer listenerPort;

    @OutputCustomType.Constructor({"endpointPort","listenerPort"})
    private EndpointGroupPortOverride(
        Integer endpointPort,
        Integer listenerPort) {
        this.endpointPort = Objects.requireNonNull(endpointPort);
        this.listenerPort = Objects.requireNonNull(listenerPort);
    }

    public Integer getEndpointPort() {
        return this.endpointPort;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGroupPortOverride defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer endpointPort;
        private Integer listenerPort;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointGroupPortOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointPort = defaults.endpointPort;
    	      this.listenerPort = defaults.listenerPort;
        }

        public Builder setEndpointPort(Integer endpointPort) {
            this.endpointPort = Objects.requireNonNull(endpointPort);
            return this;
        }

        public Builder setListenerPort(Integer listenerPort) {
            this.listenerPort = Objects.requireNonNull(listenerPort);
            return this;
        }

        public EndpointGroupPortOverride build() {
            return new EndpointGroupPortOverride(endpointPort, listenerPort);
        }
    }
}