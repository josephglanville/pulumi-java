// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.WorkflowTriggerRecurrenceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BatchReleaseCriteriaResponse extends io.pulumi.resources.InvokeArgs {

    public static final BatchReleaseCriteriaResponse Empty = new BatchReleaseCriteriaResponse();

    @InputImport(name="batchSize")
    private final @Nullable Integer batchSize;

    public Optional<Integer> getBatchSize() {
        return this.batchSize == null ? Optional.empty() : Optional.ofNullable(this.batchSize);
    }

    @InputImport(name="messageCount")
    private final @Nullable Integer messageCount;

    public Optional<Integer> getMessageCount() {
        return this.messageCount == null ? Optional.empty() : Optional.ofNullable(this.messageCount);
    }

    @InputImport(name="recurrence")
    private final @Nullable WorkflowTriggerRecurrenceResponse recurrence;

    public Optional<WorkflowTriggerRecurrenceResponse> getRecurrence() {
        return this.recurrence == null ? Optional.empty() : Optional.ofNullable(this.recurrence);
    }

    public BatchReleaseCriteriaResponse(
        @Nullable Integer batchSize,
        @Nullable Integer messageCount,
        @Nullable WorkflowTriggerRecurrenceResponse recurrence) {
        this.batchSize = batchSize;
        this.messageCount = messageCount;
        this.recurrence = recurrence;
    }

    private BatchReleaseCriteriaResponse() {
        this.batchSize = null;
        this.messageCount = null;
        this.recurrence = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchReleaseCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer batchSize;
        private @Nullable Integer messageCount;
        private @Nullable WorkflowTriggerRecurrenceResponse recurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchReleaseCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchSize = defaults.batchSize;
    	      this.messageCount = defaults.messageCount;
    	      this.recurrence = defaults.recurrence;
        }

        public Builder setBatchSize(@Nullable Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        public Builder setMessageCount(@Nullable Integer messageCount) {
            this.messageCount = messageCount;
            return this;
        }

        public Builder setRecurrence(@Nullable WorkflowTriggerRecurrenceResponse recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        public BatchReleaseCriteriaResponse build() {
            return new BatchReleaseCriteriaResponse(batchSize, messageCount, recurrence);
        }
    }
}
