// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.MachineLearningServiceErrorResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.NodeStateCountsResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ResourceIdResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ScaleSettingsResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.UserAccountCredentialsResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.VirtualMachineImageResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AmlComputeResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final AmlComputeResponseProperties Empty = new AmlComputeResponseProperties();

    @InputImport(name="allocationState", required=true)
    private final String allocationState;

    public String getAllocationState() {
        return this.allocationState;
    }

    @InputImport(name="allocationStateTransitionTime", required=true)
    private final String allocationStateTransitionTime;

    public String getAllocationStateTransitionTime() {
        return this.allocationStateTransitionTime;
    }

    @InputImport(name="currentNodeCount", required=true)
    private final Integer currentNodeCount;

    public Integer getCurrentNodeCount() {
        return this.currentNodeCount;
    }

    @InputImport(name="enableNodePublicIp")
    private final @Nullable Boolean enableNodePublicIp;

    public Optional<Boolean> getEnableNodePublicIp() {
        return this.enableNodePublicIp == null ? Optional.empty() : Optional.ofNullable(this.enableNodePublicIp);
    }

    @InputImport(name="errors", required=true)
    private final List<MachineLearningServiceErrorResponse> errors;

    public List<MachineLearningServiceErrorResponse> getErrors() {
        return this.errors;
    }

    @InputImport(name="isolatedNetwork")
    private final @Nullable Boolean isolatedNetwork;

    public Optional<Boolean> getIsolatedNetwork() {
        return this.isolatedNetwork == null ? Optional.empty() : Optional.ofNullable(this.isolatedNetwork);
    }

    @InputImport(name="nodeStateCounts", required=true)
    private final NodeStateCountsResponse nodeStateCounts;

    public NodeStateCountsResponse getNodeStateCounts() {
        return this.nodeStateCounts;
    }

    @InputImport(name="osType")
    private final @Nullable String osType;

    public Optional<String> getOsType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    @InputImport(name="remoteLoginPortPublicAccess")
    private final @Nullable String remoteLoginPortPublicAccess;

    public Optional<String> getRemoteLoginPortPublicAccess() {
        return this.remoteLoginPortPublicAccess == null ? Optional.empty() : Optional.ofNullable(this.remoteLoginPortPublicAccess);
    }

    @InputImport(name="scaleSettings")
    private final @Nullable ScaleSettingsResponse scaleSettings;

    public Optional<ScaleSettingsResponse> getScaleSettings() {
        return this.scaleSettings == null ? Optional.empty() : Optional.ofNullable(this.scaleSettings);
    }

    @InputImport(name="subnet")
    private final @Nullable ResourceIdResponse subnet;

    public Optional<ResourceIdResponse> getSubnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    @InputImport(name="targetNodeCount", required=true)
    private final Integer targetNodeCount;

    public Integer getTargetNodeCount() {
        return this.targetNodeCount;
    }

    @InputImport(name="userAccountCredentials")
    private final @Nullable UserAccountCredentialsResponse userAccountCredentials;

    public Optional<UserAccountCredentialsResponse> getUserAccountCredentials() {
        return this.userAccountCredentials == null ? Optional.empty() : Optional.ofNullable(this.userAccountCredentials);
    }

    @InputImport(name="virtualMachineImage")
    private final @Nullable VirtualMachineImageResponse virtualMachineImage;

    public Optional<VirtualMachineImageResponse> getVirtualMachineImage() {
        return this.virtualMachineImage == null ? Optional.empty() : Optional.ofNullable(this.virtualMachineImage);
    }

    @InputImport(name="vmPriority")
    private final @Nullable String vmPriority;

    public Optional<String> getVmPriority() {
        return this.vmPriority == null ? Optional.empty() : Optional.ofNullable(this.vmPriority);
    }

    @InputImport(name="vmSize")
    private final @Nullable String vmSize;

    public Optional<String> getVmSize() {
        return this.vmSize == null ? Optional.empty() : Optional.ofNullable(this.vmSize);
    }

    public AmlComputeResponseProperties(
        String allocationState,
        String allocationStateTransitionTime,
        Integer currentNodeCount,
        @Nullable Boolean enableNodePublicIp,
        List<MachineLearningServiceErrorResponse> errors,
        @Nullable Boolean isolatedNetwork,
        NodeStateCountsResponse nodeStateCounts,
        @Nullable String osType,
        @Nullable String remoteLoginPortPublicAccess,
        @Nullable ScaleSettingsResponse scaleSettings,
        @Nullable ResourceIdResponse subnet,
        Integer targetNodeCount,
        @Nullable UserAccountCredentialsResponse userAccountCredentials,
        @Nullable VirtualMachineImageResponse virtualMachineImage,
        @Nullable String vmPriority,
        @Nullable String vmSize) {
        this.allocationState = Objects.requireNonNull(allocationState, "expected parameter 'allocationState' to be non-null");
        this.allocationStateTransitionTime = Objects.requireNonNull(allocationStateTransitionTime, "expected parameter 'allocationStateTransitionTime' to be non-null");
        this.currentNodeCount = Objects.requireNonNull(currentNodeCount, "expected parameter 'currentNodeCount' to be non-null");
        this.enableNodePublicIp = enableNodePublicIp == null ? true : enableNodePublicIp;
        this.errors = Objects.requireNonNull(errors, "expected parameter 'errors' to be non-null");
        this.isolatedNetwork = isolatedNetwork;
        this.nodeStateCounts = Objects.requireNonNull(nodeStateCounts, "expected parameter 'nodeStateCounts' to be non-null");
        this.osType = osType == null ? "Linux" : osType;
        this.remoteLoginPortPublicAccess = remoteLoginPortPublicAccess == null ? "NotSpecified" : remoteLoginPortPublicAccess;
        this.scaleSettings = scaleSettings;
        this.subnet = subnet;
        this.targetNodeCount = Objects.requireNonNull(targetNodeCount, "expected parameter 'targetNodeCount' to be non-null");
        this.userAccountCredentials = userAccountCredentials;
        this.virtualMachineImage = virtualMachineImage;
        this.vmPriority = vmPriority;
        this.vmSize = vmSize;
    }

    private AmlComputeResponseProperties() {
        this.allocationState = null;
        this.allocationStateTransitionTime = null;
        this.currentNodeCount = null;
        this.enableNodePublicIp = null;
        this.errors = List.of();
        this.isolatedNetwork = null;
        this.nodeStateCounts = null;
        this.osType = null;
        this.remoteLoginPortPublicAccess = null;
        this.scaleSettings = null;
        this.subnet = null;
        this.targetNodeCount = null;
        this.userAccountCredentials = null;
        this.virtualMachineImage = null;
        this.vmPriority = null;
        this.vmSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmlComputeResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationState;
        private String allocationStateTransitionTime;
        private Integer currentNodeCount;
        private @Nullable Boolean enableNodePublicIp;
        private List<MachineLearningServiceErrorResponse> errors;
        private @Nullable Boolean isolatedNetwork;
        private NodeStateCountsResponse nodeStateCounts;
        private @Nullable String osType;
        private @Nullable String remoteLoginPortPublicAccess;
        private @Nullable ScaleSettingsResponse scaleSettings;
        private @Nullable ResourceIdResponse subnet;
        private Integer targetNodeCount;
        private @Nullable UserAccountCredentialsResponse userAccountCredentials;
        private @Nullable VirtualMachineImageResponse virtualMachineImage;
        private @Nullable String vmPriority;
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(AmlComputeResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationState = defaults.allocationState;
    	      this.allocationStateTransitionTime = defaults.allocationStateTransitionTime;
    	      this.currentNodeCount = defaults.currentNodeCount;
    	      this.enableNodePublicIp = defaults.enableNodePublicIp;
    	      this.errors = defaults.errors;
    	      this.isolatedNetwork = defaults.isolatedNetwork;
    	      this.nodeStateCounts = defaults.nodeStateCounts;
    	      this.osType = defaults.osType;
    	      this.remoteLoginPortPublicAccess = defaults.remoteLoginPortPublicAccess;
    	      this.scaleSettings = defaults.scaleSettings;
    	      this.subnet = defaults.subnet;
    	      this.targetNodeCount = defaults.targetNodeCount;
    	      this.userAccountCredentials = defaults.userAccountCredentials;
    	      this.virtualMachineImage = defaults.virtualMachineImage;
    	      this.vmPriority = defaults.vmPriority;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setAllocationState(String allocationState) {
            this.allocationState = Objects.requireNonNull(allocationState);
            return this;
        }

        public Builder setAllocationStateTransitionTime(String allocationStateTransitionTime) {
            this.allocationStateTransitionTime = Objects.requireNonNull(allocationStateTransitionTime);
            return this;
        }

        public Builder setCurrentNodeCount(Integer currentNodeCount) {
            this.currentNodeCount = Objects.requireNonNull(currentNodeCount);
            return this;
        }

        public Builder setEnableNodePublicIp(@Nullable Boolean enableNodePublicIp) {
            this.enableNodePublicIp = enableNodePublicIp;
            return this;
        }

        public Builder setErrors(List<MachineLearningServiceErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setIsolatedNetwork(@Nullable Boolean isolatedNetwork) {
            this.isolatedNetwork = isolatedNetwork;
            return this;
        }

        public Builder setNodeStateCounts(NodeStateCountsResponse nodeStateCounts) {
            this.nodeStateCounts = Objects.requireNonNull(nodeStateCounts);
            return this;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder setRemoteLoginPortPublicAccess(@Nullable String remoteLoginPortPublicAccess) {
            this.remoteLoginPortPublicAccess = remoteLoginPortPublicAccess;
            return this;
        }

        public Builder setScaleSettings(@Nullable ScaleSettingsResponse scaleSettings) {
            this.scaleSettings = scaleSettings;
            return this;
        }

        public Builder setSubnet(@Nullable ResourceIdResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setTargetNodeCount(Integer targetNodeCount) {
            this.targetNodeCount = Objects.requireNonNull(targetNodeCount);
            return this;
        }

        public Builder setUserAccountCredentials(@Nullable UserAccountCredentialsResponse userAccountCredentials) {
            this.userAccountCredentials = userAccountCredentials;
            return this;
        }

        public Builder setVirtualMachineImage(@Nullable VirtualMachineImageResponse virtualMachineImage) {
            this.virtualMachineImage = virtualMachineImage;
            return this;
        }

        public Builder setVmPriority(@Nullable String vmPriority) {
            this.vmPriority = vmPriority;
            return this;
        }

        public Builder setVmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public AmlComputeResponseProperties build() {
            return new AmlComputeResponseProperties(allocationState, allocationStateTransitionTime, currentNodeCount, enableNodePublicIp, errors, isolatedNetwork, nodeStateCounts, osType, remoteLoginPortPublicAccess, scaleSettings, subnet, targetNodeCount, userAccountCredentials, virtualMachineImage, vmPriority, vmSize);
        }
    }
}