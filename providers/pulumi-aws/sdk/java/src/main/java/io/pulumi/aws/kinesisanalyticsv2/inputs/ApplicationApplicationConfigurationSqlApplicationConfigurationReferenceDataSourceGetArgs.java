// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs();

    @Import(name="referenceId")
      private final @Nullable Output<String> referenceId;

    public Output<String> getReferenceId() {
        return this.referenceId == null ? Output.empty() : this.referenceId;
    }

    /**
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
     * 
     */
    @Import(name="referenceSchema", required=true)
      private final Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs> referenceSchema;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs> getReferenceSchema() {
        return this.referenceSchema;
    }

    /**
     * Identifies the S3 bucket and object that contains the reference data.
     * 
     */
    @Import(name="s3ReferenceDataSource", required=true)
      private final Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs> s3ReferenceDataSource;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs> getS3ReferenceDataSource() {
        return this.s3ReferenceDataSource;
    }

    /**
     * The name of the in-application table to create.
     * 
     */
    @Import(name="tableName", required=true)
      private final Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs(
        @Nullable Output<String> referenceId,
        Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs> referenceSchema,
        Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs> s3ReferenceDataSource,
        Output<String> tableName) {
        this.referenceId = referenceId;
        this.referenceSchema = Objects.requireNonNull(referenceSchema, "expected parameter 'referenceSchema' to be non-null");
        this.s3ReferenceDataSource = Objects.requireNonNull(s3ReferenceDataSource, "expected parameter 's3ReferenceDataSource' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs() {
        this.referenceId = Output.empty();
        this.referenceSchema = Output.empty();
        this.s3ReferenceDataSource = Output.empty();
        this.tableName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> referenceId;
        private Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs> referenceSchema;
        private Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs> s3ReferenceDataSource;
        private Output<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceId = defaults.referenceId;
    	      this.referenceSchema = defaults.referenceSchema;
    	      this.s3ReferenceDataSource = defaults.s3ReferenceDataSource;
    	      this.tableName = defaults.tableName;
        }

        public Builder referenceId(@Nullable Output<String> referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public Builder referenceId(@Nullable String referenceId) {
            this.referenceId = Output.ofNullable(referenceId);
            return this;
        }
        public Builder referenceSchema(Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs> referenceSchema) {
            this.referenceSchema = Objects.requireNonNull(referenceSchema);
            return this;
        }
        public Builder referenceSchema(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaGetArgs referenceSchema) {
            this.referenceSchema = Output.of(Objects.requireNonNull(referenceSchema));
            return this;
        }
        public Builder s3ReferenceDataSource(Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs> s3ReferenceDataSource) {
            this.s3ReferenceDataSource = Objects.requireNonNull(s3ReferenceDataSource);
            return this;
        }
        public Builder s3ReferenceDataSource(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceGetArgs s3ReferenceDataSource) {
            this.s3ReferenceDataSource = Output.of(Objects.requireNonNull(s3ReferenceDataSource));
            return this;
        }
        public Builder tableName(Output<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Output.of(Objects.requireNonNull(tableName));
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceGetArgs(referenceId, referenceSchema, s3ReferenceDataSource, tableName);
        }
    }
}
