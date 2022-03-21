// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.inputs;

import io.pulumi.aws.budgets.inputs.BudgetActionDefinitionIamActionDefinitionArgs;
import io.pulumi.aws.budgets.inputs.BudgetActionDefinitionScpActionDefinitionArgs;
import io.pulumi.aws.budgets.inputs.BudgetActionDefinitionSsmActionDefinitionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetActionDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetActionDefinitionArgs Empty = new BudgetActionDefinitionArgs();

    /**
     * The AWS Identity and Access Management (IAM) action definition details. See IAM Action Definition.
     * 
     */
    @Import(name="iamActionDefinition")
      private final @Nullable Output<BudgetActionDefinitionIamActionDefinitionArgs> iamActionDefinition;

    public Output<BudgetActionDefinitionIamActionDefinitionArgs> getIamActionDefinition() {
        return this.iamActionDefinition == null ? Output.empty() : this.iamActionDefinition;
    }

    /**
     * The service control policies (SCPs) action definition details. See SCP Action Definition.
     * 
     */
    @Import(name="scpActionDefinition")
      private final @Nullable Output<BudgetActionDefinitionScpActionDefinitionArgs> scpActionDefinition;

    public Output<BudgetActionDefinitionScpActionDefinitionArgs> getScpActionDefinition() {
        return this.scpActionDefinition == null ? Output.empty() : this.scpActionDefinition;
    }

    /**
     * The AWS Systems Manager (SSM) action definition details. See SSM Action Definition.
     * 
     */
    @Import(name="ssmActionDefinition")
      private final @Nullable Output<BudgetActionDefinitionSsmActionDefinitionArgs> ssmActionDefinition;

    public Output<BudgetActionDefinitionSsmActionDefinitionArgs> getSsmActionDefinition() {
        return this.ssmActionDefinition == null ? Output.empty() : this.ssmActionDefinition;
    }

    public BudgetActionDefinitionArgs(
        @Nullable Output<BudgetActionDefinitionIamActionDefinitionArgs> iamActionDefinition,
        @Nullable Output<BudgetActionDefinitionScpActionDefinitionArgs> scpActionDefinition,
        @Nullable Output<BudgetActionDefinitionSsmActionDefinitionArgs> ssmActionDefinition) {
        this.iamActionDefinition = iamActionDefinition;
        this.scpActionDefinition = scpActionDefinition;
        this.ssmActionDefinition = ssmActionDefinition;
    }

    private BudgetActionDefinitionArgs() {
        this.iamActionDefinition = Output.empty();
        this.scpActionDefinition = Output.empty();
        this.ssmActionDefinition = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetActionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BudgetActionDefinitionIamActionDefinitionArgs> iamActionDefinition;
        private @Nullable Output<BudgetActionDefinitionScpActionDefinitionArgs> scpActionDefinition;
        private @Nullable Output<BudgetActionDefinitionSsmActionDefinitionArgs> ssmActionDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetActionDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamActionDefinition = defaults.iamActionDefinition;
    	      this.scpActionDefinition = defaults.scpActionDefinition;
    	      this.ssmActionDefinition = defaults.ssmActionDefinition;
        }

        public Builder iamActionDefinition(@Nullable Output<BudgetActionDefinitionIamActionDefinitionArgs> iamActionDefinition) {
            this.iamActionDefinition = iamActionDefinition;
            return this;
        }
        public Builder iamActionDefinition(@Nullable BudgetActionDefinitionIamActionDefinitionArgs iamActionDefinition) {
            this.iamActionDefinition = Output.ofNullable(iamActionDefinition);
            return this;
        }
        public Builder scpActionDefinition(@Nullable Output<BudgetActionDefinitionScpActionDefinitionArgs> scpActionDefinition) {
            this.scpActionDefinition = scpActionDefinition;
            return this;
        }
        public Builder scpActionDefinition(@Nullable BudgetActionDefinitionScpActionDefinitionArgs scpActionDefinition) {
            this.scpActionDefinition = Output.ofNullable(scpActionDefinition);
            return this;
        }
        public Builder ssmActionDefinition(@Nullable Output<BudgetActionDefinitionSsmActionDefinitionArgs> ssmActionDefinition) {
            this.ssmActionDefinition = ssmActionDefinition;
            return this;
        }
        public Builder ssmActionDefinition(@Nullable BudgetActionDefinitionSsmActionDefinitionArgs ssmActionDefinition) {
            this.ssmActionDefinition = Output.ofNullable(ssmActionDefinition);
            return this;
        }        public BudgetActionDefinitionArgs build() {
            return new BudgetActionDefinitionArgs(iamActionDefinition, scpActionDefinition, ssmActionDefinition);
        }
    }
}
