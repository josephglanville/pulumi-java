// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.BillingProfileResponse;
import io.pulumi.azurenative.compute.outputs.DiagnosticsProfileResponse;
import io.pulumi.azurenative.compute.outputs.ScheduledEventsProfileResponse;
import io.pulumi.azurenative.compute.outputs.SecurityProfileResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetExtensionProfileResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetNetworkProfileResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetOSProfileResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetStorageProfileResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineScaleSetVMProfileResponse {
    /**
     * Specifies the billing related details of a Azure Spot VMSS. <br><br>Minimum api-version: 2019-03-01.
     * 
     */
    private final @Nullable BillingProfileResponse billingProfile;
    /**
     * Specifies the boot diagnostic settings state. <br><br>Minimum api-version: 2015-06-15.
     * 
     */
    private final @Nullable DiagnosticsProfileResponse diagnosticsProfile;
    /**
     * Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. <br><br>For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2019-03-01. <br><br>For Azure Spot scale sets, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     * 
     */
    private final @Nullable String evictionPolicy;
    /**
     * Specifies a collection of settings for extensions installed on virtual machines in the scale set.
     * 
     */
    private final @Nullable VirtualMachineScaleSetExtensionProfileResponse extensionProfile;
    /**
     * Specifies that the image or disk that is being used was licensed on-premises. <br><br> Possible values for Windows Server operating system are: <br><br> Windows_Client <br><br> Windows_Server <br><br> Possible values for Linux Server operating system are: <br><br> RHEL_BYOS (for RHEL) <br><br> SLES_BYOS (for SUSE) <br><br> For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) <br><br> [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) <br><br> Minimum api-version: 2015-06-15
     * 
     */
    private final @Nullable String licenseType;
    /**
     * Specifies properties of the network interfaces of the virtual machines in the scale set.
     * 
     */
    private final @Nullable VirtualMachineScaleSetNetworkProfileResponse networkProfile;
    /**
     * Specifies the operating system settings for the virtual machines in the scale set.
     * 
     */
    private final @Nullable VirtualMachineScaleSetOSProfileResponse osProfile;
    /**
     * Specifies the priority for the virtual machines in the scale set. <br><br>Minimum api-version: 2017-10-30-preview
     * 
     */
    private final @Nullable String priority;
    /**
     * Specifies Scheduled Event related configurations.
     * 
     */
    private final @Nullable ScheduledEventsProfileResponse scheduledEventsProfile;
    /**
     * Specifies the Security related profile settings for the virtual machines in the scale set.
     * 
     */
    private final @Nullable SecurityProfileResponse securityProfile;
    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    private final @Nullable VirtualMachineScaleSetStorageProfileResponse storageProfile;
    /**
     * UserData for the virtual machines in the scale set, which must be base-64 encoded. Customer should not pass any secrets in here. <br><br>Minimum api-version: 2021-03-01
     * 
     */
    private final @Nullable String userData;

    @CustomType.Constructor
    private VirtualMachineScaleSetVMProfileResponse(
        @CustomType.Parameter("billingProfile") @Nullable BillingProfileResponse billingProfile,
        @CustomType.Parameter("diagnosticsProfile") @Nullable DiagnosticsProfileResponse diagnosticsProfile,
        @CustomType.Parameter("evictionPolicy") @Nullable String evictionPolicy,
        @CustomType.Parameter("extensionProfile") @Nullable VirtualMachineScaleSetExtensionProfileResponse extensionProfile,
        @CustomType.Parameter("licenseType") @Nullable String licenseType,
        @CustomType.Parameter("networkProfile") @Nullable VirtualMachineScaleSetNetworkProfileResponse networkProfile,
        @CustomType.Parameter("osProfile") @Nullable VirtualMachineScaleSetOSProfileResponse osProfile,
        @CustomType.Parameter("priority") @Nullable String priority,
        @CustomType.Parameter("scheduledEventsProfile") @Nullable ScheduledEventsProfileResponse scheduledEventsProfile,
        @CustomType.Parameter("securityProfile") @Nullable SecurityProfileResponse securityProfile,
        @CustomType.Parameter("storageProfile") @Nullable VirtualMachineScaleSetStorageProfileResponse storageProfile,
        @CustomType.Parameter("userData") @Nullable String userData) {
        this.billingProfile = billingProfile;
        this.diagnosticsProfile = diagnosticsProfile;
        this.evictionPolicy = evictionPolicy;
        this.extensionProfile = extensionProfile;
        this.licenseType = licenseType;
        this.networkProfile = networkProfile;
        this.osProfile = osProfile;
        this.priority = priority;
        this.scheduledEventsProfile = scheduledEventsProfile;
        this.securityProfile = securityProfile;
        this.storageProfile = storageProfile;
        this.userData = userData;
    }

    /**
     * Specifies the billing related details of a Azure Spot VMSS. <br><br>Minimum api-version: 2019-03-01.
     * 
    */
    public Optional<BillingProfileResponse> getBillingProfile() {
        return Optional.ofNullable(this.billingProfile);
    }
    /**
     * Specifies the boot diagnostic settings state. <br><br>Minimum api-version: 2015-06-15.
     * 
    */
    public Optional<DiagnosticsProfileResponse> getDiagnosticsProfile() {
        return Optional.ofNullable(this.diagnosticsProfile);
    }
    /**
     * Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. <br><br>For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2019-03-01. <br><br>For Azure Spot scale sets, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     * 
    */
    public Optional<String> getEvictionPolicy() {
        return Optional.ofNullable(this.evictionPolicy);
    }
    /**
     * Specifies a collection of settings for extensions installed on virtual machines in the scale set.
     * 
    */
    public Optional<VirtualMachineScaleSetExtensionProfileResponse> getExtensionProfile() {
        return Optional.ofNullable(this.extensionProfile);
    }
    /**
     * Specifies that the image or disk that is being used was licensed on-premises. <br><br> Possible values for Windows Server operating system are: <br><br> Windows_Client <br><br> Windows_Server <br><br> Possible values for Linux Server operating system are: <br><br> RHEL_BYOS (for RHEL) <br><br> SLES_BYOS (for SUSE) <br><br> For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) <br><br> [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) <br><br> Minimum api-version: 2015-06-15
     * 
    */
    public Optional<String> getLicenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    /**
     * Specifies properties of the network interfaces of the virtual machines in the scale set.
     * 
    */
    public Optional<VirtualMachineScaleSetNetworkProfileResponse> getNetworkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    /**
     * Specifies the operating system settings for the virtual machines in the scale set.
     * 
    */
    public Optional<VirtualMachineScaleSetOSProfileResponse> getOsProfile() {
        return Optional.ofNullable(this.osProfile);
    }
    /**
     * Specifies the priority for the virtual machines in the scale set. <br><br>Minimum api-version: 2017-10-30-preview
     * 
    */
    public Optional<String> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * Specifies Scheduled Event related configurations.
     * 
    */
    public Optional<ScheduledEventsProfileResponse> getScheduledEventsProfile() {
        return Optional.ofNullable(this.scheduledEventsProfile);
    }
    /**
     * Specifies the Security related profile settings for the virtual machines in the scale set.
     * 
    */
    public Optional<SecurityProfileResponse> getSecurityProfile() {
        return Optional.ofNullable(this.securityProfile);
    }
    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
    */
    public Optional<VirtualMachineScaleSetStorageProfileResponse> getStorageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }
    /**
     * UserData for the virtual machines in the scale set, which must be base-64 encoded. Customer should not pass any secrets in here. <br><br>Minimum api-version: 2021-03-01
     * 
    */
    public Optional<String> getUserData() {
        return Optional.ofNullable(this.userData);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetVMProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BillingProfileResponse billingProfile;
        private @Nullable DiagnosticsProfileResponse diagnosticsProfile;
        private @Nullable String evictionPolicy;
        private @Nullable VirtualMachineScaleSetExtensionProfileResponse extensionProfile;
        private @Nullable String licenseType;
        private @Nullable VirtualMachineScaleSetNetworkProfileResponse networkProfile;
        private @Nullable VirtualMachineScaleSetOSProfileResponse osProfile;
        private @Nullable String priority;
        private @Nullable ScheduledEventsProfileResponse scheduledEventsProfile;
        private @Nullable SecurityProfileResponse securityProfile;
        private @Nullable VirtualMachineScaleSetStorageProfileResponse storageProfile;
        private @Nullable String userData;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetVMProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingProfile = defaults.billingProfile;
    	      this.diagnosticsProfile = defaults.diagnosticsProfile;
    	      this.evictionPolicy = defaults.evictionPolicy;
    	      this.extensionProfile = defaults.extensionProfile;
    	      this.licenseType = defaults.licenseType;
    	      this.networkProfile = defaults.networkProfile;
    	      this.osProfile = defaults.osProfile;
    	      this.priority = defaults.priority;
    	      this.scheduledEventsProfile = defaults.scheduledEventsProfile;
    	      this.securityProfile = defaults.securityProfile;
    	      this.storageProfile = defaults.storageProfile;
    	      this.userData = defaults.userData;
        }

        public Builder billingProfile(@Nullable BillingProfileResponse billingProfile) {
            this.billingProfile = billingProfile;
            return this;
        }
        public Builder diagnosticsProfile(@Nullable DiagnosticsProfileResponse diagnosticsProfile) {
            this.diagnosticsProfile = diagnosticsProfile;
            return this;
        }
        public Builder evictionPolicy(@Nullable String evictionPolicy) {
            this.evictionPolicy = evictionPolicy;
            return this;
        }
        public Builder extensionProfile(@Nullable VirtualMachineScaleSetExtensionProfileResponse extensionProfile) {
            this.extensionProfile = extensionProfile;
            return this;
        }
        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder networkProfile(@Nullable VirtualMachineScaleSetNetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }
        public Builder osProfile(@Nullable VirtualMachineScaleSetOSProfileResponse osProfile) {
            this.osProfile = osProfile;
            return this;
        }
        public Builder priority(@Nullable String priority) {
            this.priority = priority;
            return this;
        }
        public Builder scheduledEventsProfile(@Nullable ScheduledEventsProfileResponse scheduledEventsProfile) {
            this.scheduledEventsProfile = scheduledEventsProfile;
            return this;
        }
        public Builder securityProfile(@Nullable SecurityProfileResponse securityProfile) {
            this.securityProfile = securityProfile;
            return this;
        }
        public Builder storageProfile(@Nullable VirtualMachineScaleSetStorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }
        public Builder userData(@Nullable String userData) {
            this.userData = userData;
            return this;
        }        public VirtualMachineScaleSetVMProfileResponse build() {
            return new VirtualMachineScaleSetVMProfileResponse(billingProfile, diagnosticsProfile, evictionPolicy, extensionProfile, licenseType, networkProfile, osProfile, priority, scheduledEventsProfile, securityProfile, storageProfile, userData);
        }
    }
}
