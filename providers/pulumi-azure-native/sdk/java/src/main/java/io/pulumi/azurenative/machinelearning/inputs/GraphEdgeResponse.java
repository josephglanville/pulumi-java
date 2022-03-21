// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines an edge within the web service's graph.
 * 
 */
public final class GraphEdgeResponse extends io.pulumi.resources.InvokeArgs {

    public static final GraphEdgeResponse Empty = new GraphEdgeResponse();

    /**
     * The source graph node's identifier.
     * 
     */
    @Import(name="sourceNodeId")
      private final @Nullable String sourceNodeId;

    public Optional<String> getSourceNodeId() {
        return this.sourceNodeId == null ? Optional.empty() : Optional.ofNullable(this.sourceNodeId);
    }

    /**
     * The identifier of the source node's port that the edge connects from.
     * 
     */
    @Import(name="sourcePortId")
      private final @Nullable String sourcePortId;

    public Optional<String> getSourcePortId() {
        return this.sourcePortId == null ? Optional.empty() : Optional.ofNullable(this.sourcePortId);
    }

    /**
     * The destination graph node's identifier.
     * 
     */
    @Import(name="targetNodeId")
      private final @Nullable String targetNodeId;

    public Optional<String> getTargetNodeId() {
        return this.targetNodeId == null ? Optional.empty() : Optional.ofNullable(this.targetNodeId);
    }

    /**
     * The identifier of the destination node's port that the edge connects into.
     * 
     */
    @Import(name="targetPortId")
      private final @Nullable String targetPortId;

    public Optional<String> getTargetPortId() {
        return this.targetPortId == null ? Optional.empty() : Optional.ofNullable(this.targetPortId);
    }

    public GraphEdgeResponse(
        @Nullable String sourceNodeId,
        @Nullable String sourcePortId,
        @Nullable String targetNodeId,
        @Nullable String targetPortId) {
        this.sourceNodeId = sourceNodeId;
        this.sourcePortId = sourcePortId;
        this.targetNodeId = targetNodeId;
        this.targetPortId = targetPortId;
    }

    private GraphEdgeResponse() {
        this.sourceNodeId = null;
        this.sourcePortId = null;
        this.targetNodeId = null;
        this.targetPortId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphEdgeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sourceNodeId;
        private @Nullable String sourcePortId;
        private @Nullable String targetNodeId;
        private @Nullable String targetPortId;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphEdgeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceNodeId = defaults.sourceNodeId;
    	      this.sourcePortId = defaults.sourcePortId;
    	      this.targetNodeId = defaults.targetNodeId;
    	      this.targetPortId = defaults.targetPortId;
        }

        public Builder sourceNodeId(@Nullable String sourceNodeId) {
            this.sourceNodeId = sourceNodeId;
            return this;
        }
        public Builder sourcePortId(@Nullable String sourcePortId) {
            this.sourcePortId = sourcePortId;
            return this;
        }
        public Builder targetNodeId(@Nullable String targetNodeId) {
            this.targetNodeId = targetNodeId;
            return this;
        }
        public Builder targetPortId(@Nullable String targetPortId) {
            this.targetPortId = targetPortId;
            return this;
        }        public GraphEdgeResponse build() {
            return new GraphEdgeResponse(sourceNodeId, sourcePortId, targetNodeId, targetPortId);
        }
    }
}
