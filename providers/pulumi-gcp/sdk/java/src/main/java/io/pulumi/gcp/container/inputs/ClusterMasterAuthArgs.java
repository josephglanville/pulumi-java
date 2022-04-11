// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.container.inputs.ClusterMasterAuthClientCertificateConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMasterAuthArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterAuthArgs Empty = new ClusterMasterAuthArgs();

    @Import(name="clientCertificate")
      private final @Nullable Output<String> clientCertificate;

    public Output<String> getClientCertificate() {
        return this.clientCertificate == null ? Codegen.empty() : this.clientCertificate;
    }

    /**
     * Whether client certificate authorization is enabled for this cluster.  For example:
     * 
     */
    @Import(name="clientCertificateConfig", required=true)
      private final Output<ClusterMasterAuthClientCertificateConfigArgs> clientCertificateConfig;

    public Output<ClusterMasterAuthClientCertificateConfigArgs> getClientCertificateConfig() {
        return this.clientCertificateConfig;
    }

    @Import(name="clientKey")
      private final @Nullable Output<String> clientKey;

    public Output<String> getClientKey() {
        return this.clientKey == null ? Codegen.empty() : this.clientKey;
    }

    @Import(name="clusterCaCertificate")
      private final @Nullable Output<String> clusterCaCertificate;

    public Output<String> getClusterCaCertificate() {
        return this.clusterCaCertificate == null ? Codegen.empty() : this.clusterCaCertificate;
    }

    public ClusterMasterAuthArgs(
        @Nullable Output<String> clientCertificate,
        Output<ClusterMasterAuthClientCertificateConfigArgs> clientCertificateConfig,
        @Nullable Output<String> clientKey,
        @Nullable Output<String> clusterCaCertificate) {
        this.clientCertificate = clientCertificate;
        this.clientCertificateConfig = Objects.requireNonNull(clientCertificateConfig, "expected parameter 'clientCertificateConfig' to be non-null");
        this.clientKey = clientKey;
        this.clusterCaCertificate = clusterCaCertificate;
    }

    private ClusterMasterAuthArgs() {
        this.clientCertificate = Codegen.empty();
        this.clientCertificateConfig = Codegen.empty();
        this.clientKey = Codegen.empty();
        this.clusterCaCertificate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientCertificate;
        private Output<ClusterMasterAuthClientCertificateConfigArgs> clientCertificateConfig;
        private @Nullable Output<String> clientKey;
        private @Nullable Output<String> clusterCaCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterAuthArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientCertificateConfig = defaults.clientCertificateConfig;
    	      this.clientKey = defaults.clientKey;
    	      this.clusterCaCertificate = defaults.clusterCaCertificate;
        }

        public Builder clientCertificate(@Nullable Output<String> clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }
        public Builder clientCertificate(@Nullable String clientCertificate) {
            this.clientCertificate = Codegen.ofNullable(clientCertificate);
            return this;
        }
        public Builder clientCertificateConfig(Output<ClusterMasterAuthClientCertificateConfigArgs> clientCertificateConfig) {
            this.clientCertificateConfig = Objects.requireNonNull(clientCertificateConfig);
            return this;
        }
        public Builder clientCertificateConfig(ClusterMasterAuthClientCertificateConfigArgs clientCertificateConfig) {
            this.clientCertificateConfig = Output.of(Objects.requireNonNull(clientCertificateConfig));
            return this;
        }
        public Builder clientKey(@Nullable Output<String> clientKey) {
            this.clientKey = clientKey;
            return this;
        }
        public Builder clientKey(@Nullable String clientKey) {
            this.clientKey = Codegen.ofNullable(clientKey);
            return this;
        }
        public Builder clusterCaCertificate(@Nullable Output<String> clusterCaCertificate) {
            this.clusterCaCertificate = clusterCaCertificate;
            return this;
        }
        public Builder clusterCaCertificate(@Nullable String clusterCaCertificate) {
            this.clusterCaCertificate = Codegen.ofNullable(clusterCaCertificate);
            return this;
        }        public ClusterMasterAuthArgs build() {
            return new ClusterMasterAuthArgs(clientCertificate, clientCertificateConfig, clientKey, clusterCaCertificate);
        }
    }
}
