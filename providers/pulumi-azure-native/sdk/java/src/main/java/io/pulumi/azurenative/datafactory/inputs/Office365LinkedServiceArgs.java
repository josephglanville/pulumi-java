// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

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
 * Office365 linked service.
 * 
 */
public final class Office365LinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final Office365LinkedServiceArgs Empty = new Office365LinkedServiceArgs();

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
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
      private final @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;

    public Input<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Input.empty() : this.connectVia;
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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
      private final @Nullable Input<Object> encryptedCredential;

    public Input<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Input.empty() : this.encryptedCredential;
    }

    /**
     * Azure tenant ID to which the Office 365 account belongs. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="office365TenantId", required=true)
      private final Input<Object> office365TenantId;

    public Input<Object> getOffice365TenantId() {
        return this.office365TenantId;
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
     * Specify the application's client ID. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="servicePrincipalId", required=true)
      private final Input<Object> servicePrincipalId;

    public Input<Object> getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Specify the application's key.
     * 
     */
    @InputImport(name="servicePrincipalKey", required=true)
      private final Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Specify the tenant information under which your Azure AD web application resides. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="servicePrincipalTenantId", required=true)
      private final Input<Object> servicePrincipalTenantId;

    public Input<Object> getServicePrincipalTenantId() {
        return this.servicePrincipalTenantId;
    }

    /**
     * Type of linked service.
     * Expected value is 'Office365'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public Office365LinkedServiceArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        Input<Object> office365TenantId,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        Input<Object> servicePrincipalId,
        Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey,
        Input<Object> servicePrincipalTenantId,
        Input<String> type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.office365TenantId = Objects.requireNonNull(office365TenantId, "expected parameter 'office365TenantId' to be non-null");
        this.parameters = parameters;
        this.servicePrincipalId = Objects.requireNonNull(servicePrincipalId, "expected parameter 'servicePrincipalId' to be non-null");
        this.servicePrincipalKey = Objects.requireNonNull(servicePrincipalKey, "expected parameter 'servicePrincipalKey' to be non-null");
        this.servicePrincipalTenantId = Objects.requireNonNull(servicePrincipalTenantId, "expected parameter 'servicePrincipalTenantId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private Office365LinkedServiceArgs() {
        this.annotations = Input.empty();
        this.connectVia = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.office365TenantId = Input.empty();
        this.parameters = Input.empty();
        this.servicePrincipalId = Input.empty();
        this.servicePrincipalKey = Input.empty();
        this.servicePrincipalTenantId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Office365LinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private Input<Object> office365TenantId;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private Input<Object> servicePrincipalId;
        private Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;
        private Input<Object> servicePrincipalTenantId;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(Office365LinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.office365TenantId = defaults.office365TenantId;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.servicePrincipalTenantId = defaults.servicePrincipalTenantId;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
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

        public Builder setOffice365TenantId(Input<Object> office365TenantId) {
            this.office365TenantId = Objects.requireNonNull(office365TenantId);
            return this;
        }

        public Builder setOffice365TenantId(Object office365TenantId) {
            this.office365TenantId = Input.of(Objects.requireNonNull(office365TenantId));
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

        public Builder setServicePrincipalId(Input<Object> servicePrincipalId) {
            this.servicePrincipalId = Objects.requireNonNull(servicePrincipalId);
            return this;
        }

        public Builder setServicePrincipalId(Object servicePrincipalId) {
            this.servicePrincipalId = Input.of(Objects.requireNonNull(servicePrincipalId));
            return this;
        }

        public Builder setServicePrincipalKey(Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            this.servicePrincipalKey = Objects.requireNonNull(servicePrincipalKey);
            return this;
        }

        public Builder setServicePrincipalKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            this.servicePrincipalKey = Input.of(Objects.requireNonNull(servicePrincipalKey));
            return this;
        }

        public Builder setServicePrincipalTenantId(Input<Object> servicePrincipalTenantId) {
            this.servicePrincipalTenantId = Objects.requireNonNull(servicePrincipalTenantId);
            return this;
        }

        public Builder setServicePrincipalTenantId(Object servicePrincipalTenantId) {
            this.servicePrincipalTenantId = Input.of(Objects.requireNonNull(servicePrincipalTenantId));
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
        public Office365LinkedServiceArgs build() {
            return new Office365LinkedServiceArgs(annotations, connectVia, description, encryptedCredential, office365TenantId, parameters, servicePrincipalId, servicePrincipalKey, servicePrincipalTenantId, type);
        }
    }
}
