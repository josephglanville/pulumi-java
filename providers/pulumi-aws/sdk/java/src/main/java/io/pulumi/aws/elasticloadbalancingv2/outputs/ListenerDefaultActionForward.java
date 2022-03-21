// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.outputs;

import io.pulumi.aws.elasticloadbalancingv2.outputs.ListenerDefaultActionForwardStickiness;
import io.pulumi.aws.elasticloadbalancingv2.outputs.ListenerDefaultActionForwardTargetGroup;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerDefaultActionForward {
    /**
     * Configuration block for target group stickiness for the rule. Detailed below.
     * 
     */
    private final @Nullable ListenerDefaultActionForwardStickiness stickiness;
    /**
     * Set of 1-5 target group blocks. Detailed below.
     * 
     */
    private final List<ListenerDefaultActionForwardTargetGroup> targetGroups;

    @CustomType.Constructor
    private ListenerDefaultActionForward(
        @CustomType.Parameter("stickiness") @Nullable ListenerDefaultActionForwardStickiness stickiness,
        @CustomType.Parameter("targetGroups") List<ListenerDefaultActionForwardTargetGroup> targetGroups) {
        this.stickiness = stickiness;
        this.targetGroups = targetGroups;
    }

    /**
     * Configuration block for target group stickiness for the rule. Detailed below.
     * 
    */
    public Optional<ListenerDefaultActionForwardStickiness> getStickiness() {
        return Optional.ofNullable(this.stickiness);
    }
    /**
     * Set of 1-5 target group blocks. Detailed below.
     * 
    */
    public List<ListenerDefaultActionForwardTargetGroup> getTargetGroups() {
        return this.targetGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionForward defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ListenerDefaultActionForwardStickiness stickiness;
        private List<ListenerDefaultActionForwardTargetGroup> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionForward defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stickiness = defaults.stickiness;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder stickiness(@Nullable ListenerDefaultActionForwardStickiness stickiness) {
            this.stickiness = stickiness;
            return this;
        }
        public Builder targetGroups(List<ListenerDefaultActionForwardTargetGroup> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }
        public Builder targetGroups(ListenerDefaultActionForwardTargetGroup... targetGroups) {
            return targetGroups(List.of(targetGroups));
        }        public ListenerDefaultActionForward build() {
            return new ListenerDefaultActionForward(stickiness, targetGroups);
        }
    }
}
