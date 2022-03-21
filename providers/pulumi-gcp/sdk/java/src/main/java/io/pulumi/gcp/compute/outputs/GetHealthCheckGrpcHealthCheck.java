// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHealthCheckGrpcHealthCheck {
    private final String grpcServiceName;
    private final Integer port;
    private final String portName;
    private final String portSpecification;

    @CustomType.Constructor
    private GetHealthCheckGrpcHealthCheck(
        @CustomType.Parameter("grpcServiceName") String grpcServiceName,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("portName") String portName,
        @CustomType.Parameter("portSpecification") String portSpecification) {
        this.grpcServiceName = grpcServiceName;
        this.port = port;
        this.portName = portName;
        this.portSpecification = portSpecification;
    }

    public String getGrpcServiceName() {
        return this.grpcServiceName;
    }
    public Integer getPort() {
        return this.port;
    }
    public String getPortName() {
        return this.portName;
    }
    public String getPortSpecification() {
        return this.portSpecification;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthCheckGrpcHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String grpcServiceName;
        private Integer port;
        private String portName;
        private String portSpecification;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHealthCheckGrpcHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcServiceName = defaults.grpcServiceName;
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
        }

        public Builder grpcServiceName(String grpcServiceName) {
            this.grpcServiceName = Objects.requireNonNull(grpcServiceName);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder portName(String portName) {
            this.portName = Objects.requireNonNull(portName);
            return this;
        }
        public Builder portSpecification(String portSpecification) {
            this.portSpecification = Objects.requireNonNull(portSpecification);
            return this;
        }        public GetHealthCheckGrpcHealthCheck build() {
            return new GetHealthCheckGrpcHealthCheck(grpcServiceName, port, portName, portSpecification);
        }
    }
}
