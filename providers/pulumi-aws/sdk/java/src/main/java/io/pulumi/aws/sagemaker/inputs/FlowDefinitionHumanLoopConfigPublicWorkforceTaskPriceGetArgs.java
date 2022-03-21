// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs Empty = new FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs();

    /**
     * Defines the amount of money paid to an Amazon Mechanical Turk worker in United States dollars. See Amount In Usd details below.
     * 
     */
    @Import(name="amountInUsd")
      private final @Nullable Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs> amountInUsd;

    public Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs> getAmountInUsd() {
        return this.amountInUsd == null ? Output.empty() : this.amountInUsd;
    }

    public FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs(@Nullable Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs> amountInUsd) {
        this.amountInUsd = amountInUsd;
    }

    private FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs() {
        this.amountInUsd = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs> amountInUsd;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amountInUsd = defaults.amountInUsd;
        }

        public Builder amountInUsd(@Nullable Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs> amountInUsd) {
            this.amountInUsd = amountInUsd;
            return this;
        }
        public Builder amountInUsd(@Nullable FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs amountInUsd) {
            this.amountInUsd = Output.ofNullable(amountInUsd);
            return this;
        }        public FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs build() {
            return new FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs(amountInUsd);
        }
    }
}
