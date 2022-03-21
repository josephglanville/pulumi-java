// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfiguration {
    /**
     * Nested argument that specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. More details below.
     * 
     */
    private final FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer deserializer;

    @CustomType.Constructor
    private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfiguration(@CustomType.Parameter("deserializer") FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer deserializer) {
        this.deserializer = deserializer;
    }

    /**
     * Nested argument that specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. More details below.
     * 
    */
    public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer getDeserializer() {
        return this.deserializer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer deserializer;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deserializer = defaults.deserializer;
        }

        public Builder deserializer(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializer deserializer) {
            this.deserializer = Objects.requireNonNull(deserializer);
            return this;
        }        public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfiguration build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfiguration(deserializer);
        }
    }
}
