// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe {
    /**
     * When set to true, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before deserializing them.
     * 
     */
    private final @Nullable Boolean caseInsensitive;
    /**
     * A map of column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains keys that are Hive keywords. For example, timestamp is a Hive keyword. If you have a JSON key named timestamp, set this parameter to `{ ts = "timestamp" }` to map this key to a column named ts.
     * 
     */
    private final @Nullable Map<String,String> columnToJsonKeyMappings;
    /**
     * When set to `true`, specifies that the names of the keys include dots and that you want Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using this option. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean convertDotsInJsonKeysToUnderscores;

    @OutputCustomType.Constructor
    private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe(
        @OutputCustomType.Parameter("caseInsensitive") @Nullable Boolean caseInsensitive,
        @OutputCustomType.Parameter("columnToJsonKeyMappings") @Nullable Map<String,String> columnToJsonKeyMappings,
        @OutputCustomType.Parameter("convertDotsInJsonKeysToUnderscores") @Nullable Boolean convertDotsInJsonKeysToUnderscores) {
        this.caseInsensitive = caseInsensitive;
        this.columnToJsonKeyMappings = columnToJsonKeyMappings;
        this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
    }

    /**
     * When set to true, which is the default, Kinesis Data Firehose converts JSON keys to lowercase before deserializing them.
     * 
    */
    public Optional<Boolean> getCaseInsensitive() {
        return Optional.ofNullable(this.caseInsensitive);
    }
    /**
     * A map of column names to JSON keys that aren't identical to the column names. This is useful when the JSON contains keys that are Hive keywords. For example, timestamp is a Hive keyword. If you have a JSON key named timestamp, set this parameter to `{ ts = "timestamp" }` to map this key to a column named ts.
     * 
    */
    public Map<String,String> getColumnToJsonKeyMappings() {
        return this.columnToJsonKeyMappings == null ? Map.of() : this.columnToJsonKeyMappings;
    }
    /**
     * When set to `true`, specifies that the names of the keys include dots and that you want Kinesis Data Firehose to replace them with underscores. This is useful because Apache Hive does not allow dots in column names. For example, if the JSON contains a key whose name is "a.b", you can define the column name to be "a_b" when using this option. Defaults to `false`.
     * 
    */
    public Optional<Boolean> getConvertDotsInJsonKeysToUnderscores() {
        return Optional.ofNullable(this.convertDotsInJsonKeysToUnderscores);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean caseInsensitive;
        private @Nullable Map<String,String> columnToJsonKeyMappings;
        private @Nullable Boolean convertDotsInJsonKeysToUnderscores;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseInsensitive = defaults.caseInsensitive;
    	      this.columnToJsonKeyMappings = defaults.columnToJsonKeyMappings;
    	      this.convertDotsInJsonKeysToUnderscores = defaults.convertDotsInJsonKeysToUnderscores;
        }

        public Builder setCaseInsensitive(@Nullable Boolean caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }

        public Builder setColumnToJsonKeyMappings(@Nullable Map<String,String> columnToJsonKeyMappings) {
            this.columnToJsonKeyMappings = columnToJsonKeyMappings;
            return this;
        }

        public Builder setConvertDotsInJsonKeysToUnderscores(@Nullable Boolean convertDotsInJsonKeysToUnderscores) {
            this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
            return this;
        }
        public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationDeserializerOpenXJsonSerDe(caseInsensitive, columnToJsonKeyMappings, convertDotsInJsonKeysToUnderscores);
        }
    }
}
