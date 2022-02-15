// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionJobTriggerTriggerSchedule {
    private final @Nullable String recurrencePeriodDuration;

    @OutputCustomType.Constructor({"recurrencePeriodDuration"})
    private PreventionJobTriggerTriggerSchedule(@Nullable String recurrencePeriodDuration) {
        this.recurrencePeriodDuration = recurrencePeriodDuration;
    }

    public Optional<String> getRecurrencePeriodDuration() {
        return Optional.ofNullable(this.recurrencePeriodDuration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerTriggerSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String recurrencePeriodDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerTriggerSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrencePeriodDuration = defaults.recurrencePeriodDuration;
        }

        public Builder setRecurrencePeriodDuration(@Nullable String recurrencePeriodDuration) {
            this.recurrencePeriodDuration = recurrencePeriodDuration;
            return this;
        }

        public PreventionJobTriggerTriggerSchedule build() {
            return new PreventionJobTriggerTriggerSchedule(recurrencePeriodDuration);
        }
    }
}