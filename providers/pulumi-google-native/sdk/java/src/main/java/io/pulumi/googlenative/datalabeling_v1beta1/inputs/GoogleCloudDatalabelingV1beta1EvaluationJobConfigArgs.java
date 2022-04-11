// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1BoundingPolyConfigArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1EvaluationConfigArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1HumanAnnotationConfigArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1InputConfigArgs;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configures specific details of how a continuous evaluation job works. Provide this configuration when you create an EvaluationJob.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs Empty = new GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs();

    /**
     * Prediction keys that tell Data Labeling Service where to find the data for evaluation in your BigQuery table. When the service samples prediction input and output from your model version and saves it to BigQuery, the data gets stored as JSON strings in the BigQuery table. These keys tell Data Labeling Service how to parse the JSON. You can provide the following entries in this field: * `data_json_key`: the data key for prediction input. You must provide either this key or `reference_json_key`. * `reference_json_key`: the data reference key for prediction input. You must provide either this key or `data_json_key`. * `label_json_key`: the label key for prediction output. Required. * `label_score_json_key`: the score key for prediction output. Required. * `bounding_box_json_key`: the bounding box key for prediction output. Required if your model version perform image object detection. Learn [how to configure prediction keys](/ml-engine/docs/continuous-evaluation/create-job#prediction-keys).
     * 
     */
    @Import(name="bigqueryImportKeys", required=true)
      private final Output<Map<String,String>> bigqueryImportKeys;

    public Output<Map<String,String>> getBigqueryImportKeys() {
        return this.bigqueryImportKeys;
    }

    /**
     * Specify this field if your model version performs image object detection (bounding box detection). `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet.
     * 
     */
    @Import(name="boundingPolyConfig")
      private final @Nullable Output<GoogleCloudDatalabelingV1beta1BoundingPolyConfigArgs> boundingPolyConfig;

    public Output<GoogleCloudDatalabelingV1beta1BoundingPolyConfigArgs> getBoundingPolyConfig() {
        return this.boundingPolyConfig == null ? Codegen.empty() : this.boundingPolyConfig;
    }

    /**
     * Details for calculating evaluation metrics and creating Evaulations. If your model version performs image object detection, you must specify the `boundingBoxEvaluationOptions` field within this configuration. Otherwise, provide an empty object for this configuration.
     * 
     */
    @Import(name="evaluationConfig", required=true)
      private final Output<GoogleCloudDatalabelingV1beta1EvaluationConfigArgs> evaluationConfig;

    public Output<GoogleCloudDatalabelingV1beta1EvaluationConfigArgs> getEvaluationConfig() {
        return this.evaluationConfig;
    }

    /**
     * Optional. Configuration details for evaluation job alerts. Specify this field if you want to receive email alerts if the evaluation job finds that your predictions have low mean average precision during a run.
     * 
     */
    @Import(name="evaluationJobAlertConfig")
      private final @Nullable Output<GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigArgs> evaluationJobAlertConfig;

    public Output<GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigArgs> getEvaluationJobAlertConfig() {
        return this.evaluationJobAlertConfig == null ? Codegen.empty() : this.evaluationJobAlertConfig;
    }

    /**
     * The maximum number of predictions to sample and save to BigQuery during each evaluation interval. This limit overrides `example_sample_percentage`: even if the service has not sampled enough predictions to fulfill `example_sample_perecentage` during an interval, it stops sampling predictions when it meets this limit.
     * 
     */
    @Import(name="exampleCount", required=true)
      private final Output<Integer> exampleCount;

    public Output<Integer> getExampleCount() {
        return this.exampleCount;
    }

    /**
     * Fraction of predictions to sample and save to BigQuery during each evaluation interval. For example, 0.1 means 10% of predictions served by your model version get saved to BigQuery.
     * 
     */
    @Import(name="exampleSamplePercentage", required=true)
      private final Output<Double> exampleSamplePercentage;

    public Output<Double> getExampleSamplePercentage() {
        return this.exampleSamplePercentage;
    }

    /**
     * Optional. Details for human annotation of your data. If you set labelMissingGroundTruth to `true` for this evaluation job, then you must specify this field. If you plan to provide your own ground truth labels, then omit this field. Note that you must create an Instruction resource before you can specify this field. Provide the name of the instruction resource in the `instruction` field within this configuration.
     * 
     */
    @Import(name="humanAnnotationConfig")
      private final @Nullable Output<GoogleCloudDatalabelingV1beta1HumanAnnotationConfigArgs> humanAnnotationConfig;

    public Output<GoogleCloudDatalabelingV1beta1HumanAnnotationConfigArgs> getHumanAnnotationConfig() {
        return this.humanAnnotationConfig == null ? Codegen.empty() : this.humanAnnotationConfig;
    }

    /**
     * Specify this field if your model version performs image classification or general classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
     * 
     */
    @Import(name="imageClassificationConfig")
      private final @Nullable Output<GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs> imageClassificationConfig;

    public Output<GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs> getImageClassificationConfig() {
        return this.imageClassificationConfig == null ? Codegen.empty() : this.imageClassificationConfig;
    }

    /**
     * Rquired. Details for the sampled prediction input. Within this configuration, there are requirements for several fields: * `dataType` must be one of `IMAGE`, `TEXT`, or `GENERAL_DATA`. * `annotationType` must be one of `IMAGE_CLASSIFICATION_ANNOTATION`, `TEXT_CLASSIFICATION_ANNOTATION`, `GENERAL_CLASSIFICATION_ANNOTATION`, or `IMAGE_BOUNDING_BOX_ANNOTATION` (image object detection). * If your machine learning model performs classification, you must specify `classificationMetadata.isMultiLabel`. * You must specify `bigquerySource` (not `gcsSource`).
     * 
     */
    @Import(name="inputConfig")
      private final @Nullable Output<GoogleCloudDatalabelingV1beta1InputConfigArgs> inputConfig;

    public Output<GoogleCloudDatalabelingV1beta1InputConfigArgs> getInputConfig() {
        return this.inputConfig == null ? Codegen.empty() : this.inputConfig;
    }

    /**
     * Specify this field if your model version performs text classification. `annotationSpecSet` in this configuration must match EvaluationJob.annotationSpecSet. `allowMultiLabel` in this configuration must match `classificationMetadata.isMultiLabel` in input_config.
     * 
     */
    @Import(name="textClassificationConfig")
      private final @Nullable Output<GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs> textClassificationConfig;

    public Output<GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs> getTextClassificationConfig() {
        return this.textClassificationConfig == null ? Codegen.empty() : this.textClassificationConfig;
    }

    public GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs(
        Output<Map<String,String>> bigqueryImportKeys,
        @Nullable Output<GoogleCloudDatalabelingV1beta1BoundingPolyConfigArgs> boundingPolyConfig,
        Output<GoogleCloudDatalabelingV1beta1EvaluationConfigArgs> evaluationConfig,
        @Nullable Output<GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigArgs> evaluationJobAlertConfig,
        Output<Integer> exampleCount,
        Output<Double> exampleSamplePercentage,
        @Nullable Output<GoogleCloudDatalabelingV1beta1HumanAnnotationConfigArgs> humanAnnotationConfig,
        @Nullable Output<GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs> imageClassificationConfig,
        @Nullable Output<GoogleCloudDatalabelingV1beta1InputConfigArgs> inputConfig,
        @Nullable Output<GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs> textClassificationConfig) {
        this.bigqueryImportKeys = Objects.requireNonNull(bigqueryImportKeys, "expected parameter 'bigqueryImportKeys' to be non-null");
        this.boundingPolyConfig = boundingPolyConfig;
        this.evaluationConfig = Objects.requireNonNull(evaluationConfig, "expected parameter 'evaluationConfig' to be non-null");
        this.evaluationJobAlertConfig = evaluationJobAlertConfig;
        this.exampleCount = Objects.requireNonNull(exampleCount, "expected parameter 'exampleCount' to be non-null");
        this.exampleSamplePercentage = Objects.requireNonNull(exampleSamplePercentage, "expected parameter 'exampleSamplePercentage' to be non-null");
        this.humanAnnotationConfig = humanAnnotationConfig;
        this.imageClassificationConfig = imageClassificationConfig;
        this.inputConfig = inputConfig;
        this.textClassificationConfig = textClassificationConfig;
    }

    private GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs() {
        this.bigqueryImportKeys = Codegen.empty();
        this.boundingPolyConfig = Codegen.empty();
        this.evaluationConfig = Codegen.empty();
        this.evaluationJobAlertConfig = Codegen.empty();
        this.exampleCount = Codegen.empty();
        this.exampleSamplePercentage = Codegen.empty();
        this.humanAnnotationConfig = Codegen.empty();
        this.imageClassificationConfig = Codegen.empty();
        this.inputConfig = Codegen.empty();
        this.textClassificationConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,String>> bigqueryImportKeys;
        private @Nullable Output<GoogleCloudDatalabelingV1beta1BoundingPolyConfigArgs> boundingPolyConfig;
        private Output<GoogleCloudDatalabelingV1beta1EvaluationConfigArgs> evaluationConfig;
        private @Nullable Output<GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigArgs> evaluationJobAlertConfig;
        private Output<Integer> exampleCount;
        private Output<Double> exampleSamplePercentage;
        private @Nullable Output<GoogleCloudDatalabelingV1beta1HumanAnnotationConfigArgs> humanAnnotationConfig;
        private @Nullable Output<GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs> imageClassificationConfig;
        private @Nullable Output<GoogleCloudDatalabelingV1beta1InputConfigArgs> inputConfig;
        private @Nullable Output<GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs> textClassificationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryImportKeys = defaults.bigqueryImportKeys;
    	      this.boundingPolyConfig = defaults.boundingPolyConfig;
    	      this.evaluationConfig = defaults.evaluationConfig;
    	      this.evaluationJobAlertConfig = defaults.evaluationJobAlertConfig;
    	      this.exampleCount = defaults.exampleCount;
    	      this.exampleSamplePercentage = defaults.exampleSamplePercentage;
    	      this.humanAnnotationConfig = defaults.humanAnnotationConfig;
    	      this.imageClassificationConfig = defaults.imageClassificationConfig;
    	      this.inputConfig = defaults.inputConfig;
    	      this.textClassificationConfig = defaults.textClassificationConfig;
        }

        public Builder bigqueryImportKeys(Output<Map<String,String>> bigqueryImportKeys) {
            this.bigqueryImportKeys = Objects.requireNonNull(bigqueryImportKeys);
            return this;
        }
        public Builder bigqueryImportKeys(Map<String,String> bigqueryImportKeys) {
            this.bigqueryImportKeys = Output.of(Objects.requireNonNull(bigqueryImportKeys));
            return this;
        }
        public Builder boundingPolyConfig(@Nullable Output<GoogleCloudDatalabelingV1beta1BoundingPolyConfigArgs> boundingPolyConfig) {
            this.boundingPolyConfig = boundingPolyConfig;
            return this;
        }
        public Builder boundingPolyConfig(@Nullable GoogleCloudDatalabelingV1beta1BoundingPolyConfigArgs boundingPolyConfig) {
            this.boundingPolyConfig = Codegen.ofNullable(boundingPolyConfig);
            return this;
        }
        public Builder evaluationConfig(Output<GoogleCloudDatalabelingV1beta1EvaluationConfigArgs> evaluationConfig) {
            this.evaluationConfig = Objects.requireNonNull(evaluationConfig);
            return this;
        }
        public Builder evaluationConfig(GoogleCloudDatalabelingV1beta1EvaluationConfigArgs evaluationConfig) {
            this.evaluationConfig = Output.of(Objects.requireNonNull(evaluationConfig));
            return this;
        }
        public Builder evaluationJobAlertConfig(@Nullable Output<GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigArgs> evaluationJobAlertConfig) {
            this.evaluationJobAlertConfig = evaluationJobAlertConfig;
            return this;
        }
        public Builder evaluationJobAlertConfig(@Nullable GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigArgs evaluationJobAlertConfig) {
            this.evaluationJobAlertConfig = Codegen.ofNullable(evaluationJobAlertConfig);
            return this;
        }
        public Builder exampleCount(Output<Integer> exampleCount) {
            this.exampleCount = Objects.requireNonNull(exampleCount);
            return this;
        }
        public Builder exampleCount(Integer exampleCount) {
            this.exampleCount = Output.of(Objects.requireNonNull(exampleCount));
            return this;
        }
        public Builder exampleSamplePercentage(Output<Double> exampleSamplePercentage) {
            this.exampleSamplePercentage = Objects.requireNonNull(exampleSamplePercentage);
            return this;
        }
        public Builder exampleSamplePercentage(Double exampleSamplePercentage) {
            this.exampleSamplePercentage = Output.of(Objects.requireNonNull(exampleSamplePercentage));
            return this;
        }
        public Builder humanAnnotationConfig(@Nullable Output<GoogleCloudDatalabelingV1beta1HumanAnnotationConfigArgs> humanAnnotationConfig) {
            this.humanAnnotationConfig = humanAnnotationConfig;
            return this;
        }
        public Builder humanAnnotationConfig(@Nullable GoogleCloudDatalabelingV1beta1HumanAnnotationConfigArgs humanAnnotationConfig) {
            this.humanAnnotationConfig = Codegen.ofNullable(humanAnnotationConfig);
            return this;
        }
        public Builder imageClassificationConfig(@Nullable Output<GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs> imageClassificationConfig) {
            this.imageClassificationConfig = imageClassificationConfig;
            return this;
        }
        public Builder imageClassificationConfig(@Nullable GoogleCloudDatalabelingV1beta1ImageClassificationConfigArgs imageClassificationConfig) {
            this.imageClassificationConfig = Codegen.ofNullable(imageClassificationConfig);
            return this;
        }
        public Builder inputConfig(@Nullable Output<GoogleCloudDatalabelingV1beta1InputConfigArgs> inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public Builder inputConfig(@Nullable GoogleCloudDatalabelingV1beta1InputConfigArgs inputConfig) {
            this.inputConfig = Codegen.ofNullable(inputConfig);
            return this;
        }
        public Builder textClassificationConfig(@Nullable Output<GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs> textClassificationConfig) {
            this.textClassificationConfig = textClassificationConfig;
            return this;
        }
        public Builder textClassificationConfig(@Nullable GoogleCloudDatalabelingV1beta1TextClassificationConfigArgs textClassificationConfig) {
            this.textClassificationConfig = Codegen.ofNullable(textClassificationConfig);
            return this;
        }        public GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs build() {
            return new GoogleCloudDatalabelingV1beta1EvaluationJobConfigArgs(bigqueryImportKeys, boundingPolyConfig, evaluationConfig, evaluationJobAlertConfig, exampleCount, exampleSamplePercentage, humanAnnotationConfig, imageClassificationConfig, inputConfig, textClassificationConfig);
        }
    }
}
