// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VMSSExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VMSSExtensionArgs Empty = new VMSSExtensionArgs();

    @InputImport(name="autoUpgradeMinorVersion")
    private final @Nullable Input<Boolean> autoUpgradeMinorVersion;

    public Input<Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion == null ? Input.empty() : this.autoUpgradeMinorVersion;
    }

    @InputImport(name="forceUpdateTag")
    private final @Nullable Input<String> forceUpdateTag;

    public Input<String> getForceUpdateTag() {
        return this.forceUpdateTag == null ? Input.empty() : this.forceUpdateTag;
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

    @InputImport(name="provisionAfterExtensions")
    private final @Nullable Input<List<String>> provisionAfterExtensions;

    public Input<List<String>> getProvisionAfterExtensions() {
        return this.provisionAfterExtensions == null ? Input.empty() : this.provisionAfterExtensions;
    }

    @InputImport(name="publisher", required=true)
    private final Input<String> publisher;

    public Input<String> getPublisher() {
        return this.publisher;
    }

    @InputImport(name="settings")
    private final @Nullable Input<Object> settings;

    public Input<Object> getSettings() {
        return this.settings == null ? Input.empty() : this.settings;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    @InputImport(name="typeHandlerVersion", required=true)
    private final Input<String> typeHandlerVersion;

    public Input<String> getTypeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    public VMSSExtensionArgs(
        @Nullable Input<Boolean> autoUpgradeMinorVersion,
        @Nullable Input<String> forceUpdateTag,
        Input<String> name,
        @Nullable Input<Object> protectedSettings,
        @Nullable Input<List<String>> provisionAfterExtensions,
        Input<String> publisher,
        @Nullable Input<Object> settings,
        Input<String> type,
        Input<String> typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.forceUpdateTag = forceUpdateTag;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.protectedSettings = protectedSettings;
        this.provisionAfterExtensions = provisionAfterExtensions;
        this.publisher = Objects.requireNonNull(publisher, "expected parameter 'publisher' to be non-null");
        this.settings = settings;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.typeHandlerVersion = Objects.requireNonNull(typeHandlerVersion, "expected parameter 'typeHandlerVersion' to be non-null");
    }

    private VMSSExtensionArgs() {
        this.autoUpgradeMinorVersion = Input.empty();
        this.forceUpdateTag = Input.empty();
        this.name = Input.empty();
        this.protectedSettings = Input.empty();
        this.provisionAfterExtensions = Input.empty();
        this.publisher = Input.empty();
        this.settings = Input.empty();
        this.type = Input.empty();
        this.typeHandlerVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMSSExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoUpgradeMinorVersion;
        private @Nullable Input<String> forceUpdateTag;
        private Input<String> name;
        private @Nullable Input<Object> protectedSettings;
        private @Nullable Input<List<String>> provisionAfterExtensions;
        private Input<String> publisher;
        private @Nullable Input<Object> settings;
        private Input<String> type;
        private Input<String> typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VMSSExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.provisionAfterExtensions = defaults.provisionAfterExtensions;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
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

        public Builder setForceUpdateTag(@Nullable Input<String> forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder setForceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = Input.ofNullable(forceUpdateTag);
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

        public Builder setProvisionAfterExtensions(@Nullable Input<List<String>> provisionAfterExtensions) {
            this.provisionAfterExtensions = provisionAfterExtensions;
            return this;
        }

        public Builder setProvisionAfterExtensions(@Nullable List<String> provisionAfterExtensions) {
            this.provisionAfterExtensions = Input.ofNullable(provisionAfterExtensions);
            return this;
        }

        public Builder setPublisher(Input<String> publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = Input.of(Objects.requireNonNull(publisher));
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

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setTypeHandlerVersion(Input<String> typeHandlerVersion) {
            this.typeHandlerVersion = Objects.requireNonNull(typeHandlerVersion);
            return this;
        }

        public Builder setTypeHandlerVersion(String typeHandlerVersion) {
            this.typeHandlerVersion = Input.of(Objects.requireNonNull(typeHandlerVersion));
            return this;
        }

        public VMSSExtensionArgs build() {
            return new VMSSExtensionArgs(autoUpgradeMinorVersion, forceUpdateTag, name, protectedSettings, provisionAfterExtensions, publisher, settings, type, typeHandlerVersion);
        }
    }
}
