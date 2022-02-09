// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.azurenative.alertsmanagement.enums.SuppressionType;
import io.pulumi.azurenative.alertsmanagement.inputs.SuppressionScheduleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SuppressionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SuppressionConfigArgs Empty = new SuppressionConfigArgs();

    @InputImport(name="recurrenceType", required=true)
    private final Input<Either<String,SuppressionType>> recurrenceType;

    public Input<Either<String,SuppressionType>> getRecurrenceType() {
        return this.recurrenceType;
    }

    @InputImport(name="schedule")
    private final @Nullable Input<SuppressionScheduleArgs> schedule;

    public Input<SuppressionScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    public SuppressionConfigArgs(
        Input<Either<String,SuppressionType>> recurrenceType,
        @Nullable Input<SuppressionScheduleArgs> schedule) {
        this.recurrenceType = Objects.requireNonNull(recurrenceType, "expected parameter 'recurrenceType' to be non-null");
        this.schedule = schedule;
    }

    private SuppressionConfigArgs() {
        this.recurrenceType = Input.empty();
        this.schedule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuppressionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,SuppressionType>> recurrenceType;
        private @Nullable Input<SuppressionScheduleArgs> schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(SuppressionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrenceType = defaults.recurrenceType;
    	      this.schedule = defaults.schedule;
        }

        public Builder setRecurrenceType(Input<Either<String,SuppressionType>> recurrenceType) {
            this.recurrenceType = Objects.requireNonNull(recurrenceType);
            return this;
        }

        public Builder setRecurrenceType(Either<String,SuppressionType> recurrenceType) {
            this.recurrenceType = Input.of(Objects.requireNonNull(recurrenceType));
            return this;
        }

        public Builder setSchedule(@Nullable Input<SuppressionScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable SuppressionScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public SuppressionConfigArgs build() {
            return new SuppressionConfigArgs(recurrenceType, schedule);
        }
    }
}
