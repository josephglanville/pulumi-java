// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.RegionInstanceGroupManagerFailoverAction;
import io.pulumi.googlenative.compute_alpha.inputs.DistributionPolicyArgs;
import io.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerAllInstancesConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerAutoHealingPolicyArgs;
import io.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerInstanceLifecyclePolicyArgs;
import io.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerStandbyPolicyArgs;
import io.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerUpdatePolicyArgs;
import io.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerVersionArgs;
import io.pulumi.googlenative.compute_alpha.inputs.NamedPortArgs;
import io.pulumi.googlenative.compute_alpha.inputs.StatefulPolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerArgs Empty = new RegionInstanceGroupManagerArgs();

    /**
     * Specifies the instances configs overrides that should be applied for all instances in the MIG.
     * 
     */
    @InputImport(name="allInstancesConfig")
      private final @Nullable Output<InstanceGroupManagerAllInstancesConfigArgs> allInstancesConfig;

    public Output<InstanceGroupManagerAllInstancesConfigArgs> getAllInstancesConfig() {
        return this.allInstancesConfig == null ? Output.empty() : this.allInstancesConfig;
    }

    /**
     * The autohealing policy for this managed instance group. You can specify only one value.
     * 
     */
    @InputImport(name="autoHealingPolicies")
      private final @Nullable Output<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies;

    public Output<List<InstanceGroupManagerAutoHealingPolicyArgs>> getAutoHealingPolicies() {
        return this.autoHealingPolicies == null ? Output.empty() : this.autoHealingPolicies;
    }

    /**
     * The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
     * 
     */
    @InputImport(name="baseInstanceName")
      private final @Nullable Output<String> baseInstanceName;

    public Output<String> getBaseInstanceName() {
        return this.baseInstanceName == null ? Output.empty() : this.baseInstanceName;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
     * 
     */
    @InputImport(name="distributionPolicy")
      private final @Nullable Output<DistributionPolicyArgs> distributionPolicy;

    public Output<DistributionPolicyArgs> getDistributionPolicy() {
        return this.distributionPolicy == null ? Output.empty() : this.distributionPolicy;
    }

    /**
     * The action to perform in case of zone failure. Only one value is supported, NO_FAILOVER. The default is NO_FAILOVER.
     * 
     */
    @InputImport(name="failoverAction")
      private final @Nullable Output<RegionInstanceGroupManagerFailoverAction> failoverAction;

    public Output<RegionInstanceGroupManagerFailoverAction> getFailoverAction() {
        return this.failoverAction == null ? Output.empty() : this.failoverAction;
    }

    /**
     * Instance lifecycle policy for this Instance Group Manager.
     * 
     */
    @InputImport(name="instanceLifecyclePolicy")
      private final @Nullable Output<InstanceGroupManagerInstanceLifecyclePolicyArgs> instanceLifecyclePolicy;

    public Output<InstanceGroupManagerInstanceLifecyclePolicyArgs> getInstanceLifecyclePolicy() {
        return this.instanceLifecyclePolicy == null ? Output.empty() : this.instanceLifecyclePolicy;
    }

    /**
     * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group's updatePolicy.type to PROACTIVE.
     * 
     */
    @InputImport(name="instanceTemplate")
      private final @Nullable Output<String> instanceTemplate;

    public Output<String> getInstanceTemplate() {
        return this.instanceTemplate == null ? Output.empty() : this.instanceTemplate;
    }

    /**
     * The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Named ports configured for the Instance Groups complementary to this Instance Group Manager.
     * 
     */
    @InputImport(name="namedPorts")
      private final @Nullable Output<List<NamedPortArgs>> namedPorts;

    public Output<List<NamedPortArgs>> getNamedPorts() {
        return this.namedPorts == null ? Output.empty() : this.namedPorts;
    }

    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @InputImport(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * The service account to be used as credentials for all operations performed by the managed instance group on instances. The service accounts needs all permissions required to create and delete instances. By default, the service account {projectNumber}@cloudservices.gserviceaccount.com is used.
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    /**
     * Standby policy for stopped and suspended instances.
     * 
     */
    @InputImport(name="standbyPolicy")
      private final @Nullable Output<InstanceGroupManagerStandbyPolicyArgs> standbyPolicy;

    public Output<InstanceGroupManagerStandbyPolicyArgs> getStandbyPolicy() {
        return this.standbyPolicy == null ? Output.empty() : this.standbyPolicy;
    }

    /**
     * Stateful configuration for this Instanced Group Manager
     * 
     */
    @InputImport(name="statefulPolicy")
      private final @Nullable Output<StatefulPolicyArgs> statefulPolicy;

    public Output<StatefulPolicyArgs> getStatefulPolicy() {
        return this.statefulPolicy == null ? Output.empty() : this.statefulPolicy;
    }

    /**
     * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * 
     */
    @InputImport(name="targetPools")
      private final @Nullable Output<List<String>> targetPools;

    public Output<List<String>> getTargetPools() {
        return this.targetPools == null ? Output.empty() : this.targetPools;
    }

    /**
     * The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
     * 
     */
    @InputImport(name="targetSize")
      private final @Nullable Output<Integer> targetSize;

    public Output<Integer> getTargetSize() {
        return this.targetSize == null ? Output.empty() : this.targetSize;
    }

    /**
     * The target number of stopped instances for this managed instance group. This number changes when you: - Stop instance using the stopInstances method or start instances using the startInstances method. - Manually change the targetStoppedSize using the update method.
     * 
     */
    @InputImport(name="targetStoppedSize")
      private final @Nullable Output<Integer> targetStoppedSize;

    public Output<Integer> getTargetStoppedSize() {
        return this.targetStoppedSize == null ? Output.empty() : this.targetStoppedSize;
    }

    /**
     * The target number of suspended instances for this managed instance group. This number changes when you: - Suspend instance using the suspendInstances method or resume instances using the resumeInstances method. - Manually change the targetSuspendedSize using the update method.
     * 
     */
    @InputImport(name="targetSuspendedSize")
      private final @Nullable Output<Integer> targetSuspendedSize;

    public Output<Integer> getTargetSuspendedSize() {
        return this.targetSuspendedSize == null ? Output.empty() : this.targetSuspendedSize;
    }

    /**
     * The update policy for this managed instance group.
     * 
     */
    @InputImport(name="updatePolicy")
      private final @Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy;

    public Output<InstanceGroupManagerUpdatePolicyArgs> getUpdatePolicy() {
        return this.updatePolicy == null ? Output.empty() : this.updatePolicy;
    }

    /**
     * Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
     * 
     */
    @InputImport(name="versions")
      private final @Nullable Output<List<InstanceGroupManagerVersionArgs>> versions;

    public Output<List<InstanceGroupManagerVersionArgs>> getVersions() {
        return this.versions == null ? Output.empty() : this.versions;
    }

    public RegionInstanceGroupManagerArgs(
        @Nullable Output<InstanceGroupManagerAllInstancesConfigArgs> allInstancesConfig,
        @Nullable Output<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies,
        @Nullable Output<String> baseInstanceName,
        @Nullable Output<String> description,
        @Nullable Output<DistributionPolicyArgs> distributionPolicy,
        @Nullable Output<RegionInstanceGroupManagerFailoverAction> failoverAction,
        @Nullable Output<InstanceGroupManagerInstanceLifecyclePolicyArgs> instanceLifecyclePolicy,
        @Nullable Output<String> instanceTemplate,
        @Nullable Output<String> name,
        @Nullable Output<List<NamedPortArgs>> namedPorts,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<InstanceGroupManagerStandbyPolicyArgs> standbyPolicy,
        @Nullable Output<StatefulPolicyArgs> statefulPolicy,
        @Nullable Output<List<String>> targetPools,
        @Nullable Output<Integer> targetSize,
        @Nullable Output<Integer> targetStoppedSize,
        @Nullable Output<Integer> targetSuspendedSize,
        @Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy,
        @Nullable Output<List<InstanceGroupManagerVersionArgs>> versions) {
        this.allInstancesConfig = allInstancesConfig;
        this.autoHealingPolicies = autoHealingPolicies;
        this.baseInstanceName = baseInstanceName;
        this.description = description;
        this.distributionPolicy = distributionPolicy;
        this.failoverAction = failoverAction;
        this.instanceLifecyclePolicy = instanceLifecyclePolicy;
        this.instanceTemplate = instanceTemplate;
        this.name = name;
        this.namedPorts = namedPorts;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.serviceAccount = serviceAccount;
        this.standbyPolicy = standbyPolicy;
        this.statefulPolicy = statefulPolicy;
        this.targetPools = targetPools;
        this.targetSize = targetSize;
        this.targetStoppedSize = targetStoppedSize;
        this.targetSuspendedSize = targetSuspendedSize;
        this.updatePolicy = updatePolicy;
        this.versions = versions;
    }

    private RegionInstanceGroupManagerArgs() {
        this.allInstancesConfig = Output.empty();
        this.autoHealingPolicies = Output.empty();
        this.baseInstanceName = Output.empty();
        this.description = Output.empty();
        this.distributionPolicy = Output.empty();
        this.failoverAction = Output.empty();
        this.instanceLifecyclePolicy = Output.empty();
        this.instanceTemplate = Output.empty();
        this.name = Output.empty();
        this.namedPorts = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.requestId = Output.empty();
        this.serviceAccount = Output.empty();
        this.standbyPolicy = Output.empty();
        this.statefulPolicy = Output.empty();
        this.targetPools = Output.empty();
        this.targetSize = Output.empty();
        this.targetStoppedSize = Output.empty();
        this.targetSuspendedSize = Output.empty();
        this.updatePolicy = Output.empty();
        this.versions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceGroupManagerAllInstancesConfigArgs> allInstancesConfig;
        private @Nullable Output<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies;
        private @Nullable Output<String> baseInstanceName;
        private @Nullable Output<String> description;
        private @Nullable Output<DistributionPolicyArgs> distributionPolicy;
        private @Nullable Output<RegionInstanceGroupManagerFailoverAction> failoverAction;
        private @Nullable Output<InstanceGroupManagerInstanceLifecyclePolicyArgs> instanceLifecyclePolicy;
        private @Nullable Output<String> instanceTemplate;
        private @Nullable Output<String> name;
        private @Nullable Output<List<NamedPortArgs>> namedPorts;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<InstanceGroupManagerStandbyPolicyArgs> standbyPolicy;
        private @Nullable Output<StatefulPolicyArgs> statefulPolicy;
        private @Nullable Output<List<String>> targetPools;
        private @Nullable Output<Integer> targetSize;
        private @Nullable Output<Integer> targetStoppedSize;
        private @Nullable Output<Integer> targetSuspendedSize;
        private @Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy;
        private @Nullable Output<List<InstanceGroupManagerVersionArgs>> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allInstancesConfig = defaults.allInstancesConfig;
    	      this.autoHealingPolicies = defaults.autoHealingPolicies;
    	      this.baseInstanceName = defaults.baseInstanceName;
    	      this.description = defaults.description;
    	      this.distributionPolicy = defaults.distributionPolicy;
    	      this.failoverAction = defaults.failoverAction;
    	      this.instanceLifecyclePolicy = defaults.instanceLifecyclePolicy;
    	      this.instanceTemplate = defaults.instanceTemplate;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.standbyPolicy = defaults.standbyPolicy;
    	      this.statefulPolicy = defaults.statefulPolicy;
    	      this.targetPools = defaults.targetPools;
    	      this.targetSize = defaults.targetSize;
    	      this.targetStoppedSize = defaults.targetStoppedSize;
    	      this.targetSuspendedSize = defaults.targetSuspendedSize;
    	      this.updatePolicy = defaults.updatePolicy;
    	      this.versions = defaults.versions;
        }

        public Builder allInstancesConfig(@Nullable Output<InstanceGroupManagerAllInstancesConfigArgs> allInstancesConfig) {
            this.allInstancesConfig = allInstancesConfig;
            return this;
        }

        public Builder allInstancesConfig(@Nullable InstanceGroupManagerAllInstancesConfigArgs allInstancesConfig) {
            this.allInstancesConfig = Output.ofNullable(allInstancesConfig);
            return this;
        }

        public Builder autoHealingPolicies(@Nullable Output<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies) {
            this.autoHealingPolicies = autoHealingPolicies;
            return this;
        }

        public Builder autoHealingPolicies(@Nullable List<InstanceGroupManagerAutoHealingPolicyArgs> autoHealingPolicies) {
            this.autoHealingPolicies = Output.ofNullable(autoHealingPolicies);
            return this;
        }

        public Builder baseInstanceName(@Nullable Output<String> baseInstanceName) {
            this.baseInstanceName = baseInstanceName;
            return this;
        }

        public Builder baseInstanceName(@Nullable String baseInstanceName) {
            this.baseInstanceName = Output.ofNullable(baseInstanceName);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder distributionPolicy(@Nullable Output<DistributionPolicyArgs> distributionPolicy) {
            this.distributionPolicy = distributionPolicy;
            return this;
        }

        public Builder distributionPolicy(@Nullable DistributionPolicyArgs distributionPolicy) {
            this.distributionPolicy = Output.ofNullable(distributionPolicy);
            return this;
        }

        public Builder failoverAction(@Nullable Output<RegionInstanceGroupManagerFailoverAction> failoverAction) {
            this.failoverAction = failoverAction;
            return this;
        }

        public Builder failoverAction(@Nullable RegionInstanceGroupManagerFailoverAction failoverAction) {
            this.failoverAction = Output.ofNullable(failoverAction);
            return this;
        }

        public Builder instanceLifecyclePolicy(@Nullable Output<InstanceGroupManagerInstanceLifecyclePolicyArgs> instanceLifecyclePolicy) {
            this.instanceLifecyclePolicy = instanceLifecyclePolicy;
            return this;
        }

        public Builder instanceLifecyclePolicy(@Nullable InstanceGroupManagerInstanceLifecyclePolicyArgs instanceLifecyclePolicy) {
            this.instanceLifecyclePolicy = Output.ofNullable(instanceLifecyclePolicy);
            return this;
        }

        public Builder instanceTemplate(@Nullable Output<String> instanceTemplate) {
            this.instanceTemplate = instanceTemplate;
            return this;
        }

        public Builder instanceTemplate(@Nullable String instanceTemplate) {
            this.instanceTemplate = Output.ofNullable(instanceTemplate);
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

        public Builder namedPorts(@Nullable Output<List<NamedPortArgs>> namedPorts) {
            this.namedPorts = namedPorts;
            return this;
        }

        public Builder namedPorts(@Nullable List<NamedPortArgs> namedPorts) {
            this.namedPorts = Output.ofNullable(namedPorts);
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

        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Output.ofNullable(serviceAccount);
            return this;
        }

        public Builder standbyPolicy(@Nullable Output<InstanceGroupManagerStandbyPolicyArgs> standbyPolicy) {
            this.standbyPolicy = standbyPolicy;
            return this;
        }

        public Builder standbyPolicy(@Nullable InstanceGroupManagerStandbyPolicyArgs standbyPolicy) {
            this.standbyPolicy = Output.ofNullable(standbyPolicy);
            return this;
        }

        public Builder statefulPolicy(@Nullable Output<StatefulPolicyArgs> statefulPolicy) {
            this.statefulPolicy = statefulPolicy;
            return this;
        }

        public Builder statefulPolicy(@Nullable StatefulPolicyArgs statefulPolicy) {
            this.statefulPolicy = Output.ofNullable(statefulPolicy);
            return this;
        }

        public Builder targetPools(@Nullable Output<List<String>> targetPools) {
            this.targetPools = targetPools;
            return this;
        }

        public Builder targetPools(@Nullable List<String> targetPools) {
            this.targetPools = Output.ofNullable(targetPools);
            return this;
        }

        public Builder targetSize(@Nullable Output<Integer> targetSize) {
            this.targetSize = targetSize;
            return this;
        }

        public Builder targetSize(@Nullable Integer targetSize) {
            this.targetSize = Output.ofNullable(targetSize);
            return this;
        }

        public Builder targetStoppedSize(@Nullable Output<Integer> targetStoppedSize) {
            this.targetStoppedSize = targetStoppedSize;
            return this;
        }

        public Builder targetStoppedSize(@Nullable Integer targetStoppedSize) {
            this.targetStoppedSize = Output.ofNullable(targetStoppedSize);
            return this;
        }

        public Builder targetSuspendedSize(@Nullable Output<Integer> targetSuspendedSize) {
            this.targetSuspendedSize = targetSuspendedSize;
            return this;
        }

        public Builder targetSuspendedSize(@Nullable Integer targetSuspendedSize) {
            this.targetSuspendedSize = Output.ofNullable(targetSuspendedSize);
            return this;
        }

        public Builder updatePolicy(@Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy) {
            this.updatePolicy = updatePolicy;
            return this;
        }

        public Builder updatePolicy(@Nullable InstanceGroupManagerUpdatePolicyArgs updatePolicy) {
            this.updatePolicy = Output.ofNullable(updatePolicy);
            return this;
        }

        public Builder versions(@Nullable Output<List<InstanceGroupManagerVersionArgs>> versions) {
            this.versions = versions;
            return this;
        }

        public Builder versions(@Nullable List<InstanceGroupManagerVersionArgs> versions) {
            this.versions = Output.ofNullable(versions);
            return this;
        }
        public RegionInstanceGroupManagerArgs build() {
            return new RegionInstanceGroupManagerArgs(allInstancesConfig, autoHealingPolicies, baseInstanceName, description, distributionPolicy, failoverAction, instanceLifecyclePolicy, instanceTemplate, name, namedPorts, project, region, requestId, serviceAccount, standbyPolicy, statefulPolicy, targetPools, targetSize, targetStoppedSize, targetSuspendedSize, updatePolicy, versions);
        }
    }
}
