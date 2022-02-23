// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.RecipeS3Location;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecipeDataCatalogInputDefinition extends io.pulumi.resources.InvokeArgs {

    public static final RecipeDataCatalogInputDefinition Empty = new RecipeDataCatalogInputDefinition();

    /**
     * Catalog id
     * 
     */
    @InputImport(name="catalogId")
      private final @Nullable String catalogId;

    public Optional<String> getCatalogId() {
        return this.catalogId == null ? Optional.empty() : Optional.ofNullable(this.catalogId);
    }

    /**
     * Database name
     * 
     */
    @InputImport(name="databaseName")
      private final @Nullable String databaseName;

    public Optional<String> getDatabaseName() {
        return this.databaseName == null ? Optional.empty() : Optional.ofNullable(this.databaseName);
    }

    /**
     * Table name
     * 
     */
    @InputImport(name="tableName")
      private final @Nullable String tableName;

    public Optional<String> getTableName() {
        return this.tableName == null ? Optional.empty() : Optional.ofNullable(this.tableName);
    }

    @InputImport(name="tempDirectory")
      private final @Nullable RecipeS3Location tempDirectory;

    public Optional<RecipeS3Location> getTempDirectory() {
        return this.tempDirectory == null ? Optional.empty() : Optional.ofNullable(this.tempDirectory);
    }

    public RecipeDataCatalogInputDefinition(
        @Nullable String catalogId,
        @Nullable String databaseName,
        @Nullable String tableName,
        @Nullable RecipeS3Location tempDirectory) {
        this.catalogId = catalogId;
        this.databaseName = databaseName;
        this.tableName = tableName;
        this.tempDirectory = tempDirectory;
    }

    private RecipeDataCatalogInputDefinition() {
        this.catalogId = null;
        this.databaseName = null;
        this.tableName = null;
        this.tempDirectory = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeDataCatalogInputDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalogId;
        private @Nullable String databaseName;
        private @Nullable String tableName;
        private @Nullable RecipeS3Location tempDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeDataCatalogInputDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
    	      this.tableName = defaults.tableName;
    	      this.tempDirectory = defaults.tempDirectory;
        }

        public Builder setCatalogId(@Nullable String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setTableName(@Nullable String tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder setTempDirectory(@Nullable RecipeS3Location tempDirectory) {
            this.tempDirectory = tempDirectory;
            return this;
        }
        public RecipeDataCatalogInputDefinition build() {
            return new RecipeDataCatalogInputDefinition(catalogId, databaseName, tableName, tempDirectory);
        }
    }
}
