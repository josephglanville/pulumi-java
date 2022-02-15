// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs.GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse Empty = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse();

    @InputImport(name="accelerator", required=true)
    private final GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse accelerator;

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse getAccelerator() {
        return this.accelerator;
    }

    @InputImport(name="diskSizeGb", required=true)
    private final String diskSizeGb;

    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }

    @InputImport(name="diskType", required=true)
    private final String diskType;

    public String getDiskType() {
        return this.diskType;
    }

    @InputImport(name="labels", required=true)
    private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    @InputImport(name="machineType", required=true)
    private final String machineType;

    public String getMachineType() {
        return this.machineType;
    }

    @InputImport(name="maxConcurrentActions", required=true)
    private final String maxConcurrentActions;

    public String getMaxConcurrentActions() {
        return this.maxConcurrentActions;
    }

    @InputImport(name="minCpuPlatform", required=true)
    private final String minCpuPlatform;

    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }

    @InputImport(name="networkAccess", required=true)
    private final String networkAccess;

    public String getNetworkAccess() {
        return this.networkAccess;
    }

    @InputImport(name="reserved", required=true)
    private final Boolean reserved;

    public Boolean getReserved() {
        return this.reserved;
    }

    @InputImport(name="soleTenantNodeType", required=true)
    private final String soleTenantNodeType;

    public String getSoleTenantNodeType() {
        return this.soleTenantNodeType;
    }

    @InputImport(name="vmImage", required=true)
    private final String vmImage;

    public String getVmImage() {
        return this.vmImage;
    }

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse(
        GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse accelerator,
        String diskSizeGb,
        String diskType,
        Map<String,String> labels,
        String machineType,
        String maxConcurrentActions,
        String minCpuPlatform,
        String networkAccess,
        Boolean reserved,
        String soleTenantNodeType,
        String vmImage) {
        this.accelerator = Objects.requireNonNull(accelerator, "expected parameter 'accelerator' to be non-null");
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.maxConcurrentActions = Objects.requireNonNull(maxConcurrentActions, "expected parameter 'maxConcurrentActions' to be non-null");
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform, "expected parameter 'minCpuPlatform' to be non-null");
        this.networkAccess = Objects.requireNonNull(networkAccess, "expected parameter 'networkAccess' to be non-null");
        this.reserved = Objects.requireNonNull(reserved, "expected parameter 'reserved' to be non-null");
        this.soleTenantNodeType = Objects.requireNonNull(soleTenantNodeType, "expected parameter 'soleTenantNodeType' to be non-null");
        this.vmImage = Objects.requireNonNull(vmImage, "expected parameter 'vmImage' to be non-null");
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse() {
        this.accelerator = null;
        this.diskSizeGb = null;
        this.diskType = null;
        this.labels = Map.of();
        this.machineType = null;
        this.maxConcurrentActions = null;
        this.minCpuPlatform = null;
        this.networkAccess = null;
        this.reserved = null;
        this.soleTenantNodeType = null;
        this.vmImage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse accelerator;
        private String diskSizeGb;
        private String diskType;
        private Map<String,String> labels;
        private String machineType;
        private String maxConcurrentActions;
        private String minCpuPlatform;
        private String networkAccess;
        private Boolean reserved;
        private String soleTenantNodeType;
        private String vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse defaults) {
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

        public Builder setAccelerator(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse accelerator) {
            this.accelerator = Objects.requireNonNull(accelerator);
            return this;
        }

        public Builder setDiskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setDiskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMaxConcurrentActions(String maxConcurrentActions) {
            this.maxConcurrentActions = Objects.requireNonNull(maxConcurrentActions);
            return this;
        }

        public Builder setMinCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }

        public Builder setNetworkAccess(String networkAccess) {
            this.networkAccess = Objects.requireNonNull(networkAccess);
            return this;
        }

        public Builder setReserved(Boolean reserved) {
            this.reserved = Objects.requireNonNull(reserved);
            return this;
        }

        public Builder setSoleTenantNodeType(String soleTenantNodeType) {
            this.soleTenantNodeType = Objects.requireNonNull(soleTenantNodeType);
            return this;
        }

        public Builder setVmImage(String vmImage) {
            this.vmImage = Objects.requireNonNull(vmImage);
            return this;
        }

        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigResponse(accelerator, diskSizeGb, diskType, labels, machineType, maxConcurrentActions, minCpuPlatform, networkAccess, reserved, soleTenantNodeType, vmImage);
        }
    }
}