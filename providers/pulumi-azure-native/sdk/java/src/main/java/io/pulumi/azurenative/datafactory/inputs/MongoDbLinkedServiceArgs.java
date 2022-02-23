// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.MongoDbAuthenticationType;
import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Linked service for MongoDb data source.
 * 
 */
public final class MongoDbLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final MongoDbLinkedServiceArgs Empty = new MongoDbLinkedServiceArgs();

    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="allowSelfSignedServerCert")
      private final @Nullable Input<Object> allowSelfSignedServerCert;

    public Input<Object> getAllowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert == null ? Input.empty() : this.allowSelfSignedServerCert;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @InputImport(name="annotations")
      private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * Database to verify the username and password. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="authSource")
      private final @Nullable Input<Object> authSource;

    public Input<Object> getAuthSource() {
        return this.authSource == null ? Input.empty() : this.authSource;
    }

    /**
     * The authentication type to be used to connect to the MongoDB database.
     * 
     */
    @InputImport(name="authenticationType")
      private final @Nullable Input<Either<String,MongoDbAuthenticationType>> authenticationType;

    public Input<Either<String,MongoDbAuthenticationType>> getAuthenticationType() {
        return this.authenticationType == null ? Input.empty() : this.authenticationType;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
      private final @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;

    public Input<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Input.empty() : this.connectVia;
    }

    /**
     * The name of the MongoDB database that you want to access. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="databaseName", required=true)
      private final Input<Object> databaseName;

    public Input<Object> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Linked service description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="enableSsl")
      private final @Nullable Input<Object> enableSsl;

    public Input<Object> getEnableSsl() {
        return this.enableSsl == null ? Input.empty() : this.enableSsl;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
      private final @Nullable Input<Object> encryptedCredential;

    public Input<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Input.empty() : this.encryptedCredential;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Password for authentication.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The TCP port number that the MongoDB server uses to listen for client connections. The default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Object> port;

    public Input<Object> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The IP address or server name of the MongoDB server. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="server", required=true)
      private final Input<Object> server;

    public Input<Object> getServer() {
        return this.server;
    }

    /**
     * Type of linked service.
     * Expected value is 'MongoDb'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Username for authentication. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="username")
      private final @Nullable Input<Object> username;

    public Input<Object> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public MongoDbLinkedServiceArgs(
        @Nullable Input<Object> allowSelfSignedServerCert,
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<Object> authSource,
        @Nullable Input<Either<String,MongoDbAuthenticationType>> authenticationType,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        Input<Object> databaseName,
        @Nullable Input<String> description,
        @Nullable Input<Object> enableSsl,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Input<Object> port,
        Input<Object> server,
        Input<String> type,
        @Nullable Input<Object> username) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        this.annotations = annotations;
        this.authSource = authSource;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.description = description;
        this.enableSsl = enableSsl;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.server = Objects.requireNonNull(server, "expected parameter 'server' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.username = username;
    }

    private MongoDbLinkedServiceArgs() {
        this.allowSelfSignedServerCert = Input.empty();
        this.annotations = Input.empty();
        this.authSource = Input.empty();
        this.authenticationType = Input.empty();
        this.connectVia = Input.empty();
        this.databaseName = Input.empty();
        this.description = Input.empty();
        this.enableSsl = Input.empty();
        this.encryptedCredential = Input.empty();
        this.parameters = Input.empty();
        this.password = Input.empty();
        this.port = Input.empty();
        this.server = Input.empty();
        this.type = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDbLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> allowSelfSignedServerCert;
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<Object> authSource;
        private @Nullable Input<Either<String,MongoDbAuthenticationType>> authenticationType;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private Input<Object> databaseName;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> enableSsl;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Input<Object> port;
        private Input<Object> server;
        private Input<String> type;
        private @Nullable Input<Object> username;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDbLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSelfSignedServerCert = defaults.allowSelfSignedServerCert;
    	      this.annotations = defaults.annotations;
    	      this.authSource = defaults.authSource;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.databaseName = defaults.databaseName;
    	      this.description = defaults.description;
    	      this.enableSsl = defaults.enableSsl;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.server = defaults.server;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder setAllowSelfSignedServerCert(@Nullable Input<Object> allowSelfSignedServerCert) {
            this.allowSelfSignedServerCert = allowSelfSignedServerCert;
            return this;
        }

        public Builder setAllowSelfSignedServerCert(@Nullable Object allowSelfSignedServerCert) {
            this.allowSelfSignedServerCert = Input.ofNullable(allowSelfSignedServerCert);
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

        public Builder setAuthSource(@Nullable Input<Object> authSource) {
            this.authSource = authSource;
            return this;
        }

        public Builder setAuthSource(@Nullable Object authSource) {
            this.authSource = Input.ofNullable(authSource);
            return this;
        }

        public Builder setAuthenticationType(@Nullable Input<Either<String,MongoDbAuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAuthenticationType(@Nullable Either<String,MongoDbAuthenticationType> authenticationType) {
            this.authenticationType = Input.ofNullable(authenticationType);
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

        public Builder setDatabaseName(Input<Object> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(Object databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
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

        public Builder setEnableSsl(@Nullable Input<Object> enableSsl) {
            this.enableSsl = enableSsl;
            return this;
        }

        public Builder setEnableSsl(@Nullable Object enableSsl) {
            this.enableSsl = Input.ofNullable(enableSsl);
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

        public Builder setPassword(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setPort(@Nullable Input<Object> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Object port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setServer(Input<Object> server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }

        public Builder setServer(Object server) {
            this.server = Input.of(Objects.requireNonNull(server));
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

        public Builder setUsername(@Nullable Input<Object> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable Object username) {
            this.username = Input.ofNullable(username);
            return this;
        }
        public MongoDbLinkedServiceArgs build() {
            return new MongoDbLinkedServiceArgs(allowSelfSignedServerCert, annotations, authSource, authenticationType, connectVia, databaseName, description, enableSsl, encryptedCredential, parameters, password, port, server, type, username);
        }
    }
}
