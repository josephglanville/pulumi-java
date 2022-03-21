// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.DatasetS3LocationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetDatabaseInputDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetDatabaseInputDefinitionArgs Empty = new DatasetDatabaseInputDefinitionArgs();

    /**
     * Database table name
     * 
     */
    @Import(name="databaseTableName")
      private final @Nullable Output<String> databaseTableName;

    public Output<String> getDatabaseTableName() {
        return this.databaseTableName == null ? Output.empty() : this.databaseTableName;
    }

    /**
     * Glue connection name
     * 
     */
    @Import(name="glueConnectionName", required=true)
      private final Output<String> glueConnectionName;

    public Output<String> getGlueConnectionName() {
        return this.glueConnectionName;
    }

    /**
     * Custom SQL to run against the provided AWS Glue connection. This SQL will be used as the input for DataBrew projects and jobs.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<String> queryString;

    public Output<String> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    @Import(name="tempDirectory")
      private final @Nullable Output<DatasetS3LocationArgs> tempDirectory;

    public Output<DatasetS3LocationArgs> getTempDirectory() {
        return this.tempDirectory == null ? Output.empty() : this.tempDirectory;
    }

    public DatasetDatabaseInputDefinitionArgs(
        @Nullable Output<String> databaseTableName,
        Output<String> glueConnectionName,
        @Nullable Output<String> queryString,
        @Nullable Output<DatasetS3LocationArgs> tempDirectory) {
        this.databaseTableName = databaseTableName;
        this.glueConnectionName = Objects.requireNonNull(glueConnectionName, "expected parameter 'glueConnectionName' to be non-null");
        this.queryString = queryString;
        this.tempDirectory = tempDirectory;
    }

    private DatasetDatabaseInputDefinitionArgs() {
        this.databaseTableName = Output.empty();
        this.glueConnectionName = Output.empty();
        this.queryString = Output.empty();
        this.tempDirectory = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetDatabaseInputDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> databaseTableName;
        private Output<String> glueConnectionName;
        private @Nullable Output<String> queryString;
        private @Nullable Output<DatasetS3LocationArgs> tempDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetDatabaseInputDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseTableName = defaults.databaseTableName;
    	      this.glueConnectionName = defaults.glueConnectionName;
    	      this.queryString = defaults.queryString;
    	      this.tempDirectory = defaults.tempDirectory;
        }

        public Builder databaseTableName(@Nullable Output<String> databaseTableName) {
            this.databaseTableName = databaseTableName;
            return this;
        }
        public Builder databaseTableName(@Nullable String databaseTableName) {
            this.databaseTableName = Output.ofNullable(databaseTableName);
            return this;
        }
        public Builder glueConnectionName(Output<String> glueConnectionName) {
            this.glueConnectionName = Objects.requireNonNull(glueConnectionName);
            return this;
        }
        public Builder glueConnectionName(String glueConnectionName) {
            this.glueConnectionName = Output.of(Objects.requireNonNull(glueConnectionName));
            return this;
        }
        public Builder queryString(@Nullable Output<String> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable String queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }
        public Builder tempDirectory(@Nullable Output<DatasetS3LocationArgs> tempDirectory) {
            this.tempDirectory = tempDirectory;
            return this;
        }
        public Builder tempDirectory(@Nullable DatasetS3LocationArgs tempDirectory) {
            this.tempDirectory = Output.ofNullable(tempDirectory);
            return this;
        }        public DatasetDatabaseInputDefinitionArgs build() {
            return new DatasetDatabaseInputDefinitionArgs(databaseTableName, glueConnectionName, queryString, tempDirectory);
        }
    }
}
