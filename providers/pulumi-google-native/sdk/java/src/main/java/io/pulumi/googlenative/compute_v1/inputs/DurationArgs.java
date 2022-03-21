// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Duration represents a fixed-length span of time represented as a count of seconds and fractions of seconds at nanosecond resolution. It is independent of any calendar and concepts like "day" or "month". Range is approximately 10,000 years.
 * 
 */
public final class DurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DurationArgs Empty = new DurationArgs();

    /**
     * Span of time that's a fraction of a second at nanosecond resolution. Durations less than one second are represented with a 0 `seconds` field and a positive `nanos` field. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    @Import(name="nanos")
      private final @Nullable Output<Integer> nanos;

    public Output<Integer> getNanos() {
        return this.nanos == null ? Output.empty() : this.nanos;
    }

    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive. Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * 
     */
    @Import(name="seconds")
      private final @Nullable Output<String> seconds;

    public Output<String> getSeconds() {
        return this.seconds == null ? Output.empty() : this.seconds;
    }

    public DurationArgs(
        @Nullable Output<Integer> nanos,
        @Nullable Output<String> seconds) {
        this.nanos = nanos;
        this.seconds = seconds;
    }

    private DurationArgs() {
        this.nanos = Output.empty();
        this.seconds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> nanos;
        private @Nullable Output<String> seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(DurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder nanos(@Nullable Output<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }
        public Builder nanos(@Nullable Integer nanos) {
            this.nanos = Output.ofNullable(nanos);
            return this;
        }
        public Builder seconds(@Nullable Output<String> seconds) {
            this.seconds = seconds;
            return this;
        }
        public Builder seconds(@Nullable String seconds) {
            this.seconds = Output.ofNullable(seconds);
            return this;
        }        public DurationArgs build() {
            return new DurationArgs(nanos, seconds);
        }
    }
}
