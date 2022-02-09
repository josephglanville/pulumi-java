// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple;

import io.pulumi.azurenative.vmwarecloudsimple.inputs.GuestOSCustomizationArgs;
import io.pulumi.azurenative.vmwarecloudsimple.inputs.ResourcePoolArgs;
import io.pulumi.azurenative.vmwarecloudsimple.inputs.VirtualDiskArgs;
import io.pulumi.azurenative.vmwarecloudsimple.inputs.VirtualNicArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachineArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineArgs Empty = new VirtualMachineArgs();

    @InputImport(name="amountOfRam", required=true)
    private final Input<Integer> amountOfRam;

    public Input<Integer> getAmountOfRam() {
        return this.amountOfRam;
    }

    @InputImport(name="customization")
    private final @Nullable Input<GuestOSCustomizationArgs> customization;

    public Input<GuestOSCustomizationArgs> getCustomization() {
        return this.customization == null ? Input.empty() : this.customization;
    }

    @InputImport(name="disks")
    private final @Nullable Input<List<VirtualDiskArgs>> disks;

    public Input<List<VirtualDiskArgs>> getDisks() {
        return this.disks == null ? Input.empty() : this.disks;
    }

    @InputImport(name="exposeToGuestVM")
    private final @Nullable Input<Boolean> exposeToGuestVM;

    public Input<Boolean> getExposeToGuestVM() {
        return this.exposeToGuestVM == null ? Input.empty() : this.exposeToGuestVM;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="nics")
    private final @Nullable Input<List<VirtualNicArgs>> nics;

    public Input<List<VirtualNicArgs>> getNics() {
        return this.nics == null ? Input.empty() : this.nics;
    }

    @InputImport(name="numberOfCores", required=true)
    private final Input<Integer> numberOfCores;

    public Input<Integer> getNumberOfCores() {
        return this.numberOfCores;
    }

    @InputImport(name="password")
    private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    @InputImport(name="privateCloudId", required=true)
    private final Input<String> privateCloudId;

    public Input<String> getPrivateCloudId() {
        return this.privateCloudId;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourcePool")
    private final @Nullable Input<ResourcePoolArgs> resourcePool;

    public Input<ResourcePoolArgs> getResourcePool() {
        return this.resourcePool == null ? Input.empty() : this.resourcePool;
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

    @InputImport(name="username")
    private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    @InputImport(name="vSphereNetworks")
    private final @Nullable Input<List<String>> vSphereNetworks;

    public Input<List<String>> getVSphereNetworks() {
        return this.vSphereNetworks == null ? Input.empty() : this.vSphereNetworks;
    }

    @InputImport(name="virtualMachineName")
    private final @Nullable Input<String> virtualMachineName;

    public Input<String> getVirtualMachineName() {
        return this.virtualMachineName == null ? Input.empty() : this.virtualMachineName;
    }

    public VirtualMachineArgs(
        Input<Integer> amountOfRam,
        @Nullable Input<GuestOSCustomizationArgs> customization,
        @Nullable Input<List<VirtualDiskArgs>> disks,
        @Nullable Input<Boolean> exposeToGuestVM,
        @Nullable Input<String> location,
        @Nullable Input<List<VirtualNicArgs>> nics,
        Input<Integer> numberOfCores,
        @Nullable Input<String> password,
        Input<String> privateCloudId,
        Input<String> resourceGroupName,
        @Nullable Input<ResourcePoolArgs> resourcePool,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> templateId,
        @Nullable Input<String> username,
        @Nullable Input<List<String>> vSphereNetworks,
        @Nullable Input<String> virtualMachineName) {
        this.amountOfRam = Objects.requireNonNull(amountOfRam, "expected parameter 'amountOfRam' to be non-null");
        this.customization = customization;
        this.disks = disks;
        this.exposeToGuestVM = exposeToGuestVM;
        this.location = location;
        this.nics = nics;
        this.numberOfCores = Objects.requireNonNull(numberOfCores, "expected parameter 'numberOfCores' to be non-null");
        this.password = password;
        this.privateCloudId = Objects.requireNonNull(privateCloudId, "expected parameter 'privateCloudId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourcePool = resourcePool;
        this.tags = tags;
        this.templateId = templateId;
        this.username = username;
        this.vSphereNetworks = vSphereNetworks;
        this.virtualMachineName = virtualMachineName;
    }

    private VirtualMachineArgs() {
        this.amountOfRam = Input.empty();
        this.customization = Input.empty();
        this.disks = Input.empty();
        this.exposeToGuestVM = Input.empty();
        this.location = Input.empty();
        this.nics = Input.empty();
        this.numberOfCores = Input.empty();
        this.password = Input.empty();
        this.privateCloudId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourcePool = Input.empty();
        this.tags = Input.empty();
        this.templateId = Input.empty();
        this.username = Input.empty();
        this.vSphereNetworks = Input.empty();
        this.virtualMachineName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> amountOfRam;
        private @Nullable Input<GuestOSCustomizationArgs> customization;
        private @Nullable Input<List<VirtualDiskArgs>> disks;
        private @Nullable Input<Boolean> exposeToGuestVM;
        private @Nullable Input<String> location;
        private @Nullable Input<List<VirtualNicArgs>> nics;
        private Input<Integer> numberOfCores;
        private @Nullable Input<String> password;
        private Input<String> privateCloudId;
        private Input<String> resourceGroupName;
        private @Nullable Input<ResourcePoolArgs> resourcePool;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> templateId;
        private @Nullable Input<String> username;
        private @Nullable Input<List<String>> vSphereNetworks;
        private @Nullable Input<String> virtualMachineName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amountOfRam = defaults.amountOfRam;
    	      this.customization = defaults.customization;
    	      this.disks = defaults.disks;
    	      this.exposeToGuestVM = defaults.exposeToGuestVM;
    	      this.location = defaults.location;
    	      this.nics = defaults.nics;
    	      this.numberOfCores = defaults.numberOfCores;
    	      this.password = defaults.password;
    	      this.privateCloudId = defaults.privateCloudId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourcePool = defaults.resourcePool;
    	      this.tags = defaults.tags;
    	      this.templateId = defaults.templateId;
    	      this.username = defaults.username;
    	      this.vSphereNetworks = defaults.vSphereNetworks;
    	      this.virtualMachineName = defaults.virtualMachineName;
        }

        public Builder setAmountOfRam(Input<Integer> amountOfRam) {
            this.amountOfRam = Objects.requireNonNull(amountOfRam);
            return this;
        }

        public Builder setAmountOfRam(Integer amountOfRam) {
            this.amountOfRam = Input.of(Objects.requireNonNull(amountOfRam));
            return this;
        }

        public Builder setCustomization(@Nullable Input<GuestOSCustomizationArgs> customization) {
            this.customization = customization;
            return this;
        }

        public Builder setCustomization(@Nullable GuestOSCustomizationArgs customization) {
            this.customization = Input.ofNullable(customization);
            return this;
        }

        public Builder setDisks(@Nullable Input<List<VirtualDiskArgs>> disks) {
            this.disks = disks;
            return this;
        }

        public Builder setDisks(@Nullable List<VirtualDiskArgs> disks) {
            this.disks = Input.ofNullable(disks);
            return this;
        }

        public Builder setExposeToGuestVM(@Nullable Input<Boolean> exposeToGuestVM) {
            this.exposeToGuestVM = exposeToGuestVM;
            return this;
        }

        public Builder setExposeToGuestVM(@Nullable Boolean exposeToGuestVM) {
            this.exposeToGuestVM = Input.ofNullable(exposeToGuestVM);
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

        public Builder setNics(@Nullable Input<List<VirtualNicArgs>> nics) {
            this.nics = nics;
            return this;
        }

        public Builder setNics(@Nullable List<VirtualNicArgs> nics) {
            this.nics = Input.ofNullable(nics);
            return this;
        }

        public Builder setNumberOfCores(Input<Integer> numberOfCores) {
            this.numberOfCores = Objects.requireNonNull(numberOfCores);
            return this;
        }

        public Builder setNumberOfCores(Integer numberOfCores) {
            this.numberOfCores = Input.of(Objects.requireNonNull(numberOfCores));
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setPrivateCloudId(Input<String> privateCloudId) {
            this.privateCloudId = Objects.requireNonNull(privateCloudId);
            return this;
        }

        public Builder setPrivateCloudId(String privateCloudId) {
            this.privateCloudId = Input.of(Objects.requireNonNull(privateCloudId));
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

        public Builder setResourcePool(@Nullable Input<ResourcePoolArgs> resourcePool) {
            this.resourcePool = resourcePool;
            return this;
        }

        public Builder setResourcePool(@Nullable ResourcePoolArgs resourcePool) {
            this.resourcePool = Input.ofNullable(resourcePool);
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

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }

        public Builder setVSphereNetworks(@Nullable Input<List<String>> vSphereNetworks) {
            this.vSphereNetworks = vSphereNetworks;
            return this;
        }

        public Builder setVSphereNetworks(@Nullable List<String> vSphereNetworks) {
            this.vSphereNetworks = Input.ofNullable(vSphereNetworks);
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
            return new VirtualMachineArgs(amountOfRam, customization, disks, exposeToGuestVM, location, nics, numberOfCores, password, privateCloudId, resourceGroupName, resourcePool, tags, templateId, username, vSphereNetworks, virtualMachineName);
        }
    }
}
