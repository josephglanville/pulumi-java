// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A specific date-time for the profile.
 * 
 */
public final class TimeWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeWindowArgs Empty = new TimeWindowArgs();

    /**
     * the end time for the profile in ISO 8601 format.
     * 
     */
    @Import(name="end", required=true)
      private final Output<String> end;

    public Output<String> getEnd() {
        return this.end;
    }

    /**
     * the start time for the profile in ISO 8601 format.
     * 
     */
    @Import(name="start", required=true)
      private final Output<String> start;

    public Output<String> getStart() {
        return this.start;
    }

    /**
     * the timezone of the start and end times for the profile. Some examples of valid time zones are: Dateline Standard Time, UTC-11, Hawaiian Standard Time, Alaskan Standard Time, Pacific Standard Time (Mexico), Pacific Standard Time, US Mountain Standard Time, Mountain Standard Time (Mexico), Mountain Standard Time, Central America Standard Time, Central Standard Time, Central Standard Time (Mexico), Canada Central Standard Time, SA Pacific Standard Time, Eastern Standard Time, US Eastern Standard Time, Venezuela Standard Time, Paraguay Standard Time, Atlantic Standard Time, Central Brazilian Standard Time, SA Western Standard Time, Pacific SA Standard Time, Newfoundland Standard Time, E. South America Standard Time, Argentina Standard Time, SA Eastern Standard Time, Greenland Standard Time, Montevideo Standard Time, Bahia Standard Time, UTC-02, Mid-Atlantic Standard Time, Azores Standard Time, Cape Verde Standard Time, Morocco Standard Time, UTC, GMT Standard Time, Greenwich Standard Time, W. Europe Standard Time, Central Europe Standard Time, Romance Standard Time, Central European Standard Time, W. Central Africa Standard Time, Namibia Standard Time, Jordan Standard Time, GTB Standard Time, Middle East Standard Time, Egypt Standard Time, Syria Standard Time, E. Europe Standard Time, South Africa Standard Time, FLE Standard Time, Turkey Standard Time, Israel Standard Time, Kaliningrad Standard Time, Libya Standard Time, Arabic Standard Time, Arab Standard Time, Belarus Standard Time, Russian Standard Time, E. Africa Standard Time, Iran Standard Time, Arabian Standard Time, Azerbaijan Standard Time, Russia Time Zone 3, Mauritius Standard Time, Georgian Standard Time, Caucasus Standard Time, Afghanistan Standard Time, West Asia Standard Time, Ekaterinburg Standard Time, Pakistan Standard Time, India Standard Time, Sri Lanka Standard Time, Nepal Standard Time, Central Asia Standard Time, Bangladesh Standard Time, N. Central Asia Standard Time, Myanmar Standard Time, SE Asia Standard Time, North Asia Standard Time, China Standard Time, North Asia East Standard Time, Singapore Standard Time, W. Australia Standard Time, Taipei Standard Time, Ulaanbaatar Standard Time, Tokyo Standard Time, Korea Standard Time, Yakutsk Standard Time, Cen. Australia Standard Time, AUS Central Standard Time, E. Australia Standard Time, AUS Eastern Standard Time, West Pacific Standard Time, Tasmania Standard Time, Magadan Standard Time, Vladivostok Standard Time, Russia Time Zone 10, Central Pacific Standard Time, Russia Time Zone 11, New Zealand Standard Time, UTC+12, Fiji Standard Time, Kamchatka Standard Time, Tonga Standard Time, Samoa Standard Time, Line Islands Standard Time
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone == null ? Codegen.empty() : this.timeZone;
    }

    public TimeWindowArgs(
        Output<String> end,
        Output<String> start,
        @Nullable Output<String> timeZone) {
        this.end = Objects.requireNonNull(end, "expected parameter 'end' to be non-null");
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
        this.timeZone = timeZone;
    }

    private TimeWindowArgs() {
        this.end = Codegen.empty();
        this.start = Codegen.empty();
        this.timeZone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> end;
        private Output<String> start;
        private @Nullable Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder end(Output<String> end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }
        public Builder end(String end) {
            this.end = Output.of(Objects.requireNonNull(end));
            return this;
        }
        public Builder start(Output<String> start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public Builder start(String start) {
            this.start = Output.of(Objects.requireNonNull(start));
            return this;
        }
        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Codegen.ofNullable(timeZone);
            return this;
        }        public TimeWindowArgs build() {
            return new TimeWindowArgs(end, start, timeZone);
        }
    }
}
