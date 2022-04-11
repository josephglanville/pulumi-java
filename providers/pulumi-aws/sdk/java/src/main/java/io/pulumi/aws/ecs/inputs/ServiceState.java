// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.aws.ecs.inputs.ServiceCapacityProviderStrategyGetArgs;
import io.pulumi.aws.ecs.inputs.ServiceDeploymentCircuitBreakerGetArgs;
import io.pulumi.aws.ecs.inputs.ServiceDeploymentControllerGetArgs;
import io.pulumi.aws.ecs.inputs.ServiceLoadBalancerGetArgs;
import io.pulumi.aws.ecs.inputs.ServiceNetworkConfigurationGetArgs;
import io.pulumi.aws.ecs.inputs.ServiceOrderedPlacementStrategyGetArgs;
import io.pulumi.aws.ecs.inputs.ServicePlacementConstraintGetArgs;
import io.pulumi.aws.ecs.inputs.ServiceServiceRegistriesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceState Empty = new ServiceState();

    /**
     * Capacity provider strategies to use for the service. Can be one or more. These can be updated without destroying and recreating the service only if `force_new_deployment = true` and not changing from 0 `capacity_provider_strategy` blocks to greater than 0, or vice versa. See below.
     * 
     */
    @Import(name="capacityProviderStrategies")
      private final @Nullable Output<List<ServiceCapacityProviderStrategyGetArgs>> capacityProviderStrategies;

    public Output<List<ServiceCapacityProviderStrategyGetArgs>> getCapacityProviderStrategies() {
        return this.capacityProviderStrategies == null ? Codegen.empty() : this.capacityProviderStrategies;
    }

    /**
     * ARN of an ECS cluster.
     * 
     */
    @Import(name="cluster")
      private final @Nullable Output<String> cluster;

    public Output<String> getCluster() {
        return this.cluster == null ? Codegen.empty() : this.cluster;
    }

    /**
     * Configuration block for deployment circuit breaker. See below.
     * 
     */
    @Import(name="deploymentCircuitBreaker")
      private final @Nullable Output<ServiceDeploymentCircuitBreakerGetArgs> deploymentCircuitBreaker;

    public Output<ServiceDeploymentCircuitBreakerGetArgs> getDeploymentCircuitBreaker() {
        return this.deploymentCircuitBreaker == null ? Codegen.empty() : this.deploymentCircuitBreaker;
    }

    /**
     * Configuration block for deployment controller configuration. See below.
     * 
     */
    @Import(name="deploymentController")
      private final @Nullable Output<ServiceDeploymentControllerGetArgs> deploymentController;

    public Output<ServiceDeploymentControllerGetArgs> getDeploymentController() {
        return this.deploymentController == null ? Codegen.empty() : this.deploymentController;
    }

    /**
     * Upper limit (as a percentage of the service's desiredCount) of the number of running tasks that can be running in a service during a deployment. Not valid when using the `DAEMON` scheduling strategy.
     * 
     */
    @Import(name="deploymentMaximumPercent")
      private final @Nullable Output<Integer> deploymentMaximumPercent;

    public Output<Integer> getDeploymentMaximumPercent() {
        return this.deploymentMaximumPercent == null ? Codegen.empty() : this.deploymentMaximumPercent;
    }

    /**
     * Lower limit (as a percentage of the service's desiredCount) of the number of running tasks that must remain running and healthy in a service during a deployment.
     * 
     */
    @Import(name="deploymentMinimumHealthyPercent")
      private final @Nullable Output<Integer> deploymentMinimumHealthyPercent;

    public Output<Integer> getDeploymentMinimumHealthyPercent() {
        return this.deploymentMinimumHealthyPercent == null ? Codegen.empty() : this.deploymentMinimumHealthyPercent;
    }

    /**
     * Number of instances of the task definition to place and keep running. Defaults to 0. Do not specify if using the `DAEMON` scheduling strategy.
     * 
     */
    @Import(name="desiredCount")
      private final @Nullable Output<Integer> desiredCount;

    public Output<Integer> getDesiredCount() {
        return this.desiredCount == null ? Codegen.empty() : this.desiredCount;
    }

    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     * 
     */
    @Import(name="enableEcsManagedTags")
      private final @Nullable Output<Boolean> enableEcsManagedTags;

    public Output<Boolean> getEnableEcsManagedTags() {
        return this.enableEcsManagedTags == null ? Codegen.empty() : this.enableEcsManagedTags;
    }

    /**
     * Specifies whether to enable Amazon ECS Exec for the tasks within the service.
     * 
     */
    @Import(name="enableExecuteCommand")
      private final @Nullable Output<Boolean> enableExecuteCommand;

    public Output<Boolean> getEnableExecuteCommand() {
        return this.enableExecuteCommand == null ? Codegen.empty() : this.enableExecuteCommand;
    }

    /**
     * Enable to force a new task deployment of the service. This can be used to update tasks to use a newer Docker image with same image/tag combination (e.g., `myimage:latest`), roll Fargate tasks onto a newer platform version, or immediately deploy `ordered_placement_strategy` and `placement_constraints` updates.
     * 
     */
    @Import(name="forceNewDeployment")
      private final @Nullable Output<Boolean> forceNewDeployment;

    public Output<Boolean> getForceNewDeployment() {
        return this.forceNewDeployment == null ? Codegen.empty() : this.forceNewDeployment;
    }

    /**
     * Seconds to ignore failing load balancer health checks on newly instantiated tasks to prevent premature shutdown, up to 2147483647. Only valid for services configured to use load balancers.
     * 
     */
    @Import(name="healthCheckGracePeriodSeconds")
      private final @Nullable Output<Integer> healthCheckGracePeriodSeconds;

    public Output<Integer> getHealthCheckGracePeriodSeconds() {
        return this.healthCheckGracePeriodSeconds == null ? Codegen.empty() : this.healthCheckGracePeriodSeconds;
    }

    /**
     * ARN of the IAM role that allows Amazon ECS to make calls to your load balancer on your behalf. This parameter is required if you are using a load balancer with your service, but only if your task definition does not use the `awsvpc` network mode. If using `awsvpc` network mode, do not specify this role. If your account has already created the Amazon ECS service-linked role, that role is used by default for your service unless you specify a role here.
     * 
     */
    @Import(name="iamRole")
      private final @Nullable Output<String> iamRole;

    public Output<String> getIamRole() {
        return this.iamRole == null ? Codegen.empty() : this.iamRole;
    }

    /**
     * Launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     * 
     */
    @Import(name="launchType")
      private final @Nullable Output<String> launchType;

    public Output<String> getLaunchType() {
        return this.launchType == null ? Codegen.empty() : this.launchType;
    }

    /**
     * Configuration block for load balancers. See below.
     * 
     */
    @Import(name="loadBalancers")
      private final @Nullable Output<List<ServiceLoadBalancerGetArgs>> loadBalancers;

    public Output<List<ServiceLoadBalancerGetArgs>> getLoadBalancers() {
        return this.loadBalancers == null ? Codegen.empty() : this.loadBalancers;
    }

    /**
     * Name of the service (up to 255 letters, numbers, hyphens, and underscores)
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     * 
     */
    @Import(name="networkConfiguration")
      private final @Nullable Output<ServiceNetworkConfigurationGetArgs> networkConfiguration;

    public Output<ServiceNetworkConfigurationGetArgs> getNetworkConfiguration() {
        return this.networkConfiguration == null ? Codegen.empty() : this.networkConfiguration;
    }

    /**
     * Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. Updates to this configuration will take effect next task deployment unless `force_new_deployment` is enabled. The maximum number of `ordered_placement_strategy` blocks is `5`. See below.
     * 
     */
    @Import(name="orderedPlacementStrategies")
      private final @Nullable Output<List<ServiceOrderedPlacementStrategyGetArgs>> orderedPlacementStrategies;

    public Output<List<ServiceOrderedPlacementStrategyGetArgs>> getOrderedPlacementStrategies() {
        return this.orderedPlacementStrategies == null ? Codegen.empty() : this.orderedPlacementStrategies;
    }

    /**
     * Rules that are taken into consideration during task placement. Updates to this configuration will take effect next task deployment unless `force_new_deployment` is enabled. Maximum number of `placement_constraints` is `10`. See below.
     * 
     */
    @Import(name="placementConstraints")
      private final @Nullable Output<List<ServicePlacementConstraintGetArgs>> placementConstraints;

    public Output<List<ServicePlacementConstraintGetArgs>> getPlacementConstraints() {
        return this.placementConstraints == null ? Codegen.empty() : this.placementConstraints;
    }

    /**
     * Platform version on which to run your service. Only applicable for `launch_type` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    @Import(name="platformVersion")
      private final @Nullable Output<String> platformVersion;

    public Output<String> getPlatformVersion() {
        return this.platformVersion == null ? Codegen.empty() : this.platformVersion;
    }

    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks. The valid values are `SERVICE` and `TASK_DEFINITION`.
     * 
     */
    @Import(name="propagateTags")
      private final @Nullable Output<String> propagateTags;

    public Output<String> getPropagateTags() {
        return this.propagateTags == null ? Codegen.empty() : this.propagateTags;
    }

    /**
     * Scheduling strategy to use for the service. The valid values are `REPLICA` and `DAEMON`. Defaults to `REPLICA`. Note that [*Tasks using the Fargate launch type or the `CODE_DEPLOY` or `EXTERNAL` deployment controller types don't support the `DAEMON` scheduling strategy*](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html).
     * 
     */
    @Import(name="schedulingStrategy")
      private final @Nullable Output<String> schedulingStrategy;

    public Output<String> getSchedulingStrategy() {
        return this.schedulingStrategy == null ? Codegen.empty() : this.schedulingStrategy;
    }

    /**
     * Service discovery registries for the service. The maximum number of `service_registries` blocks is `1`. See below.
     * 
     */
    @Import(name="serviceRegistries")
      private final @Nullable Output<ServiceServiceRegistriesGetArgs> serviceRegistries;

    public Output<ServiceServiceRegistriesGetArgs> getServiceRegistries() {
        return this.serviceRegistries == null ? Codegen.empty() : this.serviceRegistries;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service. Required unless using the `EXTERNAL` deployment controller. If a revision is not specified, the latest `ACTIVE` revision is used.
     * 
     */
    @Import(name="taskDefinition")
      private final @Nullable Output<String> taskDefinition;

    public Output<String> getTaskDefinition() {
        return this.taskDefinition == null ? Codegen.empty() : this.taskDefinition;
    }

    /**
     * If `true`, this provider will wait for the service to reach a steady state (like [`aws ecs wait services-stable`](https://docs.aws.amazon.com/cli/latest/reference/ecs/wait/services-stable.html)) before continuing. Default `false`.
     * 
     */
    @Import(name="waitForSteadyState")
      private final @Nullable Output<Boolean> waitForSteadyState;

    public Output<Boolean> getWaitForSteadyState() {
        return this.waitForSteadyState == null ? Codegen.empty() : this.waitForSteadyState;
    }

    public ServiceState(
        @Nullable Output<List<ServiceCapacityProviderStrategyGetArgs>> capacityProviderStrategies,
        @Nullable Output<String> cluster,
        @Nullable Output<ServiceDeploymentCircuitBreakerGetArgs> deploymentCircuitBreaker,
        @Nullable Output<ServiceDeploymentControllerGetArgs> deploymentController,
        @Nullable Output<Integer> deploymentMaximumPercent,
        @Nullable Output<Integer> deploymentMinimumHealthyPercent,
        @Nullable Output<Integer> desiredCount,
        @Nullable Output<Boolean> enableEcsManagedTags,
        @Nullable Output<Boolean> enableExecuteCommand,
        @Nullable Output<Boolean> forceNewDeployment,
        @Nullable Output<Integer> healthCheckGracePeriodSeconds,
        @Nullable Output<String> iamRole,
        @Nullable Output<String> launchType,
        @Nullable Output<List<ServiceLoadBalancerGetArgs>> loadBalancers,
        @Nullable Output<String> name,
        @Nullable Output<ServiceNetworkConfigurationGetArgs> networkConfiguration,
        @Nullable Output<List<ServiceOrderedPlacementStrategyGetArgs>> orderedPlacementStrategies,
        @Nullable Output<List<ServicePlacementConstraintGetArgs>> placementConstraints,
        @Nullable Output<String> platformVersion,
        @Nullable Output<String> propagateTags,
        @Nullable Output<String> schedulingStrategy,
        @Nullable Output<ServiceServiceRegistriesGetArgs> serviceRegistries,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
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
        this.tagsAll = tagsAll;
        this.taskDefinition = taskDefinition;
        this.waitForSteadyState = waitForSteadyState;
    }

    private ServiceState() {
        this.capacityProviderStrategies = Codegen.empty();
        this.cluster = Codegen.empty();
        this.deploymentCircuitBreaker = Codegen.empty();
        this.deploymentController = Codegen.empty();
        this.deploymentMaximumPercent = Codegen.empty();
        this.deploymentMinimumHealthyPercent = Codegen.empty();
        this.desiredCount = Codegen.empty();
        this.enableEcsManagedTags = Codegen.empty();
        this.enableExecuteCommand = Codegen.empty();
        this.forceNewDeployment = Codegen.empty();
        this.healthCheckGracePeriodSeconds = Codegen.empty();
        this.iamRole = Codegen.empty();
        this.launchType = Codegen.empty();
        this.loadBalancers = Codegen.empty();
        this.name = Codegen.empty();
        this.networkConfiguration = Codegen.empty();
        this.orderedPlacementStrategies = Codegen.empty();
        this.placementConstraints = Codegen.empty();
        this.platformVersion = Codegen.empty();
        this.propagateTags = Codegen.empty();
        this.schedulingStrategy = Codegen.empty();
        this.serviceRegistries = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.taskDefinition = Codegen.empty();
        this.waitForSteadyState = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ServiceCapacityProviderStrategyGetArgs>> capacityProviderStrategies;
        private @Nullable Output<String> cluster;
        private @Nullable Output<ServiceDeploymentCircuitBreakerGetArgs> deploymentCircuitBreaker;
        private @Nullable Output<ServiceDeploymentControllerGetArgs> deploymentController;
        private @Nullable Output<Integer> deploymentMaximumPercent;
        private @Nullable Output<Integer> deploymentMinimumHealthyPercent;
        private @Nullable Output<Integer> desiredCount;
        private @Nullable Output<Boolean> enableEcsManagedTags;
        private @Nullable Output<Boolean> enableExecuteCommand;
        private @Nullable Output<Boolean> forceNewDeployment;
        private @Nullable Output<Integer> healthCheckGracePeriodSeconds;
        private @Nullable Output<String> iamRole;
        private @Nullable Output<String> launchType;
        private @Nullable Output<List<ServiceLoadBalancerGetArgs>> loadBalancers;
        private @Nullable Output<String> name;
        private @Nullable Output<ServiceNetworkConfigurationGetArgs> networkConfiguration;
        private @Nullable Output<List<ServiceOrderedPlacementStrategyGetArgs>> orderedPlacementStrategies;
        private @Nullable Output<List<ServicePlacementConstraintGetArgs>> placementConstraints;
        private @Nullable Output<String> platformVersion;
        private @Nullable Output<String> propagateTags;
        private @Nullable Output<String> schedulingStrategy;
        private @Nullable Output<ServiceServiceRegistriesGetArgs> serviceRegistries;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> taskDefinition;
        private @Nullable Output<Boolean> waitForSteadyState;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceState defaults) {
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
    	      this.tagsAll = defaults.tagsAll;
    	      this.taskDefinition = defaults.taskDefinition;
    	      this.waitForSteadyState = defaults.waitForSteadyState;
        }

        public Builder capacityProviderStrategies(@Nullable Output<List<ServiceCapacityProviderStrategyGetArgs>> capacityProviderStrategies) {
            this.capacityProviderStrategies = capacityProviderStrategies;
            return this;
        }
        public Builder capacityProviderStrategies(@Nullable List<ServiceCapacityProviderStrategyGetArgs> capacityProviderStrategies) {
            this.capacityProviderStrategies = Codegen.ofNullable(capacityProviderStrategies);
            return this;
        }
        public Builder capacityProviderStrategies(ServiceCapacityProviderStrategyGetArgs... capacityProviderStrategies) {
            return capacityProviderStrategies(List.of(capacityProviderStrategies));
        }
        public Builder cluster(@Nullable Output<String> cluster) {
            this.cluster = cluster;
            return this;
        }
        public Builder cluster(@Nullable String cluster) {
            this.cluster = Codegen.ofNullable(cluster);
            return this;
        }
        public Builder deploymentCircuitBreaker(@Nullable Output<ServiceDeploymentCircuitBreakerGetArgs> deploymentCircuitBreaker) {
            this.deploymentCircuitBreaker = deploymentCircuitBreaker;
            return this;
        }
        public Builder deploymentCircuitBreaker(@Nullable ServiceDeploymentCircuitBreakerGetArgs deploymentCircuitBreaker) {
            this.deploymentCircuitBreaker = Codegen.ofNullable(deploymentCircuitBreaker);
            return this;
        }
        public Builder deploymentController(@Nullable Output<ServiceDeploymentControllerGetArgs> deploymentController) {
            this.deploymentController = deploymentController;
            return this;
        }
        public Builder deploymentController(@Nullable ServiceDeploymentControllerGetArgs deploymentController) {
            this.deploymentController = Codegen.ofNullable(deploymentController);
            return this;
        }
        public Builder deploymentMaximumPercent(@Nullable Output<Integer> deploymentMaximumPercent) {
            this.deploymentMaximumPercent = deploymentMaximumPercent;
            return this;
        }
        public Builder deploymentMaximumPercent(@Nullable Integer deploymentMaximumPercent) {
            this.deploymentMaximumPercent = Codegen.ofNullable(deploymentMaximumPercent);
            return this;
        }
        public Builder deploymentMinimumHealthyPercent(@Nullable Output<Integer> deploymentMinimumHealthyPercent) {
            this.deploymentMinimumHealthyPercent = deploymentMinimumHealthyPercent;
            return this;
        }
        public Builder deploymentMinimumHealthyPercent(@Nullable Integer deploymentMinimumHealthyPercent) {
            this.deploymentMinimumHealthyPercent = Codegen.ofNullable(deploymentMinimumHealthyPercent);
            return this;
        }
        public Builder desiredCount(@Nullable Output<Integer> desiredCount) {
            this.desiredCount = desiredCount;
            return this;
        }
        public Builder desiredCount(@Nullable Integer desiredCount) {
            this.desiredCount = Codegen.ofNullable(desiredCount);
            return this;
        }
        public Builder enableEcsManagedTags(@Nullable Output<Boolean> enableEcsManagedTags) {
            this.enableEcsManagedTags = enableEcsManagedTags;
            return this;
        }
        public Builder enableEcsManagedTags(@Nullable Boolean enableEcsManagedTags) {
            this.enableEcsManagedTags = Codegen.ofNullable(enableEcsManagedTags);
            return this;
        }
        public Builder enableExecuteCommand(@Nullable Output<Boolean> enableExecuteCommand) {
            this.enableExecuteCommand = enableExecuteCommand;
            return this;
        }
        public Builder enableExecuteCommand(@Nullable Boolean enableExecuteCommand) {
            this.enableExecuteCommand = Codegen.ofNullable(enableExecuteCommand);
            return this;
        }
        public Builder forceNewDeployment(@Nullable Output<Boolean> forceNewDeployment) {
            this.forceNewDeployment = forceNewDeployment;
            return this;
        }
        public Builder forceNewDeployment(@Nullable Boolean forceNewDeployment) {
            this.forceNewDeployment = Codegen.ofNullable(forceNewDeployment);
            return this;
        }
        public Builder healthCheckGracePeriodSeconds(@Nullable Output<Integer> healthCheckGracePeriodSeconds) {
            this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
            return this;
        }
        public Builder healthCheckGracePeriodSeconds(@Nullable Integer healthCheckGracePeriodSeconds) {
            this.healthCheckGracePeriodSeconds = Codegen.ofNullable(healthCheckGracePeriodSeconds);
            return this;
        }
        public Builder iamRole(@Nullable Output<String> iamRole) {
            this.iamRole = iamRole;
            return this;
        }
        public Builder iamRole(@Nullable String iamRole) {
            this.iamRole = Codegen.ofNullable(iamRole);
            return this;
        }
        public Builder launchType(@Nullable Output<String> launchType) {
            this.launchType = launchType;
            return this;
        }
        public Builder launchType(@Nullable String launchType) {
            this.launchType = Codegen.ofNullable(launchType);
            return this;
        }
        public Builder loadBalancers(@Nullable Output<List<ServiceLoadBalancerGetArgs>> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }
        public Builder loadBalancers(@Nullable List<ServiceLoadBalancerGetArgs> loadBalancers) {
            this.loadBalancers = Codegen.ofNullable(loadBalancers);
            return this;
        }
        public Builder loadBalancers(ServiceLoadBalancerGetArgs... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder networkConfiguration(@Nullable Output<ServiceNetworkConfigurationGetArgs> networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public Builder networkConfiguration(@Nullable ServiceNetworkConfigurationGetArgs networkConfiguration) {
            this.networkConfiguration = Codegen.ofNullable(networkConfiguration);
            return this;
        }
        public Builder orderedPlacementStrategies(@Nullable Output<List<ServiceOrderedPlacementStrategyGetArgs>> orderedPlacementStrategies) {
            this.orderedPlacementStrategies = orderedPlacementStrategies;
            return this;
        }
        public Builder orderedPlacementStrategies(@Nullable List<ServiceOrderedPlacementStrategyGetArgs> orderedPlacementStrategies) {
            this.orderedPlacementStrategies = Codegen.ofNullable(orderedPlacementStrategies);
            return this;
        }
        public Builder orderedPlacementStrategies(ServiceOrderedPlacementStrategyGetArgs... orderedPlacementStrategies) {
            return orderedPlacementStrategies(List.of(orderedPlacementStrategies));
        }
        public Builder placementConstraints(@Nullable Output<List<ServicePlacementConstraintGetArgs>> placementConstraints) {
            this.placementConstraints = placementConstraints;
            return this;
        }
        public Builder placementConstraints(@Nullable List<ServicePlacementConstraintGetArgs> placementConstraints) {
            this.placementConstraints = Codegen.ofNullable(placementConstraints);
            return this;
        }
        public Builder placementConstraints(ServicePlacementConstraintGetArgs... placementConstraints) {
            return placementConstraints(List.of(placementConstraints));
        }
        public Builder platformVersion(@Nullable Output<String> platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }
        public Builder platformVersion(@Nullable String platformVersion) {
            this.platformVersion = Codegen.ofNullable(platformVersion);
            return this;
        }
        public Builder propagateTags(@Nullable Output<String> propagateTags) {
            this.propagateTags = propagateTags;
            return this;
        }
        public Builder propagateTags(@Nullable String propagateTags) {
            this.propagateTags = Codegen.ofNullable(propagateTags);
            return this;
        }
        public Builder schedulingStrategy(@Nullable Output<String> schedulingStrategy) {
            this.schedulingStrategy = schedulingStrategy;
            return this;
        }
        public Builder schedulingStrategy(@Nullable String schedulingStrategy) {
            this.schedulingStrategy = Codegen.ofNullable(schedulingStrategy);
            return this;
        }
        public Builder serviceRegistries(@Nullable Output<ServiceServiceRegistriesGetArgs> serviceRegistries) {
            this.serviceRegistries = serviceRegistries;
            return this;
        }
        public Builder serviceRegistries(@Nullable ServiceServiceRegistriesGetArgs serviceRegistries) {
            this.serviceRegistries = Codegen.ofNullable(serviceRegistries);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder taskDefinition(@Nullable Output<String> taskDefinition) {
            this.taskDefinition = taskDefinition;
            return this;
        }
        public Builder taskDefinition(@Nullable String taskDefinition) {
            this.taskDefinition = Codegen.ofNullable(taskDefinition);
            return this;
        }
        public Builder waitForSteadyState(@Nullable Output<Boolean> waitForSteadyState) {
            this.waitForSteadyState = waitForSteadyState;
            return this;
        }
        public Builder waitForSteadyState(@Nullable Boolean waitForSteadyState) {
            this.waitForSteadyState = Codegen.ofNullable(waitForSteadyState);
            return this;
        }        public ServiceState build() {
            return new ServiceState(capacityProviderStrategies, cluster, deploymentCircuitBreaker, deploymentController, deploymentMaximumPercent, deploymentMinimumHealthyPercent, desiredCount, enableEcsManagedTags, enableExecuteCommand, forceNewDeployment, healthCheckGracePeriodSeconds, iamRole, launchType, loadBalancers, name, networkConfiguration, orderedPlacementStrategies, placementConstraints, platformVersion, propagateTags, schedulingStrategy, serviceRegistries, tags, tagsAll, taskDefinition, waitForSteadyState);
        }
    }
}
