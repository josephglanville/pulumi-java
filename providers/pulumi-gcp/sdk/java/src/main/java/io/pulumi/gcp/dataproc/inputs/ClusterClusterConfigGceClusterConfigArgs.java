// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigShieldedInstanceConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterConfigGceClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigGceClusterConfigArgs Empty = new ClusterClusterConfigGceClusterConfigArgs();

    /**
     * By default, clusters are not restricted to internal IP addresses,
     * and will have ephemeral external IP addresses assigned to each instance. If set to true, all
     * instances in the cluster will only have internal IP addresses. Note: Private Google Access
     * (also known as `privateIpGoogleAccess`) must be enabled on the subnetwork that the cluster
     * will be launched in.
     * 
     */
    @InputImport(name="internalIpOnly")
      private final @Nullable Output<Boolean> internalIpOnly;

    public Output<Boolean> getInternalIpOnly() {
        return this.internalIpOnly == null ? Output.empty() : this.internalIpOnly;
    }

    /**
     * A map of the Compute Engine metadata entries to add to all instances
     * (see [Project and instance metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * The name or self_link of the Google Compute Engine
     * network to the cluster will be part of. Conflicts with `subnetwork`.
     * If neither is specified, this defaults to the "default" network.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * The service account to be used by the Node VMs.
     * If not specified, the "default" service account is used.
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    /**
     * The set of Google API scopes
     * to be made available on all of the node VMs under the `service_account`
     * specified. Both OAuth2 URLs and gcloud
     * short names are supported. To allow full access to all Cloud APIs, use the
     * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
     * 
     */
    @InputImport(name="serviceAccountScopes")
      private final @Nullable Output<List<String>> serviceAccountScopes;

    public Output<List<String>> getServiceAccountScopes() {
        return this.serviceAccountScopes == null ? Output.empty() : this.serviceAccountScopes;
    }

    /**
     * Shielded Instance Config for clusters using [Compute Engine Shielded VMs](https://cloud.google.com/security/shielded-cloud/shielded-vm).
     * 
     */
    @InputImport(name="shieldedInstanceConfig")
      private final @Nullable Output<ClusterClusterConfigGceClusterConfigShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Output<ClusterClusterConfigGceClusterConfigShieldedInstanceConfigArgs> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Output.empty() : this.shieldedInstanceConfig;
    }

    /**
     * The name or self_link of the Google Compute Engine
     * subnetwork the cluster will be part of. Conflicts with `network`.
     * 
     */
    @InputImport(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> getSubnetwork() {
        return this.subnetwork == null ? Output.empty() : this.subnetwork;
    }

    /**
     * The list of instance tags applied to instances in the cluster.
     * Tags are used to identify valid sources or targets for network firewalls.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The GCP zone where your data is stored and used (i.e. where
     * the master and the worker nodes will be created in). If `region` is set to 'global' (default)
     * then `zone` is mandatory, otherwise GCP is able to make use of [Auto Zone Placement](https://cloud.google.com/dataproc/docs/concepts/auto-zone)
     * to determine this automatically for you.
     * Note: This setting additionally determines and restricts
     * which computing resources are available for use with other configs such as
     * `cluster_config.master_config.machine_type` and `cluster_config.worker_config.machine_type`.
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public ClusterClusterConfigGceClusterConfigArgs(
        @Nullable Output<Boolean> internalIpOnly,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> network,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<List<String>> serviceAccountScopes,
        @Nullable Output<ClusterClusterConfigGceClusterConfigShieldedInstanceConfigArgs> shieldedInstanceConfig,
        @Nullable Output<String> subnetwork,
        @Nullable Output<List<String>> tags,
        @Nullable Output<String> zone) {
        this.internalIpOnly = internalIpOnly;
        this.metadata = metadata;
        this.network = network;
        this.serviceAccount = serviceAccount;
        this.serviceAccountScopes = serviceAccountScopes;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.subnetwork = subnetwork;
        this.tags = tags;
        this.zone = zone;
    }

    private ClusterClusterConfigGceClusterConfigArgs() {
        this.internalIpOnly = Output.empty();
        this.metadata = Output.empty();
        this.network = Output.empty();
        this.serviceAccount = Output.empty();
        this.serviceAccountScopes = Output.empty();
        this.shieldedInstanceConfig = Output.empty();
        this.subnetwork = Output.empty();
        this.tags = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigGceClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> internalIpOnly;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> network;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<List<String>> serviceAccountScopes;
        private @Nullable Output<ClusterClusterConfigGceClusterConfigShieldedInstanceConfigArgs> shieldedInstanceConfig;
        private @Nullable Output<String> subnetwork;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigGceClusterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internalIpOnly = defaults.internalIpOnly;
    	      this.metadata = defaults.metadata;
    	      this.network = defaults.network;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceAccountScopes = defaults.serviceAccountScopes;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder internalIpOnly(@Nullable Output<Boolean> internalIpOnly) {
            this.internalIpOnly = internalIpOnly;
            return this;
        }

        public Builder internalIpOnly(@Nullable Boolean internalIpOnly) {
            this.internalIpOnly = Output.ofNullable(internalIpOnly);
            return this;
        }

        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }

        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
            return this;
        }

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Output.ofNullable(serviceAccount);
            return this;
        }

        public Builder serviceAccountScopes(@Nullable Output<List<String>> serviceAccountScopes) {
            this.serviceAccountScopes = serviceAccountScopes;
            return this;
        }

        public Builder serviceAccountScopes(@Nullable List<String> serviceAccountScopes) {
            this.serviceAccountScopes = Output.ofNullable(serviceAccountScopes);
            return this;
        }

        public Builder shieldedInstanceConfig(@Nullable Output<ClusterClusterConfigGceClusterConfigShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder shieldedInstanceConfig(@Nullable ClusterClusterConfigGceClusterConfigShieldedInstanceConfigArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Output.ofNullable(shieldedInstanceConfig);
            return this;
        }

        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Output.ofNullable(subnetwork);
            return this;
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }
        public ClusterClusterConfigGceClusterConfigArgs build() {
            return new ClusterClusterConfigGceClusterConfigArgs(internalIpOnly, metadata, network, serviceAccount, serviceAccountScopes, shieldedInstanceConfig, subnetwork, tags, zone);
        }
    }
}
