// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationEnvironmentPropertiesArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationVpcConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationArgs Empty = new ApplicationApplicationConfigurationArgs();

    /**
     * The code location and type parameters for the application.
     * 
     */
    @InputImport(name="applicationCodeConfiguration", required=true)
      private final Output<ApplicationApplicationConfigurationApplicationCodeConfigurationArgs> applicationCodeConfiguration;

    public Output<ApplicationApplicationConfigurationApplicationCodeConfigurationArgs> getApplicationCodeConfiguration() {
        return this.applicationCodeConfiguration;
    }

    /**
     * Describes whether snapshots are enabled for a Flink-based application.
     * 
     */
    @InputImport(name="applicationSnapshotConfiguration")
      private final @Nullable Output<ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs> applicationSnapshotConfiguration;

    public Output<ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs> getApplicationSnapshotConfiguration() {
        return this.applicationSnapshotConfiguration == null ? Output.empty() : this.applicationSnapshotConfiguration;
    }

    /**
     * Describes execution properties for a Flink-based application.
     * 
     */
    @InputImport(name="environmentProperties")
      private final @Nullable Output<ApplicationApplicationConfigurationEnvironmentPropertiesArgs> environmentProperties;

    public Output<ApplicationApplicationConfigurationEnvironmentPropertiesArgs> getEnvironmentProperties() {
        return this.environmentProperties == null ? Output.empty() : this.environmentProperties;
    }

    /**
     * The configuration of a Flink-based application.
     * 
     */
    @InputImport(name="flinkApplicationConfiguration")
      private final @Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs> flinkApplicationConfiguration;

    public Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs> getFlinkApplicationConfiguration() {
        return this.flinkApplicationConfiguration == null ? Output.empty() : this.flinkApplicationConfiguration;
    }

    /**
     * Describes the starting properties for a Flink-based application.
     * 
     */
    @InputImport(name="runConfiguration")
      private final @Nullable Output<ApplicationApplicationConfigurationRunConfigurationArgs> runConfiguration;

    public Output<ApplicationApplicationConfigurationRunConfigurationArgs> getRunConfiguration() {
        return this.runConfiguration == null ? Output.empty() : this.runConfiguration;
    }

    /**
     * The configuration of a SQL-based application.
     * 
     */
    @InputImport(name="sqlApplicationConfiguration")
      private final @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationArgs> sqlApplicationConfiguration;

    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationArgs> getSqlApplicationConfiguration() {
        return this.sqlApplicationConfiguration == null ? Output.empty() : this.sqlApplicationConfiguration;
    }

    /**
     * The VPC configuration of a Flink-based application.
     * 
     */
    @InputImport(name="vpcConfiguration")
      private final @Nullable Output<ApplicationApplicationConfigurationVpcConfigurationArgs> vpcConfiguration;

    public Output<ApplicationApplicationConfigurationVpcConfigurationArgs> getVpcConfiguration() {
        return this.vpcConfiguration == null ? Output.empty() : this.vpcConfiguration;
    }

    public ApplicationApplicationConfigurationArgs(
        Output<ApplicationApplicationConfigurationApplicationCodeConfigurationArgs> applicationCodeConfiguration,
        @Nullable Output<ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs> applicationSnapshotConfiguration,
        @Nullable Output<ApplicationApplicationConfigurationEnvironmentPropertiesArgs> environmentProperties,
        @Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs> flinkApplicationConfiguration,
        @Nullable Output<ApplicationApplicationConfigurationRunConfigurationArgs> runConfiguration,
        @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationArgs> sqlApplicationConfiguration,
        @Nullable Output<ApplicationApplicationConfigurationVpcConfigurationArgs> vpcConfiguration) {
        this.applicationCodeConfiguration = Objects.requireNonNull(applicationCodeConfiguration, "expected parameter 'applicationCodeConfiguration' to be non-null");
        this.applicationSnapshotConfiguration = applicationSnapshotConfiguration;
        this.environmentProperties = environmentProperties;
        this.flinkApplicationConfiguration = flinkApplicationConfiguration;
        this.runConfiguration = runConfiguration;
        this.sqlApplicationConfiguration = sqlApplicationConfiguration;
        this.vpcConfiguration = vpcConfiguration;
    }

    private ApplicationApplicationConfigurationArgs() {
        this.applicationCodeConfiguration = Output.empty();
        this.applicationSnapshotConfiguration = Output.empty();
        this.environmentProperties = Output.empty();
        this.flinkApplicationConfiguration = Output.empty();
        this.runConfiguration = Output.empty();
        this.sqlApplicationConfiguration = Output.empty();
        this.vpcConfiguration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ApplicationApplicationConfigurationApplicationCodeConfigurationArgs> applicationCodeConfiguration;
        private @Nullable Output<ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs> applicationSnapshotConfiguration;
        private @Nullable Output<ApplicationApplicationConfigurationEnvironmentPropertiesArgs> environmentProperties;
        private @Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs> flinkApplicationConfiguration;
        private @Nullable Output<ApplicationApplicationConfigurationRunConfigurationArgs> runConfiguration;
        private @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationArgs> sqlApplicationConfiguration;
        private @Nullable Output<ApplicationApplicationConfigurationVpcConfigurationArgs> vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationCodeConfiguration = defaults.applicationCodeConfiguration;
    	      this.applicationSnapshotConfiguration = defaults.applicationSnapshotConfiguration;
    	      this.environmentProperties = defaults.environmentProperties;
    	      this.flinkApplicationConfiguration = defaults.flinkApplicationConfiguration;
    	      this.runConfiguration = defaults.runConfiguration;
    	      this.sqlApplicationConfiguration = defaults.sqlApplicationConfiguration;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder applicationCodeConfiguration(Output<ApplicationApplicationConfigurationApplicationCodeConfigurationArgs> applicationCodeConfiguration) {
            this.applicationCodeConfiguration = Objects.requireNonNull(applicationCodeConfiguration);
            return this;
        }

        public Builder applicationCodeConfiguration(ApplicationApplicationConfigurationApplicationCodeConfigurationArgs applicationCodeConfiguration) {
            this.applicationCodeConfiguration = Output.of(Objects.requireNonNull(applicationCodeConfiguration));
            return this;
        }

        public Builder applicationSnapshotConfiguration(@Nullable Output<ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs> applicationSnapshotConfiguration) {
            this.applicationSnapshotConfiguration = applicationSnapshotConfiguration;
            return this;
        }

        public Builder applicationSnapshotConfiguration(@Nullable ApplicationApplicationConfigurationApplicationSnapshotConfigurationArgs applicationSnapshotConfiguration) {
            this.applicationSnapshotConfiguration = Output.ofNullable(applicationSnapshotConfiguration);
            return this;
        }

        public Builder environmentProperties(@Nullable Output<ApplicationApplicationConfigurationEnvironmentPropertiesArgs> environmentProperties) {
            this.environmentProperties = environmentProperties;
            return this;
        }

        public Builder environmentProperties(@Nullable ApplicationApplicationConfigurationEnvironmentPropertiesArgs environmentProperties) {
            this.environmentProperties = Output.ofNullable(environmentProperties);
            return this;
        }

        public Builder flinkApplicationConfiguration(@Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs> flinkApplicationConfiguration) {
            this.flinkApplicationConfiguration = flinkApplicationConfiguration;
            return this;
        }

        public Builder flinkApplicationConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationArgs flinkApplicationConfiguration) {
            this.flinkApplicationConfiguration = Output.ofNullable(flinkApplicationConfiguration);
            return this;
        }

        public Builder runConfiguration(@Nullable Output<ApplicationApplicationConfigurationRunConfigurationArgs> runConfiguration) {
            this.runConfiguration = runConfiguration;
            return this;
        }

        public Builder runConfiguration(@Nullable ApplicationApplicationConfigurationRunConfigurationArgs runConfiguration) {
            this.runConfiguration = Output.ofNullable(runConfiguration);
            return this;
        }

        public Builder sqlApplicationConfiguration(@Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationArgs> sqlApplicationConfiguration) {
            this.sqlApplicationConfiguration = sqlApplicationConfiguration;
            return this;
        }

        public Builder sqlApplicationConfiguration(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationArgs sqlApplicationConfiguration) {
            this.sqlApplicationConfiguration = Output.ofNullable(sqlApplicationConfiguration);
            return this;
        }

        public Builder vpcConfiguration(@Nullable Output<ApplicationApplicationConfigurationVpcConfigurationArgs> vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }

        public Builder vpcConfiguration(@Nullable ApplicationApplicationConfigurationVpcConfigurationArgs vpcConfiguration) {
            this.vpcConfiguration = Output.ofNullable(vpcConfiguration);
            return this;
        }
        public ApplicationApplicationConfigurationArgs build() {
            return new ApplicationApplicationConfigurationArgs(applicationCodeConfiguration, applicationSnapshotConfiguration, environmentProperties, flinkApplicationConfiguration, runConfiguration, sqlApplicationConfiguration, vpcConfiguration);
        }
    }
}
