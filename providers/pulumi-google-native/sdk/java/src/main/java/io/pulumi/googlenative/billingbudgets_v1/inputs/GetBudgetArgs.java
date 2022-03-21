// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBudgetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBudgetArgs Empty = new GetBudgetArgs();

    @Import(name="billingAccountId", required=true)
      private final String billingAccountId;

    public String getBillingAccountId() {
        return this.billingAccountId;
    }

    @Import(name="budgetId", required=true)
      private final String budgetId;

    public String getBudgetId() {
        return this.budgetId;
    }

    public GetBudgetArgs(
        String billingAccountId,
        String budgetId) {
        this.billingAccountId = Objects.requireNonNull(billingAccountId, "expected parameter 'billingAccountId' to be non-null");
        this.budgetId = Objects.requireNonNull(budgetId, "expected parameter 'budgetId' to be non-null");
    }

    private GetBudgetArgs() {
        this.billingAccountId = null;
        this.budgetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingAccountId;
        private String budgetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBudgetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.budgetId = defaults.budgetId;
        }

        public Builder billingAccountId(String billingAccountId) {
            this.billingAccountId = Objects.requireNonNull(billingAccountId);
            return this;
        }
        public Builder budgetId(String budgetId) {
            this.budgetId = Objects.requireNonNull(budgetId);
            return this;
        }        public GetBudgetArgs build() {
            return new GetBudgetArgs(billingAccountId, budgetId);
        }
    }
}
