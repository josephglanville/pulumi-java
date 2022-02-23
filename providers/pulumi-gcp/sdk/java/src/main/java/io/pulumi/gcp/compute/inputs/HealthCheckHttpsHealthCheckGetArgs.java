// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HealthCheckHttpsHealthCheckGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthCheckHttpsHealthCheckGetArgs Empty = new HealthCheckHttpsHealthCheckGetArgs();

    /**
     * The value of the host header in the HTTP2 health check request.
     * If left empty (default value), the public IP on behalf of which this health
     * check is performed will be used.
     * 
     */
    @InputImport(name="host")
      private final @Nullable Input<String> host;

    public Input<String> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    /**
     * The port number for the health check request.
     * Must be specified if portName and portSpecification are not set
     * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and
     * port_name are defined, port takes precedence.
     * 
     */
    @InputImport(name="portName")
      private final @Nullable Input<String> portName;

    public Input<String> getPortName() {
        return this.portName == null ? Input.empty() : this.portName;
    }

    /**
     * Specifies how port is selected for health checking, can be one of the
     * following values:
     * * `USE_FIXED_PORT`: The port number in `port` is used for health checking.
     * * `USE_NAMED_PORT`: The `portName` is used for health checking.
     * * `USE_SERVING_PORT`: For NetworkEndpointGroup, the port specified for each
     *   network endpoint is used for health checking. For other backends, the
     *   port or named port specified in the Backend Service is used for health
     *   checking.
     *   If not specified, gRPC health check follows behavior specified in `port` and
     *   `portName` fields.
     *   Possible values are `USE_FIXED_PORT`, `USE_NAMED_PORT`, and `USE_SERVING_PORT`.
     * 
     */
    @InputImport(name="portSpecification")
      private final @Nullable Input<String> portSpecification;

    public Input<String> getPortSpecification() {
        return this.portSpecification == null ? Input.empty() : this.portSpecification;
    }

    /**
     * Specifies the type of proxy header to append before sending data to the
     * backend.
     * Default value is `NONE`.
     * Possible values are `NONE` and `PROXY_V1`.
     * 
     */
    @InputImport(name="proxyHeader")
      private final @Nullable Input<String> proxyHeader;

    public Input<String> getProxyHeader() {
        return this.proxyHeader == null ? Input.empty() : this.proxyHeader;
    }

    /**
     * The request path of the HTTP2 health check request.
     * The default value is /.
     * 
     */
    @InputImport(name="requestPath")
      private final @Nullable Input<String> requestPath;

    public Input<String> getRequestPath() {
        return this.requestPath == null ? Input.empty() : this.requestPath;
    }

    /**
     * The bytes to match against the beginning of the response data. If left empty
     * (the default value), any response will indicate health. The response data
     * can only be ASCII.
     * 
     */
    @InputImport(name="response")
      private final @Nullable Input<String> response;

    public Input<String> getResponse() {
        return this.response == null ? Input.empty() : this.response;
    }

    public HealthCheckHttpsHealthCheckGetArgs(
        @Nullable Input<String> host,
        @Nullable Input<Integer> port,
        @Nullable Input<String> portName,
        @Nullable Input<String> portSpecification,
        @Nullable Input<String> proxyHeader,
        @Nullable Input<String> requestPath,
        @Nullable Input<String> response) {
        this.host = host;
        this.port = port;
        this.portName = portName;
        this.portSpecification = portSpecification;
        this.proxyHeader = proxyHeader;
        this.requestPath = requestPath;
        this.response = response;
    }

    private HealthCheckHttpsHealthCheckGetArgs() {
        this.host = Input.empty();
        this.port = Input.empty();
        this.portName = Input.empty();
        this.portSpecification = Input.empty();
        this.proxyHeader = Input.empty();
        this.requestPath = Input.empty();
        this.response = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckHttpsHealthCheckGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> host;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> portName;
        private @Nullable Input<String> portSpecification;
        private @Nullable Input<String> proxyHeader;
        private @Nullable Input<String> requestPath;
        private @Nullable Input<String> response;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckHttpsHealthCheckGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.requestPath = defaults.requestPath;
    	      this.response = defaults.response;
        }

        public Builder setHost(@Nullable Input<String> host) {
            this.host = host;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setPortName(@Nullable Input<String> portName) {
            this.portName = portName;
            return this;
        }

        public Builder setPortName(@Nullable String portName) {
            this.portName = Input.ofNullable(portName);
            return this;
        }

        public Builder setPortSpecification(@Nullable Input<String> portSpecification) {
            this.portSpecification = portSpecification;
            return this;
        }

        public Builder setPortSpecification(@Nullable String portSpecification) {
            this.portSpecification = Input.ofNullable(portSpecification);
            return this;
        }

        public Builder setProxyHeader(@Nullable Input<String> proxyHeader) {
            this.proxyHeader = proxyHeader;
            return this;
        }

        public Builder setProxyHeader(@Nullable String proxyHeader) {
            this.proxyHeader = Input.ofNullable(proxyHeader);
            return this;
        }

        public Builder setRequestPath(@Nullable Input<String> requestPath) {
            this.requestPath = requestPath;
            return this;
        }

        public Builder setRequestPath(@Nullable String requestPath) {
            this.requestPath = Input.ofNullable(requestPath);
            return this;
        }

        public Builder setResponse(@Nullable Input<String> response) {
            this.response = response;
            return this;
        }

        public Builder setResponse(@Nullable String response) {
            this.response = Input.ofNullable(response);
            return this;
        }
        public HealthCheckHttpsHealthCheckGetArgs build() {
            return new HealthCheckHttpsHealthCheckGetArgs(host, port, portName, portSpecification, proxyHeader, requestPath, response);
        }
    }
}
