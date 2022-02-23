// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.ClusterNodePoolAutoscalingArgs;
import io.pulumi.gcp.container.inputs.ClusterNodePoolManagementArgs;
import io.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterNodePoolUpgradeSettingsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterNodePoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolArgs Empty = new ClusterNodePoolArgs();

    @InputImport(name="autoscaling")
      private final @Nullable Input<ClusterNodePoolAutoscalingArgs> autoscaling;

    public Input<ClusterNodePoolAutoscalingArgs> getAutoscaling() {
        return this.autoscaling == null ? Input.empty() : this.autoscaling;
    }

    /**
     * The number of nodes to create in this
     * cluster's default node pool. In regional or multi-zonal clusters, this is the
     * number of nodes per zone. Must be set if `node_pool` is not set. If you're using
     * `gcp.container.NodePool` objects with no default node pool, you'll need to
     * set this to a value of at least `1`, alongside setting
     * `remove_default_node_pool` to `true`.
     * 
     */
    @InputImport(name="initialNodeCount")
      private final @Nullable Input<Integer> initialNodeCount;

    public Input<Integer> getInitialNodeCount() {
        return this.initialNodeCount == null ? Input.empty() : this.initialNodeCount;
    }

    @InputImport(name="instanceGroupUrls")
      private final @Nullable Input<List<String>> instanceGroupUrls;

    public Input<List<String>> getInstanceGroupUrls() {
        return this.instanceGroupUrls == null ? Input.empty() : this.instanceGroupUrls;
    }

    @InputImport(name="managedInstanceGroupUrls")
      private final @Nullable Input<List<String>> managedInstanceGroupUrls;

    public Input<List<String>> getManagedInstanceGroupUrls() {
        return this.managedInstanceGroupUrls == null ? Input.empty() : this.managedInstanceGroupUrls;
    }

    @InputImport(name="management")
      private final @Nullable Input<ClusterNodePoolManagementArgs> management;

    public Input<ClusterNodePoolManagementArgs> getManagement() {
        return this.management == null ? Input.empty() : this.management;
    }

    @InputImport(name="maxPodsPerNode")
      private final @Nullable Input<Integer> maxPodsPerNode;

    public Input<Integer> getMaxPodsPerNode() {
        return this.maxPodsPerNode == null ? Input.empty() : this.maxPodsPerNode;
    }

    /**
     * The name of the cluster, unique within the project and
     * location.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * Configuration for
     * [Adding Pod IP address ranges](https://cloud.google.com/kubernetes-engine/docs/how-to/multi-pod-cidr)) to the node pool. Structure is documented below
     * 
     */
    @InputImport(name="networkConfig")
      private final @Nullable Input<ClusterNodePoolNetworkConfigArgs> networkConfig;

    public Input<ClusterNodePoolNetworkConfigArgs> getNetworkConfig() {
        return this.networkConfig == null ? Input.empty() : this.networkConfig;
    }

    /**
     * Parameters used in creating the default node pool.
     * Generally, this field should not be used at the same time as a
     * `gcp.container.NodePool` or a `node_pool` block; this configuration
     * manages the default node pool, which isn't recommended to be used.
     * Structure is documented below.
     * 
     */
    @InputImport(name="nodeConfig")
      private final @Nullable Input<ClusterNodePoolNodeConfigArgs> nodeConfig;

    public Input<ClusterNodePoolNodeConfigArgs> getNodeConfig() {
        return this.nodeConfig == null ? Input.empty() : this.nodeConfig;
    }

    @InputImport(name="nodeCount")
      private final @Nullable Input<Integer> nodeCount;

    public Input<Integer> getNodeCount() {
        return this.nodeCount == null ? Input.empty() : this.nodeCount;
    }

    /**
     * The list of zones in which the cluster's nodes
     * are located. Nodes must be in the region of their regional cluster or in the
     * same region as their cluster's zone for zonal clusters. If this is specified for
     * a zonal cluster, omit the cluster's zone.
     * 
     */
    @InputImport(name="nodeLocations")
      private final @Nullable Input<List<String>> nodeLocations;

    public Input<List<String>> getNodeLocations() {
        return this.nodeLocations == null ? Input.empty() : this.nodeLocations;
    }

    @InputImport(name="upgradeSettings")
      private final @Nullable Input<ClusterNodePoolUpgradeSettingsArgs> upgradeSettings;

    public Input<ClusterNodePoolUpgradeSettingsArgs> getUpgradeSettings() {
        return this.upgradeSettings == null ? Input.empty() : this.upgradeSettings;
    }

    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public ClusterNodePoolArgs(
        @Nullable Input<ClusterNodePoolAutoscalingArgs> autoscaling,
        @Nullable Input<Integer> initialNodeCount,
        @Nullable Input<List<String>> instanceGroupUrls,
        @Nullable Input<List<String>> managedInstanceGroupUrls,
        @Nullable Input<ClusterNodePoolManagementArgs> management,
        @Nullable Input<Integer> maxPodsPerNode,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<ClusterNodePoolNetworkConfigArgs> networkConfig,
        @Nullable Input<ClusterNodePoolNodeConfigArgs> nodeConfig,
        @Nullable Input<Integer> nodeCount,
        @Nullable Input<List<String>> nodeLocations,
        @Nullable Input<ClusterNodePoolUpgradeSettingsArgs> upgradeSettings,
        @Nullable Input<String> version) {
        this.autoscaling = autoscaling;
        this.initialNodeCount = initialNodeCount;
        this.instanceGroupUrls = instanceGroupUrls;
        this.managedInstanceGroupUrls = managedInstanceGroupUrls;
        this.management = management;
        this.maxPodsPerNode = maxPodsPerNode;
        this.name = name;
        this.namePrefix = namePrefix;
        this.networkConfig = networkConfig;
        this.nodeConfig = nodeConfig;
        this.nodeCount = nodeCount;
        this.nodeLocations = nodeLocations;
        this.upgradeSettings = upgradeSettings;
        this.version = version;
    }

    private ClusterNodePoolArgs() {
        this.autoscaling = Input.empty();
        this.initialNodeCount = Input.empty();
        this.instanceGroupUrls = Input.empty();
        this.managedInstanceGroupUrls = Input.empty();
        this.management = Input.empty();
        this.maxPodsPerNode = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.networkConfig = Input.empty();
        this.nodeConfig = Input.empty();
        this.nodeCount = Input.empty();
        this.nodeLocations = Input.empty();
        this.upgradeSettings = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterNodePoolAutoscalingArgs> autoscaling;
        private @Nullable Input<Integer> initialNodeCount;
        private @Nullable Input<List<String>> instanceGroupUrls;
        private @Nullable Input<List<String>> managedInstanceGroupUrls;
        private @Nullable Input<ClusterNodePoolManagementArgs> management;
        private @Nullable Input<Integer> maxPodsPerNode;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<ClusterNodePoolNetworkConfigArgs> networkConfig;
        private @Nullable Input<ClusterNodePoolNodeConfigArgs> nodeConfig;
        private @Nullable Input<Integer> nodeCount;
        private @Nullable Input<List<String>> nodeLocations;
        private @Nullable Input<ClusterNodePoolUpgradeSettingsArgs> upgradeSettings;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaling = defaults.autoscaling;
    	      this.initialNodeCount = defaults.initialNodeCount;
    	      this.instanceGroupUrls = defaults.instanceGroupUrls;
    	      this.managedInstanceGroupUrls = defaults.managedInstanceGroupUrls;
    	      this.management = defaults.management;
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.networkConfig = defaults.networkConfig;
    	      this.nodeConfig = defaults.nodeConfig;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nodeLocations = defaults.nodeLocations;
    	      this.upgradeSettings = defaults.upgradeSettings;
    	      this.version = defaults.version;
        }

        public Builder setAutoscaling(@Nullable Input<ClusterNodePoolAutoscalingArgs> autoscaling) {
            this.autoscaling = autoscaling;
            return this;
        }

        public Builder setAutoscaling(@Nullable ClusterNodePoolAutoscalingArgs autoscaling) {
            this.autoscaling = Input.ofNullable(autoscaling);
            return this;
        }

        public Builder setInitialNodeCount(@Nullable Input<Integer> initialNodeCount) {
            this.initialNodeCount = initialNodeCount;
            return this;
        }

        public Builder setInitialNodeCount(@Nullable Integer initialNodeCount) {
            this.initialNodeCount = Input.ofNullable(initialNodeCount);
            return this;
        }

        public Builder setInstanceGroupUrls(@Nullable Input<List<String>> instanceGroupUrls) {
            this.instanceGroupUrls = instanceGroupUrls;
            return this;
        }

        public Builder setInstanceGroupUrls(@Nullable List<String> instanceGroupUrls) {
            this.instanceGroupUrls = Input.ofNullable(instanceGroupUrls);
            return this;
        }

        public Builder setManagedInstanceGroupUrls(@Nullable Input<List<String>> managedInstanceGroupUrls) {
            this.managedInstanceGroupUrls = managedInstanceGroupUrls;
            return this;
        }

        public Builder setManagedInstanceGroupUrls(@Nullable List<String> managedInstanceGroupUrls) {
            this.managedInstanceGroupUrls = Input.ofNullable(managedInstanceGroupUrls);
            return this;
        }

        public Builder setManagement(@Nullable Input<ClusterNodePoolManagementArgs> management) {
            this.management = management;
            return this;
        }

        public Builder setManagement(@Nullable ClusterNodePoolManagementArgs management) {
            this.management = Input.ofNullable(management);
            return this;
        }

        public Builder setMaxPodsPerNode(@Nullable Input<Integer> maxPodsPerNode) {
            this.maxPodsPerNode = maxPodsPerNode;
            return this;
        }

        public Builder setMaxPodsPerNode(@Nullable Integer maxPodsPerNode) {
            this.maxPodsPerNode = Input.ofNullable(maxPodsPerNode);
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

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setNetworkConfig(@Nullable Input<ClusterNodePoolNetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setNetworkConfig(@Nullable ClusterNodePoolNetworkConfigArgs networkConfig) {
            this.networkConfig = Input.ofNullable(networkConfig);
            return this;
        }

        public Builder setNodeConfig(@Nullable Input<ClusterNodePoolNodeConfigArgs> nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }

        public Builder setNodeConfig(@Nullable ClusterNodePoolNodeConfigArgs nodeConfig) {
            this.nodeConfig = Input.ofNullable(nodeConfig);
            return this;
        }

        public Builder setNodeCount(@Nullable Input<Integer> nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        public Builder setNodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = Input.ofNullable(nodeCount);
            return this;
        }

        public Builder setNodeLocations(@Nullable Input<List<String>> nodeLocations) {
            this.nodeLocations = nodeLocations;
            return this;
        }

        public Builder setNodeLocations(@Nullable List<String> nodeLocations) {
            this.nodeLocations = Input.ofNullable(nodeLocations);
            return this;
        }

        public Builder setUpgradeSettings(@Nullable Input<ClusterNodePoolUpgradeSettingsArgs> upgradeSettings) {
            this.upgradeSettings = upgradeSettings;
            return this;
        }

        public Builder setUpgradeSettings(@Nullable ClusterNodePoolUpgradeSettingsArgs upgradeSettings) {
            this.upgradeSettings = Input.ofNullable(upgradeSettings);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public ClusterNodePoolArgs build() {
            return new ClusterNodePoolArgs(autoscaling, initialNodeCount, instanceGroupUrls, managedInstanceGroupUrls, management, maxPodsPerNode, name, namePrefix, networkConfig, nodeConfig, nodeCount, nodeLocations, upgradeSettings, version);
        }
    }
}
