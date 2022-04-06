// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerHealthCheckGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerPortMappingGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecListenerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerGetArgs Empty = new VirtualGatewaySpecListenerGetArgs();

    /**
     * The connection pool information for the listener.
     * 
     */
    @Import(name="connectionPool")
      private final @Nullable Output<VirtualGatewaySpecListenerConnectionPoolGetArgs> connectionPool;

    public Output<VirtualGatewaySpecListenerConnectionPoolGetArgs> getConnectionPool() {
        return this.connectionPool == null ? Output.empty() : this.connectionPool;
    }

    /**
     * The health check information for the listener.
     * 
     */
    @Import(name="healthCheck")
      private final @Nullable Output<VirtualGatewaySpecListenerHealthCheckGetArgs> healthCheck;

    public Output<VirtualGatewaySpecListenerHealthCheckGetArgs> getHealthCheck() {
        return this.healthCheck == null ? Output.empty() : this.healthCheck;
    }

    /**
     * The port mapping information for the listener.
     * 
     */
    @Import(name="portMapping", required=true)
      private final Output<VirtualGatewaySpecListenerPortMappingGetArgs> portMapping;

    public Output<VirtualGatewaySpecListenerPortMappingGetArgs> getPortMapping() {
        return this.portMapping;
    }

    /**
     * The Transport Layer Security (TLS) properties for the listener
     * 
     */
    @Import(name="tls")
      private final @Nullable Output<VirtualGatewaySpecListenerTlsGetArgs> tls;

    public Output<VirtualGatewaySpecListenerTlsGetArgs> getTls() {
        return this.tls == null ? Output.empty() : this.tls;
    }

    public VirtualGatewaySpecListenerGetArgs(
        @Nullable Output<VirtualGatewaySpecListenerConnectionPoolGetArgs> connectionPool,
        @Nullable Output<VirtualGatewaySpecListenerHealthCheckGetArgs> healthCheck,
        Output<VirtualGatewaySpecListenerPortMappingGetArgs> portMapping,
        @Nullable Output<VirtualGatewaySpecListenerTlsGetArgs> tls) {
        this.connectionPool = connectionPool;
        this.healthCheck = healthCheck;
        this.portMapping = Objects.requireNonNull(portMapping, "expected parameter 'portMapping' to be non-null");
        this.tls = tls;
    }

    private VirtualGatewaySpecListenerGetArgs() {
        this.connectionPool = Output.empty();
        this.healthCheck = Output.empty();
        this.portMapping = Output.empty();
        this.tls = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualGatewaySpecListenerConnectionPoolGetArgs> connectionPool;
        private @Nullable Output<VirtualGatewaySpecListenerHealthCheckGetArgs> healthCheck;
        private Output<VirtualGatewaySpecListenerPortMappingGetArgs> portMapping;
        private @Nullable Output<VirtualGatewaySpecListenerTlsGetArgs> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPool = defaults.connectionPool;
    	      this.healthCheck = defaults.healthCheck;
    	      this.portMapping = defaults.portMapping;
    	      this.tls = defaults.tls;
        }

        public Builder connectionPool(@Nullable Output<VirtualGatewaySpecListenerConnectionPoolGetArgs> connectionPool) {
            this.connectionPool = connectionPool;
            return this;
        }
        public Builder connectionPool(@Nullable VirtualGatewaySpecListenerConnectionPoolGetArgs connectionPool) {
            this.connectionPool = Output.ofNullable(connectionPool);
            return this;
        }
        public Builder healthCheck(@Nullable Output<VirtualGatewaySpecListenerHealthCheckGetArgs> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public Builder healthCheck(@Nullable VirtualGatewaySpecListenerHealthCheckGetArgs healthCheck) {
            this.healthCheck = Output.ofNullable(healthCheck);
            return this;
        }
        public Builder portMapping(Output<VirtualGatewaySpecListenerPortMappingGetArgs> portMapping) {
            this.portMapping = Objects.requireNonNull(portMapping);
            return this;
        }
        public Builder portMapping(VirtualGatewaySpecListenerPortMappingGetArgs portMapping) {
            this.portMapping = Output.of(Objects.requireNonNull(portMapping));
            return this;
        }
        public Builder tls(@Nullable Output<VirtualGatewaySpecListenerTlsGetArgs> tls) {
            this.tls = tls;
            return this;
        }
        public Builder tls(@Nullable VirtualGatewaySpecListenerTlsGetArgs tls) {
            this.tls = Output.ofNullable(tls);
            return this;
        }        public VirtualGatewaySpecListenerGetArgs build() {
            return new VirtualGatewaySpecListenerGetArgs(connectionPool, healthCheck, portMapping, tls);
        }
    }
}