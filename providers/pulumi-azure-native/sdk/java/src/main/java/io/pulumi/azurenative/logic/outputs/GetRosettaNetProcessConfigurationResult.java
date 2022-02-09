// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.RosettaNetPipActivitySettingsResponse;
import io.pulumi.azurenative.logic.outputs.RosettaNetPipRoleSettingsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRosettaNetProcessConfigurationResult {
    private final RosettaNetPipActivitySettingsResponse activitySettings;
    private final String changedTime;
    private final String createdTime;
    private final @Nullable String description;
    private final String id;
    private final RosettaNetPipRoleSettingsResponse initiatorRoleSettings;
    private final @Nullable String location;
    private final @Nullable Map<String,String> metadata;
    private final String name;
    private final String processCode;
    private final String processName;
    private final String processVersion;
    private final RosettaNetPipRoleSettingsResponse responderRoleSettings;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"activitySettings","changedTime","createdTime","description","id","initiatorRoleSettings","location","metadata","name","processCode","processName","processVersion","responderRoleSettings","tags","type"})
    private GetRosettaNetProcessConfigurationResult(
        RosettaNetPipActivitySettingsResponse activitySettings,
        String changedTime,
        String createdTime,
        @Nullable String description,
        String id,
        RosettaNetPipRoleSettingsResponse initiatorRoleSettings,
        @Nullable String location,
        @Nullable Map<String,String> metadata,
        String name,
        String processCode,
        String processName,
        String processVersion,
        RosettaNetPipRoleSettingsResponse responderRoleSettings,
        @Nullable Map<String,String> tags,
        String type) {
        this.activitySettings = Objects.requireNonNull(activitySettings);
        this.changedTime = Objects.requireNonNull(changedTime);
        this.createdTime = Objects.requireNonNull(createdTime);
        this.description = description;
        this.id = Objects.requireNonNull(id);
        this.initiatorRoleSettings = Objects.requireNonNull(initiatorRoleSettings);
        this.location = location;
        this.metadata = metadata;
        this.name = Objects.requireNonNull(name);
        this.processCode = Objects.requireNonNull(processCode);
        this.processName = Objects.requireNonNull(processName);
        this.processVersion = Objects.requireNonNull(processVersion);
        this.responderRoleSettings = Objects.requireNonNull(responderRoleSettings);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public RosettaNetPipActivitySettingsResponse getActivitySettings() {
        return this.activitySettings;
    }
    public String getChangedTime() {
        return this.changedTime;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getId() {
        return this.id;
    }
    public RosettaNetPipRoleSettingsResponse getInitiatorRoleSettings() {
        return this.initiatorRoleSettings;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    public String getName() {
        return this.name;
    }
    public String getProcessCode() {
        return this.processCode;
    }
    public String getProcessName() {
        return this.processName;
    }
    public String getProcessVersion() {
        return this.processVersion;
    }
    public RosettaNetPipRoleSettingsResponse getResponderRoleSettings() {
        return this.responderRoleSettings;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRosettaNetProcessConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RosettaNetPipActivitySettingsResponse activitySettings;
        private String changedTime;
        private String createdTime;
        private @Nullable String description;
        private String id;
        private RosettaNetPipRoleSettingsResponse initiatorRoleSettings;
        private @Nullable String location;
        private @Nullable Map<String,String> metadata;
        private String name;
        private String processCode;
        private String processName;
        private String processVersion;
        private RosettaNetPipRoleSettingsResponse responderRoleSettings;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRosettaNetProcessConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activitySettings = defaults.activitySettings;
    	      this.changedTime = defaults.changedTime;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.initiatorRoleSettings = defaults.initiatorRoleSettings;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.processCode = defaults.processCode;
    	      this.processName = defaults.processName;
    	      this.processVersion = defaults.processVersion;
    	      this.responderRoleSettings = defaults.responderRoleSettings;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setActivitySettings(RosettaNetPipActivitySettingsResponse activitySettings) {
            this.activitySettings = Objects.requireNonNull(activitySettings);
            return this;
        }

        public Builder setChangedTime(String changedTime) {
            this.changedTime = Objects.requireNonNull(changedTime);
            return this;
        }

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInitiatorRoleSettings(RosettaNetPipRoleSettingsResponse initiatorRoleSettings) {
            this.initiatorRoleSettings = Objects.requireNonNull(initiatorRoleSettings);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProcessCode(String processCode) {
            this.processCode = Objects.requireNonNull(processCode);
            return this;
        }

        public Builder setProcessName(String processName) {
            this.processName = Objects.requireNonNull(processName);
            return this;
        }

        public Builder setProcessVersion(String processVersion) {
            this.processVersion = Objects.requireNonNull(processVersion);
            return this;
        }

        public Builder setResponderRoleSettings(RosettaNetPipRoleSettingsResponse responderRoleSettings) {
            this.responderRoleSettings = Objects.requireNonNull(responderRoleSettings);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetRosettaNetProcessConfigurationResult build() {
            return new GetRosettaNetProcessConfigurationResult(activitySettings, changedTime, createdTime, description, id, initiatorRoleSettings, location, metadata, name, processCode, processName, processVersion, responderRoleSettings, tags, type);
        }
    }
}
