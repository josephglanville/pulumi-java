// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector;

import io.pulumi.awsnative.frauddetector.enums.VariableDataSource;
import io.pulumi.awsnative.frauddetector.enums.VariableDataType;
import io.pulumi.awsnative.frauddetector.enums.VariableType;
import io.pulumi.awsnative.frauddetector.inputs.VariableTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="dataSource", required=true)
      private final Input<VariableDataSource> dataSource;

    public Input<VariableDataSource> getDataSource() {
        return this.dataSource;
    }

    /**
     * The data type.
     * 
     */
    @InputImport(name="dataType", required=true)
      private final Input<VariableDataType> dataType;

    public Input<VariableDataType> getDataType() {
        return this.dataType;
    }

    /**
     * The default value for the variable when no value is received.
     * 
     */
    @InputImport(name="defaultValue", required=true)
      private final Input<String> defaultValue;

    public Input<String> getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * The description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the variable.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Tags associated with this variable.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<VariableTagArgs>> tags;

    public Input<List<VariableTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The variable type. For more information see https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types
     * 
     */
    @InputImport(name="variableType")
      private final @Nullable Input<VariableType> variableType;

    public Input<VariableType> getVariableType() {
        return this.variableType == null ? Input.empty() : this.variableType;
    }

    public VariableArgs(
        Input<VariableDataSource> dataSource,
        Input<VariableDataType> dataType,
        Input<String> defaultValue,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<List<VariableTagArgs>> tags,
        @Nullable Input<VariableType> variableType) {
        this.dataSource = Objects.requireNonNull(dataSource, "expected parameter 'dataSource' to be non-null");
        this.dataType = Objects.requireNonNull(dataType, "expected parameter 'dataType' to be non-null");
        this.defaultValue = Objects.requireNonNull(defaultValue, "expected parameter 'defaultValue' to be non-null");
        this.description = description;
        this.name = name;
        this.tags = tags;
        this.variableType = variableType;
    }

    private VariableArgs() {
        this.dataSource = Input.empty();
        this.dataType = Input.empty();
        this.defaultValue = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.variableType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<VariableDataSource> dataSource;
        private Input<VariableDataType> dataType;
        private Input<String> defaultValue;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<List<VariableTagArgs>> tags;
        private @Nullable Input<VariableType> variableType;

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

        public Builder setDataSource(Input<VariableDataSource> dataSource) {
            this.dataSource = Objects.requireNonNull(dataSource);
            return this;
        }

        public Builder setDataSource(VariableDataSource dataSource) {
            this.dataSource = Input.of(Objects.requireNonNull(dataSource));
            return this;
        }

        public Builder setDataType(Input<VariableDataType> dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }

        public Builder setDataType(VariableDataType dataType) {
            this.dataType = Input.of(Objects.requireNonNull(dataType));
            return this;
        }

        public Builder setDefaultValue(Input<String> defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }

        public Builder setDefaultValue(String defaultValue) {
            this.defaultValue = Input.of(Objects.requireNonNull(defaultValue));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTags(@Nullable Input<List<VariableTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<VariableTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVariableType(@Nullable Input<VariableType> variableType) {
            this.variableType = variableType;
            return this;
        }

        public Builder setVariableType(@Nullable VariableType variableType) {
            this.variableType = Input.ofNullable(variableType);
            return this;
        }
        public VariableArgs build() {
            return new VariableArgs(dataSource, dataType, defaultValue, description, name, tags, variableType);
        }
    }
}
