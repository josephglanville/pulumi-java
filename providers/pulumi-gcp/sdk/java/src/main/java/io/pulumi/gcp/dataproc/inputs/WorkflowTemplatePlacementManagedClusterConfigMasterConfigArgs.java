// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs();

    /**
     * Optional. The Compute Engine accelerator configuration for these instances.
     * 
     */
    @Import(name="accelerators")
      private final @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorArgs>> accelerators;

    public Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorArgs>> getAccelerators() {
        return this.accelerators == null ? Output.empty() : this.accelerators;
    }

    /**
     * Optional. Disk option config settings.
     * 
     */
    @Import(name="diskConfig")
      private final @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs> diskConfig;

    public Output<WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs> getDiskConfig() {
        return this.diskConfig == null ? Output.empty() : this.diskConfig;
    }

    /**
     * Optional. The Compute Engine image resource used for cluster instances. The URI can represent an image or image family. Image examples: * `https://www.googleapis.com/compute/beta/projects/` If the URI is unspecified, it will be inferred from `SoftwareConfig.image_version` or the system default.
     * 
     */
    @Import(name="image")
      private final @Nullable Output<String> image;

    public Output<String> getImage() {
        return this.image == null ? Output.empty() : this.image;
    }

    /**
     * - 
     * Output only. The list of instance names. Dataproc derives the names from `cluster_name`, `num_instances`, and the instance group.
     * 
     */
    @Import(name="instanceNames")
      private final @Nullable Output<List<String>> instanceNames;

    public Output<List<String>> getInstanceNames() {
        return this.instanceNames == null ? Output.empty() : this.instanceNames;
    }

    /**
     * - 
     * Output only. Specifies that this instance group contains preemptible instances.
     * 
     */
    @Import(name="isPreemptible")
      private final @Nullable Output<Boolean> isPreemptible;

    public Output<Boolean> getIsPreemptible() {
        return this.isPreemptible == null ? Output.empty() : this.isPreemptible;
    }

    /**
     * Optional. The Compute Engine machine type used for cluster instances. A full URL, partial URI, or short name are valid. Examples: * ` https://www.googleapis.com/compute/v1/projects/(https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example,  `n1-standard-2`.
     * 
     */
    @Import(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType == null ? Output.empty() : this.machineType;
    }

    /**
     * - 
     * Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
     * 
     */
    @Import(name="managedGroupConfigs")
      private final @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigArgs>> managedGroupConfigs;

    public Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigArgs>> getManagedGroupConfigs() {
        return this.managedGroupConfigs == null ? Output.empty() : this.managedGroupConfigs;
    }

    /**
     * Optional. Specifies the minimum cpu platform for the Instance Group. See (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
     */
    @Import(name="minCpuPlatform")
      private final @Nullable Output<String> minCpuPlatform;

    public Output<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Output.empty() : this.minCpuPlatform;
    }

    /**
     * Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1.
     * 
     */
    @Import(name="numInstances")
      private final @Nullable Output<Integer> numInstances;

    public Output<Integer> getNumInstances() {
        return this.numInstances == null ? Output.empty() : this.numInstances;
    }

    /**
     * Optional. Specifies the preemptibility of the instance group. The default value for master and worker groups is `NON_PREEMPTIBLE`. This default cannot be changed. The default value for secondary instances is `PREEMPTIBLE`. Possible values: PREEMPTIBILITY_UNSPECIFIED, NON_PREEMPTIBLE, PREEMPTIBLE
     * 
     */
    @Import(name="preemptibility")
      private final @Nullable Output<String> preemptibility;

    public Output<String> getPreemptibility() {
        return this.preemptibility == null ? Output.empty() : this.preemptibility;
    }

    public WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs(
        @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorArgs>> accelerators,
        @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs> diskConfig,
        @Nullable Output<String> image,
        @Nullable Output<List<String>> instanceNames,
        @Nullable Output<Boolean> isPreemptible,
        @Nullable Output<String> machineType,
        @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigArgs>> managedGroupConfigs,
        @Nullable Output<String> minCpuPlatform,
        @Nullable Output<Integer> numInstances,
        @Nullable Output<String> preemptibility) {
        this.accelerators = accelerators;
        this.diskConfig = diskConfig;
        this.image = image;
        this.instanceNames = instanceNames;
        this.isPreemptible = isPreemptible;
        this.machineType = machineType;
        this.managedGroupConfigs = managedGroupConfigs;
        this.minCpuPlatform = minCpuPlatform;
        this.numInstances = numInstances;
        this.preemptibility = preemptibility;
    }

    private WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs() {
        this.accelerators = Output.empty();
        this.diskConfig = Output.empty();
        this.image = Output.empty();
        this.instanceNames = Output.empty();
        this.isPreemptible = Output.empty();
        this.machineType = Output.empty();
        this.managedGroupConfigs = Output.empty();
        this.minCpuPlatform = Output.empty();
        this.numInstances = Output.empty();
        this.preemptibility = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorArgs>> accelerators;
        private @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs> diskConfig;
        private @Nullable Output<String> image;
        private @Nullable Output<List<String>> instanceNames;
        private @Nullable Output<Boolean> isPreemptible;
        private @Nullable Output<String> machineType;
        private @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigArgs>> managedGroupConfigs;
        private @Nullable Output<String> minCpuPlatform;
        private @Nullable Output<Integer> numInstances;
        private @Nullable Output<String> preemptibility;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.diskConfig = defaults.diskConfig;
    	      this.image = defaults.image;
    	      this.instanceNames = defaults.instanceNames;
    	      this.isPreemptible = defaults.isPreemptible;
    	      this.machineType = defaults.machineType;
    	      this.managedGroupConfigs = defaults.managedGroupConfigs;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.numInstances = defaults.numInstances;
    	      this.preemptibility = defaults.preemptibility;
        }

        public Builder accelerators(@Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorArgs>> accelerators) {
            this.accelerators = accelerators;
            return this;
        }
        public Builder accelerators(@Nullable List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorArgs> accelerators) {
            this.accelerators = Output.ofNullable(accelerators);
            return this;
        }
        public Builder accelerators(WorkflowTemplatePlacementManagedClusterConfigMasterConfigAcceleratorArgs... accelerators) {
            return accelerators(List.of(accelerators));
        }
        public Builder diskConfig(@Nullable Output<WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs> diskConfig) {
            this.diskConfig = diskConfig;
            return this;
        }
        public Builder diskConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs diskConfig) {
            this.diskConfig = Output.ofNullable(diskConfig);
            return this;
        }
        public Builder image(@Nullable Output<String> image) {
            this.image = image;
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = Output.ofNullable(image);
            return this;
        }
        public Builder instanceNames(@Nullable Output<List<String>> instanceNames) {
            this.instanceNames = instanceNames;
            return this;
        }
        public Builder instanceNames(@Nullable List<String> instanceNames) {
            this.instanceNames = Output.ofNullable(instanceNames);
            return this;
        }
        public Builder instanceNames(String... instanceNames) {
            return instanceNames(List.of(instanceNames));
        }
        public Builder isPreemptible(@Nullable Output<Boolean> isPreemptible) {
            this.isPreemptible = isPreemptible;
            return this;
        }
        public Builder isPreemptible(@Nullable Boolean isPreemptible) {
            this.isPreemptible = Output.ofNullable(isPreemptible);
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
        public Builder managedGroupConfigs(@Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigArgs>> managedGroupConfigs) {
            this.managedGroupConfigs = managedGroupConfigs;
            return this;
        }
        public Builder managedGroupConfigs(@Nullable List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigArgs> managedGroupConfigs) {
            this.managedGroupConfigs = Output.ofNullable(managedGroupConfigs);
            return this;
        }
        public Builder managedGroupConfigs(WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfigArgs... managedGroupConfigs) {
            return managedGroupConfigs(List.of(managedGroupConfigs));
        }
        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }
        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Output.ofNullable(minCpuPlatform);
            return this;
        }
        public Builder numInstances(@Nullable Output<Integer> numInstances) {
            this.numInstances = numInstances;
            return this;
        }
        public Builder numInstances(@Nullable Integer numInstances) {
            this.numInstances = Output.ofNullable(numInstances);
            return this;
        }
        public Builder preemptibility(@Nullable Output<String> preemptibility) {
            this.preemptibility = preemptibility;
            return this;
        }
        public Builder preemptibility(@Nullable String preemptibility) {
            this.preemptibility = Output.ofNullable(preemptibility);
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs(accelerators, diskConfig, image, instanceNames, isPreemptible, machineType, managedGroupConfigs, minCpuPlatform, numInstances, preemptibility);
        }
    }
}
