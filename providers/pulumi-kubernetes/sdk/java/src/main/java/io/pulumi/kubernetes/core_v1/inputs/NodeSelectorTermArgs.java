// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.core_v1.inputs.NodeSelectorRequirementArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
 * 
 */
public final class NodeSelectorTermArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeSelectorTermArgs Empty = new NodeSelectorTermArgs();

    /**
     * A list of node selector requirements by node's labels.
     * 
     */
    @Import(name="matchExpressions")
      private final @Nullable Output<List<NodeSelectorRequirementArgs>> matchExpressions;

    public Output<List<NodeSelectorRequirementArgs>> getMatchExpressions() {
        return this.matchExpressions == null ? Output.empty() : this.matchExpressions;
    }

    /**
     * A list of node selector requirements by node's fields.
     * 
     */
    @Import(name="matchFields")
      private final @Nullable Output<List<NodeSelectorRequirementArgs>> matchFields;

    public Output<List<NodeSelectorRequirementArgs>> getMatchFields() {
        return this.matchFields == null ? Output.empty() : this.matchFields;
    }

    public NodeSelectorTermArgs(
        @Nullable Output<List<NodeSelectorRequirementArgs>> matchExpressions,
        @Nullable Output<List<NodeSelectorRequirementArgs>> matchFields) {
        this.matchExpressions = matchExpressions;
        this.matchFields = matchFields;
    }

    private NodeSelectorTermArgs() {
        this.matchExpressions = Output.empty();
        this.matchFields = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSelectorTermArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<NodeSelectorRequirementArgs>> matchExpressions;
        private @Nullable Output<List<NodeSelectorRequirementArgs>> matchFields;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeSelectorTermArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchExpressions = defaults.matchExpressions;
    	      this.matchFields = defaults.matchFields;
        }

        public Builder matchExpressions(@Nullable Output<List<NodeSelectorRequirementArgs>> matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }
        public Builder matchExpressions(@Nullable List<NodeSelectorRequirementArgs> matchExpressions) {
            this.matchExpressions = Output.ofNullable(matchExpressions);
            return this;
        }
        public Builder matchExpressions(NodeSelectorRequirementArgs... matchExpressions) {
            return matchExpressions(List.of(matchExpressions));
        }
        public Builder matchFields(@Nullable Output<List<NodeSelectorRequirementArgs>> matchFields) {
            this.matchFields = matchFields;
            return this;
        }
        public Builder matchFields(@Nullable List<NodeSelectorRequirementArgs> matchFields) {
            this.matchFields = Output.ofNullable(matchFields);
            return this;
        }
        public Builder matchFields(NodeSelectorRequirementArgs... matchFields) {
            return matchFields(List.of(matchFields));
        }        public NodeSelectorTermArgs build() {
            return new NodeSelectorTermArgs(matchExpressions, matchFields);
        }
    }
}
