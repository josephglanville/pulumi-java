// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerHealthCheckGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerOutlierDetectionGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerPortMappingGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerGetArgs Empty = new VirtualNodeSpecListenerGetArgs();

    /**
     * The connection pool information for the listener.
     * 
     */
    @Import(name="connectionPool")
      private final @Nullable Output<VirtualNodeSpecListenerConnectionPoolGetArgs> connectionPool;

    public Output<VirtualNodeSpecListenerConnectionPoolGetArgs> getConnectionPool() {
        return this.connectionPool == null ? Output.empty() : this.connectionPool;
    }

    /**
     * The health check information for the listener.
     * 
     */
    @Import(name="healthCheck")
      private final @Nullable Output<VirtualNodeSpecListenerHealthCheckGetArgs> healthCheck;

    public Output<VirtualNodeSpecListenerHealthCheckGetArgs> getHealthCheck() {
        return this.healthCheck == null ? Output.empty() : this.healthCheck;
    }

    /**
     * The outlier detection information for the listener.
     * 
     */
    @Import(name="outlierDetection")
      private final @Nullable Output<VirtualNodeSpecListenerOutlierDetectionGetArgs> outlierDetection;

    public Output<VirtualNodeSpecListenerOutlierDetectionGetArgs> getOutlierDetection() {
        return this.outlierDetection == null ? Output.empty() : this.outlierDetection;
    }

    /**
     * The port mapping information for the listener.
     * 
     */
    @Import(name="portMapping", required=true)
      private final Output<VirtualNodeSpecListenerPortMappingGetArgs> portMapping;

    public Output<VirtualNodeSpecListenerPortMappingGetArgs> getPortMapping() {
        return this.portMapping;
    }

    /**
     * Timeouts for different protocols.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<VirtualNodeSpecListenerTimeoutGetArgs> timeout;

    public Output<VirtualNodeSpecListenerTimeoutGetArgs> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * The Transport Layer Security (TLS) properties for the listener
     * 
     */
    @Import(name="tls")
      private final @Nullable Output<VirtualNodeSpecListenerTlsGetArgs> tls;

    public Output<VirtualNodeSpecListenerTlsGetArgs> getTls() {
        return this.tls == null ? Output.empty() : this.tls;
    }

    public VirtualNodeSpecListenerGetArgs(
        @Nullable Output<VirtualNodeSpecListenerConnectionPoolGetArgs> connectionPool,
        @Nullable Output<VirtualNodeSpecListenerHealthCheckGetArgs> healthCheck,
        @Nullable Output<VirtualNodeSpecListenerOutlierDetectionGetArgs> outlierDetection,
        Output<VirtualNodeSpecListenerPortMappingGetArgs> portMapping,
        @Nullable Output<VirtualNodeSpecListenerTimeoutGetArgs> timeout,
        @Nullable Output<VirtualNodeSpecListenerTlsGetArgs> tls) {
        this.connectionPool = connectionPool;
        this.healthCheck = healthCheck;
        this.outlierDetection = outlierDetection;
        this.portMapping = Objects.requireNonNull(portMapping, "expected parameter 'portMapping' to be non-null");
        this.timeout = timeout;
        this.tls = tls;
    }

    private VirtualNodeSpecListenerGetArgs() {
        this.connectionPool = Output.empty();
        this.healthCheck = Output.empty();
        this.outlierDetection = Output.empty();
        this.portMapping = Output.empty();
        this.timeout = Output.empty();
        this.tls = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecListenerConnectionPoolGetArgs> connectionPool;
        private @Nullable Output<VirtualNodeSpecListenerHealthCheckGetArgs> healthCheck;
        private @Nullable Output<VirtualNodeSpecListenerOutlierDetectionGetArgs> outlierDetection;
        private Output<VirtualNodeSpecListenerPortMappingGetArgs> portMapping;
        private @Nullable Output<VirtualNodeSpecListenerTimeoutGetArgs> timeout;
        private @Nullable Output<VirtualNodeSpecListenerTlsGetArgs> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPool = defaults.connectionPool;
    	      this.healthCheck = defaults.healthCheck;
    	      this.outlierDetection = defaults.outlierDetection;
    	      this.portMapping = defaults.portMapping;
    	      this.timeout = defaults.timeout;
    	      this.tls = defaults.tls;
        }

        public Builder connectionPool(@Nullable Output<VirtualNodeSpecListenerConnectionPoolGetArgs> connectionPool) {
            this.connectionPool = connectionPool;
            return this;
        }
        public Builder connectionPool(@Nullable VirtualNodeSpecListenerConnectionPoolGetArgs connectionPool) {
            this.connectionPool = Output.ofNullable(connectionPool);
            return this;
        }
        public Builder healthCheck(@Nullable Output<VirtualNodeSpecListenerHealthCheckGetArgs> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public Builder healthCheck(@Nullable VirtualNodeSpecListenerHealthCheckGetArgs healthCheck) {
            this.healthCheck = Output.ofNullable(healthCheck);
            return this;
        }
        public Builder outlierDetection(@Nullable Output<VirtualNodeSpecListenerOutlierDetectionGetArgs> outlierDetection) {
            this.outlierDetection = outlierDetection;
            return this;
        }
        public Builder outlierDetection(@Nullable VirtualNodeSpecListenerOutlierDetectionGetArgs outlierDetection) {
            this.outlierDetection = Output.ofNullable(outlierDetection);
            return this;
        }
        public Builder portMapping(Output<VirtualNodeSpecListenerPortMappingGetArgs> portMapping) {
            this.portMapping = Objects.requireNonNull(portMapping);
            return this;
        }
        public Builder portMapping(VirtualNodeSpecListenerPortMappingGetArgs portMapping) {
            this.portMapping = Output.of(Objects.requireNonNull(portMapping));
            return this;
        }
        public Builder timeout(@Nullable Output<VirtualNodeSpecListenerTimeoutGetArgs> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable VirtualNodeSpecListenerTimeoutGetArgs timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }
        public Builder tls(@Nullable Output<VirtualNodeSpecListenerTlsGetArgs> tls) {
            this.tls = tls;
            return this;
        }
        public Builder tls(@Nullable VirtualNodeSpecListenerTlsGetArgs tls) {
            this.tls = Output.ofNullable(tls);
            return this;
        }        public VirtualNodeSpecListenerGetArgs build() {
            return new VirtualNodeSpecListenerGetArgs(connectionPool, healthCheck, outlierDetection, portMapping, timeout, tls);
        }
    }
}