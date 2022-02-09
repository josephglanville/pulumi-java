// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.PipelineReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.TriggerPipelineReferenceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ChainingTriggerResponse {
    private final @Nullable List<Object> annotations;
    private final List<PipelineReferenceResponse> dependsOn;
    private final @Nullable String description;
    private final TriggerPipelineReferenceResponse pipeline;
    private final String runDimension;
    private final String runtimeState;
    private final String type;

    @OutputCustomType.Constructor({"annotations","dependsOn","description","pipeline","runDimension","runtimeState","type"})
    private ChainingTriggerResponse(
        @Nullable List<Object> annotations,
        List<PipelineReferenceResponse> dependsOn,
        @Nullable String description,
        TriggerPipelineReferenceResponse pipeline,
        String runDimension,
        String runtimeState,
        String type) {
        this.annotations = annotations;
        this.dependsOn = Objects.requireNonNull(dependsOn);
        this.description = description;
        this.pipeline = Objects.requireNonNull(pipeline);
        this.runDimension = Objects.requireNonNull(runDimension);
        this.runtimeState = Objects.requireNonNull(runtimeState);
        this.type = Objects.requireNonNull(type);
    }

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    public List<PipelineReferenceResponse> getDependsOn() {
        return this.dependsOn;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public TriggerPipelineReferenceResponse getPipeline() {
        return this.pipeline;
    }
    public String getRunDimension() {
        return this.runDimension;
    }
    public String getRuntimeState() {
        return this.runtimeState;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChainingTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private List<PipelineReferenceResponse> dependsOn;
        private @Nullable String description;
        private TriggerPipelineReferenceResponse pipeline;
        private String runDimension;
        private String runtimeState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ChainingTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.pipeline = defaults.pipeline;
    	      this.runDimension = defaults.runDimension;
    	      this.runtimeState = defaults.runtimeState;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setDependsOn(List<PipelineReferenceResponse> dependsOn) {
            this.dependsOn = Objects.requireNonNull(dependsOn);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setPipeline(TriggerPipelineReferenceResponse pipeline) {
            this.pipeline = Objects.requireNonNull(pipeline);
            return this;
        }

        public Builder setRunDimension(String runDimension) {
            this.runDimension = Objects.requireNonNull(runDimension);
            return this;
        }

        public Builder setRuntimeState(String runtimeState) {
            this.runtimeState = Objects.requireNonNull(runtimeState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ChainingTriggerResponse build() {
            return new ChainingTriggerResponse(annotations, dependsOn, description, pipeline, runDimension, runtimeState, type);
        }
    }
}
