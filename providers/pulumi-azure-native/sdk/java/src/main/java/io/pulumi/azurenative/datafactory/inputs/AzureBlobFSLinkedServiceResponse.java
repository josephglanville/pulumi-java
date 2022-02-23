// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceResponse;
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
 * Azure Data Lake Storage Gen2 linked service.
 * 
 */
public final class AzureBlobFSLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureBlobFSLinkedServiceResponse Empty = new AzureBlobFSLinkedServiceResponse();

    /**
     * Account key for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="accountKey")
      private final @Nullable Object accountKey;

    public Optional<Object> getAccountKey() {
        return this.accountKey == null ? Optional.empty() : Optional.ofNullable(this.accountKey);
    }

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
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="azureCloudType")
      private final @Nullable Object azureCloudType;

    public Optional<Object> getAzureCloudType() {
        return this.azureCloudType == null ? Optional.empty() : Optional.ofNullable(this.azureCloudType);
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
     * The credential reference containing authentication information.
     * 
     */
    @InputImport(name="credential")
      private final @Nullable CredentialReferenceResponse credential;

    public Optional<CredentialReferenceResponse> getCredential() {
        return this.credential == null ? Optional.empty() : Optional.ofNullable(this.credential);
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
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert', servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     */
    @InputImport(name="servicePrincipalCredential")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getServicePrincipalCredential() {
        return this.servicePrincipalCredential == null ? null : this.servicePrincipalCredential;
    }

    /**
     * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="servicePrincipalCredentialType")
      private final @Nullable Object servicePrincipalCredentialType;

    public Optional<Object> getServicePrincipalCredentialType() {
        return this.servicePrincipalCredentialType == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalCredentialType);
    }

    /**
     * The ID of the application used to authenticate against the Azure Data Lake Storage Gen2 account. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="servicePrincipalId")
      private final @Nullable Object servicePrincipalId;

    public Optional<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The Key of the application used to authenticate against the Azure Data Lake Storage Gen2 account.
     * 
     */
    @InputImport(name="servicePrincipalKey")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getServicePrincipalKey() {
        return this.servicePrincipalKey == null ? null : this.servicePrincipalKey;
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="tenant")
      private final @Nullable Object tenant;

    public Optional<Object> getTenant() {
        return this.tenant == null ? Optional.empty() : Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureBlobFS'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="url", required=true)
      private final Object url;

    public Object getUrl() {
        return this.url;
    }

    public AzureBlobFSLinkedServiceResponse(
        @Nullable Object accountKey,
        @Nullable List<Object> annotations,
        @Nullable Object azureCloudType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable CredentialReferenceResponse credential,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential,
        @Nullable Object servicePrincipalCredentialType,
        @Nullable Object servicePrincipalId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @Nullable Object tenant,
        String type,
        Object url) {
        this.accountKey = accountKey;
        this.annotations = annotations;
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.credential = credential;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.servicePrincipalCredential = servicePrincipalCredential;
        this.servicePrincipalCredentialType = servicePrincipalCredentialType;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private AzureBlobFSLinkedServiceResponse() {
        this.accountKey = null;
        this.annotations = List.of();
        this.azureCloudType = null;
        this.connectVia = null;
        this.credential = null;
        this.description = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.servicePrincipalCredential = null;
        this.servicePrincipalCredentialType = null;
        this.servicePrincipalId = null;
        this.servicePrincipalKey = null;
        this.tenant = null;
        this.type = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobFSLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object accountKey;
        private @Nullable List<Object> annotations;
        private @Nullable Object azureCloudType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential;
        private @Nullable Object servicePrincipalCredentialType;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private @Nullable Object tenant;
        private String type;
        private Object url;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobFSLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.annotations = defaults.annotations;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalCredential = defaults.servicePrincipalCredential;
    	      this.servicePrincipalCredentialType = defaults.servicePrincipalCredentialType;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
        }

        public Builder setAccountKey(@Nullable Object accountKey) {
            this.accountKey = accountKey;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAzureCloudType(@Nullable Object azureCloudType) {
            this.azureCloudType = azureCloudType;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setCredential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
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

        public Builder setServicePrincipalCredential(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential) {
            this.servicePrincipalCredential = servicePrincipalCredential;
            return this;
        }

        public Builder setServicePrincipalCredentialType(@Nullable Object servicePrincipalCredentialType) {
            this.servicePrincipalCredentialType = servicePrincipalCredentialType;
            return this;
        }

        public Builder setServicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder setServicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder setTenant(@Nullable Object tenant) {
            this.tenant = tenant;
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
        public AzureBlobFSLinkedServiceResponse build() {
            return new AzureBlobFSLinkedServiceResponse(accountKey, annotations, azureCloudType, connectVia, credential, description, encryptedCredential, parameters, servicePrincipalCredential, servicePrincipalCredentialType, servicePrincipalId, servicePrincipalKey, tenant, type, url);
        }
    }
}
