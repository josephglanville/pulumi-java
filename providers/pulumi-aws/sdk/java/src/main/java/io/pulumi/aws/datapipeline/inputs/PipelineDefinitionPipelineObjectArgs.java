// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.inputs;

import io.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectFieldArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineDefinitionPipelineObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineDefinitionPipelineObjectArgs Empty = new PipelineDefinitionPipelineObjectArgs();

    /**
     * Configuration block for Key-value pairs that define the properties of the object. See below
     * 
     */
    @InputImport(name="fields")
      private final @Nullable Output<List<PipelineDefinitionPipelineObjectFieldArgs>> fields;

    public Output<List<PipelineDefinitionPipelineObjectFieldArgs>> getFields() {
        return this.fields == null ? Output.empty() : this.fields;
    }

    /**
     * ID of the parameter value.
     * 
     */
    @InputImport(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * ARN of the storage connector.
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public PipelineDefinitionPipelineObjectArgs(
        @Nullable Output<List<PipelineDefinitionPipelineObjectFieldArgs>> fields,
        Output<String> id,
        Output<String> name) {
        this.fields = fields;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PipelineDefinitionPipelineObjectArgs() {
        this.fields = Output.empty();
        this.id = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDefinitionPipelineObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<PipelineDefinitionPipelineObjectFieldArgs>> fields;
        private Output<String> id;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDefinitionPipelineObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder fields(@Nullable Output<List<PipelineDefinitionPipelineObjectFieldArgs>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder fields(@Nullable List<PipelineDefinitionPipelineObjectFieldArgs> fields) {
            this.fields = Output.ofNullable(fields);
            return this;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
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
        public PipelineDefinitionPipelineObjectArgs build() {
            return new PipelineDefinitionPipelineObjectArgs(fields, id, name);
        }
    }
}
