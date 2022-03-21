// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of an hourly schedule.
 * 
 */
public final class HourDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final HourDetailsArgs Empty = new HourDetailsArgs();

    /**
     * Minutes of the hour the schedule will run.
     * 
     */
    @Import(name="minute")
      private final @Nullable Output<Integer> minute;

    public Output<Integer> getMinute() {
        return this.minute == null ? Output.empty() : this.minute;
    }

    public HourDetailsArgs(@Nullable Output<Integer> minute) {
        this.minute = minute;
    }

    private HourDetailsArgs() {
        this.minute = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HourDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> minute;

        public Builder() {
    	      // Empty
        }

        public Builder(HourDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minute = defaults.minute;
        }

        public Builder minute(@Nullable Output<Integer> minute) {
            this.minute = minute;
            return this;
        }
        public Builder minute(@Nullable Integer minute) {
            this.minute = Output.ofNullable(minute);
            return this;
        }        public HourDetailsArgs build() {
            return new HourDetailsArgs(minute);
        }
    }
}
