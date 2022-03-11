// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceDynamodbConfigDeltaSyncConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceDynamodbConfigDeltaSyncConfigGetArgs Empty = new DataSourceDynamodbConfigDeltaSyncConfigGetArgs();

    @InputImport(name="baseTableTtl")
      private final @Nullable Output<Integer> baseTableTtl;

    public Output<Integer> getBaseTableTtl() {
        return this.baseTableTtl == null ? Output.empty() : this.baseTableTtl;
    }

    @InputImport(name="deltaSyncTableName", required=true)
      private final Output<String> deltaSyncTableName;

    public Output<String> getDeltaSyncTableName() {
        return this.deltaSyncTableName;
    }

    @InputImport(name="deltaSyncTableTtl")
      private final @Nullable Output<Integer> deltaSyncTableTtl;

    public Output<Integer> getDeltaSyncTableTtl() {
        return this.deltaSyncTableTtl == null ? Output.empty() : this.deltaSyncTableTtl;
    }

    public DataSourceDynamodbConfigDeltaSyncConfigGetArgs(
        @Nullable Output<Integer> baseTableTtl,
        Output<String> deltaSyncTableName,
        @Nullable Output<Integer> deltaSyncTableTtl) {
        this.baseTableTtl = baseTableTtl;
        this.deltaSyncTableName = Objects.requireNonNull(deltaSyncTableName, "expected parameter 'deltaSyncTableName' to be non-null");
        this.deltaSyncTableTtl = deltaSyncTableTtl;
    }

    private DataSourceDynamodbConfigDeltaSyncConfigGetArgs() {
        this.baseTableTtl = Output.empty();
        this.deltaSyncTableName = Output.empty();
        this.deltaSyncTableTtl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceDynamodbConfigDeltaSyncConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> baseTableTtl;
        private Output<String> deltaSyncTableName;
        private @Nullable Output<Integer> deltaSyncTableTtl;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceDynamodbConfigDeltaSyncConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseTableTtl = defaults.baseTableTtl;
    	      this.deltaSyncTableName = defaults.deltaSyncTableName;
    	      this.deltaSyncTableTtl = defaults.deltaSyncTableTtl;
        }

        public Builder baseTableTtl(@Nullable Output<Integer> baseTableTtl) {
            this.baseTableTtl = baseTableTtl;
            return this;
        }

        public Builder baseTableTtl(@Nullable Integer baseTableTtl) {
            this.baseTableTtl = Output.ofNullable(baseTableTtl);
            return this;
        }

        public Builder deltaSyncTableName(Output<String> deltaSyncTableName) {
            this.deltaSyncTableName = Objects.requireNonNull(deltaSyncTableName);
            return this;
        }

        public Builder deltaSyncTableName(String deltaSyncTableName) {
            this.deltaSyncTableName = Output.of(Objects.requireNonNull(deltaSyncTableName));
            return this;
        }

        public Builder deltaSyncTableTtl(@Nullable Output<Integer> deltaSyncTableTtl) {
            this.deltaSyncTableTtl = deltaSyncTableTtl;
            return this;
        }

        public Builder deltaSyncTableTtl(@Nullable Integer deltaSyncTableTtl) {
            this.deltaSyncTableTtl = Output.ofNullable(deltaSyncTableTtl);
            return this;
        }
        public DataSourceDynamodbConfigDeltaSyncConfigGetArgs build() {
            return new DataSourceDynamodbConfigDeltaSyncConfigGetArgs(baseTableTtl, deltaSyncTableName, deltaSyncTableTtl);
        }
    }
}
