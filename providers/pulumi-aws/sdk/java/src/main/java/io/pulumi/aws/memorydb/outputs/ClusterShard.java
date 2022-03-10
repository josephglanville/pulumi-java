// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb.outputs;

import io.pulumi.aws.memorydb.outputs.ClusterShardNode;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterShard {
    /**
     * Name of this node.
     * * `endpoint`
     * 
     */
    private final @Nullable String name;
    /**
     * Set of nodes in this shard.
     * 
     */
    private final @Nullable List<ClusterShardNode> nodes;
    /**
     * Number of individual nodes in this shard.
     * 
     */
    private final @Nullable Integer numNodes;
    /**
     * Keyspace for this shard. Example: `0-16383`.
     * 
     */
    private final @Nullable String slots;

    @OutputCustomType.Constructor
    private ClusterShard(
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("nodes") @Nullable List<ClusterShardNode> nodes,
        @OutputCustomType.Parameter("numNodes") @Nullable Integer numNodes,
        @OutputCustomType.Parameter("slots") @Nullable String slots) {
        this.name = name;
        this.nodes = nodes;
        this.numNodes = numNodes;
        this.slots = slots;
    }

    /**
     * Name of this node.
     * * `endpoint`
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Set of nodes in this shard.
     * 
    */
    public List<ClusterShardNode> getNodes() {
        return this.nodes == null ? List.of() : this.nodes;
    }
    /**
     * Number of individual nodes in this shard.
     * 
    */
    public Optional<Integer> getNumNodes() {
        return Optional.ofNullable(this.numNodes);
    }
    /**
     * Keyspace for this shard. Example: `0-16383`.
     * 
    */
    public Optional<String> getSlots() {
        return Optional.ofNullable(this.slots);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterShard defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable List<ClusterShardNode> nodes;
        private @Nullable Integer numNodes;
        private @Nullable String slots;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterShard defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nodes = defaults.nodes;
    	      this.numNodes = defaults.numNodes;
    	      this.slots = defaults.slots;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNodes(@Nullable List<ClusterShardNode> nodes) {
            this.nodes = nodes;
            return this;
        }

        public Builder setNumNodes(@Nullable Integer numNodes) {
            this.numNodes = numNodes;
            return this;
        }

        public Builder setSlots(@Nullable String slots) {
            this.slots = slots;
            return this;
        }
        public ClusterShard build() {
            return new ClusterShard(name, nodes, numNodes, slots);
        }
    }
}
