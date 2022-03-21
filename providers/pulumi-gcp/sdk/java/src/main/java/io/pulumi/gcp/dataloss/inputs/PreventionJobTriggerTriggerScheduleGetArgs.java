// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerTriggerScheduleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerTriggerScheduleGetArgs Empty = new PreventionJobTriggerTriggerScheduleGetArgs();

    /**
     * With this option a job is started a regular periodic basis. For example: every day (86400 seconds).
     * A scheduled start time will be skipped if the previous execution has not ended when its scheduled time occurs.
     * This value must be set to a time duration greater than or equal to 1 day and can be no longer than 60 days.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Import(name="recurrencePeriodDuration")
      private final @Nullable Output<String> recurrencePeriodDuration;

    public Output<String> getRecurrencePeriodDuration() {
        return this.recurrencePeriodDuration == null ? Output.empty() : this.recurrencePeriodDuration;
    }

    public PreventionJobTriggerTriggerScheduleGetArgs(@Nullable Output<String> recurrencePeriodDuration) {
        this.recurrencePeriodDuration = recurrencePeriodDuration;
    }

    private PreventionJobTriggerTriggerScheduleGetArgs() {
        this.recurrencePeriodDuration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerTriggerScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> recurrencePeriodDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerTriggerScheduleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrencePeriodDuration = defaults.recurrencePeriodDuration;
        }

        public Builder recurrencePeriodDuration(@Nullable Output<String> recurrencePeriodDuration) {
            this.recurrencePeriodDuration = recurrencePeriodDuration;
            return this;
        }
        public Builder recurrencePeriodDuration(@Nullable String recurrencePeriodDuration) {
            this.recurrencePeriodDuration = Output.ofNullable(recurrencePeriodDuration);
            return this;
        }        public PreventionJobTriggerTriggerScheduleGetArgs build() {
            return new PreventionJobTriggerTriggerScheduleGetArgs(recurrencePeriodDuration);
        }
    }
}
