// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.documentdb.inputs.CreateUpdateOptionsArgs;
import io.pulumi.azurenative.documentdb.inputs.SqlDatabaseResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlResourceSqlDatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlResourceSqlDatabaseArgs Empty = new SqlResourceSqlDatabaseArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Cosmos DB database name.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName == null ? Output.empty() : this.databaseName;
    }

    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * A key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<CreateUpdateOptionsArgs> options;

    public Output<CreateUpdateOptionsArgs> getOptions() {
        return this.options == null ? Output.empty() : this.options;
    }

    /**
     * The standard JSON format of a SQL database
     * 
     */
    @Import(name="resource", required=true)
      private final Output<SqlDatabaseResourceArgs> resource;

    public Output<SqlDatabaseResourceArgs> getResource() {
        return this.resource;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public SqlResourceSqlDatabaseArgs(
        Output<String> accountName,
        @Nullable Output<String> databaseName,
        @Nullable Output<String> location,
        @Nullable Output<CreateUpdateOptionsArgs> options,
        Output<SqlDatabaseResourceArgs> resource,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.databaseName = databaseName;
        this.location = location;
        this.options = options;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private SqlResourceSqlDatabaseArgs() {
        this.accountName = Output.empty();
        this.databaseName = Output.empty();
        this.location = Output.empty();
        this.options = Output.empty();
        this.resource = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlResourceSqlDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> databaseName;
        private @Nullable Output<String> location;
        private @Nullable Output<CreateUpdateOptionsArgs> options;
        private Output<SqlDatabaseResourceArgs> resource;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlResourceSqlDatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.databaseName = defaults.databaseName;
    	      this.location = defaults.location;
    	      this.options = defaults.options;
    	      this.resource = defaults.resource;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Output.ofNullable(databaseName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder options(@Nullable Output<CreateUpdateOptionsArgs> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable CreateUpdateOptionsArgs options) {
            this.options = Output.ofNullable(options);
            return this;
        }
        public Builder resource(Output<SqlDatabaseResourceArgs> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        public Builder resource(SqlDatabaseResourceArgs resource) {
            this.resource = Output.of(Objects.requireNonNull(resource));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public SqlResourceSqlDatabaseArgs build() {
            return new SqlResourceSqlDatabaseArgs(accountName, databaseName, location, options, resource, resourceGroupName, tags);
        }
    }
}
