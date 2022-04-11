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
 * Responsys linked service.
 * 
 */
public final class ResponsysLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponsysLinkedServiceArgs Empty = new ResponsysLinkedServiceArgs();

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
     * The client ID associated with the Responsys application. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clientId", required=true)
      private final Output<Object> clientId;

    public Output<Object> getClientId() {
        return this.clientId;
    }

    /**
     * The client secret associated with the Responsys application. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getClientSecret() {
        return this.clientSecret == null ? Codegen.empty() : this.clientSecret;
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
     * The endpoint of the Responsys server.
     * 
     */
    @Import(name="endpoint", required=true)
      private final Output<Object> endpoint;

    public Output<Object> getEndpoint() {
        return this.endpoint;
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
     * Type of linked service.
     * Expected value is 'Responsys'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="useEncryptedEndpoints")
      private final @Nullable Output<Object> useEncryptedEndpoints;

    public Output<Object> getUseEncryptedEndpoints() {
        return this.useEncryptedEndpoints == null ? Codegen.empty() : this.useEncryptedEndpoints;
    }

    /**
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="useHostVerification")
      private final @Nullable Output<Object> useHostVerification;

    public Output<Object> getUseHostVerification() {
        return this.useHostVerification == null ? Codegen.empty() : this.useHostVerification;
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="usePeerVerification")
      private final @Nullable Output<Object> usePeerVerification;

    public Output<Object> getUsePeerVerification() {
        return this.usePeerVerification == null ? Codegen.empty() : this.usePeerVerification;
    }

    public ResponsysLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        Output<Object> clientId,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        Output<Object> endpoint,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        Output<String> type,
        @Nullable Output<Object> useEncryptedEndpoints,
        @Nullable Output<Object> useHostVerification,
        @Nullable Output<Object> usePeerVerification) {
        this.annotations = annotations;
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.clientSecret = clientSecret;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    private ResponsysLinkedServiceArgs() {
        this.annotations = Codegen.empty();
        this.clientId = Codegen.empty();
        this.clientSecret = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.endpoint = Codegen.empty();
        this.parameters = Codegen.empty();
        this.type = Codegen.empty();
        this.useEncryptedEndpoints = Codegen.empty();
        this.useHostVerification = Codegen.empty();
        this.usePeerVerification = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsysLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private Output<Object> clientId;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private Output<Object> endpoint;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private Output<String> type;
        private @Nullable Output<Object> useEncryptedEndpoints;
        private @Nullable Output<Object> useHostVerification;
        private @Nullable Output<Object> usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsysLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.endpoint = defaults.endpoint;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
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
        public Builder clientSecret(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder clientSecret(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> clientSecret) {
            this.clientSecret = Codegen.ofNullable(clientSecret);
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
        public Builder endpoint(Output<Object> endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder endpoint(Object endpoint) {
            this.endpoint = Output.of(Objects.requireNonNull(endpoint));
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
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder useEncryptedEndpoints(@Nullable Output<Object> useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }
        public Builder useEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = Codegen.ofNullable(useEncryptedEndpoints);
            return this;
        }
        public Builder useHostVerification(@Nullable Output<Object> useHostVerification) {
            this.useHostVerification = useHostVerification;
            return this;
        }
        public Builder useHostVerification(@Nullable Object useHostVerification) {
            this.useHostVerification = Codegen.ofNullable(useHostVerification);
            return this;
        }
        public Builder usePeerVerification(@Nullable Output<Object> usePeerVerification) {
            this.usePeerVerification = usePeerVerification;
            return this;
        }
        public Builder usePeerVerification(@Nullable Object usePeerVerification) {
            this.usePeerVerification = Codegen.ofNullable(usePeerVerification);
            return this;
        }        public ResponsysLinkedServiceArgs build() {
            return new ResponsysLinkedServiceArgs(annotations, clientId, clientSecret, connectVia, description, encryptedCredential, endpoint, parameters, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}
