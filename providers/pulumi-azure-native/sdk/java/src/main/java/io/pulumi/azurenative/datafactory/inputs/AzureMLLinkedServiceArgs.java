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
 * Azure ML Studio Web Service linked service.
 * 
 */
public final class AzureMLLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureMLLinkedServiceArgs Empty = new AzureMLLinkedServiceArgs();

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
     * The API key for accessing the Azure ML model endpoint.
     * 
     */
    @Import(name="apiKey", required=true)
      private final Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> apiKey;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getApiKey() {
        return this.apiKey;
    }

    /**
     * Type of authentication (Required to specify MSI) used to connect to AzureML. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authentication")
      private final @Nullable Output<Object> authentication;

    public Output<Object> getAuthentication() {
        return this.authentication == null ? Codegen.empty() : this.authentication;
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
     * The Batch Execution REST URL for an Azure ML Studio Web Service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="mlEndpoint", required=true)
      private final Output<Object> mlEndpoint;

    public Output<Object> getMlEndpoint() {
        return this.mlEndpoint;
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
     * The ID of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML Studio web service. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Output<Object> servicePrincipalId;

    public Output<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Codegen.empty() : this.servicePrincipalId;
    }

    /**
     * The key of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML Studio web service.
     * 
     */
    @Import(name="servicePrincipalKey")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getServicePrincipalKey() {
        return this.servicePrincipalKey == null ? Codegen.empty() : this.servicePrincipalKey;
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
      private final @Nullable Output<Object> tenant;

    public Output<Object> getTenant() {
        return this.tenant == null ? Codegen.empty() : this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureML'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * The Update Resource REST URL for an Azure ML Studio Web Service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="updateResourceEndpoint")
      private final @Nullable Output<Object> updateResourceEndpoint;

    public Output<Object> getUpdateResourceEndpoint() {
        return this.updateResourceEndpoint == null ? Codegen.empty() : this.updateResourceEndpoint;
    }

    public AzureMLLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> apiKey,
        @Nullable Output<Object> authentication,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        Output<Object> mlEndpoint,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Object> servicePrincipalId,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey,
        @Nullable Output<Object> tenant,
        Output<String> type,
        @Nullable Output<Object> updateResourceEndpoint) {
        this.annotations = annotations;
        this.apiKey = Objects.requireNonNull(apiKey, "expected parameter 'apiKey' to be non-null");
        this.authentication = authentication;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.mlEndpoint = Objects.requireNonNull(mlEndpoint, "expected parameter 'mlEndpoint' to be non-null");
        this.parameters = parameters;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.updateResourceEndpoint = updateResourceEndpoint;
    }

    private AzureMLLinkedServiceArgs() {
        this.annotations = Codegen.empty();
        this.apiKey = Codegen.empty();
        this.authentication = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.mlEndpoint = Codegen.empty();
        this.parameters = Codegen.empty();
        this.servicePrincipalId = Codegen.empty();
        this.servicePrincipalKey = Codegen.empty();
        this.tenant = Codegen.empty();
        this.type = Codegen.empty();
        this.updateResourceEndpoint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> apiKey;
        private @Nullable Output<Object> authentication;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private Output<Object> mlEndpoint;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Object> servicePrincipalId;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;
        private @Nullable Output<Object> tenant;
        private Output<String> type;
        private @Nullable Output<Object> updateResourceEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.apiKey = defaults.apiKey;
    	      this.authentication = defaults.authentication;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.mlEndpoint = defaults.mlEndpoint;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
    	      this.updateResourceEndpoint = defaults.updateResourceEndpoint;
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
        public Builder apiKey(Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }
        public Builder apiKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> apiKey) {
            this.apiKey = Output.of(Objects.requireNonNull(apiKey));
            return this;
        }
        public Builder authentication(@Nullable Output<Object> authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder authentication(@Nullable Object authentication) {
            this.authentication = Codegen.ofNullable(authentication);
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
        public Builder mlEndpoint(Output<Object> mlEndpoint) {
            this.mlEndpoint = Objects.requireNonNull(mlEndpoint);
            return this;
        }
        public Builder mlEndpoint(Object mlEndpoint) {
            this.mlEndpoint = Output.of(Objects.requireNonNull(mlEndpoint));
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
        public Builder servicePrincipalId(@Nullable Output<Object> servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }
        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = Codegen.ofNullable(servicePrincipalId);
            return this;
        }
        public Builder servicePrincipalKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }
        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            this.servicePrincipalKey = Codegen.ofNullable(servicePrincipalKey);
            return this;
        }
        public Builder tenant(@Nullable Output<Object> tenant) {
            this.tenant = tenant;
            return this;
        }
        public Builder tenant(@Nullable Object tenant) {
            this.tenant = Codegen.ofNullable(tenant);
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
        public Builder updateResourceEndpoint(@Nullable Output<Object> updateResourceEndpoint) {
            this.updateResourceEndpoint = updateResourceEndpoint;
            return this;
        }
        public Builder updateResourceEndpoint(@Nullable Object updateResourceEndpoint) {
            this.updateResourceEndpoint = Codegen.ofNullable(updateResourceEndpoint);
            return this;
        }        public AzureMLLinkedServiceArgs build() {
            return new AzureMLLinkedServiceArgs(annotations, apiKey, authentication, connectVia, description, encryptedCredential, mlEndpoint, parameters, servicePrincipalId, servicePrincipalKey, tenant, type, updateResourceEndpoint);
        }
    }
}
