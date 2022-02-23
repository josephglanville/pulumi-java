// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Linked service for an HTTP source.
 * 
 */
public final class HttpLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpLinkedServiceResponse Empty = new HttpLinkedServiceResponse();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @InputImport(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
     */
    @InputImport(name="authHeaders")
      private final @Nullable Object authHeaders;

    public Optional<Object> getAuthHeaders() {
        return this.authHeaders == null ? Optional.empty() : Optional.ofNullable(this.authHeaders);
    }

    /**
     * The authentication type to be used to connect to the HTTP server.
     * 
     */
    @InputImport(name="authenticationType")
      private final @Nullable String authenticationType;

    public Optional<String> getAuthenticationType() {
        return this.authenticationType == null ? Optional.empty() : Optional.ofNullable(this.authenticationType);
    }

    /**
     * Thumbprint of certificate for ClientCertificate authentication. Only valid for on-premises copy. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="certThumbprint")
      private final @Nullable Object certThumbprint;

    public Optional<Object> getCertThumbprint() {
        return this.certThumbprint == null ? Optional.empty() : Optional.ofNullable(this.certThumbprint);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
      private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Base64 encoded certificate data for ClientCertificate authentication. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="embeddedCertData")
      private final @Nullable Object embeddedCertData;

    public Optional<Object> getEmbeddedCertData() {
        return this.embeddedCertData == null ? Optional.empty() : Optional.ofNullable(this.embeddedCertData);
    }

    /**
     * If true, validate the HTTPS server SSL certificate. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="enableServerCertificateValidation")
      private final @Nullable Object enableServerCertificateValidation;

    public Optional<Object> getEnableServerCertificateValidation() {
        return this.enableServerCertificateValidation == null ? Optional.empty() : Optional.ofNullable(this.enableServerCertificateValidation);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
      private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Password for Basic, Digest, Windows, or ClientCertificate with EmbeddedCertData authentication.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password == null ? null : this.password;
    }

    /**
     * Type of linked service.
     * Expected value is 'HttpServer'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The base URL of the HTTP endpoint, e.g. http://www.microsoft.com. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="url", required=true)
      private final Object url;

    public Object getUrl() {
        return this.url;
    }

    /**
     * User name for Basic, Digest, or Windows authentication. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Object userName;

    public Optional<Object> getUserName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public HttpLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable Object authHeaders,
        @Nullable String authenticationType,
        @Nullable Object certThumbprint,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object embeddedCertData,
        @Nullable Object enableServerCertificateValidation,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        String type,
        Object url,
        @Nullable Object userName) {
        this.annotations = annotations;
        this.authHeaders = authHeaders;
        this.authenticationType = authenticationType;
        this.certThumbprint = certThumbprint;
        this.connectVia = connectVia;
        this.description = description;
        this.embeddedCertData = embeddedCertData;
        this.enableServerCertificateValidation = enableServerCertificateValidation;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.userName = userName;
    }

    private HttpLinkedServiceResponse() {
        this.annotations = List.of();
        this.authHeaders = null;
        this.authenticationType = null;
        this.certThumbprint = null;
        this.connectVia = null;
        this.description = null;
        this.embeddedCertData = null;
        this.enableServerCertificateValidation = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.password = null;
        this.type = null;
        this.url = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object authHeaders;
        private @Nullable String authenticationType;
        private @Nullable Object certThumbprint;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object embeddedCertData;
        private @Nullable Object enableServerCertificateValidation;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private String type;
        private Object url;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authHeaders = defaults.authHeaders;
    	      this.authenticationType = defaults.authenticationType;
    	      this.certThumbprint = defaults.certThumbprint;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.embeddedCertData = defaults.embeddedCertData;
    	      this.enableServerCertificateValidation = defaults.enableServerCertificateValidation;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.userName = defaults.userName;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAuthHeaders(@Nullable Object authHeaders) {
            this.authHeaders = authHeaders;
            return this;
        }

        public Builder setAuthenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setCertThumbprint(@Nullable Object certThumbprint) {
            this.certThumbprint = certThumbprint;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEmbeddedCertData(@Nullable Object embeddedCertData) {
            this.embeddedCertData = embeddedCertData;
            return this;
        }

        public Builder setEnableServerCertificateValidation(@Nullable Object enableServerCertificateValidation) {
            this.enableServerCertificateValidation = enableServerCertificateValidation;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUrl(Object url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUserName(@Nullable Object userName) {
            this.userName = userName;
            return this;
        }
        public HttpLinkedServiceResponse build() {
            return new HttpLinkedServiceResponse(annotations, authHeaders, authenticationType, certThumbprint, connectVia, description, embeddedCertData, enableServerCertificateValidation, encryptedCredential, parameters, password, type, url, userName);
        }
    }
}
