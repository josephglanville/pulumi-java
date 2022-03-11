// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.billing.BudgetArgs;
import io.pulumi.gcp.billing.inputs.BudgetState;
import io.pulumi.gcp.billing.outputs.BudgetAllUpdatesRule;
import io.pulumi.gcp.billing.outputs.BudgetAmount;
import io.pulumi.gcp.billing.outputs.BudgetBudgetFilter;
import io.pulumi.gcp.billing.outputs.BudgetThresholdRule;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Budget configuration for a billing account.
 * 
 * To get more information about Budget, see:
 * 
 * * [API documentation](https://cloud.google.com/billing/docs/reference/budget/rest/v1/billingAccounts.budgets)
 * * How-to Guides
 *     * [Creating a budget](https://cloud.google.com/billing/docs/how-to/budgets)
 * 
 * > **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
 * you must specify a `billing_project` and set `user_project_override` to true
 * in the provider configuration. Otherwise the Billing Budgets API will return a 403 error.
 * Your account must have the `serviceusage.services.use` permission on the
 * `billing_project` you defined.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Budget can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:billing/budget:Budget default billingAccounts/{{billing_account}}/budgets/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:billing/budget:Budget default {{billing_account}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:billing/budget:Budget default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:billing/budget:Budget")
public class Budget extends io.pulumi.resources.CustomResource {
    /**
     * Defines notifications that are sent on every update to the
     * billing account's spend, regardless of the thresholds defined
     * using threshold rules.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="allUpdatesRule", type=BudgetAllUpdatesRule.class, parameters={})
    private Output</* @Nullable */ BudgetAllUpdatesRule> allUpdatesRule;

    /**
     * @return Defines notifications that are sent on every update to the
     * billing account's spend, regardless of the thresholds defined
     * using threshold rules.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ BudgetAllUpdatesRule> getAllUpdatesRule() {
        return this.allUpdatesRule;
    }
    /**
     * The budgeted amount for each usage period.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="amount", type=BudgetAmount.class, parameters={})
    private Output<BudgetAmount> amount;

    /**
     * @return The budgeted amount for each usage period.
     * Structure is documented below.
     * 
     */
    public Output<BudgetAmount> getAmount() {
        return this.amount;
    }
    /**
     * ID of the billing account to set a budget on.
     * 
     */
    @OutputExport(name="billingAccount", type=String.class, parameters={})
    private Output<String> billingAccount;

    /**
     * @return ID of the billing account to set a budget on.
     * 
     */
    public Output<String> getBillingAccount() {
        return this.billingAccount;
    }
    /**
     * Filters that define which resources are used to compute the actual
     * spend against the budget.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="budgetFilter", type=BudgetBudgetFilter.class, parameters={})
    private Output<BudgetBudgetFilter> budgetFilter;

    /**
     * @return Filters that define which resources are used to compute the actual
     * spend against the budget.
     * Structure is documented below.
     * 
     */
    public Output<BudgetBudgetFilter> getBudgetFilter() {
        return this.budgetFilter;
    }
    /**
     * User data for display name in UI. Must be <= 60 chars.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return User data for display name in UI. Must be <= 60 chars.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource name of the budget. The resource name implies the scope of a budget. Values are of the form
     * billingAccounts/{billingAccountId}/budgets/{budgetId}.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the budget. The resource name implies the scope of a budget. Values are of the form
     * billingAccounts/{billingAccountId}/budgets/{budgetId}.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Rules that trigger alerts (notifications of thresholds being
     * crossed) when spend exceeds the specified percentages of the
     * budget.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="thresholdRules", type=List.class, parameters={BudgetThresholdRule.class})
    private Output<List<BudgetThresholdRule>> thresholdRules;

    /**
     * @return Rules that trigger alerts (notifications of thresholds being
     * crossed) when spend exceeds the specified percentages of the
     * budget.
     * Structure is documented below.
     * 
     */
    public Output<List<BudgetThresholdRule>> getThresholdRules() {
        return this.thresholdRules;
    }

    public interface BuilderApplicator {
        public void apply(BudgetArgs.Builder a);
    }
    private static io.pulumi.gcp.billing.BudgetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.billing.BudgetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Budget(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Budget(String name) {
        this(name, BudgetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Budget(String name, BudgetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Budget(String name, BudgetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:billing/budget:Budget", name, args == null ? BudgetArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Budget(String name, Output<String> id, @Nullable BudgetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:billing/budget:Budget", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Budget get(String name, Output<String> id, @Nullable BudgetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Budget(name, id, state, options);
    }
}
