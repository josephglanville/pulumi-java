// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelectorRequirement;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class LabelSelector {
    private final @Nullable List<LabelSelectorRequirement> matchExpressions;
    private final @Nullable Map<String,String> matchLabels;

    @OutputCustomType.Constructor({"matchExpressions","matchLabels"})
    private LabelSelector(
        @Nullable List<LabelSelectorRequirement> matchExpressions,
        @Nullable Map<String,String> matchLabels) {
        this.matchExpressions = matchExpressions;
        this.matchLabels = matchLabels;
    }

    public List<LabelSelectorRequirement> getMatchExpressions() {
        return this.matchExpressions == null ? List.of() : this.matchExpressions;
    }
    public Map<String,String> getMatchLabels() {
        return this.matchLabels == null ? Map.of() : this.matchLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LabelSelectorRequirement> matchExpressions;
        private @Nullable Map<String,String> matchLabels;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchExpressions = defaults.matchExpressions;
    	      this.matchLabels = defaults.matchLabels;
        }

        public Builder setMatchExpressions(@Nullable List<LabelSelectorRequirement> matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }

        public Builder setMatchLabels(@Nullable Map<String,String> matchLabels) {
            this.matchLabels = matchLabels;
            return this;
        }

        public LabelSelector build() {
            return new LabelSelector(matchExpressions, matchLabels);
        }
    }
}
