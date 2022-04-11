// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyShareDistributionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchedulingPolicyFairSharePolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulingPolicyFairSharePolicyGetArgs Empty = new SchedulingPolicyFairSharePolicyGetArgs();

    /**
     * A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
     * 
     */
    @Import(name="computeReservation")
      private final @Nullable Output<Integer> computeReservation;

    public Output<Integer> getComputeReservation() {
        return this.computeReservation == null ? Codegen.empty() : this.computeReservation;
    }

    @Import(name="shareDecaySeconds")
      private final @Nullable Output<Integer> shareDecaySeconds;

    public Output<Integer> getShareDecaySeconds() {
        return this.shareDecaySeconds == null ? Codegen.empty() : this.shareDecaySeconds;
    }

    /**
     * One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
     * 
     */
    @Import(name="shareDistributions")
      private final @Nullable Output<List<SchedulingPolicyFairSharePolicyShareDistributionGetArgs>> shareDistributions;

    public Output<List<SchedulingPolicyFairSharePolicyShareDistributionGetArgs>> getShareDistributions() {
        return this.shareDistributions == null ? Codegen.empty() : this.shareDistributions;
    }

    public SchedulingPolicyFairSharePolicyGetArgs(
        @Nullable Output<Integer> computeReservation,
        @Nullable Output<Integer> shareDecaySeconds,
        @Nullable Output<List<SchedulingPolicyFairSharePolicyShareDistributionGetArgs>> shareDistributions) {
        this.computeReservation = computeReservation;
        this.shareDecaySeconds = shareDecaySeconds;
        this.shareDistributions = shareDistributions;
    }

    private SchedulingPolicyFairSharePolicyGetArgs() {
        this.computeReservation = Codegen.empty();
        this.shareDecaySeconds = Codegen.empty();
        this.shareDistributions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingPolicyFairSharePolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> computeReservation;
        private @Nullable Output<Integer> shareDecaySeconds;
        private @Nullable Output<List<SchedulingPolicyFairSharePolicyShareDistributionGetArgs>> shareDistributions;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingPolicyFairSharePolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeReservation = defaults.computeReservation;
    	      this.shareDecaySeconds = defaults.shareDecaySeconds;
    	      this.shareDistributions = defaults.shareDistributions;
        }

        public Builder computeReservation(@Nullable Output<Integer> computeReservation) {
            this.computeReservation = computeReservation;
            return this;
        }
        public Builder computeReservation(@Nullable Integer computeReservation) {
            this.computeReservation = Codegen.ofNullable(computeReservation);
            return this;
        }
        public Builder shareDecaySeconds(@Nullable Output<Integer> shareDecaySeconds) {
            this.shareDecaySeconds = shareDecaySeconds;
            return this;
        }
        public Builder shareDecaySeconds(@Nullable Integer shareDecaySeconds) {
            this.shareDecaySeconds = Codegen.ofNullable(shareDecaySeconds);
            return this;
        }
        public Builder shareDistributions(@Nullable Output<List<SchedulingPolicyFairSharePolicyShareDistributionGetArgs>> shareDistributions) {
            this.shareDistributions = shareDistributions;
            return this;
        }
        public Builder shareDistributions(@Nullable List<SchedulingPolicyFairSharePolicyShareDistributionGetArgs> shareDistributions) {
            this.shareDistributions = Codegen.ofNullable(shareDistributions);
            return this;
        }
        public Builder shareDistributions(SchedulingPolicyFairSharePolicyShareDistributionGetArgs... shareDistributions) {
            return shareDistributions(List.of(shareDistributions));
        }        public SchedulingPolicyFairSharePolicyGetArgs build() {
            return new SchedulingPolicyFairSharePolicyGetArgs(computeReservation, shareDecaySeconds, shareDistributions);
        }
    }
}
