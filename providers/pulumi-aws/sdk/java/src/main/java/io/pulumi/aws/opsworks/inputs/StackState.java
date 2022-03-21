// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.aws.opsworks.inputs.StackCustomCookbooksSourceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackState extends io.pulumi.resources.ResourceArgs {

    public static final StackState Empty = new StackState();

    /**
     * If set to `"LATEST"`, OpsWorks will automatically install the latest version.
     * 
     */
    @Import(name="agentVersion")
      private final @Nullable Output<String> agentVersion;

    public Output<String> getAgentVersion() {
        return this.agentVersion == null ? Output.empty() : this.agentVersion;
    }

    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * If `manage_berkshelf` is enabled, the version of Berkshelf to use.
     * 
     */
    @Import(name="berkshelfVersion")
      private final @Nullable Output<String> berkshelfVersion;

    public Output<String> getBerkshelfVersion() {
        return this.berkshelfVersion == null ? Output.empty() : this.berkshelfVersion;
    }

    /**
     * Color to paint next to the stack's resources in the OpsWorks console.
     * 
     */
    @Import(name="color")
      private final @Nullable Output<String> color;

    public Output<String> getColor() {
        return this.color == null ? Output.empty() : this.color;
    }

    /**
     * Name of the configuration manager to use. Defaults to "Chef".
     * 
     */
    @Import(name="configurationManagerName")
      private final @Nullable Output<String> configurationManagerName;

    public Output<String> getConfigurationManagerName() {
        return this.configurationManagerName == null ? Output.empty() : this.configurationManagerName;
    }

    /**
     * Version of the configuration manager to use. Defaults to "11.4".
     * 
     */
    @Import(name="configurationManagerVersion")
      private final @Nullable Output<String> configurationManagerVersion;

    public Output<String> getConfigurationManagerVersion() {
        return this.configurationManagerVersion == null ? Output.empty() : this.configurationManagerVersion;
    }

    /**
     * When `use_custom_cookbooks` is set, provide this sub-object as
     * described below.
     * 
     */
    @Import(name="customCookbooksSources")
      private final @Nullable Output<List<StackCustomCookbooksSourceGetArgs>> customCookbooksSources;

    public Output<List<StackCustomCookbooksSourceGetArgs>> getCustomCookbooksSources() {
        return this.customCookbooksSources == null ? Output.empty() : this.customCookbooksSources;
    }

    /**
     * Custom JSON attributes to apply to the entire stack.
     * 
     */
    @Import(name="customJson")
      private final @Nullable Output<String> customJson;

    public Output<String> getCustomJson() {
        return this.customJson == null ? Output.empty() : this.customJson;
    }

    /**
     * Name of the availability zone where instances will be created
     * by default. This is required unless you set `vpc_id`.
     * 
     */
    @Import(name="defaultAvailabilityZone")
      private final @Nullable Output<String> defaultAvailabilityZone;

    public Output<String> getDefaultAvailabilityZone() {
        return this.defaultAvailabilityZone == null ? Output.empty() : this.defaultAvailabilityZone;
    }

    /**
     * The ARN of an IAM Instance Profile that created instances
     * will have by default.
     * 
     */
    @Import(name="defaultInstanceProfileArn")
      private final @Nullable Output<String> defaultInstanceProfileArn;

    public Output<String> getDefaultInstanceProfileArn() {
        return this.defaultInstanceProfileArn == null ? Output.empty() : this.defaultInstanceProfileArn;
    }

    /**
     * Name of OS that will be installed on instances by default.
     * 
     */
    @Import(name="defaultOs")
      private final @Nullable Output<String> defaultOs;

    public Output<String> getDefaultOs() {
        return this.defaultOs == null ? Output.empty() : this.defaultOs;
    }

    /**
     * Name of the type of root device instances will have by default.
     * 
     */
    @Import(name="defaultRootDeviceType")
      private final @Nullable Output<String> defaultRootDeviceType;

    public Output<String> getDefaultRootDeviceType() {
        return this.defaultRootDeviceType == null ? Output.empty() : this.defaultRootDeviceType;
    }

    /**
     * Name of the SSH keypair that instances will have by default.
     * 
     */
    @Import(name="defaultSshKeyName")
      private final @Nullable Output<String> defaultSshKeyName;

    public Output<String> getDefaultSshKeyName() {
        return this.defaultSshKeyName == null ? Output.empty() : this.defaultSshKeyName;
    }

    /**
     * Id of the subnet in which instances will be created by default. Mandatory
     * if `vpc_id` is set, and forbidden if it isn't.
     * 
     */
    @Import(name="defaultSubnetId")
      private final @Nullable Output<String> defaultSubnetId;

    public Output<String> getDefaultSubnetId() {
        return this.defaultSubnetId == null ? Output.empty() : this.defaultSubnetId;
    }

    /**
     * Keyword representing the naming scheme that will be used for instance hostnames
     * within this stack.
     * 
     */
    @Import(name="hostnameTheme")
      private final @Nullable Output<String> hostnameTheme;

    public Output<String> getHostnameTheme() {
        return this.hostnameTheme == null ? Output.empty() : this.hostnameTheme;
    }

    /**
     * Boolean value controlling whether Opsworks will run Berkshelf for this stack.
     * 
     */
    @Import(name="manageBerkshelf")
      private final @Nullable Output<Boolean> manageBerkshelf;

    public Output<Boolean> getManageBerkshelf() {
        return this.manageBerkshelf == null ? Output.empty() : this.manageBerkshelf;
    }

    /**
     * The name of the stack.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The name of the region where the stack will exist.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The ARN of an IAM role that the OpsWorks service will act as.
     * 
     */
    @Import(name="serviceRoleArn")
      private final @Nullable Output<String> serviceRoleArn;

    public Output<String> getServiceRoleArn() {
        return this.serviceRoleArn == null ? Output.empty() : this.serviceRoleArn;
    }

    @Import(name="stackEndpoint")
      private final @Nullable Output<String> stackEndpoint;

    public Output<String> getStackEndpoint() {
        return this.stackEndpoint == null ? Output.empty() : this.stackEndpoint;
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
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Boolean value controlling whether the custom cookbook settings are
     * enabled.
     * 
     */
    @Import(name="useCustomCookbooks")
      private final @Nullable Output<Boolean> useCustomCookbooks;

    public Output<Boolean> getUseCustomCookbooks() {
        return this.useCustomCookbooks == null ? Output.empty() : this.useCustomCookbooks;
    }

    /**
     * Boolean value controlling whether the standard OpsWorks
     * security groups apply to created instances.
     * 
     */
    @Import(name="useOpsworksSecurityGroups")
      private final @Nullable Output<Boolean> useOpsworksSecurityGroups;

    public Output<Boolean> getUseOpsworksSecurityGroups() {
        return this.useOpsworksSecurityGroups == null ? Output.empty() : this.useOpsworksSecurityGroups;
    }

    /**
     * The id of the VPC that this stack belongs to.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Output.empty() : this.vpcId;
    }

    public StackState(
        @Nullable Output<String> agentVersion,
        @Nullable Output<String> arn,
        @Nullable Output<String> berkshelfVersion,
        @Nullable Output<String> color,
        @Nullable Output<String> configurationManagerName,
        @Nullable Output<String> configurationManagerVersion,
        @Nullable Output<List<StackCustomCookbooksSourceGetArgs>> customCookbooksSources,
        @Nullable Output<String> customJson,
        @Nullable Output<String> defaultAvailabilityZone,
        @Nullable Output<String> defaultInstanceProfileArn,
        @Nullable Output<String> defaultOs,
        @Nullable Output<String> defaultRootDeviceType,
        @Nullable Output<String> defaultSshKeyName,
        @Nullable Output<String> defaultSubnetId,
        @Nullable Output<String> hostnameTheme,
        @Nullable Output<Boolean> manageBerkshelf,
        @Nullable Output<String> name,
        @Nullable Output<String> region,
        @Nullable Output<String> serviceRoleArn,
        @Nullable Output<String> stackEndpoint,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<Boolean> useCustomCookbooks,
        @Nullable Output<Boolean> useOpsworksSecurityGroups,
        @Nullable Output<String> vpcId) {
        this.agentVersion = agentVersion;
        this.arn = arn;
        this.berkshelfVersion = berkshelfVersion;
        this.color = color;
        this.configurationManagerName = configurationManagerName;
        this.configurationManagerVersion = configurationManagerVersion;
        this.customCookbooksSources = customCookbooksSources;
        this.customJson = customJson;
        this.defaultAvailabilityZone = defaultAvailabilityZone;
        this.defaultInstanceProfileArn = defaultInstanceProfileArn;
        this.defaultOs = defaultOs;
        this.defaultRootDeviceType = defaultRootDeviceType;
        this.defaultSshKeyName = defaultSshKeyName;
        this.defaultSubnetId = defaultSubnetId;
        this.hostnameTheme = hostnameTheme;
        this.manageBerkshelf = manageBerkshelf;
        this.name = name;
        this.region = region;
        this.serviceRoleArn = serviceRoleArn;
        this.stackEndpoint = stackEndpoint;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.useCustomCookbooks = useCustomCookbooks;
        this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
        this.vpcId = vpcId;
    }

    private StackState() {
        this.agentVersion = Output.empty();
        this.arn = Output.empty();
        this.berkshelfVersion = Output.empty();
        this.color = Output.empty();
        this.configurationManagerName = Output.empty();
        this.configurationManagerVersion = Output.empty();
        this.customCookbooksSources = Output.empty();
        this.customJson = Output.empty();
        this.defaultAvailabilityZone = Output.empty();
        this.defaultInstanceProfileArn = Output.empty();
        this.defaultOs = Output.empty();
        this.defaultRootDeviceType = Output.empty();
        this.defaultSshKeyName = Output.empty();
        this.defaultSubnetId = Output.empty();
        this.hostnameTheme = Output.empty();
        this.manageBerkshelf = Output.empty();
        this.name = Output.empty();
        this.region = Output.empty();
        this.serviceRoleArn = Output.empty();
        this.stackEndpoint = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.useCustomCookbooks = Output.empty();
        this.useOpsworksSecurityGroups = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> agentVersion;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> berkshelfVersion;
        private @Nullable Output<String> color;
        private @Nullable Output<String> configurationManagerName;
        private @Nullable Output<String> configurationManagerVersion;
        private @Nullable Output<List<StackCustomCookbooksSourceGetArgs>> customCookbooksSources;
        private @Nullable Output<String> customJson;
        private @Nullable Output<String> defaultAvailabilityZone;
        private @Nullable Output<String> defaultInstanceProfileArn;
        private @Nullable Output<String> defaultOs;
        private @Nullable Output<String> defaultRootDeviceType;
        private @Nullable Output<String> defaultSshKeyName;
        private @Nullable Output<String> defaultSubnetId;
        private @Nullable Output<String> hostnameTheme;
        private @Nullable Output<Boolean> manageBerkshelf;
        private @Nullable Output<String> name;
        private @Nullable Output<String> region;
        private @Nullable Output<String> serviceRoleArn;
        private @Nullable Output<String> stackEndpoint;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<Boolean> useCustomCookbooks;
        private @Nullable Output<Boolean> useOpsworksSecurityGroups;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(StackState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.arn = defaults.arn;
    	      this.berkshelfVersion = defaults.berkshelfVersion;
    	      this.color = defaults.color;
    	      this.configurationManagerName = defaults.configurationManagerName;
    	      this.configurationManagerVersion = defaults.configurationManagerVersion;
    	      this.customCookbooksSources = defaults.customCookbooksSources;
    	      this.customJson = defaults.customJson;
    	      this.defaultAvailabilityZone = defaults.defaultAvailabilityZone;
    	      this.defaultInstanceProfileArn = defaults.defaultInstanceProfileArn;
    	      this.defaultOs = defaults.defaultOs;
    	      this.defaultRootDeviceType = defaults.defaultRootDeviceType;
    	      this.defaultSshKeyName = defaults.defaultSshKeyName;
    	      this.defaultSubnetId = defaults.defaultSubnetId;
    	      this.hostnameTheme = defaults.hostnameTheme;
    	      this.manageBerkshelf = defaults.manageBerkshelf;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.serviceRoleArn = defaults.serviceRoleArn;
    	      this.stackEndpoint = defaults.stackEndpoint;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.useCustomCookbooks = defaults.useCustomCookbooks;
    	      this.useOpsworksSecurityGroups = defaults.useOpsworksSecurityGroups;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder agentVersion(@Nullable Output<String> agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = Output.ofNullable(agentVersion);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder berkshelfVersion(@Nullable Output<String> berkshelfVersion) {
            this.berkshelfVersion = berkshelfVersion;
            return this;
        }
        public Builder berkshelfVersion(@Nullable String berkshelfVersion) {
            this.berkshelfVersion = Output.ofNullable(berkshelfVersion);
            return this;
        }
        public Builder color(@Nullable Output<String> color) {
            this.color = color;
            return this;
        }
        public Builder color(@Nullable String color) {
            this.color = Output.ofNullable(color);
            return this;
        }
        public Builder configurationManagerName(@Nullable Output<String> configurationManagerName) {
            this.configurationManagerName = configurationManagerName;
            return this;
        }
        public Builder configurationManagerName(@Nullable String configurationManagerName) {
            this.configurationManagerName = Output.ofNullable(configurationManagerName);
            return this;
        }
        public Builder configurationManagerVersion(@Nullable Output<String> configurationManagerVersion) {
            this.configurationManagerVersion = configurationManagerVersion;
            return this;
        }
        public Builder configurationManagerVersion(@Nullable String configurationManagerVersion) {
            this.configurationManagerVersion = Output.ofNullable(configurationManagerVersion);
            return this;
        }
        public Builder customCookbooksSources(@Nullable Output<List<StackCustomCookbooksSourceGetArgs>> customCookbooksSources) {
            this.customCookbooksSources = customCookbooksSources;
            return this;
        }
        public Builder customCookbooksSources(@Nullable List<StackCustomCookbooksSourceGetArgs> customCookbooksSources) {
            this.customCookbooksSources = Output.ofNullable(customCookbooksSources);
            return this;
        }
        public Builder customCookbooksSources(StackCustomCookbooksSourceGetArgs... customCookbooksSources) {
            return customCookbooksSources(List.of(customCookbooksSources));
        }
        public Builder customJson(@Nullable Output<String> customJson) {
            this.customJson = customJson;
            return this;
        }
        public Builder customJson(@Nullable String customJson) {
            this.customJson = Output.ofNullable(customJson);
            return this;
        }
        public Builder defaultAvailabilityZone(@Nullable Output<String> defaultAvailabilityZone) {
            this.defaultAvailabilityZone = defaultAvailabilityZone;
            return this;
        }
        public Builder defaultAvailabilityZone(@Nullable String defaultAvailabilityZone) {
            this.defaultAvailabilityZone = Output.ofNullable(defaultAvailabilityZone);
            return this;
        }
        public Builder defaultInstanceProfileArn(@Nullable Output<String> defaultInstanceProfileArn) {
            this.defaultInstanceProfileArn = defaultInstanceProfileArn;
            return this;
        }
        public Builder defaultInstanceProfileArn(@Nullable String defaultInstanceProfileArn) {
            this.defaultInstanceProfileArn = Output.ofNullable(defaultInstanceProfileArn);
            return this;
        }
        public Builder defaultOs(@Nullable Output<String> defaultOs) {
            this.defaultOs = defaultOs;
            return this;
        }
        public Builder defaultOs(@Nullable String defaultOs) {
            this.defaultOs = Output.ofNullable(defaultOs);
            return this;
        }
        public Builder defaultRootDeviceType(@Nullable Output<String> defaultRootDeviceType) {
            this.defaultRootDeviceType = defaultRootDeviceType;
            return this;
        }
        public Builder defaultRootDeviceType(@Nullable String defaultRootDeviceType) {
            this.defaultRootDeviceType = Output.ofNullable(defaultRootDeviceType);
            return this;
        }
        public Builder defaultSshKeyName(@Nullable Output<String> defaultSshKeyName) {
            this.defaultSshKeyName = defaultSshKeyName;
            return this;
        }
        public Builder defaultSshKeyName(@Nullable String defaultSshKeyName) {
            this.defaultSshKeyName = Output.ofNullable(defaultSshKeyName);
            return this;
        }
        public Builder defaultSubnetId(@Nullable Output<String> defaultSubnetId) {
            this.defaultSubnetId = defaultSubnetId;
            return this;
        }
        public Builder defaultSubnetId(@Nullable String defaultSubnetId) {
            this.defaultSubnetId = Output.ofNullable(defaultSubnetId);
            return this;
        }
        public Builder hostnameTheme(@Nullable Output<String> hostnameTheme) {
            this.hostnameTheme = hostnameTheme;
            return this;
        }
        public Builder hostnameTheme(@Nullable String hostnameTheme) {
            this.hostnameTheme = Output.ofNullable(hostnameTheme);
            return this;
        }
        public Builder manageBerkshelf(@Nullable Output<Boolean> manageBerkshelf) {
            this.manageBerkshelf = manageBerkshelf;
            return this;
        }
        public Builder manageBerkshelf(@Nullable Boolean manageBerkshelf) {
            this.manageBerkshelf = Output.ofNullable(manageBerkshelf);
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
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public Builder serviceRoleArn(@Nullable Output<String> serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }
        public Builder serviceRoleArn(@Nullable String serviceRoleArn) {
            this.serviceRoleArn = Output.ofNullable(serviceRoleArn);
            return this;
        }
        public Builder stackEndpoint(@Nullable Output<String> stackEndpoint) {
            this.stackEndpoint = stackEndpoint;
            return this;
        }
        public Builder stackEndpoint(@Nullable String stackEndpoint) {
            this.stackEndpoint = Output.ofNullable(stackEndpoint);
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
        public Builder useCustomCookbooks(@Nullable Output<Boolean> useCustomCookbooks) {
            this.useCustomCookbooks = useCustomCookbooks;
            return this;
        }
        public Builder useCustomCookbooks(@Nullable Boolean useCustomCookbooks) {
            this.useCustomCookbooks = Output.ofNullable(useCustomCookbooks);
            return this;
        }
        public Builder useOpsworksSecurityGroups(@Nullable Output<Boolean> useOpsworksSecurityGroups) {
            this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
            return this;
        }
        public Builder useOpsworksSecurityGroups(@Nullable Boolean useOpsworksSecurityGroups) {
            this.useOpsworksSecurityGroups = Output.ofNullable(useOpsworksSecurityGroups);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Output.ofNullable(vpcId);
            return this;
        }        public StackState build() {
            return new StackState(agentVersion, arn, berkshelfVersion, color, configurationManagerName, configurationManagerVersion, customCookbooksSources, customJson, defaultAvailabilityZone, defaultInstanceProfileArn, defaultOs, defaultRootDeviceType, defaultSshKeyName, defaultSubnetId, hostnameTheme, manageBerkshelf, name, region, serviceRoleArn, stackEndpoint, tags, tagsAll, useCustomCookbooks, useOpsworksSecurityGroups, vpcId);
        }
    }
}
