// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.gameservices.inputs.GameServerClusterConnectionInfoArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerClusterArgs Empty = new GameServerClusterArgs();

    /**
     * Required. The resource name of the game server cluster
     * 
     */
    @InputImport(name="clusterId", required=true)
      private final Input<String> clusterId;

    public Input<String> getClusterId() {
        return this.clusterId;
    }

    /**
     * Game server cluster connection information. This information is used to
     * manage game server clusters.
     * Structure is documented below.
     * 
     */
    @InputImport(name="connectionInfo", required=true)
      private final Input<GameServerClusterConnectionInfoArgs> connectionInfo;

    public Input<GameServerClusterConnectionInfoArgs> getConnectionInfo() {
        return this.connectionInfo;
    }

    /**
     * Human readable description of the cluster.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The labels associated with this game server cluster. Each label is a
     * key-value pair.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Location of the Cluster.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
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

    /**
     * The realm id of the game server realm.
     * 
     */
    @InputImport(name="realmId", required=true)
      private final Input<String> realmId;

    public Input<String> getRealmId() {
        return this.realmId;
    }

    public GameServerClusterArgs(
        Input<String> clusterId,
        Input<GameServerClusterConnectionInfoArgs> connectionInfo,
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        Input<String> realmId) {
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.connectionInfo = Objects.requireNonNull(connectionInfo, "expected parameter 'connectionInfo' to be non-null");
        this.description = description;
        this.labels = labels;
        this.location = location;
        this.project = project;
        this.realmId = Objects.requireNonNull(realmId, "expected parameter 'realmId' to be non-null");
    }

    private GameServerClusterArgs() {
        this.clusterId = Input.empty();
        this.connectionInfo = Input.empty();
        this.description = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.realmId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterId;
        private Input<GameServerClusterConnectionInfoArgs> connectionInfo;
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private Input<String> realmId;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.connectionInfo = defaults.connectionInfo;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.realmId = defaults.realmId;
        }

        public Builder setClusterId(Input<String> clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Input.of(Objects.requireNonNull(clusterId));
            return this;
        }

        public Builder setConnectionInfo(Input<GameServerClusterConnectionInfoArgs> connectionInfo) {
            this.connectionInfo = Objects.requireNonNull(connectionInfo);
            return this;
        }

        public Builder setConnectionInfo(GameServerClusterConnectionInfoArgs connectionInfo) {
            this.connectionInfo = Input.of(Objects.requireNonNull(connectionInfo));
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

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRealmId(Input<String> realmId) {
            this.realmId = Objects.requireNonNull(realmId);
            return this;
        }

        public Builder setRealmId(String realmId) {
            this.realmId = Input.of(Objects.requireNonNull(realmId));
            return this;
        }
        public GameServerClusterArgs build() {
            return new GameServerClusterArgs(clusterId, connectionInfo, description, labels, location, project, realmId);
        }
    }
}
