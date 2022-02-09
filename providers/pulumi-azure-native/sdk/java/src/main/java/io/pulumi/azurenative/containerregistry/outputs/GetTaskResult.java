// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.AgentPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.CredentialsResponse;
import io.pulumi.azurenative.containerregistry.outputs.DockerBuildStepResponse;
import io.pulumi.azurenative.containerregistry.outputs.EncodedTaskStepResponse;
import io.pulumi.azurenative.containerregistry.outputs.FileTaskStepResponse;
import io.pulumi.azurenative.containerregistry.outputs.IdentityPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.PlatformPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.azurenative.containerregistry.outputs.TriggerPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTaskResult {
    private final @Nullable AgentPropertiesResponse agentConfiguration;
    private final @Nullable String agentPoolName;
    private final String creationDate;
    private final @Nullable CredentialsResponse credentials;
    private final String id;
    private final @Nullable IdentityPropertiesResponse identity;
    private final @Nullable Boolean isSystemTask;
    private final String location;
    private final @Nullable String logTemplate;
    private final String name;
    private final @Nullable PlatformPropertiesResponse platform;
    private final String provisioningState;
    private final @Nullable String status;
    private final @Nullable Object step;
    private final SystemDataResponse systemData;
    private final @Nullable Map<String,String> tags;
    private final @Nullable Integer timeout;
    private final @Nullable TriggerPropertiesResponse trigger;
    private final String type;

    @OutputCustomType.Constructor({"agentConfiguration","agentPoolName","creationDate","credentials","id","identity","isSystemTask","location","logTemplate","name","platform","provisioningState","status","step","systemData","tags","timeout","trigger","type"})
    private GetTaskResult(
        @Nullable AgentPropertiesResponse agentConfiguration,
        @Nullable String agentPoolName,
        String creationDate,
        @Nullable CredentialsResponse credentials,
        String id,
        @Nullable IdentityPropertiesResponse identity,
        @Nullable Boolean isSystemTask,
        String location,
        @Nullable String logTemplate,
        String name,
        @Nullable PlatformPropertiesResponse platform,
        String provisioningState,
        @Nullable String status,
        @Nullable Object step,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        @Nullable Integer timeout,
        @Nullable TriggerPropertiesResponse trigger,
        String type) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.creationDate = Objects.requireNonNull(creationDate);
        this.credentials = credentials;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.isSystemTask = isSystemTask;
        this.location = Objects.requireNonNull(location);
        this.logTemplate = logTemplate;
        this.name = Objects.requireNonNull(name);
        this.platform = platform;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.status = status;
        this.step = step;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.timeout = timeout;
        this.trigger = trigger;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<AgentPropertiesResponse> getAgentConfiguration() {
        return Optional.ofNullable(this.agentConfiguration);
    }
    public Optional<String> getAgentPoolName() {
        return Optional.ofNullable(this.agentPoolName);
    }
    public String getCreationDate() {
        return this.creationDate;
    }
    public Optional<CredentialsResponse> getCredentials() {
        return Optional.ofNullable(this.credentials);
    }
    public String getId() {
        return this.id;
    }
    public Optional<IdentityPropertiesResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    public Optional<Boolean> getIsSystemTask() {
        return Optional.ofNullable(this.isSystemTask);
    }
    public String getLocation() {
        return this.location;
    }
    public Optional<String> getLogTemplate() {
        return Optional.ofNullable(this.logTemplate);
    }
    public String getName() {
        return this.name;
    }
    public Optional<PlatformPropertiesResponse> getPlatform() {
        return Optional.ofNullable(this.platform);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public Optional<Object> getStep() {
        return Optional.ofNullable(this.step);
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<Integer> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    public Optional<TriggerPropertiesResponse> getTrigger() {
        return Optional.ofNullable(this.trigger);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AgentPropertiesResponse agentConfiguration;
        private @Nullable String agentPoolName;
        private String creationDate;
        private @Nullable CredentialsResponse credentials;
        private String id;
        private @Nullable IdentityPropertiesResponse identity;
        private @Nullable Boolean isSystemTask;
        private String location;
        private @Nullable String logTemplate;
        private String name;
        private @Nullable PlatformPropertiesResponse platform;
        private String provisioningState;
        private @Nullable String status;
        private @Nullable Object step;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable Integer timeout;
        private @Nullable TriggerPropertiesResponse trigger;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.creationDate = defaults.creationDate;
    	      this.credentials = defaults.credentials;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.isSystemTask = defaults.isSystemTask;
    	      this.location = defaults.location;
    	      this.logTemplate = defaults.logTemplate;
    	      this.name = defaults.name;
    	      this.platform = defaults.platform;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.step = defaults.step;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.trigger = defaults.trigger;
    	      this.type = defaults.type;
        }

        public Builder setAgentConfiguration(@Nullable AgentPropertiesResponse agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }

        public Builder setAgentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder setCreationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder setCredentials(@Nullable CredentialsResponse credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityPropertiesResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIsSystemTask(@Nullable Boolean isSystemTask) {
            this.isSystemTask = isSystemTask;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLogTemplate(@Nullable String logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlatform(@Nullable PlatformPropertiesResponse platform) {
            this.platform = platform;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setStep(@Nullable Object step) {
            this.step = step;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTrigger(@Nullable TriggerPropertiesResponse trigger) {
            this.trigger = trigger;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetTaskResult build() {
            return new GetTaskResult(agentConfiguration, agentPoolName, creationDate, credentials, id, identity, isSystemTask, location, logTemplate, name, platform, provisioningState, status, step, systemData, tags, timeout, trigger, type);
        }
    }
}
