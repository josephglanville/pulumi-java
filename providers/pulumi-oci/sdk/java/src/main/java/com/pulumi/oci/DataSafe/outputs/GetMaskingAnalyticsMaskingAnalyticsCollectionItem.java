// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataSafe.outputs.GetMaskingAnalyticsMaskingAnalyticsCollectionItemDimension;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMaskingAnalyticsMaskingAnalyticsCollectionItem {
    /**
     * @return The total count for the aggregation metric.
     * 
     */
    private final String count;
    /**
     * @return The scope of analytics data.
     * 
     */
    private final List<GetMaskingAnalyticsMaskingAnalyticsCollectionItemDimension> dimensions;
    /**
     * @return The name of the aggregation metric.
     * 
     */
    private final String metricName;

    @CustomType.Constructor
    private GetMaskingAnalyticsMaskingAnalyticsCollectionItem(
        @CustomType.Parameter("count") String count,
        @CustomType.Parameter("dimensions") List<GetMaskingAnalyticsMaskingAnalyticsCollectionItemDimension> dimensions,
        @CustomType.Parameter("metricName") String metricName) {
        this.count = count;
        this.dimensions = dimensions;
        this.metricName = metricName;
    }

    /**
     * @return The total count for the aggregation metric.
     * 
     */
    public String count() {
        return this.count;
    }
    /**
     * @return The scope of analytics data.
     * 
     */
    public List<GetMaskingAnalyticsMaskingAnalyticsCollectionItemDimension> dimensions() {
        return this.dimensions;
    }
    /**
     * @return The name of the aggregation metric.
     * 
     */
    public String metricName() {
        return this.metricName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaskingAnalyticsMaskingAnalyticsCollectionItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String count;
        private List<GetMaskingAnalyticsMaskingAnalyticsCollectionItemDimension> dimensions;
        private String metricName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMaskingAnalyticsMaskingAnalyticsCollectionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
        }

        public Builder count(String count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder dimensions(List<GetMaskingAnalyticsMaskingAnalyticsCollectionItemDimension> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public Builder dimensions(GetMaskingAnalyticsMaskingAnalyticsCollectionItemDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }        public GetMaskingAnalyticsMaskingAnalyticsCollectionItem build() {
            return new GetMaskingAnalyticsMaskingAnalyticsCollectionItem(count, dimensions, metricName);
        }
    }
}
