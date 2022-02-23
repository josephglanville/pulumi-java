// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.costmanagement.enums.AccumulatedType;
import io.pulumi.azurenative.costmanagement.enums.ChartType;
import io.pulumi.azurenative.costmanagement.enums.MetricType;
import io.pulumi.azurenative.costmanagement.enums.ReportTimeframeType;
import io.pulumi.azurenative.costmanagement.enums.ReportType;
import io.pulumi.azurenative.costmanagement.inputs.KpiPropertiesArgs;
import io.pulumi.azurenative.costmanagement.inputs.PivotPropertiesArgs;
import io.pulumi.azurenative.costmanagement.inputs.ReportConfigDatasetArgs;
import io.pulumi.azurenative.costmanagement.inputs.ReportConfigTimePeriodArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ViewByScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ViewByScopeArgs Empty = new ViewByScopeArgs();

    /**
     * Show costs accumulated over time.
     * 
     */
    @InputImport(name="accumulated")
      private final @Nullable Input<Either<String,AccumulatedType>> accumulated;

    public Input<Either<String,AccumulatedType>> getAccumulated() {
        return this.accumulated == null ? Input.empty() : this.accumulated;
    }

    /**
     * Chart type of the main view in Cost Analysis. Required.
     * 
     */
    @InputImport(name="chart")
      private final @Nullable Input<Either<String,ChartType>> chart;

    public Input<Either<String,ChartType>> getChart() {
        return this.chart == null ? Input.empty() : this.chart;
    }

    /**
     * Has definition for data in this report config.
     * 
     */
    @InputImport(name="dataSet")
      private final @Nullable Input<ReportConfigDatasetArgs> dataSet;

    public Input<ReportConfigDatasetArgs> getDataSet() {
        return this.dataSet == null ? Input.empty() : this.dataSet;
    }

    /**
     * User input name of the view. Required.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    @InputImport(name="eTag")
      private final @Nullable Input<String> eTag;

    public Input<String> getETag() {
        return this.eTag == null ? Input.empty() : this.eTag;
    }

    /**
     * List of KPIs to show in Cost Analysis UI.
     * 
     */
    @InputImport(name="kpis")
      private final @Nullable Input<List<KpiPropertiesArgs>> kpis;

    public Input<List<KpiPropertiesArgs>> getKpis() {
        return this.kpis == null ? Input.empty() : this.kpis;
    }

    /**
     * Metric to use when displaying costs.
     * 
     */
    @InputImport(name="metric")
      private final @Nullable Input<Either<String,MetricType>> metric;

    public Input<Either<String,MetricType>> getMetric() {
        return this.metric == null ? Input.empty() : this.metric;
    }

    /**
     * Configuration of 3 sub-views in the Cost Analysis UI.
     * 
     */
    @InputImport(name="pivots")
      private final @Nullable Input<List<PivotPropertiesArgs>> pivots;

    public Input<List<PivotPropertiesArgs>> getPivots() {
        return this.pivots == null ? Input.empty() : this.pivots;
    }

    /**
     * Cost Management scope to save the view on. This includes 'subscriptions/{subscriptionId}' for subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for BillingProfile scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group scope, '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for ExternalBillingAccount scope, and '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for ExternalSubscription scope.
     * 
     */
    @InputImport(name="scope", required=true)
      private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    /**
     * Has time period for pulling data for the report.
     * 
     */
    @InputImport(name="timePeriod")
      private final @Nullable Input<ReportConfigTimePeriodArgs> timePeriod;

    public Input<ReportConfigTimePeriodArgs> getTimePeriod() {
        return this.timePeriod == null ? Input.empty() : this.timePeriod;
    }

    /**
     * The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    @InputImport(name="timeframe", required=true)
      private final Input<Either<String,ReportTimeframeType>> timeframe;

    public Input<Either<String,ReportTimeframeType>> getTimeframe() {
        return this.timeframe;
    }

    /**
     * The type of the report. Usage represents actual usage, forecast represents forecasted data and UsageAndForecast represents both usage and forecasted data. Actual usage and forecasted data can be differentiated based on dates.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<Either<String,ReportType>> type;

    public Input<Either<String,ReportType>> getType() {
        return this.type;
    }

    /**
     * View name
     * 
     */
    @InputImport(name="viewName")
      private final @Nullable Input<String> viewName;

    public Input<String> getViewName() {
        return this.viewName == null ? Input.empty() : this.viewName;
    }

    public ViewByScopeArgs(
        @Nullable Input<Either<String,AccumulatedType>> accumulated,
        @Nullable Input<Either<String,ChartType>> chart,
        @Nullable Input<ReportConfigDatasetArgs> dataSet,
        @Nullable Input<String> displayName,
        @Nullable Input<String> eTag,
        @Nullable Input<List<KpiPropertiesArgs>> kpis,
        @Nullable Input<Either<String,MetricType>> metric,
        @Nullable Input<List<PivotPropertiesArgs>> pivots,
        Input<String> scope,
        @Nullable Input<ReportConfigTimePeriodArgs> timePeriod,
        Input<Either<String,ReportTimeframeType>> timeframe,
        Input<Either<String,ReportType>> type,
        @Nullable Input<String> viewName) {
        this.accumulated = accumulated;
        this.chart = chart;
        this.dataSet = dataSet;
        this.displayName = displayName;
        this.eTag = eTag;
        this.kpis = kpis;
        this.metric = metric;
        this.pivots = pivots;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.timePeriod = timePeriod;
        this.timeframe = Objects.requireNonNull(timeframe, "expected parameter 'timeframe' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.viewName = viewName;
    }

    private ViewByScopeArgs() {
        this.accumulated = Input.empty();
        this.chart = Input.empty();
        this.dataSet = Input.empty();
        this.displayName = Input.empty();
        this.eTag = Input.empty();
        this.kpis = Input.empty();
        this.metric = Input.empty();
        this.pivots = Input.empty();
        this.scope = Input.empty();
        this.timePeriod = Input.empty();
        this.timeframe = Input.empty();
        this.type = Input.empty();
        this.viewName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ViewByScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,AccumulatedType>> accumulated;
        private @Nullable Input<Either<String,ChartType>> chart;
        private @Nullable Input<ReportConfigDatasetArgs> dataSet;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> eTag;
        private @Nullable Input<List<KpiPropertiesArgs>> kpis;
        private @Nullable Input<Either<String,MetricType>> metric;
        private @Nullable Input<List<PivotPropertiesArgs>> pivots;
        private Input<String> scope;
        private @Nullable Input<ReportConfigTimePeriodArgs> timePeriod;
        private Input<Either<String,ReportTimeframeType>> timeframe;
        private Input<Either<String,ReportType>> type;
        private @Nullable Input<String> viewName;

        public Builder() {
    	      // Empty
        }

        public Builder(ViewByScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accumulated = defaults.accumulated;
    	      this.chart = defaults.chart;
    	      this.dataSet = defaults.dataSet;
    	      this.displayName = defaults.displayName;
    	      this.eTag = defaults.eTag;
    	      this.kpis = defaults.kpis;
    	      this.metric = defaults.metric;
    	      this.pivots = defaults.pivots;
    	      this.scope = defaults.scope;
    	      this.timePeriod = defaults.timePeriod;
    	      this.timeframe = defaults.timeframe;
    	      this.type = defaults.type;
    	      this.viewName = defaults.viewName;
        }

        public Builder setAccumulated(@Nullable Input<Either<String,AccumulatedType>> accumulated) {
            this.accumulated = accumulated;
            return this;
        }

        public Builder setAccumulated(@Nullable Either<String,AccumulatedType> accumulated) {
            this.accumulated = Input.ofNullable(accumulated);
            return this;
        }

        public Builder setChart(@Nullable Input<Either<String,ChartType>> chart) {
            this.chart = chart;
            return this;
        }

        public Builder setChart(@Nullable Either<String,ChartType> chart) {
            this.chart = Input.ofNullable(chart);
            return this;
        }

        public Builder setDataSet(@Nullable Input<ReportConfigDatasetArgs> dataSet) {
            this.dataSet = dataSet;
            return this;
        }

        public Builder setDataSet(@Nullable ReportConfigDatasetArgs dataSet) {
            this.dataSet = Input.ofNullable(dataSet);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setETag(@Nullable Input<String> eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = Input.ofNullable(eTag);
            return this;
        }

        public Builder setKpis(@Nullable Input<List<KpiPropertiesArgs>> kpis) {
            this.kpis = kpis;
            return this;
        }

        public Builder setKpis(@Nullable List<KpiPropertiesArgs> kpis) {
            this.kpis = Input.ofNullable(kpis);
            return this;
        }

        public Builder setMetric(@Nullable Input<Either<String,MetricType>> metric) {
            this.metric = metric;
            return this;
        }

        public Builder setMetric(@Nullable Either<String,MetricType> metric) {
            this.metric = Input.ofNullable(metric);
            return this;
        }

        public Builder setPivots(@Nullable Input<List<PivotPropertiesArgs>> pivots) {
            this.pivots = pivots;
            return this;
        }

        public Builder setPivots(@Nullable List<PivotPropertiesArgs> pivots) {
            this.pivots = Input.ofNullable(pivots);
            return this;
        }

        public Builder setScope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public Builder setTimePeriod(@Nullable Input<ReportConfigTimePeriodArgs> timePeriod) {
            this.timePeriod = timePeriod;
            return this;
        }

        public Builder setTimePeriod(@Nullable ReportConfigTimePeriodArgs timePeriod) {
            this.timePeriod = Input.ofNullable(timePeriod);
            return this;
        }

        public Builder setTimeframe(Input<Either<String,ReportTimeframeType>> timeframe) {
            this.timeframe = Objects.requireNonNull(timeframe);
            return this;
        }

        public Builder setTimeframe(Either<String,ReportTimeframeType> timeframe) {
            this.timeframe = Input.of(Objects.requireNonNull(timeframe));
            return this;
        }

        public Builder setType(Input<Either<String,ReportType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,ReportType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setViewName(@Nullable Input<String> viewName) {
            this.viewName = viewName;
            return this;
        }

        public Builder setViewName(@Nullable String viewName) {
            this.viewName = Input.ofNullable(viewName);
            return this;
        }
        public ViewByScopeArgs build() {
            return new ViewByScopeArgs(accumulated, chart, dataSet, displayName, eTag, kpis, metric, pivots, scope, timePeriod, timeframe, type, viewName);
        }
    }
}
