// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlDBTableDataSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlDBTableDataSetArgs Empty = new SqlDBTableDataSetArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the dataSet.
     * 
     */
    @Import(name="dataSetName")
      private final @Nullable Output<String> dataSetName;

    public Output<String> getDataSetName() {
        return this.dataSetName == null ? Codegen.empty() : this.dataSetName;
    }

    /**
     * Database name of the source data set
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Kind of data set.
     * Expected value is 'SqlDBTable'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Schema of the table. Default value is dbo.
     * 
     */
    @Import(name="schemaName", required=true)
      private final Output<String> schemaName;

    public Output<String> getSchemaName() {
        return this.schemaName;
    }

    /**
     * The name of the share to add the data set to.
     * 
     */
    @Import(name="shareName", required=true)
      private final Output<String> shareName;

    public Output<String> getShareName() {
        return this.shareName;
    }

    /**
     * Resource id of SQL server
     * 
     */
    @Import(name="sqlServerResourceId", required=true)
      private final Output<String> sqlServerResourceId;

    public Output<String> getSqlServerResourceId() {
        return this.sqlServerResourceId;
    }

    /**
     * SQL DB table name.
     * 
     */
    @Import(name="tableName", required=true)
      private final Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName;
    }

    public SqlDBTableDataSetArgs(
        Output<String> accountName,
        @Nullable Output<String> dataSetName,
        Output<String> databaseName,
        Output<String> kind,
        Output<String> resourceGroupName,
        Output<String> schemaName,
        Output<String> shareName,
        Output<String> sqlServerResourceId,
        Output<String> tableName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetName = dataSetName;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaName = Objects.requireNonNull(schemaName, "expected parameter 'schemaName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
        this.sqlServerResourceId = Objects.requireNonNull(sqlServerResourceId, "expected parameter 'sqlServerResourceId' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private SqlDBTableDataSetArgs() {
        this.accountName = Codegen.empty();
        this.dataSetName = Codegen.empty();
        this.databaseName = Codegen.empty();
        this.kind = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.schemaName = Codegen.empty();
        this.shareName = Codegen.empty();
        this.sqlServerResourceId = Codegen.empty();
        this.tableName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDBTableDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> dataSetName;
        private Output<String> databaseName;
        private Output<String> kind;
        private Output<String> resourceGroupName;
        private Output<String> schemaName;
        private Output<String> shareName;
        private Output<String> sqlServerResourceId;
        private Output<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDBTableDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetName = defaults.dataSetName;
    	      this.databaseName = defaults.databaseName;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaName = defaults.schemaName;
    	      this.shareName = defaults.shareName;
    	      this.sqlServerResourceId = defaults.sqlServerResourceId;
    	      this.tableName = defaults.tableName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder dataSetName(@Nullable Output<String> dataSetName) {
            this.dataSetName = dataSetName;
            return this;
        }
        public Builder dataSetName(@Nullable String dataSetName) {
            this.dataSetName = Codegen.ofNullable(dataSetName);
            return this;
        }
        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
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
        public Builder schemaName(Output<String> schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }
        public Builder schemaName(String schemaName) {
            this.schemaName = Output.of(Objects.requireNonNull(schemaName));
            return this;
        }
        public Builder shareName(Output<String> shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }
        public Builder shareName(String shareName) {
            this.shareName = Output.of(Objects.requireNonNull(shareName));
            return this;
        }
        public Builder sqlServerResourceId(Output<String> sqlServerResourceId) {
            this.sqlServerResourceId = Objects.requireNonNull(sqlServerResourceId);
            return this;
        }
        public Builder sqlServerResourceId(String sqlServerResourceId) {
            this.sqlServerResourceId = Output.of(Objects.requireNonNull(sqlServerResourceId));
            return this;
        }
        public Builder tableName(Output<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Output.of(Objects.requireNonNull(tableName));
            return this;
        }        public SqlDBTableDataSetArgs build() {
            return new SqlDBTableDataSetArgs(accountName, dataSetName, databaseName, kind, resourceGroupName, schemaName, shareName, sqlServerResourceId, tableName);
        }
    }
}
