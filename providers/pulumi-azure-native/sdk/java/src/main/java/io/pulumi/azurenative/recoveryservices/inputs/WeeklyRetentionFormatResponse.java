// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Weekly retention format.
 * 
 */
public final class WeeklyRetentionFormatResponse extends io.pulumi.resources.InvokeArgs {

    public static final WeeklyRetentionFormatResponse Empty = new WeeklyRetentionFormatResponse();

    /**
     * List of days of the week.
     * 
     */
    @Import(name="daysOfTheWeek")
      private final @Nullable List<String> daysOfTheWeek;

    public List<String> getDaysOfTheWeek() {
        return this.daysOfTheWeek == null ? List.of() : this.daysOfTheWeek;
    }

    /**
     * List of weeks of month.
     * 
     */
    @Import(name="weeksOfTheMonth")
      private final @Nullable List<String> weeksOfTheMonth;

    public List<String> getWeeksOfTheMonth() {
        return this.weeksOfTheMonth == null ? List.of() : this.weeksOfTheMonth;
    }

    public WeeklyRetentionFormatResponse(
        @Nullable List<String> daysOfTheWeek,
        @Nullable List<String> weeksOfTheMonth) {
        this.daysOfTheWeek = daysOfTheWeek;
        this.weeksOfTheMonth = weeksOfTheMonth;
    }

    private WeeklyRetentionFormatResponse() {
        this.daysOfTheWeek = List.of();
        this.weeksOfTheMonth = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeeklyRetentionFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> daysOfTheWeek;
        private @Nullable List<String> weeksOfTheMonth;

        public Builder() {
    	      // Empty
        }

        public Builder(WeeklyRetentionFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfTheWeek = defaults.daysOfTheWeek;
    	      this.weeksOfTheMonth = defaults.weeksOfTheMonth;
        }

        public Builder daysOfTheWeek(@Nullable List<String> daysOfTheWeek) {
            this.daysOfTheWeek = daysOfTheWeek;
            return this;
        }
        public Builder daysOfTheWeek(String... daysOfTheWeek) {
            return daysOfTheWeek(List.of(daysOfTheWeek));
        }
        public Builder weeksOfTheMonth(@Nullable List<String> weeksOfTheMonth) {
            this.weeksOfTheMonth = weeksOfTheMonth;
            return this;
        }
        public Builder weeksOfTheMonth(String... weeksOfTheMonth) {
            return weeksOfTheMonth(List.of(weeksOfTheMonth));
        }        public WeeklyRetentionFormatResponse build() {
            return new WeeklyRetentionFormatResponse(daysOfTheWeek, weeksOfTheMonth);
        }
    }
}
