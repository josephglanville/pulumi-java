// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs.GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the configuration to be used for creating workers in the worker pool.
 * 
 */
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs Empty = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs();

    /**
     * The accelerator card attached to each VM.
     * 
     */
    @InputImport(name="accelerator")
      private final @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs> accelerator;

    public Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs> getAccelerator() {
        return this.accelerator == null ? Output.empty() : this.accelerator;
    }

    /**
     * Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/
     * 
     */
    @InputImport(name="diskSizeGb", required=true)
      private final Output<String> diskSizeGb;

    public Output<String> getDiskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Disk Type to use for the worker. See [Storage options](https://cloud.google.com/compute/docs/disks/#introduction). Currently only `pd-standard` and `pd-ssd` are supported.
     * 
     */
    @InputImport(name="diskType", required=true)
      private final Output<String> diskType;

    public Output<String> getDiskType() {
        return this.diskType;
    }

    /**
     * Labels associated with the workers. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International letters are permitted. Label keys must start with a letter. Label values are optional. There can not be more than 64 labels per resource.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Machine type of the worker, such as `e2-standard-2`. See https://cloud.google.com/compute/docs/machine-types for a list of supported machine types. Note that `f1-micro` and `g1-small` are not yet supported.
     * 
     */
    @InputImport(name="machineType", required=true)
      private final Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType;
    }

    /**
     * The maximum number of actions a worker can execute concurrently.
     * 
     */
    @InputImport(name="maxConcurrentActions")
      private final @Nullable Output<String> maxConcurrentActions;

    public Output<String> getMaxConcurrentActions() {
        return this.maxConcurrentActions == null ? Output.empty() : this.maxConcurrentActions;
    }

    /**
     * Minimum CPU platform to use when creating the worker. See [CPU Platforms](https://cloud.google.com/compute/docs/cpu-platforms).
     * 
     */
    @InputImport(name="minCpuPlatform")
      private final @Nullable Output<String> minCpuPlatform;

    public Output<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Output.empty() : this.minCpuPlatform;
    }

    /**
     * Determines the type of network access granted to workers. Possible values: - "public": Workers can connect to the public internet. - "private": Workers can only connect to Google APIs and services. - "restricted-private": Workers can only connect to Google APIs that are reachable through `restricted.googleapis.com` (`199.36.153.4/30`).
     * 
     */
    @InputImport(name="networkAccess")
      private final @Nullable Output<String> networkAccess;

    public Output<String> getNetworkAccess() {
        return this.networkAccess == null ? Output.empty() : this.networkAccess;
    }

    /**
     * Determines whether the worker is reserved (equivalent to a Compute Engine on-demand VM and therefore won't be preempted). See [Preemptible VMs](https://cloud.google.com/preemptible-vms/) for more details.
     * 
     */
    @InputImport(name="reserved")
      private final @Nullable Output<Boolean> reserved;

    public Output<Boolean> getReserved() {
        return this.reserved == null ? Output.empty() : this.reserved;
    }

    /**
     * The node type name to be used for sole-tenant nodes.
     * 
     */
    @InputImport(name="soleTenantNodeType")
      private final @Nullable Output<String> soleTenantNodeType;

    public Output<String> getSoleTenantNodeType() {
        return this.soleTenantNodeType == null ? Output.empty() : this.soleTenantNodeType;
    }

    /**
     * The name of the image used by each VM.
     * 
     */
    @InputImport(name="vmImage")
      private final @Nullable Output<String> vmImage;

    public Output<String> getVmImage() {
        return this.vmImage == null ? Output.empty() : this.vmImage;
    }

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs(
        @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs> accelerator,
        Output<String> diskSizeGb,
        Output<String> diskType,
        @Nullable Output<Map<String,String>> labels,
        Output<String> machineType,
        @Nullable Output<String> maxConcurrentActions,
        @Nullable Output<String> minCpuPlatform,
        @Nullable Output<String> networkAccess,
        @Nullable Output<Boolean> reserved,
        @Nullable Output<String> soleTenantNodeType,
        @Nullable Output<String> vmImage) {
        this.accelerator = accelerator;
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.labels = labels;
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.maxConcurrentActions = maxConcurrentActions;
        this.minCpuPlatform = minCpuPlatform;
        this.networkAccess = networkAccess;
        this.reserved = reserved;
        this.soleTenantNodeType = soleTenantNodeType;
        this.vmImage = vmImage;
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs() {
        this.accelerator = Output.empty();
        this.diskSizeGb = Output.empty();
        this.diskType = Output.empty();
        this.labels = Output.empty();
        this.machineType = Output.empty();
        this.maxConcurrentActions = Output.empty();
        this.minCpuPlatform = Output.empty();
        this.networkAccess = Output.empty();
        this.reserved = Output.empty();
        this.soleTenantNodeType = Output.empty();
        this.vmImage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs> accelerator;
        private Output<String> diskSizeGb;
        private Output<String> diskType;
        private @Nullable Output<Map<String,String>> labels;
        private Output<String> machineType;
        private @Nullable Output<String> maxConcurrentActions;
        private @Nullable Output<String> minCpuPlatform;
        private @Nullable Output<String> networkAccess;
        private @Nullable Output<Boolean> reserved;
        private @Nullable Output<String> soleTenantNodeType;
        private @Nullable Output<String> vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerator = defaults.accelerator;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.maxConcurrentActions = defaults.maxConcurrentActions;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.networkAccess = defaults.networkAccess;
    	      this.reserved = defaults.reserved;
    	      this.soleTenantNodeType = defaults.soleTenantNodeType;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder accelerator(@Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs> accelerator) {
            this.accelerator = accelerator;
            return this;
        }

        public Builder accelerator(@Nullable GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs accelerator) {
            this.accelerator = Output.ofNullable(accelerator);
            return this;
        }

        public Builder diskSizeGb(Output<String> diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Output.of(Objects.requireNonNull(diskSizeGb));
            return this;
        }

        public Builder diskType(Output<String> diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder diskType(String diskType) {
            this.diskType = Output.of(Objects.requireNonNull(diskType));
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder machineType(Output<String> machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder machineType(String machineType) {
            this.machineType = Output.of(Objects.requireNonNull(machineType));
            return this;
        }

        public Builder maxConcurrentActions(@Nullable Output<String> maxConcurrentActions) {
            this.maxConcurrentActions = maxConcurrentActions;
            return this;
        }

        public Builder maxConcurrentActions(@Nullable String maxConcurrentActions) {
            this.maxConcurrentActions = Output.ofNullable(maxConcurrentActions);
            return this;
        }

        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Output.ofNullable(minCpuPlatform);
            return this;
        }

        public Builder networkAccess(@Nullable Output<String> networkAccess) {
            this.networkAccess = networkAccess;
            return this;
        }

        public Builder networkAccess(@Nullable String networkAccess) {
            this.networkAccess = Output.ofNullable(networkAccess);
            return this;
        }

        public Builder reserved(@Nullable Output<Boolean> reserved) {
            this.reserved = reserved;
            return this;
        }

        public Builder reserved(@Nullable Boolean reserved) {
            this.reserved = Output.ofNullable(reserved);
            return this;
        }

        public Builder soleTenantNodeType(@Nullable Output<String> soleTenantNodeType) {
            this.soleTenantNodeType = soleTenantNodeType;
            return this;
        }

        public Builder soleTenantNodeType(@Nullable String soleTenantNodeType) {
            this.soleTenantNodeType = Output.ofNullable(soleTenantNodeType);
            return this;
        }

        public Builder vmImage(@Nullable Output<String> vmImage) {
            this.vmImage = vmImage;
            return this;
        }

        public Builder vmImage(@Nullable String vmImage) {
            this.vmImage = Output.ofNullable(vmImage);
            return this;
        }
        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigArgs(accelerator, diskSizeGb, diskType, labels, machineType, maxConcurrentActions, minCpuPlatform, networkAccess, reserved, soleTenantNodeType, vmImage);
        }
    }
}
