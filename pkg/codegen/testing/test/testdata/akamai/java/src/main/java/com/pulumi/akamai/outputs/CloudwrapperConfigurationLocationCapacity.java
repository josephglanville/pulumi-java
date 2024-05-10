// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudwrapperConfigurationLocationCapacity {
    private String unit;
    private Integer value;

    private CloudwrapperConfigurationLocationCapacity() {}
    public String unit() {
        return this.unit;
    }
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudwrapperConfigurationLocationCapacity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String unit;
        private Integer value;
        public Builder() {}
        public Builder(CloudwrapperConfigurationLocationCapacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder unit(String unit) {
            if (unit == null) {
              throw new MissingRequiredPropertyException("CloudwrapperConfigurationLocationCapacity", "unit");
            }
            this.unit = unit;
            return this;
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("CloudwrapperConfigurationLocationCapacity", "value");
            }
            this.value = value;
            return this;
        }
        public CloudwrapperConfigurationLocationCapacity build() {
            final var _resultValue = new CloudwrapperConfigurationLocationCapacity();
            _resultValue.unit = unit;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
