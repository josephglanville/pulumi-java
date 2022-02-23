// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.enums.HostnameType;
import io.pulumi.azurenative.apimanagement.inputs.CertificateInformationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
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
      private final @Nullable Input<CertificateInformationArgs> certificate;

    public Input<CertificateInformationArgs> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * Certificate Password.
     * 
     */
    @InputImport(name="certificatePassword")
      private final @Nullable Input<String> certificatePassword;

    public Input<String> getCertificatePassword() {
        return this.certificatePassword == null ? Input.empty() : this.certificatePassword;
    }

    /**
     * Specify true to setup the certificate associated with this Hostname as the Default SSL Certificate. If a client does not send the SNI header, then this will be the certificate that will be challenged. The property is useful if a service has multiple custom hostname enabled and it needs to decide on the default ssl certificate. The setting only applied to Proxy Hostname Type.
     * 
     */
    @InputImport(name="defaultSslBinding")
      private final @Nullable Input<Boolean> defaultSslBinding;

    public Input<Boolean> getDefaultSslBinding() {
        return this.defaultSslBinding == null ? Input.empty() : this.defaultSslBinding;
    }

    /**
     * Base64 Encoded certificate.
     * 
     */
    @InputImport(name="encodedCertificate")
      private final @Nullable Input<String> encodedCertificate;

    public Input<String> getEncodedCertificate() {
        return this.encodedCertificate == null ? Input.empty() : this.encodedCertificate;
    }

    /**
     * Hostname to configure on the Api Management service.
     * 
     */
    @InputImport(name="hostName", required=true)
      private final Input<String> hostName;

    public Input<String> getHostName() {
        return this.hostName;
    }

    /**
     * System or User Assigned Managed identity clientId as generated by Azure AD, which has GET access to the keyVault containing the SSL certificate.
     * 
     */
    @InputImport(name="identityClientId")
      private final @Nullable Input<String> identityClientId;

    public Input<String> getIdentityClientId() {
        return this.identityClientId == null ? Input.empty() : this.identityClientId;
    }

    /**
     * Url to the KeyVault Secret containing the Ssl Certificate. If absolute Url containing version is provided, auto-update of ssl certificate will not work. This requires Api Management service to be configured with aka.ms/apimmsi. The secret should be of type *application/x-pkcs12*
     * 
     */
    @InputImport(name="keyVaultId")
      private final @Nullable Input<String> keyVaultId;

    public Input<String> getKeyVaultId() {
        return this.keyVaultId == null ? Input.empty() : this.keyVaultId;
    }

    /**
     * Specify true to always negotiate client certificate on the hostname. Default Value is false.
     * 
     */
    @InputImport(name="negotiateClientCertificate")
      private final @Nullable Input<Boolean> negotiateClientCertificate;

    public Input<Boolean> getNegotiateClientCertificate() {
        return this.negotiateClientCertificate == null ? Input.empty() : this.negotiateClientCertificate;
    }

    /**
     * Hostname type.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<Either<String,HostnameType>> type;

    public Input<Either<String,HostnameType>> getType() {
        return this.type;
    }

    public HostnameConfigurationArgs(
        @Nullable Input<CertificateInformationArgs> certificate,
        @Nullable Input<String> certificatePassword,
        @Nullable Input<Boolean> defaultSslBinding,
        @Nullable Input<String> encodedCertificate,
        Input<String> hostName,
        @Nullable Input<String> identityClientId,
        @Nullable Input<String> keyVaultId,
        @Nullable Input<Boolean> negotiateClientCertificate,
        Input<Either<String,HostnameType>> type) {
        this.certificate = certificate;
        this.certificatePassword = certificatePassword;
        this.defaultSslBinding = defaultSslBinding == null ? Input.ofNullable(false) : defaultSslBinding;
        this.encodedCertificate = encodedCertificate;
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.identityClientId = identityClientId;
        this.keyVaultId = keyVaultId;
        this.negotiateClientCertificate = negotiateClientCertificate == null ? Input.ofNullable(false) : negotiateClientCertificate;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private HostnameConfigurationArgs() {
        this.certificate = Input.empty();
        this.certificatePassword = Input.empty();
        this.defaultSslBinding = Input.empty();
        this.encodedCertificate = Input.empty();
        this.hostName = Input.empty();
        this.identityClientId = Input.empty();
        this.keyVaultId = Input.empty();
        this.negotiateClientCertificate = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostnameConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CertificateInformationArgs> certificate;
        private @Nullable Input<String> certificatePassword;
        private @Nullable Input<Boolean> defaultSslBinding;
        private @Nullable Input<String> encodedCertificate;
        private Input<String> hostName;
        private @Nullable Input<String> identityClientId;
        private @Nullable Input<String> keyVaultId;
        private @Nullable Input<Boolean> negotiateClientCertificate;
        private Input<Either<String,HostnameType>> type;

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

        public Builder setCertificate(@Nullable Input<CertificateInformationArgs> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setCertificate(@Nullable CertificateInformationArgs certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder setCertificatePassword(@Nullable Input<String> certificatePassword) {
            this.certificatePassword = certificatePassword;
            return this;
        }

        public Builder setCertificatePassword(@Nullable String certificatePassword) {
            this.certificatePassword = Input.ofNullable(certificatePassword);
            return this;
        }

        public Builder setDefaultSslBinding(@Nullable Input<Boolean> defaultSslBinding) {
            this.defaultSslBinding = defaultSslBinding;
            return this;
        }

        public Builder setDefaultSslBinding(@Nullable Boolean defaultSslBinding) {
            this.defaultSslBinding = Input.ofNullable(defaultSslBinding);
            return this;
        }

        public Builder setEncodedCertificate(@Nullable Input<String> encodedCertificate) {
            this.encodedCertificate = encodedCertificate;
            return this;
        }

        public Builder setEncodedCertificate(@Nullable String encodedCertificate) {
            this.encodedCertificate = Input.ofNullable(encodedCertificate);
            return this;
        }

        public Builder setHostName(Input<String> hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Input.of(Objects.requireNonNull(hostName));
            return this;
        }

        public Builder setIdentityClientId(@Nullable Input<String> identityClientId) {
            this.identityClientId = identityClientId;
            return this;
        }

        public Builder setIdentityClientId(@Nullable String identityClientId) {
            this.identityClientId = Input.ofNullable(identityClientId);
            return this;
        }

        public Builder setKeyVaultId(@Nullable Input<String> keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }

        public Builder setKeyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = Input.ofNullable(keyVaultId);
            return this;
        }

        public Builder setNegotiateClientCertificate(@Nullable Input<Boolean> negotiateClientCertificate) {
            this.negotiateClientCertificate = negotiateClientCertificate;
            return this;
        }

        public Builder setNegotiateClientCertificate(@Nullable Boolean negotiateClientCertificate) {
            this.negotiateClientCertificate = Input.ofNullable(negotiateClientCertificate);
            return this;
        }

        public Builder setType(Input<Either<String,HostnameType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,HostnameType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public HostnameConfigurationArgs build() {
            return new HostnameConfigurationArgs(certificate, certificatePassword, defaultSslBinding, encodedCertificate, hostName, identityClientId, keyVaultId, negotiateClientCertificate, type);
        }
    }
}
