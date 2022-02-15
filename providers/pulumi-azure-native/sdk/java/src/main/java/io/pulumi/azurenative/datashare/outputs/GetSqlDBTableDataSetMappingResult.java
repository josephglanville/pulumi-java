// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSqlDBTableDataSetMappingResult {
    private final String dataSetId;
    private final String dataSetMappingStatus;
    private final String databaseName;
    private final String id;
    private final String kind;
    private final String name;
    private final String provisioningState;
    private final String schemaName;
    private final String sqlServerResourceId;
    private final SystemDataResponse systemData;
    private final String tableName;
    private final String type;

    @OutputCustomType.Constructor({"dataSetId","dataSetMappingStatus","databaseName","id","kind","name","provisioningState","schemaName","sqlServerResourceId","systemData","tableName","type"})
    private GetSqlDBTableDataSetMappingResult(
        String dataSetId,
        String dataSetMappingStatus,
        String databaseName,
        String id,
        String kind,
        String name,
        String provisioningState,
        String schemaName,
        String sqlServerResourceId,
        SystemDataResponse systemData,
        String tableName,
        String type) {
        this.dataSetId = Objects.requireNonNull(dataSetId);
        this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
        this.databaseName = Objects.requireNonNull(databaseName);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.schemaName = Objects.requireNonNull(schemaName);
        this.sqlServerResourceId = Objects.requireNonNull(sqlServerResourceId);
        this.systemData = Objects.requireNonNull(systemData);
        this.tableName = Objects.requireNonNull(tableName);
        this.type = Objects.requireNonNull(type);
    }

    public String getDataSetId() {
        return this.dataSetId;
    }
    public String getDataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }
    public String getId() {
        return this.id;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getSchemaName() {
        return this.schemaName;
    }
    public String getSqlServerResourceId() {
        return this.sqlServerResourceId;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getTableName() {
        return this.tableName;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlDBTableDataSetMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetId;
        private String dataSetMappingStatus;
        private String databaseName;
        private String id;
        private String kind;
        private String name;
        private String provisioningState;
        private String schemaName;
        private String sqlServerResourceId;
        private SystemDataResponse systemData;
        private String tableName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlDBTableDataSetMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingStatus = defaults.dataSetMappingStatus;
    	      this.databaseName = defaults.databaseName;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.schemaName = defaults.schemaName;
    	      this.sqlServerResourceId = defaults.sqlServerResourceId;
    	      this.systemData = defaults.systemData;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        public Builder setDataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder setDataSetMappingStatus(String dataSetMappingStatus) {
            this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSchemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }

        public Builder setSqlServerResourceId(String sqlServerResourceId) {
            this.sqlServerResourceId = Objects.requireNonNull(sqlServerResourceId);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetSqlDBTableDataSetMappingResult build() {
            return new GetSqlDBTableDataSetMappingResult(dataSetId, dataSetMappingStatus, databaseName, id, kind, name, provisioningState, schemaName, sqlServerResourceId, systemData, tableName, type);
        }
    }
}