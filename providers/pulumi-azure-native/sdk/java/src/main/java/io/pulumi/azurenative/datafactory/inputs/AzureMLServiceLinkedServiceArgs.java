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
 * Azure ML Service linked service.
 * 
 */
public final class AzureMLServiceLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureMLServiceLinkedServiceArgs Empty = new AzureMLServiceLinkedServiceArgs();

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
     * Azure ML Service workspace name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="mlWorkspaceName", required=true)
      private final Output<Object> mlWorkspaceName;

    public Output<Object> getMlWorkspaceName() {
        return this.mlWorkspaceName;
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
     * Azure ML Service workspace resource group name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<Object> resourceGroupName;

    public Output<Object> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The ID of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Output<Object> servicePrincipalId;

    public Output<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Codegen.empty() : this.servicePrincipalId;
    }

    /**
     * The key of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline.
     * 
     */
    @Import(name="servicePrincipalKey")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getServicePrincipalKey() {
        return this.servicePrincipalKey == null ? Codegen.empty() : this.servicePrincipalKey;
    }

    /**
     * Azure ML Service workspace subscription ID. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="subscriptionId", required=true)
      private final Output<Object> subscriptionId;

    public Output<Object> getSubscriptionId() {
        return this.subscriptionId;
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
     * Expected value is 'AzureMLService'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public AzureMLServiceLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        Output<Object> mlWorkspaceName,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        Output<Object> resourceGroupName,
        @Nullable Output<Object> servicePrincipalId,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey,
        Output<Object> subscriptionId,
        @Nullable Output<Object> tenant,
        Output<String> type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.mlWorkspaceName = Objects.requireNonNull(mlWorkspaceName, "expected parameter 'mlWorkspaceName' to be non-null");
        this.parameters = parameters;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureMLServiceLinkedServiceArgs() {
        this.annotations = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.mlWorkspaceName = Codegen.empty();
        this.parameters = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.servicePrincipalId = Codegen.empty();
        this.servicePrincipalKey = Codegen.empty();
        this.subscriptionId = Codegen.empty();
        this.tenant = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLServiceLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private Output<Object> mlWorkspaceName;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private Output<Object> resourceGroupName;
        private @Nullable Output<Object> servicePrincipalId;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;
        private Output<Object> subscriptionId;
        private @Nullable Output<Object> tenant;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLServiceLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.mlWorkspaceName = defaults.mlWorkspaceName;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
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
        public Builder mlWorkspaceName(Output<Object> mlWorkspaceName) {
            this.mlWorkspaceName = Objects.requireNonNull(mlWorkspaceName);
            return this;
        }
        public Builder mlWorkspaceName(Object mlWorkspaceName) {
            this.mlWorkspaceName = Output.of(Objects.requireNonNull(mlWorkspaceName));
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
        public Builder resourceGroupName(Output<Object> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(Object resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
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
        public Builder subscriptionId(Output<Object> subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder subscriptionId(Object subscriptionId) {
            this.subscriptionId = Output.of(Objects.requireNonNull(subscriptionId));
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
        }        public AzureMLServiceLinkedServiceArgs build() {
            return new AzureMLServiceLinkedServiceArgs(annotations, connectVia, description, encryptedCredential, mlWorkspaceName, parameters, resourceGroupName, servicePrincipalId, servicePrincipalKey, subscriptionId, tenant, type);
        }
    }
}
