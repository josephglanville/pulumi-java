// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.AutoscalingConfigResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.EncryptionConfigResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.EndpointConfigResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.GceClusterConfigResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.GkeClusterConfigResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.InstanceGroupConfigResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.LifecycleConfigResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.MetastoreConfigResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.NodeInitializationActionResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.SecurityConfigResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.SoftwareConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The cluster config.
 * 
 */
public final class ClusterConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterConfigResponse Empty = new ClusterConfigResponse();

    /**
     * Optional. Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset.
     * 
     */
    @Import(name="autoscalingConfig", required=true)
      private final AutoscalingConfigResponse autoscalingConfig;

    public AutoscalingConfigResponse getAutoscalingConfig() {
        return this.autoscalingConfig;
    }

    /**
     * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging bucket (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a URI to a Cloud Storage bucket.
     * 
     */
    @Import(name="configBucket", required=true)
      private final String configBucket;

    public String getConfigBucket() {
        return this.configBucket;
    }

    /**
     * Optional. Encryption settings for the cluster.
     * 
     */
    @Import(name="encryptionConfig", required=true)
      private final EncryptionConfigResponse encryptionConfig;

    public EncryptionConfigResponse getEncryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * Optional. Port/endpoint configuration for this cluster
     * 
     */
    @Import(name="endpointConfig", required=true)
      private final EndpointConfigResponse endpointConfig;

    public EndpointConfigResponse getEndpointConfig() {
        return this.endpointConfig;
    }

    /**
     * Optional. The shared Compute Engine config settings for all instances in a cluster.
     * 
     */
    @Import(name="gceClusterConfig", required=true)
      private final GceClusterConfigResponse gceClusterConfig;

    public GceClusterConfigResponse getGceClusterConfig() {
        return this.gceClusterConfig;
    }

    /**
     * Optional. The Kubernetes Engine config for Dataproc clusters deployed to Kubernetes. Setting this is considered mutually exclusive with Compute Engine-based options such as gce_cluster_config, master_config, worker_config, secondary_worker_config, and autoscaling_config.
     * 
     */
    @Import(name="gkeClusterConfig", required=true)
      private final GkeClusterConfigResponse gkeClusterConfig;

    public GkeClusterConfigResponse getGkeClusterConfig() {
        return this.gkeClusterConfig;
    }

    /**
     * Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node's role metadata to run an executable on a master or worker node, as shown below using curl (you can also use wget): ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role) if [[ "${ROLE}" == 'Master' ]]; then ... master specific actions ... else ... worker specific actions ... fi
     * 
     */
    @Import(name="initializationActions", required=true)
      private final List<NodeInitializationActionResponse> initializationActions;

    public List<NodeInitializationActionResponse> getInitializationActions() {
        return this.initializationActions;
    }

    /**
     * Optional. The config setting for auto delete cluster schedule.
     * 
     */
    @Import(name="lifecycleConfig", required=true)
      private final LifecycleConfigResponse lifecycleConfig;

    public LifecycleConfigResponse getLifecycleConfig() {
        return this.lifecycleConfig;
    }

    /**
     * Optional. The Compute Engine config settings for the master instance in a cluster.
     * 
     */
    @Import(name="masterConfig", required=true)
      private final InstanceGroupConfigResponse masterConfig;

    public InstanceGroupConfigResponse getMasterConfig() {
        return this.masterConfig;
    }

    /**
     * Optional. Metastore configuration.
     * 
     */
    @Import(name="metastoreConfig", required=true)
      private final MetastoreConfigResponse metastoreConfig;

    public MetastoreConfigResponse getMetastoreConfig() {
        return this.metastoreConfig;
    }

    /**
     * Optional. The Compute Engine config settings for additional worker instances in a cluster.
     * 
     */
    @Import(name="secondaryWorkerConfig", required=true)
      private final InstanceGroupConfigResponse secondaryWorkerConfig;

    public InstanceGroupConfigResponse getSecondaryWorkerConfig() {
        return this.secondaryWorkerConfig;
    }

    /**
     * Optional. Security related configuration.
     * 
     */
    @Import(name="securityConfig", required=true)
      private final SecurityConfigResponse securityConfig;

    public SecurityConfigResponse getSecurityConfig() {
        return this.securityConfig;
    }

    /**
     * Optional. The config settings for software inside the cluster.
     * 
     */
    @Import(name="softwareConfig", required=true)
      private final SoftwareConfigResponse softwareConfig;

    public SoftwareConfigResponse getSoftwareConfig() {
        return this.softwareConfig;
    }

    /**
     * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket. This field requires a Cloud Storage bucket name, not a URI to a Cloud Storage bucket.
     * 
     */
    @Import(name="tempBucket", required=true)
      private final String tempBucket;

    public String getTempBucket() {
        return this.tempBucket;
    }

    /**
     * Optional. The Compute Engine config settings for worker instances in a cluster.
     * 
     */
    @Import(name="workerConfig", required=true)
      private final InstanceGroupConfigResponse workerConfig;

    public InstanceGroupConfigResponse getWorkerConfig() {
        return this.workerConfig;
    }

    public ClusterConfigResponse(
        AutoscalingConfigResponse autoscalingConfig,
        String configBucket,
        EncryptionConfigResponse encryptionConfig,
        EndpointConfigResponse endpointConfig,
        GceClusterConfigResponse gceClusterConfig,
        GkeClusterConfigResponse gkeClusterConfig,
        List<NodeInitializationActionResponse> initializationActions,
        LifecycleConfigResponse lifecycleConfig,
        InstanceGroupConfigResponse masterConfig,
        MetastoreConfigResponse metastoreConfig,
        InstanceGroupConfigResponse secondaryWorkerConfig,
        SecurityConfigResponse securityConfig,
        SoftwareConfigResponse softwareConfig,
        String tempBucket,
        InstanceGroupConfigResponse workerConfig) {
        this.autoscalingConfig = Objects.requireNonNull(autoscalingConfig, "expected parameter 'autoscalingConfig' to be non-null");
        this.configBucket = Objects.requireNonNull(configBucket, "expected parameter 'configBucket' to be non-null");
        this.encryptionConfig = Objects.requireNonNull(encryptionConfig, "expected parameter 'encryptionConfig' to be non-null");
        this.endpointConfig = Objects.requireNonNull(endpointConfig, "expected parameter 'endpointConfig' to be non-null");
        this.gceClusterConfig = Objects.requireNonNull(gceClusterConfig, "expected parameter 'gceClusterConfig' to be non-null");
        this.gkeClusterConfig = Objects.requireNonNull(gkeClusterConfig, "expected parameter 'gkeClusterConfig' to be non-null");
        this.initializationActions = Objects.requireNonNull(initializationActions, "expected parameter 'initializationActions' to be non-null");
        this.lifecycleConfig = Objects.requireNonNull(lifecycleConfig, "expected parameter 'lifecycleConfig' to be non-null");
        this.masterConfig = Objects.requireNonNull(masterConfig, "expected parameter 'masterConfig' to be non-null");
        this.metastoreConfig = Objects.requireNonNull(metastoreConfig, "expected parameter 'metastoreConfig' to be non-null");
        this.secondaryWorkerConfig = Objects.requireNonNull(secondaryWorkerConfig, "expected parameter 'secondaryWorkerConfig' to be non-null");
        this.securityConfig = Objects.requireNonNull(securityConfig, "expected parameter 'securityConfig' to be non-null");
        this.softwareConfig = Objects.requireNonNull(softwareConfig, "expected parameter 'softwareConfig' to be non-null");
        this.tempBucket = Objects.requireNonNull(tempBucket, "expected parameter 'tempBucket' to be non-null");
        this.workerConfig = Objects.requireNonNull(workerConfig, "expected parameter 'workerConfig' to be non-null");
    }

    private ClusterConfigResponse() {
        this.autoscalingConfig = null;
        this.configBucket = null;
        this.encryptionConfig = null;
        this.endpointConfig = null;
        this.gceClusterConfig = null;
        this.gkeClusterConfig = null;
        this.initializationActions = List.of();
        this.lifecycleConfig = null;
        this.masterConfig = null;
        this.metastoreConfig = null;
        this.secondaryWorkerConfig = null;
        this.securityConfig = null;
        this.softwareConfig = null;
        this.tempBucket = null;
        this.workerConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingConfigResponse autoscalingConfig;
        private String configBucket;
        private EncryptionConfigResponse encryptionConfig;
        private EndpointConfigResponse endpointConfig;
        private GceClusterConfigResponse gceClusterConfig;
        private GkeClusterConfigResponse gkeClusterConfig;
        private List<NodeInitializationActionResponse> initializationActions;
        private LifecycleConfigResponse lifecycleConfig;
        private InstanceGroupConfigResponse masterConfig;
        private MetastoreConfigResponse metastoreConfig;
        private InstanceGroupConfigResponse secondaryWorkerConfig;
        private SecurityConfigResponse securityConfig;
        private SoftwareConfigResponse softwareConfig;
        private String tempBucket;
        private InstanceGroupConfigResponse workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingConfig = defaults.autoscalingConfig;
    	      this.configBucket = defaults.configBucket;
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
    	      this.tempBucket = defaults.tempBucket;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder autoscalingConfig(AutoscalingConfigResponse autoscalingConfig) {
            this.autoscalingConfig = Objects.requireNonNull(autoscalingConfig);
            return this;
        }
        public Builder configBucket(String configBucket) {
            this.configBucket = Objects.requireNonNull(configBucket);
            return this;
        }
        public Builder encryptionConfig(EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }
        public Builder endpointConfig(EndpointConfigResponse endpointConfig) {
            this.endpointConfig = Objects.requireNonNull(endpointConfig);
            return this;
        }
        public Builder gceClusterConfig(GceClusterConfigResponse gceClusterConfig) {
            this.gceClusterConfig = Objects.requireNonNull(gceClusterConfig);
            return this;
        }
        public Builder gkeClusterConfig(GkeClusterConfigResponse gkeClusterConfig) {
            this.gkeClusterConfig = Objects.requireNonNull(gkeClusterConfig);
            return this;
        }
        public Builder initializationActions(List<NodeInitializationActionResponse> initializationActions) {
            this.initializationActions = Objects.requireNonNull(initializationActions);
            return this;
        }
        public Builder initializationActions(NodeInitializationActionResponse... initializationActions) {
            return initializationActions(List.of(initializationActions));
        }
        public Builder lifecycleConfig(LifecycleConfigResponse lifecycleConfig) {
            this.lifecycleConfig = Objects.requireNonNull(lifecycleConfig);
            return this;
        }
        public Builder masterConfig(InstanceGroupConfigResponse masterConfig) {
            this.masterConfig = Objects.requireNonNull(masterConfig);
            return this;
        }
        public Builder metastoreConfig(MetastoreConfigResponse metastoreConfig) {
            this.metastoreConfig = Objects.requireNonNull(metastoreConfig);
            return this;
        }
        public Builder secondaryWorkerConfig(InstanceGroupConfigResponse secondaryWorkerConfig) {
            this.secondaryWorkerConfig = Objects.requireNonNull(secondaryWorkerConfig);
            return this;
        }
        public Builder securityConfig(SecurityConfigResponse securityConfig) {
            this.securityConfig = Objects.requireNonNull(securityConfig);
            return this;
        }
        public Builder softwareConfig(SoftwareConfigResponse softwareConfig) {
            this.softwareConfig = Objects.requireNonNull(softwareConfig);
            return this;
        }
        public Builder tempBucket(String tempBucket) {
            this.tempBucket = Objects.requireNonNull(tempBucket);
            return this;
        }
        public Builder workerConfig(InstanceGroupConfigResponse workerConfig) {
            this.workerConfig = Objects.requireNonNull(workerConfig);
            return this;
        }        public ClusterConfigResponse build() {
            return new ClusterConfigResponse(autoscalingConfig, configBucket, encryptionConfig, endpointConfig, gceClusterConfig, gkeClusterConfig, initializationActions, lifecycleConfig, masterConfig, metastoreConfig, secondaryWorkerConfig, securityConfig, softwareConfig, tempBucket, workerConfig);
        }
    }
}
