// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.outputs;

import io.pulumi.aws.appsync.outputs.DataSourceRelationalDatabaseConfigHttpEndpointConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceRelationalDatabaseConfig {
    /**
     * The Amazon RDS HTTP endpoint configuration. See HTTP Endpoint Config.
     * 
     */
    private final @Nullable DataSourceRelationalDatabaseConfigHttpEndpointConfig httpEndpointConfig;
    /**
     * Source type for the relational database. Valid values: `RDS_HTTP_ENDPOINT`.
     * 
     */
    private final @Nullable String sourceType;

    @OutputCustomType.Constructor
    private DataSourceRelationalDatabaseConfig(
        @OutputCustomType.Parameter("httpEndpointConfig") @Nullable DataSourceRelationalDatabaseConfigHttpEndpointConfig httpEndpointConfig,
        @OutputCustomType.Parameter("sourceType") @Nullable String sourceType) {
        this.httpEndpointConfig = httpEndpointConfig;
        this.sourceType = sourceType;
    }

    /**
     * The Amazon RDS HTTP endpoint configuration. See HTTP Endpoint Config.
     * 
    */
    public Optional<DataSourceRelationalDatabaseConfigHttpEndpointConfig> getHttpEndpointConfig() {
        return Optional.ofNullable(this.httpEndpointConfig);
    }
    /**
     * Source type for the relational database. Valid values: `RDS_HTTP_ENDPOINT`.
     * 
    */
    public Optional<String> getSourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceRelationalDatabaseConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceRelationalDatabaseConfigHttpEndpointConfig httpEndpointConfig;
        private @Nullable String sourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceRelationalDatabaseConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpEndpointConfig = defaults.httpEndpointConfig;
    	      this.sourceType = defaults.sourceType;
        }

        public Builder setHttpEndpointConfig(@Nullable DataSourceRelationalDatabaseConfigHttpEndpointConfig httpEndpointConfig) {
            this.httpEndpointConfig = httpEndpointConfig;
            return this;
        }

        public Builder setSourceType(@Nullable String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public DataSourceRelationalDatabaseConfig build() {
            return new DataSourceRelationalDatabaseConfig(httpEndpointConfig, sourceType);
        }
    }
}
