// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.MysqlTableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MySQL database.
 * 
 */
public final class MysqlDatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final MysqlDatabaseArgs Empty = new MysqlDatabaseArgs();

    /**
     * Database name.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName == null ? Output.empty() : this.databaseName;
    }

    /**
     * Tables in the database.
     * 
     */
    @Import(name="mysqlTables")
      private final @Nullable Output<List<MysqlTableArgs>> mysqlTables;

    public Output<List<MysqlTableArgs>> getMysqlTables() {
        return this.mysqlTables == null ? Output.empty() : this.mysqlTables;
    }

    public MysqlDatabaseArgs(
        @Nullable Output<String> databaseName,
        @Nullable Output<List<MysqlTableArgs>> mysqlTables) {
        this.databaseName = databaseName;
        this.mysqlTables = mysqlTables;
    }

    private MysqlDatabaseArgs() {
        this.databaseName = Output.empty();
        this.mysqlTables = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> databaseName;
        private @Nullable Output<List<MysqlTableArgs>> mysqlTables;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlDatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.mysqlTables = defaults.mysqlTables;
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Output.ofNullable(databaseName);
            return this;
        }
        public Builder mysqlTables(@Nullable Output<List<MysqlTableArgs>> mysqlTables) {
            this.mysqlTables = mysqlTables;
            return this;
        }
        public Builder mysqlTables(@Nullable List<MysqlTableArgs> mysqlTables) {
            this.mysqlTables = Output.ofNullable(mysqlTables);
            return this;
        }
        public Builder mysqlTables(MysqlTableArgs... mysqlTables) {
            return mysqlTables(List.of(mysqlTables));
        }        public MysqlDatabaseArgs build() {
            return new MysqlDatabaseArgs(databaseName, mysqlTables);
        }
    }
}
