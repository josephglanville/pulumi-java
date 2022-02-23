// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.VirtualMachineScaleSetArgs;
import io.pulumi.azurenative.compute.outputs.AdditionalCapabilitiesResponse;
import io.pulumi.azurenative.compute.outputs.AutomaticRepairsPolicyResponse;
import io.pulumi.azurenative.compute.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.compute.outputs.PlanResponse;
import io.pulumi.azurenative.compute.outputs.ScaleInPolicyResponse;
import io.pulumi.azurenative.compute.outputs.SkuResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.azurenative.compute.outputs.UpgradePolicyResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetIdentityResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetVMProfileResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Describes a Virtual Machine Scale Set.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:VirtualMachineScaleSet {vmss-name} /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachineScaleSets/{vmss-name} 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:VirtualMachineScaleSet")
public class VirtualMachineScaleSet extends io.pulumi.resources.CustomResource {
    /**
     * Specifies additional capabilities enabled or disabled on the Virtual Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to support attaching managed data disks with UltraSSD_LRS storage account type.
     * 
     */
    @OutputExport(name="additionalCapabilities", type=AdditionalCapabilitiesResponse.class, parameters={})
    private Output</* @Nullable */ AdditionalCapabilitiesResponse> additionalCapabilities;

    /**
     * @return Specifies additional capabilities enabled or disabled on the Virtual Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to support attaching managed data disks with UltraSSD_LRS storage account type.
     * 
     */
    public Output</* @Nullable */ AdditionalCapabilitiesResponse> getAdditionalCapabilities() {
        return this.additionalCapabilities;
    }
    /**
     * Policy for automatic repairs.
     * 
     */
    @OutputExport(name="automaticRepairsPolicy", type=AutomaticRepairsPolicyResponse.class, parameters={})
    private Output</* @Nullable */ AutomaticRepairsPolicyResponse> automaticRepairsPolicy;

