// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.DistributionPolicyArgs;
import io.pulumi.googlenative.compute_v1.inputs.InstanceGroupManagerAutoHealingPolicyArgs;
import io.pulumi.googlenative.compute_v1.inputs.InstanceGroupManagerUpdatePolicyArgs;
import io.pulumi.googlenative.compute_v1.inputs.InstanceGroupManagerVersionArgs;
import io.pulumi.googlenative.compute_v1.inputs.NamedPortArgs;
import io.pulumi.googlenative.compute_v1.inputs.StatefulPolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerArgs Empty = new RegionInstanceGroupManagerArgs();

    /**
     * The autohealing policy for this managed instance group. You can specify only one value.
     * 
     */
    @Import(name="autoHealingPolicies")
      private final @Nullable Output<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies;

    public Output<List<InstanceGroupManagerAutoHealingPolicyArgs>> getAutoHealingPolicies() {
        return this.autoHealingPolicies == null ? Output.empty() : this.autoHealingPolicies;
    }

    /**
     * The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
     * 
     */
    @Import(name="baseInstanceName")
      private final @Nullable Output<String> baseInstanceName;

    public Output<String> getBaseInstanceName() {
        return this.baseInstanceName == null ? Output.empty() : this.baseInstanceName;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
     * 
     */
    @Import(name="distributionPolicy")
      private final @Nullable Output<DistributionPolicyArgs> distributionPolicy;

    public Output<DistributionPolicyArgs> getDistributionPolicy() {
        return this.distributionPolicy == null ? Output.empty() : this.distributionPolicy;
    }

    /**
     * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group's updatePolicy.type to PROACTIVE.
     * 
     */
    @Import(name="instanceTemplate")
      private final @Nullable Output<String> instanceTemplate;

    public Output<String> getInstanceTemplate() {
        return this.instanceTemplate == null ? Output.empty() : this.instanceTemplate;
    }

    /**
     * The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Named ports configured for the Instance Groups complementary to this Instance Group Manager.
     * 
     */
    @Import(name="namedPorts")
      private final @Nullable Output<List<NamedPortArgs>> namedPorts;

    public Output<List<NamedPortArgs>> getNamedPorts() {
        return this.namedPorts == null ? Output.empty() : this.namedPorts;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * Stateful configuration for this Instanced Group Manager
     * 
     */
    @Import(name="statefulPolicy")
      private final @Nullable Output<StatefulPolicyArgs> statefulPolicy;

    public Output<StatefulPolicyArgs> getStatefulPolicy() {
        return this.statefulPolicy == null ? Output.empty() : this.statefulPolicy;
    }

    /**
     * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * 
     */
    @Import(name="targetPools")
      private final @Nullable Output<List<String>> targetPools;

    public Output<List<String>> getTargetPools() {
        return this.targetPools == null ? Output.empty() : this.targetPools;
    }

    /**
     * The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
     * 
     */
    @Import(name="targetSize")
      private final @Nullable Output<Integer> targetSize;

    public Output<Integer> getTargetSize() {
        return this.targetSize == null ? Output.empty() : this.targetSize;
    }

    /**
     * The update policy for this managed instance group.
     * 
     */
    @Import(name="updatePolicy")
      private final @Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy;

    public Output<InstanceGroupManagerUpdatePolicyArgs> getUpdatePolicy() {
        return this.updatePolicy == null ? Output.empty() : this.updatePolicy;
    }

    /**
     * Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
     * 
     */
    @Import(name="versions")
      private final @Nullable Output<List<InstanceGroupManagerVersionArgs>> versions;

    public Output<List<InstanceGroupManagerVersionArgs>> getVersions() {
        return this.versions == null ? Output.empty() : this.versions;
    }

    public RegionInstanceGroupManagerArgs(
        @Nullable Output<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies,
        @Nullable Output<String> baseInstanceName,
        @Nullable Output<String> description,
        @Nullable Output<DistributionPolicyArgs> distributionPolicy,
        @Nullable Output<String> instanceTemplate,
        @Nullable Output<String> name,
        @Nullable Output<List<NamedPortArgs>> namedPorts,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<StatefulPolicyArgs> statefulPolicy,
        @Nullable Output<List<String>> targetPools,
        @Nullable Output<Integer> targetSize,
        @Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy,
        @Nullable Output<List<InstanceGroupManagerVersionArgs>> versions) {
        this.autoHealingPolicies = autoHealingPolicies;
        this.baseInstanceName = baseInstanceName;
        this.description = description;
        this.distributionPolicy = distributionPolicy;
        this.instanceTemplate = instanceTemplate;
        this.name = name;
        this.namedPorts = namedPorts;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.statefulPolicy = statefulPolicy;
        this.targetPools = targetPools;
        this.targetSize = targetSize;
        this.updatePolicy = updatePolicy;
        this.versions = versions;
    }

    private RegionInstanceGroupManagerArgs() {
        this.autoHealingPolicies = Output.empty();
        this.baseInstanceName = Output.empty();
        this.description = Output.empty();
        this.distributionPolicy = Output.empty();
        this.instanceTemplate = Output.empty();
        this.name = Output.empty();
        this.namedPorts = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.requestId = Output.empty();
        this.statefulPolicy = Output.empty();
        this.targetPools = Output.empty();
        this.targetSize = Output.empty();
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
        private @Nullable Output<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies;
        private @Nullable Output<String> baseInstanceName;
        private @Nullable Output<String> description;
        private @Nullable Output<DistributionPolicyArgs> distributionPolicy;
        private @Nullable Output<String> instanceTemplate;
        private @Nullable Output<String> name;
        private @Nullable Output<List<NamedPortArgs>> namedPorts;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<StatefulPolicyArgs> statefulPolicy;
        private @Nullable Output<List<String>> targetPools;
        private @Nullable Output<Integer> targetSize;
        private @Nullable Output<InstanceGroupManagerUpdatePolicyArgs> updatePolicy;
        private @Nullable Output<List<InstanceGroupManagerVersionArgs>> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoHealingPolicies = defaults.autoHealingPolicies;
    	      this.baseInstanceName = defaults.baseInstanceName;
    	      this.description = defaults.description;
    	      this.distributionPolicy = defaults.distributionPolicy;
    	      this.instanceTemplate = defaults.instanceTemplate;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.statefulPolicy = defaults.statefulPolicy;
    	      this.targetPools = defaults.targetPools;
    	      this.targetSize = defaults.targetSize;
    	      this.updatePolicy = defaults.updatePolicy;
    	      this.versions = defaults.versions;
        }

        public Builder autoHealingPolicies(@Nullable Output<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies) {
            this.autoHealingPolicies = autoHealingPolicies;
            return this;
        }
        public Builder autoHealingPolicies(@Nullable List<InstanceGroupManagerAutoHealingPolicyArgs> autoHealingPolicies) {
            this.autoHealingPolicies = Output.ofNullable(autoHealingPolicies);
            return this;
        }
        public Builder autoHealingPolicies(InstanceGroupManagerAutoHealingPolicyArgs... autoHealingPolicies) {
            return autoHealingPolicies(List.of(autoHealingPolicies));
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
        public Builder namedPorts(NamedPortArgs... namedPorts) {
            return namedPorts(List.of(namedPorts));
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
        public Builder targetPools(String... targetPools) {
            return targetPools(List.of(targetPools));
        }
        public Builder targetSize(@Nullable Output<Integer> targetSize) {
            this.targetSize = targetSize;
            return this;
        }
        public Builder targetSize(@Nullable Integer targetSize) {
            this.targetSize = Output.ofNullable(targetSize);
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
        public Builder versions(InstanceGroupManagerVersionArgs... versions) {
            return versions(List.of(versions));
        }        public RegionInstanceGroupManagerArgs build() {
            return new RegionInstanceGroupManagerArgs(autoHealingPolicies, baseInstanceName, description, distributionPolicy, instanceTemplate, name, namedPorts, project, region, requestId, statefulPolicy, targetPools, targetSize, updatePolicy, versions);
        }
    }
}
