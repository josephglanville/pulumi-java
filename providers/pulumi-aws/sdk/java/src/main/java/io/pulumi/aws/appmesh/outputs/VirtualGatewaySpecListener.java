// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerConnectionPool;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerHealthCheck;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerPortMapping;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTls;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualGatewaySpecListener {
    /**
     * The connection pool information for the listener.
     * 
     */
    private final @Nullable VirtualGatewaySpecListenerConnectionPool connectionPool;
    /**
     * The health check information for the listener.
     * 
     */
    private final @Nullable VirtualGatewaySpecListenerHealthCheck healthCheck;
    /**
     * The port mapping information for the listener.
     * 
     */
    private final VirtualGatewaySpecListenerPortMapping portMapping;
    /**
     * The Transport Layer Security (TLS) properties for the listener
     * 
     */
    private final @Nullable VirtualGatewaySpecListenerTls tls;

    @OutputCustomType.Constructor
    private VirtualGatewaySpecListener(
        @OutputCustomType.Parameter("connectionPool") @Nullable VirtualGatewaySpecListenerConnectionPool connectionPool,
        @OutputCustomType.Parameter("healthCheck") @Nullable VirtualGatewaySpecListenerHealthCheck healthCheck,
        @OutputCustomType.Parameter("portMapping") VirtualGatewaySpecListenerPortMapping portMapping,
        @OutputCustomType.Parameter("tls") @Nullable VirtualGatewaySpecListenerTls tls) {
        this.connectionPool = connectionPool;
        this.healthCheck = healthCheck;
        this.portMapping = portMapping;
        this.tls = tls;
    }

    /**
     * The connection pool information for the listener.
     * 
    */
    public Optional<VirtualGatewaySpecListenerConnectionPool> getConnectionPool() {
        return Optional.ofNullable(this.connectionPool);
    }
    /**
     * The health check information for the listener.
     * 
    */
    public Optional<VirtualGatewaySpecListenerHealthCheck> getHealthCheck() {
        return Optional.ofNullable(this.healthCheck);
    }
    /**
     * The port mapping information for the listener.
     * 
    */
    public VirtualGatewaySpecListenerPortMapping getPortMapping() {
        return this.portMapping;
    }
    /**
     * The Transport Layer Security (TLS) properties for the listener
     * 
    */
    public Optional<VirtualGatewaySpecListenerTls> getTls() {
        return Optional.ofNullable(this.tls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListener defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualGatewaySpecListenerConnectionPool connectionPool;
        private @Nullable VirtualGatewaySpecListenerHealthCheck healthCheck;
        private VirtualGatewaySpecListenerPortMapping portMapping;
        private @Nullable VirtualGatewaySpecListenerTls tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListener defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPool = defaults.connectionPool;
    	      this.healthCheck = defaults.healthCheck;
    	      this.portMapping = defaults.portMapping;
    	      this.tls = defaults.tls;
        }

        public Builder setConnectionPool(@Nullable VirtualGatewaySpecListenerConnectionPool connectionPool) {
            this.connectionPool = connectionPool;
            return this;
        }

        public Builder setHealthCheck(@Nullable VirtualGatewaySpecListenerHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        public Builder setPortMapping(VirtualGatewaySpecListenerPortMapping portMapping) {
            this.portMapping = Objects.requireNonNull(portMapping);
            return this;
        }

        public Builder setTls(@Nullable VirtualGatewaySpecListenerTls tls) {
            this.tls = tls;
            return this;
        }
        public VirtualGatewaySpecListener build() {
            return new VirtualGatewaySpecListener(connectionPool, healthCheck, portMapping, tls);
        }
    }
}
