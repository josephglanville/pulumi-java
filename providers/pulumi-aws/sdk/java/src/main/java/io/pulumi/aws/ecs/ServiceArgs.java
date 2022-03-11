// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs;

import io.pulumi.aws.ecs.inputs.ServiceCapacityProviderStrategyArgs;
import io.pulumi.aws.ecs.inputs.ServiceDeploymentCircuitBreakerArgs;
import io.pulumi.aws.ecs.inputs.ServiceDeploymentControllerArgs;
import io.pulumi.aws.ecs.inputs.ServiceLoadBalancerArgs;
import io.pulumi.aws.ecs.inputs.ServiceNetworkConfigurationArgs;
import io.pulumi.aws.ecs.inputs.ServiceOrderedPlacementStrategyArgs;
import io.pulumi.aws.ecs.inputs.ServicePlacementConstraintArgs;
import io.pulumi.aws.ecs.inputs.ServiceServiceRegistriesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Capacity provider strategies to use for the service. Can be one or more. These can be updated without destroying and recreating the service only if `force_new_deployment = true` and not changing from 0 `capacity_provider_strategy` blocks to greater than 0, or vice versa. See below.
     * 
     */
    @InputImport(name="capacityProviderStrategies")
      private final @Nullable Output<List<ServiceCapacityProviderStrategyArgs>> capacityProviderStrategies;

    public Output<List<ServiceCapacityProviderStrategyArgs>> getCapacityProviderStrategies() {
        return this.capacityProviderStrategies == null ? Output.empty() : this.capacityProviderStrategies;
    }

    /**
     * ARN of an ECS cluster.
     * 
     */
    @InputImport(name="cluster")
      private final @Nullable Output<String> cluster;

    public Output<String> getCluster() {
        return this.cluster == null ? Output.empty() : this.cluster;
    }

    /**
     * Configuration block for deployment circuit breaker. See below.
     * 
     */
    @InputImport(name="deploymentCircuitBreaker")
      private final @Nullable Output<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker;

    public Output<ServiceDeploymentCircuitBreakerArgs> getDeploymentCircuitBreaker() {
        return this.deploymentCircuitBreaker == null ? Output.empty() : this.deploymentCircuitBreaker;
    }

    /**
     * Configuration block for deployment controller configuration. See below.
     * 
     */
    @InputImport(name="deploymentController")
      private final @Nullable Output<ServiceDeploymentControllerArgs> deploymentController;

    public Output<ServiceDeploymentControllerArgs> getDeploymentController() {
        return this.deploymentController == null ? Output.empty() : this.deploymentController;
    }

    /**
     * Upper limit (as a percentage of the service's desiredCount) of the number of running tasks that can be running in a service during a deployment. Not valid when using the `DAEMON` scheduling strategy.
     * 
     */
    @InputImport(name="deploymentMaximumPercent")
      private final @Nullable Output<Integer> deploymentMaximumPercent;

    public Output<Integer> getDeploymentMaximumPercent() {
        return this.deploymentMaximumPercent == null ? Output.empty() : this.deploymentMaximumPercent;
    }

    /**
     * Lower limit (as a percentage of the service's desiredCount) of the number of running tasks that must remain running and healthy in a service during a deployment.
     * 
     */
    @InputImport(name="deploymentMinimumHealthyPercent")
      private final @Nullable Output<Integer> deploymentMinimumHealthyPercent;

    public Output<Integer> getDeploymentMinimumHealthyPercent() {
        return this.deploymentMinimumHealthyPercent == null ? Output.empty() : this.deploymentMinimumHealthyPercent;
    }

    /**
     * Number of instances of the task definition to place and keep running. Defaults to 0. Do not specify if using the `DAEMON` scheduling strategy.
     * 
     */
    @InputImport(name="desiredCount")
      private final @Nullable Output<Integer> desiredCount;

    public Output<Integer> getDesiredCount() {
        return this.desiredCount == null ? Output.empty() : this.desiredCount;
    }

    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     * 
     */
    @InputImport(name="enableEcsManagedTags")
      private final @Nullable Output<Boolean> enableEcsManagedTags;

    public Output<Boolean> getEnableEcsManagedTags() {
        return this.enableEcsManagedTags == null ? Output.empty() : this.enableEcsManagedTags;
    }

    /**
     * Specifies whether to enable Amazon ECS Exec for the tasks within the service.
     * 
     */
    @InputImport(name="enableExecuteCommand")
      private final @Nullable Output<Boolean> enableExecuteCommand;

    public Output<Boolean> getEnableExecuteCommand() {
        return this.enableExecuteCommand == null ? Output.empty() : this.enableExecuteCommand;
    }

    /**
     * Enable to force a new task deployment of the service. This can be used to update tasks to use a newer Docker image with same image/tag combination (e.g., `myimage:latest`), roll Fargate tasks onto a newer platform version, or immediately deploy `ordered_placement_strategy` and `placement_constraints` updates.
     * 
     */
    @InputImport(name="forceNewDeployment")
      private final @Nullable Output<Boolean> forceNewDeployment;

    public Output<Boolean> getForceNewDeployment() {
        return this.forceNewDeployment == null ? Output.empty() : this.forceNewDeployment;
    }

    /**
     * Seconds to ignore failing load balancer health checks on newly instantiated tasks to prevent premature shutdown, up to 2147483647. Only valid for services configured to use load balancers.
     * 
     */
    @InputImport(name="healthCheckGracePeriodSeconds")
      private final @Nullable Output<Integer> healthCheckGracePeriodSeconds;

    public Output<Integer> getHealthCheckGracePeriodSeconds() {
        return this.healthCheckGracePeriodSeconds == null ? Output.empty() : this.healthCheckGracePeriodSeconds;
    }

    /**
     * ARN of the IAM role that allows Amazon ECS to make calls to your load balancer on your behalf. This parameter is required if you are using a load balancer with your service, but only if your task definition does not use the `awsvpc` network mode. If using `awsvpc` network mode, do not specify this role. If your account has already created the Amazon ECS service-linked role, that role is used by default for your service unless you specify a role here.
     * 
     */
    @InputImport(name="iamRole")
      private final @Nullable Output<String> iamRole;

    public Output<String> getIamRole() {
        return this.iamRole == null ? Output.empty() : this.iamRole;
    }

    /**
     * Launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     * 
     */
    @InputImport(name="launchType")
      private final @Nullable Output<String> launchType;

    public Output<String> getLaunchType() {
        return this.launchType == null ? Output.empty() : this.launchType;
    }

    /**
     * Configuration block for load balancers. See below.
     * 
     */
    @InputImport(name="loadBalancers")
      private final @Nullable Output<List<ServiceLoadBalancerArgs>> loadBalancers;

    public Output<List<ServiceLoadBalancerArgs>> getLoadBalancers() {
        return this.loadBalancers == null ? Output.empty() : this.loadBalancers;
    }

    /**
     * Name of the service (up to 255 letters, numbers, hyphens, and underscores)
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     * 
     */
    @InputImport(name="networkConfiguration")
      private final @Nullable Output<ServiceNetworkConfigurationArgs> networkConfiguration;

    public Output<ServiceNetworkConfigurationArgs> getNetworkConfiguration() {
        return this.networkConfiguration == null ? Output.empty() : this.networkConfiguration;
    }

    /**
     * Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. Updates to this configuration will take effect next task deployment unless `force_new_deployment` is enabled. The maximum number of `ordered_placement_strategy` blocks is `5`. See below.
     * 
     */
    @InputImport(name="orderedPlacementStrategies")
      private final @Nullable Output<List<ServiceOrderedPlacementStrategyArgs>> orderedPlacementStrategies;

    public Output<List<ServiceOrderedPlacementStrategyArgs>> getOrderedPlacementStrategies() {
        return this.orderedPlacementStrategies == null ? Output.empty() : this.orderedPlacementStrategies;
    }

    /**
     * Rules that are taken into consideration during task placement. Updates to this configuration will take effect next task deployment unless `force_new_deployment` is enabled. Maximum number of `placement_constraints` is `10`. See below.
     * 
     */
    @InputImport(name="placementConstraints")
      private final @Nullable Output<List<ServicePlacementConstraintArgs>> placementConstraints;

    public Output<List<ServicePlacementConstraintArgs>> getPlacementConstraints() {
        return this.placementConstraints == null ? Output.empty() : this.placementConstraints;
    }

    /**
     * Platform version on which to run your service. Only applicable for `launch_type` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    @InputImport(name="platformVersion")
      private final @Nullable Output<String> platformVersion;

    public Output<String> getPlatformVersion() {
        return this.platformVersion == null ? Output.empty() : this.platformVersion;
    }

    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks. The valid values are `SERVICE` and `TASK_DEFINITION`.
     * 
     */
    @InputImport(name="propagateTags")
      private final @Nullable Output<String> propagateTags;

    public Output<String> getPropagateTags() {
        return this.propagateTags == null ? Output.empty() : this.propagateTags;
    }

    /**
     * Scheduling strategy to use for the service. The valid values are `REPLICA` and `DAEMON`. Defaults to `REPLICA`. Note that [*Tasks using the Fargate launch type or the `CODE_DEPLOY` or `EXTERNAL` deployment controller types don't support the `DAEMON` scheduling strategy*](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html).
     * 
     */
    @InputImport(name="schedulingStrategy")
      private final @Nullable Output<String> schedulingStrategy;

    public Output<String> getSchedulingStrategy() {
        return this.schedulingStrategy == null ? Output.empty() : this.schedulingStrategy;
    }

    /**
     * Service discovery registries for the service. The maximum number of `service_registries` blocks is `1`. See below.
     * 
     */
    @InputImport(name="serviceRegistries")
      private final @Nullable Output<ServiceServiceRegistriesArgs> serviceRegistries;

    public Output<ServiceServiceRegistriesArgs> getServiceRegistries() {
        return this.serviceRegistries == null ? Output.empty() : this.serviceRegistries;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service. Required unless using the `EXTERNAL` deployment controller. If a revision is not specified, the latest `ACTIVE` revision is used.
     * 
     */
    @InputImport(name="taskDefinition")
      private final @Nullable Output<String> taskDefinition;

    public Output<String> getTaskDefinition() {
        return this.taskDefinition == null ? Output.empty() : this.taskDefinition;
    }

    /**
     * If `true`, this provider will wait for the service to reach a steady state (like [`aws ecs wait services-stable`](https://docs.aws.amazon.com/cli/latest/reference/ecs/wait/services-stable.html)) before continuing. Default `false`.
     * 
     */
    @InputImport(name="waitForSteadyState")
      private final @Nullable Output<Boolean> waitForSteadyState;

    public Output<Boolean> getWaitForSteadyState() {
        return this.waitForSteadyState == null ? Output.empty() : this.waitForSteadyState;
    }

    public ServiceArgs(
        @Nullable Output<List<ServiceCapacityProviderStrategyArgs>> capacityProviderStrategies,
        @Nullable Output<String> cluster,
        @Nullable Output<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker,
        @Nullable Output<ServiceDeploymentControllerArgs> deploymentController,
        @Nullable Output<Integer> deploymentMaximumPercent,
        @Nullable Output<Integer> deploymentMinimumHealthyPercent,
        @Nullable Output<Integer> desiredCount,
        @Nullable Output<Boolean> enableEcsManagedTags,
        @Nullable Output<Boolean> enableExecuteCommand,
        @Nullable Output<Boolean> forceNewDeployment,
        @Nullable Output<Integer> healthCheckGracePeriodSeconds,
        @Nullable Output<String> iamRole,
        @Nullable Output<String> launchType,
        @Nullable Output<List<ServiceLoadBalancerArgs>> loadBalancers,
        @Nullable Output<String> name,
        @Nullable Output<ServiceNetworkConfigurationArgs> networkConfiguration,
        @Nullable Output<List<ServiceOrderedPlacementStrategyArgs>> orderedPlacementStrategies,
        @Nullable Output<List<ServicePlacementConstraintArgs>> placementConstraints,
        @Nullable Output<String> platformVersion,
        @Nullable Output<String> propagateTags,
        @Nullable Output<String> schedulingStrategy,
        @Nullable Output<ServiceServiceRegistriesArgs> serviceRegistries,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> taskDefinition,
        @Nullable Output<Boolean> waitForSteadyState) {
        this.capacityProviderStrategies = capacityProviderStrategies;
        this.cluster = cluster;
        this.deploymentCircuitBreaker = deploymentCircuitBreaker;
        this.deploymentController = deploymentController;
        this.deploymentMaximumPercent = deploymentMaximumPercent;
        this.deploymentMinimumHealthyPercent = deploymentMinimumHealthyPercent;
        this.desiredCount = desiredCount;
        this.enableEcsManagedTags = enableEcsManagedTags;
        this.enableExecuteCommand = enableExecuteCommand;
        this.forceNewDeployment = forceNewDeployment;
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
        this.iamRole = iamRole;
        this.launchType = launchType;
        this.loadBalancers = loadBalancers;
        this.name = name;
        this.networkConfiguration = networkConfiguration;
        this.orderedPlacementStrategies = orderedPlacementStrategies;
        this.placementConstraints = placementConstraints;
        this.platformVersion = platformVersion;
        this.propagateTags = propagateTags;
        this.schedulingStrategy = schedulingStrategy;
        this.serviceRegistries = serviceRegistries;
        this.tags = tags;
        this.taskDefinition = taskDefinition;
        this.waitForSteadyState = waitForSteadyState;
    }

    private ServiceArgs() {
        this.capacityProviderStrategies = Output.empty();
        this.cluster = Output.empty();
        this.deploymentCircuitBreaker = Output.empty();
        this.deploymentController = Output.empty();
        this.deploymentMaximumPercent = Output.empty();
        this.deploymentMinimumHealthyPercent = Output.empty();
        this.desiredCount = Output.empty();
        this.enableEcsManagedTags = Output.empty();
        this.enableExecuteCommand = Output.empty();
        this.forceNewDeployment = Output.empty();
        this.healthCheckGracePeriodSeconds = Output.empty();
        this.iamRole = Output.empty();
        this.launchType = Output.empty();
        this.loadBalancers = Output.empty();
        this.name = Output.empty();
        this.networkConfiguration = Output.empty();
        this.orderedPlacementStrategies = Output.empty();
        this.placementConstraints = Output.empty();
        this.platformVersion = Output.empty();
        this.propagateTags = Output.empty();
        this.schedulingStrategy = Output.empty();
        this.serviceRegistries = Output.empty();
        this.tags = Output.empty();
        this.taskDefinition = Output.empty();
        this.waitForSteadyState = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ServiceCapacityProviderStrategyArgs>> capacityProviderStrategies;
        private @Nullable Output<String> cluster;
        private @Nullable Output<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker;
        private @Nullable Output<ServiceDeploymentControllerArgs> deploymentController;
        private @Nullable Output<Integer> deploymentMaximumPercent;
        private @Nullable Output<Integer> deploymentMinimumHealthyPercent;
        private @Nullable Output<Integer> desiredCount;
        private @Nullable Output<Boolean> enableEcsManagedTags;
        private @Nullable Output<Boolean> enableExecuteCommand;
        private @Nullable Output<Boolean> forceNewDeployment;
        private @Nullable Output<Integer> healthCheckGracePeriodSeconds;
        private @Nullable Output<String> iamRole;
        private @Nullable Output<String> launchType;
        private @Nullable Output<List<ServiceLoadBalancerArgs>> loadBalancers;
        private @Nullable Output<String> name;
        private @Nullable Output<ServiceNetworkConfigurationArgs> networkConfiguration;
        private @Nullable Output<List<ServiceOrderedPlacementStrategyArgs>> orderedPlacementStrategies;
        private @Nullable Output<List<ServicePlacementConstraintArgs>> placementConstraints;
        private @Nullable Output<String> platformVersion;
        private @Nullable Output<String> propagateTags;
        private @Nullable Output<String> schedulingStrategy;
        private @Nullable Output<ServiceServiceRegistriesArgs> serviceRegistries;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> taskDefinition;
        private @Nullable Output<Boolean> waitForSteadyState;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityProviderStrategies = defaults.capacityProviderStrategies;
    	      this.cluster = defaults.cluster;
    	      this.deploymentCircuitBreaker = defaults.deploymentCircuitBreaker;
    	      this.deploymentController = defaults.deploymentController;
    	      this.deploymentMaximumPercent = defaults.deploymentMaximumPercent;
    	      this.deploymentMinimumHealthyPercent = defaults.deploymentMinimumHealthyPercent;
    	      this.desiredCount = defaults.desiredCount;
    	      this.enableEcsManagedTags = defaults.enableEcsManagedTags;
    	      this.enableExecuteCommand = defaults.enableExecuteCommand;
    	      this.forceNewDeployment = defaults.forceNewDeployment;
    	      this.healthCheckGracePeriodSeconds = defaults.healthCheckGracePeriodSeconds;
    	      this.iamRole = defaults.iamRole;
    	      this.launchType = defaults.launchType;
    	      this.loadBalancers = defaults.loadBalancers;
    	      this.name = defaults.name;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.orderedPlacementStrategies = defaults.orderedPlacementStrategies;
    	      this.placementConstraints = defaults.placementConstraints;
    	      this.platformVersion = defaults.platformVersion;
    	      this.propagateTags = defaults.propagateTags;
    	      this.schedulingStrategy = defaults.schedulingStrategy;
    	      this.serviceRegistries = defaults.serviceRegistries;
    	      this.tags = defaults.tags;
    	      this.taskDefinition = defaults.taskDefinition;
    	      this.waitForSteadyState = defaults.waitForSteadyState;
        }

        public Builder capacityProviderStrategies(@Nullable Output<List<ServiceCapacityProviderStrategyArgs>> capacityProviderStrategies) {
            this.capacityProviderStrategies = capacityProviderStrategies;
            return this;
        }

        public Builder capacityProviderStrategies(@Nullable List<ServiceCapacityProviderStrategyArgs> capacityProviderStrategies) {
            this.capacityProviderStrategies = Output.ofNullable(capacityProviderStrategies);
            return this;
        }

        public Builder cluster(@Nullable Output<String> cluster) {
            this.cluster = cluster;
            return this;
        }

        public Builder cluster(@Nullable String cluster) {
            this.cluster = Output.ofNullable(cluster);
            return this;
        }

        public Builder deploymentCircuitBreaker(@Nullable Output<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker) {
            this.deploymentCircuitBreaker = deploymentCircuitBreaker;
            return this;
        }

        public Builder deploymentCircuitBreaker(@Nullable ServiceDeploymentCircuitBreakerArgs deploymentCircuitBreaker) {
            this.deploymentCircuitBreaker = Output.ofNullable(deploymentCircuitBreaker);
            return this;
        }

        public Builder deploymentController(@Nullable Output<ServiceDeploymentControllerArgs> deploymentController) {
            this.deploymentController = deploymentController;
            return this;
        }

        public Builder deploymentController(@Nullable ServiceDeploymentControllerArgs deploymentController) {
            this.deploymentController = Output.ofNullable(deploymentController);
            return this;
        }

        public Builder deploymentMaximumPercent(@Nullable Output<Integer> deploymentMaximumPercent) {
            this.deploymentMaximumPercent = deploymentMaximumPercent;
            return this;
        }

        public Builder deploymentMaximumPercent(@Nullable Integer deploymentMaximumPercent) {
            this.deploymentMaximumPercent = Output.ofNullable(deploymentMaximumPercent);
            return this;
        }

        public Builder deploymentMinimumHealthyPercent(@Nullable Output<Integer> deploymentMinimumHealthyPercent) {
            this.deploymentMinimumHealthyPercent = deploymentMinimumHealthyPercent;
            return this;
        }

        public Builder deploymentMinimumHealthyPercent(@Nullable Integer deploymentMinimumHealthyPercent) {
            this.deploymentMinimumHealthyPercent = Output.ofNullable(deploymentMinimumHealthyPercent);
            return this;
        }

        public Builder desiredCount(@Nullable Output<Integer> desiredCount) {
            this.desiredCount = desiredCount;
            return this;
        }

        public Builder desiredCount(@Nullable Integer desiredCount) {
            this.desiredCount = Output.ofNullable(desiredCount);
            return this;
        }

        public Builder enableEcsManagedTags(@Nullable Output<Boolean> enableEcsManagedTags) {
            this.enableEcsManagedTags = enableEcsManagedTags;
            return this;
        }

        public Builder enableEcsManagedTags(@Nullable Boolean enableEcsManagedTags) {
            this.enableEcsManagedTags = Output.ofNullable(enableEcsManagedTags);
            return this;
        }

        public Builder enableExecuteCommand(@Nullable Output<Boolean> enableExecuteCommand) {
            this.enableExecuteCommand = enableExecuteCommand;
            return this;
        }

        public Builder enableExecuteCommand(@Nullable Boolean enableExecuteCommand) {
            this.enableExecuteCommand = Output.ofNullable(enableExecuteCommand);
            return this;
        }

        public Builder forceNewDeployment(@Nullable Output<Boolean> forceNewDeployment) {
            this.forceNewDeployment = forceNewDeployment;
            return this;
        }

        public Builder forceNewDeployment(@Nullable Boolean forceNewDeployment) {
            this.forceNewDeployment = Output.ofNullable(forceNewDeployment);
            return this;
        }

        public Builder healthCheckGracePeriodSeconds(@Nullable Output<Integer> healthCheckGracePeriodSeconds) {
            this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
            return this;
        }

        public Builder healthCheckGracePeriodSeconds(@Nullable Integer healthCheckGracePeriodSeconds) {
            this.healthCheckGracePeriodSeconds = Output.ofNullable(healthCheckGracePeriodSeconds);
            return this;
        }

        public Builder iamRole(@Nullable Output<String> iamRole) {
            this.iamRole = iamRole;
            return this;
        }

        public Builder iamRole(@Nullable String iamRole) {
            this.iamRole = Output.ofNullable(iamRole);
            return this;
        }

        public Builder launchType(@Nullable Output<String> launchType) {
            this.launchType = launchType;
            return this;
        }

        public Builder launchType(@Nullable String launchType) {
            this.launchType = Output.ofNullable(launchType);
            return this;
        }

        public Builder loadBalancers(@Nullable Output<List<ServiceLoadBalancerArgs>> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        public Builder loadBalancers(@Nullable List<ServiceLoadBalancerArgs> loadBalancers) {
            this.loadBalancers = Output.ofNullable(loadBalancers);
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

        public Builder networkConfiguration(@Nullable Output<ServiceNetworkConfigurationArgs> networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        public Builder networkConfiguration(@Nullable ServiceNetworkConfigurationArgs networkConfiguration) {
            this.networkConfiguration = Output.ofNullable(networkConfiguration);
            return this;
        }

        public Builder orderedPlacementStrategies(@Nullable Output<List<ServiceOrderedPlacementStrategyArgs>> orderedPlacementStrategies) {
            this.orderedPlacementStrategies = orderedPlacementStrategies;
            return this;
        }

        public Builder orderedPlacementStrategies(@Nullable List<ServiceOrderedPlacementStrategyArgs> orderedPlacementStrategies) {
            this.orderedPlacementStrategies = Output.ofNullable(orderedPlacementStrategies);
            return this;
        }

        public Builder placementConstraints(@Nullable Output<List<ServicePlacementConstraintArgs>> placementConstraints) {
            this.placementConstraints = placementConstraints;
            return this;
        }

        public Builder placementConstraints(@Nullable List<ServicePlacementConstraintArgs> placementConstraints) {
            this.placementConstraints = Output.ofNullable(placementConstraints);
            return this;
        }

        public Builder platformVersion(@Nullable Output<String> platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }

        public Builder platformVersion(@Nullable String platformVersion) {
            this.platformVersion = Output.ofNullable(platformVersion);
            return this;
        }

        public Builder propagateTags(@Nullable Output<String> propagateTags) {
            this.propagateTags = propagateTags;
            return this;
        }

        public Builder propagateTags(@Nullable String propagateTags) {
            this.propagateTags = Output.ofNullable(propagateTags);
            return this;
        }

        public Builder schedulingStrategy(@Nullable Output<String> schedulingStrategy) {
            this.schedulingStrategy = schedulingStrategy;
            return this;
        }

        public Builder schedulingStrategy(@Nullable String schedulingStrategy) {
            this.schedulingStrategy = Output.ofNullable(schedulingStrategy);
            return this;
        }

        public Builder serviceRegistries(@Nullable Output<ServiceServiceRegistriesArgs> serviceRegistries) {
            this.serviceRegistries = serviceRegistries;
            return this;
        }

        public Builder serviceRegistries(@Nullable ServiceServiceRegistriesArgs serviceRegistries) {
            this.serviceRegistries = Output.ofNullable(serviceRegistries);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder taskDefinition(@Nullable Output<String> taskDefinition) {
            this.taskDefinition = taskDefinition;
            return this;
        }

        public Builder taskDefinition(@Nullable String taskDefinition) {
            this.taskDefinition = Output.ofNullable(taskDefinition);
            return this;
        }

        public Builder waitForSteadyState(@Nullable Output<Boolean> waitForSteadyState) {
            this.waitForSteadyState = waitForSteadyState;
            return this;
        }

        public Builder waitForSteadyState(@Nullable Boolean waitForSteadyState) {
            this.waitForSteadyState = Output.ofNullable(waitForSteadyState);
            return this;
        }
        public ServiceArgs build() {
            return new ServiceArgs(capacityProviderStrategies, cluster, deploymentCircuitBreaker, deploymentController, deploymentMaximumPercent, deploymentMinimumHealthyPercent, desiredCount, enableEcsManagedTags, enableExecuteCommand, forceNewDeployment, healthCheckGracePeriodSeconds, iamRole, launchType, loadBalancers, name, networkConfiguration, orderedPlacementStrategies, placementConstraints, platformVersion, propagateTags, schedulingStrategy, serviceRegistries, tags, taskDefinition, waitForSteadyState);
        }
    }
}
