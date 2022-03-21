// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.JobColumnSelector;
import io.pulumi.awsnative.databrew.outputs.JobColumnStatisticsConfiguration;
import io.pulumi.awsnative.databrew.outputs.JobEntityDetectorConfiguration;
import io.pulumi.awsnative.databrew.outputs.JobStatisticsConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobProfileConfiguration {
    private final @Nullable List<JobColumnStatisticsConfiguration> columnStatisticsConfigurations;
    private final @Nullable JobStatisticsConfiguration datasetStatisticsConfiguration;
    private final @Nullable JobEntityDetectorConfiguration entityDetectorConfiguration;
    private final @Nullable List<JobColumnSelector> profileColumns;

    @CustomType.Constructor
    private JobProfileConfiguration(
        @CustomType.Parameter("columnStatisticsConfigurations") @Nullable List<JobColumnStatisticsConfiguration> columnStatisticsConfigurations,
        @CustomType.Parameter("datasetStatisticsConfiguration") @Nullable JobStatisticsConfiguration datasetStatisticsConfiguration,
        @CustomType.Parameter("entityDetectorConfiguration") @Nullable JobEntityDetectorConfiguration entityDetectorConfiguration,
        @CustomType.Parameter("profileColumns") @Nullable List<JobColumnSelector> profileColumns) {
        this.columnStatisticsConfigurations = columnStatisticsConfigurations;
        this.datasetStatisticsConfiguration = datasetStatisticsConfiguration;
        this.entityDetectorConfiguration = entityDetectorConfiguration;
        this.profileColumns = profileColumns;
    }

    public List<JobColumnStatisticsConfiguration> getColumnStatisticsConfigurations() {
        return this.columnStatisticsConfigurations == null ? List.of() : this.columnStatisticsConfigurations;
    }
    public Optional<JobStatisticsConfiguration> getDatasetStatisticsConfiguration() {
        return Optional.ofNullable(this.datasetStatisticsConfiguration);
    }
    public Optional<JobEntityDetectorConfiguration> getEntityDetectorConfiguration() {
        return Optional.ofNullable(this.entityDetectorConfiguration);
    }
    public List<JobColumnSelector> getProfileColumns() {
        return this.profileColumns == null ? List.of() : this.profileColumns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobProfileConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<JobColumnStatisticsConfiguration> columnStatisticsConfigurations;
        private @Nullable JobStatisticsConfiguration datasetStatisticsConfiguration;
        private @Nullable JobEntityDetectorConfiguration entityDetectorConfiguration;
        private @Nullable List<JobColumnSelector> profileColumns;

        public Builder() {
    	      // Empty
        }

        public Builder(JobProfileConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnStatisticsConfigurations = defaults.columnStatisticsConfigurations;
    	      this.datasetStatisticsConfiguration = defaults.datasetStatisticsConfiguration;
    	      this.entityDetectorConfiguration = defaults.entityDetectorConfiguration;
    	      this.profileColumns = defaults.profileColumns;
        }

        public Builder columnStatisticsConfigurations(@Nullable List<JobColumnStatisticsConfiguration> columnStatisticsConfigurations) {
            this.columnStatisticsConfigurations = columnStatisticsConfigurations;
            return this;
        }
        public Builder columnStatisticsConfigurations(JobColumnStatisticsConfiguration... columnStatisticsConfigurations) {
            return columnStatisticsConfigurations(List.of(columnStatisticsConfigurations));
        }
        public Builder datasetStatisticsConfiguration(@Nullable JobStatisticsConfiguration datasetStatisticsConfiguration) {
            this.datasetStatisticsConfiguration = datasetStatisticsConfiguration;
            return this;
        }
        public Builder entityDetectorConfiguration(@Nullable JobEntityDetectorConfiguration entityDetectorConfiguration) {
            this.entityDetectorConfiguration = entityDetectorConfiguration;
            return this;
        }
        public Builder profileColumns(@Nullable List<JobColumnSelector> profileColumns) {
            this.profileColumns = profileColumns;
            return this;
        }
        public Builder profileColumns(JobColumnSelector... profileColumns) {
            return profileColumns(List.of(profileColumns));
        }        public JobProfileConfiguration build() {
            return new JobProfileConfiguration(columnStatisticsConfigurations, datasetStatisticsConfiguration, entityDetectorConfiguration, profileColumns);
        }
    }
}
