// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.metastore_v1alpha.enums.DatabaseDumpDatabaseType;
import io.pulumi.googlenative.metastore_v1alpha.enums.DatabaseDumpType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A specification of the location of and metadata about a database dump from a relational database management system.
 * 
 */
public final class DatabaseDumpArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseDumpArgs Empty = new DatabaseDumpArgs();

    /**
     * The type of the database.
     * 
     */
    @InputImport(name="databaseType")
      private final @Nullable Output<DatabaseDumpDatabaseType> databaseType;

    public Output<DatabaseDumpDatabaseType> getDatabaseType() {
        return this.databaseType == null ? Output.empty() : this.databaseType;
    }

    /**
     * A Cloud Storage object or folder URI that specifies the source from which to import metadata. It must begin with gs://.
     * 
     */
    @InputImport(name="gcsUri")
      private final @Nullable Output<String> gcsUri;

    public Output<String> getGcsUri() {
        return this.gcsUri == null ? Output.empty() : this.gcsUri;
    }

    /**
     * The name of the source database.
     * 
     */
    @InputImport(name="sourceDatabase")
      private final @Nullable Output<String> sourceDatabase;

    public Output<String> getSourceDatabase() {
        return this.sourceDatabase == null ? Output.empty() : this.sourceDatabase;
    }

    /**
     * Optional. The type of the database dump. If unspecified, defaults to MYSQL.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Output<DatabaseDumpType> type;

    public Output<DatabaseDumpType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public DatabaseDumpArgs(
        @Nullable Output<DatabaseDumpDatabaseType> databaseType,
        @Nullable Output<String> gcsUri,
        @Nullable Output<String> sourceDatabase,
        @Nullable Output<DatabaseDumpType> type) {
        this.databaseType = databaseType;
        this.gcsUri = gcsUri;
        this.sourceDatabase = sourceDatabase;
        this.type = type;
    }

    private DatabaseDumpArgs() {
        this.databaseType = Output.empty();
        this.gcsUri = Output.empty();
        this.sourceDatabase = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseDumpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DatabaseDumpDatabaseType> databaseType;
        private @Nullable Output<String> gcsUri;
        private @Nullable Output<String> sourceDatabase;
        private @Nullable Output<DatabaseDumpType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseDumpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseType = defaults.databaseType;
    	      this.gcsUri = defaults.gcsUri;
    	      this.sourceDatabase = defaults.sourceDatabase;
    	      this.type = defaults.type;
        }

        public Builder databaseType(@Nullable Output<DatabaseDumpDatabaseType> databaseType) {
            this.databaseType = databaseType;
            return this;
        }

        public Builder databaseType(@Nullable DatabaseDumpDatabaseType databaseType) {
            this.databaseType = Output.ofNullable(databaseType);
            return this;
        }

        public Builder gcsUri(@Nullable Output<String> gcsUri) {
            this.gcsUri = gcsUri;
            return this;
        }

        public Builder gcsUri(@Nullable String gcsUri) {
            this.gcsUri = Output.ofNullable(gcsUri);
            return this;
        }

        public Builder sourceDatabase(@Nullable Output<String> sourceDatabase) {
            this.sourceDatabase = sourceDatabase;
            return this;
        }

        public Builder sourceDatabase(@Nullable String sourceDatabase) {
            this.sourceDatabase = Output.ofNullable(sourceDatabase);
            return this;
        }

        public Builder type(@Nullable Output<DatabaseDumpType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable DatabaseDumpType type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public DatabaseDumpArgs build() {
            return new DatabaseDumpArgs(databaseType, gcsUri, sourceDatabase, type);
        }
    }
}
