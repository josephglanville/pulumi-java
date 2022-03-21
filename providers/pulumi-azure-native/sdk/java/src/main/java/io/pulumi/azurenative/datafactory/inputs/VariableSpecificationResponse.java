// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of a single variable for a Pipeline.
 * 
 */
public final class VariableSpecificationResponse extends io.pulumi.resources.InvokeArgs {

    public static final VariableSpecificationResponse Empty = new VariableSpecificationResponse();

    /**
     * Default value of variable.
     * 
     */
    @Import(name="defaultValue")
      private final @Nullable Object defaultValue;

    public Optional<Object> getDefaultValue() {
        return this.defaultValue == null ? Optional.empty() : Optional.ofNullable(this.defaultValue);
    }

    /**
     * Variable type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public VariableSpecificationResponse(
        @Nullable Object defaultValue,
        String type) {
        this.defaultValue = defaultValue;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private VariableSpecificationResponse() {
        this.defaultValue = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VariableSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object defaultValue;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VariableSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.type = defaults.type;
        }

        public Builder defaultValue(@Nullable Object defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public VariableSpecificationResponse build() {
            return new VariableSpecificationResponse(defaultValue, type);
        }
    }
}
