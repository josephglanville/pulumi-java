// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientCertAuthenticationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClientCertAuthenticationResponse Empty = new ClientCertAuthenticationResponse();

    /**
     * Gets or sets the certificate expiration date.
     * 
     */
    @Import(name="certificateExpirationDate")
      private final @Nullable String certificateExpirationDate;

    public Optional<String> getCertificateExpirationDate() {
        return this.certificateExpirationDate == null ? Optional.empty() : Optional.ofNullable(this.certificateExpirationDate);
    }

    /**
     * Gets or sets the certificate subject name.
     * 
     */
    @Import(name="certificateSubjectName")
      private final @Nullable String certificateSubjectName;

    public Optional<String> getCertificateSubjectName() {
        return this.certificateSubjectName == null ? Optional.empty() : Optional.ofNullable(this.certificateSubjectName);
    }

    /**
     * Gets or sets the certificate thumbprint.
     * 
     */
    @Import(name="certificateThumbprint")
      private final @Nullable String certificateThumbprint;

    public Optional<String> getCertificateThumbprint() {
        return this.certificateThumbprint == null ? Optional.empty() : Optional.ofNullable(this.certificateThumbprint);
    }

    /**
     * Gets or sets the certificate password, return value will always be empty.
     * 
     */
    @Import(name="password")
      private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * Gets or sets the pfx certificate. Accepts certification in base64 encoding, return value will always be empty.
     * 
     */
    @Import(name="pfx")
      private final @Nullable String pfx;

    public Optional<String> getPfx() {
        return this.pfx == null ? Optional.empty() : Optional.ofNullable(this.pfx);
    }

    /**
     * Gets or sets the HTTP authentication type.
     * Expected value is 'ClientCertificate'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ClientCertAuthenticationResponse(
        @Nullable String certificateExpirationDate,
        @Nullable String certificateSubjectName,
        @Nullable String certificateThumbprint,
        @Nullable String password,
        @Nullable String pfx,
        String type) {
        this.certificateExpirationDate = certificateExpirationDate;
        this.certificateSubjectName = certificateSubjectName;
        this.certificateThumbprint = certificateThumbprint;
        this.password = password;
        this.pfx = pfx;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ClientCertAuthenticationResponse() {
        this.certificateExpirationDate = null;
        this.certificateSubjectName = null;
        this.certificateThumbprint = null;
        this.password = null;
        this.pfx = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateExpirationDate;
        private @Nullable String certificateSubjectName;
        private @Nullable String certificateThumbprint;
        private @Nullable String password;
        private @Nullable String pfx;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateExpirationDate = defaults.certificateExpirationDate;
    	      this.certificateSubjectName = defaults.certificateSubjectName;
    	      this.certificateThumbprint = defaults.certificateThumbprint;
    	      this.password = defaults.password;
    	      this.pfx = defaults.pfx;
    	      this.type = defaults.type;
        }

        public Builder certificateExpirationDate(@Nullable String certificateExpirationDate) {
            this.certificateExpirationDate = certificateExpirationDate;
            return this;
        }
        public Builder certificateSubjectName(@Nullable String certificateSubjectName) {
            this.certificateSubjectName = certificateSubjectName;
            return this;
        }
        public Builder certificateThumbprint(@Nullable String certificateThumbprint) {
            this.certificateThumbprint = certificateThumbprint;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder pfx(@Nullable String pfx) {
            this.pfx = pfx;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ClientCertAuthenticationResponse build() {
            return new ClientCertAuthenticationResponse(certificateExpirationDate, certificateSubjectName, certificateThumbprint, password, pfx, type);
        }
    }
}
