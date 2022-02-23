// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ConfigurationGroupResponse;
import io.pulumi.azurenative.network.inputs.ConnectivityGroupItemResponse;
import io.pulumi.azurenative.network.inputs.HubResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Active connectivity configuration.
 * 
 */
public final class ActiveConnectivityConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ActiveConnectivityConfigurationResponse Empty = new ActiveConnectivityConfigurationResponse();

    /**
     * Groups for configuration
     * 
     */
    @InputImport(name="appliesToGroups")
      private final @Nullable List<ConnectivityGroupItemResponse> appliesToGroups;

    public List<ConnectivityGroupItemResponse> getAppliesToGroups() {
        return this.appliesToGroups == null ? List.of() : this.appliesToGroups;
    }

    /**
     * Deployment time string.
     * 
     */
    @InputImport(name="commitTime")
      private final @Nullable String commitTime;

    public Optional<String> getCommitTime() {
        return this.commitTime == null ? Optional.empty() : Optional.ofNullable(this.commitTime);
    }

    /**
     * Effective configuration groups.
     * 
     */
    @InputImport(name="configurationGroups")
      private final @Nullable List<ConfigurationGroupResponse> configurationGroups;

    public List<ConfigurationGroupResponse> getConfigurationGroups() {
        return this.configurationGroups == null ? List.of() : this.configurationGroups;
    }

    /**
     * Connectivity topology type.
     * 
     */
    @InputImport(name="connectivityTopology", required=true)
      private final String connectivityTopology;

    public String getConnectivityTopology() {
        return this.connectivityTopology;
    }

    /**
     * Flag if need to remove current existing peerings.
     * 
     */
    @InputImport(name="deleteExistingPeering")
      private final @Nullable String deleteExistingPeering;

    public Optional<String> getDeleteExistingPeering() {
        return this.deleteExistingPeering == null ? Optional.empty() : Optional.ofNullable(this.deleteExistingPeering);
    }

    /**
     * A description of the connectivity configuration.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * A friendly name for the resource.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * List of hubItems
     * 
     */
    @InputImport(name="hubs")
      private final @Nullable List<HubResponse> hubs;

    public List<HubResponse> getHubs() {
        return this.hubs == null ? List.of() : this.hubs;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Flag if global mesh is supported.
     * 
     */
    @InputImport(name="isGlobal")
      private final @Nullable String isGlobal;

    public Optional<String> getIsGlobal() {
        return this.isGlobal == null ? Optional.empty() : Optional.ofNullable(this.isGlobal);
    }

    /**
     * The provisioning state of the connectivity configuration resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Deployment region.
     * 
     */
    @InputImport(name="region")
      private final @Nullable String region;

    public Optional<String> getRegion() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    public ActiveConnectivityConfigurationResponse(
        @Nullable List<ConnectivityGroupItemResponse> appliesToGroups,
        @Nullable String commitTime,
        @Nullable List<ConfigurationGroupResponse> configurationGroups,
        String connectivityTopology,
        @Nullable String deleteExistingPeering,
        @Nullable String description,
        @Nullable String displayName,
        @Nullable List<HubResponse> hubs,
        @Nullable String id,
        @Nullable String isGlobal,
        String provisioningState,
        @Nullable String region) {
        this.appliesToGroups = appliesToGroups;
        this.commitTime = commitTime;
        this.configurationGroups = configurationGroups;
        this.connectivityTopology = Objects.requireNonNull(connectivityTopology, "expected parameter 'connectivityTopology' to be non-null");
        this.deleteExistingPeering = deleteExistingPeering;
        this.description = description;
        this.displayName = displayName;
        this.hubs = hubs;
        this.id = id;
        this.isGlobal = isGlobal;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.region = region;
    }

    private ActiveConnectivityConfigurationResponse() {
        this.appliesToGroups = List.of();
        this.commitTime = null;
        this.configurationGroups = List.of();
        this.connectivityTopology = null;
        this.deleteExistingPeering = null;
        this.description = null;
        this.displayName = null;
        this.hubs = List.of();
        this.id = null;
        this.isGlobal = null;
        this.provisioningState = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActiveConnectivityConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ConnectivityGroupItemResponse> appliesToGroups;
        private @Nullable String commitTime;
        private @Nullable List<ConfigurationGroupResponse> configurationGroups;
        private String connectivityTopology;
        private @Nullable String deleteExistingPeering;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable List<HubResponse> hubs;
        private @Nullable String id;
        private @Nullable String isGlobal;
        private String provisioningState;
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(ActiveConnectivityConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliesToGroups = defaults.appliesToGroups;
    	      this.commitTime = defaults.commitTime;
    	      this.configurationGroups = defaults.configurationGroups;
    	      this.connectivityTopology = defaults.connectivityTopology;
    	      this.deleteExistingPeering = defaults.deleteExistingPeering;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.hubs = defaults.hubs;
    	      this.id = defaults.id;
    	      this.isGlobal = defaults.isGlobal;
    	      this.provisioningState = defaults.provisioningState;
    	      this.region = defaults.region;
        }

        public Builder setAppliesToGroups(@Nullable List<ConnectivityGroupItemResponse> appliesToGroups) {
            this.appliesToGroups = appliesToGroups;
            return this;
        }

        public Builder setCommitTime(@Nullable String commitTime) {
            this.commitTime = commitTime;
            return this;
        }

        public Builder setConfigurationGroups(@Nullable List<ConfigurationGroupResponse> configurationGroups) {
            this.configurationGroups = configurationGroups;
            return this;
        }

        public Builder setConnectivityTopology(String connectivityTopology) {
            this.connectivityTopology = Objects.requireNonNull(connectivityTopology);
            return this;
        }

        public Builder setDeleteExistingPeering(@Nullable String deleteExistingPeering) {
            this.deleteExistingPeering = deleteExistingPeering;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setHubs(@Nullable List<HubResponse> hubs) {
            this.hubs = hubs;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIsGlobal(@Nullable String isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }
        public ActiveConnectivityConfigurationResponse build() {
            return new ActiveConnectivityConfigurationResponse(appliesToGroups, commitTime, configurationGroups, connectivityTopology, deleteExistingPeering, description, displayName, hubs, id, isGlobal, provisioningState, region);
        }
    }
}
