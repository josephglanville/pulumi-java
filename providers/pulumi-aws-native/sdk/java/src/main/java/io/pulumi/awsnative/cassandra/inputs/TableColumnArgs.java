// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cassandra.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TableColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableColumnArgs Empty = new TableColumnArgs();

    @InputImport(name="columnName", required=true)
    private final Input<String> columnName;

    public Input<String> getColumnName() {
        return this.columnName;
    }

    @InputImport(name="columnType", required=true)
    private final Input<String> columnType;

    public Input<String> getColumnType() {
        return this.columnType;
    }

    public TableColumnArgs(
        Input<String> columnName,
        Input<String> columnType) {
        this.columnName = Objects.requireNonNull(columnName, "expected parameter 'columnName' to be non-null");
        this.columnType = Objects.requireNonNull(columnType, "expected parameter 'columnType' to be non-null");
    }

    private TableColumnArgs() {
        this.columnName = Input.empty();
        this.columnType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> columnName;
        private Input<String> columnType;

        public Builder() {
    	      // Empty
        }

        public Builder(TableColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.columnType = defaults.columnType;
        }

        public Builder setColumnName(Input<String> columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }

        public Builder setColumnName(String columnName) {
            this.columnName = Input.of(Objects.requireNonNull(columnName));
            return this;
        }

        public Builder setColumnType(Input<String> columnType) {
            this.columnType = Objects.requireNonNull(columnType);
            return this;
        }

        public Builder setColumnType(String columnType) {
            this.columnType = Input.of(Objects.requireNonNull(columnType));
            return this;
        }

        public TableColumnArgs build() {
            return new TableColumnArgs(columnName, columnType);
        }
    }
}