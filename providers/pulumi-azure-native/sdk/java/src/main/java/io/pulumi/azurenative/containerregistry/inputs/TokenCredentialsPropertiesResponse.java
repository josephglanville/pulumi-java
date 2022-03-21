// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.TokenCertificateResponse;
import io.pulumi.azurenative.containerregistry.inputs.TokenPasswordResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the credentials that can be used for authenticating the token.
 * 
 */
public final class TokenCredentialsPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final TokenCredentialsPropertiesResponse Empty = new TokenCredentialsPropertiesResponse();

    @Import(name="certificates")
      private final @Nullable List<TokenCertificateResponse> certificates;

    public List<TokenCertificateResponse> getCertificates() {
        return this.certificates == null ? List.of() : this.certificates;
    }

    @Import(name="passwords")
      private final @Nullable List<TokenPasswordResponse> passwords;

    public List<TokenPasswordResponse> getPasswords() {
        return this.passwords == null ? List.of() : this.passwords;
    }

    public TokenCredentialsPropertiesResponse(
        @Nullable List<TokenCertificateResponse> certificates,
        @Nullable List<TokenPasswordResponse> passwords) {
        this.certificates = certificates;
        this.passwords = passwords;
    }

    private TokenCredentialsPropertiesResponse() {
        this.certificates = List.of();
        this.passwords = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenCredentialsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TokenCertificateResponse> certificates;
        private @Nullable List<TokenPasswordResponse> passwords;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenCredentialsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.passwords = defaults.passwords;
        }

        public Builder certificates(@Nullable List<TokenCertificateResponse> certificates) {
            this.certificates = certificates;
            return this;
        }
        public Builder certificates(TokenCertificateResponse... certificates) {
            return certificates(List.of(certificates));
        }
        public Builder passwords(@Nullable List<TokenPasswordResponse> passwords) {
            this.passwords = passwords;
            return this;
        }
        public Builder passwords(TokenPasswordResponse... passwords) {
            return passwords(List.of(passwords));
        }        public TokenCredentialsPropertiesResponse build() {
            return new TokenCredentialsPropertiesResponse(certificates, passwords);
        }
    }
}
