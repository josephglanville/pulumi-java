// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.aws.applicationloadbalancing.inputs.ListenerDefaultActionForwardStickinessGetArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerDefaultActionForwardTargetGroupGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerDefaultActionForwardGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionForwardGetArgs Empty = new ListenerDefaultActionForwardGetArgs();

    /**
     * Configuration block for target group stickiness for the rule. Detailed below.
     * 
     */
    @Import(name="stickiness")
      private final @Nullable Output<ListenerDefaultActionForwardStickinessGetArgs> stickiness;

    public Output<ListenerDefaultActionForwardStickinessGetArgs> getStickiness() {
        return this.stickiness == null ? Output.empty() : this.stickiness;
    }

    /**
     * Set of 1-5 target group blocks. Detailed below.
     * 
     */
    @Import(name="targetGroups", required=true)
      private final Output<List<ListenerDefaultActionForwardTargetGroupGetArgs>> targetGroups;

    public Output<List<ListenerDefaultActionForwardTargetGroupGetArgs>> getTargetGroups() {
        return this.targetGroups;
    }

    public ListenerDefaultActionForwardGetArgs(
        @Nullable Output<ListenerDefaultActionForwardStickinessGetArgs> stickiness,
        Output<List<ListenerDefaultActionForwardTargetGroupGetArgs>> targetGroups) {
        this.stickiness = stickiness;
        this.targetGroups = Objects.requireNonNull(targetGroups, "expected parameter 'targetGroups' to be non-null");
    }

    private ListenerDefaultActionForwardGetArgs() {
        this.stickiness = Output.empty();
        this.targetGroups = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionForwardGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ListenerDefaultActionForwardStickinessGetArgs> stickiness;
        private Output<List<ListenerDefaultActionForwardTargetGroupGetArgs>> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionForwardGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stickiness = defaults.stickiness;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder stickiness(@Nullable Output<ListenerDefaultActionForwardStickinessGetArgs> stickiness) {
            this.stickiness = stickiness;
            return this;
        }
        public Builder stickiness(@Nullable ListenerDefaultActionForwardStickinessGetArgs stickiness) {
            this.stickiness = Output.ofNullable(stickiness);
            return this;
        }
        public Builder targetGroups(Output<List<ListenerDefaultActionForwardTargetGroupGetArgs>> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }
        public Builder targetGroups(List<ListenerDefaultActionForwardTargetGroupGetArgs> targetGroups) {
            this.targetGroups = Output.of(Objects.requireNonNull(targetGroups));
            return this;
        }
        public Builder targetGroups(ListenerDefaultActionForwardTargetGroupGetArgs... targetGroups) {
            return targetGroups(List.of(targetGroups));
        }        public ListenerDefaultActionForwardGetArgs build() {
            return new ListenerDefaultActionForwardGetArgs(stickiness, targetGroups);
        }
    }
}
