// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.outputs;

import io.pulumi.aws.budgets.outputs.BudgetActionDefinitionIamActionDefinition;
import io.pulumi.aws.budgets.outputs.BudgetActionDefinitionScpActionDefinition;
import io.pulumi.aws.budgets.outputs.BudgetActionDefinitionSsmActionDefinition;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BudgetActionDefinition {
    /**
     * The AWS Identity and Access Management (IAM) action definition details. See IAM Action Definition.
     * 
     */
    private final @Nullable BudgetActionDefinitionIamActionDefinition iamActionDefinition;
    /**
     * The service control policies (SCPs) action definition details. See SCP Action Definition.
     * 
     */
    private final @Nullable BudgetActionDefinitionScpActionDefinition scpActionDefinition;
    /**
     * The AWS Systems Manager (SSM) action definition details. See SSM Action Definition.
     * 
     */
    private final @Nullable BudgetActionDefinitionSsmActionDefinition ssmActionDefinition;

    @OutputCustomType.Constructor
    private BudgetActionDefinition(
        @OutputCustomType.Parameter("iamActionDefinition") @Nullable BudgetActionDefinitionIamActionDefinition iamActionDefinition,
        @OutputCustomType.Parameter("scpActionDefinition") @Nullable BudgetActionDefinitionScpActionDefinition scpActionDefinition,
        @OutputCustomType.Parameter("ssmActionDefinition") @Nullable BudgetActionDefinitionSsmActionDefinition ssmActionDefinition) {
        this.iamActionDefinition = iamActionDefinition;
        this.scpActionDefinition = scpActionDefinition;
        this.ssmActionDefinition = ssmActionDefinition;
    }

    /**
     * The AWS Identity and Access Management (IAM) action definition details. See IAM Action Definition.
     * 
    */
    public Optional<BudgetActionDefinitionIamActionDefinition> getIamActionDefinition() {
        return Optional.ofNullable(this.iamActionDefinition);
    }
    /**
     * The service control policies (SCPs) action definition details. See SCP Action Definition.
     * 
    */
    public Optional<BudgetActionDefinitionScpActionDefinition> getScpActionDefinition() {
        return Optional.ofNullable(this.scpActionDefinition);
    }
    /**
     * The AWS Systems Manager (SSM) action definition details. See SSM Action Definition.
     * 
    */
    public Optional<BudgetActionDefinitionSsmActionDefinition> getSsmActionDefinition() {
        return Optional.ofNullable(this.ssmActionDefinition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetActionDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BudgetActionDefinitionIamActionDefinition iamActionDefinition;
        private @Nullable BudgetActionDefinitionScpActionDefinition scpActionDefinition;
        private @Nullable BudgetActionDefinitionSsmActionDefinition ssmActionDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetActionDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamActionDefinition = defaults.iamActionDefinition;
    	      this.scpActionDefinition = defaults.scpActionDefinition;
    	      this.ssmActionDefinition = defaults.ssmActionDefinition;
        }

        public Builder setIamActionDefinition(@Nullable BudgetActionDefinitionIamActionDefinition iamActionDefinition) {
            this.iamActionDefinition = iamActionDefinition;
            return this;
        }

        public Builder setScpActionDefinition(@Nullable BudgetActionDefinitionScpActionDefinition scpActionDefinition) {
            this.scpActionDefinition = scpActionDefinition;
            return this;
        }

        public Builder setSsmActionDefinition(@Nullable BudgetActionDefinitionSsmActionDefinition ssmActionDefinition) {
            this.ssmActionDefinition = ssmActionDefinition;
            return this;
        }
        public BudgetActionDefinition build() {
            return new BudgetActionDefinition(iamActionDefinition, scpActionDefinition, ssmActionDefinition);
        }
    }
}
