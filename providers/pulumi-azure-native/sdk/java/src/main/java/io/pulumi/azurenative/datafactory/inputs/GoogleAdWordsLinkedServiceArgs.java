// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.GoogleAdWordsAuthenticationType;
import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleAdWordsLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleAdWordsLinkedServiceArgs Empty = new GoogleAdWordsLinkedServiceArgs();

    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    @InputImport(name="authenticationType")
    private final @Nullable Input<Either<String,GoogleAdWordsAuthenticationType>> authenticationType;

    public Input<Either<String,GoogleAdWordsAuthenticationType>> getAuthenticationType() {
        return this.authenticationType == null ? Input.empty() : this.authenticationType;
    }

    @InputImport(name="clientCustomerID")
    private final @Nullable Input<Object> clientCustomerID;

    public Input<Object> getClientCustomerID() {
        return this.clientCustomerID == null ? Input.empty() : this.clientCustomerID;
    }

    @InputImport(name="clientId")
    private final @Nullable Input<Object> clientId;

    public Input<Object> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    @InputImport(name="clientSecret")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getClientSecret() {
        return this.clientSecret == null ? Input.empty() : this.clientSecret;
    }

    @InputImport(name="connectVia")
    private final @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;

    public Input<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Input.empty() : this.connectVia;
    }

    @InputImport(name="connectionProperties")
    private final @Nullable Input<Object> connectionProperties;

    public Input<Object> getConnectionProperties() {
        return this.connectionProperties == null ? Input.empty() : this.connectionProperties;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="developerToken")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> developerToken;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getDeveloperToken() {
        return this.developerToken == null ? Input.empty() : this.developerToken;
    }

    @InputImport(name="email")
    private final @Nullable Input<Object> email;

    public Input<Object> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    @InputImport(name="encryptedCredential")
    private final @Nullable Input<Object> encryptedCredential;

    public Input<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Input.empty() : this.encryptedCredential;
    }

    @InputImport(name="keyFilePath")
    private final @Nullable Input<Object> keyFilePath;

    public Input<Object> getKeyFilePath() {
        return this.keyFilePath == null ? Input.empty() : this.keyFilePath;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    @InputImport(name="refreshToken")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> refreshToken;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getRefreshToken() {
        return this.refreshToken == null ? Input.empty() : this.refreshToken;
    }

    @InputImport(name="trustedCertPath")
    private final @Nullable Input<Object> trustedCertPath;

    public Input<Object> getTrustedCertPath() {
        return this.trustedCertPath == null ? Input.empty() : this.trustedCertPath;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    @InputImport(name="useSystemTrustStore")
    private final @Nullable Input<Object> useSystemTrustStore;

    public Input<Object> getUseSystemTrustStore() {
        return this.useSystemTrustStore == null ? Input.empty() : this.useSystemTrustStore;
    }

    public GoogleAdWordsLinkedServiceArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<Either<String,GoogleAdWordsAuthenticationType>> authenticationType,
        @Nullable Input<Object> clientCustomerID,
        @Nullable Input<Object> clientId,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<Object> connectionProperties,
        @Nullable Input<String> description,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> developerToken,
        @Nullable Input<Object> email,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Object> keyFilePath,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> refreshToken,
        @Nullable Input<Object> trustedCertPath,
        Input<String> type,
        @Nullable Input<Object> useSystemTrustStore) {
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.clientCustomerID = clientCustomerID;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.connectVia = connectVia;
        this.connectionProperties = connectionProperties;
        this.description = description;
        this.developerToken = developerToken;
        this.email = email;
        this.encryptedCredential = encryptedCredential;
        this.keyFilePath = keyFilePath;
        this.parameters = parameters;
        this.refreshToken = refreshToken;
        this.trustedCertPath = trustedCertPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useSystemTrustStore = useSystemTrustStore;
    }

    private GoogleAdWordsLinkedServiceArgs() {
        this.annotations = Input.empty();
        this.authenticationType = Input.empty();
        this.clientCustomerID = Input.empty();
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
        this.connectVia = Input.empty();
        this.connectionProperties = Input.empty();
        this.description = Input.empty();
        this.developerToken = Input.empty();
        this.email = Input.empty();
        this.encryptedCredential = Input.empty();
        this.keyFilePath = Input.empty();
        this.parameters = Input.empty();
        this.refreshToken = Input.empty();
        this.trustedCertPath = Input.empty();
        this.type = Input.empty();
        this.useSystemTrustStore = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleAdWordsLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<Either<String,GoogleAdWordsAuthenticationType>> authenticationType;
        private @Nullable Input<Object> clientCustomerID;
        private @Nullable Input<Object> clientId;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<Object> connectionProperties;
        private @Nullable Input<String> description;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> developerToken;
        private @Nullable Input<Object> email;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Object> keyFilePath;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> refreshToken;
        private @Nullable Input<Object> trustedCertPath;
        private Input<String> type;
        private @Nullable Input<Object> useSystemTrustStore;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleAdWordsLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.clientCustomerID = defaults.clientCustomerID;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.description = defaults.description;
    	      this.developerToken = defaults.developerToken;
    	      this.email = defaults.email;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.keyFilePath = defaults.keyFilePath;
    	      this.parameters = defaults.parameters;
    	      this.refreshToken = defaults.refreshToken;
    	      this.trustedCertPath = defaults.trustedCertPath;
    	      this.type = defaults.type;
    	      this.useSystemTrustStore = defaults.useSystemTrustStore;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setAuthenticationType(@Nullable Input<Either<String,GoogleAdWordsAuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAuthenticationType(@Nullable Either<String,GoogleAdWordsAuthenticationType> authenticationType) {
            this.authenticationType = Input.ofNullable(authenticationType);
            return this;
        }

        public Builder setClientCustomerID(@Nullable Input<Object> clientCustomerID) {
            this.clientCustomerID = clientCustomerID;
            return this;
        }

        public Builder setClientCustomerID(@Nullable Object clientCustomerID) {
            this.clientCustomerID = Input.ofNullable(clientCustomerID);
            return this;
        }

        public Builder setClientId(@Nullable Input<Object> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientId(@Nullable Object clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder setClientSecret(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setClientSecret(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> clientSecret) {
            this.clientSecret = Input.ofNullable(clientSecret);
            return this;
        }

        public Builder setConnectVia(@Nullable Input<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Input.ofNullable(connectVia);
            return this;
        }

        public Builder setConnectionProperties(@Nullable Input<Object> connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }

        public Builder setConnectionProperties(@Nullable Object connectionProperties) {
            this.connectionProperties = Input.ofNullable(connectionProperties);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDeveloperToken(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> developerToken) {
            this.developerToken = developerToken;
            return this;
        }

        public Builder setDeveloperToken(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> developerToken) {
            this.developerToken = Input.ofNullable(developerToken);
            return this;
        }

        public Builder setEmail(@Nullable Input<Object> email) {
            this.email = email;
            return this;
        }

        public Builder setEmail(@Nullable Object email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Input<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Input.ofNullable(encryptedCredential);
            return this;
        }

        public Builder setKeyFilePath(@Nullable Input<Object> keyFilePath) {
            this.keyFilePath = keyFilePath;
            return this;
        }

        public Builder setKeyFilePath(@Nullable Object keyFilePath) {
            this.keyFilePath = Input.ofNullable(keyFilePath);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setRefreshToken(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder setRefreshToken(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> refreshToken) {
            this.refreshToken = Input.ofNullable(refreshToken);
            return this;
        }

        public Builder setTrustedCertPath(@Nullable Input<Object> trustedCertPath) {
            this.trustedCertPath = trustedCertPath;
            return this;
        }

        public Builder setTrustedCertPath(@Nullable Object trustedCertPath) {
            this.trustedCertPath = Input.ofNullable(trustedCertPath);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUseSystemTrustStore(@Nullable Input<Object> useSystemTrustStore) {
            this.useSystemTrustStore = useSystemTrustStore;
            return this;
        }

        public Builder setUseSystemTrustStore(@Nullable Object useSystemTrustStore) {
            this.useSystemTrustStore = Input.ofNullable(useSystemTrustStore);
            return this;
        }

        public GoogleAdWordsLinkedServiceArgs build() {
            return new GoogleAdWordsLinkedServiceArgs(annotations, authenticationType, clientCustomerID, clientId, clientSecret, connectVia, connectionProperties, description, developerToken, email, encryptedCredential, keyFilePath, parameters, refreshToken, trustedCertPath, type, useSystemTrustStore);
        }
    }
}
