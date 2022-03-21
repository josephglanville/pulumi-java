// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigDeltaSyncConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceDynamodbConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceDynamodbConfigArgs Empty = new DataSourceDynamodbConfigArgs();

    @Import(name="deltaSyncConfig")
      private final @Nullable Output<DataSourceDynamodbConfigDeltaSyncConfigArgs> deltaSyncConfig;

    public Output<DataSourceDynamodbConfigDeltaSyncConfigArgs> getDeltaSyncConfig() {
        return this.deltaSyncConfig == null ? Output.empty() : this.deltaSyncConfig;
    }

    /**
     * AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * Name of the DynamoDB table.
     * 
     */
    @Import(name="tableName", required=true)
      private final Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName;
    }

    /**
     * Set to `true` to use Amazon Cognito credentials with this data source.
     * 
     */
    @Import(name="useCallerCredentials")
      private final @Nullable Output<Boolean> useCallerCredentials;

    public Output<Boolean> getUseCallerCredentials() {
        return this.useCallerCredentials == null ? Output.empty() : this.useCallerCredentials;
    }

    @Import(name="versioned")
      private final @Nullable Output<Boolean> versioned;

    public Output<Boolean> getVersioned() {
        return this.versioned == null ? Output.empty() : this.versioned;
    }

    public DataSourceDynamodbConfigArgs(
        @Nullable Output<DataSourceDynamodbConfigDeltaSyncConfigArgs> deltaSyncConfig,
        @Nullable Output<String> region,
        Output<String> tableName,
        @Nullable Output<Boolean> useCallerCredentials,
        @Nullable Output<Boolean> versioned) {
        this.deltaSyncConfig = deltaSyncConfig;
        this.region = region;
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
        this.useCallerCredentials = useCallerCredentials;
        this.versioned = versioned;
    }

    private DataSourceDynamodbConfigArgs() {
        this.deltaSyncConfig = Output.empty();
        this.region = Output.empty();
        this.tableName = Output.empty();
        this.useCallerCredentials = Output.empty();
        this.versioned = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceDynamodbConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DataSourceDynamodbConfigDeltaSyncConfigArgs> deltaSyncConfig;
        private @Nullable Output<String> region;
        private Output<String> tableName;
        private @Nullable Output<Boolean> useCallerCredentials;
        private @Nullable Output<Boolean> versioned;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceDynamodbConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deltaSyncConfig = defaults.deltaSyncConfig;
    	      this.region = defaults.region;
    	      this.tableName = defaults.tableName;
    	      this.useCallerCredentials = defaults.useCallerCredentials;
    	      this.versioned = defaults.versioned;
        }

        public Builder deltaSyncConfig(@Nullable Output<DataSourceDynamodbConfigDeltaSyncConfigArgs> deltaSyncConfig) {
            this.deltaSyncConfig = deltaSyncConfig;
            return this;
        }
        public Builder deltaSyncConfig(@Nullable DataSourceDynamodbConfigDeltaSyncConfigArgs deltaSyncConfig) {
            this.deltaSyncConfig = Output.ofNullable(deltaSyncConfig);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public Builder tableName(Output<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Output.of(Objects.requireNonNull(tableName));
            return this;
        }
        public Builder useCallerCredentials(@Nullable Output<Boolean> useCallerCredentials) {
            this.useCallerCredentials = useCallerCredentials;
            return this;
        }
        public Builder useCallerCredentials(@Nullable Boolean useCallerCredentials) {
            this.useCallerCredentials = Output.ofNullable(useCallerCredentials);
            return this;
        }
        public Builder versioned(@Nullable Output<Boolean> versioned) {
            this.versioned = versioned;
            return this;
        }
        public Builder versioned(@Nullable Boolean versioned) {
            this.versioned = Output.ofNullable(versioned);
            return this;
        }        public DataSourceDynamodbConfigArgs build() {
            return new DataSourceDynamodbConfigArgs(deltaSyncConfig, region, tableName, useCallerCredentials, versioned);
        }
    }
}
