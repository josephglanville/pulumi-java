// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.OnErrorType;
import io.pulumi.azurenative.media.enums.Priority;
import io.pulumi.azurenative.media.inputs.AudioAnalyzerPresetArgs;
import io.pulumi.azurenative.media.inputs.BuiltInStandardEncoderPresetArgs;
import io.pulumi.azurenative.media.inputs.FaceDetectorPresetArgs;
import io.pulumi.azurenative.media.inputs.StandardEncoderPresetArgs;
import io.pulumi.azurenative.media.inputs.VideoAnalyzerPresetArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the properties of a TransformOutput, which are the rules to be applied while generating the desired output.
 * 
 */
public final class TransformOutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransformOutputArgs Empty = new TransformOutputArgs();

    /**
     * A Transform can define more than one outputs. This property defines what the service should do when one output fails - either continue to produce other outputs, or, stop the other outputs. The overall Job state will not reflect failures of outputs that are specified with 'ContinueJob'. The default is 'StopProcessingJob'.
     * 
     */
    @InputImport(name="onError")
      private final @Nullable Input<Either<String,OnErrorType>> onError;

    public Input<Either<String,OnErrorType>> getOnError() {
        return this.onError == null ? Input.empty() : this.onError;
    }

    /**
     * Preset that describes the operations that will be used to modify, transcode, or extract insights from the source file to generate the output.
     * 
     */
    @InputImport(name="preset", required=true)
      private final Input<Object> preset;

    public Input<Object> getPreset() {
        return this.preset;
    }

    /**
     * Sets the relative priority of the TransformOutputs within a Transform. This sets the priority that the service uses for processing TransformOutputs. The default priority is Normal.
     * 
     */
    @InputImport(name="relativePriority")
      private final @Nullable Input<Either<String,Priority>> relativePriority;

    public Input<Either<String,Priority>> getRelativePriority() {
        return this.relativePriority == null ? Input.empty() : this.relativePriority;
    }

    public TransformOutputArgs(
        @Nullable Input<Either<String,OnErrorType>> onError,
        Input<Object> preset,
        @Nullable Input<Either<String,Priority>> relativePriority) {
        this.onError = onError;
        this.preset = Objects.requireNonNull(preset, "expected parameter 'preset' to be non-null");
        this.relativePriority = relativePriority;
    }

    private TransformOutputArgs() {
        this.onError = Input.empty();
        this.preset = Input.empty();
        this.relativePriority = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,OnErrorType>> onError;
        private Input<Object> preset;
        private @Nullable Input<Either<String,Priority>> relativePriority;

        public Builder() {
    	      // Empty
        }

        public Builder(TransformOutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onError = defaults.onError;
    	      this.preset = defaults.preset;
    	      this.relativePriority = defaults.relativePriority;
        }

        public Builder setOnError(@Nullable Input<Either<String,OnErrorType>> onError) {
            this.onError = onError;
            return this;
        }

        public Builder setOnError(@Nullable Either<String,OnErrorType> onError) {
            this.onError = Input.ofNullable(onError);
            return this;
        }

        public Builder setPreset(Input<Object> preset) {
            this.preset = Objects.requireNonNull(preset);
            return this;
        }

        public Builder setPreset(Object preset) {
            this.preset = Input.of(Objects.requireNonNull(preset));
            return this;
        }

        public Builder setRelativePriority(@Nullable Input<Either<String,Priority>> relativePriority) {
            this.relativePriority = relativePriority;
            return this;
        }

        public Builder setRelativePriority(@Nullable Either<String,Priority> relativePriority) {
            this.relativePriority = Input.ofNullable(relativePriority);
            return this;
        }
        public TransformOutputArgs build() {
            return new TransformOutputArgs(onError, preset, relativePriority);
        }
    }
}
