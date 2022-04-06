// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex;

import io.pulumi.aws.lex.inputs.SlotTypeEnumerationValueArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SlotTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SlotTypeArgs Empty = new SlotTypeArgs();

    /**
     * Determines if a new slot type version is created when the initial resource is created and on each
     * update. Defaults to `false`.
     * 
     */
    @Import(name="createVersion")
      private final @Nullable Output<Boolean> createVersion;

    public Output<Boolean> getCreateVersion() {
        return this.createVersion == null ? Output.empty() : this.createVersion;
    }

    /**
     * A description of the slot type. Must be less than or equal to 200 characters in length.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A list of EnumerationValue objects that defines the values that
     * the slot type can take. Each value can have a list of synonyms, which are additional values that help
     * train the machine learning model about the values that it resolves for a slot. Attributes are
     * documented under enumeration_value.
     * 
     */
    @Import(name="enumerationValues", required=true)
      private final Output<List<SlotTypeEnumerationValueArgs>> enumerationValues;

    public Output<List<SlotTypeEnumerationValueArgs>> getEnumerationValues() {
        return this.enumerationValues;
    }

    /**
     * The name of the slot type. The name is not case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Determines the slot resolution strategy that Amazon Lex
     * uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
     * value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
     * if there is a resolution list for the slot, otherwise null is returned. Defaults to `ORIGINAL_VALUE`.
     * 
     */
    @Import(name="valueSelectionStrategy")
      private final @Nullable Output<String> valueSelectionStrategy;

    public Output<String> getValueSelectionStrategy() {
        return this.valueSelectionStrategy == null ? Output.empty() : this.valueSelectionStrategy;
    }

    public SlotTypeArgs(
        @Nullable Output<Boolean> createVersion,
        @Nullable Output<String> description,
        Output<List<SlotTypeEnumerationValueArgs>> enumerationValues,
        @Nullable Output<String> name,
        @Nullable Output<String> valueSelectionStrategy) {
        this.createVersion = createVersion;
        this.description = description;
        this.enumerationValues = Objects.requireNonNull(enumerationValues, "expected parameter 'enumerationValues' to be non-null");
        this.name = name;
        this.valueSelectionStrategy = valueSelectionStrategy;
    }

    private SlotTypeArgs() {
        this.createVersion = Output.empty();
        this.description = Output.empty();
        this.enumerationValues = Output.empty();
        this.name = Output.empty();
        this.valueSelectionStrategy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlotTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> createVersion;
        private @Nullable Output<String> description;
        private Output<List<SlotTypeEnumerationValueArgs>> enumerationValues;
        private @Nullable Output<String> name;
        private @Nullable Output<String> valueSelectionStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(SlotTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createVersion = defaults.createVersion;
    	      this.description = defaults.description;
    	      this.enumerationValues = defaults.enumerationValues;
    	      this.name = defaults.name;
    	      this.valueSelectionStrategy = defaults.valueSelectionStrategy;
        }

        public Builder createVersion(@Nullable Output<Boolean> createVersion) {
            this.createVersion = createVersion;
            return this;
        }
        public Builder createVersion(@Nullable Boolean createVersion) {
            this.createVersion = Output.ofNullable(createVersion);
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
        public Builder enumerationValues(Output<List<SlotTypeEnumerationValueArgs>> enumerationValues) {
            this.enumerationValues = Objects.requireNonNull(enumerationValues);
            return this;
        }
        public Builder enumerationValues(List<SlotTypeEnumerationValueArgs> enumerationValues) {
            this.enumerationValues = Output.of(Objects.requireNonNull(enumerationValues));
            return this;
        }
        public Builder enumerationValues(SlotTypeEnumerationValueArgs... enumerationValues) {
            return enumerationValues(List.of(enumerationValues));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder valueSelectionStrategy(@Nullable Output<String> valueSelectionStrategy) {
            this.valueSelectionStrategy = valueSelectionStrategy;
            return this;
        }
        public Builder valueSelectionStrategy(@Nullable String valueSelectionStrategy) {
            this.valueSelectionStrategy = Output.ofNullable(valueSelectionStrategy);
            return this;
        }        public SlotTypeArgs build() {
            return new SlotTypeArgs(createVersion, description, enumerationValues, name, valueSelectionStrategy);
        }
    }
}