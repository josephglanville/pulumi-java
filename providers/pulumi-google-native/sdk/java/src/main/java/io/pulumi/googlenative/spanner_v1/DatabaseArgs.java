// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.spanner_v1.enums.DatabaseDatabaseDialect;
import io.pulumi.googlenative.spanner_v1.inputs.EncryptionConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    /**
     * A `CREATE DATABASE` statement, which specifies the ID of the new database. The database ID must conform to the regular expression `a-z*[a-z0-9]` and be between 2 and 30 characters in length. If the database ID is a reserved word or if it contains a hyphen, the database ID must be enclosed in backticks (`` ` ``).
     * 
     */
    @Import(name="createStatement", required=true)
      private final Output<String> createStatement;

    public Output<String> getCreateStatement() {
        return this.createStatement;
    }

    /**
     * Optional. The dialect of the Cloud Spanner Database.
     * 
     */
    @Import(name="databaseDialect")
      private final @Nullable Output<DatabaseDatabaseDialect> databaseDialect;

    public Output<DatabaseDatabaseDialect> getDatabaseDialect() {
        return this.databaseDialect == null ? Codegen.empty() : this.databaseDialect;
    }

    /**
     * Optional. The encryption configuration for the database. If this field is not specified, Cloud Spanner will encrypt/decrypt all data at rest using Google default encryption.
     * 
     */
    @Import(name="encryptionConfig")
      private final @Nullable Output<EncryptionConfigArgs> encryptionConfig;

    public Output<EncryptionConfigArgs> getEncryptionConfig() {
        return this.encryptionConfig == null ? Codegen.empty() : this.encryptionConfig;
    }

    /**
     * Optional. A list of DDL statements to run inside the newly created database. Statements can create tables, indexes, etc. These statements execute atomically with the creation of the database: if there is an error in any statement, the database is not created.
     * 
     */
    @Import(name="extraStatements")
      private final @Nullable Output<List<String>> extraStatements;

    public Output<List<String>> getExtraStatements() {
        return this.extraStatements == null ? Codegen.empty() : this.extraStatements;
    }

    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public DatabaseArgs(
        Output<String> createStatement,
        @Nullable Output<DatabaseDatabaseDialect> databaseDialect,
        @Nullable Output<EncryptionConfigArgs> encryptionConfig,
        @Nullable Output<List<String>> extraStatements,
        Output<String> instanceId,
        @Nullable Output<String> project) {
        this.createStatement = Objects.requireNonNull(createStatement, "expected parameter 'createStatement' to be non-null");
        this.databaseDialect = databaseDialect;
        this.encryptionConfig = encryptionConfig;
        this.extraStatements = extraStatements;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.project = project;
    }

    private DatabaseArgs() {
        this.createStatement = Codegen.empty();
        this.databaseDialect = Codegen.empty();
        this.encryptionConfig = Codegen.empty();
        this.extraStatements = Codegen.empty();
        this.instanceId = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> createStatement;
        private @Nullable Output<DatabaseDatabaseDialect> databaseDialect;
        private @Nullable Output<EncryptionConfigArgs> encryptionConfig;
        private @Nullable Output<List<String>> extraStatements;
        private Output<String> instanceId;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createStatement = defaults.createStatement;
    	      this.databaseDialect = defaults.databaseDialect;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.extraStatements = defaults.extraStatements;
    	      this.instanceId = defaults.instanceId;
    	      this.project = defaults.project;
        }

        public Builder createStatement(Output<String> createStatement) {
            this.createStatement = Objects.requireNonNull(createStatement);
            return this;
        }
        public Builder createStatement(String createStatement) {
            this.createStatement = Output.of(Objects.requireNonNull(createStatement));
            return this;
        }
        public Builder databaseDialect(@Nullable Output<DatabaseDatabaseDialect> databaseDialect) {
            this.databaseDialect = databaseDialect;
            return this;
        }
        public Builder databaseDialect(@Nullable DatabaseDatabaseDialect databaseDialect) {
            this.databaseDialect = Codegen.ofNullable(databaseDialect);
            return this;
        }
        public Builder encryptionConfig(@Nullable Output<EncryptionConfigArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public Builder encryptionConfig(@Nullable EncryptionConfigArgs encryptionConfig) {
            this.encryptionConfig = Codegen.ofNullable(encryptionConfig);
            return this;
        }
        public Builder extraStatements(@Nullable Output<List<String>> extraStatements) {
            this.extraStatements = extraStatements;
            return this;
        }
        public Builder extraStatements(@Nullable List<String> extraStatements) {
            this.extraStatements = Codegen.ofNullable(extraStatements);
            return this;
        }
        public Builder extraStatements(String... extraStatements) {
            return extraStatements(List.of(extraStatements));
        }
        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public DatabaseArgs build() {
            return new DatabaseArgs(createStatement, databaseDialect, encryptionConfig, extraStatements, instanceId, project);
        }
    }
}
