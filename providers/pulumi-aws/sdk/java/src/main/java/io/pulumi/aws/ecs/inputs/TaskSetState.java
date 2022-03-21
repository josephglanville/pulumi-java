// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.aws.ecs.inputs.TaskSetCapacityProviderStrategyGetArgs;
import io.pulumi.aws.ecs.inputs.TaskSetLoadBalancerGetArgs;
import io.pulumi.aws.ecs.inputs.TaskSetNetworkConfigurationGetArgs;
import io.pulumi.aws.ecs.inputs.TaskSetScaleGetArgs;
import io.pulumi.aws.ecs.inputs.TaskSetServiceRegistriesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskSetState extends io.pulumi.resources.ResourceArgs {

    public static final TaskSetState Empty = new TaskSetState();

    /**
     * The Amazon Resource Name (ARN) that identifies the task set.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The capacity provider strategy to use for the service. Can be one or more.  Defined below.
     * 
     */
    @Import(name="capacityProviderStrategies")
      private final @Nullable Output<List<TaskSetCapacityProviderStrategyGetArgs>> capacityProviderStrategies;

    public Output<List<TaskSetCapacityProviderStrategyGetArgs>> getCapacityProviderStrategies() {
        return this.capacityProviderStrategies == null ? Output.empty() : this.capacityProviderStrategies;
    }

    /**
     * The short name or ARN of the cluster that hosts the service to create the task set in.
     * 
     */
    @Import(name="cluster")
      private final @Nullable Output<String> cluster;

    public Output<String> getCluster() {
        return this.cluster == null ? Output.empty() : this.cluster;
    }

    /**
     * The external ID associated with the task set.
     * 
     */
    @Import(name="externalId")
      private final @Nullable Output<String> externalId;

    public Output<String> getExternalId() {
        return this.externalId == null ? Output.empty() : this.externalId;
    }

    @Import(name="forceDelete")
      private final @Nullable Output<Boolean> forceDelete;

    public Output<Boolean> getForceDelete() {
        return this.forceDelete == null ? Output.empty() : this.forceDelete;
    }

    /**
     * The launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     * 
     */
    @Import(name="launchType")
      private final @Nullable Output<String> launchType;

    public Output<String> getLaunchType() {
        return this.launchType == null ? Output.empty() : this.launchType;
    }

    /**
     * Details on load balancers that are used with a task set. Detailed below.
     * 
     */
    @Import(name="loadBalancers")
      private final @Nullable Output<List<TaskSetLoadBalancerGetArgs>> loadBalancers;

    public Output<List<TaskSetLoadBalancerGetArgs>> getLoadBalancers() {
        return this.loadBalancers == null ? Output.empty() : this.loadBalancers;
    }

    /**
     * The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. Detailed below.
     * 
     */
    @Import(name="networkConfiguration")
      private final @Nullable Output<TaskSetNetworkConfigurationGetArgs> networkConfiguration;

    public Output<TaskSetNetworkConfigurationGetArgs> getNetworkConfiguration() {
        return this.networkConfiguration == null ? Output.empty() : this.networkConfiguration;
    }

    /**
     * The platform version on which to run your service. Only applicable for `launch_type` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    @Import(name="platformVersion")
      private final @Nullable Output<String> platformVersion;

    public Output<String> getPlatformVersion() {
        return this.platformVersion == null ? Output.empty() : this.platformVersion;
    }

    /**
     * A floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
     * 
     */
    @Import(name="scale")
      private final @Nullable Output<TaskSetScaleGetArgs> scale;

    public Output<TaskSetScaleGetArgs> getScale() {
        return this.scale == null ? Output.empty() : this.scale;
    }

    /**
     * The short name or ARN of the ECS service.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Output.empty() : this.service;
    }

    /**
     * The service discovery registries for the service. The maximum number of `service_registries` blocks is `1`. Detailed below.
     * 
     */
    @Import(name="serviceRegistries")
      private final @Nullable Output<TaskSetServiceRegistriesGetArgs> serviceRegistries;

    public Output<TaskSetServiceRegistriesGetArgs> getServiceRegistries() {
        return this.serviceRegistries == null ? Output.empty() : this.serviceRegistries;
    }

    /**
     * The stability status. This indicates whether the task set has reached a steady state.
     * 
     */
    @Import(name="stabilityStatus")
      private final @Nullable Output<String> stabilityStatus;

    public Output<String> getStabilityStatus() {
        return this.stabilityStatus == null ? Output.empty() : this.stabilityStatus;
    }

    /**
     * The status of the task set.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
     * 
     */
    @Import(name="taskDefinition")
      private final @Nullable Output<String> taskDefinition;

    public Output<String> getTaskDefinition() {
        return this.taskDefinition == null ? Output.empty() : this.taskDefinition;
    }

    /**
     * The ID of the task set.
     * 
     */
    @Import(name="taskSetId")
      private final @Nullable Output<String> taskSetId;

    public Output<String> getTaskSetId() {
        return this.taskSetId == null ? Output.empty() : this.taskSetId;
    }

    @Import(name="waitUntilStable")
      private final @Nullable Output<Boolean> waitUntilStable;

    public Output<Boolean> getWaitUntilStable() {
        return this.waitUntilStable == null ? Output.empty() : this.waitUntilStable;
    }

    /**
     * Wait timeout for task set to reach `STEADY_STATE`. Valid time units include `ns`, `us` (or `µs`), `ms`, `s`, `m`, and `h`. Default `10m`.
     * 
     */
    @Import(name="waitUntilStableTimeout")
      private final @Nullable Output<String> waitUntilStableTimeout;

    public Output<String> getWaitUntilStableTimeout() {
        return this.waitUntilStableTimeout == null ? Output.empty() : this.waitUntilStableTimeout;
    }

    public TaskSetState(
        @Nullable Output<String> arn,
        @Nullable Output<List<TaskSetCapacityProviderStrategyGetArgs>> capacityProviderStrategies,
        @Nullable Output<String> cluster,
        @Nullable Output<String> externalId,
        @Nullable Output<Boolean> forceDelete,
        @Nullable Output<String> launchType,
        @Nullable Output<List<TaskSetLoadBalancerGetArgs>> loadBalancers,
        @Nullable Output<TaskSetNetworkConfigurationGetArgs> networkConfiguration,
        @Nullable Output<String> platformVersion,
        @Nullable Output<TaskSetScaleGetArgs> scale,
        @Nullable Output<String> service,
        @Nullable Output<TaskSetServiceRegistriesGetArgs> serviceRegistries,
        @Nullable Output<String> stabilityStatus,
        @Nullable Output<String> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> taskDefinition,
        @Nullable Output<String> taskSetId,
        @Nullable Output<Boolean> waitUntilStable,
        @Nullable Output<String> waitUntilStableTimeout) {
        this.arn = arn;
        this.capacityProviderStrategies = capacityProviderStrategies;
        this.cluster = cluster;
        this.externalId = externalId;
        this.forceDelete = forceDelete;
        this.launchType = launchType;
        this.loadBalancers = loadBalancers;
        this.networkConfiguration = networkConfiguration;
        this.platformVersion = platformVersion;
        this.scale = scale;
        this.service = service;
        this.serviceRegistries = serviceRegistries;
        this.stabilityStatus = stabilityStatus;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.taskDefinition = taskDefinition;
        this.taskSetId = taskSetId;
        this.waitUntilStable = waitUntilStable;
        this.waitUntilStableTimeout = waitUntilStableTimeout;
    }

    private TaskSetState() {
        this.arn = Output.empty();
        this.capacityProviderStrategies = Output.empty();
        this.cluster = Output.empty();
        this.externalId = Output.empty();
        this.forceDelete = Output.empty();
        this.launchType = Output.empty();
        this.loadBalancers = Output.empty();
        this.networkConfiguration = Output.empty();
        this.platformVersion = Output.empty();
        this.scale = Output.empty();
        this.service = Output.empty();
        this.serviceRegistries = Output.empty();
        this.stabilityStatus = Output.empty();
        this.status = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.taskDefinition = Output.empty();
        this.taskSetId = Output.empty();
        this.waitUntilStable = Output.empty();
        this.waitUntilStableTimeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<TaskSetCapacityProviderStrategyGetArgs>> capacityProviderStrategies;
        private @Nullable Output<String> cluster;
        private @Nullable Output<String> externalId;
        private @Nullable Output<Boolean> forceDelete;
        private @Nullable Output<String> launchType;
        private @Nullable Output<List<TaskSetLoadBalancerGetArgs>> loadBalancers;
        private @Nullable Output<TaskSetNetworkConfigurationGetArgs> networkConfiguration;
        private @Nullable Output<String> platformVersion;
        private @Nullable Output<TaskSetScaleGetArgs> scale;
        private @Nullable Output<String> service;
        private @Nullable Output<TaskSetServiceRegistriesGetArgs> serviceRegistries;
        private @Nullable Output<String> stabilityStatus;
        private @Nullable Output<String> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> taskDefinition;
        private @Nullable Output<String> taskSetId;
        private @Nullable Output<Boolean> waitUntilStable;
        private @Nullable Output<String> waitUntilStableTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.capacityProviderStrategies = defaults.capacityProviderStrategies;
    	      this.cluster = defaults.cluster;
    	      this.externalId = defaults.externalId;
    	      this.forceDelete = defaults.forceDelete;
    	      this.launchType = defaults.launchType;
    	      this.loadBalancers = defaults.loadBalancers;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.platformVersion = defaults.platformVersion;
    	      this.scale = defaults.scale;
    	      this.service = defaults.service;
    	      this.serviceRegistries = defaults.serviceRegistries;
    	      this.stabilityStatus = defaults.stabilityStatus;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.taskDefinition = defaults.taskDefinition;
    	      this.taskSetId = defaults.taskSetId;
    	      this.waitUntilStable = defaults.waitUntilStable;
    	      this.waitUntilStableTimeout = defaults.waitUntilStableTimeout;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder capacityProviderStrategies(@Nullable Output<List<TaskSetCapacityProviderStrategyGetArgs>> capacityProviderStrategies) {
            this.capacityProviderStrategies = capacityProviderStrategies;
            return this;
        }
        public Builder capacityProviderStrategies(@Nullable List<TaskSetCapacityProviderStrategyGetArgs> capacityProviderStrategies) {
            this.capacityProviderStrategies = Output.ofNullable(capacityProviderStrategies);
            return this;
        }
        public Builder capacityProviderStrategies(TaskSetCapacityProviderStrategyGetArgs... capacityProviderStrategies) {
            return capacityProviderStrategies(List.of(capacityProviderStrategies));
        }
        public Builder cluster(@Nullable Output<String> cluster) {
            this.cluster = cluster;
            return this;
        }
        public Builder cluster(@Nullable String cluster) {
            this.cluster = Output.ofNullable(cluster);
            return this;
        }
        public Builder externalId(@Nullable Output<String> externalId) {
            this.externalId = externalId;
            return this;
        }
        public Builder externalId(@Nullable String externalId) {
            this.externalId = Output.ofNullable(externalId);
            return this;
        }
        public Builder forceDelete(@Nullable Output<Boolean> forceDelete) {
            this.forceDelete = forceDelete;
            return this;
        }
        public Builder forceDelete(@Nullable Boolean forceDelete) {
            this.forceDelete = Output.ofNullable(forceDelete);
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
        public Builder loadBalancers(@Nullable Output<List<TaskSetLoadBalancerGetArgs>> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }
        public Builder loadBalancers(@Nullable List<TaskSetLoadBalancerGetArgs> loadBalancers) {
            this.loadBalancers = Output.ofNullable(loadBalancers);
            return this;
        }
        public Builder loadBalancers(TaskSetLoadBalancerGetArgs... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }
        public Builder networkConfiguration(@Nullable Output<TaskSetNetworkConfigurationGetArgs> networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public Builder networkConfiguration(@Nullable TaskSetNetworkConfigurationGetArgs networkConfiguration) {
            this.networkConfiguration = Output.ofNullable(networkConfiguration);
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
        public Builder scale(@Nullable Output<TaskSetScaleGetArgs> scale) {
            this.scale = scale;
            return this;
        }
        public Builder scale(@Nullable TaskSetScaleGetArgs scale) {
            this.scale = Output.ofNullable(scale);
            return this;
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Output.ofNullable(service);
            return this;
        }
        public Builder serviceRegistries(@Nullable Output<TaskSetServiceRegistriesGetArgs> serviceRegistries) {
            this.serviceRegistries = serviceRegistries;
            return this;
        }
        public Builder serviceRegistries(@Nullable TaskSetServiceRegistriesGetArgs serviceRegistries) {
            this.serviceRegistries = Output.ofNullable(serviceRegistries);
            return this;
        }
        public Builder stabilityStatus(@Nullable Output<String> stabilityStatus) {
            this.stabilityStatus = stabilityStatus;
            return this;
        }
        public Builder stabilityStatus(@Nullable String stabilityStatus) {
            this.stabilityStatus = Output.ofNullable(stabilityStatus);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
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
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
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
        public Builder taskSetId(@Nullable Output<String> taskSetId) {
            this.taskSetId = taskSetId;
            return this;
        }
        public Builder taskSetId(@Nullable String taskSetId) {
            this.taskSetId = Output.ofNullable(taskSetId);
            return this;
        }
        public Builder waitUntilStable(@Nullable Output<Boolean> waitUntilStable) {
            this.waitUntilStable = waitUntilStable;
            return this;
        }
        public Builder waitUntilStable(@Nullable Boolean waitUntilStable) {
            this.waitUntilStable = Output.ofNullable(waitUntilStable);
            return this;
        }
        public Builder waitUntilStableTimeout(@Nullable Output<String> waitUntilStableTimeout) {
            this.waitUntilStableTimeout = waitUntilStableTimeout;
            return this;
        }
        public Builder waitUntilStableTimeout(@Nullable String waitUntilStableTimeout) {
            this.waitUntilStableTimeout = Output.ofNullable(waitUntilStableTimeout);
            return this;
        }        public TaskSetState build() {
            return new TaskSetState(arn, capacityProviderStrategies, cluster, externalId, forceDelete, launchType, loadBalancers, networkConfiguration, platformVersion, scale, service, serviceRegistries, stabilityStatus, status, tags, tagsAll, taskDefinition, taskSetId, waitUntilStable, waitUntilStableTimeout);
        }
    }
}
