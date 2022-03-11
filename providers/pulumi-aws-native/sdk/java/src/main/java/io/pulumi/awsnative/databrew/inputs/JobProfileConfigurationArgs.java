// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.JobColumnSelectorArgs;
import io.pulumi.awsnative.databrew.inputs.JobColumnStatisticsConfigurationArgs;
import io.pulumi.awsnative.databrew.inputs.JobEntityDetectorConfigurationArgs;
import io.pulumi.awsnative.databrew.inputs.JobStatisticsConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobProfileConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobProfileConfigurationArgs Empty = new JobProfileConfigurationArgs();

    @InputImport(name="columnStatisticsConfigurations")
      private final @Nullable Output<List<JobColumnStatisticsConfigurationArgs>> columnStatisticsConfigurations;

    public Output<List<JobColumnStatisticsConfigurationArgs>> getColumnStatisticsConfigurations() {
        return this.columnStatisticsConfigurations == null ? Output.empty() : this.columnStatisticsConfigurations;
    }

    @InputImport(name="datasetStatisticsConfiguration")
      private final @Nullable Output<JobStatisticsConfigurationArgs> datasetStatisticsConfiguration;

    public Output<JobStatisticsConfigurationArgs> getDatasetStatisticsConfiguration() {
        return this.datasetStatisticsConfiguration == null ? Output.empty() : this.datasetStatisticsConfiguration;
    }

    @InputImport(name="entityDetectorConfiguration")
      private final @Nullable Output<JobEntityDetectorConfigurationArgs> entityDetectorConfiguration;

    public Output<JobEntityDetectorConfigurationArgs> getEntityDetectorConfiguration() {
        return this.entityDetectorConfiguration == null ? Output.empty() : this.entityDetectorConfiguration;
    }

    @InputImport(name="profileColumns")
      private final @Nullable Output<List<JobColumnSelectorArgs>> profileColumns;

    public Output<List<JobColumnSelectorArgs>> getProfileColumns() {
        return this.profileColumns == null ? Output.empty() : this.profileColumns;
    }

    public JobProfileConfigurationArgs(
        @Nullable Output<List<JobColumnStatisticsConfigurationArgs>> columnStatisticsConfigurations,
        @Nullable Output<JobStatisticsConfigurationArgs> datasetStatisticsConfiguration,
        @Nullable Output<JobEntityDetectorConfigurationArgs> entityDetectorConfiguration,
        @Nullable Output<List<JobColumnSelectorArgs>> profileColumns) {
        this.columnStatisticsConfigurations = columnStatisticsConfigurations;
        this.datasetStatisticsConfiguration = datasetStatisticsConfiguration;
        this.entityDetectorConfiguration = entityDetectorConfiguration;
        this.profileColumns = profileColumns;
    }

    private JobProfileConfigurationArgs() {
        this.columnStatisticsConfigurations = Output.empty();
        this.datasetStatisticsConfiguration = Output.empty();
        this.entityDetectorConfiguration = Output.empty();
        this.profileColumns = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobProfileConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<JobColumnStatisticsConfigurationArgs>> columnStatisticsConfigurations;
        private @Nullable Output<JobStatisticsConfigurationArgs> datasetStatisticsConfiguration;
        private @Nullable Output<JobEntityDetectorConfigurationArgs> entityDetectorConfiguration;
        private @Nullable Output<List<JobColumnSelectorArgs>> profileColumns;

        public Builder() {
    	      // Empty
        }

        public Builder(JobProfileConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnStatisticsConfigurations = defaults.columnStatisticsConfigurations;
    	      this.datasetStatisticsConfiguration = defaults.datasetStatisticsConfiguration;
    	      this.entityDetectorConfiguration = defaults.entityDetectorConfiguration;
    	      this.profileColumns = defaults.profileColumns;
        }

        public Builder columnStatisticsConfigurations(@Nullable Output<List<JobColumnStatisticsConfigurationArgs>> columnStatisticsConfigurations) {
            this.columnStatisticsConfigurations = columnStatisticsConfigurations;
            return this;
        }

        public Builder columnStatisticsConfigurations(@Nullable List<JobColumnStatisticsConfigurationArgs> columnStatisticsConfigurations) {
            this.columnStatisticsConfigurations = Output.ofNullable(columnStatisticsConfigurations);
            return this;
        }

        public Builder datasetStatisticsConfiguration(@Nullable Output<JobStatisticsConfigurationArgs> datasetStatisticsConfiguration) {
            this.datasetStatisticsConfiguration = datasetStatisticsConfiguration;
            return this;
        }

        public Builder datasetStatisticsConfiguration(@Nullable JobStatisticsConfigurationArgs datasetStatisticsConfiguration) {
            this.datasetStatisticsConfiguration = Output.ofNullable(datasetStatisticsConfiguration);
            return this;
        }

        public Builder entityDetectorConfiguration(@Nullable Output<JobEntityDetectorConfigurationArgs> entityDetectorConfiguration) {
            this.entityDetectorConfiguration = entityDetectorConfiguration;
            return this;
        }

        public Builder entityDetectorConfiguration(@Nullable JobEntityDetectorConfigurationArgs entityDetectorConfiguration) {
            this.entityDetectorConfiguration = Output.ofNullable(entityDetectorConfiguration);
            return this;
        }

        public Builder profileColumns(@Nullable Output<List<JobColumnSelectorArgs>> profileColumns) {
            this.profileColumns = profileColumns;
            return this;
        }

        public Builder profileColumns(@Nullable List<JobColumnSelectorArgs> profileColumns) {
            this.profileColumns = Output.ofNullable(profileColumns);
            return this;
        }
        public JobProfileConfigurationArgs build() {
            return new JobProfileConfigurationArgs(columnStatisticsConfigurations, datasetStatisticsConfiguration, entityDetectorConfiguration, profileColumns);
        }
    }
}
