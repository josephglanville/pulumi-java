// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.outputs;

import io.pulumi.azurenative.hybridcompute.outputs.MachineExtensionPropertiesResponseInstanceView;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMachineExtensionResult {
    private final @Nullable Boolean autoUpgradeMinorVersion;
    private final @Nullable String forceUpdateTag;
    private final String id;
    private final @Nullable MachineExtensionPropertiesResponseInstanceView instanceView;
    private final String location;
    private final String name;
    private final @Nullable Object protectedSettings;
    private final String provisioningState;
    private final @Nullable String publisher;
    private final @Nullable Object settings;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable String typeHandlerVersion;

    @OutputCustomType.Constructor({"autoUpgradeMinorVersion","forceUpdateTag","id","instanceView","location","name","protectedSettings","provisioningState","publisher","settings","tags","type","typeHandlerVersion"})
    private GetMachineExtensionResult(
        @Nullable Boolean autoUpgradeMinorVersion,
        @Nullable String forceUpdateTag,
        String id,
        @Nullable MachineExtensionPropertiesResponseInstanceView instanceView,
        String location,
        String name,
        @Nullable Object protectedSettings,
        String provisioningState,
        @Nullable String publisher,
        @Nullable Object settings,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable String typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.forceUpdateTag = forceUpdateTag;
        this.id = Objects.requireNonNull(id);
        this.instanceView = instanceView;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.protectedSettings = protectedSettings;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publisher = publisher;
        this.settings = settings;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.typeHandlerVersion = typeHandlerVersion;
    }

    public Optional<Boolean> getAutoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }
    public Optional<String> getForceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }
    public String getId() {
        return this.id;
    }
    public Optional<MachineExtensionPropertiesResponseInstanceView> getInstanceView() {
        return Optional.ofNullable(this.instanceView);
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public Optional<Object> getProtectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getPublisher() {
        return Optional.ofNullable(this.publisher);
    }
    public Optional<Object> getSettings() {
        return Optional.ofNullable(this.settings);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getTypeHandlerVersion() {
        return Optional.ofNullable(this.typeHandlerVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMachineExtensionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoUpgradeMinorVersion;
        private @Nullable String forceUpdateTag;
        private String id;
        private @Nullable MachineExtensionPropertiesResponseInstanceView instanceView;
        private String location;
        private String name;
        private @Nullable Object protectedSettings;
        private String provisioningState;
        private @Nullable String publisher;
        private @Nullable Object settings;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMachineExtensionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.id = defaults.id;
    	      this.instanceView = defaults.instanceView;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder setForceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceView(@Nullable MachineExtensionPropertiesResponseInstanceView instanceView) {
            this.instanceView = instanceView;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProtectedSettings(@Nullable Object protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setSettings(@Nullable Object settings) {
            this.settings = settings;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setTypeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        public GetMachineExtensionResult build() {
            return new GetMachineExtensionResult(autoUpgradeMinorVersion, forceUpdateTag, id, instanceView, location, name, protectedSettings, provisioningState, publisher, settings, tags, type, typeHandlerVersion);
        }
    }
}
