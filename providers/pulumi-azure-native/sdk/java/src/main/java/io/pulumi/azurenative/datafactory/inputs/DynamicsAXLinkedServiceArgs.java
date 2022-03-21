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
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Dynamics AX linked service.
 * 
 */
public final class DynamicsAXLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DynamicsAXLinkedServiceArgs Empty = new DynamicsAXLinkedServiceArgs();

    /**
     * Specify the resource you are requesting authorization. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="aadResourceId", required=true)
      private final Output<Object> aadResourceId;

    public Output<Object> getAadResourceId() {
        return this.aadResourceId;
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
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Output.empty() : this.connectVia;
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
     * Specify the application's client ID. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId", required=true)
      private final Output<Object> servicePrincipalId;

    public Output<Object> getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Specify the application's key. Mark this field as a SecureString to store it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalKey", required=true)
      private final Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Specify the tenant information (domain name or tenant ID) under which your application resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant", required=true)
      private final Output<Object> tenant;

    public Output<Object> getTenant() {
        return this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is 'DynamicsAX'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
     * 
     */
    @Import(name="url", required=true)
      private final Output<Object> url;

    public Output<Object> getUrl() {
        return this.url;
    }

    public DynamicsAXLinkedServiceArgs(
        Output<Object> aadResourceId,
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        Output<Object> servicePrincipalId,
        Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey,
        Output<Object> tenant,
        Output<String> type,
        Output<Object> url) {
        this.aadResourceId = Objects.requireNonNull(aadResourceId, "expected parameter 'aadResourceId' to be non-null");
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.servicePrincipalId = Objects.requireNonNull(servicePrincipalId, "expected parameter 'servicePrincipalId' to be non-null");
        this.servicePrincipalKey = Objects.requireNonNull(servicePrincipalKey, "expected parameter 'servicePrincipalKey' to be non-null");
        this.tenant = Objects.requireNonNull(tenant, "expected parameter 'tenant' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private DynamicsAXLinkedServiceArgs() {
        this.aadResourceId = Output.empty();
        this.annotations = Output.empty();
        this.connectVia = Output.empty();
        this.description = Output.empty();
        this.encryptedCredential = Output.empty();
        this.parameters = Output.empty();
        this.servicePrincipalId = Output.empty();
        this.servicePrincipalKey = Output.empty();
        this.tenant = Output.empty();
        this.type = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicsAXLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Object> aadResourceId;
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private Output<Object> servicePrincipalId;
        private Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;
        private Output<Object> tenant;
        private Output<String> type;
        private Output<Object> url;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicsAXLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadResourceId = defaults.aadResourceId;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
        }

        public Builder aadResourceId(Output<Object> aadResourceId) {
            this.aadResourceId = Objects.requireNonNull(aadResourceId);
            return this;
        }
        public Builder aadResourceId(Object aadResourceId) {
            this.aadResourceId = Output.of(Objects.requireNonNull(aadResourceId));
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
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Output.ofNullable(connectVia);
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
        public Builder servicePrincipalId(Output<Object> servicePrincipalId) {
            this.servicePrincipalId = Objects.requireNonNull(servicePrincipalId);
            return this;
        }
        public Builder servicePrincipalId(Object servicePrincipalId) {
            this.servicePrincipalId = Output.of(Objects.requireNonNull(servicePrincipalId));
            return this;
        }
        public Builder servicePrincipalKey(Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            this.servicePrincipalKey = Objects.requireNonNull(servicePrincipalKey);
            return this;
        }
        public Builder servicePrincipalKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            this.servicePrincipalKey = Output.of(Objects.requireNonNull(servicePrincipalKey));
            return this;
        }
        public Builder tenant(Output<Object> tenant) {
            this.tenant = Objects.requireNonNull(tenant);
            return this;
        }
        public Builder tenant(Object tenant) {
            this.tenant = Output.of(Objects.requireNonNull(tenant));
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
        }        public DynamicsAXLinkedServiceArgs build() {
            return new DynamicsAXLinkedServiceArgs(aadResourceId, annotations, connectVia, description, encryptedCredential, parameters, servicePrincipalId, servicePrincipalKey, tenant, type, url);
        }
    }
}
