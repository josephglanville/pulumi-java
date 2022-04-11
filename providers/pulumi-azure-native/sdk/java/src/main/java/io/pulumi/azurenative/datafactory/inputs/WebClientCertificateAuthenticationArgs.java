// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * A WebLinkedService that uses client certificate based authentication to communicate with an HTTP endpoint. This scheme follows mutual authentication; the server must also provide valid credentials to the client.
 * 
 */
public final class WebClientCertificateAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebClientCertificateAuthenticationArgs Empty = new WebClientCertificateAuthenticationArgs();

    /**
     * Type of authentication used to connect to the web table source.
     * Expected value is 'ClientCertificate'.
     * 
     */
    @Import(name="authenticationType", required=true)
      private final Output<String> authenticationType;

    public Output<String> getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Password for the PFX file.
     * 
     */
    @Import(name="password", required=true)
      private final Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password;
    }

    /**
     * Base64-encoded contents of a PFX file.
     * 
     */
    @Import(name="pfx", required=true)
      private final Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> pfx;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPfx() {
        return this.pfx;
    }

    /**
     * The URL of the web service endpoint, e.g. http://www.microsoft.com . Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="url", required=true)
      private final Output<Object> url;

    public Output<Object> getUrl() {
        return this.url;
    }

    public WebClientCertificateAuthenticationArgs(
        Output<String> authenticationType,
        Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> pfx,
        Output<Object> url) {
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.pfx = Objects.requireNonNull(pfx, "expected parameter 'pfx' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private WebClientCertificateAuthenticationArgs() {
        this.authenticationType = Codegen.empty();
        this.password = Codegen.empty();
        this.pfx = Codegen.empty();
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebClientCertificateAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authenticationType;
        private Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> pfx;
        private Output<Object> url;

        public Builder() {
    	      // Empty
        }

        public Builder(WebClientCertificateAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.password = defaults.password;
    	      this.pfx = defaults.pfx;
    	      this.url = defaults.url;
        }

        public Builder authenticationType(Output<String> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Output.of(Objects.requireNonNull(authenticationType));
            return this;
        }
        public Builder password(Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Output.of(Objects.requireNonNull(password));
            return this;
        }
        public Builder pfx(Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> pfx) {
            this.pfx = Objects.requireNonNull(pfx);
            return this;
        }
        public Builder pfx(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> pfx) {
            this.pfx = Output.of(Objects.requireNonNull(pfx));
            return this;
        }
        public Builder url(Output<Object> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder url(Object url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }        public WebClientCertificateAuthenticationArgs build() {
            return new WebClientCertificateAuthenticationArgs(authenticationType, password, pfx, url);
        }
    }
}
