// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.inputs.GraphEdgeArgs;
import io.pulumi.azurenative.machinelearning.inputs.GraphNodeArgs;
import io.pulumi.azurenative.machinelearning.inputs.GraphParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the graph of modules making up the machine learning solution.
 * 
 */
public final class GraphPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphPackageArgs Empty = new GraphPackageArgs();

    /**
     * The list of edges making up the graph.
     * 
     */
    @Import(name="edges")
      private final @Nullable Output<List<GraphEdgeArgs>> edges;

    public Output<List<GraphEdgeArgs>> getEdges() {
        return this.edges == null ? Codegen.empty() : this.edges;
    }

    /**
     * The collection of global parameters for the graph, given as a global parameter name to GraphParameter map. Each parameter here has a 1:1 match with the global parameters values map declared at the WebServiceProperties level.
     * 
     */
    @Import(name="graphParameters")
      private final @Nullable Output<Map<String,GraphParameterArgs>> graphParameters;

    public Output<Map<String,GraphParameterArgs>> getGraphParameters() {
        return this.graphParameters == null ? Codegen.empty() : this.graphParameters;
    }

    /**
     * The set of nodes making up the graph, provided as a nodeId to GraphNode map
     * 
     */
    @Import(name="nodes")
      private final @Nullable Output<Map<String,GraphNodeArgs>> nodes;

    public Output<Map<String,GraphNodeArgs>> getNodes() {
        return this.nodes == null ? Codegen.empty() : this.nodes;
    }

    public GraphPackageArgs(
        @Nullable Output<List<GraphEdgeArgs>> edges,
        @Nullable Output<Map<String,GraphParameterArgs>> graphParameters,
        @Nullable Output<Map<String,GraphNodeArgs>> nodes) {
        this.edges = edges;
        this.graphParameters = graphParameters;
        this.nodes = nodes;
    }

    private GraphPackageArgs() {
        this.edges = Codegen.empty();
        this.graphParameters = Codegen.empty();
        this.nodes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GraphEdgeArgs>> edges;
        private @Nullable Output<Map<String,GraphParameterArgs>> graphParameters;
        private @Nullable Output<Map<String,GraphNodeArgs>> nodes;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edges = defaults.edges;
    	      this.graphParameters = defaults.graphParameters;
    	      this.nodes = defaults.nodes;
        }

        public Builder edges(@Nullable Output<List<GraphEdgeArgs>> edges) {
            this.edges = edges;
            return this;
        }
        public Builder edges(@Nullable List<GraphEdgeArgs> edges) {
            this.edges = Codegen.ofNullable(edges);
            return this;
        }
        public Builder edges(GraphEdgeArgs... edges) {
            return edges(List.of(edges));
        }
        public Builder graphParameters(@Nullable Output<Map<String,GraphParameterArgs>> graphParameters) {
            this.graphParameters = graphParameters;
            return this;
        }
        public Builder graphParameters(@Nullable Map<String,GraphParameterArgs> graphParameters) {
            this.graphParameters = Codegen.ofNullable(graphParameters);
            return this;
        }
        public Builder nodes(@Nullable Output<Map<String,GraphNodeArgs>> nodes) {
            this.nodes = nodes;
            return this;
        }
        public Builder nodes(@Nullable Map<String,GraphNodeArgs> nodes) {
            this.nodes = Codegen.ofNullable(nodes);
            return this;
        }        public GraphPackageArgs build() {
            return new GraphPackageArgs(edges, graphParameters, nodes);
        }
    }
}
