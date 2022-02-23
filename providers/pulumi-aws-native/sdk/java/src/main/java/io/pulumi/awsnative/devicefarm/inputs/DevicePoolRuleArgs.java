// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm.inputs;

import io.pulumi.awsnative.devicefarm.enums.DevicePoolRuleAttribute;
import io.pulumi.awsnative.devicefarm.enums.DevicePoolRuleOperator;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a condition for a device pool.
 * 
 */
public final class DevicePoolRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final DevicePoolRuleArgs Empty = new DevicePoolRuleArgs();

    /**
     * The rule's stringified attribute.
     * 
     */
    @InputImport(name="attribute")
      private final @Nullable Input<DevicePoolRuleAttribute> attribute;

    public Input<DevicePoolRuleAttribute> getAttribute() {
        return this.attribute == null ? Input.empty() : this.attribute;
    }

    /**
     * Specifies how Device Farm compares the rule's attribute to the value.
     * 
     */
    @InputImport(name="operator")
      private final @Nullable Input<DevicePoolRuleOperator> operator;

    public Input<DevicePoolRuleOperator> getOperator() {
        return this.operator == null ? Input.empty() : this.operator;
    }

    /**
     * The rule's value.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public DevicePoolRuleArgs(
        @Nullable Input<DevicePoolRuleAttribute> attribute,
        @Nullable Input<DevicePoolRuleOperator> operator,
        @Nullable Input<String> value) {
        this.attribute = attribute;
        this.operator = operator;
        this.value = value;
    }

    private DevicePoolRuleArgs() {
        this.attribute = Input.empty();
        this.operator = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePoolRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DevicePoolRuleAttribute> attribute;
        private @Nullable Input<DevicePoolRuleOperator> operator;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePoolRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        public Builder setAttribute(@Nullable Input<DevicePoolRuleAttribute> attribute) {
            this.attribute = attribute;
            return this;
        }

        public Builder setAttribute(@Nullable DevicePoolRuleAttribute attribute) {
            this.attribute = Input.ofNullable(attribute);
            return this;
        }

        public Builder setOperator(@Nullable Input<DevicePoolRuleOperator> operator) {
            this.operator = operator;
            return this;
        }

        public Builder setOperator(@Nullable DevicePoolRuleOperator operator) {
            this.operator = Input.ofNullable(operator);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public DevicePoolRuleArgs build() {
            return new DevicePoolRuleArgs(attribute, operator, value);
        }
    }
}
