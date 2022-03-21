// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BackupSelectionConditionResourceTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupSelectionConditionResourceTypeArgs Empty = new BackupSelectionConditionResourceTypeArgs();

    @Import(name="conditionKey", required=true)
      private final Output<String> conditionKey;

    public Output<String> getConditionKey() {
        return this.conditionKey;
    }

    @Import(name="conditionType", required=true)
      private final Output<String> conditionType;

    public Output<String> getConditionType() {
        return this.conditionType;
    }

    @Import(name="conditionValue", required=true)
      private final Output<String> conditionValue;

    public Output<String> getConditionValue() {
        return this.conditionValue;
    }

    public BackupSelectionConditionResourceTypeArgs(
        Output<String> conditionKey,
        Output<String> conditionType,
        Output<String> conditionValue) {
        this.conditionKey = Objects.requireNonNull(conditionKey, "expected parameter 'conditionKey' to be non-null");
        this.conditionType = Objects.requireNonNull(conditionType, "expected parameter 'conditionType' to be non-null");
        this.conditionValue = Objects.requireNonNull(conditionValue, "expected parameter 'conditionValue' to be non-null");
    }

    private BackupSelectionConditionResourceTypeArgs() {
        this.conditionKey = Output.empty();
        this.conditionType = Output.empty();
        this.conditionValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupSelectionConditionResourceTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> conditionKey;
        private Output<String> conditionType;
        private Output<String> conditionValue;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupSelectionConditionResourceTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionKey = defaults.conditionKey;
    	      this.conditionType = defaults.conditionType;
    	      this.conditionValue = defaults.conditionValue;
        }

        public Builder conditionKey(Output<String> conditionKey) {
            this.conditionKey = Objects.requireNonNull(conditionKey);
            return this;
        }
        public Builder conditionKey(String conditionKey) {
            this.conditionKey = Output.of(Objects.requireNonNull(conditionKey));
            return this;
        }
        public Builder conditionType(Output<String> conditionType) {
            this.conditionType = Objects.requireNonNull(conditionType);
            return this;
        }
        public Builder conditionType(String conditionType) {
            this.conditionType = Output.of(Objects.requireNonNull(conditionType));
            return this;
        }
        public Builder conditionValue(Output<String> conditionValue) {
            this.conditionValue = Objects.requireNonNull(conditionValue);
            return this;
        }
        public Builder conditionValue(String conditionValue) {
            this.conditionValue = Output.of(Objects.requireNonNull(conditionValue));
            return this;
        }        public BackupSelectionConditionResourceTypeArgs build() {
            return new BackupSelectionConditionResourceTypeArgs(conditionKey, conditionType, conditionValue);
        }
    }
}
