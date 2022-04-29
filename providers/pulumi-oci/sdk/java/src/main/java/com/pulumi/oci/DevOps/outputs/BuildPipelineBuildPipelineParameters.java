// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.BuildPipelineBuildPipelineParametersItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BuildPipelineBuildPipelineParameters {
    /**
     * @return (Updatable) List of parameters defined for a build pipeline.
     * 
     */
    private final List<BuildPipelineBuildPipelineParametersItem> items;

    @CustomType.Constructor
    private BuildPipelineBuildPipelineParameters(@CustomType.Parameter("items") List<BuildPipelineBuildPipelineParametersItem> items) {
        this.items = items;
    }

    /**
     * @return (Updatable) List of parameters defined for a build pipeline.
     * 
     */
    public List<BuildPipelineBuildPipelineParametersItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildPipelineBuildPipelineParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BuildPipelineBuildPipelineParametersItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildPipelineBuildPipelineParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<BuildPipelineBuildPipelineParametersItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(BuildPipelineBuildPipelineParametersItem... items) {
            return items(List.of(items));
        }        public BuildPipelineBuildPipelineParameters build() {
            return new BuildPipelineBuildPipelineParameters(items);
        }
    }
}
