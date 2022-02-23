// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.documentdb.inputs.RoleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MongoDBResourceMongoUserDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MongoDBResourceMongoUserDefinitionArgs Empty = new MongoDBResourceMongoUserDefinitionArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * A custom definition for the USer Definition.
     * 
     */
    @InputImport(name="customData")
      private final @Nullable Input<String> customData;

    public Input<String> getCustomData() {
        return this.customData == null ? Input.empty() : this.customData;
    }

    /**
     * The database name for which access is being granted for this User Definition.
     * 
     */
    @InputImport(name="databaseName")
      private final @Nullable Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName == null ? Input.empty() : this.databaseName;
    }

    /**
     * The Mongo Auth mechanism. For now, we only support auth mechanism SCRAM-SHA-256.
     * 
     */
    @InputImport(name="mechanisms")
      private final @Nullable Input<String> mechanisms;

    public Input<String> getMechanisms() {
        return this.mechanisms == null ? Input.empty() : this.mechanisms;
    }

    /**
     * The ID for the User Definition {dbName.userName}.
     * 
     */
    @InputImport(name="mongoUserDefinitionId")
      private final @Nullable Input<String> mongoUserDefinitionId;

    public Input<String> getMongoUserDefinitionId() {
        return this.mongoUserDefinitionId == null ? Input.empty() : this.mongoUserDefinitionId;
    }

    /**
     * The password for User Definition. Response does not contain user password.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The set of roles inherited by the User Definition.
     * 
     */
    @InputImport(name="roles")
      private final @Nullable Input<List<RoleArgs>> roles;

    public Input<List<RoleArgs>> getRoles() {
        return this.roles == null ? Input.empty() : this.roles;
    }

    /**
     * The user name for User Definition.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public MongoDBResourceMongoUserDefinitionArgs(
        Input<String> accountName,
        @Nullable Input<String> customData,
        @Nullable Input<String> databaseName,
        @Nullable Input<String> mechanisms,
        @Nullable Input<String> mongoUserDefinitionId,
        @Nullable Input<String> password,
        Input<String> resourceGroupName,
        @Nullable Input<List<RoleArgs>> roles,
        @Nullable Input<String> userName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.customData = customData;
        this.databaseName = databaseName;
        this.mechanisms = mechanisms;
        this.mongoUserDefinitionId = mongoUserDefinitionId;
        this.password = password;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.roles = roles;
        this.userName = userName;
    }

    private MongoDBResourceMongoUserDefinitionArgs() {
        this.accountName = Input.empty();
        this.customData = Input.empty();
        this.databaseName = Input.empty();
        this.mechanisms = Input.empty();
        this.mongoUserDefinitionId = Input.empty();
        this.password = Input.empty();
        this.resourceGroupName = Input.empty();
        this.roles = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDBResourceMongoUserDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> customData;
        private @Nullable Input<String> databaseName;
        private @Nullable Input<String> mechanisms;
        private @Nullable Input<String> mongoUserDefinitionId;
        private @Nullable Input<String> password;
        private Input<String> resourceGroupName;
        private @Nullable Input<List<RoleArgs>> roles;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDBResourceMongoUserDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.customData = defaults.customData;
    	      this.databaseName = defaults.databaseName;
    	      this.mechanisms = defaults.mechanisms;
    	      this.mongoUserDefinitionId = defaults.mongoUserDefinitionId;
    	      this.password = defaults.password;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roles = defaults.roles;
    	      this.userName = defaults.userName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setCustomData(@Nullable Input<String> customData) {
            this.customData = customData;
            return this;
        }

        public Builder setCustomData(@Nullable String customData) {
            this.customData = Input.ofNullable(customData);
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

        public Builder setMechanisms(@Nullable Input<String> mechanisms) {
            this.mechanisms = mechanisms;
            return this;
        }

        public Builder setMechanisms(@Nullable String mechanisms) {
            this.mechanisms = Input.ofNullable(mechanisms);
            return this;
        }

        public Builder setMongoUserDefinitionId(@Nullable Input<String> mongoUserDefinitionId) {
            this.mongoUserDefinitionId = mongoUserDefinitionId;
            return this;
        }

        public Builder setMongoUserDefinitionId(@Nullable String mongoUserDefinitionId) {
            this.mongoUserDefinitionId = Input.ofNullable(mongoUserDefinitionId);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRoles(@Nullable Input<List<RoleArgs>> roles) {
            this.roles = roles;
            return this;
        }

        public Builder setRoles(@Nullable List<RoleArgs> roles) {
            this.roles = Input.ofNullable(roles);
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
        public MongoDBResourceMongoUserDefinitionArgs build() {
            return new MongoDBResourceMongoUserDefinitionArgs(accountName, customData, databaseName, mechanisms, mongoUserDefinitionId, password, resourceGroupName, roles, userName);
        }
    }
}
