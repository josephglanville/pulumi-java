// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetManagedDatabaseSensitivityLabelResult {
    private final String columnName;
    private final String id;
    private final @Nullable String informationType;
    private final @Nullable String informationTypeId;
    private final Boolean isDisabled;
    private final @Nullable String labelId;
    private final @Nullable String labelName;
    private final String managedBy;
    private final String name;
    private final @Nullable String rank;
    private final String schemaName;
    private final String tableName;
    private final String type;

    @OutputCustomType.Constructor({"columnName","id","informationType","informationTypeId","isDisabled","labelId","labelName","managedBy","name","rank","schemaName","tableName","type"})
    private GetManagedDatabaseSensitivityLabelResult(
        String columnName,
        String id,
        @Nullable String informationType,
        @Nullable String informationTypeId,
        Boolean isDisabled,
        @Nullable String labelId,
        @Nullable String labelName,
        String managedBy,
        String name,
        @Nullable String rank,
        String schemaName,
        String tableName,
        String type) {
        this.columnName = Objects.requireNonNull(columnName);
        this.id = Objects.requireNonNull(id);
        this.informationType = informationType;
        this.informationTypeId = informationTypeId;
        this.isDisabled = Objects.requireNonNull(isDisabled);
        this.labelId = labelId;
        this.labelName = labelName;
        this.managedBy = Objects.requireNonNull(managedBy);
        this.name = Objects.requireNonNull(name);
        this.rank = rank;
        this.schemaName = Objects.requireNonNull(schemaName);
        this.tableName = Objects.requireNonNull(tableName);
        this.type = Objects.requireNonNull(type);
    }

    public String getColumnName() {
        return this.columnName;
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getInformationType() {
        return Optional.ofNullable(this.informationType);
    }
    public Optional<String> getInformationTypeId() {
        return Optional.ofNullable(this.informationTypeId);
    }
    public Boolean getIsDisabled() {
        return this.isDisabled;
    }
    public Optional<String> getLabelId() {
        return Optional.ofNullable(this.labelId);
    }
    public Optional<String> getLabelName() {
        return Optional.ofNullable(this.labelName);
    }
    public String getManagedBy() {
        return this.managedBy;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getRank() {
        return Optional.ofNullable(this.rank);
    }
    public String getSchemaName() {
        return this.schemaName;
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

    public static Builder builder(GetManagedDatabaseSensitivityLabelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String columnName;
        private String id;
        private @Nullable String informationType;
        private @Nullable String informationTypeId;
        private Boolean isDisabled;
        private @Nullable String labelId;
        private @Nullable String labelName;
        private String managedBy;
        private String name;
        private @Nullable String rank;
        private String schemaName;
        private String tableName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedDatabaseSensitivityLabelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.id = defaults.id;
    	      this.informationType = defaults.informationType;
    	      this.informationTypeId = defaults.informationTypeId;
    	      this.isDisabled = defaults.isDisabled;
    	      this.labelId = defaults.labelId;
    	      this.labelName = defaults.labelName;
    	      this.managedBy = defaults.managedBy;
    	      this.name = defaults.name;
    	      this.rank = defaults.rank;
    	      this.schemaName = defaults.schemaName;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        public Builder setColumnName(String columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInformationType(@Nullable String informationType) {
            this.informationType = informationType;
            return this;
        }

        public Builder setInformationTypeId(@Nullable String informationTypeId) {
            this.informationTypeId = informationTypeId;
            return this;
        }

        public Builder setIsDisabled(Boolean isDisabled) {
            this.isDisabled = Objects.requireNonNull(isDisabled);
            return this;
        }

        public Builder setLabelId(@Nullable String labelId) {
            this.labelId = labelId;
            return this;
        }

        public Builder setLabelName(@Nullable String labelName) {
            this.labelName = labelName;
            return this;
        }

        public Builder setManagedBy(String managedBy) {
            this.managedBy = Objects.requireNonNull(managedBy);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRank(@Nullable String rank) {
            this.rank = rank;
            return this;
        }

        public Builder setSchemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
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

        public GetManagedDatabaseSensitivityLabelResult build() {
            return new GetManagedDatabaseSensitivityLabelResult(columnName, id, informationType, informationTypeId, isDisabled, labelId, labelName, managedBy, name, rank, schemaName, tableName, type);
        }
    }
}
