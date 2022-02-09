// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class EndpointRangeDescriptionResponse {
    private final Integer endPort;
    private final Integer startPort;

    @OutputCustomType.Constructor({"endPort","startPort"})
    private EndpointRangeDescriptionResponse(
        Integer endPort,
        Integer startPort) {
        this.endPort = Objects.requireNonNull(endPort);
        this.startPort = Objects.requireNonNull(startPort);
    }

    public Integer getEndPort() {
        return this.endPort;
    }
    public Integer getStartPort() {
        return this.startPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointRangeDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer endPort;
        private Integer startPort;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointRangeDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endPort = defaults.endPort;
    	      this.startPort = defaults.startPort;
        }

        public Builder setEndPort(Integer endPort) {
            this.endPort = Objects.requireNonNull(endPort);
            return this;
        }

        public Builder setStartPort(Integer startPort) {
            this.startPort = Objects.requireNonNull(startPort);
            return this;
        }

        public EndpointRangeDescriptionResponse build() {
            return new EndpointRangeDescriptionResponse(endPort, startPort);
        }
    }
}
