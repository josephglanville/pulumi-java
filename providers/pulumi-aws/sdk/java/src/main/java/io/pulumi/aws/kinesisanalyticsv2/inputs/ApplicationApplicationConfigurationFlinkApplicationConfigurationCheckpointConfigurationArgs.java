// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs Empty = new ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs();

    /**
     * Describes the interval in milliseconds between checkpoint operations.
     * 
     */
    @InputImport(name="checkpointInterval")
      private final @Nullable Output<Integer> checkpointInterval;

    public Output<Integer> getCheckpointInterval() {
        return this.checkpointInterval == null ? Output.empty() : this.checkpointInterval;
    }

    /**
     * Describes whether checkpointing is enabled for a Flink-based Kinesis Data Analytics application.
     * 
     */
    @InputImport(name="checkpointingEnabled")
      private final @Nullable Output<Boolean> checkpointingEnabled;

    public Output<Boolean> getCheckpointingEnabled() {
        return this.checkpointingEnabled == null ? Output.empty() : this.checkpointingEnabled;
    }

    /**
     * Describes whether the application uses Kinesis Data Analytics' default checkpointing behavior. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `checkpointing_enabled`, `checkpoint_interval`, or `min_pause_between_checkpoints` attribute values to be effective. If this attribute is set to `DEFAULT`, the application will always use the following values:
     * * `checkpointing_enabled = true`
     * * `checkpoint_interval = 60000`
     * * `min_pause_between_checkpoints = 5000`
     * 
     */
    @InputImport(name="configurationType", required=true)
      private final Output<String> configurationType;

    public Output<String> getConfigurationType() {
        return this.configurationType;
    }

    /**
     * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.
     * 
     */
    @InputImport(name="minPauseBetweenCheckpoints")
      private final @Nullable Output<Integer> minPauseBetweenCheckpoints;

    public Output<Integer> getMinPauseBetweenCheckpoints() {
        return this.minPauseBetweenCheckpoints == null ? Output.empty() : this.minPauseBetweenCheckpoints;
    }

    public ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs(
        @Nullable Output<Integer> checkpointInterval,
        @Nullable Output<Boolean> checkpointingEnabled,
        Output<String> configurationType,
        @Nullable Output<Integer> minPauseBetweenCheckpoints) {
        this.checkpointInterval = checkpointInterval;
        this.checkpointingEnabled = checkpointingEnabled;
        this.configurationType = Objects.requireNonNull(configurationType, "expected parameter 'configurationType' to be non-null");
        this.minPauseBetweenCheckpoints = minPauseBetweenCheckpoints;
    }

    private ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs() {
        this.checkpointInterval = Output.empty();
        this.checkpointingEnabled = Output.empty();
        this.configurationType = Output.empty();
        this.minPauseBetweenCheckpoints = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> checkpointInterval;
        private @Nullable Output<Boolean> checkpointingEnabled;
        private Output<String> configurationType;
        private @Nullable Output<Integer> minPauseBetweenCheckpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkpointInterval = defaults.checkpointInterval;
    	      this.checkpointingEnabled = defaults.checkpointingEnabled;
    	      this.configurationType = defaults.configurationType;
    	      this.minPauseBetweenCheckpoints = defaults.minPauseBetweenCheckpoints;
        }

        public Builder checkpointInterval(@Nullable Output<Integer> checkpointInterval) {
            this.checkpointInterval = checkpointInterval;
            return this;
        }

        public Builder checkpointInterval(@Nullable Integer checkpointInterval) {
            this.checkpointInterval = Output.ofNullable(checkpointInterval);
            return this;
        }

        public Builder checkpointingEnabled(@Nullable Output<Boolean> checkpointingEnabled) {
            this.checkpointingEnabled = checkpointingEnabled;
            return this;
        }

        public Builder checkpointingEnabled(@Nullable Boolean checkpointingEnabled) {
            this.checkpointingEnabled = Output.ofNullable(checkpointingEnabled);
            return this;
        }

        public Builder configurationType(Output<String> configurationType) {
            this.configurationType = Objects.requireNonNull(configurationType);
            return this;
        }

        public Builder configurationType(String configurationType) {
            this.configurationType = Output.of(Objects.requireNonNull(configurationType));
            return this;
        }

        public Builder minPauseBetweenCheckpoints(@Nullable Output<Integer> minPauseBetweenCheckpoints) {
            this.minPauseBetweenCheckpoints = minPauseBetweenCheckpoints;
            return this;
        }

        public Builder minPauseBetweenCheckpoints(@Nullable Integer minPauseBetweenCheckpoints) {
            this.minPauseBetweenCheckpoints = Output.ofNullable(minPauseBetweenCheckpoints);
            return this;
        }
        public ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs build() {
            return new ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs(checkpointInterval, checkpointingEnabled, configurationType, minPauseBetweenCheckpoints);
        }
    }
}
