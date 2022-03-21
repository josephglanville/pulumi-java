// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataflow_v1b3.inputs.AutoscalingSettingsResponse;
import io.pulumi.googlenative.dataflow_v1b3.inputs.DiskResponse;
import io.pulumi.googlenative.dataflow_v1b3.inputs.PackageResponse;
import io.pulumi.googlenative.dataflow_v1b3.inputs.SdkHarnessContainerImageResponse;
import io.pulumi.googlenative.dataflow_v1b3.inputs.TaskRunnerSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Describes one particular pool of Cloud Dataflow workers to be instantiated by the Cloud Dataflow service in order to perform the computations required by a job. Note that a workflow job may use multiple pools, in order to match the various computational requirements of the various stages of the job.
 * 
 */
public final class WorkerPoolResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkerPoolResponse Empty = new WorkerPoolResponse();

    /**
     * Settings for autoscaling of this WorkerPool.
     * 
     */
    @Import(name="autoscalingSettings", required=true)
      private final AutoscalingSettingsResponse autoscalingSettings;

    public AutoscalingSettingsResponse getAutoscalingSettings() {
        return this.autoscalingSettings;
    }

    /**
     * Data disks that are used by a VM in this workflow.
     * 
     */
    @Import(name="dataDisks", required=true)
      private final List<DiskResponse> dataDisks;

    public List<DiskResponse> getDataDisks() {
        return this.dataDisks;
    }

    /**
     * The default package set to install. This allows the service to select a default set of packages which are useful to worker harnesses written in a particular language.
     * 
     */
    @Import(name="defaultPackageSet", required=true)
      private final String defaultPackageSet;

    public String getDefaultPackageSet() {
        return this.defaultPackageSet;
    }

    /**
     * Size of root disk for VMs, in GB. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="diskSizeGb", required=true)
      private final Integer diskSizeGb;

    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Fully qualified source image for disks.
     * 
     */
    @Import(name="diskSourceImage", required=true)
      private final String diskSourceImage;

    public String getDiskSourceImage() {
        return this.diskSourceImage;
    }

    /**
     * Type of root disk for VMs. If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="diskType", required=true)
      private final String diskType;

    public String getDiskType() {
        return this.diskType;
    }

    /**
     * Configuration for VM IPs.
     * 
     */
    @Import(name="ipConfiguration", required=true)
      private final String ipConfiguration;

    public String getIpConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * The kind of the worker pool; currently only `harness` and `shuffle` are supported.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Machine type (e.g. "n1-standard-1"). If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="machineType", required=true)
      private final String machineType;

    public String getMachineType() {
        return this.machineType;
    }

    /**
     * Metadata to set on the Google Compute Engine VMs.
     * 
     */
    @Import(name="metadata", required=true)
      private final Map<String,String> metadata;

    public Map<String,String> getMetadata() {
        return this.metadata;
    }

    /**
     * Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default".
     * 
     */
    @Import(name="network", required=true)
      private final String network;

    public String getNetwork() {
        return this.network;
    }

    /**
     * The number of threads per worker harness. If empty or unspecified, the service will choose a number of threads (according to the number of cores on the selected machine type for batch, or 1 by convention for streaming).
     * 
     */
    @Import(name="numThreadsPerWorker", required=true)
      private final Integer numThreadsPerWorker;

    public Integer getNumThreadsPerWorker() {
        return this.numThreadsPerWorker;
    }

    /**
     * Number of Google Compute Engine workers in this pool needed to execute the job. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="numWorkers", required=true)
      private final Integer numWorkers;

    public Integer getNumWorkers() {
        return this.numWorkers;
    }

    /**
     * The action to take on host maintenance, as defined by the Google Compute Engine API.
     * 
     */
    @Import(name="onHostMaintenance", required=true)
      private final String onHostMaintenance;

    public String getOnHostMaintenance() {
        return this.onHostMaintenance;
    }

    /**
     * Packages to be installed on workers.
     * 
     */
    @Import(name="packages", required=true)
      private final List<PackageResponse> packages;

    public List<PackageResponse> getPackages() {
        return this.packages;
    }

    /**
     * Extra arguments for this worker pool.
     * 
     */
    @Import(name="poolArgs", required=true)
      private final Map<String,String> poolArgs;

    public Map<String,String> getPoolArgs() {
        return this.poolArgs;
    }

    /**
     * Set of SDK harness containers needed to execute this pipeline. This will only be set in the Fn API path. For non-cross-language pipelines this should have only one entry. Cross-language pipelines will have two or more entries.
     * 
     */
    @Import(name="sdkHarnessContainerImages", required=true)
      private final List<SdkHarnessContainerImageResponse> sdkHarnessContainerImages;

    public List<SdkHarnessContainerImageResponse> getSdkHarnessContainerImages() {
        return this.sdkHarnessContainerImages;
    }

    /**
     * Subnetwork to which VMs will be assigned, if desired. Expected to be of the form "regions/REGION/subnetworks/SUBNETWORK".
     * 
     */
    @Import(name="subnetwork", required=true)
      private final String subnetwork;

    public String getSubnetwork() {
        return this.subnetwork;
    }

    /**
     * Settings passed through to Google Compute Engine workers when using the standard Dataflow task runner. Users should ignore this field.
     * 
     */
    @Import(name="taskrunnerSettings", required=true)
      private final TaskRunnerSettingsResponse taskrunnerSettings;

    public TaskRunnerSettingsResponse getTaskrunnerSettings() {
        return this.taskrunnerSettings;
    }

    /**
     * Sets the policy for determining when to turndown worker pool. Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and `TEARDOWN_NEVER`. `TEARDOWN_ALWAYS` means workers are always torn down regardless of whether the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn down. If the workers are not torn down by the service, they will continue to run and use Google Compute Engine VM resources in the user's project until they are explicitly terminated by the user. Because of this, Google recommends using the `TEARDOWN_ALWAYS` policy except for small, manually supervised test jobs. If unknown or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="teardownPolicy", required=true)
      private final String teardownPolicy;

    public String getTeardownPolicy() {
        return this.teardownPolicy;
    }

    /**
     * Zone to run the worker pools in. If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="zone", required=true)
      private final String zone;

    public String getZone() {
        return this.zone;
    }

    public WorkerPoolResponse(
        AutoscalingSettingsResponse autoscalingSettings,
        List<DiskResponse> dataDisks,
        String defaultPackageSet,
        Integer diskSizeGb,
        String diskSourceImage,
        String diskType,
        String ipConfiguration,
        String kind,
        String machineType,
        Map<String,String> metadata,
        String network,
        Integer numThreadsPerWorker,
        Integer numWorkers,
        String onHostMaintenance,
        List<PackageResponse> packages,
        Map<String,String> poolArgs,
        List<SdkHarnessContainerImageResponse> sdkHarnessContainerImages,
        String subnetwork,
        TaskRunnerSettingsResponse taskrunnerSettings,
        String teardownPolicy,
        String zone) {
        this.autoscalingSettings = Objects.requireNonNull(autoscalingSettings, "expected parameter 'autoscalingSettings' to be non-null");
        this.dataDisks = Objects.requireNonNull(dataDisks, "expected parameter 'dataDisks' to be non-null");
        this.defaultPackageSet = Objects.requireNonNull(defaultPackageSet, "expected parameter 'defaultPackageSet' to be non-null");
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.diskSourceImage = Objects.requireNonNull(diskSourceImage, "expected parameter 'diskSourceImage' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.ipConfiguration = Objects.requireNonNull(ipConfiguration, "expected parameter 'ipConfiguration' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.numThreadsPerWorker = Objects.requireNonNull(numThreadsPerWorker, "expected parameter 'numThreadsPerWorker' to be non-null");
        this.numWorkers = Objects.requireNonNull(numWorkers, "expected parameter 'numWorkers' to be non-null");
        this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance, "expected parameter 'onHostMaintenance' to be non-null");
        this.packages = Objects.requireNonNull(packages, "expected parameter 'packages' to be non-null");
        this.poolArgs = Objects.requireNonNull(poolArgs, "expected parameter 'poolArgs' to be non-null");
        this.sdkHarnessContainerImages = Objects.requireNonNull(sdkHarnessContainerImages, "expected parameter 'sdkHarnessContainerImages' to be non-null");
        this.subnetwork = Objects.requireNonNull(subnetwork, "expected parameter 'subnetwork' to be non-null");
        this.taskrunnerSettings = Objects.requireNonNull(taskrunnerSettings, "expected parameter 'taskrunnerSettings' to be non-null");
        this.teardownPolicy = Objects.requireNonNull(teardownPolicy, "expected parameter 'teardownPolicy' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private WorkerPoolResponse() {
        this.autoscalingSettings = null;
        this.dataDisks = List.of();
        this.defaultPackageSet = null;
        this.diskSizeGb = null;
        this.diskSourceImage = null;
        this.diskType = null;
        this.ipConfiguration = null;
        this.kind = null;
        this.machineType = null;
        this.metadata = Map.of();
        this.network = null;
        this.numThreadsPerWorker = null;
        this.numWorkers = null;
        this.onHostMaintenance = null;
        this.packages = List.of();
        this.poolArgs = Map.of();
        this.sdkHarnessContainerImages = List.of();
        this.subnetwork = null;
        this.taskrunnerSettings = null;
        this.teardownPolicy = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerPoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalingSettingsResponse autoscalingSettings;
        private List<DiskResponse> dataDisks;
        private String defaultPackageSet;
        private Integer diskSizeGb;
        private String diskSourceImage;
        private String diskType;
        private String ipConfiguration;
        private String kind;
        private String machineType;
        private Map<String,String> metadata;
        private String network;
        private Integer numThreadsPerWorker;
        private Integer numWorkers;
        private String onHostMaintenance;
        private List<PackageResponse> packages;
        private Map<String,String> poolArgs;
        private List<SdkHarnessContainerImageResponse> sdkHarnessContainerImages;
        private String subnetwork;
        private TaskRunnerSettingsResponse taskrunnerSettings;
        private String teardownPolicy;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerPoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingSettings = defaults.autoscalingSettings;
    	      this.dataDisks = defaults.dataDisks;
    	      this.defaultPackageSet = defaults.defaultPackageSet;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskSourceImage = defaults.diskSourceImage;
    	      this.diskType = defaults.diskType;
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.kind = defaults.kind;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.network = defaults.network;
    	      this.numThreadsPerWorker = defaults.numThreadsPerWorker;
    	      this.numWorkers = defaults.numWorkers;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.packages = defaults.packages;
    	      this.poolArgs = defaults.poolArgs;
    	      this.sdkHarnessContainerImages = defaults.sdkHarnessContainerImages;
    	      this.subnetwork = defaults.subnetwork;
    	      this.taskrunnerSettings = defaults.taskrunnerSettings;
    	      this.teardownPolicy = defaults.teardownPolicy;
    	      this.zone = defaults.zone;
        }

        public Builder autoscalingSettings(AutoscalingSettingsResponse autoscalingSettings) {
            this.autoscalingSettings = Objects.requireNonNull(autoscalingSettings);
            return this;
        }
        public Builder dataDisks(List<DiskResponse> dataDisks) {
            this.dataDisks = Objects.requireNonNull(dataDisks);
            return this;
        }
        public Builder dataDisks(DiskResponse... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }
        public Builder defaultPackageSet(String defaultPackageSet) {
            this.defaultPackageSet = Objects.requireNonNull(defaultPackageSet);
            return this;
        }
        public Builder diskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder diskSourceImage(String diskSourceImage) {
            this.diskSourceImage = Objects.requireNonNull(diskSourceImage);
            return this;
        }
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        public Builder ipConfiguration(String ipConfiguration) {
            this.ipConfiguration = Objects.requireNonNull(ipConfiguration);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder numThreadsPerWorker(Integer numThreadsPerWorker) {
            this.numThreadsPerWorker = Objects.requireNonNull(numThreadsPerWorker);
            return this;
        }
        public Builder numWorkers(Integer numWorkers) {
            this.numWorkers = Objects.requireNonNull(numWorkers);
            return this;
        }
        public Builder onHostMaintenance(String onHostMaintenance) {
            this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance);
            return this;
        }
        public Builder packages(List<PackageResponse> packages) {
            this.packages = Objects.requireNonNull(packages);
            return this;
        }
        public Builder packages(PackageResponse... packages) {
            return packages(List.of(packages));
        }
        public Builder poolArgs(Map<String,String> poolArgs) {
            this.poolArgs = Objects.requireNonNull(poolArgs);
            return this;
        }
        public Builder sdkHarnessContainerImages(List<SdkHarnessContainerImageResponse> sdkHarnessContainerImages) {
            this.sdkHarnessContainerImages = Objects.requireNonNull(sdkHarnessContainerImages);
            return this;
        }
        public Builder sdkHarnessContainerImages(SdkHarnessContainerImageResponse... sdkHarnessContainerImages) {
            return sdkHarnessContainerImages(List.of(sdkHarnessContainerImages));
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public Builder taskrunnerSettings(TaskRunnerSettingsResponse taskrunnerSettings) {
            this.taskrunnerSettings = Objects.requireNonNull(taskrunnerSettings);
            return this;
        }
        public Builder teardownPolicy(String teardownPolicy) {
            this.teardownPolicy = Objects.requireNonNull(teardownPolicy);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public WorkerPoolResponse build() {
            return new WorkerPoolResponse(autoscalingSettings, dataDisks, defaultPackageSet, diskSizeGb, diskSourceImage, diskType, ipConfiguration, kind, machineType, metadata, network, numThreadsPerWorker, numWorkers, onHostMaintenance, packages, poolArgs, sdkHarnessContainerImages, subnetwork, taskrunnerSettings, teardownPolicy, zone);
        }
    }
}
