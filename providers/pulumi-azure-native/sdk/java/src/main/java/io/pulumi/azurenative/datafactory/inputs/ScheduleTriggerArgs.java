// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ScheduleTriggerRecurrenceArgs;
import io.pulumi.azurenative.datafactory.inputs.TriggerPipelineReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduleTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleTriggerArgs Empty = new ScheduleTriggerArgs();

    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="pipelines")
    private final @Nullable Input<List<TriggerPipelineReferenceArgs>> pipelines;

    public Input<List<TriggerPipelineReferenceArgs>> getPipelines() {
        return this.pipelines == null ? Input.empty() : this.pipelines;
    }

    @InputImport(name="recurrence", required=true)
    private final Input<ScheduleTriggerRecurrenceArgs> recurrence;

    public Input<ScheduleTriggerRecurrenceArgs> getRecurrence() {
        return this.recurrence;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ScheduleTriggerArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<String> description,
        @Nullable Input<List<TriggerPipelineReferenceArgs>> pipelines,
        Input<ScheduleTriggerRecurrenceArgs> recurrence,
        Input<String> type) {
        this.annotations = annotations;
        this.description = description;
        this.pipelines = pipelines;
        this.recurrence = Objects.requireNonNull(recurrence, "expected parameter 'recurrence' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ScheduleTriggerArgs() {
        this.annotations = Input.empty();
        this.description = Input.empty();
        this.pipelines = Input.empty();
        this.recurrence = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<String> description;
        private @Nullable Input<List<TriggerPipelineReferenceArgs>> pipelines;
        private Input<ScheduleTriggerRecurrenceArgs> recurrence;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.pipelines = defaults.pipelines;
    	      this.recurrence = defaults.recurrence;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setPipelines(@Nullable Input<List<TriggerPipelineReferenceArgs>> pipelines) {
            this.pipelines = pipelines;
            return this;
        }

        public Builder setPipelines(@Nullable List<TriggerPipelineReferenceArgs> pipelines) {
            this.pipelines = Input.ofNullable(pipelines);
            return this;
        }

        public Builder setRecurrence(Input<ScheduleTriggerRecurrenceArgs> recurrence) {
            this.recurrence = Objects.requireNonNull(recurrence);
            return this;
        }

        public Builder setRecurrence(ScheduleTriggerRecurrenceArgs recurrence) {
            this.recurrence = Input.of(Objects.requireNonNull(recurrence));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ScheduleTriggerArgs build() {
            return new ScheduleTriggerArgs(annotations, description, pipelines, recurrence, type);
        }
    }
}
