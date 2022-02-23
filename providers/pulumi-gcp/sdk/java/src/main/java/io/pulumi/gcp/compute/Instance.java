// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.InstanceArgs;
import io.pulumi.gcp.compute.inputs.InstanceState;
import io.pulumi.gcp.compute.outputs.InstanceAdvancedMachineFeatures;
import io.pulumi.gcp.compute.outputs.InstanceAttachedDisk;
import io.pulumi.gcp.compute.outputs.InstanceBootDisk;
import io.pulumi.gcp.compute.outputs.InstanceConfidentialInstanceConfig;
import io.pulumi.gcp.compute.outputs.InstanceGuestAccelerator;
import io.pulumi.gcp.compute.outputs.InstanceNetworkInterface;
import io.pulumi.gcp.compute.outputs.InstanceNetworkPerformanceConfig;
import io.pulumi.gcp.compute.outputs.InstanceReservationAffinity;
import io.pulumi.gcp.compute.outputs.InstanceScheduling;
import io.pulumi.gcp.compute.outputs.InstanceScratchDisk;
import io.pulumi.gcp.compute.outputs.InstanceServiceAccount;
import io.pulumi.gcp.compute.outputs.InstanceShieldedInstanceConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a VM instance resource within GCE. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/instances)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/instances).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Instances can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/instance:Instance default projects/{{project}}/zones/{{zone}}/instances/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/instance:Instance default {{project}}/{{zone}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/instance:Instance default {{name}}
 * ```
 * 
 *  [custom-vm-types]https://cloud.google.com/dataproc/docs/concepts/compute/custom-machine-types [network-tier]https://cloud.google.com/network-tiers/docs/overview [extended-custom-vm-type]https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#extendedmemory
 * 
 */
@ResourceType(type="gcp:compute/instance:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * Configure Nested Virtualisation and Simultaneous Hyper Threading  on this VM. Structure is documented below
     * 
     */
    @OutputExport(name="advancedMachineFeatures", type=InstanceAdvancedMachineFeatures.class, parameters={})
    private Output</* @Nullable */ InstanceAdvancedMachineFeatures> advancedMachineFeatures;

    /**
     * @return Configure Nested Virtualisation and Simultaneous Hyper Threading  on this VM. Structure is documented below
     * 
     */
    public Output</* @Nullable */ InstanceAdvancedMachineFeatures> getAdvancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }
    /**
     * If true, allows this prvider to stop the instance to update its properties.
     * If you try to update a property that requires stopping the instance without setting this field, the update will fail.
     * 
     */
    @OutputExport(name="allowStoppingForUpdate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowStoppingForUpdate;

    /**
     * @return If true, allows this prvider to stop the instance to update its properties.
     * If you try to update a property that requires stopping the instance without setting this field, the update will fail.
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowStoppingForUpdate() {
        return this.allowStoppingForUpdate;
    }
    /**
     * Additional disks to attach to the instance. Can be repeated multiple times for multiple disks. Structure is documented below.
     * 
     */
    @OutputExport(name="attachedDisks", type=List.class, parameters={InstanceAttachedDisk.class})
    private Output</* @Nullable */ List<InstanceAttachedDisk>> attachedDisks;

    /**
     * @return Additional disks to attach to the instance. Can be repeated multiple times for multiple disks. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<InstanceAttachedDisk>> getAttachedDisks() {
        return this.attachedDisks;
    }
    /**
     * The boot disk for the instance.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="bootDisk", type=InstanceBootDisk.class, parameters={})
    private Output<InstanceBootDisk> bootDisk;

    /**
     * @return The boot disk for the instance.
     * Structure is documented below.
     * 
     */
    public Output<InstanceBootDisk> getBootDisk() {
        return this.bootDisk;
    }
    /**
     * Whether to allow sending and receiving of
     * packets with non-matching source or destination IPs.
     * This defaults to false.
     * 
     */
    @OutputExport(name="canIpForward", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> canIpForward;

    /**
     * @return Whether to allow sending and receiving of
     * packets with non-matching source or destination IPs.
     * This defaults to false.
     * 
     */
    public Output</* @Nullable */ Boolean> getCanIpForward() {
        return this.canIpForward;
    }
    /**
     * Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     * 
     */
    @OutputExport(name="confidentialInstanceConfig", type=InstanceConfidentialInstanceConfig.class, parameters={})
    private Output<InstanceConfidentialInstanceConfig> confidentialInstanceConfig;

    /**
     * @return Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     * 
     */
    public Output<InstanceConfidentialInstanceConfig> getConfidentialInstanceConfig() {
        return this.confidentialInstanceConfig;
    }
    /**
     * The CPU platform used by this instance.
     * 
     */
    @OutputExport(name="cpuPlatform", type=String.class, parameters={})
    private Output<String> cpuPlatform;

    /**
     * @return The CPU platform used by this instance.
     * 
     */
    public Output<String> getCpuPlatform() {
        return this.cpuPlatform;
    }
    /**
     * Current status of the instance.
     * 
     */
    @OutputExport(name="currentStatus", type=String.class, parameters={})
    private Output<String> currentStatus;

    /**
     * @return Current status of the instance.
     * 
     */
    public Output<String> getCurrentStatus() {
        return this.currentStatus;
    }
    /**
     * Enable deletion protection on this instance. Defaults to false.
     * **Note:** you must disable deletion protection before removing the resource (e.g., via `pulumi destroy`), or the instance cannot be deleted and the provider run will not complete successfully.
     * 
     */
    @OutputExport(name="deletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return Enable deletion protection on this instance. Defaults to false.
     * **Note:** you must disable deletion protection before removing the resource (e.g., via `pulumi destroy`), or the instance cannot be deleted and the provider run will not complete successfully.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeletionProtection() {
        return this.deletionProtection;
    }
    /**
     * A brief description of this resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A brief description of this resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Desired status of the instance. Either
     * `"RUNNING"` or `"TERMINATED"`.
     * 
     */
    @OutputExport(name="desiredStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> desiredStatus;

    /**
     * @return Desired status of the instance. Either
     * `"RUNNING"` or `"TERMINATED"`.
     * 
     */
    public Output</* @Nullable */ String> getDesiredStatus() {
        return this.desiredStatus;
    }
    /**
     * Enable [Virtual Displays](https://cloud.google.com/compute/docs/instances/enable-instance-virtual-display#verify_display_driver) on this instance.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    @OutputExport(name="enableDisplay", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDisplay;

    /**
     * @return Enable [Virtual Displays](https://cloud.google.com/compute/docs/instances/enable-instance-virtual-display#verify_display_driver) on this instance.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableDisplay() {
        return this.enableDisplay;
    }
    /**
     * List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * **Note:** GPU accelerators can only be used with `on_host_maintenance` option set to TERMINATE.
     * 
     */
    @OutputExport(name="guestAccelerators", type=List.class, parameters={InstanceGuestAccelerator.class})
    private Output<List<InstanceGuestAccelerator>> guestAccelerators;

    /**
     * @return List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * **Note:** GPU accelerators can only be used with `on_host_maintenance` option set to TERMINATE.
     * 
     */
    public Output<List<InstanceGuestAccelerator>> getGuestAccelerators() {
        return this.guestAccelerators;
    }
    /**
     * A custom hostname for the instance. Must be a fully qualified DNS name and RFC-1035-valid.
     * Valid format is a series of labels 1-63 characters long matching the regular expression `a-z`, concatenated with periods.
     * The entire hostname must not exceed 253 characters. Changing this forces a new resource to be created.
     * 
     */
    @OutputExport(name="hostname", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostname;

    /**
     * @return A custom hostname for the instance. Must be a fully qualified DNS name and RFC-1035-valid.
     * Valid format is a series of labels 1-63 characters long matching the regular expression `a-z`, concatenated with periods.
     * The entire hostname must not exceed 253 characters. Changing this forces a new resource to be created.
     * 
     */
    public Output</* @Nullable */ String> getHostname() {
        return this.hostname;
    }
    /**
     * The server-assigned unique identifier of this instance.
     * 
     */
    @OutputExport(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The server-assigned unique identifier of this instance.
     * 
     */
    public Output<String> getInstanceId() {
        return this.instanceId;
    }
    /**
     * The unique fingerprint of the labels.
     * 
     */
    @OutputExport(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return The unique fingerprint of the labels.
     * 
     */
    public Output<String> getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * A map of key/value label pairs to assign to the instance.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A map of key/value label pairs to assign to the instance.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The machine type to create.
     * 
     */
    @OutputExport(name="machineType", type=String.class, parameters={})
    private Output<String> machineType;

    /**
     * @return The machine type to create.
     * 
     */
    public Output<String> getMachineType() {
        return this.machineType;
    }
    /**
     * Metadata key/value pairs to make available from
     * within the instance. Ssh keys attached in the Cloud Console will be removed.
     * Add them to your config in order to keep them attached to your instance.
     * 
     */
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return Metadata key/value pairs to make available from
     * within the instance. Ssh keys attached in the Cloud Console will be removed.
     * Add them to your config in order to keep them attached to your instance.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getMetadata() {
        return this.metadata;
    }
    /**
     * The unique fingerprint of the metadata.
     * 
     */
    @OutputExport(name="metadataFingerprint", type=String.class, parameters={})
    private Output<String> metadataFingerprint;

    /**
     * @return The unique fingerprint of the metadata.
     * 
     */
    public Output<String> getMetadataFingerprint() {
        return this.metadataFingerprint;
    }
    /**
     * An alternative to using the
     * startup-script metadata key, except this one forces the instance to be recreated
     * (thus re-running the script) if it is changed. This replaces the startup-script
     * metadata key on the created instance and thus the two mechanisms are not
     * allowed to be used simultaneously.  Users are free to use either mechanism - the
     * only distinction is that this separate attribute will cause a recreate on
     * modification.  On import, `metadata_startup_script` will not be set - if you
     * choose to specify it you will see a diff immediately after import causing a
     * destroy/recreate operation. If importing an instance and specifying this value
     * is desired, you will need to modify your state file.
     * 
     */
    @OutputExport(name="metadataStartupScript", type=String.class, parameters={})
    private Output</* @Nullable */ String> metadataStartupScript;

    /**
     * @return An alternative to using the
     * startup-script metadata key, except this one forces the instance to be recreated
     * (thus re-running the script) if it is changed. This replaces the startup-script
     * metadata key on the created instance and thus the two mechanisms are not
     * allowed to be used simultaneously.  Users are free to use either mechanism - the
     * only distinction is that this separate attribute will cause a recreate on
     * modification.  On import, `metadata_startup_script` will not be set - if you
     * choose to specify it you will see a diff immediately after import causing a
     * destroy/recreate operation. If importing an instance and specifying this value
     * is desired, you will need to modify your state file.
     * 
     */
    public Output</* @Nullable */ String> getMetadataStartupScript() {
        return this.metadataStartupScript;
    }
    /**
     * Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names of CPU platforms, such as
     * `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    @OutputExport(name="minCpuPlatform", type=String.class, parameters={})
    private Output<String> minCpuPlatform;

    /**
     * @return Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names of CPU platforms, such as
     * `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    public Output<String> getMinCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Networks to attach to the instance. This can
     * be specified multiple times. Structure is documented below.
     * 
     */
    @OutputExport(name="networkInterfaces", type=List.class, parameters={InstanceNetworkInterface.class})
    private Output<List<InstanceNetworkInterface>> networkInterfaces;

    /**
     * @return Networks to attach to the instance. This can
     * be specified multiple times. Structure is documented below.
     * 
     */
    public Output<List<InstanceNetworkInterface>> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * Configures network performance settings for the instance. Structure is
     * documented below. **Note**: `machine_type` must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     * 
     */
    @OutputExport(name="networkPerformanceConfig", type=InstanceNetworkPerformanceConfig.class, parameters={})
    private Output</* @Nullable */ InstanceNetworkPerformanceConfig> networkPerformanceConfig;

    /**
     * @return Configures network performance settings for the instance. Structure is
     * documented below. **Note**: `machine_type` must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     * 
     */
    public Output</* @Nullable */ InstanceNetworkPerformanceConfig> getNetworkPerformanceConfig() {
        return this.networkPerformanceConfig;
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
     * Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="reservationAffinity", type=InstanceReservationAffinity.class, parameters={})
    private Output<InstanceReservationAffinity> reservationAffinity;

    /**
     * @return Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     * 
     */
    public Output<InstanceReservationAffinity> getReservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * -- A list of short names or self_links of resource policies to attach to the instance. Modifying this list will cause the instance to recreate. Currently a max of 1 resource policy is supported.
     * 
     */
    @OutputExport(name="resourcePolicies", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourcePolicies;

    /**
     * @return -- A list of short names or self_links of resource policies to attach to the instance. Modifying this list will cause the instance to recreate. Currently a max of 1 resource policy is supported.
     * 
     */
    public Output</* @Nullable */ String> getResourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     * 
     */
    @OutputExport(name="scheduling", type=InstanceScheduling.class, parameters={})
    private Output<InstanceScheduling> scheduling;

    /**
     * @return The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     * 
     */
    public Output<InstanceScheduling> getScheduling() {
        return this.scheduling;
    }
    /**
     * Scratch disks to attach to the instance. This can be
     * specified multiple times for multiple scratch disks. Structure is documented below.
     * 
     */
    @OutputExport(name="scratchDisks", type=List.class, parameters={InstanceScratchDisk.class})
    private Output</* @Nullable */ List<InstanceScratchDisk>> scratchDisks;

    /**
     * @return Scratch disks to attach to the instance. This can be
     * specified multiple times for multiple scratch disks. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<InstanceScratchDisk>> getScratchDisks() {
        return this.scratchDisks;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Service account to attach to the instance.
     * Structure is documented below.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    @OutputExport(name="serviceAccount", type=InstanceServiceAccount.class, parameters={})
    private Output</* @Nullable */ InstanceServiceAccount> serviceAccount;

    /**
     * @return Service account to attach to the instance.
     * Structure is documented below.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    public Output</* @Nullable */ InstanceServiceAccount> getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shielded_instance_config` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    @OutputExport(name="shieldedInstanceConfig", type=InstanceShieldedInstanceConfig.class, parameters={})
    private Output<InstanceShieldedInstanceConfig> shieldedInstanceConfig;

    /**
     * @return Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shielded_instance_config` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    public Output<InstanceShieldedInstanceConfig> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * A list of network tags to attach to the instance.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of network tags to attach to the instance.
     * 
     */
    public Output</* @Nullable */ List<String>> getTags() {
        return this.tags;
    }
    /**
     * The unique fingerprint of the tags.
     * 
     */
    @OutputExport(name="tagsFingerprint", type=String.class, parameters={})
    private Output<String> tagsFingerprint;

    /**
     * @return The unique fingerprint of the tags.
     * 
     */
    public Output<String> getTagsFingerprint() {
        return this.tagsFingerprint;
    }
    /**
     * The zone that the machine should be created in. If it is not provided, the provider zone is used.
     * 
     */
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The zone that the machine should be created in. If it is not provided, the provider zone is used.
     * 
     */
    public Output<String> getZone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Instance(String name, Input<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Input<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
