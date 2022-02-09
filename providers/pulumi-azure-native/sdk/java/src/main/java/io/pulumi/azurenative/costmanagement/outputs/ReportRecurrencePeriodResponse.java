// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReportRecurrencePeriodResponse {
    private final String from;
    private final @Nullable String to;

    @OutputCustomType.Constructor({"from","to"})
    private ReportRecurrencePeriodResponse(
        String from,
        @Nullable String to) {
        this.from = Objects.requireNonNull(from);
        this.to = to;
    }

    public String getFrom() {
        return this.from;
    }
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

        public Builder setFrom(String from) {
            this.from = Objects.requireNonNull(from);
            return this;
        }

        public Builder setTo(@Nullable String to) {
            this.to = to;
            return this;
        }

        public ReportRecurrencePeriodResponse build() {
            return new ReportRecurrencePeriodResponse(from, to);
        }
    }
}
