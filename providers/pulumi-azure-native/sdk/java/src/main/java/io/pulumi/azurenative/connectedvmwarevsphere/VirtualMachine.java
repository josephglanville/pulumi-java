// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.VirtualMachineArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.GuestAgentProfileResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.HardwareProfileResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.IdentityResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.NetworkProfileResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.OsProfileResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.PlacementProfileResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.StorageProfileResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Define the virtualMachine.
 * API Version: 2020-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:connectedvmwarevsphere:VirtualMachine ContosoAgent /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VirtualMachines/ContosoAgent 
 * ```
 * 
 */
@ResourceType(type="azure-native:connectedvmwarevsphere:VirtualMachine")
public class VirtualMachine extends io.pulumi.resources.CustomResource {
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    @Export(name="customResourceName", type=String.class, parameters={})
    private Output<String> customResourceName;

    /**
     * @return Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    public Output<String> getCustomResourceName() {
        return this.customResourceName;
    }
    /**
     * Gets or sets the extended location.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return Gets or sets the extended location.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * Firmware type
     * 
     */
    @Export(name="firmwareType", type=String.class, parameters={})
    private Output</* @Nullable */ String> firmwareType;

    /**
     * @return Firmware type
     * 
     */
    public Output</* @Nullable */ String> getFirmwareType() {
        return this.firmwareType;
    }
    /**
     * Gets or sets the folder path of the vm.
     * 
     */
    @Export(name="folderPath", type=String.class, parameters={})
    private Output<String> folderPath;

    /**
     * @return Gets or sets the folder path of the vm.
     * 
     */
    public Output<String> getFolderPath() {
        return this.folderPath;
    }
    /**
     * Guest agent status properties.
     * 
     */
    @Export(name="guestAgentProfile", type=GuestAgentProfileResponse.class, parameters={})
    private Output</* @Nullable */ GuestAgentProfileResponse> guestAgentProfile;

    /**
     * @return Guest agent status properties.
     * 
     */
    public Output</* @Nullable */ GuestAgentProfileResponse> getGuestAgentProfile() {
        return this.guestAgentProfile;
    }
    /**
     * Hardware properties.
     * 
     */
    @Export(name="hardwareProfile", type=HardwareProfileResponse.class, parameters={})
    private Output</* @Nullable */ HardwareProfileResponse> hardwareProfile;

    /**
     * @return Hardware properties.
     * 
     */
    public Output</* @Nullable */ HardwareProfileResponse> getHardwareProfile() {
        return this.hardwareProfile;
    }
    /**
     * The identity of the resource.
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity of the resource.
     * 
     */
    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Gets or sets the instance uuid of the vm.
     * 
     */
    @Export(name="instanceUuid", type=String.class, parameters={})
    private Output<String> instanceUuid;

    /**
     * @return Gets or sets the instance uuid of the vm.
     * 
     */
    public Output<String> getInstanceUuid() {
        return this.instanceUuid;
    }
    /**
     * Gets or sets the inventory Item ID for the virtual machine.
     * 
     */
    @Export(name="inventoryItemId", type=String.class, parameters={})
    private Output</* @Nullable */ String> inventoryItemId;

    /**
     * @return Gets or sets the inventory Item ID for the virtual machine.
     * 
     */
    public Output</* @Nullable */ String> getInventoryItemId() {
        return this.inventoryItemId;
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Gets or sets the location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Gets or sets the location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Gets or sets the vCenter Managed Object name for the virtual machine.
     * 
     */
    @Export(name="moName", type=String.class, parameters={})
    private Output<String> moName;

    /**
     * @return Gets or sets the vCenter Managed Object name for the virtual machine.
     * 
     */
    public Output<String> getMoName() {
        return this.moName;
    }
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine.
     * 
     */
    @Export(name="moRefId", type=String.class, parameters={})
    private Output</* @Nullable */ String> moRefId;

    /**
     * @return Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine.
     * 
     */
    public Output</* @Nullable */ String> getMoRefId() {
        return this.moRefId;
    }
    /**
     * Gets or sets the name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets or sets the name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Network properties.
     * 
     */
    @Export(name="networkProfile", type=NetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ NetworkProfileResponse> networkProfile;

    /**
     * @return Network properties.
     * 
     */
    public Output</* @Nullable */ NetworkProfileResponse> getNetworkProfile() {
        return this.networkProfile;
    }
    /**
     * OS properties.
     * 
     */
    @Export(name="osProfile", type=OsProfileResponse.class, parameters={})
    private Output</* @Nullable */ OsProfileResponse> osProfile;

    /**
     * @return OS properties.
     * 
     */
    public Output</* @Nullable */ OsProfileResponse> getOsProfile() {
        return this.osProfile;
    }
    /**
     * Placement properties.
     * 
     */
    @Export(name="placementProfile", type=PlacementProfileResponse.class, parameters={})
    private Output</* @Nullable */ PlacementProfileResponse> placementProfile;

    /**
     * @return Placement properties.
     * 
     */
    public Output</* @Nullable */ PlacementProfileResponse> getPlacementProfile() {
        return this.placementProfile;
    }
    /**
     * Gets the power state of the virtual machine.
     * 
     */
    @Export(name="powerState", type=String.class, parameters={})
    private Output<String> powerState;

    /**
     * @return Gets the power state of the virtual machine.
     * 
     */
    public Output<String> getPowerState() {
        return this.powerState;
    }
    /**
     * Gets or sets the provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the ARM Id of the resourcePool resource on which this virtual machine will
     * deploy.
     * 
     */
    @Export(name="resourcePoolId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourcePoolId;

    /**
     * @return Gets or sets the ARM Id of the resourcePool resource on which this virtual machine will
     * deploy.
     * 
     */
    public Output</* @Nullable */ String> getResourcePoolId() {
        return this.resourcePoolId;
    }
    /**
     * Gets or sets the SMBIOS UUID of the vm.
     * 
     */
    @Export(name="smbiosUuid", type=String.class, parameters={})
    private Output</* @Nullable */ String> smbiosUuid;

    /**
     * @return Gets or sets the SMBIOS UUID of the vm.
     * 
     */
    public Output</* @Nullable */ String> getSmbiosUuid() {
        return this.smbiosUuid;
    }
    /**
     * The resource status information.
     * 
     */
    @Export(name="statuses", type=List.class, parameters={ResourceStatusResponse.class})
    private Output<List<ResourceStatusResponse>> statuses;

    /**
     * @return The resource status information.
     * 
     */
    public Output<List<ResourceStatusResponse>> getStatuses() {
        return this.statuses;
    }
    /**
     * Storage properties.
     * 
     */
    @Export(name="storageProfile", type=StorageProfileResponse.class, parameters={})
    private Output</* @Nullable */ StorageProfileResponse> storageProfile;

    /**
     * @return Storage properties.
     * 
     */
    public Output</* @Nullable */ StorageProfileResponse> getStorageProfile() {
        return this.storageProfile;
    }
    /**
     * The system data.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system data.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Gets or sets the Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Gets or sets the Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Gets or sets the ARM Id of the template resource to deploy the virtual machine.
     * 
     */
    @Export(name="templateId", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateId;

    /**
     * @return Gets or sets the ARM Id of the template resource to deploy the virtual machine.
     * 
     */
    public Output</* @Nullable */ String> getTemplateId() {
        return this.templateId;
    }
    /**
     * Gets or sets the type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets or sets the type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Gets or sets a unique identifier for this resource.
     * 
     */
    @Export(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    /**
     * @return Gets or sets a unique identifier for this resource.
     * 
     */
    public Output<String> getUuid() {
        return this.uuid;
    }
    /**
     * Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
     */
    @Export(name="vCenterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vCenterId;

    /**
     * @return Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
     */
    public Output</* @Nullable */ String> getVCenterId() {
        return this.vCenterId;
    }
    /**
     * Gets or sets a unique identifier for the vm resource.
     * 
     */
    @Export(name="vmId", type=String.class, parameters={})
    private Output<String> vmId;

    /**
     * @return Gets or sets a unique identifier for the vm resource.
     * 
     */
    public Output<String> getVmId() {
        return this.vmId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMachine(String name) {
        this(name, VirtualMachineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachine(String name, VirtualMachineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachine(String name, VirtualMachineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:VirtualMachine", name, args == null ? VirtualMachineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualMachine(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:VirtualMachine", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:connectedvmwarevsphere/v20201001preview:VirtualMachine").build())
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
    public static VirtualMachine get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachine(name, id, options);
    }
}
