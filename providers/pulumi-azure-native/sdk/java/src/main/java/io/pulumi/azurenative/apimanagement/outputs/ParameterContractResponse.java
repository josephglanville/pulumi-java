// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ParameterContractResponse {
    /**
     * Default parameter value.
     * 
     */
    private final @Nullable String defaultValue;
    /**
     * Parameter description.
     * 
     */
    private final @Nullable String description;
    /**
     * Parameter name.
     * 
     */
    private final String name;
    /**
     * Specifies whether parameter is required or not.
     * 
     */
    private final @Nullable Boolean required;
    /**
     * Parameter type.
     * 
     */
    private final String type;
    /**
     * Parameter values.
     * 
     */
    private final @Nullable List<String> values;

    @CustomType.Constructor
    private ParameterContractResponse(
        @CustomType.Parameter("defaultValue") @Nullable String defaultValue,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("required") @Nullable Boolean required,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("values") @Nullable List<String> values) {
        this.defaultValue = defaultValue;
        this.description = description;
        this.name = name;
        this.required = required;
        this.type = type;
        this.values = values;
    }

    /**
     * Default parameter value.
     * 
    */
    public Optional<String> getDefaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * Parameter description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Parameter name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies whether parameter is required or not.
     * 
    */
    public Optional<Boolean> getRequired() {
        return Optional.ofNullable(this.required);
    }
    /**
     * Parameter type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Parameter values.
     * 
    */
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultValue;
        private @Nullable String description;
        private String name;
        private @Nullable Boolean required;
        private String type;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.required = defaults.required;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder required(@Nullable Boolean required) {
            this.required = required;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ParameterContractResponse build() {
            return new ParameterContractResponse(defaultValue, description, name, required, type, values);
        }
    }
}
