// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleDynamoDBAction extends io.pulumi.resources.InvokeArgs {

    public static final TopicRuleDynamoDBAction Empty = new TopicRuleDynamoDBAction();

    @InputImport(name="hashKeyField", required=true)
      private final String hashKeyField;

    public String getHashKeyField() {
        return this.hashKeyField;
    }

    @InputImport(name="hashKeyType")
      private final @Nullable String hashKeyType;

    public Optional<String> getHashKeyType() {
        return this.hashKeyType == null ? Optional.empty() : Optional.ofNullable(this.hashKeyType);
    }

    @InputImport(name="hashKeyValue", required=true)
      private final String hashKeyValue;

    public String getHashKeyValue() {
        return this.hashKeyValue;
    }

    @InputImport(name="payloadField")
      private final @Nullable String payloadField;

    public Optional<String> getPayloadField() {
        return this.payloadField == null ? Optional.empty() : Optional.ofNullable(this.payloadField);
    }

    @InputImport(name="rangeKeyField")
      private final @Nullable String rangeKeyField;

    public Optional<String> getRangeKeyField() {
        return this.rangeKeyField == null ? Optional.empty() : Optional.ofNullable(this.rangeKeyField);
    }

    @InputImport(name="rangeKeyType")
      private final @Nullable String rangeKeyType;

    public Optional<String> getRangeKeyType() {
        return this.rangeKeyType == null ? Optional.empty() : Optional.ofNullable(this.rangeKeyType);
    }

    @InputImport(name="rangeKeyValue")
      private final @Nullable String rangeKeyValue;

    public Optional<String> getRangeKeyValue() {
        return this.rangeKeyValue == null ? Optional.empty() : Optional.ofNullable(this.rangeKeyValue);
    }

    @InputImport(name="roleArn", required=true)
      private final String roleArn;

    public String getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="tableName", required=true)
      private final String tableName;

    public String getTableName() {
        return this.tableName;
    }

    public TopicRuleDynamoDBAction(
        String hashKeyField,
        @Nullable String hashKeyType,
        String hashKeyValue,
        @Nullable String payloadField,
        @Nullable String rangeKeyField,
        @Nullable String rangeKeyType,
        @Nullable String rangeKeyValue,
        String roleArn,
        String tableName) {
        this.hashKeyField = Objects.requireNonNull(hashKeyField, "expected parameter 'hashKeyField' to be non-null");
        this.hashKeyType = hashKeyType;
        this.hashKeyValue = Objects.requireNonNull(hashKeyValue, "expected parameter 'hashKeyValue' to be non-null");
        this.payloadField = payloadField;
        this.rangeKeyField = rangeKeyField;
        this.rangeKeyType = rangeKeyType;
        this.rangeKeyValue = rangeKeyValue;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private TopicRuleDynamoDBAction() {
        this.hashKeyField = null;
        this.hashKeyType = null;
        this.hashKeyValue = null;
        this.payloadField = null;
        this.rangeKeyField = null;
        this.rangeKeyType = null;
        this.rangeKeyValue = null;
        this.roleArn = null;
        this.tableName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDynamoDBAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hashKeyField;
        private @Nullable String hashKeyType;
        private String hashKeyValue;
        private @Nullable String payloadField;
        private @Nullable String rangeKeyField;
        private @Nullable String rangeKeyType;
        private @Nullable String rangeKeyValue;
        private String roleArn;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDynamoDBAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hashKeyField = defaults.hashKeyField;
    	      this.hashKeyType = defaults.hashKeyType;
    	      this.hashKeyValue = defaults.hashKeyValue;
    	      this.payloadField = defaults.payloadField;
    	      this.rangeKeyField = defaults.rangeKeyField;
    	      this.rangeKeyType = defaults.rangeKeyType;
    	      this.rangeKeyValue = defaults.rangeKeyValue;
    	      this.roleArn = defaults.roleArn;
    	      this.tableName = defaults.tableName;
        }

        public Builder setHashKeyField(String hashKeyField) {
            this.hashKeyField = Objects.requireNonNull(hashKeyField);
            return this;
        }

        public Builder setHashKeyType(@Nullable String hashKeyType) {
            this.hashKeyType = hashKeyType;
            return this;
        }

        public Builder setHashKeyValue(String hashKeyValue) {
            this.hashKeyValue = Objects.requireNonNull(hashKeyValue);
            return this;
        }

        public Builder setPayloadField(@Nullable String payloadField) {
            this.payloadField = payloadField;
            return this;
        }

        public Builder setRangeKeyField(@Nullable String rangeKeyField) {
            this.rangeKeyField = rangeKeyField;
            return this;
        }

        public Builder setRangeKeyType(@Nullable String rangeKeyType) {
            this.rangeKeyType = rangeKeyType;
            return this;
        }

        public Builder setRangeKeyValue(@Nullable String rangeKeyValue) {
            this.rangeKeyValue = rangeKeyValue;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public TopicRuleDynamoDBAction build() {
            return new TopicRuleDynamoDBAction(hashKeyField, hashKeyType, hashKeyValue, payloadField, rangeKeyField, rangeKeyType, rangeKeyValue, roleArn, tableName);
        }
    }
}
