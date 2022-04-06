// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.aws.applicationloadbalancing.inputs.ListenerDefaultActionForwardStickinessArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerDefaultActionForwardTargetGroupArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerDefaultActionForwardArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionForwardArgs Empty = new ListenerDefaultActionForwardArgs();

    /**
     * Configuration block for target group stickiness for the rule. Detailed below.
     * 
     */
    @Import(name="stickiness")
      private final @Nullable Output<ListenerDefaultActionForwardStickinessArgs> stickiness;

    public Output<ListenerDefaultActionForwardStickinessArgs> getStickiness() {
        return this.stickiness == null ? Output.empty() : this.stickiness;
    }

    /**
     * Set of 1-5 target group blocks. Detailed below.
     * 
     */
    @Import(name="targetGroups", required=true)
      private final Output<List<ListenerDefaultActionForwardTargetGroupArgs>> targetGroups;

    public Output<List<ListenerDefaultActionForwardTargetGroupArgs>> getTargetGroups() {
        return this.targetGroups;
    }

    public ListenerDefaultActionForwardArgs(
        @Nullable Output<ListenerDefaultActionForwardStickinessArgs> stickiness,
        Output<List<ListenerDefaultActionForwardTargetGroupArgs>> targetGroups) {
        this.stickiness = stickiness;
        this.targetGroups = Objects.requireNonNull(targetGroups, "expected parameter 'targetGroups' to be non-null");
    }

    private ListenerDefaultActionForwardArgs() {
        this.stickiness = Output.empty();
        this.targetGroups = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionForwardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ListenerDefaultActionForwardStickinessArgs> stickiness;
        private Output<List<ListenerDefaultActionForwardTargetGroupArgs>> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionForwardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stickiness = defaults.stickiness;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder stickiness(@Nullable Output<ListenerDefaultActionForwardStickinessArgs> stickiness) {
            this.stickiness = stickiness;
            return this;
        }
        public Builder stickiness(@Nullable ListenerDefaultActionForwardStickinessArgs stickiness) {
            this.stickiness = Output.ofNullable(stickiness);
            return this;
        }
        public Builder targetGroups(Output<List<ListenerDefaultActionForwardTargetGroupArgs>> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }
        public Builder targetGroups(List<ListenerDefaultActionForwardTargetGroupArgs> targetGroups) {
            this.targetGroups = Output.of(Objects.requireNonNull(targetGroups));
            return this;
        }
        public Builder targetGroups(ListenerDefaultActionForwardTargetGroupArgs... targetGroups) {
            return targetGroups(List.of(targetGroups));
        }        public ListenerDefaultActionForwardArgs build() {
            return new ListenerDefaultActionForwardArgs(stickiness, targetGroups);
        }
    }
}