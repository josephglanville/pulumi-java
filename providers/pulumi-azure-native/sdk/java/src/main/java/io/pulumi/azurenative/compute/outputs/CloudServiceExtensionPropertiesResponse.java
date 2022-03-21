// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.CloudServiceVaultAndSecretReferenceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudServiceExtensionPropertiesResponse {
    /**
     * Explicitly specify whether platform can automatically upgrade typeHandlerVersion to higher minor versions when they become available.
     * 
     */
    private final @Nullable Boolean autoUpgradeMinorVersion;
    /**
     * Tag to force apply the provided public and protected settings.
     * Changing the tag value allows for re-running the extension without changing any of the public or protected settings.
     * If forceUpdateTag is not changed, updates to public or protected settings would still be applied by the handler.
     * If neither forceUpdateTag nor any of public or protected settings change, extension would flow to the role instance with the same sequence-number, and
     * it is up to handler implementation whether to re-run it or not
     * 
     */
    private final @Nullable String forceUpdateTag;
    /**
     * Protected settings for the extension which are encrypted before sent to the role instance.
     * 
     */
    private final @Nullable String protectedSettings;
    private final @Nullable CloudServiceVaultAndSecretReferenceResponse protectedSettingsFromKeyVault;
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * The name of the extension handler publisher.
     * 
     */
    private final @Nullable String publisher;
    /**
     * Optional list of roles to apply this extension. If property is not specified or '*' is specified, extension is applied to all roles in the cloud service.
     * 
     */
    private final @Nullable List<String> rolesAppliedTo;
    /**
     * Public settings for the extension. For JSON extensions, this is the JSON settings for the extension. For XML Extension (like RDP), this is the XML setting for the extension.
     * 
     */
    private final @Nullable String settings;
    /**
     * Specifies the type of the extension.
     * 
     */
    private final @Nullable String type;
    /**
     * Specifies the version of the extension. Specifies the version of the extension. If this element is not specified or an asterisk (*) is used as the value, the latest version of the extension is used. If the value is specified with a major version number and an asterisk as the minor version number (X.), the latest minor version of the specified major version is selected. If a major version number and a minor version number are specified (X.Y), the specific extension version is selected. If a version is specified, an auto-upgrade is performed on the role instance.
     * 
     */
    private final @Nullable String typeHandlerVersion;

    @CustomType.Constructor
    private CloudServiceExtensionPropertiesResponse(
        @CustomType.Parameter("autoUpgradeMinorVersion") @Nullable Boolean autoUpgradeMinorVersion,
        @CustomType.Parameter("forceUpdateTag") @Nullable String forceUpdateTag,
        @CustomType.Parameter("protectedSettings") @Nullable String protectedSettings,
        @CustomType.Parameter("protectedSettingsFromKeyVault") @Nullable CloudServiceVaultAndSecretReferenceResponse protectedSettingsFromKeyVault,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publisher") @Nullable String publisher,
        @CustomType.Parameter("rolesAppliedTo") @Nullable List<String> rolesAppliedTo,
        @CustomType.Parameter("settings") @Nullable String settings,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("typeHandlerVersion") @Nullable String typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.forceUpdateTag = forceUpdateTag;
        this.protectedSettings = protectedSettings;
        this.protectedSettingsFromKeyVault = protectedSettingsFromKeyVault;
        this.provisioningState = provisioningState;
        this.publisher = publisher;
        this.rolesAppliedTo = rolesAppliedTo;
        this.settings = settings;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    /**
     * Explicitly specify whether platform can automatically upgrade typeHandlerVersion to higher minor versions when they become available.
     * 
    */
    public Optional<Boolean> getAutoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }
    /**
     * Tag to force apply the provided public and protected settings.
     * Changing the tag value allows for re-running the extension without changing any of the public or protected settings.
     * If forceUpdateTag is not changed, updates to public or protected settings would still be applied by the handler.
     * If neither forceUpdateTag nor any of public or protected settings change, extension would flow to the role instance with the same sequence-number, and
     * it is up to handler implementation whether to re-run it or not
     * 
    */
    public Optional<String> getForceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }
    /**
     * Protected settings for the extension which are encrypted before sent to the role instance.
     * 
    */
    public Optional<String> getProtectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }
    public Optional<CloudServiceVaultAndSecretReferenceResponse> getProtectedSettingsFromKeyVault() {
        return Optional.ofNullable(this.protectedSettingsFromKeyVault);
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The name of the extension handler publisher.
     * 
    */
    public Optional<String> getPublisher() {
        return Optional.ofNullable(this.publisher);
    }
    /**
     * Optional list of roles to apply this extension. If property is not specified or '*' is specified, extension is applied to all roles in the cloud service.
     * 
    */
    public List<String> getRolesAppliedTo() {
        return this.rolesAppliedTo == null ? List.of() : this.rolesAppliedTo;
    }
    /**
     * Public settings for the extension. For JSON extensions, this is the JSON settings for the extension. For XML Extension (like RDP), this is the XML setting for the extension.
     * 
    */
    public Optional<String> getSettings() {
        return Optional.ofNullable(this.settings);
    }
    /**
     * Specifies the type of the extension.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * Specifies the version of the extension. Specifies the version of the extension. If this element is not specified or an asterisk (*) is used as the value, the latest version of the extension is used. If the value is specified with a major version number and an asterisk as the minor version number (X.), the latest minor version of the specified major version is selected. If a major version number and a minor version number are specified (X.Y), the specific extension version is selected. If a version is specified, an auto-upgrade is performed on the role instance.
     * 
    */
    public Optional<String> getTypeHandlerVersion() {
        return Optional.ofNullable(this.typeHandlerVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceExtensionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoUpgradeMinorVersion;
        private @Nullable String forceUpdateTag;
        private @Nullable String protectedSettings;
        private @Nullable CloudServiceVaultAndSecretReferenceResponse protectedSettingsFromKeyVault;
        private String provisioningState;
        private @Nullable String publisher;
        private @Nullable List<String> rolesAppliedTo;
        private @Nullable String settings;
        private @Nullable String type;
        private @Nullable String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceExtensionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.protectedSettingsFromKeyVault = defaults.protectedSettingsFromKeyVault;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publisher = defaults.publisher;
    	      this.rolesAppliedTo = defaults.rolesAppliedTo;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder autoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }
        public Builder forceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }
        public Builder protectedSettings(@Nullable String protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }
        public Builder protectedSettingsFromKeyVault(@Nullable CloudServiceVaultAndSecretReferenceResponse protectedSettingsFromKeyVault) {
            this.protectedSettingsFromKeyVault = protectedSettingsFromKeyVault;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }
        public Builder rolesAppliedTo(@Nullable List<String> rolesAppliedTo) {
            this.rolesAppliedTo = rolesAppliedTo;
            return this;
        }
        public Builder rolesAppliedTo(String... rolesAppliedTo) {
            return rolesAppliedTo(List.of(rolesAppliedTo));
        }
        public Builder settings(@Nullable String settings) {
            this.settings = settings;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder typeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }        public CloudServiceExtensionPropertiesResponse build() {
            return new CloudServiceExtensionPropertiesResponse(autoUpgradeMinorVersion, forceUpdateTag, protectedSettings, protectedSettingsFromKeyVault, provisioningState, publisher, rolesAppliedTo, settings, type, typeHandlerVersion);
        }
    }
}
