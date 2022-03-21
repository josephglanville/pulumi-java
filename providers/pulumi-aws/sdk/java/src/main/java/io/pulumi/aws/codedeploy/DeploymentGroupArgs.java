// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy;

import io.pulumi.aws.codedeploy.inputs.DeploymentGroupAlarmConfigurationArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupAutoRollbackConfigurationArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupBlueGreenDeploymentConfigArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupDeploymentStyleArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagFilterArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupEc2TagSetArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupEcsServiceArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupOnPremisesInstanceTagFilterArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupTriggerConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupArgs Empty = new DeploymentGroupArgs();

    /**
     * Configuration block of alarms associated with the deployment group (documented below).
     * 
     */
    @Import(name="alarmConfiguration")
      private final @Nullable Output<DeploymentGroupAlarmConfigurationArgs> alarmConfiguration;

    public Output<DeploymentGroupAlarmConfigurationArgs> getAlarmConfiguration() {
        return this.alarmConfiguration == null ? Output.empty() : this.alarmConfiguration;
    }

    /**
     * The name of the application.
     * 
     */
    @Import(name="appName", required=true)
      private final Output<String> appName;

    public Output<String> getAppName() {
        return this.appName;
    }

    /**
     * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
     * 
     */
    @Import(name="autoRollbackConfiguration")
      private final @Nullable Output<DeploymentGroupAutoRollbackConfigurationArgs> autoRollbackConfiguration;

    public Output<DeploymentGroupAutoRollbackConfigurationArgs> getAutoRollbackConfiguration() {
        return this.autoRollbackConfiguration == null ? Output.empty() : this.autoRollbackConfiguration;
    }

    /**
     * Autoscaling groups associated with the deployment group.
     * 
     */
    @Import(name="autoscalingGroups")
      private final @Nullable Output<List<String>> autoscalingGroups;

    public Output<List<String>> getAutoscalingGroups() {
        return this.autoscalingGroups == null ? Output.empty() : this.autoscalingGroups;
    }

    /**
     * Configuration block of the blue/green deployment options for a deployment group (documented below).
     * 
     */
    @Import(name="blueGreenDeploymentConfig")
      private final @Nullable Output<DeploymentGroupBlueGreenDeploymentConfigArgs> blueGreenDeploymentConfig;

    public Output<DeploymentGroupBlueGreenDeploymentConfigArgs> getBlueGreenDeploymentConfig() {
        return this.blueGreenDeploymentConfig == null ? Output.empty() : this.blueGreenDeploymentConfig;
    }

    /**
     * The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
     * 
     */
    @Import(name="deploymentConfigName")
      private final @Nullable Output<String> deploymentConfigName;

    public Output<String> getDeploymentConfigName() {
        return this.deploymentConfigName == null ? Output.empty() : this.deploymentConfigName;
    }

    /**
     * The name of the deployment group.
     * 
     */
    @Import(name="deploymentGroupName", required=true)
      private final Output<String> deploymentGroupName;

    public Output<String> getDeploymentGroupName() {
        return this.deploymentGroupName;
    }

    /**
     * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
     * 
     */
    @Import(name="deploymentStyle")
      private final @Nullable Output<DeploymentGroupDeploymentStyleArgs> deploymentStyle;

    public Output<DeploymentGroupDeploymentStyleArgs> getDeploymentStyle() {
        return this.deploymentStyle == null ? Output.empty() : this.deploymentStyle;
    }

    /**
     * Tag filters associated with the deployment group. See the AWS docs for details.
     * 
     */
    @Import(name="ec2TagFilters")
      private final @Nullable Output<List<DeploymentGroupEc2TagFilterArgs>> ec2TagFilters;

    public Output<List<DeploymentGroupEc2TagFilterArgs>> getEc2TagFilters() {
        return this.ec2TagFilters == null ? Output.empty() : this.ec2TagFilters;
    }

    /**
     * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
     * 
     */
    @Import(name="ec2TagSets")
      private final @Nullable Output<List<DeploymentGroupEc2TagSetArgs>> ec2TagSets;

    public Output<List<DeploymentGroupEc2TagSetArgs>> getEc2TagSets() {
        return this.ec2TagSets == null ? Output.empty() : this.ec2TagSets;
    }

    /**
     * Configuration block(s) of the ECS services for a deployment group (documented below).
     * 
     */
    @Import(name="ecsService")
      private final @Nullable Output<DeploymentGroupEcsServiceArgs> ecsService;

    public Output<DeploymentGroupEcsServiceArgs> getEcsService() {
        return this.ecsService == null ? Output.empty() : this.ecsService;
    }

    /**
     * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
     * 
     */
    @Import(name="loadBalancerInfo")
      private final @Nullable Output<DeploymentGroupLoadBalancerInfoArgs> loadBalancerInfo;

    public Output<DeploymentGroupLoadBalancerInfoArgs> getLoadBalancerInfo() {
        return this.loadBalancerInfo == null ? Output.empty() : this.loadBalancerInfo;
    }

    /**
     * On premise tag filters associated with the group. See the AWS docs for details.
     * 
     */
    @Import(name="onPremisesInstanceTagFilters")
      private final @Nullable Output<List<DeploymentGroupOnPremisesInstanceTagFilterArgs>> onPremisesInstanceTagFilters;

    public Output<List<DeploymentGroupOnPremisesInstanceTagFilterArgs>> getOnPremisesInstanceTagFilters() {
        return this.onPremisesInstanceTagFilters == null ? Output.empty() : this.onPremisesInstanceTagFilters;
    }

    /**
     * The service role ARN that allows deployments.
     * 
     */
    @Import(name="serviceRoleArn", required=true)
      private final Output<String> serviceRoleArn;

    public Output<String> getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Configuration block(s) of the triggers for the deployment group (documented below).
     * 
     */
    @Import(name="triggerConfigurations")
      private final @Nullable Output<List<DeploymentGroupTriggerConfigurationArgs>> triggerConfigurations;

    public Output<List<DeploymentGroupTriggerConfigurationArgs>> getTriggerConfigurations() {
        return this.triggerConfigurations == null ? Output.empty() : this.triggerConfigurations;
    }

    public DeploymentGroupArgs(
        @Nullable Output<DeploymentGroupAlarmConfigurationArgs> alarmConfiguration,
        Output<String> appName,
        @Nullable Output<DeploymentGroupAutoRollbackConfigurationArgs> autoRollbackConfiguration,
        @Nullable Output<List<String>> autoscalingGroups,
        @Nullable Output<DeploymentGroupBlueGreenDeploymentConfigArgs> blueGreenDeploymentConfig,
        @Nullable Output<String> deploymentConfigName,
        Output<String> deploymentGroupName,
        @Nullable Output<DeploymentGroupDeploymentStyleArgs> deploymentStyle,
        @Nullable Output<List<DeploymentGroupEc2TagFilterArgs>> ec2TagFilters,
        @Nullable Output<List<DeploymentGroupEc2TagSetArgs>> ec2TagSets,
        @Nullable Output<DeploymentGroupEcsServiceArgs> ecsService,
        @Nullable Output<DeploymentGroupLoadBalancerInfoArgs> loadBalancerInfo,
        @Nullable Output<List<DeploymentGroupOnPremisesInstanceTagFilterArgs>> onPremisesInstanceTagFilters,
        Output<String> serviceRoleArn,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<DeploymentGroupTriggerConfigurationArgs>> triggerConfigurations) {
        this.alarmConfiguration = alarmConfiguration;
        this.appName = Objects.requireNonNull(appName, "expected parameter 'appName' to be non-null");
        this.autoRollbackConfiguration = autoRollbackConfiguration;
        this.autoscalingGroups = autoscalingGroups;
        this.blueGreenDeploymentConfig = blueGreenDeploymentConfig;
        this.deploymentConfigName = deploymentConfigName;
        this.deploymentGroupName = Objects.requireNonNull(deploymentGroupName, "expected parameter 'deploymentGroupName' to be non-null");
        this.deploymentStyle = deploymentStyle;
        this.ec2TagFilters = ec2TagFilters;
        this.ec2TagSets = ec2TagSets;
        this.ecsService = ecsService;
        this.loadBalancerInfo = loadBalancerInfo;
        this.onPremisesInstanceTagFilters = onPremisesInstanceTagFilters;
        this.serviceRoleArn = Objects.requireNonNull(serviceRoleArn, "expected parameter 'serviceRoleArn' to be non-null");
        this.tags = tags;
        this.triggerConfigurations = triggerConfigurations;
    }

    private DeploymentGroupArgs() {
        this.alarmConfiguration = Output.empty();
        this.appName = Output.empty();
        this.autoRollbackConfiguration = Output.empty();
        this.autoscalingGroups = Output.empty();
        this.blueGreenDeploymentConfig = Output.empty();
        this.deploymentConfigName = Output.empty();
        this.deploymentGroupName = Output.empty();
        this.deploymentStyle = Output.empty();
        this.ec2TagFilters = Output.empty();
        this.ec2TagSets = Output.empty();
        this.ecsService = Output.empty();
        this.loadBalancerInfo = Output.empty();
        this.onPremisesInstanceTagFilters = Output.empty();
        this.serviceRoleArn = Output.empty();
        this.tags = Output.empty();
        this.triggerConfigurations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DeploymentGroupAlarmConfigurationArgs> alarmConfiguration;
        private Output<String> appName;
        private @Nullable Output<DeploymentGroupAutoRollbackConfigurationArgs> autoRollbackConfiguration;
        private @Nullable Output<List<String>> autoscalingGroups;
        private @Nullable Output<DeploymentGroupBlueGreenDeploymentConfigArgs> blueGreenDeploymentConfig;
        private @Nullable Output<String> deploymentConfigName;
        private Output<String> deploymentGroupName;
        private @Nullable Output<DeploymentGroupDeploymentStyleArgs> deploymentStyle;
        private @Nullable Output<List<DeploymentGroupEc2TagFilterArgs>> ec2TagFilters;
        private @Nullable Output<List<DeploymentGroupEc2TagSetArgs>> ec2TagSets;
        private @Nullable Output<DeploymentGroupEcsServiceArgs> ecsService;
        private @Nullable Output<DeploymentGroupLoadBalancerInfoArgs> loadBalancerInfo;
        private @Nullable Output<List<DeploymentGroupOnPremisesInstanceTagFilterArgs>> onPremisesInstanceTagFilters;
        private Output<String> serviceRoleArn;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<DeploymentGroupTriggerConfigurationArgs>> triggerConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmConfiguration = defaults.alarmConfiguration;
    	      this.appName = defaults.appName;
    	      this.autoRollbackConfiguration = defaults.autoRollbackConfiguration;
    	      this.autoscalingGroups = defaults.autoscalingGroups;
    	      this.blueGreenDeploymentConfig = defaults.blueGreenDeploymentConfig;
    	      this.deploymentConfigName = defaults.deploymentConfigName;
    	      this.deploymentGroupName = defaults.deploymentGroupName;
    	      this.deploymentStyle = defaults.deploymentStyle;
    	      this.ec2TagFilters = defaults.ec2TagFilters;
    	      this.ec2TagSets = defaults.ec2TagSets;
    	      this.ecsService = defaults.ecsService;
    	      this.loadBalancerInfo = defaults.loadBalancerInfo;
    	      this.onPremisesInstanceTagFilters = defaults.onPremisesInstanceTagFilters;
    	      this.serviceRoleArn = defaults.serviceRoleArn;
    	      this.tags = defaults.tags;
    	      this.triggerConfigurations = defaults.triggerConfigurations;
        }

        public Builder alarmConfiguration(@Nullable Output<DeploymentGroupAlarmConfigurationArgs> alarmConfiguration) {
            this.alarmConfiguration = alarmConfiguration;
            return this;
        }
        public Builder alarmConfiguration(@Nullable DeploymentGroupAlarmConfigurationArgs alarmConfiguration) {
            this.alarmConfiguration = Output.ofNullable(alarmConfiguration);
            return this;
        }
        public Builder appName(Output<String> appName) {
            this.appName = Objects.requireNonNull(appName);
            return this;
        }
        public Builder appName(String appName) {
            this.appName = Output.of(Objects.requireNonNull(appName));
            return this;
        }
        public Builder autoRollbackConfiguration(@Nullable Output<DeploymentGroupAutoRollbackConfigurationArgs> autoRollbackConfiguration) {
            this.autoRollbackConfiguration = autoRollbackConfiguration;
            return this;
        }
        public Builder autoRollbackConfiguration(@Nullable DeploymentGroupAutoRollbackConfigurationArgs autoRollbackConfiguration) {
            this.autoRollbackConfiguration = Output.ofNullable(autoRollbackConfiguration);
            return this;
        }
        public Builder autoscalingGroups(@Nullable Output<List<String>> autoscalingGroups) {
            this.autoscalingGroups = autoscalingGroups;
            return this;
        }
        public Builder autoscalingGroups(@Nullable List<String> autoscalingGroups) {
            this.autoscalingGroups = Output.ofNullable(autoscalingGroups);
            return this;
        }
        public Builder autoscalingGroups(String... autoscalingGroups) {
            return autoscalingGroups(List.of(autoscalingGroups));
        }
        public Builder blueGreenDeploymentConfig(@Nullable Output<DeploymentGroupBlueGreenDeploymentConfigArgs> blueGreenDeploymentConfig) {
            this.blueGreenDeploymentConfig = blueGreenDeploymentConfig;
            return this;
        }
        public Builder blueGreenDeploymentConfig(@Nullable DeploymentGroupBlueGreenDeploymentConfigArgs blueGreenDeploymentConfig) {
            this.blueGreenDeploymentConfig = Output.ofNullable(blueGreenDeploymentConfig);
            return this;
        }
        public Builder deploymentConfigName(@Nullable Output<String> deploymentConfigName) {
            this.deploymentConfigName = deploymentConfigName;
            return this;
        }
        public Builder deploymentConfigName(@Nullable String deploymentConfigName) {
            this.deploymentConfigName = Output.ofNullable(deploymentConfigName);
            return this;
        }
        public Builder deploymentGroupName(Output<String> deploymentGroupName) {
            this.deploymentGroupName = Objects.requireNonNull(deploymentGroupName);
            return this;
        }
        public Builder deploymentGroupName(String deploymentGroupName) {
            this.deploymentGroupName = Output.of(Objects.requireNonNull(deploymentGroupName));
            return this;
        }
        public Builder deploymentStyle(@Nullable Output<DeploymentGroupDeploymentStyleArgs> deploymentStyle) {
            this.deploymentStyle = deploymentStyle;
            return this;
        }
        public Builder deploymentStyle(@Nullable DeploymentGroupDeploymentStyleArgs deploymentStyle) {
            this.deploymentStyle = Output.ofNullable(deploymentStyle);
            return this;
        }
        public Builder ec2TagFilters(@Nullable Output<List<DeploymentGroupEc2TagFilterArgs>> ec2TagFilters) {
            this.ec2TagFilters = ec2TagFilters;
            return this;
        }
        public Builder ec2TagFilters(@Nullable List<DeploymentGroupEc2TagFilterArgs> ec2TagFilters) {
            this.ec2TagFilters = Output.ofNullable(ec2TagFilters);
            return this;
        }
        public Builder ec2TagFilters(DeploymentGroupEc2TagFilterArgs... ec2TagFilters) {
            return ec2TagFilters(List.of(ec2TagFilters));
        }
        public Builder ec2TagSets(@Nullable Output<List<DeploymentGroupEc2TagSetArgs>> ec2TagSets) {
            this.ec2TagSets = ec2TagSets;
            return this;
        }
        public Builder ec2TagSets(@Nullable List<DeploymentGroupEc2TagSetArgs> ec2TagSets) {
            this.ec2TagSets = Output.ofNullable(ec2TagSets);
            return this;
        }
        public Builder ec2TagSets(DeploymentGroupEc2TagSetArgs... ec2TagSets) {
            return ec2TagSets(List.of(ec2TagSets));
        }
        public Builder ecsService(@Nullable Output<DeploymentGroupEcsServiceArgs> ecsService) {
            this.ecsService = ecsService;
            return this;
        }
        public Builder ecsService(@Nullable DeploymentGroupEcsServiceArgs ecsService) {
            this.ecsService = Output.ofNullable(ecsService);
            return this;
        }
        public Builder loadBalancerInfo(@Nullable Output<DeploymentGroupLoadBalancerInfoArgs> loadBalancerInfo) {
            this.loadBalancerInfo = loadBalancerInfo;
            return this;
        }
        public Builder loadBalancerInfo(@Nullable DeploymentGroupLoadBalancerInfoArgs loadBalancerInfo) {
            this.loadBalancerInfo = Output.ofNullable(loadBalancerInfo);
            return this;
        }
        public Builder onPremisesInstanceTagFilters(@Nullable Output<List<DeploymentGroupOnPremisesInstanceTagFilterArgs>> onPremisesInstanceTagFilters) {
            this.onPremisesInstanceTagFilters = onPremisesInstanceTagFilters;
            return this;
        }
        public Builder onPremisesInstanceTagFilters(@Nullable List<DeploymentGroupOnPremisesInstanceTagFilterArgs> onPremisesInstanceTagFilters) {
            this.onPremisesInstanceTagFilters = Output.ofNullable(onPremisesInstanceTagFilters);
            return this;
        }
        public Builder onPremisesInstanceTagFilters(DeploymentGroupOnPremisesInstanceTagFilterArgs... onPremisesInstanceTagFilters) {
            return onPremisesInstanceTagFilters(List.of(onPremisesInstanceTagFilters));
        }
        public Builder serviceRoleArn(Output<String> serviceRoleArn) {
            this.serviceRoleArn = Objects.requireNonNull(serviceRoleArn);
            return this;
        }
        public Builder serviceRoleArn(String serviceRoleArn) {
            this.serviceRoleArn = Output.of(Objects.requireNonNull(serviceRoleArn));
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
        public Builder triggerConfigurations(@Nullable Output<List<DeploymentGroupTriggerConfigurationArgs>> triggerConfigurations) {
            this.triggerConfigurations = triggerConfigurations;
            return this;
        }
        public Builder triggerConfigurations(@Nullable List<DeploymentGroupTriggerConfigurationArgs> triggerConfigurations) {
            this.triggerConfigurations = Output.ofNullable(triggerConfigurations);
            return this;
        }
        public Builder triggerConfigurations(DeploymentGroupTriggerConfigurationArgs... triggerConfigurations) {
            return triggerConfigurations(List.of(triggerConfigurations));
        }        public DeploymentGroupArgs build() {
            return new DeploymentGroupArgs(alarmConfiguration, appName, autoRollbackConfiguration, autoscalingGroups, blueGreenDeploymentConfig, deploymentConfigName, deploymentGroupName, deploymentStyle, ec2TagFilters, ec2TagSets, ecsService, loadBalancerInfo, onPremisesInstanceTagFilters, serviceRoleArn, tags, triggerConfigurations);
        }
    }
}
