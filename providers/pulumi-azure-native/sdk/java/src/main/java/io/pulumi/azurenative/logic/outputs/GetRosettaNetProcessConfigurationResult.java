// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.RosettaNetPipActivitySettingsResponse;
import io.pulumi.azurenative.logic.outputs.RosettaNetPipRoleSettingsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRosettaNetProcessConfigurationResult {
    /**
     * The RosettaNet process configuration activity settings.
     * 
     */
    private final RosettaNetPipActivitySettingsResponse activitySettings;
    /**
     * The changed time.
     * 
     */
    private final String changedTime;
    /**
     * The created time.
     * 
     */
    private final String createdTime;
    /**
     * The integration account RosettaNet ProcessConfiguration properties.
     * 
     */
    private final @Nullable String description;
    /**
     * The resource id.
     * 
     */
    private final String id;
    /**
     * The RosettaNet initiator role settings.
     * 
     */
    private final RosettaNetPipRoleSettingsResponse initiatorRoleSettings;
    /**
     * The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The metadata.
     * 
     */
    private final @Nullable Map<String,String> metadata;
    /**
     * Gets the resource name.
     * 
     */
    private final String name;
    /**
     * The integration account RosettaNet process code.
     * 
     */
    private final String processCode;
    /**
     * The integration account RosettaNet process name.
     * 
     */
    private final String processName;
    /**
     * The integration account RosettaNet process version.
     * 
     */
    private final String processVersion;
    /**
     * The RosettaNet responder role settings.
     * 
     */
    private final RosettaNetPipRoleSettingsResponse responderRoleSettings;
    /**
     * The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Gets the resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetRosettaNetProcessConfigurationResult(
        @CustomType.Parameter("activitySettings") RosettaNetPipActivitySettingsResponse activitySettings,
        @CustomType.Parameter("changedTime") String changedTime,
        @CustomType.Parameter("createdTime") String createdTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("initiatorRoleSettings") RosettaNetPipRoleSettingsResponse initiatorRoleSettings,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("metadata") @Nullable Map<String,String> metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("processCode") String processCode,
        @CustomType.Parameter("processName") String processName,
        @CustomType.Parameter("processVersion") String processVersion,
        @CustomType.Parameter("responderRoleSettings") RosettaNetPipRoleSettingsResponse responderRoleSettings,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.activitySettings = activitySettings;
        this.changedTime = changedTime;
        this.createdTime = createdTime;
        this.description = description;
        this.id = id;
        this.initiatorRoleSettings = initiatorRoleSettings;
        this.location = location;
        this.metadata = metadata;
        this.name = name;
        this.processCode = processCode;
        this.processName = processName;
        this.processVersion = processVersion;
        this.responderRoleSettings = responderRoleSettings;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The RosettaNet process configuration activity settings.
     * 
    */
    public RosettaNetPipActivitySettingsResponse getActivitySettings() {
        return this.activitySettings;
    }
    /**
     * The changed time.
     * 
    */
    public String getChangedTime() {
        return this.changedTime;
    }
    /**
     * The created time.
     * 
    */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The integration account RosettaNet ProcessConfiguration properties.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The resource id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The RosettaNet initiator role settings.
     * 
    */
    public RosettaNetPipRoleSettingsResponse getInitiatorRoleSettings() {
        return this.initiatorRoleSettings;
    }
    /**
     * The resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The metadata.
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * Gets the resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The integration account RosettaNet process code.
     * 
    */
    public String getProcessCode() {
        return this.processCode;
    }
    /**
     * The integration account RosettaNet process name.
     * 
    */
    public String getProcessName() {
        return this.processName;
    }
    /**
     * The integration account RosettaNet process version.
     * 
    */
    public String getProcessVersion() {
        return this.processVersion;
    }
    /**
     * The RosettaNet responder role settings.
     * 
    */
    public RosettaNetPipRoleSettingsResponse getResponderRoleSettings() {
        return this.responderRoleSettings;
    }
    /**
     * The resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Gets the resource type.
     * 
    */
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

        public Builder activitySettings(RosettaNetPipActivitySettingsResponse activitySettings) {
            this.activitySettings = Objects.requireNonNull(activitySettings);
            return this;
        }
        public Builder changedTime(String changedTime) {
            this.changedTime = Objects.requireNonNull(changedTime);
            return this;
        }
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder initiatorRoleSettings(RosettaNetPipRoleSettingsResponse initiatorRoleSettings) {
            this.initiatorRoleSettings = Objects.requireNonNull(initiatorRoleSettings);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder processCode(String processCode) {
            this.processCode = Objects.requireNonNull(processCode);
            return this;
        }
        public Builder processName(String processName) {
            this.processName = Objects.requireNonNull(processName);
            return this;
        }
        public Builder processVersion(String processVersion) {
            this.processVersion = Objects.requireNonNull(processVersion);
            return this;
        }
        public Builder responderRoleSettings(RosettaNetPipRoleSettingsResponse responderRoleSettings) {
            this.responderRoleSettings = Objects.requireNonNull(responderRoleSettings);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetRosettaNetProcessConfigurationResult build() {
            return new GetRosettaNetProcessConfigurationResult(activitySettings, changedTime, createdTime, description, id, initiatorRoleSettings, location, metadata, name, processCode, processName, processVersion, responderRoleSettings, tags, type);
        }
    }
}
