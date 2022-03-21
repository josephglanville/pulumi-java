// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetBudgetFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetBudgetFilterGetArgs Empty = new BudgetBudgetFilterGetArgs();

    /**
     * A set of subaccounts of the form billingAccounts/{account_id},
     * specifying that usage from only this set of subaccounts should
     * be included in the budget. If a subaccount is set to the name of
     * the parent account, usage from the parent account will be included.
     * If the field is omitted, the report will include usage from the parent
     * account and all subaccounts, if they exist.
     * 
     */
    @Import(name="creditTypes")
      private final @Nullable Output<List<String>> creditTypes;

    public Output<List<String>> getCreditTypes() {
        return this.creditTypes == null ? Output.empty() : this.creditTypes;
    }

    /**
     * Specifies how credits should be treated when determining spend
     * for threshold calculations.
     * Default value is `INCLUDE_ALL_CREDITS`.
     * Possible values are `INCLUDE_ALL_CREDITS`, `EXCLUDE_ALL_CREDITS`, and `INCLUDE_SPECIFIED_CREDITS`.
     * 
     */
    @Import(name="creditTypesTreatment")
      private final @Nullable Output<String> creditTypesTreatment;

    public Output<String> getCreditTypesTreatment() {
        return this.creditTypesTreatment == null ? Output.empty() : this.creditTypesTreatment;
    }

    /**
     * A single label and value pair specifying that usage from only
     * this set of labeled resources should be included in the budget.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * A set of projects of the form projects/{project_number},
     * specifying that usage from only this set of projects should be
     * included in the budget. If omitted, the report will include
     * all usage for the billing account, regardless of which project
     * the usage occurred on.
     * 
     */
    @Import(name="projects")
      private final @Nullable Output<List<String>> projects;

    public Output<List<String>> getProjects() {
        return this.projects == null ? Output.empty() : this.projects;
    }

    /**
     * A set of services of the form services/{service_id},
     * specifying that usage from only this set of services should be
     * included in the budget. If omitted, the report will include
     * usage for all the services. The service names are available
     * through the Catalog API:
     * https://cloud.google.com/billing/v1/how-tos/catalog-api.
     * 
     */
    @Import(name="services")
      private final @Nullable Output<List<String>> services;

    public Output<List<String>> getServices() {
        return this.services == null ? Output.empty() : this.services;
    }

    /**
     * A set of subaccounts of the form billingAccounts/{account_id},
     * specifying that usage from only this set of subaccounts should
     * be included in the budget. If a subaccount is set to the name of
     * the parent account, usage from the parent account will be included.
     * If the field is omitted, the report will include usage from the parent
     * account and all subaccounts, if they exist.
     * 
     */
    @Import(name="subaccounts")
      private final @Nullable Output<List<String>> subaccounts;

    public Output<List<String>> getSubaccounts() {
        return this.subaccounts == null ? Output.empty() : this.subaccounts;
    }

    public BudgetBudgetFilterGetArgs(
        @Nullable Output<List<String>> creditTypes,
        @Nullable Output<String> creditTypesTreatment,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<List<String>> projects,
        @Nullable Output<List<String>> services,
        @Nullable Output<List<String>> subaccounts) {
        this.creditTypes = creditTypes;
        this.creditTypesTreatment = creditTypesTreatment;
        this.labels = labels;
        this.projects = projects;
        this.services = services;
        this.subaccounts = subaccounts;
    }

    private BudgetBudgetFilterGetArgs() {
        this.creditTypes = Output.empty();
        this.creditTypesTreatment = Output.empty();
        this.labels = Output.empty();
        this.projects = Output.empty();
        this.services = Output.empty();
        this.subaccounts = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetBudgetFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> creditTypes;
        private @Nullable Output<String> creditTypesTreatment;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<List<String>> projects;
        private @Nullable Output<List<String>> services;
        private @Nullable Output<List<String>> subaccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetBudgetFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creditTypes = defaults.creditTypes;
    	      this.creditTypesTreatment = defaults.creditTypesTreatment;
    	      this.labels = defaults.labels;
    	      this.projects = defaults.projects;
    	      this.services = defaults.services;
    	      this.subaccounts = defaults.subaccounts;
        }

        public Builder creditTypes(@Nullable Output<List<String>> creditTypes) {
            this.creditTypes = creditTypes;
            return this;
        }
        public Builder creditTypes(@Nullable List<String> creditTypes) {
            this.creditTypes = Output.ofNullable(creditTypes);
            return this;
        }
        public Builder creditTypes(String... creditTypes) {
            return creditTypes(List.of(creditTypes));
        }
        public Builder creditTypesTreatment(@Nullable Output<String> creditTypesTreatment) {
            this.creditTypesTreatment = creditTypesTreatment;
            return this;
        }
        public Builder creditTypesTreatment(@Nullable String creditTypesTreatment) {
            this.creditTypesTreatment = Output.ofNullable(creditTypesTreatment);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder projects(@Nullable Output<List<String>> projects) {
            this.projects = projects;
            return this;
        }
        public Builder projects(@Nullable List<String> projects) {
            this.projects = Output.ofNullable(projects);
            return this;
        }
        public Builder projects(String... projects) {
            return projects(List.of(projects));
        }
        public Builder services(@Nullable Output<List<String>> services) {
            this.services = services;
            return this;
        }
        public Builder services(@Nullable List<String> services) {
            this.services = Output.ofNullable(services);
            return this;
        }
        public Builder services(String... services) {
            return services(List.of(services));
        }
        public Builder subaccounts(@Nullable Output<List<String>> subaccounts) {
            this.subaccounts = subaccounts;
            return this;
        }
        public Builder subaccounts(@Nullable List<String> subaccounts) {
            this.subaccounts = Output.ofNullable(subaccounts);
            return this;
        }
        public Builder subaccounts(String... subaccounts) {
            return subaccounts(List.of(subaccounts));
        }        public BudgetBudgetFilterGetArgs build() {
            return new BudgetBudgetFilterGetArgs(creditTypes, creditTypesTreatment, labels, projects, services, subaccounts);
        }
    }
}
