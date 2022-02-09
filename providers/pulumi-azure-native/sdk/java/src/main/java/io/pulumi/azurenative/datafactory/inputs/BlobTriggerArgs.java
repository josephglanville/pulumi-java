// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.TriggerPipelineReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BlobTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlobTriggerArgs Empty = new BlobTriggerArgs();

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

    @InputImport(name="folderPath", required=true)
    private final Input<String> folderPath;

    public Input<String> getFolderPath() {
        return this.folderPath;
    }

    @InputImport(name="linkedService", required=true)
    private final Input<LinkedServiceReferenceArgs> linkedService;

    public Input<LinkedServiceReferenceArgs> getLinkedService() {
        return this.linkedService;
    }

    @InputImport(name="maxConcurrency", required=true)
    private final Input<Integer> maxConcurrency;

    public Input<Integer> getMaxConcurrency() {
        return this.maxConcurrency;
    }

    @InputImport(name="pipelines")
    private final @Nullable Input<List<TriggerPipelineReferenceArgs>> pipelines;

    public Input<List<TriggerPipelineReferenceArgs>> getPipelines() {
        return this.pipelines == null ? Input.empty() : this.pipelines;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public BlobTriggerArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<String> description,
        Input<String> folderPath,
        Input<LinkedServiceReferenceArgs> linkedService,
        Input<Integer> maxConcurrency,
        @Nullable Input<List<TriggerPipelineReferenceArgs>> pipelines,
        Input<String> type) {
        this.annotations = annotations;
        this.description = description;
        this.folderPath = Objects.requireNonNull(folderPath, "expected parameter 'folderPath' to be non-null");
        this.linkedService = Objects.requireNonNull(linkedService, "expected parameter 'linkedService' to be non-null");
        this.maxConcurrency = Objects.requireNonNull(maxConcurrency, "expected parameter 'maxConcurrency' to be non-null");
        this.pipelines = pipelines;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private BlobTriggerArgs() {
        this.annotations = Input.empty();
        this.description = Input.empty();
        this.folderPath = Input.empty();
        this.linkedService = Input.empty();
        this.maxConcurrency = Input.empty();
        this.pipelines = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<String> description;
        private Input<String> folderPath;
        private Input<LinkedServiceReferenceArgs> linkedService;
        private Input<Integer> maxConcurrency;
        private @Nullable Input<List<TriggerPipelineReferenceArgs>> pipelines;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.folderPath = defaults.folderPath;
    	      this.linkedService = defaults.linkedService;
    	      this.maxConcurrency = defaults.maxConcurrency;
    	      this.pipelines = defaults.pipelines;
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

        public Builder setFolderPath(Input<String> folderPath) {
            this.folderPath = Objects.requireNonNull(folderPath);
            return this;
        }

        public Builder setFolderPath(String folderPath) {
            this.folderPath = Input.of(Objects.requireNonNull(folderPath));
            return this;
        }

        public Builder setLinkedService(Input<LinkedServiceReferenceArgs> linkedService) {
            this.linkedService = Objects.requireNonNull(linkedService);
            return this;
        }

        public Builder setLinkedService(LinkedServiceReferenceArgs linkedService) {
            this.linkedService = Input.of(Objects.requireNonNull(linkedService));
            return this;
        }

        public Builder setMaxConcurrency(Input<Integer> maxConcurrency) {
            this.maxConcurrency = Objects.requireNonNull(maxConcurrency);
            return this;
        }

        public Builder setMaxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = Input.of(Objects.requireNonNull(maxConcurrency));
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

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public BlobTriggerArgs build() {
            return new BlobTriggerArgs(annotations, description, folderPath, linkedService, maxConcurrency, pipelines, type);
        }
    }
}
