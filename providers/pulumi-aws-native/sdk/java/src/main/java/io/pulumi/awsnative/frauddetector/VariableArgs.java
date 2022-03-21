// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector;

import io.pulumi.awsnative.frauddetector.enums.VariableDataSource;
import io.pulumi.awsnative.frauddetector.enums.VariableDataType;
import io.pulumi.awsnative.frauddetector.enums.VariableType;
import io.pulumi.awsnative.frauddetector.inputs.VariableTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VariableArgs extends io.pulumi.resources.ResourceArgs {

    public static final VariableArgs Empty = new VariableArgs();

    /**
     * The source of the data.
     * 
     */
    @Import(name="dataSource", required=true)
      private final Output<VariableDataSource> dataSource;

    public Output<VariableDataSource> getDataSource() {
        return this.dataSource;
    }

    /**
     * The data type.
     * 
     */
    @Import(name="dataType", required=true)
      private final Output<VariableDataType> dataType;

    public Output<VariableDataType> getDataType() {
        return this.dataType;
    }

    /**
     * The default value for the variable when no value is received.
     * 
     */
    @Import(name="defaultValue", required=true)
      private final Output<String> defaultValue;

    public Output<String> getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * The description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the variable.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Tags associated with this variable.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<VariableTagArgs>> tags;

    public Output<List<VariableTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The variable type. For more information see https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types
     * 
     */
    @Import(name="variableType")
      private final @Nullable Output<VariableType> variableType;

    public Output<VariableType> getVariableType() {
        return this.variableType == null ? Output.empty() : this.variableType;
    }

    public VariableArgs(
        Output<VariableDataSource> dataSource,
        Output<VariableDataType> dataType,
        Output<String> defaultValue,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<List<VariableTagArgs>> tags,
        @Nullable Output<VariableType> variableType) {
        this.dataSource = Objects.requireNonNull(dataSource, "expected parameter 'dataSource' to be non-null");
        this.dataType = Objects.requireNonNull(dataType, "expected parameter 'dataType' to be non-null");
        this.defaultValue = Objects.requireNonNull(defaultValue, "expected parameter 'defaultValue' to be non-null");
        this.description = description;
        this.name = name;
        this.tags = tags;
        this.variableType = variableType;
    }

    private VariableArgs() {
        this.dataSource = Output.empty();
        this.dataType = Output.empty();
        this.defaultValue = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
        this.variableType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<VariableDataSource> dataSource;
        private Output<VariableDataType> dataType;
        private Output<String> defaultValue;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<List<VariableTagArgs>> tags;
        private @Nullable Output<VariableType> variableType;

        public Builder() {
    	      // Empty
        }

        public Builder(VariableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSource = defaults.dataSource;
    	      this.dataType = defaults.dataType;
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.variableType = defaults.variableType;
        }

        public Builder dataSource(Output<VariableDataSource> dataSource) {
            this.dataSource = Objects.requireNonNull(dataSource);
            return this;
        }
        public Builder dataSource(VariableDataSource dataSource) {
            this.dataSource = Output.of(Objects.requireNonNull(dataSource));
            return this;
        }
        public Builder dataType(Output<VariableDataType> dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }
        public Builder dataType(VariableDataType dataType) {
            this.dataType = Output.of(Objects.requireNonNull(dataType));
            return this;
        }
        public Builder defaultValue(Output<String> defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = Output.of(Objects.requireNonNull(defaultValue));
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<List<VariableTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<VariableTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(VariableTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder variableType(@Nullable Output<VariableType> variableType) {
            this.variableType = variableType;
            return this;
        }
        public Builder variableType(@Nullable VariableType variableType) {
            this.variableType = Output.ofNullable(variableType);
            return this;
        }        public VariableArgs build() {
            return new VariableArgs(dataSource, dataType, defaultValue, description, name, tags, variableType);
        }
    }
}
