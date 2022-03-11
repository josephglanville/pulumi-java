// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa;

import io.pulumi.awsnative.mwaa.enums.EnvironmentWebserverAccessMode;
import io.pulumi.awsnative.mwaa.inputs.EnvironmentLoggingConfigurationArgs;
import io.pulumi.awsnative.mwaa.inputs.EnvironmentNetworkConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Key/value pairs representing Airflow configuration variables.
     *     Keys are prefixed by their section:
     * 
     *     [core]
     *     dags_folder={AIRFLOW_HOME}/dags
     *     
     *     Would be represented as
     *     
     *     "core.dags_folder": "{AIRFLOW_HOME}/dags"
     * 
     */
    @InputImport(name="airflowConfigurationOptions")
      private final @Nullable Output<Object> airflowConfigurationOptions;

    public Output<Object> getAirflowConfigurationOptions() {
        return this.airflowConfigurationOptions == null ? Output.empty() : this.airflowConfigurationOptions;
    }

    @InputImport(name="airflowVersion")
      private final @Nullable Output<String> airflowVersion;

    public Output<String> getAirflowVersion() {
        return this.airflowVersion == null ? Output.empty() : this.airflowVersion;
    }

    @InputImport(name="dagS3Path")
      private final @Nullable Output<String> dagS3Path;

    public Output<String> getDagS3Path() {
        return this.dagS3Path == null ? Output.empty() : this.dagS3Path;
    }

    @InputImport(name="environmentClass")
      private final @Nullable Output<String> environmentClass;

    public Output<String> getEnvironmentClass() {
        return this.environmentClass == null ? Output.empty() : this.environmentClass;
    }

    @InputImport(name="executionRoleArn")
      private final @Nullable Output<String> executionRoleArn;

    public Output<String> getExecutionRoleArn() {
        return this.executionRoleArn == null ? Output.empty() : this.executionRoleArn;
    }

    @InputImport(name="kmsKey")
      private final @Nullable Output<String> kmsKey;

    public Output<String> getKmsKey() {
        return this.kmsKey == null ? Output.empty() : this.kmsKey;
    }

    @InputImport(name="loggingConfiguration")
      private final @Nullable Output<EnvironmentLoggingConfigurationArgs> loggingConfiguration;

    public Output<EnvironmentLoggingConfigurationArgs> getLoggingConfiguration() {
        return this.loggingConfiguration == null ? Output.empty() : this.loggingConfiguration;
    }

    @InputImport(name="maxWorkers")
      private final @Nullable Output<Integer> maxWorkers;

    public Output<Integer> getMaxWorkers() {
        return this.maxWorkers == null ? Output.empty() : this.maxWorkers;
    }

    @InputImport(name="minWorkers")
      private final @Nullable Output<Integer> minWorkers;

    public Output<Integer> getMinWorkers() {
        return this.minWorkers == null ? Output.empty() : this.minWorkers;
    }

    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @InputImport(name="networkConfiguration")
      private final @Nullable Output<EnvironmentNetworkConfigurationArgs> networkConfiguration;

    public Output<EnvironmentNetworkConfigurationArgs> getNetworkConfiguration() {
        return this.networkConfiguration == null ? Output.empty() : this.networkConfiguration;
    }

    @InputImport(name="pluginsS3ObjectVersion")
      private final @Nullable Output<String> pluginsS3ObjectVersion;

    public Output<String> getPluginsS3ObjectVersion() {
        return this.pluginsS3ObjectVersion == null ? Output.empty() : this.pluginsS3ObjectVersion;
    }

    @InputImport(name="pluginsS3Path")
      private final @Nullable Output<String> pluginsS3Path;

    public Output<String> getPluginsS3Path() {
        return this.pluginsS3Path == null ? Output.empty() : this.pluginsS3Path;
    }

    @InputImport(name="requirementsS3ObjectVersion")
      private final @Nullable Output<String> requirementsS3ObjectVersion;

    public Output<String> getRequirementsS3ObjectVersion() {
        return this.requirementsS3ObjectVersion == null ? Output.empty() : this.requirementsS3ObjectVersion;
    }

    @InputImport(name="requirementsS3Path")
      private final @Nullable Output<String> requirementsS3Path;

    public Output<String> getRequirementsS3Path() {
        return this.requirementsS3Path == null ? Output.empty() : this.requirementsS3Path;
    }

    @InputImport(name="schedulers")
      private final @Nullable Output<Integer> schedulers;

    public Output<Integer> getSchedulers() {
        return this.schedulers == null ? Output.empty() : this.schedulers;
    }

    @InputImport(name="sourceBucketArn")
      private final @Nullable Output<String> sourceBucketArn;

    public Output<String> getSourceBucketArn() {
        return this.sourceBucketArn == null ? Output.empty() : this.sourceBucketArn;
    }

    /**
     * A map of tags for the environment.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Object> tags;

    public Output<Object> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @InputImport(name="webserverAccessMode")
      private final @Nullable Output<EnvironmentWebserverAccessMode> webserverAccessMode;

    public Output<EnvironmentWebserverAccessMode> getWebserverAccessMode() {
        return this.webserverAccessMode == null ? Output.empty() : this.webserverAccessMode;
    }

    @InputImport(name="weeklyMaintenanceWindowStart")
      private final @Nullable Output<String> weeklyMaintenanceWindowStart;

    public Output<String> getWeeklyMaintenanceWindowStart() {
        return this.weeklyMaintenanceWindowStart == null ? Output.empty() : this.weeklyMaintenanceWindowStart;
    }

    public EnvironmentArgs(
        @Nullable Output<Object> airflowConfigurationOptions,
        @Nullable Output<String> airflowVersion,
        @Nullable Output<String> dagS3Path,
        @Nullable Output<String> environmentClass,
        @Nullable Output<String> executionRoleArn,
        @Nullable Output<String> kmsKey,
        @Nullable Output<EnvironmentLoggingConfigurationArgs> loggingConfiguration,
        @Nullable Output<Integer> maxWorkers,
        @Nullable Output<Integer> minWorkers,
        @Nullable Output<String> name,
        @Nullable Output<EnvironmentNetworkConfigurationArgs> networkConfiguration,
        @Nullable Output<String> pluginsS3ObjectVersion,
        @Nullable Output<String> pluginsS3Path,
        @Nullable Output<String> requirementsS3ObjectVersion,
        @Nullable Output<String> requirementsS3Path,
        @Nullable Output<Integer> schedulers,
        @Nullable Output<String> sourceBucketArn,
        @Nullable Output<Object> tags,
        @Nullable Output<EnvironmentWebserverAccessMode> webserverAccessMode,
        @Nullable Output<String> weeklyMaintenanceWindowStart) {
        this.airflowConfigurationOptions = airflowConfigurationOptions;
        this.airflowVersion = airflowVersion;
        this.dagS3Path = dagS3Path;
        this.environmentClass = environmentClass;
        this.executionRoleArn = executionRoleArn;
        this.kmsKey = kmsKey;
        this.loggingConfiguration = loggingConfiguration;
        this.maxWorkers = maxWorkers;
        this.minWorkers = minWorkers;
        this.name = name;
        this.networkConfiguration = networkConfiguration;
        this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
        this.pluginsS3Path = pluginsS3Path;
        this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
        this.requirementsS3Path = requirementsS3Path;
        this.schedulers = schedulers;
        this.sourceBucketArn = sourceBucketArn;
        this.tags = tags;
        this.webserverAccessMode = webserverAccessMode;
        this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
    }

    private EnvironmentArgs() {
        this.airflowConfigurationOptions = Output.empty();
        this.airflowVersion = Output.empty();
        this.dagS3Path = Output.empty();
        this.environmentClass = Output.empty();
        this.executionRoleArn = Output.empty();
        this.kmsKey = Output.empty();
        this.loggingConfiguration = Output.empty();
        this.maxWorkers = Output.empty();
        this.minWorkers = Output.empty();
        this.name = Output.empty();
        this.networkConfiguration = Output.empty();
        this.pluginsS3ObjectVersion = Output.empty();
        this.pluginsS3Path = Output.empty();
        this.requirementsS3ObjectVersion = Output.empty();
        this.requirementsS3Path = Output.empty();
        this.schedulers = Output.empty();
        this.sourceBucketArn = Output.empty();
        this.tags = Output.empty();
        this.webserverAccessMode = Output.empty();
        this.weeklyMaintenanceWindowStart = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> airflowConfigurationOptions;
        private @Nullable Output<String> airflowVersion;
        private @Nullable Output<String> dagS3Path;
        private @Nullable Output<String> environmentClass;
        private @Nullable Output<String> executionRoleArn;
        private @Nullable Output<String> kmsKey;
        private @Nullable Output<EnvironmentLoggingConfigurationArgs> loggingConfiguration;
        private @Nullable Output<Integer> maxWorkers;
        private @Nullable Output<Integer> minWorkers;
        private @Nullable Output<String> name;
        private @Nullable Output<EnvironmentNetworkConfigurationArgs> networkConfiguration;
        private @Nullable Output<String> pluginsS3ObjectVersion;
        private @Nullable Output<String> pluginsS3Path;
        private @Nullable Output<String> requirementsS3ObjectVersion;
        private @Nullable Output<String> requirementsS3Path;
        private @Nullable Output<Integer> schedulers;
        private @Nullable Output<String> sourceBucketArn;
        private @Nullable Output<Object> tags;
        private @Nullable Output<EnvironmentWebserverAccessMode> webserverAccessMode;
        private @Nullable Output<String> weeklyMaintenanceWindowStart;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowConfigurationOptions = defaults.airflowConfigurationOptions;
    	      this.airflowVersion = defaults.airflowVersion;
    	      this.dagS3Path = defaults.dagS3Path;
    	      this.environmentClass = defaults.environmentClass;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.kmsKey = defaults.kmsKey;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.maxWorkers = defaults.maxWorkers;
    	      this.minWorkers = defaults.minWorkers;
    	      this.name = defaults.name;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.pluginsS3ObjectVersion = defaults.pluginsS3ObjectVersion;
    	      this.pluginsS3Path = defaults.pluginsS3Path;
    	      this.requirementsS3ObjectVersion = defaults.requirementsS3ObjectVersion;
    	      this.requirementsS3Path = defaults.requirementsS3Path;
    	      this.schedulers = defaults.schedulers;
    	      this.sourceBucketArn = defaults.sourceBucketArn;
    	      this.tags = defaults.tags;
    	      this.webserverAccessMode = defaults.webserverAccessMode;
    	      this.weeklyMaintenanceWindowStart = defaults.weeklyMaintenanceWindowStart;
        }

        public Builder airflowConfigurationOptions(@Nullable Output<Object> airflowConfigurationOptions) {
            this.airflowConfigurationOptions = airflowConfigurationOptions;
            return this;
        }

        public Builder airflowConfigurationOptions(@Nullable Object airflowConfigurationOptions) {
            this.airflowConfigurationOptions = Output.ofNullable(airflowConfigurationOptions);
            return this;
        }

        public Builder airflowVersion(@Nullable Output<String> airflowVersion) {
            this.airflowVersion = airflowVersion;
            return this;
        }

        public Builder airflowVersion(@Nullable String airflowVersion) {
            this.airflowVersion = Output.ofNullable(airflowVersion);
            return this;
        }

        public Builder dagS3Path(@Nullable Output<String> dagS3Path) {
            this.dagS3Path = dagS3Path;
            return this;
        }

        public Builder dagS3Path(@Nullable String dagS3Path) {
            this.dagS3Path = Output.ofNullable(dagS3Path);
            return this;
        }

        public Builder environmentClass(@Nullable Output<String> environmentClass) {
            this.environmentClass = environmentClass;
            return this;
        }

        public Builder environmentClass(@Nullable String environmentClass) {
            this.environmentClass = Output.ofNullable(environmentClass);
            return this;
        }

        public Builder executionRoleArn(@Nullable Output<String> executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder executionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = Output.ofNullable(executionRoleArn);
            return this;
        }

        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = Output.ofNullable(kmsKey);
            return this;
        }

        public Builder loggingConfiguration(@Nullable Output<EnvironmentLoggingConfigurationArgs> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        public Builder loggingConfiguration(@Nullable EnvironmentLoggingConfigurationArgs loggingConfiguration) {
            this.loggingConfiguration = Output.ofNullable(loggingConfiguration);
            return this;
        }

        public Builder maxWorkers(@Nullable Output<Integer> maxWorkers) {
            this.maxWorkers = maxWorkers;
            return this;
        }

        public Builder maxWorkers(@Nullable Integer maxWorkers) {
            this.maxWorkers = Output.ofNullable(maxWorkers);
            return this;
        }

        public Builder minWorkers(@Nullable Output<Integer> minWorkers) {
            this.minWorkers = minWorkers;
            return this;
        }

        public Builder minWorkers(@Nullable Integer minWorkers) {
            this.minWorkers = Output.ofNullable(minWorkers);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder networkConfiguration(@Nullable Output<EnvironmentNetworkConfigurationArgs> networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        public Builder networkConfiguration(@Nullable EnvironmentNetworkConfigurationArgs networkConfiguration) {
            this.networkConfiguration = Output.ofNullable(networkConfiguration);
            return this;
        }

        public Builder pluginsS3ObjectVersion(@Nullable Output<String> pluginsS3ObjectVersion) {
            this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
            return this;
        }

        public Builder pluginsS3ObjectVersion(@Nullable String pluginsS3ObjectVersion) {
            this.pluginsS3ObjectVersion = Output.ofNullable(pluginsS3ObjectVersion);
            return this;
        }

        public Builder pluginsS3Path(@Nullable Output<String> pluginsS3Path) {
            this.pluginsS3Path = pluginsS3Path;
            return this;
        }

        public Builder pluginsS3Path(@Nullable String pluginsS3Path) {
            this.pluginsS3Path = Output.ofNullable(pluginsS3Path);
            return this;
        }

        public Builder requirementsS3ObjectVersion(@Nullable Output<String> requirementsS3ObjectVersion) {
            this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
            return this;
        }

        public Builder requirementsS3ObjectVersion(@Nullable String requirementsS3ObjectVersion) {
            this.requirementsS3ObjectVersion = Output.ofNullable(requirementsS3ObjectVersion);
            return this;
        }

        public Builder requirementsS3Path(@Nullable Output<String> requirementsS3Path) {
            this.requirementsS3Path = requirementsS3Path;
            return this;
        }

        public Builder requirementsS3Path(@Nullable String requirementsS3Path) {
            this.requirementsS3Path = Output.ofNullable(requirementsS3Path);
            return this;
        }

        public Builder schedulers(@Nullable Output<Integer> schedulers) {
            this.schedulers = schedulers;
            return this;
        }

        public Builder schedulers(@Nullable Integer schedulers) {
            this.schedulers = Output.ofNullable(schedulers);
            return this;
        }

        public Builder sourceBucketArn(@Nullable Output<String> sourceBucketArn) {
            this.sourceBucketArn = sourceBucketArn;
            return this;
        }

        public Builder sourceBucketArn(@Nullable String sourceBucketArn) {
            this.sourceBucketArn = Output.ofNullable(sourceBucketArn);
            return this;
        }

        public Builder tags(@Nullable Output<Object> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Object tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder webserverAccessMode(@Nullable Output<EnvironmentWebserverAccessMode> webserverAccessMode) {
            this.webserverAccessMode = webserverAccessMode;
            return this;
        }

        public Builder webserverAccessMode(@Nullable EnvironmentWebserverAccessMode webserverAccessMode) {
            this.webserverAccessMode = Output.ofNullable(webserverAccessMode);
            return this;
        }

        public Builder weeklyMaintenanceWindowStart(@Nullable Output<String> weeklyMaintenanceWindowStart) {
            this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
            return this;
        }

        public Builder weeklyMaintenanceWindowStart(@Nullable String weeklyMaintenanceWindowStart) {
            this.weeklyMaintenanceWindowStart = Output.ofNullable(weeklyMaintenanceWindowStart);
            return this;
        }
        public EnvironmentArgs build() {
            return new EnvironmentArgs(airflowConfigurationOptions, airflowVersion, dagS3Path, environmentClass, executionRoleArn, kmsKey, loggingConfiguration, maxWorkers, minWorkers, name, networkConfiguration, pluginsS3ObjectVersion, pluginsS3Path, requirementsS3ObjectVersion, requirementsS3Path, schedulers, sourceBucketArn, tags, webserverAccessMode, weeklyMaintenanceWindowStart);
        }
    }
}
