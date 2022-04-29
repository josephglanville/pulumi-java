// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBuildPipelineStagesBuildPipelineStageCollectionItemBuildPipelineStagePredecessorCollectionItem {
    /**
     * @return Unique identifier or OCID for listing a single resource by ID.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetBuildPipelineStagesBuildPipelineStageCollectionItemBuildPipelineStagePredecessorCollectionItem(@CustomType.Parameter("id") String id) {
        this.id = id;
    }

    /**
     * @return Unique identifier or OCID for listing a single resource by ID.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBuildPipelineStagesBuildPipelineStageCollectionItemBuildPipelineStagePredecessorCollectionItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBuildPipelineStagesBuildPipelineStageCollectionItemBuildPipelineStagePredecessorCollectionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetBuildPipelineStagesBuildPipelineStageCollectionItemBuildPipelineStagePredecessorCollectionItem build() {
            return new GetBuildPipelineStagesBuildPipelineStageCollectionItemBuildPipelineStagePredecessorCollectionItem(id);
        }
    }
}
