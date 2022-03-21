// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupSelectionConditionParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupSelectionConditionParameterArgs Empty = new BackupSelectionConditionParameterArgs();

    @Import(name="conditionKey")
      private final @Nullable Output<String> conditionKey;

    public Output<String> getConditionKey() {
        return this.conditionKey == null ? Output.empty() : this.conditionKey;
    }

    @Import(name="conditionValue")
      private final @Nullable Output<String> conditionValue;

    public Output<String> getConditionValue() {
        return this.conditionValue == null ? Output.empty() : this.conditionValue;
    }

    public BackupSelectionConditionParameterArgs(
        @Nullable Output<String> conditionKey,
        @Nullable Output<String> conditionValue) {
        this.conditionKey = conditionKey;
        this.conditionValue = conditionValue;
    }

    private BackupSelectionConditionParameterArgs() {
        this.conditionKey = Output.empty();
        this.conditionValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupSelectionConditionParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> conditionKey;
        private @Nullable Output<String> conditionValue;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupSelectionConditionParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionKey = defaults.conditionKey;
    	      this.conditionValue = defaults.conditionValue;
        }

        public Builder conditionKey(@Nullable Output<String> conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public Builder conditionKey(@Nullable String conditionKey) {
            this.conditionKey = Output.ofNullable(conditionKey);
            return this;
        }
        public Builder conditionValue(@Nullable Output<String> conditionValue) {
            this.conditionValue = conditionValue;
            return this;
        }
        public Builder conditionValue(@Nullable String conditionValue) {
            this.conditionValue = Output.ofNullable(conditionValue);
            return this;
        }        public BackupSelectionConditionParameterArgs build() {
            return new BackupSelectionConditionParameterArgs(conditionKey, conditionValue);
        }
    }
}
