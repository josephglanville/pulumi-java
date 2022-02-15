// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ParameterContractResponse {
    private final @Nullable String defaultValue;
    private final @Nullable String description;
    private final String name;
    private final @Nullable Boolean required;
    private final String type;
    private final @Nullable List<String> values;

    @OutputCustomType.Constructor({"defaultValue","description","name","required","type","values"})
    private ParameterContractResponse(
        @Nullable String defaultValue,
        @Nullable String description,
        String name,
        @Nullable Boolean required,
        String type,
        @Nullable List<String> values) {
        this.defaultValue = defaultValue;
        this.description = description;
        this.name = Objects.requireNonNull(name);
        this.required = required;
        this.type = Objects.requireNonNull(type);
        this.values = values;
    }

    public Optional<String> getDefaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getName() {
        return this.name;
    }
    public Optional<Boolean> getRequired() {
        return Optional.ofNullable(this.required);
    }
    public String getType() {
        return this.type;
    }
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

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRequired(@Nullable Boolean required) {
            this.required = required;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = values;
            return this;
        }

        public ParameterContractResponse build() {
            return new ParameterContractResponse(defaultValue, description, name, required, type, values);
        }
    }
}