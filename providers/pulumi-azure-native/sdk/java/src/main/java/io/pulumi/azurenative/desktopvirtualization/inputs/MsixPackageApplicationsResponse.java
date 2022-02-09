// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MsixPackageApplicationsResponse extends io.pulumi.resources.InvokeArgs {

    public static final MsixPackageApplicationsResponse Empty = new MsixPackageApplicationsResponse();

    @InputImport(name="appId")
    private final @Nullable String appId;

    public Optional<String> getAppId() {
        return this.appId == null ? Optional.empty() : Optional.ofNullable(this.appId);
    }

    @InputImport(name="appUserModelID")
    private final @Nullable String appUserModelID;

    public Optional<String> getAppUserModelID() {
        return this.appUserModelID == null ? Optional.empty() : Optional.ofNullable(this.appUserModelID);
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="friendlyName")
    private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    @InputImport(name="iconImageName")
    private final @Nullable String iconImageName;

    public Optional<String> getIconImageName() {
        return this.iconImageName == null ? Optional.empty() : Optional.ofNullable(this.iconImageName);
    }

    @InputImport(name="rawIcon")
    private final @Nullable String rawIcon;

    public Optional<String> getRawIcon() {
        return this.rawIcon == null ? Optional.empty() : Optional.ofNullable(this.rawIcon);
    }

    @InputImport(name="rawPng")
    private final @Nullable String rawPng;

    public Optional<String> getRawPng() {
        return this.rawPng == null ? Optional.empty() : Optional.ofNullable(this.rawPng);
    }

    public MsixPackageApplicationsResponse(
        @Nullable String appId,
        @Nullable String appUserModelID,
        @Nullable String description,
        @Nullable String friendlyName,
        @Nullable String iconImageName,
        @Nullable String rawIcon,
        @Nullable String rawPng) {
        this.appId = appId;
        this.appUserModelID = appUserModelID;
        this.description = description;
        this.friendlyName = friendlyName;
        this.iconImageName = iconImageName;
        this.rawIcon = rawIcon;
        this.rawPng = rawPng;
    }

    private MsixPackageApplicationsResponse() {
        this.appId = null;
        this.appUserModelID = null;
        this.description = null;
        this.friendlyName = null;
        this.iconImageName = null;
        this.rawIcon = null;
        this.rawPng = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MsixPackageApplicationsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appId;
        private @Nullable String appUserModelID;
        private @Nullable String description;
        private @Nullable String friendlyName;
        private @Nullable String iconImageName;
        private @Nullable String rawIcon;
        private @Nullable String rawPng;

        public Builder() {
    	      // Empty
        }

        public Builder(MsixPackageApplicationsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appUserModelID = defaults.appUserModelID;
    	      this.description = defaults.description;
    	      this.friendlyName = defaults.friendlyName;
    	      this.iconImageName = defaults.iconImageName;
    	      this.rawIcon = defaults.rawIcon;
    	      this.rawPng = defaults.rawPng;
        }

        public Builder setAppId(@Nullable String appId) {
            this.appId = appId;
            return this;
        }

        public Builder setAppUserModelID(@Nullable String appUserModelID) {
            this.appUserModelID = appUserModelID;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setIconImageName(@Nullable String iconImageName) {
            this.iconImageName = iconImageName;
            return this;
        }

        public Builder setRawIcon(@Nullable String rawIcon) {
            this.rawIcon = rawIcon;
            return this;
        }

        public Builder setRawPng(@Nullable String rawPng) {
            this.rawPng = rawPng;
            return this;
        }

        public MsixPackageApplicationsResponse build() {
            return new MsixPackageApplicationsResponse(appId, appUserModelID, description, friendlyName, iconImageName, rawIcon, rawPng);
        }
    }
}
