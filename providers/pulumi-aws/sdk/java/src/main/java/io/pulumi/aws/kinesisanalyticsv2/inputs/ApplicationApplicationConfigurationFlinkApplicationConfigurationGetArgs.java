// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs Empty = new ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs();

    /**
     * Describes an application's checkpointing configuration.
     * 
     */
    @Import(name="checkpointConfiguration")
      private final @Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationGetArgs> checkpointConfiguration;

    public Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationGetArgs> getCheckpointConfiguration() {
        return this.checkpointConfiguration == null ? Codegen.empty() : this.checkpointConfiguration;
    }

    /**
     * Describes configuration parameters for CloudWatch logging for an application.
     * 
     */
    @Import(name="monitoringConfiguration")
      private final @Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs> monitoringConfiguration;

    public Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs> getMonitoringConfiguration() {
        return this.monitoringConfiguration == null ? Codegen.empty() : this.monitoringConfiguration;
    }

    /**
     * Describes parameters for how an application executes multiple tasks simultaneously.
     * 
     */
    @Import(name="parallelismConfiguration")
      private final @Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs> parallelismConfiguration;

    public Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs> getParallelismConfiguration() {
        return this.parallelismConfiguration == null ? Codegen.empty() : this.parallelismConfiguration;
    }

    public ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs(
        @Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationGetArgs> checkpointConfiguration,
        @Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs> monitoringConfiguration,
        @Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs> parallelismConfiguration) {
        this.checkpointConfiguration = checkpointConfiguration;
        this.monitoringConfiguration = monitoringConfiguration;
        this.parallelismConfiguration = parallelismConfiguration;
    }

    private ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs() {
        this.checkpointConfiguration = Codegen.empty();
        this.monitoringConfiguration = Codegen.empty();
        this.parallelismConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationGetArgs> checkpointConfiguration;
        private @Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs> monitoringConfiguration;
        private @Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs> parallelismConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkpointConfiguration = defaults.checkpointConfiguration;
    	      this.monitoringConfiguration = defaults.monitoringConfiguration;
    	      this.parallelismConfiguration = defaults.parallelismConfiguration;
        }

        public Builder checkpointConfiguration(@Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationGetArgs> checkpointConfiguration) {
            this.checkpointConfiguration = checkpointConfiguration;
            return this;
        }
        public Builder checkpointConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationGetArgs checkpointConfiguration) {
            this.checkpointConfiguration = Codegen.ofNullable(checkpointConfiguration);
            return this;
        }
        public Builder monitoringConfiguration(@Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs> monitoringConfiguration) {
            this.monitoringConfiguration = monitoringConfiguration;
            return this;
        }
        public Builder monitoringConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationGetArgs monitoringConfiguration) {
            this.monitoringConfiguration = Codegen.ofNullable(monitoringConfiguration);
            return this;
        }
        public Builder parallelismConfiguration(@Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs> parallelismConfiguration) {
            this.parallelismConfiguration = parallelismConfiguration;
            return this;
        }
        public Builder parallelismConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationGetArgs parallelismConfiguration) {
            this.parallelismConfiguration = Codegen.ofNullable(parallelismConfiguration);
            return this;
        }        public ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs build() {
            return new ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs(checkpointConfiguration, monitoringConfiguration, parallelismConfiguration);
        }
    }
}
