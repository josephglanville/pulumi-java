// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * When present, these are the credentials for the secure LDAP connection.
 * 
 */
public final class CacheUsernameDownloadSettingsResponseCredentials extends io.pulumi.resources.InvokeArgs {

    public static final CacheUsernameDownloadSettingsResponseCredentials Empty = new CacheUsernameDownloadSettingsResponseCredentials();

    /**
     * The Bind Distinguished Name identity to be used in the secure LDAP connection. This value is stored encrypted and not returned on response.
     * 
     */
    @InputImport(name="bindDn")
      private final @Nullable String bindDn;

    public Optional<String> getBindDn() {
        return this.bindDn == null ? Optional.empty() : Optional.ofNullable(this.bindDn);
    }

    /**
     * The Bind password to be used in the secure LDAP connection. This value is stored encrypted and not returned on response.
     * 
     */
    @InputImport(name="bindPassword")
      private final @Nullable String bindPassword;

    public Optional<String> getBindPassword() {
        return this.bindPassword == null ? Optional.empty() : Optional.ofNullable(this.bindPassword);
    }

    public CacheUsernameDownloadSettingsResponseCredentials(
        @Nullable String bindDn,
        @Nullable String bindPassword) {
        this.bindDn = bindDn;
        this.bindPassword = bindPassword;
    }

    private CacheUsernameDownloadSettingsResponseCredentials() {
        this.bindDn = null;
        this.bindPassword = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheUsernameDownloadSettingsResponseCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bindDn;
        private @Nullable String bindPassword;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheUsernameDownloadSettingsResponseCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindDn = defaults.bindDn;
    	      this.bindPassword = defaults.bindPassword;
        }

        public Builder setBindDn(@Nullable String bindDn) {
            this.bindDn = bindDn;
            return this;
        }

        public Builder setBindPassword(@Nullable String bindPassword) {
            this.bindPassword = bindPassword;
            return this;
        }
        public CacheUsernameDownloadSettingsResponseCredentials build() {
            return new CacheUsernameDownloadSettingsResponseCredentials(bindDn, bindPassword);
        }
    }
}
