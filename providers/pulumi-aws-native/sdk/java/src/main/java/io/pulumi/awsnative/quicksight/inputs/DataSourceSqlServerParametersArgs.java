// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * <p>SQL Server parameters.</p>
 * 
 */
public final class DataSourceSqlServerParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceSqlServerParametersArgs Empty = new DataSourceSqlServerParametersArgs();

    /**
     * <p>Database.</p>
     * 
     */
    @Import(name="database", required=true)
      private final Output<String> database;

    public Output<String> getDatabase() {
        return this.database;
    }

    /**
     * <p>Host.</p>
     * 
     */
    @Import(name="host", required=true)
      private final Output<String> host;

    public Output<String> getHost() {
        return this.host;
    }

    /**
     * <p>Port.</p>
     * 
     */
    @Import(name="port", required=true)
      private final Output<Double> port;

    public Output<Double> getPort() {
        return this.port;
    }

    public DataSourceSqlServerParametersArgs(
        Output<String> database,
        Output<String> host,
        Output<Double> port) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourceSqlServerParametersArgs() {
        this.database = Output.empty();
        this.host = Output.empty();
        this.port = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSqlServerParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> database;
        private Output<String> host;
        private Output<Double> port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSqlServerParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder database(Output<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder database(String database) {
            this.database = Output.of(Objects.requireNonNull(database));
            return this;
        }
        public Builder host(Output<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder host(String host) {
            this.host = Output.of(Objects.requireNonNull(host));
            return this;
        }
        public Builder port(Output<Double> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Double port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }        public DataSourceSqlServerParametersArgs build() {
            return new DataSourceSqlServerParametersArgs(database, host, port);
        }
    }
}
