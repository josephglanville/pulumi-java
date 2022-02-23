// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataTransferConfigScheduleOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataTransferConfigScheduleOptionsArgs Empty = new DataTransferConfigScheduleOptionsArgs();

    /**
     * If true, automatic scheduling of data transfer runs for this
     * configuration will be disabled. The runs can be started on ad-hoc
     * basis using transferConfigs.startManualRuns API. When automatic
     * scheduling is disabled, the TransferConfig.schedule field will
     * be ignored.
     * 
     */
    @InputImport(name="disableAutoScheduling")
      private final @Nullable Input<Boolean> disableAutoScheduling;

    public Input<Boolean> getDisableAutoScheduling() {
        return this.disableAutoScheduling == null ? Input.empty() : this.disableAutoScheduling;
    }

    /**
     * Defines time to stop scheduling transfer runs. A transfer run cannot be
     * scheduled at or after the end time. The end time can be changed at any
     * moment. The time when a data transfer can be triggered manually is not
     * limited by this option.
     * 
     */
    @InputImport(name="endTime")
      private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * Specifies time to start scheduling transfer runs. The first run will be
     * scheduled at or after the start time according to a recurrence pattern
     * defined in the schedule string. The start time can be changed at any
     * moment. The time when a data transfer can be triggered manually is not
     * limited by this option.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    public DataTransferConfigScheduleOptionsArgs(
        @Nullable Input<Boolean> disableAutoScheduling,
        @Nullable Input<String> endTime,
        @Nullable Input<String> startTime) {
        this.disableAutoScheduling = disableAutoScheduling;
        this.endTime = endTime;
        this.startTime = startTime;
    }

    private DataTransferConfigScheduleOptionsArgs() {
        this.disableAutoScheduling = Input.empty();
        this.endTime = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferConfigScheduleOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disableAutoScheduling;
        private @Nullable Input<String> endTime;
        private @Nullable Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferConfigScheduleOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableAutoScheduling = defaults.disableAutoScheduling;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDisableAutoScheduling(@Nullable Input<Boolean> disableAutoScheduling) {
            this.disableAutoScheduling = disableAutoScheduling;
            return this;
        }

        public Builder setDisableAutoScheduling(@Nullable Boolean disableAutoScheduling) {
            this.disableAutoScheduling = Input.ofNullable(disableAutoScheduling);
            return this;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }
        public DataTransferConfigScheduleOptionsArgs build() {
            return new DataTransferConfigScheduleOptionsArgs(disableAutoScheduling, endTime, startTime);
        }
    }
}
