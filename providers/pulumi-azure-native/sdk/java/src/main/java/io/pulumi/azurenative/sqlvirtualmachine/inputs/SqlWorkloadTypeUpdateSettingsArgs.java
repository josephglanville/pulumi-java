// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.azurenative.sqlvirtualmachine.enums.SqlWorkloadType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Set workload type to optimize storage for SQL Server.
 * 
 */
public final class SqlWorkloadTypeUpdateSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlWorkloadTypeUpdateSettingsArgs Empty = new SqlWorkloadTypeUpdateSettingsArgs();

    /**
     * SQL Server workload type.
     * 
     */
    @Import(name="sqlWorkloadType")
      private final @Nullable Output<Either<String,SqlWorkloadType>> sqlWorkloadType;

    public Output<Either<String,SqlWorkloadType>> getSqlWorkloadType() {
        return this.sqlWorkloadType == null ? Output.empty() : this.sqlWorkloadType;
    }

    public SqlWorkloadTypeUpdateSettingsArgs(@Nullable Output<Either<String,SqlWorkloadType>> sqlWorkloadType) {
        this.sqlWorkloadType = sqlWorkloadType;
    }

    private SqlWorkloadTypeUpdateSettingsArgs() {
        this.sqlWorkloadType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlWorkloadTypeUpdateSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,SqlWorkloadType>> sqlWorkloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlWorkloadTypeUpdateSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sqlWorkloadType = defaults.sqlWorkloadType;
        }

        public Builder sqlWorkloadType(@Nullable Output<Either<String,SqlWorkloadType>> sqlWorkloadType) {
            this.sqlWorkloadType = sqlWorkloadType;
            return this;
        }
        public Builder sqlWorkloadType(@Nullable Either<String,SqlWorkloadType> sqlWorkloadType) {
            this.sqlWorkloadType = Output.ofNullable(sqlWorkloadType);
            return this;
        }        public SqlWorkloadTypeUpdateSettingsArgs build() {
            return new SqlWorkloadTypeUpdateSettingsArgs(sqlWorkloadType);
        }
    }
}
