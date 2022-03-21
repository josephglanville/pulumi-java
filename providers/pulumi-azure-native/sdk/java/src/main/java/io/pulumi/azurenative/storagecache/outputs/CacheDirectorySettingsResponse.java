// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.azurenative.storagecache.outputs.CacheActiveDirectorySettingsResponse;
import io.pulumi.azurenative.storagecache.outputs.CacheUsernameDownloadSettingsResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CacheDirectorySettingsResponse {
    /**
     * Specifies settings for joining the HPC Cache to an Active Directory domain.
     * 
     */
    private final @Nullable CacheActiveDirectorySettingsResponse activeDirectory;
    /**
     * Specifies settings for Extended Groups. Extended Groups allows users to be members of more than 16 groups.
     * 
     */
    private final @Nullable CacheUsernameDownloadSettingsResponse usernameDownload;

    @CustomType.Constructor
    private CacheDirectorySettingsResponse(
        @CustomType.Parameter("activeDirectory") @Nullable CacheActiveDirectorySettingsResponse activeDirectory,
        @CustomType.Parameter("usernameDownload") @Nullable CacheUsernameDownloadSettingsResponse usernameDownload) {
        this.activeDirectory = activeDirectory;
        this.usernameDownload = usernameDownload;
    }

    /**
     * Specifies settings for joining the HPC Cache to an Active Directory domain.
     * 
    */
    public Optional<CacheActiveDirectorySettingsResponse> getActiveDirectory() {
        return Optional.ofNullable(this.activeDirectory);
    }
    /**
     * Specifies settings for Extended Groups. Extended Groups allows users to be members of more than 16 groups.
     * 
    */
    public Optional<CacheUsernameDownloadSettingsResponse> getUsernameDownload() {
        return Optional.ofNullable(this.usernameDownload);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheDirectorySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CacheActiveDirectorySettingsResponse activeDirectory;
        private @Nullable CacheUsernameDownloadSettingsResponse usernameDownload;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheDirectorySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectory = defaults.activeDirectory;
    	      this.usernameDownload = defaults.usernameDownload;
        }

        public Builder activeDirectory(@Nullable CacheActiveDirectorySettingsResponse activeDirectory) {
            this.activeDirectory = activeDirectory;
            return this;
        }
        public Builder usernameDownload(@Nullable CacheUsernameDownloadSettingsResponse usernameDownload) {
            this.usernameDownload = usernameDownload;
            return this;
        }        public CacheDirectorySettingsResponse build() {
            return new CacheDirectorySettingsResponse(activeDirectory, usernameDownload);
        }
    }
}
