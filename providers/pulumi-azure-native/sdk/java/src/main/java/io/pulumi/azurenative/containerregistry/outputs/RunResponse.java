// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.AgentPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.ImageDescriptorResponse;
import io.pulumi.azurenative.containerregistry.outputs.ImageUpdateTriggerResponse;
import io.pulumi.azurenative.containerregistry.outputs.PlatformPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SourceTriggerDescriptorResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.azurenative.containerregistry.outputs.TimerTriggerDescriptorResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RunResponse {
    private final @Nullable AgentPropertiesResponse agentConfiguration;
    private final @Nullable String agentPoolName;
    private final @Nullable String createTime;
    private final @Nullable List<String> customRegistries;
    private final @Nullable String finishTime;
    private final String id;
    private final @Nullable ImageUpdateTriggerResponse imageUpdateTrigger;
    private final @Nullable Boolean isArchiveEnabled;
    private final @Nullable String lastUpdatedTime;
    private final ImageDescriptorResponse logArtifact;
    private final String name;
    private final @Nullable List<ImageDescriptorResponse> outputImages;
    private final @Nullable PlatformPropertiesResponse platform;
    private final @Nullable String provisioningState;
    private final String runErrorMessage;
    private final @Nullable String runId;
    private final @Nullable String runType;
    private final @Nullable String sourceRegistryAuth;
    private final @Nullable SourceTriggerDescriptorResponse sourceTrigger;
    private final @Nullable String startTime;
    private final @Nullable String status;
    private final SystemDataResponse systemData;
    private final @Nullable String task;
    private final @Nullable TimerTriggerDescriptorResponse timerTrigger;
    private final String type;
    private final @Nullable String updateTriggerToken;

    @OutputCustomType.Constructor({"agentConfiguration","agentPoolName","createTime","customRegistries","finishTime","id","imageUpdateTrigger","isArchiveEnabled","lastUpdatedTime","logArtifact","name","outputImages","platform","provisioningState","runErrorMessage","runId","runType","sourceRegistryAuth","sourceTrigger","startTime","status","systemData","task","timerTrigger","type","updateTriggerToken"})
    private RunResponse(
        @Nullable AgentPropertiesResponse agentConfiguration,
        @Nullable String agentPoolName,
        @Nullable String createTime,
        @Nullable List<String> customRegistries,
        @Nullable String finishTime,
        String id,
        @Nullable ImageUpdateTriggerResponse imageUpdateTrigger,
        @Nullable Boolean isArchiveEnabled,
        @Nullable String lastUpdatedTime,
        ImageDescriptorResponse logArtifact,
        String name,
        @Nullable List<ImageDescriptorResponse> outputImages,
        @Nullable PlatformPropertiesResponse platform,
        @Nullable String provisioningState,
        String runErrorMessage,
        @Nullable String runId,
        @Nullable String runType,
        @Nullable String sourceRegistryAuth,
        @Nullable SourceTriggerDescriptorResponse sourceTrigger,
        @Nullable String startTime,
        @Nullable String status,
        SystemDataResponse systemData,
        @Nullable String task,
        @Nullable TimerTriggerDescriptorResponse timerTrigger,
        String type,
        @Nullable String updateTriggerToken) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.createTime = createTime;
        this.customRegistries = customRegistries;
        this.finishTime = finishTime;
        this.id = Objects.requireNonNull(id);
        this.imageUpdateTrigger = imageUpdateTrigger;
        this.isArchiveEnabled = isArchiveEnabled;
        this.lastUpdatedTime = lastUpdatedTime;
        this.logArtifact = Objects.requireNonNull(logArtifact);
        this.name = Objects.requireNonNull(name);
        this.outputImages = outputImages;
        this.platform = platform;
        this.provisioningState = provisioningState;
        this.runErrorMessage = Objects.requireNonNull(runErrorMessage);
        this.runId = runId;
        this.runType = runType;
        this.sourceRegistryAuth = sourceRegistryAuth;
        this.sourceTrigger = sourceTrigger;
        this.startTime = startTime;
        this.status = status;
        this.systemData = Objects.requireNonNull(systemData);
        this.task = task;
        this.timerTrigger = timerTrigger;
        this.type = Objects.requireNonNull(type);
        this.updateTriggerToken = updateTriggerToken;
    }

    public Optional<AgentPropertiesResponse> getAgentConfiguration() {
        return Optional.ofNullable(this.agentConfiguration);
    }
    public Optional<String> getAgentPoolName() {
        return Optional.ofNullable(this.agentPoolName);
    }
    public Optional<String> getCreateTime() {
        return Optional.ofNullable(this.createTime);
    }
    public List<String> getCustomRegistries() {
        return this.customRegistries == null ? List.of() : this.customRegistries;
    }
    public Optional<String> getFinishTime() {
        return Optional.ofNullable(this.finishTime);
    }
    public String getId() {
        return this.id;
    }
    public Optional<ImageUpdateTriggerResponse> getImageUpdateTrigger() {
        return Optional.ofNullable(this.imageUpdateTrigger);
    }
    public Optional<Boolean> getIsArchiveEnabled() {
        return Optional.ofNullable(this.isArchiveEnabled);
    }
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    public ImageDescriptorResponse getLogArtifact() {
        return this.logArtifact;
    }
    public String getName() {
        return this.name;
    }
    public List<ImageDescriptorResponse> getOutputImages() {
        return this.outputImages == null ? List.of() : this.outputImages;
    }
    public Optional<PlatformPropertiesResponse> getPlatform() {
        return Optional.ofNullable(this.platform);
    }
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    public String getRunErrorMessage() {
        return this.runErrorMessage;
    }
    public Optional<String> getRunId() {
        return Optional.ofNullable(this.runId);
    }
    public Optional<String> getRunType() {
        return Optional.ofNullable(this.runType);
    }
    public Optional<String> getSourceRegistryAuth() {
        return Optional.ofNullable(this.sourceRegistryAuth);
    }
    public Optional<SourceTriggerDescriptorResponse> getSourceTrigger() {
        return Optional.ofNullable(this.sourceTrigger);
    }
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Optional<String> getTask() {
        return Optional.ofNullable(this.task);
    }
    public Optional<TimerTriggerDescriptorResponse> getTimerTrigger() {
        return Optional.ofNullable(this.timerTrigger);
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getUpdateTriggerToken() {
        return Optional.ofNullable(this.updateTriggerToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AgentPropertiesResponse agentConfiguration;
        private @Nullable String agentPoolName;
        private @Nullable String createTime;
        private @Nullable List<String> customRegistries;
        private @Nullable String finishTime;
        private String id;
        private @Nullable ImageUpdateTriggerResponse imageUpdateTrigger;
        private @Nullable Boolean isArchiveEnabled;
        private @Nullable String lastUpdatedTime;
        private ImageDescriptorResponse logArtifact;
        private String name;
        private @Nullable List<ImageDescriptorResponse> outputImages;
        private @Nullable PlatformPropertiesResponse platform;
        private @Nullable String provisioningState;
        private String runErrorMessage;
        private @Nullable String runId;
        private @Nullable String runType;
        private @Nullable String sourceRegistryAuth;
        private @Nullable SourceTriggerDescriptorResponse sourceTrigger;
        private @Nullable String startTime;
        private @Nullable String status;
        private SystemDataResponse systemData;
        private @Nullable String task;
        private @Nullable TimerTriggerDescriptorResponse timerTrigger;
        private String type;
        private @Nullable String updateTriggerToken;

        public Builder() {
    	      // Empty
        }

        public Builder(RunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.createTime = defaults.createTime;
    	      this.customRegistries = defaults.customRegistries;
    	      this.finishTime = defaults.finishTime;
    	      this.id = defaults.id;
    	      this.imageUpdateTrigger = defaults.imageUpdateTrigger;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.logArtifact = defaults.logArtifact;
    	      this.name = defaults.name;
    	      this.outputImages = defaults.outputImages;
    	      this.platform = defaults.platform;
    	      this.provisioningState = defaults.provisioningState;
    	      this.runErrorMessage = defaults.runErrorMessage;
    	      this.runId = defaults.runId;
    	      this.runType = defaults.runType;
    	      this.sourceRegistryAuth = defaults.sourceRegistryAuth;
    	      this.sourceTrigger = defaults.sourceTrigger;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.task = defaults.task;
    	      this.timerTrigger = defaults.timerTrigger;
    	      this.type = defaults.type;
    	      this.updateTriggerToken = defaults.updateTriggerToken;
        }

        public Builder setAgentConfiguration(@Nullable AgentPropertiesResponse agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }

        public Builder setAgentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCustomRegistries(@Nullable List<String> customRegistries) {
            this.customRegistries = customRegistries;
            return this;
        }

        public Builder setFinishTime(@Nullable String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImageUpdateTrigger(@Nullable ImageUpdateTriggerResponse imageUpdateTrigger) {
            this.imageUpdateTrigger = imageUpdateTrigger;
            return this;
        }

        public Builder setIsArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setLogArtifact(ImageDescriptorResponse logArtifact) {
            this.logArtifact = Objects.requireNonNull(logArtifact);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputImages(@Nullable List<ImageDescriptorResponse> outputImages) {
            this.outputImages = outputImages;
            return this;
        }

        public Builder setPlatform(@Nullable PlatformPropertiesResponse platform) {
            this.platform = platform;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setRunErrorMessage(String runErrorMessage) {
            this.runErrorMessage = Objects.requireNonNull(runErrorMessage);
            return this;
        }

        public Builder setRunId(@Nullable String runId) {
            this.runId = runId;
            return this;
        }

        public Builder setRunType(@Nullable String runType) {
            this.runType = runType;
            return this;
        }

        public Builder setSourceRegistryAuth(@Nullable String sourceRegistryAuth) {
            this.sourceRegistryAuth = sourceRegistryAuth;
            return this;
        }

        public Builder setSourceTrigger(@Nullable SourceTriggerDescriptorResponse sourceTrigger) {
            this.sourceTrigger = sourceTrigger;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTask(@Nullable String task) {
            this.task = task;
            return this;
        }

        public Builder setTimerTrigger(@Nullable TimerTriggerDescriptorResponse timerTrigger) {
            this.timerTrigger = timerTrigger;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUpdateTriggerToken(@Nullable String updateTriggerToken) {
            this.updateTriggerToken = updateTriggerToken;
            return this;
        }

        public RunResponse build() {
            return new RunResponse(agentConfiguration, agentPoolName, createTime, customRegistries, finishTime, id, imageUpdateTrigger, isArchiveEnabled, lastUpdatedTime, logArtifact, name, outputImages, platform, provisioningState, runErrorMessage, runId, runType, sourceRegistryAuth, sourceTrigger, startTime, status, systemData, task, timerTrigger, type, updateTriggerToken);
        }
    }
}
