// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.OverrideTaskStepPropertiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskRunRequestResponse extends io.pulumi.resources.InvokeArgs {

    public static final TaskRunRequestResponse Empty = new TaskRunRequestResponse();

    @InputImport(name="agentPoolName")
    private final @Nullable String agentPoolName;

    public Optional<String> getAgentPoolName() {
        return this.agentPoolName == null ? Optional.empty() : Optional.ofNullable(this.agentPoolName);
    }

    @InputImport(name="isArchiveEnabled")
    private final @Nullable Boolean isArchiveEnabled;

    public Optional<Boolean> getIsArchiveEnabled() {
        return this.isArchiveEnabled == null ? Optional.empty() : Optional.ofNullable(this.isArchiveEnabled);
    }

    @InputImport(name="logTemplate")
    private final @Nullable String logTemplate;

    public Optional<String> getLogTemplate() {
        return this.logTemplate == null ? Optional.empty() : Optional.ofNullable(this.logTemplate);
    }

    @InputImport(name="overrideTaskStepProperties")
    private final @Nullable OverrideTaskStepPropertiesResponse overrideTaskStepProperties;

    public Optional<OverrideTaskStepPropertiesResponse> getOverrideTaskStepProperties() {
        return this.overrideTaskStepProperties == null ? Optional.empty() : Optional.ofNullable(this.overrideTaskStepProperties);
    }

    @InputImport(name="taskId", required=true)
    private final String taskId;

    public String getTaskId() {
        return this.taskId;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public TaskRunRequestResponse(
        @Nullable String agentPoolName,
        @Nullable Boolean isArchiveEnabled,
        @Nullable String logTemplate,
        @Nullable OverrideTaskStepPropertiesResponse overrideTaskStepProperties,
        String taskId,
        String type) {
        this.agentPoolName = agentPoolName;
        this.isArchiveEnabled = isArchiveEnabled == null ? false : isArchiveEnabled;
        this.logTemplate = logTemplate;
        this.overrideTaskStepProperties = overrideTaskStepProperties;
        this.taskId = Objects.requireNonNull(taskId, "expected parameter 'taskId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TaskRunRequestResponse() {
        this.agentPoolName = null;
        this.isArchiveEnabled = null;
        this.logTemplate = null;
        this.overrideTaskStepProperties = null;
        this.taskId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskRunRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentPoolName;
        private @Nullable Boolean isArchiveEnabled;
        private @Nullable String logTemplate;
        private @Nullable OverrideTaskStepPropertiesResponse overrideTaskStepProperties;
        private String taskId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskRunRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.logTemplate = defaults.logTemplate;
    	      this.overrideTaskStepProperties = defaults.overrideTaskStepProperties;
    	      this.taskId = defaults.taskId;
    	      this.type = defaults.type;
        }

        public Builder setAgentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder setIsArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }

        public Builder setLogTemplate(@Nullable String logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }

        public Builder setOverrideTaskStepProperties(@Nullable OverrideTaskStepPropertiesResponse overrideTaskStepProperties) {
            this.overrideTaskStepProperties = overrideTaskStepProperties;
            return this;
        }

        public Builder setTaskId(String taskId) {
            this.taskId = Objects.requireNonNull(taskId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public TaskRunRequestResponse build() {
            return new TaskRunRequestResponse(agentPoolName, isArchiveEnabled, logTemplate, overrideTaskStepProperties, taskId, type);
        }
    }
}
