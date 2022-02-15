// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DWCopyCommandDefaultValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final DWCopyCommandDefaultValueArgs Empty = new DWCopyCommandDefaultValueArgs();

    @InputImport(name="columnName")
    private final @Nullable Input<Object> columnName;

    public Input<Object> getColumnName() {
        return this.columnName == null ? Input.empty() : this.columnName;
    }

    @InputImport(name="defaultValue")
    private final @Nullable Input<Object> defaultValue;

    public Input<Object> getDefaultValue() {
        return this.defaultValue == null ? Input.empty() : this.defaultValue;
    }

    public DWCopyCommandDefaultValueArgs(
        @Nullable Input<Object> columnName,
        @Nullable Input<Object> defaultValue) {
        this.columnName = columnName;
        this.defaultValue = defaultValue;
    }

    private DWCopyCommandDefaultValueArgs() {
        this.columnName = Input.empty();
        this.defaultValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DWCopyCommandDefaultValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> columnName;
        private @Nullable Input<Object> defaultValue;

        public Builder() {
    	      // Empty
        }

        public Builder(DWCopyCommandDefaultValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.defaultValue = defaults.defaultValue;
        }

        public Builder setColumnName(@Nullable Input<Object> columnName) {
            this.columnName = columnName;
            return this;
        }

        public Builder setColumnName(@Nullable Object columnName) {
            this.columnName = Input.ofNullable(columnName);
            return this;
        }

        public Builder setDefaultValue(@Nullable Input<Object> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDefaultValue(@Nullable Object defaultValue) {
            this.defaultValue = Input.ofNullable(defaultValue);
            return this;
        }

        public DWCopyCommandDefaultValueArgs build() {
            return new DWCopyCommandDefaultValueArgs(columnName, defaultValue);
        }
    }
}