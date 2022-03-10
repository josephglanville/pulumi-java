// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.devicefarm.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DevicePoolRule {
    /**
     * The rule's stringified attribute. Valid values are: `APPIUM_VERSION`, `ARN`, `AVAILABILITY`, `FLEET_TYPE`, `FORM_FACTOR`, `INSTANCE_ARN`, `INSTANCE_LABELS`, `MANUFACTURER`, `MODEL`, `OS_VERSION`, `PLATFORM`, `REMOTE_ACCESS_ENABLED`, `REMOTE_DEBUG_ENABLED`.
     * 
     */
    private final @Nullable String attribute;
    /**
     * Specifies how Device Farm compares the rule's attribute to the value. For the operators that are supported by each attribute. Valid values are: `EQUALS`, `NOT_IN`, `IN`, `GREATER_THAN`, `GREATER_THAN_OR_EQUALS`, `LESS_THAN`, `LESS_THAN_OR_EQUALS`, `CONTAINS`.
     * 
     */
    private final @Nullable String operator;
    /**
     * The rule's value.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private DevicePoolRule(
        @OutputCustomType.Parameter("attribute") @Nullable String attribute,
        @OutputCustomType.Parameter("operator") @Nullable String operator,
        @OutputCustomType.Parameter("value") @Nullable String value) {
        this.attribute = attribute;
        this.operator = operator;
        this.value = value;
    }

    /**
     * The rule's stringified attribute. Valid values are: `APPIUM_VERSION`, `ARN`, `AVAILABILITY`, `FLEET_TYPE`, `FORM_FACTOR`, `INSTANCE_ARN`, `INSTANCE_LABELS`, `MANUFACTURER`, `MODEL`, `OS_VERSION`, `PLATFORM`, `REMOTE_ACCESS_ENABLED`, `REMOTE_DEBUG_ENABLED`.
     * 
    */
    public Optional<String> getAttribute() {
        return Optional.ofNullable(this.attribute);
    }
    /**
     * Specifies how Device Farm compares the rule's attribute to the value. For the operators that are supported by each attribute. Valid values are: `EQUALS`, `NOT_IN`, `IN`, `GREATER_THAN`, `GREATER_THAN_OR_EQUALS`, `LESS_THAN`, `LESS_THAN_OR_EQUALS`, `CONTAINS`.
     * 
    */
    public Optional<String> getOperator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * The rule's value.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePoolRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String attribute;
        private @Nullable String operator;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePoolRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        public Builder setAttribute(@Nullable String attribute) {
            this.attribute = attribute;
            return this;
        }

        public Builder setOperator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public DevicePoolRule build() {
            return new DevicePoolRule(attribute, operator, value);
        }
    }
}
