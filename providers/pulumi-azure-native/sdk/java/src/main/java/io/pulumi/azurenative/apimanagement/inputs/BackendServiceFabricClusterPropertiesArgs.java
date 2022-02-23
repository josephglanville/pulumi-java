// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.X509CertificateNameArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the Service Fabric Type Backend.
 * 
 */
public final class BackendServiceFabricClusterPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceFabricClusterPropertiesArgs Empty = new BackendServiceFabricClusterPropertiesArgs();

    /**
     * The client certificate id for the management endpoint.
     * 
     */
    @InputImport(name="clientCertificateId")
      private final @Nullable Input<String> clientCertificateId;

    public Input<String> getClientCertificateId() {
        return this.clientCertificateId == null ? Input.empty() : this.clientCertificateId;
    }

    /**
     * The client certificate thumbprint for the management endpoint. Will be ignored if certificatesIds are provided
     * 
     */
    @InputImport(name="clientCertificatethumbprint")
      private final @Nullable Input<String> clientCertificatethumbprint;

    public Input<String> getClientCertificatethumbprint() {
        return this.clientCertificatethumbprint == null ? Input.empty() : this.clientCertificatethumbprint;
    }

    /**
     * The cluster management endpoint.
     * 
     */
    @InputImport(name="managementEndpoints", required=true)
      private final Input<List<String>> managementEndpoints;

    public Input<List<String>> getManagementEndpoints() {
        return this.managementEndpoints;
    }

    /**
     * Maximum number of retries while attempting resolve the partition.
     * 
     */
    @InputImport(name="maxPartitionResolutionRetries")
      private final @Nullable Input<Integer> maxPartitionResolutionRetries;

    public Input<Integer> getMaxPartitionResolutionRetries() {
        return this.maxPartitionResolutionRetries == null ? Input.empty() : this.maxPartitionResolutionRetries;
    }

    /**
     * Thumbprints of certificates cluster management service uses for tls communication
     * 
     */
    @InputImport(name="serverCertificateThumbprints")
      private final @Nullable Input<List<String>> serverCertificateThumbprints;

    public Input<List<String>> getServerCertificateThumbprints() {
        return this.serverCertificateThumbprints == null ? Input.empty() : this.serverCertificateThumbprints;
    }

    /**
     * Server X509 Certificate Names Collection
     * 
     */
    @InputImport(name="serverX509Names")
      private final @Nullable Input<List<X509CertificateNameArgs>> serverX509Names;

    public Input<List<X509CertificateNameArgs>> getServerX509Names() {
        return this.serverX509Names == null ? Input.empty() : this.serverX509Names;
    }

    public BackendServiceFabricClusterPropertiesArgs(
        @Nullable Input<String> clientCertificateId,
        @Nullable Input<String> clientCertificatethumbprint,
        Input<List<String>> managementEndpoints,
        @Nullable Input<Integer> maxPartitionResolutionRetries,
        @Nullable Input<List<String>> serverCertificateThumbprints,
        @Nullable Input<List<X509CertificateNameArgs>> serverX509Names) {
        this.clientCertificateId = clientCertificateId;
        this.clientCertificatethumbprint = clientCertificatethumbprint;
        this.managementEndpoints = Objects.requireNonNull(managementEndpoints, "expected parameter 'managementEndpoints' to be non-null");
        this.maxPartitionResolutionRetries = maxPartitionResolutionRetries;
        this.serverCertificateThumbprints = serverCertificateThumbprints;
        this.serverX509Names = serverX509Names;
    }

    private BackendServiceFabricClusterPropertiesArgs() {
        this.clientCertificateId = Input.empty();
        this.clientCertificatethumbprint = Input.empty();
        this.managementEndpoints = Input.empty();
        this.maxPartitionResolutionRetries = Input.empty();
        this.serverCertificateThumbprints = Input.empty();
        this.serverX509Names = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceFabricClusterPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientCertificateId;
        private @Nullable Input<String> clientCertificatethumbprint;
        private Input<List<String>> managementEndpoints;
        private @Nullable Input<Integer> maxPartitionResolutionRetries;
        private @Nullable Input<List<String>> serverCertificateThumbprints;
        private @Nullable Input<List<X509CertificateNameArgs>> serverX509Names;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceFabricClusterPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertificateId = defaults.clientCertificateId;
    	      this.clientCertificatethumbprint = defaults.clientCertificatethumbprint;
    	      this.managementEndpoints = defaults.managementEndpoints;
    	      this.maxPartitionResolutionRetries = defaults.maxPartitionResolutionRetries;
    	      this.serverCertificateThumbprints = defaults.serverCertificateThumbprints;
    	      this.serverX509Names = defaults.serverX509Names;
        }

        public Builder setClientCertificateId(@Nullable Input<String> clientCertificateId) {
            this.clientCertificateId = clientCertificateId;
            return this;
        }

        public Builder setClientCertificateId(@Nullable String clientCertificateId) {
            this.clientCertificateId = Input.ofNullable(clientCertificateId);
            return this;
        }

        public Builder setClientCertificatethumbprint(@Nullable Input<String> clientCertificatethumbprint) {
            this.clientCertificatethumbprint = clientCertificatethumbprint;
            return this;
        }

        public Builder setClientCertificatethumbprint(@Nullable String clientCertificatethumbprint) {
            this.clientCertificatethumbprint = Input.ofNullable(clientCertificatethumbprint);
            return this;
        }

        public Builder setManagementEndpoints(Input<List<String>> managementEndpoints) {
            this.managementEndpoints = Objects.requireNonNull(managementEndpoints);
            return this;
        }

        public Builder setManagementEndpoints(List<String> managementEndpoints) {
            this.managementEndpoints = Input.of(Objects.requireNonNull(managementEndpoints));
            return this;
        }

        public Builder setMaxPartitionResolutionRetries(@Nullable Input<Integer> maxPartitionResolutionRetries) {
            this.maxPartitionResolutionRetries = maxPartitionResolutionRetries;
            return this;
        }

        public Builder setMaxPartitionResolutionRetries(@Nullable Integer maxPartitionResolutionRetries) {
            this.maxPartitionResolutionRetries = Input.ofNullable(maxPartitionResolutionRetries);
            return this;
        }

        public Builder setServerCertificateThumbprints(@Nullable Input<List<String>> serverCertificateThumbprints) {
            this.serverCertificateThumbprints = serverCertificateThumbprints;
            return this;
        }

        public Builder setServerCertificateThumbprints(@Nullable List<String> serverCertificateThumbprints) {
            this.serverCertificateThumbprints = Input.ofNullable(serverCertificateThumbprints);
            return this;
        }

        public Builder setServerX509Names(@Nullable Input<List<X509CertificateNameArgs>> serverX509Names) {
            this.serverX509Names = serverX509Names;
            return this;
        }

        public Builder setServerX509Names(@Nullable List<X509CertificateNameArgs> serverX509Names) {
            this.serverX509Names = Input.ofNullable(serverX509Names);
            return this;
        }
        public BackendServiceFabricClusterPropertiesArgs build() {
            return new BackendServiceFabricClusterPropertiesArgs(clientCertificateId, clientCertificatethumbprint, managementEndpoints, maxPartitionResolutionRetries, serverCertificateThumbprints, serverX509Names);
        }
    }
}
