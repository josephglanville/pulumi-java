// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.aws.autoscaling.enums.MetricsGranularity;
import com.pulumi.aws.autoscaling.inputs.GroupInitialLifecycleHookGetArgs;
import com.pulumi.aws.autoscaling.inputs.GroupInstanceRefreshGetArgs;
import com.pulumi.aws.autoscaling.inputs.GroupLaunchTemplateGetArgs;
import com.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyGetArgs;
import com.pulumi.aws.autoscaling.inputs.GroupTagGetArgs;
import com.pulumi.aws.autoscaling.inputs.GroupWarmPoolGetArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupState extends com.pulumi.resources.ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * The ARN for this Auto Scaling Group
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A list of one or more availability zones for the group. Used for EC2-Classic, attaching a network interface via id from a launch template and default subnets when not specified with `vpc_zone_identifier` argument. Conflicts with `vpc_zone_identifier`.
     * 
     */
    @Import(name="availabilityZones")
    private @Nullable Output<List<String>> availabilityZones;

    public Optional<Output<List<String>>> availabilityZones() {
        return Optional.ofNullable(this.availabilityZones);
    }

    /**
     * Indicates whether capacity rebalance is enabled. Otherwise, capacity rebalance is disabled.
     * 
     */
    @Import(name="capacityRebalance")
    private @Nullable Output<Boolean> capacityRebalance;

    public Optional<Output<Boolean>> capacityRebalance() {
        return Optional.ofNullable(this.capacityRebalance);
    }

    /**
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
     * 
     */
    @Import(name="defaultCooldown")
    private @Nullable Output<Integer> defaultCooldown;

    public Optional<Output<Integer>> defaultCooldown() {
        return Optional.ofNullable(this.defaultCooldown);
    }

    /**
     * The number of Amazon EC2 instances that
     * should be running in the group. (See also Waiting for
     * Capacity below.)
     * 
     */
    @Import(name="desiredCapacity")
    private @Nullable Output<Integer> desiredCapacity;

    public Optional<Output<Integer>> desiredCapacity() {
        return Optional.ofNullable(this.desiredCapacity);
    }

    /**
     * A list of metrics to collect. The allowed values are defined by the [underlying AWS API](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html).
     * 
     */
    @Import(name="enabledMetrics")
    private @Nullable Output<List<String>> enabledMetrics;

    public Optional<Output<List<String>>> enabledMetrics() {
        return Optional.ofNullable(this.enabledMetrics);
    }

    /**
     * Allows deleting the Auto Scaling Group without waiting
     * for all instances in the pool to terminate.  You can force an Auto Scaling Group to delete
     * even if it&#39;s in the process of scaling a resource. Normally, this provider
     * drains all the instances before deleting the group.  This bypasses that
     * behavior and potentially leaves resources dangling.
     * 
     */
    @Import(name="forceDelete")
    private @Nullable Output<Boolean> forceDelete;

    public Optional<Output<Boolean>> forceDelete() {
        return Optional.ofNullable(this.forceDelete);
    }

    @Import(name="forceDeleteWarmPool")
    private @Nullable Output<Boolean> forceDeleteWarmPool;

    public Optional<Output<Boolean>> forceDeleteWarmPool() {
        return Optional.ofNullable(this.forceDeleteWarmPool);
    }

    /**
     * Time (in seconds) after instance comes into service before checking health.
     * 
     */
    @Import(name="healthCheckGracePeriod")
    private @Nullable Output<Integer> healthCheckGracePeriod;

    public Optional<Output<Integer>> healthCheckGracePeriod() {
        return Optional.ofNullable(this.healthCheckGracePeriod);
    }

    /**
     * &#34;EC2&#34; or &#34;ELB&#34;. Controls how health checking is done.
     * 
     */
    @Import(name="healthCheckType")
    private @Nullable Output<String> healthCheckType;

    public Optional<Output<String>> healthCheckType() {
        return Optional.ofNullable(this.healthCheckType);
    }

    /**
     * One or more
     * [Lifecycle Hooks](http://docs.aws.amazon.com/autoscaling/latest/userguide/lifecycle-hooks.html)
     * to attach to the Auto Scaling Group **before** instances are launched. The
     * syntax is exactly the same as the separate
     * `aws.autoscaling.LifecycleHook`
     * resource, without the `autoscaling_group_name` attribute. Please note that this will only work when creating
     * a new Auto Scaling Group. For all other use-cases, please use `aws.autoscaling.LifecycleHook` resource.
     * 
     */
    @Import(name="initialLifecycleHooks")
    private @Nullable Output<List<GroupInitialLifecycleHookGetArgs>> initialLifecycleHooks;

    public Optional<Output<List<GroupInitialLifecycleHookGetArgs>>> initialLifecycleHooks() {
        return Optional.ofNullable(this.initialLifecycleHooks);
    }

    /**
     * If this block is configured, start an
     * [Instance Refresh](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html)
     * when this Auto Scaling Group is updated. Defined below.
     * 
     */
    @Import(name="instanceRefresh")
    private @Nullable Output<GroupInstanceRefreshGetArgs> instanceRefresh;

    public Optional<Output<GroupInstanceRefreshGetArgs>> instanceRefresh() {
        return Optional.ofNullable(this.instanceRefresh);
    }

    /**
     * The name of the launch configuration to use.
     * 
     */
    @Import(name="launchConfiguration")
    private @Nullable Output<String> launchConfiguration;

    public Optional<Output<String>> launchConfiguration() {
        return Optional.ofNullable(this.launchConfiguration);
    }

    /**
     * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
     * 
     */
    @Import(name="launchTemplate")
    private @Nullable Output<GroupLaunchTemplateGetArgs> launchTemplate;

    public Optional<Output<GroupLaunchTemplateGetArgs>> launchTemplate() {
        return Optional.ofNullable(this.launchTemplate);
    }

    /**
     * A list of elastic load balancer names to add to the autoscaling
     * group names. Only valid for classic load balancers. For ALBs, use `target_group_arns` instead.
     * 
     */
    @Import(name="loadBalancers")
    private @Nullable Output<List<String>> loadBalancers;

    public Optional<Output<List<String>>> loadBalancers() {
        return Optional.ofNullable(this.loadBalancers);
    }

    /**
     * The maximum amount of time, in seconds, that an instance can be in service, values must be either equal to 0 or between 86400 and 31536000 seconds.
     * 
     */
    @Import(name="maxInstanceLifetime")
    private @Nullable Output<Integer> maxInstanceLifetime;

    public Optional<Output<Integer>> maxInstanceLifetime() {
        return Optional.ofNullable(this.maxInstanceLifetime);
    }

    /**
     * The maximum size of the Auto Scaling Group.
     * 
     */
    @Import(name="maxSize")
    private @Nullable Output<Integer> maxSize;

    public Optional<Output<Integer>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    /**
     * The granularity to associate with the metrics to collect. The only valid value is `1Minute`. Default is `1Minute`.
     * 
     */
    @Import(name="metricsGranularity")
    private @Nullable Output<Either<String,MetricsGranularity>> metricsGranularity;

    public Optional<Output<Either<String,MetricsGranularity>>> metricsGranularity() {
        return Optional.ofNullable(this.metricsGranularity);
    }

    /**
     * Setting this causes the provider to wait for
     * this number of instances from this Auto Scaling Group to show up healthy in the
     * ELB only on creation. Updates will not wait on ELB instance number changes.
     * (See also Waiting for Capacity below.)
     * 
     */
    @Import(name="minElbCapacity")
    private @Nullable Output<Integer> minElbCapacity;

    public Optional<Output<Integer>> minElbCapacity() {
        return Optional.ofNullable(this.minElbCapacity);
    }

    /**
     * Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * 
     */
    @Import(name="minSize")
    private @Nullable Output<Integer> minSize;

    public Optional<Output<Integer>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    /**
     * Configuration block containing settings to define launch targets for Auto Scaling groups. See Mixed Instances Policy below for more details.
     * 
     */
    @Import(name="mixedInstancesPolicy")
    private @Nullable Output<GroupMixedInstancesPolicyGetArgs> mixedInstancesPolicy;

    public Optional<Output<GroupMixedInstancesPolicyGetArgs>> mixedInstancesPolicy() {
        return Optional.ofNullable(this.mixedInstancesPolicy);
    }

    /**
     * The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * The name of the placement group into which you&#39;ll launch your instances, if any.
     * 
     */
    @Import(name="placementGroup")
    private @Nullable Output<String> placementGroup;

    public Optional<Output<String>> placementGroup() {
        return Optional.ofNullable(this.placementGroup);
    }

    /**
     * Allows setting instance protection. The
     * Auto Scaling Group will not select instances with this setting for termination
     * during scale in events.
     * 
     */
    @Import(name="protectFromScaleIn")
    private @Nullable Output<Boolean> protectFromScaleIn;

    public Optional<Output<Boolean>> protectFromScaleIn() {
        return Optional.ofNullable(this.protectFromScaleIn);
    }

    /**
     * The ARN of the service-linked role that the ASG will use to call other AWS services
     * 
     */
    @Import(name="serviceLinkedRoleArn")
    private @Nullable Output<String> serviceLinkedRoleArn;

    public Optional<Output<String>> serviceLinkedRoleArn() {
        return Optional.ofNullable(this.serviceLinkedRoleArn);
    }

    /**
     * A list of processes to suspend for the Auto Scaling Group. The allowed values are `Launch`, `Terminate`, `HealthCheck`, `ReplaceUnhealthy`, `AZRebalance`, `AlarmNotification`, `ScheduledActions`, `AddToLoadBalancer`.
     * Note that if you suspend either the `Launch` or `Terminate` process types, it can prevent your Auto Scaling Group from functioning properly.
     * 
     */
    @Import(name="suspendedProcesses")
    private @Nullable Output<List<String>> suspendedProcesses;

    public Optional<Output<List<String>>> suspendedProcesses() {
        return Optional.ofNullable(this.suspendedProcesses);
    }

    /**
     * Configuration block(s) containing resource tags. Conflicts with `tags_collection`. Documented below.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<GroupTagGetArgs>> tags;

    public Optional<Output<List<GroupTagGetArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Set of maps containing resource tags. Conflicts with `tag`. Documented below.
     * 
     */
    @Import(name="tagsCollection")
    private @Nullable Output<List<Map<String,String>>> tagsCollection;

    public Optional<Output<List<Map<String,String>>>> tagsCollection() {
        return Optional.ofNullable(this.tagsCollection);
    }

    /**
     * A set of `aws.alb.TargetGroup` ARNs, for use with Application or Network Load Balancing.
     * 
     */
    @Import(name="targetGroupArns")
    private @Nullable Output<List<String>> targetGroupArns;

    public Optional<Output<List<String>>> targetGroupArns() {
        return Optional.ofNullable(this.targetGroupArns);
    }

    /**
     * A list of policies to decide how the instances in the Auto Scaling Group should be terminated. The allowed values are `OldestInstance`, `NewestInstance`, `OldestLaunchConfiguration`, `ClosestToNextInstanceHour`, `OldestLaunchTemplate`, `AllocationStrategy`, `Default`.
     * 
     */
    @Import(name="terminationPolicies")
    private @Nullable Output<List<String>> terminationPolicies;

    public Optional<Output<List<String>>> terminationPolicies() {
        return Optional.ofNullable(this.terminationPolicies);
    }

    /**
     * A list of subnet IDs to launch resources in. Subnets automatically determine which availability zones the group will reside. Conflicts with `availability_zones`.
     * 
     */
    @Import(name="vpcZoneIdentifiers")
    private @Nullable Output<List<String>> vpcZoneIdentifiers;

    public Optional<Output<List<String>>> vpcZoneIdentifiers() {
        return Optional.ofNullable(this.vpcZoneIdentifiers);
    }

    /**
     * A maximum
     * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
     * wait for ASG instances to be healthy before timing out.  (See also Waiting
     * for Capacity below.) Setting this to &#34;0&#34; causes
     * this provider to skip all Capacity Waiting behavior.
     * 
     */
    @Import(name="waitForCapacityTimeout")
    private @Nullable Output<String> waitForCapacityTimeout;

    public Optional<Output<String>> waitForCapacityTimeout() {
        return Optional.ofNullable(this.waitForCapacityTimeout);
    }

    /**
     * Setting this will cause the provider to wait
     * for exactly this number of healthy instances from this Auto Scaling Group in
     * all attached load balancers on both create and update operations. (Takes
     * precedence over `min_elb_capacity` behavior.)
     * (See also Waiting for Capacity below.)
     * 
     */
    @Import(name="waitForElbCapacity")
    private @Nullable Output<Integer> waitForElbCapacity;

    public Optional<Output<Integer>> waitForElbCapacity() {
        return Optional.ofNullable(this.waitForElbCapacity);
    }

    /**
     * If this block is configured, add a [Warm Pool](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html)
     * to the specified Auto Scaling group. Defined below
     * 
     */
    @Import(name="warmPool")
    private @Nullable Output<GroupWarmPoolGetArgs> warmPool;

    public Optional<Output<GroupWarmPoolGetArgs>> warmPool() {
        return Optional.ofNullable(this.warmPool);
    }

    private GroupState() {}

    private GroupState(GroupState $) {
        this.arn = $.arn;
        this.availabilityZones = $.availabilityZones;
        this.capacityRebalance = $.capacityRebalance;
        this.defaultCooldown = $.defaultCooldown;
        this.desiredCapacity = $.desiredCapacity;
        this.enabledMetrics = $.enabledMetrics;
        this.forceDelete = $.forceDelete;
        this.forceDeleteWarmPool = $.forceDeleteWarmPool;
        this.healthCheckGracePeriod = $.healthCheckGracePeriod;
        this.healthCheckType = $.healthCheckType;
        this.initialLifecycleHooks = $.initialLifecycleHooks;
        this.instanceRefresh = $.instanceRefresh;
        this.launchConfiguration = $.launchConfiguration;
        this.launchTemplate = $.launchTemplate;
        this.loadBalancers = $.loadBalancers;
        this.maxInstanceLifetime = $.maxInstanceLifetime;
        this.maxSize = $.maxSize;
        this.metricsGranularity = $.metricsGranularity;
        this.minElbCapacity = $.minElbCapacity;
        this.minSize = $.minSize;
        this.mixedInstancesPolicy = $.mixedInstancesPolicy;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.placementGroup = $.placementGroup;
        this.protectFromScaleIn = $.protectFromScaleIn;
        this.serviceLinkedRoleArn = $.serviceLinkedRoleArn;
        this.suspendedProcesses = $.suspendedProcesses;
        this.tags = $.tags;
        this.tagsCollection = $.tagsCollection;
        this.targetGroupArns = $.targetGroupArns;
        this.terminationPolicies = $.terminationPolicies;
        this.vpcZoneIdentifiers = $.vpcZoneIdentifiers;
        this.waitForCapacityTimeout = $.waitForCapacityTimeout;
        this.waitForElbCapacity = $.waitForElbCapacity;
        this.warmPool = $.warmPool;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupState $;

        public Builder() {
            $ = new GroupState();
        }

        public Builder(GroupState defaults) {
            $ = new GroupState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            $.availabilityZones = availabilityZones;
            return this;
        }

        public Builder availabilityZones(List<String> availabilityZones) {
            return availabilityZones(Output.of(availabilityZones));
        }

        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }

        public Builder capacityRebalance(@Nullable Output<Boolean> capacityRebalance) {
            $.capacityRebalance = capacityRebalance;
            return this;
        }

        public Builder capacityRebalance(Boolean capacityRebalance) {
            return capacityRebalance(Output.of(capacityRebalance));
        }

        public Builder defaultCooldown(@Nullable Output<Integer> defaultCooldown) {
            $.defaultCooldown = defaultCooldown;
            return this;
        }

        public Builder defaultCooldown(Integer defaultCooldown) {
            return defaultCooldown(Output.of(defaultCooldown));
        }

        public Builder desiredCapacity(@Nullable Output<Integer> desiredCapacity) {
            $.desiredCapacity = desiredCapacity;
            return this;
        }

        public Builder desiredCapacity(Integer desiredCapacity) {
            return desiredCapacity(Output.of(desiredCapacity));
        }

        public Builder enabledMetrics(@Nullable Output<List<String>> enabledMetrics) {
            $.enabledMetrics = enabledMetrics;
            return this;
        }

        public Builder enabledMetrics(List<String> enabledMetrics) {
            return enabledMetrics(Output.of(enabledMetrics));
        }

        public Builder enabledMetrics(String... enabledMetrics) {
            return enabledMetrics(List.of(enabledMetrics));
        }

        public Builder forceDelete(@Nullable Output<Boolean> forceDelete) {
            $.forceDelete = forceDelete;
            return this;
        }

        public Builder forceDelete(Boolean forceDelete) {
            return forceDelete(Output.of(forceDelete));
        }

        public Builder forceDeleteWarmPool(@Nullable Output<Boolean> forceDeleteWarmPool) {
            $.forceDeleteWarmPool = forceDeleteWarmPool;
            return this;
        }

        public Builder forceDeleteWarmPool(Boolean forceDeleteWarmPool) {
            return forceDeleteWarmPool(Output.of(forceDeleteWarmPool));
        }

        public Builder healthCheckGracePeriod(@Nullable Output<Integer> healthCheckGracePeriod) {
            $.healthCheckGracePeriod = healthCheckGracePeriod;
            return this;
        }

        public Builder healthCheckGracePeriod(Integer healthCheckGracePeriod) {
            return healthCheckGracePeriod(Output.of(healthCheckGracePeriod));
        }

        public Builder healthCheckType(@Nullable Output<String> healthCheckType) {
            $.healthCheckType = healthCheckType;
            return this;
        }

        public Builder healthCheckType(String healthCheckType) {
            return healthCheckType(Output.of(healthCheckType));
        }

        public Builder initialLifecycleHooks(@Nullable Output<List<GroupInitialLifecycleHookGetArgs>> initialLifecycleHooks) {
            $.initialLifecycleHooks = initialLifecycleHooks;
            return this;
        }

        public Builder initialLifecycleHooks(List<GroupInitialLifecycleHookGetArgs> initialLifecycleHooks) {
            return initialLifecycleHooks(Output.of(initialLifecycleHooks));
        }

        public Builder initialLifecycleHooks(GroupInitialLifecycleHookGetArgs... initialLifecycleHooks) {
            return initialLifecycleHooks(List.of(initialLifecycleHooks));
        }

        public Builder instanceRefresh(@Nullable Output<GroupInstanceRefreshGetArgs> instanceRefresh) {
            $.instanceRefresh = instanceRefresh;
            return this;
        }

        public Builder instanceRefresh(GroupInstanceRefreshGetArgs instanceRefresh) {
            return instanceRefresh(Output.of(instanceRefresh));
        }

        public Builder launchConfiguration(@Nullable Output<String> launchConfiguration) {
            $.launchConfiguration = launchConfiguration;
            return this;
        }

        public Builder launchConfiguration(String launchConfiguration) {
            return launchConfiguration(Output.of(launchConfiguration));
        }

        public Builder launchTemplate(@Nullable Output<GroupLaunchTemplateGetArgs> launchTemplate) {
            $.launchTemplate = launchTemplate;
            return this;
        }

        public Builder launchTemplate(GroupLaunchTemplateGetArgs launchTemplate) {
            return launchTemplate(Output.of(launchTemplate));
        }

        public Builder loadBalancers(@Nullable Output<List<String>> loadBalancers) {
            $.loadBalancers = loadBalancers;
            return this;
        }

        public Builder loadBalancers(List<String> loadBalancers) {
            return loadBalancers(Output.of(loadBalancers));
        }

        public Builder loadBalancers(String... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }

        public Builder maxInstanceLifetime(@Nullable Output<Integer> maxInstanceLifetime) {
            $.maxInstanceLifetime = maxInstanceLifetime;
            return this;
        }

        public Builder maxInstanceLifetime(Integer maxInstanceLifetime) {
            return maxInstanceLifetime(Output.of(maxInstanceLifetime));
        }

        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        public Builder metricsGranularity(@Nullable Output<Either<String,MetricsGranularity>> metricsGranularity) {
            $.metricsGranularity = metricsGranularity;
            return this;
        }

        public Builder metricsGranularity(Either<String,MetricsGranularity> metricsGranularity) {
            return metricsGranularity(Output.of(metricsGranularity));
        }

        public Builder metricsGranularity(String metricsGranularity) {
            return metricsGranularity(Either.ofLeft(metricsGranularity));
        }

        public Builder metricsGranularity(MetricsGranularity metricsGranularity) {
            return metricsGranularity(Either.ofRight(metricsGranularity));
        }

        public Builder minElbCapacity(@Nullable Output<Integer> minElbCapacity) {
            $.minElbCapacity = minElbCapacity;
            return this;
        }

        public Builder minElbCapacity(Integer minElbCapacity) {
            return minElbCapacity(Output.of(minElbCapacity));
        }

        public Builder minSize(@Nullable Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        public Builder mixedInstancesPolicy(@Nullable Output<GroupMixedInstancesPolicyGetArgs> mixedInstancesPolicy) {
            $.mixedInstancesPolicy = mixedInstancesPolicy;
            return this;
        }

        public Builder mixedInstancesPolicy(GroupMixedInstancesPolicyGetArgs mixedInstancesPolicy) {
            return mixedInstancesPolicy(Output.of(mixedInstancesPolicy));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        public Builder placementGroup(@Nullable Output<String> placementGroup) {
            $.placementGroup = placementGroup;
            return this;
        }

        public Builder placementGroup(String placementGroup) {
            return placementGroup(Output.of(placementGroup));
        }

        public Builder protectFromScaleIn(@Nullable Output<Boolean> protectFromScaleIn) {
            $.protectFromScaleIn = protectFromScaleIn;
            return this;
        }

        public Builder protectFromScaleIn(Boolean protectFromScaleIn) {
            return protectFromScaleIn(Output.of(protectFromScaleIn));
        }

        public Builder serviceLinkedRoleArn(@Nullable Output<String> serviceLinkedRoleArn) {
            $.serviceLinkedRoleArn = serviceLinkedRoleArn;
            return this;
        }

        public Builder serviceLinkedRoleArn(String serviceLinkedRoleArn) {
            return serviceLinkedRoleArn(Output.of(serviceLinkedRoleArn));
        }

        public Builder suspendedProcesses(@Nullable Output<List<String>> suspendedProcesses) {
            $.suspendedProcesses = suspendedProcesses;
            return this;
        }

        public Builder suspendedProcesses(List<String> suspendedProcesses) {
            return suspendedProcesses(Output.of(suspendedProcesses));
        }

        public Builder suspendedProcesses(String... suspendedProcesses) {
            return suspendedProcesses(List.of(suspendedProcesses));
        }

        public Builder tags(@Nullable Output<List<GroupTagGetArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<GroupTagGetArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(GroupTagGetArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder tagsCollection(@Nullable Output<List<Map<String,String>>> tagsCollection) {
            $.tagsCollection = tagsCollection;
            return this;
        }

        public Builder tagsCollection(List<Map<String,String>> tagsCollection) {
            return tagsCollection(Output.of(tagsCollection));
        }

        public Builder tagsCollection(Map<String,String>... tagsCollection) {
            return tagsCollection(List.of(tagsCollection));
        }

        public Builder targetGroupArns(@Nullable Output<List<String>> targetGroupArns) {
            $.targetGroupArns = targetGroupArns;
            return this;
        }

        public Builder targetGroupArns(List<String> targetGroupArns) {
            return targetGroupArns(Output.of(targetGroupArns));
        }

        public Builder targetGroupArns(String... targetGroupArns) {
            return targetGroupArns(List.of(targetGroupArns));
        }

        public Builder terminationPolicies(@Nullable Output<List<String>> terminationPolicies) {
            $.terminationPolicies = terminationPolicies;
            return this;
        }

        public Builder terminationPolicies(List<String> terminationPolicies) {
            return terminationPolicies(Output.of(terminationPolicies));
        }

        public Builder terminationPolicies(String... terminationPolicies) {
            return terminationPolicies(List.of(terminationPolicies));
        }

        public Builder vpcZoneIdentifiers(@Nullable Output<List<String>> vpcZoneIdentifiers) {
            $.vpcZoneIdentifiers = vpcZoneIdentifiers;
            return this;
        }

        public Builder vpcZoneIdentifiers(List<String> vpcZoneIdentifiers) {
            return vpcZoneIdentifiers(Output.of(vpcZoneIdentifiers));
        }

        public Builder vpcZoneIdentifiers(String... vpcZoneIdentifiers) {
            return vpcZoneIdentifiers(List.of(vpcZoneIdentifiers));
        }

        public Builder waitForCapacityTimeout(@Nullable Output<String> waitForCapacityTimeout) {
            $.waitForCapacityTimeout = waitForCapacityTimeout;
            return this;
        }

        public Builder waitForCapacityTimeout(String waitForCapacityTimeout) {
            return waitForCapacityTimeout(Output.of(waitForCapacityTimeout));
        }

        public Builder waitForElbCapacity(@Nullable Output<Integer> waitForElbCapacity) {
            $.waitForElbCapacity = waitForElbCapacity;
            return this;
        }

        public Builder waitForElbCapacity(Integer waitForElbCapacity) {
            return waitForElbCapacity(Output.of(waitForElbCapacity));
        }

        public Builder warmPool(@Nullable Output<GroupWarmPoolGetArgs> warmPool) {
            $.warmPool = warmPool;
            return this;
        }

        public Builder warmPool(GroupWarmPoolGetArgs warmPool) {
            return warmPool(Output.of(warmPool));
        }

        public GroupState build() {
            return $;
        }
    }

}
