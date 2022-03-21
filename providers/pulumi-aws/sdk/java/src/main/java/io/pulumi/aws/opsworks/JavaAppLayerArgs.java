// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks;

import io.pulumi.aws.opsworks.inputs.JavaAppLayerCloudwatchConfigurationArgs;
import io.pulumi.aws.opsworks.inputs.JavaAppLayerEbsVolumeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JavaAppLayerArgs extends io.pulumi.resources.ResourceArgs {

    public static final JavaAppLayerArgs Empty = new JavaAppLayerArgs();

    /**
     * Keyword for the application container to use. Defaults to "tomcat".
     * 
     */
    @Import(name="appServer")
      private final @Nullable Output<String> appServer;

    public Output<String> getAppServer() {
        return this.appServer == null ? Output.empty() : this.appServer;
    }

    /**
     * Version of the selected application container to use. Defaults to "7".
     * 
     */
    @Import(name="appServerVersion")
      private final @Nullable Output<String> appServerVersion;

    public Output<String> getAppServerVersion() {
        return this.appServerVersion == null ? Output.empty() : this.appServerVersion;
    }

    /**
     * Whether to automatically assign an elastic IP address to the layer's instances.
     * 
     */
    @Import(name="autoAssignElasticIps")
      private final @Nullable Output<Boolean> autoAssignElasticIps;

    public Output<Boolean> getAutoAssignElasticIps() {
        return this.autoAssignElasticIps == null ? Output.empty() : this.autoAssignElasticIps;
    }

    /**
     * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
     * 
     */
    @Import(name="autoAssignPublicIps")
      private final @Nullable Output<Boolean> autoAssignPublicIps;

    public Output<Boolean> getAutoAssignPublicIps() {
        return this.autoAssignPublicIps == null ? Output.empty() : this.autoAssignPublicIps;
    }

    /**
     * Whether to enable auto-healing for the layer.
     * 
     */
    @Import(name="autoHealing")
      private final @Nullable Output<Boolean> autoHealing;

    public Output<Boolean> getAutoHealing() {
        return this.autoHealing == null ? Output.empty() : this.autoHealing;
    }

    @Import(name="cloudwatchConfiguration")
      private final @Nullable Output<JavaAppLayerCloudwatchConfigurationArgs> cloudwatchConfiguration;

    public Output<JavaAppLayerCloudwatchConfigurationArgs> getCloudwatchConfiguration() {
        return this.cloudwatchConfiguration == null ? Output.empty() : this.cloudwatchConfiguration;
    }

    @Import(name="customConfigureRecipes")
      private final @Nullable Output<List<String>> customConfigureRecipes;

    public Output<List<String>> getCustomConfigureRecipes() {
        return this.customConfigureRecipes == null ? Output.empty() : this.customConfigureRecipes;
    }

    @Import(name="customDeployRecipes")
      private final @Nullable Output<List<String>> customDeployRecipes;

    public Output<List<String>> getCustomDeployRecipes() {
        return this.customDeployRecipes == null ? Output.empty() : this.customDeployRecipes;
    }

    /**
     * The ARN of an IAM profile that will be used for the layer's instances.
     * 
     */
    @Import(name="customInstanceProfileArn")
      private final @Nullable Output<String> customInstanceProfileArn;

    public Output<String> getCustomInstanceProfileArn() {
        return this.customInstanceProfileArn == null ? Output.empty() : this.customInstanceProfileArn;
    }

    /**
     * Custom JSON attributes to apply to the layer.
     * 
     */
    @Import(name="customJson")
      private final @Nullable Output<String> customJson;

    public Output<String> getCustomJson() {
        return this.customJson == null ? Output.empty() : this.customJson;
    }

    /**
     * Ids for a set of security groups to apply to the layer's instances.
     * 
     */
    @Import(name="customSecurityGroupIds")
      private final @Nullable Output<List<String>> customSecurityGroupIds;

    public Output<List<String>> getCustomSecurityGroupIds() {
        return this.customSecurityGroupIds == null ? Output.empty() : this.customSecurityGroupIds;
    }

    @Import(name="customSetupRecipes")
      private final @Nullable Output<List<String>> customSetupRecipes;

    public Output<List<String>> getCustomSetupRecipes() {
        return this.customSetupRecipes == null ? Output.empty() : this.customSetupRecipes;
    }

    @Import(name="customShutdownRecipes")
      private final @Nullable Output<List<String>> customShutdownRecipes;

    public Output<List<String>> getCustomShutdownRecipes() {
        return this.customShutdownRecipes == null ? Output.empty() : this.customShutdownRecipes;
    }

    @Import(name="customUndeployRecipes")
      private final @Nullable Output<List<String>> customUndeployRecipes;

    public Output<List<String>> getCustomUndeployRecipes() {
        return this.customUndeployRecipes == null ? Output.empty() : this.customUndeployRecipes;
    }

    /**
     * Whether to enable Elastic Load Balancing connection draining.
     * 
     */
    @Import(name="drainElbOnShutdown")
      private final @Nullable Output<Boolean> drainElbOnShutdown;

    public Output<Boolean> getDrainElbOnShutdown() {
        return this.drainElbOnShutdown == null ? Output.empty() : this.drainElbOnShutdown;
    }

    /**
     * `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
     * 
     */
    @Import(name="ebsVolumes")
      private final @Nullable Output<List<JavaAppLayerEbsVolumeArgs>> ebsVolumes;

    public Output<List<JavaAppLayerEbsVolumeArgs>> getEbsVolumes() {
        return this.ebsVolumes == null ? Output.empty() : this.ebsVolumes;
    }

    /**
     * Name of an Elastic Load Balancer to attach to this layer
     * 
     */
    @Import(name="elasticLoadBalancer")
      private final @Nullable Output<String> elasticLoadBalancer;

    public Output<String> getElasticLoadBalancer() {
        return this.elasticLoadBalancer == null ? Output.empty() : this.elasticLoadBalancer;
    }

    /**
     * Whether to install OS and package updates on each instance when it boots.
     * 
     */
    @Import(name="installUpdatesOnBoot")
      private final @Nullable Output<Boolean> installUpdatesOnBoot;

    public Output<Boolean> getInstallUpdatesOnBoot() {
        return this.installUpdatesOnBoot == null ? Output.empty() : this.installUpdatesOnBoot;
    }

    /**
     * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
     * 
     */
    @Import(name="instanceShutdownTimeout")
      private final @Nullable Output<Integer> instanceShutdownTimeout;

    public Output<Integer> getInstanceShutdownTimeout() {
        return this.instanceShutdownTimeout == null ? Output.empty() : this.instanceShutdownTimeout;
    }

    /**
     * Options to set for the JVM.
     * 
     */
    @Import(name="jvmOptions")
      private final @Nullable Output<String> jvmOptions;

    public Output<String> getJvmOptions() {
        return this.jvmOptions == null ? Output.empty() : this.jvmOptions;
    }

    /**
     * Keyword for the type of JVM to use. Defaults to `openjdk`.
     * 
     */
    @Import(name="jvmType")
      private final @Nullable Output<String> jvmType;

    public Output<String> getJvmType() {
        return this.jvmType == null ? Output.empty() : this.jvmType;
    }

    /**
     * Version of JVM to use. Defaults to "7".
     * 
     */
    @Import(name="jvmVersion")
      private final @Nullable Output<String> jvmVersion;

    public Output<String> getJvmVersion() {
        return this.jvmVersion == null ? Output.empty() : this.jvmVersion;
    }

    /**
     * A human-readable name for the layer.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The id of the stack the layer will belong to.
     * 
     */
    @Import(name="stackId", required=true)
      private final Output<String> stackId;

    public Output<String> getStackId() {
        return this.stackId;
    }

    /**
     * Names of a set of system packages to install on the layer's instances.
     * 
     */
    @Import(name="systemPackages")
      private final @Nullable Output<List<String>> systemPackages;

    public Output<List<String>> getSystemPackages() {
        return this.systemPackages == null ? Output.empty() : this.systemPackages;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Whether to use EBS-optimized instances.
     * 
     */
    @Import(name="useEbsOptimizedInstances")
      private final @Nullable Output<Boolean> useEbsOptimizedInstances;

    public Output<Boolean> getUseEbsOptimizedInstances() {
        return this.useEbsOptimizedInstances == null ? Output.empty() : this.useEbsOptimizedInstances;
    }

    public JavaAppLayerArgs(
        @Nullable Output<String> appServer,
        @Nullable Output<String> appServerVersion,
        @Nullable Output<Boolean> autoAssignElasticIps,
        @Nullable Output<Boolean> autoAssignPublicIps,
        @Nullable Output<Boolean> autoHealing,
        @Nullable Output<JavaAppLayerCloudwatchConfigurationArgs> cloudwatchConfiguration,
        @Nullable Output<List<String>> customConfigureRecipes,
        @Nullable Output<List<String>> customDeployRecipes,
        @Nullable Output<String> customInstanceProfileArn,
        @Nullable Output<String> customJson,
        @Nullable Output<List<String>> customSecurityGroupIds,
        @Nullable Output<List<String>> customSetupRecipes,
        @Nullable Output<List<String>> customShutdownRecipes,
        @Nullable Output<List<String>> customUndeployRecipes,
        @Nullable Output<Boolean> drainElbOnShutdown,
        @Nullable Output<List<JavaAppLayerEbsVolumeArgs>> ebsVolumes,
        @Nullable Output<String> elasticLoadBalancer,
        @Nullable Output<Boolean> installUpdatesOnBoot,
        @Nullable Output<Integer> instanceShutdownTimeout,
        @Nullable Output<String> jvmOptions,
        @Nullable Output<String> jvmType,
        @Nullable Output<String> jvmVersion,
        @Nullable Output<String> name,
        Output<String> stackId,
        @Nullable Output<List<String>> systemPackages,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Boolean> useEbsOptimizedInstances) {
        this.appServer = appServer;
        this.appServerVersion = appServerVersion;
        this.autoAssignElasticIps = autoAssignElasticIps;
        this.autoAssignPublicIps = autoAssignPublicIps;
        this.autoHealing = autoHealing;
        this.cloudwatchConfiguration = cloudwatchConfiguration;
        this.customConfigureRecipes = customConfigureRecipes;
        this.customDeployRecipes = customDeployRecipes;
        this.customInstanceProfileArn = customInstanceProfileArn;
        this.customJson = customJson;
        this.customSecurityGroupIds = customSecurityGroupIds;
        this.customSetupRecipes = customSetupRecipes;
        this.customShutdownRecipes = customShutdownRecipes;
        this.customUndeployRecipes = customUndeployRecipes;
        this.drainElbOnShutdown = drainElbOnShutdown;
        this.ebsVolumes = ebsVolumes;
        this.elasticLoadBalancer = elasticLoadBalancer;
        this.installUpdatesOnBoot = installUpdatesOnBoot;
        this.instanceShutdownTimeout = instanceShutdownTimeout;
        this.jvmOptions = jvmOptions;
        this.jvmType = jvmType;
        this.jvmVersion = jvmVersion;
        this.name = name;
        this.stackId = Objects.requireNonNull(stackId, "expected parameter 'stackId' to be non-null");
        this.systemPackages = systemPackages;
        this.tags = tags;
        this.useEbsOptimizedInstances = useEbsOptimizedInstances;
    }

    private JavaAppLayerArgs() {
        this.appServer = Output.empty();
        this.appServerVersion = Output.empty();
        this.autoAssignElasticIps = Output.empty();
        this.autoAssignPublicIps = Output.empty();
        this.autoHealing = Output.empty();
        this.cloudwatchConfiguration = Output.empty();
        this.customConfigureRecipes = Output.empty();
        this.customDeployRecipes = Output.empty();
        this.customInstanceProfileArn = Output.empty();
        this.customJson = Output.empty();
        this.customSecurityGroupIds = Output.empty();
        this.customSetupRecipes = Output.empty();
        this.customShutdownRecipes = Output.empty();
        this.customUndeployRecipes = Output.empty();
        this.drainElbOnShutdown = Output.empty();
        this.ebsVolumes = Output.empty();
        this.elasticLoadBalancer = Output.empty();
        this.installUpdatesOnBoot = Output.empty();
        this.instanceShutdownTimeout = Output.empty();
        this.jvmOptions = Output.empty();
        this.jvmType = Output.empty();
        this.jvmVersion = Output.empty();
        this.name = Output.empty();
        this.stackId = Output.empty();
        this.systemPackages = Output.empty();
        this.tags = Output.empty();
        this.useEbsOptimizedInstances = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JavaAppLayerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appServer;
        private @Nullable Output<String> appServerVersion;
        private @Nullable Output<Boolean> autoAssignElasticIps;
        private @Nullable Output<Boolean> autoAssignPublicIps;
        private @Nullable Output<Boolean> autoHealing;
        private @Nullable Output<JavaAppLayerCloudwatchConfigurationArgs> cloudwatchConfiguration;
        private @Nullable Output<List<String>> customConfigureRecipes;
        private @Nullable Output<List<String>> customDeployRecipes;
        private @Nullable Output<String> customInstanceProfileArn;
        private @Nullable Output<String> customJson;
        private @Nullable Output<List<String>> customSecurityGroupIds;
        private @Nullable Output<List<String>> customSetupRecipes;
        private @Nullable Output<List<String>> customShutdownRecipes;
        private @Nullable Output<List<String>> customUndeployRecipes;
        private @Nullable Output<Boolean> drainElbOnShutdown;
        private @Nullable Output<List<JavaAppLayerEbsVolumeArgs>> ebsVolumes;
        private @Nullable Output<String> elasticLoadBalancer;
        private @Nullable Output<Boolean> installUpdatesOnBoot;
        private @Nullable Output<Integer> instanceShutdownTimeout;
        private @Nullable Output<String> jvmOptions;
        private @Nullable Output<String> jvmType;
        private @Nullable Output<String> jvmVersion;
        private @Nullable Output<String> name;
        private Output<String> stackId;
        private @Nullable Output<List<String>> systemPackages;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Boolean> useEbsOptimizedInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(JavaAppLayerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appServer = defaults.appServer;
    	      this.appServerVersion = defaults.appServerVersion;
    	      this.autoAssignElasticIps = defaults.autoAssignElasticIps;
    	      this.autoAssignPublicIps = defaults.autoAssignPublicIps;
    	      this.autoHealing = defaults.autoHealing;
    	      this.cloudwatchConfiguration = defaults.cloudwatchConfiguration;
    	      this.customConfigureRecipes = defaults.customConfigureRecipes;
    	      this.customDeployRecipes = defaults.customDeployRecipes;
    	      this.customInstanceProfileArn = defaults.customInstanceProfileArn;
    	      this.customJson = defaults.customJson;
    	      this.customSecurityGroupIds = defaults.customSecurityGroupIds;
    	      this.customSetupRecipes = defaults.customSetupRecipes;
    	      this.customShutdownRecipes = defaults.customShutdownRecipes;
    	      this.customUndeployRecipes = defaults.customUndeployRecipes;
    	      this.drainElbOnShutdown = defaults.drainElbOnShutdown;
    	      this.ebsVolumes = defaults.ebsVolumes;
    	      this.elasticLoadBalancer = defaults.elasticLoadBalancer;
    	      this.installUpdatesOnBoot = defaults.installUpdatesOnBoot;
    	      this.instanceShutdownTimeout = defaults.instanceShutdownTimeout;
    	      this.jvmOptions = defaults.jvmOptions;
    	      this.jvmType = defaults.jvmType;
    	      this.jvmVersion = defaults.jvmVersion;
    	      this.name = defaults.name;
    	      this.stackId = defaults.stackId;
    	      this.systemPackages = defaults.systemPackages;
    	      this.tags = defaults.tags;
    	      this.useEbsOptimizedInstances = defaults.useEbsOptimizedInstances;
        }

        public Builder appServer(@Nullable Output<String> appServer) {
            this.appServer = appServer;
            return this;
        }
        public Builder appServer(@Nullable String appServer) {
            this.appServer = Output.ofNullable(appServer);
            return this;
        }
        public Builder appServerVersion(@Nullable Output<String> appServerVersion) {
            this.appServerVersion = appServerVersion;
            return this;
        }
        public Builder appServerVersion(@Nullable String appServerVersion) {
            this.appServerVersion = Output.ofNullable(appServerVersion);
            return this;
        }
        public Builder autoAssignElasticIps(@Nullable Output<Boolean> autoAssignElasticIps) {
            this.autoAssignElasticIps = autoAssignElasticIps;
            return this;
        }
        public Builder autoAssignElasticIps(@Nullable Boolean autoAssignElasticIps) {
            this.autoAssignElasticIps = Output.ofNullable(autoAssignElasticIps);
            return this;
        }
        public Builder autoAssignPublicIps(@Nullable Output<Boolean> autoAssignPublicIps) {
            this.autoAssignPublicIps = autoAssignPublicIps;
            return this;
        }
        public Builder autoAssignPublicIps(@Nullable Boolean autoAssignPublicIps) {
            this.autoAssignPublicIps = Output.ofNullable(autoAssignPublicIps);
            return this;
        }
        public Builder autoHealing(@Nullable Output<Boolean> autoHealing) {
            this.autoHealing = autoHealing;
            return this;
        }
        public Builder autoHealing(@Nullable Boolean autoHealing) {
            this.autoHealing = Output.ofNullable(autoHealing);
            return this;
        }
        public Builder cloudwatchConfiguration(@Nullable Output<JavaAppLayerCloudwatchConfigurationArgs> cloudwatchConfiguration) {
            this.cloudwatchConfiguration = cloudwatchConfiguration;
            return this;
        }
        public Builder cloudwatchConfiguration(@Nullable JavaAppLayerCloudwatchConfigurationArgs cloudwatchConfiguration) {
            this.cloudwatchConfiguration = Output.ofNullable(cloudwatchConfiguration);
            return this;
        }
        public Builder customConfigureRecipes(@Nullable Output<List<String>> customConfigureRecipes) {
            this.customConfigureRecipes = customConfigureRecipes;
            return this;
        }
        public Builder customConfigureRecipes(@Nullable List<String> customConfigureRecipes) {
            this.customConfigureRecipes = Output.ofNullable(customConfigureRecipes);
            return this;
        }
        public Builder customConfigureRecipes(String... customConfigureRecipes) {
            return customConfigureRecipes(List.of(customConfigureRecipes));
        }
        public Builder customDeployRecipes(@Nullable Output<List<String>> customDeployRecipes) {
            this.customDeployRecipes = customDeployRecipes;
            return this;
        }
        public Builder customDeployRecipes(@Nullable List<String> customDeployRecipes) {
            this.customDeployRecipes = Output.ofNullable(customDeployRecipes);
            return this;
        }
        public Builder customDeployRecipes(String... customDeployRecipes) {
            return customDeployRecipes(List.of(customDeployRecipes));
        }
        public Builder customInstanceProfileArn(@Nullable Output<String> customInstanceProfileArn) {
            this.customInstanceProfileArn = customInstanceProfileArn;
            return this;
        }
        public Builder customInstanceProfileArn(@Nullable String customInstanceProfileArn) {
            this.customInstanceProfileArn = Output.ofNullable(customInstanceProfileArn);
            return this;
        }
        public Builder customJson(@Nullable Output<String> customJson) {
            this.customJson = customJson;
            return this;
        }
        public Builder customJson(@Nullable String customJson) {
            this.customJson = Output.ofNullable(customJson);
            return this;
        }
        public Builder customSecurityGroupIds(@Nullable Output<List<String>> customSecurityGroupIds) {
            this.customSecurityGroupIds = customSecurityGroupIds;
            return this;
        }
        public Builder customSecurityGroupIds(@Nullable List<String> customSecurityGroupIds) {
            this.customSecurityGroupIds = Output.ofNullable(customSecurityGroupIds);
            return this;
        }
        public Builder customSecurityGroupIds(String... customSecurityGroupIds) {
            return customSecurityGroupIds(List.of(customSecurityGroupIds));
        }
        public Builder customSetupRecipes(@Nullable Output<List<String>> customSetupRecipes) {
            this.customSetupRecipes = customSetupRecipes;
            return this;
        }
        public Builder customSetupRecipes(@Nullable List<String> customSetupRecipes) {
            this.customSetupRecipes = Output.ofNullable(customSetupRecipes);
            return this;
        }
        public Builder customSetupRecipes(String... customSetupRecipes) {
            return customSetupRecipes(List.of(customSetupRecipes));
        }
        public Builder customShutdownRecipes(@Nullable Output<List<String>> customShutdownRecipes) {
            this.customShutdownRecipes = customShutdownRecipes;
            return this;
        }
        public Builder customShutdownRecipes(@Nullable List<String> customShutdownRecipes) {
            this.customShutdownRecipes = Output.ofNullable(customShutdownRecipes);
            return this;
        }
        public Builder customShutdownRecipes(String... customShutdownRecipes) {
            return customShutdownRecipes(List.of(customShutdownRecipes));
        }
        public Builder customUndeployRecipes(@Nullable Output<List<String>> customUndeployRecipes) {
            this.customUndeployRecipes = customUndeployRecipes;
            return this;
        }
        public Builder customUndeployRecipes(@Nullable List<String> customUndeployRecipes) {
            this.customUndeployRecipes = Output.ofNullable(customUndeployRecipes);
            return this;
        }
        public Builder customUndeployRecipes(String... customUndeployRecipes) {
            return customUndeployRecipes(List.of(customUndeployRecipes));
        }
        public Builder drainElbOnShutdown(@Nullable Output<Boolean> drainElbOnShutdown) {
            this.drainElbOnShutdown = drainElbOnShutdown;
            return this;
        }
        public Builder drainElbOnShutdown(@Nullable Boolean drainElbOnShutdown) {
            this.drainElbOnShutdown = Output.ofNullable(drainElbOnShutdown);
            return this;
        }
        public Builder ebsVolumes(@Nullable Output<List<JavaAppLayerEbsVolumeArgs>> ebsVolumes) {
            this.ebsVolumes = ebsVolumes;
            return this;
        }
        public Builder ebsVolumes(@Nullable List<JavaAppLayerEbsVolumeArgs> ebsVolumes) {
            this.ebsVolumes = Output.ofNullable(ebsVolumes);
            return this;
        }
        public Builder ebsVolumes(JavaAppLayerEbsVolumeArgs... ebsVolumes) {
            return ebsVolumes(List.of(ebsVolumes));
        }
        public Builder elasticLoadBalancer(@Nullable Output<String> elasticLoadBalancer) {
            this.elasticLoadBalancer = elasticLoadBalancer;
            return this;
        }
        public Builder elasticLoadBalancer(@Nullable String elasticLoadBalancer) {
            this.elasticLoadBalancer = Output.ofNullable(elasticLoadBalancer);
            return this;
        }
        public Builder installUpdatesOnBoot(@Nullable Output<Boolean> installUpdatesOnBoot) {
            this.installUpdatesOnBoot = installUpdatesOnBoot;
            return this;
        }
        public Builder installUpdatesOnBoot(@Nullable Boolean installUpdatesOnBoot) {
            this.installUpdatesOnBoot = Output.ofNullable(installUpdatesOnBoot);
            return this;
        }
        public Builder instanceShutdownTimeout(@Nullable Output<Integer> instanceShutdownTimeout) {
            this.instanceShutdownTimeout = instanceShutdownTimeout;
            return this;
        }
        public Builder instanceShutdownTimeout(@Nullable Integer instanceShutdownTimeout) {
            this.instanceShutdownTimeout = Output.ofNullable(instanceShutdownTimeout);
            return this;
        }
        public Builder jvmOptions(@Nullable Output<String> jvmOptions) {
            this.jvmOptions = jvmOptions;
            return this;
        }
        public Builder jvmOptions(@Nullable String jvmOptions) {
            this.jvmOptions = Output.ofNullable(jvmOptions);
            return this;
        }
        public Builder jvmType(@Nullable Output<String> jvmType) {
            this.jvmType = jvmType;
            return this;
        }
        public Builder jvmType(@Nullable String jvmType) {
            this.jvmType = Output.ofNullable(jvmType);
            return this;
        }
        public Builder jvmVersion(@Nullable Output<String> jvmVersion) {
            this.jvmVersion = jvmVersion;
            return this;
        }
        public Builder jvmVersion(@Nullable String jvmVersion) {
            this.jvmVersion = Output.ofNullable(jvmVersion);
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
        public Builder stackId(Output<String> stackId) {
            this.stackId = Objects.requireNonNull(stackId);
            return this;
        }
        public Builder stackId(String stackId) {
            this.stackId = Output.of(Objects.requireNonNull(stackId));
            return this;
        }
        public Builder systemPackages(@Nullable Output<List<String>> systemPackages) {
            this.systemPackages = systemPackages;
            return this;
        }
        public Builder systemPackages(@Nullable List<String> systemPackages) {
            this.systemPackages = Output.ofNullable(systemPackages);
            return this;
        }
        public Builder systemPackages(String... systemPackages) {
            return systemPackages(List.of(systemPackages));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder useEbsOptimizedInstances(@Nullable Output<Boolean> useEbsOptimizedInstances) {
            this.useEbsOptimizedInstances = useEbsOptimizedInstances;
            return this;
        }
        public Builder useEbsOptimizedInstances(@Nullable Boolean useEbsOptimizedInstances) {
            this.useEbsOptimizedInstances = Output.ofNullable(useEbsOptimizedInstances);
            return this;
        }        public JavaAppLayerArgs build() {
            return new JavaAppLayerArgs(appServer, appServerVersion, autoAssignElasticIps, autoAssignPublicIps, autoHealing, cloudwatchConfiguration, customConfigureRecipes, customDeployRecipes, customInstanceProfileArn, customJson, customSecurityGroupIds, customSetupRecipes, customShutdownRecipes, customUndeployRecipes, drainElbOnShutdown, ebsVolumes, elasticLoadBalancer, installUpdatesOnBoot, instanceShutdownTimeout, jvmOptions, jvmType, jvmVersion, name, stackId, systemPackages, tags, useEbsOptimizedInstances);
        }
    }
}
