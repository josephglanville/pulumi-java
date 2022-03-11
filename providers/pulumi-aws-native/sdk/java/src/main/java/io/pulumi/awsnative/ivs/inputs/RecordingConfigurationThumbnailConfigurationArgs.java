// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ivs.inputs;

import io.pulumi.awsnative.ivs.enums.RecordingConfigurationThumbnailConfigurationRecordingMode;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Recording Thumbnail Configuration.
 * 
 */
public final class RecordingConfigurationThumbnailConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecordingConfigurationThumbnailConfigurationArgs Empty = new RecordingConfigurationThumbnailConfigurationArgs();

    /**
     * Thumbnail Recording Mode, which determines whether thumbnails are recorded at an interval or are disabled.
     * 
     */
    @InputImport(name="recordingMode", required=true)
      private final Output<RecordingConfigurationThumbnailConfigurationRecordingMode> recordingMode;

    public Output<RecordingConfigurationThumbnailConfigurationRecordingMode> getRecordingMode() {
        return this.recordingMode;
    }

    /**
     * Thumbnail recording Target Interval Seconds defines the interval at which thumbnails are recorded. This field is required if RecordingMode is INTERVAL.
     * 
     */
    @InputImport(name="targetIntervalSeconds")
      private final @Nullable Output<Integer> targetIntervalSeconds;

    public Output<Integer> getTargetIntervalSeconds() {
        return this.targetIntervalSeconds == null ? Output.empty() : this.targetIntervalSeconds;
    }

    public RecordingConfigurationThumbnailConfigurationArgs(
        Output<RecordingConfigurationThumbnailConfigurationRecordingMode> recordingMode,
        @Nullable Output<Integer> targetIntervalSeconds) {
        this.recordingMode = Objects.requireNonNull(recordingMode, "expected parameter 'recordingMode' to be non-null");
        this.targetIntervalSeconds = targetIntervalSeconds;
    }

    private RecordingConfigurationThumbnailConfigurationArgs() {
        this.recordingMode = Output.empty();
        this.targetIntervalSeconds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordingConfigurationThumbnailConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RecordingConfigurationThumbnailConfigurationRecordingMode> recordingMode;
        private @Nullable Output<Integer> targetIntervalSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordingConfigurationThumbnailConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordingMode = defaults.recordingMode;
    	      this.targetIntervalSeconds = defaults.targetIntervalSeconds;
        }

        public Builder recordingMode(Output<RecordingConfigurationThumbnailConfigurationRecordingMode> recordingMode) {
            this.recordingMode = Objects.requireNonNull(recordingMode);
            return this;
        }

        public Builder recordingMode(RecordingConfigurationThumbnailConfigurationRecordingMode recordingMode) {
            this.recordingMode = Output.of(Objects.requireNonNull(recordingMode));
            return this;
        }

        public Builder targetIntervalSeconds(@Nullable Output<Integer> targetIntervalSeconds) {
            this.targetIntervalSeconds = targetIntervalSeconds;
            return this;
        }

        public Builder targetIntervalSeconds(@Nullable Integer targetIntervalSeconds) {
            this.targetIntervalSeconds = Output.ofNullable(targetIntervalSeconds);
            return this;
        }
        public RecordingConfigurationThumbnailConfigurationArgs build() {
            return new RecordingConfigurationThumbnailConfigurationArgs(recordingMode, targetIntervalSeconds);
        }
    }
}
