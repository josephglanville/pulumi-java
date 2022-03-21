// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.ArtifactInstallPropertiesArgs;
import io.pulumi.azurenative.devtestlab.inputs.BulkCreationParametersArgs;
import io.pulumi.azurenative.devtestlab.inputs.DataDiskPropertiesArgs;
import io.pulumi.azurenative.devtestlab.inputs.GalleryImageReferenceArgs;
import io.pulumi.azurenative.devtestlab.inputs.NetworkInterfacePropertiesArgs;
import io.pulumi.azurenative.devtestlab.inputs.ScheduleCreationParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for creating a virtual machine.
 * 
 */
public final class LabVirtualMachineCreationParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabVirtualMachineCreationParameterArgs Empty = new LabVirtualMachineCreationParameterArgs();

    /**
     * Indicates whether another user can take ownership of the virtual machine
     * 
     */
    @Import(name="allowClaim")
      private final @Nullable Output<Boolean> allowClaim;

    public Output<Boolean> getAllowClaim() {
        return this.allowClaim == null ? Output.empty() : this.allowClaim;
    }

    /**
     * The artifacts to be installed on the virtual machine.
     * 
     */
    @Import(name="artifacts")
      private final @Nullable Output<List<ArtifactInstallPropertiesArgs>> artifacts;

    public Output<List<ArtifactInstallPropertiesArgs>> getArtifacts() {
        return this.artifacts == null ? Output.empty() : this.artifacts;
    }

    /**
     * The number of virtual machine instances to create.
     * 
     */
    @Import(name="bulkCreationParameters")
      private final @Nullable Output<BulkCreationParametersArgs> bulkCreationParameters;

    public Output<BulkCreationParametersArgs> getBulkCreationParameters() {
        return this.bulkCreationParameters == null ? Output.empty() : this.bulkCreationParameters;
    }

    /**
     * The creation date of the virtual machine.
     * 
     */
    @Import(name="createdDate")
      private final @Nullable Output<String> createdDate;

    public Output<String> getCreatedDate() {
        return this.createdDate == null ? Output.empty() : this.createdDate;
    }

    /**
     * The custom image identifier of the virtual machine.
     * 
     */
    @Import(name="customImageId")
      private final @Nullable Output<String> customImageId;

    public Output<String> getCustomImageId() {
        return this.customImageId == null ? Output.empty() : this.customImageId;
    }

    /**
     * New or existing data disks to attach to the virtual machine after creation
     * 
     */
    @Import(name="dataDiskParameters")
      private final @Nullable Output<List<DataDiskPropertiesArgs>> dataDiskParameters;

    public Output<List<DataDiskPropertiesArgs>> getDataDiskParameters() {
        return this.dataDiskParameters == null ? Output.empty() : this.dataDiskParameters;
    }

    /**
     * Indicates whether the virtual machine is to be created without a public IP address.
     * 
     */
    @Import(name="disallowPublicIpAddress")
      private final @Nullable Output<Boolean> disallowPublicIpAddress;

    public Output<Boolean> getDisallowPublicIpAddress() {
        return this.disallowPublicIpAddress == null ? Output.empty() : this.disallowPublicIpAddress;
    }

    /**
     * The resource ID of the environment that contains this virtual machine, if any.
     * 
     */
    @Import(name="environmentId")
      private final @Nullable Output<String> environmentId;

    public Output<String> getEnvironmentId() {
        return this.environmentId == null ? Output.empty() : this.environmentId;
    }

    /**
     * The expiration date for VM.
     * 
     */
    @Import(name="expirationDate")
      private final @Nullable Output<String> expirationDate;

    public Output<String> getExpirationDate() {
        return this.expirationDate == null ? Output.empty() : this.expirationDate;
    }

    /**
     * The Microsoft Azure Marketplace image reference of the virtual machine.
     * 
     */
    @Import(name="galleryImageReference")
      private final @Nullable Output<GalleryImageReferenceArgs> galleryImageReference;

    public Output<GalleryImageReferenceArgs> getGalleryImageReference() {
        return this.galleryImageReference == null ? Output.empty() : this.galleryImageReference;
    }

    /**
     * Indicates whether this virtual machine uses an SSH key for authentication.
     * 
     */
    @Import(name="isAuthenticationWithSshKey")
      private final @Nullable Output<Boolean> isAuthenticationWithSshKey;

    public Output<Boolean> getIsAuthenticationWithSshKey() {
        return this.isAuthenticationWithSshKey == null ? Output.empty() : this.isAuthenticationWithSshKey;
    }

    /**
     * The lab subnet name of the virtual machine.
     * 
     */
    @Import(name="labSubnetName")
      private final @Nullable Output<String> labSubnetName;

    public Output<String> getLabSubnetName() {
        return this.labSubnetName == null ? Output.empty() : this.labSubnetName;
    }

    /**
     * The lab virtual network identifier of the virtual machine.
     * 
     */
    @Import(name="labVirtualNetworkId")
      private final @Nullable Output<String> labVirtualNetworkId;

    public Output<String> getLabVirtualNetworkId() {
        return this.labVirtualNetworkId == null ? Output.empty() : this.labVirtualNetworkId;
    }

    /**
     * The location of the new virtual machine or environment
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the virtual machine or environment
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The network interface properties.
     * 
     */
    @Import(name="networkInterface")
      private final @Nullable Output<NetworkInterfacePropertiesArgs> networkInterface;

    public Output<NetworkInterfacePropertiesArgs> getNetworkInterface() {
        return this.networkInterface == null ? Output.empty() : this.networkInterface;
    }

    /**
     * The notes of the virtual machine.
     * 
     */
    @Import(name="notes")
      private final @Nullable Output<String> notes;

    public Output<String> getNotes() {
        return this.notes == null ? Output.empty() : this.notes;
    }

    /**
     * The object identifier of the owner of the virtual machine.
     * 
     */
    @Import(name="ownerObjectId")
      private final @Nullable Output<String> ownerObjectId;

    public Output<String> getOwnerObjectId() {
        return this.ownerObjectId == null ? Output.empty() : this.ownerObjectId;
    }

    /**
     * The user principal name of the virtual machine owner.
     * 
     */
    @Import(name="ownerUserPrincipalName")
      private final @Nullable Output<String> ownerUserPrincipalName;

    public Output<String> getOwnerUserPrincipalName() {
        return this.ownerUserPrincipalName == null ? Output.empty() : this.ownerUserPrincipalName;
    }

    /**
     * The password of the virtual machine administrator.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * The id of the plan associated with the virtual machine image
     * 
     */
    @Import(name="planId")
      private final @Nullable Output<String> planId;

    public Output<String> getPlanId() {
        return this.planId == null ? Output.empty() : this.planId;
    }

    /**
     * Virtual Machine schedules to be created
     * 
     */
    @Import(name="scheduleParameters")
      private final @Nullable Output<List<ScheduleCreationParameterArgs>> scheduleParameters;

    public Output<List<ScheduleCreationParameterArgs>> getScheduleParameters() {
        return this.scheduleParameters == null ? Output.empty() : this.scheduleParameters;
    }

    /**
     * The size of the virtual machine.
     * 
     */
    @Import(name="size")
      private final @Nullable Output<String> size;

    public Output<String> getSize() {
        return this.size == null ? Output.empty() : this.size;
    }

    /**
     * The SSH key of the virtual machine administrator.
     * 
     */
    @Import(name="sshKey")
      private final @Nullable Output<String> sshKey;

    public Output<String> getSshKey() {
        return this.sshKey == null ? Output.empty() : this.sshKey;
    }

    /**
     * Storage type to use for virtual machine (i.e. Standard, Premium).
     * 
     */
    @Import(name="storageType")
      private final @Nullable Output<String> storageType;

    public Output<String> getStorageType() {
        return this.storageType == null ? Output.empty() : this.storageType;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The user name of the virtual machine.
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> getUserName() {
        return this.userName == null ? Output.empty() : this.userName;
    }

    public LabVirtualMachineCreationParameterArgs(
        @Nullable Output<Boolean> allowClaim,
        @Nullable Output<List<ArtifactInstallPropertiesArgs>> artifacts,
        @Nullable Output<BulkCreationParametersArgs> bulkCreationParameters,
        @Nullable Output<String> createdDate,
        @Nullable Output<String> customImageId,
        @Nullable Output<List<DataDiskPropertiesArgs>> dataDiskParameters,
        @Nullable Output<Boolean> disallowPublicIpAddress,
        @Nullable Output<String> environmentId,
        @Nullable Output<String> expirationDate,
        @Nullable Output<GalleryImageReferenceArgs> galleryImageReference,
        @Nullable Output<Boolean> isAuthenticationWithSshKey,
        @Nullable Output<String> labSubnetName,
        @Nullable Output<String> labVirtualNetworkId,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<NetworkInterfacePropertiesArgs> networkInterface,
        @Nullable Output<String> notes,
        @Nullable Output<String> ownerObjectId,
        @Nullable Output<String> ownerUserPrincipalName,
        @Nullable Output<String> password,
        @Nullable Output<String> planId,
        @Nullable Output<List<ScheduleCreationParameterArgs>> scheduleParameters,
        @Nullable Output<String> size,
        @Nullable Output<String> sshKey,
        @Nullable Output<String> storageType,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> userName) {
        this.allowClaim = allowClaim == null ? Output.ofNullable(false) : allowClaim;
        this.artifacts = artifacts;
        this.bulkCreationParameters = bulkCreationParameters;
        this.createdDate = createdDate;
        this.customImageId = customImageId;
        this.dataDiskParameters = dataDiskParameters;
        this.disallowPublicIpAddress = disallowPublicIpAddress == null ? Output.ofNullable(false) : disallowPublicIpAddress;
        this.environmentId = environmentId;
        this.expirationDate = expirationDate;
        this.galleryImageReference = galleryImageReference;
        this.isAuthenticationWithSshKey = isAuthenticationWithSshKey;
        this.labSubnetName = labSubnetName;
        this.labVirtualNetworkId = labVirtualNetworkId;
        this.location = location;
        this.name = name;
        this.networkInterface = networkInterface;
        this.notes = notes;
        this.ownerObjectId = ownerObjectId == null ? Output.ofNullable("dynamicValue") : ownerObjectId;
        this.ownerUserPrincipalName = ownerUserPrincipalName;
        this.password = password;
        this.planId = planId;
        this.scheduleParameters = scheduleParameters;
        this.size = size;
        this.sshKey = sshKey;
        this.storageType = storageType == null ? Output.ofNullable("labStorageType") : storageType;
        this.tags = tags;
        this.userName = userName;
    }

    private LabVirtualMachineCreationParameterArgs() {
        this.allowClaim = Output.empty();
        this.artifacts = Output.empty();
        this.bulkCreationParameters = Output.empty();
        this.createdDate = Output.empty();
        this.customImageId = Output.empty();
        this.dataDiskParameters = Output.empty();
        this.disallowPublicIpAddress = Output.empty();
        this.environmentId = Output.empty();
        this.expirationDate = Output.empty();
        this.galleryImageReference = Output.empty();
        this.isAuthenticationWithSshKey = Output.empty();
        this.labSubnetName = Output.empty();
        this.labVirtualNetworkId = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.networkInterface = Output.empty();
        this.notes = Output.empty();
        this.ownerObjectId = Output.empty();
        this.ownerUserPrincipalName = Output.empty();
        this.password = Output.empty();
        this.planId = Output.empty();
        this.scheduleParameters = Output.empty();
        this.size = Output.empty();
        this.sshKey = Output.empty();
        this.storageType = Output.empty();
        this.tags = Output.empty();
        this.userName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabVirtualMachineCreationParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowClaim;
        private @Nullable Output<List<ArtifactInstallPropertiesArgs>> artifacts;
        private @Nullable Output<BulkCreationParametersArgs> bulkCreationParameters;
        private @Nullable Output<String> createdDate;
        private @Nullable Output<String> customImageId;
        private @Nullable Output<List<DataDiskPropertiesArgs>> dataDiskParameters;
        private @Nullable Output<Boolean> disallowPublicIpAddress;
        private @Nullable Output<String> environmentId;
        private @Nullable Output<String> expirationDate;
        private @Nullable Output<GalleryImageReferenceArgs> galleryImageReference;
        private @Nullable Output<Boolean> isAuthenticationWithSshKey;
        private @Nullable Output<String> labSubnetName;
        private @Nullable Output<String> labVirtualNetworkId;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<NetworkInterfacePropertiesArgs> networkInterface;
        private @Nullable Output<String> notes;
        private @Nullable Output<String> ownerObjectId;
        private @Nullable Output<String> ownerUserPrincipalName;
        private @Nullable Output<String> password;
        private @Nullable Output<String> planId;
        private @Nullable Output<List<ScheduleCreationParameterArgs>> scheduleParameters;
        private @Nullable Output<String> size;
        private @Nullable Output<String> sshKey;
        private @Nullable Output<String> storageType;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(LabVirtualMachineCreationParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowClaim = defaults.allowClaim;
    	      this.artifacts = defaults.artifacts;
    	      this.bulkCreationParameters = defaults.bulkCreationParameters;
    	      this.createdDate = defaults.createdDate;
    	      this.customImageId = defaults.customImageId;
    	      this.dataDiskParameters = defaults.dataDiskParameters;
    	      this.disallowPublicIpAddress = defaults.disallowPublicIpAddress;
    	      this.environmentId = defaults.environmentId;
    	      this.expirationDate = defaults.expirationDate;
    	      this.galleryImageReference = defaults.galleryImageReference;
    	      this.isAuthenticationWithSshKey = defaults.isAuthenticationWithSshKey;
    	      this.labSubnetName = defaults.labSubnetName;
    	      this.labVirtualNetworkId = defaults.labVirtualNetworkId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkInterface = defaults.networkInterface;
    	      this.notes = defaults.notes;
    	      this.ownerObjectId = defaults.ownerObjectId;
    	      this.ownerUserPrincipalName = defaults.ownerUserPrincipalName;
    	      this.password = defaults.password;
    	      this.planId = defaults.planId;
    	      this.scheduleParameters = defaults.scheduleParameters;
    	      this.size = defaults.size;
    	      this.sshKey = defaults.sshKey;
    	      this.storageType = defaults.storageType;
    	      this.tags = defaults.tags;
    	      this.userName = defaults.userName;
        }

        public Builder allowClaim(@Nullable Output<Boolean> allowClaim) {
            this.allowClaim = allowClaim;
            return this;
        }
        public Builder allowClaim(@Nullable Boolean allowClaim) {
            this.allowClaim = Output.ofNullable(allowClaim);
            return this;
        }
        public Builder artifacts(@Nullable Output<List<ArtifactInstallPropertiesArgs>> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public Builder artifacts(@Nullable List<ArtifactInstallPropertiesArgs> artifacts) {
            this.artifacts = Output.ofNullable(artifacts);
            return this;
        }
        public Builder artifacts(ArtifactInstallPropertiesArgs... artifacts) {
            return artifacts(List.of(artifacts));
        }
        public Builder bulkCreationParameters(@Nullable Output<BulkCreationParametersArgs> bulkCreationParameters) {
            this.bulkCreationParameters = bulkCreationParameters;
            return this;
        }
        public Builder bulkCreationParameters(@Nullable BulkCreationParametersArgs bulkCreationParameters) {
            this.bulkCreationParameters = Output.ofNullable(bulkCreationParameters);
            return this;
        }
        public Builder createdDate(@Nullable Output<String> createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public Builder createdDate(@Nullable String createdDate) {
            this.createdDate = Output.ofNullable(createdDate);
            return this;
        }
        public Builder customImageId(@Nullable Output<String> customImageId) {
            this.customImageId = customImageId;
            return this;
        }
        public Builder customImageId(@Nullable String customImageId) {
            this.customImageId = Output.ofNullable(customImageId);
            return this;
        }
        public Builder dataDiskParameters(@Nullable Output<List<DataDiskPropertiesArgs>> dataDiskParameters) {
            this.dataDiskParameters = dataDiskParameters;
            return this;
        }
        public Builder dataDiskParameters(@Nullable List<DataDiskPropertiesArgs> dataDiskParameters) {
            this.dataDiskParameters = Output.ofNullable(dataDiskParameters);
            return this;
        }
        public Builder dataDiskParameters(DataDiskPropertiesArgs... dataDiskParameters) {
            return dataDiskParameters(List.of(dataDiskParameters));
        }
        public Builder disallowPublicIpAddress(@Nullable Output<Boolean> disallowPublicIpAddress) {
            this.disallowPublicIpAddress = disallowPublicIpAddress;
            return this;
        }
        public Builder disallowPublicIpAddress(@Nullable Boolean disallowPublicIpAddress) {
            this.disallowPublicIpAddress = Output.ofNullable(disallowPublicIpAddress);
            return this;
        }
        public Builder environmentId(@Nullable Output<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = Output.ofNullable(environmentId);
            return this;
        }
        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = Output.ofNullable(expirationDate);
            return this;
        }
        public Builder galleryImageReference(@Nullable Output<GalleryImageReferenceArgs> galleryImageReference) {
            this.galleryImageReference = galleryImageReference;
            return this;
        }
        public Builder galleryImageReference(@Nullable GalleryImageReferenceArgs galleryImageReference) {
            this.galleryImageReference = Output.ofNullable(galleryImageReference);
            return this;
        }
        public Builder isAuthenticationWithSshKey(@Nullable Output<Boolean> isAuthenticationWithSshKey) {
            this.isAuthenticationWithSshKey = isAuthenticationWithSshKey;
            return this;
        }
        public Builder isAuthenticationWithSshKey(@Nullable Boolean isAuthenticationWithSshKey) {
            this.isAuthenticationWithSshKey = Output.ofNullable(isAuthenticationWithSshKey);
            return this;
        }
        public Builder labSubnetName(@Nullable Output<String> labSubnetName) {
            this.labSubnetName = labSubnetName;
            return this;
        }
        public Builder labSubnetName(@Nullable String labSubnetName) {
            this.labSubnetName = Output.ofNullable(labSubnetName);
            return this;
        }
        public Builder labVirtualNetworkId(@Nullable Output<String> labVirtualNetworkId) {
            this.labVirtualNetworkId = labVirtualNetworkId;
            return this;
        }
        public Builder labVirtualNetworkId(@Nullable String labVirtualNetworkId) {
            this.labVirtualNetworkId = Output.ofNullable(labVirtualNetworkId);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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
        public Builder networkInterface(@Nullable Output<NetworkInterfacePropertiesArgs> networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }
        public Builder networkInterface(@Nullable NetworkInterfacePropertiesArgs networkInterface) {
            this.networkInterface = Output.ofNullable(networkInterface);
            return this;
        }
        public Builder notes(@Nullable Output<String> notes) {
            this.notes = notes;
            return this;
        }
        public Builder notes(@Nullable String notes) {
            this.notes = Output.ofNullable(notes);
            return this;
        }
        public Builder ownerObjectId(@Nullable Output<String> ownerObjectId) {
            this.ownerObjectId = ownerObjectId;
            return this;
        }
        public Builder ownerObjectId(@Nullable String ownerObjectId) {
            this.ownerObjectId = Output.ofNullable(ownerObjectId);
            return this;
        }
        public Builder ownerUserPrincipalName(@Nullable Output<String> ownerUserPrincipalName) {
            this.ownerUserPrincipalName = ownerUserPrincipalName;
            return this;
        }
        public Builder ownerUserPrincipalName(@Nullable String ownerUserPrincipalName) {
            this.ownerUserPrincipalName = Output.ofNullable(ownerUserPrincipalName);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }
        public Builder planId(@Nullable Output<String> planId) {
            this.planId = planId;
            return this;
        }
        public Builder planId(@Nullable String planId) {
            this.planId = Output.ofNullable(planId);
            return this;
        }
        public Builder scheduleParameters(@Nullable Output<List<ScheduleCreationParameterArgs>> scheduleParameters) {
            this.scheduleParameters = scheduleParameters;
            return this;
        }
        public Builder scheduleParameters(@Nullable List<ScheduleCreationParameterArgs> scheduleParameters) {
            this.scheduleParameters = Output.ofNullable(scheduleParameters);
            return this;
        }
        public Builder scheduleParameters(ScheduleCreationParameterArgs... scheduleParameters) {
            return scheduleParameters(List.of(scheduleParameters));
        }
        public Builder size(@Nullable Output<String> size) {
            this.size = size;
            return this;
        }
        public Builder size(@Nullable String size) {
            this.size = Output.ofNullable(size);
            return this;
        }
        public Builder sshKey(@Nullable Output<String> sshKey) {
            this.sshKey = sshKey;
            return this;
        }
        public Builder sshKey(@Nullable String sshKey) {
            this.sshKey = Output.ofNullable(sshKey);
            return this;
        }
        public Builder storageType(@Nullable Output<String> storageType) {
            this.storageType = storageType;
            return this;
        }
        public Builder storageType(@Nullable String storageType) {
            this.storageType = Output.ofNullable(storageType);
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
        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = Output.ofNullable(userName);
            return this;
        }        public LabVirtualMachineCreationParameterArgs build() {
            return new LabVirtualMachineCreationParameterArgs(allowClaim, artifacts, bulkCreationParameters, createdDate, customImageId, dataDiskParameters, disallowPublicIpAddress, environmentId, expirationDate, galleryImageReference, isAuthenticationWithSshKey, labSubnetName, labVirtualNetworkId, location, name, networkInterface, notes, ownerObjectId, ownerUserPrincipalName, password, planId, scheduleParameters, size, sshKey, storageType, tags, userName);
        }
    }
}
