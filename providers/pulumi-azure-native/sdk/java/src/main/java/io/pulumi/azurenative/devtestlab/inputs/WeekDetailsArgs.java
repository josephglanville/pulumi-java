// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WeekDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WeekDetailsArgs Empty = new WeekDetailsArgs();

    @InputImport(name="time")
    private final @Nullable Input<String> time;

    public Input<String> getTime() {
        return this.time == null ? Input.empty() : this.time;
    }

    @InputImport(name="weekdays")
    private final @Nullable Input<List<String>> weekdays;

    public Input<List<String>> getWeekdays() {
        return this.weekdays == null ? Input.empty() : this.weekdays;
    }

    public WeekDetailsArgs(
        @Nullable Input<String> time,
        @Nullable Input<List<String>> weekdays) {
        this.time = time;
        this.weekdays = weekdays;
    }

    private WeekDetailsArgs() {
        this.time = Input.empty();
        this.weekdays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeekDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> time;
        private @Nullable Input<List<String>> weekdays;

        public Builder() {
    	      // Empty
        }

        public Builder(WeekDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.time = defaults.time;
    	      this.weekdays = defaults.weekdays;
        }

        public Builder setTime(@Nullable Input<String> time) {
            this.time = time;
            return this;
        }

        public Builder setTime(@Nullable String time) {
            this.time = Input.ofNullable(time);
            return this;
        }

        public Builder setWeekdays(@Nullable Input<List<String>> weekdays) {
            this.weekdays = weekdays;
            return this;
        }

        public Builder setWeekdays(@Nullable List<String> weekdays) {
            this.weekdays = Input.ofNullable(weekdays);
            return this;
        }

        public WeekDetailsArgs build() {
            return new WeekDetailsArgs(time, weekdays);
        }
    }
}
