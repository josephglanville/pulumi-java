// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReportRecurrencePeriodResponse {
    /**
     * The start date of recurrence.
     * 
     */
    private final String from;
    /**
     * The end date of recurrence.
     * 
     */
    private final @Nullable String to;

    @CustomType.Constructor
    private ReportRecurrencePeriodResponse(
        @CustomType.Parameter("from") String from,
        @CustomType.Parameter("to") @Nullable String to) {
        this.from = from;
        this.to = to;
    }

    /**
     * The start date of recurrence.
     * 
    */
    public String getFrom() {
        return this.from;
    }
    /**
     * The end date of recurrence.
     * 
    */
    public Optional<String> getTo() {
        return Optional.ofNullable(this.to);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportRecurrencePeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String from;
        private @Nullable String to;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportRecurrencePeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        public Builder from(String from) {
            this.from = Objects.requireNonNull(from);
            return this;
        }
        public Builder to(@Nullable String to) {
            this.to = to;
            return this;
        }        public ReportRecurrencePeriodResponse build() {
            return new ReportRecurrencePeriodResponse(from, to);
        }
    }
}
