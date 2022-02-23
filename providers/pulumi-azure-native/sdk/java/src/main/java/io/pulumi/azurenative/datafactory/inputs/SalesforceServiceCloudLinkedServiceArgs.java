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
 * Linked service for Salesforce Service Cloud.
 * 
 */
public final class SalesforceServiceCloudLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SalesforceServiceCloudLinkedServiceArgs Empty = new SalesforceServiceCloudLinkedServiceArgs();

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
     * The Salesforce API version used in ADF. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="apiVersion")
      private final @Nullable Input<Object> apiVersion;

    public Input<Object> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
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
     * The URL of Salesforce Service Cloud instance. Default is 'https://login.salesforce.com'. To copy data from sandbox, specify 'https://test.salesforce.com'. To copy data from custom domain, specify, for example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="environmentUrl")
      private final @Nullable Input<Object> environmentUrl;

    public Input<Object> getEnvironmentUrl() {
        return this.environmentUrl == null ? Input.empty() : this.environmentUrl;
    }

    /**
     * Extended properties appended to the connection string. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="extendedProperties")
      private final @Nullable Input<Object> extendedProperties;

    public Input<Object> getExtendedProperties() {
        return this.extendedProperties == null ? Input.empty() : this.extendedProperties;
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
     * The password for Basic authentication of the Salesforce instance.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The security token is optional to remotely access Salesforce instance.
     * 
     */
    @InputImport(name="securityToken")
      private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> securityToken;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getSecurityToken() {
        return this.securityToken == null ? Input.empty() : this.securityToken;
    }

    /**
     * Type of linked service.
     * Expected value is 'SalesforceServiceCloud'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The username for Basic authentication of the Salesforce instance. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="username")
      private final @Nullable Input<Object> username;

    public Input<Object> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public SalesforceServiceCloudLinkedServiceArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<Object> apiVersion,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Object> environmentUrl,
        @Nullable Input<Object> extendedProperties,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> securityToken,
        Input<String> type,
        @Nullable Input<Object> username) {
        this.annotations = annotations;
        this.apiVersion = apiVersion;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.environmentUrl = environmentUrl;
        this.extendedProperties = extendedProperties;
        this.parameters = parameters;
        this.password = password;
        this.securityToken = securityToken;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.username = username;
    }

    private SalesforceServiceCloudLinkedServiceArgs() {
        this.annotations = Input.empty();
        this.apiVersion = Input.empty();
        this.connectVia = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.environmentUrl = Input.empty();
        this.extendedProperties = Input.empty();
        this.parameters = Input.empty();
        this.password = Input.empty();
        this.securityToken = Input.empty();
        this.type = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SalesforceServiceCloudLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<Object> apiVersion;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Object> environmentUrl;
        private @Nullable Input<Object> extendedProperties;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> securityToken;
        private Input<String> type;
        private @Nullable Input<Object> username;

        public Builder() {
    	      // Empty
        }

        public Builder(SalesforceServiceCloudLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.apiVersion = defaults.apiVersion;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.environmentUrl = defaults.environmentUrl;
    	      this.extendedProperties = defaults.extendedProperties;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.securityToken = defaults.securityToken;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setApiVersion(@Nullable Input<Object> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable Object apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
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

        public Builder setEnvironmentUrl(@Nullable Input<Object> environmentUrl) {
            this.environmentUrl = environmentUrl;
            return this;
        }

        public Builder setEnvironmentUrl(@Nullable Object environmentUrl) {
            this.environmentUrl = Input.ofNullable(environmentUrl);
            return this;
        }

        public Builder setExtendedProperties(@Nullable Input<Object> extendedProperties) {
            this.extendedProperties = extendedProperties;
            return this;
        }

        public Builder setExtendedProperties(@Nullable Object extendedProperties) {
            this.extendedProperties = Input.ofNullable(extendedProperties);
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

        public Builder setSecurityToken(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        public Builder setSecurityToken(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> securityToken) {
            this.securityToken = Input.ofNullable(securityToken);
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
        public SalesforceServiceCloudLinkedServiceArgs build() {
            return new SalesforceServiceCloudLinkedServiceArgs(annotations, apiVersion, connectVia, description, encryptedCredential, environmentUrl, extendedProperties, parameters, password, securityToken, type, username);
        }
    }
}
