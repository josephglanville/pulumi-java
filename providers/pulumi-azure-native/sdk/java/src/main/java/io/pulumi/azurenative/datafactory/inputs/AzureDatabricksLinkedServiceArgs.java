// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
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


public final class AzureDatabricksLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureDatabricksLinkedServiceArgs Empty = new AzureDatabricksLinkedServiceArgs();

    @InputImport(name="accessToken")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getAccessToken() {
        return this.accessToken == null ? Input.empty() : this.accessToken;
    }

    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    @InputImport(name="authentication")
    private final @Nullable Input<Object> authentication;

    public Input<Object> getAuthentication() {
        return this.authentication == null ? Input.empty() : this.authentication;
    }

    @InputImport(name="connectVia")
    private final @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;

    public Input<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Input.empty() : this.connectVia;
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

    @InputImport(name="domain", required=true)
    private final Input<Object> domain;

    public Input<Object> getDomain() {
        return this.domain;
    }

    @InputImport(name="encryptedCredential")
    private final @Nullable Input<Object> encryptedCredential;

    public Input<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Input.empty() : this.encryptedCredential;
    }

    @InputImport(name="existingClusterId")
    private final @Nullable Input<Object> existingClusterId;

    public Input<Object> getExistingClusterId() {
        return this.existingClusterId == null ? Input.empty() : this.existingClusterId;
    }

    @InputImport(name="instancePoolId")
    private final @Nullable Input<Object> instancePoolId;

    public Input<Object> getInstancePoolId() {
        return this.instancePoolId == null ? Input.empty() : this.instancePoolId;
    }

    @InputImport(name="newClusterCustomTags")
    private final @Nullable Input<Map<String,Object>> newClusterCustomTags;

    public Input<Map<String,Object>> getNewClusterCustomTags() {
        return this.newClusterCustomTags == null ? Input.empty() : this.newClusterCustomTags;
    }

    @InputImport(name="newClusterDriverNodeType")
    private final @Nullable Input<Object> newClusterDriverNodeType;

    public Input<Object> getNewClusterDriverNodeType() {
        return this.newClusterDriverNodeType == null ? Input.empty() : this.newClusterDriverNodeType;
    }

    @InputImport(name="newClusterEnableElasticDisk")
    private final @Nullable Input<Object> newClusterEnableElasticDisk;

    public Input<Object> getNewClusterEnableElasticDisk() {
        return this.newClusterEnableElasticDisk == null ? Input.empty() : this.newClusterEnableElasticDisk;
    }

    @InputImport(name="newClusterInitScripts")
    private final @Nullable Input<Object> newClusterInitScripts;

    public Input<Object> getNewClusterInitScripts() {
        return this.newClusterInitScripts == null ? Input.empty() : this.newClusterInitScripts;
    }

    @InputImport(name="newClusterLogDestination")
    private final @Nullable Input<Object> newClusterLogDestination;

    public Input<Object> getNewClusterLogDestination() {
        return this.newClusterLogDestination == null ? Input.empty() : this.newClusterLogDestination;
    }

    @InputImport(name="newClusterNodeType")
    private final @Nullable Input<Object> newClusterNodeType;

    public Input<Object> getNewClusterNodeType() {
        return this.newClusterNodeType == null ? Input.empty() : this.newClusterNodeType;
    }

    @InputImport(name="newClusterNumOfWorker")
    private final @Nullable Input<Object> newClusterNumOfWorker;

    public Input<Object> getNewClusterNumOfWorker() {
        return this.newClusterNumOfWorker == null ? Input.empty() : this.newClusterNumOfWorker;
    }

    @InputImport(name="newClusterSparkConf")
    private final @Nullable Input<Map<String,Object>> newClusterSparkConf;

    public Input<Map<String,Object>> getNewClusterSparkConf() {
        return this.newClusterSparkConf == null ? Input.empty() : this.newClusterSparkConf;
    }

    @InputImport(name="newClusterSparkEnvVars")
    private final @Nullable Input<Map<String,Object>> newClusterSparkEnvVars;

    public Input<Map<String,Object>> getNewClusterSparkEnvVars() {
        return this.newClusterSparkEnvVars == null ? Input.empty() : this.newClusterSparkEnvVars;
    }

    @InputImport(name="newClusterVersion")
    private final @Nullable Input<Object> newClusterVersion;

    public Input<Object> getNewClusterVersion() {
        return this.newClusterVersion == null ? Input.empty() : this.newClusterVersion;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    @InputImport(name="policyId")
    private final @Nullable Input<Object> policyId;

    public Input<Object> getPolicyId() {
        return this.policyId == null ? Input.empty() : this.policyId;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    @InputImport(name="workspaceResourceId")
    private final @Nullable Input<Object> workspaceResourceId;

    public Input<Object> getWorkspaceResourceId() {
        return this.workspaceResourceId == null ? Input.empty() : this.workspaceResourceId;
    }

    public AzureDatabricksLinkedServiceArgs(
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken,
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<Object> authentication,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<CredentialReferenceArgs> credential,
        @Nullable Input<String> description,
        Input<Object> domain,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Object> existingClusterId,
        @Nullable Input<Object> instancePoolId,
        @Nullable Input<Map<String,Object>> newClusterCustomTags,
        @Nullable Input<Object> newClusterDriverNodeType,
        @Nullable Input<Object> newClusterEnableElasticDisk,
        @Nullable Input<Object> newClusterInitScripts,
        @Nullable Input<Object> newClusterLogDestination,
        @Nullable Input<Object> newClusterNodeType,
        @Nullable Input<Object> newClusterNumOfWorker,
        @Nullable Input<Map<String,Object>> newClusterSparkConf,
        @Nullable Input<Map<String,Object>> newClusterSparkEnvVars,
        @Nullable Input<Object> newClusterVersion,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Object> policyId,
        Input<String> type,
        @Nullable Input<Object> workspaceResourceId) {
        this.accessToken = accessToken;
        this.annotations = annotations;
        this.authentication = authentication;
        this.connectVia = connectVia;
        this.credential = credential;
        this.description = description;
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.encryptedCredential = encryptedCredential;
        this.existingClusterId = existingClusterId;
        this.instancePoolId = instancePoolId;
        this.newClusterCustomTags = newClusterCustomTags;
        this.newClusterDriverNodeType = newClusterDriverNodeType;
        this.newClusterEnableElasticDisk = newClusterEnableElasticDisk;
        this.newClusterInitScripts = newClusterInitScripts;
        this.newClusterLogDestination = newClusterLogDestination;
        this.newClusterNodeType = newClusterNodeType;
        this.newClusterNumOfWorker = newClusterNumOfWorker;
        this.newClusterSparkConf = newClusterSparkConf;
        this.newClusterSparkEnvVars = newClusterSparkEnvVars;
        this.newClusterVersion = newClusterVersion;
        this.parameters = parameters;
        this.policyId = policyId;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.workspaceResourceId = workspaceResourceId;
    }

    private AzureDatabricksLinkedServiceArgs() {
        this.accessToken = Input.empty();
        this.annotations = Input.empty();
        this.authentication = Input.empty();
        this.connectVia = Input.empty();
        this.credential = Input.empty();
        this.description = Input.empty();
        this.domain = Input.empty();
        this.encryptedCredential = Input.empty();
        this.existingClusterId = Input.empty();
        this.instancePoolId = Input.empty();
        this.newClusterCustomTags = Input.empty();
        this.newClusterDriverNodeType = Input.empty();
        this.newClusterEnableElasticDisk = Input.empty();
        this.newClusterInitScripts = Input.empty();
        this.newClusterLogDestination = Input.empty();
        this.newClusterNodeType = Input.empty();
        this.newClusterNumOfWorker = Input.empty();
        this.newClusterSparkConf = Input.empty();
        this.newClusterSparkEnvVars = Input.empty();
        this.newClusterVersion = Input.empty();
        this.parameters = Input.empty();
        this.policyId = Input.empty();
        this.type = Input.empty();
        this.workspaceResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDatabricksLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken;
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<Object> authentication;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<CredentialReferenceArgs> credential;
        private @Nullable Input<String> description;
        private Input<Object> domain;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Object> existingClusterId;
        private @Nullable Input<Object> instancePoolId;
        private @Nullable Input<Map<String,Object>> newClusterCustomTags;
        private @Nullable Input<Object> newClusterDriverNodeType;
        private @Nullable Input<Object> newClusterEnableElasticDisk;
        private @Nullable Input<Object> newClusterInitScripts;
        private @Nullable Input<Object> newClusterLogDestination;
        private @Nullable Input<Object> newClusterNodeType;
        private @Nullable Input<Object> newClusterNumOfWorker;
        private @Nullable Input<Map<String,Object>> newClusterSparkConf;
        private @Nullable Input<Map<String,Object>> newClusterSparkEnvVars;
        private @Nullable Input<Object> newClusterVersion;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Object> policyId;
        private Input<String> type;
        private @Nullable Input<Object> workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDatabricksLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.annotations = defaults.annotations;
    	      this.authentication = defaults.authentication;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.domain = defaults.domain;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.existingClusterId = defaults.existingClusterId;
    	      this.instancePoolId = defaults.instancePoolId;
    	      this.newClusterCustomTags = defaults.newClusterCustomTags;
    	      this.newClusterDriverNodeType = defaults.newClusterDriverNodeType;
    	      this.newClusterEnableElasticDisk = defaults.newClusterEnableElasticDisk;
    	      this.newClusterInitScripts = defaults.newClusterInitScripts;
    	      this.newClusterLogDestination = defaults.newClusterLogDestination;
    	      this.newClusterNodeType = defaults.newClusterNodeType;
    	      this.newClusterNumOfWorker = defaults.newClusterNumOfWorker;
    	      this.newClusterSparkConf = defaults.newClusterSparkConf;
    	      this.newClusterSparkEnvVars = defaults.newClusterSparkEnvVars;
    	      this.newClusterVersion = defaults.newClusterVersion;
    	      this.parameters = defaults.parameters;
    	      this.policyId = defaults.policyId;
    	      this.type = defaults.type;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder setAccessToken(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setAccessToken(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> accessToken) {
            this.accessToken = Input.ofNullable(accessToken);
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

        public Builder setAuthentication(@Nullable Input<Object> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setAuthentication(@Nullable Object authentication) {
            this.authentication = Input.ofNullable(authentication);
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

        public Builder setDomain(Input<Object> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setDomain(Object domain) {
            this.domain = Input.of(Objects.requireNonNull(domain));
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

        public Builder setExistingClusterId(@Nullable Input<Object> existingClusterId) {
            this.existingClusterId = existingClusterId;
            return this;
        }

        public Builder setExistingClusterId(@Nullable Object existingClusterId) {
            this.existingClusterId = Input.ofNullable(existingClusterId);
            return this;
        }

        public Builder setInstancePoolId(@Nullable Input<Object> instancePoolId) {
            this.instancePoolId = instancePoolId;
            return this;
        }

        public Builder setInstancePoolId(@Nullable Object instancePoolId) {
            this.instancePoolId = Input.ofNullable(instancePoolId);
            return this;
        }

        public Builder setNewClusterCustomTags(@Nullable Input<Map<String,Object>> newClusterCustomTags) {
            this.newClusterCustomTags = newClusterCustomTags;
            return this;
        }

        public Builder setNewClusterCustomTags(@Nullable Map<String,Object> newClusterCustomTags) {
            this.newClusterCustomTags = Input.ofNullable(newClusterCustomTags);
            return this;
        }

        public Builder setNewClusterDriverNodeType(@Nullable Input<Object> newClusterDriverNodeType) {
            this.newClusterDriverNodeType = newClusterDriverNodeType;
            return this;
        }

        public Builder setNewClusterDriverNodeType(@Nullable Object newClusterDriverNodeType) {
            this.newClusterDriverNodeType = Input.ofNullable(newClusterDriverNodeType);
            return this;
        }

        public Builder setNewClusterEnableElasticDisk(@Nullable Input<Object> newClusterEnableElasticDisk) {
            this.newClusterEnableElasticDisk = newClusterEnableElasticDisk;
            return this;
        }

        public Builder setNewClusterEnableElasticDisk(@Nullable Object newClusterEnableElasticDisk) {
            this.newClusterEnableElasticDisk = Input.ofNullable(newClusterEnableElasticDisk);
            return this;
        }

        public Builder setNewClusterInitScripts(@Nullable Input<Object> newClusterInitScripts) {
            this.newClusterInitScripts = newClusterInitScripts;
            return this;
        }

        public Builder setNewClusterInitScripts(@Nullable Object newClusterInitScripts) {
            this.newClusterInitScripts = Input.ofNullable(newClusterInitScripts);
            return this;
        }

        public Builder setNewClusterLogDestination(@Nullable Input<Object> newClusterLogDestination) {
            this.newClusterLogDestination = newClusterLogDestination;
            return this;
        }

        public Builder setNewClusterLogDestination(@Nullable Object newClusterLogDestination) {
            this.newClusterLogDestination = Input.ofNullable(newClusterLogDestination);
            return this;
        }

        public Builder setNewClusterNodeType(@Nullable Input<Object> newClusterNodeType) {
            this.newClusterNodeType = newClusterNodeType;
            return this;
        }

        public Builder setNewClusterNodeType(@Nullable Object newClusterNodeType) {
            this.newClusterNodeType = Input.ofNullable(newClusterNodeType);
            return this;
        }

        public Builder setNewClusterNumOfWorker(@Nullable Input<Object> newClusterNumOfWorker) {
            this.newClusterNumOfWorker = newClusterNumOfWorker;
            return this;
        }

        public Builder setNewClusterNumOfWorker(@Nullable Object newClusterNumOfWorker) {
            this.newClusterNumOfWorker = Input.ofNullable(newClusterNumOfWorker);
            return this;
        }

        public Builder setNewClusterSparkConf(@Nullable Input<Map<String,Object>> newClusterSparkConf) {
            this.newClusterSparkConf = newClusterSparkConf;
            return this;
        }

        public Builder setNewClusterSparkConf(@Nullable Map<String,Object> newClusterSparkConf) {
            this.newClusterSparkConf = Input.ofNullable(newClusterSparkConf);
            return this;
        }

        public Builder setNewClusterSparkEnvVars(@Nullable Input<Map<String,Object>> newClusterSparkEnvVars) {
            this.newClusterSparkEnvVars = newClusterSparkEnvVars;
            return this;
        }

        public Builder setNewClusterSparkEnvVars(@Nullable Map<String,Object> newClusterSparkEnvVars) {
            this.newClusterSparkEnvVars = Input.ofNullable(newClusterSparkEnvVars);
            return this;
        }

        public Builder setNewClusterVersion(@Nullable Input<Object> newClusterVersion) {
            this.newClusterVersion = newClusterVersion;
            return this;
        }

        public Builder setNewClusterVersion(@Nullable Object newClusterVersion) {
            this.newClusterVersion = Input.ofNullable(newClusterVersion);
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

        public Builder setPolicyId(@Nullable Input<Object> policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setPolicyId(@Nullable Object policyId) {
            this.policyId = Input.ofNullable(policyId);
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

        public Builder setWorkspaceResourceId(@Nullable Input<Object> workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }

        public Builder setWorkspaceResourceId(@Nullable Object workspaceResourceId) {
            this.workspaceResourceId = Input.ofNullable(workspaceResourceId);
            return this;
        }

        public AzureDatabricksLinkedServiceArgs build() {
            return new AzureDatabricksLinkedServiceArgs(accessToken, annotations, authentication, connectVia, credential, description, domain, encryptedCredential, existingClusterId, instancePoolId, newClusterCustomTags, newClusterDriverNodeType, newClusterEnableElasticDisk, newClusterInitScripts, newClusterLogDestination, newClusterNodeType, newClusterNumOfWorker, newClusterSparkConf, newClusterSparkEnvVars, newClusterVersion, parameters, policyId, type, workspaceResourceId);
        }
    }
}
