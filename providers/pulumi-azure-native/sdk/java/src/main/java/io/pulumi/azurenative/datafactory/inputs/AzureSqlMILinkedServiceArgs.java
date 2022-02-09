// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlAlwaysEncryptedPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureSqlMILinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureSqlMILinkedServiceArgs Empty = new AzureSqlMILinkedServiceArgs();

    @InputImport(name="alwaysEncryptedSettings")
    private final @Nullable Input<SqlAlwaysEncryptedPropertiesArgs> alwaysEncryptedSettings;

    public Input<SqlAlwaysEncryptedPropertiesArgs> getAlwaysEncryptedSettings() {
        return this.alwaysEncryptedSettings == null ? Input.empty() : this.alwaysEncryptedSettings;
    }

    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    @InputImport(name="azureCloudType")
    private final @Nullable Input<Object> azureCloudType;

    public Input<Object> getAzureCloudType() {
        return this.azureCloudType == null ? Input.empty() : this.azureCloudType;
    }

    @InputImport(name="connectVia")
    private final @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;

    public Input<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Input.empty() : this.connectVia;
    }

    @InputImport(name="connectionString", required=true)
    private final Input<Object> connectionString;

    public Input<Object> getConnectionString() {
        return this.connectionString;
    }

    @InputImport(name="credential")
    private final @Nullable Input<CredentialReferenceArgs> credential;

    public Input<CredentialReferenceArgs> getCredential() {
        return this.credential == null ? Input.empty() : this.credential;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="encryptedCredential")
    private final @Nullable Input<Object> encryptedCredential;

    public Input<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Input.empty() : this.encryptedCredential;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    @InputImport(name="password")
    private final @Nullable Input<AzureKeyVaultSecretReferenceArgs> password;

    public Input<AzureKeyVaultSecretReferenceArgs> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    @InputImport(name="servicePrincipalId")
    private final @Nullable Input<Object> servicePrincipalId;

    public Input<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Input.empty() : this.servicePrincipalId;
    }

    @InputImport(name="servicePrincipalKey")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getServicePrincipalKey() {
        return this.servicePrincipalKey == null ? Input.empty() : this.servicePrincipalKey;
    }

    @InputImport(name="tenant")
    private final @Nullable Input<Object> tenant;

    public Input<Object> getTenant() {
        return this.tenant == null ? Input.empty() : this.tenant;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AzureSqlMILinkedServiceArgs(
        @Nullable Input<SqlAlwaysEncryptedPropertiesArgs> alwaysEncryptedSettings,
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<Object> azureCloudType,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        Input<Object> connectionString,
        @Nullable Input<CredentialReferenceArgs> credential,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<AzureKeyVaultSecretReferenceArgs> password,
        @Nullable Input<Object> servicePrincipalId,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey,
        @Nullable Input<Object> tenant,
        Input<String> type) {
        this.alwaysEncryptedSettings = alwaysEncryptedSettings;
        this.annotations = annotations;
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.connectionString = Objects.requireNonNull(connectionString, "expected parameter 'connectionString' to be non-null");
        this.credential = credential;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureSqlMILinkedServiceArgs() {
        this.alwaysEncryptedSettings = Input.empty();
        this.annotations = Input.empty();
        this.azureCloudType = Input.empty();
        this.connectVia = Input.empty();
        this.connectionString = Input.empty();
        this.credential = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.parameters = Input.empty();
        this.password = Input.empty();
        this.servicePrincipalId = Input.empty();
        this.servicePrincipalKey = Input.empty();
        this.tenant = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlMILinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SqlAlwaysEncryptedPropertiesArgs> alwaysEncryptedSettings;
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<Object> azureCloudType;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private Input<Object> connectionString;
        private @Nullable Input<CredentialReferenceArgs> credential;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<AzureKeyVaultSecretReferenceArgs> password;
        private @Nullable Input<Object> servicePrincipalId;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;
        private @Nullable Input<Object> tenant;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlMILinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysEncryptedSettings = defaults.alwaysEncryptedSettings;
    	      this.annotations = defaults.annotations;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder setAlwaysEncryptedSettings(@Nullable Input<SqlAlwaysEncryptedPropertiesArgs> alwaysEncryptedSettings) {
            this.alwaysEncryptedSettings = alwaysEncryptedSettings;
            return this;
        }

        public Builder setAlwaysEncryptedSettings(@Nullable SqlAlwaysEncryptedPropertiesArgs alwaysEncryptedSettings) {
            this.alwaysEncryptedSettings = Input.ofNullable(alwaysEncryptedSettings);
            return this;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setAzureCloudType(@Nullable Input<Object> azureCloudType) {
            this.azureCloudType = azureCloudType;
            return this;
        }

        public Builder setAzureCloudType(@Nullable Object azureCloudType) {
            this.azureCloudType = Input.ofNullable(azureCloudType);
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

        public Builder setConnectionString(Input<Object> connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }

        public Builder setConnectionString(Object connectionString) {
            this.connectionString = Input.of(Objects.requireNonNull(connectionString));
            return this;
        }

        public Builder setCredential(@Nullable Input<CredentialReferenceArgs> credential) {
            this.credential = credential;
            return this;
        }

        public Builder setCredential(@Nullable CredentialReferenceArgs credential) {
            this.credential = Input.ofNullable(credential);
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

        public Builder setEncryptedCredential(@Nullable Input<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Input.ofNullable(encryptedCredential);
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

        public Builder setPassword(@Nullable Input<AzureKeyVaultSecretReferenceArgs> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable AzureKeyVaultSecretReferenceArgs password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setServicePrincipalId(@Nullable Input<Object> servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder setServicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = Input.ofNullable(servicePrincipalId);
            return this;
        }

        public Builder setServicePrincipalKey(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder setServicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            this.servicePrincipalKey = Input.ofNullable(servicePrincipalKey);
            return this;
        }

        public Builder setTenant(@Nullable Input<Object> tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder setTenant(@Nullable Object tenant) {
            this.tenant = Input.ofNullable(tenant);
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

        public AzureSqlMILinkedServiceArgs build() {
            return new AzureSqlMILinkedServiceArgs(alwaysEncryptedSettings, annotations, azureCloudType, connectVia, connectionString, credential, description, encryptedCredential, parameters, password, servicePrincipalId, servicePrincipalKey, tenant, type);
        }
    }
}
