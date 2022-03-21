// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersPrestoGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersPrestoGetArgs Empty = new DataSourceParametersPrestoGetArgs();

    /**
     * The catalog to which to connect.
     * 
     */
    @Import(name="catalog", required=true)
      private final Output<String> catalog;

    public Output<String> getCatalog() {
        return this.catalog;
    }

    /**
     * The host to which to connect.
     * 
     */
    @Import(name="host", required=true)
      private final Output<String> host;

    public Output<String> getHost() {
        return this.host;
    }

    /**
     * The port to which to connect.
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port;
    }

    public DataSourceParametersPrestoGetArgs(
        Output<String> catalog,
        Output<String> host,
        Output<Integer> port) {
        this.catalog = Objects.requireNonNull(catalog, "expected parameter 'catalog' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourceParametersPrestoGetArgs() {
        this.catalog = Output.empty();
        this.host = Output.empty();
        this.port = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersPrestoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> catalog;
        private Output<String> host;
        private Output<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersPrestoGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalog = defaults.catalog;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder catalog(Output<String> catalog) {
            this.catalog = Objects.requireNonNull(catalog);
            return this;
        }
        public Builder catalog(String catalog) {
            this.catalog = Output.of(Objects.requireNonNull(catalog));
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
        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }        public DataSourceParametersPrestoGetArgs build() {
            return new DataSourceParametersPrestoGetArgs(catalog, host, port);
        }
    }
}
