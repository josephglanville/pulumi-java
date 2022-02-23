// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Ssis parameter.
 * 
 */
public final class SsisParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final SsisParameterResponse Empty = new SsisParameterResponse();

    /**
     * Parameter type.
     * 
     */
    @InputImport(name="dataType")
      private final @Nullable String dataType;

    public Optional<String> getDataType() {
        return this.dataType == null ? Optional.empty() : Optional.ofNullable(this.dataType);
    }

    /**
     * Default value of parameter.
     * 
     */
    @InputImport(name="defaultValue")
      private final @Nullable String defaultValue;

    public Optional<String> getDefaultValue() {
        return this.defaultValue == null ? Optional.empty() : Optional.ofNullable(this.defaultValue);
    }

    /**
     * Parameter description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Design default value of parameter.
     * 
     */
    @InputImport(name="designDefaultValue")
      private final @Nullable String designDefaultValue;

    public Optional<String> getDesignDefaultValue() {
        return this.designDefaultValue == null ? Optional.empty() : Optional.ofNullable(this.designDefaultValue);
    }

    /**
     * Parameter id.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Double id;

    public Optional<Double> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Parameter name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Whether parameter is required.
     * 
     */
    @InputImport(name="required")
      private final @Nullable Boolean required;

    public Optional<Boolean> getRequired() {
        return this.required == null ? Optional.empty() : Optional.ofNullable(this.required);
    }

    /**
     * Whether parameter is sensitive.
     * 
     */
    @InputImport(name="sensitive")
      private final @Nullable Boolean sensitive;

    public Optional<Boolean> getSensitive() {
        return this.sensitive == null ? Optional.empty() : Optional.ofNullable(this.sensitive);
    }

    /**
     * Default sensitive value of parameter.
     * 
     */
    @InputImport(name="sensitiveDefaultValue")
      private final @Nullable String sensitiveDefaultValue;

    public Optional<String> getSensitiveDefaultValue() {
        return this.sensitiveDefaultValue == null ? Optional.empty() : Optional.ofNullable(this.sensitiveDefaultValue);
    }

    /**
     * Parameter value set.
     * 
     */
    @InputImport(name="valueSet")
      private final @Nullable Boolean valueSet;

    public Optional<Boolean> getValueSet() {
        return this.valueSet == null ? Optional.empty() : Optional.ofNullable(this.valueSet);
    }

    /**
     * Parameter value type.
     * 
     */
    @InputImport(name="valueType")
      private final @Nullable String valueType;

    public Optional<String> getValueType() {
        return this.valueType == null ? Optional.empty() : Optional.ofNullable(this.valueType);
    }

    /**
     * Parameter reference variable.
     * 
     */
    @InputImport(name="variable")
      private final @Nullable String variable;

    public Optional<String> getVariable() {
        return this.variable == null ? Optional.empty() : Optional.ofNullable(this.variable);
    }

    public SsisParameterResponse(
        @Nullable String dataType,
        @Nullable String defaultValue,
        @Nullable String description,
        @Nullable String designDefaultValue,
        @Nullable Double id,
        @Nullable String name,
        @Nullable Boolean required,
        @Nullable Boolean sensitive,
        @Nullable String sensitiveDefaultValue,
        @Nullable Boolean valueSet,
        @Nullable String valueType,
        @Nullable String variable) {
        this.dataType = dataType;
        this.defaultValue = defaultValue;
        this.description = description;
        this.designDefaultValue = designDefaultValue;
        this.id = id;
        this.name = name;
        this.required = required;
        this.sensitive = sensitive;
        this.sensitiveDefaultValue = sensitiveDefaultValue;
        this.valueSet = valueSet;
        this.valueType = valueType;
        this.variable = variable;
    }

    private SsisParameterResponse() {
        this.dataType = null;
        this.defaultValue = null;
        this.description = null;
        this.designDefaultValue = null;
        this.id = null;
        this.name = null;
        this.required = null;
        this.sensitive = null;
        this.sensitiveDefaultValue = null;
        this.valueSet = null;
        this.valueType = null;
        this.variable = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataType;
        private @Nullable String defaultValue;
        private @Nullable String description;
        private @Nullable String designDefaultValue;
        private @Nullable Double id;
        private @Nullable String name;
        private @Nullable Boolean required;
        private @Nullable Boolean sensitive;
        private @Nullable String sensitiveDefaultValue;
        private @Nullable Boolean valueSet;
        private @Nullable String valueType;
        private @Nullable String variable;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.designDefaultValue = defaults.designDefaultValue;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.required = defaults.required;
    	      this.sensitive = defaults.sensitive;
    	      this.sensitiveDefaultValue = defaults.sensitiveDefaultValue;
    	      this.valueSet = defaults.valueSet;
    	      this.valueType = defaults.valueType;
    	      this.variable = defaults.variable;
        }

        public Builder setDataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDesignDefaultValue(@Nullable String designDefaultValue) {
            this.designDefaultValue = designDefaultValue;
            return this;
        }

        public Builder setId(@Nullable Double id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRequired(@Nullable Boolean required) {
            this.required = required;
            return this;
        }

        public Builder setSensitive(@Nullable Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }

        public Builder setSensitiveDefaultValue(@Nullable String sensitiveDefaultValue) {
            this.sensitiveDefaultValue = sensitiveDefaultValue;
            return this;
        }

        public Builder setValueSet(@Nullable Boolean valueSet) {
            this.valueSet = valueSet;
            return this;
        }

        public Builder setValueType(@Nullable String valueType) {
            this.valueType = valueType;
            return this;
        }

        public Builder setVariable(@Nullable String variable) {
            this.variable = variable;
            return this;
        }
        public SsisParameterResponse build() {
            return new SsisParameterResponse(dataType, defaultValue, description, designDefaultValue, id, name, required, sensitive, sensitiveDefaultValue, valueSet, valueType, variable);
        }
    }
}
