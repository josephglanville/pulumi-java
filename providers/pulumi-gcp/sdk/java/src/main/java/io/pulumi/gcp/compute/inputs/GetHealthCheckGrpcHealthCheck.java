// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetHealthCheckGrpcHealthCheck extends io.pulumi.resources.InvokeArgs {

    public static final GetHealthCheckGrpcHealthCheck Empty = new GetHealthCheckGrpcHealthCheck();

    @Import(name="grpcServiceName", required=true)
      private final String grpcServiceName;

    public String getGrpcServiceName() {
        return this.grpcServiceName;
    }

    @Import(name="port", required=true)
      private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    @Import(name="portName", required=true)
      private final String portName;

    public String getPortName() {
        return this.portName;
    }

    @Import(name="portSpecification", required=true)
      private final String portSpecification;

    public String getPortSpecification() {
        return this.portSpecification;
    }

    public GetHealthCheckGrpcHealthCheck(
        String grpcServiceName,
        Integer port,
        String portName,
        String portSpecification) {
        this.grpcServiceName = Objects.requireNonNull(grpcServiceName, "expected parameter 'grpcServiceName' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.portName = Objects.requireNonNull(portName, "expected parameter 'portName' to be non-null");
        this.portSpecification = Objects.requireNonNull(portSpecification, "expected parameter 'portSpecification' to be non-null");
    }

    private GetHealthCheckGrpcHealthCheck() {
        this.grpcServiceName = null;
        this.port = null;
        this.portName = null;
        this.portSpecification = null;
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
