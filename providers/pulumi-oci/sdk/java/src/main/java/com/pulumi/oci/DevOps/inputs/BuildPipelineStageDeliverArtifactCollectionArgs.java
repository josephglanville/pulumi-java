// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DevOps.inputs.BuildPipelineStageDeliverArtifactCollectionItemArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BuildPipelineStageDeliverArtifactCollectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BuildPipelineStageDeliverArtifactCollectionArgs Empty = new BuildPipelineStageDeliverArtifactCollectionArgs();

    /**
     * (Updatable) Collection of artifacts that were generated in the Build stage and need to be pushed to the artifactory stores. In case of UPDATE operation, replaces existing artifacts list. Merging with existing artifacts is not supported.
     * 
     */
    @Import(name="items")
    private @Nullable Output<List<BuildPipelineStageDeliverArtifactCollectionItemArgs>> items;

    /**
     * @return (Updatable) Collection of artifacts that were generated in the Build stage and need to be pushed to the artifactory stores. In case of UPDATE operation, replaces existing artifacts list. Merging with existing artifacts is not supported.
     * 
     */
    public Optional<Output<List<BuildPipelineStageDeliverArtifactCollectionItemArgs>>> items() {
        return Optional.ofNullable(this.items);
    }

    private BuildPipelineStageDeliverArtifactCollectionArgs() {}

    private BuildPipelineStageDeliverArtifactCollectionArgs(BuildPipelineStageDeliverArtifactCollectionArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildPipelineStageDeliverArtifactCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildPipelineStageDeliverArtifactCollectionArgs $;

        public Builder() {
            $ = new BuildPipelineStageDeliverArtifactCollectionArgs();
        }

        public Builder(BuildPipelineStageDeliverArtifactCollectionArgs defaults) {
            $ = new BuildPipelineStageDeliverArtifactCollectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param items (Updatable) Collection of artifacts that were generated in the Build stage and need to be pushed to the artifactory stores. In case of UPDATE operation, replaces existing artifacts list. Merging with existing artifacts is not supported.
         * 
         * @return builder
         * 
         */
        public Builder items(@Nullable Output<List<BuildPipelineStageDeliverArtifactCollectionItemArgs>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items (Updatable) Collection of artifacts that were generated in the Build stage and need to be pushed to the artifactory stores. In case of UPDATE operation, replaces existing artifacts list. Merging with existing artifacts is not supported.
         * 
         * @return builder
         * 
         */
        public Builder items(List<BuildPipelineStageDeliverArtifactCollectionItemArgs> items) {
            return items(Output.of(items));
        }

        /**
         * @param items (Updatable) Collection of artifacts that were generated in the Build stage and need to be pushed to the artifactory stores. In case of UPDATE operation, replaces existing artifacts list. Merging with existing artifacts is not supported.
         * 
         * @return builder
         * 
         */
        public Builder items(BuildPipelineStageDeliverArtifactCollectionItemArgs... items) {
            return items(List.of(items));
        }

        public BuildPipelineStageDeliverArtifactCollectionArgs build() {
            return $;
        }
    }

}
