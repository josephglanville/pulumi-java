// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.VirtualMachineTemplateArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.NetworkInterfaceResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.VirtualDiskResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:connectedvmwarevsphere:VirtualMachineTemplate")
public class VirtualMachineTemplate extends io.pulumi.resources.CustomResource {
    @OutputExport(name="customResourceName", type=String.class, parameters={})
    private Output<String> customResourceName;

    public Output<String> getCustomResourceName() {
        return this.customResourceName;
    }
    @OutputExport(name="disks", type=List.class, parameters={VirtualDiskResponse.class})
    private Output<List<VirtualDiskResponse>> disks;

    public Output<List<VirtualDiskResponse>> getDisks() {
        return this.disks;
    }
    @OutputExport(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    @OutputExport(name="firmwareType", type=String.class, parameters={})
    private Output<String> firmwareType;

    public Output<String> getFirmwareType() {
        return this.firmwareType;
    }
    @OutputExport(name="folderPath", type=String.class, parameters={})
    private Output<String> folderPath;

    public Output<String> getFolderPath() {
        return this.folderPath;
    }
    @OutputExport(name="inventoryItemId", type=String.class, parameters={})
    private Output</* @Nullable */ String> inventoryItemId;

    public Output</* @Nullable */ String> getInventoryItemId() {
        return this.inventoryItemId;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="memorySizeMB", type=Integer.class, parameters={})
    private Output<Integer> memorySizeMB;

    public Output<Integer> getMemorySizeMB() {
        return this.memorySizeMB;
    }
    @OutputExport(name="moName", type=String.class, parameters={})
    private Output<String> moName;

    public Output<String> getMoName() {
        return this.moName;
    }
    @OutputExport(name="moRefId", type=String.class, parameters={})
    private Output</* @Nullable */ String> moRefId;

    public Output</* @Nullable */ String> getMoRefId() {
        return this.moRefId;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="networkInterfaces", type=List.class, parameters={NetworkInterfaceResponse.class})
    private Output<List<NetworkInterfaceResponse>> networkInterfaces;

    public Output<List<NetworkInterfaceResponse>> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    @OutputExport(name="numCPUs", type=Integer.class, parameters={})
    private Output<Integer> numCPUs;

    public Output<Integer> getNumCPUs() {
        return this.numCPUs;
    }
    @OutputExport(name="numCoresPerSocket", type=Integer.class, parameters={})
    private Output<Integer> numCoresPerSocket;

    public Output<Integer> getNumCoresPerSocket() {
        return this.numCoresPerSocket;
    }
    @OutputExport(name="osName", type=String.class, parameters={})
    private Output<String> osName;

    public Output<String> getOsName() {
        return this.osName;
    }
    @OutputExport(name="osType", type=String.class, parameters={})
    private Output<String> osType;

    public Output<String> getOsType() {
        return this.osType;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="statuses", type=List.class, parameters={ResourceStatusResponse.class})
    private Output<List<ResourceStatusResponse>> statuses;

    public Output<List<ResourceStatusResponse>> getStatuses() {
        return this.statuses;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="toolsVersion", type=String.class, parameters={})
    private Output<String> toolsVersion;

    public Output<String> getToolsVersion() {
        return this.toolsVersion;
    }
    @OutputExport(name="toolsVersionStatus", type=String.class, parameters={})
    private Output<String> toolsVersionStatus;

    public Output<String> getToolsVersionStatus() {
        return this.toolsVersionStatus;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    public Output<String> getUuid() {
        return this.uuid;
    }
    @OutputExport(name="vCenterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vCenterId;

    public Output</* @Nullable */ String> getVCenterId() {
        return this.vCenterId;
    }

    public VirtualMachineTemplate(String name, VirtualMachineTemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:VirtualMachineTemplate", name, args == null ? VirtualMachineTemplateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VirtualMachineTemplate(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:VirtualMachineTemplate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:connectedvmwarevsphere/v20201001preview:VirtualMachineTemplate").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static VirtualMachineTemplate get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachineTemplate(name, id, options);
    }
}
