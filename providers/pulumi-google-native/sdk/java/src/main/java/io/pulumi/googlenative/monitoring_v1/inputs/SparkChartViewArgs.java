// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.monitoring_v1.enums.SparkChartViewSparkChartType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A sparkChart is a small chart suitable for inclusion in a table-cell or inline in text. This message contains the configuration for a sparkChart to show up on a Scorecard, showing recent trends of the scorecard's timeseries.
 * 
 */
public final class SparkChartViewArgs extends io.pulumi.resources.ResourceArgs {

    public static final SparkChartViewArgs Empty = new SparkChartViewArgs();

    /**
     * The lower bound on data point frequency in the chart implemented by specifying the minimum alignment period to use in a time series query. For example, if the data is published once every 10 minutes it would not make sense to fetch and align data at one minute intervals. This field is optional and exists only as a hint.
     * 
     */
    @Import(name="minAlignmentPeriod")
      private final @Nullable Output<String> minAlignmentPeriod;

    public Output<String> getMinAlignmentPeriod() {
        return this.minAlignmentPeriod == null ? Output.empty() : this.minAlignmentPeriod;
    }

    /**
     * The type of sparkchart to show in this chartView.
     * 
     */
    @Import(name="sparkChartType", required=true)
      private final Output<SparkChartViewSparkChartType> sparkChartType;

    public Output<SparkChartViewSparkChartType> getSparkChartType() {
        return this.sparkChartType;
    }

    public SparkChartViewArgs(
        @Nullable Output<String> minAlignmentPeriod,
        Output<SparkChartViewSparkChartType> sparkChartType) {
        this.minAlignmentPeriod = minAlignmentPeriod;
        this.sparkChartType = Objects.requireNonNull(sparkChartType, "expected parameter 'sparkChartType' to be non-null");
    }

    private SparkChartViewArgs() {
        this.minAlignmentPeriod = Output.empty();
        this.sparkChartType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkChartViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> minAlignmentPeriod;
        private Output<SparkChartViewSparkChartType> sparkChartType;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkChartViewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minAlignmentPeriod = defaults.minAlignmentPeriod;
    	      this.sparkChartType = defaults.sparkChartType;
        }

        public Builder minAlignmentPeriod(@Nullable Output<String> minAlignmentPeriod) {
            this.minAlignmentPeriod = minAlignmentPeriod;
            return this;
        }
        public Builder minAlignmentPeriod(@Nullable String minAlignmentPeriod) {
            this.minAlignmentPeriod = Output.ofNullable(minAlignmentPeriod);
            return this;
        }
        public Builder sparkChartType(Output<SparkChartViewSparkChartType> sparkChartType) {
            this.sparkChartType = Objects.requireNonNull(sparkChartType);
            return this;
        }
        public Builder sparkChartType(SparkChartViewSparkChartType sparkChartType) {
            this.sparkChartType = Output.of(Objects.requireNonNull(sparkChartType));
            return this;
        }        public SparkChartViewArgs build() {
            return new SparkChartViewArgs(minAlignmentPeriod, sparkChartType);
        }
    }
}
