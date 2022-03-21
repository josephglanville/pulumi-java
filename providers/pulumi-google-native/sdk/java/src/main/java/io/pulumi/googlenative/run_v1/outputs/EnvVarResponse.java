// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.run_v1.outputs.EnvVarSourceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EnvVarResponse {
    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     * 
     */
    private final String name;
    /**
     * (Optional) Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
     * 
     */
    private final String value;
    /**
     * (Optional) Source for the environment variable's value. Only supports secret_key_ref. Source for the environment variable's value. Cannot be used if value is not empty.
     * 
     */
    private final EnvVarSourceResponse valueFrom;

    @CustomType.Constructor
    private EnvVarResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value,
        @CustomType.Parameter("valueFrom") EnvVarSourceResponse valueFrom) {
        this.name = name;
        this.value = value;
        this.valueFrom = valueFrom;
    }

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * (Optional) Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
     * 
    */
    public String getValue() {
        return this.value;
    }
    /**
     * (Optional) Source for the environment variable's value. Only supports secret_key_ref. Source for the environment variable's value. Cannot be used if value is not empty.
     * 
    */
    public EnvVarSourceResponse getValueFrom() {
        return this.valueFrom;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvVarResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;
        private EnvVarSourceResponse valueFrom;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvVarResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
    	      this.valueFrom = defaults.valueFrom;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder valueFrom(EnvVarSourceResponse valueFrom) {
            this.valueFrom = Objects.requireNonNull(valueFrom);
            return this;
        }        public EnvVarResponse build() {
            return new EnvVarResponse(name, value, valueFrom);
        }
    }
}
