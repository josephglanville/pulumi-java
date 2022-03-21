// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.memcache_v1.enums.InstanceMemcacheVersion;
import io.pulumi.googlenative.memcache_v1.inputs.InstanceMessageArgs;
import io.pulumi.googlenative.memcache_v1.inputs.MemcacheParametersArgs;
import io.pulumi.googlenative.memcache_v1.inputs.NodeConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The full name of the Google Compute Engine [network](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
     */
    @Import(name="authorizedNetwork")
      private final @Nullable Output<String> authorizedNetwork;

    public Output<String> getAuthorizedNetwork() {
        return this.authorizedNetwork == null ? Output.empty() : this.authorizedNetwork;
    }

    /**
     * User provided name for the instance, which is only used for display purposes. Cannot be more than 80 characters.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * List of messages that describe the current state of the Memcached instance.
     * 
     */
    @Import(name="instanceMessages")
      private final @Nullable Output<List<InstanceMessageArgs>> instanceMessages;

    public Output<List<InstanceMessageArgs>> getInstanceMessages() {
        return this.instanceMessages == null ? Output.empty() : this.instanceMessages;
    }

    /**
     * Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The major version of Memcached software. If not provided, latest supported version will be used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be automatically determined by our system based on the latest supported minor version.
     * 
     */
    @Import(name="memcacheVersion")
      private final @Nullable Output<InstanceMemcacheVersion> memcacheVersion;

    public Output<InstanceMemcacheVersion> getMemcacheVersion() {
        return this.memcacheVersion == null ? Output.empty() : this.memcacheVersion;
    }

    /**
     * Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Memcached instances are managed and addressed at the regional level so `location_id` here refers to a Google Cloud region; however, users may choose which zones Memcached nodes should be provisioned in within an instance. Refer to zones field for more details.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Configuration for Memcached nodes.
     * 
     */
    @Import(name="nodeConfig", required=true)
      private final Output<NodeConfigArgs> nodeConfig;

    public Output<NodeConfigArgs> getNodeConfig() {
        return this.nodeConfig;
    }

    /**
     * Number of nodes in the Memcached instance.
     * 
     */
    @Import(name="nodeCount", required=true)
      private final Output<Integer> nodeCount;

    public Output<Integer> getNodeCount() {
        return this.nodeCount;
    }

    /**
     * User defined parameters to apply to the memcached process on each node.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<MemcacheParametersArgs> parameters;

    public Output<MemcacheParametersArgs> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally distributed across these zones. If not provided, the service will by default create nodes in all zones in the region for the instance.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<List<String>> zones;

    public Output<List<String>> getZones() {
        return this.zones == null ? Output.empty() : this.zones;
    }

    public InstanceArgs(
        @Nullable Output<String> authorizedNetwork,
        @Nullable Output<String> displayName,
        Output<String> instanceId,
        @Nullable Output<List<InstanceMessageArgs>> instanceMessages,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<InstanceMemcacheVersion> memcacheVersion,
        @Nullable Output<String> name,
        Output<NodeConfigArgs> nodeConfig,
        Output<Integer> nodeCount,
        @Nullable Output<MemcacheParametersArgs> parameters,
        @Nullable Output<String> project,
        @Nullable Output<List<String>> zones) {
        this.authorizedNetwork = authorizedNetwork;
        this.displayName = displayName;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.instanceMessages = instanceMessages;
        this.labels = labels;
        this.location = location;
        this.memcacheVersion = memcacheVersion;
        this.name = name;
        this.nodeConfig = Objects.requireNonNull(nodeConfig, "expected parameter 'nodeConfig' to be non-null");
        this.nodeCount = Objects.requireNonNull(nodeCount, "expected parameter 'nodeCount' to be non-null");
        this.parameters = parameters;
        this.project = project;
        this.zones = zones;
    }

    private InstanceArgs() {
        this.authorizedNetwork = Output.empty();
        this.displayName = Output.empty();
        this.instanceId = Output.empty();
        this.instanceMessages = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.memcacheVersion = Output.empty();
        this.name = Output.empty();
        this.nodeConfig = Output.empty();
        this.nodeCount = Output.empty();
        this.parameters = Output.empty();
        this.project = Output.empty();
        this.zones = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizedNetwork;
        private @Nullable Output<String> displayName;
        private Output<String> instanceId;
        private @Nullable Output<List<InstanceMessageArgs>> instanceMessages;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<InstanceMemcacheVersion> memcacheVersion;
        private @Nullable Output<String> name;
        private Output<NodeConfigArgs> nodeConfig;
        private Output<Integer> nodeCount;
        private @Nullable Output<MemcacheParametersArgs> parameters;
        private @Nullable Output<String> project;
        private @Nullable Output<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.displayName = defaults.displayName;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceMessages = defaults.instanceMessages;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.memcacheVersion = defaults.memcacheVersion;
    	      this.name = defaults.name;
    	      this.nodeConfig = defaults.nodeConfig;
    	      this.nodeCount = defaults.nodeCount;
    	      this.parameters = defaults.parameters;
    	      this.project = defaults.project;
    	      this.zones = defaults.zones;
        }

        public Builder authorizedNetwork(@Nullable Output<String> authorizedNetwork) {
            this.authorizedNetwork = authorizedNetwork;
            return this;
        }
        public Builder authorizedNetwork(@Nullable String authorizedNetwork) {
            this.authorizedNetwork = Output.ofNullable(authorizedNetwork);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }
        public Builder instanceMessages(@Nullable Output<List<InstanceMessageArgs>> instanceMessages) {
            this.instanceMessages = instanceMessages;
            return this;
        }
        public Builder instanceMessages(@Nullable List<InstanceMessageArgs> instanceMessages) {
            this.instanceMessages = Output.ofNullable(instanceMessages);
            return this;
        }
        public Builder instanceMessages(InstanceMessageArgs... instanceMessages) {
            return instanceMessages(List.of(instanceMessages));
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder memcacheVersion(@Nullable Output<InstanceMemcacheVersion> memcacheVersion) {
            this.memcacheVersion = memcacheVersion;
            return this;
        }
        public Builder memcacheVersion(@Nullable InstanceMemcacheVersion memcacheVersion) {
            this.memcacheVersion = Output.ofNullable(memcacheVersion);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder nodeConfig(Output<NodeConfigArgs> nodeConfig) {
            this.nodeConfig = Objects.requireNonNull(nodeConfig);
            return this;
        }
        public Builder nodeConfig(NodeConfigArgs nodeConfig) {
            this.nodeConfig = Output.of(Objects.requireNonNull(nodeConfig));
            return this;
        }
        public Builder nodeCount(Output<Integer> nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Output.of(Objects.requireNonNull(nodeCount));
            return this;
        }
        public Builder parameters(@Nullable Output<MemcacheParametersArgs> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable MemcacheParametersArgs parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder zones(@Nullable Output<List<String>> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = Output.ofNullable(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public InstanceArgs build() {
            return new InstanceArgs(authorizedNetwork, displayName, instanceId, instanceMessages, labels, location, memcacheVersion, name, nodeConfig, nodeCount, parameters, project, zones);
        }
    }
}
