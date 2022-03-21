// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelPayload;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DetectorModelDynamoDB {
    /**
     * The name of the hash key (also called the partition key).
     * 
     */
    private final String hashKeyField;
    /**
     * The data type for the hash key (also called the partition key). You can specify the following values:
     * 
     * * `STRING` - The hash key is a string.
     * 
     * * `NUMBER` - The hash key is a number.
     * 
     * If you don't specify `hashKeyType`, the default value is `STRING`.
     * 
     */
    private final @Nullable String hashKeyType;
    /**
     * The value of the hash key (also called the partition key).
     * 
     */
    private final String hashKeyValue;
    /**
     * The type of operation to perform. You can specify the following values:
     * 
     * * `INSERT` - Insert data as a new item into the DynamoDB table. This item uses the specified hash key as a partition key. If you specified a range key, the item uses the range key as a sort key.
     * 
     * * `UPDATE` - Update an existing item of the DynamoDB table with new data. This item's partition key must match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     * 
     * * `DELETE` - Delete an existing item of the DynamoDB table. This item's partition key must match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     * 
     * If you don't specify this parameter, AWS IoT Events triggers the `INSERT` operation.
     * 
     */
    private final @Nullable String operation;
    private final @Nullable DetectorModelPayload payload;
    /**
     * The name of the DynamoDB column that receives the action payload.
     * 
     * If you don't specify this parameter, the name of the DynamoDB column is `payload`.
     * 
     */
    private final @Nullable String payloadField;
    /**
     * The name of the range key (also called the sort key).
     * 
     */
    private final @Nullable String rangeKeyField;
    /**
     * The data type for the range key (also called the sort key), You can specify the following values:
     * 
     * * `STRING` - The range key is a string.
     * 
     * * `NUMBER` - The range key is number.
     * 
     * If you don't specify `rangeKeyField`, the default value is `STRING`.
     * 
     */
    private final @Nullable String rangeKeyType;
    /**
     * The value of the range key (also called the sort key).
     * 
     */
    private final @Nullable String rangeKeyValue;
    /**
     * The name of the DynamoDB table.
     * 
     */
    private final String tableName;

    @CustomType.Constructor
    private DetectorModelDynamoDB(
        @CustomType.Parameter("hashKeyField") String hashKeyField,
        @CustomType.Parameter("hashKeyType") @Nullable String hashKeyType,
        @CustomType.Parameter("hashKeyValue") String hashKeyValue,
        @CustomType.Parameter("operation") @Nullable String operation,
        @CustomType.Parameter("payload") @Nullable DetectorModelPayload payload,
        @CustomType.Parameter("payloadField") @Nullable String payloadField,
        @CustomType.Parameter("rangeKeyField") @Nullable String rangeKeyField,
        @CustomType.Parameter("rangeKeyType") @Nullable String rangeKeyType,
        @CustomType.Parameter("rangeKeyValue") @Nullable String rangeKeyValue,
        @CustomType.Parameter("tableName") String tableName) {
        this.hashKeyField = hashKeyField;
        this.hashKeyType = hashKeyType;
        this.hashKeyValue = hashKeyValue;
        this.operation = operation;
        this.payload = payload;
        this.payloadField = payloadField;
        this.rangeKeyField = rangeKeyField;
        this.rangeKeyType = rangeKeyType;
        this.rangeKeyValue = rangeKeyValue;
        this.tableName = tableName;
    }

    /**
     * The name of the hash key (also called the partition key).
     * 
    */
    public String getHashKeyField() {
        return this.hashKeyField;
    }
    /**
     * The data type for the hash key (also called the partition key). You can specify the following values:
     * 
     * * `STRING` - The hash key is a string.
     * 
     * * `NUMBER` - The hash key is a number.
     * 
     * If you don't specify `hashKeyType`, the default value is `STRING`.
     * 
    */
    public Optional<String> getHashKeyType() {
        return Optional.ofNullable(this.hashKeyType);
    }
    /**
     * The value of the hash key (also called the partition key).
     * 
    */
    public String getHashKeyValue() {
        return this.hashKeyValue;
    }
    /**
     * The type of operation to perform. You can specify the following values:
     * 
     * * `INSERT` - Insert data as a new item into the DynamoDB table. This item uses the specified hash key as a partition key. If you specified a range key, the item uses the range key as a sort key.
     * 
     * * `UPDATE` - Update an existing item of the DynamoDB table with new data. This item's partition key must match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     * 
     * * `DELETE` - Delete an existing item of the DynamoDB table. This item's partition key must match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     * 
     * If you don't specify this parameter, AWS IoT Events triggers the `INSERT` operation.
     * 
    */
    public Optional<String> getOperation() {
        return Optional.ofNullable(this.operation);
    }
    public Optional<DetectorModelPayload> getPayload() {
        return Optional.ofNullable(this.payload);
    }
    /**
     * The name of the DynamoDB column that receives the action payload.
     * 
     * If you don't specify this parameter, the name of the DynamoDB column is `payload`.
     * 
    */
    public Optional<String> getPayloadField() {
        return Optional.ofNullable(this.payloadField);
    }
    /**
     * The name of the range key (also called the sort key).
     * 
    */
    public Optional<String> getRangeKeyField() {
        return Optional.ofNullable(this.rangeKeyField);
    }
    /**
     * The data type for the range key (also called the sort key), You can specify the following values:
     * 
     * * `STRING` - The range key is a string.
     * 
     * * `NUMBER` - The range key is number.
     * 
     * If you don't specify `rangeKeyField`, the default value is `STRING`.
     * 
    */
    public Optional<String> getRangeKeyType() {
        return Optional.ofNullable(this.rangeKeyType);
    }
    /**
     * The value of the range key (also called the sort key).
     * 
    */
    public Optional<String> getRangeKeyValue() {
        return Optional.ofNullable(this.rangeKeyValue);
    }
    /**
     * The name of the DynamoDB table.
     * 
    */
    public String getTableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelDynamoDB defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hashKeyField;
        private @Nullable String hashKeyType;
        private String hashKeyValue;
        private @Nullable String operation;
        private @Nullable DetectorModelPayload payload;
        private @Nullable String payloadField;
        private @Nullable String rangeKeyField;
        private @Nullable String rangeKeyType;
        private @Nullable String rangeKeyValue;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelDynamoDB defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hashKeyField = defaults.hashKeyField;
    	      this.hashKeyType = defaults.hashKeyType;
    	      this.hashKeyValue = defaults.hashKeyValue;
    	      this.operation = defaults.operation;
    	      this.payload = defaults.payload;
    	      this.payloadField = defaults.payloadField;
    	      this.rangeKeyField = defaults.rangeKeyField;
    	      this.rangeKeyType = defaults.rangeKeyType;
    	      this.rangeKeyValue = defaults.rangeKeyValue;
    	      this.tableName = defaults.tableName;
        }

        public Builder hashKeyField(String hashKeyField) {
            this.hashKeyField = Objects.requireNonNull(hashKeyField);
            return this;
        }
        public Builder hashKeyType(@Nullable String hashKeyType) {
            this.hashKeyType = hashKeyType;
            return this;
        }
        public Builder hashKeyValue(String hashKeyValue) {
            this.hashKeyValue = Objects.requireNonNull(hashKeyValue);
            return this;
        }
        public Builder operation(@Nullable String operation) {
            this.operation = operation;
            return this;
        }
        public Builder payload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }
        public Builder payloadField(@Nullable String payloadField) {
            this.payloadField = payloadField;
            return this;
        }
        public Builder rangeKeyField(@Nullable String rangeKeyField) {
            this.rangeKeyField = rangeKeyField;
            return this;
        }
        public Builder rangeKeyType(@Nullable String rangeKeyType) {
            this.rangeKeyType = rangeKeyType;
            return this;
        }
        public Builder rangeKeyValue(@Nullable String rangeKeyValue) {
            this.rangeKeyValue = rangeKeyValue;
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }        public DetectorModelDynamoDB build() {
            return new DetectorModelDynamoDB(hashKeyField, hashKeyType, hashKeyValue, operation, payload, payloadField, rangeKeyField, rangeKeyType, rangeKeyValue, tableName);
        }
    }
}