    /**
     * @return Policy for automatic repairs.
     * 
     */
    public Output</* @Nullable */ AutomaticRepairsPolicyResponse> getAutomaticRepairsPolicy() {
        return this.automaticRepairsPolicy;
    }
    /**
     * When Overprovision is enabled, extensions are launched only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions do not run on the extra overprovisioned VMs.
     * 
     */
    @OutputExport(name="doNotRunExtensionsOnOverprovisionedVMs", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> doNotRunExtensionsOnOverprovisionedVMs;

    /**
     * @return When Overprovision is enabled, extensions are launched only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions do not run on the extra overprovisioned VMs.
     * 
     */
    public Output</* @Nullable */ Boolean> getDoNotRunExtensionsOnOverprovisionedVMs() {
        return this.doNotRunExtensionsOnOverprovisionedVMs;
    }
    /**
     * The extended location of the Virtual Machine Scale Set.
     * 
     */
    @OutputExport(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of the Virtual Machine Scale Set.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * Specifies information about the dedicated host group that the virtual machine scale set resides in. <br><br>Minimum api-version: 2020-06-01.
     * 
     */
    @OutputExport(name="hostGroup", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> hostGroup;

    /**
     * @return Specifies information about the dedicated host group that the virtual machine scale set resides in. <br><br>Minimum api-version: 2020-06-01.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getHostGroup() {
        return this.hostGroup;
    }
    /**
     * The identity of the virtual machine scale set, if configured.
     * 
     */
    @OutputExport(name="identity", type=VirtualMachineScaleSetIdentityResponse.class, parameters={})
    private Output</* @Nullable */ VirtualMachineScaleSetIdentityResponse> identity;

    /**
     * @return The identity of the virtual machine scale set, if configured.
     * 
     */
    public Output</* @Nullable */ VirtualMachineScaleSetIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the orchestration mode for the virtual machine scale set.
     * 
     */
    @OutputExport(name="orchestrationMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> orchestrationMode;

    /**
     * @return Specifies the orchestration mode for the virtual machine scale set.
     * 
     */
    public Output</* @Nullable */ String> getOrchestrationMode() {
        return this.orchestrationMode;
    }
    /**
     * Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     * 
     */
    @OutputExport(name="overprovision", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> overprovision;

    /**
     * @return Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     * 
     */
    public Output</* @Nullable */ Boolean> getOverprovision() {
        return this.overprovision;
    }
    /**
     * Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started ->**. Enter any required information and then click **Save**.
     * 
     */
    @OutputExport(name="plan", type=PlanResponse.class, parameters={})
    private Output</* @Nullable */ PlanResponse> plan;

    /**
     * @return Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started ->**. Enter any required information and then click **Save**.
     * 
     */
    public Output</* @Nullable */ PlanResponse> getPlan() {
        return this.plan;
    }
    /**
     * Fault Domain count for each placement group.
     * 
     */
    @OutputExport(name="platformFaultDomainCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> platformFaultDomainCount;

    /**
     * @return Fault Domain count for each placement group.
     * 
     */
    public Output</* @Nullable */ Integer> getPlatformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state, which only appears in the response.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Specifies information about the proximity placement group that the virtual machine scale set should be assigned to. <br><br>Minimum api-version: 2018-04-01.
     * 
     */
    @OutputExport(name="proximityPlacementGroup", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> proximityPlacementGroup;

    /**
     * @return Specifies information about the proximity placement group that the virtual machine scale set should be assigned to. <br><br>Minimum api-version: 2018-04-01.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getProximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }
    /**
     * Specifies the scale-in policy that decides which virtual machines are chosen for removal when a Virtual Machine Scale Set is scaled-in.
     * 
     */
    @OutputExport(name="scaleInPolicy", type=ScaleInPolicyResponse.class, parameters={})
    private Output</* @Nullable */ ScaleInPolicyResponse> scaleInPolicy;

    /**
     * @return Specifies the scale-in policy that decides which virtual machines are chosen for removal when a Virtual Machine Scale Set is scaled-in.
     * 
     */
    public Output</* @Nullable */ ScaleInPolicyResponse> getScaleInPolicy() {
        return this.scaleInPolicy;
    }
    /**
     * When true this limits the scale set to a single placement group, of max size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if singlePlacementGroup is false, it may not be modified to true.
     * 
     */
    @OutputExport(name="singlePlacementGroup", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> singlePlacementGroup;

    /**
     * @return When true this limits the scale set to a single placement group, of max size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if singlePlacementGroup is false, it may not be modified to true.
     * 
     */
    public Output</* @Nullable */ Boolean> getSinglePlacementGroup() {
        return this.singlePlacementGroup;
    }
    /**
     * The virtual machine scale set sku.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The virtual machine scale set sku.
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Specifies the ID which uniquely identifies a Virtual Machine Scale Set.
     * 
     */
    @OutputExport(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return Specifies the ID which uniquely identifies a Virtual Machine Scale Set.
     * 
     */
    public Output<String> getUniqueId() {
        return this.uniqueId;
    }
    /**
     * The upgrade policy.
     * 
     */
    @OutputExport(name="upgradePolicy", type=UpgradePolicyResponse.class, parameters={})
    private Output</* @Nullable */ UpgradePolicyResponse> upgradePolicy;

    /**
     * @return The upgrade policy.
     * 
     */
    public Output</* @Nullable */ UpgradePolicyResponse> getUpgradePolicy() {
        return this.upgradePolicy;
    }
    /**
     * The virtual machine profile.
     * 
     */
    @OutputExport(name="virtualMachineProfile", type=VirtualMachineScaleSetVMProfileResponse.class, parameters={})
    private Output</* @Nullable */ VirtualMachineScaleSetVMProfileResponse> virtualMachineProfile;

    /**
     * @return The virtual machine profile.
     * 
     */
    public Output</* @Nullable */ VirtualMachineScaleSetVMProfileResponse> getVirtualMachineProfile() {
        return this.virtualMachineProfile;
    }
    /**
     * Whether to force strictly even Virtual Machine distribution cross x-zones in case there is zone outage.
     * 
     */
    @OutputExport(name="zoneBalance", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> zoneBalance;

    /**
     * @return Whether to force strictly even Virtual Machine distribution cross x-zones in case there is zone outage.
     * 
     */
    public Output</* @Nullable */ Boolean> getZoneBalance() {
        return this.zoneBalance;
    }
    /**
     * The virtual machine scale set zones. NOTE: Availability zones can only be set when you create the scale set
     * 
     */
    @OutputExport(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return The virtual machine scale set zones. NOTE: Availability zones can only be set when you create the scale set
     * 
     */
    public Output</* @Nullable */ List<String>> getZones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMachineScaleSet(String name) {
        this(name, VirtualMachineScaleSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachineScaleSet(String name, VirtualMachineScaleSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachineScaleSet(String name, VirtualMachineScaleSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineScaleSet", name, args == null ? VirtualMachineScaleSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VirtualMachineScaleSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineScaleSet", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:compute/v20150615:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20160330:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20160430preview:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20170330:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20171201:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20180401:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20180601:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20181001:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20190301:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20190701:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20191201:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20200601:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20201201:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210301:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210401:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210701:VirtualMachineScaleSet").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20211101:VirtualMachineScaleSet").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VirtualMachineScaleSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachineScaleSet(name, id, options);
    }
}
