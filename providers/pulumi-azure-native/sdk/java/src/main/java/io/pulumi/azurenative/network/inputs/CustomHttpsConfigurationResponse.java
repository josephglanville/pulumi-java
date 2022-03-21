// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.KeyVaultCertificateSourceParametersResponseVault;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Https settings for a domain
 * 
 */
public final class CustomHttpsConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomHttpsConfigurationResponse Empty = new CustomHttpsConfigurationResponse();

    /**
     * Defines the source of the SSL certificate
     * 
     */
    @Import(name="certificateSource", required=true)
      private final String certificateSource;

    public String getCertificateSource() {
        return this.certificateSource;
    }

    /**
     * Defines the type of the certificate used for secure connections to a frontendEndpoint
     * 
     */
    @Import(name="certificateType")
      private final @Nullable String certificateType;

    public Optional<String> getCertificateType() {
        return this.certificateType == null ? Optional.empty() : Optional.ofNullable(this.certificateType);
    }

    /**
     * The minimum TLS version required from the clients to establish an SSL handshake with Front Door.
     * 
     */
    @Import(name="minimumTlsVersion", required=true)
      private final String minimumTlsVersion;

    public String getMinimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Defines the TLS extension protocol that is used for secure delivery
     * 
     */
    @Import(name="protocolType", required=true)
      private final String protocolType;

    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * The name of the Key Vault secret representing the full certificate PFX
     * 
     */
    @Import(name="secretName")
      private final @Nullable String secretName;

    public Optional<String> getSecretName() {
        return this.secretName == null ? Optional.empty() : Optional.ofNullable(this.secretName);
    }

    /**
     * The version of the Key Vault secret representing the full certificate PFX
     * 
     */
    @Import(name="secretVersion")
      private final @Nullable String secretVersion;

    public Optional<String> getSecretVersion() {
        return this.secretVersion == null ? Optional.empty() : Optional.ofNullable(this.secretVersion);
    }

    /**
     * The Key Vault containing the SSL certificate
     * 
     */
    @Import(name="vault")
      private final @Nullable KeyVaultCertificateSourceParametersResponseVault vault;

    public Optional<KeyVaultCertificateSourceParametersResponseVault> getVault() {
        return this.vault == null ? Optional.empty() : Optional.ofNullable(this.vault);
    }

    public CustomHttpsConfigurationResponse(
        String certificateSource,
        @Nullable String certificateType,
        String minimumTlsVersion,
        String protocolType,
        @Nullable String secretName,
        @Nullable String secretVersion,
        @Nullable KeyVaultCertificateSourceParametersResponseVault vault) {
        this.certificateSource = Objects.requireNonNull(certificateSource, "expected parameter 'certificateSource' to be non-null");
        this.certificateType = certificateType;
        this.minimumTlsVersion = Objects.requireNonNull(minimumTlsVersion, "expected parameter 'minimumTlsVersion' to be non-null");
        this.protocolType = Objects.requireNonNull(protocolType, "expected parameter 'protocolType' to be non-null");
        this.secretName = secretName;
        this.secretVersion = secretVersion;
        this.vault = vault;
    }

    private CustomHttpsConfigurationResponse() {
        this.certificateSource = null;
        this.certificateType = null;
        this.minimumTlsVersion = null;
        this.protocolType = null;
        this.secretName = null;
        this.secretVersion = null;
        this.vault = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomHttpsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateSource;
        private @Nullable String certificateType;
        private String minimumTlsVersion;
        private String protocolType;
        private @Nullable String secretName;
        private @Nullable String secretVersion;
        private @Nullable KeyVaultCertificateSourceParametersResponseVault vault;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomHttpsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateSource = defaults.certificateSource;
    	      this.certificateType = defaults.certificateType;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.protocolType = defaults.protocolType;
    	      this.secretName = defaults.secretName;
    	      this.secretVersion = defaults.secretVersion;
    	      this.vault = defaults.vault;
        }

        public Builder certificateSource(String certificateSource) {
            this.certificateSource = Objects.requireNonNull(certificateSource);
            return this;
        }
        public Builder certificateType(@Nullable String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public Builder minimumTlsVersion(String minimumTlsVersion) {
            this.minimumTlsVersion = Objects.requireNonNull(minimumTlsVersion);
            return this;
        }
        public Builder protocolType(String protocolType) {
            this.protocolType = Objects.requireNonNull(protocolType);
            return this;
        }
        public Builder secretName(@Nullable String secretName) {
            this.secretName = secretName;
            return this;
        }
        public Builder secretVersion(@Nullable String secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }
        public Builder vault(@Nullable KeyVaultCertificateSourceParametersResponseVault vault) {
            this.vault = vault;
            return this;
        }        public CustomHttpsConfigurationResponse build() {
            return new CustomHttpsConfigurationResponse(certificateSource, certificateType, minimumTlsVersion, protocolType, secretName, secretVersion, vault);
        }
    }
}
