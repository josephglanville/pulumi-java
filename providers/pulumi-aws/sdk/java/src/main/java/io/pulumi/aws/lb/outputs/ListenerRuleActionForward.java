// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lb.outputs;

import io.pulumi.aws.lb.outputs.ListenerRuleActionForwardStickiness;
import io.pulumi.aws.lb.outputs.ListenerRuleActionForwardTargetGroup;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerRuleActionForward {
    /**
     * The target group stickiness for the rule.
     * 
     */
    private final @Nullable ListenerRuleActionForwardStickiness stickiness;
    /**
     * One or more target groups block.
     * 
     */
    private final List<ListenerRuleActionForwardTargetGroup> targetGroups;

    @OutputCustomType.Constructor
    private ListenerRuleActionForward(
        @OutputCustomType.Parameter("stickiness") @Nullable ListenerRuleActionForwardStickiness stickiness,
        @OutputCustomType.Parameter("targetGroups") List<ListenerRuleActionForwardTargetGroup> targetGroups) {
        this.stickiness = stickiness;
        this.targetGroups = targetGroups;
    }

    /**
     * The target group stickiness for the rule.
     * 
    */
    public Optional<ListenerRuleActionForwardStickiness> getStickiness() {
        return Optional.ofNullable(this.stickiness);
    }
    /**
     * One or more target groups block.
     * 
    */
    public List<ListenerRuleActionForwardTargetGroup> getTargetGroups() {
        return this.targetGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionForward defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ListenerRuleActionForwardStickiness stickiness;
        private List<ListenerRuleActionForwardTargetGroup> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionForward defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stickiness = defaults.stickiness;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder setStickiness(@Nullable ListenerRuleActionForwardStickiness stickiness) {
            this.stickiness = stickiness;
            return this;
        }

        public Builder setTargetGroups(List<ListenerRuleActionForwardTargetGroup> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }
        public ListenerRuleActionForward build() {
            return new ListenerRuleActionForward(stickiness, targetGroups);
        }
    }
}
