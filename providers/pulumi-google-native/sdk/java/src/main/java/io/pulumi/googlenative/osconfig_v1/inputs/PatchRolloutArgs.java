// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1.enums.PatchRolloutMode;
import io.pulumi.googlenative.osconfig_v1.inputs.FixedOrPercentArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Patch rollout configuration specifications. Contains details on the concurrency control when applying patch(es) to all targeted VMs.
 * 
 */
public final class PatchRolloutArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchRolloutArgs Empty = new PatchRolloutArgs();

    /**
     * The maximum number (or percentage) of VMs per zone to disrupt at any given moment. The number of VMs calculated from multiplying the percentage by the total number of VMs in a zone is rounded up. During patching, a VM is considered disrupted from the time the agent is notified to begin until patching has completed. This disruption time includes the time to complete reboot and any post-patch steps. A VM contributes to the disruption budget if its patching operation fails either when applying the patches, running pre or post patch steps, or if it fails to respond with a success notification before timing out. VMs that are not running or do not have an active agent do not count toward this disruption budget. For zone-by-zone rollouts, if the disruption budget in a zone is exceeded, the patch job stops, because continuing to the next zone requires completion of the patch process in the previous zone. For example, if the disruption budget has a fixed value of `10`, and 8 VMs fail to patch in the current zone, the patch job continues to patch 2 VMs at a time until the zone is completed. When that zone is completed successfully, patching begins with 10 VMs at a time in the next zone. If 10 VMs in the next zone fail to patch, the patch job stops.
     * 
     */
    @Import(name="disruptionBudget")
      private final @Nullable Output<FixedOrPercentArgs> disruptionBudget;

    public Output<FixedOrPercentArgs> getDisruptionBudget() {
        return this.disruptionBudget == null ? Output.empty() : this.disruptionBudget;
    }

    /**
     * Mode of the patch rollout.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<PatchRolloutMode> mode;

    public Output<PatchRolloutMode> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    public PatchRolloutArgs(
        @Nullable Output<FixedOrPercentArgs> disruptionBudget,
        @Nullable Output<PatchRolloutMode> mode) {
        this.disruptionBudget = disruptionBudget;
        this.mode = mode;
    }

    private PatchRolloutArgs() {
        this.disruptionBudget = Output.empty();
        this.mode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FixedOrPercentArgs> disruptionBudget;
        private @Nullable Output<PatchRolloutMode> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchRolloutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disruptionBudget = defaults.disruptionBudget;
    	      this.mode = defaults.mode;
        }

        public Builder disruptionBudget(@Nullable Output<FixedOrPercentArgs> disruptionBudget) {
            this.disruptionBudget = disruptionBudget;
            return this;
        }
        public Builder disruptionBudget(@Nullable FixedOrPercentArgs disruptionBudget) {
            this.disruptionBudget = Output.ofNullable(disruptionBudget);
            return this;
        }
        public Builder mode(@Nullable Output<PatchRolloutMode> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable PatchRolloutMode mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }        public PatchRolloutArgs build() {
            return new PatchRolloutArgs(disruptionBudget, mode);
        }
    }
}
