// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.gameservices.inputs.GameServerDeploymentRolloutGameServerConfigOverrideGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerDeploymentRolloutState extends io.pulumi.resources.ResourceArgs {

    public static final GameServerDeploymentRolloutState Empty = new GameServerDeploymentRolloutState();

    /**
     * This field points to the game server config that is
     * applied by default to all realms and clusters. For example,
     * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    @InputImport(name="defaultGameServerConfig")
      private final @Nullable Input<String> defaultGameServerConfig;

    public Input<String> getDefaultGameServerConfig() {
        return this.defaultGameServerConfig == null ? Input.empty() : this.defaultGameServerConfig;
    }

    /**
     * The deployment to rollout the new config to. Only 1 rollout must be associated with each deployment.
     * 
     */
    @InputImport(name="deploymentId")
      private final @Nullable Input<String> deploymentId;

    public Input<String> getDeploymentId() {
        return this.deploymentId == null ? Input.empty() : this.deploymentId;
    }

    /**
     * The game_server_config_overrides contains the per game server config
     * overrides. The overrides are processed in the order they are listed. As
     * soon as a match is found for a cluster, the rest of the list is not
     * processed.
     * Structure is documented below.
     * 
     */
    @InputImport(name="gameServerConfigOverrides")
      private final @Nullable Input<List<GameServerDeploymentRolloutGameServerConfigOverrideGetArgs>> gameServerConfigOverrides;

    public Input<List<GameServerDeploymentRolloutGameServerConfigOverrideGetArgs>> getGameServerConfigOverrides() {
        return this.gameServerConfigOverrides == null ? Input.empty() : this.gameServerConfigOverrides;
    }

    /**
     * The resource id of the game server deployment eg:
     * 'projects/my-project/locations/global/gameServerDeployments/my-deployment/rollout'.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public GameServerDeploymentRolloutState(
        @Nullable Input<String> defaultGameServerConfig,
        @Nullable Input<String> deploymentId,
        @Nullable Input<List<GameServerDeploymentRolloutGameServerConfigOverrideGetArgs>> gameServerConfigOverrides,
        @Nullable Input<String> name,
        @Nullable Input<String> project) {
        this.defaultGameServerConfig = defaultGameServerConfig;
        this.deploymentId = deploymentId;
        this.gameServerConfigOverrides = gameServerConfigOverrides;
        this.name = name;
        this.project = project;
    }

    private GameServerDeploymentRolloutState() {
        this.defaultGameServerConfig = Input.empty();
        this.deploymentId = Input.empty();
        this.gameServerConfigOverrides = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerDeploymentRolloutState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> defaultGameServerConfig;
        private @Nullable Input<String> deploymentId;
        private @Nullable Input<List<GameServerDeploymentRolloutGameServerConfigOverrideGetArgs>> gameServerConfigOverrides;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerDeploymentRolloutState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultGameServerConfig = defaults.defaultGameServerConfig;
    	      this.deploymentId = defaults.deploymentId;
    	      this.gameServerConfigOverrides = defaults.gameServerConfigOverrides;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setDefaultGameServerConfig(@Nullable Input<String> defaultGameServerConfig) {
            this.defaultGameServerConfig = defaultGameServerConfig;
            return this;
        }

        public Builder setDefaultGameServerConfig(@Nullable String defaultGameServerConfig) {
            this.defaultGameServerConfig = Input.ofNullable(defaultGameServerConfig);
            return this;
        }

        public Builder setDeploymentId(@Nullable Input<String> deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        public Builder setDeploymentId(@Nullable String deploymentId) {
            this.deploymentId = Input.ofNullable(deploymentId);
            return this;
        }

        public Builder setGameServerConfigOverrides(@Nullable Input<List<GameServerDeploymentRolloutGameServerConfigOverrideGetArgs>> gameServerConfigOverrides) {
            this.gameServerConfigOverrides = gameServerConfigOverrides;
            return this;
        }

        public Builder setGameServerConfigOverrides(@Nullable List<GameServerDeploymentRolloutGameServerConfigOverrideGetArgs> gameServerConfigOverrides) {
            this.gameServerConfigOverrides = Input.ofNullable(gameServerConfigOverrides);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public GameServerDeploymentRolloutState build() {
            return new GameServerDeploymentRolloutState(defaultGameServerConfig, deploymentId, gameServerConfigOverrides, name, project);
        }
    }
}
