// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * <p>Snowflake parameters.</p>
 * 
 */
public final class DataSourceSnowflakeParameters extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceSnowflakeParameters Empty = new DataSourceSnowflakeParameters();

    /**
     * <p>Database.</p>
     * 
     */
    @Import(name="database", required=true)
      private final String database;

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>Host.</p>
     * 
     */
    @Import(name="host", required=true)
      private final String host;

    public String getHost() {
        return this.host;
    }

    /**
     * <p>Warehouse.</p>
     * 
     */
    @Import(name="warehouse", required=true)
      private final String warehouse;

    public String getWarehouse() {
        return this.warehouse;
    }

    public DataSourceSnowflakeParameters(
        String database,
        String host,
        String warehouse) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.warehouse = Objects.requireNonNull(warehouse, "expected parameter 'warehouse' to be non-null");
    }

    private DataSourceSnowflakeParameters() {
        this.database = null;
        this.host = null;
        this.warehouse = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSnowflakeParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String host;
        private String warehouse;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSnowflakeParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.warehouse = defaults.warehouse;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder warehouse(String warehouse) {
            this.warehouse = Objects.requireNonNull(warehouse);
            return this;
        }        public DataSourceSnowflakeParameters build() {
            return new DataSourceSnowflakeParameters(database, host, warehouse);
        }
    }
}
