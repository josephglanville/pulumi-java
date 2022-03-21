// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.container.inputs.AzureClusterAuthorizationGetArgs;
import io.pulumi.gcp.container.inputs.AzureClusterControlPlaneGetArgs;
import io.pulumi.gcp.container.inputs.AzureClusterFleetGetArgs;
import io.pulumi.gcp.container.inputs.AzureClusterNetworkingGetArgs;
import io.pulumi.gcp.container.inputs.AzureClusterWorkloadIdentityConfigGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureClusterState extends io.pulumi.resources.ResourceArgs {

    public static final AzureClusterState Empty = new AzureClusterState();

    /**
     * Optional. Annotations on the cluster. This field has the same restrictions as Kubernetes annotations. The total size of all keys and values combined is limited to 256k. Keys can have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<Map<String,String>> annotations;

    public Output<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * Required. Configuration related to the cluster RBAC settings.
     * 
     */
    @Import(name="authorization")
      private final @Nullable Output<AzureClusterAuthorizationGetArgs> authorization;

    public Output<AzureClusterAuthorizationGetArgs> getAuthorization() {
        return this.authorization == null ? Output.empty() : this.authorization;
    }

    /**
     * Required. The Azure region where the cluster runs. Each Google Cloud region supports a subset of nearby Azure regions. You can call to list all supported Azure regions within a given Google Cloud region.
     * 
     */
    @Import(name="azureRegion")
      private final @Nullable Output<String> azureRegion;

    public Output<String> getAzureRegion() {
        return this.azureRegion == null ? Output.empty() : this.azureRegion;
    }

    /**
     * Required. Name of the AzureClient. The `AzureClient` resource must reside on the same GCP project and region as the `AzureCluster`. `AzureClient` names are formatted as `projects/<project-number>/locations/<region>/azureClients/<client-id>`. See Resource Names (https:cloud.google.com/apis/design/resource_names) for more details on Google Cloud resource names.
     * 
     */
    @Import(name="client")
      private final @Nullable Output<String> client;

    public Output<String> getClient() {
        return this.client == null ? Output.empty() : this.client;
    }

    /**
     * Required. Configuration related to the cluster control plane.
     * 
     */
    @Import(name="controlPlane")
      private final @Nullable Output<AzureClusterControlPlaneGetArgs> controlPlane;

    public Output<AzureClusterControlPlaneGetArgs> getControlPlane() {
        return this.controlPlane == null ? Output.empty() : this.controlPlane;
    }

    /**
     * Output only. The time at which this cluster was created.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Output.empty() : this.createTime;
    }

    /**
     * Optional. A human readable description of this cluster. Cannot be longer than 255 UTF-8 encoded bytes.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Output only. The endpoint of the cluster's API server.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
    }

    /**
     * Allows clients to perform consistent read-modify-writes through optimistic concurrency control. May be sent on update
     * and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * Fleet configuration.
     * 
     */
    @Import(name="fleet")
      private final @Nullable Output<AzureClusterFleetGetArgs> fleet;

    public Output<AzureClusterFleetGetArgs> getFleet() {
        return this.fleet == null ? Output.empty() : this.fleet;
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of this resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Required. Cluster-wide networking configuration.
     * 
     */
    @Import(name="networking")
      private final @Nullable Output<AzureClusterNetworkingGetArgs> networking;

    public Output<AzureClusterNetworkingGetArgs> getNetworking() {
        return this.networking == null ? Output.empty() : this.networking;
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Output only. If set, there are currently changes in flight to the cluster.
     * 
     */
    @Import(name="reconciling")
      private final @Nullable Output<Boolean> reconciling;

    public Output<Boolean> getReconciling() {
        return this.reconciling == null ? Output.empty() : this.reconciling;
    }

    /**
     * The ARM ID the of the resource group containing proxy keyvault. Resource group ids are formatted as `/subscriptions/<subscription-id>/resourceGroups/<resource-group-name>`
     * 
     */
    @Import(name="resourceGroupId")
      private final @Nullable Output<String> resourceGroupId;

    public Output<String> getResourceGroupId() {
        return this.resourceGroupId == null ? Output.empty() : this.resourceGroupId;
    }

    /**
     * Output only. The current state of the cluster. Possible values: STATE_UNSPECIFIED, PROVISIONING, RUNNING, RECONCILING,
     * STOPPING, ERROR, DEGRADED
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * Output only. A globally unique identifier for the cluster.
     * 
     */
    @Import(name="uid")
      private final @Nullable Output<String> uid;

    public Output<String> getUid() {
        return this.uid == null ? Output.empty() : this.uid;
    }

    /**
     * Output only. The time at which this cluster was last updated.
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime == null ? Output.empty() : this.updateTime;
    }

    /**
     * Output only. Workload Identity settings.
     * 
     */
    @Import(name="workloadIdentityConfigs")
      private final @Nullable Output<List<AzureClusterWorkloadIdentityConfigGetArgs>> workloadIdentityConfigs;

    public Output<List<AzureClusterWorkloadIdentityConfigGetArgs>> getWorkloadIdentityConfigs() {
        return this.workloadIdentityConfigs == null ? Output.empty() : this.workloadIdentityConfigs;
    }

    public AzureClusterState(
        @Nullable Output<Map<String,String>> annotations,
        @Nullable Output<AzureClusterAuthorizationGetArgs> authorization,
        @Nullable Output<String> azureRegion,
        @Nullable Output<String> client,
        @Nullable Output<AzureClusterControlPlaneGetArgs> controlPlane,
        @Nullable Output<String> createTime,
        @Nullable Output<String> description,
        @Nullable Output<String> endpoint,
        @Nullable Output<String> etag,
        @Nullable Output<AzureClusterFleetGetArgs> fleet,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<AzureClusterNetworkingGetArgs> networking,
        @Nullable Output<String> project,
        @Nullable Output<Boolean> reconciling,
        @Nullable Output<String> resourceGroupId,
        @Nullable Output<String> state,
        @Nullable Output<String> uid,
        @Nullable Output<String> updateTime,
        @Nullable Output<List<AzureClusterWorkloadIdentityConfigGetArgs>> workloadIdentityConfigs) {
        this.annotations = annotations;
        this.authorization = authorization;
        this.azureRegion = azureRegion;
        this.client = client;
        this.controlPlane = controlPlane;
        this.createTime = createTime;
        this.description = description;
        this.endpoint = endpoint;
        this.etag = etag;
        this.fleet = fleet;
        this.location = location;
        this.name = name;
        this.networking = networking;
        this.project = project;
        this.reconciling = reconciling;
        this.resourceGroupId = resourceGroupId;
        this.state = state;
        this.uid = uid;
        this.updateTime = updateTime;
        this.workloadIdentityConfigs = workloadIdentityConfigs;
    }

    private AzureClusterState() {
        this.annotations = Output.empty();
        this.authorization = Output.empty();
        this.azureRegion = Output.empty();
        this.client = Output.empty();
        this.controlPlane = Output.empty();
        this.createTime = Output.empty();
        this.description = Output.empty();
        this.endpoint = Output.empty();
        this.etag = Output.empty();
        this.fleet = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.networking = Output.empty();
        this.project = Output.empty();
        this.reconciling = Output.empty();
        this.resourceGroupId = Output.empty();
        this.state = Output.empty();
        this.uid = Output.empty();
        this.updateTime = Output.empty();
        this.workloadIdentityConfigs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> annotations;
        private @Nullable Output<AzureClusterAuthorizationGetArgs> authorization;
        private @Nullable Output<String> azureRegion;
        private @Nullable Output<String> client;
        private @Nullable Output<AzureClusterControlPlaneGetArgs> controlPlane;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> description;
        private @Nullable Output<String> endpoint;
        private @Nullable Output<String> etag;
        private @Nullable Output<AzureClusterFleetGetArgs> fleet;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<AzureClusterNetworkingGetArgs> networking;
        private @Nullable Output<String> project;
        private @Nullable Output<Boolean> reconciling;
        private @Nullable Output<String> resourceGroupId;
        private @Nullable Output<String> state;
        private @Nullable Output<String> uid;
        private @Nullable Output<String> updateTime;
        private @Nullable Output<List<AzureClusterWorkloadIdentityConfigGetArgs>> workloadIdentityConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authorization = defaults.authorization;
    	      this.azureRegion = defaults.azureRegion;
    	      this.client = defaults.client;
    	      this.controlPlane = defaults.controlPlane;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.etag = defaults.etag;
    	      this.fleet = defaults.fleet;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networking = defaults.networking;
    	      this.project = defaults.project;
    	      this.reconciling = defaults.reconciling;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.state = defaults.state;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
    	      this.workloadIdentityConfigs = defaults.workloadIdentityConfigs;
        }

        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }
        public Builder authorization(@Nullable Output<AzureClusterAuthorizationGetArgs> authorization) {
            this.authorization = authorization;
            return this;
        }
        public Builder authorization(@Nullable AzureClusterAuthorizationGetArgs authorization) {
            this.authorization = Output.ofNullable(authorization);
            return this;
        }
        public Builder azureRegion(@Nullable Output<String> azureRegion) {
            this.azureRegion = azureRegion;
            return this;
        }
        public Builder azureRegion(@Nullable String azureRegion) {
            this.azureRegion = Output.ofNullable(azureRegion);
            return this;
        }
        public Builder client(@Nullable Output<String> client) {
            this.client = client;
            return this;
        }
        public Builder client(@Nullable String client) {
            this.client = Output.ofNullable(client);
            return this;
        }
        public Builder controlPlane(@Nullable Output<AzureClusterControlPlaneGetArgs> controlPlane) {
            this.controlPlane = controlPlane;
            return this;
        }
        public Builder controlPlane(@Nullable AzureClusterControlPlaneGetArgs controlPlane) {
            this.controlPlane = Output.ofNullable(controlPlane);
            return this;
        }
        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Output.ofNullable(createTime);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }
        public Builder fleet(@Nullable Output<AzureClusterFleetGetArgs> fleet) {
            this.fleet = fleet;
            return this;
        }
        public Builder fleet(@Nullable AzureClusterFleetGetArgs fleet) {
            this.fleet = Output.ofNullable(fleet);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder networking(@Nullable Output<AzureClusterNetworkingGetArgs> networking) {
            this.networking = networking;
            return this;
        }
        public Builder networking(@Nullable AzureClusterNetworkingGetArgs networking) {
            this.networking = Output.ofNullable(networking);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder reconciling(@Nullable Output<Boolean> reconciling) {
            this.reconciling = reconciling;
            return this;
        }
        public Builder reconciling(@Nullable Boolean reconciling) {
            this.reconciling = Output.ofNullable(reconciling);
            return this;
        }
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = Output.ofNullable(resourceGroupId);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public Builder uid(@Nullable Output<String> uid) {
            this.uid = uid;
            return this;
        }
        public Builder uid(@Nullable String uid) {
            this.uid = Output.ofNullable(uid);
            return this;
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Output.ofNullable(updateTime);
            return this;
        }
        public Builder workloadIdentityConfigs(@Nullable Output<List<AzureClusterWorkloadIdentityConfigGetArgs>> workloadIdentityConfigs) {
            this.workloadIdentityConfigs = workloadIdentityConfigs;
            return this;
        }
        public Builder workloadIdentityConfigs(@Nullable List<AzureClusterWorkloadIdentityConfigGetArgs> workloadIdentityConfigs) {
            this.workloadIdentityConfigs = Output.ofNullable(workloadIdentityConfigs);
            return this;
        }
        public Builder workloadIdentityConfigs(AzureClusterWorkloadIdentityConfigGetArgs... workloadIdentityConfigs) {
            return workloadIdentityConfigs(List.of(workloadIdentityConfigs));
        }        public AzureClusterState build() {
            return new AzureClusterState(annotations, authorization, azureRegion, client, controlPlane, createTime, description, endpoint, etag, fleet, location, name, networking, project, reconciling, resourceGroupId, state, uid, updateTime, workloadIdentityConfigs);
        }
    }
}
