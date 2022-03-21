// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Microsoft Azure Cosmos Database (CosmosDB) linked service.
 * 
 */
public final class CosmosDbLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final CosmosDbLinkedServiceResponse Empty = new CosmosDbLinkedServiceResponse();

    /**
     * The endpoint of the Azure CosmosDB account. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="accountEndpoint")
      private final @Nullable Object accountEndpoint;

    public Optional<Object> getAccountEndpoint() {
        return this.accountEndpoint == null ? Optional.empty() : Optional.ofNullable(this.accountEndpoint);
    }

    /**
     * The account key of the Azure CosmosDB account. Type: SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="accountKey")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accountKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getAccountKey() {
        return this.accountKey == null ? null : this.accountKey;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureCloudType")
      private final @Nullable Object azureCloudType;

    public Optional<Object> getAzureCloudType() {
        return this.azureCloudType == null ? Optional.empty() : Optional.ofNullable(this.azureCloudType);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * The connection mode used to access CosmosDB account. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="connectionMode")
      private final @Nullable String connectionMode;

    public Optional<String> getConnectionMode() {
        return this.connectionMode == null ? Optional.empty() : Optional.ofNullable(this.connectionMode);
    }

    /**
     * The connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString")
      private final @Nullable Object connectionString;

    public Optional<Object> getConnectionString() {
        return this.connectionString == null ? Optional.empty() : Optional.ofNullable(this.connectionString);
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
      private final @Nullable CredentialReferenceResponse credential;

    public Optional<CredentialReferenceResponse> getCredential() {
        return this.credential == null ? Optional.empty() : Optional.ofNullable(this.credential);
    }

    /**
     * The name of the database. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="database")
      private final @Nullable Object database;

    public Optional<Object> getDatabase() {
        return this.database == null ? Optional.empty() : Optional.ofNullable(this.database);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert', servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="servicePrincipalCredential")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getServicePrincipalCredential() {
        return this.servicePrincipalCredential == null ? null : this.servicePrincipalCredential;
    }

    /**
     * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalCredentialType")
      private final @Nullable String servicePrincipalCredentialType;

    public Optional<String> getServicePrincipalCredentialType() {
        return this.servicePrincipalCredentialType == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalCredentialType);
    }

    /**
     * The client ID of the application in Azure Active Directory used for Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Object servicePrincipalId;

    public Optional<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
      private final @Nullable Object tenant;

    public Optional<Object> getTenant() {
        return this.tenant == null ? Optional.empty() : Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is 'CosmosDb'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public CosmosDbLinkedServiceResponse(
        @Nullable Object accountEndpoint,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accountKey,
        @Nullable List<Object> annotations,
        @Nullable Object azureCloudType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String connectionMode,
        @Nullable Object connectionString,
        @Nullable CredentialReferenceResponse credential,
        @Nullable Object database,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential,
        @Nullable String servicePrincipalCredentialType,
        @Nullable Object servicePrincipalId,
        @Nullable Object tenant,
        String type) {
        this.accountEndpoint = accountEndpoint;
        this.accountKey = accountKey;
        this.annotations = annotations;
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.connectionMode = connectionMode;
        this.connectionString = connectionString;
        this.credential = credential;
        this.database = database;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.servicePrincipalCredential = servicePrincipalCredential;
        this.servicePrincipalCredentialType = servicePrincipalCredentialType;
        this.servicePrincipalId = servicePrincipalId;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CosmosDbLinkedServiceResponse() {
        this.accountEndpoint = null;
        this.accountKey = null;
        this.annotations = List.of();
        this.azureCloudType = null;
        this.connectVia = null;
        this.connectionMode = null;
        this.connectionString = null;
        this.credential = null;
        this.database = null;
        this.description = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.servicePrincipalCredential = null;
        this.servicePrincipalCredentialType = null;
        this.servicePrincipalId = null;
        this.tenant = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CosmosDbLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object accountEndpoint;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accountKey;
        private @Nullable List<Object> annotations;
        private @Nullable Object azureCloudType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String connectionMode;
        private @Nullable Object connectionString;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable Object database;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential;
        private @Nullable String servicePrincipalCredentialType;
        private @Nullable Object servicePrincipalId;
        private @Nullable Object tenant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CosmosDbLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountEndpoint = defaults.accountEndpoint;
    	      this.accountKey = defaults.accountKey;
    	      this.annotations = defaults.annotations;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionMode = defaults.connectionMode;
    	      this.connectionString = defaults.connectionString;
    	      this.credential = defaults.credential;
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalCredential = defaults.servicePrincipalCredential;
    	      this.servicePrincipalCredentialType = defaults.servicePrincipalCredentialType;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder accountEndpoint(@Nullable Object accountEndpoint) {
            this.accountEndpoint = accountEndpoint;
            return this;
        }
        public Builder accountKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accountKey) {
            this.accountKey = accountKey;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder azureCloudType(@Nullable Object azureCloudType) {
            this.azureCloudType = azureCloudType;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectionMode(@Nullable String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public Builder connectionString(@Nullable Object connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public Builder credential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
            return this;
        }
        public Builder database(@Nullable Object database) {
            this.database = database;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
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
        public Builder servicePrincipalCredential(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential) {
            this.servicePrincipalCredential = servicePrincipalCredential;
            return this;
        }
        public Builder servicePrincipalCredentialType(@Nullable String servicePrincipalCredentialType) {
            this.servicePrincipalCredentialType = servicePrincipalCredentialType;
            return this;
        }
        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }
        public Builder tenant(@Nullable Object tenant) {
            this.tenant = tenant;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public CosmosDbLinkedServiceResponse build() {
            return new CosmosDbLinkedServiceResponse(accountEndpoint, accountKey, annotations, azureCloudType, connectVia, connectionMode, connectionString, credential, database, description, encryptedCredential, parameters, servicePrincipalCredential, servicePrincipalCredentialType, servicePrincipalId, tenant, type);
        }
    }
}
