// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a Virtual Machine Scale Set Extension.
 * 
 */
public final class VirtualMachineScaleSetExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetExtensionArgs Empty = new VirtualMachineScaleSetExtensionArgs();

    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    @Import(name="autoUpgradeMinorVersion")
      private final @Nullable Output<Boolean> autoUpgradeMinorVersion;

    public Output<Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion == null ? Output.empty() : this.autoUpgradeMinorVersion;
    }

    /**
     * Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available.
     * 
     */
    @Import(name="enableAutomaticUpgrade")
      private final @Nullable Output<Boolean> enableAutomaticUpgrade;

    public Output<Boolean> getEnableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade == null ? Output.empty() : this.enableAutomaticUpgrade;
    }

    /**
     * If a value is provided and is different from the previous value, the extension handler will be forced to update even if the extension configuration has not changed.
     * 
     */
    @Import(name="forceUpdateTag")
      private final @Nullable Output<String> forceUpdateTag;

    public Output<String> getForceUpdateTag() {
        return this.forceUpdateTag == null ? Output.empty() : this.forceUpdateTag;
    }

    /**
     * The name of the extension.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    @Import(name="protectedSettings")
      private final @Nullable Output<Object> protectedSettings;

    public Output<Object> getProtectedSettings() {
        return this.protectedSettings == null ? Output.empty() : this.protectedSettings;
    }

    /**
     * Collection of extension names after which this extension needs to be provisioned.
     * 
     */
    @Import(name="provisionAfterExtensions")
      private final @Nullable Output<List<String>> provisionAfterExtensions;

    public Output<List<String>> getProvisionAfterExtensions() {
        return this.provisionAfterExtensions == null ? Output.empty() : this.provisionAfterExtensions;
    }

    /**
     * The name of the extension handler publisher.
     * 
     */
    @Import(name="publisher")
      private final @Nullable Output<String> publisher;

    public Output<String> getPublisher() {
        return this.publisher == null ? Output.empty() : this.publisher;
    }

    /**
     * Json formatted public settings for the extension.
     * 
     */
    @Import(name="settings")
      private final @Nullable Output<Object> settings;

    public Output<Object> getSettings() {
        return this.settings == null ? Output.empty() : this.settings;
    }

    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * Specifies the version of the script handler.
     * 
     */
    @Import(name="typeHandlerVersion")
      private final @Nullable Output<String> typeHandlerVersion;

    public Output<String> getTypeHandlerVersion() {
        return this.typeHandlerVersion == null ? Output.empty() : this.typeHandlerVersion;
    }

    public VirtualMachineScaleSetExtensionArgs(
        @Nullable Output<Boolean> autoUpgradeMinorVersion,
        @Nullable Output<Boolean> enableAutomaticUpgrade,
        @Nullable Output<String> forceUpdateTag,
        @Nullable Output<String> name,
        @Nullable Output<Object> protectedSettings,
        @Nullable Output<List<String>> provisionAfterExtensions,
        @Nullable Output<String> publisher,
        @Nullable Output<Object> settings,
        @Nullable Output<String> type,
        @Nullable Output<String> typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        this.forceUpdateTag = forceUpdateTag;
        this.name = name;
        this.protectedSettings = protectedSettings;
        this.provisionAfterExtensions = provisionAfterExtensions;
        this.publisher = publisher;
        this.settings = settings;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    private VirtualMachineScaleSetExtensionArgs() {
        this.autoUpgradeMinorVersion = Output.empty();
        this.enableAutomaticUpgrade = Output.empty();
        this.forceUpdateTag = Output.empty();
        this.name = Output.empty();
        this.protectedSettings = Output.empty();
        this.provisionAfterExtensions = Output.empty();
        this.publisher = Output.empty();
        this.settings = Output.empty();
        this.type = Output.empty();
        this.typeHandlerVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoUpgradeMinorVersion;
        private @Nullable Output<Boolean> enableAutomaticUpgrade;
        private @Nullable Output<String> forceUpdateTag;
        private @Nullable Output<String> name;
        private @Nullable Output<Object> protectedSettings;
        private @Nullable Output<List<String>> provisionAfterExtensions;
        private @Nullable Output<String> publisher;
        private @Nullable Output<Object> settings;
        private @Nullable Output<String> type;
        private @Nullable Output<String> typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.enableAutomaticUpgrade = defaults.enableAutomaticUpgrade;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.provisionAfterExtensions = defaults.provisionAfterExtensions;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder autoUpgradeMinorVersion(@Nullable Output<Boolean> autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }
        public Builder autoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = Output.ofNullable(autoUpgradeMinorVersion);
            return this;
        }
        public Builder enableAutomaticUpgrade(@Nullable Output<Boolean> enableAutomaticUpgrade) {
            this.enableAutomaticUpgrade = enableAutomaticUpgrade;
            return this;
        }
        public Builder enableAutomaticUpgrade(@Nullable Boolean enableAutomaticUpgrade) {
            this.enableAutomaticUpgrade = Output.ofNullable(enableAutomaticUpgrade);
            return this;
        }
        public Builder forceUpdateTag(@Nullable Output<String> forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }
        public Builder forceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = Output.ofNullable(forceUpdateTag);
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
        public Builder protectedSettings(@Nullable Output<Object> protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }
        public Builder protectedSettings(@Nullable Object protectedSettings) {
            this.protectedSettings = Output.ofNullable(protectedSettings);
            return this;
        }
        public Builder provisionAfterExtensions(@Nullable Output<List<String>> provisionAfterExtensions) {
            this.provisionAfterExtensions = provisionAfterExtensions;
            return this;
        }
        public Builder provisionAfterExtensions(@Nullable List<String> provisionAfterExtensions) {
            this.provisionAfterExtensions = Output.ofNullable(provisionAfterExtensions);
            return this;
        }
        public Builder provisionAfterExtensions(String... provisionAfterExtensions) {
            return provisionAfterExtensions(List.of(provisionAfterExtensions));
        }
        public Builder publisher(@Nullable Output<String> publisher) {
            this.publisher = publisher;
            return this;
        }
        public Builder publisher(@Nullable String publisher) {
            this.publisher = Output.ofNullable(publisher);
            return this;
        }
        public Builder settings(@Nullable Output<Object> settings) {
            this.settings = settings;
            return this;
        }
        public Builder settings(@Nullable Object settings) {
            this.settings = Output.ofNullable(settings);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public Builder typeHandlerVersion(@Nullable Output<String> typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }
        public Builder typeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = Output.ofNullable(typeHandlerVersion);
            return this;
        }        public VirtualMachineScaleSetExtensionArgs build() {
            return new VirtualMachineScaleSetExtensionArgs(autoUpgradeMinorVersion, enableAutomaticUpgrade, forceUpdateTag, name, protectedSettings, provisionAfterExtensions, publisher, settings, type, typeHandlerVersion);
        }
    }
}
