// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.ExportPipelineTargetPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.ImportPipelineSourcePropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.PipelineTriggerDescriptorResponse;
import io.pulumi.azurenative.containerregistry.outputs.ProgressPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineRunResponseResponse {
    /**
     * The digest of the tar used to transfer the artifacts.
     * 
     */
    private final @Nullable String catalogDigest;
    /**
     * The time the pipeline run finished.
     * 
     */
    private final @Nullable String finishTime;
    /**
     * The artifacts imported in the pipeline run.
     * 
     */
    private final @Nullable List<String> importedArtifacts;
    /**
     * The detailed error message for the pipeline run in the case of failure.
     * 
     */
    private final @Nullable String pipelineRunErrorMessage;
    /**
     * The current progress of the copy operation.
     * 
     */
    private final @Nullable ProgressPropertiesResponse progress;
    /**
     * The source of the pipeline run.
     * 
     */
    private final @Nullable ImportPipelineSourcePropertiesResponse source;
    /**
     * The time the pipeline run started.
     * 
     */
    private final @Nullable String startTime;
    /**
     * The current status of the pipeline run.
     * 
     */
    private final @Nullable String status;
    /**
     * The target of the pipeline run.
     * 
     */
    private final @Nullable ExportPipelineTargetPropertiesResponse target;
    /**
     * The trigger that caused the pipeline run.
     * 
     */
    private final @Nullable PipelineTriggerDescriptorResponse trigger;

    @CustomType.Constructor
    private PipelineRunResponseResponse(
        @CustomType.Parameter("catalogDigest") @Nullable String catalogDigest,
        @CustomType.Parameter("finishTime") @Nullable String finishTime,
        @CustomType.Parameter("importedArtifacts") @Nullable List<String> importedArtifacts,
        @CustomType.Parameter("pipelineRunErrorMessage") @Nullable String pipelineRunErrorMessage,
        @CustomType.Parameter("progress") @Nullable ProgressPropertiesResponse progress,
        @CustomType.Parameter("source") @Nullable ImportPipelineSourcePropertiesResponse source,
        @CustomType.Parameter("startTime") @Nullable String startTime,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("target") @Nullable ExportPipelineTargetPropertiesResponse target,
        @CustomType.Parameter("trigger") @Nullable PipelineTriggerDescriptorResponse trigger) {
        this.catalogDigest = catalogDigest;
        this.finishTime = finishTime;
        this.importedArtifacts = importedArtifacts;
        this.pipelineRunErrorMessage = pipelineRunErrorMessage;
        this.progress = progress;
        this.source = source;
        this.startTime = startTime;
        this.status = status;
        this.target = target;
        this.trigger = trigger;
    }

    /**
     * The digest of the tar used to transfer the artifacts.
     * 
    */
    public Optional<String> getCatalogDigest() {
        return Optional.ofNullable(this.catalogDigest);
    }
    /**
     * The time the pipeline run finished.
     * 
    */
    public Optional<String> getFinishTime() {
        return Optional.ofNullable(this.finishTime);
    }
    /**
     * The artifacts imported in the pipeline run.
     * 
    */
    public List<String> getImportedArtifacts() {
        return this.importedArtifacts == null ? List.of() : this.importedArtifacts;
    }
    /**
     * The detailed error message for the pipeline run in the case of failure.
     * 
    */
    public Optional<String> getPipelineRunErrorMessage() {
        return Optional.ofNullable(this.pipelineRunErrorMessage);
    }
    /**
     * The current progress of the copy operation.
     * 
    */
    public Optional<ProgressPropertiesResponse> getProgress() {
        return Optional.ofNullable(this.progress);
    }
    /**
     * The source of the pipeline run.
     * 
    */
    public Optional<ImportPipelineSourcePropertiesResponse> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * The time the pipeline run started.
     * 
    */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * The current status of the pipeline run.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The target of the pipeline run.
     * 
    */
    public Optional<ExportPipelineTargetPropertiesResponse> getTarget() {
        return Optional.ofNullable(this.target);
    }
    /**
     * The trigger that caused the pipeline run.
     * 
    */
    public Optional<PipelineTriggerDescriptorResponse> getTrigger() {
        return Optional.ofNullable(this.trigger);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineRunResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalogDigest;
        private @Nullable String finishTime;
        private @Nullable List<String> importedArtifacts;
        private @Nullable String pipelineRunErrorMessage;
        private @Nullable ProgressPropertiesResponse progress;
        private @Nullable ImportPipelineSourcePropertiesResponse source;
        private @Nullable String startTime;
        private @Nullable String status;
        private @Nullable ExportPipelineTargetPropertiesResponse target;
        private @Nullable PipelineTriggerDescriptorResponse trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineRunResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogDigest = defaults.catalogDigest;
    	      this.finishTime = defaults.finishTime;
    	      this.importedArtifacts = defaults.importedArtifacts;
    	      this.pipelineRunErrorMessage = defaults.pipelineRunErrorMessage;
    	      this.progress = defaults.progress;
    	      this.source = defaults.source;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.target = defaults.target;
    	      this.trigger = defaults.trigger;
        }

        public Builder catalogDigest(@Nullable String catalogDigest) {
            this.catalogDigest = catalogDigest;
            return this;
        }
        public Builder finishTime(@Nullable String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Builder importedArtifacts(@Nullable List<String> importedArtifacts) {
            this.importedArtifacts = importedArtifacts;
            return this;
        }
        public Builder importedArtifacts(String... importedArtifacts) {
            return importedArtifacts(List.of(importedArtifacts));
        }
        public Builder pipelineRunErrorMessage(@Nullable String pipelineRunErrorMessage) {
            this.pipelineRunErrorMessage = pipelineRunErrorMessage;
            return this;
        }
        public Builder progress(@Nullable ProgressPropertiesResponse progress) {
            this.progress = progress;
            return this;
        }
        public Builder source(@Nullable ImportPipelineSourcePropertiesResponse source) {
            this.source = source;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder target(@Nullable ExportPipelineTargetPropertiesResponse target) {
            this.target = target;
            return this;
        }
        public Builder trigger(@Nullable PipelineTriggerDescriptorResponse trigger) {
            this.trigger = trigger;
            return this;
        }        public PipelineRunResponseResponse build() {
            return new PipelineRunResponseResponse(catalogDigest, finishTime, importedArtifacts, pipelineRunErrorMessage, progress, source, startTime, status, target, trigger);
        }
    }
}
