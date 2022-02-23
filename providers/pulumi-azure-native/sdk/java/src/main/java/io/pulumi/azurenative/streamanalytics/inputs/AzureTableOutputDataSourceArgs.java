// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes an Azure Table output data source.
 * 
 */
public final class AzureTableOutputDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureTableOutputDataSourceArgs Empty = new AzureTableOutputDataSourceArgs();

    /**
     * The account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="accountKey")
      private final @Nullable Input<String> accountKey;

    public Input<String> getAccountKey() {
        return this.accountKey == null ? Input.empty() : this.accountKey;
    }

    /**
     * The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="accountName")
      private final @Nullable Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName == null ? Input.empty() : this.accountName;
    }

    /**
     * The number of rows to write to the Azure Table at a time.
     * 
     */
    @InputImport(name="batchSize")
      private final @Nullable Input<Integer> batchSize;

    public Input<Integer> getBatchSize() {
        return this.batchSize == null ? Input.empty() : this.batchSize;
    }

    /**
     * If specified, each item in the array is the name of a column to remove (if present) from output event entities.
     * 
     */
    @InputImport(name="columnsToRemove")
      private final @Nullable Input<List<String>> columnsToRemove;

    public Input<List<String>> getColumnsToRemove() {
        return this.columnsToRemove == null ? Input.empty() : this.columnsToRemove;
    }

    /**
     * This element indicates the name of a column from the SELECT statement in the query that will be used as the partition key for the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="partitionKey")
      private final @Nullable Input<String> partitionKey;

    public Input<String> getPartitionKey() {
        return this.partitionKey == null ? Input.empty() : this.partitionKey;
    }

    /**
     * This element indicates the name of a column from the SELECT statement in the query that will be used as the row key for the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="rowKey")
      private final @Nullable Input<String> rowKey;

    public Input<String> getRowKey() {
        return this.rowKey == null ? Input.empty() : this.rowKey;
    }

    /**
     * The name of the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="table")
      private final @Nullable Input<String> table;

    public Input<String> getTable() {
        return this.table == null ? Input.empty() : this.table;
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Storage/Table'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AzureTableOutputDataSourceArgs(
        @Nullable Input<String> accountKey,
        @Nullable Input<String> accountName,
        @Nullable Input<Integer> batchSize,
        @Nullable Input<List<String>> columnsToRemove,
        @Nullable Input<String> partitionKey,
        @Nullable Input<String> rowKey,
        @Nullable Input<String> table,
        Input<String> type) {
        this.accountKey = accountKey;
        this.accountName = accountName;
        this.batchSize = batchSize;
        this.columnsToRemove = columnsToRemove;
        this.partitionKey = partitionKey;
        this.rowKey = rowKey;
        this.table = table;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureTableOutputDataSourceArgs() {
        this.accountKey = Input.empty();
        this.accountName = Input.empty();
        this.batchSize = Input.empty();
        this.columnsToRemove = Input.empty();
        this.partitionKey = Input.empty();
        this.rowKey = Input.empty();
        this.table = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureTableOutputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountKey;
        private @Nullable Input<String> accountName;
        private @Nullable Input<Integer> batchSize;
        private @Nullable Input<List<String>> columnsToRemove;
        private @Nullable Input<String> partitionKey;
        private @Nullable Input<String> rowKey;
        private @Nullable Input<String> table;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureTableOutputDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.batchSize = defaults.batchSize;
    	      this.columnsToRemove = defaults.columnsToRemove;
    	      this.partitionKey = defaults.partitionKey;
    	      this.rowKey = defaults.rowKey;
    	      this.table = defaults.table;
    	      this.type = defaults.type;
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

        public Builder setBatchSize(@Nullable Input<Integer> batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        public Builder setBatchSize(@Nullable Integer batchSize) {
            this.batchSize = Input.ofNullable(batchSize);
            return this;
        }

        public Builder setColumnsToRemove(@Nullable Input<List<String>> columnsToRemove) {
            this.columnsToRemove = columnsToRemove;
            return this;
        }

        public Builder setColumnsToRemove(@Nullable List<String> columnsToRemove) {
            this.columnsToRemove = Input.ofNullable(columnsToRemove);
            return this;
        }

        public Builder setPartitionKey(@Nullable Input<String> partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        public Builder setPartitionKey(@Nullable String partitionKey) {
            this.partitionKey = Input.ofNullable(partitionKey);
            return this;
        }

        public Builder setRowKey(@Nullable Input<String> rowKey) {
            this.rowKey = rowKey;
            return this;
        }

        public Builder setRowKey(@Nullable String rowKey) {
            this.rowKey = Input.ofNullable(rowKey);
            return this;
        }

        public Builder setTable(@Nullable Input<String> table) {
            this.table = table;
            return this;
        }

        public Builder setTable(@Nullable String table) {
            this.table = Input.ofNullable(table);
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
        public AzureTableOutputDataSourceArgs build() {
            return new AzureTableOutputDataSourceArgs(accountKey, accountName, batchSize, columnsToRemove, partitionKey, rowKey, table, type);
        }
    }
}
