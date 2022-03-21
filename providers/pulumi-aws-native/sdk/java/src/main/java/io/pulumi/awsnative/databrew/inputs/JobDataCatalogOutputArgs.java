// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.JobDatabaseTableOutputOptionsArgs;
import io.pulumi.awsnative.databrew.inputs.JobS3TableOutputOptionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobDataCatalogOutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobDataCatalogOutputArgs Empty = new JobDataCatalogOutputArgs();

    @Import(name="catalogId")
      private final @Nullable Output<String> catalogId;

    public Output<String> getCatalogId() {
        return this.catalogId == null ? Output.empty() : this.catalogId;
    }

    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName;
    }

    @Import(name="databaseOptions")
      private final @Nullable Output<JobDatabaseTableOutputOptionsArgs> databaseOptions;

    public Output<JobDatabaseTableOutputOptionsArgs> getDatabaseOptions() {
        return this.databaseOptions == null ? Output.empty() : this.databaseOptions;
    }

    @Import(name="overwrite")
      private final @Nullable Output<Boolean> overwrite;

    public Output<Boolean> getOverwrite() {
        return this.overwrite == null ? Output.empty() : this.overwrite;
    }

    @Import(name="s3Options")
      private final @Nullable Output<JobS3TableOutputOptionsArgs> s3Options;

    public Output<JobS3TableOutputOptionsArgs> getS3Options() {
        return this.s3Options == null ? Output.empty() : this.s3Options;
    }

    @Import(name="tableName", required=true)
      private final Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName;
    }

    public JobDataCatalogOutputArgs(
        @Nullable Output<String> catalogId,
        Output<String> databaseName,
        @Nullable Output<JobDatabaseTableOutputOptionsArgs> databaseOptions,
        @Nullable Output<Boolean> overwrite,
        @Nullable Output<JobS3TableOutputOptionsArgs> s3Options,
        Output<String> tableName) {
        this.catalogId = catalogId;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.databaseOptions = databaseOptions;
        this.overwrite = overwrite;
        this.s3Options = s3Options;
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private JobDataCatalogOutputArgs() {
        this.catalogId = Output.empty();
        this.databaseName = Output.empty();
        this.databaseOptions = Output.empty();
        this.overwrite = Output.empty();
        this.s3Options = Output.empty();
        this.tableName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDataCatalogOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> catalogId;
        private Output<String> databaseName;
        private @Nullable Output<JobDatabaseTableOutputOptionsArgs> databaseOptions;
        private @Nullable Output<Boolean> overwrite;
        private @Nullable Output<JobS3TableOutputOptionsArgs> s3Options;
        private Output<String> tableName;

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

        public Builder catalogId(@Nullable Output<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = Output.ofNullable(catalogId);
            return this;
        }
        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }
        public Builder databaseOptions(@Nullable Output<JobDatabaseTableOutputOptionsArgs> databaseOptions) {
            this.databaseOptions = databaseOptions;
            return this;
        }
        public Builder databaseOptions(@Nullable JobDatabaseTableOutputOptionsArgs databaseOptions) {
            this.databaseOptions = Output.ofNullable(databaseOptions);
            return this;
        }
        public Builder overwrite(@Nullable Output<Boolean> overwrite) {
            this.overwrite = overwrite;
            return this;
        }
        public Builder overwrite(@Nullable Boolean overwrite) {
            this.overwrite = Output.ofNullable(overwrite);
            return this;
        }
        public Builder s3Options(@Nullable Output<JobS3TableOutputOptionsArgs> s3Options) {
            this.s3Options = s3Options;
            return this;
        }
        public Builder s3Options(@Nullable JobS3TableOutputOptionsArgs s3Options) {
            this.s3Options = Output.ofNullable(s3Options);
            return this;
        }
        public Builder tableName(Output<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Output.of(Objects.requireNonNull(tableName));
            return this;
        }        public JobDataCatalogOutputArgs build() {
            return new JobDataCatalogOutputArgs(catalogId, databaseName, databaseOptions, overwrite, s3Options, tableName);
        }
    }
}
