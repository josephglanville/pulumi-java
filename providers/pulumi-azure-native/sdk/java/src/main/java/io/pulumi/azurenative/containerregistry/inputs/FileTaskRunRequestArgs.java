// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.AgentPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.CredentialsArgs;
import io.pulumi.azurenative.containerregistry.inputs.PlatformPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.SetValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileTaskRunRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileTaskRunRequestArgs Empty = new FileTaskRunRequestArgs();

    @InputImport(name="agentConfiguration")
    private final @Nullable Input<AgentPropertiesArgs> agentConfiguration;

    public Input<AgentPropertiesArgs> getAgentConfiguration() {
        return this.agentConfiguration == null ? Input.empty() : this.agentConfiguration;
    }

    @InputImport(name="agentPoolName")
    private final @Nullable Input<String> agentPoolName;

    public Input<String> getAgentPoolName() {
        return this.agentPoolName == null ? Input.empty() : this.agentPoolName;
    }

    @InputImport(name="credentials")
    private final @Nullable Input<CredentialsArgs> credentials;

    public Input<CredentialsArgs> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    @InputImport(name="isArchiveEnabled")
    private final @Nullable Input<Boolean> isArchiveEnabled;

    public Input<Boolean> getIsArchiveEnabled() {
        return this.isArchiveEnabled == null ? Input.empty() : this.isArchiveEnabled;
    }

    @InputImport(name="logTemplate")
    private final @Nullable Input<String> logTemplate;

    public Input<String> getLogTemplate() {
        return this.logTemplate == null ? Input.empty() : this.logTemplate;
    }

    @InputImport(name="platform", required=true)
    private final Input<PlatformPropertiesArgs> platform;

    public Input<PlatformPropertiesArgs> getPlatform() {
        return this.platform;
    }

    @InputImport(name="sourceLocation")
    private final @Nullable Input<String> sourceLocation;

    public Input<String> getSourceLocation() {
        return this.sourceLocation == null ? Input.empty() : this.sourceLocation;
    }

    @InputImport(name="taskFilePath", required=true)
    private final Input<String> taskFilePath;

    public Input<String> getTaskFilePath() {
        return this.taskFilePath;
    }

    @InputImport(name="timeout")
    private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    @InputImport(name="values")
    private final @Nullable Input<List<SetValueArgs>> values;

    public Input<List<SetValueArgs>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    @InputImport(name="valuesFilePath")
    private final @Nullable Input<String> valuesFilePath;

    public Input<String> getValuesFilePath() {
        return this.valuesFilePath == null ? Input.empty() : this.valuesFilePath;
    }

    public FileTaskRunRequestArgs(
        @Nullable Input<AgentPropertiesArgs> agentConfiguration,
        @Nullable Input<String> agentPoolName,
        @Nullable Input<CredentialsArgs> credentials,
        @Nullable Input<Boolean> isArchiveEnabled,
        @Nullable Input<String> logTemplate,
        Input<PlatformPropertiesArgs> platform,
        @Nullable Input<String> sourceLocation,
        Input<String> taskFilePath,
        @Nullable Input<Integer> timeout,
        Input<String> type,
        @Nullable Input<List<SetValueArgs>> values,
        @Nullable Input<String> valuesFilePath) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.credentials = credentials;
        this.isArchiveEnabled = isArchiveEnabled == null ? Input.ofNullable(false) : isArchiveEnabled;
        this.logTemplate = logTemplate;
        this.platform = Objects.requireNonNull(platform, "expected parameter 'platform' to be non-null");
        this.sourceLocation = sourceLocation;
        this.taskFilePath = Objects.requireNonNull(taskFilePath, "expected parameter 'taskFilePath' to be non-null");
        this.timeout = timeout == null ? Input.ofNullable(3600) : timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.values = values;
        this.valuesFilePath = valuesFilePath;
    }

    private FileTaskRunRequestArgs() {
        this.agentConfiguration = Input.empty();
        this.agentPoolName = Input.empty();
        this.credentials = Input.empty();
        this.isArchiveEnabled = Input.empty();
        this.logTemplate = Input.empty();
        this.platform = Input.empty();
        this.sourceLocation = Input.empty();
        this.taskFilePath = Input.empty();
        this.timeout = Input.empty();
        this.type = Input.empty();
        this.values = Input.empty();
        this.valuesFilePath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileTaskRunRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AgentPropertiesArgs> agentConfiguration;
        private @Nullable Input<String> agentPoolName;
        private @Nullable Input<CredentialsArgs> credentials;
        private @Nullable Input<Boolean> isArchiveEnabled;
        private @Nullable Input<String> logTemplate;
        private Input<PlatformPropertiesArgs> platform;
        private @Nullable Input<String> sourceLocation;
        private Input<String> taskFilePath;
        private @Nullable Input<Integer> timeout;
        private Input<String> type;
        private @Nullable Input<List<SetValueArgs>> values;
        private @Nullable Input<String> valuesFilePath;

        public Builder() {
    	      // Empty
        }

        public Builder(FileTaskRunRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.credentials = defaults.credentials;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.logTemplate = defaults.logTemplate;
    	      this.platform = defaults.platform;
    	      this.sourceLocation = defaults.sourceLocation;
    	      this.taskFilePath = defaults.taskFilePath;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
    	      this.valuesFilePath = defaults.valuesFilePath;
        }

        public Builder setAgentConfiguration(@Nullable Input<AgentPropertiesArgs> agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }

        public Builder setAgentConfiguration(@Nullable AgentPropertiesArgs agentConfiguration) {
            this.agentConfiguration = Input.ofNullable(agentConfiguration);
            return this;
        }

        public Builder setAgentPoolName(@Nullable Input<String> agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder setAgentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = Input.ofNullable(agentPoolName);
            return this;
        }

        public Builder setCredentials(@Nullable Input<CredentialsArgs> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCredentials(@Nullable CredentialsArgs credentials) {
            this.credentials = Input.ofNullable(credentials);
            return this;
        }

        public Builder setIsArchiveEnabled(@Nullable Input<Boolean> isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }

        public Builder setIsArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = Input.ofNullable(isArchiveEnabled);
            return this;
        }

        public Builder setLogTemplate(@Nullable Input<String> logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }

        public Builder setLogTemplate(@Nullable String logTemplate) {
            this.logTemplate = Input.ofNullable(logTemplate);
            return this;
        }

        public Builder setPlatform(Input<PlatformPropertiesArgs> platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder setPlatform(PlatformPropertiesArgs platform) {
            this.platform = Input.of(Objects.requireNonNull(platform));
            return this;
        }

        public Builder setSourceLocation(@Nullable Input<String> sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }

        public Builder setSourceLocation(@Nullable String sourceLocation) {
            this.sourceLocation = Input.ofNullable(sourceLocation);
            return this;
        }

        public Builder setTaskFilePath(Input<String> taskFilePath) {
            this.taskFilePath = Objects.requireNonNull(taskFilePath);
            return this;
        }

        public Builder setTaskFilePath(String taskFilePath) {
            this.taskFilePath = Input.of(Objects.requireNonNull(taskFilePath));
            return this;
        }

        public Builder setTimeout(@Nullable Input<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setValues(@Nullable Input<List<SetValueArgs>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<SetValueArgs> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public Builder setValuesFilePath(@Nullable Input<String> valuesFilePath) {
            this.valuesFilePath = valuesFilePath;
            return this;
        }

        public Builder setValuesFilePath(@Nullable String valuesFilePath) {
            this.valuesFilePath = Input.ofNullable(valuesFilePath);
            return this;
        }

        public FileTaskRunRequestArgs build() {
            return new FileTaskRunRequestArgs(agentConfiguration, agentPoolName, credentials, isArchiveEnabled, logTemplate, platform, sourceLocation, taskFilePath, timeout, type, values, valuesFilePath);
        }
    }
}
