// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSqlResourceSqlUserDefinedFunctionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSqlResourceSqlUserDefinedFunctionArgs Empty = new GetSqlResourceSqlUserDefinedFunctionArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Cosmos DB container name.
     * 
     */
    @Import(name="containerName", required=true)
      private final String containerName;

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * Cosmos DB database name.
     * 
     */
    @Import(name="databaseName", required=true)
      private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Cosmos DB userDefinedFunction name.
     * 
     */
    @Import(name="userDefinedFunctionName", required=true)
      private final String userDefinedFunctionName;

    public String getUserDefinedFunctionName() {
        return this.userDefinedFunctionName;
    }

    public GetSqlResourceSqlUserDefinedFunctionArgs(
        String accountName,
        String containerName,
        String databaseName,
        String resourceGroupName,
        String userDefinedFunctionName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.userDefinedFunctionName = Objects.requireNonNull(userDefinedFunctionName, "expected parameter 'userDefinedFunctionName' to be non-null");
    }

    private GetSqlResourceSqlUserDefinedFunctionArgs() {
        this.accountName = null;
        this.containerName = null;
        this.databaseName = null;
        this.resourceGroupName = null;
        this.userDefinedFunctionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlResourceSqlUserDefinedFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String containerName;
        private String databaseName;
        private String resourceGroupName;
        private String userDefinedFunctionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlResourceSqlUserDefinedFunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.containerName = defaults.containerName;
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.userDefinedFunctionName = defaults.userDefinedFunctionName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder userDefinedFunctionName(String userDefinedFunctionName) {
            this.userDefinedFunctionName = Objects.requireNonNull(userDefinedFunctionName);
            return this;
        }        public GetSqlResourceSqlUserDefinedFunctionArgs build() {
            return new GetSqlResourceSqlUserDefinedFunctionArgs(accountName, containerName, databaseName, resourceGroupName, userDefinedFunctionName);
        }
    }
}
