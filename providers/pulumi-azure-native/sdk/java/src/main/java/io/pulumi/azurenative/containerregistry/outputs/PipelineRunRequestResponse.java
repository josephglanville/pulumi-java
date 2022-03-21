// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.PipelineRunSourcePropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.PipelineRunTargetPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineRunRequestResponse {
    /**
     * List of source artifacts to be transferred by the pipeline.
     * Specify an image by repository ('hello-world'). This will use the 'latest' tag.
     * Specify an image by tag ('hello-world:latest').
     * Specify an image by sha256-based manifest digest ('hello-world@sha256:abc123').
     * 
     */
    private final @Nullable List<String> artifacts;
    /**
     * The digest of the tar used to transfer the artifacts.
     * 
     */
    private final @Nullable String catalogDigest;
    /**
     * The resource ID of the pipeline to run.
     * 
     */
    private final @Nullable String pipelineResourceId;
    /**
     * The source properties of the pipeline run.
     * 
     */
    private final @Nullable PipelineRunSourcePropertiesResponse source;
    /**
     * The target properties of the pipeline run.
     * 
     */
    private final @Nullable PipelineRunTargetPropertiesResponse target;

    @CustomType.Constructor
    private PipelineRunRequestResponse(
        @CustomType.Parameter("artifacts") @Nullable List<String> artifacts,
        @CustomType.Parameter("catalogDigest") @Nullable String catalogDigest,
        @CustomType.Parameter("pipelineResourceId") @Nullable String pipelineResourceId,
        @CustomType.Parameter("source") @Nullable PipelineRunSourcePropertiesResponse source,
        @CustomType.Parameter("target") @Nullable PipelineRunTargetPropertiesResponse target) {
        this.artifacts = artifacts;
        this.catalogDigest = catalogDigest;
        this.pipelineResourceId = pipelineResourceId;
        this.source = source;
        this.target = target;
    }

    /**
     * List of source artifacts to be transferred by the pipeline.
     * Specify an image by repository ('hello-world'). This will use the 'latest' tag.
     * Specify an image by tag ('hello-world:latest').
     * Specify an image by sha256-based manifest digest ('hello-world@sha256:abc123').
     * 
    */
    public List<String> getArtifacts() {
        return this.artifacts == null ? List.of() : this.artifacts;
    }
    /**
     * The digest of the tar used to transfer the artifacts.
     * 
    */
    public Optional<String> getCatalogDigest() {
        return Optional.ofNullable(this.catalogDigest);
    }
    /**
     * The resource ID of the pipeline to run.
     * 
    */
    public Optional<String> getPipelineResourceId() {
        return Optional.ofNullable(this.pipelineResourceId);
    }
    /**
     * The source properties of the pipeline run.
     * 
    */
    public Optional<PipelineRunSourcePropertiesResponse> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * The target properties of the pipeline run.
     * 
    */
    public Optional<PipelineRunTargetPropertiesResponse> getTarget() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineRunRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> artifacts;
        private @Nullable String catalogDigest;
        private @Nullable String pipelineResourceId;
        private @Nullable PipelineRunSourcePropertiesResponse source;
        private @Nullable PipelineRunTargetPropertiesResponse target;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineRunRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.catalogDigest = defaults.catalogDigest;
    	      this.pipelineResourceId = defaults.pipelineResourceId;
    	      this.source = defaults.source;
    	      this.target = defaults.target;
        }

        public Builder artifacts(@Nullable List<String> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public Builder artifacts(String... artifacts) {
            return artifacts(List.of(artifacts));
        }
        public Builder catalogDigest(@Nullable String catalogDigest) {
            this.catalogDigest = catalogDigest;
            return this;
        }
        public Builder pipelineResourceId(@Nullable String pipelineResourceId) {
            this.pipelineResourceId = pipelineResourceId;
            return this;
        }
        public Builder source(@Nullable PipelineRunSourcePropertiesResponse source) {
            this.source = source;
            return this;
        }
        public Builder target(@Nullable PipelineRunTargetPropertiesResponse target) {
            this.target = target;
            return this;
        }        public PipelineRunRequestResponse build() {
            return new PipelineRunRequestResponse(artifacts, catalogDigest, pipelineResourceId, source, target);
        }
    }
}
