// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1__ContainerPortResponse {
    /**
     * Number of the port to expose on the container. This must be a valid port number: 0 < PORT_NUMBER < 65536.
     * 
     */
    private final Integer containerPort;

    @CustomType.Constructor
    private GoogleCloudMlV1__ContainerPortResponse(@CustomType.Parameter("containerPort") Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * Number of the port to expose on the container. This must be a valid port number: 0 < PORT_NUMBER < 65536.
     * 
    */
    public Integer getContainerPort() {
        return this.containerPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__ContainerPortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer containerPort;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__ContainerPortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
        }

        public Builder containerPort(Integer containerPort) {
            this.containerPort = Objects.requireNonNull(containerPort);
            return this;
        }        public GoogleCloudMlV1__ContainerPortResponse build() {
            return new GoogleCloudMlV1__ContainerPortResponse(containerPort);
        }
    }
}
