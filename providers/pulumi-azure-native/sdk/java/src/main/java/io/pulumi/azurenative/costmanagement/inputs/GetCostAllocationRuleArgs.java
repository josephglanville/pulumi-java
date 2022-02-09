// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCostAllocationRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCostAllocationRuleArgs Empty = new GetCostAllocationRuleArgs();

    @InputImport(name="billingAccountId", required=true)
    private final String billingAccountId;

    public String getBillingAccountId() {
        return this.billingAccountId;
    }

    @InputImport(name="ruleName", required=true)
    private final String ruleName;

    public String getRuleName() {
        return this.ruleName;
    }

    public GetCostAllocationRuleArgs(
        String billingAccountId,
        String ruleName) {
        this.billingAccountId = Objects.requireNonNull(billingAccountId, "expected parameter 'billingAccountId' to be non-null");
        this.ruleName = Objects.requireNonNull(ruleName, "expected parameter 'ruleName' to be non-null");
    }

    private GetCostAllocationRuleArgs() {
        this.billingAccountId = null;
        this.ruleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCostAllocationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingAccountId;
        private String ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCostAllocationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder setBillingAccountId(String billingAccountId) {
            this.billingAccountId = Objects.requireNonNull(billingAccountId);
            return this;
        }

        public Builder setRuleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }

        public GetCostAllocationRuleArgs build() {
            return new GetCostAllocationRuleArgs(billingAccountId, ruleName);
        }
    }
}
