// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RegionInstanceGroupManagerArgs;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerState;
import io.pulumi.gcp.compute.outputs.RegionInstanceGroupManagerAutoHealingPolicies;
import io.pulumi.gcp.compute.outputs.RegionInstanceGroupManagerNamedPort;
import io.pulumi.gcp.compute.outputs.RegionInstanceGroupManagerStatefulDisk;
import io.pulumi.gcp.compute.outputs.RegionInstanceGroupManagerStatus;
import io.pulumi.gcp.compute.outputs.RegionInstanceGroupManagerUpdatePolicy;
import io.pulumi.gcp.compute.outputs.RegionInstanceGroupManagerVersion;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The Google Compute Engine Regional Instance Group Manager API creates and manages pools
 * of homogeneous Compute Engine virtual machine instances from a common instance
 * template.
 * 
 * To get more information about regionInstanceGroupManagers, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/latest/regionInstanceGroupManagers)
 * * How-to Guides
 *     * [Regional Instance Groups Guide](https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups)
 * 
 * > **Note:** Use [gcp.compute.InstanceGroupManager](https://www.terraform.io/docs/providers/google/r/compute_instance_group_manager.html) to create a zonal instance group manager.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Instance group managers can be imported using the `name`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionInstanceGroupManager:RegionInstanceGroupManager appserver appserver-igm
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionInstanceGroupManager:RegionInstanceGroupManager")
public class RegionInstanceGroupManager extends io.pulumi.resources.CustomResource {
    /**
     * The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     * 
     */
    @OutputExport(name="autoHealingPolicies", type=RegionInstanceGroupManagerAutoHealingPolicies.class, parameters={})
    private Output</* @Nullable */ RegionInstanceGroupManagerAutoHealingPolicies> autoHealingPolicies;

    /**
     * @return The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     * 
     */
    public Output</* @Nullable */ RegionInstanceGroupManagerAutoHealingPolicies> getAutoHealingPolicies() {
        return this.autoHealingPolicies;
    }
    /**
     * The base instance name to use for
     * instances in this group. The value must be a valid
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt) name. Supported characters
     * are lowercase letters, numbers, and hyphens (-). Instances are named by
     * appending a hyphen and a random four-character string to the base instance
     * name.
     * 
     */
    @OutputExport(name="baseInstanceName", type=String.class, parameters={})
    private Output<String> baseInstanceName;

    /**
     * @return The base instance name to use for
     * instances in this group. The value must be a valid
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt) name. Supported characters
     * are lowercase letters, numbers, and hyphens (-). Instances are named by
     * appending a hyphen and a random four-character string to the base instance
     * name.
     * 
     */
    public Output<String> getBaseInstanceName() {
        return this.baseInstanceName;
    }
    /**
     * An optional textual description of the instance
     * group manager.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional textual description of the instance
     * group manager.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The shape to which the group converges either proactively or on resize events (depending on the value set in update_policy.0.instance_redistribution_type). For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/regional-mig-distribution-shape).
     * 
     */
    @OutputExport(name="distributionPolicyTargetShape", type=String.class, parameters={})
    private Output<String> distributionPolicyTargetShape;

    /**
     * @return The shape to which the group converges either proactively or on resize events (depending on the value set in update_policy.0.instance_redistribution_type). For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/regional-mig-distribution-shape).
     * 
     */
    public Output<String> getDistributionPolicyTargetShape() {
        return this.distributionPolicyTargetShape;
    }
    /**
     * The distribution policy for this managed instance
     * group. You can specify one or more values. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups#selectingzones).
     * 
     */
    @OutputExport(name="distributionPolicyZones", type=List.class, parameters={String.class})
    private Output<List<String>> distributionPolicyZones;

    /**
     * @return The distribution policy for this managed instance
     * group. You can specify one or more values. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups#selectingzones).
     * 
     */
    public Output<List<String>> getDistributionPolicyZones() {
        return this.distributionPolicyZones;
    }
    /**
     * The fingerprint of the instance group manager.
     * 
     */
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return The fingerprint of the instance group manager.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The full URL of the instance group created by the manager.
     * 
     */
    @OutputExport(name="instanceGroup", type=String.class, parameters={})
    private Output<String> instanceGroup;

    /**
     * @return The full URL of the instance group created by the manager.
     * 
     */
    public Output<String> getInstanceGroup() {
        return this.instanceGroup;
    }
    /**
     * - Version name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return - Version name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The named port configuration. See the section below
     * for details on configuration.
     * 
     */
    @OutputExport(name="namedPorts", type=List.class, parameters={RegionInstanceGroupManagerNamedPort.class})
    private Output</* @Nullable */ List<RegionInstanceGroupManagerNamedPort>> namedPorts;

    /**
     * @return The named port configuration. See the section below
     * for details on configuration.
     * 
     */
    public Output</* @Nullable */ List<RegionInstanceGroupManagerNamedPort>> getNamedPorts() {
        return this.namedPorts;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The region where the managed instance group resides. If not provided, the provider region is used.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region where the managed instance group resides. If not provided, the provider region is used.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The URL of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URL of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs). Proactive cross zone instance redistribution must be disabled before you can update stateful disks on existing instance group managers. This can be controlled via the `update_policy`.
     * 
     */
    @OutputExport(name="statefulDisks", type=List.class, parameters={RegionInstanceGroupManagerStatefulDisk.class})
    private Output</* @Nullable */ List<RegionInstanceGroupManagerStatefulDisk>> statefulDisks;

    /**
     * @return Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs). Proactive cross zone instance redistribution must be disabled before you can update stateful disks on existing instance group managers. This can be controlled via the `update_policy`.
     * 
     */
    public Output</* @Nullable */ List<RegionInstanceGroupManagerStatefulDisk>> getStatefulDisks() {
        return this.statefulDisks;
    }
    /**
     * The status of this managed instance group.
     * 
     */
    @OutputExport(name="statuses", type=List.class, parameters={RegionInstanceGroupManagerStatus.class})
    private Output<List<RegionInstanceGroupManagerStatus>> statuses;

    /**
     * @return The status of this managed instance group.
     * 
     */
    public Output<List<RegionInstanceGroupManagerStatus>> getStatuses() {
        return this.statuses;
    }
    /**
     * The full URL of all target pools to which new
     * instances in the group are added. Updating the target pools attribute does
     * not affect existing instances.
     * 
     */
    @OutputExport(name="targetPools", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> targetPools;

    /**
     * @return The full URL of all target pools to which new
     * instances in the group are added. Updating the target pools attribute does
     * not affect existing instances.
     * 
     */
    public Output</* @Nullable */ List<String>> getTargetPools() {
        return this.targetPools;
    }
    /**
     * - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    @OutputExport(name="targetSize", type=Integer.class, parameters={})
    private Output<Integer> targetSize;

    /**
     * @return - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    public Output<Integer> getTargetSize() {
        return this.targetSize;
    }
    /**
     * The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/beta/regionInstanceGroupManagers/patch)
     * 
     */
    @OutputExport(name="updatePolicy", type=RegionInstanceGroupManagerUpdatePolicy.class, parameters={})
    private Output<RegionInstanceGroupManagerUpdatePolicy> updatePolicy;

    /**
     * @return The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/beta/regionInstanceGroupManagers/patch)
     * 
     */
    public Output<RegionInstanceGroupManagerUpdatePolicy> getUpdatePolicy() {
        return this.updatePolicy;
    }
    /**
     * Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="versions", type=List.class, parameters={RegionInstanceGroupManagerVersion.class})
    private Output<List<RegionInstanceGroupManagerVersion>> versions;

    /**
     * @return Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     * 
     */
    public Output<List<RegionInstanceGroupManagerVersion>> getVersions() {
        return this.versions;
    }
    /**
     * Whether to wait for all instances to be created/updated before
     * returning. Note that if this is set to true and the operation does not succeed, the provider will
     * continue trying until it times out.
     * 
     */
    @OutputExport(name="waitForInstances", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> waitForInstances;

    /**
     * @return Whether to wait for all instances to be created/updated before
     * returning. Note that if this is set to true and the operation does not succeed, the provider will
     * continue trying until it times out.
     * 
     */
    public Output</* @Nullable */ Boolean> getWaitForInstances() {
        return this.waitForInstances;
    }
    /**
     * When used with `wait_for_instances` it specifies the status to wait for.
     * When `STABLE` is specified this resource will wait until the instances are stable before returning. When `UPDATED` is
     * set, it will wait for the version target to be reached and any per instance configs to be effective as well as all
     * instances to be stable before returning. The possible values are `STABLE` and `UPDATED`
     * 
     */
    @OutputExport(name="waitForInstancesStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> waitForInstancesStatus;

    /**
     * @return When used with `wait_for_instances` it specifies the status to wait for.
     * When `STABLE` is specified this resource will wait until the instances are stable before returning. When `UPDATED` is
     * set, it will wait for the version target to be reached and any per instance configs to be effective as well as all
     * instances to be stable before returning. The possible values are `STABLE` and `UPDATED`
     * 
     */
    public Output</* @Nullable */ String> getWaitForInstancesStatus() {
        return this.waitForInstancesStatus;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionInstanceGroupManager(String name) {
        this(name, RegionInstanceGroupManagerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionInstanceGroupManager(String name, RegionInstanceGroupManagerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionInstanceGroupManager(String name, RegionInstanceGroupManagerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionInstanceGroupManager:RegionInstanceGroupManager", name, args == null ? RegionInstanceGroupManagerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RegionInstanceGroupManager(String name, Input<String> id, @Nullable RegionInstanceGroupManagerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionInstanceGroupManager:RegionInstanceGroupManager", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RegionInstanceGroupManager get(String name, Input<String> id, @Nullable RegionInstanceGroupManagerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionInstanceGroupManager(name, id, state, options);
    }
}
