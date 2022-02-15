// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.documentdb.inputs.CreateUpdateOptionsArgs;
import io.pulumi.azurenative.documentdb.inputs.SqlContainerResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlResourceSqlContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlResourceSqlContainerArgs Empty = new SqlResourceSqlContainerArgs();

    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    @InputImport(name="containerName")
    private final @Nullable Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName == null ? Input.empty() : this.containerName;
    }

    @InputImport(name="databaseName", required=true)
    private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="options")
    private final @Nullable Input<CreateUpdateOptionsArgs> options;

    public Input<CreateUpdateOptionsArgs> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    @InputImport(name="resource", required=true)
    private final Input<SqlContainerResourceArgs> resource;

    public Input<SqlContainerResourceArgs> getResource() {
        return this.resource;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SqlResourceSqlContainerArgs(
        Input<String> accountName,
        @Nullable Input<String> containerName,
        Input<String> databaseName,
        @Nullable Input<String> location,
        @Nullable Input<CreateUpdateOptionsArgs> options,
        Input<SqlContainerResourceArgs> resource,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.containerName = containerName;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.location = location;
        this.options = options;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private SqlResourceSqlContainerArgs() {
        this.accountName = Input.empty();
        this.containerName = Input.empty();
        this.databaseName = Input.empty();
        this.location = Input.empty();
        this.options = Input.empty();
        this.resource = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlResourceSqlContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> containerName;
        private Input<String> databaseName;
        private @Nullable Input<String> location;
        private @Nullable Input<CreateUpdateOptionsArgs> options;
        private Input<SqlContainerResourceArgs> resource;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlResourceSqlContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.containerName = defaults.containerName;
    	      this.databaseName = defaults.databaseName;
    	      this.location = defaults.location;
    	      this.options = defaults.options;
    	      this.resource = defaults.resource;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
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

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setOptions(@Nullable Input<CreateUpdateOptionsArgs> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable CreateUpdateOptionsArgs options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setResource(Input<SqlContainerResourceArgs> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder setResource(SqlContainerResourceArgs resource) {
            this.resource = Input.of(Objects.requireNonNull(resource));
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public SqlResourceSqlContainerArgs build() {
            return new SqlResourceSqlContainerArgs(accountName, containerName, databaseName, location, options, resource, resourceGroupName, tags);
        }
    }
}