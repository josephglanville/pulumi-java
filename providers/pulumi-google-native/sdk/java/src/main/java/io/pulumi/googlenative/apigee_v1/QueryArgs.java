// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1QueryMetricArgs;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueryArgs Empty = new QueryArgs();

    /**
     * Delimiter used in the CSV file, if `outputFormat` is set to `csv`. Defaults to the `,` (comma) character. Supported delimiter characters include comma (`,`), pipe (`|`), and tab (`\t`).
     * 
     */
    @Import(name="csvDelimiter")
      private final @Nullable Output<String> csvDelimiter;

    public Output<String> getCsvDelimiter() {
        return this.csvDelimiter == null ? Output.empty() : this.csvDelimiter;
    }

    /**
     * A list of dimensions. https://docs.apigee.com/api-platform/analytics/analytics-reference#dimensions
     * 
     */
    @Import(name="dimensions")
      private final @Nullable Output<List<String>> dimensions;

    public Output<List<String>> getDimensions() {
        return this.dimensions == null ? Output.empty() : this.dimensions;
    }

    /**
     * Hostname needs to be specified if query intends to run at host level. This field is only allowed when query is submitted by CreateHostAsyncQuery where analytics data will be grouped by organization and hostname.
     * 
     */
    @Import(name="envgroupHostname")
      private final @Nullable Output<String> envgroupHostname;

    public Output<String> getEnvgroupHostname() {
        return this.envgroupHostname == null ? Output.empty() : this.envgroupHostname;
    }

    @Import(name="environmentId", required=true)
      private final Output<String> environmentId;

    public Output<String> getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * Boolean expression that can be used to filter data. Filter expressions can be combined using AND/OR terms and should be fully parenthesized to avoid ambiguity. See Analytics metrics, dimensions, and filters reference https://docs.apigee.com/api-platform/analytics/analytics-reference for more information on the fields available to filter on. For more information on the tokens that you use to build filter expressions, see Filter expression syntax. https://docs.apigee.com/api-platform/analytics/asynch-reports-api#filter-expression-syntax
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * Time unit used to group the result set. Valid values include: second, minute, hour, day, week, or month. If a query includes groupByTimeUnit, then the result is an aggregation based on the specified time unit and the resultant timestamp does not include milliseconds precision. If a query omits groupByTimeUnit, then the resultant timestamp includes milliseconds precision.
     * 
     */
    @Import(name="groupByTimeUnit")
      private final @Nullable Output<String> groupByTimeUnit;

    public Output<String> getGroupByTimeUnit() {
        return this.groupByTimeUnit == null ? Output.empty() : this.groupByTimeUnit;
    }

    /**
     * Maximum number of rows that can be returned in the result.
     * 
     */
    @Import(name="limit")
      private final @Nullable Output<Integer> limit;

    public Output<Integer> getLimit() {
        return this.limit == null ? Output.empty() : this.limit;
    }

    /**
     * A list of Metrics.
     * 
     */
    @Import(name="metrics")
      private final @Nullable Output<List<GoogleCloudApigeeV1QueryMetricArgs>> metrics;

    public Output<List<GoogleCloudApigeeV1QueryMetricArgs>> getMetrics() {
        return this.metrics == null ? Output.empty() : this.metrics;
    }

    /**
     * Asynchronous Query Name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Valid values include: `csv` or `json`. Defaults to `json`. Note: Configure the delimiter for CSV output using the csvDelimiter property.
     * 
     */
    @Import(name="outputFormat")
      private final @Nullable Output<String> outputFormat;

    public Output<String> getOutputFormat() {
        return this.outputFormat == null ? Output.empty() : this.outputFormat;
    }

    /**
     * Asynchronous Report ID.
     * 
     */
    @Import(name="reportDefinitionId")
      private final @Nullable Output<String> reportDefinitionId;

    public Output<String> getReportDefinitionId() {
        return this.reportDefinitionId == null ? Output.empty() : this.reportDefinitionId;
    }

    /**
     * Time range for the query. Can use the following predefined strings to specify the time range: `last60minutes` `last24hours` `last7days` Or, specify the timeRange as a structure describing start and end timestamps in the ISO format: yyyy-mm-ddThh:mm:ssZ. Example: "timeRange": { "start": "2018-07-29T00:13:00Z", "end": "2018-08-01T00:18:00Z" }
     * 
     */
    @Import(name="timeRange", required=true)
      private final Output<Object> timeRange;

    public Output<Object> getTimeRange() {
        return this.timeRange;
    }

    public QueryArgs(
        @Nullable Output<String> csvDelimiter,
        @Nullable Output<List<String>> dimensions,
        @Nullable Output<String> envgroupHostname,
        Output<String> environmentId,
        @Nullable Output<String> filter,
        @Nullable Output<String> groupByTimeUnit,
        @Nullable Output<Integer> limit,
        @Nullable Output<List<GoogleCloudApigeeV1QueryMetricArgs>> metrics,
        @Nullable Output<String> name,
        Output<String> organizationId,
        @Nullable Output<String> outputFormat,
        @Nullable Output<String> reportDefinitionId,
        Output<Object> timeRange) {
        this.csvDelimiter = csvDelimiter;
        this.dimensions = dimensions;
        this.envgroupHostname = envgroupHostname;
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.filter = filter;
        this.groupByTimeUnit = groupByTimeUnit;
        this.limit = limit;
        this.metrics = metrics;
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.outputFormat = outputFormat;
        this.reportDefinitionId = reportDefinitionId;
        this.timeRange = Objects.requireNonNull(timeRange, "expected parameter 'timeRange' to be non-null");
    }

    private QueryArgs() {
        this.csvDelimiter = Output.empty();
        this.dimensions = Output.empty();
        this.envgroupHostname = Output.empty();
        this.environmentId = Output.empty();
        this.filter = Output.empty();
        this.groupByTimeUnit = Output.empty();
        this.limit = Output.empty();
        this.metrics = Output.empty();
        this.name = Output.empty();
        this.organizationId = Output.empty();
        this.outputFormat = Output.empty();
        this.reportDefinitionId = Output.empty();
        this.timeRange = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> csvDelimiter;
        private @Nullable Output<List<String>> dimensions;
        private @Nullable Output<String> envgroupHostname;
        private Output<String> environmentId;
        private @Nullable Output<String> filter;
        private @Nullable Output<String> groupByTimeUnit;
        private @Nullable Output<Integer> limit;
        private @Nullable Output<List<GoogleCloudApigeeV1QueryMetricArgs>> metrics;
        private @Nullable Output<String> name;
        private Output<String> organizationId;
        private @Nullable Output<String> outputFormat;
        private @Nullable Output<String> reportDefinitionId;
        private Output<Object> timeRange;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csvDelimiter = defaults.csvDelimiter;
    	      this.dimensions = defaults.dimensions;
    	      this.envgroupHostname = defaults.envgroupHostname;
    	      this.environmentId = defaults.environmentId;
    	      this.filter = defaults.filter;
    	      this.groupByTimeUnit = defaults.groupByTimeUnit;
    	      this.limit = defaults.limit;
    	      this.metrics = defaults.metrics;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.outputFormat = defaults.outputFormat;
    	      this.reportDefinitionId = defaults.reportDefinitionId;
    	      this.timeRange = defaults.timeRange;
        }

        public Builder csvDelimiter(@Nullable Output<String> csvDelimiter) {
            this.csvDelimiter = csvDelimiter;
            return this;
        }
        public Builder csvDelimiter(@Nullable String csvDelimiter) {
            this.csvDelimiter = Output.ofNullable(csvDelimiter);
            return this;
        }
        public Builder dimensions(@Nullable Output<List<String>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(@Nullable List<String> dimensions) {
            this.dimensions = Output.ofNullable(dimensions);
            return this;
        }
        public Builder dimensions(String... dimensions) {
            return dimensions(List.of(dimensions));
        }
        public Builder envgroupHostname(@Nullable Output<String> envgroupHostname) {
            this.envgroupHostname = envgroupHostname;
            return this;
        }
        public Builder envgroupHostname(@Nullable String envgroupHostname) {
            this.envgroupHostname = Output.ofNullable(envgroupHostname);
            return this;
        }
        public Builder environmentId(Output<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }
        public Builder environmentId(String environmentId) {
            this.environmentId = Output.of(Objects.requireNonNull(environmentId));
            return this;
        }
        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }
        public Builder groupByTimeUnit(@Nullable Output<String> groupByTimeUnit) {
            this.groupByTimeUnit = groupByTimeUnit;
            return this;
        }
        public Builder groupByTimeUnit(@Nullable String groupByTimeUnit) {
            this.groupByTimeUnit = Output.ofNullable(groupByTimeUnit);
            return this;
        }
        public Builder limit(@Nullable Output<Integer> limit) {
            this.limit = limit;
            return this;
        }
        public Builder limit(@Nullable Integer limit) {
            this.limit = Output.ofNullable(limit);
            return this;
        }
        public Builder metrics(@Nullable Output<List<GoogleCloudApigeeV1QueryMetricArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }
        public Builder metrics(@Nullable List<GoogleCloudApigeeV1QueryMetricArgs> metrics) {
            this.metrics = Output.ofNullable(metrics);
            return this;
        }
        public Builder metrics(GoogleCloudApigeeV1QueryMetricArgs... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public Builder outputFormat(@Nullable Output<String> outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public Builder outputFormat(@Nullable String outputFormat) {
            this.outputFormat = Output.ofNullable(outputFormat);
            return this;
        }
        public Builder reportDefinitionId(@Nullable Output<String> reportDefinitionId) {
            this.reportDefinitionId = reportDefinitionId;
            return this;
        }
        public Builder reportDefinitionId(@Nullable String reportDefinitionId) {
            this.reportDefinitionId = Output.ofNullable(reportDefinitionId);
            return this;
        }
        public Builder timeRange(Output<Object> timeRange) {
            this.timeRange = Objects.requireNonNull(timeRange);
            return this;
        }
        public Builder timeRange(Object timeRange) {
            this.timeRange = Output.of(Objects.requireNonNull(timeRange));
            return this;
        }        public QueryArgs build() {
            return new QueryArgs(csvDelimiter, dimensions, envgroupHostname, environmentId, filter, groupByTimeUnit, limit, metrics, name, organizationId, outputFormat, reportDefinitionId, timeRange);
        }
    }
}
