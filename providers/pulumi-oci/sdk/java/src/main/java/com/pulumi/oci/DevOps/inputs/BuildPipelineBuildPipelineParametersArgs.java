// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DevOps.inputs.BuildPipelineBuildPipelineParametersItemArgs;
import java.util.List;
import java.util.Objects;


public final class BuildPipelineBuildPipelineParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final BuildPipelineBuildPipelineParametersArgs Empty = new BuildPipelineBuildPipelineParametersArgs();

    /**
     * (Updatable) List of parameters defined for a build pipeline.
     * 
     */
    @Import(name="items", required=true)
    private Output<List<BuildPipelineBuildPipelineParametersItemArgs>> items;

    /**
     * @return (Updatable) List of parameters defined for a build pipeline.
     * 
     */
    public Output<List<BuildPipelineBuildPipelineParametersItemArgs>> items() {
        return this.items;
    }

    private BuildPipelineBuildPipelineParametersArgs() {}

    private BuildPipelineBuildPipelineParametersArgs(BuildPipelineBuildPipelineParametersArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildPipelineBuildPipelineParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildPipelineBuildPipelineParametersArgs $;

        public Builder() {
            $ = new BuildPipelineBuildPipelineParametersArgs();
        }

        public Builder(BuildPipelineBuildPipelineParametersArgs defaults) {
            $ = new BuildPipelineBuildPipelineParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param items (Updatable) List of parameters defined for a build pipeline.
         * 
         * @return builder
         * 
         */
        public Builder items(Output<List<BuildPipelineBuildPipelineParametersItemArgs>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items (Updatable) List of parameters defined for a build pipeline.
         * 
         * @return builder
         * 
         */
        public Builder items(List<BuildPipelineBuildPipelineParametersItemArgs> items) {
            return items(Output.of(items));
        }

        /**
         * @param items (Updatable) List of parameters defined for a build pipeline.
         * 
         * @return builder
         * 
         */
        public Builder items(BuildPipelineBuildPipelineParametersItemArgs... items) {
            return items(List.of(items));
        }

        public BuildPipelineBuildPipelineParametersArgs build() {
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            return $;
        }
    }

}
