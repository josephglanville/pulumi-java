// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AudioAnalyzerPresetResponse;
import io.pulumi.azurenative.media.inputs.BuiltInStandardEncoderPresetResponse;
import io.pulumi.azurenative.media.inputs.FaceDetectorPresetResponse;
import io.pulumi.azurenative.media.inputs.StandardEncoderPresetResponse;
import io.pulumi.azurenative.media.inputs.VideoAnalyzerPresetResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties of a TransformOutput, which are the rules to be applied while generating the desired output.
 * 
 */
public final class TransformOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final TransformOutputResponse Empty = new TransformOutputResponse();

    /**
     * A Transform can define more than one outputs. This property defines what the service should do when one output fails - either continue to produce other outputs, or, stop the other outputs. The overall Job state will not reflect failures of outputs that are specified with 'ContinueJob'. The default is 'StopProcessingJob'.
     * 
     */
    @InputImport(name="onError")
      private final @Nullable String onError;

    public Optional<String> getOnError() {
        return this.onError == null ? Optional.empty() : Optional.ofNullable(this.onError);
    }

    /**
     * Preset that describes the operations that will be used to modify, transcode, or extract insights from the source file to generate the output.
     * 
     */
    @InputImport(name="preset", required=true)
      private final Object preset;

    public Object getPreset() {
        return this.preset;
    }

    /**
     * Sets the relative priority of the TransformOutputs within a Transform. This sets the priority that the service uses for processing TransformOutputs. The default priority is Normal.
     * 
     */
    @InputImport(name="relativePriority")
      private final @Nullable String relativePriority;

    public Optional<String> getRelativePriority() {
        return this.relativePriority == null ? Optional.empty() : Optional.ofNullable(this.relativePriority);
    }

    public TransformOutputResponse(
        @Nullable String onError,
        Object preset,
        @Nullable String relativePriority) {
        this.onError = onError;
        this.preset = Objects.requireNonNull(preset, "expected parameter 'preset' to be non-null");
        this.relativePriority = relativePriority;
    }

    private TransformOutputResponse() {
        this.onError = null;
        this.preset = null;
        this.relativePriority = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String onError;
        private Object preset;
        private @Nullable String relativePriority;

        public Builder() {
    	      // Empty
        }

        public Builder(TransformOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onError = defaults.onError;
    	      this.preset = defaults.preset;
    	      this.relativePriority = defaults.relativePriority;
        }

        public Builder setOnError(@Nullable String onError) {
            this.onError = onError;
            return this;
        }

        public Builder setPreset(Object preset) {
            this.preset = Objects.requireNonNull(preset);
            return this;
        }

        public Builder setRelativePriority(@Nullable String relativePriority) {
            this.relativePriority = relativePriority;
            return this;
        }
        public TransformOutputResponse build() {
            return new TransformOutputResponse(onError, preset, relativePriority);
        }
    }
}
