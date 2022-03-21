// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.TriggerPipelineReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trigger that runs every time a custom event is received.
 * 
 */
public final class CustomEventsTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomEventsTriggerArgs Empty = new CustomEventsTriggerArgs();

    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * Trigger description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The list of event types that cause this trigger to fire.
     * 
     */
    @Import(name="events", required=true)
      private final Output<List<Object>> events;

    public Output<List<Object>> getEvents() {
        return this.events;
    }

    /**
     * Pipelines that need to be started.
     * 
     */
    @Import(name="pipelines")
      private final @Nullable Output<List<TriggerPipelineReferenceArgs>> pipelines;

    public Output<List<TriggerPipelineReferenceArgs>> getPipelines() {
        return this.pipelines == null ? Output.empty() : this.pipelines;
    }

    /**
     * The ARM resource ID of the Azure Event Grid Topic.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> getScope() {
        return this.scope;
    }

    /**
     * The event subject must begin with the pattern provided for trigger to fire. At least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     * 
     */
    @Import(name="subjectBeginsWith")
      private final @Nullable Output<String> subjectBeginsWith;

    public Output<String> getSubjectBeginsWith() {
        return this.subjectBeginsWith == null ? Output.empty() : this.subjectBeginsWith;
    }

    /**
     * The event subject must end with the pattern provided for trigger to fire. At least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     * 
     */
    @Import(name="subjectEndsWith")
      private final @Nullable Output<String> subjectEndsWith;

    public Output<String> getSubjectEndsWith() {
        return this.subjectEndsWith == null ? Output.empty() : this.subjectEndsWith;
    }

    /**
     * Trigger type.
     * Expected value is 'CustomEventsTrigger'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public CustomEventsTriggerArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<String> description,
        Output<List<Object>> events,
        @Nullable Output<List<TriggerPipelineReferenceArgs>> pipelines,
        Output<String> scope,
        @Nullable Output<String> subjectBeginsWith,
        @Nullable Output<String> subjectEndsWith,
        Output<String> type) {
        this.annotations = annotations;
        this.description = description;
        this.events = Objects.requireNonNull(events, "expected parameter 'events' to be non-null");
        this.pipelines = pipelines;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.subjectBeginsWith = subjectBeginsWith;
        this.subjectEndsWith = subjectEndsWith;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CustomEventsTriggerArgs() {
        this.annotations = Output.empty();
        this.description = Output.empty();
        this.events = Output.empty();
        this.pipelines = Output.empty();
        this.scope = Output.empty();
        this.subjectBeginsWith = Output.empty();
        this.subjectEndsWith = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomEventsTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<String> description;
        private Output<List<Object>> events;
        private @Nullable Output<List<TriggerPipelineReferenceArgs>> pipelines;
        private Output<String> scope;
        private @Nullable Output<String> subjectBeginsWith;
        private @Nullable Output<String> subjectEndsWith;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomEventsTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.events = defaults.events;
    	      this.pipelines = defaults.pipelines;
    	      this.scope = defaults.scope;
    	      this.subjectBeginsWith = defaults.subjectBeginsWith;
    	      this.subjectEndsWith = defaults.subjectEndsWith;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder events(Output<List<Object>> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }
        public Builder events(List<Object> events) {
            this.events = Output.of(Objects.requireNonNull(events));
            return this;
        }
        public Builder events(Object... events) {
            return events(List.of(events));
        }
        public Builder pipelines(@Nullable Output<List<TriggerPipelineReferenceArgs>> pipelines) {
            this.pipelines = pipelines;
            return this;
        }
        public Builder pipelines(@Nullable List<TriggerPipelineReferenceArgs> pipelines) {
            this.pipelines = Output.ofNullable(pipelines);
            return this;
        }
        public Builder pipelines(TriggerPipelineReferenceArgs... pipelines) {
            return pipelines(List.of(pipelines));
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public Builder subjectBeginsWith(@Nullable Output<String> subjectBeginsWith) {
            this.subjectBeginsWith = subjectBeginsWith;
            return this;
        }
        public Builder subjectBeginsWith(@Nullable String subjectBeginsWith) {
            this.subjectBeginsWith = Output.ofNullable(subjectBeginsWith);
            return this;
        }
        public Builder subjectEndsWith(@Nullable Output<String> subjectEndsWith) {
            this.subjectEndsWith = subjectEndsWith;
            return this;
        }
        public Builder subjectEndsWith(@Nullable String subjectEndsWith) {
            this.subjectEndsWith = Output.ofNullable(subjectEndsWith);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public CustomEventsTriggerArgs build() {
            return new CustomEventsTriggerArgs(annotations, description, events, pipelines, scope, subjectBeginsWith, subjectEndsWith, type);
        }
    }
}
