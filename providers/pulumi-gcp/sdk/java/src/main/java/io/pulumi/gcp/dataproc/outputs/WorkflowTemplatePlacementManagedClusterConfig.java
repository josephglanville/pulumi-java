// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigEncryptionConfig;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigEndpointConfig;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfig;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigInitializationAction;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigLifecycleConfig;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfig;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigMetastoreConfig;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfig;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigSecurityConfig;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigSoftwareConfig;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplatePlacementManagedClusterConfig {
    /**
     * Optional. Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig autoscalingConfig;
    /**
     * Optional. Encryption settings for the cluster.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigEncryptionConfig encryptionConfig;
    /**
     * Optional. Port/endpoint configuration for this cluster
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigEndpointConfig endpointConfig;
    /**
     * Optional. The shared Compute Engine config settings for all instances in a cluster.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfig gceClusterConfig;
    /**
     * Optional. The Kubernetes Engine config for Dataproc clusters deployed to Kubernetes. Setting this is considered mutually exclusive with Compute Engine-based options such as `gce_cluster_config`, `master_config`, `worker_config`, `secondary_worker_config`, and `autoscaling_config`.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig gkeClusterConfig;
    /**
     * Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node's `role` metadata to run an executable on a master or worker node, as shown below using `curl` (you can also use `wget`): ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes/dataproc-role) if ; then ... master specific actions ... else ... worker specific actions ... fi
     * 
     */
    private final @Nullable List<WorkflowTemplatePlacementManagedClusterConfigInitializationAction> initializationActions;
    /**
     * Optional. Lifecycle setting for the cluster.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigLifecycleConfig lifecycleConfig;
    /**
     * Optional. The Compute Engine config settings for additional worker instances in a cluster.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigMasterConfig masterConfig;
    /**
     * Optional. Metastore configuration.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigMetastoreConfig metastoreConfig;
    /**
     * Optional. The Compute Engine config settings for additional worker instances in a cluster.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfig secondaryWorkerConfig;
    /**
     * Optional. Security settings for the cluster.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigSecurityConfig securityConfig;
    /**
     * Optional. The config settings for software inside the cluster.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigSoftwareConfig softwareConfig;
    /**
     * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
     * 
     */
    private final @Nullable String stagingBucket;
    /**
     * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket.
     * 
     */
    private final @Nullable String tempBucket;
    /**
     * Optional. The Compute Engine config settings for additional worker instances in a cluster.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigWorkerConfig workerConfig;

    @CustomType.Constructor
    private WorkflowTemplatePlacementManagedClusterConfig(
        @CustomType.Parameter("autoscalingConfig") @Nullable WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig autoscalingConfig,
        @CustomType.Parameter("encryptionConfig") @Nullable WorkflowTemplatePlacementManagedClusterConfigEncryptionConfig encryptionConfig,
        @CustomType.Parameter("endpointConfig") @Nullable WorkflowTemplatePlacementManagedClusterConfigEndpointConfig endpointConfig,
        @CustomType.Parameter("gceClusterConfig") @Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfig gceClusterConfig,
        @CustomType.Parameter("gkeClusterConfig") @Nullable WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig gkeClusterConfig,
        @CustomType.Parameter("initializationActions") @Nullable List<WorkflowTemplatePlacementManagedClusterConfigInitializationAction> initializationActions,
        @CustomType.Parameter("lifecycleConfig") @Nullable WorkflowTemplatePlacementManagedClusterConfigLifecycleConfig lifecycleConfig,
        @CustomType.Parameter("masterConfig") @Nullable WorkflowTemplatePlacementManagedClusterConfigMasterConfig masterConfig,
        @CustomType.Parameter("metastoreConfig") @Nullable WorkflowTemplatePlacementManagedClusterConfigMetastoreConfig metastoreConfig,
        @CustomType.Parameter("secondaryWorkerConfig") @Nullable WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfig secondaryWorkerConfig,
        @CustomType.Parameter("securityConfig") @Nullable WorkflowTemplatePlacementManagedClusterConfigSecurityConfig securityConfig,
        @CustomType.Parameter("softwareConfig") @Nullable WorkflowTemplatePlacementManagedClusterConfigSoftwareConfig softwareConfig,
        @CustomType.Parameter("stagingBucket") @Nullable String stagingBucket,
        @CustomType.Parameter("tempBucket") @Nullable String tempBucket,
        @CustomType.Parameter("workerConfig") @Nullable WorkflowTemplatePlacementManagedClusterConfigWorkerConfig workerConfig) {
        this.autoscalingConfig = autoscalingConfig;
        this.encryptionConfig = encryptionConfig;
        this.endpointConfig = endpointConfig;
        this.gceClusterConfig = gceClusterConfig;
        this.gkeClusterConfig = gkeClusterConfig;
        this.initializationActions = initializationActions;
        this.lifecycleConfig = lifecycleConfig;
        this.masterConfig = masterConfig;
        this.metastoreConfig = metastoreConfig;
        this.secondaryWorkerConfig = secondaryWorkerConfig;
        this.securityConfig = securityConfig;
        this.softwareConfig = softwareConfig;
        this.stagingBucket = stagingBucket;
        this.tempBucket = tempBucket;
        this.workerConfig = workerConfig;
    }

    /**
     * Optional. Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig> getAutoscalingConfig() {
        return Optional.ofNullable(this.autoscalingConfig);
    }
    /**
     * Optional. Encryption settings for the cluster.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigEncryptionConfig> getEncryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }
    /**
     * Optional. Port/endpoint configuration for this cluster
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigEndpointConfig> getEndpointConfig() {
        return Optional.ofNullable(this.endpointConfig);
    }
    /**
     * Optional. The shared Compute Engine config settings for all instances in a cluster.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfig> getGceClusterConfig() {
        return Optional.ofNullable(this.gceClusterConfig);
    }
    /**
     * Optional. The Kubernetes Engine config for Dataproc clusters deployed to Kubernetes. Setting this is considered mutually exclusive with Compute Engine-based options such as `gce_cluster_config`, `master_config`, `worker_config`, `secondary_worker_config`, and `autoscaling_config`.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig> getGkeClusterConfig() {
        return Optional.ofNullable(this.gkeClusterConfig);
    }
    /**
     * Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node's `role` metadata to run an executable on a master or worker node, as shown below using `curl` (you can also use `wget`): ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes/dataproc-role) if ; then ... master specific actions ... else ... worker specific actions ... fi
     * 
    */
    public List<WorkflowTemplatePlacementManagedClusterConfigInitializationAction> getInitializationActions() {
        return this.initializationActions == null ? List.of() : this.initializationActions;
    }
    /**
     * Optional. Lifecycle setting for the cluster.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigLifecycleConfig> getLifecycleConfig() {
        return Optional.ofNullable(this.lifecycleConfig);
    }
    /**
     * Optional. The Compute Engine config settings for additional worker instances in a cluster.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigMasterConfig> getMasterConfig() {
        return Optional.ofNullable(this.masterConfig);
    }
    /**
     * Optional. Metastore configuration.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigMetastoreConfig> getMetastoreConfig() {
        return Optional.ofNullable(this.metastoreConfig);
    }
    /**
     * Optional. The Compute Engine config settings for additional worker instances in a cluster.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfig> getSecondaryWorkerConfig() {
        return Optional.ofNullable(this.secondaryWorkerConfig);
    }
    /**
     * Optional. Security settings for the cluster.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigSecurityConfig> getSecurityConfig() {
        return Optional.ofNullable(this.securityConfig);
    }
    /**
     * Optional. The config settings for software inside the cluster.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigSoftwareConfig> getSoftwareConfig() {
        return Optional.ofNullable(this.softwareConfig);
    }
    /**
     * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
     * 
    */
    public Optional<String> getStagingBucket() {
        return Optional.ofNullable(this.stagingBucket);
    }
    /**
     * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket.
     * 
    */
    public Optional<String> getTempBucket() {
        return Optional.ofNullable(this.tempBucket);
    }
    /**
     * Optional. The Compute Engine config settings for additional worker instances in a cluster.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigWorkerConfig> getWorkerConfig() {
        return Optional.ofNullable(this.workerConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig autoscalingConfig;
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigEncryptionConfig encryptionConfig;
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigEndpointConfig endpointConfig;
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfig gceClusterConfig;
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig gkeClusterConfig;
        private @Nullable List<WorkflowTemplatePlacementManagedClusterConfigInitializationAction> initializationActions;
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigLifecycleConfig lifecycleConfig;
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigMasterConfig masterConfig;
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigMetastoreConfig metastoreConfig;
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfig secondaryWorkerConfig;
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigSecurityConfig securityConfig;
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigSoftwareConfig softwareConfig;
        private @Nullable String stagingBucket;
        private @Nullable String tempBucket;
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigWorkerConfig workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingConfig = defaults.autoscalingConfig;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.endpointConfig = defaults.endpointConfig;
    	      this.gceClusterConfig = defaults.gceClusterConfig;
    	      this.gkeClusterConfig = defaults.gkeClusterConfig;
    	      this.initializationActions = defaults.initializationActions;
    	      this.lifecycleConfig = defaults.lifecycleConfig;
    	      this.masterConfig = defaults.masterConfig;
    	      this.metastoreConfig = defaults.metastoreConfig;
    	      this.secondaryWorkerConfig = defaults.secondaryWorkerConfig;
    	      this.securityConfig = defaults.securityConfig;
    	      this.softwareConfig = defaults.softwareConfig;
    	      this.stagingBucket = defaults.stagingBucket;
    	      this.tempBucket = defaults.tempBucket;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder autoscalingConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig autoscalingConfig) {
            this.autoscalingConfig = autoscalingConfig;
            return this;
        }
        public Builder encryptionConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigEncryptionConfig encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public Builder endpointConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigEndpointConfig endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }
        public Builder gceClusterConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfig gceClusterConfig) {
            this.gceClusterConfig = gceClusterConfig;
            return this;
        }
        public Builder gkeClusterConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig gkeClusterConfig) {
            this.gkeClusterConfig = gkeClusterConfig;
            return this;
        }
        public Builder initializationActions(@Nullable List<WorkflowTemplatePlacementManagedClusterConfigInitializationAction> initializationActions) {
            this.initializationActions = initializationActions;
            return this;
        }
        public Builder initializationActions(WorkflowTemplatePlacementManagedClusterConfigInitializationAction... initializationActions) {
            return initializationActions(List.of(initializationActions));
        }
        public Builder lifecycleConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigLifecycleConfig lifecycleConfig) {
            this.lifecycleConfig = lifecycleConfig;
            return this;
        }
        public Builder masterConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigMasterConfig masterConfig) {
            this.masterConfig = masterConfig;
            return this;
        }
        public Builder metastoreConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigMetastoreConfig metastoreConfig) {
            this.metastoreConfig = metastoreConfig;
            return this;
        }
        public Builder secondaryWorkerConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfig secondaryWorkerConfig) {
            this.secondaryWorkerConfig = secondaryWorkerConfig;
            return this;
        }
        public Builder securityConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigSecurityConfig securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }
        public Builder softwareConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigSoftwareConfig softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }
        public Builder stagingBucket(@Nullable String stagingBucket) {
            this.stagingBucket = stagingBucket;
            return this;
        }
        public Builder tempBucket(@Nullable String tempBucket) {
            this.tempBucket = tempBucket;
            return this;
        }
        public Builder workerConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigWorkerConfig workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfig build() {
            return new WorkflowTemplatePlacementManagedClusterConfig(autoscalingConfig, encryptionConfig, endpointConfig, gceClusterConfig, gkeClusterConfig, initializationActions, lifecycleConfig, masterConfig, metastoreConfig, secondaryWorkerConfig, securityConfig, softwareConfig, stagingBucket, tempBucket, workerConfig);
        }
    }
}
