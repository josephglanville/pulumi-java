// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.awsnative.ecs.enums.ServiceLaunchType;
import io.pulumi.awsnative.ecs.enums.ServicePropagateTags;
import io.pulumi.awsnative.ecs.enums.ServiceSchedulingStrategy;
import io.pulumi.awsnative.ecs.inputs.ServiceCapacityProviderStrategyItemArgs;
import io.pulumi.awsnative.ecs.inputs.ServiceDeploymentConfigurationArgs;
import io.pulumi.awsnative.ecs.inputs.ServiceDeploymentControllerArgs;
import io.pulumi.awsnative.ecs.inputs.ServiceLoadBalancerArgs;
import io.pulumi.awsnative.ecs.inputs.ServiceNetworkConfigurationArgs;
import io.pulumi.awsnative.ecs.inputs.ServicePlacementConstraintArgs;
import io.pulumi.awsnative.ecs.inputs.ServicePlacementStrategyArgs;
import io.pulumi.awsnative.ecs.inputs.ServiceRegistryArgs;
import io.pulumi.awsnative.ecs.inputs.ServiceTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    @InputImport(name="capacityProviderStrategy")
      private final @Nullable Input<List<ServiceCapacityProviderStrategyItemArgs>> capacityProviderStrategy;

    public Input<List<ServiceCapacityProviderStrategyItemArgs>> getCapacityProviderStrategy() {
        return this.capacityProviderStrategy == null ? Input.empty() : this.capacityProviderStrategy;
    }

    @InputImport(name="cluster")
      private final @Nullable Input<String> cluster;

    public Input<String> getCluster() {
        return this.cluster == null ? Input.empty() : this.cluster;
    }

    @InputImport(name="deploymentConfiguration")
      private final @Nullable Input<ServiceDeploymentConfigurationArgs> deploymentConfiguration;

    public Input<ServiceDeploymentConfigurationArgs> getDeploymentConfiguration() {
        return this.deploymentConfiguration == null ? Input.empty() : this.deploymentConfiguration;
    }

    @InputImport(name="deploymentController")
      private final @Nullable Input<ServiceDeploymentControllerArgs> deploymentController;

    public Input<ServiceDeploymentControllerArgs> getDeploymentController() {
        return this.deploymentController == null ? Input.empty() : this.deploymentController;
    }

    @InputImport(name="desiredCount")
      private final @Nullable Input<Integer> desiredCount;

    public Input<Integer> getDesiredCount() {
        return this.desiredCount == null ? Input.empty() : this.desiredCount;
    }

    @InputImport(name="enableECSManagedTags")
      private final @Nullable Input<Boolean> enableECSManagedTags;

    public Input<Boolean> getEnableECSManagedTags() {
        return this.enableECSManagedTags == null ? Input.empty() : this.enableECSManagedTags;
    }

    @InputImport(name="enableExecuteCommand")
      private final @Nullable Input<Boolean> enableExecuteCommand;

    public Input<Boolean> getEnableExecuteCommand() {
        return this.enableExecuteCommand == null ? Input.empty() : this.enableExecuteCommand;
    }

    @InputImport(name="healthCheckGracePeriodSeconds")
      private final @Nullable Input<Integer> healthCheckGracePeriodSeconds;

    public Input<Integer> getHealthCheckGracePeriodSeconds() {
        return this.healthCheckGracePeriodSeconds == null ? Input.empty() : this.healthCheckGracePeriodSeconds;
    }

    @InputImport(name="launchType")
      private final @Nullable Input<ServiceLaunchType> launchType;

    public Input<ServiceLaunchType> getLaunchType() {
        return this.launchType == null ? Input.empty() : this.launchType;
    }

    @InputImport(name="loadBalancers")
      private final @Nullable Input<List<ServiceLoadBalancerArgs>> loadBalancers;

    public Input<List<ServiceLoadBalancerArgs>> getLoadBalancers() {
        return this.loadBalancers == null ? Input.empty() : this.loadBalancers;
    }

    @InputImport(name="networkConfiguration")
      private final @Nullable Input<ServiceNetworkConfigurationArgs> networkConfiguration;

    public Input<ServiceNetworkConfigurationArgs> getNetworkConfiguration() {
        return this.networkConfiguration == null ? Input.empty() : this.networkConfiguration;
    }

    @InputImport(name="placementConstraints")
      private final @Nullable Input<List<ServicePlacementConstraintArgs>> placementConstraints;

    public Input<List<ServicePlacementConstraintArgs>> getPlacementConstraints() {
        return this.placementConstraints == null ? Input.empty() : this.placementConstraints;
    }

    @InputImport(name="placementStrategies")
      private final @Nullable Input<List<ServicePlacementStrategyArgs>> placementStrategies;

    public Input<List<ServicePlacementStrategyArgs>> getPlacementStrategies() {
        return this.placementStrategies == null ? Input.empty() : this.placementStrategies;
    }

    @InputImport(name="platformVersion")
      private final @Nullable Input<String> platformVersion;

    public Input<String> getPlatformVersion() {
        return this.platformVersion == null ? Input.empty() : this.platformVersion;
    }

    @InputImport(name="propagateTags")
      private final @Nullable Input<ServicePropagateTags> propagateTags;

    public Input<ServicePropagateTags> getPropagateTags() {
        return this.propagateTags == null ? Input.empty() : this.propagateTags;
    }

    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    @InputImport(name="schedulingStrategy")
      private final @Nullable Input<ServiceSchedulingStrategy> schedulingStrategy;

    public Input<ServiceSchedulingStrategy> getSchedulingStrategy() {
        return this.schedulingStrategy == null ? Input.empty() : this.schedulingStrategy;
    }

    @InputImport(name="serviceName")
      private final @Nullable Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName == null ? Input.empty() : this.serviceName;
    }

    @InputImport(name="serviceRegistries")
      private final @Nullable Input<List<ServiceRegistryArgs>> serviceRegistries;

    public Input<List<ServiceRegistryArgs>> getServiceRegistries() {
        return this.serviceRegistries == null ? Input.empty() : this.serviceRegistries;
    }

    @InputImport(name="tags")
      private final @Nullable Input<List<ServiceTagArgs>> tags;

    public Input<List<ServiceTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="taskDefinition")
      private final @Nullable Input<String> taskDefinition;

    public Input<String> getTaskDefinition() {
        return this.taskDefinition == null ? Input.empty() : this.taskDefinition;
    }

    public ServiceArgs(
        @Nullable Input<List<ServiceCapacityProviderStrategyItemArgs>> capacityProviderStrategy,
        @Nullable Input<String> cluster,
        @Nullable Input<ServiceDeploymentConfigurationArgs> deploymentConfiguration,
        @Nullable Input<ServiceDeploymentControllerArgs> deploymentController,
        @Nullable Input<Integer> desiredCount,
        @Nullable Input<Boolean> enableECSManagedTags,
        @Nullable Input<Boolean> enableExecuteCommand,
        @Nullable Input<Integer> healthCheckGracePeriodSeconds,
        @Nullable Input<ServiceLaunchType> launchType,
        @Nullable Input<List<ServiceLoadBalancerArgs>> loadBalancers,
        @Nullable Input<ServiceNetworkConfigurationArgs> networkConfiguration,
        @Nullable Input<List<ServicePlacementConstraintArgs>> placementConstraints,
        @Nullable Input<List<ServicePlacementStrategyArgs>> placementStrategies,
        @Nullable Input<String> platformVersion,
        @Nullable Input<ServicePropagateTags> propagateTags,
        @Nullable Input<String> role,
        @Nullable Input<ServiceSchedulingStrategy> schedulingStrategy,
        @Nullable Input<String> serviceName,
        @Nullable Input<List<ServiceRegistryArgs>> serviceRegistries,
        @Nullable Input<List<ServiceTagArgs>> tags,
        @Nullable Input<String> taskDefinition) {
        this.capacityProviderStrategy = capacityProviderStrategy;
        this.cluster = cluster;
        this.deploymentConfiguration = deploymentConfiguration;
        this.deploymentController = deploymentController;
        this.desiredCount = desiredCount;
        this.enableECSManagedTags = enableECSManagedTags;
        this.enableExecuteCommand = enableExecuteCommand;
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
        this.launchType = launchType;
        this.loadBalancers = loadBalancers;
        this.networkConfiguration = networkConfiguration;
        this.placementConstraints = placementConstraints;
        this.placementStrategies = placementStrategies;
        this.platformVersion = platformVersion;
        this.propagateTags = propagateTags;
        this.role = role;
        this.schedulingStrategy = schedulingStrategy;
        this.serviceName = serviceName;
        this.serviceRegistries = serviceRegistries;
        this.tags = tags;
        this.taskDefinition = taskDefinition;
    }

    private ServiceArgs() {
        this.capacityProviderStrategy = Input.empty();
        this.cluster = Input.empty();
        this.deploymentConfiguration = Input.empty();
        this.deploymentController = Input.empty();
        this.desiredCount = Input.empty();
        this.enableECSManagedTags = Input.empty();
        this.enableExecuteCommand = Input.empty();
        this.healthCheckGracePeriodSeconds = Input.empty();
        this.launchType = Input.empty();
        this.loadBalancers = Input.empty();
        this.networkConfiguration = Input.empty();
        this.placementConstraints = Input.empty();
        this.placementStrategies = Input.empty();
        this.platformVersion = Input.empty();
        this.propagateTags = Input.empty();
        this.role = Input.empty();
        this.schedulingStrategy = Input.empty();
        this.serviceName = Input.empty();
        this.serviceRegistries = Input.empty();
        this.tags = Input.empty();
        this.taskDefinition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ServiceCapacityProviderStrategyItemArgs>> capacityProviderStrategy;
        private @Nullable Input<String> cluster;
        private @Nullable Input<ServiceDeploymentConfigurationArgs> deploymentConfiguration;
        private @Nullable Input<ServiceDeploymentControllerArgs> deploymentController;
        private @Nullable Input<Integer> desiredCount;
        private @Nullable Input<Boolean> enableECSManagedTags;
        private @Nullable Input<Boolean> enableExecuteCommand;
        private @Nullable Input<Integer> healthCheckGracePeriodSeconds;
        private @Nullable Input<ServiceLaunchType> launchType;
        private @Nullable Input<List<ServiceLoadBalancerArgs>> loadBalancers;
        private @Nullable Input<ServiceNetworkConfigurationArgs> networkConfiguration;
        private @Nullable Input<List<ServicePlacementConstraintArgs>> placementConstraints;
        private @Nullable Input<List<ServicePlacementStrategyArgs>> placementStrategies;
        private @Nullable Input<String> platformVersion;
        private @Nullable Input<ServicePropagateTags> propagateTags;
        private @Nullable Input<String> role;
        private @Nullable Input<ServiceSchedulingStrategy> schedulingStrategy;
        private @Nullable Input<String> serviceName;
        private @Nullable Input<List<ServiceRegistryArgs>> serviceRegistries;
        private @Nullable Input<List<ServiceTagArgs>> tags;
        private @Nullable Input<String> taskDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityProviderStrategy = defaults.capacityProviderStrategy;
    	      this.cluster = defaults.cluster;
    	      this.deploymentConfiguration = defaults.deploymentConfiguration;
    	      this.deploymentController = defaults.deploymentController;
    	      this.desiredCount = defaults.desiredCount;
    	      this.enableECSManagedTags = defaults.enableECSManagedTags;
    	      this.enableExecuteCommand = defaults.enableExecuteCommand;
    	      this.healthCheckGracePeriodSeconds = defaults.healthCheckGracePeriodSeconds;
    	      this.launchType = defaults.launchType;
    	      this.loadBalancers = defaults.loadBalancers;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.placementConstraints = defaults.placementConstraints;
    	      this.placementStrategies = defaults.placementStrategies;
    	      this.platformVersion = defaults.platformVersion;
    	      this.propagateTags = defaults.propagateTags;
    	      this.role = defaults.role;
    	      this.schedulingStrategy = defaults.schedulingStrategy;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceRegistries = defaults.serviceRegistries;
    	      this.tags = defaults.tags;
    	      this.taskDefinition = defaults.taskDefinition;
        }

        public Builder setCapacityProviderStrategy(@Nullable Input<List<ServiceCapacityProviderStrategyItemArgs>> capacityProviderStrategy) {
            this.capacityProviderStrategy = capacityProviderStrategy;
            return this;
        }

        public Builder setCapacityProviderStrategy(@Nullable List<ServiceCapacityProviderStrategyItemArgs> capacityProviderStrategy) {
            this.capacityProviderStrategy = Input.ofNullable(capacityProviderStrategy);
            return this;
        }

        public Builder setCluster(@Nullable Input<String> cluster) {
            this.cluster = cluster;
            return this;
        }

        public Builder setCluster(@Nullable String cluster) {
            this.cluster = Input.ofNullable(cluster);
            return this;
        }

        public Builder setDeploymentConfiguration(@Nullable Input<ServiceDeploymentConfigurationArgs> deploymentConfiguration) {
            this.deploymentConfiguration = deploymentConfiguration;
            return this;
        }

        public Builder setDeploymentConfiguration(@Nullable ServiceDeploymentConfigurationArgs deploymentConfiguration) {
            this.deploymentConfiguration = Input.ofNullable(deploymentConfiguration);
            return this;
        }

        public Builder setDeploymentController(@Nullable Input<ServiceDeploymentControllerArgs> deploymentController) {
            this.deploymentController = deploymentController;
            return this;
        }

        public Builder setDeploymentController(@Nullable ServiceDeploymentControllerArgs deploymentController) {
            this.deploymentController = Input.ofNullable(deploymentController);
            return this;
        }

        public Builder setDesiredCount(@Nullable Input<Integer> desiredCount) {
            this.desiredCount = desiredCount;
            return this;
        }

        public Builder setDesiredCount(@Nullable Integer desiredCount) {
            this.desiredCount = Input.ofNullable(desiredCount);
            return this;
        }

        public Builder setEnableECSManagedTags(@Nullable Input<Boolean> enableECSManagedTags) {
            this.enableECSManagedTags = enableECSManagedTags;
            return this;
        }

        public Builder setEnableECSManagedTags(@Nullable Boolean enableECSManagedTags) {
            this.enableECSManagedTags = Input.ofNullable(enableECSManagedTags);
            return this;
        }

        public Builder setEnableExecuteCommand(@Nullable Input<Boolean> enableExecuteCommand) {
            this.enableExecuteCommand = enableExecuteCommand;
            return this;
        }

        public Builder setEnableExecuteCommand(@Nullable Boolean enableExecuteCommand) {
            this.enableExecuteCommand = Input.ofNullable(enableExecuteCommand);
            return this;
        }

        public Builder setHealthCheckGracePeriodSeconds(@Nullable Input<Integer> healthCheckGracePeriodSeconds) {
            this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
            return this;
        }

        public Builder setHealthCheckGracePeriodSeconds(@Nullable Integer healthCheckGracePeriodSeconds) {
            this.healthCheckGracePeriodSeconds = Input.ofNullable(healthCheckGracePeriodSeconds);
            return this;
        }

        public Builder setLaunchType(@Nullable Input<ServiceLaunchType> launchType) {
            this.launchType = launchType;
            return this;
        }

        public Builder setLaunchType(@Nullable ServiceLaunchType launchType) {
            this.launchType = Input.ofNullable(launchType);
            return this;
        }

        public Builder setLoadBalancers(@Nullable Input<List<ServiceLoadBalancerArgs>> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        public Builder setLoadBalancers(@Nullable List<ServiceLoadBalancerArgs> loadBalancers) {
            this.loadBalancers = Input.ofNullable(loadBalancers);
            return this;
        }

        public Builder setNetworkConfiguration(@Nullable Input<ServiceNetworkConfigurationArgs> networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        public Builder setNetworkConfiguration(@Nullable ServiceNetworkConfigurationArgs networkConfiguration) {
            this.networkConfiguration = Input.ofNullable(networkConfiguration);
            return this;
        }

        public Builder setPlacementConstraints(@Nullable Input<List<ServicePlacementConstraintArgs>> placementConstraints) {
            this.placementConstraints = placementConstraints;
            return this;
        }

        public Builder setPlacementConstraints(@Nullable List<ServicePlacementConstraintArgs> placementConstraints) {
            this.placementConstraints = Input.ofNullable(placementConstraints);
            return this;
        }

        public Builder setPlacementStrategies(@Nullable Input<List<ServicePlacementStrategyArgs>> placementStrategies) {
            this.placementStrategies = placementStrategies;
            return this;
        }

        public Builder setPlacementStrategies(@Nullable List<ServicePlacementStrategyArgs> placementStrategies) {
            this.placementStrategies = Input.ofNullable(placementStrategies);
            return this;
        }

        public Builder setPlatformVersion(@Nullable Input<String> platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }

        public Builder setPlatformVersion(@Nullable String platformVersion) {
            this.platformVersion = Input.ofNullable(platformVersion);
            return this;
        }

        public Builder setPropagateTags(@Nullable Input<ServicePropagateTags> propagateTags) {
            this.propagateTags = propagateTags;
            return this;
        }

        public Builder setPropagateTags(@Nullable ServicePropagateTags propagateTags) {
            this.propagateTags = Input.ofNullable(propagateTags);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder setSchedulingStrategy(@Nullable Input<ServiceSchedulingStrategy> schedulingStrategy) {
            this.schedulingStrategy = schedulingStrategy;
            return this;
        }

        public Builder setSchedulingStrategy(@Nullable ServiceSchedulingStrategy schedulingStrategy) {
            this.schedulingStrategy = Input.ofNullable(schedulingStrategy);
            return this;
        }

        public Builder setServiceName(@Nullable Input<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setServiceName(@Nullable String serviceName) {
            this.serviceName = Input.ofNullable(serviceName);
            return this;
        }

        public Builder setServiceRegistries(@Nullable Input<List<ServiceRegistryArgs>> serviceRegistries) {
            this.serviceRegistries = serviceRegistries;
            return this;
        }

        public Builder setServiceRegistries(@Nullable List<ServiceRegistryArgs> serviceRegistries) {
            this.serviceRegistries = Input.ofNullable(serviceRegistries);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ServiceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ServiceTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTaskDefinition(@Nullable Input<String> taskDefinition) {
            this.taskDefinition = taskDefinition;
            return this;
        }

        public Builder setTaskDefinition(@Nullable String taskDefinition) {
            this.taskDefinition = Input.ofNullable(taskDefinition);
            return this;
        }
        public ServiceArgs build() {
            return new ServiceArgs(capacityProviderStrategy, cluster, deploymentConfiguration, deploymentController, desiredCount, enableECSManagedTags, enableExecuteCommand, healthCheckGracePeriodSeconds, launchType, loadBalancers, networkConfiguration, placementConstraints, placementStrategies, platformVersion, propagateTags, role, schedulingStrategy, serviceName, serviceRegistries, tags, taskDefinition);
        }
    }
}
