// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs();

    /**
     * Optional. If true, all instances in the cluster will only have internal IP addresses. By default, clusters are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each instance. This `internal_ip_only` restriction can only be enabled for subnetwork enabled networks, and all off-cluster dependencies must be configured to be accessible without external IP addresses.
     * 
     */
    @InputImport(name="internalIpOnly")
      private final @Nullable Output<Boolean> internalIpOnly;

    public Output<Boolean> getInternalIpOnly() {
        return this.internalIpOnly == null ? Output.empty() : this.internalIpOnly;
    }

    /**
     * The Compute Engine metadata entries to add to all instances (see (https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork_uri. If neither `network_uri` nor `subnetwork_uri` is specified, the "default" network of the project is used, if it exists. Cannot be a "Custom Subnet Network" (see /regions/global/default`*`default`
     * 
     */
    @InputImport(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * Optional. Node Group Affinity for sole-tenant clusters.
     * 
     */
    @InputImport(name="nodeGroupAffinity")
      private final @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs> nodeGroupAffinity;

    public Output<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs> getNodeGroupAffinity() {
        return this.nodeGroupAffinity == null ? Output.empty() : this.nodeGroupAffinity;
    }

    /**
     * Optional. The type of IPv6 access for a cluster. Possible values: PRIVATE_IPV6_GOOGLE_ACCESS_UNSPECIFIED, INHERIT_FROM_SUBNETWORK, OUTBOUND, BIDIRECTIONAL
     * 
     */
    @InputImport(name="privateIpv6GoogleAccess")
      private final @Nullable Output<String> privateIpv6GoogleAccess;

    public Output<String> getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess == null ? Output.empty() : this.privateIpv6GoogleAccess;
    }

    /**
     * Optional. Reservation Affinity for consuming Zonal reservation.
     * 
     */
    @InputImport(name="reservationAffinity")
      private final @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityArgs> reservationAffinity;

    public Output<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityArgs> getReservationAffinity() {
        return this.reservationAffinity == null ? Output.empty() : this.reservationAffinity;
    }

    /**
     * Optional. The (https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances. The following base set of scopes is always included: * https://www.googleapis.com/auth/cloud.useraccounts.readonly * https://www.googleapis.com/auth/devstorage.read_write * https://www.googleapis.com/auth/logging.write If no scopes are specified, the following defaults are also provided: * https://www.googleapis.com/auth/bigquery * https://www.googleapis.com/auth/bigtable.admin.table * https://www.googleapis.com/auth/bigtable.data * https://www.googleapis.com/auth/devstorage.full_control
     * 
     */
    @InputImport(name="serviceAccountScopes")
      private final @Nullable Output<List<String>> serviceAccountScopes;

    public Output<List<String>> getServiceAccountScopes() {
        return this.serviceAccountScopes == null ? Output.empty() : this.serviceAccountScopes;
    }

    /**
     * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network_uri. A full URL, partial URI, or short name are valid. Examples: * `https://www.googleapis.com/compute/v1/projects//regions/us-east1/subnetworks/sub0` * `sub0`
     * 
     */
    @InputImport(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> getSubnetwork() {
        return this.subnetwork == null ? Output.empty() : this.subnetwork;
    }

    /**
     * The Compute Engine tags to add to all instances (see (https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the "global" region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present. A full URL, partial URI, or short name are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/` * `us-central1-f`
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs(
        @Nullable Output<Boolean> internalIpOnly,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> network,
        @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs> nodeGroupAffinity,
        @Nullable Output<String> privateIpv6GoogleAccess,
        @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityArgs> reservationAffinity,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<List<String>> serviceAccountScopes,
        @Nullable Output<String> subnetwork,
        @Nullable Output<List<String>> tags,
        @Nullable Output<String> zone) {
        this.internalIpOnly = internalIpOnly;
        this.metadata = metadata;
        this.network = network;
        this.nodeGroupAffinity = nodeGroupAffinity;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.reservationAffinity = reservationAffinity;
        this.serviceAccount = serviceAccount;
        this.serviceAccountScopes = serviceAccountScopes;
        this.subnetwork = subnetwork;
        this.tags = tags;
        this.zone = zone;
    }

    private WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs() {
        this.internalIpOnly = Output.empty();
        this.metadata = Output.empty();
        this.network = Output.empty();
        this.nodeGroupAffinity = Output.empty();
        this.privateIpv6GoogleAccess = Output.empty();
        this.reservationAffinity = Output.empty();
        this.serviceAccount = Output.empty();
        this.serviceAccountScopes = Output.empty();
        this.subnetwork = Output.empty();
        this.tags = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> internalIpOnly;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> network;
        private @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs> nodeGroupAffinity;
        private @Nullable Output<String> privateIpv6GoogleAccess;
        private @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityArgs> reservationAffinity;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<List<String>> serviceAccountScopes;
        private @Nullable Output<String> subnetwork;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internalIpOnly = defaults.internalIpOnly;
    	      this.metadata = defaults.metadata;
    	      this.network = defaults.network;
    	      this.nodeGroupAffinity = defaults.nodeGroupAffinity;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceAccountScopes = defaults.serviceAccountScopes;
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

        public Builder nodeGroupAffinity(@Nullable Output<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs> nodeGroupAffinity) {
            this.nodeGroupAffinity = nodeGroupAffinity;
            return this;
        }

        public Builder nodeGroupAffinity(@Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs nodeGroupAffinity) {
            this.nodeGroupAffinity = Output.ofNullable(nodeGroupAffinity);
            return this;
        }

        public Builder privateIpv6GoogleAccess(@Nullable Output<String> privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }

        public Builder privateIpv6GoogleAccess(@Nullable String privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Output.ofNullable(privateIpv6GoogleAccess);
            return this;
        }

        public Builder reservationAffinity(@Nullable Output<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityArgs> reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }

        public Builder reservationAffinity(@Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinityArgs reservationAffinity) {
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
        public WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs(internalIpOnly, metadata, network, nodeGroupAffinity, privateIpv6GoogleAccess, reservationAffinity, serviceAccount, serviceAccountScopes, subnetwork, tags, zone);
        }
    }
}
