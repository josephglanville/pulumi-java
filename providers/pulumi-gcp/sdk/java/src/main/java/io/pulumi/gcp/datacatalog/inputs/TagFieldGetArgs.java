// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagFieldGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagFieldGetArgs Empty = new TagFieldGetArgs();

    /**
     * Holds the value for a tag field with boolean type.
     * 
     */
    @InputImport(name="boolValue")
      private final @Nullable Output<Boolean> boolValue;

    public Output<Boolean> getBoolValue() {
        return this.boolValue == null ? Output.empty() : this.boolValue;
    }

    /**
     * - 
     * The display name of this field
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Holds the value for a tag field with double type.
     * 
     */
    @InputImport(name="doubleValue")
      private final @Nullable Output<Double> doubleValue;

    public Output<Double> getDoubleValue() {
        return this.doubleValue == null ? Output.empty() : this.doubleValue;
    }

    /**
     * Holds the value for a tag field with enum type. This value must be one of the allowed values in the definition of this enum.
     * Structure is documented below.
     * 
     */
    @InputImport(name="enumValue")
      private final @Nullable Output<String> enumValue;

    public Output<String> getEnumValue() {
        return this.enumValue == null ? Output.empty() : this.enumValue;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @InputImport(name="fieldName", required=true)
      private final Output<String> fieldName;

    public Output<String> getFieldName() {
        return this.fieldName;
    }

    /**
     * - 
     * The order of this field with respect to other fields in this tag. For example, a higher value can indicate
     * a more important field. The value can be negative. Multiple fields can have the same order, and field orders
     * within a tag do not have to be sequential.
     * 
     */
    @InputImport(name="order")
      private final @Nullable Output<Integer> order;

    public Output<Integer> getOrder() {
        return this.order == null ? Output.empty() : this.order;
    }

    /**
     * Holds the value for a tag field with string type.
     * 
     */
    @InputImport(name="stringValue")
      private final @Nullable Output<String> stringValue;

    public Output<String> getStringValue() {
        return this.stringValue == null ? Output.empty() : this.stringValue;
    }

    /**
     * Holds the value for a tag field with timestamp type.
     * 
     */
    @InputImport(name="timestampValue")
      private final @Nullable Output<String> timestampValue;

    public Output<String> getTimestampValue() {
        return this.timestampValue == null ? Output.empty() : this.timestampValue;
    }

    public TagFieldGetArgs(
        @Nullable Output<Boolean> boolValue,
        @Nullable Output<String> displayName,
        @Nullable Output<Double> doubleValue,
        @Nullable Output<String> enumValue,
        Output<String> fieldName,
        @Nullable Output<Integer> order,
        @Nullable Output<String> stringValue,
        @Nullable Output<String> timestampValue) {
        this.boolValue = boolValue;
        this.displayName = displayName;
        this.doubleValue = doubleValue;
        this.enumValue = enumValue;
        this.fieldName = Objects.requireNonNull(fieldName, "expected parameter 'fieldName' to be non-null");
        this.order = order;
        this.stringValue = stringValue;
        this.timestampValue = timestampValue;
    }

    private TagFieldGetArgs() {
        this.boolValue = Output.empty();
        this.displayName = Output.empty();
        this.doubleValue = Output.empty();
        this.enumValue = Output.empty();
        this.fieldName = Output.empty();
        this.order = Output.empty();
        this.stringValue = Output.empty();
        this.timestampValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagFieldGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> boolValue;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Double> doubleValue;
        private @Nullable Output<String> enumValue;
        private Output<String> fieldName;
        private @Nullable Output<Integer> order;
        private @Nullable Output<String> stringValue;
        private @Nullable Output<String> timestampValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TagFieldGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boolValue = defaults.boolValue;
    	      this.displayName = defaults.displayName;
    	      this.doubleValue = defaults.doubleValue;
    	      this.enumValue = defaults.enumValue;
    	      this.fieldName = defaults.fieldName;
    	      this.order = defaults.order;
    	      this.stringValue = defaults.stringValue;
    	      this.timestampValue = defaults.timestampValue;
        }

        public Builder boolValue(@Nullable Output<Boolean> boolValue) {
            this.boolValue = boolValue;
            return this;
        }

        public Builder boolValue(@Nullable Boolean boolValue) {
            this.boolValue = Output.ofNullable(boolValue);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder doubleValue(@Nullable Output<Double> doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }

        public Builder doubleValue(@Nullable Double doubleValue) {
            this.doubleValue = Output.ofNullable(doubleValue);
            return this;
        }

        public Builder enumValue(@Nullable Output<String> enumValue) {
            this.enumValue = enumValue;
            return this;
        }

        public Builder enumValue(@Nullable String enumValue) {
            this.enumValue = Output.ofNullable(enumValue);
            return this;
        }

        public Builder fieldName(Output<String> fieldName) {
            this.fieldName = Objects.requireNonNull(fieldName);
            return this;
        }

        public Builder fieldName(String fieldName) {
            this.fieldName = Output.of(Objects.requireNonNull(fieldName));
            return this;
        }

        public Builder order(@Nullable Output<Integer> order) {
            this.order = order;
            return this;
        }

        public Builder order(@Nullable Integer order) {
            this.order = Output.ofNullable(order);
            return this;
        }

        public Builder stringValue(@Nullable Output<String> stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder stringValue(@Nullable String stringValue) {
            this.stringValue = Output.ofNullable(stringValue);
            return this;
        }

        public Builder timestampValue(@Nullable Output<String> timestampValue) {
            this.timestampValue = timestampValue;
            return this;
        }

        public Builder timestampValue(@Nullable String timestampValue) {
            this.timestampValue = Output.ofNullable(timestampValue);
            return this;
        }
        public TagFieldGetArgs build() {
            return new TagFieldGetArgs(boolValue, displayName, doubleValue, enumValue, fieldName, order, stringValue, timestampValue);
        }
    }
}
