// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.AiVision.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelTrainingDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelTrainingDatasetArgs Empty = new ModelTrainingDatasetArgs();

    /**
     * The name of the ObjectStorage bucket that contains the input data file.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the ObjectStorage bucket that contains the input data file.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * The OCID of the Data Science Labeling Dataset.
     * 
     */
    @Import(name="datasetId")
    private @Nullable Output<String> datasetId;

    /**
     * @return The OCID of the Data Science Labeling Dataset.
     * 
     */
    public Optional<Output<String>> datasetId() {
        return Optional.ofNullable(this.datasetId);
    }

    /**
     * Type of the Dataset.
     * 
     */
    @Import(name="datasetType", required=true)
    private Output<String> datasetType;

    /**
     * @return Type of the Dataset.
     * 
     */
    public Output<String> datasetType() {
        return this.datasetType;
    }

    @Import(name="namespaceName")
    private @Nullable Output<String> namespaceName;

    public Optional<Output<String>> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }

    /**
     * The object name of the input data file.
     * 
     */
    @Import(name="object")
    private @Nullable Output<String> object;

    /**
     * @return The object name of the input data file.
     * 
     */
    public Optional<Output<String>> object() {
        return Optional.ofNullable(this.object);
    }

    private ModelTrainingDatasetArgs() {}

    private ModelTrainingDatasetArgs(ModelTrainingDatasetArgs $) {
        this.bucket = $.bucket;
        this.datasetId = $.datasetId;
        this.datasetType = $.datasetType;
        this.namespaceName = $.namespaceName;
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelTrainingDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelTrainingDatasetArgs $;

        public Builder() {
            $ = new ModelTrainingDatasetArgs();
        }

        public Builder(ModelTrainingDatasetArgs defaults) {
            $ = new ModelTrainingDatasetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the ObjectStorage bucket that contains the input data file.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the ObjectStorage bucket that contains the input data file.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param datasetId The OCID of the Data Science Labeling Dataset.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(@Nullable Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        /**
         * @param datasetId The OCID of the Data Science Labeling Dataset.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        /**
         * @param datasetType Type of the Dataset.
         * 
         * @return builder
         * 
         */
        public Builder datasetType(Output<String> datasetType) {
            $.datasetType = datasetType;
            return this;
        }

        /**
         * @param datasetType Type of the Dataset.
         * 
         * @return builder
         * 
         */
        public Builder datasetType(String datasetType) {
            return datasetType(Output.of(datasetType));
        }

        public Builder namespaceName(@Nullable Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param object The object name of the input data file.
         * 
         * @return builder
         * 
         */
        public Builder object(@Nullable Output<String> object) {
            $.object = object;
            return this;
        }

        /**
         * @param object The object name of the input data file.
         * 
         * @return builder
         * 
         */
        public Builder object(String object) {
            return object(Output.of(object));
        }

        public ModelTrainingDatasetArgs build() {
            $.datasetType = Objects.requireNonNull($.datasetType, "expected parameter 'datasetType' to be non-null");
            return $;
        }
    }

}
