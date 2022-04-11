// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.inputs.FleetMetricAggregationTypeArgs;
import io.pulumi.awsnative.iot.inputs.FleetMetricTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetMetricArgs Empty = new FleetMetricArgs();

    /**
     * The aggregation field to perform aggregation and metric emission
     * 
     */
    @Import(name="aggregationField")
      private final @Nullable Output<String> aggregationField;

    public Output<String> getAggregationField() {
        return this.aggregationField == null ? Codegen.empty() : this.aggregationField;
    }

    @Import(name="aggregationType")
      private final @Nullable Output<FleetMetricAggregationTypeArgs> aggregationType;

    public Output<FleetMetricAggregationTypeArgs> getAggregationType() {
        return this.aggregationType == null ? Codegen.empty() : this.aggregationType;
    }

    /**
     * The description of a fleet metric
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The index name of a fleet metric
     * 
     */
    @Import(name="indexName")
      private final @Nullable Output<String> indexName;

    public Output<String> getIndexName() {
        return this.indexName == null ? Codegen.empty() : this.indexName;
    }

    /**
     * The name of the fleet metric
     * 
     */
    @Import(name="metricName", required=true)
      private final Output<String> metricName;

    public Output<String> getMetricName() {
        return this.metricName;
    }

    /**
     * The period of metric emission in seconds
     * 
     */
    @Import(name="period")
      private final @Nullable Output<Integer> period;

    public Output<Integer> getPeriod() {
        return this.period == null ? Codegen.empty() : this.period;
    }

    /**
     * The Fleet Indexing query used by a fleet metric
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<String> queryString;

    public Output<String> getQueryString() {
        return this.queryString == null ? Codegen.empty() : this.queryString;
    }

    /**
     * The version of a Fleet Indexing query used by a fleet metric
     * 
     */
    @Import(name="queryVersion")
      private final @Nullable Output<String> queryVersion;

    public Output<String> getQueryVersion() {
        return this.queryVersion == null ? Codegen.empty() : this.queryVersion;
    }

    /**
     * An array of key-value pairs to apply to this resource
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<FleetMetricTagArgs>> tags;

    public Output<List<FleetMetricTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The unit of data points emitted by a fleet metric
     * 
     */
    @Import(name="unit")
      private final @Nullable Output<String> unit;

    public Output<String> getUnit() {
        return this.unit == null ? Codegen.empty() : this.unit;
    }

    public FleetMetricArgs(
        @Nullable Output<String> aggregationField,
        @Nullable Output<FleetMetricAggregationTypeArgs> aggregationType,
        @Nullable Output<String> description,
        @Nullable Output<String> indexName,
        Output<String> metricName,
        @Nullable Output<Integer> period,
        @Nullable Output<String> queryString,
        @Nullable Output<String> queryVersion,
        @Nullable Output<List<FleetMetricTagArgs>> tags,
        @Nullable Output<String> unit) {
        this.aggregationField = aggregationField;
        this.aggregationType = aggregationType;
        this.description = description;
        this.indexName = indexName;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.period = period;
        this.queryString = queryString;
        this.queryVersion = queryVersion;
        this.tags = tags;
        this.unit = unit;
    }

    private FleetMetricArgs() {
        this.aggregationField = Codegen.empty();
        this.aggregationType = Codegen.empty();
        this.description = Codegen.empty();
        this.indexName = Codegen.empty();
        this.metricName = Codegen.empty();
        this.period = Codegen.empty();
        this.queryString = Codegen.empty();
        this.queryVersion = Codegen.empty();
        this.tags = Codegen.empty();
        this.unit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> aggregationField;
        private @Nullable Output<FleetMetricAggregationTypeArgs> aggregationType;
        private @Nullable Output<String> description;
        private @Nullable Output<String> indexName;
        private Output<String> metricName;
        private @Nullable Output<Integer> period;
        private @Nullable Output<String> queryString;
        private @Nullable Output<String> queryVersion;
        private @Nullable Output<List<FleetMetricTagArgs>> tags;
        private @Nullable Output<String> unit;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationField = defaults.aggregationField;
    	      this.aggregationType = defaults.aggregationType;
    	      this.description = defaults.description;
    	      this.indexName = defaults.indexName;
    	      this.metricName = defaults.metricName;
    	      this.period = defaults.period;
    	      this.queryString = defaults.queryString;
    	      this.queryVersion = defaults.queryVersion;
    	      this.tags = defaults.tags;
    	      this.unit = defaults.unit;
        }

        public Builder aggregationField(@Nullable Output<String> aggregationField) {
            this.aggregationField = aggregationField;
            return this;
        }
        public Builder aggregationField(@Nullable String aggregationField) {
            this.aggregationField = Codegen.ofNullable(aggregationField);
            return this;
        }
        public Builder aggregationType(@Nullable Output<FleetMetricAggregationTypeArgs> aggregationType) {
            this.aggregationType = aggregationType;
            return this;
        }
        public Builder aggregationType(@Nullable FleetMetricAggregationTypeArgs aggregationType) {
            this.aggregationType = Codegen.ofNullable(aggregationType);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder indexName(@Nullable Output<String> indexName) {
            this.indexName = indexName;
            return this;
        }
        public Builder indexName(@Nullable String indexName) {
            this.indexName = Codegen.ofNullable(indexName);
            return this;
        }
        public Builder metricName(Output<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Output.of(Objects.requireNonNull(metricName));
            return this;
        }
        public Builder period(@Nullable Output<Integer> period) {
            this.period = period;
            return this;
        }
        public Builder period(@Nullable Integer period) {
            this.period = Codegen.ofNullable(period);
            return this;
        }
        public Builder queryString(@Nullable Output<String> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable String queryString) {
            this.queryString = Codegen.ofNullable(queryString);
            return this;
        }
        public Builder queryVersion(@Nullable Output<String> queryVersion) {
            this.queryVersion = queryVersion;
            return this;
        }
        public Builder queryVersion(@Nullable String queryVersion) {
            this.queryVersion = Codegen.ofNullable(queryVersion);
            return this;
        }
        public Builder tags(@Nullable Output<List<FleetMetricTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<FleetMetricTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(FleetMetricTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder unit(@Nullable Output<String> unit) {
            this.unit = unit;
            return this;
        }
        public Builder unit(@Nullable String unit) {
            this.unit = Codegen.ofNullable(unit);
            return this;
        }        public FleetMetricArgs build() {
            return new FleetMetricArgs(aggregationField, aggregationType, description, indexName, metricName, period, queryString, queryVersion, tags, unit);
        }
    }
}
