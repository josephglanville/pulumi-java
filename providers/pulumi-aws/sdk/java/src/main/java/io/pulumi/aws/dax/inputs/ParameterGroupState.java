// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dax.inputs;

import io.pulumi.aws.dax.inputs.ParameterGroupParameterGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ParameterGroupState extends io.pulumi.resources.ResourceArgs {

    public static final ParameterGroupState Empty = new ParameterGroupState();

    /**
     * A description of the parameter group.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the parameter group.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The parameters of the parameter group.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Output<List<ParameterGroupParameterGetArgs>> parameters;

    public Output<List<ParameterGroupParameterGetArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    public ParameterGroupState(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<List<ParameterGroupParameterGetArgs>> parameters) {
        this.description = description;
        this.name = name;
        this.parameters = parameters;
    }

    private ParameterGroupState() {
        this.description = Output.empty();
        this.name = Output.empty();
        this.parameters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<List<ParameterGroupParameterGetArgs>> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
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

        public Builder parameters(@Nullable Output<List<ParameterGroupParameterGetArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable List<ParameterGroupParameterGetArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public ParameterGroupState build() {
            return new ParameterGroupState(description, name, parameters);
        }
    }
}
