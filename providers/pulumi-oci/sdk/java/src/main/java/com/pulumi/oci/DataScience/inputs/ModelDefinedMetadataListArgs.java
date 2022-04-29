// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataScience.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelDefinedMetadataListArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelDefinedMetadataListArgs Empty = new ModelDefinedMetadataListArgs();

    /**
     * (Updatable) Category of model metadata which should be null for defined metadata.For custom metadata is should be one of the following values &#34;Performance,Training Profile,Training and Validation Datasets,Training Environment,other&#34;.
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return (Updatable) Category of model metadata which should be null for defined metadata.For custom metadata is should be one of the following values &#34;Performance,Training Profile,Training and Validation Datasets,Training Environment,other&#34;.
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * (Updatable) A short description of the model.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) A short description of the model.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) Key of the model Metadata. The key can either be user defined or Oracle Cloud Infrastructure defined. List of Oracle Cloud Infrastructure defined keys:
     * * useCaseType
     * * libraryName
     * * libraryVersion
     * * estimatorClass
     * * hyperParameters
     * * testartifactresults
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return (Updatable) Key of the model Metadata. The key can either be user defined or Oracle Cloud Infrastructure defined. List of Oracle Cloud Infrastructure defined keys:
     * * useCaseType
     * * libraryName
     * * libraryVersion
     * * estimatorClass
     * * hyperParameters
     * * testartifactresults
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * (Updatable) Allowed values for useCaseType: binary_classification, regression, multinomial_classification, clustering, recommender, dimensionality_reduction/representation, time_series_forecasting, anomaly_detection, topic_modeling, ner, sentiment_analysis, image_classification, object_localization, other
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return (Updatable) Allowed values for useCaseType: binary_classification, regression, multinomial_classification, clustering, recommender, dimensionality_reduction/representation, time_series_forecasting, anomaly_detection, topic_modeling, ner, sentiment_analysis, image_classification, object_localization, other
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ModelDefinedMetadataListArgs() {}

    private ModelDefinedMetadataListArgs(ModelDefinedMetadataListArgs $) {
        this.category = $.category;
        this.description = $.description;
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelDefinedMetadataListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelDefinedMetadataListArgs $;

        public Builder() {
            $ = new ModelDefinedMetadataListArgs();
        }

        public Builder(ModelDefinedMetadataListArgs defaults) {
            $ = new ModelDefinedMetadataListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category (Updatable) Category of model metadata which should be null for defined metadata.For custom metadata is should be one of the following values &#34;Performance,Training Profile,Training and Validation Datasets,Training Environment,other&#34;.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category (Updatable) Category of model metadata which should be null for defined metadata.For custom metadata is should be one of the following values &#34;Performance,Training Profile,Training and Validation Datasets,Training Environment,other&#34;.
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param description (Updatable) A short description of the model.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) A short description of the model.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param key (Updatable) Key of the model Metadata. The key can either be user defined or Oracle Cloud Infrastructure defined. List of Oracle Cloud Infrastructure defined keys:
         * * useCaseType
         * * libraryName
         * * libraryVersion
         * * estimatorClass
         * * hyperParameters
         * * testartifactresults
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key (Updatable) Key of the model Metadata. The key can either be user defined or Oracle Cloud Infrastructure defined. List of Oracle Cloud Infrastructure defined keys:
         * * useCaseType
         * * libraryName
         * * libraryVersion
         * * estimatorClass
         * * hyperParameters
         * * testartifactresults
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value (Updatable) Allowed values for useCaseType: binary_classification, regression, multinomial_classification, clustering, recommender, dimensionality_reduction/representation, time_series_forecasting, anomaly_detection, topic_modeling, ner, sentiment_analysis, image_classification, object_localization, other
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value (Updatable) Allowed values for useCaseType: binary_classification, regression, multinomial_classification, clustering, recommender, dimensionality_reduction/representation, time_series_forecasting, anomaly_detection, topic_modeling, ner, sentiment_analysis, image_classification, object_localization, other
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ModelDefinedMetadataListArgs build() {
            return $;
        }
    }

}
