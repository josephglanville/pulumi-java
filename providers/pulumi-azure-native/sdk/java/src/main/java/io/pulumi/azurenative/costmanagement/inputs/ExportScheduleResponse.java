// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.ExportRecurrencePeriodResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The schedule associated with the export.
 * 
 */
public final class ExportScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExportScheduleResponse Empty = new ExportScheduleResponse();

    /**
     * The schedule recurrence.
     * 
     */
    @InputImport(name="recurrence")
      private final @Nullable String recurrence;

    public Optional<String> getRecurrence() {
        return this.recurrence == null ? Optional.empty() : Optional.ofNullable(this.recurrence);
    }

    /**
     * Has start and end date of the recurrence. The start date must be in future. If present, the end date must be greater than start date.
     * 
     */
    @InputImport(name="recurrencePeriod")
      private final @Nullable ExportRecurrencePeriodResponse recurrencePeriod;

    public Optional<ExportRecurrencePeriodResponse> getRecurrencePeriod() {
        return this.recurrencePeriod == null ? Optional.empty() : Optional.ofNullable(this.recurrencePeriod);
    }

    /**
     * The status of the export's schedule. If 'Inactive', the export's schedule is paused.
     * 
     */
    @InputImport(name="status")
      private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public ExportScheduleResponse(
        @Nullable String recurrence,
        @Nullable ExportRecurrencePeriodResponse recurrencePeriod,
        @Nullable String status) {
        this.recurrence = recurrence;
        this.recurrencePeriod = recurrencePeriod;
        this.status = status;
    }

    private ExportScheduleResponse() {
        this.recurrence = null;
        this.recurrencePeriod = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String recurrence;
        private @Nullable ExportRecurrencePeriodResponse recurrencePeriod;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrence = defaults.recurrence;
    	      this.recurrencePeriod = defaults.recurrencePeriod;
    	      this.status = defaults.status;
        }

        public Builder setRecurrence(@Nullable String recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        public Builder setRecurrencePeriod(@Nullable ExportRecurrencePeriodResponse recurrencePeriod) {
            this.recurrencePeriod = recurrencePeriod;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public ExportScheduleResponse build() {
            return new ExportScheduleResponse(recurrence, recurrencePeriod, status);
        }
    }
}
