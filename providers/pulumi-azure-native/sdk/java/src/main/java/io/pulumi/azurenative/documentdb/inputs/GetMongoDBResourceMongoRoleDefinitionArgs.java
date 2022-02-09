// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMongoDBResourceMongoRoleDefinitionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMongoDBResourceMongoRoleDefinitionArgs Empty = new GetMongoDBResourceMongoRoleDefinitionArgs();

    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    @InputImport(name="mongoRoleDefinitionId", required=true)
    private final String mongoRoleDefinitionId;

    public String getMongoRoleDefinitionId() {
        return this.mongoRoleDefinitionId;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetMongoDBResourceMongoRoleDefinitionArgs(
        String accountName,
        String mongoRoleDefinitionId,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.mongoRoleDefinitionId = Objects.requireNonNull(mongoRoleDefinitionId, "expected parameter 'mongoRoleDefinitionId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetMongoDBResourceMongoRoleDefinitionArgs() {
        this.accountName = null;
        this.mongoRoleDefinitionId = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMongoDBResourceMongoRoleDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String mongoRoleDefinitionId;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMongoDBResourceMongoRoleDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.mongoRoleDefinitionId = defaults.mongoRoleDefinitionId;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setMongoRoleDefinitionId(String mongoRoleDefinitionId) {
            this.mongoRoleDefinitionId = Objects.requireNonNull(mongoRoleDefinitionId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetMongoDBResourceMongoRoleDefinitionArgs build() {
            return new GetMongoDBResourceMongoRoleDefinitionArgs(accountName, mongoRoleDefinitionId, resourceGroupName);
        }
    }
}
