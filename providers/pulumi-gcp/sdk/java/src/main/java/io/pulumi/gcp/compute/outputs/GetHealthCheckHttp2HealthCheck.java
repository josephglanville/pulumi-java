// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHealthCheckHttp2HealthCheck {
    private final String host;
    private final Integer port;
    private final String portName;
    private final String portSpecification;
    private final String proxyHeader;
    private final String requestPath;
    private final String response;

    @CustomType.Constructor
    private GetHealthCheckHttp2HealthCheck(
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("portName") String portName,
        @CustomType.Parameter("portSpecification") String portSpecification,
        @CustomType.Parameter("proxyHeader") String proxyHeader,
        @CustomType.Parameter("requestPath") String requestPath,
        @CustomType.Parameter("response") String response) {
        this.host = host;
        this.port = port;
        this.portName = portName;
        this.portSpecification = portSpecification;
        this.proxyHeader = proxyHeader;
        this.requestPath = requestPath;
        this.response = response;
    }

    public String getHost() {
        return this.host;
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
    public String getProxyHeader() {
        return this.proxyHeader;
    }
    public String getRequestPath() {
        return this.requestPath;
    }
    public String getResponse() {
        return this.response;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthCheckHttp2HealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private Integer port;
        private String portName;
        private String portSpecification;
        private String proxyHeader;
        private String requestPath;
        private String response;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHealthCheckHttp2HealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.requestPath = defaults.requestPath;
    	      this.response = defaults.response;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
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
        }
        public Builder proxyHeader(String proxyHeader) {
            this.proxyHeader = Objects.requireNonNull(proxyHeader);
            return this;
        }
        public Builder requestPath(String requestPath) {
            this.requestPath = Objects.requireNonNull(requestPath);
            return this;
        }
        public Builder response(String response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }        public GetHealthCheckHttp2HealthCheck build() {
            return new GetHealthCheckHttp2HealthCheck(host, port, portName, portSpecification, proxyHeader, requestPath, response);
        }
    }
}
