// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BudgetActionDefinitionScpActionDefinition {
    /**
     * The policy ID attached.
     * 
     */
    private final String policyId;
    /**
     * A list of target IDs.
     * 
     */
    private final List<String> targetIds;

    @CustomType.Constructor
    private BudgetActionDefinitionScpActionDefinition(
        @CustomType.Parameter("policyId") String policyId,
        @CustomType.Parameter("targetIds") List<String> targetIds) {
        this.policyId = policyId;
        this.targetIds = targetIds;
    }

    /**
     * The policy ID attached.
     * 
    */
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * A list of target IDs.
     * 
    */
    public List<String> getTargetIds() {
        return this.targetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetActionDefinitionScpActionDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String policyId;
        private List<String> targetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetActionDefinitionScpActionDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyId = defaults.policyId;
    	      this.targetIds = defaults.targetIds;
        }

        public Builder policyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }
        public Builder targetIds(List<String> targetIds) {
            this.targetIds = Objects.requireNonNull(targetIds);
            return this;
        }
        public Builder targetIds(String... targetIds) {
            return targetIds(List.of(targetIds));
        }        public BudgetActionDefinitionScpActionDefinition build() {
            return new BudgetActionDefinitionScpActionDefinition(policyId, targetIds);
        }
    }
}
