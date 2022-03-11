// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.budgets.BudgetArgs;
import io.pulumi.aws.budgets.inputs.BudgetState;
import io.pulumi.aws.budgets.outputs.BudgetCostTypes;
import io.pulumi.aws.budgets.outputs.BudgetNotification;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a budgets budget resource. Budgets use the cost visualisation provided by Cost Explorer to show you the status of your budgets, to provide forecasts of your estimated costs, and to track your AWS usage, including your free tier usage.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Budgets can be imported using `AccountID:BudgetName`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:budgets/budget:Budget myBudget 123456789012:myBudget`
 * ```
 * 
 */
@ResourceType(type="aws:budgets/budget:Budget")
public class Budget extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the target account for budget. Will use current user's account_id by default if omitted.
     * 
     */
    @OutputExport(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The ID of the target account for budget. Will use current user's account_id by default if omitted.
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * The ARN of the budget.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the budget.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Whether this budget tracks monetary cost or usage.
     * 
     */
    @OutputExport(name="budgetType", type=String.class, parameters={})
    private Output<String> budgetType;

    /**
     * @return Whether this budget tracks monetary cost or usage.
     * 
     */
    public Output<String> getBudgetType() {
        return this.budgetType;
    }
    /**
     * Map of CostFilters key/value pairs to apply to the budget.
     * 
     */
    @OutputExport(name="costFilters", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> costFilters;

    /**
     * @return Map of CostFilters key/value pairs to apply to the budget.
     * 
     */
    public Output<Map<String,String>> getCostFilters() {
        return this.costFilters;
    }
    /**
     * Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions.
     * 
     */
    @OutputExport(name="costTypes", type=BudgetCostTypes.class, parameters={})
    private Output<BudgetCostTypes> costTypes;

    /**
     * @return Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions.
     * 
     */
    public Output<BudgetCostTypes> getCostTypes() {
        return this.costTypes;
    }
    /**
     * The amount of cost or usage being measured for a budget.
     * 
     */
    @OutputExport(name="limitAmount", type=String.class, parameters={})
    private Output<String> limitAmount;

    /**
     * @return The amount of cost or usage being measured for a budget.
     * 
     */
    public Output<String> getLimitAmount() {
        return this.limitAmount;
    }
    /**
     * The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
     * 
     */
    @OutputExport(name="limitUnit", type=String.class, parameters={})
    private Output<String> limitUnit;

    /**
     * @return The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
     * 
     */
    public Output<String> getLimitUnit() {
        return this.limitUnit;
    }
    /**
     * The name of a budget. Unique within accounts.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of a budget. Unique within accounts.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The prefix of the name of a budget. Unique within accounts.
     * 
     */
    @OutputExport(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return The prefix of the name of a budget. Unique within accounts.
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * Object containing Budget Notifications. Can be used multiple times to define more than one budget notification
     * 
     */
    @OutputExport(name="notifications", type=List.class, parameters={BudgetNotification.class})
    private Output</* @Nullable */ List<BudgetNotification>> notifications;

    /**
     * @return Object containing Budget Notifications. Can be used multiple times to define more than one budget notification
     * 
     */
    public Output</* @Nullable */ List<BudgetNotification>> getNotifications() {
        return this.notifications;
    }
    /**
     * The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
     * 
     */
    @OutputExport(name="timePeriodEnd", type=String.class, parameters={})
    private Output</* @Nullable */ String> timePeriodEnd;

    /**
     * @return The end of the time period covered by the budget. There are no restrictions on the end date. Format: `2017-01-01_12:00`.
     * 
     */
    public Output</* @Nullable */ String> getTimePeriodEnd() {
        return this.timePeriodEnd;
    }
    /**
     * The start of the time period covered by the budget. If you don't specify a start date, AWS defaults to the start of your chosen time period. The start date must come before the end date. Format: `2017-01-01_12:00`.
     * 
     */
    @OutputExport(name="timePeriodStart", type=String.class, parameters={})
    private Output<String> timePeriodStart;

    /**
     * @return The start of the time period covered by the budget. If you don't specify a start date, AWS defaults to the start of your chosen time period. The start date must come before the end date. Format: `2017-01-01_12:00`.
     * 
     */
    public Output<String> getTimePeriodStart() {
        return this.timePeriodStart;
    }
    /**
     * The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`, and `DAILY`.
     * 
     */
    @OutputExport(name="timeUnit", type=String.class, parameters={})
    private Output<String> timeUnit;

    /**
     * @return The length of time until a budget resets the actual and forecasted spend. Valid values: `MONTHLY`, `QUARTERLY`, `ANNUALLY`, and `DAILY`.
     * 
     */
    public Output<String> getTimeUnit() {
        return this.timeUnit;
    }

    public interface BuilderApplicator {
        public void apply(BudgetArgs.Builder a);
    }
    private static io.pulumi.aws.budgets.BudgetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.budgets.BudgetArgs.builder();
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
        super("aws:budgets/budget:Budget", name, args == null ? BudgetArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Budget(String name, Output<String> id, @Nullable BudgetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:budgets/budget:Budget", name, state, makeResourceOptions(options, id));
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
