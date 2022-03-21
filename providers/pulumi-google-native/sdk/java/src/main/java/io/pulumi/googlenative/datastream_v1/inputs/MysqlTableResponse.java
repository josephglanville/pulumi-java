// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datastream_v1.inputs.MysqlColumnResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * MySQL table.
 * 
 */
public final class MysqlTableResponse extends io.pulumi.resources.InvokeArgs {

    public static final MysqlTableResponse Empty = new MysqlTableResponse();

    /**
     * MySQL columns in the database. When unspecified as part of include/exclude lists, includes/excludes everything.
     * 
     */
    @Import(name="mysqlColumns", required=true)
      private final List<MysqlColumnResponse> mysqlColumns;

    public List<MysqlColumnResponse> getMysqlColumns() {
        return this.mysqlColumns;
    }

    /**
     * Table name.
     * 
     */
    @Import(name="table", required=true)
      private final String table;

    public String getTable() {
        return this.table;
    }

    public MysqlTableResponse(
        List<MysqlColumnResponse> mysqlColumns,
        String table) {
        this.mysqlColumns = Objects.requireNonNull(mysqlColumns, "expected parameter 'mysqlColumns' to be non-null");
        this.table = Objects.requireNonNull(table, "expected parameter 'table' to be non-null");
    }

    private MysqlTableResponse() {
        this.mysqlColumns = List.of();
        this.table = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlTableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MysqlColumnResponse> mysqlColumns;
        private String table;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlTableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlColumns = defaults.mysqlColumns;
    	      this.table = defaults.table;
        }

        public Builder mysqlColumns(List<MysqlColumnResponse> mysqlColumns) {
            this.mysqlColumns = Objects.requireNonNull(mysqlColumns);
            return this;
        }
        public Builder mysqlColumns(MysqlColumnResponse... mysqlColumns) {
            return mysqlColumns(List.of(mysqlColumns));
        }
        public Builder table(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }        public MysqlTableResponse build() {
            return new MysqlTableResponse(mysqlColumns, table);
        }
    }
}
