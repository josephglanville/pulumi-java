// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.DatabaseType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Database backup settings.
 * 
 */
public final class DatabaseBackupSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseBackupSettingArgs Empty = new DatabaseBackupSettingArgs();

    /**
     * Contains a connection string to a database which is being backed up or restored. If the restore should happen to a new database, the database name inside is the new one.
     * 
     */
    @Import(name="connectionString")
      private final @Nullable Output<String> connectionString;

    public Output<String> getConnectionString() {
        return this.connectionString == null ? Output.empty() : this.connectionString;
    }

    /**
     * Contains a connection string name that is linked to the SiteConfig.ConnectionStrings.
     * This is used during restore with overwrite connection strings options.
     * 
     */
    @Import(name="connectionStringName")
      private final @Nullable Output<String> connectionStringName;

    public Output<String> getConnectionStringName() {
        return this.connectionStringName == null ? Output.empty() : this.connectionStringName;
    }

    /**
     * Database type (e.g. SqlAzure / MySql).
     * 
     */
    @Import(name="databaseType", required=true)
      private final Output<Either<String,DatabaseType>> databaseType;

    public Output<Either<String,DatabaseType>> getDatabaseType() {
        return this.databaseType;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public DatabaseBackupSettingArgs(
        @Nullable Output<String> connectionString,
        @Nullable Output<String> connectionStringName,
        Output<Either<String,DatabaseType>> databaseType,
        @Nullable Output<String> name) {
        this.connectionString = connectionString;
        this.connectionStringName = connectionStringName;
        this.databaseType = Objects.requireNonNull(databaseType, "expected parameter 'databaseType' to be non-null");
        this.name = name;
    }

    private DatabaseBackupSettingArgs() {
        this.connectionString = Output.empty();
        this.connectionStringName = Output.empty();
        this.databaseType = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseBackupSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> connectionString;
        private @Nullable Output<String> connectionStringName;
        private Output<Either<String,DatabaseType>> databaseType;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseBackupSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.connectionStringName = defaults.connectionStringName;
    	      this.databaseType = defaults.databaseType;
    	      this.name = defaults.name;
        }

        public Builder connectionString(@Nullable Output<String> connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public Builder connectionString(@Nullable String connectionString) {
            this.connectionString = Output.ofNullable(connectionString);
            return this;
        }
        public Builder connectionStringName(@Nullable Output<String> connectionStringName) {
            this.connectionStringName = connectionStringName;
            return this;
        }
        public Builder connectionStringName(@Nullable String connectionStringName) {
            this.connectionStringName = Output.ofNullable(connectionStringName);
            return this;
        }
        public Builder databaseType(Output<Either<String,DatabaseType>> databaseType) {
            this.databaseType = Objects.requireNonNull(databaseType);
            return this;
        }
        public Builder databaseType(Either<String,DatabaseType> databaseType) {
            this.databaseType = Output.of(Objects.requireNonNull(databaseType));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public DatabaseBackupSettingArgs build() {
            return new DatabaseBackupSettingArgs(connectionString, connectionStringName, databaseType, name);
        }
    }
}
