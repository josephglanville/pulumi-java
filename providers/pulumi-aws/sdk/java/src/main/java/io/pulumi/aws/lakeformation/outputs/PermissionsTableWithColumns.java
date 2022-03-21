// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PermissionsTableWithColumns {
    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    private final @Nullable String catalogId;
    /**
     * Set of column names for the table.
     * 
     */
    private final @Nullable List<String> columnNames;
    /**
     * Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    private final String databaseName;
    private final @Nullable List<String> excludedColumnNames;
    /**
     * Name of the table resource.
     * 
     */
    private final String name;
    private final @Nullable Boolean wildcard;

    @CustomType.Constructor
    private PermissionsTableWithColumns(
        @CustomType.Parameter("catalogId") @Nullable String catalogId,
        @CustomType.Parameter("columnNames") @Nullable List<String> columnNames,
        @CustomType.Parameter("databaseName") String databaseName,
        @CustomType.Parameter("excludedColumnNames") @Nullable List<String> excludedColumnNames,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("wildcard") @Nullable Boolean wildcard) {
        this.catalogId = catalogId;
        this.columnNames = columnNames;
        this.databaseName = databaseName;
        this.excludedColumnNames = excludedColumnNames;
        this.name = name;
        this.wildcard = wildcard;
    }

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
    */
    public Optional<String> getCatalogId() {
        return Optional.ofNullable(this.catalogId);
    }
    /**
     * Set of column names for the table.
     * 
    */
    public List<String> getColumnNames() {
        return this.columnNames == null ? List.of() : this.columnNames;
    }
    /**
     * Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
    */
    public String getDatabaseName() {
        return this.databaseName;
    }
    public List<String> getExcludedColumnNames() {
        return this.excludedColumnNames == null ? List.of() : this.excludedColumnNames;
    }
    /**
     * Name of the table resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    public Optional<Boolean> getWildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionsTableWithColumns defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalogId;
        private @Nullable List<String> columnNames;
        private String databaseName;
        private @Nullable List<String> excludedColumnNames;
        private String name;
        private @Nullable Boolean wildcard;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionsTableWithColumns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.columnNames = defaults.columnNames;
    	      this.databaseName = defaults.databaseName;
    	      this.excludedColumnNames = defaults.excludedColumnNames;
    	      this.name = defaults.name;
    	      this.wildcard = defaults.wildcard;
        }

        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Builder columnNames(@Nullable List<String> columnNames) {
            this.columnNames = columnNames;
            return this;
        }
        public Builder columnNames(String... columnNames) {
            return columnNames(List.of(columnNames));
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder excludedColumnNames(@Nullable List<String> excludedColumnNames) {
            this.excludedColumnNames = excludedColumnNames;
            return this;
        }
        public Builder excludedColumnNames(String... excludedColumnNames) {
            return excludedColumnNames(List.of(excludedColumnNames));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder wildcard(@Nullable Boolean wildcard) {
            this.wildcard = wildcard;
            return this;
        }        public PermissionsTableWithColumns build() {
            return new PermissionsTableWithColumns(catalogId, columnNames, databaseName, excludedColumnNames, name, wildcard);
        }
    }
}
