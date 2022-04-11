// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.sqladmin_v1.enums.SqlOutOfDiskReportSqlOutOfDiskState;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This message wraps up the information written by out-of-disk detection job.
 * 
 */
public final class SqlOutOfDiskReportArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlOutOfDiskReportArgs Empty = new SqlOutOfDiskReportArgs();

    /**
     * The minimum recommended increase size in GigaBytes This field is consumed by the frontend * Writers: * the proactive database wellness job for OOD. * Readers:
     * 
     */
    @Import(name="sqlMinRecommendedIncreaseSizeGb")
      private final @Nullable Output<Integer> sqlMinRecommendedIncreaseSizeGb;

    public Output<Integer> getSqlMinRecommendedIncreaseSizeGb() {
        return this.sqlMinRecommendedIncreaseSizeGb == null ? Codegen.empty() : this.sqlMinRecommendedIncreaseSizeGb;
    }

    /**
     * This field represents the state generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    @Import(name="sqlOutOfDiskState")
      private final @Nullable Output<SqlOutOfDiskReportSqlOutOfDiskState> sqlOutOfDiskState;

    public Output<SqlOutOfDiskReportSqlOutOfDiskState> getSqlOutOfDiskState() {
        return this.sqlOutOfDiskState == null ? Codegen.empty() : this.sqlOutOfDiskState;
    }

    public SqlOutOfDiskReportArgs(
        @Nullable Output<Integer> sqlMinRecommendedIncreaseSizeGb,
        @Nullable Output<SqlOutOfDiskReportSqlOutOfDiskState> sqlOutOfDiskState) {
        this.sqlMinRecommendedIncreaseSizeGb = sqlMinRecommendedIncreaseSizeGb;
        this.sqlOutOfDiskState = sqlOutOfDiskState;
    }

    private SqlOutOfDiskReportArgs() {
        this.sqlMinRecommendedIncreaseSizeGb = Codegen.empty();
        this.sqlOutOfDiskState = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlOutOfDiskReportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> sqlMinRecommendedIncreaseSizeGb;
        private @Nullable Output<SqlOutOfDiskReportSqlOutOfDiskState> sqlOutOfDiskState;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlOutOfDiskReportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sqlMinRecommendedIncreaseSizeGb = defaults.sqlMinRecommendedIncreaseSizeGb;
    	      this.sqlOutOfDiskState = defaults.sqlOutOfDiskState;
        }

        public Builder sqlMinRecommendedIncreaseSizeGb(@Nullable Output<Integer> sqlMinRecommendedIncreaseSizeGb) {
            this.sqlMinRecommendedIncreaseSizeGb = sqlMinRecommendedIncreaseSizeGb;
            return this;
        }
        public Builder sqlMinRecommendedIncreaseSizeGb(@Nullable Integer sqlMinRecommendedIncreaseSizeGb) {
            this.sqlMinRecommendedIncreaseSizeGb = Codegen.ofNullable(sqlMinRecommendedIncreaseSizeGb);
            return this;
        }
        public Builder sqlOutOfDiskState(@Nullable Output<SqlOutOfDiskReportSqlOutOfDiskState> sqlOutOfDiskState) {
            this.sqlOutOfDiskState = sqlOutOfDiskState;
            return this;
        }
        public Builder sqlOutOfDiskState(@Nullable SqlOutOfDiskReportSqlOutOfDiskState sqlOutOfDiskState) {
            this.sqlOutOfDiskState = Codegen.ofNullable(sqlOutOfDiskState);
            return this;
        }        public SqlOutOfDiskReportArgs build() {
            return new SqlOutOfDiskReportArgs(sqlMinRecommendedIncreaseSizeGb, sqlOutOfDiskState);
        }
    }
}
