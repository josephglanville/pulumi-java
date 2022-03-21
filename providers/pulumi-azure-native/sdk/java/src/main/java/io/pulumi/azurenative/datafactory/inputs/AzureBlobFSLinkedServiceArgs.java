// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure Data Lake Storage Gen2 linked service.
 * 
 */
public final class AzureBlobFSLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureBlobFSLinkedServiceArgs Empty = new AzureBlobFSLinkedServiceArgs();

    /**
     * Account key for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="accountKey")
      private final @Nullable Output<Object> accountKey;

    public Output<Object> getAccountKey() {
        return this.accountKey == null ? Output.empty() : this.accountKey;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureCloudType")
      private final @Nullable Output<Object> azureCloudType;

    public Output<Object> getAzureCloudType() {
        return this.azureCloudType == null ? Output.empty() : this.azureCloudType;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Output.empty() : this.connectVia;
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
      private final @Nullable Output<CredentialReferenceArgs> credential;

    public Output<CredentialReferenceArgs> getCredential() {
        return this.credential == null ? Output.empty() : this.credential;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Output<Object> encryptedCredential;

    public Output<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Output.empty() : this.encryptedCredential;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert', servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="servicePrincipalCredential")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getServicePrincipalCredential() {
        return this.servicePrincipalCredential == null ? Output.empty() : this.servicePrincipalCredential;
    }

    /**
     * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalCredentialType")
      private final @Nullable Output<Object> servicePrincipalCredentialType;

    public Output<Object> getServicePrincipalCredentialType() {
        return this.servicePrincipalCredentialType == null ? Output.empty() : this.servicePrincipalCredentialType;
    }

    /**
     * The ID of the application used to authenticate against the Azure Data Lake Storage Gen2 account. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Output<Object> servicePrincipalId;

    public Output<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Output.empty() : this.servicePrincipalId;
    }

    /**
     * The Key of the application used to authenticate against the Azure Data Lake Storage Gen2 account.
     * 
     */
    @Import(name="servicePrincipalKey")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getServicePrincipalKey() {
        return this.servicePrincipalKey == null ? Output.empty() : this.servicePrincipalKey;
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
      private final @Nullable Output<Object> tenant;

    public Output<Object> getTenant() {
        return this.tenant == null ? Output.empty() : this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureBlobFS'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Endpoint for the Azure Data Lake Storage Gen2 service. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="url", required=true)
      private final Output<Object> url;

    public Output<Object> getUrl() {
        return this.url;
    }

    public AzureBlobFSLinkedServiceArgs(
        @Nullable Output<Object> accountKey,
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Object> azureCloudType,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<CredentialReferenceArgs> credential,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential,
        @Nullable Output<Object> servicePrincipalCredentialType,
        @Nullable Output<Object> servicePrincipalId,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey,
        @Nullable Output<Object> tenant,
        Output<String> type,
        Output<Object> url) {
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

    private AzureBlobFSLinkedServiceArgs() {
        this.accountKey = Output.empty();
        this.annotations = Output.empty();
        this.azureCloudType = Output.empty();
        this.connectVia = Output.empty();
        this.credential = Output.empty();
        this.description = Output.empty();
        this.encryptedCredential = Output.empty();
        this.parameters = Output.empty();
        this.servicePrincipalCredential = Output.empty();
        this.servicePrincipalCredentialType = Output.empty();
        this.servicePrincipalId = Output.empty();
        this.servicePrincipalKey = Output.empty();
        this.tenant = Output.empty();
        this.type = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobFSLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> accountKey;
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Object> azureCloudType;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<CredentialReferenceArgs> credential;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential;
        private @Nullable Output<Object> servicePrincipalCredentialType;
        private @Nullable Output<Object> servicePrincipalId;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;
        private @Nullable Output<Object> tenant;
        private Output<String> type;
        private Output<Object> url;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobFSLinkedServiceArgs defaults) {
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

        public Builder accountKey(@Nullable Output<Object> accountKey) {
            this.accountKey = accountKey;
            return this;
        }
        public Builder accountKey(@Nullable Object accountKey) {
            this.accountKey = Output.ofNullable(accountKey);
            return this;
        }
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder azureCloudType(@Nullable Output<Object> azureCloudType) {
            this.azureCloudType = azureCloudType;
            return this;
        }
        public Builder azureCloudType(@Nullable Object azureCloudType) {
            this.azureCloudType = Output.ofNullable(azureCloudType);
            return this;
        }
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Output.ofNullable(connectVia);
            return this;
        }
        public Builder credential(@Nullable Output<CredentialReferenceArgs> credential) {
            this.credential = credential;
            return this;
        }
        public Builder credential(@Nullable CredentialReferenceArgs credential) {
            this.credential = Output.ofNullable(credential);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Output.ofNullable(encryptedCredential);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder servicePrincipalCredential(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalCredential) {
            this.servicePrincipalCredential = servicePrincipalCredential;
            return this;
        }
        public Builder servicePrincipalCredential(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalCredential) {
            this.servicePrincipalCredential = Output.ofNullable(servicePrincipalCredential);
            return this;
        }
        public Builder servicePrincipalCredentialType(@Nullable Output<Object> servicePrincipalCredentialType) {
            this.servicePrincipalCredentialType = servicePrincipalCredentialType;
            return this;
        }
        public Builder servicePrincipalCredentialType(@Nullable Object servicePrincipalCredentialType) {
            this.servicePrincipalCredentialType = Output.ofNullable(servicePrincipalCredentialType);
            return this;
        }
        public Builder servicePrincipalId(@Nullable Output<Object> servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }
        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = Output.ofNullable(servicePrincipalId);
            return this;
        }
        public Builder servicePrincipalKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }
        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            this.servicePrincipalKey = Output.ofNullable(servicePrincipalKey);
            return this;
        }
        public Builder tenant(@Nullable Output<Object> tenant) {
            this.tenant = tenant;
            return this;
        }
        public Builder tenant(@Nullable Object tenant) {
            this.tenant = Output.ofNullable(tenant);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder url(Output<Object> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder url(Object url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }        public AzureBlobFSLinkedServiceArgs build() {
            return new AzureBlobFSLinkedServiceArgs(accountKey, annotations, azureCloudType, connectVia, credential, description, encryptedCredential, parameters, servicePrincipalCredential, servicePrincipalCredentialType, servicePrincipalId, servicePrincipalKey, tenant, type, url);
        }
    }
}
