// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HttpLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
     */
    private final @Nullable Object authHeaders;
    /**
     * The authentication type to be used to connect to the HTTP server.
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * Thumbprint of certificate for ClientCertificate authentication. Only valid for on-premises copy. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object certThumbprint;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * Base64 encoded certificate data for ClientCertificate authentication. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object embeddedCertData;
    /**
     * If true, validate the HTTPS server SSL certificate. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object enableServerCertificateValidation;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Password for Basic, Digest, Windows, or ClientCertificate with EmbeddedCertData authentication.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * Type of linked service.
     * Expected value is 'HttpServer'.
     * 
     */
    private final String type;
    /**
     * The base URL of the HTTP endpoint, e.g. http://www.microsoft.com. Type: string (or Expression with resultType string).
     * 
     */
    private final Object url;
    /**
     * User name for Basic, Digest, or Windows authentication. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object userName;

    @CustomType.Constructor
    private HttpLinkedServiceResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("authHeaders") @Nullable Object authHeaders,
        @CustomType.Parameter("authenticationType") @Nullable String authenticationType,
        @CustomType.Parameter("certThumbprint") @Nullable Object certThumbprint,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("embeddedCertData") @Nullable Object embeddedCertData,
        @CustomType.Parameter("enableServerCertificateValidation") @Nullable Object enableServerCertificateValidation,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("password") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("url") Object url,
        @CustomType.Parameter("userName") @Nullable Object userName) {
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
        this.type = type;
        this.url = url;
        this.userName = userName;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
    */
    public Optional<Object> getAuthHeaders() {
        return Optional.ofNullable(this.authHeaders);
    }
    /**
     * The authentication type to be used to connect to the HTTP server.
     * 
    */
    public Optional<String> getAuthenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * Thumbprint of certificate for ClientCertificate authentication. Only valid for on-premises copy. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getCertThumbprint() {
        return Optional.ofNullable(this.certThumbprint);
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Base64 encoded certificate data for ClientCertificate authentication. For on-premises copy with ClientCertificate authentication, either CertThumbprint or EmbeddedCertData/Password should be specified. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEmbeddedCertData() {
        return Optional.ofNullable(this.embeddedCertData);
    }
    /**
     * If true, validate the HTTPS server SSL certificate. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getEnableServerCertificateValidation() {
        return Optional.ofNullable(this.enableServerCertificateValidation);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Password for Basic, Digest, Windows, or ClientCertificate with EmbeddedCertData authentication.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Type of linked service.
     * Expected value is 'HttpServer'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The base URL of the HTTP endpoint, e.g. http://www.microsoft.com. Type: string (or Expression with resultType string).
     * 
    */
    public Object getUrl() {
        return this.url;
    }
    /**
     * User name for Basic, Digest, or Windows authentication. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getUserName() {
        return Optional.ofNullable(this.userName);
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

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder authHeaders(@Nullable Object authHeaders) {
            this.authHeaders = authHeaders;
            return this;
        }
        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder certThumbprint(@Nullable Object certThumbprint) {
            this.certThumbprint = certThumbprint;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder embeddedCertData(@Nullable Object embeddedCertData) {
            this.embeddedCertData = embeddedCertData;
            return this;
        }
        public Builder enableServerCertificateValidation(@Nullable Object enableServerCertificateValidation) {
            this.enableServerCertificateValidation = enableServerCertificateValidation;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder url(Object url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder userName(@Nullable Object userName) {
            this.userName = userName;
            return this;
        }        public HttpLinkedServiceResponse build() {
            return new HttpLinkedServiceResponse(annotations, authHeaders, authenticationType, certThumbprint, connectVia, description, embeddedCertData, enableServerCertificateValidation, encryptedCredential, parameters, password, type, url, userName);
        }
    }
}
