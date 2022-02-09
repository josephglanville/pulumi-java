// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MigrateSqlServerSqlMISyncTaskOutputErrorResponse {
    private final ReportableExceptionResponse error;
    private final String id;
    private final String resultType;

    @OutputCustomType.Constructor({"error","id","resultType"})
    private MigrateSqlServerSqlMISyncTaskOutputErrorResponse(
        ReportableExceptionResponse error,
        String id,
        String resultType) {
        this.error = Objects.requireNonNull(error);
        this.id = Objects.requireNonNull(id);
        this.resultType = Objects.requireNonNull(resultType);
    }

    public ReportableExceptionResponse getError() {
        return this.error;
    }
    public String getId() {
        return this.id;
    }
    public String getResultType() {
        return this.resultType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMISyncTaskOutputErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportableExceptionResponse error;
        private String id;
        private String resultType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMISyncTaskOutputErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
        }

        public Builder setError(ReportableExceptionResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public MigrateSqlServerSqlMISyncTaskOutputErrorResponse build() {
            return new MigrateSqlServerSqlMISyncTaskOutputErrorResponse(error, id, resultType);
        }
    }
}
