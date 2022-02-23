// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxVersionNluSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxVersionNluSettingArgs Empty = new CxVersionNluSettingArgs();

    @InputImport(name="classificationThreshold")
      private final @Nullable Input<Double> classificationThreshold;

    public Input<Double> getClassificationThreshold() {
        return this.classificationThreshold == null ? Input.empty() : this.classificationThreshold;
    }

    @InputImport(name="modelTrainingMode")
      private final @Nullable Input<String> modelTrainingMode;

    public Input<String> getModelTrainingMode() {
        return this.modelTrainingMode == null ? Input.empty() : this.modelTrainingMode;
    }

    @InputImport(name="modelType")
      private final @Nullable Input<String> modelType;

    public Input<String> getModelType() {
        return this.modelType == null ? Input.empty() : this.modelType;
    }

    public CxVersionNluSettingArgs(
        @Nullable Input<Double> classificationThreshold,
        @Nullable Input<String> modelTrainingMode,
        @Nullable Input<String> modelType) {
        this.classificationThreshold = classificationThreshold;
        this.modelTrainingMode = modelTrainingMode;
        this.modelType = modelType;
    }

    private CxVersionNluSettingArgs() {
        this.classificationThreshold = Input.empty();
        this.modelTrainingMode = Input.empty();
        this.modelType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxVersionNluSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> classificationThreshold;
        private @Nullable Input<String> modelTrainingMode;
        private @Nullable Input<String> modelType;

        public Builder() {
    	      // Empty
        }

        public Builder(CxVersionNluSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classificationThreshold = defaults.classificationThreshold;
    	      this.modelTrainingMode = defaults.modelTrainingMode;
    	      this.modelType = defaults.modelType;
        }

        public Builder setClassificationThreshold(@Nullable Input<Double> classificationThreshold) {
            this.classificationThreshold = classificationThreshold;
            return this;
        }

        public Builder setClassificationThreshold(@Nullable Double classificationThreshold) {
            this.classificationThreshold = Input.ofNullable(classificationThreshold);
            return this;
        }

        public Builder setModelTrainingMode(@Nullable Input<String> modelTrainingMode) {
            this.modelTrainingMode = modelTrainingMode;
            return this;
        }

        public Builder setModelTrainingMode(@Nullable String modelTrainingMode) {
            this.modelTrainingMode = Input.ofNullable(modelTrainingMode);
            return this;
        }

        public Builder setModelType(@Nullable Input<String> modelType) {
            this.modelType = modelType;
            return this;
        }

        public Builder setModelType(@Nullable String modelType) {
            this.modelType = Input.ofNullable(modelType);
            return this;
        }
        public CxVersionNluSettingArgs build() {
            return new CxVersionNluSettingArgs(classificationThreshold, modelTrainingMode, modelType);
        }
    }
}
