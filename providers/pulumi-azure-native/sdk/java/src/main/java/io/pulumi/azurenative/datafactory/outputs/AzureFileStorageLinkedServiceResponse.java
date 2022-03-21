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
public final class AzureFileStorageLinkedServiceResponse {
    /**
     * The Azure key vault secret reference of accountKey in connection string.
     * 
     */
    private final @Nullable AzureKeyVaultSecretReferenceResponse accountKey;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * The connection string. It is mutually exclusive with sasUri property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    private final @Nullable Object connectionString;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * The azure file share name. It is required when auth with accountKey/sasToken. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileShare;
    /**
     * Host name of the server. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object host;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Password to logon the server.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * The Azure key vault secret reference of sasToken in sas uri.
     * 
     */
    private final @Nullable AzureKeyVaultSecretReferenceResponse sasToken;
    /**
     * SAS URI of the Azure File resource. It is mutually exclusive with connectionString property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    private final @Nullable Object sasUri;
    /**
     * The azure file share snapshot version. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object snapshot;
    /**
     * Type of linked service.
     * Expected value is 'AzureFileStorage'.
     * 
     */
    private final String type;
    /**
     * User ID to logon the server. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object userId;

    @CustomType.Constructor
    private AzureFileStorageLinkedServiceResponse(
        @CustomType.Parameter("accountKey") @Nullable AzureKeyVaultSecretReferenceResponse accountKey,
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("connectionString") @Nullable Object connectionString,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("fileShare") @Nullable Object fileShare,
        @CustomType.Parameter("host") @Nullable Object host,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("password") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @CustomType.Parameter("sasToken") @Nullable AzureKeyVaultSecretReferenceResponse sasToken,
        @CustomType.Parameter("sasUri") @Nullable Object sasUri,
        @CustomType.Parameter("snapshot") @Nullable Object snapshot,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userId") @Nullable Object userId) {
        this.accountKey = accountKey;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionString = connectionString;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.fileShare = fileShare;
        this.host = host;
        this.parameters = parameters;
        this.password = password;
        this.sasToken = sasToken;
        this.sasUri = sasUri;
        this.snapshot = snapshot;
        this.type = type;
        this.userId = userId;
    }

    /**
     * The Azure key vault secret reference of accountKey in connection string.
     * 
    */
    public Optional<AzureKeyVaultSecretReferenceResponse> getAccountKey() {
        return Optional.ofNullable(this.accountKey);
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * The connection string. It is mutually exclusive with sasUri property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
    */
    public Optional<Object> getConnectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * The azure file share name. It is required when auth with accountKey/sasToken. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getFileShare() {
        return Optional.ofNullable(this.fileShare);
    }
    /**
     * Host name of the server. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getHost() {
        return Optional.ofNullable(this.host);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Password to logon the server.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The Azure key vault secret reference of sasToken in sas uri.
     * 
    */
    public Optional<AzureKeyVaultSecretReferenceResponse> getSasToken() {
        return Optional.ofNullable(this.sasToken);
    }
    /**
     * SAS URI of the Azure File resource. It is mutually exclusive with connectionString property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
    */
    public Optional<Object> getSasUri() {
        return Optional.ofNullable(this.sasUri);
    }
    /**
     * The azure file share snapshot version. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getSnapshot() {
        return Optional.ofNullable(this.snapshot);
    }
    /**
     * Type of linked service.
     * Expected value is 'AzureFileStorage'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * User ID to logon the server. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getUserId() {
        return Optional.ofNullable(this.userId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileStorageLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureKeyVaultSecretReferenceResponse accountKey;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object connectionString;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object fileShare;
        private @Nullable Object host;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable AzureKeyVaultSecretReferenceResponse sasToken;
        private @Nullable Object sasUri;
        private @Nullable Object snapshot;
        private String type;
        private @Nullable Object userId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileStorageLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.fileShare = defaults.fileShare;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.sasToken = defaults.sasToken;
    	      this.sasUri = defaults.sasUri;
    	      this.snapshot = defaults.snapshot;
    	      this.type = defaults.type;
    	      this.userId = defaults.userId;
        }

        public Builder accountKey(@Nullable AzureKeyVaultSecretReferenceResponse accountKey) {
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
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectionString(@Nullable Object connectionString) {
            this.connectionString = connectionString;
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
        public Builder fileShare(@Nullable Object fileShare) {
            this.fileShare = fileShare;
            return this;
        }
        public Builder host(@Nullable Object host) {
            this.host = host;
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
        public Builder sasToken(@Nullable AzureKeyVaultSecretReferenceResponse sasToken) {
            this.sasToken = sasToken;
            return this;
        }
        public Builder sasUri(@Nullable Object sasUri) {
            this.sasUri = sasUri;
            return this;
        }
        public Builder snapshot(@Nullable Object snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userId(@Nullable Object userId) {
            this.userId = userId;
            return this;
        }        public AzureFileStorageLinkedServiceResponse build() {
            return new AzureFileStorageLinkedServiceResponse(accountKey, annotations, connectVia, connectionString, description, encryptedCredential, fileShare, host, parameters, password, sasToken, sasUri, snapshot, type, userId);
        }
    }
}
