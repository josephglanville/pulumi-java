// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.TriggerPipelineReferenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trigger that runs every time a custom event is received.
 * 
 */
public final class CustomEventsTriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomEventsTriggerResponse Empty = new CustomEventsTriggerResponse();

    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    @InputImport(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * Trigger description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The list of event types that cause this trigger to fire.
     * 
     */
    @InputImport(name="events", required=true)
      private final List<Object> events;

    public List<Object> getEvents() {
        return this.events;
    }

    /**
     * Pipelines that need to be started.
     * 
     */
    @InputImport(name="pipelines")
      private final @Nullable List<TriggerPipelineReferenceResponse> pipelines;

    public List<TriggerPipelineReferenceResponse> getPipelines() {
        return this.pipelines == null ? List.of() : this.pipelines;
    }

    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
     */
    @InputImport(name="runtimeState", required=true)
      private final String runtimeState;

    public String getRuntimeState() {
        return this.runtimeState;
    }

    /**
     * The ARM resource ID of the Azure Event Grid Topic.
     * 
     */
    @InputImport(name="scope", required=true)
      private final String scope;

    public String getScope() {
        return this.scope;
    }

    /**
     * The event subject must begin with the pattern provided for trigger to fire. At least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     * 
     */
    @InputImport(name="subjectBeginsWith")
      private final @Nullable String subjectBeginsWith;

    public Optional<String> getSubjectBeginsWith() {
        return this.subjectBeginsWith == null ? Optional.empty() : Optional.ofNullable(this.subjectBeginsWith);
    }

    /**
     * The event subject must end with the pattern provided for trigger to fire. At least one of these must be provided: subjectBeginsWith, subjectEndsWith.
     * 
     */
    @InputImport(name="subjectEndsWith")
      private final @Nullable String subjectEndsWith;

    public Optional<String> getSubjectEndsWith() {
        return this.subjectEndsWith == null ? Optional.empty() : Optional.ofNullable(this.subjectEndsWith);
    }

    /**
     * Trigger type.
     * Expected value is 'CustomEventsTrigger'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public CustomEventsTriggerResponse(
        @Nullable List<Object> annotations,
        @Nullable String description,
        List<Object> events,
        @Nullable List<TriggerPipelineReferenceResponse> pipelines,
        String runtimeState,
        String scope,
        @Nullable String subjectBeginsWith,
        @Nullable String subjectEndsWith,
        String type) {
        this.annotations = annotations;
        this.description = description;
        this.events = Objects.requireNonNull(events, "expected parameter 'events' to be non-null");
        this.pipelines = pipelines;
        this.runtimeState = Objects.requireNonNull(runtimeState, "expected parameter 'runtimeState' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.subjectBeginsWith = subjectBeginsWith;
        this.subjectEndsWith = subjectEndsWith;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CustomEventsTriggerResponse() {
        this.annotations = List.of();
        this.description = null;
        this.events = List.of();
        this.pipelines = List.of();
        this.runtimeState = null;
        this.scope = null;
        this.subjectBeginsWith = null;
        this.subjectEndsWith = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomEventsTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String description;
        private List<Object> events;
        private @Nullable List<TriggerPipelineReferenceResponse> pipelines;
        private String runtimeState;
        private String scope;
        private @Nullable String subjectBeginsWith;
        private @Nullable String subjectEndsWith;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomEventsTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.events = defaults.events;
    	      this.pipelines = defaults.pipelines;
    	      this.runtimeState = defaults.runtimeState;
    	      this.scope = defaults.scope;
    	      this.subjectBeginsWith = defaults.subjectBeginsWith;
    	      this.subjectEndsWith = defaults.subjectEndsWith;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEvents(List<Object> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setPipelines(@Nullable List<TriggerPipelineReferenceResponse> pipelines) {
            this.pipelines = pipelines;
            return this;
        }

        public Builder setRuntimeState(String runtimeState) {
            this.runtimeState = Objects.requireNonNull(runtimeState);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setSubjectBeginsWith(@Nullable String subjectBeginsWith) {
            this.subjectBeginsWith = subjectBeginsWith;
            return this;
        }

        public Builder setSubjectEndsWith(@Nullable String subjectEndsWith) {
            this.subjectEndsWith = subjectEndsWith;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public CustomEventsTriggerResponse build() {
            return new CustomEventsTriggerResponse(annotations, description, events, pipelines, runtimeState, scope, subjectBeginsWith, subjectEndsWith, type);
        }
    }
}
