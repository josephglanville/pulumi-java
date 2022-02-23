// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigGetArgs();

    /**
     * Optional. Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset.
     * 
     */
    @InputImport(name="autoscalingConfig")
      private final @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigGetArgs> autoscalingConfig;

    public Input<WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigGetArgs> getAutoscalingConfig() {
        return this.autoscalingConfig == null ? Input.empty() : this.autoscalingConfig;
    }

    /**
     * Optional. Encryption settings for the cluster.
     * 
     */
    @InputImport(name="encryptionConfig")
      private final @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs> encryptionConfig;

    public Input<WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs> getEncryptionConfig() {
        return this.encryptionConfig == null ? Input.empty() : this.encryptionConfig;
    }

    /**
     * Optional. Port/endpoint configuration for this cluster
     * 
     */
    @InputImport(name="endpointConfig")
      private final @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs> endpointConfig;

    public Input<WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs> getEndpointConfig() {
        return this.endpointConfig == null ? Input.empty() : this.endpointConfig;
    }

    /**
     * Optional. The shared Compute Engine config settings for all instances in a cluster.
     * 
     */
    @InputImport(name="gceClusterConfig")
      private final @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigGetArgs> gceClusterConfig;

    public Input<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigGetArgs> getGceClusterConfig() {
        return this.gceClusterConfig == null ? Input.empty() : this.gceClusterConfig;
    }

    /**
     * Optional. The Kubernetes Engine config for Dataproc clusters deployed to Kubernetes. Setting this is considered mutually exclusive with Compute Engine-based options such as `gce_cluster_config`, `master_config`, `worker_config`, `secondary_worker_config`, and `autoscaling_config`.
     * 
     */
    @InputImport(name="gkeClusterConfig")
      private final @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigGetArgs> gkeClusterConfig;

    public Input<WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigGetArgs> getGkeClusterConfig() {
        return this.gkeClusterConfig == null ? Input.empty() : this.gkeClusterConfig;
    }

    /**
     * Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node's `role` metadata to run an executable on a master or worker node, as shown below using `curl` (you can also use `wget`): ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes/dataproc-role) if ; then ... master specific actions ... else ... worker specific actions ... fi
     * 
     */
    @InputImport(name="initializationActions")
      private final @Nullable Input<List<WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs>> initializationActions;

    public Input<List<WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs>> getInitializationActions() {
        return this.initializationActions == null ? Input.empty() : this.initializationActions;
    }

    /**
     * Optional. Lifecycle setting for the cluster.
     * 
     */
    @InputImport(name="lifecycleConfig")
      private final @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs> lifecycleConfig;

    public Input<WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs> getLifecycleConfig() {
        return this.lifecycleConfig == null ? Input.empty() : this.lifecycleConfig;
    }

    /**
     * Optional. The Compute Engine config settings for additional worker instances in a cluster.
     * 
     */
    @InputImport(name="masterConfig")
      private final @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs> masterConfig;

    public Input<WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs> getMasterConfig() {
        return this.masterConfig == null ? Input.empty() : this.masterConfig;
    }

    /**
     * Optional. Metastore configuration.
     * 
     */
    @InputImport(name="metastoreConfig")
      private final @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs> metastoreConfig;

    public Input<WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs> getMetastoreConfig() {
        return this.metastoreConfig == null ? Input.empty() : this.metastoreConfig;
    }

    /**
     * Optional. The Compute Engine config settings for additional worker instances in a cluster.
     * 
     */
    @InputImport(name="secondaryWorkerConfig")
      private final @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigGetArgs> secondaryWorkerConfig;

    public Input<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigGetArgs> getSecondaryWorkerConfig() {
        return this.secondaryWorkerConfig == null ? Input.empty() : this.secondaryWorkerConfig;
    }

    /**
     * Optional. Security settings for the cluster.
     * 
     */
    @InputImport(name="securityConfig")
      private final @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs> securityConfig;

    public Input<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs> getSecurityConfig() {
        return this.securityConfig == null ? Input.empty() : this.securityConfig;
    }

    /**
     * Optional. The config settings for software inside the cluster.
     * 
     */
    @InputImport(name="softwareConfig")
      private final @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigGetArgs> softwareConfig;

    public Input<WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigGetArgs> getSoftwareConfig() {
        return this.softwareConfig == null ? Input.empty() : this.softwareConfig;
    }

    /**
     * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
     * 
     */
    @InputImport(name="stagingBucket")
      private final @Nullable Input<String> stagingBucket;

    public Input<String> getStagingBucket() {
        return this.stagingBucket == null ? Input.empty() : this.stagingBucket;
    }

    /**
     * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket.
     * 
     */
    @InputImport(name="tempBucket")
      private final @Nullable Input<String> tempBucket;

    public Input<String> getTempBucket() {
        return this.tempBucket == null ? Input.empty() : this.tempBucket;
    }

    /**
     * Optional. The Compute Engine config settings for additional worker instances in a cluster.
     * 
     */
    @InputImport(name="workerConfig")
      private final @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigGetArgs> workerConfig;

    public Input<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigGetArgs> getWorkerConfig() {
        return this.workerConfig == null ? Input.empty() : this.workerConfig;
    }

    public WorkflowTemplatePlacementManagedClusterConfigGetArgs(
        @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigGetArgs> autoscalingConfig,
        @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs> encryptionConfig,
        @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs> endpointConfig,
        @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigGetArgs> gceClusterConfig,
        @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigGetArgs> gkeClusterConfig,
        @Nullable Input<List<WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs>> initializationActions,
        @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs> lifecycleConfig,
        @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs> masterConfig,
        @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs> metastoreConfig,
        @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigGetArgs> secondaryWorkerConfig,
        @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs> securityConfig,
        @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigGetArgs> softwareConfig,
        @Nullable Input<String> stagingBucket,
        @Nullable Input<String> tempBucket,
        @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigGetArgs> workerConfig) {
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

    private WorkflowTemplatePlacementManagedClusterConfigGetArgs() {
        this.autoscalingConfig = Input.empty();
        this.encryptionConfig = Input.empty();
        this.endpointConfig = Input.empty();
        this.gceClusterConfig = Input.empty();
        this.gkeClusterConfig = Input.empty();
        this.initializationActions = Input.empty();
        this.lifecycleConfig = Input.empty();
        this.masterConfig = Input.empty();
        this.metastoreConfig = Input.empty();
        this.secondaryWorkerConfig = Input.empty();
        this.securityConfig = Input.empty();
        this.softwareConfig = Input.empty();
        this.stagingBucket = Input.empty();
        this.tempBucket = Input.empty();
        this.workerConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigGetArgs> autoscalingConfig;
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs> encryptionConfig;
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs> endpointConfig;
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigGetArgs> gceClusterConfig;
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigGetArgs> gkeClusterConfig;
        private @Nullable Input<List<WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs>> initializationActions;
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs> lifecycleConfig;
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs> masterConfig;
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs> metastoreConfig;
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigGetArgs> secondaryWorkerConfig;
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs> securityConfig;
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigGetArgs> softwareConfig;
        private @Nullable Input<String> stagingBucket;
        private @Nullable Input<String> tempBucket;
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigGetArgs> workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigGetArgs defaults) {
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

        public Builder setAutoscalingConfig(@Nullable Input<WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigGetArgs> autoscalingConfig) {
            this.autoscalingConfig = autoscalingConfig;
            return this;
        }

        public Builder setAutoscalingConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigGetArgs autoscalingConfig) {
            this.autoscalingConfig = Input.ofNullable(autoscalingConfig);
            return this;
        }

        public Builder setEncryptionConfig(@Nullable Input<WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }

        public Builder setEncryptionConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigGetArgs encryptionConfig) {
            this.encryptionConfig = Input.ofNullable(encryptionConfig);
            return this;
        }

        public Builder setEndpointConfig(@Nullable Input<WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs> endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }

        public Builder setEndpointConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigEndpointConfigGetArgs endpointConfig) {
            this.endpointConfig = Input.ofNullable(endpointConfig);
            return this;
        }

        public Builder setGceClusterConfig(@Nullable Input<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigGetArgs> gceClusterConfig) {
            this.gceClusterConfig = gceClusterConfig;
            return this;
        }

        public Builder setGceClusterConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigGetArgs gceClusterConfig) {
            this.gceClusterConfig = Input.ofNullable(gceClusterConfig);
            return this;
        }

        public Builder setGkeClusterConfig(@Nullable Input<WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigGetArgs> gkeClusterConfig) {
            this.gkeClusterConfig = gkeClusterConfig;
            return this;
        }

        public Builder setGkeClusterConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigGetArgs gkeClusterConfig) {
            this.gkeClusterConfig = Input.ofNullable(gkeClusterConfig);
            return this;
        }

        public Builder setInitializationActions(@Nullable Input<List<WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs>> initializationActions) {
            this.initializationActions = initializationActions;
            return this;
        }

        public Builder setInitializationActions(@Nullable List<WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs> initializationActions) {
            this.initializationActions = Input.ofNullable(initializationActions);
            return this;
        }

        public Builder setLifecycleConfig(@Nullable Input<WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs> lifecycleConfig) {
            this.lifecycleConfig = lifecycleConfig;
            return this;
        }

        public Builder setLifecycleConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigGetArgs lifecycleConfig) {
            this.lifecycleConfig = Input.ofNullable(lifecycleConfig);
            return this;
        }

        public Builder setMasterConfig(@Nullable Input<WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs> masterConfig) {
            this.masterConfig = masterConfig;
            return this;
        }

        public Builder setMasterConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigMasterConfigGetArgs masterConfig) {
            this.masterConfig = Input.ofNullable(masterConfig);
            return this;
        }

        public Builder setMetastoreConfig(@Nullable Input<WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs> metastoreConfig) {
            this.metastoreConfig = metastoreConfig;
            return this;
        }

        public Builder setMetastoreConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigMetastoreConfigGetArgs metastoreConfig) {
            this.metastoreConfig = Input.ofNullable(metastoreConfig);
            return this;
        }

        public Builder setSecondaryWorkerConfig(@Nullable Input<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigGetArgs> secondaryWorkerConfig) {
            this.secondaryWorkerConfig = secondaryWorkerConfig;
            return this;
        }

        public Builder setSecondaryWorkerConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigGetArgs secondaryWorkerConfig) {
            this.secondaryWorkerConfig = Input.ofNullable(secondaryWorkerConfig);
            return this;
        }

        public Builder setSecurityConfig(@Nullable Input<WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs> securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }

        public Builder setSecurityConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigSecurityConfigGetArgs securityConfig) {
            this.securityConfig = Input.ofNullable(securityConfig);
            return this;
        }

        public Builder setSoftwareConfig(@Nullable Input<WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigGetArgs> softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }

        public Builder setSoftwareConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigGetArgs softwareConfig) {
            this.softwareConfig = Input.ofNullable(softwareConfig);
            return this;
        }

        public Builder setStagingBucket(@Nullable Input<String> stagingBucket) {
            this.stagingBucket = stagingBucket;
            return this;
        }

        public Builder setStagingBucket(@Nullable String stagingBucket) {
            this.stagingBucket = Input.ofNullable(stagingBucket);
            return this;
        }

        public Builder setTempBucket(@Nullable Input<String> tempBucket) {
            this.tempBucket = tempBucket;
            return this;
        }

        public Builder setTempBucket(@Nullable String tempBucket) {
            this.tempBucket = Input.ofNullable(tempBucket);
            return this;
        }

        public Builder setWorkerConfig(@Nullable Input<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigGetArgs> workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }

        public Builder setWorkerConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigWorkerConfigGetArgs workerConfig) {
            this.workerConfig = Input.ofNullable(workerConfig);
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigGetArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigGetArgs(autoscalingConfig, encryptionConfig, endpointConfig, gceClusterConfig, gkeClusterConfig, initializationActions, lifecycleConfig, masterConfig, metastoreConfig, secondaryWorkerConfig, securityConfig, softwareConfig, stagingBucket, tempBucket, workerConfig);
        }
    }
}
