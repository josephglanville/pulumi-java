// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.JobDatabaseTableOutputOptionsArgs;
import io.pulumi.awsnative.databrew.inputs.JobS3TableOutputOptionsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobDataCatalogOutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobDataCatalogOutputArgs Empty = new JobDataCatalogOutputArgs();

    @InputImport(name="catalogId")
      private final @Nullable Input<String> catalogId;

    public Input<String> getCatalogId() {
        return this.catalogId == null ? Input.empty() : this.catalogId;
    }

    @InputImport(name="databaseName", required=true)
      private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    @InputImport(name="databaseOptions")
      private final @Nullable Input<JobDatabaseTableOutputOptionsArgs> databaseOptions;

    public Input<JobDatabaseTableOutputOptionsArgs> getDatabaseOptions() {
        return this.databaseOptions == null ? Input.empty() : this.databaseOptions;
    }

    @InputImport(name="overwrite")
      private final @Nullable Input<Boolean> overwrite;

    public Input<Boolean> getOverwrite() {
        return this.overwrite == null ? Input.empty() : this.overwrite;
    }

    @InputImport(name="s3Options")
      private final @Nullable Input<JobS3TableOutputOptionsArgs> s3Options;

    public Input<JobS3TableOutputOptionsArgs> getS3Options() {
        return this.s3Options == null ? Input.empty() : this.s3Options;
    }

    @InputImport(name="tableName", required=true)
      private final Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName;
    }

    public JobDataCatalogOutputArgs(
        @Nullable Input<String> catalogId,
        Input<String> databaseName,
        @Nullable Input<JobDatabaseTableOutputOptionsArgs> databaseOptions,
        @Nullable Input<Boolean> overwrite,
        @Nullable Input<JobS3TableOutputOptionsArgs> s3Options,
        Input<String> tableName) {
        this.catalogId = catalogId;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.databaseOptions = databaseOptions;
        this.overwrite = overwrite;
        this.s3Options = s3Options;
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private JobDataCatalogOutputArgs() {
        this.catalogId = Input.empty();
        this.databaseName = Input.empty();
        this.databaseOptions = Input.empty();
        this.overwrite = Input.empty();
        this.s3Options = Input.empty();
        this.tableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDataCatalogOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> catalogId;
        private Input<String> databaseName;
        private @Nullable Input<JobDatabaseTableOutputOptionsArgs> databaseOptions;
        private @Nullable Input<Boolean> overwrite;
        private @Nullable Input<JobS3TableOutputOptionsArgs> s3Options;
        private Input<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDataCatalogOutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
    	      this.databaseOptions = defaults.databaseOptions;
    	      this.overwrite = defaults.overwrite;
    	      this.s3Options = defaults.s3Options;
    	      this.tableName = defaults.tableName;
        }

        public Builder setCatalogId(@Nullable Input<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder setCatalogId(@Nullable String catalogId) {
            this.catalogId = Input.ofNullable(catalogId);
            return this;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setDatabaseOptions(@Nullable Input<JobDatabaseTableOutputOptionsArgs> databaseOptions) {
            this.databaseOptions = databaseOptions;
            return this;
        }

        public Builder setDatabaseOptions(@Nullable JobDatabaseTableOutputOptionsArgs databaseOptions) {
            this.databaseOptions = Input.ofNullable(databaseOptions);
            return this;
        }

        public Builder setOverwrite(@Nullable Input<Boolean> overwrite) {
            this.overwrite = overwrite;
            return this;
        }

        public Builder setOverwrite(@Nullable Boolean overwrite) {
            this.overwrite = Input.ofNullable(overwrite);
            return this;
        }

        public Builder setS3Options(@Nullable Input<JobS3TableOutputOptionsArgs> s3Options) {
            this.s3Options = s3Options;
            return this;
        }

        public Builder setS3Options(@Nullable JobS3TableOutputOptionsArgs s3Options) {
            this.s3Options = Input.ofNullable(s3Options);
            return this;
        }

        public Builder setTableName(Input<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Input.of(Objects.requireNonNull(tableName));
            return this;
        }
        public JobDataCatalogOutputArgs build() {
            return new JobDataCatalogOutputArgs(catalogId, databaseName, databaseOptions, overwrite, s3Options, tableName);
        }
    }
}
