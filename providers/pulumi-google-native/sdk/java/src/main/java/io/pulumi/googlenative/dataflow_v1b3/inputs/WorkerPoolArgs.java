// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataflow_v1b3.enums.WorkerPoolDefaultPackageSet;
import io.pulumi.googlenative.dataflow_v1b3.enums.WorkerPoolIpConfiguration;
import io.pulumi.googlenative.dataflow_v1b3.enums.WorkerPoolTeardownPolicy;
import io.pulumi.googlenative.dataflow_v1b3.inputs.AutoscalingSettingsArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.DiskArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.PackageArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.SdkHarnessContainerImageArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.TaskRunnerSettingsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes one particular pool of Cloud Dataflow workers to be instantiated by the Cloud Dataflow service in order to perform the computations required by a job. Note that a workflow job may use multiple pools, in order to match the various computational requirements of the various stages of the job.
 * 
 */
public final class WorkerPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkerPoolArgs Empty = new WorkerPoolArgs();

    /**
     * Settings for autoscaling of this WorkerPool.
     * 
     */
    @InputImport(name="autoscalingSettings")
      private final @Nullable Output<AutoscalingSettingsArgs> autoscalingSettings;

    public Output<AutoscalingSettingsArgs> getAutoscalingSettings() {
        return this.autoscalingSettings == null ? Output.empty() : this.autoscalingSettings;
    }

    /**
     * Data disks that are used by a VM in this workflow.
     * 
     */
    @InputImport(name="dataDisks")
      private final @Nullable Output<List<DiskArgs>> dataDisks;

    public Output<List<DiskArgs>> getDataDisks() {
        return this.dataDisks == null ? Output.empty() : this.dataDisks;
    }

    /**
     * The default package set to install. This allows the service to select a default set of packages which are useful to worker harnesses written in a particular language.
     * 
     */
    @InputImport(name="defaultPackageSet")
      private final @Nullable Output<WorkerPoolDefaultPackageSet> defaultPackageSet;

    public Output<WorkerPoolDefaultPackageSet> getDefaultPackageSet() {
        return this.defaultPackageSet == null ? Output.empty() : this.defaultPackageSet;
    }

    /**
     * Size of root disk for VMs, in GB. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @InputImport(name="diskSizeGb")
      private final @Nullable Output<Integer> diskSizeGb;

    public Output<Integer> getDiskSizeGb() {
        return this.diskSizeGb == null ? Output.empty() : this.diskSizeGb;
    }

    /**
     * Fully qualified source image for disks.
     * 
     */
    @InputImport(name="diskSourceImage")
      private final @Nullable Output<String> diskSourceImage;

    public Output<String> getDiskSourceImage() {
        return this.diskSourceImage == null ? Output.empty() : this.diskSourceImage;
    }

    /**
     * Type of root disk for VMs. If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @InputImport(name="diskType")
      private final @Nullable Output<String> diskType;

    public Output<String> getDiskType() {
        return this.diskType == null ? Output.empty() : this.diskType;
    }

    /**
     * Configuration for VM IPs.
     * 
     */
    @InputImport(name="ipConfiguration")
      private final @Nullable Output<WorkerPoolIpConfiguration> ipConfiguration;

    public Output<WorkerPoolIpConfiguration> getIpConfiguration() {
        return this.ipConfiguration == null ? Output.empty() : this.ipConfiguration;
    }

    /**
     * The kind of the worker pool; currently only `harness` and `shuffle` are supported.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Machine type (e.g. "n1-standard-1"). If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @InputImport(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType == null ? Output.empty() : this.machineType;
    }

    /**
     * Metadata to set on the Google Compute Engine VMs.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * Network to which VMs will be assigned. If empty or unspecified, the service will use the network "default".
     * 
     */
    @InputImport(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * The number of threads per worker harness. If empty or unspecified, the service will choose a number of threads (according to the number of cores on the selected machine type for batch, or 1 by convention for streaming).
     * 
     */
    @InputImport(name="numThreadsPerWorker")
      private final @Nullable Output<Integer> numThreadsPerWorker;

    public Output<Integer> getNumThreadsPerWorker() {
        return this.numThreadsPerWorker == null ? Output.empty() : this.numThreadsPerWorker;
    }

    /**
     * Number of Google Compute Engine workers in this pool needed to execute the job. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @InputImport(name="numWorkers")
      private final @Nullable Output<Integer> numWorkers;

    public Output<Integer> getNumWorkers() {
        return this.numWorkers == null ? Output.empty() : this.numWorkers;
    }

    /**
     * The action to take on host maintenance, as defined by the Google Compute Engine API.
     * 
     */
    @InputImport(name="onHostMaintenance")
      private final @Nullable Output<String> onHostMaintenance;

    public Output<String> getOnHostMaintenance() {
        return this.onHostMaintenance == null ? Output.empty() : this.onHostMaintenance;
    }

    /**
     * Packages to be installed on workers.
     * 
     */
    @InputImport(name="packages")
      private final @Nullable Output<List<PackageArgs>> packages;

    public Output<List<PackageArgs>> getPackages() {
        return this.packages == null ? Output.empty() : this.packages;
    }

    /**
     * Extra arguments for this worker pool.
     * 
     */
    @InputImport(name="poolArgs")
      private final @Nullable Output<Map<String,String>> poolArgs;

    public Output<Map<String,String>> getPoolArgs() {
        return this.poolArgs == null ? Output.empty() : this.poolArgs;
    }

    /**
     * Set of SDK harness containers needed to execute this pipeline. This will only be set in the Fn API path. For non-cross-language pipelines this should have only one entry. Cross-language pipelines will have two or more entries.
     * 
     */
    @InputImport(name="sdkHarnessContainerImages")
      private final @Nullable Output<List<SdkHarnessContainerImageArgs>> sdkHarnessContainerImages;

    public Output<List<SdkHarnessContainerImageArgs>> getSdkHarnessContainerImages() {
        return this.sdkHarnessContainerImages == null ? Output.empty() : this.sdkHarnessContainerImages;
    }

    /**
     * Subnetwork to which VMs will be assigned, if desired. Expected to be of the form "regions/REGION/subnetworks/SUBNETWORK".
     * 
     */
    @InputImport(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> getSubnetwork() {
        return this.subnetwork == null ? Output.empty() : this.subnetwork;
    }

    /**
     * Settings passed through to Google Compute Engine workers when using the standard Dataflow task runner. Users should ignore this field.
     * 
     */
    @InputImport(name="taskrunnerSettings")
      private final @Nullable Output<TaskRunnerSettingsArgs> taskrunnerSettings;

    public Output<TaskRunnerSettingsArgs> getTaskrunnerSettings() {
        return this.taskrunnerSettings == null ? Output.empty() : this.taskrunnerSettings;
    }

    /**
     * Sets the policy for determining when to turndown worker pool. Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and `TEARDOWN_NEVER`. `TEARDOWN_ALWAYS` means workers are always torn down regardless of whether the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn down. If the workers are not torn down by the service, they will continue to run and use Google Compute Engine VM resources in the user's project until they are explicitly terminated by the user. Because of this, Google recommends using the `TEARDOWN_ALWAYS` policy except for small, manually supervised test jobs. If unknown or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @InputImport(name="teardownPolicy")
      private final @Nullable Output<WorkerPoolTeardownPolicy> teardownPolicy;

    public Output<WorkerPoolTeardownPolicy> getTeardownPolicy() {
        return this.teardownPolicy == null ? Output.empty() : this.teardownPolicy;
    }

    /**
     * Zone to run the worker pools in. If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public WorkerPoolArgs(
        @Nullable Output<AutoscalingSettingsArgs> autoscalingSettings,
        @Nullable Output<List<DiskArgs>> dataDisks,
        @Nullable Output<WorkerPoolDefaultPackageSet> defaultPackageSet,
        @Nullable Output<Integer> diskSizeGb,
        @Nullable Output<String> diskSourceImage,
        @Nullable Output<String> diskType,
        @Nullable Output<WorkerPoolIpConfiguration> ipConfiguration,
        @Nullable Output<String> kind,
        @Nullable Output<String> machineType,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> network,
        @Nullable Output<Integer> numThreadsPerWorker,
        @Nullable Output<Integer> numWorkers,
        @Nullable Output<String> onHostMaintenance,
        @Nullable Output<List<PackageArgs>> packages,
        @Nullable Output<Map<String,String>> poolArgs,
        @Nullable Output<List<SdkHarnessContainerImageArgs>> sdkHarnessContainerImages,
        @Nullable Output<String> subnetwork,
        @Nullable Output<TaskRunnerSettingsArgs> taskrunnerSettings,
        @Nullable Output<WorkerPoolTeardownPolicy> teardownPolicy,
        @Nullable Output<String> zone) {
        this.autoscalingSettings = autoscalingSettings;
        this.dataDisks = dataDisks;
        this.defaultPackageSet = defaultPackageSet;
        this.diskSizeGb = diskSizeGb;
        this.diskSourceImage = diskSourceImage;
        this.diskType = diskType;
        this.ipConfiguration = ipConfiguration;
        this.kind = kind;
        this.machineType = machineType;
        this.metadata = metadata;
        this.network = network;
        this.numThreadsPerWorker = numThreadsPerWorker;
        this.numWorkers = numWorkers;
        this.onHostMaintenance = onHostMaintenance;
        this.packages = packages;
        this.poolArgs = poolArgs;
        this.sdkHarnessContainerImages = sdkHarnessContainerImages;
        this.subnetwork = subnetwork;
        this.taskrunnerSettings = taskrunnerSettings;
        this.teardownPolicy = teardownPolicy;
        this.zone = zone;
    }

    private WorkerPoolArgs() {
        this.autoscalingSettings = Output.empty();
        this.dataDisks = Output.empty();
        this.defaultPackageSet = Output.empty();
        this.diskSizeGb = Output.empty();
        this.diskSourceImage = Output.empty();
        this.diskType = Output.empty();
        this.ipConfiguration = Output.empty();
        this.kind = Output.empty();
        this.machineType = Output.empty();
        this.metadata = Output.empty();
        this.network = Output.empty();
        this.numThreadsPerWorker = Output.empty();
        this.numWorkers = Output.empty();
        this.onHostMaintenance = Output.empty();
        this.packages = Output.empty();
        this.poolArgs = Output.empty();
        this.sdkHarnessContainerImages = Output.empty();
        this.subnetwork = Output.empty();
        this.taskrunnerSettings = Output.empty();
        this.teardownPolicy = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AutoscalingSettingsArgs> autoscalingSettings;
        private @Nullable Output<List<DiskArgs>> dataDisks;
        private @Nullable Output<WorkerPoolDefaultPackageSet> defaultPackageSet;
        private @Nullable Output<Integer> diskSizeGb;
        private @Nullable Output<String> diskSourceImage;
        private @Nullable Output<String> diskType;
        private @Nullable Output<WorkerPoolIpConfiguration> ipConfiguration;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> machineType;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> network;
        private @Nullable Output<Integer> numThreadsPerWorker;
        private @Nullable Output<Integer> numWorkers;
        private @Nullable Output<String> onHostMaintenance;
        private @Nullable Output<List<PackageArgs>> packages;
        private @Nullable Output<Map<String,String>> poolArgs;
        private @Nullable Output<List<SdkHarnessContainerImageArgs>> sdkHarnessContainerImages;
        private @Nullable Output<String> subnetwork;
        private @Nullable Output<TaskRunnerSettingsArgs> taskrunnerSettings;
        private @Nullable Output<WorkerPoolTeardownPolicy> teardownPolicy;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerPoolArgs defaults) {
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

        public Builder autoscalingSettings(@Nullable Output<AutoscalingSettingsArgs> autoscalingSettings) {
            this.autoscalingSettings = autoscalingSettings;
            return this;
        }

        public Builder autoscalingSettings(@Nullable AutoscalingSettingsArgs autoscalingSettings) {
            this.autoscalingSettings = Output.ofNullable(autoscalingSettings);
            return this;
        }

        public Builder dataDisks(@Nullable Output<List<DiskArgs>> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        public Builder dataDisks(@Nullable List<DiskArgs> dataDisks) {
            this.dataDisks = Output.ofNullable(dataDisks);
            return this;
        }

        public Builder defaultPackageSet(@Nullable Output<WorkerPoolDefaultPackageSet> defaultPackageSet) {
            this.defaultPackageSet = defaultPackageSet;
            return this;
        }

        public Builder defaultPackageSet(@Nullable WorkerPoolDefaultPackageSet defaultPackageSet) {
            this.defaultPackageSet = Output.ofNullable(defaultPackageSet);
            return this;
        }

        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = Output.ofNullable(diskSizeGb);
            return this;
        }

        public Builder diskSourceImage(@Nullable Output<String> diskSourceImage) {
            this.diskSourceImage = diskSourceImage;
            return this;
        }

        public Builder diskSourceImage(@Nullable String diskSourceImage) {
            this.diskSourceImage = Output.ofNullable(diskSourceImage);
            return this;
        }

        public Builder diskType(@Nullable Output<String> diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder diskType(@Nullable String diskType) {
            this.diskType = Output.ofNullable(diskType);
            return this;
        }

        public Builder ipConfiguration(@Nullable Output<WorkerPoolIpConfiguration> ipConfiguration) {
            this.ipConfiguration = ipConfiguration;
            return this;
        }

        public Builder ipConfiguration(@Nullable WorkerPoolIpConfiguration ipConfiguration) {
            this.ipConfiguration = Output.ofNullable(ipConfiguration);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder machineType(@Nullable Output<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder machineType(@Nullable String machineType) {
            this.machineType = Output.ofNullable(machineType);
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

        public Builder numThreadsPerWorker(@Nullable Output<Integer> numThreadsPerWorker) {
            this.numThreadsPerWorker = numThreadsPerWorker;
            return this;
        }

        public Builder numThreadsPerWorker(@Nullable Integer numThreadsPerWorker) {
            this.numThreadsPerWorker = Output.ofNullable(numThreadsPerWorker);
            return this;
        }

        public Builder numWorkers(@Nullable Output<Integer> numWorkers) {
            this.numWorkers = numWorkers;
            return this;
        }

        public Builder numWorkers(@Nullable Integer numWorkers) {
            this.numWorkers = Output.ofNullable(numWorkers);
            return this;
        }

        public Builder onHostMaintenance(@Nullable Output<String> onHostMaintenance) {
            this.onHostMaintenance = onHostMaintenance;
            return this;
        }

        public Builder onHostMaintenance(@Nullable String onHostMaintenance) {
            this.onHostMaintenance = Output.ofNullable(onHostMaintenance);
            return this;
        }

        public Builder packages(@Nullable Output<List<PackageArgs>> packages) {
            this.packages = packages;
            return this;
        }

        public Builder packages(@Nullable List<PackageArgs> packages) {
            this.packages = Output.ofNullable(packages);
            return this;
        }

        public Builder poolArgs(@Nullable Output<Map<String,String>> poolArgs) {
            this.poolArgs = poolArgs;
            return this;
        }

        public Builder poolArgs(@Nullable Map<String,String> poolArgs) {
            this.poolArgs = Output.ofNullable(poolArgs);
            return this;
        }

        public Builder sdkHarnessContainerImages(@Nullable Output<List<SdkHarnessContainerImageArgs>> sdkHarnessContainerImages) {
            this.sdkHarnessContainerImages = sdkHarnessContainerImages;
            return this;
        }

        public Builder sdkHarnessContainerImages(@Nullable List<SdkHarnessContainerImageArgs> sdkHarnessContainerImages) {
            this.sdkHarnessContainerImages = Output.ofNullable(sdkHarnessContainerImages);
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

        public Builder taskrunnerSettings(@Nullable Output<TaskRunnerSettingsArgs> taskrunnerSettings) {
            this.taskrunnerSettings = taskrunnerSettings;
            return this;
        }

        public Builder taskrunnerSettings(@Nullable TaskRunnerSettingsArgs taskrunnerSettings) {
            this.taskrunnerSettings = Output.ofNullable(taskrunnerSettings);
            return this;
        }

        public Builder teardownPolicy(@Nullable Output<WorkerPoolTeardownPolicy> teardownPolicy) {
            this.teardownPolicy = teardownPolicy;
            return this;
        }

        public Builder teardownPolicy(@Nullable WorkerPoolTeardownPolicy teardownPolicy) {
            this.teardownPolicy = Output.ofNullable(teardownPolicy);
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
        public WorkerPoolArgs build() {
            return new WorkerPoolArgs(autoscalingSettings, dataDisks, defaultPackageSet, diskSizeGb, diskSourceImage, diskType, ipConfiguration, kind, machineType, metadata, network, numThreadsPerWorker, numWorkers, onHostMaintenance, packages, poolArgs, sdkHarnessContainerImages, subnetwork, taskrunnerSettings, teardownPolicy, zone);
        }
    }
}
