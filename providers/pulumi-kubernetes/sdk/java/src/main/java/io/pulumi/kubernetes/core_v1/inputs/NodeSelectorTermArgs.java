// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.NodeSelectorRequirementArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeSelectorTermArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeSelectorTermArgs Empty = new NodeSelectorTermArgs();

    @InputImport(name="matchExpressions")
    private final @Nullable Input<List<NodeSelectorRequirementArgs>> matchExpressions;

    public Input<List<NodeSelectorRequirementArgs>> getMatchExpressions() {
        return this.matchExpressions == null ? Input.empty() : this.matchExpressions;
    }

    @InputImport(name="matchFields")
    private final @Nullable Input<List<NodeSelectorRequirementArgs>> matchFields;

    public Input<List<NodeSelectorRequirementArgs>> getMatchFields() {
        return this.matchFields == null ? Input.empty() : this.matchFields;
    }

    public NodeSelectorTermArgs(
        @Nullable Input<List<NodeSelectorRequirementArgs>> matchExpressions,
        @Nullable Input<List<NodeSelectorRequirementArgs>> matchFields) {
        this.matchExpressions = matchExpressions;
        this.matchFields = matchFields;
    }

    private NodeSelectorTermArgs() {
        this.matchExpressions = Input.empty();
        this.matchFields = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSelectorTermArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<NodeSelectorRequirementArgs>> matchExpressions;
        private @Nullable Input<List<NodeSelectorRequirementArgs>> matchFields;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeSelectorTermArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchExpressions = defaults.matchExpressions;
    	      this.matchFields = defaults.matchFields;
        }

        public Builder setMatchExpressions(@Nullable Input<List<NodeSelectorRequirementArgs>> matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }

        public Builder setMatchExpressions(@Nullable List<NodeSelectorRequirementArgs> matchExpressions) {
            this.matchExpressions = Input.ofNullable(matchExpressions);
            return this;
        }

        public Builder setMatchFields(@Nullable Input<List<NodeSelectorRequirementArgs>> matchFields) {
            this.matchFields = matchFields;
            return this;
        }

        public Builder setMatchFields(@Nullable List<NodeSelectorRequirementArgs> matchFields) {
            this.matchFields = Input.ofNullable(matchFields);
            return this;
        }

        public NodeSelectorTermArgs build() {
            return new NodeSelectorTermArgs(matchExpressions, matchFields);
        }
    }
}
