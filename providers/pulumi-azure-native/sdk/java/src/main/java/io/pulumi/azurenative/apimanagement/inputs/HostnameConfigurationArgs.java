// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.enums.HostnameType;
import io.pulumi.azurenative.apimanagement.inputs.CertificateInformationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Custom hostname configuration.
 * 
 */
public final class HostnameConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostnameConfigurationArgs Empty = new HostnameConfigurationArgs();

    /**
     * Certificate information.
     * 
     */
    @InputImport(name="certificate")
      private final @Nullable Output<CertificateInformationArgs> certificate;

    public Output<CertificateInformationArgs> getCertificate() {
        return this.certificate == null ? Output.empty() : this.certificate;
    }

    /**
     * Certificate Password.
     * 
     */
    @InputImport(name="certificatePassword")
      private final @Nullable Output<String> certificatePassword;

    public Output<String> getCertificatePassword() {
        return this.certificatePassword == null ? Output.empty() : this.certificatePassword;
    }

    /**
     * Specify true to setup the certificate associated with this Hostname as the Default SSL Certificate. If a client does not send the SNI header, then this will be the certificate that will be challenged. The property is useful if a service has multiple custom hostname enabled and it needs to decide on the default ssl certificate. The setting only applied to Proxy Hostname Type.
     * 
     */
    @InputImport(name="defaultSslBinding")
      private final @Nullable Output<Boolean> defaultSslBinding;

    public Output<Boolean> getDefaultSslBinding() {
        return this.defaultSslBinding == null ? Output.empty() : this.defaultSslBinding;
    }

    /**
     * Base64 Encoded certificate.
     * 
     */
    @InputImport(name="encodedCertificate")
      private final @Nullable Output<String> encodedCertificate;

    public Output<String> getEncodedCertificate() {
        return this.encodedCertificate == null ? Output.empty() : this.encodedCertificate;
    }

    /**
     * Hostname to configure on the Api Management service.
     * 
     */
    @InputImport(name="hostName", required=true)
      private final Output<String> hostName;

    public Output<String> getHostName() {
        return this.hostName;
    }

    /**
     * System or User Assigned Managed identity clientId as generated by Azure AD, which has GET access to the keyVault containing the SSL certificate.
     * 
     */
    @InputImport(name="identityClientId")
      private final @Nullable Output<String> identityClientId;

    public Output<String> getIdentityClientId() {
        return this.identityClientId == null ? Output.empty() : this.identityClientId;
    }

    /**
     * Url to the KeyVault Secret containing the Ssl Certificate. If absolute Url containing version is provided, auto-update of ssl certificate will not work. This requires Api Management service to be configured with aka.ms/apimmsi. The secret should be of type *application/x-pkcs12*
     * 
     */
    @InputImport(name="keyVaultId")
      private final @Nullable Output<String> keyVaultId;

    public Output<String> getKeyVaultId() {
        return this.keyVaultId == null ? Output.empty() : this.keyVaultId;
    }

    /**
     * Specify true to always negotiate client certificate on the hostname. Default Value is false.
     * 
     */
    @InputImport(name="negotiateClientCertificate")
      private final @Nullable Output<Boolean> negotiateClientCertificate;

    public Output<Boolean> getNegotiateClientCertificate() {
        return this.negotiateClientCertificate == null ? Output.empty() : this.negotiateClientCertificate;
    }

    /**
     * Hostname type.
     * 
     */
    @InputImport(name="type", required=true)
      private final Output<Either<String,HostnameType>> type;

    public Output<Either<String,HostnameType>> getType() {
        return this.type;
    }

    public HostnameConfigurationArgs(
        @Nullable Output<CertificateInformationArgs> certificate,
        @Nullable Output<String> certificatePassword,
        @Nullable Output<Boolean> defaultSslBinding,
        @Nullable Output<String> encodedCertificate,
        Output<String> hostName,
        @Nullable Output<String> identityClientId,
        @Nullable Output<String> keyVaultId,
        @Nullable Output<Boolean> negotiateClientCertificate,
        Output<Either<String,HostnameType>> type) {
        this.certificate = certificate;
        this.certificatePassword = certificatePassword;
        this.defaultSslBinding = defaultSslBinding == null ? Output.ofNullable(false) : defaultSslBinding;
        this.encodedCertificate = encodedCertificate;
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.identityClientId = identityClientId;
        this.keyVaultId = keyVaultId;
        this.negotiateClientCertificate = negotiateClientCertificate == null ? Output.ofNullable(false) : negotiateClientCertificate;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private HostnameConfigurationArgs() {
        this.certificate = Output.empty();
        this.certificatePassword = Output.empty();
        this.defaultSslBinding = Output.empty();
        this.encodedCertificate = Output.empty();
        this.hostName = Output.empty();
        this.identityClientId = Output.empty();
        this.keyVaultId = Output.empty();
        this.negotiateClientCertificate = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostnameConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CertificateInformationArgs> certificate;
        private @Nullable Output<String> certificatePassword;
        private @Nullable Output<Boolean> defaultSslBinding;
        private @Nullable Output<String> encodedCertificate;
        private Output<String> hostName;
        private @Nullable Output<String> identityClientId;
        private @Nullable Output<String> keyVaultId;
        private @Nullable Output<Boolean> negotiateClientCertificate;
        private Output<Either<String,HostnameType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(HostnameConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificatePassword = defaults.certificatePassword;
    	      this.defaultSslBinding = defaults.defaultSslBinding;
    	      this.encodedCertificate = defaults.encodedCertificate;
    	      this.hostName = defaults.hostName;
    	      this.identityClientId = defaults.identityClientId;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.negotiateClientCertificate = defaults.negotiateClientCertificate;
    	      this.type = defaults.type;
        }

        public Builder certificate(@Nullable Output<CertificateInformationArgs> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder certificate(@Nullable CertificateInformationArgs certificate) {
            this.certificate = Output.ofNullable(certificate);
            return this;
        }

        public Builder certificatePassword(@Nullable Output<String> certificatePassword) {
            this.certificatePassword = certificatePassword;
            return this;
        }

        public Builder certificatePassword(@Nullable String certificatePassword) {
            this.certificatePassword = Output.ofNullable(certificatePassword);
            return this;
        }

        public Builder defaultSslBinding(@Nullable Output<Boolean> defaultSslBinding) {
            this.defaultSslBinding = defaultSslBinding;
            return this;
        }

        public Builder defaultSslBinding(@Nullable Boolean defaultSslBinding) {
            this.defaultSslBinding = Output.ofNullable(defaultSslBinding);
            return this;
        }

        public Builder encodedCertificate(@Nullable Output<String> encodedCertificate) {
            this.encodedCertificate = encodedCertificate;
            return this;
        }

        public Builder encodedCertificate(@Nullable String encodedCertificate) {
            this.encodedCertificate = Output.ofNullable(encodedCertificate);
            return this;
        }

        public Builder hostName(Output<String> hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder hostName(String hostName) {
            this.hostName = Output.of(Objects.requireNonNull(hostName));
            return this;
        }

        public Builder identityClientId(@Nullable Output<String> identityClientId) {
            this.identityClientId = identityClientId;
            return this;
        }

        public Builder identityClientId(@Nullable String identityClientId) {
            this.identityClientId = Output.ofNullable(identityClientId);
            return this;
        }

        public Builder keyVaultId(@Nullable Output<String> keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }

        public Builder keyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = Output.ofNullable(keyVaultId);
            return this;
        }

        public Builder negotiateClientCertificate(@Nullable Output<Boolean> negotiateClientCertificate) {
            this.negotiateClientCertificate = negotiateClientCertificate;
            return this;
        }

        public Builder negotiateClientCertificate(@Nullable Boolean negotiateClientCertificate) {
            this.negotiateClientCertificate = Output.ofNullable(negotiateClientCertificate);
            return this;
        }

        public Builder type(Output<Either<String,HostnameType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(Either<String,HostnameType> type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public HostnameConfigurationArgs build() {
            return new HostnameConfigurationArgs(certificate, certificatePassword, defaultSslBinding, encodedCertificate, hostName, identityClientId, keyVaultId, negotiateClientCertificate, type);
        }
    }
}
