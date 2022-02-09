// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.connectedvmwarevsphere.enums.FirmwareType;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.HardwareProfileArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.IdentityArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.NetworkProfileArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.OsProfileArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.PlacementProfileArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.StorageProfileArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachineArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineArgs Empty = new VirtualMachineArgs();

    @InputImport(name="extendedLocation")
    private final @Nullable Input<ExtendedLocationArgs> extendedLocation;

    public Input<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Input.empty() : this.extendedLocation;
    }

    @InputImport(name="firmwareType")
    private final @Nullable Input<Either<String,FirmwareType>> firmwareType;

    public Input<Either<String,FirmwareType>> getFirmwareType() {
        return this.firmwareType == null ? Input.empty() : this.firmwareType;
    }

    @InputImport(name="hardwareProfile")
    private final @Nullable Input<HardwareProfileArgs> hardwareProfile;

    public Input<HardwareProfileArgs> getHardwareProfile() {
        return this.hardwareProfile == null ? Input.empty() : this.hardwareProfile;
    }

    @InputImport(name="identity")
    private final @Nullable Input<IdentityArgs> identity;

    public Input<IdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    @InputImport(name="inventoryItemId")
    private final @Nullable Input<String> inventoryItemId;

    public Input<String> getInventoryItemId() {
        return this.inventoryItemId == null ? Input.empty() : this.inventoryItemId;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="moRefId")
    private final @Nullable Input<String> moRefId;

    public Input<String> getMoRefId() {
        return this.moRefId == null ? Input.empty() : this.moRefId;
    }

    @InputImport(name="networkProfile")
    private final @Nullable Input<NetworkProfileArgs> networkProfile;

    public Input<NetworkProfileArgs> getNetworkProfile() {
        return this.networkProfile == null ? Input.empty() : this.networkProfile;
    }

    @InputImport(name="osProfile")
    private final @Nullable Input<OsProfileArgs> osProfile;

    public Input<OsProfileArgs> getOsProfile() {
        return this.osProfile == null ? Input.empty() : this.osProfile;
    }

    @InputImport(name="placementProfile")
    private final @Nullable Input<PlacementProfileArgs> placementProfile;

    public Input<PlacementProfileArgs> getPlacementProfile() {
        return this.placementProfile == null ? Input.empty() : this.placementProfile;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourcePoolId")
    private final @Nullable Input<String> resourcePoolId;

    public Input<String> getResourcePoolId() {
        return this.resourcePoolId == null ? Input.empty() : this.resourcePoolId;
    }

    @InputImport(name="smbiosUuid")
    private final @Nullable Input<String> smbiosUuid;

    public Input<String> getSmbiosUuid() {
        return this.smbiosUuid == null ? Input.empty() : this.smbiosUuid;
    }

    @InputImport(name="storageProfile")
    private final @Nullable Input<StorageProfileArgs> storageProfile;

    public Input<StorageProfileArgs> getStorageProfile() {
        return this.storageProfile == null ? Input.empty() : this.storageProfile;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="templateId")
    private final @Nullable Input<String> templateId;

    public Input<String> getTemplateId() {
        return this.templateId == null ? Input.empty() : this.templateId;
    }

    @InputImport(name="vCenterId")
    private final @Nullable Input<String> vCenterId;

    public Input<String> getVCenterId() {
        return this.vCenterId == null ? Input.empty() : this.vCenterId;
    }

    @InputImport(name="virtualMachineName")
    private final @Nullable Input<String> virtualMachineName;

    public Input<String> getVirtualMachineName() {
        return this.virtualMachineName == null ? Input.empty() : this.virtualMachineName;
    }

    public VirtualMachineArgs(
        @Nullable Input<ExtendedLocationArgs> extendedLocation,
        @Nullable Input<Either<String,FirmwareType>> firmwareType,
        @Nullable Input<HardwareProfileArgs> hardwareProfile,
        @Nullable Input<IdentityArgs> identity,
        @Nullable Input<String> inventoryItemId,
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> moRefId,
        @Nullable Input<NetworkProfileArgs> networkProfile,
        @Nullable Input<OsProfileArgs> osProfile,
        @Nullable Input<PlacementProfileArgs> placementProfile,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourcePoolId,
        @Nullable Input<String> smbiosUuid,
        @Nullable Input<StorageProfileArgs> storageProfile,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> templateId,
        @Nullable Input<String> vCenterId,
        @Nullable Input<String> virtualMachineName) {
        this.extendedLocation = extendedLocation;
        this.firmwareType = firmwareType;
        this.hardwareProfile = hardwareProfile;
        this.identity = identity;
        this.inventoryItemId = inventoryItemId;
        this.kind = kind;
        this.location = location;
        this.moRefId = moRefId;
        this.networkProfile = networkProfile;
        this.osProfile = osProfile;
        this.placementProfile = placementProfile;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourcePoolId = resourcePoolId;
        this.smbiosUuid = smbiosUuid;
        this.storageProfile = storageProfile;
        this.tags = tags;
        this.templateId = templateId;
        this.vCenterId = vCenterId;
        this.virtualMachineName = virtualMachineName;
    }

    private VirtualMachineArgs() {
        this.extendedLocation = Input.empty();
        this.firmwareType = Input.empty();
        this.hardwareProfile = Input.empty();
        this.identity = Input.empty();
        this.inventoryItemId = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.moRefId = Input.empty();
        this.networkProfile = Input.empty();
        this.osProfile = Input.empty();
        this.placementProfile = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourcePoolId = Input.empty();
        this.smbiosUuid = Input.empty();
        this.storageProfile = Input.empty();
        this.tags = Input.empty();
        this.templateId = Input.empty();
        this.vCenterId = Input.empty();
        this.virtualMachineName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExtendedLocationArgs> extendedLocation;
        private @Nullable Input<Either<String,FirmwareType>> firmwareType;
        private @Nullable Input<HardwareProfileArgs> hardwareProfile;
        private @Nullable Input<IdentityArgs> identity;
        private @Nullable Input<String> inventoryItemId;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> moRefId;
        private @Nullable Input<NetworkProfileArgs> networkProfile;
        private @Nullable Input<OsProfileArgs> osProfile;
        private @Nullable Input<PlacementProfileArgs> placementProfile;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourcePoolId;
        private @Nullable Input<String> smbiosUuid;
        private @Nullable Input<StorageProfileArgs> storageProfile;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> templateId;
        private @Nullable Input<String> vCenterId;
        private @Nullable Input<String> virtualMachineName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.firmwareType = defaults.firmwareType;
    	      this.hardwareProfile = defaults.hardwareProfile;
    	      this.identity = defaults.identity;
    	      this.inventoryItemId = defaults.inventoryItemId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.moRefId = defaults.moRefId;
    	      this.networkProfile = defaults.networkProfile;
    	      this.osProfile = defaults.osProfile;
    	      this.placementProfile = defaults.placementProfile;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourcePoolId = defaults.resourcePoolId;
    	      this.smbiosUuid = defaults.smbiosUuid;
    	      this.storageProfile = defaults.storageProfile;
    	      this.tags = defaults.tags;
    	      this.templateId = defaults.templateId;
    	      this.vCenterId = defaults.vCenterId;
    	      this.virtualMachineName = defaults.virtualMachineName;
        }

        public Builder setExtendedLocation(@Nullable Input<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Input.ofNullable(extendedLocation);
            return this;
        }

        public Builder setFirmwareType(@Nullable Input<Either<String,FirmwareType>> firmwareType) {
            this.firmwareType = firmwareType;
            return this;
        }

        public Builder setFirmwareType(@Nullable Either<String,FirmwareType> firmwareType) {
            this.firmwareType = Input.ofNullable(firmwareType);
            return this;
        }

        public Builder setHardwareProfile(@Nullable Input<HardwareProfileArgs> hardwareProfile) {
            this.hardwareProfile = hardwareProfile;
            return this;
        }

        public Builder setHardwareProfile(@Nullable HardwareProfileArgs hardwareProfile) {
            this.hardwareProfile = Input.ofNullable(hardwareProfile);
            return this;
        }

        public Builder setIdentity(@Nullable Input<IdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable IdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setInventoryItemId(@Nullable Input<String> inventoryItemId) {
            this.inventoryItemId = inventoryItemId;
            return this;
        }

        public Builder setInventoryItemId(@Nullable String inventoryItemId) {
            this.inventoryItemId = Input.ofNullable(inventoryItemId);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMoRefId(@Nullable Input<String> moRefId) {
            this.moRefId = moRefId;
            return this;
        }

        public Builder setMoRefId(@Nullable String moRefId) {
            this.moRefId = Input.ofNullable(moRefId);
            return this;
        }

        public Builder setNetworkProfile(@Nullable Input<NetworkProfileArgs> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setNetworkProfile(@Nullable NetworkProfileArgs networkProfile) {
            this.networkProfile = Input.ofNullable(networkProfile);
            return this;
        }

        public Builder setOsProfile(@Nullable Input<OsProfileArgs> osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder setOsProfile(@Nullable OsProfileArgs osProfile) {
            this.osProfile = Input.ofNullable(osProfile);
            return this;
        }

        public Builder setPlacementProfile(@Nullable Input<PlacementProfileArgs> placementProfile) {
            this.placementProfile = placementProfile;
            return this;
        }

        public Builder setPlacementProfile(@Nullable PlacementProfileArgs placementProfile) {
            this.placementProfile = Input.ofNullable(placementProfile);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setResourcePoolId(@Nullable Input<String> resourcePoolId) {
            this.resourcePoolId = resourcePoolId;
            return this;
        }

        public Builder setResourcePoolId(@Nullable String resourcePoolId) {
            this.resourcePoolId = Input.ofNullable(resourcePoolId);
            return this;
        }

        public Builder setSmbiosUuid(@Nullable Input<String> smbiosUuid) {
            this.smbiosUuid = smbiosUuid;
            return this;
        }

        public Builder setSmbiosUuid(@Nullable String smbiosUuid) {
            this.smbiosUuid = Input.ofNullable(smbiosUuid);
            return this;
        }

        public Builder setStorageProfile(@Nullable Input<StorageProfileArgs> storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder setStorageProfile(@Nullable StorageProfileArgs storageProfile) {
            this.storageProfile = Input.ofNullable(storageProfile);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTemplateId(@Nullable Input<String> templateId) {
            this.templateId = templateId;
            return this;
        }

        public Builder setTemplateId(@Nullable String templateId) {
            this.templateId = Input.ofNullable(templateId);
            return this;
        }

        public Builder setVCenterId(@Nullable Input<String> vCenterId) {
            this.vCenterId = vCenterId;
            return this;
        }

        public Builder setVCenterId(@Nullable String vCenterId) {
            this.vCenterId = Input.ofNullable(vCenterId);
            return this;
        }

        public Builder setVirtualMachineName(@Nullable Input<String> virtualMachineName) {
            this.virtualMachineName = virtualMachineName;
            return this;
        }

        public Builder setVirtualMachineName(@Nullable String virtualMachineName) {
            this.virtualMachineName = Input.ofNullable(virtualMachineName);
            return this;
        }

        public VirtualMachineArgs build() {
            return new VirtualMachineArgs(extendedLocation, firmwareType, hardwareProfile, identity, inventoryItemId, kind, location, moRefId, networkProfile, osProfile, placementProfile, resourceGroupName, resourcePoolId, smbiosUuid, storageProfile, tags, templateId, vCenterId, virtualMachineName);
        }
    }
}
