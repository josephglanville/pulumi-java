// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SAP Business Warehouse Linked Service.
 * 
 */
public final class SapBWLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SapBWLinkedServiceArgs Empty = new SapBWLinkedServiceArgs();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> getAnnotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * Client ID of the client on the BW system. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clientId", required=true)
      private final Output<Object> clientId;

    public Output<Object> getClientId() {
        return this.clientId;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Codegen.empty() : this.connectVia;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Output<Object> encryptedCredential;

    public Output<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Codegen.empty() : this.encryptedCredential;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Password to access the SAP BW server.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * Host name of the SAP BW instance. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="server", required=true)
      private final Output<Object> server;

    public Output<Object> getServer() {
        return this.server;
    }

    /**
     * System number of the BW system. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="systemNumber", required=true)
      private final Output<Object> systemNumber;

    public Output<Object> getSystemNumber() {
        return this.systemNumber;
    }

    /**
     * Type of linked service.
     * Expected value is 'SapBW'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Username to access the SAP BW server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<Object> userName;

    public Output<Object> getUserName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    public SapBWLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        Output<Object> clientId,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        Output<Object> server,
        Output<Object> systemNumber,
        Output<String> type,
        @Nullable Output<Object> userName) {
        this.annotations = annotations;
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.server = Objects.requireNonNull(server, "expected parameter 'server' to be non-null");
        this.systemNumber = Objects.requireNonNull(systemNumber, "expected parameter 'systemNumber' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private SapBWLinkedServiceArgs() {
        this.annotations = Codegen.empty();
        this.clientId = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.parameters = Codegen.empty();
        this.password = Codegen.empty();
        this.server = Codegen.empty();
        this.systemNumber = Codegen.empty();
        this.type = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapBWLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private Output<Object> clientId;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private Output<Object> server;
        private Output<Object> systemNumber;
        private Output<String> type;
        private @Nullable Output<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SapBWLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clientId = defaults.clientId;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.systemNumber = defaults.systemNumber;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder clientId(Output<Object> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientId(Object clientId) {
            this.clientId = Output.of(Objects.requireNonNull(clientId));
            return this;
        }
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Codegen.ofNullable(connectVia);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Codegen.ofNullable(encryptedCredential);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder server(Output<Object> server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }
        public Builder server(Object server) {
            this.server = Output.of(Objects.requireNonNull(server));
            return this;
        }
        public Builder systemNumber(Output<Object> systemNumber) {
            this.systemNumber = Objects.requireNonNull(systemNumber);
            return this;
        }
        public Builder systemNumber(Object systemNumber) {
            this.systemNumber = Output.of(Objects.requireNonNull(systemNumber));
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
        public Builder userName(@Nullable Output<Object> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable Object userName) {
            this.userName = Codegen.ofNullable(userName);
            return this;
        }        public SapBWLinkedServiceArgs build() {
            return new SapBWLinkedServiceArgs(annotations, clientId, connectVia, description, encryptedCredential, parameters, password, server, systemNumber, type, userName);
        }
    }
}
