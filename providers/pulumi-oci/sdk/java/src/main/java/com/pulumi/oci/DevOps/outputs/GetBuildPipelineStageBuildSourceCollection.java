// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.GetBuildPipelineStageBuildSourceCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBuildPipelineStageBuildSourceCollection {
    /**
     * @return Collection of artifacts that were generated in the Build stage and need to be pushed to the artifactory stores. In case of UPDATE operation, replaces existing artifacts list. Merging with existing artifacts is not supported.
     * 
     */
    private final List<GetBuildPipelineStageBuildSourceCollectionItem> items;

    @CustomType.Constructor
    private GetBuildPipelineStageBuildSourceCollection(@CustomType.Parameter("items") List<GetBuildPipelineStageBuildSourceCollectionItem> items) {
        this.items = items;
    }

    /**
     * @return Collection of artifacts that were generated in the Build stage and need to be pushed to the artifactory stores. In case of UPDATE operation, replaces existing artifacts list. Merging with existing artifacts is not supported.
     * 
     */
    public List<GetBuildPipelineStageBuildSourceCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBuildPipelineStageBuildSourceCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetBuildPipelineStageBuildSourceCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBuildPipelineStageBuildSourceCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetBuildPipelineStageBuildSourceCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetBuildPipelineStageBuildSourceCollectionItem... items) {
            return items(List.of(items));
        }        public GetBuildPipelineStageBuildSourceCollection build() {
            return new GetBuildPipelineStageBuildSourceCollection(items);
        }
    }
}
