// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.TriggerStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TimerTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimerTriggerArgs Empty = new TimerTriggerArgs();

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="schedule", required=true)
    private final Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule;
    }

    @InputImport(name="status")
    private final @Nullable Input<Either<String,TriggerStatus>> status;

    public Input<Either<String,TriggerStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public TimerTriggerArgs(
        Input<String> name,
        Input<String> schedule,
        @Nullable Input<Either<String,TriggerStatus>> status) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.status = status == null ? Input.ofLeft("Enabled") : status;
    }

    private TimerTriggerArgs() {
        this.name = Input.empty();
        this.schedule = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimerTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<String> schedule;
        private @Nullable Input<Either<String,TriggerStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(TimerTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.status = defaults.status;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSchedule(Input<String> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setSchedule(String schedule) {
            this.schedule = Input.of(Objects.requireNonNull(schedule));
            return this;
        }

        public Builder setStatus(@Nullable Input<Either<String,TriggerStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,TriggerStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public TimerTriggerArgs build() {
            return new TimerTriggerArgs(name, schedule, status);
        }
    }
}
