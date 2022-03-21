// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.MysqlRdbmsArgs;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.OracleRdbmsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Backfill strategy to automatically backfill the Stream's objects. Specific objects can be excluded.
 * 
 */
public final class BackfillAllStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackfillAllStrategyArgs Empty = new BackfillAllStrategyArgs();

    /**
     * MySQL data source objects to avoid backfilling.
     * 
     */
    @Import(name="mysqlExcludedObjects")
      private final @Nullable Output<MysqlRdbmsArgs> mysqlExcludedObjects;

    public Output<MysqlRdbmsArgs> getMysqlExcludedObjects() {
        return this.mysqlExcludedObjects == null ? Output.empty() : this.mysqlExcludedObjects;
    }

    /**
     * Oracle data source objects to avoid backfilling.
     * 
     */
    @Import(name="oracleExcludedObjects")
      private final @Nullable Output<OracleRdbmsArgs> oracleExcludedObjects;

    public Output<OracleRdbmsArgs> getOracleExcludedObjects() {
        return this.oracleExcludedObjects == null ? Output.empty() : this.oracleExcludedObjects;
    }

    public BackfillAllStrategyArgs(
        @Nullable Output<MysqlRdbmsArgs> mysqlExcludedObjects,
        @Nullable Output<OracleRdbmsArgs> oracleExcludedObjects) {
        this.mysqlExcludedObjects = mysqlExcludedObjects;
        this.oracleExcludedObjects = oracleExcludedObjects;
    }

    private BackfillAllStrategyArgs() {
        this.mysqlExcludedObjects = Output.empty();
        this.oracleExcludedObjects = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackfillAllStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MysqlRdbmsArgs> mysqlExcludedObjects;
        private @Nullable Output<OracleRdbmsArgs> oracleExcludedObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(BackfillAllStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlExcludedObjects = defaults.mysqlExcludedObjects;
    	      this.oracleExcludedObjects = defaults.oracleExcludedObjects;
        }

        public Builder mysqlExcludedObjects(@Nullable Output<MysqlRdbmsArgs> mysqlExcludedObjects) {
            this.mysqlExcludedObjects = mysqlExcludedObjects;
            return this;
        }
        public Builder mysqlExcludedObjects(@Nullable MysqlRdbmsArgs mysqlExcludedObjects) {
            this.mysqlExcludedObjects = Output.ofNullable(mysqlExcludedObjects);
            return this;
        }
        public Builder oracleExcludedObjects(@Nullable Output<OracleRdbmsArgs> oracleExcludedObjects) {
            this.oracleExcludedObjects = oracleExcludedObjects;
            return this;
        }
        public Builder oracleExcludedObjects(@Nullable OracleRdbmsArgs oracleExcludedObjects) {
            this.oracleExcludedObjects = Output.ofNullable(oracleExcludedObjects);
            return this;
        }        public BackfillAllStrategyArgs build() {
            return new BackfillAllStrategyArgs(mysqlExcludedObjects, oracleExcludedObjects);
        }
    }
}
