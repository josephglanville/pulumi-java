// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.ConfidentialInstanceConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.NodeGroupAffinityResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.ReservationAffinityResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.ShieldedInstanceConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GceClusterConfigResponse {
    /**
     * Optional. Confidential Instance Config for clusters using Confidential VMs (https://cloud.google.com/compute/confidential-vm/docs).
     * 
     */
    private final ConfidentialInstanceConfigResponse confidentialInstanceConfig;
    /**
     * Optional. If true, all instances in the cluster will only have internal IP addresses. By default, clusters are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each instance. This internal_ip_only restriction can only be enabled for subnetwork enabled networks, and all off-cluster dependencies must be configured to be accessible without external IP addresses.
     * 
     */
    private final Boolean internalIpOnly;
    /**
     * The Compute Engine metadata entries to add to all instances (see Project and instance metadata (https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
     */
    private final Map<String,String> metadata;
    /**
     * Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork_uri. If neither network_uri nor subnetwork_uri is specified, the "default" network of the project is used, if it exists. Cannot be a "Custom Subnet Network" (see Using Subnetworks (https://cloud.google.com/compute/docs/subnetworks) for more information).A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default projects/[project_id]/regions/global/default default
     * 
     */
    private final String networkUri;
    /**
     * Optional. Node Group Affinity for sole-tenant clusters.
     * 
     */
    private final NodeGroupAffinityResponse nodeGroupAffinity;
    /**
     * Optional. The type of IPv6 access for a cluster.
     * 
     */
    private final String privateIpv6GoogleAccess;
    /**
     * Optional. Reservation Affinity for consuming Zonal reservation.
     * 
     */
    private final ReservationAffinityResponse reservationAffinity;
    /**
     * Optional. The Dataproc service account (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/service-accounts#service_accounts_in_dataproc) (also see VM Data Plane identity (https://cloud.google.com/dataproc/docs/concepts/iam/dataproc-principals#vm_service_account_data_plane_identity)) used by Dataproc cluster VM instances to access Google Cloud Platform services.If not specified, the Compute Engine default service account (https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
     */
    private final String serviceAccount;
    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances. The following base set of scopes is always included: https://www.googleapis.com/auth/cloud.useraccounts.readonly https://www.googleapis.com/auth/devstorage.read_write https://www.googleapis.com/auth/logging.writeIf no scopes are specified, the following defaults are also provided: https://www.googleapis.com/auth/bigquery https://www.googleapis.com/auth/bigtable.admin.table https://www.googleapis.com/auth/bigtable.data https://www.googleapis.com/auth/devstorage.full_control
     * 
     */
    private final List<String> serviceAccountScopes;
    /**
     * Optional. Shielded Instance Config for clusters using Compute Engine Shielded VMs (https://cloud.google.com/security/shielded-cloud/shielded-vm).
     * 
     */
    private final ShieldedInstanceConfigResponse shieldedInstanceConfig;
    /**
     * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network_uri.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0 projects/[project_id]/regions/us-east1/subnetworks/sub0 sub0
     * 
     */
    private final String subnetworkUri;
    /**
     * The Compute Engine tags to add to all instances (see Tagging instances (https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    private final List<String> tags;
    /**
     * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the "global" region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone] projects/[project_id]/zones/[zone] us-central1-f
     * 
     */
    private final String zoneUri;

    @CustomType.Constructor
    private GceClusterConfigResponse(
        @CustomType.Parameter("confidentialInstanceConfig") ConfidentialInstanceConfigResponse confidentialInstanceConfig,
        @CustomType.Parameter("internalIpOnly") Boolean internalIpOnly,
        @CustomType.Parameter("metadata") Map<String,String> metadata,
        @CustomType.Parameter("networkUri") String networkUri,
        @CustomType.Parameter("nodeGroupAffinity") NodeGroupAffinityResponse nodeGroupAffinity,
        @CustomType.Parameter("privateIpv6GoogleAccess") String privateIpv6GoogleAccess,
        @CustomType.Parameter("reservationAffinity") ReservationAffinityResponse reservationAffinity,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("serviceAccountScopes") List<String> serviceAccountScopes,
        @CustomType.Parameter("shieldedInstanceConfig") ShieldedInstanceConfigResponse shieldedInstanceConfig,
        @CustomType.Parameter("subnetworkUri") String subnetworkUri,
        @CustomType.Parameter("tags") List<String> tags,
        @CustomType.Parameter("zoneUri") String zoneUri) {
        this.confidentialInstanceConfig = confidentialInstanceConfig;
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

    /**
     * Optional. Confidential Instance Config for clusters using Confidential VMs (https://cloud.google.com/compute/confidential-vm/docs).
     * 
    */
    public ConfidentialInstanceConfigResponse getConfidentialInstanceConfig() {
        return this.confidentialInstanceConfig;
    }
    /**
     * Optional. If true, all instances in the cluster will only have internal IP addresses. By default, clusters are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each instance. This internal_ip_only restriction can only be enabled for subnetwork enabled networks, and all off-cluster dependencies must be configured to be accessible without external IP addresses.
     * 
    */
    public Boolean getInternalIpOnly() {
        return this.internalIpOnly;
    }
    /**
     * The Compute Engine metadata entries to add to all instances (see Project and instance metadata (https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork_uri. If neither network_uri nor subnetwork_uri is specified, the "default" network of the project is used, if it exists. Cannot be a "Custom Subnet Network" (see Using Subnetworks (https://cloud.google.com/compute/docs/subnetworks) for more information).A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default projects/[project_id]/regions/global/default default
     * 
    */
    public String getNetworkUri() {
        return this.networkUri;
    }
    /**
     * Optional. Node Group Affinity for sole-tenant clusters.
     * 
    */
    public NodeGroupAffinityResponse getNodeGroupAffinity() {
        return this.nodeGroupAffinity;
    }
    /**
     * Optional. The type of IPv6 access for a cluster.
     * 
    */
    public String getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
    }
    /**
     * Optional. Reservation Affinity for consuming Zonal reservation.
     * 
    */
    public ReservationAffinityResponse getReservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * Optional. The Dataproc service account (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/service-accounts#service_accounts_in_dataproc) (also see VM Data Plane identity (https://cloud.google.com/dataproc/docs/concepts/iam/dataproc-principals#vm_service_account_data_plane_identity)) used by Dataproc cluster VM instances to access Google Cloud Platform services.If not specified, the Compute Engine default service account (https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances. The following base set of scopes is always included: https://www.googleapis.com/auth/cloud.useraccounts.readonly https://www.googleapis.com/auth/devstorage.read_write https://www.googleapis.com/auth/logging.writeIf no scopes are specified, the following defaults are also provided: https://www.googleapis.com/auth/bigquery https://www.googleapis.com/auth/bigtable.admin.table https://www.googleapis.com/auth/bigtable.data https://www.googleapis.com/auth/devstorage.full_control
     * 
    */
    public List<String> getServiceAccountScopes() {
        return this.serviceAccountScopes;
    }
    /**
     * Optional. Shielded Instance Config for clusters using Compute Engine Shielded VMs (https://cloud.google.com/security/shielded-cloud/shielded-vm).
     * 
    */
    public ShieldedInstanceConfigResponse getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network_uri.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0 projects/[project_id]/regions/us-east1/subnetworks/sub0 sub0
     * 
    */
    public String getSubnetworkUri() {
        return this.subnetworkUri;
    }
    /**
     * The Compute Engine tags to add to all instances (see Tagging instances (https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
    */
    public List<String> getTags() {
        return this.tags;
    }
    /**
     * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the "global" region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone] projects/[project_id]/zones/[zone] us-central1-f
     * 
    */
    public String getZoneUri() {
        return this.zoneUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GceClusterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfidentialInstanceConfigResponse confidentialInstanceConfig;
        private Boolean internalIpOnly;
        private Map<String,String> metadata;
        private String networkUri;
        private NodeGroupAffinityResponse nodeGroupAffinity;
        private String privateIpv6GoogleAccess;
        private ReservationAffinityResponse reservationAffinity;
        private String serviceAccount;
        private List<String> serviceAccountScopes;
        private ShieldedInstanceConfigResponse shieldedInstanceConfig;
        private String subnetworkUri;
        private List<String> tags;
        private String zoneUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GceClusterConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidentialInstanceConfig = defaults.confidentialInstanceConfig;
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

        public Builder confidentialInstanceConfig(ConfidentialInstanceConfigResponse confidentialInstanceConfig) {
            this.confidentialInstanceConfig = Objects.requireNonNull(confidentialInstanceConfig);
            return this;
        }
        public Builder internalIpOnly(Boolean internalIpOnly) {
            this.internalIpOnly = Objects.requireNonNull(internalIpOnly);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }
        public Builder nodeGroupAffinity(NodeGroupAffinityResponse nodeGroupAffinity) {
            this.nodeGroupAffinity = Objects.requireNonNull(nodeGroupAffinity);
            return this;
        }
        public Builder privateIpv6GoogleAccess(String privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Objects.requireNonNull(privateIpv6GoogleAccess);
            return this;
        }
        public Builder reservationAffinity(ReservationAffinityResponse reservationAffinity) {
            this.reservationAffinity = Objects.requireNonNull(reservationAffinity);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder serviceAccountScopes(List<String> serviceAccountScopes) {
            this.serviceAccountScopes = Objects.requireNonNull(serviceAccountScopes);
            return this;
        }
        public Builder serviceAccountScopes(String... serviceAccountScopes) {
            return serviceAccountScopes(List.of(serviceAccountScopes));
        }
        public Builder shieldedInstanceConfig(ShieldedInstanceConfigResponse shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
            return this;
        }
        public Builder subnetworkUri(String subnetworkUri) {
            this.subnetworkUri = Objects.requireNonNull(subnetworkUri);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder zoneUri(String zoneUri) {
            this.zoneUri = Objects.requireNonNull(zoneUri);
            return this;
        }        public GceClusterConfigResponse build() {
            return new GceClusterConfigResponse(confidentialInstanceConfig, internalIpOnly, metadata, networkUri, nodeGroupAffinity, privateIpv6GoogleAccess, reservationAffinity, serviceAccount, serviceAccountScopes, shieldedInstanceConfig, subnetworkUri, tags, zoneUri);
        }
    }
}
