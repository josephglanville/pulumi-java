// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.awsnative.backup.outputs.BackupSelectionConditionParameter;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BackupSelectionResourceTypeConditionsProperties {
    private final @Nullable List<BackupSelectionConditionParameter> stringEquals;
    private final @Nullable List<BackupSelectionConditionParameter> stringLike;
    private final @Nullable List<BackupSelectionConditionParameter> stringNotEquals;
    private final @Nullable List<BackupSelectionConditionParameter> stringNotLike;

    @CustomType.Constructor
    private BackupSelectionResourceTypeConditionsProperties(
        @CustomType.Parameter("stringEquals") @Nullable List<BackupSelectionConditionParameter> stringEquals,
        @CustomType.Parameter("stringLike") @Nullable List<BackupSelectionConditionParameter> stringLike,
        @CustomType.Parameter("stringNotEquals") @Nullable List<BackupSelectionConditionParameter> stringNotEquals,
        @CustomType.Parameter("stringNotLike") @Nullable List<BackupSelectionConditionParameter> stringNotLike) {
        this.stringEquals = stringEquals;
        this.stringLike = stringLike;
        this.stringNotEquals = stringNotEquals;
        this.stringNotLike = stringNotLike;
    }

    public List<BackupSelectionConditionParameter> getStringEquals() {
        return this.stringEquals == null ? List.of() : this.stringEquals;
    }
    public List<BackupSelectionConditionParameter> getStringLike() {
        return this.stringLike == null ? List.of() : this.stringLike;
    }
    public List<BackupSelectionConditionParameter> getStringNotEquals() {
        return this.stringNotEquals == null ? List.of() : this.stringNotEquals;
    }
    public List<BackupSelectionConditionParameter> getStringNotLike() {
        return this.stringNotLike == null ? List.of() : this.stringNotLike;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupSelectionResourceTypeConditionsProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BackupSelectionConditionParameter> stringEquals;
        private @Nullable List<BackupSelectionConditionParameter> stringLike;
        private @Nullable List<BackupSelectionConditionParameter> stringNotEquals;
        private @Nullable List<BackupSelectionConditionParameter> stringNotLike;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupSelectionResourceTypeConditionsProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stringEquals = defaults.stringEquals;
    	      this.stringLike = defaults.stringLike;
    	      this.stringNotEquals = defaults.stringNotEquals;
    	      this.stringNotLike = defaults.stringNotLike;
        }

        public Builder stringEquals(@Nullable List<BackupSelectionConditionParameter> stringEquals) {
            this.stringEquals = stringEquals;
            return this;
        }
        public Builder stringEquals(BackupSelectionConditionParameter... stringEquals) {
            return stringEquals(List.of(stringEquals));
        }
        public Builder stringLike(@Nullable List<BackupSelectionConditionParameter> stringLike) {
            this.stringLike = stringLike;
            return this;
        }
        public Builder stringLike(BackupSelectionConditionParameter... stringLike) {
            return stringLike(List.of(stringLike));
        }
        public Builder stringNotEquals(@Nullable List<BackupSelectionConditionParameter> stringNotEquals) {
            this.stringNotEquals = stringNotEquals;
            return this;
        }
        public Builder stringNotEquals(BackupSelectionConditionParameter... stringNotEquals) {
            return stringNotEquals(List.of(stringNotEquals));
        }
        public Builder stringNotLike(@Nullable List<BackupSelectionConditionParameter> stringNotLike) {
            this.stringNotLike = stringNotLike;
            return this;
        }
        public Builder stringNotLike(BackupSelectionConditionParameter... stringNotLike) {
            return stringNotLike(List.of(stringNotLike));
        }        public BackupSelectionResourceTypeConditionsProperties build() {
            return new BackupSelectionResourceTypeConditionsProperties(stringEquals, stringLike, stringNotEquals, stringNotLike);
        }
    }
}
