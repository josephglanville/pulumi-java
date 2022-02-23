// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.logic.inputs.RosettaNetPipActivitySettingsArgs;
import io.pulumi.azurenative.logic.inputs.RosettaNetPipRoleSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RosettaNetProcessConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RosettaNetProcessConfigurationArgs Empty = new RosettaNetProcessConfigurationArgs();

    /**
     * The RosettaNet process configuration activity settings.
     * 
     */
    @InputImport(name="activitySettings", required=true)
      private final Input<RosettaNetPipActivitySettingsArgs> activitySettings;

    public Input<RosettaNetPipActivitySettingsArgs> getActivitySettings() {
        return this.activitySettings;
    }

    /**
     * The integration account RosettaNet ProcessConfiguration properties.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The RosettaNet initiator role settings.
     * 
     */
    @InputImport(name="initiatorRoleSettings", required=true)
      private final Input<RosettaNetPipRoleSettingsArgs> initiatorRoleSettings;

    public Input<RosettaNetPipRoleSettingsArgs> getInitiatorRoleSettings() {
        return this.initiatorRoleSettings;
    }

    /**
     * The integration account name.
     * 
     */
    @InputImport(name="integrationAccountName", required=true)
      private final Input<String> integrationAccountName;

    public Input<String> getIntegrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The metadata.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * The integration account RosettaNet process code.
     * 
     */
    @InputImport(name="processCode", required=true)
      private final Input<String> processCode;

    public Input<String> getProcessCode() {
        return this.processCode;
    }

    /**
     * The integration account RosettaNet process name.
     * 
     */
    @InputImport(name="processName", required=true)
      private final Input<String> processName;

    public Input<String> getProcessName() {
        return this.processName;
    }

    /**
     * The integration account RosettaNet process version.
     * 
     */
    @InputImport(name="processVersion", required=true)
      private final Input<String> processVersion;

    public Input<String> getProcessVersion() {
        return this.processVersion;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The RosettaNet responder role settings.
     * 
     */
    @InputImport(name="responderRoleSettings", required=true)
      private final Input<RosettaNetPipRoleSettingsArgs> responderRoleSettings;

    public Input<RosettaNetPipRoleSettingsArgs> getResponderRoleSettings() {
        return this.responderRoleSettings;
    }

    /**
     * The integration account RosettaNet ProcessConfiguration name.
     * 
     */
    @InputImport(name="rosettaNetProcessConfigurationName")
      private final @Nullable Input<String> rosettaNetProcessConfigurationName;

    public Input<String> getRosettaNetProcessConfigurationName() {
        return this.rosettaNetProcessConfigurationName == null ? Input.empty() : this.rosettaNetProcessConfigurationName;
    }

    /**
     * The resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RosettaNetProcessConfigurationArgs(
        Input<RosettaNetPipActivitySettingsArgs> activitySettings,
        @Nullable Input<String> description,
        Input<RosettaNetPipRoleSettingsArgs> initiatorRoleSettings,
        Input<String> integrationAccountName,
        @Nullable Input<String> location,
        @Nullable Input<Map<String,String>> metadata,
        Input<String> processCode,
        Input<String> processName,
        Input<String> processVersion,
        Input<String> resourceGroupName,
        Input<RosettaNetPipRoleSettingsArgs> responderRoleSettings,
        @Nullable Input<String> rosettaNetProcessConfigurationName,
        @Nullable Input<Map<String,String>> tags) {
        this.activitySettings = Objects.requireNonNull(activitySettings, "expected parameter 'activitySettings' to be non-null");
        this.description = description;
        this.initiatorRoleSettings = Objects.requireNonNull(initiatorRoleSettings, "expected parameter 'initiatorRoleSettings' to be non-null");
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.location = location;
        this.metadata = metadata;
        this.processCode = Objects.requireNonNull(processCode, "expected parameter 'processCode' to be non-null");
        this.processName = Objects.requireNonNull(processName, "expected parameter 'processName' to be non-null");
        this.processVersion = Objects.requireNonNull(processVersion, "expected parameter 'processVersion' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.responderRoleSettings = Objects.requireNonNull(responderRoleSettings, "expected parameter 'responderRoleSettings' to be non-null");
        this.rosettaNetProcessConfigurationName = rosettaNetProcessConfigurationName;
        this.tags = tags;
    }

    private RosettaNetProcessConfigurationArgs() {
        this.activitySettings = Input.empty();
        this.description = Input.empty();
        this.initiatorRoleSettings = Input.empty();
        this.integrationAccountName = Input.empty();
        this.location = Input.empty();
        this.metadata = Input.empty();
        this.processCode = Input.empty();
        this.processName = Input.empty();
        this.processVersion = Input.empty();
        this.resourceGroupName = Input.empty();
        this.responderRoleSettings = Input.empty();
        this.rosettaNetProcessConfigurationName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetProcessConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RosettaNetPipActivitySettingsArgs> activitySettings;
        private @Nullable Input<String> description;
        private Input<RosettaNetPipRoleSettingsArgs> initiatorRoleSettings;
        private Input<String> integrationAccountName;
        private @Nullable Input<String> location;
        private @Nullable Input<Map<String,String>> metadata;
        private Input<String> processCode;
        private Input<String> processName;
        private Input<String> processVersion;
        private Input<String> resourceGroupName;
        private Input<RosettaNetPipRoleSettingsArgs> responderRoleSettings;
        private @Nullable Input<String> rosettaNetProcessConfigurationName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RosettaNetProcessConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activitySettings = defaults.activitySettings;
    	      this.description = defaults.description;
    	      this.initiatorRoleSettings = defaults.initiatorRoleSettings;
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.processCode = defaults.processCode;
    	      this.processName = defaults.processName;
    	      this.processVersion = defaults.processVersion;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.responderRoleSettings = defaults.responderRoleSettings;
    	      this.rosettaNetProcessConfigurationName = defaults.rosettaNetProcessConfigurationName;
    	      this.tags = defaults.tags;
        }

        public Builder setActivitySettings(Input<RosettaNetPipActivitySettingsArgs> activitySettings) {
            this.activitySettings = Objects.requireNonNull(activitySettings);
            return this;
        }

        public Builder setActivitySettings(RosettaNetPipActivitySettingsArgs activitySettings) {
            this.activitySettings = Input.of(Objects.requireNonNull(activitySettings));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setInitiatorRoleSettings(Input<RosettaNetPipRoleSettingsArgs> initiatorRoleSettings) {
            this.initiatorRoleSettings = Objects.requireNonNull(initiatorRoleSettings);
            return this;
        }

        public Builder setInitiatorRoleSettings(RosettaNetPipRoleSettingsArgs initiatorRoleSettings) {
            this.initiatorRoleSettings = Input.of(Objects.requireNonNull(initiatorRoleSettings));
            return this;
        }

        public Builder setIntegrationAccountName(Input<String> integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }

        public Builder setIntegrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Input.of(Objects.requireNonNull(integrationAccountName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setProcessCode(Input<String> processCode) {
            this.processCode = Objects.requireNonNull(processCode);
            return this;
        }

        public Builder setProcessCode(String processCode) {
            this.processCode = Input.of(Objects.requireNonNull(processCode));
            return this;
        }

        public Builder setProcessName(Input<String> processName) {
            this.processName = Objects.requireNonNull(processName);
            return this;
        }

        public Builder setProcessName(String processName) {
            this.processName = Input.of(Objects.requireNonNull(processName));
            return this;
        }

        public Builder setProcessVersion(Input<String> processVersion) {
            this.processVersion = Objects.requireNonNull(processVersion);
            return this;
        }

        public Builder setProcessVersion(String processVersion) {
            this.processVersion = Input.of(Objects.requireNonNull(processVersion));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setResponderRoleSettings(Input<RosettaNetPipRoleSettingsArgs> responderRoleSettings) {
            this.responderRoleSettings = Objects.requireNonNull(responderRoleSettings);
            return this;
        }

        public Builder setResponderRoleSettings(RosettaNetPipRoleSettingsArgs responderRoleSettings) {
            this.responderRoleSettings = Input.of(Objects.requireNonNull(responderRoleSettings));
            return this;
        }

        public Builder setRosettaNetProcessConfigurationName(@Nullable Input<String> rosettaNetProcessConfigurationName) {
            this.rosettaNetProcessConfigurationName = rosettaNetProcessConfigurationName;
            return this;
        }

        public Builder setRosettaNetProcessConfigurationName(@Nullable String rosettaNetProcessConfigurationName) {
            this.rosettaNetProcessConfigurationName = Input.ofNullable(rosettaNetProcessConfigurationName);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public RosettaNetProcessConfigurationArgs build() {
            return new RosettaNetProcessConfigurationArgs(activitySettings, description, initiatorRoleSettings, integrationAccountName, location, metadata, processCode, processName, processVersion, resourceGroupName, responderRoleSettings, rosettaNetProcessConfigurationName, tags);
        }
    }
}
