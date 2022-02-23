// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.machinelearningservices.enums.DatastoreTypeArm;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineLearningDatastoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineLearningDatastoreArgs Empty = new MachineLearningDatastoreArgs();

    /**
     * Account Key of storage account.
     * 
     */
    @InputImport(name="accountKey")
      private final @Nullable Input<String> accountKey;

    public Input<String> getAccountKey() {
        return this.accountKey == null ? Input.empty() : this.accountKey;
    }

    /**
     * The name of the storage account.
     * 
     */
    @InputImport(name="accountName")
      private final @Nullable Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName == null ? Input.empty() : this.accountName;
    }

    /**
     * The resource group the ADLS store belongs to. Defaults to selected resource group.
     * 
     */
    @InputImport(name="adlsResourceGroup")
      private final @Nullable Input<String> adlsResourceGroup;

    public Input<String> getAdlsResourceGroup() {
        return this.adlsResourceGroup == null ? Input.empty() : this.adlsResourceGroup;
    }

    /**
     * The ID of the subscription the ADLS store belongs to. Defaults to selected subscription.
     * 
     */
    @InputImport(name="adlsSubscriptionId")
      private final @Nullable Input<String> adlsSubscriptionId;

    public Input<String> getAdlsSubscriptionId() {
        return this.adlsSubscriptionId == null ? Input.empty() : this.adlsSubscriptionId;
    }

    /**
     * Authority url used to authenticate the user.
     * 
     */
    @InputImport(name="authorityUrl")
      private final @Nullable Input<String> authorityUrl;

    public Input<String> getAuthorityUrl() {
        return this.authorityUrl == null ? Input.empty() : this.authorityUrl;
    }

    /**
     * The service principal's client/application ID.
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * The service principal's secret.
     * 
     */
    @InputImport(name="clientSecret")
      private final @Nullable Input<String> clientSecret;

    public Input<String> getClientSecret() {
        return this.clientSecret == null ? Input.empty() : this.clientSecret;
    }

    /**
     * The name of the azure blob container.
     * 
     */
    @InputImport(name="containerName")
      private final @Nullable Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName == null ? Input.empty() : this.containerName;
    }

    /**
     * Specifies datastore type.
     * 
     */
    @InputImport(name="dataStoreType", required=true)
      private final Input<Either<String,DatastoreTypeArm>> dataStoreType;

    public Input<Either<String,DatastoreTypeArm>> getDataStoreType() {
        return this.dataStoreType;
    }

    /**
     * The database name.
     * 
     */
    @InputImport(name="databaseName")
      private final @Nullable Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName == null ? Input.empty() : this.databaseName;
    }

    /**
     * The Datastore name.
     * 
     */
    @InputImport(name="datastoreName")
      private final @Nullable Input<String> datastoreName;

    public Input<String> getDatastoreName() {
        return this.datastoreName == null ? Input.empty() : this.datastoreName;
    }

    /**
     * The description of the datastore.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The endpoint of the server.
     * 
     */
    @InputImport(name="endpoint")
      private final @Nullable Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    /**
     * This sets the ssl value of the server. Defaults to true if not set.
     * 
     */
    @InputImport(name="enforceSSL")
      private final @Nullable Input<Boolean> enforceSSL;

    public Input<Boolean> getEnforceSSL() {
        return this.enforceSSL == null ? Input.empty() : this.enforceSSL;
    }

    /**
     * The file system name of the ADLS Gen2.
     * 
     */
    @InputImport(name="fileSystem")
      private final @Nullable Input<String> fileSystem;

    public Input<String> getFileSystem() {
        return this.fileSystem == null ? Input.empty() : this.fileSystem;
    }

    /**
     * Include datastore secret in response.
     * 
     */
    @InputImport(name="includeSecret")
      private final @Nullable Input<Boolean> includeSecret;

    public Input<Boolean> getIncludeSecret() {
        return this.includeSecret == null ? Input.empty() : this.includeSecret;
    }

    /**
     * The name of the datastore.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The password.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The port number.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<String> port;

    public Input<String> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The protocol to be used
     * 
     */
    @InputImport(name="protocol")
      private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Determines what operations will be performed.
     * 
     */
    @InputImport(name="resourceUrl")
      private final @Nullable Input<String> resourceUrl;

    public Input<String> getResourceUrl() {
        return this.resourceUrl == null ? Input.empty() : this.resourceUrl;
    }

    /**
     * Sas Token of storage account.
     * 
     */
    @InputImport(name="sasToken")
      private final @Nullable Input<String> sasToken;

    public Input<String> getSasToken() {
        return this.sasToken == null ? Input.empty() : this.sasToken;
    }

    /**
     * The SQL/MySQL/PostgreSQL server name
     * 
     */
    @InputImport(name="serverName")
      private final @Nullable Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName == null ? Input.empty() : this.serverName;
    }

    /**
     * The name of the file share.
     * 
     */
    @InputImport(name="shareName")
      private final @Nullable Input<String> shareName;

    public Input<String> getShareName() {
        return this.shareName == null ? Input.empty() : this.shareName;
    }

    /**
     * Skip validation that ensures data can be loaded from the dataset before registration.
     * 
     */
    @InputImport(name="skipValidation")
      private final @Nullable Input<Boolean> skipValidation;

    public Input<Boolean> getSkipValidation() {
        return this.skipValidation == null ? Input.empty() : this.skipValidation;
    }

    /**
     * The resource group of the storage account. Defaults to selected resource group
     * 
     */
    @InputImport(name="storageAccountResourceGroup")
      private final @Nullable Input<String> storageAccountResourceGroup;

    public Input<String> getStorageAccountResourceGroup() {
        return this.storageAccountResourceGroup == null ? Input.empty() : this.storageAccountResourceGroup;
    }

    /**
     * The subscription ID of the storage account. Defaults to selected subscription
     * 
     */
    @InputImport(name="storageAccountSubscriptionId")
      private final @Nullable Input<String> storageAccountSubscriptionId;

    public Input<String> getStorageAccountSubscriptionId() {
        return this.storageAccountSubscriptionId == null ? Input.empty() : this.storageAccountSubscriptionId;
    }

    /**
     * The ADLS store name.
     * 
     */
    @InputImport(name="storeName")
      private final @Nullable Input<String> storeName;

    public Input<String> getStoreName() {
        return this.storeName == null ? Input.empty() : this.storeName;
    }

    /**
     * The service principal Tenant ID.
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    /**
     * The user ID.
     * 
     */
    @InputImport(name="userId")
      private final @Nullable Input<String> userId;

    public Input<String> getUserId() {
        return this.userId == null ? Input.empty() : this.userId;
    }

    /**
     * The username of the database user.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * If set to true, datastore support data access authenticated with Workspace MSI.
     * 
     */
    @InputImport(name="workspaceSystemAssignedIdentity")
      private final @Nullable Input<Boolean> workspaceSystemAssignedIdentity;

    public Input<Boolean> getWorkspaceSystemAssignedIdentity() {
        return this.workspaceSystemAssignedIdentity == null ? Input.empty() : this.workspaceSystemAssignedIdentity;
    }

    public MachineLearningDatastoreArgs(
        @Nullable Input<String> accountKey,
        @Nullable Input<String> accountName,
        @Nullable Input<String> adlsResourceGroup,
        @Nullable Input<String> adlsSubscriptionId,
        @Nullable Input<String> authorityUrl,
        @Nullable Input<String> clientId,
        @Nullable Input<String> clientSecret,
        @Nullable Input<String> containerName,
        Input<Either<String,DatastoreTypeArm>> dataStoreType,
        @Nullable Input<String> databaseName,
        @Nullable Input<String> datastoreName,
        @Nullable Input<String> description,
        @Nullable Input<String> endpoint,
        @Nullable Input<Boolean> enforceSSL,
        @Nullable Input<String> fileSystem,
        @Nullable Input<Boolean> includeSecret,
        @Nullable Input<String> name,
        @Nullable Input<String> password,
        @Nullable Input<String> port,
        @Nullable Input<String> protocol,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceUrl,
        @Nullable Input<String> sasToken,
        @Nullable Input<String> serverName,
        @Nullable Input<String> shareName,
        @Nullable Input<Boolean> skipValidation,
        @Nullable Input<String> storageAccountResourceGroup,
        @Nullable Input<String> storageAccountSubscriptionId,
        @Nullable Input<String> storeName,
        @Nullable Input<String> tenantId,
        @Nullable Input<String> userId,
        @Nullable Input<String> userName,
        Input<String> workspaceName,
        @Nullable Input<Boolean> workspaceSystemAssignedIdentity) {
        this.accountKey = accountKey;
        this.accountName = accountName;
        this.adlsResourceGroup = adlsResourceGroup;
        this.adlsSubscriptionId = adlsSubscriptionId;
        this.authorityUrl = authorityUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.containerName = containerName;
        this.dataStoreType = Objects.requireNonNull(dataStoreType, "expected parameter 'dataStoreType' to be non-null");
        this.databaseName = databaseName;
        this.datastoreName = datastoreName;
        this.description = description;
        this.endpoint = endpoint;
        this.enforceSSL = enforceSSL == null ? Input.ofNullable(true) : enforceSSL;
        this.fileSystem = fileSystem;
        this.includeSecret = includeSecret == null ? Input.ofNullable(true) : includeSecret;
        this.name = name;
        this.password = password;
        this.port = port;
        this.protocol = protocol;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceUrl = resourceUrl;
        this.sasToken = sasToken;
        this.serverName = serverName;
        this.shareName = shareName;
        this.skipValidation = skipValidation;
        this.storageAccountResourceGroup = storageAccountResourceGroup;
        this.storageAccountSubscriptionId = storageAccountSubscriptionId;
        this.storeName = storeName;
        this.tenantId = tenantId;
        this.userId = userId;
        this.userName = userName;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
        this.workspaceSystemAssignedIdentity = workspaceSystemAssignedIdentity;
    }

    private MachineLearningDatastoreArgs() {
        this.accountKey = Input.empty();
        this.accountName = Input.empty();
        this.adlsResourceGroup = Input.empty();
        this.adlsSubscriptionId = Input.empty();
        this.authorityUrl = Input.empty();
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
        this.containerName = Input.empty();
        this.dataStoreType = Input.empty();
        this.databaseName = Input.empty();
        this.datastoreName = Input.empty();
        this.description = Input.empty();
        this.endpoint = Input.empty();
        this.enforceSSL = Input.empty();
        this.fileSystem = Input.empty();
        this.includeSecret = Input.empty();
        this.name = Input.empty();
        this.password = Input.empty();
        this.port = Input.empty();
        this.protocol = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceUrl = Input.empty();
        this.sasToken = Input.empty();
        this.serverName = Input.empty();
        this.shareName = Input.empty();
        this.skipValidation = Input.empty();
        this.storageAccountResourceGroup = Input.empty();
        this.storageAccountSubscriptionId = Input.empty();
        this.storeName = Input.empty();
        this.tenantId = Input.empty();
        this.userId = Input.empty();
        this.userName = Input.empty();
        this.workspaceName = Input.empty();
        this.workspaceSystemAssignedIdentity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineLearningDatastoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountKey;
        private @Nullable Input<String> accountName;
        private @Nullable Input<String> adlsResourceGroup;
        private @Nullable Input<String> adlsSubscriptionId;
        private @Nullable Input<String> authorityUrl;
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> clientSecret;
        private @Nullable Input<String> containerName;
        private Input<Either<String,DatastoreTypeArm>> dataStoreType;
        private @Nullable Input<String> databaseName;
        private @Nullable Input<String> datastoreName;
        private @Nullable Input<String> description;
        private @Nullable Input<String> endpoint;
        private @Nullable Input<Boolean> enforceSSL;
        private @Nullable Input<String> fileSystem;
        private @Nullable Input<Boolean> includeSecret;
        private @Nullable Input<String> name;
        private @Nullable Input<String> password;
        private @Nullable Input<String> port;
        private @Nullable Input<String> protocol;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceUrl;
        private @Nullable Input<String> sasToken;
        private @Nullable Input<String> serverName;
        private @Nullable Input<String> shareName;
        private @Nullable Input<Boolean> skipValidation;
        private @Nullable Input<String> storageAccountResourceGroup;
        private @Nullable Input<String> storageAccountSubscriptionId;
        private @Nullable Input<String> storeName;
        private @Nullable Input<String> tenantId;
        private @Nullable Input<String> userId;
        private @Nullable Input<String> userName;
        private Input<String> workspaceName;
        private @Nullable Input<Boolean> workspaceSystemAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineLearningDatastoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.adlsResourceGroup = defaults.adlsResourceGroup;
    	      this.adlsSubscriptionId = defaults.adlsSubscriptionId;
    	      this.authorityUrl = defaults.authorityUrl;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.containerName = defaults.containerName;
    	      this.dataStoreType = defaults.dataStoreType;
    	      this.databaseName = defaults.databaseName;
    	      this.datastoreName = defaults.datastoreName;
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.enforceSSL = defaults.enforceSSL;
    	      this.fileSystem = defaults.fileSystem;
    	      this.includeSecret = defaults.includeSecret;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceUrl = defaults.resourceUrl;
    	      this.sasToken = defaults.sasToken;
    	      this.serverName = defaults.serverName;
    	      this.shareName = defaults.shareName;
    	      this.skipValidation = defaults.skipValidation;
    	      this.storageAccountResourceGroup = defaults.storageAccountResourceGroup;
    	      this.storageAccountSubscriptionId = defaults.storageAccountSubscriptionId;
    	      this.storeName = defaults.storeName;
    	      this.tenantId = defaults.tenantId;
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
    	      this.workspaceName = defaults.workspaceName;
    	      this.workspaceSystemAssignedIdentity = defaults.workspaceSystemAssignedIdentity;
        }

        public Builder setAccountKey(@Nullable Input<String> accountKey) {
            this.accountKey = accountKey;
            return this;
        }

        public Builder setAccountKey(@Nullable String accountKey) {
            this.accountKey = Input.ofNullable(accountKey);
            return this;
        }

        public Builder setAccountName(@Nullable Input<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder setAccountName(@Nullable String accountName) {
            this.accountName = Input.ofNullable(accountName);
            return this;
        }

        public Builder setAdlsResourceGroup(@Nullable Input<String> adlsResourceGroup) {
            this.adlsResourceGroup = adlsResourceGroup;
            return this;
        }

        public Builder setAdlsResourceGroup(@Nullable String adlsResourceGroup) {
            this.adlsResourceGroup = Input.ofNullable(adlsResourceGroup);
            return this;
        }

        public Builder setAdlsSubscriptionId(@Nullable Input<String> adlsSubscriptionId) {
            this.adlsSubscriptionId = adlsSubscriptionId;
            return this;
        }

        public Builder setAdlsSubscriptionId(@Nullable String adlsSubscriptionId) {
            this.adlsSubscriptionId = Input.ofNullable(adlsSubscriptionId);
            return this;
        }

        public Builder setAuthorityUrl(@Nullable Input<String> authorityUrl) {
            this.authorityUrl = authorityUrl;
            return this;
        }

        public Builder setAuthorityUrl(@Nullable String authorityUrl) {
            this.authorityUrl = Input.ofNullable(authorityUrl);
            return this;
        }

        public Builder setClientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder setClientSecret(@Nullable Input<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = Input.ofNullable(clientSecret);
            return this;
        }

        public Builder setContainerName(@Nullable Input<String> containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = Input.ofNullable(containerName);
            return this;
        }

        public Builder setDataStoreType(Input<Either<String,DatastoreTypeArm>> dataStoreType) {
            this.dataStoreType = Objects.requireNonNull(dataStoreType);
            return this;
        }

        public Builder setDataStoreType(Either<String,DatastoreTypeArm> dataStoreType) {
            this.dataStoreType = Input.of(Objects.requireNonNull(dataStoreType));
            return this;
        }

        public Builder setDatabaseName(@Nullable Input<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = Input.ofNullable(databaseName);
            return this;
        }

        public Builder setDatastoreName(@Nullable Input<String> datastoreName) {
            this.datastoreName = datastoreName;
            return this;
        }

        public Builder setDatastoreName(@Nullable String datastoreName) {
            this.datastoreName = Input.ofNullable(datastoreName);
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

        public Builder setEndpoint(@Nullable Input<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder setEnforceSSL(@Nullable Input<Boolean> enforceSSL) {
            this.enforceSSL = enforceSSL;
            return this;
        }

        public Builder setEnforceSSL(@Nullable Boolean enforceSSL) {
            this.enforceSSL = Input.ofNullable(enforceSSL);
            return this;
        }

        public Builder setFileSystem(@Nullable Input<String> fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        public Builder setFileSystem(@Nullable String fileSystem) {
            this.fileSystem = Input.ofNullable(fileSystem);
            return this;
        }

        public Builder setIncludeSecret(@Nullable Input<Boolean> includeSecret) {
            this.includeSecret = includeSecret;
            return this;
        }

        public Builder setIncludeSecret(@Nullable Boolean includeSecret) {
            this.includeSecret = Input.ofNullable(includeSecret);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setPort(@Nullable Input<String> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable String port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProtocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setResourceUrl(@Nullable Input<String> resourceUrl) {
            this.resourceUrl = resourceUrl;
            return this;
        }

        public Builder setResourceUrl(@Nullable String resourceUrl) {
            this.resourceUrl = Input.ofNullable(resourceUrl);
            return this;
        }

        public Builder setSasToken(@Nullable Input<String> sasToken) {
            this.sasToken = sasToken;
            return this;
        }

        public Builder setSasToken(@Nullable String sasToken) {
            this.sasToken = Input.ofNullable(sasToken);
            return this;
        }

        public Builder setServerName(@Nullable Input<String> serverName) {
            this.serverName = serverName;
            return this;
        }

        public Builder setServerName(@Nullable String serverName) {
            this.serverName = Input.ofNullable(serverName);
            return this;
        }

        public Builder setShareName(@Nullable Input<String> shareName) {
            this.shareName = shareName;
            return this;
        }

        public Builder setShareName(@Nullable String shareName) {
            this.shareName = Input.ofNullable(shareName);
            return this;
        }

        public Builder setSkipValidation(@Nullable Input<Boolean> skipValidation) {
            this.skipValidation = skipValidation;
            return this;
        }

        public Builder setSkipValidation(@Nullable Boolean skipValidation) {
            this.skipValidation = Input.ofNullable(skipValidation);
            return this;
        }

        public Builder setStorageAccountResourceGroup(@Nullable Input<String> storageAccountResourceGroup) {
            this.storageAccountResourceGroup = storageAccountResourceGroup;
            return this;
        }

        public Builder setStorageAccountResourceGroup(@Nullable String storageAccountResourceGroup) {
            this.storageAccountResourceGroup = Input.ofNullable(storageAccountResourceGroup);
            return this;
        }

        public Builder setStorageAccountSubscriptionId(@Nullable Input<String> storageAccountSubscriptionId) {
            this.storageAccountSubscriptionId = storageAccountSubscriptionId;
            return this;
        }

        public Builder setStorageAccountSubscriptionId(@Nullable String storageAccountSubscriptionId) {
            this.storageAccountSubscriptionId = Input.ofNullable(storageAccountSubscriptionId);
            return this;
        }

        public Builder setStoreName(@Nullable Input<String> storeName) {
            this.storeName = storeName;
            return this;
        }

        public Builder setStoreName(@Nullable String storeName) {
            this.storeName = Input.ofNullable(storeName);
            return this;
        }

        public Builder setTenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }

        public Builder setUserId(@Nullable Input<String> userId) {
            this.userId = userId;
            return this;
        }

        public Builder setUserId(@Nullable String userId) {
            this.userId = Input.ofNullable(userId);
            return this;
        }

        public Builder setUserName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public Builder setWorkspaceSystemAssignedIdentity(@Nullable Input<Boolean> workspaceSystemAssignedIdentity) {
            this.workspaceSystemAssignedIdentity = workspaceSystemAssignedIdentity;
            return this;
        }

        public Builder setWorkspaceSystemAssignedIdentity(@Nullable Boolean workspaceSystemAssignedIdentity) {
            this.workspaceSystemAssignedIdentity = Input.ofNullable(workspaceSystemAssignedIdentity);
            return this;
        }
        public MachineLearningDatastoreArgs build() {
            return new MachineLearningDatastoreArgs(accountKey, accountName, adlsResourceGroup, adlsSubscriptionId, authorityUrl, clientId, clientSecret, containerName, dataStoreType, databaseName, datastoreName, description, endpoint, enforceSSL, fileSystem, includeSecret, name, password, port, protocol, resourceGroupName, resourceUrl, sasToken, serverName, shareName, skipValidation, storageAccountResourceGroup, storageAccountSubscriptionId, storeName, tenantId, userId, userName, workspaceName, workspaceSystemAssignedIdentity);
        }
    }
}
