// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SpecificationResponse {
    /**
     * @return Name of the specification
     * 
     */
    private String name;
    /**
     * @return Value of the specification
     * 
     */
    private String value;

    private SpecificationResponse() {}
    /**
     * @return Name of the specification
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Value of the specification
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpecificationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(SpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
                throw new MissingRequiredPropertyException("SpecificationResponse", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
                throw new MissingRequiredPropertyException("SpecificationResponse", "value");
            }
            this.value = value;
            return this;
        }
        public SpecificationResponse build() {
            final var o = new SpecificationResponse();
            o.name = name;
            o.value = value;
            return o;
        }
    }
}
