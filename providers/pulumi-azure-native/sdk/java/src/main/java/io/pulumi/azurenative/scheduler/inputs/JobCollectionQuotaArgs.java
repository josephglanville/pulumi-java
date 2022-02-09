// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.inputs.JobMaxRecurrenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobCollectionQuotaArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobCollectionQuotaArgs Empty = new JobCollectionQuotaArgs();

    @InputImport(name="maxJobCount")
    private final @Nullable Input<Integer> maxJobCount;

    public Input<Integer> getMaxJobCount() {
        return this.maxJobCount == null ? Input.empty() : this.maxJobCount;
    }

    @InputImport(name="maxJobOccurrence")
    private final @Nullable Input<Integer> maxJobOccurrence;

    public Input<Integer> getMaxJobOccurrence() {
        return this.maxJobOccurrence == null ? Input.empty() : this.maxJobOccurrence;
    }

    @InputImport(name="maxRecurrence")
    private final @Nullable Input<JobMaxRecurrenceArgs> maxRecurrence;

    public Input<JobMaxRecurrenceArgs> getMaxRecurrence() {
        return this.maxRecurrence == null ? Input.empty() : this.maxRecurrence;
    }

    public JobCollectionQuotaArgs(
        @Nullable Input<Integer> maxJobCount,
        @Nullable Input<Integer> maxJobOccurrence,
        @Nullable Input<JobMaxRecurrenceArgs> maxRecurrence) {
        this.maxJobCount = maxJobCount;
        this.maxJobOccurrence = maxJobOccurrence;
        this.maxRecurrence = maxRecurrence;
    }

    private JobCollectionQuotaArgs() {
        this.maxJobCount = Input.empty();
        this.maxJobOccurrence = Input.empty();
        this.maxRecurrence = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCollectionQuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxJobCount;
        private @Nullable Input<Integer> maxJobOccurrence;
        private @Nullable Input<JobMaxRecurrenceArgs> maxRecurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCollectionQuotaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxJobCount = defaults.maxJobCount;
    	      this.maxJobOccurrence = defaults.maxJobOccurrence;
    	      this.maxRecurrence = defaults.maxRecurrence;
        }

        public Builder setMaxJobCount(@Nullable Input<Integer> maxJobCount) {
            this.maxJobCount = maxJobCount;
            return this;
        }

        public Builder setMaxJobCount(@Nullable Integer maxJobCount) {
            this.maxJobCount = Input.ofNullable(maxJobCount);
            return this;
        }

        public Builder setMaxJobOccurrence(@Nullable Input<Integer> maxJobOccurrence) {
            this.maxJobOccurrence = maxJobOccurrence;
            return this;
        }

        public Builder setMaxJobOccurrence(@Nullable Integer maxJobOccurrence) {
            this.maxJobOccurrence = Input.ofNullable(maxJobOccurrence);
            return this;
        }

        public Builder setMaxRecurrence(@Nullable Input<JobMaxRecurrenceArgs> maxRecurrence) {
            this.maxRecurrence = maxRecurrence;
            return this;
        }

        public Builder setMaxRecurrence(@Nullable JobMaxRecurrenceArgs maxRecurrence) {
            this.maxRecurrence = Input.ofNullable(maxRecurrence);
            return this;
        }

        public JobCollectionQuotaArgs build() {
            return new JobCollectionQuotaArgs(maxJobCount, maxJobOccurrence, maxRecurrence);
        }
    }
}
