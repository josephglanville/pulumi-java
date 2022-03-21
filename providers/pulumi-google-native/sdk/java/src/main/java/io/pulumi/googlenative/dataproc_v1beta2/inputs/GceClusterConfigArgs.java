// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataproc_v1beta2.enums.GceClusterConfigPrivateIpv6GoogleAccess;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.NodeGroupAffinityArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.ReservationAffinityArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.ShieldedInstanceConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Common config settings for resources of Compute Engine cluster instances, applicable to all instances in the cluster.
 * 
 */
public final class GceClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GceClusterConfigArgs Empty = new GceClusterConfigArgs();

    /**
     * Optional. If true, all instances in the cluster will only have internal IP addresses. By default, clusters are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each instance. This internal_ip_only restriction can only be enabled for subnetwork enabled networks, and all off-cluster dependencies must be configured to be accessible without external IP addresses.
     * 
     */
    @Import(name="internalIpOnly")
      private final @Nullable Output<Boolean> internalIpOnly;

    public Output<Boolean> getInternalIpOnly() {
        return this.internalIpOnly == null ? Output.empty() : this.internalIpOnly;
    }

    /**
     * The Compute Engine metadata entries to add to all instances (see Project and instance metadata (https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork_uri. If neither network_uri nor subnetwork_uri is specified, the "default" network of the project is used, if it exists. Cannot be a "Custom Subnet Network" (see Using Subnetworks (https://cloud.google.com/compute/docs/subnetworks) for more information).A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default projects/[project_id]/regions/global/default default
     * 
     */
    @Import(name="networkUri")
      private final @Nullable Output<String> networkUri;

    public Output<String> getNetworkUri() {
        return this.networkUri == null ? Output.empty() : this.networkUri;
    }

    /**
     * Optional. Node Group Affinity for sole-tenant clusters.
     * 
     */
    @Import(name="nodeGroupAffinity")
      private final @Nullable Output<NodeGroupAffinityArgs> nodeGroupAffinity;

    public Output<NodeGroupAffinityArgs> getNodeGroupAffinity() {
        return this.nodeGroupAffinity == null ? Output.empty() : this.nodeGroupAffinity;
    }

    /**
     * Optional. The type of IPv6 access for a cluster.
     * 
     */
    @Import(name="privateIpv6GoogleAccess")
      private final @Nullable Output<GceClusterConfigPrivateIpv6GoogleAccess> privateIpv6GoogleAccess;

    public Output<GceClusterConfigPrivateIpv6GoogleAccess> getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess == null ? Output.empty() : this.privateIpv6GoogleAccess;
    }

    /**
     * Optional. Reservation Affinity for consuming Zonal reservation.
     * 
     */
    @Import(name="reservationAffinity")
      private final @Nullable Output<ReservationAffinityArgs> reservationAffinity;

    public Output<ReservationAffinityArgs> getReservationAffinity() {
        return this.reservationAffinity == null ? Output.empty() : this.reservationAffinity;
    }

    /**
     * Optional. The Dataproc service account (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/service-accounts#service_accounts_in_dataproc) (also see VM Data Plane identity (https://cloud.google.com/dataproc/docs/concepts/iam/dataproc-principals#vm_service_account_data_plane_identity)) used by Dataproc cluster VM instances to access Google Cloud Platform services.If not specified, the Compute Engine default service account (https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances. The following base set of scopes is always included: https://www.googleapis.com/auth/cloud.useraccounts.readonly https://www.googleapis.com/auth/devstorage.read_write https://www.googleapis.com/auth/logging.writeIf no scopes are specified, the following defaults are also provided: https://www.googleapis.com/auth/bigquery https://www.googleapis.com/auth/bigtable.admin.table https://www.googleapis.com/auth/bigtable.data https://www.googleapis.com/auth/devstorage.full_control
     * 
     */
    @Import(name="serviceAccountScopes")
      private final @Nullable Output<List<String>> serviceAccountScopes;

    public Output<List<String>> getServiceAccountScopes() {
        return this.serviceAccountScopes == null ? Output.empty() : this.serviceAccountScopes;
    }

    /**
     * Optional. Shielded Instance Config for clusters using Compute Engine Shielded VMs (https://cloud.google.com/security/shielded-cloud/shielded-vm).
     * 
     */
    @Import(name="shieldedInstanceConfig")
      private final @Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Output<ShieldedInstanceConfigArgs> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Output.empty() : this.shieldedInstanceConfig;
    }

    /**
     * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network_uri.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0 projects/[project_id]/regions/us-east1/subnetworks/sub0 sub0
     * 
     */
    @Import(name="subnetworkUri")
      private final @Nullable Output<String> subnetworkUri;

    public Output<String> getSubnetworkUri() {
        return this.subnetworkUri == null ? Output.empty() : this.subnetworkUri;
    }

    /**
     * The Compute Engine tags to add to all instances (see Tagging instances (https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the "global" region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone] projects/[project_id]/zones/[zone] us-central1-f
     * 
     */
    @Import(name="zoneUri")
      private final @Nullable Output<String> zoneUri;

    public Output<String> getZoneUri() {
        return this.zoneUri == null ? Output.empty() : this.zoneUri;
    }

    public GceClusterConfigArgs(
        @Nullable Output<Boolean> internalIpOnly,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> networkUri,
        @Nullable Output<NodeGroupAffinityArgs> nodeGroupAffinity,
        @Nullable Output<GceClusterConfigPrivateIpv6GoogleAccess> privateIpv6GoogleAccess,
        @Nullable Output<ReservationAffinityArgs> reservationAffinity,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<List<String>> serviceAccountScopes,
        @Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig,
        @Nullable Output<String> subnetworkUri,
        @Nullable Output<List<String>> tags,
        @Nullable Output<String> zoneUri) {
        this.internalIpOnly = internalIpOnly;
        this.metadata = metadata;
        this.networkUri = networkUri;
        this.nodeGroupAffinity = nodeGroupAffinity;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.reservationAffinity = reservationAffinity;
        this.serviceAccount = serviceAccount;
        this.serviceAccountScopes = serviceAccountScopes;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.subnetworkUri = subnetworkUri;
        this.tags = tags;
        this.zoneUri = zoneUri;
    }

    private GceClusterConfigArgs() {
        this.internalIpOnly = Output.empty();
        this.metadata = Output.empty();
        this.networkUri = Output.empty();
        this.nodeGroupAffinity = Output.empty();
        this.privateIpv6GoogleAccess = Output.empty();
        this.reservationAffinity = Output.empty();
        this.serviceAccount = Output.empty();
        this.serviceAccountScopes = Output.empty();
        this.shieldedInstanceConfig = Output.empty();
        this.subnetworkUri = Output.empty();
        this.tags = Output.empty();
        this.zoneUri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GceClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> internalIpOnly;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> networkUri;
        private @Nullable Output<NodeGroupAffinityArgs> nodeGroupAffinity;
        private @Nullable Output<GceClusterConfigPrivateIpv6GoogleAccess> privateIpv6GoogleAccess;
        private @Nullable Output<ReservationAffinityArgs> reservationAffinity;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<List<String>> serviceAccountScopes;
        private @Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig;
        private @Nullable Output<String> subnetworkUri;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<String> zoneUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GceClusterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internalIpOnly = defaults.internalIpOnly;
    	      this.metadata = defaults.metadata;
    	      this.networkUri = defaults.networkUri;
    	      this.nodeGroupAffinity = defaults.nodeGroupAffinity;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceAccountScopes = defaults.serviceAccountScopes;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.subnetworkUri = defaults.subnetworkUri;
    	      this.tags = defaults.tags;
    	      this.zoneUri = defaults.zoneUri;
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
        public Builder networkUri(@Nullable Output<String> networkUri) {
            this.networkUri = networkUri;
            return this;
        }
        public Builder networkUri(@Nullable String networkUri) {
            this.networkUri = Output.ofNullable(networkUri);
            return this;
        }
        public Builder nodeGroupAffinity(@Nullable Output<NodeGroupAffinityArgs> nodeGroupAffinity) {
            this.nodeGroupAffinity = nodeGroupAffinity;
            return this;
        }
        public Builder nodeGroupAffinity(@Nullable NodeGroupAffinityArgs nodeGroupAffinity) {
            this.nodeGroupAffinity = Output.ofNullable(nodeGroupAffinity);
            return this;
        }
        public Builder privateIpv6GoogleAccess(@Nullable Output<GceClusterConfigPrivateIpv6GoogleAccess> privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }
        public Builder privateIpv6GoogleAccess(@Nullable GceClusterConfigPrivateIpv6GoogleAccess privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Output.ofNullable(privateIpv6GoogleAccess);
            return this;
        }
        public Builder reservationAffinity(@Nullable Output<ReservationAffinityArgs> reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }
        public Builder reservationAffinity(@Nullable ReservationAffinityArgs reservationAffinity) {
            this.reservationAffinity = Output.ofNullable(reservationAffinity);
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
        public Builder serviceAccountScopes(String... serviceAccountScopes) {
            return serviceAccountScopes(List.of(serviceAccountScopes));
        }
        public Builder shieldedInstanceConfig(@Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }
        public Builder shieldedInstanceConfig(@Nullable ShieldedInstanceConfigArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Output.ofNullable(shieldedInstanceConfig);
            return this;
        }
        public Builder subnetworkUri(@Nullable Output<String> subnetworkUri) {
            this.subnetworkUri = subnetworkUri;
            return this;
        }
        public Builder subnetworkUri(@Nullable String subnetworkUri) {
            this.subnetworkUri = Output.ofNullable(subnetworkUri);
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
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder zoneUri(@Nullable Output<String> zoneUri) {
            this.zoneUri = zoneUri;
            return this;
        }
        public Builder zoneUri(@Nullable String zoneUri) {
            this.zoneUri = Output.ofNullable(zoneUri);
            return this;
        }        public GceClusterConfigArgs build() {
            return new GceClusterConfigArgs(internalIpOnly, metadata, networkUri, nodeGroupAffinity, privateIpv6GoogleAccess, reservationAffinity, serviceAccount, serviceAccountScopes, shieldedInstanceConfig, subnetworkUri, tags, zoneUri);
        }
    }
}
