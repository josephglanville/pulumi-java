// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codepipeline.inputs;

import io.pulumi.aws.codepipeline.inputs.PipelineStageActionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PipelineStageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineStageGetArgs Empty = new PipelineStageGetArgs();

    /**
     * The action(s) to include in the stage. Defined as an `action` block below
     * 
     */
    @Import(name="actions", required=true)
      private final Output<List<PipelineStageActionGetArgs>> actions;

    public Output<List<PipelineStageActionGetArgs>> getActions() {
        return this.actions;
    }

    /**
     * The name of the stage.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public PipelineStageGetArgs(
        Output<List<PipelineStageActionGetArgs>> actions,
        Output<String> name) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PipelineStageGetArgs() {
        this.actions = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineStageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<PipelineStageActionGetArgs>> actions;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineStageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.name = defaults.name;
        }

        public Builder actions(Output<List<PipelineStageActionGetArgs>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(List<PipelineStageActionGetArgs> actions) {
            this.actions = Output.of(Objects.requireNonNull(actions));
            return this;
        }
        public Builder actions(PipelineStageActionGetArgs... actions) {
            return actions(List.of(actions));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public PipelineStageGetArgs build() {
            return new PipelineStageGetArgs(actions, name);
        }
    }
}