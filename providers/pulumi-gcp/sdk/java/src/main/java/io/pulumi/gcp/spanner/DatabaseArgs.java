// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.spanner;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.spanner.inputs.DatabaseEncryptionConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    /**
     * An optional list of DDL statements to run inside the newly created
     * database. Statements can create tables, indexes, etc. These statements
     * execute atomically with the creation of the database: if there is an
     * error in any statement, the database is not created.
     * 
     */
    @InputImport(name="ddls")
      private final @Nullable Input<List<String>> ddls;

    public Input<List<String>> getDdls() {
        return this.ddls == null ? Input.empty() : this.ddls;
    }

    /**
     * Whether or not to allow the provider to destroy the instance. Unless this field is set to false
     * in state, a `destroy` or `update` that would delete the instance will fail.
     * 
     */
    @InputImport(name="deletionProtection")
      private final @Nullable Input<Boolean> deletionProtection;

    public Input<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Input.empty() : this.deletionProtection;
    }

    /**
     * Encryption configuration for the database
     * Structure is documented below.
     * 
     */
    @InputImport(name="encryptionConfig")
      private final @Nullable Input<DatabaseEncryptionConfigArgs> encryptionConfig;

    public Input<DatabaseEncryptionConfigArgs> getEncryptionConfig() {
        return this.encryptionConfig == null ? Input.empty() : this.encryptionConfig;
    }

    /**
     * The instance to create the database on.
     * 
     */
    @InputImport(name="instance", required=true)
      private final Input<String> instance;

    public Input<String> getInstance() {
        return this.instance;
    }

    /**
     * A unique identifier for the database, which cannot be changed after
     * the instance is created. Values are of the form [a-z][-a-z0-9]*[a-z0-9].
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public DatabaseArgs(
        @Nullable Input<List<String>> ddls,
        @Nullable Input<Boolean> deletionProtection,
        @Nullable Input<DatabaseEncryptionConfigArgs> encryptionConfig,
        Input<String> instance,
        @Nullable Input<String> name,
        @Nullable Input<String> project) {
        this.ddls = ddls;
        this.deletionProtection = deletionProtection;
        this.encryptionConfig = encryptionConfig;
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.name = name;
        this.project = project;
    }

    private DatabaseArgs() {
        this.ddls = Input.empty();
        this.deletionProtection = Input.empty();
        this.encryptionConfig = Input.empty();
        this.instance = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> ddls;
        private @Nullable Input<Boolean> deletionProtection;
        private @Nullable Input<DatabaseEncryptionConfigArgs> encryptionConfig;
        private Input<String> instance;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ddls = defaults.ddls;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.instance = defaults.instance;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setDdls(@Nullable Input<List<String>> ddls) {
            this.ddls = ddls;
            return this;
        }

        public Builder setDdls(@Nullable List<String> ddls) {
            this.ddls = Input.ofNullable(ddls);
            return this;
        }

        public Builder setDeletionProtection(@Nullable Input<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        public Builder setDeletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Input.ofNullable(deletionProtection);
            return this;
        }

        public Builder setEncryptionConfig(@Nullable Input<DatabaseEncryptionConfigArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }

        public Builder setEncryptionConfig(@Nullable DatabaseEncryptionConfigArgs encryptionConfig) {
            this.encryptionConfig = Input.ofNullable(encryptionConfig);
            return this;
        }

        public Builder setInstance(Input<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Input.of(Objects.requireNonNull(instance));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public DatabaseArgs build() {
            return new DatabaseArgs(ddls, deletionProtection, encryptionConfig, instance, name, project);
        }
    }
}
