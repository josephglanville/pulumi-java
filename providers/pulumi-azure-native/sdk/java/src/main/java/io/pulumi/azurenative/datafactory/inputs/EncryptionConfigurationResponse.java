// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.CMKIdentityDefinitionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of CMK for the factory.
 * 
 */
public final class EncryptionConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionConfigurationResponse Empty = new EncryptionConfigurationResponse();

    /**
     * User assigned identity to use to authenticate to customer's key vault. If not provided Managed Service Identity will be used.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable CMKIdentityDefinitionResponse identity;

    public Optional<CMKIdentityDefinitionResponse> getIdentity() {
        return this.identity == null ? Optional.empty() : Optional.ofNullable(this.identity);
    }

    /**
     * The name of the key in Azure Key Vault to use as Customer Managed Key.
     * 
     */
    @InputImport(name="keyName", required=true)
      private final String keyName;

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * The version of the key used for CMK. If not provided, latest version will be used.
     * 
     */
    @InputImport(name="keyVersion")
      private final @Nullable String keyVersion;

    public Optional<String> getKeyVersion() {
        return this.keyVersion == null ? Optional.empty() : Optional.ofNullable(this.keyVersion);
    }

    /**
     * The url of the Azure Key Vault used for CMK.
     * 
     */
    @InputImport(name="vaultBaseUrl", required=true)
      private final String vaultBaseUrl;

    public String getVaultBaseUrl() {
        return this.vaultBaseUrl;
    }

    public EncryptionConfigurationResponse(
        @Nullable CMKIdentityDefinitionResponse identity,
        String keyName,
        @Nullable String keyVersion,
        String vaultBaseUrl) {
        this.identity = identity;
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.keyVersion = keyVersion;
        this.vaultBaseUrl = Objects.requireNonNull(vaultBaseUrl, "expected parameter 'vaultBaseUrl' to be non-null");
    }

    private EncryptionConfigurationResponse() {
        this.identity = null;
        this.keyName = null;
        this.keyVersion = null;
        this.vaultBaseUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CMKIdentityDefinitionResponse identity;
        private String keyName;
        private @Nullable String keyVersion;
        private String vaultBaseUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.keyName = defaults.keyName;
    	      this.keyVersion = defaults.keyVersion;
    	      this.vaultBaseUrl = defaults.vaultBaseUrl;
        }

        public Builder setIdentity(@Nullable CMKIdentityDefinitionResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setKeyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        public Builder setVaultBaseUrl(String vaultBaseUrl) {
            this.vaultBaseUrl = Objects.requireNonNull(vaultBaseUrl);
            return this;
        }
        public EncryptionConfigurationResponse build() {
            return new EncryptionConfigurationResponse(identity, keyName, keyVersion, vaultBaseUrl);
        }
    }
}
