// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineExtensionArgs Empty = new MachineExtensionArgs();

    @InputImport(name="autoUpgradeMinorVersion")
    private final @Nullable Input<Boolean> autoUpgradeMinorVersion;

    public Input<Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion == null ? Input.empty() : this.autoUpgradeMinorVersion;
    }

    @InputImport(name="extensionName")
    private final @Nullable Input<String> extensionName;

    public Input<String> getExtensionName() {
        return this.extensionName == null ? Input.empty() : this.extensionName;
    }

    @InputImport(name="forceUpdateTag")
    private final @Nullable Input<String> forceUpdateTag;

    public Input<String> getForceUpdateTag() {
        return this.forceUpdateTag == null ? Input.empty() : this.forceUpdateTag;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
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

    public MachineExtensionArgs(
        @Nullable Input<Boolean> autoUpgradeMinorVersion,
        @Nullable Input<String> extensionName,
        @Nullable Input<String> forceUpdateTag,
        @Nullable Input<String> location,
        Input<String> name,
        @Nullable Input<Object> protectedSettings,
        @Nullable Input<String> publisher,
        Input<String> resourceGroupName,
        @Nullable Input<Object> settings,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> type,
        @Nullable Input<String> typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.extensionName = extensionName;
        this.forceUpdateTag = forceUpdateTag;
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.protectedSettings = protectedSettings;
        this.publisher = publisher;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.settings = settings;
        this.tags = tags;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    private MachineExtensionArgs() {
        this.autoUpgradeMinorVersion = Input.empty();
        this.extensionName = Input.empty();
        this.forceUpdateTag = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.protectedSettings = Input.empty();
        this.publisher = Input.empty();
        this.resourceGroupName = Input.empty();
        this.settings = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
        this.typeHandlerVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoUpgradeMinorVersion;
        private @Nullable Input<String> extensionName;
        private @Nullable Input<String> forceUpdateTag;
        private @Nullable Input<String> location;
        private Input<String> name;
        private @Nullable Input<Object> protectedSettings;
        private @Nullable Input<String> publisher;
        private Input<String> resourceGroupName;
        private @Nullable Input<Object> settings;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> type;
        private @Nullable Input<String> typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.extensionName = defaults.extensionName;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.publisher = defaults.publisher;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.settings = defaults.settings;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Input<Boolean> autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = Input.ofNullable(autoUpgradeMinorVersion);
            return this;
        }

        public Builder setExtensionName(@Nullable Input<String> extensionName) {
            this.extensionName = extensionName;
            return this;
        }

        public Builder setExtensionName(@Nullable String extensionName) {
            this.extensionName = Input.ofNullable(extensionName);
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

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
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

        public MachineExtensionArgs build() {
            return new MachineExtensionArgs(autoUpgradeMinorVersion, extensionName, forceUpdateTag, location, name, protectedSettings, publisher, resourceGroupName, settings, tags, type, typeHandlerVersion);
        }
    }
}
