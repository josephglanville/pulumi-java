// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.MetricCriteriaResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the metric alert criteria for a single resource that has multiple metric criteria.
 * 
 */
public final class MetricAlertSingleResourceMultipleMetricCriteriaResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetricAlertSingleResourceMultipleMetricCriteriaResponse Empty = new MetricAlertSingleResourceMultipleMetricCriteriaResponse();

    /**
     * The list of metric criteria for this 'all of' operation.
     * 
     */
    @InputImport(name="allOf")
      private final @Nullable List<MetricCriteriaResponse> allOf;

    public List<MetricCriteriaResponse> getAllOf() {
        return this.allOf == null ? List.of() : this.allOf;
    }

    /**
     * specifies the type of the alert criteria.
     * Expected value is 'Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public MetricAlertSingleResourceMultipleMetricCriteriaResponse(
        @Nullable List<MetricCriteriaResponse> allOf,
        String odataType) {
        this.allOf = allOf;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private MetricAlertSingleResourceMultipleMetricCriteriaResponse() {
        this.allOf = List.of();
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlertSingleResourceMultipleMetricCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<MetricCriteriaResponse> allOf;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlertSingleResourceMultipleMetricCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allOf = defaults.allOf;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAllOf(@Nullable List<MetricCriteriaResponse> allOf) {
            this.allOf = allOf;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public MetricAlertSingleResourceMultipleMetricCriteriaResponse build() {
            return new MetricAlertSingleResourceMultipleMetricCriteriaResponse(allOf, odataType);
        }
    }
}
