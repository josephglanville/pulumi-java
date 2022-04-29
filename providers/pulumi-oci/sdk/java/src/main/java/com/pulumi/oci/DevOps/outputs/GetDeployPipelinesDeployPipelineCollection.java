// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.GetDeployPipelinesDeployPipelineCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeployPipelinesDeployPipelineCollection {
    /**
     * @return List of parameters defined for a deployment pipeline.
     * 
     */
    private final List<GetDeployPipelinesDeployPipelineCollectionItem> items;

    @CustomType.Constructor
    private GetDeployPipelinesDeployPipelineCollection(@CustomType.Parameter("items") List<GetDeployPipelinesDeployPipelineCollectionItem> items) {
        this.items = items;
    }

    /**
     * @return List of parameters defined for a deployment pipeline.
     * 
     */
    public List<GetDeployPipelinesDeployPipelineCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeployPipelinesDeployPipelineCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDeployPipelinesDeployPipelineCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeployPipelinesDeployPipelineCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetDeployPipelinesDeployPipelineCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetDeployPipelinesDeployPipelineCollectionItem... items) {
            return items(List.of(items));
        }        public GetDeployPipelinesDeployPipelineCollection build() {
            return new GetDeployPipelinesDeployPipelineCollection(items);
        }
    }
}
