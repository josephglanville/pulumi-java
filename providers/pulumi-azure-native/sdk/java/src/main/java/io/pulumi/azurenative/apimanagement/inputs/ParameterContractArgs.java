// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Operation parameters details.
 * 
 */
public final class ParameterContractArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterContractArgs Empty = new ParameterContractArgs();

    /**
     * Default parameter value.
     * 
     */
    @Import(name="defaultValue")
      private final @Nullable Output<String> defaultValue;

    public Output<String> getDefaultValue() {
        return this.defaultValue == null ? Output.empty() : this.defaultValue;
    }

    /**
     * Parameter description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Parameter name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Specifies whether parameter is required or not.
     * 
     */
    @Import(name="required")
      private final @Nullable Output<Boolean> required;

    public Output<Boolean> getRequired() {
        return this.required == null ? Output.empty() : this.required;
    }

    /**
     * Parameter type.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Parameter values.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values == null ? Output.empty() : this.values;
    }

    public ParameterContractArgs(
        @Nullable Output<String> defaultValue,
        @Nullable Output<String> description,
        Output<String> name,
        @Nullable Output<Boolean> required,
        Output<String> type,
        @Nullable Output<List<String>> values) {
        this.defaultValue = defaultValue;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.required = required;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.values = values;
    }

    private ParameterContractArgs() {
        this.defaultValue = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.required = Output.empty();
        this.type = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterContractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> defaultValue;
        private @Nullable Output<String> description;
        private Output<String> name;
        private @Nullable Output<Boolean> required;
        private Output<String> type;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterContractArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.required = defaults.required;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = Output.ofNullable(defaultValue);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder required(@Nullable Output<Boolean> required) {
            this.required = required;
            return this;
        }
        public Builder required(@Nullable Boolean required) {
            this.required = Output.ofNullable(required);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = Output.ofNullable(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ParameterContractArgs build() {
            return new ParameterContractArgs(defaultValue, description, name, required, type, values);
        }
    }
}
