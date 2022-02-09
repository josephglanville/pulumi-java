// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.inputs.VirtualMachineExtensionInstanceViewArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachineExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineExtensionArgs Empty = new VirtualMachineExtensionArgs();

    @InputImport(name="autoUpgradeMinorVersion")
    private final @Nullable Input<Boolean> autoUpgradeMinorVersion;

    public Input<Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion == null ? Input.empty() : this.autoUpgradeMinorVersion;
    }

    @InputImport(name="enableAutomaticUpgrade")
    private final @Nullable Input<Boolean> enableAutomaticUpgrade;

    public Input<Boolean> getEnableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade == null ? Input.empty() : this.enableAutomaticUpgrade;
    }

    @InputImport(name="forceUpdateTag")
    private final @Nullable Input<String> forceUpdateTag;

    public Input<String> getForceUpdateTag() {
        return this.forceUpdateTag == null ? Input.empty() : this.forceUpdateTag;
    }

    @InputImport(name="instanceView")
    private final @Nullable Input<VirtualMachineExtensionInstanceViewArgs> instanceView;

    public Input<VirtualMachineExtensionInstanceViewArgs> getInstanceView() {
        return this.instanceView == null ? Input.empty() : this.instanceView;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="protectedSettings")
    private final @Nullable Input<Object> protectedSettings;

    public Input<Object> getProtectedSettings() {
        return this.protectedSettings == null ? Input.empty() : this.protectedSettings;
    }

    @InputImport(name="publisher")
    private final @Nullable Input<String> publisher;

    public Input<String> getPublisher() {
        return this.publisher == null ? Input.empty() : this.publisher;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="settings")
    private final @Nullable Input<Object> settings;

    public Input<Object> getSettings() {
        return this.settings == null ? Input.empty() : this.settings;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="typeHandlerVersion")
    private final @Nullable Input<String> typeHandlerVersion;

    public Input<String> getTypeHandlerVersion() {
        return this.typeHandlerVersion == null ? Input.empty() : this.typeHandlerVersion;
    }

    @InputImport(name="vmExtensionName")
    private final @Nullable Input<String> vmExtensionName;

    public Input<String> getVmExtensionName() {
        return this.vmExtensionName == null ? Input.empty() : this.vmExtensionName;
    }

    @InputImport(name="vmName", required=true)
    private final Input<String> vmName;

    public Input<String> getVmName() {
        return this.vmName;
    }

    public VirtualMachineExtensionArgs(
        @Nullable Input<Boolean> autoUpgradeMinorVersion,
        @Nullable Input<Boolean> enableAutomaticUpgrade,
        @Nullable Input<String> forceUpdateTag,
        @Nullable Input<VirtualMachineExtensionInstanceViewArgs> instanceView,
        @Nullable Input<String> location,
        @Nullable Input<Object> protectedSettings,
        @Nullable Input<String> publisher,
        Input<String> resourceGroupName,
        @Nullable Input<Object> settings,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> type,
        @Nullable Input<String> typeHandlerVersion,
        @Nullable Input<String> vmExtensionName,
        Input<String> vmName) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        this.forceUpdateTag = forceUpdateTag;
        this.instanceView = instanceView;
        this.location = location;
        this.protectedSettings = protectedSettings;
        this.publisher = publisher;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.settings = settings;
        this.tags = tags;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
        this.vmExtensionName = vmExtensionName;
        this.vmName = Objects.requireNonNull(vmName, "expected parameter 'vmName' to be non-null");
    }

    private VirtualMachineExtensionArgs() {
        this.autoUpgradeMinorVersion = Input.empty();
        this.enableAutomaticUpgrade = Input.empty();
        this.forceUpdateTag = Input.empty();
        this.instanceView = Input.empty();
        this.location = Input.empty();
        this.protectedSettings = Input.empty();
        this.publisher = Input.empty();
        this.resourceGroupName = Input.empty();
        this.settings = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
        this.typeHandlerVersion = Input.empty();
        this.vmExtensionName = Input.empty();
        this.vmName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoUpgradeMinorVersion;
        private @Nullable Input<Boolean> enableAutomaticUpgrade;
        private @Nullable Input<String> forceUpdateTag;
        private @Nullable Input<VirtualMachineExtensionInstanceViewArgs> instanceView;
        private @Nullable Input<String> location;
        private @Nullable Input<Object> protectedSettings;
        private @Nullable Input<String> publisher;
        private Input<String> resourceGroupName;
        private @Nullable Input<Object> settings;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> type;
        private @Nullable Input<String> typeHandlerVersion;
        private @Nullable Input<String> vmExtensionName;
        private Input<String> vmName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.enableAutomaticUpgrade = defaults.enableAutomaticUpgrade;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.instanceView = defaults.instanceView;
    	      this.location = defaults.location;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.publisher = defaults.publisher;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.settings = defaults.settings;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
    	      this.vmExtensionName = defaults.vmExtensionName;
    	      this.vmName = defaults.vmName;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Input<Boolean> autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = Input.ofNullable(autoUpgradeMinorVersion);
            return this;
        }

        public Builder setEnableAutomaticUpgrade(@Nullable Input<Boolean> enableAutomaticUpgrade) {
            this.enableAutomaticUpgrade = enableAutomaticUpgrade;
            return this;
        }

        public Builder setEnableAutomaticUpgrade(@Nullable Boolean enableAutomaticUpgrade) {
            this.enableAutomaticUpgrade = Input.ofNullable(enableAutomaticUpgrade);
            return this;
        }

        public Builder setForceUpdateTag(@Nullable Input<String> forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder setForceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = Input.ofNullable(forceUpdateTag);
            return this;
        }

        public Builder setInstanceView(@Nullable Input<VirtualMachineExtensionInstanceViewArgs> instanceView) {
            this.instanceView = instanceView;
            return this;
        }

        public Builder setInstanceView(@Nullable VirtualMachineExtensionInstanceViewArgs instanceView) {
            this.instanceView = Input.ofNullable(instanceView);
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

        public Builder setProtectedSettings(@Nullable Input<Object> protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }

        public Builder setProtectedSettings(@Nullable Object protectedSettings) {
            this.protectedSettings = Input.ofNullable(protectedSettings);
            return this;
        }

        public Builder setPublisher(@Nullable Input<String> publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = Input.ofNullable(publisher);
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

        public Builder setSettings(@Nullable Input<Object> settings) {
            this.settings = settings;
            return this;
        }

        public Builder setSettings(@Nullable Object settings) {
            this.settings = Input.ofNullable(settings);
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

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setTypeHandlerVersion(@Nullable Input<String> typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        public Builder setTypeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = Input.ofNullable(typeHandlerVersion);
            return this;
        }

        public Builder setVmExtensionName(@Nullable Input<String> vmExtensionName) {
            this.vmExtensionName = vmExtensionName;
            return this;
        }

        public Builder setVmExtensionName(@Nullable String vmExtensionName) {
            this.vmExtensionName = Input.ofNullable(vmExtensionName);
            return this;
        }

        public Builder setVmName(Input<String> vmName) {
            this.vmName = Objects.requireNonNull(vmName);
            return this;
        }

        public Builder setVmName(String vmName) {
            this.vmName = Input.of(Objects.requireNonNull(vmName));
            return this;
        }

        public VirtualMachineExtensionArgs build() {
            return new VirtualMachineExtensionArgs(autoUpgradeMinorVersion, enableAutomaticUpgrade, forceUpdateTag, instanceView, location, protectedSettings, publisher, resourceGroupName, settings, tags, type, typeHandlerVersion, vmExtensionName, vmName);
        }
    }
}
