// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.DataIntegrityValidationResultResponse;
import io.pulumi.azurenative.datamigration.outputs.QueryAnalysisValidationResultResponse;
import io.pulumi.azurenative.datamigration.outputs.SchemaComparisonValidationResultResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MigrateSqlServerSqlDbTaskOutputDatabaseLevelValidationResultResponse {
    private final DataIntegrityValidationResultResponse dataIntegrityValidationResult;
    private final String endedOn;
    private final String id;
    private final String migrationId;
    private final QueryAnalysisValidationResultResponse queryAnalysisValidationResult;
    private final String resultType;
    private final SchemaComparisonValidationResultResponse schemaValidationResult;
    private final String sourceDatabaseName;
    private final String startedOn;
    private final String status;
    private final String targetDatabaseName;

    @OutputCustomType.Constructor({"dataIntegrityValidationResult","endedOn","id","migrationId","queryAnalysisValidationResult","resultType","schemaValidationResult","sourceDatabaseName","startedOn","status","targetDatabaseName"})
    private MigrateSqlServerSqlDbTaskOutputDatabaseLevelValidationResultResponse(
        DataIntegrityValidationResultResponse dataIntegrityValidationResult,
        String endedOn,
        String id,
        String migrationId,
        QueryAnalysisValidationResultResponse queryAnalysisValidationResult,
        String resultType,
        SchemaComparisonValidationResultResponse schemaValidationResult,
        String sourceDatabaseName,
        String startedOn,
        String status,
        String targetDatabaseName) {
        this.dataIntegrityValidationResult = Objects.requireNonNull(dataIntegrityValidationResult);
        this.endedOn = Objects.requireNonNull(endedOn);
        this.id = Objects.requireNonNull(id);
        this.migrationId = Objects.requireNonNull(migrationId);
        this.queryAnalysisValidationResult = Objects.requireNonNull(queryAnalysisValidationResult);
        this.resultType = Objects.requireNonNull(resultType);
        this.schemaValidationResult = Objects.requireNonNull(schemaValidationResult);
        this.sourceDatabaseName = Objects.requireNonNull(sourceDatabaseName);
        this.startedOn = Objects.requireNonNull(startedOn);
        this.status = Objects.requireNonNull(status);
        this.targetDatabaseName = Objects.requireNonNull(targetDatabaseName);
    }

    public DataIntegrityValidationResultResponse getDataIntegrityValidationResult() {
        return this.dataIntegrityValidationResult;
    }
    public String getEndedOn() {
        return this.endedOn;
    }
    public String getId() {
        return this.id;
    }
    public String getMigrationId() {
        return this.migrationId;
    }
    public QueryAnalysisValidationResultResponse getQueryAnalysisValidationResult() {
        return this.queryAnalysisValidationResult;
    }
    public String getResultType() {
        return this.resultType;
    }
    public SchemaComparisonValidationResultResponse getSchemaValidationResult() {
        return this.schemaValidationResult;
    }
    public String getSourceDatabaseName() {
        return this.sourceDatabaseName;
    }
    public String getStartedOn() {
        return this.startedOn;
    }
    public String getStatus() {
        return this.status;
    }
    public String getTargetDatabaseName() {
        return this.targetDatabaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbTaskOutputDatabaseLevelValidationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataIntegrityValidationResultResponse dataIntegrityValidationResult;
        private String endedOn;
        private String id;
        private String migrationId;
        private QueryAnalysisValidationResultResponse queryAnalysisValidationResult;
        private String resultType;
        private SchemaComparisonValidationResultResponse schemaValidationResult;
        private String sourceDatabaseName;
        private String startedOn;
        private String status;
        private String targetDatabaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbTaskOutputDatabaseLevelValidationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataIntegrityValidationResult = defaults.dataIntegrityValidationResult;
    	      this.endedOn = defaults.endedOn;
    	      this.id = defaults.id;
    	      this.migrationId = defaults.migrationId;
    	      this.queryAnalysisValidationResult = defaults.queryAnalysisValidationResult;
    	      this.resultType = defaults.resultType;
    	      this.schemaValidationResult = defaults.schemaValidationResult;
    	      this.sourceDatabaseName = defaults.sourceDatabaseName;
    	      this.startedOn = defaults.startedOn;
    	      this.status = defaults.status;
    	      this.targetDatabaseName = defaults.targetDatabaseName;
        }

        public Builder setDataIntegrityValidationResult(DataIntegrityValidationResultResponse dataIntegrityValidationResult) {
            this.dataIntegrityValidationResult = Objects.requireNonNull(dataIntegrityValidationResult);
            return this;
        }

        public Builder setEndedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMigrationId(String migrationId) {
            this.migrationId = Objects.requireNonNull(migrationId);
            return this;
        }

        public Builder setQueryAnalysisValidationResult(QueryAnalysisValidationResultResponse queryAnalysisValidationResult) {
            this.queryAnalysisValidationResult = Objects.requireNonNull(queryAnalysisValidationResult);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder setSchemaValidationResult(SchemaComparisonValidationResultResponse schemaValidationResult) {
            this.schemaValidationResult = Objects.requireNonNull(schemaValidationResult);
            return this;
        }

        public Builder setSourceDatabaseName(String sourceDatabaseName) {
            this.sourceDatabaseName = Objects.requireNonNull(sourceDatabaseName);
            return this;
        }

        public Builder setStartedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTargetDatabaseName(String targetDatabaseName) {
            this.targetDatabaseName = Objects.requireNonNull(targetDatabaseName);
            return this;
        }

        public MigrateSqlServerSqlDbTaskOutputDatabaseLevelValidationResultResponse build() {
            return new MigrateSqlServerSqlDbTaskOutputDatabaseLevelValidationResultResponse(dataIntegrityValidationResult, endedOn, id, migrationId, queryAnalysisValidationResult, resultType, schemaValidationResult, sourceDatabaseName, startedOn, status, targetDatabaseName);
        }
    }
}
