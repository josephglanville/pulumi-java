// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.BlobEventTypes;
import io.pulumi.azurenative.datafactory.inputs.TriggerPipelineReferenceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BlobEventsTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlobEventsTriggerArgs Empty = new BlobEventsTriggerArgs();

    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    @InputImport(name="blobPathBeginsWith")
    private final @Nullable Input<String> blobPathBeginsWith;

    public Input<String> getBlobPathBeginsWith() {
        return this.blobPathBeginsWith == null ? Input.empty() : this.blobPathBeginsWith;
    }

    @InputImport(name="blobPathEndsWith")
    private final @Nullable Input<String> blobPathEndsWith;

    public Input<String> getBlobPathEndsWith() {
        return this.blobPathEndsWith == null ? Input.empty() : this.blobPathEndsWith;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="events", required=true)
    private final Input<List<Either<String,BlobEventTypes>>> events;

    public Input<List<Either<String,BlobEventTypes>>> getEvents() {
        return this.events;
    }

    @InputImport(name="ignoreEmptyBlobs")
    private final @Nullable Input<Boolean> ignoreEmptyBlobs;

    public Input<Boolean> getIgnoreEmptyBlobs() {
        return this.ignoreEmptyBlobs == null ? Input.empty() : this.ignoreEmptyBlobs;
    }

    @InputImport(name="pipelines")
    private final @Nullable Input<List<TriggerPipelineReferenceArgs>> pipelines;

    public Input<List<TriggerPipelineReferenceArgs>> getPipelines() {
        return this.pipelines == null ? Input.empty() : this.pipelines;
    }

    @InputImport(name="scope", required=true)
    private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public BlobEventsTriggerArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<String> blobPathBeginsWith,
        @Nullable Input<String> blobPathEndsWith,
        @Nullable Input<String> description,
        Input<List<Either<String,BlobEventTypes>>> events,
        @Nullable Input<Boolean> ignoreEmptyBlobs,
        @Nullable Input<List<TriggerPipelineReferenceArgs>> pipelines,
        Input<String> scope,
        Input<String> type) {
        this.annotations = annotations;
        this.blobPathBeginsWith = blobPathBeginsWith;
        this.blobPathEndsWith = blobPathEndsWith;
        this.description = description;
        this.events = Objects.requireNonNull(events, "expected parameter 'events' to be non-null");
        this.ignoreEmptyBlobs = ignoreEmptyBlobs;
        this.pipelines = pipelines;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private BlobEventsTriggerArgs() {
        this.annotations = Input.empty();
        this.blobPathBeginsWith = Input.empty();
        this.blobPathEndsWith = Input.empty();
        this.description = Input.empty();
        this.events = Input.empty();
        this.ignoreEmptyBlobs = Input.empty();
        this.pipelines = Input.empty();
        this.scope = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobEventsTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<String> blobPathBeginsWith;
        private @Nullable Input<String> blobPathEndsWith;
        private @Nullable Input<String> description;
        private Input<List<Either<String,BlobEventTypes>>> events;
        private @Nullable Input<Boolean> ignoreEmptyBlobs;
        private @Nullable Input<List<TriggerPipelineReferenceArgs>> pipelines;
        private Input<String> scope;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobEventsTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.blobPathBeginsWith = defaults.blobPathBeginsWith;
    	      this.blobPathEndsWith = defaults.blobPathEndsWith;
    	      this.description = defaults.description;
    	      this.events = defaults.events;
    	      this.ignoreEmptyBlobs = defaults.ignoreEmptyBlobs;
    	      this.pipelines = defaults.pipelines;
    	      this.scope = defaults.scope;
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

        public Builder setBlobPathBeginsWith(@Nullable Input<String> blobPathBeginsWith) {
            this.blobPathBeginsWith = blobPathBeginsWith;
            return this;
        }

        public Builder setBlobPathBeginsWith(@Nullable String blobPathBeginsWith) {
            this.blobPathBeginsWith = Input.ofNullable(blobPathBeginsWith);
            return this;
        }

        public Builder setBlobPathEndsWith(@Nullable Input<String> blobPathEndsWith) {
            this.blobPathEndsWith = blobPathEndsWith;
            return this;
        }

        public Builder setBlobPathEndsWith(@Nullable String blobPathEndsWith) {
            this.blobPathEndsWith = Input.ofNullable(blobPathEndsWith);
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

        public Builder setEvents(Input<List<Either<String,BlobEventTypes>>> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setEvents(List<Either<String,BlobEventTypes>> events) {
            this.events = Input.of(Objects.requireNonNull(events));
            return this;
        }

        public Builder setIgnoreEmptyBlobs(@Nullable Input<Boolean> ignoreEmptyBlobs) {
            this.ignoreEmptyBlobs = ignoreEmptyBlobs;
            return this;
        }

        public Builder setIgnoreEmptyBlobs(@Nullable Boolean ignoreEmptyBlobs) {
            this.ignoreEmptyBlobs = Input.ofNullable(ignoreEmptyBlobs);
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

        public Builder setScope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
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

        public BlobEventsTriggerArgs build() {
            return new BlobEventsTriggerArgs(annotations, blobPathBeginsWith, blobPathEndsWith, description, events, ignoreEmptyBlobs, pipelines, scope, type);
        }
    }
}
